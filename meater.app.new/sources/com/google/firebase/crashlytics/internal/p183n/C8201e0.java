package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.C8405j;
import com.google.firebase.crashlytics.internal.C8179h;
import java.util.concurrent.Executor;

/* compiled from: DataCollectionArbiter.java */
/* renamed from: com.google.firebase.crashlytics.h.n.e0 */
/* loaded from: classes2.dex */
public class C8201e0 {

    /* renamed from: a */
    private final SharedPreferences f30891a;

    /* renamed from: b */
    private final C8405j f30892b;

    /* renamed from: c */
    private final Object f30893c;

    /* renamed from: d */
    TaskCompletionSource<Void> f30894d;

    /* renamed from: e */
    boolean f30895e;

    /* renamed from: f */
    private boolean f30896f;

    /* renamed from: g */
    private Boolean f30897g;

    /* renamed from: h */
    private final TaskCompletionSource<Void> f30898h;

    public C8201e0(C8405j c8405j) {
        Object obj = new Object();
        this.f30893c = obj;
        this.f30894d = new TaskCompletionSource<>();
        this.f30895e = false;
        this.f30896f = false;
        this.f30898h = new TaskCompletionSource<>();
        Context contextM26404i = c8405j.m26404i();
        this.f30892b = c8405j;
        this.f30891a = C8228t.m25346q(contextM26404i);
        Boolean boolM25234b = m25234b();
        this.f30897g = boolM25234b == null ? m25233a(contextM26404i) : boolM25234b;
        synchronized (obj) {
            if (m25239d()) {
                this.f30894d.m23658e(null);
                this.f30895e = true;
            }
        }
    }

    /* renamed from: a */
    private Boolean m25233a(Context context) {
        Boolean boolM25237g = m25237g(context);
        if (boolM25237g == null) {
            this.f30896f = false;
            return null;
        }
        this.f30896f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolM25237g));
    }

    /* renamed from: b */
    private Boolean m25234b() {
        if (!this.f30891a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f30896f = false;
        return Boolean.valueOf(this.f30891a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private boolean m25235e() {
        try {
            return this.f30892b.m26408r();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private void m25236f(boolean z) {
        C8179h.m25176f().m25177b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.f30897g == null ? "global Firebase setting" : this.f30896f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    /* renamed from: g */
    private static Boolean m25237g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            C8179h.m25176f().m25180e("Could not read data collection permission from manifest", e2);
            return null;
        }
    }

    /* renamed from: c */
    public void m25238c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f30898h.m23658e(null);
    }

    /* renamed from: d */
    public synchronized boolean m25239d() {
        boolean zBooleanValue;
        Boolean bool = this.f30897g;
        zBooleanValue = bool != null ? bool.booleanValue() : m25235e();
        m25236f(zBooleanValue);
        return zBooleanValue;
    }

    /* renamed from: h */
    public Task<Void> m25240h() {
        Task<Void> taskM23654a;
        synchronized (this.f30893c) {
            taskM23654a = this.f30894d.m23654a();
        }
        return taskM23654a;
    }

    /* renamed from: i */
    public Task<Void> m25241i(Executor executor) {
        return C8225q0.m25321j(executor, this.f30898h.m23654a(), m25240h());
    }
}
