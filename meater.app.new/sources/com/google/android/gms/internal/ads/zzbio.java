package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.C0311u;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;

@VisibleForTesting
@zzard
/* loaded from: classes2.dex */
public final class zzbio extends zzbiz implements zzbii {

    /* renamed from: A */
    private View.OnAttachStateChangeListener f23073A;

    /* renamed from: d */
    protected zzbgz f23074d;

    /* renamed from: g */
    private zzxr f23077g;

    /* renamed from: h */
    private com.google.android.gms.ads.internal.overlay.zzo f23078h;

    /* renamed from: i */
    private zzbij f23079i;

    /* renamed from: j */
    private zzbik f23080j;

    /* renamed from: k */
    private zzagv f23081k;

    /* renamed from: l */
    private zzagx f23082l;

    /* renamed from: m */
    private zzbil f23083m;

    /* renamed from: o */
    private volatile boolean f23085o;

    /* renamed from: p */
    private boolean f23086p;

    /* renamed from: q */
    private boolean f23087q;

    /* renamed from: r */
    private com.google.android.gms.ads.internal.overlay.zzu f23088r;

    /* renamed from: s */
    private zzaqa f23089s;

    /* renamed from: t */
    private com.google.android.gms.ads.internal.zzb f23090t;

    /* renamed from: u */
    private zzapr f23091u;

    /* renamed from: v */
    private zzavb f23092v;

    /* renamed from: w */
    private boolean f23093w;

    /* renamed from: x */
    private boolean f23094x;

    /* renamed from: y */
    private int f23095y;

    /* renamed from: z */
    private boolean f23096z;

    /* renamed from: f */
    private final Object f23076f = new Object();

    /* renamed from: n */
    private boolean f23084n = false;

    /* renamed from: e */
    private final zzaju<zzbgz> f23075e = new zzaju<>();

    /* renamed from: H */
    private final void m17745H() {
        if (this.f23073A == null) {
            return;
        }
        this.f23074d.getView().removeOnAttachStateChangeListener(this.f23073A);
    }

    /* renamed from: I */
    private final void m17746I() {
        zzbij zzbijVar = this.f23079i;
        if (zzbijVar != null && ((this.f23093w && this.f23095y <= 0) || this.f23094x)) {
            zzbijVar.zzae(!this.f23094x);
            this.f23079i = null;
        }
        this.f23074d.mo14881I();
    }

    /* renamed from: J */
    private static WebResourceResponse m17747J() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21707T0)).booleanValue()) {
            return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        com.google.android.gms.ads.internal.zzk.zzlg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        return com.google.android.gms.internal.ads.zzaxi.m17133M(r3);
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse m17748O(com.google.android.gms.internal.ads.zzbja r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbio.m17748O(com.google.android.gms.internal.ads.zzbja):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m17749v(View view, zzavb zzavbVar, int i2) {
        if (!zzavbVar.mo16975g() || i2 <= 0) {
            return;
        }
        zzavbVar.mo16974f(view);
        if (zzavbVar.mo16975g()) {
            zzaxi.f22654a.postDelayed(new RunnableC6852kb(this, view, zzavbVar, i2), 100L);
        }
    }

    /* renamed from: w */
    private final void m17750w(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzapr zzaprVar = this.f23091u;
        boolean zM16841k = zzaprVar != null ? zzaprVar.m16841k() : false;
        zzk.zzlf();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.f23074d.getContext(), adOverlayInfoParcel, !zM16841k);
        zzavb zzavbVar = this.f23092v;
        if (zzavbVar != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzcVar = adOverlayInfoParcel.zzdkl) != null) {
                str = zzcVar.url;
            }
            zzavbVar.mo16970b(str);
        }
    }

    /* renamed from: A */
    public final void m17752A(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        this.f23075e.m16621t(str, predicate);
    }

    /* renamed from: B */
    public final void m17753B(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f23075e.m16618f(str, zzahoVar);
    }

    /* renamed from: C */
    public final void m17754C(boolean z, int i2, String str) {
        boolean zMo14921m = this.f23074d.mo14921m();
        zzxr zzxrVar = (!zMo14921m || this.f23074d.mo14925o().m17741e()) ? this.f23077g : null;
        C6926mb c6926mb = zMo14921m ? null : new C6926mb(this.f23074d, this.f23078h);
        zzagv zzagvVar = this.f23081k;
        zzagx zzagxVar = this.f23082l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23088r;
        zzbgz zzbgzVar = this.f23074d;
        m17750w(new AdOverlayInfoParcel(zzxrVar, c6926mb, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, zzbgzVar.mo14899b()));
    }

    /* renamed from: D */
    public final void m17755D(boolean z, int i2, String str, String str2) {
        boolean zMo14921m = this.f23074d.mo14921m();
        zzxr zzxrVar = (!zMo14921m || this.f23074d.mo14925o().m17741e()) ? this.f23077g : null;
        C6926mb c6926mb = zMo14921m ? null : new C6926mb(this.f23074d, this.f23078h);
        zzagv zzagvVar = this.f23081k;
        zzagx zzagxVar = this.f23082l;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23088r;
        zzbgz zzbgzVar = this.f23074d;
        m17750w(new AdOverlayInfoParcel(zzxrVar, c6926mb, zzagvVar, zzagxVar, zzuVar, zzbgzVar, z, i2, str, str2, zzbgzVar.mo14899b()));
    }

    /* renamed from: E */
    public final boolean m17756E() {
        boolean z;
        synchronized (this.f23076f) {
            z = this.f23086p;
        }
        return z;
    }

    /* renamed from: F */
    public final ViewTreeObserver.OnGlobalLayoutListener m17757F() {
        synchronized (this.f23076f) {
        }
        return null;
    }

    /* renamed from: G */
    public final ViewTreeObserver.OnScrollChangedListener m17758G() {
        synchronized (this.f23076f) {
        }
        return null;
    }

    /* renamed from: K */
    public final void m17759K(boolean z) {
        this.f23084n = z;
    }

    /* renamed from: L */
    public final void m17760L(boolean z) {
        this.f23096z = z;
    }

    /* renamed from: M */
    public final void m17761M(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f23075e.m16619i(str, zzahoVar);
    }

    /* renamed from: N */
    public final void m17762N(boolean z, int i2) {
        zzxr zzxrVar = (!this.f23074d.mo14921m() || this.f23074d.mo14925o().m17741e()) ? this.f23077g : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f23078h;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f23088r;
        zzbgz zzbgzVar = this.f23074d;
        m17750w(new AdOverlayInfoParcel(zzxrVar, zzoVar, zzuVar, zzbgzVar, z, i2, zzbgzVar.mo14899b()));
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: a */
    public final void mo17679a(Uri uri) {
        this.f23075e.m16623y0(uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: b */
    public final void mo17680b(boolean z) {
        synchronized (this.f23076f) {
            this.f23086p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: c */
    public final void mo17681c(zzxr zzxrVar, zzagv zzagvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagx zzagxVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar, boolean z, zzahp zzahpVar, com.google.android.gms.ads.internal.zzb zzbVar, zzaqc zzaqcVar, zzavb zzavbVar) {
        if (zzbVar == null) {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.f23074d.getContext(), zzavbVar, null);
        }
        this.f23091u = new zzapr(this.f23074d, zzaqcVar);
        this.f23092v = zzavbVar;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21764c1)).booleanValue()) {
            m17753B("/adMetadata", new zzagu(zzagvVar));
        }
        m17753B("/appEvent", new zzagw(zzagxVar));
        m17753B("/backButton", zzagz.f22026j);
        m17753B("/refresh", zzagz.f22027k);
        m17753B("/canOpenURLs", zzagz.f22017a);
        m17753B("/canOpenIntents", zzagz.f22018b);
        m17753B("/click", zzagz.f22019c);
        m17753B("/close", zzagz.f22020d);
        m17753B("/customClose", zzagz.f22021e);
        m17753B("/instrument", zzagz.f22030n);
        m17753B("/delayPageLoaded", zzagz.f22032p);
        m17753B("/delayPageClosed", zzagz.f22033q);
        m17753B("/getLocationInfo", zzagz.f22034r);
        m17753B("/httpTrack", zzagz.f22022f);
        m17753B("/log", zzagz.f22023g);
        m17753B("/mraid", new zzahr(zzbVar, this.f23091u, zzaqcVar));
        m17753B("/mraidLoaded", this.f23089s);
        m17753B("/open", new zzahs(zzbVar, this.f23091u));
        m17753B("/precache", new zzbgc());
        m17753B("/touch", zzagz.f22025i);
        m17753B("/video", zzagz.f22028l);
        m17753B("/videoMeta", zzagz.f22029m);
        if (zzk.zzme().m17002D(this.f23074d.getContext())) {
            m17753B("/logScionEvent", new zzahq(this.f23074d.getContext()));
        }
        this.f23077g = zzxrVar;
        this.f23078h = zzoVar;
        this.f23081k = zzagvVar;
        this.f23082l = zzagxVar;
        this.f23088r = zzuVar;
        this.f23090t = zzbVar;
        this.f23084n = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: d */
    public final void mo17682d() {
        synchronized (this.f23076f) {
            this.f23084n = false;
            this.f23085o = true;
            zzbbm.f22757a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jb

                /* renamed from: f */
                private final zzbio f19468f;

                {
                    this.f19468f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbio zzbioVar = this.f19468f;
                    zzbioVar.f23074d.mo14876C();
                    com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = zzbioVar.f23074d.mo14918k0();
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
        zzavb zzavbVar = this.f23092v;
        if (zzavbVar != null) {
            WebView webView = this.f23074d.getWebView();
            if (C0311u.m2101N(webView)) {
                m17749v(webView, zzavbVar, 10);
                return;
            }
            m17745H();
            this.f23073A = new ViewOnAttachStateChangeListenerC6889lb(this, zzavbVar);
            this.f23074d.getView().addOnAttachStateChangeListener(this.f23073A);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: f */
    public final void mo17684f() {
        synchronized (this.f23076f) {
            this.f23087q = true;
        }
        this.f23095y++;
        m17746I();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: g */
    public final void mo17685g(int i2, int i3) {
        zzapr zzaprVar = this.f23091u;
        if (zzaprVar != null) {
            zzaprVar.m16840j(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: h */
    public final void mo17686h() {
        this.f23095y--;
        m17746I();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: i */
    public final void mo17687i(zzbij zzbijVar) {
        this.f23079i = zzbijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: j */
    public final void mo17688j(zzbik zzbikVar) {
        this.f23080j = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: k */
    public final void mo17689k() {
        this.f23094x = true;
        m17746I();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: l */
    public final void mo17690l(int i2, int i3, boolean z) {
        this.f23089s.m16861h(i2, i3);
        zzapr zzaprVar = this.f23091u;
        if (zzaprVar != null) {
            zzaprVar.m16838h(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: m */
    public final boolean mo17691m() {
        return this.f23085o;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: n */
    public final zzavb mo17692n() {
        return this.f23092v;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: o */
    public final com.google.android.gms.ads.internal.zzb mo17693o() {
        return this.f23090t;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f23074d.mo14936w(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    /* renamed from: p */
    public final void mo16149p(zzbja zzbjaVar) {
        this.f23093w = true;
        zzbik zzbikVar = this.f23080j;
        if (zzbikVar != null) {
            zzbikVar.mo14762a();
            this.f23080j = null;
        }
        m17746I();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    /* renamed from: r */
    public final void mo16150r(zzbja zzbjaVar) {
        this.f23075e.m16622w0(zzbjaVar.f23101b);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    /* renamed from: s */
    public final boolean mo16151s(zzbja zzbjaVar) {
        String strValueOf = String.valueOf(zzbjaVar.f23100a);
        zzawz.m17082m(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriM19452a = zzbjaVar.f23101b;
        if (this.f23075e.m16622w0(uriM19452a)) {
            return true;
        }
        if (this.f23084n) {
            String scheme = uriM19452a.getScheme();
            if ("http".equalsIgnoreCase(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                zzxr zzxrVar = this.f23077g;
                if (zzxrVar != null) {
                    zzxrVar.onAdClicked();
                    zzavb zzavbVar = this.f23092v;
                    if (zzavbVar != null) {
                        zzavbVar.mo16970b(zzbjaVar.f23100a);
                    }
                    this.f23077g = null;
                }
                return false;
            }
        }
        if (this.f23074d.getWebView().willNotDraw()) {
            String strValueOf2 = String.valueOf(zzbjaVar.f23100a);
            zzbad.m17353i(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
        } else {
            try {
                zzdh zzdhVarMo14903d = this.f23074d.mo14903d();
                if (zzdhVarMo14903d != null && zzdhVarMo14903d.m19454e(uriM19452a)) {
                    uriM19452a = zzdhVarMo14903d.m19452a(uriM19452a, this.f23074d.getContext(), this.f23074d.getView(), this.f23074d.mo14897a());
                }
            } catch (zzdi unused) {
                String strValueOf3 = String.valueOf(zzbjaVar.f23100a);
                zzbad.m17353i(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.zzb zzbVar = this.f23090t;
            if (zzbVar == null || zzbVar.zzkx()) {
                m17765x(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriM19452a.toString(), null, null, null, null, null));
            } else {
                this.f23090t.zzbk(zzbjaVar.f23100a);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    /* renamed from: t */
    public final WebResourceResponse mo17763t(zzbja zzbjaVar) throws ExecutionException, InterruptedException, TimeoutException {
        WebResourceResponse webResourceResponseM17132L;
        zzvs zzvsVarM20672d;
        zzavb zzavbVar = this.f23092v;
        if (zzavbVar != null) {
            zzavbVar.mo16969a(zzbjaVar.f23100a, zzbjaVar.f23103d, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(zzbjaVar.f23100a).getName())) {
            mo17682d();
            String str = this.f23074d.mo14925o().m17741e() ? (String) zzyt.m20848e().m16421c(zzacu.f21756b0) : this.f23074d.mo14921m() ? (String) zzyt.m20848e().m16421c(zzacu.f21749a0) : (String) zzyt.m20848e().m16421c(zzacu.f21742Z);
            zzk.zzlg();
            webResourceResponseM17132L = zzaxi.m17132L(this.f23074d.getContext(), this.f23074d.mo14899b().f22750f, str);
        } else {
            webResourceResponseM17132L = null;
        }
        if (webResourceResponseM17132L != null) {
            return webResourceResponseM17132L;
        }
        try {
            if (!zzavx.m17021c(zzbjaVar.f23100a, this.f23074d.getContext(), this.f23096z).equals(zzbjaVar.f23100a)) {
                return m17748O(zzbjaVar);
            }
            zzvv zzvvVarM20678y = zzvv.m20678y(zzbjaVar.f23100a);
            if (zzvvVarM20678y != null && (zzvsVarM20672d = zzk.zzlm().m20672d(zzvvVarM20678y)) != null && zzvsVarM20672d.m20675y()) {
                return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, zzvsVarM20672d.m20676z());
            }
            if (zzazx.m17324a()) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21648J1)).booleanValue()) {
                    return m17748O(zzbjaVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            zzk.zzlk().m17052e(e2, "AdWebViewClient.interceptRequest");
            return m17747J();
        }
    }

    /* renamed from: u */
    public final void m17764u() {
        zzavb zzavbVar = this.f23092v;
        if (zzavbVar != null) {
            zzavbVar.mo16971c();
            this.f23092v = null;
        }
        m17745H();
        this.f23075e.m16616B();
        this.f23075e.m16620r0(null);
        synchronized (this.f23076f) {
            this.f23077g = null;
            this.f23078h = null;
            this.f23079i = null;
            this.f23080j = null;
            this.f23081k = null;
            this.f23082l = null;
            this.f23088r = null;
            this.f23083m = null;
            zzapr zzaprVar = this.f23091u;
            if (zzaprVar != null) {
                zzaprVar.m16842l(true);
                this.f23091u = null;
            }
        }
    }

    /* renamed from: x */
    public final void m17765x(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        boolean zMo14921m = this.f23074d.mo14921m();
        m17750w(new AdOverlayInfoParcel(zzcVar, (!zMo14921m || this.f23074d.mo14925o().m17741e()) ? this.f23077g : null, zMo14921m ? null : this.f23078h, this.f23088r, this.f23074d.mo14899b()));
    }

    /* renamed from: y */
    final void m17766y(zzbgz zzbgzVar, boolean z) {
        zzaqa zzaqaVar = new zzaqa(zzbgzVar, zzbgzVar.mo14904d0(), new zzacf(zzbgzVar.getContext()));
        this.f23074d = zzbgzVar;
        this.f23085o = z;
        this.f23089s = zzaqaVar;
        this.f23091u = null;
        this.f23075e.m16620r0(zzbgzVar);
    }
}
