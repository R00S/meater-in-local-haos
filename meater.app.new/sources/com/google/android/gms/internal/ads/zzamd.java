package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzamd<I, O> implements zzbal<I, O> {

    /* renamed from: a */
    private final zzall<O> f22118a;

    /* renamed from: b */
    private final zzalm<I> f22119b;

    /* renamed from: c */
    private final String f22120c;

    /* renamed from: d */
    private final zzbbh<zzalf> f22121d;

    zzamd(zzbbh<zzalf> zzbbhVar, String str, zzalm<I> zzalmVar, zzall<O> zzallVar) {
        this.f22121d = zzbbhVar;
        this.f22120c = str;
        this.f22119b = zzalmVar;
        this.f22118a = zzallVar;
    }

    /* renamed from: c */
    final /* synthetic */ zzbbh m16668c(Object obj, zzalf zzalfVar) throws Exception {
        zzbbr zzbbrVar = new zzbbr();
        zzk.zzlg();
        String strM17158j0 = zzaxi.m17158j0();
        zzagz.f22031o.m16578c(strM17158j0, new C7028p2(this, zzbbrVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, strM17158j0);
        jSONObject.put("args", this.f22119b.mo15021b(obj));
        zzalfVar.mo14895Y(this.f22120c, jSONObject);
        return zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final zzbbh<O> zzf(final I i2) throws Exception {
        return zzbar.m17366c(this.f22121d, new zzbal(this, i2) { // from class: com.google.android.gms.internal.ads.o2

            /* renamed from: a */
            private final zzamd f20130a;

            /* renamed from: b */
            private final Object f20131b;

            {
                this.f20130a = this;
                this.f20131b = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20130a.m16668c(this.f20131b, (zzalf) obj);
            }
        }, zzbbm.f22758b);
    }
}
