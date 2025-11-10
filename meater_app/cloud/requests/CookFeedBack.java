package com.apptionlabs.meater_app.cloud.requests;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookFeedBack {
    public transient String cookId;
    public Integer cookMethod;
    public String cookMethodOther;
    public String message;
    public String ovenGrillBrand;
    public int rating;

    public CookFeedBack(String str, int i10) {
        this.cookId = str;
        this.rating = i10;
    }
}
