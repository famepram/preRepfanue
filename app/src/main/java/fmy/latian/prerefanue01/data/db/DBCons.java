package fmy.latian.prerefanue01.data.db;

/**
 * Created by Femmy on 8/10/2017.
 */

public class DBCons {

    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "repfanue.db";

    public static final String DATATYPE_INTEGER = "INTEGER";

    public static final String DATATYPE_TEXT = "TEXT";

    public static final String DATATYPE_BOOLEAN = "INTEGER";

    public static final String TABLE_APPS = "menu";

    public static final String TABLE_COLUMN_APPS_ID = "apps_id";

    public static final String TABLE_COLUMN_FB_APPS_ID = "fb_apps_id";

    public static final String TABLE_COLUMN_APPS_NAME = "apps_name";

    public static final String TABLE_COLUMN_ACTIVE = "active";

    public static String COMMAND_CREATE_TABLE_APPS =
            "CREATE TABLE " + TABLE_APPS + "( "+
                    TABLE_COLUMN_APPS_ID + DATATYPE_INTEGER + " PRIMARY KEY AUTOINCREMENT," +
                    TABLE_COLUMN_FB_APPS_ID  + DATATYPE_TEXT  + ", " +
                    TABLE_COLUMN_APPS_NAME + DATATYPE_TEXT + ", " +
                    TABLE_COLUMN_ACTIVE + DATATYPE_BOOLEAN +
                    " )";
}
