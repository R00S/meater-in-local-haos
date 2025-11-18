package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.ri */
/* loaded from: classes2.dex */
final class BinderC7118ri extends zzair {

    /* renamed from: f */
    private final /* synthetic */ Object f20454f;

    /* renamed from: g */
    private final /* synthetic */ String f20455g;

    /* renamed from: h */
    private final /* synthetic */ long f20456h;

    /* renamed from: i */
    private final /* synthetic */ zzbbr f20457i;

    /* renamed from: j */
    private final /* synthetic */ zzcgb f20458j;

    BinderC7118ri(zzcgb zzcgbVar, Object obj, String str, long j2, zzbbr zzbbrVar) {
        this.f20458j = zzcgbVar;
        this.f20454f = obj;
        this.f20455g = str;
        this.f20456h = j2;
        this.f20457i = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final void onInitializationFailed(String str) {
        synchronized (this.f20454f) {
            this.f20458j.m18760d(this.f20455g, false, str, (int) (zzk.zzln().mo14609b() - this.f20456h));
            this.f20457i.m17385a(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final void onInitializationSucceeded() {
        synchronized (this.f20454f) {
            this.f20458j.m18760d(this.f20455g, true, HttpUrl.FRAGMENT_ENCODE_SET, (int) (zzk.zzln().mo14609b() - this.f20456h));
            this.f20457i.m17385a(Boolean.TRUE);
        }
    }
}
