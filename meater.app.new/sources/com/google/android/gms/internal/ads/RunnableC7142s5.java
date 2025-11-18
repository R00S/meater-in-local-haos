package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.s5 */
/* loaded from: classes2.dex */
final class RunnableC7142s5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Context f20499f;

    /* renamed from: g */
    private final /* synthetic */ String f20500g;

    /* renamed from: h */
    private final /* synthetic */ boolean f20501h;

    /* renamed from: i */
    private final /* synthetic */ boolean f20502i;

    RunnableC7142s5(zzayi zzayiVar, Context context, String str, boolean z, boolean z2) {
        this.f20499f = context;
        this.f20500g = str;
        this.f20501h = z;
        this.f20502i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f20499f);
        builder.setMessage(this.f20500g);
        if (this.f20501h) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f20502i) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC7179t5(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
