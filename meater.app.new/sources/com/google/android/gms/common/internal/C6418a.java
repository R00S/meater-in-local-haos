package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes2.dex */
final class C6418a extends DialogRedirect {

    /* renamed from: f */
    private final /* synthetic */ Intent f17801f;

    /* renamed from: g */
    private final /* synthetic */ Activity f17802g;

    /* renamed from: h */
    private final /* synthetic */ int f17803h;

    C6418a(Intent intent, Activity activity, int i2) {
        this.f17801f = intent;
        this.f17802g = activity;
        this.f17803h = i2;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    /* renamed from: d */
    public final void mo14324d() {
        Intent intent = this.f17801f;
        if (intent != null) {
            this.f17802g.startActivityForResult(intent, this.f17803h);
        }
    }
}
