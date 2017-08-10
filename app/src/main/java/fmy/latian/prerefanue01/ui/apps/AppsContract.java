package fmy.latian.prerefanue01.ui.apps;

import java.util.List;

import fmy.latian.prerefanue01.data.models.Apps;

/**
 * Created by Femmy on 8/11/2017.
 */

public class AppsContract {

    interface view{
        void onListLoaded(List<Apps> e);

        void onListEmpty();
    }

    interface presenter{
        void loadAppsList();
    }
}
