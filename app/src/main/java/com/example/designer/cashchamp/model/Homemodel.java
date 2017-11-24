package com.example.designer.cashchamp.model;

/**
 * Created by designer on 11/8/2017.
 */

public class Homemodel {
    public String getTvcategory() {
        return tvcategory;
    }

    public void setTvcategory(String tvcategory) {
        this.tvcategory = tvcategory;
    }

    public String getTvtodayvalue() {
        return tvtodayvalue;
    }

    public void setTvtodayvalue(String tvtodayvalue) {
        this.tvtodayvalue = tvtodayvalue;
    }

    public String getTvTotalvalue() {
        return tvTotalvalue;
    }

    public void setTvTotalvalue(String tvTotalvalue) {
        this.tvTotalvalue = tvTotalvalue;
    }

    String tvcategory;
    String tvtodayvalue;
    String tvTotalvalue;

    public Homemodel(String tvcategory, String tvtodayvalue, String tvTotalvalue) {
        this.tvcategory = tvcategory;
        this.tvtodayvalue = tvtodayvalue;
        this.tvTotalvalue = tvTotalvalue;
    }
}
