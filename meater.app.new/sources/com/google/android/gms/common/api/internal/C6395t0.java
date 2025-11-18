package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* loaded from: classes2.dex */
final class C6395t0 implements zabt {

    /* renamed from: a */
    private final /* synthetic */ C6391r0 f17463a;

    private C6395t0(C6391r0 c6391r0) {
        this.f17463a = c6391r0;
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: a */
    public final void mo14102a(ConnectionResult connectionResult) {
        this.f17463a.f17455r.lock();
        try {
            this.f17463a.f17452o = connectionResult;
            this.f17463a.m14092y();
        } finally {
            this.f17463a.f17455r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: b */
    public final void mo14103b(Bundle bundle) {
        this.f17463a.f17455r.lock();
        try {
            this.f17463a.m14078k(bundle);
            this.f17463a.f17452o = ConnectionResult.f17198f;
            this.f17463a.m14092y();
        } finally {
            this.f17463a.f17455r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: c */
    public final void mo14104c(int i2, boolean z) {
        this.f17463a.f17455r.lock();
        try {
            if (!this.f17463a.f17454q && this.f17463a.f17453p != null && this.f17463a.f17453p.m13795e0()) {
                this.f17463a.f17454q = true;
                this.f17463a.f17447j.mo13893H(i2);
                return;
            }
            this.f17463a.f17454q = false;
            this.f17463a.m14077j(i2, z);
        } finally {
            this.f17463a.f17455r.unlock();
        }
    }

    /* synthetic */ C6395t0(C6391r0 c6391r0, RunnableC6393s0 runnableC6393s0) {
        this(c6391r0);
    }
}
