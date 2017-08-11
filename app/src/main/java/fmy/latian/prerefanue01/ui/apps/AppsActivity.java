package fmy.latian.prerefanue01.ui.apps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import fmy.latian.prerefanue01.R;
import fmy.latian.prerefanue01.data.models.Apps;

public class AppsActivity extends AppCompatActivity implements AppsContract.view{

    private ListView lvListApp;
    private Button btnAddApps;

    private AppsListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        initUI();
    }

    private void initUI(){
        lvListApp = (ListView) findViewById(R.id.listview_apps);
        btnAddApps = (Button) findViewById(R.id.btn_add_apps);
    }

    @Override
    public void onListLoaded(List<Apps> e) {

    }

    @Override
    public void onListEmpty() {

    }
}
