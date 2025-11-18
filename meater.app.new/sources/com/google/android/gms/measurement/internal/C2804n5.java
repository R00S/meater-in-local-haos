package com.google.android.gms.measurement.internal;

import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2804n5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f35479a;

    /* renamed from: b, reason: collision with root package name */
    private long f35480b;

    public C2804n5(com.google.android.gms.common.util.e eVar) {
        C3445p.k(eVar);
        this.f35479a = eVar;
    }

    public final void a() {
        this.f35480b = 0L;
    }

    public final boolean b(long j10) {
        return this.f35480b == 0 || this.f35479a.c() - this.f35480b >= 3600000;
    }

    public final void c() {
        this.f35480b = this.f35479a.c();
    }
}
