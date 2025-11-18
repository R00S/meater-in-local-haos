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
/* renamed from: lb.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3939s extends h.d<C3939s> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: O, reason: collision with root package name */
    private static final C3939s f44930O;

    /* renamed from: P, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3939s> f44931P = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44932D;

    /* renamed from: E, reason: collision with root package name */
    private int f44933E;

    /* renamed from: F, reason: collision with root package name */
    private int f44934F;

    /* renamed from: G, reason: collision with root package name */
    private int f44935G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f44936H;

    /* renamed from: I, reason: collision with root package name */
    private c f44937I;

    /* renamed from: J, reason: collision with root package name */
    private List<C3937q> f44938J;

    /* renamed from: K, reason: collision with root package name */
    private List<Integer> f44939K;

    /* renamed from: L, reason: collision with root package name */
    private int f44940L;

    /* renamed from: M, reason: collision with root package name */
    private byte f44941M;

    /* renamed from: N, reason: collision with root package name */
    private int f44942N;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.s$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3939s> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3939s b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3939s(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.s$c */
    public enum c implements i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* renamed from: F, reason: collision with root package name */
        private static i.b<c> f44953F = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f44955B;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.s$c$a */
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
            this.f44955B = i11;
        }

        public static c c(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f44955B;
        }
    }

    static {
        C3939s c3939s = new C3939s(true);
        f44930O = c3939s;
        c3939s.Z();
    }

    public static C3939s L() {
        return f44930O;
    }

    private void Z() {
        this.f44934F = 0;
        this.f44935G = 0;
        this.f44936H = false;
        this.f44937I = c.INV;
        this.f44938J = Collections.emptyList();
        this.f44939K = Collections.emptyList();
    }

    public static b a0() {
        return b.B();
    }

    public static b b0(C3939s c3939s) {
        return a0().o(c3939s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C3939s c() {
        return f44930O;
    }

    public int N() {
        return this.f44934F;
    }

    public int O() {
        return this.f44935G;
    }

    public boolean P() {
        return this.f44936H;
    }

    public C3937q Q(int i10) {
        return this.f44938J.get(i10);
    }

    public int R() {
        return this.f44938J.size();
    }

    public List<Integer> S() {
        return this.f44939K;
    }

    public List<C3937q> T() {
        return this.f44938J;
    }

    public c U() {
        return this.f44937I;
    }

    public boolean V() {
        return (this.f44933E & 1) == 1;
    }

    public boolean W() {
        return (this.f44933E & 2) == 2;
    }

    public boolean X() {
        return (this.f44933E & 4) == 4;
    }

    public boolean Y() {
        return (this.f44933E & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44941M;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!V()) {
            this.f44941M = (byte) 0;
            return false;
        }
        if (!W()) {
            this.f44941M = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < R(); i10++) {
            if (!Q(i10).b()) {
                this.f44941M = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f44941M = (byte) 1;
            return true;
        }
        this.f44941M = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return b0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44942N;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44933E & 1) == 1 ? CodedOutputStream.o(1, this.f44934F) : 0;
        if ((this.f44933E & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f44935G);
        }
        if ((this.f44933E & 4) == 4) {
            iO += CodedOutputStream.a(3, this.f44936H);
        }
        if ((this.f44933E & 8) == 8) {
            iO += CodedOutputStream.h(4, this.f44937I.e());
        }
        for (int i11 = 0; i11 < this.f44938J.size(); i11++) {
            iO += CodedOutputStream.s(5, this.f44938J.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f44939K.size(); i12++) {
            iP += CodedOutputStream.p(this.f44939K.get(i12).intValue());
        }
        int iP2 = iO + iP;
        if (!S().isEmpty()) {
            iP2 = iP2 + 1 + CodedOutputStream.p(iP);
        }
        this.f44940L = iP;
        int iU = iP2 + u() + this.f44932D.size();
        this.f44942N = iU;
        return iU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3939s> h() {
        return f44931P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44933E & 1) == 1) {
            codedOutputStream.a0(1, this.f44934F);
        }
        if ((this.f44933E & 2) == 2) {
            codedOutputStream.a0(2, this.f44935G);
        }
        if ((this.f44933E & 4) == 4) {
            codedOutputStream.L(3, this.f44936H);
        }
        if ((this.f44933E & 8) == 8) {
            codedOutputStream.S(4, this.f44937I.e());
        }
        for (int i10 = 0; i10 < this.f44938J.size(); i10++) {
            codedOutputStream.d0(5, this.f44938J.get(i10));
        }
        if (S().size() > 0) {
            codedOutputStream.o0(50);
            codedOutputStream.o0(this.f44940L);
        }
        for (int i11 = 0; i11 < this.f44939K.size(); i11++) {
            codedOutputStream.b0(this.f44939K.get(i11).intValue());
        }
        aVarZ.a(1000, codedOutputStream);
        codedOutputStream.i0(this.f44932D);
    }

    private C3939s(h.c<C3939s, ?> cVar) {
        super(cVar);
        this.f44940L = -1;
        this.f44941M = (byte) -1;
        this.f44942N = -1;
        this.f44932D = cVar.n();
    }

    private C3939s(boolean z10) {
        this.f44940L = -1;
        this.f44941M = (byte) -1;
        this.f44942N = -1;
        this.f44932D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3939s(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44940L = -1;
        this.f44941M = (byte) -1;
        this.f44942N = -1;
        Z();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f44933E |= 1;
                            this.f44934F = eVar.s();
                        } else if (iK == 16) {
                            this.f44933E |= 2;
                            this.f44935G = eVar.s();
                        } else if (iK == 24) {
                            this.f44933E |= 4;
                            this.f44936H = eVar.k();
                        } else if (iK == 32) {
                            int iN = eVar.n();
                            c cVarC = c.c(iN);
                            if (cVarC == null) {
                                codedOutputStreamJ.o0(iK);
                                codedOutputStreamJ.o0(iN);
                            } else {
                                this.f44933E |= 8;
                                this.f44937I = cVarC;
                            }
                        } else if (iK == 42) {
                            if ((i10 & 16) != 16) {
                                this.f44938J = new ArrayList();
                                i10 |= 16;
                            }
                            this.f44938J.add(eVar.u(C3937q.f44851W, fVar));
                        } else if (iK == 48) {
                            if ((i10 & 32) != 32) {
                                this.f44939K = new ArrayList();
                                i10 |= 32;
                            }
                            this.f44939K.add(Integer.valueOf(eVar.s()));
                        } else if (iK != 50) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            int iJ = eVar.j(eVar.A());
                            if ((i10 & 32) != 32 && eVar.e() > 0) {
                                this.f44939K = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.e() > 0) {
                                this.f44939K.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 16) == 16) {
                    this.f44938J = Collections.unmodifiableList(this.f44938J);
                }
                if ((i10 & 32) == 32) {
                    this.f44939K = Collections.unmodifiableList(this.f44939K);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44932D = bVarD.e();
                    throw th2;
                }
                this.f44932D = bVarD.e();
                n();
                throw th;
            }
        }
        if ((i10 & 16) == 16) {
            this.f44938J = Collections.unmodifiableList(this.f44938J);
        }
        if ((i10 & 32) == 32) {
            this.f44939K = Collections.unmodifiableList(this.f44939K);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44932D = bVarD.e();
            throw th3;
        }
        this.f44932D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.s$b */
    public static final class b extends h.c<C3939s, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44943E;

        /* renamed from: F, reason: collision with root package name */
        private int f44944F;

        /* renamed from: G, reason: collision with root package name */
        private int f44945G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f44946H;

        /* renamed from: I, reason: collision with root package name */
        private c f44947I = c.INV;

        /* renamed from: J, reason: collision with root package name */
        private List<C3937q> f44948J = Collections.emptyList();

        /* renamed from: K, reason: collision with root package name */
        private List<Integer> f44949K = Collections.emptyList();

        private b() {
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44943E & 32) != 32) {
                this.f44949K = new ArrayList(this.f44949K);
                this.f44943E |= 32;
            }
        }

        private void D() {
            if ((this.f44943E & 16) != 16) {
                this.f44948J = new ArrayList(this.f44948J);
                this.f44943E |= 16;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3939s.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.s> r1 = lb.C3939s.f44931P     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.s r3 = (lb.C3939s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.s r4 = (lb.C3939s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3939s.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.s$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public b o(C3939s c3939s) {
            if (c3939s == C3939s.L()) {
                return this;
            }
            if (c3939s.V()) {
                H(c3939s.N());
            }
            if (c3939s.W()) {
                I(c3939s.O());
            }
            if (c3939s.X()) {
                J(c3939s.P());
            }
            if (c3939s.Y()) {
                L(c3939s.U());
            }
            if (!c3939s.f44938J.isEmpty()) {
                if (this.f44948J.isEmpty()) {
                    this.f44948J = c3939s.f44938J;
                    this.f44943E &= -17;
                } else {
                    D();
                    this.f44948J.addAll(c3939s.f44938J);
                }
            }
            if (!c3939s.f44939K.isEmpty()) {
                if (this.f44949K.isEmpty()) {
                    this.f44949K = c3939s.f44939K;
                    this.f44943E &= -33;
                } else {
                    C();
                    this.f44949K.addAll(c3939s.f44939K);
                }
            }
            t(c3939s);
            p(n().f(c3939s.f44932D));
            return this;
        }

        public b H(int i10) {
            this.f44943E |= 1;
            this.f44944F = i10;
            return this;
        }

        public b I(int i10) {
            this.f44943E |= 2;
            this.f44945G = i10;
            return this;
        }

        public b J(boolean z10) {
            this.f44943E |= 4;
            this.f44946H = z10;
            return this;
        }

        public b L(c cVar) {
            cVar.getClass();
            this.f44943E |= 8;
            this.f44947I = cVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3939s e() {
            C3939s c3939sW = w();
            if (c3939sW.b()) {
                return c3939sW;
            }
            throw a.AbstractC0582a.l(c3939sW);
        }

        public C3939s w() {
            C3939s c3939s = new C3939s(this);
            int i10 = this.f44943E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3939s.f44934F = this.f44944F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3939s.f44935G = this.f44945G;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3939s.f44936H = this.f44946H;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3939s.f44937I = this.f44947I;
            if ((this.f44943E & 16) == 16) {
                this.f44948J = Collections.unmodifiableList(this.f44948J);
                this.f44943E &= -17;
            }
            c3939s.f44938J = this.f44948J;
            if ((this.f44943E & 32) == 32) {
                this.f44949K = Collections.unmodifiableList(this.f44949K);
                this.f44943E &= -33;
            }
            c3939s.f44939K = this.f44949K;
            c3939s.f44933E = i11;
            return c3939s;
        }

        private void E() {
        }
    }
}
