package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
@zzard
/* renamed from: com.google.android.gms.internal.ads.ob */
/* loaded from: classes2.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC7000ob extends zzbjb implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzajq, zzbgz {

    /* renamed from: A */
    private zzbhq f20147A;

    /* renamed from: B */
    private boolean f20148B;

    /* renamed from: C */
    private boolean f20149C;

    /* renamed from: D */
    private zzadx f20150D;

    /* renamed from: E */
    private zzadv f20151E;

    /* renamed from: F */
    private int f20152F;

    /* renamed from: G */
    private int f20153G;

    /* renamed from: H */
    private zzadg f20154H;

    /* renamed from: I */
    private zzadg f20155I;

    /* renamed from: J */
    private zzadg f20156J;

    /* renamed from: K */
    private zzadh f20157K;

    /* renamed from: L */
    private WeakReference<View.OnClickListener> f20158L;

    /* renamed from: M */
    private com.google.android.gms.ads.internal.overlay.zzd f20159M;

    /* renamed from: N */
    private zzazs f20160N;

    /* renamed from: O */
    private final AtomicReference<IObjectWrapper> f20161O;

    /* renamed from: P */
    private int f20162P;

    /* renamed from: Q */
    private int f20163Q;

    /* renamed from: R */
    private int f20164R;

    /* renamed from: S */
    private int f20165S;

    /* renamed from: T */
    private Map<String, zzbft> f20166T;

    /* renamed from: U */
    private final WindowManager f20167U;

    /* renamed from: i */
    private final zzbim f20168i;

    /* renamed from: j */
    private final zzbio f20169j;

    /* renamed from: k */
    private final zzdh f20170k;

    /* renamed from: l */
    private final zzbai f20171l;

    /* renamed from: m */
    private final zzj f20172m;

    /* renamed from: n */
    private final com.google.android.gms.ads.internal.zza f20173n;

    /* renamed from: o */
    private final DisplayMetrics f20174o;

    /* renamed from: p */
    private final zzwj f20175p;

    /* renamed from: q */
    private com.google.android.gms.ads.internal.overlay.zzd f20176q;

    /* renamed from: r */
    private zzbin f20177r;

    /* renamed from: s */
    private String f20178s;

    /* renamed from: t */
    private boolean f20179t;

    /* renamed from: u */
    private boolean f20180u;

    /* renamed from: v */
    private boolean f20181v;

    /* renamed from: w */
    private int f20182w;

    /* renamed from: x */
    private boolean f20183x;

    /* renamed from: y */
    private boolean f20184y;

    /* renamed from: z */
    private String f20185z;

    @VisibleForTesting
    protected ViewTreeObserverOnGlobalLayoutListenerC7000ob(zzbim zzbimVar, zzbio zzbioVar, zzbin zzbinVar, String str, boolean z, boolean z2, zzdh zzdhVar, zzbai zzbaiVar, zzadi zzadiVar, zzj zzjVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar) {
        super(zzbimVar, zzbioVar);
        this.f20183x = true;
        this.f20184y = false;
        this.f20185z = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f20161O = new AtomicReference<>();
        this.f20162P = -1;
        this.f20163Q = -1;
        this.f20164R = -1;
        this.f20165S = -1;
        this.f20168i = zzbimVar;
        this.f20169j = zzbioVar;
        this.f20177r = zzbinVar;
        this.f20178s = str;
        this.f20180u = z;
        this.f20182w = -1;
        this.f20170k = zzdhVar;
        this.f20171l = zzbaiVar;
        this.f20172m = zzjVar;
        this.f20173n = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f20167U = windowManager;
        zzk.zzlg();
        this.f20174o = zzaxi.m17143b(windowManager);
        this.f20175p = zzwjVar;
        this.f20160N = new zzazs(zzbimVar.m17734b(), this, this, null);
        zzk.zzlg().m17179k(zzbimVar, zzbaiVar.f22750f, getSettings());
        setDownloadListener(this);
        m15679G0();
        if (PlatformVersion.m14640d()) {
            addJavascriptInterface(zzbht.m17713a(this), "googleAdsJsInterface");
        }
        m15683K0();
        zzadh zzadhVar = new zzadh(new zzadi(true, "make_wv", this.f20178s));
        this.f20157K = zzadhVar;
        zzadhVar.m16447c().m16449b(zzadiVar);
        zzadg zzadgVarM16441b = zzadb.m16441b(this.f20157K.m16447c());
        this.f20155I = zzadgVarM16441b;
        this.f20157K.m16445a("native:view_create", zzadgVarM16441b);
        this.f20156J = null;
        this.f20154H = null;
        zzk.zzli().mo17201m(zzbimVar);
    }

    /* renamed from: D0 */
    static final /* synthetic */ void m15676D0(boolean z, int i2, zzxn zzxnVar) {
        zzwt.zzv.zza zzaVarM20800B = zzwt.zzv.m20800B();
        if (zzaVarM20800B.m20808v() != z) {
            zzaVarM20800B.m20809w(z);
        }
        zzaVarM20800B.m20807u(i2);
        zzxnVar.f27376n = (zzwt.zzv) ((zzdob) zzaVarM20800B.mo19736p0());
    }

    /* renamed from: E0 */
    private final boolean m15677E0() throws JSONException {
        int i2;
        int iM17306k;
        if (!this.f20169j.mo17691m() && !this.f20169j.m17756E()) {
            return false;
        }
        zzyt.m20844a();
        DisplayMetrics displayMetrics = this.f20174o;
        int iM17306k2 = zzazt.m17306k(displayMetrics, displayMetrics.widthPixels);
        zzyt.m20844a();
        DisplayMetrics displayMetrics2 = this.f20174o;
        int iM17306k3 = zzazt.m17306k(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityM17734b = this.f20168i.m17734b();
        if (activityM17734b == null || activityM17734b.getWindow() == null) {
            i2 = iM17306k2;
            iM17306k = iM17306k3;
        } else {
            zzk.zzlg();
            int[] iArrM17135P = zzaxi.m17135P(activityM17734b);
            zzyt.m20844a();
            int iM17306k4 = zzazt.m17306k(this.f20174o, iArrM17135P[0]);
            zzyt.m20844a();
            iM17306k = zzazt.m17306k(this.f20174o, iArrM17135P[1]);
            i2 = iM17306k4;
        }
        int i3 = this.f20163Q;
        if (i3 == iM17306k2 && this.f20162P == iM17306k3 && this.f20164R == i2 && this.f20165S == iM17306k) {
            return false;
        }
        boolean z = (i3 == iM17306k2 && this.f20162P == iM17306k3) ? false : true;
        this.f20163Q = iM17306k2;
        this.f20162P = iM17306k3;
        this.f20164R = i2;
        this.f20165S = iM17306k;
        new zzaqb(this).m16863c(iM17306k2, iM17306k3, i2, iM17306k, this.f20174o.density, this.f20167U.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: F0 */
    private final void m15678F0() {
        zzadb.m16440a(this.f20157K.m16447c(), this.f20155I, "aeh2");
    }

    /* renamed from: G0 */
    private final synchronized void m15679G0() {
        if (!this.f20180u && !this.f20177r.m17741e()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzbad.m17349e("Disabling hardware acceleration on an AdView.");
                m15680H0();
                return;
            } else {
                zzbad.m17349e("Enabling hardware acceleration on an AdView.");
                m15681I0();
                return;
            }
        }
        zzbad.m17349e("Enabling hardware acceleration on an overlay.");
        m15681I0();
    }

    /* renamed from: H0 */
    private final synchronized void m15680H0() {
        if (!this.f20181v) {
            zzk.zzli();
            setLayerType(1, null);
        }
        this.f20181v = true;
    }

    /* renamed from: I0 */
    private final synchronized void m15681I0() {
        if (this.f20181v) {
            zzk.zzli();
            setLayerType(0, null);
        }
        this.f20181v = false;
    }

    /* renamed from: J0 */
    private final synchronized void m15682J0() {
        Map<String, zzbft> map = this.f20166T;
        if (map != null) {
            Iterator<zzbft> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().mo13849c();
            }
        }
        this.f20166T = null;
    }

    /* renamed from: K0 */
    private final void m15683K0() {
        zzadi zzadiVarM16447c;
        zzadh zzadhVar = this.f20157K;
        if (zzadhVar == null || (zzadiVarM16447c = zzadhVar.m16447c()) == null || zzk.zzlk().m17055l() == null) {
            return;
        }
        zzk.zzlk().m17055l().m16437d(zzadiVarM16447c);
    }

    /* renamed from: L0 */
    private final void m15684L0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        zzajr.m16611b(this, "onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: A */
    public final synchronized void mo14874A(zzbin zzbinVar) {
        this.f20177r = zzbinVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: B */
    public final void mo14875B(boolean z, int i2) {
        this.f20169j.m17762N(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: C */
    public final void mo14876C() {
        this.f20160N.m17298e();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: D */
    public final synchronized void mo14877D(zzadv zzadvVar) {
        this.f20151E = zzadvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: E */
    public final synchronized boolean mo14878E() {
        return this.f20179t;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: G */
    public final synchronized void mo14879G(String str, String str2, String str3) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21695R0)).booleanValue()) {
            str2 = zzbid.m17732b(str2, zzbid.m17731a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: H */
    public final void mo14880H(IObjectWrapper iObjectWrapper) {
        this.f20161O.set(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: I */
    public final void mo14881I() {
        if (this.f20156J == null) {
            zzadg zzadgVarM16441b = zzadb.m16441b(this.f20157K.m16447c());
            this.f20156J = zzadgVarM16441b;
            this.f20157K.m16445a("native:view_load", zzadgVarM16441b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: J */
    public final void mo14882J() {
        m15678F0();
        HashMap map = new HashMap(1);
        map.put("version", this.f20171l.f22750f);
        zzajr.m16611b(this, "onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: K */
    public final synchronized void mo14883K(boolean z) {
        this.f20183x = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: L */
    public final void mo14884L(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.f20169j.m17765x(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: M */
    public final synchronized void mo14885M() {
        zzadv zzadvVar = this.f20151E;
        if (zzadvVar != null) {
            zzadvVar.mo16467p5();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: N */
    public final void mo14886N() {
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = mo14918k0();
        if (zzdVarMo14918k0 != null) {
            zzdVarMo14918k0.zztm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: O */
    public final void mo14887O() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzk.zzll().m17217e()));
        map.put("app_volume", String.valueOf(zzk.zzll().m17216d()));
        map.put("device_volume", String.valueOf(zzaya.m17212c(getContext())));
        zzajr.m16611b(this, "volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: P */
    public final zzadg mo14888P() {
        return this.f20155I;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: Q */
    public final synchronized zzadx mo14889Q() {
        return this.f20150D;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: R */
    public final void mo14890R(boolean z, long j2) {
        HashMap map = new HashMap(2);
        map.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, z ? "1" : "0");
        map.put("duration", Long.toString(j2));
        zzajr.m16611b(this, "onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: S */
    public final synchronized void mo14891S(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVar;
        int i2 = this.f20152F + (z ? 1 : -1);
        this.f20152F = i2;
        if (i2 <= 0 && (zzdVar = this.f20176q) != null) {
            zzdVar.zztn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: U */
    public final int mo14892U() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: V */
    public final synchronized zzbft mo14893V(String str) {
        Map<String, zzbft> map = this.f20166T;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: W */
    public final void mo14894W(Context context) {
        this.f20168i.setBaseContext(context);
        this.f20160N.m17297c(this.f20168i.m17734b());
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

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: Z */
    public final IObjectWrapper mo14896Z() {
        return this.f20161O.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbhx
    /* renamed from: a */
    public final Activity mo14897a() {
        return this.f20168i.m17734b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: a0 */
    public final synchronized void mo14898a0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f20159M = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbig
    /* renamed from: b */
    public final zzbai mo14899b() {
        return this.f20171l;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: b0 */
    public final void mo14900b0(int i2) {
        if (i2 == 0) {
            zzadb.m16440a(this.f20157K.m16447c(), this.f20155I, "aebb2");
        }
        m15678F0();
        if (this.f20157K.m16447c() != null) {
            this.f20157K.m16447c().m16451d("close_type", String.valueOf(i2));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i2));
        map.put("version", this.f20171l.f22750f);
        zzajr.m16611b(this, "onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: c */
    public final com.google.android.gms.ads.internal.zza mo14901c() {
        return this.f20173n;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: c0 */
    public final void mo14902c0() {
        if (this.f20154H == null) {
            zzadb.m16440a(this.f20157K.m16447c(), this.f20155I, "aes2");
            zzadg zzadgVarM16441b = zzadb.m16441b(this.f20157K.m16447c());
            this.f20154H = zzadgVarM16441b;
            this.f20157K.m16445a("native:view_show", zzadgVarM16441b);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f20171l.f22750f);
        zzajr.m16611b(this, "onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbif
    /* renamed from: d */
    public final zzdh mo14903d() {
        return this.f20170k;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: d0 */
    public final Context mo14904d0() {
        return this.f20168i.m17733a();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: e */
    public final synchronized void mo14905e(zzbhq zzbhqVar) {
        if (this.f20147A != null) {
            zzbad.m17351g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f20147A = zzbhqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: e0 */
    public final void mo14906e0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: f */
    public final void mo14907f(String str, zzaho<? super zzbgz> zzahoVar) {
        zzbio zzbioVar = this.f20169j;
        if (zzbioVar != null) {
            zzbioVar.m17753B(str, zzahoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: f0 */
    public final int mo14908f0() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: g */
    public final synchronized void mo14909g(String str, zzbft zzbftVar) {
        if (this.f20166T == null) {
            this.f20166T = new HashMap();
        }
        this.f20166T.put(str, zzbftVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: g0 */
    public final void mo14910g0(boolean z, int i2, String str) {
        this.f20169j.m17754C(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbih
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: h */
    public final synchronized zzbhq mo14911h() {
        return this.f20147A;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: h0 */
    public final synchronized void mo14912h0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f20176q = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: i */
    public final void mo14913i(String str, zzaho<? super zzbgz> zzahoVar) {
        zzbio zzbioVar = this.f20169j;
        if (zzbioVar != null) {
            zzbioVar.m17761M(str, zzahoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: i0 */
    public final zzbcw mo14914i0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaji
    /* renamed from: j */
    public final void mo14915j(String str, JSONObject jSONObject) {
        zzajr.m16613d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: j0 */
    public final synchronized void mo14916j0(boolean z) {
        boolean z2 = z != this.f20180u;
        this.f20180u = z;
        m15679G0();
        if (z2) {
            new zzaqb(this).m16867g(z ? "expanded" : BuildConfig.APTOIDE_THEME);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, com.google.android.gms.internal.ads.C7111rb, com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public final synchronized void mo14917k(String str) {
        if (m17770l()) {
            zzbad.m17353i("The webview is destroyed. Ignoring action.");
        } else {
            super.mo14917k(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: k0 */
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd mo14918k0() {
        return this.f20176q;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: l0 */
    public final void mo14920l0() {
        zzawz.m17082m("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbhy
    /* renamed from: m */
    public final synchronized boolean mo14921m() {
        return this.f20180u;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: m0 */
    public final synchronized void mo14922m0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.f20176q;
        if (zzdVar != null) {
            zzdVar.zza(this.f20169j.mo17691m(), z);
        } else {
            this.f20179t = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: n */
    public final zzadh mo14923n() {
        return this.f20157K;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, com.google.android.gms.internal.ads.zzbgz
    /* renamed from: n0 */
    public final void mo14924n0() {
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbie
    /* renamed from: o */
    public final synchronized zzbin mo14925o() {
        return this.f20177r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!m17770l()) {
            this.f20160N.m17295a();
        }
        boolean z = this.f20148B;
        zzbio zzbioVar = this.f20169j;
        if (zzbioVar != null && zzbioVar.m17756E()) {
            if (!this.f20149C) {
                this.f20169j.m17757F();
                this.f20169j.m17758G();
                this.f20149C = true;
            }
            m15677E0();
            z = true;
        }
        m15684L0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzbio zzbioVar;
        synchronized (this) {
            if (!m17770l()) {
                this.f20160N.m17296b();
            }
            super.onDetachedFromWindow();
            if (this.f20149C && (zzbioVar = this.f20169j) != null && zzbioVar.m17756E() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f20169j.m17757F();
                this.f20169j.m17758G();
                this.f20149C = false;
            }
        }
        m15684L0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzk.zzlg();
            zzaxi.m17155i(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzbad.m17349e(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zM15677E0 = m15677E0();
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = mo14918k0();
        if (zzdVarMo14918k0 == null || !zM15677E0) {
            return;
        }
        zzdVarMo14918k0.zztk();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int i2, int i3) {
        if (m17770l()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f20180u && !this.f20177r.m17742f()) {
            if (this.f20177r.m17744h()) {
                super.onMeasure(i2, i3);
                return;
            }
            if (this.f20177r.m17743g()) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21697R2)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                zzbhq zzbhqVarMo14911h = mo14911h();
                float fMo16195T = zzbhqVarMo14911h != null ? zzbhqVarMo14911h.mo16195T() : 0.0f;
                if (fMo16195T == 0.0f) {
                    super.onMeasure(i2, i3);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                int i4 = (int) (size2 * fMo16195T);
                int i5 = (int) (size / fMo16195T);
                if (size2 == 0 && i5 != 0) {
                    i4 = (int) (i5 * fMo16195T);
                    size2 = i5;
                } else if (size == 0 && i4 != 0) {
                    i5 = (int) (i4 / fMo16195T);
                    size = i4;
                }
                setMeasuredDimension(Math.min(i4, size), Math.min(i5, size2));
                return;
            }
            if (this.f20177r.m17740a()) {
                if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21715U2)).booleanValue() && PlatformVersion.m14640d()) {
                    mo14907f("/contentHeight", new C7074qb(this));
                    mo14917k("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    int size3 = View.MeasureSpec.getSize(i2);
                    int i6 = this.f20153G;
                    setMeasuredDimension(size3, i6 != -1 ? (int) (i6 * this.f20174o.density) : View.MeasureSpec.getSize(i3));
                    return;
                }
                super.onMeasure(i2, i3);
                return;
            }
            if (this.f20177r.m17741e()) {
                DisplayMetrics displayMetrics = this.f20174o;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size5 = View.MeasureSpec.getSize(i3);
            int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i8 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzbin zzbinVar = this.f20177r;
            boolean z = true;
            boolean z2 = zzbinVar.f23072c > i7 || zzbinVar.f23071b > i8;
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21837n4)).booleanValue()) {
                float f2 = this.f20177r.f23072c;
                float f3 = this.f20174o.density;
                if (f2 / f3 > i7 / f3 || r3.f23071b / f3 > i8 / f3) {
                    z = false;
                }
                if (z2) {
                    z2 = z;
                }
            }
            if (!z2) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                zzbin zzbinVar2 = this.f20177r;
                setMeasuredDimension(zzbinVar2.f23072c, zzbinVar2.f23071b);
                return;
            }
            float f4 = this.f20177r.f23072c;
            float f5 = this.f20174o.density;
            StringBuilder sb = new StringBuilder(103);
            sb.append("Not enough space to show ad. Needs ");
            sb.append((int) (f4 / f5));
            sb.append("x");
            sb.append((int) (r2.f23071b / f5));
            sb.append(" dp, but only has ");
            sb.append((int) (size4 / f5));
            sb.append("x");
            sb.append((int) (size5 / f5));
            sb.append(" dp.");
            zzbad.m17353i(sb.toString());
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e2) {
            zzbad.m17347c("Could not pause webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            zzbad.m17347c("Could not resume webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20169j.m17756E()) {
            synchronized (this) {
                zzadx zzadxVar = this.f20150D;
                if (zzadxVar != null) {
                    zzadxVar.mo14949b(motionEvent);
                }
            }
        } else {
            zzdh zzdhVar = this.f20170k;
            if (zzdhVar != null) {
                zzdhVar.m19453c(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: p */
    public final /* synthetic */ zzbii mo14926p() {
        return this.f20169j;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: p0 */
    public final boolean mo14927p0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: r */
    public final synchronized String mo14928r() {
        return this.f20185z;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final void mo14929r0(zzud zzudVar) {
        boolean z;
        synchronized (this) {
            z = zzudVar.f27144m;
            this.f20148B = z;
        }
        m15684L0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: s */
    public final synchronized boolean mo14930s() {
        return this.f20152F > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: s0 */
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd mo14931s0() {
        return this.f20159M;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f20158L = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void setRequestedOrientation(int i2) {
        this.f20182w = i2;
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.f20176q;
        if (zzdVar != null) {
            zzdVar.setRequestedOrientation(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebView
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            zzbad.m17347c("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: t */
    public final void mo14932t(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        zzbio zzbioVar = this.f20169j;
        if (zzbioVar != null) {
            zzbioVar.m17752A(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: t0 */
    public final synchronized boolean mo14933t0() {
        return this.f20183x;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: v */
    public final synchronized String mo14934v() {
        return this.f20178s;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: v0 */
    public final void mo14935v0(boolean z) {
        this.f20169j.m17759K(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: w */
    public final boolean mo14936w(final boolean z, final int i2) {
        destroy();
        this.f20175p.m20697a(new zzwk(z, i2) { // from class: com.google.android.gms.internal.ads.pb

            /* renamed from: a */
            private final boolean f20291a;

            /* renamed from: b */
            private final int f20292b;

            {
                this.f20291a = z;
                this.f20292b = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            /* renamed from: a */
            public final void mo14971a(zzxn zzxnVar) {
                ViewTreeObserverOnGlobalLayoutListenerC7000ob.m15676D0(this.f20291a, this.f20292b, zzxnVar);
            }
        });
        this.f20175p.m20698b(zzwl.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: w0 */
    public final void mo14937w0(boolean z, int i2, String str, String str2) {
        this.f20169j.m17755D(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: x */
    public final void mo14938x(boolean z) {
        this.f20169j.m17760L(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: x0 */
    public final synchronized void mo14939x0(zzadx zzadxVar) {
        this.f20150D = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: y */
    public final void mo14940y(String str, Map map) {
        zzajr.m16611b(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: z */
    public final WebViewClient mo14941z() {
        return this.f20169j;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    /* renamed from: z0 */
    protected final synchronized void mo15686z0(boolean z) {
        if (z) {
            this.f20161O.set(null);
            this.f20169j.m17764u();
            zzk.zzmc();
            zzbfs.m17619g(this);
            m15682J0();
        } else {
            m15683K0();
            this.f20160N.m17299f();
            com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.f20176q;
            if (zzdVar != null) {
                zzdVar.close();
                this.f20176q.onDestroy();
                this.f20176q = null;
            }
            this.f20161O.set(null);
            this.f20169j.m17764u();
            zzk.zzmc();
            zzbfs.m17619g(this);
            m15682J0();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final synchronized void zzlc() {
        this.f20184y = true;
        zzj zzjVar = this.f20172m;
        if (zzjVar != null) {
            zzjVar.zzlc();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final synchronized void zzld() {
        this.f20184y = false;
        zzj zzjVar = this.f20172m;
        if (zzjVar != null) {
            zzjVar.zzld();
        }
    }
}
