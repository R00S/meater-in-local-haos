package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import p024c.p041e.C0868b;

/* loaded from: classes2.dex */
public class zaae extends zal {

    /* renamed from: k */
    private final C0868b<zai<?>> f17480k;

    /* renamed from: l */
    private GoogleApiManager f17481l;

    /* renamed from: q */
    private final void m14114q() {
        if (this.f17480k.isEmpty()) {
            return;
        }
        this.f17481l.m13969i(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: g */
    public void mo14036g() {
        super.mo14036g();
        m14114q();
    }

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public void mo14038i() {
        super.mo14038i();
        m14114q();
    }

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo14039j() {
        super.mo14039j();
        this.f17481l.m13970m(this);
    }

    @Override // com.google.android.gms.common.api.internal.zal
    /* renamed from: l */
    protected final void mo14115l(ConnectionResult connectionResult, int i2) {
        this.f17481l.m13966f(connectionResult, i2);
    }

    @Override // com.google.android.gms.common.api.internal.zal
    /* renamed from: n */
    protected final void mo14116n() {
        this.f17481l.m13962A();
    }

    /* renamed from: p */
    final C0868b<zai<?>> m14117p() {
        return this.f17480k;
    }
}
