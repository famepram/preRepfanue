package fmy.latian.prerefanue01.data.models;

/**
 * Created by Femmy on 8/11/2017.
 */

public class Apps {

    private int apps_id;

    private String fbapps_id;

    private String apps_name;

    private boolean active;

    public int getApps_id() {
        return apps_id;
    }

    public void setApps_id(int apps_id) {
        this.apps_id = apps_id;
    }

    public String getFbapps_id() {
        return fbapps_id;
    }

    public void setFbapps_id(String fbapps_id) {
        this.fbapps_id = fbapps_id;
    }

    public String getApps_name() {
        return apps_name;
    }

    public void setApps_name(String apps_name) {
        this.apps_name = apps_name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
