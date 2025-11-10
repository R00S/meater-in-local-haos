package com.apptionlabs.meater_app.meatCutStructure;

import com.apptionlabs.meater_app.app.a;
import f8.m;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeatModel {
    public Integer id;
    public int image;
    public String imageName;
    public String name;
    private String translatedName = null;

    public String getName() {
        String str;
        if (this.translatedName == null) {
            String d10 = m.a().d(a.i(), this.name);
            if (d10 != null) {
                str = d10.trim();
            } else {
                str = "";
            }
            this.translatedName = str;
        }
        return this.translatedName;
    }
}
