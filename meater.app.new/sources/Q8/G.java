package Q8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import z7.AbstractC5208j;
import z7.C5209k;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes2.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f14383a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f14384b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f14385c;

    /* renamed from: d, reason: collision with root package name */
    C5209k<Void> f14386d;

    /* renamed from: e, reason: collision with root package name */
    boolean f14387e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14388f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f14389g;

    /* renamed from: h, reason: collision with root package name */
    private final C5209k<Void> f14390h;

    public G(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f14385c = obj;
        this.f14386d = new C5209k<>();
        this.f14387e = false;
        this.f14388f = false;
        this.f14390h = new C5209k<>();
        Context contextK = fVar.k();
        this.f14384b = fVar;
        this.f14383a = C1622j.q(contextK);
        Boolean boolB = b();
        this.f14389g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f14386d.e(null);
                    this.f14387e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f14388f = false;
            return null;
        }
        this.f14388f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    private Boolean b() {
        if (!this.f14383a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f14388f = false;
        return Boolean.valueOf(this.f14383a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f14384b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        N8.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f14389g == null ? "global Firebase setting" : this.f14388f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            N8.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f14390h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f14389g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f14388f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14389g = bool != null ? bool : a(this.f14384b.k());
        i(this.f14383a, bool);
        synchronized (this.f14385c) {
            try {
                if (d()) {
                    if (!this.f14387e) {
                        this.f14386d.e(null);
                        this.f14387e = true;
                    }
                } else if (this.f14387e) {
                    this.f14386d = new C5209k<>();
                    this.f14387e = false;
                }
            } finally {
            }
        }
    }

    public AbstractC5208j<Void> j() {
        AbstractC5208j<Void> abstractC5208jA;
        synchronized (this.f14385c) {
            abstractC5208jA = this.f14386d.a();
        }
        return abstractC5208jA;
    }

    public AbstractC5208j<Void> k() {
        return R8.b.c(this.f14390h.a(), j());
    }
}
