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

/* compiled from: ProtoBuf.java */
/* renamed from: lb.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3940t extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: I, reason: collision with root package name */
    private static final C3940t f44956I;

    /* renamed from: J, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3940t> f44957J = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44958C;

    /* renamed from: D, reason: collision with root package name */
    private int f44959D;

    /* renamed from: E, reason: collision with root package name */
    private List<C3937q> f44960E;

    /* renamed from: F, reason: collision with root package name */
    private int f44961F;

    /* renamed from: G, reason: collision with root package name */
    private byte f44962G;

    /* renamed from: H, reason: collision with root package name */
    private int f44963H;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.t$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3940t> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3940t b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3940t(eVar, fVar);
        }
    }

    static {
        C3940t c3940t = new C3940t(true);
        f44956I = c3940t;
        c3940t.D();
    }

    private void D() {
        this.f44960E = Collections.emptyList();
        this.f44961F = -1;
    }

    public static b E() {
        return b.u();
    }

    public static b F(C3940t c3940t) {
        return E().o(c3940t);
    }

    public static C3940t x() {
        return f44956I;
    }

    public int A() {
        return this.f44960E.size();
    }

    public List<C3937q> B() {
        return this.f44960E;
    }

    public boolean C() {
        return (this.f44959D & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b g() {
        return E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b d() {
        return F(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44962G;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < A(); i10++) {
            if (!z(i10).b()) {
                this.f44962G = (byte) 0;
                return false;
            }
        }
        this.f44962G = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44963H;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f44960E.size(); i11++) {
            iO += CodedOutputStream.s(1, this.f44960E.get(i11));
        }
        if ((this.f44959D & 1) == 1) {
            iO += CodedOutputStream.o(2, this.f44961F);
        }
        int size = iO + this.f44958C.size();
        this.f44963H = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3940t> h() {
        return f44957J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        for (int i10 = 0; i10 < this.f44960E.size(); i10++) {
            codedOutputStream.d0(1, this.f44960E.get(i10));
        }
        if ((this.f44959D & 1) == 1) {
            codedOutputStream.a0(2, this.f44961F);
        }
        codedOutputStream.i0(this.f44958C);
    }

    public int y() {
        return this.f44961F;
    }

    public C3937q z(int i10) {
        return this.f44960E.get(i10);
    }

    private C3940t(h.b bVar) {
        super(bVar);
        this.f44962G = (byte) -1;
        this.f44963H = -1;
        this.f44958C = bVar.n();
    }

    private C3940t(boolean z10) {
        this.f44962G = (byte) -1;
        this.f44963H = -1;
        this.f44958C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3940t(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44962G = (byte) -1;
        this.f44963H = -1;
        D();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            if (!z11) {
                                this.f44960E = new ArrayList();
                                z11 = true;
                            }
                            this.f44960E.add(eVar.u(C3937q.f44851W, fVar));
                        } else if (iK != 16) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            this.f44959D |= 1;
                            this.f44961F = eVar.s();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f44960E = Collections.unmodifiableList(this.f44960E);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44958C = bVarD.e();
                    throw th2;
                }
                this.f44958C = bVarD.e();
                n();
                throw th;
            }
        }
        if (z11) {
            this.f44960E = Collections.unmodifiableList(this.f44960E);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44958C = bVarD.e();
            throw th3;
        }
        this.f44958C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.t$b */
    public static final class b extends h.b<C3940t, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44964C;

        /* renamed from: D, reason: collision with root package name */
        private List<C3937q> f44965D = Collections.emptyList();

        /* renamed from: E, reason: collision with root package name */
        private int f44966E = -1;

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f44964C & 1) != 1) {
                this.f44965D = new ArrayList(this.f44965D);
                this.f44964C |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3940t.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.t> r1 = lb.C3940t.f44957J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.t r3 = (lb.C3940t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.t r4 = (lb.C3940t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3940t.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.t$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b o(C3940t c3940t) {
            if (c3940t == C3940t.x()) {
                return this;
            }
            if (!c3940t.f44960E.isEmpty()) {
                if (this.f44965D.isEmpty()) {
                    this.f44965D = c3940t.f44960E;
                    this.f44964C &= -2;
                } else {
                    v();
                    this.f44965D.addAll(c3940t.f44960E);
                }
            }
            if (c3940t.C()) {
                C(c3940t.y());
            }
            p(n().f(c3940t.f44958C));
            return this;
        }

        public b C(int i10) {
            this.f44964C |= 2;
            this.f44966E = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3940t e() {
            C3940t c3940tS = s();
            if (c3940tS.b()) {
                return c3940tS;
            }
            throw a.AbstractC0582a.l(c3940tS);
        }

        public C3940t s() {
            C3940t c3940t = new C3940t(this);
            int i10 = this.f44964C;
            if ((i10 & 1) == 1) {
                this.f44965D = Collections.unmodifiableList(this.f44965D);
                this.f44964C &= -2;
            }
            c3940t.f44960E = this.f44965D;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            c3940t.f44961F = this.f44966E;
            c3940t.f44959D = i11;
            return c3940t;
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
