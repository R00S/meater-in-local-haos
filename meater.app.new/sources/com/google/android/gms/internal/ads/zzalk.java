package com.google.android.gms.internal.ads;

import android.content.Context;

@zzard
/* loaded from: classes2.dex */
public final class zzalk {

    /* renamed from: a */
    private final Object f22102a = new Object();

    /* renamed from: b */
    private final Object f22103b = new Object();

    /* renamed from: c */
    private zzalr f22104c;

    /* renamed from: d */
    private zzalr f22105d;

    /* renamed from: c */
    private static Context m16654c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final zzalr m16655a(Context context, zzbai zzbaiVar) {
        zzalr zzalrVar;
        synchronized (this.f22103b) {
            if (this.f22105d == null) {
                this.f22105d = new zzalr(m16654c(context), zzbaiVar, (String) zzyt.m20848e().m16421c(zzacu.f21755b));
            }
            zzalrVar = this.f22105d;
        }
        return zzalrVar;
    }

    /* renamed from: b */
    public final zzalr m16656b(Context context, zzbai zzbaiVar) {
        zzalr zzalrVar;
        synchronized (this.f22102a) {
            if (this.f22104c == null) {
                this.f22104c = new zzalr(m16654c(context), zzbaiVar, (String) zzyt.m20848e().m16421c(zzacu.f21762c));
            }
            zzalrVar = this.f22104c;
        }
        return zzalrVar;
    }
}
