package fmy.latian.prerefanue01.ui.splash;

/**
 * Created by Femmy on 8/11/2017.
 */

public class SplashContract {

    interface View {
        void onCountdownFinished();

        void onCountdownRunning(String time);
    }

    interface  Presenter{
        void startCountDown();
    }
}
