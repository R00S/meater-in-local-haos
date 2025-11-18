package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import cm.aptoide.p092pt.account.AccountAnalytics;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import p024c.p041e.C0873g;

/* loaded from: classes2.dex */
public final class zzbyt {

    /* renamed from: a */
    private int f23815a;

    /* renamed from: b */
    private zzaar f23816b;

    /* renamed from: c */
    private zzaea f23817c;

    /* renamed from: d */
    private View f23818d;

    /* renamed from: e */
    private List<zzadw> f23819e;

    /* renamed from: g */
    private zzabj f23821g;

    /* renamed from: h */
    private Bundle f23822h;

    /* renamed from: i */
    private zzbgz f23823i;

    /* renamed from: j */
    private zzbgz f23824j;

    /* renamed from: k */
    private IObjectWrapper f23825k;

    /* renamed from: l */
    private View f23826l;

    /* renamed from: m */
    private IObjectWrapper f23827m;

    /* renamed from: n */
    private double f23828n;

    /* renamed from: o */
    private zzaei f23829o;

    /* renamed from: p */
    private zzaei f23830p;

    /* renamed from: q */
    private String f23831q;

    /* renamed from: t */
    private float f23834t;

    /* renamed from: r */
    private C0873g<String, zzadw> f23832r = new C0873g<>();

    /* renamed from: s */
    private C0873g<String, String> f23833s = new C0873g<>();

    /* renamed from: f */
    private List<zzabj> f23820f = Collections.emptyList();

    /* renamed from: G */
    private static <T> T m18504G(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.m14709k0(iObjectWrapper);
    }

    /* renamed from: H */
    public static zzbyt m18505H(zzana zzanaVar) {
        try {
            return m18510p(zzanaVar.getVideoController(), zzanaVar.mo16753f(), (View) m18504G(zzanaVar.mo16750K()), zzanaVar.mo16754g(), zzanaVar.mo16758k(), zzanaVar.mo16756i(), zzanaVar.getExtras(), zzanaVar.mo16755h(), (View) m18504G(zzanaVar.mo16749I()), zzanaVar.mo16757j(), zzanaVar.getStore(), zzanaVar.mo16760o(), zzanaVar.mo16761t(), zzanaVar.mo16759n(), null, 0.0f);
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    /* renamed from: I */
    public static zzbyt m18506I(zzand zzandVar) {
        try {
            return m18510p(zzandVar.getVideoController(), zzandVar.mo16771f(), (View) m18504G(zzandVar.mo16768K()), zzandVar.mo16772g(), zzandVar.mo16776k(), zzandVar.mo16774i(), zzandVar.getExtras(), zzandVar.mo16773h(), (View) m18504G(zzandVar.mo16767I()), zzandVar.mo16775j(), null, null, -1.0d, zzandVar.mo16766D0(), zzandVar.mo16777w(), 0.0f);
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    /* renamed from: J */
    public static zzbyt m18507J(zzang zzangVar) {
        try {
            return m18510p(zzangVar.getVideoController(), zzangVar.mo16786f(), (View) m18504G(zzangVar.mo16782K()), zzangVar.mo16787g(), zzangVar.mo16791k(), zzangVar.mo16789i(), zzangVar.getExtras(), zzangVar.mo16788h(), (View) m18504G(zzangVar.mo16781I()), zzangVar.mo16790j(), zzangVar.getStore(), zzangVar.mo16793o(), zzangVar.mo16794t(), zzangVar.mo16792n(), zzangVar.mo16795w(), zzangVar.mo16785X3());
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    /* renamed from: O */
    private final synchronized void m18508O(float f2) {
        this.f23834t = f2;
    }

    /* renamed from: Q */
    private final synchronized String m18509Q(String str) {
        return this.f23833s.get(str);
    }

    /* renamed from: p */
    private static zzbyt m18510p(zzaar zzaarVar, zzaea zzaeaVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzaei zzaeiVar, String str6, float f2) {
        zzbyt zzbytVar = new zzbyt();
        zzbytVar.f23815a = 6;
        zzbytVar.f23816b = zzaarVar;
        zzbytVar.f23817c = zzaeaVar;
        zzbytVar.f23818d = view;
        zzbytVar.m18526T("headline", str);
        zzbytVar.f23819e = list;
        zzbytVar.m18526T("body", str2);
        zzbytVar.f23822h = bundle;
        zzbytVar.m18526T("call_to_action", str3);
        zzbytVar.f23826l = view2;
        zzbytVar.f23827m = iObjectWrapper;
        zzbytVar.m18526T(AccountAnalytics.STORE, str4);
        zzbytVar.m18526T("price", str5);
        zzbytVar.f23828n = d2;
        zzbytVar.f23829o = zzaeiVar;
        zzbytVar.m18526T("advertiser", str6);
        zzbytVar.m18508O(f2);
        return zzbytVar;
    }

    /* renamed from: q */
    public static zzbyt m18511q(zzana zzanaVar) {
        try {
            zzaar videoController = zzanaVar.getVideoController();
            zzaea zzaeaVarMo16753f = zzanaVar.mo16753f();
            View view = (View) m18504G(zzanaVar.mo16750K());
            String strMo16754g = zzanaVar.mo16754g();
            List<zzadw> listMo16758k = zzanaVar.mo16758k();
            String strMo16756i = zzanaVar.mo16756i();
            Bundle extras = zzanaVar.getExtras();
            String strMo16755h = zzanaVar.mo16755h();
            View view2 = (View) m18504G(zzanaVar.mo16749I());
            IObjectWrapper iObjectWrapperMo16757j = zzanaVar.mo16757j();
            String store = zzanaVar.getStore();
            String strMo16760o = zzanaVar.mo16760o();
            double dMo16761t = zzanaVar.mo16761t();
            zzaei zzaeiVarMo16759n = zzanaVar.mo16759n();
            zzbyt zzbytVar = new zzbyt();
            zzbytVar.f23815a = 2;
            zzbytVar.f23816b = videoController;
            zzbytVar.f23817c = zzaeaVarMo16753f;
            zzbytVar.f23818d = view;
            zzbytVar.m18526T("headline", strMo16754g);
            zzbytVar.f23819e = listMo16758k;
            zzbytVar.m18526T("body", strMo16756i);
            zzbytVar.f23822h = extras;
            zzbytVar.m18526T("call_to_action", strMo16755h);
            zzbytVar.f23826l = view2;
            zzbytVar.f23827m = iObjectWrapperMo16757j;
            zzbytVar.m18526T(AccountAnalytics.STORE, store);
            zzbytVar.m18526T("price", strMo16760o);
            zzbytVar.f23828n = dMo16761t;
            zzbytVar.f23829o = zzaeiVarMo16759n;
            return zzbytVar;
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    /* renamed from: r */
    public static zzbyt m18512r(zzand zzandVar) {
        try {
            zzaar videoController = zzandVar.getVideoController();
            zzaea zzaeaVarMo16771f = zzandVar.mo16771f();
            View view = (View) m18504G(zzandVar.mo16768K());
            String strMo16772g = zzandVar.mo16772g();
            List<zzadw> listMo16776k = zzandVar.mo16776k();
            String strMo16774i = zzandVar.mo16774i();
            Bundle extras = zzandVar.getExtras();
            String strMo16773h = zzandVar.mo16773h();
            View view2 = (View) m18504G(zzandVar.mo16767I());
            IObjectWrapper iObjectWrapperMo16775j = zzandVar.mo16775j();
            String strMo16777w = zzandVar.mo16777w();
            zzaei zzaeiVarMo16766D0 = zzandVar.mo16766D0();
            zzbyt zzbytVar = new zzbyt();
            zzbytVar.f23815a = 1;
            zzbytVar.f23816b = videoController;
            zzbytVar.f23817c = zzaeaVarMo16771f;
            zzbytVar.f23818d = view;
            zzbytVar.m18526T("headline", strMo16772g);
            zzbytVar.f23819e = listMo16776k;
            zzbytVar.m18526T("body", strMo16774i);
            zzbytVar.f23822h = extras;
            zzbytVar.m18526T("call_to_action", strMo16773h);
            zzbytVar.f23826l = view2;
            zzbytVar.f23827m = iObjectWrapperMo16775j;
            zzbytVar.m18526T("advertiser", strMo16777w);
            zzbytVar.f23830p = zzaeiVarMo16766D0;
            return zzbytVar;
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized zzbgz m18513A() {
        return this.f23823i;
    }

    /* renamed from: B */
    public final synchronized zzbgz m18514B() {
        return this.f23824j;
    }

    /* renamed from: C */
    public final synchronized IObjectWrapper m18515C() {
        return this.f23825k;
    }

    /* renamed from: D */
    public final synchronized C0873g<String, zzadw> m18516D() {
        return this.f23832r;
    }

    /* renamed from: E */
    public final synchronized C0873g<String, String> m18517E() {
        return this.f23833s;
    }

    /* renamed from: F */
    public final synchronized void m18518F(IObjectWrapper iObjectWrapper) {
        this.f23825k = iObjectWrapper;
    }

    /* renamed from: K */
    public final synchronized void m18519K(zzaar zzaarVar) {
        this.f23816b = zzaarVar;
    }

    /* renamed from: L */
    public final synchronized void m18520L(zzaei zzaeiVar) {
        this.f23830p = zzaeiVar;
    }

    /* renamed from: M */
    public final synchronized void m18521M(int i2) {
        this.f23815a = i2;
    }

    /* renamed from: N */
    public final synchronized void m18522N(List<zzabj> list) {
        this.f23820f = list;
    }

    /* renamed from: P */
    public final synchronized void m18523P(String str) {
        this.f23831q = str;
    }

    /* renamed from: R */
    public final synchronized void m18524R(zzbgz zzbgzVar) {
        this.f23823i = zzbgzVar;
    }

    /* renamed from: S */
    public final synchronized void m18525S(zzbgz zzbgzVar) {
        this.f23824j = zzbgzVar;
    }

    /* renamed from: T */
    public final synchronized void m18526T(String str, String str2) {
        if (str2 == null) {
            this.f23833s.remove(str);
        } else {
            this.f23833s.put(str, str2);
        }
    }

    /* renamed from: U */
    public final synchronized zzaei m18527U() {
        return this.f23829o;
    }

    /* renamed from: V */
    public final synchronized zzaea m18528V() {
        return this.f23817c;
    }

    /* renamed from: W */
    public final synchronized IObjectWrapper m18529W() {
        return this.f23827m;
    }

    /* renamed from: X */
    public final synchronized zzaei m18530X() {
        return this.f23830p;
    }

    /* renamed from: Y */
    public final synchronized float m18531Y() {
        return this.f23834t;
    }

    /* renamed from: Z */
    public final synchronized void m18532Z(View view) {
        this.f23826l = view;
    }

    /* renamed from: a */
    public final synchronized void m18533a() {
        zzbgz zzbgzVar = this.f23823i;
        if (zzbgzVar != null) {
            zzbgzVar.destroy();
            this.f23823i = null;
        }
        zzbgz zzbgzVar2 = this.f23824j;
        if (zzbgzVar2 != null) {
            zzbgzVar2.destroy();
            this.f23824j = null;
        }
        this.f23825k = null;
        this.f23832r.clear();
        this.f23833s.clear();
        this.f23816b = null;
        this.f23817c = null;
        this.f23818d = null;
        this.f23819e = null;
        this.f23822h = null;
        this.f23826l = null;
        this.f23827m = null;
        this.f23829o = null;
        this.f23830p = null;
        this.f23831q = null;
    }

    /* renamed from: b */
    public final synchronized String m18534b() {
        return m18509Q("advertiser");
    }

    /* renamed from: c */
    public final synchronized String m18535c() {
        return m18509Q("body");
    }

    /* renamed from: d */
    public final synchronized String m18536d() {
        return m18509Q("call_to_action");
    }

    /* renamed from: e */
    public final synchronized String m18537e() {
        return this.f23831q;
    }

    /* renamed from: f */
    public final synchronized Bundle m18538f() {
        if (this.f23822h == null) {
            this.f23822h = new Bundle();
        }
        return this.f23822h;
    }

    /* renamed from: g */
    public final synchronized String m18539g() {
        return m18509Q("headline");
    }

    /* renamed from: h */
    public final synchronized List<zzadw> m18540h() {
        return this.f23819e;
    }

    /* renamed from: i */
    public final synchronized List<zzabj> m18541i() {
        return this.f23820f;
    }

    /* renamed from: j */
    public final synchronized String m18542j() {
        return m18509Q("price");
    }

    /* renamed from: k */
    public final synchronized double m18543k() {
        return this.f23828n;
    }

    /* renamed from: l */
    public final synchronized String m18544l() {
        return m18509Q(AccountAnalytics.STORE);
    }

    /* renamed from: m */
    public final synchronized zzaar m18545m() {
        return this.f23816b;
    }

    /* renamed from: n */
    public final synchronized void m18546n(List<zzadw> list) {
        this.f23819e = list;
    }

    /* renamed from: o */
    public final synchronized void m18547o(double d2) {
        this.f23828n = d2;
    }

    /* renamed from: s */
    public final synchronized void m18548s(zzabj zzabjVar) {
        this.f23821g = zzabjVar;
    }

    /* renamed from: t */
    public final synchronized void m18549t(zzaea zzaeaVar) {
        this.f23817c = zzaeaVar;
    }

    /* renamed from: u */
    public final synchronized void m18550u(zzaei zzaeiVar) {
        this.f23829o = zzaeiVar;
    }

    /* renamed from: v */
    public final synchronized void m18551v(String str, zzadw zzadwVar) {
        if (zzadwVar == null) {
            this.f23832r.remove(str);
        } else {
            this.f23832r.put(str, zzadwVar);
        }
    }

    /* renamed from: w */
    public final synchronized int m18552w() {
        return this.f23815a;
    }

    /* renamed from: x */
    public final synchronized View m18553x() {
        return this.f23818d;
    }

    /* renamed from: y */
    public final synchronized zzabj m18554y() {
        return this.f23821g;
    }

    /* renamed from: z */
    public final synchronized View m18555z() {
        return this.f23826l;
    }
}
