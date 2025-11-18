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
/* renamed from: lb.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3935o extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: G, reason: collision with root package name */
    private static final C3935o f44815G;

    /* renamed from: H, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3935o> f44816H = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44817C;

    /* renamed from: D, reason: collision with root package name */
    private List<c> f44818D;

    /* renamed from: E, reason: collision with root package name */
    private byte f44819E;

    /* renamed from: F, reason: collision with root package name */
    private int f44820F;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.o$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3935o> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3935o b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3935o(eVar, fVar);
        }
    }

    static {
        C3935o c3935o = new C3935o(true);
        f44815G = c3935o;
        c3935o.y();
    }

    public static b A(C3935o c3935o) {
        return z().o(c3935o);
    }

    public static C3935o v() {
        return f44815G;
    }

    private void y() {
        this.f44818D = Collections.emptyList();
    }

    public static b z() {
        return b.u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b g() {
        return z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b d() {
        return A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44819E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).b()) {
                this.f44819E = (byte) 0;
                return false;
            }
        }
        this.f44819E = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44820F;
        if (i10 != -1) {
            return i10;
        }
        int iS = 0;
        for (int i11 = 0; i11 < this.f44818D.size(); i11++) {
            iS += CodedOutputStream.s(1, this.f44818D.get(i11));
        }
        int size = iS + this.f44817C.size();
        this.f44820F = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3935o> h() {
        return f44816H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        for (int i10 = 0; i10 < this.f44818D.size(); i10++) {
            codedOutputStream.d0(1, this.f44818D.get(i10));
        }
        codedOutputStream.i0(this.f44817C);
    }

    public c w(int i10) {
        return this.f44818D.get(i10);
    }

    public int x() {
        return this.f44818D.size();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.o$c */
    public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: J, reason: collision with root package name */
        private static final c f44823J;

        /* renamed from: K, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f44824K = new a();

        /* renamed from: C, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f44825C;

        /* renamed from: D, reason: collision with root package name */
        private int f44826D;

        /* renamed from: E, reason: collision with root package name */
        private int f44827E;

        /* renamed from: F, reason: collision with root package name */
        private int f44828F;

        /* renamed from: G, reason: collision with root package name */
        private EnumC0600c f44829G;

        /* renamed from: H, reason: collision with root package name */
        private byte f44830H;

        /* renamed from: I, reason: collision with root package name */
        private int f44831I;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.o$c$a */
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
        /* renamed from: lb.o$c$c, reason: collision with other inner class name */
        public enum EnumC0600c implements i.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* renamed from: F, reason: collision with root package name */
            private static i.b<EnumC0600c> f44839F = new a();

            /* renamed from: B, reason: collision with root package name */
            private final int f44841B;

            /* compiled from: ProtoBuf.java */
            /* renamed from: lb.o$c$c$a */
            static class a implements i.b<EnumC0600c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0600c a(int i10) {
                    return EnumC0600c.c(i10);
                }
            }

            EnumC0600c(int i10, int i11) {
                this.f44841B = i11;
            }

            public static EnumC0600c c(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int e() {
                return this.f44841B;
            }
        }

        static {
            c cVar = new c(true);
            f44823J = cVar;
            cVar.E();
        }

        private void E() {
            this.f44827E = -1;
            this.f44828F = 0;
            this.f44829G = EnumC0600c.PACKAGE;
        }

        public static b F() {
            return b.u();
        }

        public static b G(c cVar) {
            return F().o(cVar);
        }

        public static c x() {
            return f44823J;
        }

        public int A() {
            return this.f44828F;
        }

        public boolean B() {
            return (this.f44826D & 4) == 4;
        }

        public boolean C() {
            return (this.f44826D & 1) == 1;
        }

        public boolean D() {
            return (this.f44826D & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public b g() {
            return F();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public b d() {
            return G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean b() {
            byte b10 = this.f44830H;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (D()) {
                this.f44830H = (byte) 1;
                return true;
            }
            this.f44830H = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int f() {
            int i10 = this.f44831I;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f44826D & 1) == 1 ? CodedOutputStream.o(1, this.f44827E) : 0;
            if ((this.f44826D & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f44828F);
            }
            if ((this.f44826D & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f44829G.e());
            }
            int size = iO + this.f44825C.size();
            this.f44831I = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<c> h() {
            return f44824K;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void i(CodedOutputStream codedOutputStream) throws IOException {
            f();
            if ((this.f44826D & 1) == 1) {
                codedOutputStream.a0(1, this.f44827E);
            }
            if ((this.f44826D & 2) == 2) {
                codedOutputStream.a0(2, this.f44828F);
            }
            if ((this.f44826D & 4) == 4) {
                codedOutputStream.S(3, this.f44829G.e());
            }
            codedOutputStream.i0(this.f44825C);
        }

        public EnumC0600c y() {
            return this.f44829G;
        }

        public int z() {
            return this.f44827E;
        }

        private c(h.b bVar) {
            super(bVar);
            this.f44830H = (byte) -1;
            this.f44831I = -1;
            this.f44825C = bVar.n();
        }

        private c(boolean z10) {
            this.f44830H = (byte) -1;
            this.f44831I = -1;
            this.f44825C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f44830H = (byte) -1;
            this.f44831I = -1;
            E();
            d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f44826D |= 1;
                                    this.f44827E = eVar.s();
                                } else if (iK == 16) {
                                    this.f44826D |= 2;
                                    this.f44828F = eVar.s();
                                } else if (iK != 24) {
                                    if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                    }
                                } else {
                                    int iN = eVar.n();
                                    EnumC0600c enumC0600cC = EnumC0600c.c(iN);
                                    if (enumC0600cC == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f44826D |= 4;
                                        this.f44829G = enumC0600cC;
                                    }
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
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f44825C = bVarD.e();
                        throw th2;
                    }
                    this.f44825C = bVarD.e();
                    n();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f44825C = bVarD.e();
                throw th3;
            }
            this.f44825C = bVarD.e();
            n();
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.o$c$b */
        public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

            /* renamed from: C, reason: collision with root package name */
            private int f44832C;

            /* renamed from: E, reason: collision with root package name */
            private int f44834E;

            /* renamed from: D, reason: collision with root package name */
            private int f44833D = -1;

            /* renamed from: F, reason: collision with root package name */
            private EnumC0600c f44835F = EnumC0600c.PACKAGE;

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
                if (cVar == c.x()) {
                    return this;
                }
                if (cVar.C()) {
                    C(cVar.z());
                }
                if (cVar.D()) {
                    D(cVar.A());
                }
                if (cVar.B()) {
                    B(cVar.y());
                }
                p(n().f(cVar.f44825C));
                return this;
            }

            public b B(EnumC0600c enumC0600c) {
                enumC0600c.getClass();
                this.f44832C |= 4;
                this.f44835F = enumC0600c;
                return this;
            }

            public b C(int i10) {
                this.f44832C |= 1;
                this.f44833D = i10;
                return this;
            }

            public b D(int i10) {
                this.f44832C |= 2;
                this.f44834E = i10;
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
                int i10 = this.f44832C;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f44827E = this.f44833D;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f44828F = this.f44834E;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f44829G = this.f44835F;
                cVar.f44826D = i11;
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
            public lb.C3935o.c.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<lb.o$c> r1 = lb.C3935o.c.f44824K     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    lb.o$c r3 = (lb.C3935o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    lb.o$c r4 = (lb.C3935o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: lb.C3935o.c.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.o$c$b");
            }

            private void v() {
            }
        }
    }

    private C3935o(h.b bVar) {
        super(bVar);
        this.f44819E = (byte) -1;
        this.f44820F = -1;
        this.f44817C = bVar.n();
    }

    private C3935o(boolean z10) {
        this.f44819E = (byte) -1;
        this.f44820F = -1;
        this.f44817C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3935o(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44819E = (byte) -1;
        this.f44820F = -1;
        y();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK != 10) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.f44818D = new ArrayList();
                                    z11 = true;
                                }
                                this.f44818D.add(eVar.u(c.f44824K, fVar));
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
                if (z11) {
                    this.f44818D = Collections.unmodifiableList(this.f44818D);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44817C = bVarD.e();
                    throw th2;
                }
                this.f44817C = bVarD.e();
                n();
                throw th;
            }
        }
        if (z11) {
            this.f44818D = Collections.unmodifiableList(this.f44818D);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44817C = bVarD.e();
            throw th3;
        }
        this.f44817C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.o$b */
    public static final class b extends h.b<C3935o, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44821C;

        /* renamed from: D, reason: collision with root package name */
        private List<c> f44822D = Collections.emptyList();

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f44821C & 1) != 1) {
                this.f44822D = new ArrayList(this.f44822D);
                this.f44821C |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3935o.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.o> r1 = lb.C3935o.f44816H     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.o r3 = (lb.C3935o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.o r4 = (lb.C3935o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3935o.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.o$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b o(C3935o c3935o) {
            if (c3935o == C3935o.v()) {
                return this;
            }
            if (!c3935o.f44818D.isEmpty()) {
                if (this.f44822D.isEmpty()) {
                    this.f44822D = c3935o.f44818D;
                    this.f44821C &= -2;
                } else {
                    v();
                    this.f44822D.addAll(c3935o.f44818D);
                }
            }
            p(n().f(c3935o.f44817C));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3935o e() {
            C3935o c3935oS = s();
            if (c3935oS.b()) {
                return c3935oS;
            }
            throw a.AbstractC0582a.l(c3935oS);
        }

        public C3935o s() {
            C3935o c3935o = new C3935o(this);
            if ((this.f44821C & 1) == 1) {
                this.f44822D = Collections.unmodifiableList(this.f44822D);
                this.f44821C &= -2;
            }
            c3935o.f44818D = this.f44822D;
            return c3935o;
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
