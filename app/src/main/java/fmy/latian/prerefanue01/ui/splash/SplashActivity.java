package fmy.latian.prerefanue01.ui.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import fmy.latian.prerefanue01.R;
import fmy.latian.prerefanue01.ui.apps.AppsActivity;

public class SplashActivity extends AppCompatActivity implements SplashContract.View{

    @Inject
    SplashPresenter presenter;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        DaggerSplashComponent.builder()
                .splashModule(new SplashModule(this)).build()
                .inject(this);
        presenter.startCountDown();
    }

    private void initView(){
        mText = (TextView) findViewById(R.id.text_splash);
    }

    @Override
    public void onCountdownFinished() {
        Intent i = new Intent(this, AppsActivity.class);
        startActivity(i);
    }

    @Override
    public void onCountdownRunning(String time) {
        mText.setText(time);
    }
}
