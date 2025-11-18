package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.dj */
/* loaded from: classes2.dex */
final class C6601dj implements zzban<zzcxu> {

    /* renamed from: a */
    private final /* synthetic */ zzchl f18691a;

    C6601dj(zzchl zzchlVar) {
        this.f18691a = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue()) {
            Matcher matcher = zzchl.f24322b.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f18691a.f24327g.m18824e(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzcxu zzcxuVar) {
        zzcxu zzcxuVar2 = zzcxuVar;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue()) {
            this.f18691a.f24327g.m18824e(zzcxuVar2.f25289b.f25284b.f25276e);
            this.f18691a.f24327g.m18825f(zzcxuVar2.f25289b.f25284b.f25277f);
        }
    }
}
