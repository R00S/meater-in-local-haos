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
import lb.C3940t;
import lb.w;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3932l extends h.d<C3932l> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: M, reason: collision with root package name */
    private static final C3932l f44747M;

    /* renamed from: N, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3932l> f44748N = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44749D;

    /* renamed from: E, reason: collision with root package name */
    private int f44750E;

    /* renamed from: F, reason: collision with root package name */
    private List<C3929i> f44751F;

    /* renamed from: G, reason: collision with root package name */
    private List<C3934n> f44752G;

    /* renamed from: H, reason: collision with root package name */
    private List<C3938r> f44753H;

    /* renamed from: I, reason: collision with root package name */
    private C3940t f44754I;

    /* renamed from: J, reason: collision with root package name */
    private w f44755J;

    /* renamed from: K, reason: collision with root package name */
    private byte f44756K;

    /* renamed from: L, reason: collision with root package name */
    private int f44757L;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.l$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3932l> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3932l b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3932l(eVar, fVar);
        }
    }

    static {
        C3932l c3932l = new C3932l(true);
        f44747M = c3932l;
        c3932l.a0();
    }

    public static C3932l L() {
        return f44747M;
    }

    private void a0() {
        this.f44751F = Collections.emptyList();
        this.f44752G = Collections.emptyList();
        this.f44753H = Collections.emptyList();
        this.f44754I = C3940t.x();
        this.f44755J = w.v();
    }

    public static b b0() {
        return b.B();
    }

    public static b c0(C3932l c3932l) {
        return b0().o(c3932l);
    }

    public static C3932l e0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f44748N.a(inputStream, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C3932l c() {
        return f44747M;
    }

    public C3929i N(int i10) {
        return this.f44751F.get(i10);
    }

    public int O() {
        return this.f44751F.size();
    }

    public List<C3929i> P() {
        return this.f44751F;
    }

    public C3934n Q(int i10) {
        return this.f44752G.get(i10);
    }

    public int R() {
        return this.f44752G.size();
    }

    public List<C3934n> S() {
        return this.f44752G;
    }

    public C3938r T(int i10) {
        return this.f44753H.get(i10);
    }

    public int U() {
        return this.f44753H.size();
    }

    public List<C3938r> V() {
        return this.f44753H;
    }

    public C3940t W() {
        return this.f44754I;
    }

    public w X() {
        return this.f44755J;
    }

    public boolean Y() {
        return (this.f44750E & 1) == 1;
    }

    public boolean Z() {
        return (this.f44750E & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44756K;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < O(); i10++) {
            if (!N(i10).b()) {
                this.f44756K = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < R(); i11++) {
            if (!Q(i11).b()) {
                this.f44756K = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < U(); i12++) {
            if (!T(i12).b()) {
                this.f44756K = (byte) 0;
                return false;
            }
        }
        if (Y() && !W().b()) {
            this.f44756K = (byte) 0;
            return false;
        }
        if (t()) {
            this.f44756K = (byte) 1;
            return true;
        }
        this.f44756K = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44757L;
        if (i10 != -1) {
            return i10;
        }
        int iS = 0;
        for (int i11 = 0; i11 < this.f44751F.size(); i11++) {
            iS += CodedOutputStream.s(3, this.f44751F.get(i11));
        }
        for (int i12 = 0; i12 < this.f44752G.size(); i12++) {
            iS += CodedOutputStream.s(4, this.f44752G.get(i12));
        }
        for (int i13 = 0; i13 < this.f44753H.size(); i13++) {
            iS += CodedOutputStream.s(5, this.f44753H.get(i13));
        }
        if ((this.f44750E & 1) == 1) {
            iS += CodedOutputStream.s(30, this.f44754I);
        }
        if ((this.f44750E & 2) == 2) {
            iS += CodedOutputStream.s(32, this.f44755J);
        }
        int iU = iS + u() + this.f44749D.size();
        this.f44757L = iU;
        return iU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return c0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3932l> h() {
        return f44748N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        for (int i10 = 0; i10 < this.f44751F.size(); i10++) {
            codedOutputStream.d0(3, this.f44751F.get(i10));
        }
        for (int i11 = 0; i11 < this.f44752G.size(); i11++) {
            codedOutputStream.d0(4, this.f44752G.get(i11));
        }
        for (int i12 = 0; i12 < this.f44753H.size(); i12++) {
            codedOutputStream.d0(5, this.f44753H.get(i12));
        }
        if ((this.f44750E & 1) == 1) {
            codedOutputStream.d0(30, this.f44754I);
        }
        if ((this.f44750E & 2) == 2) {
            codedOutputStream.d0(32, this.f44755J);
        }
        aVarZ.a(200, codedOutputStream);
        codedOutputStream.i0(this.f44749D);
    }

    private C3932l(h.c<C3932l, ?> cVar) {
        super(cVar);
        this.f44756K = (byte) -1;
        this.f44757L = -1;
        this.f44749D = cVar.n();
    }

    private C3932l(boolean z10) {
        this.f44756K = (byte) -1;
        this.f44757L = -1;
        this.f44749D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private C3932l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44756K = (byte) -1;
        this.f44757L = -1;
        a0();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 26) {
                            int i10 = (c10 == true ? 1 : 0) & 1;
                            c10 = c10;
                            if (i10 != 1) {
                                this.f44751F = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 1;
                            }
                            this.f44751F.add(eVar.u(C3929i.f44698X, fVar));
                        } else if (iK == 34) {
                            int i11 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i11 != 2) {
                                this.f44752G = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 2;
                            }
                            this.f44752G.add(eVar.u(C3934n.f44780X, fVar));
                        } else if (iK != 42) {
                            if (iK == 242) {
                                C3940t.b bVarH = (this.f44750E & 1) == 1 ? this.f44754I.d() : null;
                                C3940t c3940t = (C3940t) eVar.u(C3940t.f44957J, fVar);
                                this.f44754I = c3940t;
                                if (bVarH != null) {
                                    bVarH.o(c3940t);
                                    this.f44754I = bVarH.s();
                                }
                                this.f44750E |= 1;
                            } else if (iK != 258) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                w.b bVarC = (this.f44750E & 2) == 2 ? this.f44755J.d() : null;
                                w wVar = (w) eVar.u(w.f45018H, fVar);
                                this.f44755J = wVar;
                                if (bVarC != null) {
                                    bVarC.o(wVar);
                                    this.f44755J = bVarC.s();
                                }
                                this.f44750E |= 2;
                            }
                        } else {
                            int i12 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i12 != 4) {
                                this.f44753H = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            this.f44753H.add(eVar.u(C3938r.f44906R, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & 1) == 1) {
                    this.f44751F = Collections.unmodifiableList(this.f44751F);
                }
                if (((c10 == true ? 1 : 0) & 2) == 2) {
                    this.f44752G = Collections.unmodifiableList(this.f44752G);
                }
                if (((c10 == true ? 1 : 0) & 4) == 4) {
                    this.f44753H = Collections.unmodifiableList(this.f44753H);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44749D = bVarD.e();
                    throw th2;
                }
                this.f44749D = bVarD.e();
                n();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & 1) == 1) {
            this.f44751F = Collections.unmodifiableList(this.f44751F);
        }
        if (((c10 == true ? 1 : 0) & 2) == 2) {
            this.f44752G = Collections.unmodifiableList(this.f44752G);
        }
        if (((c10 == true ? 1 : 0) & 4) == 4) {
            this.f44753H = Collections.unmodifiableList(this.f44753H);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44749D = bVarD.e();
            throw th3;
        }
        this.f44749D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.l$b */
    public static final class b extends h.c<C3932l, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44758E;

        /* renamed from: F, reason: collision with root package name */
        private List<C3929i> f44759F = Collections.emptyList();

        /* renamed from: G, reason: collision with root package name */
        private List<C3934n> f44760G = Collections.emptyList();

        /* renamed from: H, reason: collision with root package name */
        private List<C3938r> f44761H = Collections.emptyList();

        /* renamed from: I, reason: collision with root package name */
        private C3940t f44762I = C3940t.x();

        /* renamed from: J, reason: collision with root package name */
        private w f44763J = w.v();

        private b() {
            F();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44758E & 1) != 1) {
                this.f44759F = new ArrayList(this.f44759F);
                this.f44758E |= 1;
            }
        }

        private void D() {
            if ((this.f44758E & 2) != 2) {
                this.f44760G = new ArrayList(this.f44760G);
                this.f44758E |= 2;
            }
        }

        private void E() {
            if ((this.f44758E & 4) != 4) {
                this.f44761H = new ArrayList(this.f44761H);
                this.f44758E |= 4;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3932l.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.l> r1 = lb.C3932l.f44748N     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.l r3 = (lb.C3932l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.l r4 = (lb.C3932l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3932l.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.l$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public b o(C3932l c3932l) {
            if (c3932l == C3932l.L()) {
                return this;
            }
            if (!c3932l.f44751F.isEmpty()) {
                if (this.f44759F.isEmpty()) {
                    this.f44759F = c3932l.f44751F;
                    this.f44758E &= -2;
                } else {
                    C();
                    this.f44759F.addAll(c3932l.f44751F);
                }
            }
            if (!c3932l.f44752G.isEmpty()) {
                if (this.f44760G.isEmpty()) {
                    this.f44760G = c3932l.f44752G;
                    this.f44758E &= -3;
                } else {
                    D();
                    this.f44760G.addAll(c3932l.f44752G);
                }
            }
            if (!c3932l.f44753H.isEmpty()) {
                if (this.f44761H.isEmpty()) {
                    this.f44761H = c3932l.f44753H;
                    this.f44758E &= -5;
                } else {
                    E();
                    this.f44761H.addAll(c3932l.f44753H);
                }
            }
            if (c3932l.Y()) {
                I(c3932l.W());
            }
            if (c3932l.Z()) {
                J(c3932l.X());
            }
            t(c3932l);
            p(n().f(c3932l.f44749D));
            return this;
        }

        public b I(C3940t c3940t) {
            if ((this.f44758E & 8) != 8 || this.f44762I == C3940t.x()) {
                this.f44762I = c3940t;
            } else {
                this.f44762I = C3940t.F(this.f44762I).o(c3940t).s();
            }
            this.f44758E |= 8;
            return this;
        }

        public b J(w wVar) {
            if ((this.f44758E & 16) != 16 || this.f44763J == w.v()) {
                this.f44763J = wVar;
            } else {
                this.f44763J = w.A(this.f44763J).o(wVar).s();
            }
            this.f44758E |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3932l e() {
            C3932l c3932lW = w();
            if (c3932lW.b()) {
                return c3932lW;
            }
            throw a.AbstractC0582a.l(c3932lW);
        }

        public C3932l w() {
            C3932l c3932l = new C3932l(this);
            int i10 = this.f44758E;
            if ((i10 & 1) == 1) {
                this.f44759F = Collections.unmodifiableList(this.f44759F);
                this.f44758E &= -2;
            }
            c3932l.f44751F = this.f44759F;
            if ((this.f44758E & 2) == 2) {
                this.f44760G = Collections.unmodifiableList(this.f44760G);
                this.f44758E &= -3;
            }
            c3932l.f44752G = this.f44760G;
            if ((this.f44758E & 4) == 4) {
                this.f44761H = Collections.unmodifiableList(this.f44761H);
                this.f44758E &= -5;
            }
            c3932l.f44753H = this.f44761H;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            c3932l.f44754I = this.f44762I;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            c3932l.f44755J = this.f44763J;
            c3932l.f44750E = i11;
            return c3932l;
        }

        private void F() {
        }
    }
}
