package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.i3 */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6770i3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ zzapo f19284f;

    DialogInterfaceOnClickListenerC6770i3(zzapo zzapoVar) {
        this.f19284f = zzapoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f19284f.m16865e("Operation denied by user.");
    }
}
