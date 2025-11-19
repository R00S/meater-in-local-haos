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
import lb.C3937q;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3938r extends h.d<C3938r> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: Q, reason: collision with root package name */
    private static final C3938r f44905Q;

    /* renamed from: R, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3938r> f44906R = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44907D;

    /* renamed from: E, reason: collision with root package name */
    private int f44908E;

    /* renamed from: F, reason: collision with root package name */
    private int f44909F;

    /* renamed from: G, reason: collision with root package name */
    private int f44910G;

    /* renamed from: H, reason: collision with root package name */
    private List<C3939s> f44911H;

    /* renamed from: I, reason: collision with root package name */
    private C3937q f44912I;

    /* renamed from: J, reason: collision with root package name */
    private int f44913J;

    /* renamed from: K, reason: collision with root package name */
    private C3937q f44914K;

    /* renamed from: L, reason: collision with root package name */
    private int f44915L;

    /* renamed from: M, reason: collision with root package name */
    private List<C3922b> f44916M;

    /* renamed from: N, reason: collision with root package name */
    private List<Integer> f44917N;

    /* renamed from: O, reason: collision with root package name */
    private byte f44918O;

    /* renamed from: P, reason: collision with root package name */
    private int f44919P;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.r$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3938r> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3938r b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3938r(eVar, fVar);
        }
    }

    static {
        C3938r c3938r = new C3938r(true);
        f44905Q = c3938r;
        c3938r.l0();
    }

    public static C3938r S() {
        return f44905Q;
    }

    private void l0() {
        this.f44909F = 6;
        this.f44910G = 0;
        this.f44911H = Collections.emptyList();
        this.f44912I = C3937q.Y();
        this.f44913J = 0;
        this.f44914K = C3937q.Y();
        this.f44915L = 0;
        this.f44916M = Collections.emptyList();
        this.f44917N = Collections.emptyList();
    }

    public static b m0() {
        return b.B();
    }

    public static b n0(C3938r c3938r) {
        return m0().o(c3938r);
    }

    public static C3938r p0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f44906R.c(inputStream, fVar);
    }

    public C3922b P(int i10) {
        return this.f44916M.get(i10);
    }

    public int Q() {
        return this.f44916M.size();
    }

    public List<C3922b> R() {
        return this.f44916M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C3938r c() {
        return f44905Q;
    }

    public C3937q U() {
        return this.f44914K;
    }

    public int V() {
        return this.f44915L;
    }

    public int W() {
        return this.f44909F;
    }

    public int X() {
        return this.f44910G;
    }

    public C3939s Y(int i10) {
        return this.f44911H.get(i10);
    }

    public int Z() {
        return this.f44911H.size();
    }

    public List<C3939s> a0() {
        return this.f44911H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44918O;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!i0()) {
            this.f44918O = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < Z(); i10++) {
            if (!Y(i10).b()) {
                this.f44918O = (byte) 0;
                return false;
            }
        }
        if (j0() && !b0().b()) {
            this.f44918O = (byte) 0;
            return false;
        }
        if (e0() && !U().b()) {
            this.f44918O = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < Q(); i11++) {
            if (!P(i11).b()) {
                this.f44918O = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f44918O = (byte) 1;
            return true;
        }
        this.f44918O = (byte) 0;
        return false;
    }

    public C3937q b0() {
        return this.f44912I;
    }

    public int c0() {
        return this.f44913J;
    }

    public List<Integer> d0() {
        return this.f44917N;
    }

    public boolean e0() {
        return (this.f44908E & 16) == 16;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44919P;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44908E & 1) == 1 ? CodedOutputStream.o(1, this.f44909F) : 0;
        if ((this.f44908E & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f44910G);
        }
        for (int i11 = 0; i11 < this.f44911H.size(); i11++) {
            iO += CodedOutputStream.s(3, this.f44911H.get(i11));
        }
        if ((this.f44908E & 4) == 4) {
            iO += CodedOutputStream.s(4, this.f44912I);
        }
        if ((this.f44908E & 8) == 8) {
            iO += CodedOutputStream.o(5, this.f44913J);
        }
        if ((this.f44908E & 16) == 16) {
            iO += CodedOutputStream.s(6, this.f44914K);
        }
        if ((this.f44908E & 32) == 32) {
            iO += CodedOutputStream.o(7, this.f44915L);
        }
        for (int i12 = 0; i12 < this.f44916M.size(); i12++) {
            iO += CodedOutputStream.s(8, this.f44916M.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f44917N.size(); i13++) {
            iP += CodedOutputStream.p(this.f44917N.get(i13).intValue());
        }
        int size = iO + iP + (d0().size() * 2) + u() + this.f44907D.size();
        this.f44919P = size;
        return size;
    }

    public boolean f0() {
        return (this.f44908E & 32) == 32;
    }

    public boolean g0() {
        return (this.f44908E & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3938r> h() {
        return f44906R;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44908E & 1) == 1) {
            codedOutputStream.a0(1, this.f44909F);
        }
        if ((this.f44908E & 2) == 2) {
            codedOutputStream.a0(2, this.f44910G);
        }
        for (int i10 = 0; i10 < this.f44911H.size(); i10++) {
            codedOutputStream.d0(3, this.f44911H.get(i10));
        }
        if ((this.f44908E & 4) == 4) {
            codedOutputStream.d0(4, this.f44912I);
        }
        if ((this.f44908E & 8) == 8) {
            codedOutputStream.a0(5, this.f44913J);
        }
        if ((this.f44908E & 16) == 16) {
            codedOutputStream.d0(6, this.f44914K);
        }
        if ((this.f44908E & 32) == 32) {
            codedOutputStream.a0(7, this.f44915L);
        }
        for (int i11 = 0; i11 < this.f44916M.size(); i11++) {
            codedOutputStream.d0(8, this.f44916M.get(i11));
        }
        for (int i12 = 0; i12 < this.f44917N.size(); i12++) {
            codedOutputStream.a0(31, this.f44917N.get(i12).intValue());
        }
        aVarZ.a(200, codedOutputStream);
        codedOutputStream.i0(this.f44907D);
    }

    public boolean i0() {
        return (this.f44908E & 2) == 2;
    }

    public boolean j0() {
        return (this.f44908E & 4) == 4;
    }

    public boolean k0() {
        return (this.f44908E & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return n0(this);
    }

    private C3938r(h.c<C3938r, ?> cVar) {
        super(cVar);
        this.f44918O = (byte) -1;
        this.f44919P = -1;
        this.f44907D = cVar.n();
    }

    private C3938r(boolean z10) {
        this.f44918O = (byte) -1;
        this.f44919P = -1;
        this.f44907D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C3938r(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        C3937q.c cVarD;
        this.f44918O = (byte) -1;
        this.f44919P = -1;
        l0();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? Q10 = 128;
            if (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f44908E |= 1;
                                this.f44909F = eVar.s();
                            case 16:
                                this.f44908E |= 2;
                                this.f44910G = eVar.s();
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f44911H = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f44911H.add(eVar.u(C3939s.f44931P, fVar));
                            case 34:
                                cVarD = (this.f44908E & 4) == 4 ? this.f44912I.d() : null;
                                C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44912I = c3937q;
                                if (cVarD != null) {
                                    cVarD.o(c3937q);
                                    this.f44912I = cVarD.w();
                                }
                                this.f44908E |= 4;
                            case 40:
                                this.f44908E |= 8;
                                this.f44913J = eVar.s();
                            case 50:
                                cVarD = (this.f44908E & 16) == 16 ? this.f44914K.d() : null;
                                C3937q c3937q2 = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44914K = c3937q2;
                                if (cVarD != null) {
                                    cVarD.o(c3937q2);
                                    this.f44914K = cVarD.w();
                                }
                                this.f44908E |= 16;
                            case 56:
                                this.f44908E |= 32;
                                this.f44915L = eVar.s();
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f44916M = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f44916M.add(eVar.u(C3922b.f44476J, fVar));
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.f44917N = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f44917N.add(Integer.valueOf(eVar.s()));
                            case 250:
                                int iJ = eVar.j(eVar.A());
                                if ((i10 & 256) != 256 && eVar.e() > 0) {
                                    this.f44917N = new ArrayList();
                                    i10 |= 256;
                                }
                                while (eVar.e() > 0) {
                                    this.f44917N.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                                break;
                            default:
                                Q10 = q(eVar, codedOutputStreamJ, fVar, iK);
                                if (Q10 == 0) {
                                    z10 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i10 & 4) == 4) {
                        this.f44911H = Collections.unmodifiableList(this.f44911H);
                    }
                    if ((i10 & 128) == Q10) {
                        this.f44916M = Collections.unmodifiableList(this.f44916M);
                    }
                    if ((i10 & 256) == 256) {
                        this.f44917N = Collections.unmodifiableList(this.f44917N);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f44907D = bVarD.e();
                        throw th2;
                    }
                    this.f44907D = bVarD.e();
                    n();
                    throw th;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f44911H = Collections.unmodifiableList(this.f44911H);
                }
                if ((i10 & 128) == 128) {
                    this.f44916M = Collections.unmodifiableList(this.f44916M);
                }
                if ((i10 & 256) == 256) {
                    this.f44917N = Collections.unmodifiableList(this.f44917N);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f44907D = bVarD.e();
                    throw th3;
                }
                this.f44907D = bVarD.e();
                n();
                return;
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.r$b */
    public static final class b extends h.c<C3938r, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44920E;

        /* renamed from: G, reason: collision with root package name */
        private int f44922G;

        /* renamed from: J, reason: collision with root package name */
        private int f44925J;

        /* renamed from: L, reason: collision with root package name */
        private int f44927L;

        /* renamed from: F, reason: collision with root package name */
        private int f44921F = 6;

        /* renamed from: H, reason: collision with root package name */
        private List<C3939s> f44923H = Collections.emptyList();

        /* renamed from: I, reason: collision with root package name */
        private C3937q f44924I = C3937q.Y();

        /* renamed from: K, reason: collision with root package name */
        private C3937q f44926K = C3937q.Y();

        /* renamed from: M, reason: collision with root package name */
        private List<C3922b> f44928M = Collections.emptyList();

        /* renamed from: N, reason: collision with root package name */
        private List<Integer> f44929N = Collections.emptyList();

        private b() {
            F();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44920E & 128) != 128) {
                this.f44928M = new ArrayList(this.f44928M);
                this.f44920E |= 128;
            }
        }

        private void D() {
            if ((this.f44920E & 4) != 4) {
                this.f44923H = new ArrayList(this.f44923H);
                this.f44920E |= 4;
            }
        }

        private void E() {
            if ((this.f44920E & 256) != 256) {
                this.f44929N = new ArrayList(this.f44929N);
                this.f44920E |= 256;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        public b G(C3937q c3937q) {
            if ((this.f44920E & 32) != 32 || this.f44926K == C3937q.Y()) {
                this.f44926K = c3937q;
            } else {
                this.f44926K = C3937q.A0(this.f44926K).o(c3937q).w();
            }
            this.f44920E |= 32;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3938r.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.r> r1 = lb.C3938r.f44906R     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.r r3 = (lb.C3938r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.r r4 = (lb.C3938r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3938r.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.r$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public b o(C3938r c3938r) {
            if (c3938r == C3938r.S()) {
                return this;
            }
            if (c3938r.g0()) {
                M(c3938r.W());
            }
            if (c3938r.i0()) {
                N(c3938r.X());
            }
            if (!c3938r.f44911H.isEmpty()) {
                if (this.f44923H.isEmpty()) {
                    this.f44923H = c3938r.f44911H;
                    this.f44920E &= -5;
                } else {
                    D();
                    this.f44923H.addAll(c3938r.f44911H);
                }
            }
            if (c3938r.j0()) {
                J(c3938r.b0());
            }
            if (c3938r.k0()) {
                O(c3938r.c0());
            }
            if (c3938r.e0()) {
                G(c3938r.U());
            }
            if (c3938r.f0()) {
                L(c3938r.V());
            }
            if (!c3938r.f44916M.isEmpty()) {
                if (this.f44928M.isEmpty()) {
                    this.f44928M = c3938r.f44916M;
                    this.f44920E &= -129;
                } else {
                    C();
                    this.f44928M.addAll(c3938r.f44916M);
                }
            }
            if (!c3938r.f44917N.isEmpty()) {
                if (this.f44929N.isEmpty()) {
                    this.f44929N = c3938r.f44917N;
                    this.f44920E &= -257;
                } else {
                    E();
                    this.f44929N.addAll(c3938r.f44917N);
                }
            }
            t(c3938r);
            p(n().f(c3938r.f44907D));
            return this;
        }

        public b J(C3937q c3937q) {
            if ((this.f44920E & 8) != 8 || this.f44924I == C3937q.Y()) {
                this.f44924I = c3937q;
            } else {
                this.f44924I = C3937q.A0(this.f44924I).o(c3937q).w();
            }
            this.f44920E |= 8;
            return this;
        }

        public b L(int i10) {
            this.f44920E |= 64;
            this.f44927L = i10;
            return this;
        }

        public b M(int i10) {
            this.f44920E |= 1;
            this.f44921F = i10;
            return this;
        }

        public b N(int i10) {
            this.f44920E |= 2;
            this.f44922G = i10;
            return this;
        }

        public b O(int i10) {
            this.f44920E |= 16;
            this.f44925J = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3938r e() {
            C3938r c3938rW = w();
            if (c3938rW.b()) {
                return c3938rW;
            }
            throw a.AbstractC0582a.l(c3938rW);
        }

        public C3938r w() {
            C3938r c3938r = new C3938r(this);
            int i10 = this.f44920E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3938r.f44909F = this.f44921F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3938r.f44910G = this.f44922G;
            if ((this.f44920E & 4) == 4) {
                this.f44923H = Collections.unmodifiableList(this.f44923H);
                this.f44920E &= -5;
            }
            c3938r.f44911H = this.f44923H;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3938r.f44912I = this.f44924I;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            c3938r.f44913J = this.f44925J;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            c3938r.f44914K = this.f44926K;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3938r.f44915L = this.f44927L;
            if ((this.f44920E & 128) == 128) {
                this.f44928M = Collections.unmodifiableList(this.f44928M);
                this.f44920E &= -129;
            }
            c3938r.f44916M = this.f44928M;
            if ((this.f44920E & 256) == 256) {
                this.f44929N = Collections.unmodifiableList(this.f44929N);
                this.f44920E &= -257;
            }
            c3938r.f44917N = this.f44929N;
            c3938r.f44908E = i11;
            return c3938r;
        }

        private void F() {
        }
    }
}
