package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.google.android.gms.internal.ads.nl */
/* loaded from: classes2.dex */
final class C6973nl<T> implements zzban<T> {

    /* renamed from: a */
    private final /* synthetic */ String f20096a;

    /* renamed from: b */
    private final /* synthetic */ long f20097b;

    /* renamed from: c */
    private final /* synthetic */ zzcmu f20098c;

    C6973nl(zzcmu zzcmuVar, String str, long j2) {
        this.f20098c = zzcmuVar;
        this.f20096a = str;
        this.f20097b = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        long jMo14609b = this.f20098c.f24742a.mo14609b();
        int i2 = 3;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else if (!(th instanceof zzcmk)) {
            i2 = th instanceof CancellationException ? 4 : ((th instanceof zzcgm) && ((zzcgm) th).m18774a() == 3) ? 1 : 6;
        }
        this.f20098c.m18883d(this.f20096a, i2, jMo14609b - this.f20097b);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final void mo14743b(T t) {
        this.f20098c.m18883d(this.f20096a, 0, this.f20098c.f24742a.mo14609b() - this.f20097b);
    }
}
