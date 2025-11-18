package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcuz;

/* renamed from: com.google.android.gms.internal.ads.ao */
/* loaded from: classes2.dex */
final class C6495ao<S extends zzcuz> {

    /* renamed from: a */
    public final zzbbh<S> f18175a;

    /* renamed from: b */
    private final long f18176b;

    /* renamed from: c */
    private final Clock f18177c;

    public C6495ao(zzbbh<S> zzbbhVar, long j2, Clock clock) {
        this.f18175a = zzbbhVar;
        this.f18177c = clock;
        this.f18176b = clock.mo14609b() + j2;
    }

    /* renamed from: a */
    public final boolean m14765a() {
        return this.f18176b < this.f18177c.mo14609b();
    }
}
