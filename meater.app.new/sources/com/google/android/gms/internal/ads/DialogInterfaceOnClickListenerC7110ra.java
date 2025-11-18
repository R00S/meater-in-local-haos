package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.ra */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC7110ra implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsPromptResult f20443f;

    /* renamed from: g */
    private final /* synthetic */ EditText f20444g;

    DialogInterfaceOnClickListenerC7110ra(JsPromptResult jsPromptResult, EditText editText) {
        this.f20443f = jsPromptResult;
        this.f20444g = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f20443f.confirm(this.f20444g.getText().toString());
    }
}
