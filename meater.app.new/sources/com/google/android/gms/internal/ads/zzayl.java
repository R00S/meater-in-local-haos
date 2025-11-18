package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@zzard
/* loaded from: classes2.dex */
public final class zzayl extends zzak {

    /* renamed from: e */
    private final Context f22682e;

    private zzayl(Context context, zzas zzasVar) {
        super(zzasVar);
        this.f22682e = context;
    }

    /* renamed from: d */
    public static zzv m17244d(Context context) {
        zzv zzvVar = new zzv(new zzan(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzayl(context, new zzat()));
        zzvVar.m20645a();
        return zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzak, com.google.android.gms.internal.ads.zzm
    /* renamed from: a */
    public final zzp mo16589a(zzr<?> zzrVar) throws zzaf {
        if (zzrVar.m20423P() && zzrVar.m20429k() == 0) {
            if (Pattern.matches((String) zzyt.m20848e().m16421c(zzacu.f21614D3), zzrVar.m20430q())) {
                zzyt.m20844a();
                if (zzazt.m17314s(this.f22682e, 13400000)) {
                    zzp zzpVarMo16589a = new zzaii(this.f22682e).mo16589a(zzrVar);
                    if (zzpVarMo16589a != null) {
                        String strValueOf = String.valueOf(zzrVar.m20430q());
                        zzawz.m17082m(strValueOf.length() != 0 ? "Got gmscore asset response: ".concat(strValueOf) : new String("Got gmscore asset response: "));
                        return zzpVarMo16589a;
                    }
                    String strValueOf2 = String.valueOf(zzrVar.m20430q());
                    zzawz.m17082m(strValueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(strValueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo16589a(zzrVar);
    }
}
