package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes2.dex */
final class RunnableC7665b5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28559f;

    /* renamed from: g */
    private final /* synthetic */ String f28560g;

    /* renamed from: h */
    private final /* synthetic */ String f28561h;

    /* renamed from: i */
    private final /* synthetic */ String f28562i;

    /* renamed from: j */
    private final /* synthetic */ zzhc f28563j;

    RunnableC7665b5(zzhc zzhcVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f28563j = zzhcVar;
        this.f28559f = atomicReference;
        this.f28560g = str;
        this.f28561h = str2;
        this.f28562i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28563j.f28874a.m23226R().m23368T(this.f28559f, this.f28560g, this.f28561h, this.f28562i);
    }
}
