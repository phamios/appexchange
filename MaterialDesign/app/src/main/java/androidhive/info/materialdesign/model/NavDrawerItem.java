package androidhive.info.materialdesign.model;


public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private int icon;


    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title,int icon) {
        this.showNotify = showNotify;
        this.title = title;
        this.getIcon();
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
