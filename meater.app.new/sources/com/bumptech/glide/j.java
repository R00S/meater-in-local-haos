package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import o6.AbstractC4137a;

/* compiled from: RequestBuilder.java */
/* loaded from: classes2.dex */
public class j<TranscodeType> extends D6.a<j<TranscodeType>> implements Cloneable {

    /* renamed from: p0, reason: collision with root package name */
    protected static final D6.g f32981p0 = new D6.g().g(AbstractC4137a.f46570c).b0(g.LOW).l0(true);

    /* renamed from: b0, reason: collision with root package name */
    private final Context f32982b0;

    /* renamed from: c0, reason: collision with root package name */
    private final k f32983c0;

    /* renamed from: d0, reason: collision with root package name */
    private final Class<TranscodeType> f32984d0;

    /* renamed from: e0, reason: collision with root package name */
    private final b f32985e0;

    /* renamed from: f0, reason: collision with root package name */
    private final d f32986f0;

    /* renamed from: g0, reason: collision with root package name */
    private l<?, ? super TranscodeType> f32987g0;

    /* renamed from: h0, reason: collision with root package name */
    private Object f32988h0;

    /* renamed from: i0, reason: collision with root package name */
    private List<D6.f<TranscodeType>> f32989i0;

    /* renamed from: j0, reason: collision with root package name */
    private j<TranscodeType> f32990j0;

    /* renamed from: k0, reason: collision with root package name */
    private j<TranscodeType> f32991k0;

    /* renamed from: l0, reason: collision with root package name */
    private Float f32992l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f32993m0 = true;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f32994n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f32995o0;

    /* compiled from: RequestBuilder.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32996a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f32997b;

        static {
            int[] iArr = new int[g.values().length];
            f32997b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32997b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32997b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32997b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f32996a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32996a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32996a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32996a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32996a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32996a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32996a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32996a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.f32985e0 = bVar;
        this.f32983c0 = kVar;
        this.f32984d0 = cls;
        this.f32982b0 = context;
        this.f32987g0 = kVar.s(cls);
        this.f32986f0 = bVar.i();
        C0(kVar.q());
        b(kVar.r());
    }

    private g B0(g gVar) {
        int i10 = a.f32997b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + v());
    }

    @SuppressLint({"CheckResult"})
    private void C0(List<D6.f<Object>> list) {
        Iterator<D6.f<Object>> it = list.iterator();
        while (it.hasNext()) {
            t0((D6.f) it.next());
        }
    }

    private <Y extends E6.i<TranscodeType>> Y E0(Y y10, D6.f<TranscodeType> fVar, D6.a<?> aVar, Executor executor) {
        H6.k.d(y10);
        if (!this.f32994n0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        D6.d dVarX0 = x0(y10, fVar, aVar, executor);
        D6.d dVarI = y10.i();
        if (dVarX0.h(dVarI) && !I0(aVar, dVarI)) {
            if (!((D6.d) H6.k.d(dVarI)).isRunning()) {
                dVarI.j();
            }
            return y10;
        }
        this.f32983c0.o(y10);
        y10.d(dVarX0);
        this.f32983c0.C(y10, dVarX0);
        return y10;
    }

    private boolean I0(D6.a<?> aVar, D6.d dVar) {
        return !aVar.I() && dVar.k();
    }

    private j<TranscodeType> P0(Object obj) {
        if (G()) {
            return clone().P0(obj);
        }
        this.f32988h0 = obj;
        this.f32994n0 = true;
        return g0();
    }

    private j<TranscodeType> Q0(Uri uri, j<TranscodeType> jVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? jVar : w0(jVar);
    }

    private D6.d R0(Object obj, E6.i<TranscodeType> iVar, D6.f<TranscodeType> fVar, D6.a<?> aVar, D6.e eVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f32982b0;
        d dVar = this.f32986f0;
        return D6.i.z(context, dVar, obj, this.f32988h0, this.f32984d0, aVar, i10, i11, gVar, iVar, fVar, this.f32989i0, eVar, dVar.f(), lVar.c(), executor);
    }

    private j<TranscodeType> w0(j<TranscodeType> jVar) {
        return jVar.m0(this.f32982b0.getTheme()).j0(G6.a.c(this.f32982b0));
    }

    private D6.d x0(E6.i<TranscodeType> iVar, D6.f<TranscodeType> fVar, D6.a<?> aVar, Executor executor) {
        return y0(new Object(), iVar, fVar, null, this.f32987g0, aVar.v(), aVar.s(), aVar.r(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private D6.d y0(Object obj, E6.i<TranscodeType> iVar, D6.f<TranscodeType> fVar, D6.e eVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, D6.a<?> aVar, Executor executor) {
        D6.e eVar2;
        D6.e bVar;
        if (this.f32991k0 != null) {
            bVar = new D6.b(obj, eVar);
            eVar2 = bVar;
        } else {
            eVar2 = null;
            bVar = eVar;
        }
        D6.d dVarZ0 = z0(obj, iVar, fVar, bVar, lVar, gVar, i10, i11, aVar, executor);
        if (eVar2 == null) {
            return dVarZ0;
        }
        int iS = this.f32991k0.s();
        int iR = this.f32991k0.r();
        if (H6.l.t(i10, i11) && !this.f32991k0.R()) {
            iS = aVar.s();
            iR = aVar.r();
        }
        j<TranscodeType> jVar = this.f32991k0;
        D6.b bVar2 = eVar2;
        bVar2.p(dVarZ0, jVar.y0(obj, iVar, fVar, bVar2, jVar.f32987g0, jVar.v(), iS, iR, this.f32991k0, executor));
        return bVar2;
    }

    private D6.d z0(Object obj, E6.i<TranscodeType> iVar, D6.f<TranscodeType> fVar, D6.e eVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, D6.a<?> aVar, Executor executor) {
        j<TranscodeType> jVar = this.f32990j0;
        if (jVar == null) {
            if (this.f32992l0 == null) {
                return R0(obj, iVar, fVar, aVar, eVar, lVar, gVar, i10, i11, executor);
            }
            D6.j jVar2 = new D6.j(obj, eVar);
            jVar2.o(R0(obj, iVar, fVar, aVar, jVar2, lVar, gVar, i10, i11, executor), R0(obj, iVar, fVar, aVar.clone().k0(this.f32992l0.floatValue()), jVar2, lVar, B0(gVar), i10, i11, executor));
            return jVar2;
        }
        if (this.f32995o0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar2 = jVar.f32993m0 ? lVar : jVar.f32987g0;
        g gVarV = jVar.J() ? this.f32990j0.v() : B0(gVar);
        int iS = this.f32990j0.s();
        int iR = this.f32990j0.r();
        if (H6.l.t(i10, i11) && !this.f32990j0.R()) {
            iS = aVar.s();
            iR = aVar.r();
        }
        D6.j jVar3 = new D6.j(obj, eVar);
        D6.d dVarR0 = R0(obj, iVar, fVar, aVar, jVar3, lVar, gVar, i10, i11, executor);
        this.f32995o0 = true;
        j<TranscodeType> jVar4 = this.f32990j0;
        D6.d dVarY0 = jVar4.y0(obj, iVar, fVar, jVar3, lVar2, gVarV, iS, iR, jVar4, executor);
        this.f32995o0 = false;
        jVar3.o(dVarR0, dVarY0);
        return jVar3;
    }

    @Override // D6.a
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.f32987g0 = jVar.f32987g0.clone();
        if (jVar.f32989i0 != null) {
            jVar.f32989i0 = new ArrayList(jVar.f32989i0);
        }
        j<TranscodeType> jVar2 = jVar.f32990j0;
        if (jVar2 != null) {
            jVar.f32990j0 = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.f32991k0;
        if (jVar3 != null) {
            jVar.f32991k0 = jVar3.clone();
        }
        return jVar;
    }

    public <Y extends E6.i<TranscodeType>> Y D0(Y y10) {
        return (Y) F0(y10, null, H6.e.b());
    }

    <Y extends E6.i<TranscodeType>> Y F0(Y y10, D6.f<TranscodeType> fVar, Executor executor) {
        return (Y) E0(y10, fVar, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E6.j<android.widget.ImageView, TranscodeType> H0(android.widget.ImageView r4) {
        /*
            r3 = this;
            H6.l.a()
            H6.k.d(r4)
            boolean r0 = r3.Q()
            if (r0 != 0) goto L4c
            boolean r0 = r3.O()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.j.a.f32996a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            D6.a r0 = r3.clone()
            D6.a r0 = r0.U()
            goto L4d
        L31:
            D6.a r0 = r3.clone()
            D6.a r0 = r0.V()
            goto L4d
        L3a:
            D6.a r0 = r3.clone()
            D6.a r0 = r0.U()
            goto L4d
        L43:
            D6.a r0 = r3.clone()
            D6.a r0 = r0.T()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f32986f0
            java.lang.Class<TranscodeType> r2 = r3.f32984d0
            E6.j r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = H6.e.b()
            E6.i r4 = r3.E0(r4, r1, r0, r2)
            E6.j r4 = (E6.j) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.H0(android.widget.ImageView):E6.j");
    }

    public j<TranscodeType> J0(D6.f<TranscodeType> fVar) {
        if (G()) {
            return clone().J0(fVar);
        }
        this.f32989i0 = null;
        return t0(fVar);
    }

    public j<TranscodeType> K0(Uri uri) {
        return Q0(uri, P0(uri));
    }

    public j<TranscodeType> L0(Integer num) {
        return w0(P0(num));
    }

    public j<TranscodeType> M0(Object obj) {
        return P0(obj);
    }

    public j<TranscodeType> N0(String str) {
        return P0(str);
    }

    public E6.i<TranscodeType> S0() {
        return T0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public E6.i<TranscodeType> T0(int i10, int i11) {
        return D0(E6.g.m(this.f32983c0, i10, i11));
    }

    @Override // D6.a
    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(jVar) && Objects.equals(this.f32984d0, jVar.f32984d0) && this.f32987g0.equals(jVar.f32987g0) && Objects.equals(this.f32988h0, jVar.f32988h0) && Objects.equals(this.f32989i0, jVar.f32989i0) && Objects.equals(this.f32990j0, jVar.f32990j0) && Objects.equals(this.f32991k0, jVar.f32991k0) && Objects.equals(this.f32992l0, jVar.f32992l0) && this.f32993m0 == jVar.f32993m0 && this.f32994n0 == jVar.f32994n0;
    }

    @Override // D6.a
    public int hashCode() {
        return H6.l.p(this.f32994n0, H6.l.p(this.f32993m0, H6.l.o(this.f32992l0, H6.l.o(this.f32991k0, H6.l.o(this.f32990j0, H6.l.o(this.f32989i0, H6.l.o(this.f32988h0, H6.l.o(this.f32987g0, H6.l.o(this.f32984d0, super.hashCode())))))))));
    }

    public j<TranscodeType> t0(D6.f<TranscodeType> fVar) {
        if (G()) {
            return clone().t0(fVar);
        }
        if (fVar != null) {
            if (this.f32989i0 == null) {
                this.f32989i0 = new ArrayList();
            }
            this.f32989i0.add(fVar);
        }
        return g0();
    }

    @Override // D6.a
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> b(D6.a<?> aVar) {
        H6.k.d(aVar);
        return (j) super.b(aVar);
    }
}
