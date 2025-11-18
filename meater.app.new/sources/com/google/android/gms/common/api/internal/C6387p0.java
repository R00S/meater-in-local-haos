package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* loaded from: classes2.dex */
final class C6387p0 extends zabr {

    /* renamed from: a */
    private final /* synthetic */ Dialog f17437a;

    /* renamed from: b */
    private final /* synthetic */ RunnableC6385o0 f17438b;

    C6387p0(RunnableC6385o0 runnableC6385o0, Dialog dialog) {
        this.f17438b = runnableC6385o0;
        this.f17437a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    /* renamed from: a */
    public final void mo14072a() {
        this.f17438b.f17435g.m14218o();
        if (this.f17437a.isShowing()) {
            this.f17437a.dismiss();
        }
    }
}
