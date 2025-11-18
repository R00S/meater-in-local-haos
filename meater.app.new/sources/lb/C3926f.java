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
import lb.C3928h;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3926f extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: K, reason: collision with root package name */
    private static final C3926f f44634K;

    /* renamed from: L, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3926f> f44635L = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44636C;

    /* renamed from: D, reason: collision with root package name */
    private int f44637D;

    /* renamed from: E, reason: collision with root package name */
    private c f44638E;

    /* renamed from: F, reason: collision with root package name */
    private List<C3928h> f44639F;

    /* renamed from: G, reason: collision with root package name */
    private C3928h f44640G;

    /* renamed from: H, reason: collision with root package name */
    private d f44641H;

    /* renamed from: I, reason: collision with root package name */
    private byte f44642I;

    /* renamed from: J, reason: collision with root package name */
    private int f44643J;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.f$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3926f> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3926f b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3926f(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.f$c */
    public enum c implements i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* renamed from: F, reason: collision with root package name */
        private static i.b<c> f44652F = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f44654B;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.f$c$a */
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
            this.f44654B = i11;
        }

        public static c c(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f44654B;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.f$d */
    public enum d implements i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* renamed from: F, reason: collision with root package name */
        private static i.b<d> f44658F = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f44660B;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.f$d$a */
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
            this.f44660B = i11;
        }

        public static d c(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f44660B;
        }
    }

    static {
        C3926f c3926f = new C3926f(true);
        f44634K = c3926f;
        c3926f.I();
    }

    public static C3926f A() {
        return f44634K;
    }

    private void I() {
        this.f44638E = c.RETURNS_CONSTANT;
        this.f44639F = Collections.emptyList();
        this.f44640G = C3928h.G();
        this.f44641H = d.AT_MOST_ONCE;
    }

    public static b J() {
        return b.u();
    }

    public static b K(C3926f c3926f) {
        return J().o(c3926f);
    }

    public C3928h B(int i10) {
        return this.f44639F.get(i10);
    }

    public int C() {
        return this.f44639F.size();
    }

    public c D() {
        return this.f44638E;
    }

    public d E() {
        return this.f44641H;
    }

    public boolean F() {
        return (this.f44637D & 2) == 2;
    }

    public boolean G() {
        return (this.f44637D & 1) == 1;
    }

    public boolean H() {
        return (this.f44637D & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b g() {
        return J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b d() {
        return K(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44642I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < C(); i10++) {
            if (!B(i10).b()) {
                this.f44642I = (byte) 0;
                return false;
            }
        }
        if (!F() || z().b()) {
            this.f44642I = (byte) 1;
            return true;
        }
        this.f44642I = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44643J;
        if (i10 != -1) {
            return i10;
        }
        int iH = (this.f44637D & 1) == 1 ? CodedOutputStream.h(1, this.f44638E.e()) : 0;
        for (int i11 = 0; i11 < this.f44639F.size(); i11++) {
            iH += CodedOutputStream.s(2, this.f44639F.get(i11));
        }
        if ((this.f44637D & 2) == 2) {
            iH += CodedOutputStream.s(3, this.f44640G);
        }
        if ((this.f44637D & 4) == 4) {
            iH += CodedOutputStream.h(4, this.f44641H.e());
        }
        int size = iH + this.f44636C.size();
        this.f44643J = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3926f> h() {
        return f44635L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        if ((this.f44637D & 1) == 1) {
            codedOutputStream.S(1, this.f44638E.e());
        }
        for (int i10 = 0; i10 < this.f44639F.size(); i10++) {
            codedOutputStream.d0(2, this.f44639F.get(i10));
        }
        if ((this.f44637D & 2) == 2) {
            codedOutputStream.d0(3, this.f44640G);
        }
        if ((this.f44637D & 4) == 4) {
            codedOutputStream.S(4, this.f44641H.e());
        }
        codedOutputStream.i0(this.f44636C);
    }

    public C3928h z() {
        return this.f44640G;
    }

    private C3926f(h.b bVar) {
        super(bVar);
        this.f44642I = (byte) -1;
        this.f44643J = -1;
        this.f44636C = bVar.n();
    }

    private C3926f(boolean z10) {
        this.f44642I = (byte) -1;
        this.f44643J = -1;
        this.f44636C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3926f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44642I = (byte) -1;
        this.f44643J = -1;
        I();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
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
                                this.f44637D |= 1;
                                this.f44638E = cVarC;
                            }
                        } else if (iK == 18) {
                            if ((c10 & 2) != 2) {
                                this.f44639F = new ArrayList();
                                c10 = 2;
                            }
                            this.f44639F.add(eVar.u(C3928h.f44671O, fVar));
                        } else if (iK == 26) {
                            C3928h.b bVarD2 = (this.f44637D & 2) == 2 ? this.f44640G.d() : null;
                            C3928h c3928h = (C3928h) eVar.u(C3928h.f44671O, fVar);
                            this.f44640G = c3928h;
                            if (bVarD2 != null) {
                                bVarD2.o(c3928h);
                                this.f44640G = bVarD2.s();
                            }
                            this.f44637D |= 2;
                        } else if (iK != 32) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            int iN2 = eVar.n();
                            d dVarC = d.c(iN2);
                            if (dVarC == null) {
                                codedOutputStreamJ.o0(iK);
                                codedOutputStreamJ.o0(iN2);
                            } else {
                                this.f44637D |= 4;
                                this.f44641H = dVarC;
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
                if ((c10 & 2) == 2) {
                    this.f44639F = Collections.unmodifiableList(this.f44639F);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44636C = bVarD.e();
                    throw th2;
                }
                this.f44636C = bVarD.e();
                n();
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f44639F = Collections.unmodifiableList(this.f44639F);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44636C = bVarD.e();
            throw th3;
        }
        this.f44636C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.f$b */
    public static final class b extends h.b<C3926f, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44644C;

        /* renamed from: D, reason: collision with root package name */
        private c f44645D = c.RETURNS_CONSTANT;

        /* renamed from: E, reason: collision with root package name */
        private List<C3928h> f44646E = Collections.emptyList();

        /* renamed from: F, reason: collision with root package name */
        private C3928h f44647F = C3928h.G();

        /* renamed from: G, reason: collision with root package name */
        private d f44648G = d.AT_MOST_ONCE;

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f44644C & 2) != 2) {
                this.f44646E = new ArrayList(this.f44646E);
                this.f44644C |= 2;
            }
        }

        public b A(C3928h c3928h) {
            if ((this.f44644C & 4) != 4 || this.f44647F == C3928h.G()) {
                this.f44647F = c3928h;
            } else {
                this.f44647F = C3928h.U(this.f44647F).o(c3928h).s();
            }
            this.f44644C |= 4;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3926f.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.f> r1 = lb.C3926f.f44635L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.f r3 = (lb.C3926f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.f r4 = (lb.C3926f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3926f.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.f$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b o(C3926f c3926f) {
            if (c3926f == C3926f.A()) {
                return this;
            }
            if (c3926f.G()) {
                D(c3926f.D());
            }
            if (!c3926f.f44639F.isEmpty()) {
                if (this.f44646E.isEmpty()) {
                    this.f44646E = c3926f.f44639F;
                    this.f44644C &= -3;
                } else {
                    v();
                    this.f44646E.addAll(c3926f.f44639F);
                }
            }
            if (c3926f.F()) {
                A(c3926f.z());
            }
            if (c3926f.H()) {
                E(c3926f.E());
            }
            p(n().f(c3926f.f44636C));
            return this;
        }

        public b D(c cVar) {
            cVar.getClass();
            this.f44644C |= 1;
            this.f44645D = cVar;
            return this;
        }

        public b E(d dVar) {
            dVar.getClass();
            this.f44644C |= 8;
            this.f44648G = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3926f e() {
            C3926f c3926fS = s();
            if (c3926fS.b()) {
                return c3926fS;
            }
            throw a.AbstractC0582a.l(c3926fS);
        }

        public C3926f s() {
            C3926f c3926f = new C3926f(this);
            int i10 = this.f44644C;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3926f.f44638E = this.f44645D;
            if ((this.f44644C & 2) == 2) {
                this.f44646E = Collections.unmodifiableList(this.f44646E);
                this.f44644C &= -3;
            }
            c3926f.f44639F = this.f44646E;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            c3926f.f44640G = this.f44647F;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3926f.f44641H = this.f44648G;
            c3926f.f44637D = i11;
            return c3926f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public b m() {
            return u().o(s());
        }

        private void w() {
        }
    }
}
