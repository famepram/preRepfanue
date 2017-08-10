package fmy.latian.prerefanue01.dpinj.components;

import javax.inject.Singleton;

import dagger.Component;
import fmy.latian.prerefanue01.App;
import fmy.latian.prerefanue01.dpinj.modules.AppModule;

/**
 * Created by Femmy on 8/10/2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
