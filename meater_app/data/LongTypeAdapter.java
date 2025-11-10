package com.apptionlabs.meater_app.data;

import com.google.gson.TypeAdapter;
import kg.b;
import kg.c;

/* loaded from: /tmp/meat/meat/classes.dex */
public class LongTypeAdapter extends TypeAdapter<Long> {
    /* renamed from: read, reason: merged with bridge method [inline-methods] */
    public Long m1read(kg.a aVar) {
        if (aVar.N() == b.y) {
            aVar.z();
            return null;
        }
        try {
            return Long.valueOf(aVar.H());
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public void write(c cVar, Long l10) {
        if (l10 == null) {
            cVar.p();
        } else {
            cVar.R(l10);
        }
    }
}
