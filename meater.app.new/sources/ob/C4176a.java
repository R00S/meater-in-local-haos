package ob;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.protobuf.w;
import lb.C3922b;
import lb.C3923c;
import lb.C3924d;
import lb.C3929i;
import lb.C3932l;
import lb.C3934n;
import lb.C3937q;
import lb.C3939s;

/* compiled from: JvmProtoBuf.java */
/* renamed from: ob.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4176a {

    /* renamed from: a, reason: collision with root package name */
    public static final h.f<C3924d, c> f46656a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.f<C3929i, c> f46657b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.f<C3929i, Integer> f46658c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.f<C3934n, d> f46659d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.f<C3934n, Integer> f46660e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.f<C3937q, List<C3922b>> f46661f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.f<C3937q, Boolean> f46662g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.f<C3939s, List<C3922b>> f46663h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.f<C3923c, Integer> f46664i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.f<C3923c, List<C3934n>> f46665j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.f<C3923c, Integer> f46666k;

    /* renamed from: l, reason: collision with root package name */
    public static final h.f<C3923c, Integer> f46667l;

    /* renamed from: m, reason: collision with root package name */
    public static final h.f<C3932l, Integer> f46668m;

    /* renamed from: n, reason: collision with root package name */
    public static final h.f<C3932l, List<C3934n>> f46669n;

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: ob.a$e */
    public static final class e extends h implements p {

        /* renamed from: I, reason: collision with root package name */
        private static final e f46709I;

        /* renamed from: J, reason: collision with root package name */
        public static q<e> f46710J = new C0642a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f46711C;

        /* renamed from: D, reason: collision with root package name */
        private List<c> f46712D;

        /* renamed from: E, reason: collision with root package name */
        private List<Integer> f46713E;

        /* renamed from: F, reason: collision with root package name */
        private int f46714F;

        /* renamed from: G, reason: collision with root package name */
        private byte f46715G;

        /* renamed from: H, reason: collision with root package name */
        private int f46716H;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$e$a, reason: collision with other inner class name */
        static class C0642a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C0642a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new e(eVar, fVar);
            }
        }

        static {
            e eVar = new e(true);
            f46709I = eVar;
            eVar.A();
        }

        private void A() {
            this.f46712D = Collections.emptyList();
            this.f46713E = Collections.emptyList();
        }

        public static b B() {
            return b.u();
        }

        public static b C(e eVar) {
            return B().o(eVar);
        }

        public static e E(InputStream inputStream, f fVar) {
            return f46710J.c(inputStream, fVar);
        }

        public static e x() {
            return f46709I;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b g() {
            return B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b d() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f46715G;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f46715G = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f46716H;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f46712D.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f46712D.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f46713E.size(); i12++) {
                iP += CodedOutputStream.p(this.f46713E.get(i12).intValue());
            }
            int iP2 = iS + iP;
            if (!y().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f46714F = iP;
            int size = iP2 + this.f46711C.size();
            this.f46716H = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<e> h() {
            return f46710J;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            for (int i10 = 0; i10 < this.f46712D.size(); i10++) {
                codedOutputStream.d0(1, this.f46712D.get(i10));
            }
            if (y().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f46714F);
            }
            for (int i11 = 0; i11 < this.f46713E.size(); i11++) {
                codedOutputStream.b0(this.f46713E.get(i11).intValue());
            }
            codedOutputStream.i0(this.f46711C);
        }

        public List<Integer> y() {
            return this.f46713E;
        }

        public List<c> z() {
            return this.f46712D;
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$e$c */
        public static final class c extends h implements p {

            /* renamed from: O, reason: collision with root package name */
            private static final c f46720O;

            /* renamed from: P, reason: collision with root package name */
            public static q<c> f46721P = new C0643a();

            /* renamed from: C, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f46722C;

            /* renamed from: D, reason: collision with root package name */
            private int f46723D;

            /* renamed from: E, reason: collision with root package name */
            private int f46724E;

            /* renamed from: F, reason: collision with root package name */
            private int f46725F;

            /* renamed from: G, reason: collision with root package name */
            private Object f46726G;

            /* renamed from: H, reason: collision with root package name */
            private EnumC0644c f46727H;

            /* renamed from: I, reason: collision with root package name */
            private List<Integer> f46728I;

            /* renamed from: J, reason: collision with root package name */
            private int f46729J;

            /* renamed from: K, reason: collision with root package name */
            private List<Integer> f46730K;

            /* renamed from: L, reason: collision with root package name */
            private int f46731L;

            /* renamed from: M, reason: collision with root package name */
            private byte f46732M;

            /* renamed from: N, reason: collision with root package name */
            private int f46733N;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: ob.a$e$c$a, reason: collision with other inner class name */
            static class C0643a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C0643a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: ob.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC0644c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* renamed from: F, reason: collision with root package name */
                private static i.b<EnumC0644c> f46744F = new C0645a();

                /* renamed from: B, reason: collision with root package name */
                private final int f46746B;

                /* compiled from: JvmProtoBuf.java */
                /* renamed from: ob.a$e$c$c$a, reason: collision with other inner class name */
                static class C0645a implements i.b<EnumC0644c> {
                    C0645a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0644c a(int i10) {
                        return EnumC0644c.c(i10);
                    }
                }

                EnumC0644c(int i10, int i11) {
                    this.f46746B = i11;
                }

                public static EnumC0644c c(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int e() {
                    return this.f46746B;
                }
            }

            static {
                c cVar = new c(true);
                f46720O = cVar;
                cVar.R();
            }

            public static c D() {
                return f46720O;
            }

            private void R() {
                this.f46724E = 1;
                this.f46725F = 0;
                this.f46726G = "";
                this.f46727H = EnumC0644c.NONE;
                this.f46728I = Collections.emptyList();
                this.f46730K = Collections.emptyList();
            }

            public static b S() {
                return b.u();
            }

            public static b T(c cVar) {
                return S().o(cVar);
            }

            public EnumC0644c E() {
                return this.f46727H;
            }

            public int F() {
                return this.f46725F;
            }

            public int G() {
                return this.f46724E;
            }

            public int H() {
                return this.f46730K.size();
            }

            public List<Integer> I() {
                return this.f46730K;
            }

            public String J() {
                Object obj = this.f46726G;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String strJ = dVar.J();
                if (dVar.z()) {
                    this.f46726G = strJ;
                }
                return strJ;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d K() {
                Object obj = this.f46726G;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVarR = kotlin.reflect.jvm.internal.impl.protobuf.d.r((String) obj);
                this.f46726G = dVarR;
                return dVarR;
            }

            public int L() {
                return this.f46728I.size();
            }

            public List<Integer> M() {
                return this.f46728I;
            }

            public boolean N() {
                return (this.f46723D & 8) == 8;
            }

            public boolean O() {
                return (this.f46723D & 2) == 2;
            }

            public boolean P() {
                return (this.f46723D & 1) == 1;
            }

            public boolean Q() {
                return (this.f46723D & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            public b g() {
                return S();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public b d() {
                return T(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean b() {
                byte b10 = this.f46732M;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f46732M = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int f() {
                int i10 = this.f46733N;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f46723D & 1) == 1 ? CodedOutputStream.o(1, this.f46724E) : 0;
                if ((this.f46723D & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f46725F);
                }
                if ((this.f46723D & 8) == 8) {
                    iO += CodedOutputStream.h(3, this.f46727H.e());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f46728I.size(); i11++) {
                    iP += CodedOutputStream.p(this.f46728I.get(i11).intValue());
                }
                int iP2 = iO + iP;
                if (!M().isEmpty()) {
                    iP2 = iP2 + 1 + CodedOutputStream.p(iP);
                }
                this.f46729J = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f46730K.size(); i12++) {
                    iP3 += CodedOutputStream.p(this.f46730K.get(i12).intValue());
                }
                int iD = iP2 + iP3;
                if (!I().isEmpty()) {
                    iD = iD + 1 + CodedOutputStream.p(iP3);
                }
                this.f46731L = iP3;
                if ((this.f46723D & 4) == 4) {
                    iD += CodedOutputStream.d(6, K());
                }
                int size = iD + this.f46722C.size();
                this.f46733N = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public q<c> h() {
                return f46721P;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void i(CodedOutputStream codedOutputStream) throws IOException {
                f();
                if ((this.f46723D & 1) == 1) {
                    codedOutputStream.a0(1, this.f46724E);
                }
                if ((this.f46723D & 2) == 2) {
                    codedOutputStream.a0(2, this.f46725F);
                }
                if ((this.f46723D & 8) == 8) {
                    codedOutputStream.S(3, this.f46727H.e());
                }
                if (M().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f46729J);
                }
                for (int i10 = 0; i10 < this.f46728I.size(); i10++) {
                    codedOutputStream.b0(this.f46728I.get(i10).intValue());
                }
                if (I().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f46731L);
                }
                for (int i11 = 0; i11 < this.f46730K.size(); i11++) {
                    codedOutputStream.b0(this.f46730K.get(i11).intValue());
                }
                if ((this.f46723D & 4) == 4) {
                    codedOutputStream.O(6, K());
                }
                codedOutputStream.i0(this.f46722C);
            }

            private c(h.b bVar) {
                super(bVar);
                this.f46729J = -1;
                this.f46731L = -1;
                this.f46732M = (byte) -1;
                this.f46733N = -1;
                this.f46722C = bVar.n();
            }

            private c(boolean z10) {
                this.f46729J = -1;
                this.f46731L = -1;
                this.f46732M = (byte) -1;
                this.f46733N = -1;
                this.f46722C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                this.f46729J = -1;
                this.f46731L = -1;
                this.f46732M = (byte) -1;
                this.f46733N = -1;
                R();
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
                                    this.f46723D |= 1;
                                    this.f46724E = eVar.s();
                                } else if (iK == 16) {
                                    this.f46723D |= 2;
                                    this.f46725F = eVar.s();
                                } else if (iK == 24) {
                                    int iN = eVar.n();
                                    EnumC0644c enumC0644cC = EnumC0644c.c(iN);
                                    if (enumC0644cC == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f46723D |= 8;
                                        this.f46727H = enumC0644cC;
                                    }
                                } else if (iK == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f46728I = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f46728I.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 34) {
                                    int iJ = eVar.j(eVar.A());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f46728I = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f46728I.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                } else if (iK == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f46730K = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f46730K.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 42) {
                                    int iJ2 = eVar.j(eVar.A());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f46730K = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f46730K.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ2);
                                } else if (iK != 50) {
                                    if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d dVarL = eVar.l();
                                    this.f46723D |= 4;
                                    this.f46726G = dVarL;
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th) {
                        if ((i10 & 16) == 16) {
                            this.f46728I = Collections.unmodifiableList(this.f46728I);
                        }
                        if ((i10 & 32) == 32) {
                            this.f46730K = Collections.unmodifiableList(this.f46730K);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f46722C = bVarD.e();
                            throw th2;
                        }
                        this.f46722C = bVarD.e();
                        n();
                        throw th;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f46728I = Collections.unmodifiableList(this.f46728I);
                }
                if ((i10 & 32) == 32) {
                    this.f46730K = Collections.unmodifiableList(this.f46730K);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f46722C = bVarD.e();
                    throw th3;
                }
                this.f46722C = bVarD.e();
                n();
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: ob.a$e$c$b */
            public static final class b extends h.b<c, b> implements p {

                /* renamed from: C, reason: collision with root package name */
                private int f46734C;

                /* renamed from: E, reason: collision with root package name */
                private int f46736E;

                /* renamed from: D, reason: collision with root package name */
                private int f46735D = 1;

                /* renamed from: F, reason: collision with root package name */
                private Object f46737F = "";

                /* renamed from: G, reason: collision with root package name */
                private EnumC0644c f46738G = EnumC0644c.NONE;

                /* renamed from: H, reason: collision with root package name */
                private List<Integer> f46739H = Collections.emptyList();

                /* renamed from: I, reason: collision with root package name */
                private List<Integer> f46740I = Collections.emptyList();

                private b() {
                    A();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b u() {
                    return new b();
                }

                private void v() {
                    if ((this.f46734C & 32) != 32) {
                        this.f46740I = new ArrayList(this.f46740I);
                        this.f46734C |= 32;
                    }
                }

                private void w() {
                    if ((this.f46734C & 16) != 16) {
                        this.f46739H = new ArrayList(this.f46739H);
                        this.f46734C |= 16;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public ob.C4176a.e.c.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<ob.a$e$c> r1 = ob.C4176a.e.c.f46721P     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        ob.a$e$c r3 = (ob.C4176a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        ob.a$e$c r4 = (ob.C4176a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: ob.C4176a.e.c.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):ob.a$e$c$b");
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public b o(c cVar) {
                    if (cVar == c.D()) {
                        return this;
                    }
                    if (cVar.P()) {
                        F(cVar.G());
                    }
                    if (cVar.O()) {
                        E(cVar.F());
                    }
                    if (cVar.Q()) {
                        this.f46734C |= 4;
                        this.f46737F = cVar.f46726G;
                    }
                    if (cVar.N()) {
                        D(cVar.E());
                    }
                    if (!cVar.f46728I.isEmpty()) {
                        if (this.f46739H.isEmpty()) {
                            this.f46739H = cVar.f46728I;
                            this.f46734C &= -17;
                        } else {
                            w();
                            this.f46739H.addAll(cVar.f46728I);
                        }
                    }
                    if (!cVar.f46730K.isEmpty()) {
                        if (this.f46740I.isEmpty()) {
                            this.f46740I = cVar.f46730K;
                            this.f46734C &= -33;
                        } else {
                            v();
                            this.f46740I.addAll(cVar.f46730K);
                        }
                    }
                    p(n().f(cVar.f46722C));
                    return this;
                }

                public b D(EnumC0644c enumC0644c) {
                    enumC0644c.getClass();
                    this.f46734C |= 8;
                    this.f46738G = enumC0644c;
                    return this;
                }

                public b E(int i10) {
                    this.f46734C |= 2;
                    this.f46736E = i10;
                    return this;
                }

                public b F(int i10) {
                    this.f46734C |= 1;
                    this.f46735D = i10;
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
                    int i10 = this.f46734C;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f46724E = this.f46735D;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f46725F = this.f46736E;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f46726G = this.f46737F;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f46727H = this.f46738G;
                    if ((this.f46734C & 16) == 16) {
                        this.f46739H = Collections.unmodifiableList(this.f46739H);
                        this.f46734C &= -17;
                    }
                    cVar.f46728I = this.f46739H;
                    if ((this.f46734C & 32) == 32) {
                        this.f46740I = Collections.unmodifiableList(this.f46740I);
                        this.f46734C &= -33;
                    }
                    cVar.f46730K = this.f46740I;
                    cVar.f46723D = i11;
                    return cVar;
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

        private e(h.b bVar) {
            super(bVar);
            this.f46714F = -1;
            this.f46715G = (byte) -1;
            this.f46716H = -1;
            this.f46711C = bVar.n();
        }

        private e(boolean z10) {
            this.f46714F = -1;
            this.f46715G = (byte) -1;
            this.f46716H = -1;
            this.f46711C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f46714F = -1;
            this.f46715G = (byte) -1;
            this.f46716H = -1;
            A();
            d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f46712D = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f46712D.add(eVar.u(c.f46721P, fVar));
                            } else if (iK == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f46713E = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f46713E.add(Integer.valueOf(eVar.s()));
                            } else if (iK != 42) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                int iJ = eVar.j(eVar.A());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f46713E = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f46713E.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i10 & 1) == 1) {
                        this.f46712D = Collections.unmodifiableList(this.f46712D);
                    }
                    if ((i10 & 2) == 2) {
                        this.f46713E = Collections.unmodifiableList(this.f46713E);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f46711C = bVarD.e();
                        throw th2;
                    }
                    this.f46711C = bVarD.e();
                    n();
                    throw th;
                }
            }
            if ((i10 & 1) == 1) {
                this.f46712D = Collections.unmodifiableList(this.f46712D);
            }
            if ((i10 & 2) == 2) {
                this.f46713E = Collections.unmodifiableList(this.f46713E);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f46711C = bVarD.e();
                throw th3;
            }
            this.f46711C = bVarD.e();
            n();
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$e$b */
        public static final class b extends h.b<e, b> implements p {

            /* renamed from: C, reason: collision with root package name */
            private int f46717C;

            /* renamed from: D, reason: collision with root package name */
            private List<c> f46718D = Collections.emptyList();

            /* renamed from: E, reason: collision with root package name */
            private List<Integer> f46719E = Collections.emptyList();

            private b() {
                A();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b u() {
                return new b();
            }

            private void v() {
                if ((this.f46717C & 2) != 2) {
                    this.f46719E = new ArrayList(this.f46719E);
                    this.f46717C |= 2;
                }
            }

            private void w() {
                if ((this.f46717C & 1) != 1) {
                    this.f46718D = new ArrayList(this.f46718D);
                    this.f46717C |= 1;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ob.C4176a.e.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<ob.a$e> r1 = ob.C4176a.e.f46710J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    ob.a$e r3 = (ob.C4176a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    ob.a$e r4 = (ob.C4176a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ob.C4176a.e.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):ob.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o(e eVar) {
                if (eVar == e.x()) {
                    return this;
                }
                if (!eVar.f46712D.isEmpty()) {
                    if (this.f46718D.isEmpty()) {
                        this.f46718D = eVar.f46712D;
                        this.f46717C &= -2;
                    } else {
                        w();
                        this.f46718D.addAll(eVar.f46712D);
                    }
                }
                if (!eVar.f46713E.isEmpty()) {
                    if (this.f46719E.isEmpty()) {
                        this.f46719E = eVar.f46713E;
                        this.f46717C &= -3;
                    } else {
                        v();
                        this.f46719E.addAll(eVar.f46713E);
                    }
                }
                p(n().f(eVar.f46711C));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public e e() {
                e eVarS = s();
                if (eVarS.b()) {
                    return eVarS;
                }
                throw a.AbstractC0582a.l(eVarS);
            }

            public e s() {
                e eVar = new e(this);
                if ((this.f46717C & 1) == 1) {
                    this.f46718D = Collections.unmodifiableList(this.f46718D);
                    this.f46717C &= -2;
                }
                eVar.f46712D = this.f46718D;
                if ((this.f46717C & 2) == 2) {
                    this.f46719E = Collections.unmodifiableList(this.f46719E);
                    this.f46717C &= -3;
                }
                eVar.f46713E = this.f46719E;
                return eVar;
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

    static {
        C3924d c3924dI = C3924d.I();
        c cVarW = c.w();
        c cVarW2 = c.w();
        w.b bVar = w.b.f44148N;
        f46656a = h.p(c3924dI, cVarW, cVarW2, null, 100, bVar, c.class);
        f46657b = h.p(C3929i.b0(), c.w(), c.w(), null, 100, bVar, c.class);
        C3929i c3929iB0 = C3929i.b0();
        w.b bVar2 = w.b.f44142H;
        f46658c = h.p(c3929iB0, 0, null, null, 101, bVar2, Integer.class);
        f46659d = h.p(C3934n.Z(), d.z(), d.z(), null, 100, bVar, d.class);
        f46660e = h.p(C3934n.Z(), 0, null, null, 101, bVar2, Integer.class);
        f46661f = h.o(C3937q.Y(), C3922b.A(), null, 100, bVar, false, C3922b.class);
        f46662g = h.p(C3937q.Y(), Boolean.FALSE, null, null, 101, w.b.f44145K, Boolean.class);
        f46663h = h.o(C3939s.L(), C3922b.A(), null, 100, bVar, false, C3922b.class);
        f46664i = h.p(C3923c.A0(), 0, null, null, 101, bVar2, Integer.class);
        f46665j = h.o(C3923c.A0(), C3934n.Z(), null, 102, bVar, false, C3934n.class);
        f46666k = h.p(C3923c.A0(), 0, null, null, 103, bVar2, Integer.class);
        f46667l = h.p(C3923c.A0(), 0, null, null, 104, bVar2, Integer.class);
        f46668m = h.p(C3932l.L(), 0, null, null, 101, bVar2, Integer.class);
        f46669n = h.o(C3932l.L(), C3934n.Z(), null, 102, bVar, false, C3934n.class);
    }

    public static void a(f fVar) {
        fVar.a(f46656a);
        fVar.a(f46657b);
        fVar.a(f46658c);
        fVar.a(f46659d);
        fVar.a(f46660e);
        fVar.a(f46661f);
        fVar.a(f46662g);
        fVar.a(f46663h);
        fVar.a(f46664i);
        fVar.a(f46665j);
        fVar.a(f46666k);
        fVar.a(f46667l);
        fVar.a(f46668m);
        fVar.a(f46669n);
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: ob.a$b */
    public static final class b extends h implements p {

        /* renamed from: I, reason: collision with root package name */
        private static final b f46670I;

        /* renamed from: J, reason: collision with root package name */
        public static q<b> f46671J = new C0638a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f46672C;

        /* renamed from: D, reason: collision with root package name */
        private int f46673D;

        /* renamed from: E, reason: collision with root package name */
        private int f46674E;

        /* renamed from: F, reason: collision with root package name */
        private int f46675F;

        /* renamed from: G, reason: collision with root package name */
        private byte f46676G;

        /* renamed from: H, reason: collision with root package name */
        private int f46677H;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$b$a, reason: collision with other inner class name */
        static class C0638a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C0638a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new b(eVar, fVar);
            }
        }

        static {
            b bVar = new b(true);
            f46670I = bVar;
            bVar.B();
        }

        private void B() {
            this.f46674E = 0;
            this.f46675F = 0;
        }

        public static C0639b C() {
            return C0639b.u();
        }

        public static C0639b D(b bVar) {
            return C().o(bVar);
        }

        public static b w() {
            return f46670I;
        }

        public boolean A() {
            return (this.f46673D & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C0639b g() {
            return C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C0639b d() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f46676G;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f46676G = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f46677H;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f46673D & 1) == 1 ? CodedOutputStream.o(1, this.f46674E) : 0;
            if ((this.f46673D & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f46675F);
            }
            int size = iO + this.f46672C.size();
            this.f46677H = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<b> h() {
            return f46671J;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            if ((this.f46673D & 1) == 1) {
                codedOutputStream.a0(1, this.f46674E);
            }
            if ((this.f46673D & 2) == 2) {
                codedOutputStream.a0(2, this.f46675F);
            }
            codedOutputStream.i0(this.f46672C);
        }

        public int x() {
            return this.f46675F;
        }

        public int y() {
            return this.f46674E;
        }

        public boolean z() {
            return (this.f46673D & 2) == 2;
        }

        private b(h.b bVar) {
            super(bVar);
            this.f46676G = (byte) -1;
            this.f46677H = -1;
            this.f46672C = bVar.n();
        }

        private b(boolean z10) {
            this.f46676G = (byte) -1;
            this.f46677H = -1;
            this.f46672C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f46676G = (byte) -1;
            this.f46677H = -1;
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
                                this.f46673D |= 1;
                                this.f46674E = eVar.s();
                            } else if (iK != 16) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                this.f46673D |= 2;
                                this.f46675F = eVar.s();
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
                        this.f46672C = bVarD.e();
                        throw th2;
                    }
                    this.f46672C = bVarD.e();
                    n();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f46672C = bVarD.e();
                throw th3;
            }
            this.f46672C = bVarD.e();
            n();
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$b$b, reason: collision with other inner class name */
        public static final class C0639b extends h.b<b, C0639b> implements p {

            /* renamed from: C, reason: collision with root package name */
            private int f46678C;

            /* renamed from: D, reason: collision with root package name */
            private int f46679D;

            /* renamed from: E, reason: collision with root package name */
            private int f46680E;

            private C0639b() {
                v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0639b u() {
                return new C0639b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C0639b o(b bVar) {
                if (bVar == b.w()) {
                    return this;
                }
                if (bVar.A()) {
                    C(bVar.y());
                }
                if (bVar.z()) {
                    B(bVar.x());
                }
                p(n().f(bVar.f46672C));
                return this;
            }

            public C0639b B(int i10) {
                this.f46678C |= 2;
                this.f46680E = i10;
                return this;
            }

            public C0639b C(int i10) {
                this.f46678C |= 1;
                this.f46679D = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e() {
                b bVarS = s();
                if (bVarS.b()) {
                    return bVarS;
                }
                throw a.AbstractC0582a.l(bVarS);
            }

            public b s() {
                b bVar = new b(this);
                int i10 = this.f46678C;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f46674E = this.f46679D;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f46675F = this.f46680E;
                bVar.f46673D = i11;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0639b m() {
                return u().o(s());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ob.C4176a.b.C0639b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<ob.a$b> r1 = ob.C4176a.b.f46671J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    ob.a$b r3 = (ob.C4176a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    ob.a$b r4 = (ob.C4176a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ob.C4176a.b.C0639b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):ob.a$b$b");
            }

            private void v() {
            }
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: ob.a$c */
    public static final class c extends h implements p {

        /* renamed from: I, reason: collision with root package name */
        private static final c f46681I;

        /* renamed from: J, reason: collision with root package name */
        public static q<c> f46682J = new C0640a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f46683C;

        /* renamed from: D, reason: collision with root package name */
        private int f46684D;

        /* renamed from: E, reason: collision with root package name */
        private int f46685E;

        /* renamed from: F, reason: collision with root package name */
        private int f46686F;

        /* renamed from: G, reason: collision with root package name */
        private byte f46687G;

        /* renamed from: H, reason: collision with root package name */
        private int f46688H;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$c$a, reason: collision with other inner class name */
        static class C0640a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C0640a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new c(eVar, fVar);
            }
        }

        static {
            c cVar = new c(true);
            f46681I = cVar;
            cVar.B();
        }

        private void B() {
            this.f46685E = 0;
            this.f46686F = 0;
        }

        public static b C() {
            return b.u();
        }

        public static b D(c cVar) {
            return C().o(cVar);
        }

        public static c w() {
            return f46681I;
        }

        public boolean A() {
            return (this.f46684D & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b g() {
            return C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b d() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f46687G;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f46687G = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f46688H;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f46684D & 1) == 1 ? CodedOutputStream.o(1, this.f46685E) : 0;
            if ((this.f46684D & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f46686F);
            }
            int size = iO + this.f46683C.size();
            this.f46688H = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<c> h() {
            return f46682J;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            if ((this.f46684D & 1) == 1) {
                codedOutputStream.a0(1, this.f46685E);
            }
            if ((this.f46684D & 2) == 2) {
                codedOutputStream.a0(2, this.f46686F);
            }
            codedOutputStream.i0(this.f46683C);
        }

        public int x() {
            return this.f46686F;
        }

        public int y() {
            return this.f46685E;
        }

        public boolean z() {
            return (this.f46684D & 2) == 2;
        }

        private c(h.b bVar) {
            super(bVar);
            this.f46687G = (byte) -1;
            this.f46688H = -1;
            this.f46683C = bVar.n();
        }

        private c(boolean z10) {
            this.f46687G = (byte) -1;
            this.f46688H = -1;
            this.f46683C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f46687G = (byte) -1;
            this.f46688H = -1;
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
                                this.f46684D |= 1;
                                this.f46685E = eVar.s();
                            } else if (iK != 16) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                this.f46684D |= 2;
                                this.f46686F = eVar.s();
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
                        this.f46683C = bVarD.e();
                        throw th2;
                    }
                    this.f46683C = bVarD.e();
                    n();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f46683C = bVarD.e();
                throw th3;
            }
            this.f46683C = bVarD.e();
            n();
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$c$b */
        public static final class b extends h.b<c, b> implements p {

            /* renamed from: C, reason: collision with root package name */
            private int f46689C;

            /* renamed from: D, reason: collision with root package name */
            private int f46690D;

            /* renamed from: E, reason: collision with root package name */
            private int f46691E;

            private b() {
                v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b u() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public b o(c cVar) {
                if (cVar == c.w()) {
                    return this;
                }
                if (cVar.A()) {
                    C(cVar.y());
                }
                if (cVar.z()) {
                    B(cVar.x());
                }
                p(n().f(cVar.f46683C));
                return this;
            }

            public b B(int i10) {
                this.f46689C |= 2;
                this.f46691E = i10;
                return this;
            }

            public b C(int i10) {
                this.f46689C |= 1;
                this.f46690D = i10;
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
                int i10 = this.f46689C;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f46685E = this.f46690D;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f46686F = this.f46691E;
                cVar.f46684D = i11;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b m() {
                return u().o(s());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ob.C4176a.c.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<ob.a$c> r1 = ob.C4176a.c.f46682J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    ob.a$c r3 = (ob.C4176a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    ob.a$c r4 = (ob.C4176a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ob.C4176a.c.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):ob.a$c$b");
            }

            private void v() {
            }
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: ob.a$d */
    public static final class d extends h implements p {

        /* renamed from: L, reason: collision with root package name */
        private static final d f46692L;

        /* renamed from: M, reason: collision with root package name */
        public static q<d> f46693M = new C0641a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f46694C;

        /* renamed from: D, reason: collision with root package name */
        private int f46695D;

        /* renamed from: E, reason: collision with root package name */
        private b f46696E;

        /* renamed from: F, reason: collision with root package name */
        private c f46697F;

        /* renamed from: G, reason: collision with root package name */
        private c f46698G;

        /* renamed from: H, reason: collision with root package name */
        private c f46699H;

        /* renamed from: I, reason: collision with root package name */
        private c f46700I;

        /* renamed from: J, reason: collision with root package name */
        private byte f46701J;

        /* renamed from: K, reason: collision with root package name */
        private int f46702K;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$d$a, reason: collision with other inner class name */
        static class C0641a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C0641a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new d(eVar, fVar);
            }
        }

        static {
            d dVar = new d(true);
            f46692L = dVar;
            dVar.K();
        }

        private void K() {
            this.f46696E = b.w();
            this.f46697F = c.w();
            this.f46698G = c.w();
            this.f46699H = c.w();
            this.f46700I = c.w();
        }

        public static b L() {
            return b.u();
        }

        public static b M(d dVar) {
            return L().o(dVar);
        }

        public static d z() {
            return f46692L;
        }

        public c A() {
            return this.f46700I;
        }

        public b B() {
            return this.f46696E;
        }

        public c C() {
            return this.f46698G;
        }

        public c D() {
            return this.f46699H;
        }

        public c E() {
            return this.f46697F;
        }

        public boolean F() {
            return (this.f46695D & 16) == 16;
        }

        public boolean G() {
            return (this.f46695D & 1) == 1;
        }

        public boolean H() {
            return (this.f46695D & 4) == 4;
        }

        public boolean I() {
            return (this.f46695D & 8) == 8;
        }

        public boolean J() {
            return (this.f46695D & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public b g() {
            return L();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public b d() {
            return M(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f46701J;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f46701J = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f46702K;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f46695D & 1) == 1 ? CodedOutputStream.s(1, this.f46696E) : 0;
            if ((this.f46695D & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f46697F);
            }
            if ((this.f46695D & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f46698G);
            }
            if ((this.f46695D & 8) == 8) {
                iS += CodedOutputStream.s(4, this.f46699H);
            }
            if ((this.f46695D & 16) == 16) {
                iS += CodedOutputStream.s(5, this.f46700I);
            }
            int size = iS + this.f46694C.size();
            this.f46702K = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<d> h() {
            return f46693M;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            if ((this.f46695D & 1) == 1) {
                codedOutputStream.d0(1, this.f46696E);
            }
            if ((this.f46695D & 2) == 2) {
                codedOutputStream.d0(2, this.f46697F);
            }
            if ((this.f46695D & 4) == 4) {
                codedOutputStream.d0(3, this.f46698G);
            }
            if ((this.f46695D & 8) == 8) {
                codedOutputStream.d0(4, this.f46699H);
            }
            if ((this.f46695D & 16) == 16) {
                codedOutputStream.d0(5, this.f46700I);
            }
            codedOutputStream.i0(this.f46694C);
        }

        private d(h.b bVar) {
            super(bVar);
            this.f46701J = (byte) -1;
            this.f46702K = -1;
            this.f46694C = bVar.n();
        }

        private d(boolean z10) {
            this.f46701J = (byte) -1;
            this.f46702K = -1;
            this.f46694C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f46701J = (byte) -1;
            this.f46702K = -1;
            K();
            d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                b.C0639b c0639bD = (this.f46695D & 1) == 1 ? this.f46696E.d() : null;
                                b bVar = (b) eVar.u(b.f46671J, fVar);
                                this.f46696E = bVar;
                                if (c0639bD != null) {
                                    c0639bD.o(bVar);
                                    this.f46696E = c0639bD.s();
                                }
                                this.f46695D |= 1;
                            } else if (iK == 18) {
                                c.b bVarD2 = (this.f46695D & 2) == 2 ? this.f46697F.d() : null;
                                c cVar = (c) eVar.u(c.f46682J, fVar);
                                this.f46697F = cVar;
                                if (bVarD2 != null) {
                                    bVarD2.o(cVar);
                                    this.f46697F = bVarD2.s();
                                }
                                this.f46695D |= 2;
                            } else if (iK == 26) {
                                c.b bVarD3 = (this.f46695D & 4) == 4 ? this.f46698G.d() : null;
                                c cVar2 = (c) eVar.u(c.f46682J, fVar);
                                this.f46698G = cVar2;
                                if (bVarD3 != null) {
                                    bVarD3.o(cVar2);
                                    this.f46698G = bVarD3.s();
                                }
                                this.f46695D |= 4;
                            } else if (iK == 34) {
                                c.b bVarD4 = (this.f46695D & 8) == 8 ? this.f46699H.d() : null;
                                c cVar3 = (c) eVar.u(c.f46682J, fVar);
                                this.f46699H = cVar3;
                                if (bVarD4 != null) {
                                    bVarD4.o(cVar3);
                                    this.f46699H = bVarD4.s();
                                }
                                this.f46695D |= 8;
                            } else if (iK != 42) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                c.b bVarD5 = (this.f46695D & 16) == 16 ? this.f46700I.d() : null;
                                c cVar4 = (c) eVar.u(c.f46682J, fVar);
                                this.f46700I = cVar4;
                                if (bVarD5 != null) {
                                    bVarD5.o(cVar4);
                                    this.f46700I = bVarD5.s();
                                }
                                this.f46695D |= 16;
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
                        this.f46694C = bVarD.e();
                        throw th2;
                    }
                    this.f46694C = bVarD.e();
                    n();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f46694C = bVarD.e();
                throw th3;
            }
            this.f46694C = bVarD.e();
            n();
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: ob.a$d$b */
        public static final class b extends h.b<d, b> implements p {

            /* renamed from: C, reason: collision with root package name */
            private int f46703C;

            /* renamed from: D, reason: collision with root package name */
            private b f46704D = b.w();

            /* renamed from: E, reason: collision with root package name */
            private c f46705E = c.w();

            /* renamed from: F, reason: collision with root package name */
            private c f46706F = c.w();

            /* renamed from: G, reason: collision with root package name */
            private c f46707G = c.w();

            /* renamed from: H, reason: collision with root package name */
            private c f46708H = c.w();

            private b() {
                v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b u() {
                return new b();
            }

            public b A(b bVar) {
                if ((this.f46703C & 1) != 1 || this.f46704D == b.w()) {
                    this.f46704D = bVar;
                } else {
                    this.f46704D = b.D(this.f46704D).o(bVar).s();
                }
                this.f46703C |= 1;
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ob.C4176a.d.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<ob.a$d> r1 = ob.C4176a.d.f46693M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    ob.a$d r3 = (ob.C4176a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    ob.a$d r4 = (ob.C4176a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: ob.C4176a.d.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):ob.a$d$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o(d dVar) {
                if (dVar == d.z()) {
                    return this;
                }
                if (dVar.G()) {
                    A(dVar.B());
                }
                if (dVar.J()) {
                    F(dVar.E());
                }
                if (dVar.H()) {
                    D(dVar.C());
                }
                if (dVar.I()) {
                    E(dVar.D());
                }
                if (dVar.F()) {
                    w(dVar.A());
                }
                p(n().f(dVar.f46694C));
                return this;
            }

            public b D(c cVar) {
                if ((this.f46703C & 4) != 4 || this.f46706F == c.w()) {
                    this.f46706F = cVar;
                } else {
                    this.f46706F = c.D(this.f46706F).o(cVar).s();
                }
                this.f46703C |= 4;
                return this;
            }

            public b E(c cVar) {
                if ((this.f46703C & 8) != 8 || this.f46707G == c.w()) {
                    this.f46707G = cVar;
                } else {
                    this.f46707G = c.D(this.f46707G).o(cVar).s();
                }
                this.f46703C |= 8;
                return this;
            }

            public b F(c cVar) {
                if ((this.f46703C & 2) != 2 || this.f46705E == c.w()) {
                    this.f46705E = cVar;
                } else {
                    this.f46705E = c.D(this.f46705E).o(cVar).s();
                }
                this.f46703C |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public d e() {
                d dVarS = s();
                if (dVarS.b()) {
                    return dVarS;
                }
                throw a.AbstractC0582a.l(dVarS);
            }

            public d s() {
                d dVar = new d(this);
                int i10 = this.f46703C;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f46696E = this.f46704D;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f46697F = this.f46705E;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f46698G = this.f46706F;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f46699H = this.f46707G;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f46700I = this.f46708H;
                dVar.f46695D = i11;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b m() {
                return u().o(s());
            }

            public b w(c cVar) {
                if ((this.f46703C & 16) != 16 || this.f46708H == c.w()) {
                    this.f46708H = cVar;
                } else {
                    this.f46708H = c.D(this.f46708H).o(cVar).s();
                }
                this.f46703C |= 16;
                return this;
            }

            private void v() {
            }
        }
    }
}
