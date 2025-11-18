package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

@zzard
/* loaded from: classes2.dex */
public final class zzuq {

    /* renamed from: a */
    private final Object f27166a = new Object();

    /* renamed from: b */
    private m40 f27167b = null;

    /* renamed from: c */
    private boolean f27168c = false;

    /* renamed from: a */
    public final Activity m20627a() {
        synchronized (this.f27166a) {
            if (!PlatformVersion.m14637a()) {
                return null;
            }
            m40 m40Var = this.f27167b;
            if (m40Var == null) {
                return null;
            }
            return m40Var.m15536a();
        }
    }

    /* renamed from: b */
    public final Context m20628b() {
        synchronized (this.f27166a) {
            if (!PlatformVersion.m14637a()) {
                return null;
            }
            m40 m40Var = this.f27167b;
            if (m40Var == null) {
                return null;
            }
            return m40Var.m15537b();
        }
    }

    /* renamed from: c */
    public final void m20629c(Context context) {
        synchronized (this.f27166a) {
            if (!this.f27168c) {
                if (!PlatformVersion.m14637a()) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzbad.m17353i("Can not cast Context to Application");
                    return;
                }
                if (this.f27167b == null) {
                    this.f27167b = new m40();
                }
                this.f27167b.m15538e(application, context);
                this.f27168c = true;
            }
        }
    }

    /* renamed from: d */
    public final void m20630d(zzut zzutVar) {
        synchronized (this.f27166a) {
            if (PlatformVersion.m14637a()) {
                if (this.f27167b == null) {
                    this.f27167b = new m40();
                }
                this.f27167b.m15539f(zzutVar);
            }
        }
    }
}
