package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class C3 implements com.google.common.util.concurrent.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2797m5 f34776a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f34777b;

    C3(C2843t3 c2843t3, C2797m5 c2797m5) {
        this.f34776a = c2797m5;
        this.f34777b = c2843t3;
    }

    private final void c() {
        SparseArray<Long> sparseArrayL = this.f34777b.h().L();
        C2797m5 c2797m5 = this.f34776a;
        sparseArrayL.put(c2797m5.f35470D, Long.valueOf(c2797m5.f35469C));
        C2835s2 c2835s2H = this.f34777b.h();
        int[] iArr = new int[sparseArrayL.size()];
        long[] jArr = new long[sparseArrayL.size()];
        for (int i10 = 0; i10 < sparseArrayL.size(); i10++) {
            iArr[i10] = sparseArrayL.keyAt(i10);
            jArr[i10] = sparseArrayL.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c2835s2H.f35610p.b(bundle);
    }

    @Override // com.google.common.util.concurrent.b
    public final void a(Object obj) {
        this.f34777b.n();
        c();
        this.f34777b.f35650i = false;
        this.f34777b.f35651j = 1;
        this.f34777b.k().G().b("Successfully registered trigger URI", this.f34776a.f35468B);
        this.f34777b.N0();
    }

    @Override // com.google.common.util.concurrent.b
    public final void b(Throwable th) {
        this.f34777b.n();
        this.f34777b.f35650i = false;
        int iE = (this.f34777b.c().u(K.f34948U0) ? C2843t3.E(this.f34777b, th) : 2) - 1;
        if (iE == 0) {
            this.f34777b.k().M().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C2759h2.w(this.f34777b.q().H()), C2759h2.w(th.toString()));
            this.f34777b.f35651j = 1;
            this.f34777b.F0().add(this.f34776a);
            return;
        }
        if (iE != 1) {
            if (iE != 2) {
                return;
            }
            this.f34777b.k().H().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C2759h2.w(this.f34777b.q().H()), th);
            c();
            this.f34777b.f35651j = 1;
            this.f34777b.N0();
            return;
        }
        this.f34777b.F0().add(this.f34776a);
        if (this.f34777b.f35651j > K.f35000r0.a(null).intValue()) {
            this.f34777b.f35651j = 1;
            this.f34777b.k().M().c("registerTriggerAsync failed. May try later. App ID, throwable", C2759h2.w(this.f34777b.q().H()), C2759h2.w(th.toString()));
            return;
        }
        this.f34777b.k().M().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C2759h2.w(this.f34777b.q().H()), C2759h2.w(String.valueOf(this.f34777b.f35651j)), C2759h2.w(th.toString()));
        C2843t3 c2843t3 = this.f34777b;
        C2843t3.V0(c2843t3, c2843t3.f35651j);
        this.f34777b.f35651j <<= 1;
    }
}
