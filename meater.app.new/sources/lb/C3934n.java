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
import lb.C3937q;
import lb.u;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3934n extends h.d<C3934n> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: W, reason: collision with root package name */
    private static final C3934n f44779W;

    /* renamed from: X, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3934n> f44780X = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44781D;

    /* renamed from: E, reason: collision with root package name */
    private int f44782E;

    /* renamed from: F, reason: collision with root package name */
    private int f44783F;

    /* renamed from: G, reason: collision with root package name */
    private int f44784G;

    /* renamed from: H, reason: collision with root package name */
    private int f44785H;

    /* renamed from: I, reason: collision with root package name */
    private C3937q f44786I;

    /* renamed from: J, reason: collision with root package name */
    private int f44787J;

    /* renamed from: K, reason: collision with root package name */
    private List<C3939s> f44788K;

    /* renamed from: L, reason: collision with root package name */
    private C3937q f44789L;

    /* renamed from: M, reason: collision with root package name */
    private int f44790M;

    /* renamed from: N, reason: collision with root package name */
    private List<C3937q> f44791N;

    /* renamed from: O, reason: collision with root package name */
    private List<Integer> f44792O;

    /* renamed from: P, reason: collision with root package name */
    private int f44793P;

    /* renamed from: Q, reason: collision with root package name */
    private u f44794Q;

    /* renamed from: R, reason: collision with root package name */
    private int f44795R;

    /* renamed from: S, reason: collision with root package name */
    private int f44796S;

    /* renamed from: T, reason: collision with root package name */
    private List<Integer> f44797T;

    /* renamed from: U, reason: collision with root package name */
    private byte f44798U;

    /* renamed from: V, reason: collision with root package name */
    private int f44799V;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.n$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3934n> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3934n b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3934n(eVar, fVar);
        }
    }

    static {
        C3934n c3934n = new C3934n(true);
        f44779W = c3934n;
        c3934n.A0();
    }

    private void A0() {
        this.f44783F = 518;
        this.f44784G = 2054;
        this.f44785H = 0;
        this.f44786I = C3937q.Y();
        this.f44787J = 0;
        this.f44788K = Collections.emptyList();
        this.f44789L = C3937q.Y();
        this.f44790M = 0;
        this.f44791N = Collections.emptyList();
        this.f44792O = Collections.emptyList();
        this.f44794Q = u.J();
        this.f44795R = 0;
        this.f44796S = 0;
        this.f44797T = Collections.emptyList();
    }

    public static b B0() {
        return b.B();
    }

    public static b C0(C3934n c3934n) {
        return B0().o(c3934n);
    }

    public static C3934n Z() {
        return f44779W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return B0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return C0(this);
    }

    public C3937q V(int i10) {
        return this.f44791N.get(i10);
    }

    public int W() {
        return this.f44791N.size();
    }

    public List<Integer> X() {
        return this.f44792O;
    }

    public List<C3937q> Y() {
        return this.f44791N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C3934n c() {
        return f44779W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44798U;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!s0()) {
            this.f44798U = (byte) 0;
            return false;
        }
        if (w0() && !i0().b()) {
            this.f44798U = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < n0(); i10++) {
            if (!m0(i10).b()) {
                this.f44798U = (byte) 0;
                return false;
            }
        }
        if (u0() && !f0().b()) {
            this.f44798U = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < W(); i11++) {
            if (!V(i11).b()) {
                this.f44798U = (byte) 0;
                return false;
            }
        }
        if (z0() && !l0().b()) {
            this.f44798U = (byte) 0;
            return false;
        }
        if (t()) {
            this.f44798U = (byte) 1;
            return true;
        }
        this.f44798U = (byte) 0;
        return false;
    }

    public int b0() {
        return this.f44783F;
    }

    public int c0() {
        return this.f44795R;
    }

    public int d0() {
        return this.f44785H;
    }

    public int e0() {
        return this.f44784G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44799V;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44782E & 2) == 2 ? CodedOutputStream.o(1, this.f44784G) : 0;
        if ((this.f44782E & 4) == 4) {
            iO += CodedOutputStream.o(2, this.f44785H);
        }
        if ((this.f44782E & 8) == 8) {
            iO += CodedOutputStream.s(3, this.f44786I);
        }
        for (int i11 = 0; i11 < this.f44788K.size(); i11++) {
            iO += CodedOutputStream.s(4, this.f44788K.get(i11));
        }
        if ((this.f44782E & 32) == 32) {
            iO += CodedOutputStream.s(5, this.f44789L);
        }
        if ((this.f44782E & 128) == 128) {
            iO += CodedOutputStream.s(6, this.f44794Q);
        }
        if ((this.f44782E & 256) == 256) {
            iO += CodedOutputStream.o(7, this.f44795R);
        }
        if ((this.f44782E & 512) == 512) {
            iO += CodedOutputStream.o(8, this.f44796S);
        }
        if ((this.f44782E & 16) == 16) {
            iO += CodedOutputStream.o(9, this.f44787J);
        }
        if ((this.f44782E & 64) == 64) {
            iO += CodedOutputStream.o(10, this.f44790M);
        }
        if ((this.f44782E & 1) == 1) {
            iO += CodedOutputStream.o(11, this.f44783F);
        }
        for (int i12 = 0; i12 < this.f44791N.size(); i12++) {
            iO += CodedOutputStream.s(12, this.f44791N.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f44792O.size(); i13++) {
            iP += CodedOutputStream.p(this.f44792O.get(i13).intValue());
        }
        int iP2 = iO + iP;
        if (!X().isEmpty()) {
            iP2 = iP2 + 1 + CodedOutputStream.p(iP);
        }
        this.f44793P = iP;
        int iP3 = 0;
        for (int i14 = 0; i14 < this.f44797T.size(); i14++) {
            iP3 += CodedOutputStream.p(this.f44797T.get(i14).intValue());
        }
        int size = iP2 + iP3 + (p0().size() * 2) + u() + this.f44781D.size();
        this.f44799V = size;
        return size;
    }

    public C3937q f0() {
        return this.f44789L;
    }

    public int g0() {
        return this.f44790M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3934n> h() {
        return f44780X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44782E & 2) == 2) {
            codedOutputStream.a0(1, this.f44784G);
        }
        if ((this.f44782E & 4) == 4) {
            codedOutputStream.a0(2, this.f44785H);
        }
        if ((this.f44782E & 8) == 8) {
            codedOutputStream.d0(3, this.f44786I);
        }
        for (int i10 = 0; i10 < this.f44788K.size(); i10++) {
            codedOutputStream.d0(4, this.f44788K.get(i10));
        }
        if ((this.f44782E & 32) == 32) {
            codedOutputStream.d0(5, this.f44789L);
        }
        if ((this.f44782E & 128) == 128) {
            codedOutputStream.d0(6, this.f44794Q);
        }
        if ((this.f44782E & 256) == 256) {
            codedOutputStream.a0(7, this.f44795R);
        }
        if ((this.f44782E & 512) == 512) {
            codedOutputStream.a0(8, this.f44796S);
        }
        if ((this.f44782E & 16) == 16) {
            codedOutputStream.a0(9, this.f44787J);
        }
        if ((this.f44782E & 64) == 64) {
            codedOutputStream.a0(10, this.f44790M);
        }
        if ((this.f44782E & 1) == 1) {
            codedOutputStream.a0(11, this.f44783F);
        }
        for (int i11 = 0; i11 < this.f44791N.size(); i11++) {
            codedOutputStream.d0(12, this.f44791N.get(i11));
        }
        if (X().size() > 0) {
            codedOutputStream.o0(106);
            codedOutputStream.o0(this.f44793P);
        }
        for (int i12 = 0; i12 < this.f44792O.size(); i12++) {
            codedOutputStream.b0(this.f44792O.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.f44797T.size(); i13++) {
            codedOutputStream.a0(31, this.f44797T.get(i13).intValue());
        }
        aVarZ.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f44781D);
    }

    public C3937q i0() {
        return this.f44786I;
    }

    public int j0() {
        return this.f44787J;
    }

    public int k0() {
        return this.f44796S;
    }

    public u l0() {
        return this.f44794Q;
    }

    public C3939s m0(int i10) {
        return this.f44788K.get(i10);
    }

    public int n0() {
        return this.f44788K.size();
    }

    public List<C3939s> o0() {
        return this.f44788K;
    }

    public List<Integer> p0() {
        return this.f44797T;
    }

    public boolean q0() {
        return (this.f44782E & 1) == 1;
    }

    public boolean r0() {
        return (this.f44782E & 256) == 256;
    }

    public boolean s0() {
        return (this.f44782E & 4) == 4;
    }

    public boolean t0() {
        return (this.f44782E & 2) == 2;
    }

    public boolean u0() {
        return (this.f44782E & 32) == 32;
    }

    public boolean v0() {
        return (this.f44782E & 64) == 64;
    }

    public boolean w0() {
        return (this.f44782E & 8) == 8;
    }

    public boolean x0() {
        return (this.f44782E & 16) == 16;
    }

    public boolean y0() {
        return (this.f44782E & 512) == 512;
    }

    public boolean z0() {
        return (this.f44782E & 128) == 128;
    }

    private C3934n(h.c<C3934n, ?> cVar) {
        super(cVar);
        this.f44793P = -1;
        this.f44798U = (byte) -1;
        this.f44799V = -1;
        this.f44781D = cVar.n();
    }

    private C3934n(boolean z10) {
        this.f44793P = -1;
        this.f44798U = (byte) -1;
        this.f44799V = -1;
        this.f44781D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C3934n(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44793P = -1;
        this.f44798U = (byte) -1;
        this.f44799V = -1;
        A0();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? Q10 = 256;
            if (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f44782E |= 2;
                                this.f44784G = eVar.s();
                            case 16:
                                this.f44782E |= 4;
                                this.f44785H = eVar.s();
                            case 26:
                                C3937q.c cVarC0 = (this.f44782E & 8) == 8 ? this.f44786I.d() : null;
                                C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44786I = c3937q;
                                if (cVarC0 != null) {
                                    cVarC0.o(c3937q);
                                    this.f44786I = cVarC0.w();
                                }
                                this.f44782E |= 8;
                            case 34:
                                int i10 = (c10 == true ? 1 : 0) & 32;
                                c10 = c10;
                                if (i10 != 32) {
                                    this.f44788K = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | ' ';
                                }
                                this.f44788K.add(eVar.u(C3939s.f44931P, fVar));
                            case 42:
                                C3937q.c cVarC02 = (this.f44782E & 32) == 32 ? this.f44789L.d() : null;
                                C3937q c3937q2 = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44789L = c3937q2;
                                if (cVarC02 != null) {
                                    cVarC02.o(c3937q2);
                                    this.f44789L = cVarC02.w();
                                }
                                this.f44782E |= 32;
                            case 50:
                                u.b bVarB0 = (this.f44782E & 128) == 128 ? this.f44794Q.d() : null;
                                u uVar = (u) eVar.u(u.f44968O, fVar);
                                this.f44794Q = uVar;
                                if (bVarB0 != null) {
                                    bVarB0.o(uVar);
                                    this.f44794Q = bVarB0.w();
                                }
                                this.f44782E |= 128;
                            case 56:
                                this.f44782E |= 256;
                                this.f44795R = eVar.s();
                            case 64:
                                this.f44782E |= 512;
                                this.f44796S = eVar.s();
                            case 72:
                                this.f44782E |= 16;
                                this.f44787J = eVar.s();
                            case 80:
                                this.f44782E |= 64;
                                this.f44790M = eVar.s();
                            case 88:
                                this.f44782E |= 1;
                                this.f44783F = eVar.s();
                            case 98:
                                int i11 = (c10 == true ? 1 : 0) & 256;
                                c10 = c10;
                                if (i11 != 256) {
                                    this.f44791N = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 256;
                                }
                                this.f44791N.add(eVar.u(C3937q.f44851W, fVar));
                            case 104:
                                int i12 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i12 != 512) {
                                    this.f44792O = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 512;
                                }
                                this.f44792O.add(Integer.valueOf(eVar.s()));
                            case 106:
                                int iJ = eVar.j(eVar.A());
                                int i13 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i13 != 512) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f44792O = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f44792O.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                            case 248:
                                int i14 = (c10 == true ? 1 : 0) & 8192;
                                c10 = c10;
                                if (i14 != 8192) {
                                    this.f44797T = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 8192;
                                }
                                this.f44797T.add(Integer.valueOf(eVar.s()));
                            case 250:
                                int iJ2 = eVar.j(eVar.A());
                                int i15 = (c10 == true ? 1 : 0) & 8192;
                                c10 = c10;
                                if (i15 != 8192) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f44797T = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f44797T.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ2);
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
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f44788K = Collections.unmodifiableList(this.f44788K);
                    }
                    if (((c10 == true ? 1 : 0) & 256) == Q10) {
                        this.f44791N = Collections.unmodifiableList(this.f44791N);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f44792O = Collections.unmodifiableList(this.f44792O);
                    }
                    if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f44797T = Collections.unmodifiableList(this.f44797T);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f44781D = bVarD.e();
                        throw th2;
                    }
                    this.f44781D = bVarD.e();
                    n();
                    throw th;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f44788K = Collections.unmodifiableList(this.f44788K);
                }
                if (((c10 == true ? 1 : 0) & 256) == 256) {
                    this.f44791N = Collections.unmodifiableList(this.f44791N);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f44792O = Collections.unmodifiableList(this.f44792O);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f44797T = Collections.unmodifiableList(this.f44797T);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f44781D = bVarD.e();
                    throw th3;
                }
                this.f44781D = bVarD.e();
                n();
                return;
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.n$b */
    public static final class b extends h.c<C3934n, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44800E;

        /* renamed from: H, reason: collision with root package name */
        private int f44803H;

        /* renamed from: J, reason: collision with root package name */
        private int f44805J;

        /* renamed from: M, reason: collision with root package name */
        private int f44808M;

        /* renamed from: Q, reason: collision with root package name */
        private int f44812Q;

        /* renamed from: R, reason: collision with root package name */
        private int f44813R;

        /* renamed from: F, reason: collision with root package name */
        private int f44801F = 518;

        /* renamed from: G, reason: collision with root package name */
        private int f44802G = 2054;

        /* renamed from: I, reason: collision with root package name */
        private C3937q f44804I = C3937q.Y();

        /* renamed from: K, reason: collision with root package name */
        private List<C3939s> f44806K = Collections.emptyList();

        /* renamed from: L, reason: collision with root package name */
        private C3937q f44807L = C3937q.Y();

        /* renamed from: N, reason: collision with root package name */
        private List<C3937q> f44809N = Collections.emptyList();

        /* renamed from: O, reason: collision with root package name */
        private List<Integer> f44810O = Collections.emptyList();

        /* renamed from: P, reason: collision with root package name */
        private u f44811P = u.J();

        /* renamed from: S, reason: collision with root package name */
        private List<Integer> f44814S = Collections.emptyList();

        private b() {
            G();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44800E & 512) != 512) {
                this.f44810O = new ArrayList(this.f44810O);
                this.f44800E |= 512;
            }
        }

        private void D() {
            if ((this.f44800E & 256) != 256) {
                this.f44809N = new ArrayList(this.f44809N);
                this.f44800E |= 256;
            }
        }

        private void E() {
            if ((this.f44800E & 32) != 32) {
                this.f44806K = new ArrayList(this.f44806K);
                this.f44800E |= 32;
            }
        }

        private void F() {
            if ((this.f44800E & 8192) != 8192) {
                this.f44814S = new ArrayList(this.f44814S);
                this.f44800E |= 8192;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3934n.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.n> r1 = lb.C3934n.f44780X     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.n r3 = (lb.C3934n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.n r4 = (lb.C3934n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3934n.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.n$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public b o(C3934n c3934n) {
            if (c3934n == C3934n.Z()) {
                return this;
            }
            if (c3934n.q0()) {
                N(c3934n.b0());
            }
            if (c3934n.t0()) {
                Q(c3934n.e0());
            }
            if (c3934n.s0()) {
                P(c3934n.d0());
            }
            if (c3934n.w0()) {
                L(c3934n.i0());
            }
            if (c3934n.x0()) {
                S(c3934n.j0());
            }
            if (!c3934n.f44788K.isEmpty()) {
                if (this.f44806K.isEmpty()) {
                    this.f44806K = c3934n.f44788K;
                    this.f44800E &= -33;
                } else {
                    E();
                    this.f44806K.addAll(c3934n.f44788K);
                }
            }
            if (c3934n.u0()) {
                J(c3934n.f0());
            }
            if (c3934n.v0()) {
                R(c3934n.g0());
            }
            if (!c3934n.f44791N.isEmpty()) {
                if (this.f44809N.isEmpty()) {
                    this.f44809N = c3934n.f44791N;
                    this.f44800E &= -257;
                } else {
                    D();
                    this.f44809N.addAll(c3934n.f44791N);
                }
            }
            if (!c3934n.f44792O.isEmpty()) {
                if (this.f44810O.isEmpty()) {
                    this.f44810O = c3934n.f44792O;
                    this.f44800E &= -513;
                } else {
                    C();
                    this.f44810O.addAll(c3934n.f44792O);
                }
            }
            if (c3934n.z0()) {
                M(c3934n.l0());
            }
            if (c3934n.r0()) {
                O(c3934n.c0());
            }
            if (c3934n.y0()) {
                T(c3934n.k0());
            }
            if (!c3934n.f44797T.isEmpty()) {
                if (this.f44814S.isEmpty()) {
                    this.f44814S = c3934n.f44797T;
                    this.f44800E &= -8193;
                } else {
                    F();
                    this.f44814S.addAll(c3934n.f44797T);
                }
            }
            t(c3934n);
            p(n().f(c3934n.f44781D));
            return this;
        }

        public b J(C3937q c3937q) {
            if ((this.f44800E & 64) != 64 || this.f44807L == C3937q.Y()) {
                this.f44807L = c3937q;
            } else {
                this.f44807L = C3937q.A0(this.f44807L).o(c3937q).w();
            }
            this.f44800E |= 64;
            return this;
        }

        public b L(C3937q c3937q) {
            if ((this.f44800E & 8) != 8 || this.f44804I == C3937q.Y()) {
                this.f44804I = c3937q;
            } else {
                this.f44804I = C3937q.A0(this.f44804I).o(c3937q).w();
            }
            this.f44800E |= 8;
            return this;
        }

        public b M(u uVar) {
            if ((this.f44800E & 1024) != 1024 || this.f44811P == u.J()) {
                this.f44811P = uVar;
            } else {
                this.f44811P = u.Z(this.f44811P).o(uVar).w();
            }
            this.f44800E |= 1024;
            return this;
        }

        public b N(int i10) {
            this.f44800E |= 1;
            this.f44801F = i10;
            return this;
        }

        public b O(int i10) {
            this.f44800E |= 2048;
            this.f44812Q = i10;
            return this;
        }

        public b P(int i10) {
            this.f44800E |= 4;
            this.f44803H = i10;
            return this;
        }

        public b Q(int i10) {
            this.f44800E |= 2;
            this.f44802G = i10;
            return this;
        }

        public b R(int i10) {
            this.f44800E |= 128;
            this.f44808M = i10;
            return this;
        }

        public b S(int i10) {
            this.f44800E |= 16;
            this.f44805J = i10;
            return this;
        }

        public b T(int i10) {
            this.f44800E |= 4096;
            this.f44813R = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3934n e() {
            C3934n c3934nW = w();
            if (c3934nW.b()) {
                return c3934nW;
            }
            throw a.AbstractC0582a.l(c3934nW);
        }

        public C3934n w() {
            C3934n c3934n = new C3934n(this);
            int i10 = this.f44800E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3934n.f44783F = this.f44801F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3934n.f44784G = this.f44802G;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3934n.f44785H = this.f44803H;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3934n.f44786I = this.f44804I;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3934n.f44787J = this.f44805J;
            if ((this.f44800E & 32) == 32) {
                this.f44806K = Collections.unmodifiableList(this.f44806K);
                this.f44800E &= -33;
            }
            c3934n.f44788K = this.f44806K;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3934n.f44789L = this.f44807L;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3934n.f44790M = this.f44808M;
            if ((this.f44800E & 256) == 256) {
                this.f44809N = Collections.unmodifiableList(this.f44809N);
                this.f44800E &= -257;
            }
            c3934n.f44791N = this.f44809N;
            if ((this.f44800E & 512) == 512) {
                this.f44810O = Collections.unmodifiableList(this.f44810O);
                this.f44800E &= -513;
            }
            c3934n.f44792O = this.f44810O;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            c3934n.f44794Q = this.f44811P;
            if ((i10 & 2048) == 2048) {
                i11 |= 256;
            }
            c3934n.f44795R = this.f44812Q;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            c3934n.f44796S = this.f44813R;
            if ((this.f44800E & 8192) == 8192) {
                this.f44814S = Collections.unmodifiableList(this.f44814S);
                this.f44800E &= -8193;
            }
            c3934n.f44797T = this.f44814S;
            c3934n.f44782E = i11;
            return c3934n;
        }

        private void G() {
        }
    }
}
