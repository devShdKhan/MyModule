package com.mymodule.drawersetup;

/**
 * Created by Ravi on 29/07/15.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;

    private boolean isSelected;

    int icon;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }




    public Integer getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
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
}