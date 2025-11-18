package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcbp {

    /* renamed from: a */
    private final Executor f24010a;

    /* renamed from: b */
    private final zzbmy f24011b;

    /* renamed from: c */
    private final zzbva f24012c;

    zzcbp(Executor executor, zzbmy zzbmyVar, zzbva zzbvaVar) {
        this.f24010a = executor;
        this.f24012c = zzbvaVar;
        this.f24011b = zzbmyVar;
    }

    /* renamed from: a */
    final /* synthetic */ void m18646a(zzbgz zzbgzVar, Map map) {
        this.f24011b.m17908j();
    }

    /* renamed from: b */
    final /* synthetic */ void m18647b(zzbgz zzbgzVar, Map map) {
        this.f24011b.m17909k();
    }

    /* renamed from: c */
    public final void m18648c(final zzbgz zzbgzVar) {
        if (zzbgzVar == null) {
            return;
        }
        this.f24012c.m18388Y(zzbgzVar.getView());
        this.f24012c.m18332V(new zzue(zzbgzVar) { // from class: com.google.android.gms.internal.ads.dh

            /* renamed from: f */
            private final zzbgz f18689f;

            {
                this.f18689f = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzue
            /* renamed from: r0 */
            public final void mo14929r0(zzud zzudVar) {
                zzbii zzbiiVarMo14926p = this.f18689f.mo14926p();
                Rect rect = zzudVar.f27137f;
                zzbiiVarMo14926p.mo17690l(rect.left, rect.top, false);
            }
        }, this.f24010a);
        this.f24012c.m18332V(new zzue(zzbgzVar) { // from class: com.google.android.gms.internal.ads.eh

            /* renamed from: f */
            private final zzbgz f18818f;

            {
                this.f18818f = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzue
            /* renamed from: r0 */
            public final void mo14929r0(zzud zzudVar) {
                zzbgz zzbgzVar2 = this.f18818f;
                HashMap map = new HashMap();
                map.put("isVisible", zzudVar.f27144m ? "1" : "0");
                zzbgzVar2.mo14940y("onAdVisibilityChanged", map);
            }
        }, this.f24010a);
        this.f24012c.m18332V(this.f24011b, this.f24010a);
        this.f24011b.m17911u(zzbgzVar);
        zzbgzVar.mo14907f("/trackActiveViewUnit", new zzaho(this) { // from class: com.google.android.gms.internal.ads.fh

            /* renamed from: a */
            private final zzcbp f18893a;

            {
                this.f18893a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f18893a.m18647b((zzbgz) obj, map);
            }
        });
        zzbgzVar.mo14907f("/untrackActiveViewUnit", new zzaho(this) { // from class: com.google.android.gms.internal.ads.gh

            /* renamed from: a */
            private final zzcbp f18978a;

            {
                this.f18978a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f18978a.m18646a((zzbgz) obj, map);
            }
        });
    }
}
