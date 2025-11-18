package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcig extends zzarn {

    /* renamed from: f */
    private final Context f24352f;

    /* renamed from: g */
    private final Executor f24353g;

    /* renamed from: h */
    private final zzasm f24354h;

    /* renamed from: i */
    private final zzasl f24355i;

    /* renamed from: j */
    private final zzblp f24356j;

    public zzcig(Context context, Executor executor, zzasm zzasmVar, zzblp zzblpVar, zzasl zzaslVar) {
        zzacu.m16423a(context);
        this.f24352f = context;
        this.f24353g = executor;
        this.f24354h = zzasmVar;
        this.f24355i = zzaslVar;
        this.f24356j = zzblpVar;
    }

    /* renamed from: h7 */
    private final void m18804h7(zzbbh<InputStream> zzbbhVar, zzarr zzarrVar) {
        zzbar.m17369f(zzbar.m17366c(zzbbhVar, new zzbal(this) { // from class: com.google.android.gms.internal.ads.tj

            /* renamed from: a */
            private final zzcig f20573a;

            {
                this.f20573a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.m17378o(zzcyc.m19073c((InputStream) obj));
            }
        }, zzaxg.f22651a), new C7230uj(this, zzarrVar), zzbbm.f22758b);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    /* renamed from: I5 */
    public final void mo16892I5(zzarx zzarxVar, zzarr zzarrVar) {
        zzbbh<InputStream> zzbbhVarM18806j7 = m18806j7(zzarxVar);
        m18804h7(zzbbhVarM18806j7, zzarrVar);
        zzbbhVarM18806j7.mo14748k(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rj

            /* renamed from: f */
            private final zzcig f20459f;

            {
                this.f20459f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20459f.m18805i7();
            }
        }, this.f24353g);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    /* renamed from: W5 */
    public final void mo16893W5(zzarg zzargVar, zzarp zzarpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    /* renamed from: X6 */
    public final void mo16894X6(zzarx zzarxVar, zzarr zzarrVar) {
        zzbbh<InputStream> zzbbhVarM19112f;
        zzalr zzalrVarM16655a = zzk.zzlt().m16655a(this.f24352f, zzbai.m17359y());
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21657K4)).booleanValue()) {
            zzcvs zzcvsVarMo17778a = this.f24356j.mo17778a(zzarxVar);
            final zzcvb<JSONObject> zzcvbVarMo14945b = this.f24356j.mo17778a(zzarxVar).mo14945b();
            zzbbhVarM19112f = zzcvsVarMo17778a.mo14946c().m19099c(zzczs.GET_SIGNALS, zzbar.m17378o(zzarxVar.f22411f)).m19109b(new zzbal(zzcvbVarMo14945b) { // from class: com.google.android.gms.internal.ads.sj

                /* renamed from: a */
                private final zzcvb f20525a;

                {
                    this.f20525a = zzcvbVarMo14945b;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.f20525a.m18998b(zzk.zzlg().m17171N((Bundle) obj));
                }
            }).m19116j(zzczs.JS_SIGNALS).m19109b(zzalrVarM16655a.m16658a("google.afma.request.getSignals", zzalo.f22107b, zzalo.f22108c)).m19112f();
        } else {
            zzbbhVarM19112f = zzbar.m17375l(new Exception("Signal collection disabled."));
        }
        m18804h7(zzbbhVarM19112f, zzarrVar);
    }

    /* renamed from: i7 */
    final /* synthetic */ void m18805i7() {
        zzbao.m17362a(this.f24355i.mo16918a(), "persistFlags");
    }

    /* renamed from: j7 */
    public final zzbbh<InputStream> m18806j7(zzarx zzarxVar) {
        zzalr zzalrVarM16655a = zzk.zzlt().m16655a(this.f24352f, zzbai.m17359y());
        final zzcvs zzcvsVarMo17778a = this.f24356j.mo17778a(zzarxVar);
        zzbal zzbalVar = new zzbal(zzcvsVarMo17778a) { // from class: com.google.android.gms.internal.ads.lj

            /* renamed from: a */
            private final zzcvs f19844a;

            {
                this.f19844a = zzcvsVarMo17778a;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f19844a.mo14944a().m18998b(zzk.zzlg().m17171N((Bundle) obj));
            }
        };
        zzczc zzczcVar = C6934mj.f19927a;
        zzaln<JSONObject> zzalnVar = zzalo.f22107b;
        zzalj zzaljVarM16658a = zzalrVarM16655a.m16658a("AFMA_getAdDictionary", zzalnVar, C6971nj.f20095a);
        zzalj zzaljVarM16658a2 = zzalrVarM16655a.m16658a("google.afma.response.normalize", zzcir.f24357a, zzalo.f22108c);
        zzciu zzciuVar = new zzciu(this.f24352f, zzarxVar.f22412g.f22750f, this.f24354h, zzarxVar.f22417l);
        zzczt zzcztVarMo14946c = zzcvsVarMo17778a.mo14946c();
        final zzcze zzczeVarM19112f = zzcztVarMo14946c.m19099c(zzczs.GMS_SIGNALS, zzbar.m17378o(zzarxVar.f22411f)).m19109b(zzbalVar).m19114h(zzczcVar).m19112f();
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21891w4)).booleanValue()) {
            return zzcztVarMo14946c.m19099c(zzczs.AD_REQUEST, zzczeVarM19112f).m19109b(zzalrVarM16655a.m16658a("google.afma.request.getAdResponse", zzalnVar, zzalnVar)).m19114h(C7008oj.f20196a).m19112f();
        }
        final zzcze zzczeVarM19112f2 = zzcztVarMo14946c.m19099c(zzczs.BUILD_URL, zzczeVarM19112f).m19109b(zzaljVarM16658a).m19112f();
        final zzcze zzczeVarM19112f3 = zzcztVarMo14946c.m19098b(zzczs.HTTP, zzczeVarM19112f2, zzczeVarM19112f).m19102a(new Callable(zzczeVarM19112f, zzczeVarM19112f2) { // from class: com.google.android.gms.internal.ads.pj

            /* renamed from: f */
            private final zzbbh f20307f;

            /* renamed from: g */
            private final zzbbh f20308g;

            {
                this.f20307f = zzczeVarM19112f;
                this.f20308g = zzczeVarM19112f2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzciv((JSONObject) this.f20307f.get(), (zzasd) this.f20308g.get());
            }
        }).m19114h(zzciuVar).m19112f();
        return zzcztVarMo14946c.m19098b(zzczs.PRE_PROCESS, zzczeVarM19112f, zzczeVarM19112f2, zzczeVarM19112f3).m19102a(new Callable(zzczeVarM19112f3, zzczeVarM19112f, zzczeVarM19112f2) { // from class: com.google.android.gms.internal.ads.qj

            /* renamed from: f */
            private final zzbbh f20395f;

            /* renamed from: g */
            private final zzbbh f20396g;

            /* renamed from: h */
            private final zzbbh f20397h;

            {
                this.f20395f = zzczeVarM19112f3;
                this.f20396g = zzczeVarM19112f;
                this.f20397h = zzczeVarM19112f2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzcir((zzciw) this.f20395f.get(), (JSONObject) this.f20396g.get(), (zzasd) this.f20397h.get());
            }
        }).m19109b(zzaljVarM16658a2).m19112f();
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    /* renamed from: r6 */
    public final zzari mo16895r6(zzarg zzargVar) throws RemoteException {
        return null;
    }
}
