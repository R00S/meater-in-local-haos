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
/* renamed from: lb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3922b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: I, reason: collision with root package name */
    private static final C3922b f44475I;

    /* renamed from: J, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3922b> f44476J = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44477C;

    /* renamed from: D, reason: collision with root package name */
    private int f44478D;

    /* renamed from: E, reason: collision with root package name */
    private int f44479E;

    /* renamed from: F, reason: collision with root package name */
    private List<C0595b> f44480F;

    /* renamed from: G, reason: collision with root package name */
    private byte f44481G;

    /* renamed from: H, reason: collision with root package name */
    private int f44482H;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.b$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3922b> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3922b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3922b(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.b$b, reason: collision with other inner class name */
    public static final class C0595b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: I, reason: collision with root package name */
        private static final C0595b f44483I;

        /* renamed from: J, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<C0595b> f44484J = new a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f44485C;

        /* renamed from: D, reason: collision with root package name */
        private int f44486D;

        /* renamed from: E, reason: collision with root package name */
        private int f44487E;

        /* renamed from: F, reason: collision with root package name */
        private c f44488F;

        /* renamed from: G, reason: collision with root package name */
        private byte f44489G;

        /* renamed from: H, reason: collision with root package name */
        private int f44490H;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.b$b$a */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C0595b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0595b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new C0595b(eVar, fVar);
            }
        }

        static {
            C0595b c0595b = new C0595b(true);
            f44483I = c0595b;
            c0595b.B();
        }

        private void B() {
            this.f44487E = 0;
            this.f44488F = c.M();
        }

        public static C0596b C() {
            return C0596b.u();
        }

        public static C0596b D(C0595b c0595b) {
            return C().o(c0595b);
        }

        public static C0595b w() {
            return f44483I;
        }

        public boolean A() {
            return (this.f44486D & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C0596b g() {
            return C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C0596b d() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f44489G;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!z()) {
                this.f44489G = (byte) 0;
                return false;
            }
            if (!A()) {
                this.f44489G = (byte) 0;
                return false;
            }
            if (y().b()) {
                this.f44489G = (byte) 1;
                return true;
            }
            this.f44489G = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f44490H;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f44486D & 1) == 1 ? CodedOutputStream.o(1, this.f44487E) : 0;
            if ((this.f44486D & 2) == 2) {
                iO += CodedOutputStream.s(2, this.f44488F);
            }
            int size = iO + this.f44485C.size();
            this.f44490H = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<C0595b> h() {
            return f44484J;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            if ((this.f44486D & 1) == 1) {
                codedOutputStream.a0(1, this.f44487E);
            }
            if ((this.f44486D & 2) == 2) {
                codedOutputStream.d0(2, this.f44488F);
            }
            codedOutputStream.i0(this.f44485C);
        }

        public int x() {
            return this.f44487E;
        }

        public c y() {
            return this.f44488F;
        }

        public boolean z() {
            return (this.f44486D & 1) == 1;
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.b$b$c */
        public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: R, reason: collision with root package name */
            private static final c f44494R;

            /* renamed from: S, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f44495S = new a();

            /* renamed from: C, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f44496C;

            /* renamed from: D, reason: collision with root package name */
            private int f44497D;

            /* renamed from: E, reason: collision with root package name */
            private EnumC0598c f44498E;

            /* renamed from: F, reason: collision with root package name */
            private long f44499F;

            /* renamed from: G, reason: collision with root package name */
            private float f44500G;

            /* renamed from: H, reason: collision with root package name */
            private double f44501H;

            /* renamed from: I, reason: collision with root package name */
            private int f44502I;

            /* renamed from: J, reason: collision with root package name */
            private int f44503J;

            /* renamed from: K, reason: collision with root package name */
            private int f44504K;

            /* renamed from: L, reason: collision with root package name */
            private C3922b f44505L;

            /* renamed from: M, reason: collision with root package name */
            private List<c> f44506M;

            /* renamed from: N, reason: collision with root package name */
            private int f44507N;

            /* renamed from: O, reason: collision with root package name */
            private int f44508O;

            /* renamed from: P, reason: collision with root package name */
            private byte f44509P;

            /* renamed from: Q, reason: collision with root package name */
            private int f44510Q;

            /* compiled from: ProtoBuf.java */
            /* renamed from: lb.b$b$c$a */
            static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: lb.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC0598c implements i.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* renamed from: P, reason: collision with root package name */
                private static i.b<EnumC0598c> f44536P = new a();

                /* renamed from: B, reason: collision with root package name */
                private final int f44538B;

                /* compiled from: ProtoBuf.java */
                /* renamed from: lb.b$b$c$c$a */
                static class a implements i.b<EnumC0598c> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0598c a(int i10) {
                        return EnumC0598c.c(i10);
                    }
                }

                EnumC0598c(int i10, int i11) {
                    this.f44538B = i11;
                }

                public static EnumC0598c c(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            return ENUM;
                        case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            return ANNOTATION;
                        case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int e() {
                    return this.f44538B;
                }
            }

            static {
                c cVar = new c(true);
                f44494R = cVar;
                cVar.e0();
            }

            public static c M() {
                return f44494R;
            }

            private void e0() {
                this.f44498E = EnumC0598c.BYTE;
                this.f44499F = 0L;
                this.f44500G = 0.0f;
                this.f44501H = 0.0d;
                this.f44502I = 0;
                this.f44503J = 0;
                this.f44504K = 0;
                this.f44505L = C3922b.A();
                this.f44506M = Collections.emptyList();
                this.f44507N = 0;
                this.f44508O = 0;
            }

            public static C0597b f0() {
                return C0597b.u();
            }

            public static C0597b g0(c cVar) {
                return f0().o(cVar);
            }

            public C3922b G() {
                return this.f44505L;
            }

            public int H() {
                return this.f44507N;
            }

            public c I(int i10) {
                return this.f44506M.get(i10);
            }

            public int J() {
                return this.f44506M.size();
            }

            public List<c> K() {
                return this.f44506M;
            }

            public int L() {
                return this.f44503J;
            }

            public double N() {
                return this.f44501H;
            }

            public int O() {
                return this.f44504K;
            }

            public int P() {
                return this.f44508O;
            }

            public float Q() {
                return this.f44500G;
            }

            public long R() {
                return this.f44499F;
            }

            public int S() {
                return this.f44502I;
            }

            public EnumC0598c T() {
                return this.f44498E;
            }

            public boolean U() {
                return (this.f44497D & 128) == 128;
            }

            public boolean V() {
                return (this.f44497D & 256) == 256;
            }

            public boolean W() {
                return (this.f44497D & 32) == 32;
            }

            public boolean X() {
                return (this.f44497D & 8) == 8;
            }

            public boolean Y() {
                return (this.f44497D & 64) == 64;
            }

            public boolean Z() {
                return (this.f44497D & 512) == 512;
            }

            public boolean a0() {
                return (this.f44497D & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean b() {
                byte b10 = this.f44509P;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (U() && !G().b()) {
                    this.f44509P = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < J(); i10++) {
                    if (!I(i10).b()) {
                        this.f44509P = (byte) 0;
                        return false;
                    }
                }
                this.f44509P = (byte) 1;
                return true;
            }

            public boolean b0() {
                return (this.f44497D & 2) == 2;
            }

            public boolean c0() {
                return (this.f44497D & 16) == 16;
            }

            public boolean d0() {
                return (this.f44497D & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int f() {
                int i10 = this.f44510Q;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f44497D & 1) == 1 ? CodedOutputStream.h(1, this.f44498E.e()) : 0;
                if ((this.f44497D & 2) == 2) {
                    iH += CodedOutputStream.A(2, this.f44499F);
                }
                if ((this.f44497D & 4) == 4) {
                    iH += CodedOutputStream.l(3, this.f44500G);
                }
                if ((this.f44497D & 8) == 8) {
                    iH += CodedOutputStream.f(4, this.f44501H);
                }
                if ((this.f44497D & 16) == 16) {
                    iH += CodedOutputStream.o(5, this.f44502I);
                }
                if ((this.f44497D & 32) == 32) {
                    iH += CodedOutputStream.o(6, this.f44503J);
                }
                if ((this.f44497D & 64) == 64) {
                    iH += CodedOutputStream.o(7, this.f44504K);
                }
                if ((this.f44497D & 128) == 128) {
                    iH += CodedOutputStream.s(8, this.f44505L);
                }
                for (int i11 = 0; i11 < this.f44506M.size(); i11++) {
                    iH += CodedOutputStream.s(9, this.f44506M.get(i11));
                }
                if ((this.f44497D & 512) == 512) {
                    iH += CodedOutputStream.o(10, this.f44508O);
                }
                if ((this.f44497D & 256) == 256) {
                    iH += CodedOutputStream.o(11, this.f44507N);
                }
                int size = iH + this.f44496C.size();
                this.f44510Q = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<c> h() {
                return f44495S;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void i(CodedOutputStream codedOutputStream) throws IOException {
                f();
                if ((this.f44497D & 1) == 1) {
                    codedOutputStream.S(1, this.f44498E.e());
                }
                if ((this.f44497D & 2) == 2) {
                    codedOutputStream.t0(2, this.f44499F);
                }
                if ((this.f44497D & 4) == 4) {
                    codedOutputStream.W(3, this.f44500G);
                }
                if ((this.f44497D & 8) == 8) {
                    codedOutputStream.Q(4, this.f44501H);
                }
                if ((this.f44497D & 16) == 16) {
                    codedOutputStream.a0(5, this.f44502I);
                }
                if ((this.f44497D & 32) == 32) {
                    codedOutputStream.a0(6, this.f44503J);
                }
                if ((this.f44497D & 64) == 64) {
                    codedOutputStream.a0(7, this.f44504K);
                }
                if ((this.f44497D & 128) == 128) {
                    codedOutputStream.d0(8, this.f44505L);
                }
                for (int i10 = 0; i10 < this.f44506M.size(); i10++) {
                    codedOutputStream.d0(9, this.f44506M.get(i10));
                }
                if ((this.f44497D & 512) == 512) {
                    codedOutputStream.a0(10, this.f44508O);
                }
                if ((this.f44497D & 256) == 256) {
                    codedOutputStream.a0(11, this.f44507N);
                }
                codedOutputStream.i0(this.f44496C);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public C0597b g() {
                return f0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: j0, reason: merged with bridge method [inline-methods] */
            public C0597b d() {
                return g0(this);
            }

            private c(h.b bVar) {
                super(bVar);
                this.f44509P = (byte) -1;
                this.f44510Q = -1;
                this.f44496C = bVar.n();
            }

            private c(boolean z10) {
                this.f44509P = (byte) -1;
                this.f44510Q = -1;
                this.f44496C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                this.f44509P = (byte) -1;
                this.f44510Q = -1;
                e0();
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
                                        int iN = eVar.n();
                                        EnumC0598c enumC0598cC = EnumC0598c.c(iN);
                                        if (enumC0598cC == null) {
                                            codedOutputStreamJ.o0(iK);
                                            codedOutputStreamJ.o0(iN);
                                        } else {
                                            this.f44497D |= 1;
                                            this.f44498E = enumC0598cC;
                                        }
                                    case 16:
                                        this.f44497D |= 2;
                                        this.f44499F = eVar.H();
                                    case 29:
                                        this.f44497D |= 4;
                                        this.f44500G = eVar.q();
                                    case 33:
                                        this.f44497D |= 8;
                                        this.f44501H = eVar.m();
                                    case 40:
                                        this.f44497D |= 16;
                                        this.f44502I = eVar.s();
                                    case 48:
                                        this.f44497D |= 32;
                                        this.f44503J = eVar.s();
                                    case 56:
                                        this.f44497D |= 64;
                                        this.f44504K = eVar.s();
                                    case 66:
                                        c cVarD = (this.f44497D & 128) == 128 ? this.f44505L.d() : null;
                                        C3922b c3922b = (C3922b) eVar.u(C3922b.f44476J, fVar);
                                        this.f44505L = c3922b;
                                        if (cVarD != null) {
                                            cVarD.o(c3922b);
                                            this.f44505L = cVarD.s();
                                        }
                                        this.f44497D |= 128;
                                    case 74:
                                        if ((c10 & 256) != 256) {
                                            this.f44506M = new ArrayList();
                                            c10 = 256;
                                        }
                                        this.f44506M.add(eVar.u(f44495S, fVar));
                                    case 80:
                                        this.f44497D |= 512;
                                        this.f44508O = eVar.s();
                                    case 88:
                                        this.f44497D |= 256;
                                        this.f44507N = eVar.s();
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
                            if ((c10 & 256) == Q10) {
                                this.f44506M = Collections.unmodifiableList(this.f44506M);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f44496C = bVarD.e();
                                throw th2;
                            }
                            this.f44496C = bVarD.e();
                            n();
                            throw th;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f44506M = Collections.unmodifiableList(this.f44506M);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f44496C = bVarD.e();
                            throw th3;
                        }
                        this.f44496C = bVarD.e();
                        n();
                        return;
                    }
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: lb.b$b$c$b, reason: collision with other inner class name */
            public static final class C0597b extends h.b<c, C0597b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

                /* renamed from: C, reason: collision with root package name */
                private int f44511C;

                /* renamed from: E, reason: collision with root package name */
                private long f44513E;

                /* renamed from: F, reason: collision with root package name */
                private float f44514F;

                /* renamed from: G, reason: collision with root package name */
                private double f44515G;

                /* renamed from: H, reason: collision with root package name */
                private int f44516H;

                /* renamed from: I, reason: collision with root package name */
                private int f44517I;

                /* renamed from: J, reason: collision with root package name */
                private int f44518J;

                /* renamed from: M, reason: collision with root package name */
                private int f44521M;

                /* renamed from: N, reason: collision with root package name */
                private int f44522N;

                /* renamed from: D, reason: collision with root package name */
                private EnumC0598c f44512D = EnumC0598c.BYTE;

                /* renamed from: K, reason: collision with root package name */
                private C3922b f44519K = C3922b.A();

                /* renamed from: L, reason: collision with root package name */
                private List<c> f44520L = Collections.emptyList();

                private C0597b() {
                    w();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C0597b u() {
                    return new C0597b();
                }

                private void v() {
                    if ((this.f44511C & 256) != 256) {
                        this.f44520L = new ArrayList(this.f44520L);
                        this.f44511C |= 256;
                    }
                }

                public C0597b A(C3922b c3922b) {
                    if ((this.f44511C & 128) != 128 || this.f44519K == C3922b.A()) {
                        this.f44519K = c3922b;
                    } else {
                        this.f44519K = C3922b.F(this.f44519K).o(c3922b).s();
                    }
                    this.f44511C |= 128;
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public lb.C3922b.C0595b.c.C0597b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<lb.b$b$c> r1 = lb.C3922b.C0595b.c.f44495S     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        lb.b$b$c r3 = (lb.C3922b.C0595b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        lb.b$b$c r4 = (lb.C3922b.C0595b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: lb.C3922b.C0595b.c.C0597b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.b$b$c$b");
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public C0597b o(c cVar) {
                    if (cVar == c.M()) {
                        return this;
                    }
                    if (cVar.d0()) {
                        M(cVar.T());
                    }
                    if (cVar.b0()) {
                        J(cVar.R());
                    }
                    if (cVar.a0()) {
                        I(cVar.Q());
                    }
                    if (cVar.X()) {
                        F(cVar.N());
                    }
                    if (cVar.c0()) {
                        L(cVar.S());
                    }
                    if (cVar.W()) {
                        E(cVar.L());
                    }
                    if (cVar.Y()) {
                        G(cVar.O());
                    }
                    if (cVar.U()) {
                        A(cVar.G());
                    }
                    if (!cVar.f44506M.isEmpty()) {
                        if (this.f44520L.isEmpty()) {
                            this.f44520L = cVar.f44506M;
                            this.f44511C &= -257;
                        } else {
                            v();
                            this.f44520L.addAll(cVar.f44506M);
                        }
                    }
                    if (cVar.V()) {
                        D(cVar.H());
                    }
                    if (cVar.Z()) {
                        H(cVar.P());
                    }
                    p(n().f(cVar.f44496C));
                    return this;
                }

                public C0597b D(int i10) {
                    this.f44511C |= 512;
                    this.f44521M = i10;
                    return this;
                }

                public C0597b E(int i10) {
                    this.f44511C |= 32;
                    this.f44517I = i10;
                    return this;
                }

                public C0597b F(double d10) {
                    this.f44511C |= 8;
                    this.f44515G = d10;
                    return this;
                }

                public C0597b G(int i10) {
                    this.f44511C |= 64;
                    this.f44518J = i10;
                    return this;
                }

                public C0597b H(int i10) {
                    this.f44511C |= 1024;
                    this.f44522N = i10;
                    return this;
                }

                public C0597b I(float f10) {
                    this.f44511C |= 4;
                    this.f44514F = f10;
                    return this;
                }

                public C0597b J(long j10) {
                    this.f44511C |= 2;
                    this.f44513E = j10;
                    return this;
                }

                public C0597b L(int i10) {
                    this.f44511C |= 16;
                    this.f44516H = i10;
                    return this;
                }

                public C0597b M(EnumC0598c enumC0598c) {
                    enumC0598c.getClass();
                    this.f44511C |= 1;
                    this.f44512D = enumC0598c;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public c e() {
                    c cVarS = s();
                    if (cVarS.b()) {
                        return cVarS;
                    }
                    throw a.AbstractC0582a.l(cVarS);
                }

                public c s() {
                    c cVar = new c(this);
                    int i10 = this.f44511C;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f44498E = this.f44512D;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f44499F = this.f44513E;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f44500G = this.f44514F;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f44501H = this.f44515G;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f44502I = this.f44516H;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f44503J = this.f44517I;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f44504K = this.f44518J;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f44505L = this.f44519K;
                    if ((this.f44511C & 256) == 256) {
                        this.f44520L = Collections.unmodifiableList(this.f44520L);
                        this.f44511C &= -257;
                    }
                    cVar.f44506M = this.f44520L;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    cVar.f44507N = this.f44521M;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    cVar.f44508O = this.f44522N;
                    cVar.f44497D = i11;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C0597b m() {
                    return u().o(s());
                }

                private void w() {
                }
            }
        }

        private C0595b(h.b bVar) {
            super(bVar);
            this.f44489G = (byte) -1;
            this.f44490H = -1;
            this.f44485C = bVar.n();
        }

        private C0595b(boolean z10) {
            this.f44489G = (byte) -1;
            this.f44490H = -1;
            this.f44485C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        private C0595b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f44489G = (byte) -1;
            this.f44490H = -1;
            B();
            d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f44486D |= 1;
                                this.f44487E = eVar.s();
                            } else if (iK != 18) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                c.C0597b c0597bD = (this.f44486D & 2) == 2 ? this.f44488F.d() : null;
                                c cVar = (c) eVar.u(c.f44495S, fVar);
                                this.f44488F = cVar;
                                if (c0597bD != null) {
                                    c0597bD.o(cVar);
                                    this.f44488F = c0597bD.s();
                                }
                                this.f44486D |= 2;
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f44485C = bVarD.e();
                        throw th2;
                    }
                    this.f44485C = bVarD.e();
                    n();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f44485C = bVarD.e();
                throw th3;
            }
            this.f44485C = bVarD.e();
            n();
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.b$b$b, reason: collision with other inner class name */
        public static final class C0596b extends h.b<C0595b, C0596b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: C, reason: collision with root package name */
            private int f44491C;

            /* renamed from: D, reason: collision with root package name */
            private int f44492D;

            /* renamed from: E, reason: collision with root package name */
            private c f44493E = c.M();

            private C0596b() {
                v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0596b u() {
                return new C0596b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C0596b o(C0595b c0595b) {
                if (c0595b == C0595b.w()) {
                    return this;
                }
                if (c0595b.z()) {
                    C(c0595b.x());
                }
                if (c0595b.A()) {
                    B(c0595b.y());
                }
                p(n().f(c0595b.f44485C));
                return this;
            }

            public C0596b B(c cVar) {
                if ((this.f44491C & 2) != 2 || this.f44493E == c.M()) {
                    this.f44493E = cVar;
                } else {
                    this.f44493E = c.g0(this.f44493E).o(cVar).s();
                }
                this.f44491C |= 2;
                return this;
            }

            public C0596b C(int i10) {
                this.f44491C |= 1;
                this.f44492D = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0595b e() {
                C0595b c0595bS = s();
                if (c0595bS.b()) {
                    return c0595bS;
                }
                throw a.AbstractC0582a.l(c0595bS);
            }

            public C0595b s() {
                C0595b c0595b = new C0595b(this);
                int i10 = this.f44491C;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0595b.f44487E = this.f44492D;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0595b.f44488F = this.f44493E;
                c0595b.f44486D = i11;
                return c0595b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0596b m() {
                return u().o(s());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public lb.C3922b.C0595b.C0596b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<lb.b$b> r1 = lb.C3922b.C0595b.f44484J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    lb.b$b r3 = (lb.C3922b.C0595b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    lb.b$b r4 = (lb.C3922b.C0595b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: lb.C3922b.C0595b.C0596b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.b$b$b");
            }

            private void v() {
            }
        }
    }

    static {
        C3922b c3922b = new C3922b(true);
        f44475I = c3922b;
        c3922b.D();
    }

    public static C3922b A() {
        return f44475I;
    }

    private void D() {
        this.f44479E = 0;
        this.f44480F = Collections.emptyList();
    }

    public static c E() {
        return c.u();
    }

    public static c F(C3922b c3922b) {
        return E().o(c3922b);
    }

    public int B() {
        return this.f44479E;
    }

    public boolean C() {
        return (this.f44478D & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public c g() {
        return E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public c d() {
        return F(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44481G;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!C()) {
            this.f44481G = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < y(); i10++) {
            if (!x(i10).b()) {
                this.f44481G = (byte) 0;
                return false;
            }
        }
        this.f44481G = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44482H;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44478D & 1) == 1 ? CodedOutputStream.o(1, this.f44479E) : 0;
        for (int i11 = 0; i11 < this.f44480F.size(); i11++) {
            iO += CodedOutputStream.s(2, this.f44480F.get(i11));
        }
        int size = iO + this.f44477C.size();
        this.f44482H = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3922b> h() {
        return f44476J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        if ((this.f44478D & 1) == 1) {
            codedOutputStream.a0(1, this.f44479E);
        }
        for (int i10 = 0; i10 < this.f44480F.size(); i10++) {
            codedOutputStream.d0(2, this.f44480F.get(i10));
        }
        codedOutputStream.i0(this.f44477C);
    }

    public C0595b x(int i10) {
        return this.f44480F.get(i10);
    }

    public int y() {
        return this.f44480F.size();
    }

    public List<C0595b> z() {
        return this.f44480F;
    }

    private C3922b(h.b bVar) {
        super(bVar);
        this.f44481G = (byte) -1;
        this.f44482H = -1;
        this.f44477C = bVar.n();
    }

    private C3922b(boolean z10) {
        this.f44481G = (byte) -1;
        this.f44482H = -1;
        this.f44477C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3922b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44481G = (byte) -1;
        this.f44482H = -1;
        D();
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
                            this.f44478D |= 1;
                            this.f44479E = eVar.s();
                        } else if (iK != 18) {
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f44480F = new ArrayList();
                                c10 = 2;
                            }
                            this.f44480F.add(eVar.u(C0595b.f44484J, fVar));
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
                    this.f44480F = Collections.unmodifiableList(this.f44480F);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44477C = bVarD.e();
                    throw th2;
                }
                this.f44477C = bVarD.e();
                n();
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f44480F = Collections.unmodifiableList(this.f44480F);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44477C = bVarD.e();
            throw th3;
        }
        this.f44477C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.b$c */
    public static final class c extends h.b<C3922b, c> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44539C;

        /* renamed from: D, reason: collision with root package name */
        private int f44540D;

        /* renamed from: E, reason: collision with root package name */
        private List<C0595b> f44541E = Collections.emptyList();

        private c() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c u() {
            return new c();
        }

        private void v() {
            if ((this.f44539C & 2) != 2) {
                this.f44541E = new ArrayList(this.f44541E);
                this.f44539C |= 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3922b.c k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.b> r1 = lb.C3922b.f44476J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.b r3 = (lb.C3922b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.b r4 = (lb.C3922b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3922b.c.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.b$c");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public c o(C3922b c3922b) {
            if (c3922b == C3922b.A()) {
                return this;
            }
            if (c3922b.C()) {
                C(c3922b.B());
            }
            if (!c3922b.f44480F.isEmpty()) {
                if (this.f44541E.isEmpty()) {
                    this.f44541E = c3922b.f44480F;
                    this.f44539C &= -3;
                } else {
                    v();
                    this.f44541E.addAll(c3922b.f44480F);
                }
            }
            p(n().f(c3922b.f44477C));
            return this;
        }

        public c C(int i10) {
            this.f44539C |= 1;
            this.f44540D = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3922b e() {
            C3922b c3922bS = s();
            if (c3922bS.b()) {
                return c3922bS;
            }
            throw a.AbstractC0582a.l(c3922bS);
        }

        public C3922b s() {
            C3922b c3922b = new C3922b(this);
            int i10 = (this.f44539C & 1) != 1 ? 0 : 1;
            c3922b.f44479E = this.f44540D;
            if ((this.f44539C & 2) == 2) {
                this.f44541E = Collections.unmodifiableList(this.f44541E);
                this.f44539C &= -3;
            }
            c3922b.f44480F = this.f44541E;
            c3922b.f44478D = i10;
            return c3922b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public c m() {
            return u().o(s());
        }

        private void w() {
        }
    }
}
