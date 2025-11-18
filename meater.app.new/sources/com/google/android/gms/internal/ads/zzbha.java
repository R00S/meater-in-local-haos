package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.C0311u;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import okhttp3.internal.p454ws.WebSocketProtocol;

@VisibleForTesting
@zzard
/* loaded from: classes2.dex */
public class zzbha extends WebViewClient implements zzbii {

    /* renamed from: a */
    private static final String[] f23020a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f23021b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private View.OnAttachStateChangeListener f23022A;

    /* renamed from: c */
    protected zzbgz f23023c;

    /* renamed from: d */
    private final zzwj f23024d;

    /* renamed from: e */
    private final HashMap<String, List<zzaho<? super zzbgz>>> f23025e;

    /* renamed from: f */
    private final Object f23026f;

    /* renamed from: g */
    private zzxr f23027g;

    /* renamed from: h */
    private com.google.android.gms.ads.internal.overlay.zzo f23028h;

    /* renamed from: i */
    private zzbij f23029i;

    /* renamed from: j */
    private zzbik f23030j;

    /* renamed from: k */
    private zzagv f23031k;

    /* renamed from: l */
    private zzagx f23032l;

    /* renamed from: m */
    private zzbil f23033m;

    /* renamed from: n */
    private boolean f23034n;

    /* renamed from: o */
    private boolean f23035o;

    /* renamed from: p */
    private boolean f23036p;

    /* renamed from: q */
    private boolean f23037q;

    /* renamed from: r */
    private com.google.android.gms.ads.internal.overlay.zzu f23038r;

    /* renamed from: s */
    private final zzaqa f23039s;

    /* renamed from: t */
    private com.google.android.gms.ads.internal.zzb f23040t;

    /* renamed from: u */
    private zzapr f23041u;

    /* renamed from: v */
    protected zzavb f23042v;

    /* renamed from: w */
    private boolean f23043w;

    /* renamed from: x */
    private boolean f23044x;

    /* renamed from: y */
    private int f23045y;

    /* renamed from: z */
    private boolean f23046z;

    public zzbha(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        this(zzbgzVar, zzwjVar, z, new zzaqa(zzbgzVar, zzbgzVar.mo14904d0(), new zzacf(zzbgzVar.getContext())), null);
    }

    /* renamed from: B */
    private final void m17665B() {
        if (this.f23022A == null) {
            return;
        }
        this.f23023c.getView().removeOnAttachStateChangeListener(this.f23022A);
    }

    /* renamed from: C */
    private final void m17666C() {
        zzbij zzbijVar = this.f23029i;
        if (zzbijVar != null && ((this.f23043w && this.f23045y <= 0) || this.f23044x)) {
            zzbijVar.zzae(!this.f23044x);
            this.f23029i = null;
        }
        this.f23023c.mo14881I();
    }

    /* renamed from: D */
    private static WebResourceResponse m17667D() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21707T0)).booleanValue()) {
            return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        com.google.android.gms.ads.internal.zzk.zzlg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        return com.google.android.gms.internal.ads.zzaxi.m17133M(r2);
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse m17668J(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbha.m17668J(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m17669K(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f21720V1
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r0 = r1.m16421c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "err"
            r5.putString(r0, r9)
            java.lang.String r9 = "code"
            r5.putString(r9, r10)
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto L37
            android.net.Uri r9 = android.net.Uri.parse(r11)
            java.lang.String r10 = r9.getHost()
            if (r10 == 0) goto L37
            java.lang.String r9 = r9.getHost()
            goto L39
        L37:
            java.lang.String r9 = ""
        L39:
            java.lang.String r10 = "host"
            r5.putString(r10, r9)
            com.google.android.gms.internal.ads.zzaxi r1 = com.google.android.gms.ads.internal.zzk.zzlg()
            com.google.android.gms.internal.ads.zzbgz r9 = r7.f23023c
            com.google.android.gms.internal.ads.zzbai r9 = r9.mo14899b()
            java.lang.String r3 = r9.f22750f
            r6 = 1
            java.lang.String r4 = "gmob-apps"
            r2 = r8
            r1.m17180l(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbha.m17669K(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m17670q(View view, zzavb zzavbVar, int i2) {
        if (!zzavbVar.mo16975g() || i2 <= 0) {
            return;
        }
        zzavbVar.mo16974f(view);
        if (zzavbVar.mo16975g()) {
            zzaxi.f22654a.postDelayed(new RunnableC7221ua(this, view, zzavbVar, i2), 100L);
        }
    }

    /* renamed from: r */
    private final void m17671r(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzapr zzaprVar = this.f23041u;
        boolean zM16841k = zzaprVar != null ? zzaprVar.m16841k() : false;
        zzk.zzlf();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.f23023c.getContext(), adOverlayInfoParcel, !zM16841k);
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzcVar = adOverlayInfoParcel.zzdkl) != null) {
                str = zzcVar.url;
            }
            zzavbVar.mo16970b(str);
        }
    }

    /* renamed from: A */
    public final ViewTreeObserver.OnScrollChangedListener m17673A() {
        synchronized (this.f23026f) {
        }
        return null;
    }

    /* renamed from: E */
    public final void m17674E(boolean z) {
        this.f23034n = z;
    }

    /* renamed from: F */
    public final void m17675F(boolean z) {
        this.f23046z = z;
    }

    /* renamed from: G */
    public final void m17676G(String str, zzaho<? super zzbgz> zzahoVar) {
        synchronized (this.f23026f) {
            List<zzaho<? super zzbgz>> list = this.f23025e.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzahoVar);
        }
    }

    /* renamed from: H */
    public final void m17677H(boolean z, int i2) {
        zzxr zzxrVar = (!this.f23023c.mo14921m() || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f23028h;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23038r;
        zzbgz zzbgzVar = this.f23023c;
        m17671r(new AdOverlayInfoParcel(zzxrVar, zzoVar, zzuVar, zzbgzVar, z, i2, zzbgzVar.mo14899b()));
    }

    /* renamed from: I */
    protected final WebResourceResponse m17678I(String str, Map<String, String> map) {
        zzvs zzvsVarM20672d;
        try {
            String strM17021c = zzavx.m17021c(str, this.f23023c.getContext(), this.f23046z);
            if (!strM17021c.equals(str)) {
                return m17668J(strM17021c, map);
            }
            zzvv zzvvVarM20678y = zzvv.m20678y(str);
            if (zzvvVarM20678y != null && (zzvsVarM20672d = zzk.zzlm().m20672d(zzvvVarM20678y)) != null && zzvsVarM20672d.m20675y()) {
                return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, zzvsVarM20672d.m20676z());
            }
            if (!zzazx.m17324a()) {
                return null;
            }
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21648J1)).booleanValue()) {
                return m17668J(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            zzk.zzlk().m17052e(e2, "AdWebViewClient.interceptRequest");
            return m17667D();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: a */
    public final void mo17679a(Uri uri) {
        String path = uri.getPath();
        List<zzaho<? super zzbgz>> list = this.f23025e.get(path);
        if (list == null) {
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(strValueOf);
            zzawz.m17082m(sb.toString());
            return;
        }
        zzk.zzlg();
        Map<String, String> mapM17139X = zzaxi.m17139X(uri);
        if (zzbad.m17345a(2)) {
            String strValueOf2 = String.valueOf(path);
            zzawz.m17082m(strValueOf2.length() != 0 ? "Received GMSG: ".concat(strValueOf2) : new String("Received GMSG: "));
            for (String str : mapM17139X.keySet()) {
                String str2 = mapM17139X.get(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
                sb2.append("  ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                zzawz.m17082m(sb2.toString());
            }
        }
        Iterator<zzaho<? super zzbgz>> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo14739a(this.f23023c, mapM17139X);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: b */
    public final void mo17680b(boolean z) {
        synchronized (this.f23026f) {
            this.f23036p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: c */
    public final void mo17681c(zzxr zzxrVar, zzagv zzagvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagx zzagxVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar, boolean z, zzahp zzahpVar, com.google.android.gms.ads.internal.zzb zzbVar, zzaqc zzaqcVar, zzavb zzavbVar) {
        if (zzbVar == null) {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.f23023c.getContext(), zzavbVar, null);
        }
        this.f23041u = new zzapr(this.f23023c, zzaqcVar);
        this.f23042v = zzavbVar;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21764c1)).booleanValue()) {
            m17697v("/adMetadata", new zzagu(zzagvVar));
        }
        m17697v("/appEvent", new zzagw(zzagxVar));
        m17697v("/backButton", zzagz.f22026j);
        m17697v("/refresh", zzagz.f22027k);
        m17697v("/canOpenURLs", zzagz.f22017a);
        m17697v("/canOpenIntents", zzagz.f22018b);
        m17697v("/click", zzagz.f22019c);
        m17697v("/close", zzagz.f22020d);
        m17697v("/customClose", zzagz.f22021e);
        m17697v("/instrument", zzagz.f22030n);
        m17697v("/delayPageLoaded", zzagz.f22032p);
        m17697v("/delayPageClosed", zzagz.f22033q);
        m17697v("/getLocationInfo", zzagz.f22034r);
        m17697v("/httpTrack", zzagz.f22022f);
        m17697v("/log", zzagz.f22023g);
        m17697v("/mraid", new zzahr(zzbVar, this.f23041u, zzaqcVar));
        m17697v("/mraidLoaded", this.f23039s);
        m17697v("/open", new zzahs(zzbVar, this.f23041u));
        m17697v("/precache", new zzbgc());
        m17697v("/touch", zzagz.f22025i);
        m17697v("/video", zzagz.f22028l);
        m17697v("/videoMeta", zzagz.f22029m);
        if (zzk.zzme().m17002D(this.f23023c.getContext())) {
            m17697v("/logScionEvent", new zzahq(this.f23023c.getContext()));
        }
        this.f23027g = zzxrVar;
        this.f23028h = zzoVar;
        this.f23031k = zzagvVar;
        this.f23032l = zzagxVar;
        this.f23038r = zzuVar;
        this.f23040t = zzbVar;
        this.f23034n = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: d */
    public final void mo17682d() {
        synchronized (this.f23026f) {
            this.f23034n = false;
            this.f23035o = true;
            zzbbm.f22757a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ta

                /* renamed from: f */
                private final zzbha f20563f;

                {
                    this.f20563f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbha zzbhaVar = this.f20563f;
                    zzbhaVar.f23023c.mo14876C();
                    com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = zzbhaVar.f23023c.mo14918k0();
                    if (zzdVarMo14918k0 != null) {
                        zzdVarMo14918k0.zzth();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: e */
    public final void mo17683e() {
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            WebView webView = this.f23023c.getWebView();
            if (C0311u.m2101N(webView)) {
                m17670q(webView, zzavbVar, 10);
                return;
            }
            m17665B();
            this.f23022A = new ViewOnAttachStateChangeListenerC7258va(this, zzavbVar);
            this.f23023c.getView().addOnAttachStateChangeListener(this.f23022A);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: f */
    public final void mo17684f() {
        synchronized (this.f23026f) {
            this.f23037q = true;
        }
        this.f23045y++;
        m17666C();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: g */
    public final void mo17685g(int i2, int i3) {
        zzapr zzaprVar = this.f23041u;
        if (zzaprVar != null) {
            zzaprVar.m16840j(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: h */
    public final void mo17686h() {
        this.f23045y--;
        m17666C();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: i */
    public final void mo17687i(zzbij zzbijVar) {
        this.f23029i = zzbijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: j */
    public final void mo17688j(zzbik zzbikVar) {
        this.f23030j = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: k */
    public final void mo17689k() {
        this.f23044x = true;
        m17666C();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: l */
    public final void mo17690l(int i2, int i3, boolean z) {
        this.f23039s.m16861h(i2, i3);
        zzapr zzaprVar = this.f23041u;
        if (zzaprVar != null) {
            zzaprVar.m16838h(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: m */
    public final boolean mo17691m() {
        boolean z;
        synchronized (this.f23026f) {
            z = this.f23035o;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: n */
    public final zzavb mo17692n() {
        return this.f23042v;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: o */
    public final com.google.android.gms.ads.internal.zzb mo17693o() {
        return this.f23040t;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        zzawz.m17082m(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            mo17679a(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f23026f) {
            if (this.f23023c.mo14919l()) {
                zzawz.m17082m("Blank page loaded, 1...");
                this.f23023c.mo14924n0();
                return;
            }
            this.f23043w = true;
            zzbik zzbikVar = this.f23030j;
            if (zzbikVar != null) {
                zzbikVar.mo14762a();
                this.f23030j = null;
            }
            m17666C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceivedError(android.webkit.WebView r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            if (r5 >= 0) goto Ld
            int r0 = -r5
            int r0 = r0 + (-1)
            java.lang.String[] r1 = com.google.android.gms.internal.ads.zzbha.f23020a
            int r2 = r1.length
            if (r0 >= r2) goto Ld
            r0 = r1[r0]
            goto L11
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L11:
            com.google.android.gms.internal.ads.zzbgz r1 = r3.f23023c
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "http_err"
            r3.m17669K(r1, r2, r0, r7)
            super.onReceivedError(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbha.onReceivedError(android.webkit.WebView, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceivedSslError(android.webkit.WebView r5, android.webkit.SslErrorHandler r6, android.net.http.SslError r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L26
            int r0 = r7.getPrimaryError()
            if (r0 < 0) goto L10
            java.lang.String[] r1 = com.google.android.gms.internal.ads.zzbha.f23021b
            int r2 = r1.length
            if (r0 >= r2) goto L10
            r0 = r1[r0]
            goto L14
        L10:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L14:
            com.google.android.gms.internal.ads.zzbgz r1 = r4.f23023c
            android.content.Context r1 = r1.getContext()
            com.google.android.gms.ads.internal.zzk.zzli()
            java.lang.String r2 = r7.getUrl()
            java.lang.String r3 = "ssl_err"
            r4.m17669K(r1, r3, r0, r2)
        L26:
            super.onReceivedSslError(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbha.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f23023c.mo14936w(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: p */
    public final void m17694p() {
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            zzavbVar.mo16971c();
            this.f23042v = null;
        }
        m17665B();
        synchronized (this.f23026f) {
            this.f23025e.clear();
            this.f23027g = null;
            this.f23028h = null;
            this.f23029i = null;
            this.f23030j = null;
            this.f23031k = null;
            this.f23032l = null;
            this.f23034n = false;
            this.f23035o = false;
            this.f23036p = false;
            this.f23037q = false;
            this.f23038r = null;
            this.f23033m = null;
            zzapr zzaprVar = this.f23041u;
            if (zzaprVar != null) {
                zzaprVar.m16842l(true);
                this.f23041u = null;
            }
        }
    }

    /* renamed from: s */
    public final void m17695s(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        boolean zMo14921m = this.f23023c.mo14921m();
        m17671r(new AdOverlayInfoParcel(zzcVar, (!zMo14921m || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null, zMo14921m ? null : this.f23028h, this.f23038r, this.f23023c.mo14899b()));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m17678I(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws zzdi {
        String strValueOf = String.valueOf(str);
        zzawz.m17082m(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriM19452a = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriM19452a.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriM19452a.getHost())) {
            mo17679a(uriM19452a);
        } else {
            if (this.f23034n && webView == this.f23023c.getWebView()) {
                String scheme = uriM19452a.getScheme();
                if ("http".equalsIgnoreCase(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                    zzxr zzxrVar = this.f23027g;
                    if (zzxrVar != null) {
                        zzxrVar.onAdClicked();
                        zzavb zzavbVar = this.f23042v;
                        if (zzavbVar != null) {
                            zzavbVar.mo16970b(str);
                        }
                        this.f23027g = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f23023c.getWebView().willNotDraw()) {
                String strValueOf2 = String.valueOf(str);
                zzbad.m17353i(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
            } else {
                try {
                    zzdh zzdhVarMo14903d = this.f23023c.mo14903d();
                    if (zzdhVarMo14903d != null && zzdhVarMo14903d.m19454e(uriM19452a)) {
                        uriM19452a = zzdhVarMo14903d.m19452a(uriM19452a, this.f23023c.getContext(), this.f23023c.getView(), this.f23023c.mo14897a());
                    }
                } catch (zzdi unused) {
                    String strValueOf3 = String.valueOf(str);
                    zzbad.m17353i(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.f23040t;
                if (zzbVar == null || zzbVar.zzkx()) {
                    m17695s(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriM19452a.toString(), null, null, null, null, null));
                } else {
                    this.f23040t.zzbk(str);
                }
            }
        }
        return true;
    }

    /* renamed from: u */
    public final void m17696u(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        synchronized (this.f23026f) {
            List<zzaho<? super zzbgz>> list = this.f23025e.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzaho<? super zzbgz> zzahoVar : list) {
                if (predicate.mo14652a(zzahoVar)) {
                    arrayList.add(zzahoVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: v */
    public final void m17697v(String str, zzaho<? super zzbgz> zzahoVar) {
        synchronized (this.f23026f) {
            List<zzaho<? super zzbgz>> copyOnWriteArrayList = this.f23025e.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f23025e.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzahoVar);
        }
    }

    /* renamed from: w */
    public final void m17698w(boolean z, int i2, String str) {
        boolean zMo14921m = this.f23023c.mo14921m();
        zzxr zzxrVar = (!zMo14921m || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null;
        C7295wa c7295wa = zMo14921m ? null : new C7295wa(this.f23023c, this.f23028h);
        zzagv zzagvVar = this.f23031k;
        zzagx zzagxVar = this.f23032l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23038r;
        zzbgz zzbgzVar = this.f23023c;
        m17671r(new AdOverlayInfoParcel(zzxrVar, c7295wa, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, zzbgzVar.mo14899b()));
    }

    /* renamed from: x */
    public final void m17699x(boolean z, int i2, String str, String str2) {
        boolean zMo14921m = this.f23023c.mo14921m();
        zzxr zzxrVar = (!zMo14921m || this.f23023c.mo14925o().m17741e()) ? this.f23027g : null;
        C7295wa c7295wa = zMo14921m ? null : new C7295wa(this.f23023c, this.f23028h);
        zzagv zzagvVar = this.f23031k;
        zzagx zzagxVar = this.f23032l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23038r;
        zzbgz zzbgzVar = this.f23023c;
        m17671r(new AdOverlayInfoParcel(zzxrVar, c7295wa, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, str2, zzbgzVar.mo14899b()));
    }

    /* renamed from: y */
    public final boolean m17700y() {
        boolean z;
        synchronized (this.f23026f) {
            z = this.f23036p;
        }
        return z;
    }

    /* renamed from: z */
    public final ViewTreeObserver.OnGlobalLayoutListener m17701z() {
        synchronized (this.f23026f) {
        }
        return null;
    }

    @VisibleForTesting
    private zzbha(zzbgz zzbgzVar, zzwj zzwjVar, boolean z, zzaqa zzaqaVar, zzapr zzaprVar) {
        this.f23025e = new HashMap<>();
        this.f23026f = new Object();
        this.f23034n = false;
        this.f23024d = zzwjVar;
        this.f23023c = zzbgzVar;
        this.f23035o = z;
        this.f23039s = zzaqaVar;
        this.f23041u = null;
    }
}
