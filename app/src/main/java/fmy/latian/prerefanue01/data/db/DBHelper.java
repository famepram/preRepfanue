package fmy.latian.prerefanue01.data.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Femmy on 8/10/2017.
 */
@Singleton
public class DBHelper extends SQLiteOpenHelper {

    @Inject
    public DBHelper(Context context) {
        super(context, DBCons.DATABASE_NAME, null, DBCons.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(DBCons.COMMAND_CREATE_TABLE_APPS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DBCons.TABLE_APPS);
        onCreate(db);
    }
}
