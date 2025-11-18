package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* renamed from: com.google.firebase.crashlytics.h.g */
/* loaded from: classes2.dex */
public class C8178g {

    /* renamed from: a */
    private final Context f30855a;

    /* renamed from: b */
    private b f30856b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    /* renamed from: com.google.firebase.crashlytics.h.g$b */
    private class b {

        /* renamed from: a */
        private final String f30857a;

        /* renamed from: b */
        private final String f30858b;

        private b() throws Resources.NotFoundException {
            int iM25345p = C8228t.m25345p(C8178g.this.f30855a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iM25345p == 0) {
                if (!C8178g.this.m25169c("flutter_assets/NOTICES.Z")) {
                    this.f30857a = null;
                    this.f30858b = null;
                    return;
                } else {
                    this.f30857a = "Flutter";
                    this.f30858b = null;
                    C8179h.m25176f().m25183i("Development platform is: Flutter");
                    return;
                }
            }
            this.f30857a = "Unity";
            String string = C8178g.this.f30855a.getResources().getString(iM25345p);
            this.f30858b = string;
            C8179h.m25176f().m25183i("Unity Editor version is: " + string);
        }
    }

    public C8178g(Context context) {
        this.f30855a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m25169c(String str) throws IOException {
        if (this.f30855a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f30855a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private b m25170f() {
        if (this.f30856b == null) {
            this.f30856b = new b();
        }
        return this.f30856b;
    }

    /* renamed from: d */
    public String m25171d() {
        return m25170f().f30857a;
    }

    /* renamed from: e */
    public String m25172e() {
        return m25170f().f30858b;
    }
}
