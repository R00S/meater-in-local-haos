package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes2.dex */
final class BinderC6380m extends com.google.android.gms.signin.internal.zac {

    /* renamed from: f */
    private final WeakReference<zaak> f17427f;

    BinderC6380m(zaak zaakVar) {
        this.f17427f = new WeakReference<>(zaakVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zad
    /* renamed from: w1 */
    public final void mo14065w1(com.google.android.gms.signin.internal.zaj zajVar) {
        zaak zaakVar = this.f17427f.get();
        if (zaakVar == null) {
            return;
        }
        zaakVar.f17485a.m14177h(new C6382n(this, zaakVar, zaakVar, zajVar));
    }
}
