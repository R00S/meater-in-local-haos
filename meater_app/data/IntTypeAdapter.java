package com.apptionlabs.meater_app.data;

import com.google.gson.TypeAdapter;
import kg.b;
import kg.c;

/* loaded from: /tmp/meat/meat/classes.dex */
public class IntTypeAdapter extends TypeAdapter<Integer> {
    /* renamed from: read, reason: merged with bridge method [inline-methods] */
    public Integer m0read(kg.a aVar) {
        if (aVar.N() == b.y) {
            aVar.z();
            return null;
        }
        try {
            return Integer.valueOf(aVar.H());
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public void write(c cVar, Integer num) {
        if (num == null) {
            cVar.p();
        } else {
            cVar.R(num);
        }
    }
}
