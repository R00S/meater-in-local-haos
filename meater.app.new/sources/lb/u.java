package lb;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3937q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes3.dex */
public final class u extends h.d<u> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: N, reason: collision with root package name */
    private static final u f44967N;

    /* renamed from: O, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<u> f44968O = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44969D;

    /* renamed from: E, reason: collision with root package name */
    private int f44970E;

    /* renamed from: F, reason: collision with root package name */
    private int f44971F;

    /* renamed from: G, reason: collision with root package name */
    private int f44972G;

    /* renamed from: H, reason: collision with root package name */
    private C3937q f44973H;

    /* renamed from: I, reason: collision with root package name */
    private int f44974I;

    /* renamed from: J, reason: collision with root package name */
    private C3937q f44975J;

    /* renamed from: K, reason: collision with root package name */
    private int f44976K;

    /* renamed from: L, reason: collision with root package name */
    private byte f44977L;

    /* renamed from: M, reason: collision with root package name */
    private int f44978M;

    /* compiled from: ProtoBuf.java */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<u> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public u b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new u(eVar, fVar);
        }
    }

    static {
        u uVar = new u(true);
        f44967N = uVar;
        uVar.X();
    }

    public static u J() {
        return f44967N;
    }

    private void X() {
        this.f44971F = 0;
        this.f44972G = 0;
        this.f44973H = C3937q.Y();
        this.f44974I = 0;
        this.f44975J = C3937q.Y();
        this.f44976K = 0;
    }

    public static b Y() {
        return b.B();
    }

    public static b Z(u uVar) {
        return Y().o(uVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public u c() {
        return f44967N;
    }

    public int L() {
        return this.f44971F;
    }

    public int M() {
        return this.f44972G;
    }

    public C3937q N() {
        return this.f44973H;
    }

    public int O() {
        return this.f44974I;
    }

    public C3937q P() {
        return this.f44975J;
    }

    public int Q() {
        return this.f44976K;
    }

    public boolean R() {
        return (this.f44970E & 1) == 1;
    }

    public boolean S() {
        return (this.f44970E & 2) == 2;
    }

    public boolean T() {
        return (this.f44970E & 4) == 4;
    }

    public boolean U() {
        return (this.f44970E & 8) == 8;
    }

    public boolean V() {
        return (this.f44970E & 16) == 16;
    }

    public boolean W() {
        return (this.f44970E & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44977L;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!S()) {
            this.f44977L = (byte) 0;
            return false;
        }
        if (T() && !N().b()) {
            this.f44977L = (byte) 0;
            return false;
        }
        if (V() && !P().b()) {
            this.f44977L = (byte) 0;
            return false;
        }
        if (t()) {
            this.f44977L = (byte) 1;
            return true;
        }
        this.f44977L = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return Z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44978M;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44970E & 1) == 1 ? CodedOutputStream.o(1, this.f44971F) : 0;
        if ((this.f44970E & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f44972G);
        }
        if ((this.f44970E & 4) == 4) {
            iO += CodedOutputStream.s(3, this.f44973H);
        }
        if ((this.f44970E & 16) == 16) {
            iO += CodedOutputStream.s(4, this.f44975J);
        }
        if ((this.f44970E & 8) == 8) {
            iO += CodedOutputStream.o(5, this.f44974I);
        }
        if ((this.f44970E & 32) == 32) {
            iO += CodedOutputStream.o(6, this.f44976K);
        }
        int iU = iO + u() + this.f44969D.size();
        this.f44978M = iU;
        return iU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<u> h() {
        return f44968O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44970E & 1) == 1) {
            codedOutputStream.a0(1, this.f44971F);
        }
        if ((this.f44970E & 2) == 2) {
            codedOutputStream.a0(2, this.f44972G);
        }
        if ((this.f44970E & 4) == 4) {
            codedOutputStream.d0(3, this.f44973H);
        }
        if ((this.f44970E & 16) == 16) {
            codedOutputStream.d0(4, this.f44975J);
        }
        if ((this.f44970E & 8) == 8) {
            codedOutputStream.a0(5, this.f44974I);
        }
        if ((this.f44970E & 32) == 32) {
            codedOutputStream.a0(6, this.f44976K);
        }
        aVarZ.a(200, codedOutputStream);
        codedOutputStream.i0(this.f44969D);
    }

    private u(h.c<u, ?> cVar) {
        super(cVar);
        this.f44977L = (byte) -1;
        this.f44978M = -1;
        this.f44969D = cVar.n();
    }

    private u(boolean z10) {
        this.f44977L = (byte) -1;
        this.f44978M = -1;
        this.f44969D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    private u(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        C3937q.c cVarD;
        this.f44977L = (byte) -1;
        this.f44978M = -1;
        X();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f44970E |= 1;
                            this.f44971F = eVar.s();
                        } else if (iK != 16) {
                            if (iK == 26) {
                                cVarD = (this.f44970E & 4) == 4 ? this.f44973H.d() : null;
                                C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44973H = c3937q;
                                if (cVarD != null) {
                                    cVarD.o(c3937q);
                                    this.f44973H = cVarD.w();
                                }
                                this.f44970E |= 4;
                            } else if (iK == 34) {
                                cVarD = (this.f44970E & 16) == 16 ? this.f44975J.d() : null;
                                C3937q c3937q2 = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44975J = c3937q2;
                                if (cVarD != null) {
                                    cVarD.o(c3937q2);
                                    this.f44975J = cVarD.w();
                                }
                                this.f44970E |= 16;
                            } else if (iK == 40) {
                                this.f44970E |= 8;
                                this.f44974I = eVar.s();
                            } else if (iK != 48) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                this.f44970E |= 32;
                                this.f44976K = eVar.s();
                            }
                        } else {
                            this.f44970E |= 2;
                            this.f44972G = eVar.s();
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
                    this.f44969D = bVarD.e();
                    throw th2;
                }
                this.f44969D = bVarD.e();
                n();
                throw th;
            }
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44969D = bVarD.e();
            throw th3;
        }
        this.f44969D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    public static final class b extends h.c<u, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44979E;

        /* renamed from: F, reason: collision with root package name */
        private int f44980F;

        /* renamed from: G, reason: collision with root package name */
        private int f44981G;

        /* renamed from: I, reason: collision with root package name */
        private int f44983I;

        /* renamed from: K, reason: collision with root package name */
        private int f44985K;

        /* renamed from: H, reason: collision with root package name */
        private C3937q f44982H = C3937q.Y();

        /* renamed from: J, reason: collision with root package name */
        private C3937q f44984J = C3937q.Y();

        private b() {
            C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.u.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.u> r1 = lb.u.f44968O     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.u r3 = (lb.u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.u r4 = (lb.u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.u.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.u$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b o(u uVar) {
            if (uVar == u.J()) {
                return this;
            }
            if (uVar.R()) {
                H(uVar.L());
            }
            if (uVar.S()) {
                I(uVar.M());
            }
            if (uVar.T()) {
                F(uVar.N());
            }
            if (uVar.U()) {
                J(uVar.O());
            }
            if (uVar.V()) {
                G(uVar.P());
            }
            if (uVar.W()) {
                L(uVar.Q());
            }
            t(uVar);
            p(n().f(uVar.f44969D));
            return this;
        }

        public b F(C3937q c3937q) {
            if ((this.f44979E & 4) != 4 || this.f44982H == C3937q.Y()) {
                this.f44982H = c3937q;
            } else {
                this.f44982H = C3937q.A0(this.f44982H).o(c3937q).w();
            }
            this.f44979E |= 4;
            return this;
        }

        public b G(C3937q c3937q) {
            if ((this.f44979E & 16) != 16 || this.f44984J == C3937q.Y()) {
                this.f44984J = c3937q;
            } else {
                this.f44984J = C3937q.A0(this.f44984J).o(c3937q).w();
            }
            this.f44979E |= 16;
            return this;
        }

        public b H(int i10) {
            this.f44979E |= 1;
            this.f44980F = i10;
            return this;
        }

        public b I(int i10) {
            this.f44979E |= 2;
            this.f44981G = i10;
            return this;
        }

        public b J(int i10) {
            this.f44979E |= 8;
            this.f44983I = i10;
            return this;
        }

        public b L(int i10) {
            this.f44979E |= 32;
            this.f44985K = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public u e() {
            u uVarW = w();
            if (uVarW.b()) {
                return uVarW;
            }
            throw a.AbstractC0582a.l(uVarW);
        }

        public u w() {
            u uVar = new u(this);
            int i10 = this.f44979E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            uVar.f44971F = this.f44980F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            uVar.f44972G = this.f44981G;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            uVar.f44973H = this.f44982H;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            uVar.f44974I = this.f44983I;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            uVar.f44975J = this.f44984J;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            uVar.f44976K = this.f44985K;
            uVar.f44970E = i11;
            return uVar;
        }

        private void C() {
        }
    }
}
