package p9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import g1.C3377a;
import g9.c;

/* compiled from: DataCollectionConfigStorage.java */
/* renamed from: p9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4247a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f47671a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f47672b;

    /* renamed from: c, reason: collision with root package name */
    private final c f47673c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47674d;

    public C4247a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f47671a = contextA;
        this.f47672b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f47673c = cVar;
        this.f47674d = c();
    }

    private static Context a(Context context) {
        return C3377a.b(context);
    }

    private boolean c() {
        return this.f47672b.contains("firebase_data_collection_default_enabled") ? this.f47672b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f47671a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f47671a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f47674d;
    }
}
