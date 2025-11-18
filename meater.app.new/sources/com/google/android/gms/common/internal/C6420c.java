package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes2.dex */
final class C6420c extends DialogRedirect {

    /* renamed from: f */
    private final /* synthetic */ Intent f17807f;

    /* renamed from: g */
    private final /* synthetic */ LifecycleFragment f17808g;

    /* renamed from: h */
    private final /* synthetic */ int f17809h;

    C6420c(Intent intent, LifecycleFragment lifecycleFragment, int i2) {
        this.f17807f = intent;
        this.f17808g = lifecycleFragment;
        this.f17809h = i2;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    /* renamed from: d */
    public final void mo14324d() {
        Intent intent = this.f17807f;
        if (intent != null) {
            this.f17808g.startActivityForResult(intent, this.f17809h);
        }
    }
}
