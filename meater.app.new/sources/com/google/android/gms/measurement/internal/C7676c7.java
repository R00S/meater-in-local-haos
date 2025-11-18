package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes2.dex */
final class C7676c7 {

    /* renamed from: a */
    private final Clock f28591a;

    /* renamed from: b */
    private long f28592b;

    public C7676c7(Clock clock) {
        Preconditions.m14372k(clock);
        this.f28591a = clock;
    }

    /* renamed from: a */
    public final void m22767a() {
        this.f28592b = this.f28591a.mo14609b();
    }

    /* renamed from: b */
    public final boolean m22768b(long j2) {
        return this.f28592b == 0 || this.f28591a.mo14609b() - this.f28592b >= 3600000;
    }

    /* renamed from: c */
    public final void m22769c() {
        this.f28592b = 0L;
    }
}
