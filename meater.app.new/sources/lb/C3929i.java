package lb;

import com.apptionlabs.meater_app.data.Temperature;
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
import lb.C3925e;
import lb.C3937q;
import lb.C3940t;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3929i extends h.d<C3929i> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: W, reason: collision with root package name */
    private static final C3929i f44697W;

    /* renamed from: X, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3929i> f44698X = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44699D;

    /* renamed from: E, reason: collision with root package name */
    private int f44700E;

    /* renamed from: F, reason: collision with root package name */
    private int f44701F;

    /* renamed from: G, reason: collision with root package name */
    private int f44702G;

    /* renamed from: H, reason: collision with root package name */
    private int f44703H;

    /* renamed from: I, reason: collision with root package name */
    private C3937q f44704I;

    /* renamed from: J, reason: collision with root package name */
    private int f44705J;

    /* renamed from: K, reason: collision with root package name */
    private List<C3939s> f44706K;

    /* renamed from: L, reason: collision with root package name */
    private C3937q f44707L;

    /* renamed from: M, reason: collision with root package name */
    private int f44708M;

    /* renamed from: N, reason: collision with root package name */
    private List<C3937q> f44709N;

    /* renamed from: O, reason: collision with root package name */
    private List<Integer> f44710O;

    /* renamed from: P, reason: collision with root package name */
    private int f44711P;

    /* renamed from: Q, reason: collision with root package name */
    private List<u> f44712Q;

    /* renamed from: R, reason: collision with root package name */
    private C3940t f44713R;

    /* renamed from: S, reason: collision with root package name */
    private List<Integer> f44714S;

    /* renamed from: T, reason: collision with root package name */
    private C3925e f44715T;

    /* renamed from: U, reason: collision with root package name */
    private byte f44716U;

    /* renamed from: V, reason: collision with root package name */
    private int f44717V;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.i$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3929i> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3929i b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3929i(eVar, fVar);
        }
    }

    static {
        C3929i c3929i = new C3929i(true);
        f44697W = c3929i;
        c3929i.C0();
    }

    private void C0() {
        this.f44701F = 6;
        this.f44702G = 6;
        this.f44703H = 0;
        this.f44704I = C3937q.Y();
        this.f44705J = 0;
        this.f44706K = Collections.emptyList();
        this.f44707L = C3937q.Y();
        this.f44708M = 0;
        this.f44709N = Collections.emptyList();
        this.f44710O = Collections.emptyList();
        this.f44712Q = Collections.emptyList();
        this.f44713R = C3940t.x();
        this.f44714S = Collections.emptyList();
        this.f44715T = C3925e.v();
    }

    public static b D0() {
        return b.B();
    }

    public static b E0(C3929i c3929i) {
        return D0().o(c3929i);
    }

    public static C3929i G0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f44698X.a(inputStream, fVar);
    }

    public static C3929i b0() {
        return f44697W;
    }

    public boolean A0() {
        return (this.f44700E & 16) == 16;
    }

    public boolean B0() {
        return (this.f44700E & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return D0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return E0(this);
    }

    public C3937q W(int i10) {
        return this.f44709N.get(i10);
    }

    public int X() {
        return this.f44709N.size();
    }

    public List<Integer> Y() {
        return this.f44710O;
    }

    public List<C3937q> Z() {
        return this.f44709N;
    }

    public C3925e a0() {
        return this.f44715T;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44716U;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!v0()) {
            this.f44716U = (byte) 0;
            return false;
        }
        if (z0() && !j0().b()) {
            this.f44716U = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m0(); i10++) {
            if (!l0(i10).b()) {
                this.f44716U = (byte) 0;
                return false;
            }
        }
        if (x0() && !g0().b()) {
            this.f44716U = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < X(); i11++) {
            if (!W(i11).b()) {
                this.f44716U = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < q0(); i12++) {
            if (!p0(i12).b()) {
                this.f44716U = (byte) 0;
                return false;
            }
        }
        if (B0() && !o0().b()) {
            this.f44716U = (byte) 0;
            return false;
        }
        if (t0() && !a0().b()) {
            this.f44716U = (byte) 0;
            return false;
        }
        if (t()) {
            this.f44716U = (byte) 1;
            return true;
        }
        this.f44716U = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C3929i c() {
        return f44697W;
    }

    public int d0() {
        return this.f44701F;
    }

    public int e0() {
        return this.f44703H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44717V;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44700E & 2) == 2 ? CodedOutputStream.o(1, this.f44702G) : 0;
        if ((this.f44700E & 4) == 4) {
            iO += CodedOutputStream.o(2, this.f44703H);
        }
        if ((this.f44700E & 8) == 8) {
            iO += CodedOutputStream.s(3, this.f44704I);
        }
        for (int i11 = 0; i11 < this.f44706K.size(); i11++) {
            iO += CodedOutputStream.s(4, this.f44706K.get(i11));
        }
        if ((this.f44700E & 32) == 32) {
            iO += CodedOutputStream.s(5, this.f44707L);
        }
        for (int i12 = 0; i12 < this.f44712Q.size(); i12++) {
            iO += CodedOutputStream.s(6, this.f44712Q.get(i12));
        }
        if ((this.f44700E & 16) == 16) {
            iO += CodedOutputStream.o(7, this.f44705J);
        }
        if ((this.f44700E & 64) == 64) {
            iO += CodedOutputStream.o(8, this.f44708M);
        }
        if ((this.f44700E & 1) == 1) {
            iO += CodedOutputStream.o(9, this.f44701F);
        }
        for (int i13 = 0; i13 < this.f44709N.size(); i13++) {
            iO += CodedOutputStream.s(10, this.f44709N.get(i13));
        }
        int iP = 0;
        for (int i14 = 0; i14 < this.f44710O.size(); i14++) {
            iP += CodedOutputStream.p(this.f44710O.get(i14).intValue());
        }
        int iS = iO + iP;
        if (!Y().isEmpty()) {
            iS = iS + 1 + CodedOutputStream.p(iP);
        }
        this.f44711P = iP;
        if ((this.f44700E & 128) == 128) {
            iS += CodedOutputStream.s(30, this.f44713R);
        }
        int iP2 = 0;
        for (int i15 = 0; i15 < this.f44714S.size(); i15++) {
            iP2 += CodedOutputStream.p(this.f44714S.get(i15).intValue());
        }
        int size = iS + iP2 + (s0().size() * 2);
        if ((this.f44700E & 256) == 256) {
            size += CodedOutputStream.s(32, this.f44715T);
        }
        int iU = size + u() + this.f44699D.size();
        this.f44717V = iU;
        return iU;
    }

    public int f0() {
        return this.f44702G;
    }

    public C3937q g0() {
        return this.f44707L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3929i> h() {
        return f44698X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44700E & 2) == 2) {
            codedOutputStream.a0(1, this.f44702G);
        }
        if ((this.f44700E & 4) == 4) {
            codedOutputStream.a0(2, this.f44703H);
        }
        if ((this.f44700E & 8) == 8) {
            codedOutputStream.d0(3, this.f44704I);
        }
        for (int i10 = 0; i10 < this.f44706K.size(); i10++) {
            codedOutputStream.d0(4, this.f44706K.get(i10));
        }
        if ((this.f44700E & 32) == 32) {
            codedOutputStream.d0(5, this.f44707L);
        }
        for (int i11 = 0; i11 < this.f44712Q.size(); i11++) {
            codedOutputStream.d0(6, this.f44712Q.get(i11));
        }
        if ((this.f44700E & 16) == 16) {
            codedOutputStream.a0(7, this.f44705J);
        }
        if ((this.f44700E & 64) == 64) {
            codedOutputStream.a0(8, this.f44708M);
        }
        if ((this.f44700E & 1) == 1) {
            codedOutputStream.a0(9, this.f44701F);
        }
        for (int i12 = 0; i12 < this.f44709N.size(); i12++) {
            codedOutputStream.d0(10, this.f44709N.get(i12));
        }
        if (Y().size() > 0) {
            codedOutputStream.o0(90);
            codedOutputStream.o0(this.f44711P);
        }
        for (int i13 = 0; i13 < this.f44710O.size(); i13++) {
            codedOutputStream.b0(this.f44710O.get(i13).intValue());
        }
        if ((this.f44700E & 128) == 128) {
            codedOutputStream.d0(30, this.f44713R);
        }
        for (int i14 = 0; i14 < this.f44714S.size(); i14++) {
            codedOutputStream.a0(31, this.f44714S.get(i14).intValue());
        }
        if ((this.f44700E & 256) == 256) {
            codedOutputStream.d0(32, this.f44715T);
        }
        aVarZ.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f44699D);
    }

    public int i0() {
        return this.f44708M;
    }

    public C3937q j0() {
        return this.f44704I;
    }

    public int k0() {
        return this.f44705J;
    }

    public C3939s l0(int i10) {
        return this.f44706K.get(i10);
    }

    public int m0() {
        return this.f44706K.size();
    }

    public List<C3939s> n0() {
        return this.f44706K;
    }

    public C3940t o0() {
        return this.f44713R;
    }

    public u p0(int i10) {
        return this.f44712Q.get(i10);
    }

    public int q0() {
        return this.f44712Q.size();
    }

    public List<u> r0() {
        return this.f44712Q;
    }

    public List<Integer> s0() {
        return this.f44714S;
    }

    public boolean t0() {
        return (this.f44700E & 256) == 256;
    }

    public boolean u0() {
        return (this.f44700E & 1) == 1;
    }

    public boolean v0() {
        return (this.f44700E & 4) == 4;
    }

    public boolean w0() {
        return (this.f44700E & 2) == 2;
    }

    public boolean x0() {
        return (this.f44700E & 32) == 32;
    }

    public boolean y0() {
        return (this.f44700E & 64) == 64;
    }

    public boolean z0() {
        return (this.f44700E & 8) == 8;
    }

    private C3929i(h.c<C3929i, ?> cVar) {
        super(cVar);
        this.f44711P = -1;
        this.f44716U = (byte) -1;
        this.f44717V = -1;
        this.f44699D = cVar.n();
    }

    private C3929i(boolean z10) {
        this.f44711P = -1;
        this.f44716U = (byte) -1;
        this.f44717V = -1;
        this.f44699D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C3929i(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44711P = -1;
        this.f44716U = (byte) -1;
        this.f44717V = -1;
        C0();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? Q10 = 1024;
            if (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f44700E |= 2;
                                this.f44702G = eVar.s();
                            case 16:
                                this.f44700E |= 4;
                                this.f44703H = eVar.s();
                            case 26:
                                C3937q.c cVarC0 = (this.f44700E & 8) == 8 ? this.f44704I.d() : null;
                                C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44704I = c3937q;
                                if (cVarC0 != null) {
                                    cVarC0.o(c3937q);
                                    this.f44704I = cVarC0.w();
                                }
                                this.f44700E |= 8;
                            case 34:
                                int i10 = (c10 == true ? 1 : 0) & 32;
                                c10 = c10;
                                if (i10 != 32) {
                                    this.f44706K = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | ' ';
                                }
                                this.f44706K.add(eVar.u(C3939s.f44931P, fVar));
                            case 42:
                                C3937q.c cVarC02 = (this.f44700E & 32) == 32 ? this.f44707L.d() : null;
                                C3937q c3937q2 = (C3937q) eVar.u(C3937q.f44851W, fVar);
                                this.f44707L = c3937q2;
                                if (cVarC02 != null) {
                                    cVarC02.o(c3937q2);
                                    this.f44707L = cVarC02.w();
                                }
                                this.f44700E |= 32;
                            case 50:
                                int i11 = (c10 == true ? 1 : 0) & 1024;
                                c10 = c10;
                                if (i11 != 1024) {
                                    this.f44712Q = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1024;
                                }
                                this.f44712Q.add(eVar.u(u.f44968O, fVar));
                            case 56:
                                this.f44700E |= 16;
                                this.f44705J = eVar.s();
                            case 64:
                                this.f44700E |= 64;
                                this.f44708M = eVar.s();
                            case 72:
                                this.f44700E |= 1;
                                this.f44701F = eVar.s();
                            case 82:
                                int i12 = (c10 == true ? 1 : 0) & 256;
                                c10 = c10;
                                if (i12 != 256) {
                                    this.f44709N = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 256;
                                }
                                this.f44709N.add(eVar.u(C3937q.f44851W, fVar));
                            case 88:
                                int i13 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i13 != 512) {
                                    this.f44710O = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 512;
                                }
                                this.f44710O.add(Integer.valueOf(eVar.s()));
                            case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
                                int iJ = eVar.j(eVar.A());
                                int i14 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i14 != 512) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f44710O = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f44710O.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                            case 242:
                                C3940t.b bVarH = (this.f44700E & 128) == 128 ? this.f44713R.d() : null;
                                C3940t c3940t = (C3940t) eVar.u(C3940t.f44957J, fVar);
                                this.f44713R = c3940t;
                                if (bVarH != null) {
                                    bVarH.o(c3940t);
                                    this.f44713R = bVarH.s();
                                }
                                this.f44700E |= 128;
                            case 248:
                                int i15 = (c10 == true ? 1 : 0) & 4096;
                                c10 = c10;
                                if (i15 != 4096) {
                                    this.f44714S = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 4096;
                                }
                                this.f44714S.add(Integer.valueOf(eVar.s()));
                            case 250:
                                int iJ2 = eVar.j(eVar.A());
                                int i16 = (c10 == true ? 1 : 0) & 4096;
                                c10 = c10;
                                if (i16 != 4096) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f44714S = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f44714S.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ2);
                            case 258:
                                C3925e.b bVarC = (this.f44700E & 256) == 256 ? this.f44715T.d() : null;
                                C3925e c3925e = (C3925e) eVar.u(C3925e.f44627H, fVar);
                                this.f44715T = c3925e;
                                if (bVarC != null) {
                                    bVarC.o(c3925e);
                                    this.f44715T = bVarC.s();
                                }
                                this.f44700E |= 256;
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
                        this.f44706K = Collections.unmodifiableList(this.f44706K);
                    }
                    if (((c10 == true ? 1 : 0) & 1024) == Q10) {
                        this.f44712Q = Collections.unmodifiableList(this.f44712Q);
                    }
                    if (((c10 == true ? 1 : 0) & 256) == 256) {
                        this.f44709N = Collections.unmodifiableList(this.f44709N);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f44710O = Collections.unmodifiableList(this.f44710O);
                    }
                    if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f44714S = Collections.unmodifiableList(this.f44714S);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f44699D = bVarD.e();
                        throw th2;
                    }
                    this.f44699D = bVarD.e();
                    n();
                    throw th;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f44706K = Collections.unmodifiableList(this.f44706K);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f44712Q = Collections.unmodifiableList(this.f44712Q);
                }
                if (((c10 == true ? 1 : 0) & 256) == 256) {
                    this.f44709N = Collections.unmodifiableList(this.f44709N);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f44710O = Collections.unmodifiableList(this.f44710O);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f44714S = Collections.unmodifiableList(this.f44714S);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f44699D = bVarD.e();
                    throw th3;
                }
                this.f44699D = bVarD.e();
                n();
                return;
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.i$b */
    public static final class b extends h.c<C3929i, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44718E;

        /* renamed from: H, reason: collision with root package name */
        private int f44721H;

        /* renamed from: J, reason: collision with root package name */
        private int f44723J;

        /* renamed from: M, reason: collision with root package name */
        private int f44726M;

        /* renamed from: F, reason: collision with root package name */
        private int f44719F = 6;

        /* renamed from: G, reason: collision with root package name */
        private int f44720G = 6;

        /* renamed from: I, reason: collision with root package name */
        private C3937q f44722I = C3937q.Y();

        /* renamed from: K, reason: collision with root package name */
        private List<C3939s> f44724K = Collections.emptyList();

        /* renamed from: L, reason: collision with root package name */
        private C3937q f44725L = C3937q.Y();

        /* renamed from: N, reason: collision with root package name */
        private List<C3937q> f44727N = Collections.emptyList();

        /* renamed from: O, reason: collision with root package name */
        private List<Integer> f44728O = Collections.emptyList();

        /* renamed from: P, reason: collision with root package name */
        private List<u> f44729P = Collections.emptyList();

        /* renamed from: Q, reason: collision with root package name */
        private C3940t f44730Q = C3940t.x();

        /* renamed from: R, reason: collision with root package name */
        private List<Integer> f44731R = Collections.emptyList();

        /* renamed from: S, reason: collision with root package name */
        private C3925e f44732S = C3925e.v();

        private b() {
            H();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44718E & 512) != 512) {
                this.f44728O = new ArrayList(this.f44728O);
                this.f44718E |= 512;
            }
        }

        private void D() {
            if ((this.f44718E & 256) != 256) {
                this.f44727N = new ArrayList(this.f44727N);
                this.f44718E |= 256;
            }
        }

        private void E() {
            if ((this.f44718E & 32) != 32) {
                this.f44724K = new ArrayList(this.f44724K);
                this.f44718E |= 32;
            }
        }

        private void F() {
            if ((this.f44718E & 1024) != 1024) {
                this.f44729P = new ArrayList(this.f44729P);
                this.f44718E |= 1024;
            }
        }

        private void G() {
            if ((this.f44718E & 4096) != 4096) {
                this.f44731R = new ArrayList(this.f44731R);
                this.f44718E |= 4096;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        public b I(C3925e c3925e) {
            if ((this.f44718E & 8192) != 8192 || this.f44732S == C3925e.v()) {
                this.f44732S = c3925e;
            } else {
                this.f44732S = C3925e.A(this.f44732S).o(c3925e).s();
            }
            this.f44718E |= 8192;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3929i.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.i> r1 = lb.C3929i.f44698X     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.i r3 = (lb.C3929i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.i r4 = (lb.C3929i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3929i.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.i$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public b o(C3929i c3929i) {
            if (c3929i == C3929i.b0()) {
                return this;
            }
            if (c3929i.u0()) {
                P(c3929i.d0());
            }
            if (c3929i.w0()) {
                R(c3929i.f0());
            }
            if (c3929i.v0()) {
                Q(c3929i.e0());
            }
            if (c3929i.z0()) {
                N(c3929i.j0());
            }
            if (c3929i.A0()) {
                T(c3929i.k0());
            }
            if (!c3929i.f44706K.isEmpty()) {
                if (this.f44724K.isEmpty()) {
                    this.f44724K = c3929i.f44706K;
                    this.f44718E &= -33;
                } else {
                    E();
                    this.f44724K.addAll(c3929i.f44706K);
                }
            }
            if (c3929i.x0()) {
                M(c3929i.g0());
            }
            if (c3929i.y0()) {
                S(c3929i.i0());
            }
            if (!c3929i.f44709N.isEmpty()) {
                if (this.f44727N.isEmpty()) {
                    this.f44727N = c3929i.f44709N;
                    this.f44718E &= -257;
                } else {
                    D();
                    this.f44727N.addAll(c3929i.f44709N);
                }
            }
            if (!c3929i.f44710O.isEmpty()) {
                if (this.f44728O.isEmpty()) {
                    this.f44728O = c3929i.f44710O;
                    this.f44718E &= -513;
                } else {
                    C();
                    this.f44728O.addAll(c3929i.f44710O);
                }
            }
            if (!c3929i.f44712Q.isEmpty()) {
                if (this.f44729P.isEmpty()) {
                    this.f44729P = c3929i.f44712Q;
                    this.f44718E &= -1025;
                } else {
                    F();
                    this.f44729P.addAll(c3929i.f44712Q);
                }
            }
            if (c3929i.B0()) {
                O(c3929i.o0());
            }
            if (!c3929i.f44714S.isEmpty()) {
                if (this.f44731R.isEmpty()) {
                    this.f44731R = c3929i.f44714S;
                    this.f44718E &= -4097;
                } else {
                    G();
                    this.f44731R.addAll(c3929i.f44714S);
                }
            }
            if (c3929i.t0()) {
                I(c3929i.a0());
            }
            t(c3929i);
            p(n().f(c3929i.f44699D));
            return this;
        }

        public b M(C3937q c3937q) {
            if ((this.f44718E & 64) != 64 || this.f44725L == C3937q.Y()) {
                this.f44725L = c3937q;
            } else {
                this.f44725L = C3937q.A0(this.f44725L).o(c3937q).w();
            }
            this.f44718E |= 64;
            return this;
        }

        public b N(C3937q c3937q) {
            if ((this.f44718E & 8) != 8 || this.f44722I == C3937q.Y()) {
                this.f44722I = c3937q;
            } else {
                this.f44722I = C3937q.A0(this.f44722I).o(c3937q).w();
            }
            this.f44718E |= 8;
            return this;
        }

        public b O(C3940t c3940t) {
            if ((this.f44718E & 2048) != 2048 || this.f44730Q == C3940t.x()) {
                this.f44730Q = c3940t;
            } else {
                this.f44730Q = C3940t.F(this.f44730Q).o(c3940t).s();
            }
            this.f44718E |= 2048;
            return this;
        }

        public b P(int i10) {
            this.f44718E |= 1;
            this.f44719F = i10;
            return this;
        }

        public b Q(int i10) {
            this.f44718E |= 4;
            this.f44721H = i10;
            return this;
        }

        public b R(int i10) {
            this.f44718E |= 2;
            this.f44720G = i10;
            return this;
        }

        public b S(int i10) {
            this.f44718E |= 128;
            this.f44726M = i10;
            return this;
        }

        public b T(int i10) {
            this.f44718E |= 16;
            this.f44723J = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3929i e() {
            C3929i c3929iW = w();
            if (c3929iW.b()) {
                return c3929iW;
            }
            throw a.AbstractC0582a.l(c3929iW);
        }

        public C3929i w() {
            C3929i c3929i = new C3929i(this);
            int i10 = this.f44718E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3929i.f44701F = this.f44719F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3929i.f44702G = this.f44720G;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3929i.f44703H = this.f44721H;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3929i.f44704I = this.f44722I;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3929i.f44705J = this.f44723J;
            if ((this.f44718E & 32) == 32) {
                this.f44724K = Collections.unmodifiableList(this.f44724K);
                this.f44718E &= -33;
            }
            c3929i.f44706K = this.f44724K;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3929i.f44707L = this.f44725L;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3929i.f44708M = this.f44726M;
            if ((this.f44718E & 256) == 256) {
                this.f44727N = Collections.unmodifiableList(this.f44727N);
                this.f44718E &= -257;
            }
            c3929i.f44709N = this.f44727N;
            if ((this.f44718E & 512) == 512) {
                this.f44728O = Collections.unmodifiableList(this.f44728O);
                this.f44718E &= -513;
            }
            c3929i.f44710O = this.f44728O;
            if ((this.f44718E & 1024) == 1024) {
                this.f44729P = Collections.unmodifiableList(this.f44729P);
                this.f44718E &= -1025;
            }
            c3929i.f44712Q = this.f44729P;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            c3929i.f44713R = this.f44730Q;
            if ((this.f44718E & 4096) == 4096) {
                this.f44731R = Collections.unmodifiableList(this.f44731R);
                this.f44718E &= -4097;
            }
            c3929i.f44714S = this.f44731R;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            c3929i.f44715T = this.f44732S;
            c3929i.f44700E = i11;
            return c3929i;
        }

        private void H() {
        }
    }
}
