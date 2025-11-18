package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzalu<I, O> implements zzalj<I, O> {

    /* renamed from: a */
    private final zzall<O> f22112a;

    /* renamed from: b */
    private final zzalm<I> f22113b;

    /* renamed from: c */
    private final zzakh f22114c;

    /* renamed from: d */
    private final String f22115d;

    zzalu(zzakh zzakhVar, String str, zzalm<I> zzalmVar, zzall<O> zzallVar) {
        this.f22114c = zzakhVar;
        this.f22115d = str;
        this.f22113b = zzalmVar;
        this.f22112a = zzallVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m16661c(zzakw zzakwVar, zzalf zzalfVar, I i2, zzbbr<O> zzbbrVar) throws JSONException {
        try {
            zzk.zzlg();
            String strM17158j0 = zzaxi.m17158j0();
            zzagz.f22031o.m16578c(strM17158j0, new C6769i2(this, zzakwVar, zzbbrVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, strM17158j0);
            jSONObject.put("args", this.f22113b.mo15021b(i2));
            zzalfVar.mo14895Y(this.f22115d, jSONObject);
        } catch (Exception e2) {
            try {
                zzbbrVar.m17386c(e2);
                zzbad.m17347c("Unable to invokeJavascript", e2);
            } finally {
                zzakwVar.m16643f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalj
    /* renamed from: a */
    public final zzbbh<O> mo16653a(I i2) {
        zzbbr zzbbrVar = new zzbbr();
        zzakw zzakwVarM16641h = this.f22114c.m16641h(null);
        zzakwVarM16641h.m17390d(new C6695g2(this, zzakwVarM16641h, i2, zzbbrVar), new C6732h2(this, zzbbrVar, zzakwVarM16641h));
        return zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final zzbbh<O> zzf(I i2) throws Exception {
        return mo16653a(i2);
    }
}
