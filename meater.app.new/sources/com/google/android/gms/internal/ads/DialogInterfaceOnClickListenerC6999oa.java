package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.oa */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6999oa implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsResult f20146f;

    DialogInterfaceOnClickListenerC6999oa(JsResult jsResult) {
        this.f20146f = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f20146f.confirm();
    }
}
