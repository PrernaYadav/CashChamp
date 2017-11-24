package com.example.designer.cashchamp.model;

/**
 * Created by designer on 11/8/2017.
 */

public class AchiversModel {
    public String getTvheading() {
        return tvheading;
    }

    public void setTvheading(String tvheading) {
        this.tvheading = tvheading;
    }

    public String getTvearning() {
        return tvearning;
    }

    public void setTvearning(String tvearning) {
        this.tvearning = tvearning;
    }

    public String getTvvalues() {
        return tvvalues;
    }

    public void setTvvalues(String tvvalues) {
        this.tvvalues = tvvalues;
    }

    String tvheading;
    String tvearning;
    String tvvalues;

    public AchiversModel(String tvheading, String tvearning, String tvvalues) {
        this.tvheading = tvheading;
        this.tvearning = tvearning;
        this.tvvalues = tvvalues;
    }
}
