package lb;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* loaded from: classes3.dex */
public final class v extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: M, reason: collision with root package name */
    private static final v f44986M;

    /* renamed from: N, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<v> f44987N = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44988C;

    /* renamed from: D, reason: collision with root package name */
    private int f44989D;

    /* renamed from: E, reason: collision with root package name */
    private int f44990E;

    /* renamed from: F, reason: collision with root package name */
    private int f44991F;

    /* renamed from: G, reason: collision with root package name */
    private c f44992G;

    /* renamed from: H, reason: collision with root package name */
    private int f44993H;

    /* renamed from: I, reason: collision with root package name */
    private int f44994I;

    /* renamed from: J, reason: collision with root package name */
    private d f44995J;

    /* renamed from: K, reason: collision with root package name */
    private byte f44996K;

    /* renamed from: L, reason: collision with root package name */
    private int f44997L;

    /* compiled from: ProtoBuf.java */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<v> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public v b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new v(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    public enum c implements i.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* renamed from: F, reason: collision with root package name */
        private static i.b<c> f45008F = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f45010B;

        /* compiled from: ProtoBuf.java */
        static class a implements i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.c(i10);
            }
        }

        c(int i10, int i11) {
            this.f45010B = i11;
        }

        public static c c(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f45010B;
        }
    }

    /* compiled from: ProtoBuf.java */
    public enum d implements i.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* renamed from: F, reason: collision with root package name */
        private static i.b<d> f45014F = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f45016B;

        /* compiled from: ProtoBuf.java */
        static class a implements i.b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.c(i10);
            }
        }

        d(int i10, int i11) {
            this.f45016B = i11;
        }

        public static d c(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f45016B;
        }
    }

    static {
        v vVar = new v(true);
        f44986M = vVar;
        vVar.N();
    }

    public static v A() {
        return f44986M;
    }

    private void N() {
        this.f44990E = 0;
        this.f44991F = 0;
        this.f44992G = c.ERROR;
        this.f44993H = 0;
        this.f44994I = 0;
        this.f44995J = d.LANGUAGE_VERSION;
    }

    public static b O() {
        return b.u();
    }

    public static b P(v vVar) {
        return O().o(vVar);
    }

    public int B() {
        return this.f44993H;
    }

    public c C() {
        return this.f44992G;
    }

    public int D() {
        return this.f44994I;
    }

    public int E() {
        return this.f44990E;
    }

    public int F() {
        return this.f44991F;
    }

    public d G() {
        return this.f44995J;
    }

    public boolean H() {
        return (this.f44989D & 8) == 8;
    }

    public boolean I() {
        return (this.f44989D & 4) == 4;
    }

    public boolean J() {
        return (this.f44989D & 16) == 16;
    }

    public boolean K() {
        return (this.f44989D & 1) == 1;
    }

    public boolean L() {
        return (this.f44989D & 2) == 2;
    }

    public boolean M() {
        return (this.f44989D & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b g() {
        return O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b d() {
        return P(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44996K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f44996K = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44997L;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44989D & 1) == 1 ? CodedOutputStream.o(1, this.f44990E) : 0;
        if ((this.f44989D & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f44991F);
        }
        if ((this.f44989D & 4) == 4) {
            iO += CodedOutputStream.h(3, this.f44992G.e());
        }
        if ((this.f44989D & 8) == 8) {
            iO += CodedOutputStream.o(4, this.f44993H);
        }
        if ((this.f44989D & 16) == 16) {
            iO += CodedOutputStream.o(5, this.f44994I);
        }
        if ((this.f44989D & 32) == 32) {
            iO += CodedOutputStream.h(6, this.f44995J.e());
        }
        int size = iO + this.f44988C.size();
        this.f44997L = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<v> h() {
        return f44987N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        if ((this.f44989D & 1) == 1) {
            codedOutputStream.a0(1, this.f44990E);
        }
        if ((this.f44989D & 2) == 2) {
            codedOutputStream.a0(2, this.f44991F);
        }
        if ((this.f44989D & 4) == 4) {
            codedOutputStream.S(3, this.f44992G.e());
        }
        if ((this.f44989D & 8) == 8) {
            codedOutputStream.a0(4, this.f44993H);
        }
        if ((this.f44989D & 16) == 16) {
            codedOutputStream.a0(5, this.f44994I);
        }
        if ((this.f44989D & 32) == 32) {
            codedOutputStream.S(6, this.f44995J.e());
        }
        codedOutputStream.i0(this.f44988C);
    }

    private v(h.b bVar) {
        super(bVar);
        this.f44996K = (byte) -1;
        this.f44997L = -1;
        this.f44988C = bVar.n();
    }

    private v(boolean z10) {
        this.f44996K = (byte) -1;
        this.f44997L = -1;
        this.f44988C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    private v(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44996K = (byte) -1;
        this.f44997L = -1;
        N();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f44989D |= 1;
                            this.f44990E = eVar.s();
                        } else if (iK == 16) {
                            this.f44989D |= 2;
                            this.f44991F = eVar.s();
                        } else if (iK == 24) {
                            int iN = eVar.n();
                            c cVarC = c.c(iN);
                            if (cVarC == null) {
                                codedOutputStreamJ.o0(iK);
                                codedOutputStreamJ.o0(iN);
                            } else {
                                this.f44989D |= 4;
                                this.f44992G = cVarC;
                            }
                        } else if (iK == 32) {
                            this.f44989D |= 8;
                            this.f44993H = eVar.s();
                        } else if (iK == 40) {
                            this.f44989D |= 16;
                            this.f44994I = eVar.s();
                        } else if (iK != 48) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            int iN2 = eVar.n();
                            d dVarC = d.c(iN2);
                            if (dVarC == null) {
                                codedOutputStreamJ.o0(iK);
                                codedOutputStreamJ.o0(iN2);
                            } else {
                                this.f44989D |= 32;
                                this.f44995J = dVarC;
                            }
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44988C = bVarD.e();
                    throw th2;
                }
                this.f44988C = bVarD.e();
                n();
                throw th;
            }
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44988C = bVarD.e();
            throw th3;
        }
        this.f44988C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    public static final class b extends h.b<v, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44998C;

        /* renamed from: D, reason: collision with root package name */
        private int f44999D;

        /* renamed from: E, reason: collision with root package name */
        private int f45000E;

        /* renamed from: G, reason: collision with root package name */
        private int f45002G;

        /* renamed from: H, reason: collision with root package name */
        private int f45003H;

        /* renamed from: F, reason: collision with root package name */
        private c f45001F = c.ERROR;

        /* renamed from: I, reason: collision with root package name */
        private d f45004I = d.LANGUAGE_VERSION;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b o(v vVar) {
            if (vVar == v.A()) {
                return this;
            }
            if (vVar.K()) {
                E(vVar.E());
            }
            if (vVar.L()) {
                F(vVar.F());
            }
            if (vVar.I()) {
                C(vVar.C());
            }
            if (vVar.H()) {
                B(vVar.B());
            }
            if (vVar.J()) {
                D(vVar.D());
            }
            if (vVar.M()) {
                G(vVar.G());
            }
            p(n().f(vVar.f44988C));
            return this;
        }

        public b B(int i10) {
            this.f44998C |= 8;
            this.f45002G = i10;
            return this;
        }

        public b C(c cVar) {
            cVar.getClass();
            this.f44998C |= 4;
            this.f45001F = cVar;
            return this;
        }

        public b D(int i10) {
            this.f44998C |= 16;
            this.f45003H = i10;
            return this;
        }

        public b E(int i10) {
            this.f44998C |= 1;
            this.f44999D = i10;
            return this;
        }

        public b F(int i10) {
            this.f44998C |= 2;
            this.f45000E = i10;
            return this;
        }

        public b G(d dVar) {
            dVar.getClass();
            this.f44998C |= 32;
            this.f45004I = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public v e() {
            v vVarS = s();
            if (vVarS.b()) {
                return vVarS;
            }
            throw a.AbstractC0582a.l(vVarS);
        }

        public v s() {
            v vVar = new v(this);
            int i10 = this.f44998C;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f44990E = this.f44999D;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f44991F = this.f45000E;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f44992G = this.f45001F;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f44993H = this.f45002G;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f44994I = this.f45003H;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f44995J = this.f45004I;
            vVar.f44989D = i11;
            return vVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public b m() {
            return u().o(s());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.v.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.v> r1 = lb.v.f44987N     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.v r3 = (lb.v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.o(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                lb.v r4 = (lb.v) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.o(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: lb.v.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.v$b");
        }

        private void v() {
        }
    }
}
