package lb;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3932l;
import lb.C3935o;
import lb.C3936p;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3933m extends h.d<C3933m> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: L, reason: collision with root package name */
    private static final C3933m f44764L;

    /* renamed from: M, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3933m> f44765M = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44766D;

    /* renamed from: E, reason: collision with root package name */
    private int f44767E;

    /* renamed from: F, reason: collision with root package name */
    private C3936p f44768F;

    /* renamed from: G, reason: collision with root package name */
    private C3935o f44769G;

    /* renamed from: H, reason: collision with root package name */
    private C3932l f44770H;

    /* renamed from: I, reason: collision with root package name */
    private List<C3923c> f44771I;

    /* renamed from: J, reason: collision with root package name */
    private byte f44772J;

    /* renamed from: K, reason: collision with root package name */
    private int f44773K;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.m$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3933m> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3933m b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3933m(eVar, fVar);
        }
    }

    static {
        C3933m c3933m = new C3933m(true);
        f44764L = c3933m;
        c3933m.T();
    }

    public static C3933m L() {
        return f44764L;
    }

    private void T() {
        this.f44768F = C3936p.v();
        this.f44769G = C3935o.v();
        this.f44770H = C3932l.L();
        this.f44771I = Collections.emptyList();
    }

    public static b U() {
        return b.B();
    }

    public static b V(C3933m c3933m) {
        return U().o(c3933m);
    }

    public static C3933m X(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f44765M.a(inputStream, fVar);
    }

    public C3923c I(int i10) {
        return this.f44771I.get(i10);
    }

    public int J() {
        return this.f44771I.size();
    }

    public List<C3923c> K() {
        return this.f44771I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C3933m c() {
        return f44764L;
    }

    public C3932l N() {
        return this.f44770H;
    }

    public C3935o O() {
        return this.f44769G;
    }

    public C3936p P() {
        return this.f44768F;
    }

    public boolean Q() {
        return (this.f44767E & 4) == 4;
    }

    public boolean R() {
        return (this.f44767E & 2) == 2;
    }

    public boolean S() {
        return (this.f44767E & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public b g() {
        return U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b d() {
        return V(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44772J;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (R() && !O().b()) {
            this.f44772J = (byte) 0;
            return false;
        }
        if (Q() && !N().b()) {
            this.f44772J = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < J(); i10++) {
            if (!I(i10).b()) {
                this.f44772J = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f44772J = (byte) 1;
            return true;
        }
        this.f44772J = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44773K;
        if (i10 != -1) {
            return i10;
        }
        int iS = (this.f44767E & 1) == 1 ? CodedOutputStream.s(1, this.f44768F) : 0;
        if ((this.f44767E & 2) == 2) {
            iS += CodedOutputStream.s(2, this.f44769G);
        }
        if ((this.f44767E & 4) == 4) {
            iS += CodedOutputStream.s(3, this.f44770H);
        }
        for (int i11 = 0; i11 < this.f44771I.size(); i11++) {
            iS += CodedOutputStream.s(4, this.f44771I.get(i11));
        }
        int iU = iS + u() + this.f44766D.size();
        this.f44773K = iU;
        return iU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3933m> h() {
        return f44765M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44767E & 1) == 1) {
            codedOutputStream.d0(1, this.f44768F);
        }
        if ((this.f44767E & 2) == 2) {
            codedOutputStream.d0(2, this.f44769G);
        }
        if ((this.f44767E & 4) == 4) {
            codedOutputStream.d0(3, this.f44770H);
        }
        for (int i10 = 0; i10 < this.f44771I.size(); i10++) {
            codedOutputStream.d0(4, this.f44771I.get(i10));
        }
        aVarZ.a(200, codedOutputStream);
        codedOutputStream.i0(this.f44766D);
    }

    private C3933m(h.c<C3933m, ?> cVar) {
        super(cVar);
        this.f44772J = (byte) -1;
        this.f44773K = -1;
        this.f44766D = cVar.n();
    }

    private C3933m(boolean z10) {
        this.f44772J = (byte) -1;
        this.f44773K = -1;
        this.f44766D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3933m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44772J = (byte) -1;
        this.f44773K = -1;
        T();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            C3936p.b bVarC = (this.f44767E & 1) == 1 ? this.f44768F.d() : null;
                            C3936p c3936p = (C3936p) eVar.u(C3936p.f44843H, fVar);
                            this.f44768F = c3936p;
                            if (bVarC != null) {
                                bVarC.o(c3936p);
                                this.f44768F = bVarC.s();
                            }
                            this.f44767E |= 1;
                        } else if (iK == 18) {
                            C3935o.b bVarC2 = (this.f44767E & 2) == 2 ? this.f44769G.d() : null;
                            C3935o c3935o = (C3935o) eVar.u(C3935o.f44816H, fVar);
                            this.f44769G = c3935o;
                            if (bVarC2 != null) {
                                bVarC2.o(c3935o);
                                this.f44769G = bVarC2.s();
                            }
                            this.f44767E |= 2;
                        } else if (iK == 26) {
                            C3932l.b bVarD2 = (this.f44767E & 4) == 4 ? this.f44770H.d() : null;
                            C3932l c3932l = (C3932l) eVar.u(C3932l.f44748N, fVar);
                            this.f44770H = c3932l;
                            if (bVarD2 != null) {
                                bVarD2.o(c3932l);
                                this.f44770H = bVarD2.w();
                            }
                            this.f44767E |= 4;
                        } else if (iK != 34) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            int i10 = (c10 == true ? 1 : 0) & '\b';
                            c10 = c10;
                            if (i10 != 8) {
                                this.f44771I = new ArrayList();
                                c10 = '\b';
                            }
                            this.f44771I.add(eVar.u(C3923c.f44543m0, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f44771I = Collections.unmodifiableList(this.f44771I);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44766D = bVarD.e();
                    throw th2;
                }
                this.f44766D = bVarD.e();
                n();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f44771I = Collections.unmodifiableList(this.f44771I);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44766D = bVarD.e();
            throw th3;
        }
        this.f44766D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.m$b */
    public static final class b extends h.c<C3933m, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44774E;

        /* renamed from: F, reason: collision with root package name */
        private C3936p f44775F = C3936p.v();

        /* renamed from: G, reason: collision with root package name */
        private C3935o f44776G = C3935o.v();

        /* renamed from: H, reason: collision with root package name */
        private C3932l f44777H = C3932l.L();

        /* renamed from: I, reason: collision with root package name */
        private List<C3923c> f44778I = Collections.emptyList();

        private b() {
            D();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44774E & 8) != 8) {
                this.f44778I = new ArrayList(this.f44778I);
                this.f44774E |= 8;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3933m.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.m> r1 = lb.C3933m.f44765M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.m r3 = (lb.C3933m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.m r4 = (lb.C3933m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3933m.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.m$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b o(C3933m c3933m) {
            if (c3933m == C3933m.L()) {
                return this;
            }
            if (c3933m.S()) {
                I(c3933m.P());
            }
            if (c3933m.R()) {
                H(c3933m.O());
            }
            if (c3933m.Q()) {
                G(c3933m.N());
            }
            if (!c3933m.f44771I.isEmpty()) {
                if (this.f44778I.isEmpty()) {
                    this.f44778I = c3933m.f44771I;
                    this.f44774E &= -9;
                } else {
                    C();
                    this.f44778I.addAll(c3933m.f44771I);
                }
            }
            t(c3933m);
            p(n().f(c3933m.f44766D));
            return this;
        }

        public b G(C3932l c3932l) {
            if ((this.f44774E & 4) != 4 || this.f44777H == C3932l.L()) {
                this.f44777H = c3932l;
            } else {
                this.f44777H = C3932l.c0(this.f44777H).o(c3932l).w();
            }
            this.f44774E |= 4;
            return this;
        }

        public b H(C3935o c3935o) {
            if ((this.f44774E & 2) != 2 || this.f44776G == C3935o.v()) {
                this.f44776G = c3935o;
            } else {
                this.f44776G = C3935o.A(this.f44776G).o(c3935o).s();
            }
            this.f44774E |= 2;
            return this;
        }

        public b I(C3936p c3936p) {
            if ((this.f44774E & 1) != 1 || this.f44775F == C3936p.v()) {
                this.f44775F = c3936p;
            } else {
                this.f44775F = C3936p.A(this.f44775F).o(c3936p).s();
            }
            this.f44774E |= 1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3933m e() {
            C3933m c3933mW = w();
            if (c3933mW.b()) {
                return c3933mW;
            }
            throw a.AbstractC0582a.l(c3933mW);
        }

        public C3933m w() {
            C3933m c3933m = new C3933m(this);
            int i10 = this.f44774E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3933m.f44768F = this.f44775F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3933m.f44769G = this.f44776G;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3933m.f44770H = this.f44777H;
            if ((this.f44774E & 8) == 8) {
                this.f44778I = Collections.unmodifiableList(this.f44778I);
                this.f44774E &= -9;
            }
            c3933m.f44771I = this.f44778I;
            c3933m.f44767E = i11;
            return c3933m;
        }

        private void D() {
        }
    }
}
