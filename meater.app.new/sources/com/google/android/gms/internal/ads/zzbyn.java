package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbyn extends zzbpc {

    /* renamed from: f */
    private final Executor f23778f;

    /* renamed from: g */
    private final zzbyt f23779g;

    /* renamed from: h */
    private final zzbzb f23780h;

    /* renamed from: i */
    private final zzbzl f23781i;

    /* renamed from: j */
    private final zzbyx f23782j;

    /* renamed from: k */
    private final zzbzc f23783k;

    /* renamed from: l */
    private final zzdte<zzccb> f23784l;

    /* renamed from: m */
    private final zzdte<zzcbz> f23785m;

    /* renamed from: n */
    private final zzdte<zzccg> f23786n;

    /* renamed from: o */
    private final zzdte<zzcbw> f23787o;

    /* renamed from: p */
    private final zzdte<zzccd> f23788p;

    /* renamed from: q */
    private zzcab f23789q;

    /* renamed from: r */
    private boolean f23790r;

    /* renamed from: s */
    private final zzavf f23791s;

    /* renamed from: t */
    private final zzdh f23792t;

    /* renamed from: u */
    private final zzbai f23793u;

    /* renamed from: v */
    private final Context f23794v;

    public zzbyn(Executor executor, zzbyt zzbytVar, zzbzb zzbzbVar, zzbzl zzbzlVar, zzbyx zzbyxVar, zzbzc zzbzcVar, zzdte<zzccb> zzdteVar, zzdte<zzcbz> zzdteVar2, zzdte<zzccg> zzdteVar3, zzdte<zzcbw> zzdteVar4, zzdte<zzccd> zzdteVar5, zzavf zzavfVar, zzdh zzdhVar, zzbai zzbaiVar, Context context) {
        this.f23778f = executor;
        this.f23779g = zzbytVar;
        this.f23780h = zzbzbVar;
        this.f23781i = zzbzlVar;
        this.f23782j = zzbyxVar;
        this.f23783k = zzbzcVar;
        this.f23784l = zzdteVar;
        this.f23785m = zzdteVar2;
        this.f23786n = zzdteVar3;
        this.f23787o = zzdteVar4;
        this.f23788p = zzdteVar5;
        this.f23791s = zzavfVar;
        this.f23792t = zzdhVar;
        this.f23793u = zzbaiVar;
        this.f23794v = context;
    }

    /* renamed from: D */
    public static boolean m18478D(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: y */
    private final void m18479y(String str) {
        String str2;
        View view;
        if (this.f23782j.mo18559d()) {
            zzbgz zzbgzVarM18514B = this.f23779g.m18514B();
            zzbgz zzbgzVarM18513A = this.f23779g.m18513A();
            if (zzbgzVarM18514B == null && zzbgzVarM18513A == null) {
                return;
            }
            boolean z = zzbgzVarM18514B != null;
            boolean z2 = zzbgzVarM18513A != null;
            String str3 = null;
            if (z) {
                str2 = str3;
            } else if (z2) {
                str3 = "javascript";
                zzbgzVarM18514B = zzbgzVarM18513A;
                str2 = str3;
            } else {
                zzbgzVarM18514B = null;
                str2 = null;
            }
            if (zzbgzVarM18514B.getWebView() != null && zzk.zzlv().m16875g(this.f23794v)) {
                zzbai zzbaiVar = this.f23793u;
                int i2 = zzbaiVar.f22751g;
                int i3 = zzbaiVar.f22752h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                IObjectWrapper iObjectWrapperM16871c = zzk.zzlv().m16871c(sb.toString(), zzbgzVarM18514B.getWebView(), HttpUrl.FRAGMENT_ENCODE_SET, "javascript", str2, str);
                if (iObjectWrapperM16871c == null) {
                    return;
                }
                this.f23779g.m18518F(iObjectWrapperM16871c);
                zzbgzVarM18514B.mo14880H(iObjectWrapperM16871c);
                if (z2 && (view = zzbgzVarM18513A.getView()) != null) {
                    zzk.zzlv().m16872d(iObjectWrapperM16871c, view);
                }
                zzk.zzlv().m16873e(iObjectWrapperM16871c);
            }
        }
    }

    /* renamed from: A */
    public final synchronized boolean m18480A(Bundle bundle) {
        if (this.f23790r) {
            return true;
        }
        boolean zMo18471m = this.f23780h.mo18471m(bundle);
        this.f23790r = zMo18471m;
        return zMo18471m;
    }

    /* renamed from: B */
    public final synchronized void m18481B() {
        this.f23780h.mo18468j0();
    }

    /* renamed from: C */
    public final zzaee m18482C() {
        return new zzbym(this.f23779g);
    }

    /* renamed from: E */
    public final void m18483E(View view) {
        IObjectWrapper iObjectWrapperM18515C = this.f23779g.m18515C();
        boolean z = this.f23779g.m18514B() != null;
        if (!this.f23782j.mo18559d() || iObjectWrapperM18515C == null || !z || view == null) {
            return;
        }
        zzk.zzlv().m16872d(iObjectWrapperM18515C, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    /* renamed from: a */
    public final synchronized void mo18226a() {
        this.f23778f.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vf

            /* renamed from: f */
            private final zzbyn f20741f;

            {
                this.f20741f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20741f.m18495r();
            }
        });
        super.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    /* renamed from: c */
    public final void mo16095c() {
        this.f23778f.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tf

            /* renamed from: f */
            private final zzbyn f20569f;

            {
                this.f20569f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20569f.m18496s();
            }
        });
        if (this.f23779g.m18552w() != 7) {
            Executor executor = this.f23778f;
            zzbzb zzbzbVar = this.f23780h;
            zzbzbVar.getClass();
            executor.execute(RunnableC7226uf.m15928a(zzbzbVar));
        }
        super.mo16095c();
    }

    /* renamed from: g */
    public final synchronized void m18484g() {
        this.f23780h.mo18455W();
    }

    /* renamed from: h */
    public final synchronized void m18485h() {
        zzcab zzcabVar = this.f23789q;
        if (zzcabVar == null) {
            zzbad.m17349e("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzcabVar instanceof zzbzi;
            this.f23778f.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.wf

                /* renamed from: f */
                private final zzbyn f20849f;

                /* renamed from: g */
                private final boolean f20850g;

                {
                    this.f20849f = this;
                    this.f20850g = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20849f.m18497t(this.f20850g);
                }
            });
        }
    }

    /* renamed from: i */
    public final synchronized void m18486i(View view) {
        this.f23780h.mo18458c(view);
    }

    /* renamed from: j */
    public final synchronized void m18487j(View view, MotionEvent motionEvent, View view2) {
        this.f23780h.mo18464g(view, motionEvent, view2);
    }

    /* renamed from: k */
    public final synchronized void m18488k(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21735X4)).booleanValue()) {
            this.f23781i.m18599g(this.f23789q);
        }
        this.f23780h.mo18465h(view, view2, map, map2, z);
    }

    /* renamed from: l */
    public final synchronized void m18489l(zzaag zzaagVar) {
        this.f23780h.mo18454G0(zzaagVar);
    }

    /* renamed from: m */
    public final synchronized void m18490m(zzaak zzaakVar) {
        this.f23780h.mo18462e0(zzaakVar);
    }

    /* renamed from: n */
    public final synchronized void m18491n(zzagd zzagdVar) {
        this.f23780h.mo18460d0(zzagdVar);
    }

    /* renamed from: o */
    public final synchronized void m18492o(zzcab zzcabVar) {
        zzdc zzdcVarM19455f;
        this.f23789q = zzcabVar;
        this.f23781i.m18598f(zzcabVar);
        this.f23780h.mo18456a(zzcabVar.mo18589k0(), zzcabVar.mo18587V3(), zzcabVar.mo18586S4(), zzcabVar, zzcabVar);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21835n2)).booleanValue() && (zzdcVarM19455f = this.f23792t.m19455f()) != null) {
            zzdcVarM19455f.zzb(zzcabVar.mo18589k0());
        }
        if (zzcabVar.mo18584E3() != null) {
            zzcabVar.mo18584E3().m20602d(this.f23791s);
        }
    }

    /* renamed from: p */
    public final synchronized void m18493p() {
        if (this.f23790r) {
            return;
        }
        this.f23780h.mo18470l();
    }

    /* renamed from: q */
    public final boolean m18494q() {
        return this.f23782j.mo18557b();
    }

    /* renamed from: r */
    final /* synthetic */ void m18495r() {
        this.f23780h.destroy();
        this.f23779g.m18533a();
    }

    /* renamed from: s */
    final /* synthetic */ void m18496s() {
        try {
            int iM18552w = this.f23779g.m18552w();
            if (iM18552w == 1) {
                if (this.f23783k.m18562a() != null) {
                    m18479y("Google");
                    this.f23783k.m18562a().mo16516t2(this.f23784l.get());
                    return;
                }
                return;
            }
            if (iM18552w == 2) {
                if (this.f23783k.m18563b() != null) {
                    m18479y("Google");
                    this.f23783k.m18563b().mo16514D3(this.f23785m.get());
                    return;
                }
                return;
            }
            if (iM18552w == 3) {
                if (this.f23783k.m18569h(this.f23779g.m18537e()) != null) {
                    this.f23783k.m18569h(this.f23779g.m18537e()).mo16520M4(this.f23788p.get());
                }
            } else {
                if (iM18552w == 6) {
                    if (this.f23783k.m18564c() != null) {
                        m18479y("Google");
                        this.f23783k.m18564c().mo16524u6(this.f23786n.get());
                        return;
                    }
                    return;
                }
                if (iM18552w != 7) {
                    zzbad.m17351g("Wrong native template id!");
                } else if (this.f23783k.m18566e() != null) {
                    this.f23783k.m18566e().mo16597g6(this.f23787o.get());
                }
            }
        } catch (RemoteException e2) {
            zzbad.m17347c("RemoteException when notifyAdLoad is called", e2);
        }
    }

    /* renamed from: t */
    final /* synthetic */ void m18497t(boolean z) {
        this.f23780h.mo18469k(this.f23789q.mo18589k0(), this.f23789q.mo18590y4(), this.f23789q.mo18587V3(), z);
    }

    /* renamed from: u */
    public final synchronized void m18498u(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f23790r) {
            return;
        }
        if (z) {
            this.f23780h.mo18467j(view, map, map2);
            this.f23790r = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21703S2)).booleanValue() && map != null) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null && m18478D(view2)) {
                        this.f23780h.mo18467j(view, map, map2);
                        this.f23790r = true;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final synchronized void m18499v(zzcab zzcabVar) {
        this.f23780h.mo18461e(zzcabVar.mo18589k0(), zzcabVar.mo18590y4());
        if (zzcabVar.mo18583E0() != null) {
            zzcabVar.mo18583E0().setClickable(false);
            zzcabVar.mo18583E0().removeAllViews();
        }
        if (zzcabVar.mo18584E3() != null) {
            zzcabVar.mo18584E3().m20603e(this.f23791s);
        }
        this.f23789q = null;
    }

    /* renamed from: w */
    public final synchronized void m18500w(Bundle bundle) {
        this.f23780h.mo18463f(bundle);
    }

    /* renamed from: x */
    public final synchronized void m18501x(String str) {
        this.f23780h.mo18466i(str);
    }

    /* renamed from: z */
    public final synchronized void m18502z(Bundle bundle) {
        this.f23780h.mo18457b(bundle);
    }
}
