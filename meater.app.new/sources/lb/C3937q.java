package lb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3937q extends h.d<C3937q> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: V, reason: collision with root package name */
    private static final C3937q f44850V;

    /* renamed from: W, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3937q> f44851W = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44852D;

    /* renamed from: E, reason: collision with root package name */
    private int f44853E;

    /* renamed from: F, reason: collision with root package name */
    private List<b> f44854F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f44855G;

    /* renamed from: H, reason: collision with root package name */
    private int f44856H;

    /* renamed from: I, reason: collision with root package name */
    private C3937q f44857I;

    /* renamed from: J, reason: collision with root package name */
    private int f44858J;

    /* renamed from: K, reason: collision with root package name */
    private int f44859K;

    /* renamed from: L, reason: collision with root package name */
    private int f44860L;

    /* renamed from: M, reason: collision with root package name */
    private int f44861M;

    /* renamed from: N, reason: collision with root package name */
    private int f44862N;

    /* renamed from: O, reason: collision with root package name */
    private C3937q f44863O;

    /* renamed from: P, reason: collision with root package name */
    private int f44864P;

    /* renamed from: Q, reason: collision with root package name */
    private C3937q f44865Q;

    /* renamed from: R, reason: collision with root package name */
    private int f44866R;

    /* renamed from: S, reason: collision with root package name */
    private int f44867S;

    /* renamed from: T, reason: collision with root package name */
    private byte f44868T;

    /* renamed from: U, reason: collision with root package name */
    private int f44869U;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.q$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3937q> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3937q b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3937q(eVar, fVar);
        }
    }

    static {
        C3937q c3937q = new C3937q(true);
        f44850V = c3937q;
        c3937q.y0();
    }

    public static c A0(C3937q c3937q) {
        return z0().o(c3937q);
    }

    public static C3937q Y() {
        return f44850V;
    }

    private void y0() {
        this.f44854F = Collections.emptyList();
        this.f44855G = false;
        this.f44856H = 0;
        this.f44857I = Y();
        this.f44858J = 0;
        this.f44859K = 0;
        this.f44860L = 0;
        this.f44861M = 0;
        this.f44862N = 0;
        this.f44863O = Y();
        this.f44864P = 0;
        this.f44865Q = Y();
        this.f44866R = 0;
        this.f44867S = 0;
    }

    public static c z0() {
        return c.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c g() {
        return z0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public c d() {
        return A0(this);
    }

    public C3937q S() {
        return this.f44865Q;
    }

    public int T() {
        return this.f44866R;
    }

    public b U(int i10) {
        return this.f44854F.get(i10);
    }

    public int V() {
        return this.f44854F.size();
    }

    public List<b> W() {
        return this.f44854F;
    }

    public int X() {
        return this.f44859K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C3937q c() {
        return f44850V;
    }

    public int a0() {
        return this.f44867S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44868T;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < V(); i10++) {
            if (!U(i10).b()) {
                this.f44868T = (byte) 0;
                return false;
            }
        }
        if (q0() && !c0().b()) {
            this.f44868T = (byte) 0;
            return false;
        }
        if (t0() && !f0().b()) {
            this.f44868T = (byte) 0;
            return false;
        }
        if (l0() && !S().b()) {
            this.f44868T = (byte) 0;
            return false;
        }
        if (t()) {
            this.f44868T = (byte) 1;
            return true;
        }
        this.f44868T = (byte) 0;
        return false;
    }

    public int b0() {
        return this.f44856H;
    }

    public C3937q c0() {
        return this.f44857I;
    }

    public int d0() {
        return this.f44858J;
    }

    public boolean e0() {
        return this.f44855G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44869U;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44853E & 4096) == 4096 ? CodedOutputStream.o(1, this.f44867S) : 0;
        for (int i11 = 0; i11 < this.f44854F.size(); i11++) {
            iO += CodedOutputStream.s(2, this.f44854F.get(i11));
        }
        if ((this.f44853E & 1) == 1) {
            iO += CodedOutputStream.a(3, this.f44855G);
        }
        if ((this.f44853E & 2) == 2) {
            iO += CodedOutputStream.o(4, this.f44856H);
        }
        if ((this.f44853E & 4) == 4) {
            iO += CodedOutputStream.s(5, this.f44857I);
        }
        if ((this.f44853E & 16) == 16) {
            iO += CodedOutputStream.o(6, this.f44859K);
        }
        if ((this.f44853E & 32) == 32) {
            iO += CodedOutputStream.o(7, this.f44860L);
        }
        if ((this.f44853E & 8) == 8) {
            iO += CodedOutputStream.o(8, this.f44858J);
        }
        if ((this.f44853E & 64) == 64) {
            iO += CodedOutputStream.o(9, this.f44861M);
        }
        if ((this.f44853E & 256) == 256) {
            iO += CodedOutputStream.s(10, this.f44863O);
        }
        if ((this.f44853E & 512) == 512) {
            iO += CodedOutputStream.o(11, this.f44864P);
        }
        if ((this.f44853E & 128) == 128) {
            iO += CodedOutputStream.o(12, this.f44862N);
        }
        if ((this.f44853E & 1024) == 1024) {
            iO += CodedOutputStream.s(13, this.f44865Q);
        }
        if ((this.f44853E & 2048) == 2048) {
            iO += CodedOutputStream.o(14, this.f44866R);
        }
        int iU = iO + u() + this.f44852D.size();
        this.f44869U = iU;
        return iU;
    }

    public C3937q f0() {
        return this.f44863O;
    }

    public int g0() {
        return this.f44864P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3937q> h() {
        return f44851W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44853E & 4096) == 4096) {
            codedOutputStream.a0(1, this.f44867S);
        }
        for (int i10 = 0; i10 < this.f44854F.size(); i10++) {
            codedOutputStream.d0(2, this.f44854F.get(i10));
        }
        if ((this.f44853E & 1) == 1) {
            codedOutputStream.L(3, this.f44855G);
        }
        if ((this.f44853E & 2) == 2) {
            codedOutputStream.a0(4, this.f44856H);
        }
        if ((this.f44853E & 4) == 4) {
            codedOutputStream.d0(5, this.f44857I);
        }
        if ((this.f44853E & 16) == 16) {
            codedOutputStream.a0(6, this.f44859K);
        }
        if ((this.f44853E & 32) == 32) {
            codedOutputStream.a0(7, this.f44860L);
        }
        if ((this.f44853E & 8) == 8) {
            codedOutputStream.a0(8, this.f44858J);
        }
        if ((this.f44853E & 64) == 64) {
            codedOutputStream.a0(9, this.f44861M);
        }
        if ((this.f44853E & 256) == 256) {
            codedOutputStream.d0(10, this.f44863O);
        }
        if ((this.f44853E & 512) == 512) {
            codedOutputStream.a0(11, this.f44864P);
        }
        if ((this.f44853E & 128) == 128) {
            codedOutputStream.a0(12, this.f44862N);
        }
        if ((this.f44853E & 1024) == 1024) {
            codedOutputStream.d0(13, this.f44865Q);
        }
        if ((this.f44853E & 2048) == 2048) {
            codedOutputStream.a0(14, this.f44866R);
        }
        aVarZ.a(200, codedOutputStream);
        codedOutputStream.i0(this.f44852D);
    }

    public int i0() {
        return this.f44862N;
    }

    public int j0() {
        return this.f44860L;
    }

    public int k0() {
        return this.f44861M;
    }

    public boolean l0() {
        return (this.f44853E & 1024) == 1024;
    }

    public boolean m0() {
        return (this.f44853E & 2048) == 2048;
    }

    public boolean n0() {
        return (this.f44853E & 16) == 16;
    }

    public boolean o0() {
        return (this.f44853E & 4096) == 4096;
    }

    public boolean p0() {
        return (this.f44853E & 2) == 2;
    }

    public boolean q0() {
        return (this.f44853E & 4) == 4;
    }

    public boolean r0() {
        return (this.f44853E & 8) == 8;
    }

    public boolean s0() {
        return (this.f44853E & 1) == 1;
    }

    public boolean t0() {
        return (this.f44853E & 256) == 256;
    }

    public boolean u0() {
        return (this.f44853E & 512) == 512;
    }

    public boolean v0() {
        return (this.f44853E & 128) == 128;
    }

    public boolean w0() {
        return (this.f44853E & 32) == 32;
    }

    public boolean x0() {
        return (this.f44853E & 64) == 64;
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.q$b */
    public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: J, reason: collision with root package name */
        private static final b f44870J;

        /* renamed from: K, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f44871K = new a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f44872C;

        /* renamed from: D, reason: collision with root package name */
        private int f44873D;

        /* renamed from: E, reason: collision with root package name */
        private c f44874E;

        /* renamed from: F, reason: collision with root package name */
        private C3937q f44875F;

        /* renamed from: G, reason: collision with root package name */
        private int f44876G;

        /* renamed from: H, reason: collision with root package name */
        private byte f44877H;

        /* renamed from: I, reason: collision with root package name */
        private int f44878I;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.q$b$a */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new b(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.q$b$c */
        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* renamed from: G, reason: collision with root package name */
            private static i.b<c> f44887G = new a();

            /* renamed from: B, reason: collision with root package name */
            private final int f44889B;

            /* compiled from: ProtoBuf.java */
            /* renamed from: lb.q$b$c$a */
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
                this.f44889B = i11;
            }

            public static c c(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int e() {
                return this.f44889B;
            }
        }

        static {
            b bVar = new b(true);
            f44870J = bVar;
            bVar.E();
        }

        private void E() {
            this.f44874E = c.INV;
            this.f44875F = C3937q.Y();
            this.f44876G = 0;
        }

        public static C0601b F() {
            return C0601b.u();
        }

        public static C0601b G(b bVar) {
            return F().o(bVar);
        }

        public static b x() {
            return f44870J;
        }

        public int A() {
            return this.f44876G;
        }

        public boolean B() {
            return (this.f44873D & 1) == 1;
        }

        public boolean C() {
            return (this.f44873D & 2) == 2;
        }

        public boolean D() {
            return (this.f44873D & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public C0601b g() {
            return F();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public C0601b d() {
            return G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f44877H;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!C() || z().b()) {
                this.f44877H = (byte) 1;
                return true;
            }
            this.f44877H = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f44878I;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f44873D & 1) == 1 ? CodedOutputStream.h(1, this.f44874E.e()) : 0;
            if ((this.f44873D & 2) == 2) {
                iH += CodedOutputStream.s(2, this.f44875F);
            }
            if ((this.f44873D & 4) == 4) {
                iH += CodedOutputStream.o(3, this.f44876G);
            }
            int size = iH + this.f44872C.size();
            this.f44878I = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> h() {
            return f44871K;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            if ((this.f44873D & 1) == 1) {
                codedOutputStream.S(1, this.f44874E.e());
            }
            if ((this.f44873D & 2) == 2) {
                codedOutputStream.d0(2, this.f44875F);
            }
            if ((this.f44873D & 4) == 4) {
                codedOutputStream.a0(3, this.f44876G);
            }
            codedOutputStream.i0(this.f44872C);
        }

        public c y() {
            return this.f44874E;
        }

        public C3937q z() {
            return this.f44875F;
        }

        private b(h.b bVar) {
            super(bVar);
            this.f44877H = (byte) -1;
            this.f44878I = -1;
            this.f44872C = bVar.n();
        }

        private b(boolean z10) {
            this.f44877H = (byte) -1;
            this.f44878I = -1;
            this.f44872C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f44877H = (byte) -1;
            this.f44878I = -1;
            E();
            d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iN = eVar.n();
                                    c cVarC = c.c(iN);
                                    if (cVarC == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f44873D |= 1;
                                        this.f44874E = cVarC;
                                    }
                                } else if (iK == 18) {
                                    c cVarD = (this.f44873D & 2) == 2 ? this.f44875F.d() : null;
                                    C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                    this.f44875F = c3937q;
                                    if (cVarD != null) {
                                        cVarD.o(c3937q);
                                        this.f44875F = cVarD.w();
                                    }
                                    this.f44873D |= 2;
                                } else if (iK != 24) {
                                    if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                } else {
                                    this.f44873D |= 4;
                                    this.f44876G = eVar.s();
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f44872C = bVarD.e();
                        throw th2;
                    }
                    this.f44872C = bVarD.e();
                    n();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f44872C = bVarD.e();
                throw th3;
            }
            this.f44872C = bVarD.e();
            n();
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.q$b$b, reason: collision with other inner class name */
        public static final class C0601b extends h.b<b, C0601b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: C, reason: collision with root package name */
            private int f44879C;

            /* renamed from: D, reason: collision with root package name */
            private c f44880D = c.INV;

            /* renamed from: E, reason: collision with root package name */
            private C3937q f44881E = C3937q.Y();

            /* renamed from: F, reason: collision with root package name */
            private int f44882F;

            private C0601b() {
                v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0601b u() {
                return new C0601b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C0601b o(b bVar) {
                if (bVar == b.x()) {
                    return this;
                }
                if (bVar.B()) {
                    C(bVar.y());
                }
                if (bVar.C()) {
                    B(bVar.z());
                }
                if (bVar.D()) {
                    D(bVar.A());
                }
                p(n().f(bVar.f44872C));
                return this;
            }

            public C0601b B(C3937q c3937q) {
                if ((this.f44879C & 2) != 2 || this.f44881E == C3937q.Y()) {
                    this.f44881E = c3937q;
                } else {
                    this.f44881E = C3937q.A0(this.f44881E).o(c3937q).w();
                }
                this.f44879C |= 2;
                return this;
            }

            public C0601b C(c cVar) {
                cVar.getClass();
                this.f44879C |= 1;
                this.f44880D = cVar;
                return this;
            }

            public C0601b D(int i10) {
                this.f44879C |= 4;
                this.f44882F = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e() {
                b bVarS = s();
                if (bVarS.b()) {
                    return bVarS;
                }
                throw a.AbstractC0582a.l(bVarS);
            }

            public b s() {
                b bVar = new b(this);
                int i10 = this.f44879C;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f44874E = this.f44880D;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f44875F = this.f44881E;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f44876G = this.f44882F;
                bVar.f44873D = i11;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0601b m() {
                return u().o(s());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public lb.C3937q.b.C0601b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<lb.q$b> r1 = lb.C3937q.b.f44871K     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    lb.q$b r3 = (lb.C3937q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    lb.q$b r4 = (lb.C3937q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: lb.C3937q.b.C0601b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.q$b$b");
            }

            private void v() {
            }
        }
    }

    private C3937q(h.c<C3937q, ?> cVar) {
        super(cVar);
        this.f44868T = (byte) -1;
        this.f44869U = -1;
        this.f44852D = cVar.n();
    }

    private C3937q(boolean z10) {
        this.f44868T = (byte) -1;
        this.f44869U = -1;
        this.f44852D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3937q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        c cVarD;
        this.f44868T = (byte) -1;
        this.f44869U = -1;
        y0();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f44853E |= 4096;
                                this.f44867S = eVar.s();
                            case 18:
                                if (!z11) {
                                    this.f44854F = new ArrayList();
                                    z11 = true;
                                }
                                this.f44854F.add(eVar.u(b.f44871K, fVar));
                            case 24:
                                this.f44853E |= 1;
                                this.f44855G = eVar.k();
                            case 32:
                                this.f44853E |= 2;
                                this.f44856H = eVar.s();
                            case 42:
                                cVarD = (this.f44853E & 4) == 4 ? this.f44857I.d() : null;
                                C3937q c3937q = (C3937q) eVar.u(f44851W, fVar);
                                this.f44857I = c3937q;
                                if (cVarD != null) {
                                    cVarD.o(c3937q);
                                    this.f44857I = cVarD.w();
                                }
                                this.f44853E |= 4;
                            case 48:
                                this.f44853E |= 16;
                                this.f44859K = eVar.s();
                            case 56:
                                this.f44853E |= 32;
                                this.f44860L = eVar.s();
                            case 64:
                                this.f44853E |= 8;
                                this.f44858J = eVar.s();
                            case 72:
                                this.f44853E |= 64;
                                this.f44861M = eVar.s();
                            case 82:
                                cVarD = (this.f44853E & 256) == 256 ? this.f44863O.d() : null;
                                C3937q c3937q2 = (C3937q) eVar.u(f44851W, fVar);
                                this.f44863O = c3937q2;
                                if (cVarD != null) {
                                    cVarD.o(c3937q2);
                                    this.f44863O = cVarD.w();
                                }
                                this.f44853E |= 256;
                            case 88:
                                this.f44853E |= 512;
                                this.f44864P = eVar.s();
                            case 96:
                                this.f44853E |= 128;
                                this.f44862N = eVar.s();
                            case 106:
                                cVarD = (this.f44853E & 1024) == 1024 ? this.f44865Q.d() : null;
                                C3937q c3937q3 = (C3937q) eVar.u(f44851W, fVar);
                                this.f44865Q = c3937q3;
                                if (cVarD != null) {
                                    cVarD.o(c3937q3);
                                    this.f44865Q = cVarD.w();
                                }
                                this.f44853E |= 1024;
                            case 112:
                                this.f44853E |= 2048;
                                this.f44866R = eVar.s();
                            default:
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                    z10 = true;
                                }
                        }
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f44854F = Collections.unmodifiableList(this.f44854F);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44852D = bVarD.e();
                    throw th2;
                }
                this.f44852D = bVarD.e();
                n();
                throw th;
            }
        }
        if (z11) {
            this.f44854F = Collections.unmodifiableList(this.f44854F);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44852D = bVarD.e();
            throw th3;
        }
        this.f44852D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.q$c */
    public static final class c extends h.c<C3937q, c> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44890E;

        /* renamed from: G, reason: collision with root package name */
        private boolean f44892G;

        /* renamed from: H, reason: collision with root package name */
        private int f44893H;

        /* renamed from: J, reason: collision with root package name */
        private int f44895J;

        /* renamed from: K, reason: collision with root package name */
        private int f44896K;

        /* renamed from: L, reason: collision with root package name */
        private int f44897L;

        /* renamed from: M, reason: collision with root package name */
        private int f44898M;

        /* renamed from: N, reason: collision with root package name */
        private int f44899N;

        /* renamed from: P, reason: collision with root package name */
        private int f44901P;

        /* renamed from: R, reason: collision with root package name */
        private int f44903R;

        /* renamed from: S, reason: collision with root package name */
        private int f44904S;

        /* renamed from: F, reason: collision with root package name */
        private List<b> f44891F = Collections.emptyList();

        /* renamed from: I, reason: collision with root package name */
        private C3937q f44894I = C3937q.Y();

        /* renamed from: O, reason: collision with root package name */
        private C3937q f44900O = C3937q.Y();

        /* renamed from: Q, reason: collision with root package name */
        private C3937q f44902Q = C3937q.Y();

        private c() {
            D();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c B() {
            return new c();
        }

        private void C() {
            if ((this.f44890E & 1) != 1) {
                this.f44891F = new ArrayList(this.f44891F);
                this.f44890E |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public c m() {
            return B().o(w());
        }

        public c E(C3937q c3937q) {
            if ((this.f44890E & 2048) != 2048 || this.f44902Q == C3937q.Y()) {
                this.f44902Q = c3937q;
            } else {
                this.f44902Q = C3937q.A0(this.f44902Q).o(c3937q).w();
            }
            this.f44890E |= 2048;
            return this;
        }

        public c F(C3937q c3937q) {
            if ((this.f44890E & 8) != 8 || this.f44894I == C3937q.Y()) {
                this.f44894I = c3937q;
            } else {
                this.f44894I = C3937q.A0(this.f44894I).o(c3937q).w();
            }
            this.f44890E |= 8;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3937q.c k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.q> r1 = lb.C3937q.f44851W     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.q r3 = (lb.C3937q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.q r4 = (lb.C3937q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3937q.c.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.q$c");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public c o(C3937q c3937q) {
            if (c3937q == C3937q.Y()) {
                return this;
            }
            if (!c3937q.f44854F.isEmpty()) {
                if (this.f44891F.isEmpty()) {
                    this.f44891F = c3937q.f44854F;
                    this.f44890E &= -2;
                } else {
                    C();
                    this.f44891F.addAll(c3937q.f44854F);
                }
            }
            if (c3937q.s0()) {
                P(c3937q.e0());
            }
            if (c3937q.p0()) {
                N(c3937q.b0());
            }
            if (c3937q.q0()) {
                F(c3937q.c0());
            }
            if (c3937q.r0()) {
                O(c3937q.d0());
            }
            if (c3937q.n0()) {
                L(c3937q.X());
            }
            if (c3937q.w0()) {
                S(c3937q.j0());
            }
            if (c3937q.x0()) {
                T(c3937q.k0());
            }
            if (c3937q.v0()) {
                R(c3937q.i0());
            }
            if (c3937q.t0()) {
                I(c3937q.f0());
            }
            if (c3937q.u0()) {
                Q(c3937q.g0());
            }
            if (c3937q.l0()) {
                E(c3937q.S());
            }
            if (c3937q.m0()) {
                J(c3937q.T());
            }
            if (c3937q.o0()) {
                M(c3937q.a0());
            }
            t(c3937q);
            p(n().f(c3937q.f44852D));
            return this;
        }

        public c I(C3937q c3937q) {
            if ((this.f44890E & 512) != 512 || this.f44900O == C3937q.Y()) {
                this.f44900O = c3937q;
            } else {
                this.f44900O = C3937q.A0(this.f44900O).o(c3937q).w();
            }
            this.f44890E |= 512;
            return this;
        }

        public c J(int i10) {
            this.f44890E |= 4096;
            this.f44903R = i10;
            return this;
        }

        public c L(int i10) {
            this.f44890E |= 32;
            this.f44896K = i10;
            return this;
        }

        public c M(int i10) {
            this.f44890E |= 8192;
            this.f44904S = i10;
            return this;
        }

        public c N(int i10) {
            this.f44890E |= 4;
            this.f44893H = i10;
            return this;
        }

        public c O(int i10) {
            this.f44890E |= 16;
            this.f44895J = i10;
            return this;
        }

        public c P(boolean z10) {
            this.f44890E |= 2;
            this.f44892G = z10;
            return this;
        }

        public c Q(int i10) {
            this.f44890E |= 1024;
            this.f44901P = i10;
            return this;
        }

        public c R(int i10) {
            this.f44890E |= 256;
            this.f44899N = i10;
            return this;
        }

        public c S(int i10) {
            this.f44890E |= 64;
            this.f44897L = i10;
            return this;
        }

        public c T(int i10) {
            this.f44890E |= 128;
            this.f44898M = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3937q e() {
            C3937q c3937qW = w();
            if (c3937qW.b()) {
                return c3937qW;
            }
            throw a.AbstractC0582a.l(c3937qW);
        }

        public C3937q w() {
            C3937q c3937q = new C3937q(this);
            int i10 = this.f44890E;
            if ((i10 & 1) == 1) {
                this.f44891F = Collections.unmodifiableList(this.f44891F);
                this.f44890E &= -2;
            }
            c3937q.f44854F = this.f44891F;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            c3937q.f44855G = this.f44892G;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            c3937q.f44856H = this.f44893H;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3937q.f44857I = this.f44894I;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            c3937q.f44858J = this.f44895J;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            c3937q.f44859K = this.f44896K;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3937q.f44860L = this.f44897L;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3937q.f44861M = this.f44898M;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            c3937q.f44862N = this.f44899N;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            c3937q.f44863O = this.f44900O;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            c3937q.f44864P = this.f44901P;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            c3937q.f44865Q = this.f44902Q;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            c3937q.f44866R = this.f44903R;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            c3937q.f44867S = this.f44904S;
            c3937q.f44853E = i11;
            return c3937q;
        }

        private void D() {
        }
    }
}
