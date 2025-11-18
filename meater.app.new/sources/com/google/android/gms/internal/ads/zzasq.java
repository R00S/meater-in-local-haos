package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzasq extends ContextWrapper {

    /* renamed from: a */
    private Context f22501a;

    /* renamed from: b */
    private WeakReference<Activity> f22502b;

    private zzasq(Context context) {
        super(context);
        this.f22502b = new WeakReference<>(null);
    }

    /* renamed from: b */
    private final synchronized Intent m16922b(Intent intent) {
        if (this.f22501a != null && intent.getComponent() != null && intent.getComponent().getPackageName().equals(this.f22501a.getPackageName())) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
            return intent2;
        }
        return intent;
    }

    /* renamed from: c */
    private final synchronized void m16923c(Intent intent) {
        Activity activity = this.f22502b.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & (-268435457));
            activity.startActivity(intent2);
        } catch (Throwable th) {
            zzk.zzlk().m17052e(th, HttpUrl.FRAGMENT_ENCODE_SET);
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    /* renamed from: d */
    private static Context m16924d(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: e */
    public static zzasq m16925e(Context context) {
        return new zzasq(m16924d(context));
    }

    /* renamed from: f */
    public static Context m16926f(Context context) {
        return context instanceof zzasq ? ((zzasq) context).getBaseContext() : m16924d(context);
    }

    /* renamed from: a */
    public final synchronized void m16927a(String str) throws PackageManager.NameNotFoundException {
        this.f22501a = super.createPackageContext(str, 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        Context context = this.f22501a;
        if (context != null) {
            return context.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        Context context = this.f22501a;
        if (context != null) {
            return context.getPackageName();
        }
        return super.getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        Context context = this.f22501a;
        if (context != null) {
            return context.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        m16923c(m16922b(intent));
    }
}
