package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbdk {

    /* renamed from: a */
    @VisibleForTesting
    private static int f22873a;

    /* renamed from: b */
    @VisibleForTesting
    private static int f22874b;

    /* renamed from: c */
    private zzge f22875c;

    /* renamed from: d */
    private zzhd f22876d;

    /* renamed from: e */
    private zzgn f22877e;

    /* renamed from: f */
    private zzbdo f22878f;

    /* renamed from: g */
    private final C6812j8 f22879g;

    /* renamed from: h */
    private final C6849k8 f22880h;

    /* renamed from: i */
    private final C6775i8 f22881i;

    public zzbdk() {
        C6738h8 c6738h8 = null;
        C6812j8 c6812j8 = new C6812j8(this);
        this.f22879g = c6812j8;
        this.f22880h = new C6849k8(this);
        this.f22881i = new C6775i8(this);
        Preconditions.m14367f("ExoPlayer must be created on the main UI thread.");
        if (zzawz.m17083n()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
            sb.append("AdExoPlayerHelper initialize ");
            sb.append(strValueOf);
            zzawz.m17082m(sb.toString());
        }
        f22873a++;
        zzge zzgeVarM19967a = zzgg.m19967a(2);
        this.f22875c = zzgeVarM19967a;
        zzgeVarM19967a.mo15994i(c6812j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized void m17496f(String str, String str2) {
        zzbdo zzbdoVar = this.f22878f;
        if (zzbdoVar != null) {
            zzbdoVar.mo15368b(str, str2);
        }
    }

    /* renamed from: g */
    public static int m17497g() {
        return f22873a;
    }

    /* renamed from: h */
    public static int m17498h() {
        return f22874b;
    }

    /* renamed from: a */
    public final synchronized void m17499a() {
        this.f22878f = null;
    }

    /* renamed from: c */
    public final synchronized void m17500c(zzbdo zzbdoVar) {
        this.f22878f = zzbdoVar;
    }

    /* renamed from: d */
    public final void m17501d(zzgh zzghVar, zzhh zzhhVar, zzgq zzgqVar) {
        this.f22879g.m15367d(zzghVar);
        this.f22880h.m15396i(zzhhVar);
        this.f22881i.m15335i(zzgqVar);
    }

    /* renamed from: e */
    public final boolean m17502e(zzhn zzhnVar) {
        if (this.f22875c == null) {
            return false;
        }
        Handler handler = zzaxi.f22654a;
        this.f22876d = new zzhd(zzhnVar, 1, 0L, handler, this.f22880h, -1);
        zzgn zzgnVar = new zzgn(zzhnVar, handler, this.f22881i);
        this.f22877e = zzgnVar;
        this.f22875c.mo15996k(this.f22876d, zzgnVar);
        f22874b++;
        return true;
    }

    public final void finalize() throws Throwable {
        f22873a--;
        if (zzawz.m17083n()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
            sb.append("AdExoPlayerHelper finalize ");
            sb.append(strValueOf);
            zzawz.m17082m(sb.toString());
        }
    }

    /* renamed from: i */
    public final void m17503i() {
        zzge zzgeVar = this.f22875c;
        if (zzgeVar != null) {
            zzgeVar.mo15988c();
            this.f22875c = null;
            f22874b--;
        }
    }

    /* renamed from: j */
    public final zzge m17504j() {
        return this.f22875c;
    }

    /* renamed from: k */
    public final zzhd m17505k() {
        return this.f22876d;
    }

    /* renamed from: l */
    public final zzgn m17506l() {
        return this.f22877e;
    }
}
