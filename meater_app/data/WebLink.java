package com.apptionlabs.meater_app.data;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class WebLink {
    public String title;
    public String url;

    public WebLink(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    public static List<WebLink> makeList(String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (String str : strArr) {
            arrayList.add(new WebLink(str, strArr2[i10]));
            i10++;
        }
        return arrayList;
    }
}
