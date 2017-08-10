package fmy.latian.prerefanue01.ui.splash;

import dagger.Component;

/**
 * Created by Femmy on 8/11/2017.
 */
@Component(modules = SplashModule.class)
public interface SplashComponent {
    void inject(SplashActivity splashActivity);
}
