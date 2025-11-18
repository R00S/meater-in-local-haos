package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzajy implements zzajq, zzajw {

    /* renamed from: f */
    private final zzbgz f22074f;

    /* renamed from: g */
    private final Context f22075g;

    public zzajy(Context context, zzbai zzbaiVar, zzdh zzdhVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzbhj {
        this.f22075g = context;
        zzk.zzlh();
        zzbgz zzbgzVarM17703b = zzbhf.m17703b(context, zzbin.m17735b(), HttpUrl.FRAGMENT_ENCODE_SET, false, false, zzdhVar, zzbaiVar, null, null, null, zzwj.m20694f());
        this.f22074f = zzbgzVarM17703b;
        zzbgzVarM17703b.getView().setWillNotDraw(true);
    }

    /* renamed from: u */
    private static void m16625u(Runnable runnable) {
        zzyt.m20844a();
        if (zzazt.m17318w()) {
            runnable.run();
        } else {
            zzaxi.f22654a.post(runnable);
        }
    }

    /* renamed from: L */
    final /* synthetic */ void m16626L(String str) {
        this.f22074f.mo14917k(str);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: T */
    public final void mo16604T(String str) {
        m16625u(new RunnableC6694g1(this, str));
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    /* renamed from: X */
    public final void mo15685X(String str, String str2) {
        zzajr.m16610a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: Y */
    public final void mo14895Y(String str, JSONObject jSONObject) {
        zzajr.m16612c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void destroy() {
        this.f22074f.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    /* renamed from: f */
    public final void mo16627f(String str, zzaho<? super zzalf> zzahoVar) {
        this.f22074f.mo14907f(str, new C6731h1(this, zzahoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    /* renamed from: i */
    public final void mo16628i(String str, final zzaho<? super zzalf> zzahoVar) {
        this.f22074f.mo14932t(str, new Predicate(zzahoVar) { // from class: com.google.android.gms.internal.ads.c1

            /* renamed from: a */
            private final zzaho f18375a;

            {
                this.f18375a = zzahoVar;
            }

            @Override // com.google.android.gms.common.util.Predicate
            /* renamed from: a */
            public final boolean mo14652a(Object obj) {
                zzaho zzahoVar2 = (zzaho) obj;
                return (zzahoVar2 instanceof C6731h1) && ((C6731h1) zzahoVar2).f19023a.equals(this.f18375a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaji
    /* renamed from: j */
    public final void mo14915j(String str, JSONObject jSONObject) {
        zzajr.m16613d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public final void mo14917k(final String str) {
        m16625u(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.b1

            /* renamed from: f */
            private final zzajy f18217f;

            /* renamed from: g */
            private final String f18218g;

            {
                this.f18217f = this;
                this.f18218g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18217f.m16626L(this.f18218g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: l */
    public final boolean mo16605l() {
        return this.f22074f.mo14919l();
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: o0 */
    public final void mo16606o0(String str) {
        m16625u(new RunnableC6620e1(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: q */
    public final void mo16607q(zzajx zzajxVar) {
        zzbii zzbiiVarMo14926p = this.f22074f.mo14926p();
        zzajxVar.getClass();
        zzbiiVarMo14926p.mo17688j(C6583d1.m15017b(zzajxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: q0 */
    public final zzalg mo16608q0() {
        return new zzalh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: u0 */
    public final void mo16609u0(String str) {
        m16625u(new RunnableC6657f1(this, str));
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: y */
    public final void mo14940y(String str, Map map) {
        zzajr.m16611b(this, str, map);
    }
}
