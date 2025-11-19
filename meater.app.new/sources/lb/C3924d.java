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
/* renamed from: lb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3924d extends h.d<C3924d> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: K, reason: collision with root package name */
    private static final C3924d f44613K;

    /* renamed from: L, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3924d> f44614L = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44615D;

    /* renamed from: E, reason: collision with root package name */
    private int f44616E;

    /* renamed from: F, reason: collision with root package name */
    private int f44617F;

    /* renamed from: G, reason: collision with root package name */
    private List<u> f44618G;

    /* renamed from: H, reason: collision with root package name */
    private List<Integer> f44619H;

    /* renamed from: I, reason: collision with root package name */
    private byte f44620I;

    /* renamed from: J, reason: collision with root package name */
    private int f44621J;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.d$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3924d> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3924d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3924d(eVar, fVar);
        }
    }

    static {
        C3924d c3924d = new C3924d(true);
        f44613K = c3924d;
        c3924d.Q();
    }

    public static C3924d I() {
        return f44613K;
    }

    private void Q() {
        this.f44617F = 6;
        this.f44618G = Collections.emptyList();
        this.f44619H = Collections.emptyList();
    }

    public static b R() {
        return b.B();
    }

    public static b S(C3924d c3924d) {
        return R().o(c3924d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C3924d c() {
        return f44613K;
    }

    public int K() {
        return this.f44617F;
    }

    public u L(int i10) {
        return this.f44618G.get(i10);
    }

    public int M() {
        return this.f44618G.size();
    }

    public List<u> N() {
        return this.f44618G;
    }

    public List<Integer> O() {
        return this.f44619H;
    }

    public boolean P() {
        return (this.f44616E & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b g() {
        return R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b d() {
        return S(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44620I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < M(); i10++) {
            if (!L(i10).b()) {
                this.f44620I = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f44620I = (byte) 1;
            return true;
        }
        this.f44620I = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44621J;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44616E & 1) == 1 ? CodedOutputStream.o(1, this.f44617F) : 0;
        for (int i11 = 0; i11 < this.f44618G.size(); i11++) {
            iO += CodedOutputStream.s(2, this.f44618G.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f44619H.size(); i12++) {
            iP += CodedOutputStream.p(this.f44619H.get(i12).intValue());
        }
        int size = iO + iP + (O().size() * 2) + u() + this.f44615D.size();
        this.f44621J = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3924d> h() {
        return f44614L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44616E & 1) == 1) {
            codedOutputStream.a0(1, this.f44617F);
        }
        for (int i10 = 0; i10 < this.f44618G.size(); i10++) {
            codedOutputStream.d0(2, this.f44618G.get(i10));
        }
        for (int i11 = 0; i11 < this.f44619H.size(); i11++) {
            codedOutputStream.a0(31, this.f44619H.get(i11).intValue());
        }
        aVarZ.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f44615D);
    }

    private C3924d(h.c<C3924d, ?> cVar) {
        super(cVar);
        this.f44620I = (byte) -1;
        this.f44621J = -1;
        this.f44615D = cVar.n();
    }

    private C3924d(boolean z10) {
        this.f44620I = (byte) -1;
        this.f44621J = -1;
        this.f44615D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3924d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44620I = (byte) -1;
        this.f44621J = -1;
        Q();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f44616E |= 1;
                                this.f44617F = eVar.s();
                            } else if (iK == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f44618G = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f44618G.add(eVar.u(u.f44968O, fVar));
                            } else if (iK == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f44619H = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f44619H.add(Integer.valueOf(eVar.s()));
                            } else if (iK != 250) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                int iJ = eVar.j(eVar.A());
                                if ((i10 & 4) != 4 && eVar.e() > 0) {
                                    this.f44619H = new ArrayList();
                                    i10 |= 4;
                                }
                                while (eVar.e() > 0) {
                                    this.f44619H.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
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
                if ((i10 & 2) == 2) {
                    this.f44618G = Collections.unmodifiableList(this.f44618G);
                }
                if ((i10 & 4) == 4) {
                    this.f44619H = Collections.unmodifiableList(this.f44619H);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44615D = bVarD.e();
                    throw th2;
                }
                this.f44615D = bVarD.e();
                n();
                throw th;
            }
        }
        if ((i10 & 2) == 2) {
            this.f44618G = Collections.unmodifiableList(this.f44618G);
        }
        if ((i10 & 4) == 4) {
            this.f44619H = Collections.unmodifiableList(this.f44619H);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44615D = bVarD.e();
            throw th3;
        }
        this.f44615D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.d$b */
    public static final class b extends h.c<C3924d, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44622E;

        /* renamed from: F, reason: collision with root package name */
        private int f44623F = 6;

        /* renamed from: G, reason: collision with root package name */
        private List<u> f44624G = Collections.emptyList();

        /* renamed from: H, reason: collision with root package name */
        private List<Integer> f44625H = Collections.emptyList();

        private b() {
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44622E & 2) != 2) {
                this.f44624G = new ArrayList(this.f44624G);
                this.f44622E |= 2;
            }
        }

        private void D() {
            if ((this.f44622E & 4) != 4) {
                this.f44625H = new ArrayList(this.f44625H);
                this.f44622E |= 4;
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
        public lb.C3924d.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.d> r1 = lb.C3924d.f44614L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.d r3 = (lb.C3924d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.d r4 = (lb.C3924d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3924d.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.d$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public b o(C3924d c3924d) {
            if (c3924d == C3924d.I()) {
                return this;
            }
            if (c3924d.P()) {
                H(c3924d.K());
            }
            if (!c3924d.f44618G.isEmpty()) {
                if (this.f44624G.isEmpty()) {
                    this.f44624G = c3924d.f44618G;
                    this.f44622E &= -3;
                } else {
                    C();
                    this.f44624G.addAll(c3924d.f44618G);
                }
            }
            if (!c3924d.f44619H.isEmpty()) {
                if (this.f44625H.isEmpty()) {
                    this.f44625H = c3924d.f44619H;
                    this.f44622E &= -5;
                } else {
                    D();
                    this.f44625H.addAll(c3924d.f44619H);
                }
            }
            t(c3924d);
            p(n().f(c3924d.f44615D));
            return this;
        }

        public b H(int i10) {
            this.f44622E |= 1;
            this.f44623F = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3924d e() {
            C3924d c3924dW = w();
            if (c3924dW.b()) {
                return c3924dW;
            }
            throw a.AbstractC0582a.l(c3924dW);
        }

        public C3924d w() {
            C3924d c3924d = new C3924d(this);
            int i10 = (this.f44622E & 1) != 1 ? 0 : 1;
            c3924d.f44617F = this.f44623F;
            if ((this.f44622E & 2) == 2) {
                this.f44624G = Collections.unmodifiableList(this.f44624G);
                this.f44622E &= -3;
            }
            c3924d.f44618G = this.f44624G;
            if ((this.f44622E & 4) == 4) {
                this.f44625H = Collections.unmodifiableList(this.f44625H);
                this.f44622E &= -5;
            }
            c3924d.f44619H = this.f44625H;
            c3924d.f44616E = i10;
            return c3924d;
        }

        private void E() {
        }
    }
}
