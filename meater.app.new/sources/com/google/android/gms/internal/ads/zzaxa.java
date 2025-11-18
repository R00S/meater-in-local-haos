package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzaxa extends zzdbh {
    public zzaxa(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    /* renamed from: a */
    protected final void mo17085a(Message message) {
        try {
            super.mo17085a(message);
        } catch (Throwable th) {
            zzk.zzlg();
            zzaxi.m17162n(zzk.zzlk().m17049a(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e2) {
            zzk.zzlk().m17052e(e2, "AdMobHandler.handleMessage");
        }
    }
}
