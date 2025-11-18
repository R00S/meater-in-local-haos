package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.na */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6962na implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsResult f19998f;

    DialogInterfaceOnClickListenerC6962na(JsResult jsResult) {
        this.f19998f = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f19998f.cancel();
    }
}
