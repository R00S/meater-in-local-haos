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
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
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
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
@zzard
/* renamed from: com.google.android.gms.internal.ads.bb */
/* loaded from: classes2.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC6519bb extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbgz {

    /* renamed from: A */
    private boolean f18267A;

    /* renamed from: B */
    private String f18268B;

    /* renamed from: C */
    private zzbhq f18269C;

    /* renamed from: D */
    private boolean f18270D;

    /* renamed from: E */
    private boolean f18271E;

    /* renamed from: F */
    private zzadx f18272F;

    /* renamed from: G */
    private zzadv f18273G;

    /* renamed from: H */
    private int f18274H;

    /* renamed from: I */
    private int f18275I;

    /* renamed from: J */
    private zzadg f18276J;

    /* renamed from: K */
    private zzadg f18277K;

    /* renamed from: L */
    private zzadg f18278L;

    /* renamed from: M */
    private zzadh f18279M;

    /* renamed from: N */
    private WeakReference<View.OnClickListener> f18280N;

    /* renamed from: O */
    private com.google.android.gms.ads.internal.overlay.zzd f18281O;

    /* renamed from: P */
    private boolean f18282P;

    /* renamed from: Q */
    private zzazs f18283Q;

    /* renamed from: R */
    private int f18284R;

    /* renamed from: S */
    private int f18285S;

    /* renamed from: T */
    private int f18286T;

    /* renamed from: U */
    private int f18287U;

    /* renamed from: V */
    private Map<String, zzbft> f18288V;

    /* renamed from: W */
    private final WindowManager f18289W;

    /* renamed from: a0 */
    private final zzwj f18290a0;

    /* renamed from: f */
    private final zzbim f18291f;

    /* renamed from: g */
    private final zzdh f18292g;

    /* renamed from: h */
    private final zzbai f18293h;

    /* renamed from: i */
    private final zzj f18294i;

    /* renamed from: j */
    private final com.google.android.gms.ads.internal.zza f18295j;

    /* renamed from: k */
    private final DisplayMetrics f18296k;

    /* renamed from: l */
    private final float f18297l;

    /* renamed from: m */
    private boolean f18298m;

    /* renamed from: n */
    private boolean f18299n;

    /* renamed from: o */
    private zzbha f18300o;

    /* renamed from: p */
    private com.google.android.gms.ads.internal.overlay.zzd f18301p;

    /* renamed from: q */
    private IObjectWrapper f18302q;

    /* renamed from: r */
    private zzbin f18303r;

    /* renamed from: s */
    private String f18304s;

    /* renamed from: t */
    private boolean f18305t;

    /* renamed from: u */
    private boolean f18306u;

    /* renamed from: v */
    private boolean f18307v;

    /* renamed from: w */
    private boolean f18308w;

    /* renamed from: x */
    private Boolean f18309x;

    /* renamed from: y */
    private int f18310y;

    /* renamed from: z */
    private boolean f18311z;

    @VisibleForTesting
    private ViewTreeObserverOnGlobalLayoutListenerC6519bb(zzbim zzbimVar, zzbin zzbinVar, String str, boolean z, boolean z2, zzdh zzdhVar, zzbai zzbaiVar, zzadi zzadiVar, zzj zzjVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar) {
        super(zzbimVar);
        this.f18298m = false;
        this.f18299n = false;
        this.f18311z = true;
        this.f18267A = false;
        this.f18268B = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f18284R = -1;
        this.f18285S = -1;
        this.f18286T = -1;
        this.f18287U = -1;
        this.f18291f = zzbimVar;
        this.f18303r = zzbinVar;
        this.f18304s = str;
        this.f18307v = z;
        this.f18310y = -1;
        this.f18292g = zzdhVar;
        this.f18293h = zzbaiVar;
        this.f18294i = zzjVar;
        this.f18295j = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f18289W = windowManager;
        zzk.zzlg();
        DisplayMetrics displayMetricsM17143b = zzaxi.m17143b(windowManager);
        this.f18296k = displayMetricsM17143b;
        this.f18297l = displayMetricsM17143b.density;
        this.f18290a0 = zzwjVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            zzbad.m17347c("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzk.zzlg().m17179k(zzbimVar, zzbaiVar.f22750f, settings);
        zzk.zzli().mo17200k(getContext(), settings);
        setDownloadListener(this);
        m14858F0();
        if (PlatformVersion.m14640d()) {
            addJavascriptInterface(zzbht.m17713a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f18283Q = new zzazs(this.f18291f.m17734b(), this, this, null);
        m14862J0();
        zzadh zzadhVar = new zzadh(new zzadi(true, "make_wv", this.f18304s));
        this.f18279M = zzadhVar;
        zzadhVar.m16447c().m16449b(zzadiVar);
        zzadg zzadgVarM16441b = zzadb.m16441b(this.f18279M.m16447c());
        this.f18277K = zzadgVarM16441b;
        this.f18279M.m16445a("native:view_create", zzadgVarM16441b);
        this.f18278L = null;
        this.f18276J = null;
        zzk.zzli().mo17201m(zzbimVar);
        zzk.zzlk().m17058o();
    }

    @TargetApi(19)
    /* renamed from: A0 */
    private final synchronized void m14853A0(String str, ValueCallback<String> valueCallback) {
        if (mo14919l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    /* renamed from: B0 */
    static final /* synthetic */ void m14854B0(boolean z, int i2, zzxn zzxnVar) {
        zzwt.zzv.zza zzaVarM20800B = zzwt.zzv.m20800B();
        if (zzaVarM20800B.m20808v() != z) {
            zzaVarM20800B.m20809w(z);
        }
        zzaVarM20800B.m20807u(i2);
        zzxnVar.f27376n = (zzwt.zzv) ((zzdob) zzaVarM20800B.mo19736p0());
    }

    /* renamed from: C0 */
    private final boolean m14855C0() throws JSONException {
        int i2;
        int iM17306k;
        if (!this.f18300o.mo17691m() && !this.f18300o.m17700y()) {
            return false;
        }
        zzyt.m20844a();
        DisplayMetrics displayMetrics = this.f18296k;
        int iM17306k2 = zzazt.m17306k(displayMetrics, displayMetrics.widthPixels);
        zzyt.m20844a();
        DisplayMetrics displayMetrics2 = this.f18296k;
        int iM17306k3 = zzazt.m17306k(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityM17734b = this.f18291f.m17734b();
        if (activityM17734b == null || activityM17734b.getWindow() == null) {
            i2 = iM17306k2;
            iM17306k = iM17306k3;
        } else {
            zzk.zzlg();
            int[] iArrM17135P = zzaxi.m17135P(activityM17734b);
            zzyt.m20844a();
            int iM17306k4 = zzazt.m17306k(this.f18296k, iArrM17135P[0]);
            zzyt.m20844a();
            iM17306k = zzazt.m17306k(this.f18296k, iArrM17135P[1]);
            i2 = iM17306k4;
        }
        int i3 = this.f18285S;
        if (i3 == iM17306k2 && this.f18284R == iM17306k3 && this.f18286T == i2 && this.f18287U == iM17306k) {
            return false;
        }
        boolean z = (i3 == iM17306k2 && this.f18284R == iM17306k3) ? false : true;
        this.f18285S = iM17306k2;
        this.f18284R = iM17306k3;
        this.f18286T = i2;
        this.f18287U = iM17306k;
        new zzaqb(this).m16863c(iM17306k2, iM17306k3, i2, iM17306k, this.f18296k.density, this.f18289W.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: D0 */
    private final synchronized void m14856D0() {
        Boolean boolM17056m = zzk.zzlk().m17056m();
        this.f18309x = boolM17056m;
        if (boolM17056m == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m14873z0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                m14873z0(Boolean.FALSE);
            }
        }
    }

    /* renamed from: E0 */
    private final void m14857E0() {
        zzadb.m16440a(this.f18279M.m16447c(), this.f18277K, "aeh2");
    }

    /* renamed from: F0 */
    private final synchronized void m14858F0() {
        if (!this.f18307v && !this.f18303r.m17741e()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzbad.m17349e("Disabling hardware acceleration on an AdView.");
                m14859G0();
                return;
            } else {
                zzbad.m17349e("Enabling hardware acceleration on an AdView.");
                m14860H0();
                return;
            }
        }
        zzbad.m17349e("Enabling hardware acceleration on an overlay.");
        m14860H0();
    }

    /* renamed from: G0 */
    private final synchronized void m14859G0() {
        if (!this.f18308w) {
            zzk.zzli();
            setLayerType(1, null);
        }
        this.f18308w = true;
    }

    /* renamed from: H0 */
    private final synchronized void m14860H0() {
        if (this.f18308w) {
            zzk.zzli();
            setLayerType(0, null);
        }
        this.f18308w = false;
    }

    /* renamed from: I0 */
    private final synchronized void m14861I0() {
        Map<String, zzbft> map = this.f18288V;
        if (map != null) {
            Iterator<zzbft> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().mo13849c();
            }
        }
        this.f18288V = null;
    }

    /* renamed from: J0 */
    private final void m14862J0() {
        zzadi zzadiVarM16447c;
        zzadh zzadhVar = this.f18279M;
        if (zzadhVar == null || (zzadiVarM16447c = zzadhVar.m16447c()) == null || zzk.zzlk().m17055l() == null) {
            return;
        }
        zzk.zzlk().m17055l().m16437d(zzadiVarM16447c);
    }

    /* renamed from: K0 */
    private final void m14863K0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        mo14940y("onAdVisibilityChanged", map);
    }

    /* renamed from: L0 */
    static ViewTreeObserverOnGlobalLayoutListenerC6519bb m14864L0(Context context, zzbin zzbinVar, String str, boolean z, boolean z2, zzdh zzdhVar, zzbai zzbaiVar, zzadi zzadiVar, zzj zzjVar, com.google.android.gms.ads.internal.zza zzaVar, zzwj zzwjVar) {
        return new ViewTreeObserverOnGlobalLayoutListenerC6519bb(new zzbim(context), zzbinVar, str, z, z2, zzdhVar, zzbaiVar, zzadiVar, zzjVar, zzaVar, zzwjVar);
    }

    /* renamed from: N0 */
    private final synchronized void m14866N0(String str) {
        if (mo14919l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    /* renamed from: O0 */
    private final synchronized void m14867O0(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            zzk.zzlk().m17052e(e2, "AdWebViewImpl.loadUrlUnsafe");
            zzbad.m17348d("Could not call loadUrl. ", e2);
        }
    }

    /* renamed from: P0 */
    private final void m14868P0(String str) {
        if (!PlatformVersion.m14642f()) {
            String strValueOf = String.valueOf(str);
            m14866N0(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
            return;
        }
        if (m14869Q0() == null) {
            m14856D0();
        }
        if (m14869Q0().booleanValue()) {
            m14853A0(str, null);
        } else {
            String strValueOf2 = String.valueOf(str);
            m14866N0(strValueOf2.length() != 0 ? "javascript:".concat(strValueOf2) : new String("javascript:"));
        }
    }

    @VisibleForTesting
    /* renamed from: Q0 */
    private final synchronized Boolean m14869Q0() {
        return this.f18309x;
    }

    /* renamed from: R0 */
    private final synchronized void m14870R0() {
        if (!this.f18282P) {
            this.f18282P = true;
            zzk.zzlk().m17059p();
        }
    }

    @VisibleForTesting
    /* renamed from: z0 */
    private final void m14873z0(Boolean bool) {
        synchronized (this) {
            this.f18309x = bool;
        }
        zzk.zzlk().m17051d(bool);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: A */
    public final synchronized void mo14874A(zzbin zzbinVar) {
        this.f18303r = zzbinVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: B */
    public final void mo14875B(boolean z, int i2) {
        this.f18300o.m17677H(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: C */
    public final void mo14876C() {
        this.f18283Q.m17298e();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: D */
    public final synchronized void mo14877D(zzadv zzadvVar) {
        this.f18273G = zzadvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: E */
    public final synchronized boolean mo14878E() {
        return this.f18305t;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: G */
    public final synchronized void mo14879G(String str, String str2, String str3) {
        if (mo14919l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21695R0)).booleanValue()) {
            str2 = zzbid.m17732b(str2, zzbid.m17731a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: H */
    public final synchronized void mo14880H(IObjectWrapper iObjectWrapper) {
        this.f18302q = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: I */
    public final void mo14881I() {
        if (this.f18278L == null) {
            zzadg zzadgVarM16441b = zzadb.m16441b(this.f18279M.m16447c());
            this.f18278L = zzadgVarM16441b;
            this.f18279M.m16445a("native:view_load", zzadgVarM16441b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: J */
    public final void mo14882J() {
        m14857E0();
        HashMap map = new HashMap(1);
        map.put("version", this.f18293h.f22750f);
        mo14940y("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: K */
    public final synchronized void mo14883K(boolean z) {
        this.f18311z = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: L */
    public final void mo14884L(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.f18300o.m17695s(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: M */
    public final synchronized void mo14885M() {
        zzadv zzadvVar = this.f18273G;
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
        mo14940y("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: P */
    public final zzadg mo14888P() {
        return this.f18277K;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: Q */
    public final synchronized zzadx mo14889Q() {
        return this.f18272F;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: R */
    public final void mo14890R(boolean z, long j2) {
        HashMap map = new HashMap(2);
        map.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, z ? "1" : "0");
        map.put("duration", Long.toString(j2));
        mo14940y("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: S */
    public final synchronized void mo14891S(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVar;
        int i2 = this.f18274H + (z ? 1 : -1);
        this.f18274H = i2;
        if (i2 <= 0 && (zzdVar = this.f18301p) != null) {
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
        Map<String, zzbft> map = this.f18288V;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: W */
    public final void mo14894W(Context context) {
        this.f18291f.setBaseContext(context);
        this.f18283Q.m17297c(this.f18291f.m17734b());
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: Y */
    public final void mo14895Y(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length());
        sb.append(str);
        sb.append("(");
        sb.append(string);
        sb.append(");");
        m14868P0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: Z */
    public final synchronized IObjectWrapper mo14896Z() {
        return this.f18302q;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbhx
    /* renamed from: a */
    public final Activity mo14897a() {
        return this.f18291f.m17734b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: a0 */
    public final synchronized void mo14898a0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f18281O = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbig
    /* renamed from: b */
    public final zzbai mo14899b() {
        return this.f18293h;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: b0 */
    public final void mo14900b0(int i2) {
        if (i2 == 0) {
            zzadb.m16440a(this.f18279M.m16447c(), this.f18277K, "aebb2");
        }
        m14857E0();
        if (this.f18279M.m16447c() != null) {
            this.f18279M.m16447c().m16451d("close_type", String.valueOf(i2));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i2));
        map.put("version", this.f18293h.f22750f);
        mo14940y("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: c */
    public final com.google.android.gms.ads.internal.zza mo14901c() {
        return this.f18295j;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: c0 */
    public final void mo14902c0() {
        if (this.f18276J == null) {
            zzadb.m16440a(this.f18279M.m16447c(), this.f18277K, "aes2");
            zzadg zzadgVarM16441b = zzadb.m16441b(this.f18279M.m16447c());
            this.f18276J = zzadgVarM16441b;
            this.f18279M.m16445a("native:view_show", zzadgVarM16441b);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f18293h.f22750f);
        mo14940y("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbif
    /* renamed from: d */
    public final zzdh mo14903d() {
        return this.f18292g;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: d0 */
    public final Context mo14904d0() {
        return this.f18291f.m17733a();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void destroy() {
        m14862J0();
        this.f18283Q.m17299f();
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.f18301p;
        if (zzdVar != null) {
            zzdVar.close();
            this.f18301p.onDestroy();
            this.f18301p = null;
        }
        this.f18302q = null;
        this.f18300o.m17694p();
        if (this.f18306u) {
            return;
        }
        zzk.zzmc();
        zzbfs.m17619g(this);
        m14861I0();
        this.f18306u = true;
        zzawz.m17082m("Initiating WebView self destruct sequence in 3...");
        zzawz.m17082m("Loading blank page in WebView, 2...");
        m14867O0("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: e */
    public final synchronized void mo14905e(zzbhq zzbhqVar) {
        if (this.f18269C != null) {
            zzbad.m17351g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f18269C = zzbhqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: e0 */
    public final void mo14906e0() {
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!mo14919l()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzbad.m17355k("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: f */
    public final void mo14907f(String str, zzaho<? super zzbgz> zzahoVar) {
        zzbha zzbhaVar = this.f18300o;
        if (zzbhaVar != null) {
            zzbhaVar.m17697v(str, zzahoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: f0 */
    public final int mo14908f0() {
        return getMeasuredHeight();
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f18306u) {
                    this.f18300o.m17694p();
                    zzk.zzmc();
                    zzbfs.m17619g(this);
                    m14861I0();
                    m14870R0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: g */
    public final synchronized void mo14909g(String str, zzbft zzbftVar) {
        if (this.f18288V == null) {
            this.f18288V = new HashMap();
        }
        this.f18288V.put(str, zzbftVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: g0 */
    public final void mo14910g0(boolean z, int i2, String str) {
        this.f18300o.m17698w(z, i2, str);
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
        return this.f18269C;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: h0 */
    public final synchronized void mo14912h0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f18301p = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: i */
    public final void mo14913i(String str, zzaho<? super zzbgz> zzahoVar) {
        zzbha zzbhaVar = this.f18300o;
        if (zzbhaVar != null) {
            zzbhaVar.m17676G(str, zzahoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: i0 */
    public final zzbcw mo14914i0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: j */
    public final void mo14915j(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        zzbad.m17349e(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        m14868P0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: j0 */
    public final synchronized void mo14916j0(boolean z) {
        boolean z2 = z != this.f18307v;
        this.f18307v = z;
        m14858F0();
        if (z2) {
            new zzaqb(this).m16867g(z ? "expanded" : BuildConfig.APTOIDE_THEME);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public final void mo14917k(String str) {
        m14868P0(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: k0 */
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd mo14918k0() {
        return this.f18301p;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: l */
    public final synchronized boolean mo14919l() {
        return this.f18306u;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: l0 */
    public final void mo14920l0() {
        zzawz.m17082m("Cannot add text view to inner AdWebView");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void loadData(String str, String str2, String str3) {
        if (mo14919l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (mo14919l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final synchronized void loadUrl(String str) {
        if (mo14919l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
            zzk.zzlk().m17052e(e2, "AdWebViewImpl.loadUrl");
            zzbad.m17348d("Could not call loadUrl. ", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbhy
    /* renamed from: m */
    public final synchronized boolean mo14921m() {
        return this.f18307v;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: m0 */
    public final synchronized void mo14922m0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.f18301p;
        if (zzdVar != null) {
            zzdVar.zza(this.f18300o.mo17691m(), z);
        } else {
            this.f18305t = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: n */
    public final zzadh mo14923n() {
        return this.f18279M;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: n0 */
    public final synchronized void mo14924n0() {
        zzawz.m17082m("Destroying WebView!");
        m14870R0();
        zzaxi.f22654a.post(new RunnableC6630eb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbie
    /* renamed from: o */
    public final synchronized zzbin mo14925o() {
        return this.f18303r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo14919l()) {
            this.f18283Q.m17295a();
        }
        boolean z = this.f18270D;
        zzbha zzbhaVar = this.f18300o;
        if (zzbhaVar != null && zzbhaVar.m17700y()) {
            if (!this.f18271E) {
                this.f18300o.m17701z();
                this.f18300o.m17673A();
                this.f18271E = true;
            }
            m14855C0();
            z = true;
        }
        m14863K0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzbha zzbhaVar;
        synchronized (this) {
            if (!mo14919l()) {
                this.f18283Q.m17296b();
            }
            super.onDetachedFromWindow();
            if (this.f18271E && (zzbhaVar = this.f18300o) != null && zzbhaVar.m17700y() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f18300o.m17701z();
                this.f18300o.m17673A();
                this.f18271E = false;
            }
        }
        m14863K0(false);
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

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (mo14919l()) {
            return;
        }
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
        boolean zM14855C0 = m14855C0();
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = mo14918k0();
        if (zzdVarMo14918k0 == null || !zM14855C0) {
            return;
        }
        zzdVarMo14918k0.zztk();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int i2, int i3) {
        if (mo14919l()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f18307v && !this.f18303r.m17742f()) {
            if (this.f18303r.m17744h()) {
                super.onMeasure(i2, i3);
                return;
            }
            if (this.f18303r.m17743g()) {
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
            if (this.f18303r.m17740a()) {
                if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21715U2)).booleanValue() && PlatformVersion.m14640d()) {
                    mo14907f("/contentHeight", new C6593db(this));
                    m14868P0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f2 = this.f18296k.density;
                    int size3 = View.MeasureSpec.getSize(i2);
                    int i6 = this.f18275I;
                    setMeasuredDimension(size3, i6 != -1 ? (int) (i6 * f2) : View.MeasureSpec.getSize(i3));
                    return;
                }
                super.onMeasure(i2, i3);
                return;
            }
            if (this.f18303r.m17741e()) {
                DisplayMetrics displayMetrics = this.f18296k;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size5 = View.MeasureSpec.getSize(i3);
            int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i8 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzbin zzbinVar = this.f18303r;
            boolean z = zzbinVar.f23072c > i7 || zzbinVar.f23071b > i8;
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21837n4)).booleanValue()) {
                zzbin zzbinVar2 = this.f18303r;
                float f3 = zzbinVar2.f23072c;
                float f4 = this.f18297l;
                boolean z2 = f3 / f4 <= ((float) i7) / f4 && ((float) zzbinVar2.f23071b) / f4 <= ((float) i8) / f4;
                if (z) {
                    z = z2;
                }
            }
            if (z) {
                float f5 = this.f18303r.f23072c;
                float f6 = this.f18297l;
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append((int) (f5 / f6));
                sb.append("x");
                sb.append((int) (r2.f23071b / f6));
                sb.append(" dp, but only has ");
                sb.append((int) (size4 / f6));
                sb.append("x");
                sb.append((int) (size5 / f6));
                sb.append(" dp.");
                zzbad.m17353i(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (!this.f18298m) {
                    this.f18290a0.m20698b(zzwl.zza.zzb.BANNER_SIZE_INVALID);
                    this.f18298m = true;
                    return;
                }
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f18299n) {
                    this.f18290a0.m20698b(zzwl.zza.zzb.BANNER_SIZE_VALID);
                    this.f18299n = true;
                }
                zzbin zzbinVar3 = this.f18303r;
                setMeasuredDimension(zzbinVar3.f23072c, zzbinVar3.f23071b);
            }
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void onPause() {
        if (mo14919l()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e2) {
            zzbad.m17347c("Could not pause webview.", e2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void onResume() {
        if (mo14919l()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e2) {
            zzbad.m17347c("Could not resume webview.", e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18300o.m17700y()) {
            synchronized (this) {
                zzadx zzadxVar = this.f18272F;
                if (zzadxVar != null) {
                    zzadxVar.mo14949b(motionEvent);
                }
            }
        } else {
            zzdh zzdhVar = this.f18292g;
            if (zzdhVar != null) {
                zzdhVar.m19453c(motionEvent);
            }
        }
        if (mo14919l()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: p */
    public final /* synthetic */ zzbii mo14926p() {
        return this.f18300o;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: p0 */
    public final boolean mo14927p0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: r */
    public final synchronized String mo14928r() {
        return this.f18268B;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final void mo14929r0(zzud zzudVar) {
        boolean z;
        synchronized (this) {
            z = zzudVar.f27144m;
            this.f18270D = z;
        }
        m14863K0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: s */
    public final synchronized boolean mo14930s() {
        return this.f18274H > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: s0 */
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd mo14931s0() {
        return this.f18281O;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18280N = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final synchronized void setRequestedOrientation(int i2) {
        this.f18310y = i2;
        com.google.android.gms.ads.internal.overlay.zzd zzdVar = this.f18301p;
        if (zzdVar != null) {
            zzdVar.setRequestedOrientation(i2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbha) {
            this.f18300o = (zzbha) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo14919l()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            zzbad.m17347c("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: t */
    public final void mo14932t(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        zzbha zzbhaVar = this.f18300o;
        if (zzbhaVar != null) {
            zzbhaVar.m17696u(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: t0 */
    public final synchronized boolean mo14933t0() {
        return this.f18311z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: v */
    public final synchronized String mo14934v() {
        return this.f18304s;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: v0 */
    public final void mo14935v0(boolean z) {
        this.f18300o.m17674E(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: w */
    public final boolean mo14936w(final boolean z, final int i2) {
        destroy();
        this.f18290a0.m20697a(new zzwk(z, i2) { // from class: com.google.android.gms.internal.ads.cb

            /* renamed from: a */
            private final boolean f18432a;

            /* renamed from: b */
            private final int f18433b;

            {
                this.f18432a = z;
                this.f18433b = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            /* renamed from: a */
            public final void mo14971a(zzxn zzxnVar) {
                ViewTreeObserverOnGlobalLayoutListenerC6519bb.m14854B0(this.f18432a, this.f18433b, zzxnVar);
            }
        });
        this.f18290a0.m20698b(zzwl.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: w0 */
    public final void mo14937w0(boolean z, int i2, String str, String str2) {
        this.f18300o.m17699x(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: x */
    public final void mo14938x(boolean z) {
        this.f18300o.m17675F(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: x0 */
    public final synchronized void mo14939x0(zzadx zzadxVar) {
        this.f18272F = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: y */
    public final void mo14940y(String str, Map<String, ?> map) {
        try {
            mo14915j(str, zzk.zzlg().m17176Y(map));
        } catch (JSONException unused) {
            zzbad.m17353i("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: z */
    public final WebViewClient mo14941z() {
        return this.f18300o;
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final synchronized void zzlc() {
        this.f18267A = true;
        zzj zzjVar = this.f18294i;
        if (zzjVar != null) {
            zzjVar.zzlc();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final synchronized void zzld() {
        this.f18267A = false;
        zzj zzjVar = this.f18294i;
        if (zzjVar != null) {
            zzjVar.zzld();
        }
    }
}
