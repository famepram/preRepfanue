package fmy.latian.prerefanue01.ui.splash;

import android.os.CountDownTimer;
import android.util.Log;

import javax.inject.Inject;

import fmy.latian.prerefanue01.util.Constant;

/**
 * Created by Femmy on 8/11/2017.
 */

public class SplashPresenter implements SplashContract.Presenter{

    private SplashContract.View view;

    @Inject
    public SplashPresenter(SplashContract.View v){
        view = v;
    }

    @Override
    public void startCountDown() {
        new CountDownTimer(5000, 1000) {

            public void onTick(long m) {
                view.onCountdownRunning(String.valueOf(m));
            }

            public void onFinish() {
                view.onCountdownFinished();
            }

        }.start();
    }
}
