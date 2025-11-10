package com.apptionlabs.meater_app.data;

/* loaded from: /tmp/meat/meat/classes.dex */
public class InfoPair {
    public String detail;
    public String heading;
    public boolean needToShowInfoImage;
    public Object tag;

    public InfoPair(String str) {
        this.heading = str;
        this.detail = "";
    }

    public InfoPair(String str, String str2) {
        this.heading = str;
        this.detail = str2;
    }

    public InfoPair(String str, String str2, Object obj) {
        this.heading = str;
        this.detail = str2;
        this.tag = obj;
    }

    public InfoPair(String str, String str2, boolean z10, Object obj) {
        this.heading = str;
        this.detail = str2;
        this.needToShowInfoImage = z10;
        this.tag = obj;
    }
}
