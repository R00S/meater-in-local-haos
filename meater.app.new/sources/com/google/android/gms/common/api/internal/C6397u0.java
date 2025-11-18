package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* loaded from: classes2.dex */
final class C6397u0 implements zabt {

    /* renamed from: a */
    private final /* synthetic */ C6391r0 f17465a;

    private C6397u0(C6391r0 c6391r0) {
        this.f17465a = c6391r0;
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: a */
    public final void mo14102a(ConnectionResult connectionResult) {
        this.f17465a.f17455r.lock();
        try {
            this.f17465a.f17453p = connectionResult;
            this.f17465a.m14092y();
        } finally {
            this.f17465a.f17455r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: b */
    public final void mo14103b(Bundle bundle) {
        this.f17465a.f17455r.lock();
        try {
            this.f17465a.f17453p = ConnectionResult.f17198f;
            this.f17465a.m14092y();
        } finally {
            this.f17465a.f17455r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: c */
    public final void mo14104c(int i2, boolean z) {
        this.f17465a.f17455r.lock();
        try {
            if (this.f17465a.f17454q) {
                this.f17465a.f17454q = false;
                this.f17465a.m14077j(i2, z);
            } else {
                this.f17465a.f17454q = true;
                this.f17465a.f17446i.mo13893H(i2);
            }
        } finally {
            this.f17465a.f17455r.unlock();
        }
    }

    /* synthetic */ C6397u0(C6391r0 c6391r0, RunnableC6393s0 runnableC6393s0) {
        this(c6391r0);
    }
}
