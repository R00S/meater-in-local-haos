package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Future;

@zzard
/* loaded from: classes2.dex */
public final class zzwb {

    /* renamed from: a */
    private zzvu f27238a;

    /* renamed from: b */
    private boolean f27239b;

    /* renamed from: c */
    private final Context f27240c;

    /* renamed from: d */
    private final Object f27241d = new Object();

    zzwb(Context context) {
        this.f27240c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m20683a() {
        synchronized (this.f27241d) {
            zzvu zzvuVar = this.f27238a;
            if (zzvuVar == null) {
                return;
            }
            zzvuVar.disconnect();
            this.f27238a = null;
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: c */
    static /* synthetic */ boolean m20685c(zzwb zzwbVar, boolean z) {
        zzwbVar.f27239b = true;
        return true;
    }

    /* renamed from: e */
    final Future<InputStream> m20689e(zzvv zzvvVar) {
        y40 y40Var = new y40(this);
        z40 z40Var = new z40(this, zzvvVar, y40Var);
        d50 d50Var = new d50(this, y40Var);
        synchronized (this.f27241d) {
            zzvu zzvuVar = new zzvu(this.f27240c, zzk.zzlu().m17276b(), z40Var, d50Var);
            this.f27238a = zzvuVar;
            zzvuVar.checkAvailabilityAndConnect();
        }
        return y40Var;
    }
}
