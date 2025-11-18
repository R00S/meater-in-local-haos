package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzdsz extends zzdtc {

    /* renamed from: a */
    private Logger f25966a;

    public zzdsz(String str) {
        this.f25966a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdtc
    /* renamed from: a */
    public final void mo19858a(String str) {
        this.f25966a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
