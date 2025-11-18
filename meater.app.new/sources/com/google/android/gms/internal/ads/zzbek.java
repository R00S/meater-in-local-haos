package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okhttp3.HttpUrl;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbek extends zzbco implements TextureView.SurfaceTextureListener, zzbfi {

    /* renamed from: A */
    private float f22915A;

    /* renamed from: h */
    private final zzbdf f22916h;

    /* renamed from: i */
    private final zzbdg f22917i;

    /* renamed from: j */
    private final boolean f22918j;

    /* renamed from: k */
    private final zzbde f22919k;

    /* renamed from: l */
    private zzbcn f22920l;

    /* renamed from: m */
    private Surface f22921m;

    /* renamed from: n */
    private zzbfa f22922n;

    /* renamed from: o */
    private String f22923o;

    /* renamed from: p */
    private String[] f22924p;

    /* renamed from: q */
    private boolean f22925q;

    /* renamed from: r */
    private int f22926r;

    /* renamed from: s */
    private zzbdd f22927s;

    /* renamed from: t */
    private final boolean f22928t;

    /* renamed from: u */
    private boolean f22929u;

    /* renamed from: v */
    private boolean f22930v;

    /* renamed from: w */
    private int f22931w;

    /* renamed from: x */
    private int f22932x;

    /* renamed from: y */
    private int f22933y;

    /* renamed from: z */
    private int f22934z;

    public zzbek(Context context, zzbdg zzbdgVar, zzbdf zzbdfVar, boolean z, boolean z2, zzbde zzbdeVar) {
        super(context);
        this.f22926r = 1;
        this.f22918j = z2;
        this.f22916h = zzbdfVar;
        this.f22917i = zzbdgVar;
        this.f22928t = z;
        this.f22919k = zzbdeVar;
        setSurfaceTextureListener(this);
        zzbdgVar.m17484b(this);
    }

    /* renamed from: A */
    private final boolean m17541A() {
        return m17552z() && this.f22926r != 1;
    }

    /* renamed from: B */
    private final void m17542B() {
        if (this.f22929u) {
            return;
        }
        this.f22929u = true;
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.c9

            /* renamed from: f */
            private final zzbek f18423f;

            {
                this.f18423f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18423f.m17558N();
            }
        });
        mo15161b();
        this.f22917i.m17486d();
        if (this.f22930v) {
            mo17409d();
        }
    }

    /* renamed from: C */
    private final zzbfa m17543C() {
        return new zzbfa(this.f22916h.getContext(), this.f22919k);
    }

    /* renamed from: D */
    private final String m17544D() {
        return zzk.zzlg().m17177g0(this.f22916h.getContext(), this.f22916h.mo14899b().f22750f);
    }

    /* renamed from: E */
    private final void m17545E() {
        String str;
        if (this.f22922n != null || (str = this.f22923o) == null || this.f22921m == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzbft zzbftVarMo14893V = this.f22916h.mo14893V(this.f22923o);
            if (zzbftVarMo14893V instanceof zzbgp) {
                this.f22922n = ((zzbgp) zzbftVarMo14893V).m17662B();
            } else {
                if (!(zzbftVarMo14893V instanceof zzbgo)) {
                    String strValueOf = String.valueOf(this.f22923o);
                    zzbad.m17353i(strValueOf.length() != 0 ? "Stream cache miss: ".concat(strValueOf) : new String("Stream cache miss: "));
                    return;
                }
                zzbgo zzbgoVar = (zzbgo) zzbftVarMo14893V;
                String strM17544D = m17544D();
                ByteBuffer byteBufferM17657B = zzbgoVar.m17657B();
                boolean zM17659E = zzbgoVar.m17659E();
                String strM17658C = zzbgoVar.m17658C();
                if (strM17658C == null) {
                    zzbad.m17353i("Stream cache URL is null.");
                    return;
                } else {
                    zzbfa zzbfaVarM17543C = m17543C();
                    this.f22922n = zzbfaVarM17543C;
                    zzbfaVarM17543C.m17614z(new Uri[]{Uri.parse(strM17658C)}, strM17544D, byteBufferM17657B, zM17659E);
                }
            }
        } else {
            this.f22922n = m17543C();
            String strM17544D2 = m17544D();
            Uri[] uriArr = new Uri[this.f22924p.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.f22924p;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.f22922n.m17613y(uriArr, strM17544D2);
        }
        this.f22922n.m17612x(this);
        m17550t(this.f22921m, false);
        int iMo15576F = this.f22922n.m17588I().mo15576F();
        this.f22926r = iMo15576F;
        if (iMo15576F == 3) {
            m17542B();
        }
    }

    /* renamed from: F */
    private final void m17546F() {
        m17551x(this.f22931w, this.f22932x);
    }

    /* renamed from: G */
    private final void m17547G() {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17582A(true);
        }
    }

    /* renamed from: H */
    private final void m17548H() {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17582A(false);
        }
    }

    /* renamed from: s */
    private final void m17549s(float f2, boolean z) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17583B(f2, z);
        } else {
            zzbad.m17353i("Trying to set volume before player is initalized.");
        }
    }

    /* renamed from: t */
    private final void m17550t(Surface surface, boolean z) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17611w(surface, z);
        } else {
            zzbad.m17353i("Trying to set surface before player is initalized.");
        }
    }

    /* renamed from: x */
    private final void m17551x(int i2, int i3) {
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.f22915A != f2) {
            this.f22915A = f2;
            requestLayout();
        }
    }

    /* renamed from: z */
    private final boolean m17552z() {
        return (this.f22922n == null || this.f22925q) ? false : true;
    }

    /* renamed from: I */
    final /* synthetic */ void m17553I() {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17422g();
        }
    }

    /* renamed from: J */
    final /* synthetic */ void m17554J() {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17418c();
        }
    }

    /* renamed from: K */
    final /* synthetic */ void m17555K() {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17420e();
        }
    }

    /* renamed from: L */
    final /* synthetic */ void m17556L() {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17424i();
        }
    }

    /* renamed from: M */
    final /* synthetic */ void m17557M() {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17423h();
        }
    }

    /* renamed from: N */
    final /* synthetic */ void m17558N() {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17416a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: a */
    public final void mo17559a(final boolean z, final long j2) {
        if (this.f22916h != null) {
            zzbbm.f22757a.execute(new Runnable(this, z, j2) { // from class: com.google.android.gms.internal.ads.l9

                /* renamed from: f */
                private final zzbek f19754f;

                /* renamed from: g */
                private final boolean f19755g;

                /* renamed from: h */
                private final long f19756h;

                {
                    this.f19754f = this;
                    this.f19755g = z;
                    this.f19756h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19754f.m17564v(this.f19755g, this.f19756h);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco, com.google.android.gms.internal.ads.InterfaceC6701g8
    /* renamed from: b */
    public final void mo15161b() {
        m17549s(this.f22787g.m17490a(), false);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: c */
    public final void mo17408c() {
        if (m17541A()) {
            if (this.f22919k.f22840a) {
                m17548H();
            }
            this.f22922n.m17588I().mo15577a(false);
            this.f22917i.m17488f();
            this.f22787g.m17494e();
            zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.g9

                /* renamed from: f */
                private final zzbek f18954f;

                {
                    this.f18954f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18954f.m17555K();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: d */
    public final void mo17409d() {
        if (!m17541A()) {
            this.f22930v = true;
            return;
        }
        if (this.f22919k.f22840a) {
            m17547G();
        }
        this.f22922n.m17588I().mo15577a(true);
        this.f22917i.m17487e();
        this.f22787g.m17493d();
        this.f22786f.m17465b();
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.f9

            /* renamed from: f */
            private final zzbek f18870f;

            {
                this.f18870f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18870f.m17556L();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: e */
    public final void mo17560e(int i2) {
        if (this.f22926r != i2) {
            this.f22926r = i2;
            if (i2 == 3) {
                m17542B();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.f22919k.f22840a) {
                m17548H();
            }
            this.f22917i.m17488f();
            this.f22787g.m17494e();
            zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d9

                /* renamed from: f */
                private final zzbek f18501f;

                {
                    this.f18501f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18501f.m17557M();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: f */
    public final void mo17561f(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String string = sb.toString();
        String strValueOf = String.valueOf(string);
        zzbad.m17353i(strValueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(strValueOf) : new String("ExoPlayerAdapter error: "));
        this.f22925q = true;
        if (this.f22919k.f22840a) {
            m17548H();
        }
        zzaxi.f22654a.post(new Runnable(this, string) { // from class: com.google.android.gms.internal.ads.e9

            /* renamed from: f */
            private final zzbek f18738f;

            /* renamed from: g */
            private final String f18739g;

            {
                this.f18738f = this;
                this.f18739g = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18738f.m17565w(this.f18739g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: g */
    public final void mo17562g(int i2, int i3) {
        this.f22931w = i2;
        this.f22932x = i3;
        m17546F();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getCurrentPosition() {
        if (m17541A()) {
            return (int) this.f22922n.m17588I().mo15581e();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getDuration() {
        if (m17541A()) {
            return (int) this.f22922n.m17588I().mo15583g();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoHeight() {
        return this.f22932x;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoWidth() {
        return this.f22931w;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: h */
    public final void mo17410h(int i2) {
        if (m17541A()) {
            this.f22922n.m17588I().mo15578b(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: i */
    public final void mo17411i() {
        if (m17552z()) {
            this.f22922n.m17588I().stop();
            if (this.f22922n != null) {
                m17550t(null, true);
                zzbfa zzbfaVar = this.f22922n;
                if (zzbfaVar != null) {
                    zzbfaVar.m17612x(null);
                    this.f22922n.m17609t();
                    this.f22922n = null;
                }
                this.f22926r = 1;
                this.f22925q = false;
                this.f22929u = false;
                this.f22930v = false;
            }
        }
        this.f22917i.m17488f();
        this.f22787g.m17494e();
        this.f22917i.m17483a();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: j */
    public final void mo17412j(float f2, float f3) {
        zzbdd zzbddVar = this.f22927s;
        if (zzbddVar != null) {
            zzbddVar.m17475e(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: k */
    public final void mo17413k(zzbcn zzbcnVar) {
        this.f22920l = zzbcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: l */
    public final void mo17425l(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.f22923o = str;
            this.f22924p = (String[]) Arrays.copyOf(strArr, strArr.length);
            m17545E();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: m */
    public final void mo17426m(int i2) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17589J().m17577j(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: n */
    public final void mo17427n(int i2) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17589J().m17578k(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: o */
    public final void mo17428o(int i2) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17589J().m17575h(i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.f22915A;
        if (f2 != 0.0f && this.f22927s == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbdd zzbddVar = this.f22927s;
        if (zzbddVar != null) {
            zzbddVar.m17476i(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i5 = this.f22933y;
            if (((i5 > 0 && i5 != measuredWidth) || ((i4 = this.f22934z) > 0 && i4 != measuredHeight)) && this.f22918j && m17552z()) {
                zzkv zzkvVarM17588I = this.f22922n.m17588I();
                if (zzkvVarM17588I.mo15581e() > 0 && !zzkvVarM17588I.mo15582f()) {
                    m17549s(0.0f, true);
                    zzkvVarM17588I.mo15577a(true);
                    long jMo15581e = zzkvVarM17588I.mo15581e();
                    long jMo14608a = zzk.zzln().mo14608a();
                    while (m17552z() && zzkvVarM17588I.mo15581e() == jMo15581e && zzk.zzln().mo14608a() - jMo14608a <= 250) {
                    }
                    zzkvVarM17588I.mo15577a(false);
                    mo15161b();
                }
            }
            this.f22933y = measuredWidth;
            this.f22934z = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) throws InterruptedException {
        if (this.f22928t) {
            zzbdd zzbddVar = new zzbdd(getContext());
            this.f22927s = zzbddVar;
            zzbddVar.m17474b(surfaceTexture, i2, i3);
            this.f22927s.start();
            SurfaceTexture surfaceTextureM17478k = this.f22927s.m17478k();
            if (surfaceTextureM17478k != null) {
                surfaceTexture = surfaceTextureM17478k;
            } else {
                this.f22927s.m17477j();
                this.f22927s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f22921m = surface;
        if (this.f22922n == null) {
            m17545E();
        } else {
            m17550t(surface, true);
            if (!this.f22919k.f22840a) {
                m17547G();
            }
        }
        if (this.f22931w == 0 || this.f22932x == 0) {
            m17551x(i2, i3);
        } else {
            m17546F();
        }
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.h9

            /* renamed from: f */
            private final zzbek f19065f;

            {
                this.f19065f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19065f.m17554J();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo17408c();
        zzbdd zzbddVar = this.f22927s;
        if (zzbddVar != null) {
            zzbddVar.m17477j();
            this.f22927s = null;
        }
        if (this.f22922n != null) {
            m17548H();
            Surface surface = this.f22921m;
            if (surface != null) {
                surface.release();
            }
            this.f22921m = null;
            m17550t(null, true);
        }
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.j9

            /* renamed from: f */
            private final zzbek f19466f;

            {
                this.f19466f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19466f.m17553I();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzbdd zzbddVar = this.f22927s;
        if (zzbddVar != null) {
            zzbddVar.m17476i(i2, i3);
        }
        zzaxi.f22654a.post(new Runnable(this, i2, i3) { // from class: com.google.android.gms.internal.ads.i9

            /* renamed from: f */
            private final zzbek f19298f;

            /* renamed from: g */
            private final int f19299g;

            /* renamed from: h */
            private final int f19300h;

            {
                this.f19298f = this;
                this.f19299g = i2;
                this.f19300h = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19298f.m17566y(this.f19299g, this.f19300h);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f22917i.m17485c(this);
        this.f22786f.m17464a(surfaceTexture, this.f22920l);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        zzawz.m17082m(sb.toString());
        zzaxi.f22654a.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.k9

            /* renamed from: f */
            private final zzbek f19526f;

            /* renamed from: g */
            private final int f19527g;

            {
                this.f19526f = this;
                this.f19527g = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19526f.m17563u(this.f19527g);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: p */
    public final void mo17429p(int i2) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17589J().m17576i(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: q */
    public final void mo17430q(int i2) {
        zzbfa zzbfaVar = this.f22922n;
        if (zzbfaVar != null) {
            zzbfaVar.m17584C(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: r */
    public final String mo17414r() {
        String str = this.f22928t ? " spherical" : HttpUrl.FRAGMENT_ENCODE_SET;
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void setVideoPath(String str) {
        if (str != null) {
            this.f22923o = str;
            this.f22924p = new String[]{str};
            m17545E();
        }
    }

    /* renamed from: u */
    final /* synthetic */ void m17563u(int i2) {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.onWindowVisibilityChanged(i2);
        }
    }

    /* renamed from: v */
    final /* synthetic */ void m17564v(boolean z, long j2) {
        this.f22916h.mo14890R(z, j2);
    }

    /* renamed from: w */
    final /* synthetic */ void m17565w(String str) {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17417b("ExoPlayerAdapter error", str);
        }
    }

    /* renamed from: y */
    final /* synthetic */ void m17566y(int i2, int i3) {
        zzbcn zzbcnVar = this.f22920l;
        if (zzbcnVar != null) {
            zzbcnVar.mo17419d(i2, i3);
        }
    }
}
