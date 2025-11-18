package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes2.dex */
final class RunnableC7683d5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28600f;

    /* renamed from: g */
    private final /* synthetic */ String f28601g;

    /* renamed from: h */
    private final /* synthetic */ String f28602h;

    /* renamed from: i */
    private final /* synthetic */ String f28603i;

    /* renamed from: j */
    private final /* synthetic */ boolean f28604j;

    /* renamed from: k */
    private final /* synthetic */ zzhc f28605k;

    RunnableC7683d5(zzhc zzhcVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f28605k = zzhcVar;
        this.f28600f = atomicReference;
        this.f28601g = str;
        this.f28602h = str2;
        this.f28603i = str3;
        this.f28604j = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28605k.f28874a.m23226R().m23369U(this.f28600f, this.f28601g, this.f28602h, this.f28603i, this.f28604j);
    }
}
