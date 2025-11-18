package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker.java */
/* renamed from: com.google.firebase.crashlytics.h.n.z */
/* loaded from: classes2.dex */
class C8234z {

    /* renamed from: a */
    private final String f31061a;

    /* renamed from: b */
    private final C8298f f31062b;

    public C8234z(String str, C8298f c8298f) {
        this.f31061a = str;
        this.f31062b = c8298f;
    }

    /* renamed from: b */
    private File m25453b() {
        return this.f31062b.m25998e(this.f31061a);
    }

    /* renamed from: a */
    public boolean m25454a() {
        try {
            return m25453b().createNewFile();
        } catch (IOException e2) {
            C8179h.m25176f().m25180e("Error creating marker: " + this.f31061a, e2);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m25455c() {
        return m25453b().exists();
    }

    /* renamed from: d */
    public boolean m25456d() {
        return m25453b().delete();
    }
}
