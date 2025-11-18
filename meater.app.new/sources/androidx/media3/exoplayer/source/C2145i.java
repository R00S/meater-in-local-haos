package androidx.media3.exoplayer.source;

import S2.r;
import U1.s;
import U1.v;
import X1.C1804a;
import android.content.Context;
import androidx.media3.datasource.a;
import androidx.media3.datasource.b;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2148l;
import androidx.media3.exoplayer.source.I;
import androidx.media3.exoplayer.source.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import m8.AbstractC4009y;
import r2.e;
import v2.C4806l;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;

/* compiled from: DefaultMediaSourceFactory.java */
/* renamed from: androidx.media3.exoplayer.source.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145i implements t {

    /* renamed from: c, reason: collision with root package name */
    private final a f27746c;

    /* renamed from: d, reason: collision with root package name */
    private a.InterfaceC0371a f27747d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f27748e;

    /* renamed from: f, reason: collision with root package name */
    private r.a f27749f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC2146j f27750g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f27751h;

    /* renamed from: i, reason: collision with root package name */
    private long f27752i;

    /* renamed from: j, reason: collision with root package name */
    private long f27753j;

    /* renamed from: k, reason: collision with root package name */
    private long f27754k;

    /* renamed from: l, reason: collision with root package name */
    private float f27755l;

    /* renamed from: m, reason: collision with root package name */
    private float f27756m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27757n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultMediaSourceFactory.java */
    /* renamed from: androidx.media3.exoplayer.source.i$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final v2.u f27758a;

        /* renamed from: d, reason: collision with root package name */
        private a.InterfaceC0371a f27761d;

        /* renamed from: f, reason: collision with root package name */
        private r.a f27763f;

        /* renamed from: g, reason: collision with root package name */
        private e.a f27764g;

        /* renamed from: h, reason: collision with root package name */
        private i2.k f27765h;

        /* renamed from: i, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f27766i;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Integer, l8.s<r.a>> f27759b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map<Integer, r.a> f27760c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private boolean f27762e = true;

        public a(v2.u uVar, r.a aVar) {
            this.f27758a = uVar;
            this.f27763f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ r.a k(a.InterfaceC0371a interfaceC0371a) {
            return new C.b(interfaceC0371a, this.f27758a);
        }

        private l8.s<r.a> l(int i10) {
            l8.s<r.a> sVar;
            l8.s<r.a> sVar2;
            l8.s<r.a> sVar3 = this.f27759b.get(Integer.valueOf(i10));
            if (sVar3 != null) {
                return sVar3;
            }
            final a.InterfaceC0371a interfaceC0371a = (a.InterfaceC0371a) C1804a.e(this.f27761d);
            if (i10 == 0) {
                int i11 = DashMediaSource.Factory.f26918l;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(r.a.class);
                sVar = new l8.s() { // from class: androidx.media3.exoplayer.source.d
                    @Override // l8.s
                    public final Object get() {
                        return C2145i.i(clsAsSubclass, interfaceC0371a);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(r.a.class);
                sVar = new l8.s() { // from class: androidx.media3.exoplayer.source.e
                    @Override // l8.s
                    public final Object get() {
                        return C2145i.i(clsAsSubclass2, interfaceC0371a);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(r.a.class);
                        sVar2 = new l8.s() { // from class: androidx.media3.exoplayer.source.g
                            @Override // l8.s
                            public final Object get() {
                                return C2145i.h(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        sVar2 = new l8.s() { // from class: androidx.media3.exoplayer.source.h
                            @Override // l8.s
                            public final Object get() {
                                return this.f27744B.k(interfaceC0371a);
                            }
                        };
                    }
                    this.f27759b.put(Integer.valueOf(i10), sVar2);
                    return sVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(r.a.class);
                sVar = new l8.s() { // from class: androidx.media3.exoplayer.source.f
                    @Override // l8.s
                    public final Object get() {
                        return C2145i.i(clsAsSubclass4, interfaceC0371a);
                    }
                };
            }
            sVar2 = sVar;
            this.f27759b.put(Integer.valueOf(i10), sVar2);
            return sVar2;
        }

        public r.a f(int i10) {
            r.a aVar = this.f27760c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            r.a aVar2 = l(i10).get();
            e.a aVar3 = this.f27764g;
            if (aVar3 != null) {
                aVar2.f(aVar3);
            }
            i2.k kVar = this.f27765h;
            if (kVar != null) {
                aVar2.e(kVar);
            }
            androidx.media3.exoplayer.upstream.b bVar = this.f27766i;
            if (bVar != null) {
                aVar2.d(bVar);
            }
            aVar2.a(this.f27763f);
            aVar2.b(this.f27762e);
            this.f27760c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void m(e.a aVar) {
            this.f27764g = aVar;
            Iterator<r.a> it = this.f27760c.values().iterator();
            while (it.hasNext()) {
                it.next().f(aVar);
            }
        }

        public void n(a.InterfaceC0371a interfaceC0371a) {
            if (interfaceC0371a != this.f27761d) {
                this.f27761d = interfaceC0371a;
                this.f27759b.clear();
                this.f27760c.clear();
            }
        }

        public void o(i2.k kVar) {
            this.f27765h = kVar;
            Iterator<r.a> it = this.f27760c.values().iterator();
            while (it.hasNext()) {
                it.next().e(kVar);
            }
        }

        public void p(int i10) {
            v2.u uVar = this.f27758a;
            if (uVar instanceof C4806l) {
                ((C4806l) uVar).m(i10);
            }
        }

        public void q(androidx.media3.exoplayer.upstream.b bVar) {
            this.f27766i = bVar;
            Iterator<r.a> it = this.f27760c.values().iterator();
            while (it.hasNext()) {
                it.next().d(bVar);
            }
        }

        public void r(boolean z10) {
            this.f27762e = z10;
            this.f27758a.e(z10);
            Iterator<r.a> it = this.f27760c.values().iterator();
            while (it.hasNext()) {
                it.next().b(z10);
            }
        }

        public void s(r.a aVar) {
            this.f27763f = aVar;
            this.f27758a.a(aVar);
            Iterator<r.a> it = this.f27760c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public C2145i(Context context, v2.u uVar) {
        this(new b.a(context), uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ r.a h(Class cls) {
        return n(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ r.a i(Class cls, a.InterfaceC0371a interfaceC0371a) {
        return o(cls, interfaceC0371a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC4810p[] k(U1.s sVar) {
        return new InterfaceC4810p[]{this.f27748e.a(sVar) ? new S2.n(this.f27748e.b(sVar), sVar) : new b(sVar)};
    }

    private static r l(U1.v vVar, r rVar) {
        v.d dVar = vVar.f17238f;
        if (dVar.f17263b == 0 && dVar.f17265d == Long.MIN_VALUE && !dVar.f17267f) {
            return rVar;
        }
        v.d dVar2 = vVar.f17238f;
        return new ClippingMediaSource(rVar, dVar2.f17263b, dVar2.f17265d, !dVar2.f17268g, dVar2.f17266e, dVar2.f17267f);
    }

    private r m(U1.v vVar, r rVar) {
        C1804a.e(vVar.f17234b);
        vVar.f17234b.getClass();
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a n(Class<? extends r.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a o(Class<? extends r.a> cls, a.InterfaceC0371a interfaceC0371a) {
        try {
            return cls.getConstructor(a.InterfaceC0371a.class).newInstance(interfaceC0371a);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public r c(U1.v vVar) {
        C1804a.e(vVar.f17234b);
        String scheme = vVar.f17234b.f17326a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((r.a) C1804a.e(this.f27749f)).c(vVar);
        }
        if (Objects.equals(vVar.f17234b.f17327b, "application/x-image-uri")) {
            return new C2148l.b(X1.L.Q0(vVar.f17234b.f17334i), (InterfaceC2146j) C1804a.e(this.f27750g)).c(vVar);
        }
        v.h hVar = vVar.f17234b;
        int iZ0 = X1.L.z0(hVar.f17326a, hVar.f17327b);
        if (vVar.f17234b.f17334i != -9223372036854775807L) {
            this.f27746c.p(1);
        }
        try {
            r.a aVarF = this.f27746c.f(iZ0);
            v.g.a aVarA = vVar.f17236d.a();
            if (vVar.f17236d.f17308a == -9223372036854775807L) {
                aVarA.k(this.f27752i);
            }
            if (vVar.f17236d.f17311d == -3.4028235E38f) {
                aVarA.j(this.f27755l);
            }
            if (vVar.f17236d.f17312e == -3.4028235E38f) {
                aVarA.h(this.f27756m);
            }
            if (vVar.f17236d.f17309b == -9223372036854775807L) {
                aVarA.i(this.f27753j);
            }
            if (vVar.f17236d.f17310c == -9223372036854775807L) {
                aVarA.g(this.f27754k);
            }
            v.g gVarF = aVarA.f();
            if (!gVarF.equals(vVar.f17236d)) {
                vVar = vVar.a().b(gVarF).a();
            }
            r rVarC = aVarF.c(vVar);
            AbstractC4009y<v.k> abstractC4009y = ((v.h) X1.L.i(vVar.f17234b)).f17331f;
            if (!abstractC4009y.isEmpty()) {
                r[] rVarArr = new r[abstractC4009y.size() + 1];
                rVarArr[0] = rVarC;
                for (int i10 = 0; i10 < abstractC4009y.size(); i10++) {
                    if (this.f27757n) {
                        final U1.s sVarM = new s.b().s0(abstractC4009y.get(i10).f17353b).i0(abstractC4009y.get(i10).f17354c).u0(abstractC4009y.get(i10).f17355d).q0(abstractC4009y.get(i10).f17356e).g0(abstractC4009y.get(i10).f17357f).e0(abstractC4009y.get(i10).f17358g).M();
                        C.b bVarL = new C.b(this.f27747d, new v2.u() { // from class: n2.g
                            @Override // v2.u
                            public final InterfaceC4810p[] d() {
                                return this.f45617b.k(sVarM);
                            }
                        }).l(true);
                        androidx.media3.exoplayer.upstream.b bVar = this.f27751h;
                        if (bVar != null) {
                            bVarL.d(bVar);
                        }
                        rVarArr[i10 + 1] = bVarL.c(U1.v.c(abstractC4009y.get(i10).f17352a.toString()));
                    } else {
                        I.b bVar2 = new I.b(this.f27747d);
                        androidx.media3.exoplayer.upstream.b bVar3 = this.f27751h;
                        if (bVar3 != null) {
                            bVar2.b(bVar3);
                        }
                        rVarArr[i10 + 1] = bVar2.a(abstractC4009y.get(i10), -9223372036854775807L);
                    }
                }
                rVarC = new MergingMediaSource(rVarArr);
            }
            return m(vVar, l(vVar, rVarC));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    @Deprecated
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2145i b(boolean z10) {
        this.f27757n = z10;
        this.f27746c.r(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C2145i f(e.a aVar) {
        this.f27746c.m((e.a) C1804a.e(aVar));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2145i e(i2.k kVar) {
        this.f27746c.o((i2.k) C1804a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2145i d(androidx.media3.exoplayer.upstream.b bVar) {
        this.f27751h = (androidx.media3.exoplayer.upstream.b) C1804a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f27746c.q(bVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C2145i a(r.a aVar) {
        this.f27748e = (r.a) C1804a.e(aVar);
        this.f27746c.s(aVar);
        return this;
    }

    public C2145i(a.InterfaceC0371a interfaceC0371a, v2.u uVar) {
        this.f27747d = interfaceC0371a;
        S2.h hVar = new S2.h();
        this.f27748e = hVar;
        a aVar = new a(uVar, hVar);
        this.f27746c = aVar;
        aVar.n(interfaceC0371a);
        this.f27752i = -9223372036854775807L;
        this.f27753j = -9223372036854775807L;
        this.f27754k = -9223372036854775807L;
        this.f27755l = -3.4028235E38f;
        this.f27756m = -3.4028235E38f;
        this.f27757n = true;
    }

    /* compiled from: DefaultMediaSourceFactory.java */
    /* renamed from: androidx.media3.exoplayer.source.i$b */
    private static final class b implements InterfaceC4810p {

        /* renamed from: a, reason: collision with root package name */
        private final U1.s f27767a;

        public b(U1.s sVar) {
            this.f27767a = sVar;
        }

        @Override // v2.InterfaceC4810p
        public boolean d(InterfaceC4811q interfaceC4811q) {
            return true;
        }

        @Override // v2.InterfaceC4810p
        public void h(v2.r rVar) {
            O oA = rVar.a(0, 3);
            rVar.f(new J.b(-9223372036854775807L));
            rVar.n();
            oA.f(this.f27767a.b().s0("text/x-unknown").R(this.f27767a.f17162o).M());
        }

        @Override // v2.InterfaceC4810p
        public int i(InterfaceC4811q interfaceC4811q, v2.I i10) {
            return interfaceC4811q.b(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // v2.InterfaceC4810p
        public void c() {
        }

        @Override // v2.InterfaceC4810p
        public void b(long j10, long j11) {
        }
    }
}
