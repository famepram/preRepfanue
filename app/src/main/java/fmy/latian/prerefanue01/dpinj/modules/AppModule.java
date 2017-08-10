package fmy.latian.prerefanue01.dpinj.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Femmy on 8/10/2017.
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application app) {
        application = app;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }


}
