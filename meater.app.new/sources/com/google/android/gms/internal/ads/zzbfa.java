package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzbfa implements zzkw, zzqi, zzsj<zzrv>, zztn {

    /* renamed from: f */
    @VisibleForTesting
    private static int f22949f;

    /* renamed from: g */
    @VisibleForTesting
    private static int f22950g;

    /* renamed from: h */
    private final Context f22951h;

    /* renamed from: i */
    private final zzbez f22952i;

    /* renamed from: j */
    private final zzlo f22953j;

    /* renamed from: k */
    private final zzlo f22954k;

    /* renamed from: l */
    private final zzrj f22955l;

    /* renamed from: m */
    private final zzbde f22956m;

    /* renamed from: n */
    private zzkv f22957n;

    /* renamed from: o */
    private ByteBuffer f22958o;

    /* renamed from: p */
    private boolean f22959p;

    /* renamed from: q */
    private zzbfi f22960q;

    /* renamed from: r */
    private int f22961r;

    /* renamed from: s */
    private Set<WeakReference<C6924m9>> f22962s = new HashSet();

    public zzbfa(Context context, zzbde zzbdeVar) {
        this.f22951h = context;
        this.f22956m = zzbdeVar;
        zzbez zzbezVar = new zzbez();
        this.f22952i = zzbezVar;
        zzpg zzpgVar = zzpg.f26808a;
        zzth zzthVar = new zzth(context, zzpgVar, 0L, zzaxi.f22654a, this, -1);
        this.f22953j = zzthVar;
        zzms zzmsVar = new zzms(zzpgVar);
        this.f22954k = zzmsVar;
        zzrg zzrgVar = new zzrg();
        this.f22955l = zzrgVar;
        if (zzawz.m17083n()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(strValueOf);
            zzawz.m17082m(sb.toString());
        }
        f22949f++;
        zzkv zzkvVarM20194a = zzkz.m20194a(new zzlo[]{zzmsVar, zzthVar}, zzrgVar, zzbezVar);
        this.f22957n = zzkvVarM20194a;
        zzkvVarM20194a.mo15589m(this);
    }

    /* renamed from: G */
    public static int m17579G() {
        return f22949f;
    }

    /* renamed from: H */
    public static int m17580H() {
        return f22950g;
    }

    @VisibleForTesting
    /* renamed from: u */
    private final zzql m17581u(Uri uri, final String str) {
        final zzrw zzrwVar;
        if (!this.f22959p || this.f22958o.limit() <= 0) {
            zzrwVar = this.f22956m.f22848i > 0 ? new zzrw(this, str) { // from class: com.google.android.gms.internal.ads.p9

                /* renamed from: a */
                private final zzbfa f20288a;

                /* renamed from: b */
                private final String f20289b;

                {
                    this.f20288a = this;
                    this.f20289b = str;
                }

                @Override // com.google.android.gms.internal.ads.zzrw
                /* renamed from: a */
                public final zzrv mo15673a() {
                    return this.f20288a.m17586E(this.f20289b);
                }
            } : new zzrw(this, str) { // from class: com.google.android.gms.internal.ads.q9

                /* renamed from: a */
                private final zzbfa f20382a;

                /* renamed from: b */
                private final String f20383b;

                {
                    this.f20382a = this;
                    this.f20383b = str;
                }

                @Override // com.google.android.gms.internal.ads.zzrw
                /* renamed from: a */
                public final zzrv mo15673a() {
                    return this.f20382a.m17585D(this.f20383b);
                }
            };
            if (this.f22956m.f22849j) {
                zzrwVar = new zzrw(this, zzrwVar) { // from class: com.google.android.gms.internal.ads.r9

                    /* renamed from: a */
                    private final zzbfa f20441a;

                    /* renamed from: b */
                    private final zzrw f20442b;

                    {
                        this.f20441a = this;
                        this.f20442b = zzrwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzrw
                    /* renamed from: a */
                    public final zzrv mo15673a() {
                        return this.f20441a.m17610v(this.f20442b);
                    }
                };
            }
            if (this.f22958o.limit() > 0) {
                final byte[] bArr = new byte[this.f22958o.limit()];
                this.f22958o.get(bArr);
                zzrwVar = new zzrw(zzrwVar, bArr) { // from class: com.google.android.gms.internal.ads.s9

                    /* renamed from: a */
                    private final zzrw f20513a;

                    /* renamed from: b */
                    private final byte[] f20514b;

                    {
                        this.f20513a = zzrwVar;
                        this.f20514b = bArr;
                    }

                    @Override // com.google.android.gms.internal.ads.zzrw
                    /* renamed from: a */
                    public final zzrv mo15673a() {
                        zzrw zzrwVar2 = this.f20513a;
                        byte[] bArr2 = this.f20514b;
                        return new C7257v9(new zzru(bArr2), bArr2.length, zzrwVar2.mo15673a());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.f22958o.limit()];
            this.f22958o.get(bArr2);
            zzrwVar = new zzrw(bArr2) { // from class: com.google.android.gms.internal.ads.o9

                /* renamed from: a */
                private final byte[] f20145a;

                {
                    this.f20145a = bArr2;
                }

                @Override // com.google.android.gms.internal.ads.zzrw
                /* renamed from: a */
                public final zzrv mo15673a() {
                    return new zzru(this.f20145a);
                }
            };
        }
        return new zzqh(uri, zzrwVar, C7183t9.f20562a, -1, zzaxi.f22654a, this, null, this.f22956m.f22846g);
    }

    /* renamed from: A */
    final void m17582A(boolean z) {
        for (int i2 = 0; i2 < this.f22957n.mo15584h(); i2++) {
            this.f22955l.m20447f(i2, !z);
        }
    }

    /* renamed from: B */
    final void m17583B(float f2, boolean z) {
        zzky zzkyVar = new zzky(this.f22954k, 2, Float.valueOf(f2));
        if (z) {
            this.f22957n.mo15587k(zzkyVar);
        } else {
            this.f22957n.mo15585i(zzkyVar);
        }
    }

    /* renamed from: C */
    public final void m17584C(int i2) {
        Iterator<WeakReference<C6924m9>> it = this.f22962s.iterator();
        while (it.hasNext()) {
            C6924m9 c6924m9 = it.next().get();
            if (c6924m9 != null) {
                c6924m9.m15550b(i2);
            }
        }
    }

    /* renamed from: D */
    final /* synthetic */ zzrv m17585D(String str) {
        zzbde zzbdeVar = this.f22956m;
        return new zzsa(str, null, zzbdeVar.f22849j ? null : this, zzbdeVar.f22843d, zzbdeVar.f22845f, true, null);
    }

    /* renamed from: E */
    final /* synthetic */ zzrv m17586E(String str) {
        zzbde zzbdeVar = this.f22956m;
        C6924m9 c6924m9 = new C6924m9(str, zzbdeVar.f22849j ? null : this, zzbdeVar.f22843d, zzbdeVar.f22845f, zzbdeVar.f22848i);
        this.f22962s.add(new WeakReference<>(c6924m9));
        return c6924m9;
    }

    /* renamed from: F */
    final /* synthetic */ void m17587F(boolean z, long j2) {
        zzbfi zzbfiVar = this.f22960q;
        if (zzbfiVar != null) {
            zzbfiVar.mo17559a(z, j2);
        }
    }

    /* renamed from: I */
    public final zzkv m17588I() {
        return this.f22957n;
    }

    /* renamed from: J */
    public final zzbez m17589J() {
        return this.f22952i;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: a */
    public final void mo17590a(boolean z, int i2) {
        zzbfi zzbfiVar = this.f22960q;
        if (zzbfiVar != null) {
            zzbfiVar.mo17560e(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: b */
    public final void mo17591b(int i2, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: c */
    public final void mo17592c() {
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17593d(zzrv zzrvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: e */
    public final void mo17594e(zzrb zzrbVar, zzro zzroVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    /* renamed from: f */
    public final void mo17595f(IOException iOException) {
        zzbfi zzbfiVar = this.f22960q;
        if (zzbfiVar != null) {
            zzbfiVar.mo17561f("onLoadError", iOException);
        }
    }

    public final void finalize() throws Throwable {
        f22949f--;
        if (zzawz.m17083n()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(strValueOf);
            zzawz.m17082m(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: g */
    public final void mo17596g(String str, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: h */
    public final void mo17597h(zzln zzlnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: i */
    public final void mo17598i(zzlr zzlrVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: j */
    public final void mo17599j(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: k */
    public final void mo17600k(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    /* renamed from: l */
    public final void mo17601l(zzku zzkuVar) {
        zzbfi zzbfiVar = this.f22960q;
        if (zzbfiVar != null) {
            zzbfiVar.mo17561f("onPlayerError", zzkuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: m */
    public final void mo17602m(int i2, int i3, int i4, float f2) {
        zzbfi zzbfiVar = this.f22960q;
        if (zzbfiVar != null) {
            zzbfiVar.mo17562g(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: n */
    public final /* synthetic */ void mo17603n(zzrv zzrvVar, zzry zzryVar) {
        this.f22961r = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: o */
    public final /* synthetic */ void mo17604o(zzrv zzrvVar, int i2) {
        this.f22961r += i2;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: p */
    public final void mo17605p(zznc zzncVar) {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: q */
    public final void mo17606q(zzlh zzlhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    /* renamed from: r */
    public final void mo17607r(zznc zzncVar) {
    }

    /* renamed from: s */
    public final long m17608s() {
        return this.f22961r;
    }

    /* renamed from: t */
    public final void m17609t() {
        zzkv zzkvVar = this.f22957n;
        if (zzkvVar != null) {
            zzkvVar.mo15588l(this);
            this.f22957n.mo15579c();
            this.f22957n = null;
            f22950g--;
        }
    }

    /* renamed from: v */
    final /* synthetic */ zzrv m17610v(zzrw zzrwVar) {
        return new zzbex(this.f22951h, zzrwVar.mo15673a(), this, new zzbey(this) { // from class: com.google.android.gms.internal.ads.u9

            /* renamed from: a */
            private final zzbfa f20622a;

            {
                this.f20622a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbey
            /* renamed from: a */
            public final void mo15925a(boolean z, long j2) {
                this.f20622a.m17587F(z, j2);
            }
        });
    }

    /* renamed from: w */
    final void m17611w(Surface surface, boolean z) {
        zzky zzkyVar = new zzky(this.f22953j, 1, surface);
        if (z) {
            this.f22957n.mo15587k(zzkyVar);
        } else {
            this.f22957n.mo15585i(zzkyVar);
        }
    }

    /* renamed from: x */
    public final void m17612x(zzbfi zzbfiVar) {
        this.f22960q = zzbfiVar;
    }

    /* renamed from: y */
    public final void m17613y(Uri[] uriArr, String str) {
        m17614z(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: z */
    public final void m17614z(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzql zzqoVar;
        this.f22958o = byteBuffer;
        this.f22959p = z;
        if (uriArr.length == 1) {
            zzqoVar = m17581u(uriArr[0], str);
        } else {
            zzql[] zzqlVarArr = new zzql[uriArr.length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                zzqlVarArr[i2] = m17581u(uriArr[i2], str);
            }
            zzqoVar = new zzqo(zzqlVarArr);
        }
        this.f22957n.mo15586j(zzqoVar);
        f22950g++;
    }
}
