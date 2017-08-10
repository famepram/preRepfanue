package fmy.latian.prerefanue01.data.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import fmy.latian.prerefanue01.data.models.Apps;

/**
 * Created by Femmy on 8/10/2017.
 */

public class DBFuncs {

    DBHelper dbHelper;

    @Inject
    public DBFuncs(DBHelper mdbHelper){
        dbHelper = mdbHelper;
    }

    public void getAppsList(DBInterface.AppsListCB callback){
        List<Apps> E = new ArrayList<Apps>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] projection = {
                DBCons.TABLE_COLUMN_APPS_ID,
                DBCons.TABLE_COLUMN_FB_APPS_ID,
                DBCons.TABLE_COLUMN_APPS_NAME,
                DBCons.TABLE_COLUMN_ACTIVE
        };

        Cursor c = db.query(DBCons.TABLE_APPS, projection, null, null, null, null, null);
        if(c != null && c.getCount() > 0){
            while(c.moveToNext()){
                int apps_id             = c.getInt(c.getColumnIndexOrThrow(DBCons.TABLE_COLUMN_APPS_ID));
                String fb_apps_id       = c.getString(c.getColumnIndexOrThrow(DBCons.TABLE_COLUMN_FB_APPS_ID));
                String apps_name        = c.getString(c.getColumnIndexOrThrow(DBCons.TABLE_COLUMN_APPS_NAME));
                int active              = c.getInt(c.getColumnIndexOrThrow(DBCons.TABLE_COLUMN_ACTIVE));
                Apps mApps              = new Apps();
                mApps.setApps_id(apps_id);
                mApps.setFbapps_id(fb_apps_id);
                mApps.setApps_name(apps_name);
                mApps.setActive(active == 0 ? false : true);
                E.add(mApps);
            }
        }

        if (c != null) {
            c.close();
        }

        db.close();

        if(E.isEmpty()){
            callback.onListAppEmpty();
        } else {
            callback.onListAppLoaded(E);
        }
    }
}
