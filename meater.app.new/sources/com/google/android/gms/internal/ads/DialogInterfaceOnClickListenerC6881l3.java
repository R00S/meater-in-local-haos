package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.l3 */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6881l3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ zzapu f19743f;

    DialogInterfaceOnClickListenerC6881l3(zzapu zzapuVar) {
        this.f19743f = zzapuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f19743f.m16865e("User canceled the download.");
    }
}
