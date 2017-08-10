package fmy.latian.prerefanue01;

import android.app.Application;

import fmy.latian.prerefanue01.dpinj.components.AppComponent;
import fmy.latian.prerefanue01.dpinj.components.DaggerAppComponent;
import fmy.latian.prerefanue01.dpinj.modules.AppModule;

/**
 * Created by Femmy on 8/10/2017.
 */

public class App extends Application {

    protected AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        getComponent().inject(this);
    }

    public AppComponent getComponent(){
        if(appComponent == null){
            appComponent = DaggerAppComponent
                    .builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }
}
