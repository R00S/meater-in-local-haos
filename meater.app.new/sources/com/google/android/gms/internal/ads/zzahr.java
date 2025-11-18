package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzahr implements zzaho<zzbgz> {

    /* renamed from: a */
    private static final Map<String, Integer> f22036a = CollectionUtils.m14614e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: b */
    private final com.google.android.gms.ads.internal.zzb f22037b;

    /* renamed from: c */
    private final zzapr f22038c;

    /* renamed from: d */
    private final zzaqc f22039d;

    public zzahr(com.google.android.gms.ads.internal.zzb zzbVar, zzapr zzaprVar, zzaqc zzaqcVar) {
        this.f22037b = zzbVar;
        this.f22038c = zzaprVar;
        this.f22039d = zzaqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzbgz zzbgzVar2 = zzbgzVar;
        int iIntValue = f22036a.get((String) map.get("a")).intValue();
        if (iIntValue != 5 && iIntValue != 7 && (zzbVar = this.f22037b) != null && !zzbVar.zzkx()) {
            this.f22037b.zzbk(null);
            return;
        }
        if (iIntValue == 1) {
            this.f22038c.m16839i(map);
            return;
        }
        if (iIntValue == 3) {
            new zzapu(zzbgzVar2, map).m16845h();
            return;
        }
        if (iIntValue == 4) {
            new zzapo(zzbgzVar2, map).m16837i();
            return;
        }
        if (iIntValue == 5) {
            new zzapt(zzbgzVar2, map).m16843a();
            return;
        }
        if (iIntValue == 6) {
            this.f22038c.m16842l(true);
        } else if (iIntValue != 7) {
            zzbad.m17352h("Unknown MRAID command called.");
        } else if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21770d0)).booleanValue()) {
            this.f22039d.mo15073a();
        }
    }
}
