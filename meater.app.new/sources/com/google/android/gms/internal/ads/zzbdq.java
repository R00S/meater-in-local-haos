package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.SideEffectFree;

@zzard
@TargetApi(16)
/* loaded from: classes.dex */
public final class zzbdq extends zzbco implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private boolean f22882A;

    /* renamed from: B */
    private int f22883B;

    /* renamed from: C */
    private int f22884C;

    /* renamed from: D */
    private float f22885D;

    /* renamed from: E */
    private int f22886E;

    /* renamed from: F */
    private int f22887F;

    /* renamed from: G */
    private final zzgh f22888G;

    /* renamed from: H */
    private final zzhh f22889H;

    /* renamed from: I */
    private final zzgq f22890I;

    /* renamed from: h */
    private float f22891h;

    /* renamed from: i */
    private final zzbdf f22892i;

    /* renamed from: j */
    private final Context f22893j;

    /* renamed from: k */
    private final int f22894k;

    /* renamed from: l */
    private final zzbdg f22895l;

    /* renamed from: m */
    private final boolean f22896m;

    /* renamed from: n */
    private final zzbde f22897n;

    /* renamed from: o */
    private zzbcn f22898o;

    /* renamed from: p */
    private Surface f22899p;

    /* renamed from: q */
    private zzbdk f22900q;

    /* renamed from: r */
    private zzge f22901r;

    /* renamed from: s */
    private zzhd f22902s;

    /* renamed from: t */
    private zzgn f22903t;

    /* renamed from: u */
    private String f22904u;

    /* renamed from: v */
    private boolean f22905v;

    /* renamed from: w */
    private int f22906w;

    /* renamed from: x */
    private zzbdd f22907x;

    /* renamed from: y */
    private boolean f22908y;

    /* renamed from: z */
    private boolean f22909z;

    public zzbdq(Context context, zzbdg zzbdgVar, zzbdf zzbdfVar, int i2, boolean z, boolean z2, zzbde zzbdeVar) {
        super(context);
        this.f22906w = 1;
        this.f22888G = new C7367y8(this);
        this.f22889H = new C7404z8(this);
        this.f22890I = new C6480a9(this);
        this.f22893j = context;
        this.f22896m = z2;
        this.f22892i = zzbdfVar;
        this.f22894k = i2;
        this.f22895l = zzbdgVar;
        this.f22908y = z;
        this.f22897n = zzbdeVar;
        setSurfaceTextureListener(this);
        zzbdgVar.m17484b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m17507A(int i2, int i3, float f2) {
        float f3 = i3 == 0 ? 1.0f : (i2 * f2) / i3;
        if (this.f22891h != f3) {
            this.f22891h = f3;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m17514L(final String str, final String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(str2).length());
        sb.append("Error received: ");
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        zzbad.m17353i(sb.toString());
        this.f22905v = true;
        if (this.f22897n.f22840a) {
            m17521T();
        }
        zzaxi.f22654a.post(new Runnable(this, str, str2) { // from class: com.google.android.gms.internal.ads.s8

            /* renamed from: f */
            private final zzbdq f20510f;

            /* renamed from: g */
            private final String f20511g;

            /* renamed from: h */
            private final String f20512h;

            {
                this.f20510f = this;
                this.f20511g = str;
                this.f20512h = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20510f.m17534M(this.f20511g, this.f20512h);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m17515N() {
        zzawz.m17082m("Video ended.");
        if (this.f22897n.f22840a) {
            m17521T();
        }
        this.f22895l.m17488f();
        this.f22787g.m17494e();
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.r8

            /* renamed from: f */
            private final zzbdq f20440f;

            {
                this.f20440f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20440f.m17539Y();
            }
        });
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: O */
    private final boolean m17516O() {
        return (this.f22901r == null || this.f22905v) ? false : true;
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: P */
    private final boolean m17517P() {
        return m17516O() && this.f22906w != 1;
    }

    /* renamed from: Q */
    private final void m17518Q() {
        String str;
        zzhn zzigVar;
        zzjp c6517b9;
        zzig zzigVar2;
        if (this.f22901r != null || (str = this.f22904u) == null || this.f22899p == null) {
            return;
        }
        zzbdk zzbdkVar = null;
        if (str.startsWith("cache:")) {
            zzbft zzbftVarMo14893V = this.f22892i.mo14893V(this.f22904u);
            if (zzbftVarMo14893V != null && (zzbftVarMo14893V instanceof zzbgl)) {
                zzbgl zzbglVar = (zzbgl) zzbftVarMo14893V;
                zzbglVar.m17654E();
                zzbdkVar = zzbglVar.m17655F();
                zzbdkVar.m17501d(this.f22888G, this.f22889H, this.f22890I);
            } else if (zzbftVarMo14893V instanceof zzbgg) {
                zzbgg zzbggVar = (zzbgg) zzbftVarMo14893V;
                ByteBuffer byteBufferM17647B = zzbggVar.m17647B();
                String strM17648C = zzbggVar.m17648C();
                boolean zM17649E = zzbggVar.m17649E();
                zzbdk zzbdkVar2 = new zzbdk();
                zzid zzjgVar = "video/webm".equals(null) ? new zzjg() : new zziv();
                if (!zM17649E || byteBufferM17647B.limit() <= 0) {
                    zzjp zzjtVar = new zzjt(this.f22892i.getContext(), zzk.zzlg().m17177g0(this.f22892i.getContext(), this.f22892i.mo14899b().f22750f));
                    if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21902y3)).booleanValue()) {
                        zzjtVar = new zzbeh(this.f22893j, zzjtVar, new zzbei(this) { // from class: com.google.android.gms.internal.ads.m8

                            /* renamed from: a */
                            private final zzbdq f19885a;

                            {
                                this.f19885a = this;
                            }

                            @Override // com.google.android.gms.internal.ads.zzbei
                            /* renamed from: a */
                            public final void mo15265a(final boolean z, final long j2) {
                                final zzbdq zzbdqVar = this.f19885a;
                                zzbbm.f22757a.execute(new Runnable(zzbdqVar, z, j2) { // from class: com.google.android.gms.internal.ads.o8

                                    /* renamed from: f */
                                    private final zzbdq f20142f;

                                    /* renamed from: g */
                                    private final boolean f20143g;

                                    /* renamed from: h */
                                    private final long f20144h;

                                    {
                                        this.f20142f = zzbdqVar;
                                        this.f20143g = z;
                                        this.f20144h = j2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f20142f.m17530C(this.f20143g, this.f20144h);
                                    }
                                });
                            }
                        });
                    }
                    if (byteBufferM17647B.limit() > 0) {
                        int iLimit = byteBufferM17647B.limit();
                        byte[] bArr = new byte[iLimit];
                        byteBufferM17647B.get(bArr);
                        c6517b9 = new C6517b9(new zzjo(bArr), iLimit, zzjtVar);
                    } else {
                        c6517b9 = zzjtVar;
                    }
                    zzigVar2 = new zzig(Uri.parse(strM17648C), c6517b9, zzjgVar, 2, this.f22897n.f22842c);
                } else {
                    byte[] bArr2 = new byte[byteBufferM17647B.limit()];
                    byteBufferM17647B.get(bArr2);
                    zzigVar2 = new zzig(Uri.parse(strM17648C), new zzjo(bArr2), zzjgVar, 2, this.f22897n.f22842c);
                }
                zzbdkVar2.m17501d(this.f22888G, this.f22889H, this.f22890I);
                if (!zzbdkVar2.m17502e(zzigVar2)) {
                    m17514L("AdExoPlayerHelper Error", "Prepare from ByteBuffer failed.");
                }
                zzbdkVar = zzbdkVar2;
            } else {
                String strValueOf = String.valueOf(this.f22904u);
                zzbad.m17353i(strValueOf.length() != 0 ? "Source is MD5 but not found in cache. Source: ".concat(strValueOf) : new String("Source is MD5 but not found in cache. Source: "));
            }
        } else {
            int i2 = this.f22894k;
            if (i2 == 1) {
                zzigVar = new zzgl(this.f22892i.getContext(), Uri.parse(this.f22904u), null, 2);
            } else {
                Preconditions.m14362a(i2 == 2);
                zzjp zzjtVar2 = new zzjt(this.f22892i.getContext(), zzk.zzlg().m17177g0(this.f22892i.getContext(), this.f22892i.mo14899b().f22750f));
                zzigVar = new zzig(Uri.parse(this.f22904u), ((Boolean) zzyt.m20848e().m16421c(zzacu.f21902y3)).booleanValue() ? new zzbeh(this.f22893j, zzjtVar2, new zzbei(this) { // from class: com.google.android.gms.internal.ads.l8

                    /* renamed from: a */
                    private final zzbdq f19753a;

                    {
                        this.f19753a = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbei
                    /* renamed from: a */
                    public final void mo15265a(final boolean z, final long j2) {
                        final zzbdq zzbdqVar = this.f19753a;
                        zzbbm.f22757a.execute(new Runnable(zzbdqVar, z, j2) { // from class: com.google.android.gms.internal.ads.p8

                            /* renamed from: f */
                            private final zzbdq f20285f;

                            /* renamed from: g */
                            private final boolean f20286g;

                            /* renamed from: h */
                            private final long f20287h;

                            {
                                this.f20285f = zzbdqVar;
                                this.f20286g = z;
                                this.f20287h = j2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f20285f.m17531F(this.f20286g, this.f20287h);
                            }
                        });
                    }
                }) : zzjtVar2, "video/webm".equals(null) ? new zzjg() : new zziv(), 2, this.f22897n.f22842c);
            }
            zzbdkVar = new zzbdk();
            zzbdkVar.m17501d(this.f22888G, this.f22889H, this.f22890I);
            if (!zzbdkVar.m17502e(zzigVar)) {
                m17514L("AdExoPlayerHelper Error", "Prepare failed.");
            }
        }
        this.f22900q = zzbdkVar;
        if (zzbdkVar == null) {
            String strValueOf2 = String.valueOf(this.f22904u);
            zzbad.m17353i(strValueOf2.length() != 0 ? "AdExoPlayerHelper is null. Source: ".concat(strValueOf2) : new String("AdExoPlayerHelper is null. Source: "));
            return;
        }
        this.f22901r = zzbdkVar.m17504j();
        this.f22902s = this.f22900q.m17505k();
        this.f22903t = this.f22900q.m17506l();
        if (this.f22901r != null) {
            m17526w(this.f22899p, false);
            int iMo15985F = this.f22901r.mo15985F();
            this.f22906w = iMo15985F;
            if (iMo15985F == 4) {
                m17519R();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m17519R() {
        if (this.f22909z) {
            return;
        }
        this.f22909z = true;
        zzawz.m17082m("Video is ready.");
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.q8

            /* renamed from: f */
            private final zzbdq f20381f;

            {
                this.f20381f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20381f.m17540Z();
            }
        });
        mo15161b();
        this.f22895l.m17486d();
        if (this.f22882A) {
            mo17409d();
        }
    }

    /* renamed from: S */
    private final void m17520S() {
        zzge zzgeVar = this.f22901r;
        if (zzgeVar != null) {
            zzgeVar.mo15997l(0, true);
        }
    }

    /* renamed from: T */
    private final void m17521T() {
        zzge zzgeVar = this.f22901r;
        if (zzgeVar != null) {
            zzgeVar.mo15997l(0, false);
        }
    }

    @SideEffectFree
    /* renamed from: v */
    private final void m17525v(float f2, boolean z) {
        zzgn zzgnVar;
        zzge zzgeVar = this.f22901r;
        if (zzgeVar == null || (zzgnVar = this.f22903t) == null) {
            zzbad.m17353i("Trying to set volume before player and renderers are initalized.");
        } else if (z) {
            zzgeVar.mo15993h(zzgnVar, 1, Float.valueOf(f2));
        } else {
            zzgeVar.mo15995j(zzgnVar, 1, Float.valueOf(f2));
        }
    }

    @SideEffectFree
    /* renamed from: w */
    private final void m17526w(Surface surface, boolean z) {
        zzhd zzhdVar;
        zzge zzgeVar = this.f22901r;
        if (zzgeVar == null || (zzhdVar = this.f22902s) == null) {
            zzbad.m17353i("Trying to set surface before player and renderers are initalized.");
        } else if (z) {
            zzgeVar.mo15993h(zzhdVar, 1, surface);
        } else {
            zzgeVar.mo15995j(zzhdVar, 1, surface);
        }
    }

    /* renamed from: C */
    final /* synthetic */ void m17530C(boolean z, long j2) {
        this.f22892i.mo14890R(z, j2);
    }

    /* renamed from: F */
    final /* synthetic */ void m17531F(boolean z, long j2) {
        this.f22892i.mo14890R(z, j2);
    }

    /* renamed from: H */
    final /* synthetic */ void m17532H(int i2) {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.onWindowVisibilityChanged(i2);
        }
    }

    /* renamed from: K */
    final /* synthetic */ void m17533K(int i2, int i3) {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17419d(i2, i3);
        }
    }

    /* renamed from: M */
    final /* synthetic */ void m17534M(String str, String str2) {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17417b(str, str2);
        }
    }

    /* renamed from: U */
    final /* synthetic */ void m17535U() {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17422g();
        }
    }

    /* renamed from: V */
    final /* synthetic */ void m17536V() {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17418c();
        }
    }

    /* renamed from: W */
    final /* synthetic */ void m17537W() {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17420e();
        }
    }

    /* renamed from: X */
    final /* synthetic */ void m17538X() {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17424i();
        }
    }

    /* renamed from: Y */
    final /* synthetic */ void m17539Y() {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17423h();
        }
    }

    /* renamed from: Z */
    final /* synthetic */ void m17540Z() {
        zzbcn zzbcnVar = this.f22898o;
        if (zzbcnVar != null) {
            zzbcnVar.mo17416a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco, com.google.android.gms.internal.ads.InterfaceC6701g8
    /* renamed from: b */
    public final void mo15161b() {
        m17525v(this.f22787g.m17490a(), false);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: c */
    public final void mo17408c() {
        if (m17517P()) {
            if (this.f22897n.f22840a) {
                m17521T();
            }
            this.f22901r.mo15986a(false);
            this.f22895l.m17488f();
            this.f22787g.m17494e();
            zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.u8

                /* renamed from: f */
                private final zzbdq f20621f;

                {
                    this.f20621f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20621f.m17537W();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: d */
    public final void mo17409d() {
        if (!m17517P()) {
            this.f22882A = true;
            return;
        }
        if (this.f22897n.f22840a) {
            m17520S();
        }
        this.f22901r.mo15986a(true);
        this.f22895l.m17487e();
        this.f22787g.m17493d();
        this.f22786f.m17465b();
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.t8

            /* renamed from: f */
            private final zzbdq f20561f;

            {
                this.f20561f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20561f.m17538X();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getCurrentPosition() {
        if (m17517P()) {
            return (int) this.f22901r.mo15990e();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getDuration() {
        if (m17517P()) {
            return (int) this.f22901r.mo15992g();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoHeight() {
        return this.f22884C;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoWidth() {
        return this.f22883B;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: h */
    public final void mo17410h(int i2) {
        if (m17517P()) {
            this.f22901r.mo15987b(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: i */
    public final void mo17411i() {
        if (m17516O()) {
            this.f22901r.stop();
            if (this.f22901r != null) {
                m17526w(null, true);
                zzbdk zzbdkVar = this.f22900q;
                if (zzbdkVar != null) {
                    zzbdkVar.m17503i();
                    this.f22900q = null;
                }
                this.f22901r = null;
                this.f22902s = null;
                this.f22903t = null;
                this.f22906w = 1;
                this.f22905v = false;
                this.f22909z = false;
                this.f22882A = false;
            }
        }
        this.f22895l.m17488f();
        this.f22787g.m17494e();
        this.f22895l.m17483a();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: j */
    public final void mo17412j(float f2, float f3) {
        zzbdd zzbddVar = this.f22907x;
        if (zzbddVar != null) {
            zzbddVar.m17475e(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: k */
    public final void mo17413k(zzbcn zzbcnVar) {
        this.f22898o = zzbcnVar;
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.f22891h;
        if (f2 != 0.0f && this.f22907x == null) {
            float f3 = measuredWidth;
            float f4 = measuredHeight;
            float f5 = (f2 / (f3 / f4)) - 1.0f;
            if (f5 > 0.01f) {
                measuredHeight = (int) (f3 / f2);
            } else if (f5 < -0.01f) {
                measuredWidth = (int) (f4 * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbdd zzbddVar = this.f22907x;
        if (zzbddVar != null) {
            zzbddVar.m17476i(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i5 = this.f22886E;
            if (((i5 > 0 && i5 != measuredWidth) || ((i4 = this.f22887F) > 0 && i4 != measuredHeight)) && this.f22896m && m17516O() && this.f22901r.mo15990e() > 0 && !this.f22901r.mo15991f()) {
                m17525v(0.0f, true);
                this.f22901r.mo15986a(true);
                long jMo15990e = this.f22901r.mo15990e();
                long jMo14608a = zzk.zzln().mo14608a();
                while (m17516O() && this.f22901r.mo15990e() == jMo15990e && zzk.zzln().mo14608a() - jMo14608a <= 250) {
                }
                if (m17516O()) {
                    this.f22901r.mo15986a(false);
                }
                mo15161b();
            }
            this.f22886E = measuredWidth;
            this.f22887F = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) throws InterruptedException {
        int i4;
        if (this.f22908y) {
            zzbdd zzbddVar = new zzbdd(getContext());
            this.f22907x = zzbddVar;
            zzbddVar.m17474b(surfaceTexture, i2, i3);
            this.f22907x.start();
            SurfaceTexture surfaceTextureM17478k = this.f22907x.m17478k();
            if (surfaceTextureM17478k != null) {
                surfaceTexture = surfaceTextureM17478k;
            } else {
                this.f22907x.m17477j();
                this.f22907x = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f22899p = surface;
        if (this.f22901r == null) {
            m17518Q();
        } else {
            m17526w(surface, true);
            if (!this.f22897n.f22840a) {
                m17520S();
            }
        }
        float f2 = 1.0f;
        int i5 = this.f22883B;
        if (i5 != 0 && (i4 = this.f22884C) != 0) {
            f2 = this.f22885D;
            i2 = i5;
            i3 = i4;
        }
        m17507A(i2, i3, f2);
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.v8

            /* renamed from: f */
            private final zzbdq f20729f;

            {
                this.f20729f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20729f.m17536V();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawz.m17082m("Surface destroyed");
        mo17408c();
        zzbdd zzbddVar = this.f22907x;
        if (zzbddVar != null) {
            zzbddVar.m17477j();
            this.f22907x = null;
        }
        if (this.f22901r != null) {
            m17521T();
            Surface surface = this.f22899p;
            if (surface != null) {
                surface.release();
            }
            this.f22899p = null;
            m17526w(null, true);
        }
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.x8

            /* renamed from: f */
            private final zzbdq f20953f;

            {
                this.f20953f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20953f.m17535U();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzbdd zzbddVar = this.f22907x;
        if (zzbddVar != null) {
            zzbddVar.m17476i(i2, i3);
        }
        zzaxi.f22654a.post(new Runnable(this, i2, i3) { // from class: com.google.android.gms.internal.ads.w8

            /* renamed from: f */
            private final zzbdq f20839f;

            /* renamed from: g */
            private final int f20840g;

            /* renamed from: h */
            private final int f20841h;

            {
                this.f20839f = this;
                this.f20840g = i2;
                this.f20841h = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20839f.m17533K(this.f20840g, this.f20841h);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f22895l.m17485c(this);
        this.f22786f.m17464a(surfaceTexture, this.f22898o);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView1 window visibility changed to ");
        sb.append(i2);
        zzawz.m17082m(sb.toString());
        zzaxi.f22654a.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.n8

            /* renamed from: f */
            private final zzbdq f19994f;

            /* renamed from: g */
            private final int f19995g;

            {
                this.f19994f = this;
                this.f19995g = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19994f.m17532H(this.f19995g);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: r */
    public final String mo17414r() {
        String string;
        int i2 = this.f22894k;
        if (i2 == 1) {
            string = "/Framework";
        } else if (i2 == 2) {
            StringBuilder sb = new StringBuilder("null".length() + 12);
            sb.append("/Extractor(");
            sb.append((String) null);
            sb.append(")");
            string = sb.toString();
        } else {
            string = "/Unknown";
        }
        String str = this.f22908y ? " spherical" : HttpUrl.FRAGMENT_ENCODE_SET;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + str.length());
        sb2.append("ExoPlayer/1");
        sb2.append(string);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void setVideoPath(String str) {
        if (str == null) {
            zzbad.m17353i("Path is null.");
        } else {
            this.f22904u = str;
            m17518Q();
        }
    }
}
