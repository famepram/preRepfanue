package fmy.latian.prerefanue01.data.db;

import java.util.List;

import fmy.latian.prerefanue01.data.models.Apps;

/**
 * Created by Femmy on 8/10/2017.
 */

public class DBInterface {

    public interface AppsListCB {
        void onListAppLoaded(List<Apps> e);

        void onListAppEmpty();
    }
}
