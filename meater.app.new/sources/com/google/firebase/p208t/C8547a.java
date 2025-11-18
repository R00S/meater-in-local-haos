package com.google.firebase.p208t;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0255a;
import com.google.firebase.p203q.InterfaceC8481c;

/* compiled from: DataCollectionConfigStorage.java */
/* renamed from: com.google.firebase.t.a */
/* loaded from: classes2.dex */
public class C8547a {

    /* renamed from: a */
    private final Context f32398a;

    /* renamed from: b */
    private final SharedPreferences f32399b;

    /* renamed from: c */
    private final InterfaceC8481c f32400c;

    /* renamed from: d */
    private boolean f32401d;

    public C8547a(Context context, String str, InterfaceC8481c interfaceC8481c) {
        Context contextM26889a = m26889a(context);
        this.f32398a = contextM26889a;
        this.f32399b = contextM26889a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f32400c = interfaceC8481c;
        this.f32401d = m26890c();
    }

    /* renamed from: a */
    private static Context m26889a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C0255a.m1673b(context);
    }

    /* renamed from: c */
    private boolean m26890c() {
        return this.f32399b.contains("firebase_data_collection_default_enabled") ? this.f32399b.getBoolean("firebase_data_collection_default_enabled", true) : m26891d();
    }

    /* renamed from: d */
    private boolean m26891d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f32398a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f32398a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m26892b() {
        return this.f32401d;
    }
}
