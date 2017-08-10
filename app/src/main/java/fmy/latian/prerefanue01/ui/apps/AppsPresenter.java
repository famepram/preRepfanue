package fmy.latian.prerefanue01.ui.apps;

import java.util.List;

import javax.inject.Inject;

import fmy.latian.prerefanue01.data.db.DBFuncs;
import fmy.latian.prerefanue01.data.db.DBInterface;
import fmy.latian.prerefanue01.data.models.Apps;

/**
 * Created by Femmy on 8/11/2017.
 */

public class AppsPresenter implements AppsContract.presenter{

    @Inject
    DBFuncs mDBFunc;

    private AppsContract.view view;

    @Override
    public void loadAppsList() {
        mDBFunc.getAppsList(new DBInterface.AppsListCB() {
            @Override
            public void onListAppLoaded(List<Apps> e) {

            }

            @Override
            public void onListAppEmpty() {

            }
        });
    }
}
