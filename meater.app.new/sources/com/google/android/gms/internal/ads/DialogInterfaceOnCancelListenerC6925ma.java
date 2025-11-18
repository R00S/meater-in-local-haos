package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ma */
/* loaded from: classes2.dex */
final class DialogInterfaceOnCancelListenerC6925ma implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    private final /* synthetic */ JsResult f19904f;

    DialogInterfaceOnCancelListenerC6925ma(JsResult jsResult) {
        this.f19904f = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f19904f.cancel();
    }
}
