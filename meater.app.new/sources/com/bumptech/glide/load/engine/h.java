package com.bumptech.glide.load.engine;

import I6.a;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m6.C3971f;
import m6.C3972g;
import m6.EnumC3966a;
import m6.EnumC3968c;
import m6.InterfaceC3970e;
import m6.InterfaceC3975j;
import m6.InterfaceC3976k;
import o6.AbstractC4137a;
import o6.InterfaceC4138b;
import o6.InterfaceC4139c;
import q6.InterfaceC4316a;
import r1.InterfaceC4339f;

/* compiled from: DecodeJob.java */
/* loaded from: classes2.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {

    /* renamed from: E, reason: collision with root package name */
    private final e f33116E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC4339f<h<?>> f33117F;

    /* renamed from: I, reason: collision with root package name */
    private com.bumptech.glide.d f33120I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC3970e f33121J;

    /* renamed from: K, reason: collision with root package name */
    private com.bumptech.glide.g f33122K;

    /* renamed from: L, reason: collision with root package name */
    private m f33123L;

    /* renamed from: M, reason: collision with root package name */
    private int f33124M;

    /* renamed from: N, reason: collision with root package name */
    private int f33125N;

    /* renamed from: O, reason: collision with root package name */
    private AbstractC4137a f33126O;

    /* renamed from: P, reason: collision with root package name */
    private C3972g f33127P;

    /* renamed from: Q, reason: collision with root package name */
    private b<R> f33128Q;

    /* renamed from: R, reason: collision with root package name */
    private int f33129R;

    /* renamed from: S, reason: collision with root package name */
    private EnumC0456h f33130S;

    /* renamed from: T, reason: collision with root package name */
    private g f33131T;

    /* renamed from: U, reason: collision with root package name */
    private long f33132U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f33133V;

    /* renamed from: W, reason: collision with root package name */
    private Object f33134W;

    /* renamed from: X, reason: collision with root package name */
    private Thread f33135X;

    /* renamed from: Y, reason: collision with root package name */
    private InterfaceC3970e f33136Y;

    /* renamed from: Z, reason: collision with root package name */
    private InterfaceC3970e f33137Z;

    /* renamed from: a0, reason: collision with root package name */
    private Object f33138a0;

    /* renamed from: b0, reason: collision with root package name */
    private EnumC3966a f33139b0;

    /* renamed from: c0, reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f33140c0;

    /* renamed from: d0, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f33141d0;

    /* renamed from: e0, reason: collision with root package name */
    private volatile boolean f33142e0;

    /* renamed from: f0, reason: collision with root package name */
    private volatile boolean f33143f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f33144g0;

    /* renamed from: B, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f33113B = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: C, reason: collision with root package name */
    private final List<Throwable> f33114C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    private final I6.c f33115D = I6.c.a();

    /* renamed from: G, reason: collision with root package name */
    private final d<?> f33118G = new d<>();

    /* renamed from: H, reason: collision with root package name */
    private final f f33119H = new f();

    /* compiled from: DecodeJob.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33145a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f33146b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f33147c;

        static {
            int[] iArr = new int[EnumC3968c.values().length];
            f33147c = iArr;
            try {
                iArr[EnumC3968c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33147c[EnumC3968c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0456h.values().length];
            f33146b = iArr2;
            try {
                iArr2[EnumC0456h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33146b[EnumC0456h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33146b[EnumC0456h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33146b[EnumC0456h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33146b[EnumC0456h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f33145a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33145a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33145a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    interface b<R> {
        void a(GlideException glideException);

        void b(InterfaceC4139c<R> interfaceC4139c, EnumC3966a enumC3966a, boolean z10);

        void c(h<?> hVar);
    }

    /* compiled from: DecodeJob.java */
    private final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC3966a f33148a;

        c(EnumC3966a enumC3966a) {
            this.f33148a = enumC3966a;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public InterfaceC4139c<Z> a(InterfaceC4139c<Z> interfaceC4139c) {
            return h.this.J(this.f33148a, interfaceC4139c);
        }
    }

    /* compiled from: DecodeJob.java */
    private static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC3970e f33150a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC3975j<Z> f33151b;

        /* renamed from: c, reason: collision with root package name */
        private r<Z> f33152c;

        d() {
        }

        void a() {
            this.f33150a = null;
            this.f33151b = null;
            this.f33152c = null;
        }

        void b(e eVar, C3972g c3972g) {
            I6.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f33150a, new com.bumptech.glide.load.engine.e(this.f33151b, this.f33152c, c3972g));
            } finally {
                this.f33152c.g();
                I6.b.e();
            }
        }

        boolean c() {
            return this.f33152c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(InterfaceC3970e interfaceC3970e, InterfaceC3975j<X> interfaceC3975j, r<X> rVar) {
            this.f33150a = interfaceC3970e;
            this.f33151b = interfaceC3975j;
            this.f33152c = rVar;
        }
    }

    /* compiled from: DecodeJob.java */
    interface e {
        InterfaceC4316a a();
    }

    /* compiled from: DecodeJob.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33153a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33154b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33155c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f33155c || z10 || this.f33154b) && this.f33153a;
        }

        synchronized boolean b() {
            this.f33154b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f33155c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f33153a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f33154b = false;
            this.f33153a = false;
            this.f33155c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC0456h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, InterfaceC4339f<h<?>> interfaceC4339f) {
        this.f33116E = eVar;
        this.f33117F = interfaceC4339f;
    }

    private int A() {
        return this.f33122K.ordinal();
    }

    private void C(String str, long j10) {
        D(str, j10, null);
    }

    private void D(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(H6.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f33123L);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void E(InterfaceC4139c<R> interfaceC4139c, EnumC3966a enumC3966a, boolean z10) {
        Q();
        this.f33128Q.b(interfaceC4139c, enumC3966a, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F(InterfaceC4139c<R> interfaceC4139c, EnumC3966a enumC3966a, boolean z10) {
        r rVar;
        I6.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC4139c instanceof InterfaceC4138b) {
                ((InterfaceC4138b) interfaceC4139c).b();
            }
            if (this.f33118G.c()) {
                interfaceC4139c = r.e(interfaceC4139c);
                rVar = interfaceC4139c;
            } else {
                rVar = 0;
            }
            E(interfaceC4139c, enumC3966a, z10);
            this.f33130S = EnumC0456h.ENCODE;
            try {
                if (this.f33118G.c()) {
                    this.f33118G.b(this.f33116E, this.f33127P);
                }
                H();
                I6.b.e();
            } finally {
                if (rVar != 0) {
                    rVar.g();
                }
            }
        } catch (Throwable th) {
            I6.b.e();
            throw th;
        }
    }

    private void G() {
        Q();
        this.f33128Q.a(new GlideException("Failed to load resource", new ArrayList(this.f33114C)));
        I();
    }

    private void H() {
        if (this.f33119H.b()) {
            L();
        }
    }

    private void I() {
        if (this.f33119H.c()) {
            L();
        }
    }

    private void L() {
        this.f33119H.e();
        this.f33118G.a();
        this.f33113B.a();
        this.f33142e0 = false;
        this.f33120I = null;
        this.f33121J = null;
        this.f33127P = null;
        this.f33122K = null;
        this.f33123L = null;
        this.f33128Q = null;
        this.f33130S = null;
        this.f33141d0 = null;
        this.f33135X = null;
        this.f33136Y = null;
        this.f33138a0 = null;
        this.f33139b0 = null;
        this.f33140c0 = null;
        this.f33132U = 0L;
        this.f33143f0 = false;
        this.f33134W = null;
        this.f33114C.clear();
        this.f33117F.a(this);
    }

    private void M(g gVar) {
        this.f33131T = gVar;
        this.f33128Q.c(this);
    }

    private void N() {
        this.f33135X = Thread.currentThread();
        this.f33132U = H6.g.b();
        boolean zA = false;
        while (!this.f33143f0 && this.f33141d0 != null && !(zA = this.f33141d0.a())) {
            this.f33130S = y(this.f33130S);
            this.f33141d0 = x();
            if (this.f33130S == EnumC0456h.SOURCE) {
                M(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f33130S == EnumC0456h.FINISHED || this.f33143f0) && !zA) {
            G();
        }
    }

    private <Data, ResourceType> InterfaceC4139c<R> O(Data data, EnumC3966a enumC3966a, q<Data, ResourceType, R> qVar) {
        C3972g c3972gZ = z(enumC3966a);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f33120I.i().l(data);
        try {
            return qVar.a(eVarL, c3972gZ, this.f33124M, this.f33125N, new c(enumC3966a));
        } finally {
            eVarL.b();
        }
    }

    private void P() {
        int i10 = a.f33145a[this.f33131T.ordinal()];
        if (i10 == 1) {
            this.f33130S = y(EnumC0456h.INITIALIZE);
            this.f33141d0 = x();
            N();
        } else if (i10 == 2) {
            N();
        } else {
            if (i10 == 3) {
                w();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f33131T);
        }
    }

    private void Q() {
        Throwable th;
        this.f33115D.c();
        if (!this.f33142e0) {
            this.f33142e0 = true;
            return;
        }
        if (this.f33114C.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f33114C;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private <Data> InterfaceC4139c<R> u(com.bumptech.glide.load.data.d<?> dVar, Data data, EnumC3966a enumC3966a) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = H6.g.b();
            InterfaceC4139c<R> interfaceC4139cV = v(data, enumC3966a);
            if (Log.isLoggable("DecodeJob", 2)) {
                C("Decoded result " + interfaceC4139cV, jB);
            }
            return interfaceC4139cV;
        } finally {
            dVar.b();
        }
    }

    private <Data> InterfaceC4139c<R> v(Data data, EnumC3966a enumC3966a) {
        return O(data, enumC3966a, this.f33113B.h(data.getClass()));
    }

    private void w() {
        InterfaceC4139c<R> interfaceC4139cU;
        if (Log.isLoggable("DecodeJob", 2)) {
            D("Retrieved data", this.f33132U, "data: " + this.f33138a0 + ", cache key: " + this.f33136Y + ", fetcher: " + this.f33140c0);
        }
        try {
            interfaceC4139cU = u(this.f33140c0, this.f33138a0, this.f33139b0);
        } catch (GlideException e10) {
            e10.i(this.f33137Z, this.f33139b0);
            this.f33114C.add(e10);
            interfaceC4139cU = null;
        }
        if (interfaceC4139cU != null) {
            F(interfaceC4139cU, this.f33139b0, this.f33144g0);
        } else {
            N();
        }
    }

    private com.bumptech.glide.load.engine.f x() {
        int i10 = a.f33146b[this.f33130S.ordinal()];
        if (i10 == 1) {
            return new s(this.f33113B, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f33113B, this);
        }
        if (i10 == 3) {
            return new v(this.f33113B, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f33130S);
    }

    private EnumC0456h y(EnumC0456h enumC0456h) {
        int i10 = a.f33146b[enumC0456h.ordinal()];
        if (i10 == 1) {
            return this.f33126O.a() ? EnumC0456h.DATA_CACHE : y(EnumC0456h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f33133V ? EnumC0456h.FINISHED : EnumC0456h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0456h.FINISHED;
        }
        if (i10 == 5) {
            return this.f33126O.b() ? EnumC0456h.RESOURCE_CACHE : y(EnumC0456h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0456h);
    }

    private C3972g z(EnumC3966a enumC3966a) {
        C3972g c3972g = this.f33127P;
        boolean z10 = enumC3966a == EnumC3966a.RESOURCE_DISK_CACHE || this.f33113B.x();
        C3971f<Boolean> c3971f = com.bumptech.glide.load.resource.bitmap.o.f33344j;
        Boolean bool = (Boolean) c3972g.c(c3971f);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return c3972g;
        }
        C3972g c3972g2 = new C3972g();
        c3972g2.d(this.f33127P);
        c3972g2.f(c3971f, Boolean.valueOf(z10));
        return c3972g2;
    }

    h<R> B(com.bumptech.glide.d dVar, Object obj, m mVar, InterfaceC3970e interfaceC3970e, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, AbstractC4137a abstractC4137a, Map<Class<?>, InterfaceC3976k<?>> map, boolean z10, boolean z11, boolean z12, C3972g c3972g, b<R> bVar, int i12) {
        this.f33113B.v(dVar, obj, interfaceC3970e, i10, i11, abstractC4137a, cls, cls2, gVar, c3972g, map, z10, z11, this.f33116E);
        this.f33120I = dVar;
        this.f33121J = interfaceC3970e;
        this.f33122K = gVar;
        this.f33123L = mVar;
        this.f33124M = i10;
        this.f33125N = i11;
        this.f33126O = abstractC4137a;
        this.f33133V = z12;
        this.f33127P = c3972g;
        this.f33128Q = bVar;
        this.f33129R = i12;
        this.f33131T = g.INITIALIZE;
        this.f33134W = obj;
        return this;
    }

    <Z> InterfaceC4139c<Z> J(EnumC3966a enumC3966a, InterfaceC4139c<Z> interfaceC4139c) {
        InterfaceC4139c<Z> interfaceC4139cA;
        InterfaceC3976k<Z> interfaceC3976k;
        EnumC3968c enumC3968cB;
        InterfaceC3970e dVar;
        Class<?> cls = interfaceC4139c.get().getClass();
        InterfaceC3975j<Z> interfaceC3975jN = null;
        if (enumC3966a != EnumC3966a.RESOURCE_DISK_CACHE) {
            InterfaceC3976k<Z> interfaceC3976kS = this.f33113B.s(cls);
            interfaceC3976k = interfaceC3976kS;
            interfaceC4139cA = interfaceC3976kS.a(this.f33120I, interfaceC4139c, this.f33124M, this.f33125N);
        } else {
            interfaceC4139cA = interfaceC4139c;
            interfaceC3976k = null;
        }
        if (!interfaceC4139c.equals(interfaceC4139cA)) {
            interfaceC4139c.c();
        }
        if (this.f33113B.w(interfaceC4139cA)) {
            interfaceC3975jN = this.f33113B.n(interfaceC4139cA);
            enumC3968cB = interfaceC3975jN.b(this.f33127P);
        } else {
            enumC3968cB = EnumC3968c.NONE;
        }
        InterfaceC3975j interfaceC3975j = interfaceC3975jN;
        if (!this.f33126O.d(!this.f33113B.y(this.f33136Y), enumC3966a, enumC3968cB)) {
            return interfaceC4139cA;
        }
        if (interfaceC3975j == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC4139cA.get().getClass());
        }
        int i10 = a.f33147c[enumC3968cB.ordinal()];
        if (i10 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f33136Y, this.f33121J);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC3968cB);
            }
            dVar = new t(this.f33113B.b(), this.f33136Y, this.f33121J, this.f33124M, this.f33125N, interfaceC3976k, cls, this.f33127P);
        }
        r rVarE = r.e(interfaceC4139cA);
        this.f33118G.d(dVar, interfaceC3975j, rVarE);
        return rVarE;
    }

    void K(boolean z10) {
        if (this.f33119H.d(z10)) {
            L();
        }
    }

    boolean R() {
        EnumC0456h enumC0456hY = y(EnumC0456h.INITIALIZE);
        return enumC0456hY == EnumC0456h.RESOURCE_CACHE || enumC0456hY == EnumC0456h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(InterfaceC3970e interfaceC3970e, Object obj, com.bumptech.glide.load.data.d<?> dVar, EnumC3966a enumC3966a, InterfaceC3970e interfaceC3970e2) {
        this.f33136Y = interfaceC3970e;
        this.f33138a0 = obj;
        this.f33140c0 = dVar;
        this.f33139b0 = enumC3966a;
        this.f33137Z = interfaceC3970e2;
        this.f33144g0 = interfaceC3970e != this.f33113B.c().get(0);
        if (Thread.currentThread() != this.f33135X) {
            M(g.DECODE_DATA);
            return;
        }
        I6.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            w();
        } finally {
            I6.b.e();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void j() {
        M(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void n(InterfaceC3970e interfaceC3970e, Exception exc, com.bumptech.glide.load.data.d<?> dVar, EnumC3966a enumC3966a) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(interfaceC3970e, enumC3966a, dVar.a());
        this.f33114C.add(glideException);
        if (Thread.currentThread() != this.f33135X) {
            M(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            N();
        }
    }

    @Override // I6.a.f
    public I6.c p() {
        return this.f33115D;
    }

    @Override // java.lang.Runnable
    public void run() {
        I6.b.c("DecodeJob#run(reason=%s, model=%s)", this.f33131T, this.f33134W);
        com.bumptech.glide.load.data.d<?> dVar = this.f33140c0;
        try {
            try {
                if (this.f33143f0) {
                    G();
                    if (dVar != null) {
                        dVar.b();
                    }
                    I6.b.e();
                    return;
                }
                P();
                if (dVar != null) {
                    dVar.b();
                }
                I6.b.e();
            } catch (com.bumptech.glide.load.engine.b e10) {
                throw e10;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f33143f0 + ", stage: " + this.f33130S, th);
                }
                if (this.f33130S != EnumC0456h.ENCODE) {
                    this.f33114C.add(th);
                    G();
                }
                if (!this.f33143f0) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            I6.b.e();
            throw th2;
        }
    }

    public void s() {
        this.f33143f0 = true;
        com.bumptech.glide.load.engine.f fVar = this.f33141d0;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int iA = A() - hVar.A();
        return iA == 0 ? this.f33129R - hVar.f33129R : iA;
    }
}
