package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.qa */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC7073qa implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsPromptResult f20384f;

    DialogInterfaceOnClickListenerC7073qa(JsPromptResult jsPromptResult) {
        this.f20384f = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f20384f.cancel();
    }
}
