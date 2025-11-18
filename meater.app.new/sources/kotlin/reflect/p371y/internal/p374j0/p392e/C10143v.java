package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10743b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10746e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.v */
/* loaded from: classes3.dex */
public final class C10143v extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10143v f39120g;

    /* renamed from: h */
    public static InterfaceC10758q<C10143v> f39121h = new a();

    /* renamed from: i */
    private final AbstractC10745d f39122i;

    /* renamed from: j */
    private int f39123j;

    /* renamed from: k */
    private int f39124k;

    /* renamed from: l */
    private int f39125l;

    /* renamed from: m */
    private c f39126m;

    /* renamed from: n */
    private int f39127n;

    /* renamed from: o */
    private int f39128o;

    /* renamed from: p */
    private d f39129p;

    /* renamed from: q */
    private byte f39130q;

    /* renamed from: r */
    private int f39131r;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.v$a */
    static class a extends AbstractC10743b<C10143v> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10143v mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10143v(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.v$b */
    public static final class b extends AbstractC10749h.b<C10143v, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f39132g;

        /* renamed from: h */
        private int f39133h;

        /* renamed from: i */
        private int f39134i;

        /* renamed from: k */
        private int f39136k;

        /* renamed from: l */
        private int f39137l;

        /* renamed from: j */
        private c f39135j = c.ERROR;

        /* renamed from: m */
        private d f39138m = d.LANGUAGE_VERSION;

        private b() {
            m35315t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m35314s() {
            return new b();
        }

        /* renamed from: t */
        private void m35315t() {
        }

        /* renamed from: A */
        public b m35316A(c cVar) {
            cVar.getClass();
            this.f39132g |= 4;
            this.f39135j = cVar;
            return this;
        }

        /* renamed from: B */
        public b m35317B(int i2) {
            this.f39132g |= 16;
            this.f39137l = i2;
            return this;
        }

        /* renamed from: C */
        public b m35318C(int i2) {
            this.f39132g |= 1;
            this.f39133h = i2;
            return this;
        }

        /* renamed from: D */
        public b m35319D(int i2) {
            this.f39132g |= 2;
            this.f39134i = i2;
            return this;
        }

        /* renamed from: E */
        public b m35320E(d dVar) {
            dVar.getClass();
            this.f39132g |= 32;
            this.f39138m = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10143v mo34093c() {
            C10143v c10143vM35322q = m35322q();
            if (c10143vM35322q.isInitialized()) {
                return c10143vM35322q;
            }
            throw AbstractC10742a.a.m38257j(c10143vM35322q);
        }

        /* renamed from: q */
        public C10143v m35322q() {
            C10143v c10143v = new C10143v(this);
            int i2 = this.f39132g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10143v.f39124k = this.f39133h;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10143v.f39125l = this.f39134i;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10143v.f39126m = this.f39135j;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10143v.f39127n = this.f39136k;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            c10143v.f39128o = this.f39137l;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            c10143v.f39129p = this.f39138m;
            c10143v.f39123j = i3;
            return c10143v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35314s().mo34096m(m35322q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10143v c10143v) {
            if (c10143v == C10143v.m35297z()) {
                return this;
            }
            if (c10143v.m35307J()) {
                m35318C(c10143v.m35301D());
            }
            if (c10143v.m35308K()) {
                m35319D(c10143v.m35302E());
            }
            if (c10143v.m35305H()) {
                m35316A(c10143v.m35299B());
            }
            if (c10143v.m35304G()) {
                m35326w(c10143v.m35298A());
            }
            if (c10143v.m35306I()) {
                m35317B(c10143v.m35300C());
            }
            if (c10143v.m35309L()) {
                m35320E(c10143v.m35303F());
            }
            m38392n(m38391l().m38286f(c10143v.f39122i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10143v.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.v> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10143v.f39121h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.v r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10143v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.mo34096m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m38252a()     // Catch: java.lang.Throwable -> Lf
                kotlin.f0.y.e.j0.e.v r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10143v) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.mo34096m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10143v.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.v$b");
        }

        /* renamed from: w */
        public b m35326w(int i2) {
            this.f39132g |= 8;
            this.f39136k = i2;
            return this;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.v$c */
    public enum c implements C10750i.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* renamed from: i */
        private static C10750i.b<c> f39142i = new a();

        /* renamed from: k */
        private final int f39144k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.v$c$a */
        static class a implements C10750i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m35327g(i2);
            }
        }

        c(int i2, int i3) {
            this.f39144k = i3;
        }

        /* renamed from: g */
        public static c m35327g(int i2) {
            if (i2 == 0) {
                return WARNING;
            }
            if (i2 == 1) {
                return ERROR;
            }
            if (i2 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f39144k;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.v$d */
    public enum d implements C10750i.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* renamed from: i */
        private static C10750i.b<d> f39148i = new a();

        /* renamed from: k */
        private final int f39150k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.v$d$a */
        static class a implements C10750i.b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo34236a(int i2) {
                return d.m35329g(i2);
            }
        }

        d(int i2, int i3) {
            this.f39150k = i3;
        }

        /* renamed from: g */
        public static d m35329g(int i2) {
            if (i2 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i2 == 1) {
                return COMPILER_VERSION;
            }
            if (i2 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f39150k;
        }
    }

    static {
        C10143v c10143v = new C10143v(true);
        f39120g = c10143v;
        c10143v.m35286M();
    }

    /* renamed from: M */
    private void m35286M() {
        this.f39124k = 0;
        this.f39125l = 0;
        this.f39126m = c.ERROR;
        this.f39127n = 0;
        this.f39128o = 0;
        this.f39129p = d.LANGUAGE_VERSION;
    }

    /* renamed from: N */
    public static b m35287N() {
        return b.m35314s();
    }

    /* renamed from: O */
    public static b m35288O(C10143v c10143v) {
        return m35287N().mo34096m(c10143v);
    }

    /* renamed from: z */
    public static C10143v m35297z() {
        return f39120g;
    }

    /* renamed from: A */
    public int m35298A() {
        return this.f39127n;
    }

    /* renamed from: B */
    public c m35299B() {
        return this.f39126m;
    }

    /* renamed from: C */
    public int m35300C() {
        return this.f39128o;
    }

    /* renamed from: D */
    public int m35301D() {
        return this.f39124k;
    }

    /* renamed from: E */
    public int m35302E() {
        return this.f39125l;
    }

    /* renamed from: F */
    public d m35303F() {
        return this.f39129p;
    }

    /* renamed from: G */
    public boolean m35304G() {
        return (this.f39123j & 8) == 8;
    }

    /* renamed from: H */
    public boolean m35305H() {
        return (this.f39123j & 4) == 4;
    }

    /* renamed from: I */
    public boolean m35306I() {
        return (this.f39123j & 16) == 16;
    }

    /* renamed from: J */
    public boolean m35307J() {
        return (this.f39123j & 1) == 1;
    }

    /* renamed from: K */
    public boolean m35308K() {
        return (this.f39123j & 2) == 2;
    }

    /* renamed from: L */
    public boolean m35309L() {
        return (this.f39123j & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35287N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35288O(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39131r;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f39123j & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f39124k) : 0;
        if ((this.f39123j & 2) == 2) {
            iM38189o += CodedOutputStream.m38189o(2, this.f39125l);
        }
        if ((this.f39123j & 4) == 4) {
            iM38189o += CodedOutputStream.m38182h(3, this.f39126m.mo34235f());
        }
        if ((this.f39123j & 8) == 8) {
            iM38189o += CodedOutputStream.m38189o(4, this.f39127n);
        }
        if ((this.f39123j & 16) == 16) {
            iM38189o += CodedOutputStream.m38189o(5, this.f39128o);
        }
        if ((this.f39123j & 32) == 32) {
            iM38189o += CodedOutputStream.m38182h(6, this.f39129p.mo34235f());
        }
        int size = iM38189o + this.f39122i.size();
        this.f39131r = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10143v> mo34080g() {
        return f39121h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        if ((this.f39123j & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f39124k);
        }
        if ((this.f39123j & 2) == 2) {
            codedOutputStream.m38217a0(2, this.f39125l);
        }
        if ((this.f39123j & 4) == 4) {
            codedOutputStream.m38209S(3, this.f39126m.mo34235f());
        }
        if ((this.f39123j & 8) == 8) {
            codedOutputStream.m38217a0(4, this.f39127n);
        }
        if ((this.f39123j & 16) == 16) {
            codedOutputStream.m38217a0(5, this.f39128o);
        }
        if ((this.f39123j & 32) == 32) {
            codedOutputStream.m38209S(6, this.f39129p.mo34235f());
        }
        codedOutputStream.m38225i0(this.f39122i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f39130q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f39130q = (byte) 1;
        return true;
    }

    private C10143v(AbstractC10749h.b bVar) {
        super(bVar);
        this.f39130q = (byte) -1;
        this.f39131r = -1;
        this.f39122i = bVar.m38391l();
    }

    private C10143v(boolean z) {
        this.f39130q = (byte) -1;
        this.f39131r = -1;
        this.f39122i = AbstractC10745d.f41263f;
    }

    private C10143v(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f39130q = (byte) -1;
        this.f39131r = -1;
        m35286M();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM38320K = c10746e.m38320K();
                    if (iM38320K != 0) {
                        if (iM38320K == 8) {
                            this.f39123j |= 1;
                            this.f39124k = c10746e.m38339s();
                        } else if (iM38320K == 16) {
                            this.f39123j |= 2;
                            this.f39125l = c10746e.m38339s();
                        } else if (iM38320K == 24) {
                            int iM38334n = c10746e.m38334n();
                            c cVarM35327g = c.m35327g(iM38334n);
                            if (cVarM35327g == null) {
                                codedOutputStreamM38173J.m38231o0(iM38320K);
                                codedOutputStreamM38173J.m38231o0(iM38334n);
                            } else {
                                this.f39123j |= 4;
                                this.f39126m = cVarM35327g;
                            }
                        } else if (iM38320K == 32) {
                            this.f39123j |= 8;
                            this.f39127n = c10746e.m38339s();
                        } else if (iM38320K == 40) {
                            this.f39123j |= 16;
                            this.f39128o = c10746e.m38339s();
                        } else if (iM38320K != 48) {
                            if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                            }
                        } else {
                            int iM38334n2 = c10746e.m38334n();
                            d dVarM35329g = d.m35329g(iM38334n2);
                            if (dVarM35329g == null) {
                                codedOutputStreamM38173J.m38231o0(iM38320K);
                                codedOutputStreamM38173J.m38231o0(iM38334n2);
                            } else {
                                this.f39123j |= 32;
                                this.f39129p = dVarM35329g;
                            }
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.m38253i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                }
            } catch (Throwable th) {
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f39122i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f39122i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39122i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f39122i = bVarM38280w.m38299e();
        mo38389m();
    }
}
