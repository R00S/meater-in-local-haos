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
import lb.C3937q;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3928h extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: N, reason: collision with root package name */
    private static final C3928h f44670N;

    /* renamed from: O, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3928h> f44671O = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44672C;

    /* renamed from: D, reason: collision with root package name */
    private int f44673D;

    /* renamed from: E, reason: collision with root package name */
    private int f44674E;

    /* renamed from: F, reason: collision with root package name */
    private int f44675F;

    /* renamed from: G, reason: collision with root package name */
    private c f44676G;

    /* renamed from: H, reason: collision with root package name */
    private C3937q f44677H;

    /* renamed from: I, reason: collision with root package name */
    private int f44678I;

    /* renamed from: J, reason: collision with root package name */
    private List<C3928h> f44679J;

    /* renamed from: K, reason: collision with root package name */
    private List<C3928h> f44680K;

    /* renamed from: L, reason: collision with root package name */
    private byte f44681L;

    /* renamed from: M, reason: collision with root package name */
    private int f44682M;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.h$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3928h> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3928h b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3928h(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.h$c */
    public enum c implements i.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* renamed from: F, reason: collision with root package name */
        private static i.b<c> f44694F = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f44696B;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.h$c$a */
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
            this.f44696B = i11;
        }

        public static c c(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f44696B;
        }
    }

    static {
        C3928h c3928h = new C3928h(true);
        f44670N = c3928h;
        c3928h.S();
    }

    public static C3928h G() {
        return f44670N;
    }

    private void S() {
        this.f44674E = 0;
        this.f44675F = 0;
        this.f44676G = c.TRUE;
        this.f44677H = C3937q.Y();
        this.f44678I = 0;
        this.f44679J = Collections.emptyList();
        this.f44680K = Collections.emptyList();
    }

    public static b T() {
        return b.u();
    }

    public static b U(C3928h c3928h) {
        return T().o(c3928h);
    }

    public C3928h D(int i10) {
        return this.f44679J.get(i10);
    }

    public int E() {
        return this.f44679J.size();
    }

    public c F() {
        return this.f44676G;
    }

    public int H() {
        return this.f44674E;
    }

    public C3937q I() {
        return this.f44677H;
    }

    public int J() {
        return this.f44678I;
    }

    public C3928h K(int i10) {
        return this.f44680K.get(i10);
    }

    public int L() {
        return this.f44680K.size();
    }

    public int M() {
        return this.f44675F;
    }

    public boolean N() {
        return (this.f44673D & 4) == 4;
    }

    public boolean O() {
        return (this.f44673D & 1) == 1;
    }

    public boolean P() {
        return (this.f44673D & 8) == 8;
    }

    public boolean Q() {
        return (this.f44673D & 16) == 16;
    }

    public boolean R() {
        return (this.f44673D & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b g() {
        return T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public b d() {
        return U(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44681L;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (P() && !I().b()) {
            this.f44681L = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < E(); i10++) {
            if (!D(i10).b()) {
                this.f44681L = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < L(); i11++) {
            if (!K(i11).b()) {
                this.f44681L = (byte) 0;
                return false;
            }
        }
        this.f44681L = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44682M;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44673D & 1) == 1 ? CodedOutputStream.o(1, this.f44674E) : 0;
        if ((this.f44673D & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f44675F);
        }
        if ((this.f44673D & 4) == 4) {
            iO += CodedOutputStream.h(3, this.f44676G.e());
        }
        if ((this.f44673D & 8) == 8) {
            iO += CodedOutputStream.s(4, this.f44677H);
        }
        if ((this.f44673D & 16) == 16) {
            iO += CodedOutputStream.o(5, this.f44678I);
        }
        for (int i11 = 0; i11 < this.f44679J.size(); i11++) {
            iO += CodedOutputStream.s(6, this.f44679J.get(i11));
        }
        for (int i12 = 0; i12 < this.f44680K.size(); i12++) {
            iO += CodedOutputStream.s(7, this.f44680K.get(i12));
        }
        int size = iO + this.f44672C.size();
        this.f44682M = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3928h> h() {
        return f44671O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        if ((this.f44673D & 1) == 1) {
            codedOutputStream.a0(1, this.f44674E);
        }
        if ((this.f44673D & 2) == 2) {
            codedOutputStream.a0(2, this.f44675F);
        }
        if ((this.f44673D & 4) == 4) {
            codedOutputStream.S(3, this.f44676G.e());
        }
        if ((this.f44673D & 8) == 8) {
            codedOutputStream.d0(4, this.f44677H);
        }
        if ((this.f44673D & 16) == 16) {
            codedOutputStream.a0(5, this.f44678I);
        }
        for (int i10 = 0; i10 < this.f44679J.size(); i10++) {
            codedOutputStream.d0(6, this.f44679J.get(i10));
        }
        for (int i11 = 0; i11 < this.f44680K.size(); i11++) {
            codedOutputStream.d0(7, this.f44680K.get(i11));
        }
        codedOutputStream.i0(this.f44672C);
    }

    private C3928h(h.b bVar) {
        super(bVar);
        this.f44681L = (byte) -1;
        this.f44682M = -1;
        this.f44672C = bVar.n();
    }

    private C3928h(boolean z10) {
        this.f44681L = (byte) -1;
        this.f44682M = -1;
        this.f44672C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3928h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44681L = (byte) -1;
        this.f44682M = -1;
        S();
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
                            this.f44673D |= 1;
                            this.f44674E = eVar.s();
                        } else if (iK == 16) {
                            this.f44673D |= 2;
                            this.f44675F = eVar.s();
                        } else if (iK == 24) {
                            int iN = eVar.n();
                            c cVarC = c.c(iN);
                            if (cVarC == null) {
                                codedOutputStreamJ.o0(iK);
                                codedOutputStreamJ.o0(iN);
                            } else {
                                this.f44673D |= 4;
                                this.f44676G = cVarC;
                            }
                        } else if (iK == 34) {
                            C3937q.c cVarD = (this.f44673D & 8) == 8 ? this.f44677H.d() : null;
                            C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                            this.f44677H = c3937q;
                            if (cVarD != null) {
                                cVarD.o(c3937q);
                                this.f44677H = cVarD.w();
                            }
                            this.f44673D |= 8;
                        } else if (iK == 40) {
                            this.f44673D |= 16;
                            this.f44678I = eVar.s();
                        } else if (iK == 50) {
                            if ((i10 & 32) != 32) {
                                this.f44679J = new ArrayList();
                                i10 |= 32;
                            }
                            this.f44679J.add(eVar.u(f44671O, fVar));
                        } else if (iK != 58) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f44680K = new ArrayList();
                                i10 |= 64;
                            }
                            this.f44680K.add(eVar.u(f44671O, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 32) == 32) {
                    this.f44679J = Collections.unmodifiableList(this.f44679J);
                }
                if ((i10 & 64) == 64) {
                    this.f44680K = Collections.unmodifiableList(this.f44680K);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44672C = bVarD.e();
                    throw th2;
                }
                this.f44672C = bVarD.e();
                n();
                throw th;
            }
        }
        if ((i10 & 32) == 32) {
            this.f44679J = Collections.unmodifiableList(this.f44679J);
        }
        if ((i10 & 64) == 64) {
            this.f44680K = Collections.unmodifiableList(this.f44680K);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44672C = bVarD.e();
            throw th3;
        }
        this.f44672C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.h$b */
    public static final class b extends h.b<C3928h, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44683C;

        /* renamed from: D, reason: collision with root package name */
        private int f44684D;

        /* renamed from: E, reason: collision with root package name */
        private int f44685E;

        /* renamed from: H, reason: collision with root package name */
        private int f44688H;

        /* renamed from: F, reason: collision with root package name */
        private c f44686F = c.TRUE;

        /* renamed from: G, reason: collision with root package name */
        private C3937q f44687G = C3937q.Y();

        /* renamed from: I, reason: collision with root package name */
        private List<C3928h> f44689I = Collections.emptyList();

        /* renamed from: J, reason: collision with root package name */
        private List<C3928h> f44690J = Collections.emptyList();

        private b() {
            A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f44683C & 32) != 32) {
                this.f44689I = new ArrayList(this.f44689I);
                this.f44683C |= 32;
            }
        }

        private void w() {
            if ((this.f44683C & 64) != 64) {
                this.f44690J = new ArrayList(this.f44690J);
                this.f44683C |= 64;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3928h.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.h> r1 = lb.C3928h.f44671O     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.h r3 = (lb.C3928h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.h r4 = (lb.C3928h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3928h.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.h$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b o(C3928h c3928h) {
            if (c3928h == C3928h.G()) {
                return this;
            }
            if (c3928h.O()) {
                F(c3928h.H());
            }
            if (c3928h.R()) {
                H(c3928h.M());
            }
            if (c3928h.N()) {
                E(c3928h.F());
            }
            if (c3928h.P()) {
                D(c3928h.I());
            }
            if (c3928h.Q()) {
                G(c3928h.J());
            }
            if (!c3928h.f44679J.isEmpty()) {
                if (this.f44689I.isEmpty()) {
                    this.f44689I = c3928h.f44679J;
                    this.f44683C &= -33;
                } else {
                    v();
                    this.f44689I.addAll(c3928h.f44679J);
                }
            }
            if (!c3928h.f44680K.isEmpty()) {
                if (this.f44690J.isEmpty()) {
                    this.f44690J = c3928h.f44680K;
                    this.f44683C &= -65;
                } else {
                    w();
                    this.f44690J.addAll(c3928h.f44680K);
                }
            }
            p(n().f(c3928h.f44672C));
            return this;
        }

        public b D(C3937q c3937q) {
            if ((this.f44683C & 8) != 8 || this.f44687G == C3937q.Y()) {
                this.f44687G = c3937q;
            } else {
                this.f44687G = C3937q.A0(this.f44687G).o(c3937q).w();
            }
            this.f44683C |= 8;
            return this;
        }

        public b E(c cVar) {
            cVar.getClass();
            this.f44683C |= 4;
            this.f44686F = cVar;
            return this;
        }

        public b F(int i10) {
            this.f44683C |= 1;
            this.f44684D = i10;
            return this;
        }

        public b G(int i10) {
            this.f44683C |= 16;
            this.f44688H = i10;
            return this;
        }

        public b H(int i10) {
            this.f44683C |= 2;
            this.f44685E = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3928h e() {
            C3928h c3928hS = s();
            if (c3928hS.b()) {
                return c3928hS;
            }
            throw a.AbstractC0582a.l(c3928hS);
        }

        public C3928h s() {
            C3928h c3928h = new C3928h(this);
            int i10 = this.f44683C;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3928h.f44674E = this.f44684D;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3928h.f44675F = this.f44685E;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3928h.f44676G = this.f44686F;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3928h.f44677H = this.f44687G;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3928h.f44678I = this.f44688H;
            if ((this.f44683C & 32) == 32) {
                this.f44689I = Collections.unmodifiableList(this.f44689I);
                this.f44683C &= -33;
            }
            c3928h.f44679J = this.f44689I;
            if ((this.f44683C & 64) == 64) {
                this.f44690J = Collections.unmodifiableList(this.f44690J);
                this.f44683C &= -65;
            }
            c3928h.f44680K = this.f44690J;
            c3928h.f44673D = i11;
            return c3928h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public b m() {
            return u().o(s());
        }

        private void A() {
        }
    }
}
