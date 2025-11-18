package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10743b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10746e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.u */
/* loaded from: classes3.dex */
public final class C10142u extends AbstractC10749h.d<C10142u> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10142u f39101h;

    /* renamed from: i */
    public static InterfaceC10758q<C10142u> f39102i = new a();

    /* renamed from: j */
    private final AbstractC10745d f39103j;

    /* renamed from: k */
    private int f39104k;

    /* renamed from: l */
    private int f39105l;

    /* renamed from: m */
    private int f39106m;

    /* renamed from: n */
    private C10138q f39107n;

    /* renamed from: o */
    private int f39108o;

    /* renamed from: p */
    private C10138q f39109p;

    /* renamed from: q */
    private int f39110q;

    /* renamed from: r */
    private byte f39111r;

    /* renamed from: s */
    private int f39112s;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.u$a */
    static class a extends AbstractC10743b<C10142u> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10142u mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10142u(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.u$b */
    public static final class b extends AbstractC10749h.c<C10142u, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f39113i;

        /* renamed from: j */
        private int f39114j;

        /* renamed from: k */
        private int f39115k;

        /* renamed from: m */
        private int f39117m;

        /* renamed from: o */
        private int f39119o;

        /* renamed from: l */
        private C10138q f39116l = C10138q.m35022Y();

        /* renamed from: n */
        private C10138q f39118n = C10138q.m35022Y();

        private b() {
            m35272A();
        }

        /* renamed from: A */
        private void m35272A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m35274w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10142u c10142u) {
            if (c10142u == C10142u.m35252I()) {
                return this;
            }
            if (c10142u.m35263Q()) {
                m35279F(c10142u.m35257K());
            }
            if (c10142u.m35264R()) {
                m35280G(c10142u.m35258L());
            }
            if (c10142u.m35265S()) {
                m35277D(c10142u.m35259M());
            }
            if (c10142u.m35266T()) {
                m35281H(c10142u.m35260N());
            }
            if (c10142u.m35267U()) {
                m35278E(c10142u.m35261O());
            }
            if (c10142u.m35268V()) {
                m35282I(c10142u.m35262P());
            }
            m38396r(c10142u);
            m38392n(m38391l().m38286f(c10142u.f39103j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10142u.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.u> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10142u.f39102i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.u r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10142u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.u r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10142u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10142u.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.u$b");
        }

        /* renamed from: D */
        public b m35277D(C10138q c10138q) {
            if ((this.f39113i & 4) != 4 || this.f39116l == C10138q.m35022Y()) {
                this.f39116l = c10138q;
            } else {
                this.f39116l = C10138q.m35025z0(this.f39116l).mo34096m(c10138q).m35110u();
            }
            this.f39113i |= 4;
            return this;
        }

        /* renamed from: E */
        public b m35278E(C10138q c10138q) {
            if ((this.f39113i & 16) != 16 || this.f39118n == C10138q.m35022Y()) {
                this.f39118n = c10138q;
            } else {
                this.f39118n = C10138q.m35025z0(this.f39118n).mo34096m(c10138q).m35110u();
            }
            this.f39113i |= 16;
            return this;
        }

        /* renamed from: F */
        public b m35279F(int i2) {
            this.f39113i |= 1;
            this.f39114j = i2;
            return this;
        }

        /* renamed from: G */
        public b m35280G(int i2) {
            this.f39113i |= 2;
            this.f39115k = i2;
            return this;
        }

        /* renamed from: H */
        public b m35281H(int i2) {
            this.f39113i |= 8;
            this.f39117m = i2;
            return this;
        }

        /* renamed from: I */
        public b m35282I(int i2) {
            this.f39113i |= 32;
            this.f39119o = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10142u mo34093c() {
            C10142u c10142uM35284u = m35284u();
            if (c10142uM35284u.isInitialized()) {
                return c10142uM35284u;
            }
            throw AbstractC10742a.a.m38257j(c10142uM35284u);
        }

        /* renamed from: u */
        public C10142u m35284u() {
            C10142u c10142u = new C10142u(this);
            int i2 = this.f39113i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10142u.f39105l = this.f39114j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10142u.f39106m = this.f39115k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10142u.f39107n = this.f39116l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10142u.f39108o = this.f39117m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            c10142u.f39109p = this.f39118n;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            c10142u.f39110q = this.f39119o;
            c10142u.f39104k = i3;
            return c10142u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35274w().mo34096m(m35284u());
        }
    }

    static {
        C10142u c10142u = new C10142u(true);
        f39101h = c10142u;
        c10142u.m35253X();
    }

    /* renamed from: I */
    public static C10142u m35252I() {
        return f39101h;
    }

    /* renamed from: X */
    private void m35253X() {
        this.f39105l = 0;
        this.f39106m = 0;
        this.f39107n = C10138q.m35022Y();
        this.f39108o = 0;
        this.f39109p = C10138q.m35022Y();
        this.f39110q = 0;
    }

    /* renamed from: Y */
    public static b m35254Y() {
        return b.m35274w();
    }

    /* renamed from: Z */
    public static b m35255Z(C10142u c10142u) {
        return m35254Y().mo34096m(c10142u);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C10142u mo34461b() {
        return f39101h;
    }

    /* renamed from: K */
    public int m35257K() {
        return this.f39105l;
    }

    /* renamed from: L */
    public int m35258L() {
        return this.f39106m;
    }

    /* renamed from: M */
    public C10138q m35259M() {
        return this.f39107n;
    }

    /* renamed from: N */
    public int m35260N() {
        return this.f39108o;
    }

    /* renamed from: O */
    public C10138q m35261O() {
        return this.f39109p;
    }

    /* renamed from: P */
    public int m35262P() {
        return this.f39110q;
    }

    /* renamed from: Q */
    public boolean m35263Q() {
        return (this.f39104k & 1) == 1;
    }

    /* renamed from: R */
    public boolean m35264R() {
        return (this.f39104k & 2) == 2;
    }

    /* renamed from: S */
    public boolean m35265S() {
        return (this.f39104k & 4) == 4;
    }

    /* renamed from: T */
    public boolean m35266T() {
        return (this.f39104k & 8) == 8;
    }

    /* renamed from: U */
    public boolean m35267U() {
        return (this.f39104k & 16) == 16;
    }

    /* renamed from: V */
    public boolean m35268V() {
        return (this.f39104k & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35254Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35255Z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39112s;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f39104k & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f39105l) : 0;
        if ((this.f39104k & 2) == 2) {
            iM38189o += CodedOutputStream.m38189o(2, this.f39106m);
        }
        if ((this.f39104k & 4) == 4) {
            iM38189o += CodedOutputStream.m38193s(3, this.f39107n);
        }
        if ((this.f39104k & 16) == 16) {
            iM38189o += CodedOutputStream.m38193s(4, this.f39109p);
        }
        if ((this.f39104k & 8) == 8) {
            iM38189o += CodedOutputStream.m38189o(5, this.f39108o);
        }
        if ((this.f39104k & 32) == 32) {
            iM38189o += CodedOutputStream.m38189o(6, this.f39110q);
        }
        int iM38400t = iM38189o + m38400t() + this.f39103j.size();
        this.f39112s = iM38400t;
        return iM38400t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10142u> mo34080g() {
        return f39102i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f39104k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f39105l);
        }
        if ((this.f39104k & 2) == 2) {
            codedOutputStream.m38217a0(2, this.f39106m);
        }
        if ((this.f39104k & 4) == 4) {
            codedOutputStream.m38220d0(3, this.f39107n);
        }
        if ((this.f39104k & 16) == 16) {
            codedOutputStream.m38220d0(4, this.f39109p);
        }
        if ((this.f39104k & 8) == 8) {
            codedOutputStream.m38217a0(5, this.f39108o);
        }
        if ((this.f39104k & 32) == 32) {
            codedOutputStream.m38217a0(6, this.f39110q);
        }
        aVarM38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f39103j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f39111r;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m35264R()) {
            this.f39111r = (byte) 0;
            return false;
        }
        if (m35265S() && !m35259M().isInitialized()) {
            this.f39111r = (byte) 0;
            return false;
        }
        if (m35267U() && !m35261O().isInitialized()) {
            this.f39111r = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f39111r = (byte) 1;
            return true;
        }
        this.f39111r = (byte) 0;
        return false;
    }

    private C10142u(AbstractC10749h.c<C10142u, ?> cVar) {
        super(cVar);
        this.f39111r = (byte) -1;
        this.f39112s = -1;
        this.f39103j = cVar.m38391l();
    }

    private C10142u(boolean z) {
        this.f39111r = (byte) -1;
        this.f39112s = -1;
        this.f39103j = AbstractC10745d.f41263f;
    }

    private C10142u(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        C10138q.c cVarMo34077d;
        this.f39111r = (byte) -1;
        this.f39112s = -1;
        m35253X();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 8) {
                                this.f39104k |= 1;
                                this.f39105l = c10746e.m38339s();
                            } else if (iM38320K != 16) {
                                if (iM38320K == 26) {
                                    cVarMo34077d = (this.f39104k & 4) == 4 ? this.f39107n.mo34077d() : null;
                                    C10138q c10138q = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f39107n = c10138q;
                                    if (cVarMo34077d != null) {
                                        cVarMo34077d.mo34096m(c10138q);
                                        this.f39107n = cVarMo34077d.m35110u();
                                    }
                                    this.f39104k |= 4;
                                } else if (iM38320K == 34) {
                                    cVarMo34077d = (this.f39104k & 16) == 16 ? this.f39109p.mo34077d() : null;
                                    C10138q c10138q2 = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f39109p = c10138q2;
                                    if (cVarMo34077d != null) {
                                        cVarMo34077d.mo34096m(c10138q2);
                                        this.f39109p = cVarMo34077d.m35110u();
                                    }
                                    this.f39104k |= 16;
                                } else if (iM38320K == 40) {
                                    this.f39104k |= 8;
                                    this.f39108o = c10746e.m38339s();
                                } else if (iM38320K != 48) {
                                    if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                    }
                                } else {
                                    this.f39104k |= 32;
                                    this.f39110q = c10746e.m38339s();
                                }
                            } else {
                                this.f39104k |= 2;
                                this.f39106m = c10746e.m38339s();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.m38253i(this);
                    }
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                }
            } catch (Throwable th) {
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f39103j = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f39103j = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39103j = bVarM38280w.m38299e();
            throw th3;
        }
        this.f39103j = bVarM38280w.m38299e();
        mo38389m();
    }
}
