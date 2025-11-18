package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes2.dex */
final class C6398v extends zabr {

    /* renamed from: a */
    private WeakReference<zaaw> f17466a;

    C6398v(zaaw zaawVar) {
        this.f17466a = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    /* renamed from: a */
    public final void mo14072a() {
        zaaw zaawVar = this.f17466a.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.m14165x();
    }
}
