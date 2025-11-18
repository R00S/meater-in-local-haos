package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
/* renamed from: kotlin.f0.y.e.j0.e.s */
/* loaded from: classes3.dex */
public final class C10140s extends AbstractC10749h.d<C10140s> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10140s f39064h;

    /* renamed from: i */
    public static InterfaceC10758q<C10140s> f39065i = new a();

    /* renamed from: j */
    private final AbstractC10745d f39066j;

    /* renamed from: k */
    private int f39067k;

    /* renamed from: l */
    private int f39068l;

    /* renamed from: m */
    private int f39069m;

    /* renamed from: n */
    private boolean f39070n;

    /* renamed from: o */
    private c f39071o;

    /* renamed from: p */
    private List<C10138q> f39072p;

    /* renamed from: q */
    private List<Integer> f39073q;

    /* renamed from: r */
    private int f39074r;

    /* renamed from: s */
    private byte f39075s;

    /* renamed from: t */
    private int f39076t;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.s$a */
    static class a extends AbstractC10743b<C10140s> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10140s mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10140s(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.s$b */
    public static final class b extends AbstractC10749h.c<C10140s, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f39077i;

        /* renamed from: j */
        private int f39078j;

        /* renamed from: k */
        private int f39079k;

        /* renamed from: l */
        private boolean f39080l;

        /* renamed from: m */
        private c f39081m = c.INV;

        /* renamed from: n */
        private List<C10138q> f39082n = Collections.emptyList();

        /* renamed from: o */
        private List<Integer> f39083o = Collections.emptyList();

        private b() {
            m35203C();
        }

        /* renamed from: A */
        private void m35201A() {
            if ((this.f39077i & 32) != 32) {
                this.f39083o = new ArrayList(this.f39083o);
                this.f39077i |= 32;
            }
        }

        /* renamed from: B */
        private void m35202B() {
            if ((this.f39077i & 16) != 16) {
                this.f39082n = new ArrayList(this.f39082n);
                this.f39077i |= 16;
            }
        }

        /* renamed from: C */
        private void m35203C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m35205w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10140s c10140s) {
            if (c10140s == C10140s.m35181K()) {
                return this;
            }
            if (c10140s.m35194U()) {
                m35208F(c10140s.m35186M());
            }
            if (c10140s.m35195V()) {
                m35209G(c10140s.m35187N());
            }
            if (c10140s.m35196X()) {
                m35210H(c10140s.m35188O());
            }
            if (c10140s.m35197Y()) {
                m35211I(c10140s.m35193T());
            }
            if (!c10140s.f39072p.isEmpty()) {
                if (this.f39082n.isEmpty()) {
                    this.f39082n = c10140s.f39072p;
                    this.f39077i &= -17;
                } else {
                    m35202B();
                    this.f39082n.addAll(c10140s.f39072p);
                }
            }
            if (!c10140s.f39073q.isEmpty()) {
                if (this.f39083o.isEmpty()) {
                    this.f39083o = c10140s.f39073q;
                    this.f39077i &= -33;
                } else {
                    m35201A();
                    this.f39083o.addAll(c10140s.f39073q);
                }
            }
            m38396r(c10140s);
            m38392n(m38391l().m38286f(c10140s.f39066j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10140s.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.s> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10140s.f39065i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.s r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10140s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.s r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10140s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10140s.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.s$b");
        }

        /* renamed from: F */
        public b m35208F(int i2) {
            this.f39077i |= 1;
            this.f39078j = i2;
            return this;
        }

        /* renamed from: G */
        public b m35209G(int i2) {
            this.f39077i |= 2;
            this.f39079k = i2;
            return this;
        }

        /* renamed from: H */
        public b m35210H(boolean z) {
            this.f39077i |= 4;
            this.f39080l = z;
            return this;
        }

        /* renamed from: I */
        public b m35211I(c cVar) {
            cVar.getClass();
            this.f39077i |= 8;
            this.f39081m = cVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10140s mo34093c() {
            C10140s c10140sM35213u = m35213u();
            if (c10140sM35213u.isInitialized()) {
                return c10140sM35213u;
            }
            throw AbstractC10742a.a.m38257j(c10140sM35213u);
        }

        /* renamed from: u */
        public C10140s m35213u() {
            C10140s c10140s = new C10140s(this);
            int i2 = this.f39077i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10140s.f39068l = this.f39078j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10140s.f39069m = this.f39079k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10140s.f39070n = this.f39080l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10140s.f39071o = this.f39081m;
            if ((this.f39077i & 16) == 16) {
                this.f39082n = Collections.unmodifiableList(this.f39082n);
                this.f39077i &= -17;
            }
            c10140s.f39072p = this.f39082n;
            if ((this.f39077i & 32) == 32) {
                this.f39083o = Collections.unmodifiableList(this.f39083o);
                this.f39077i &= -33;
            }
            c10140s.f39073q = this.f39083o;
            c10140s.f39067k = i3;
            return c10140s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35205w().mo34096m(m35213u());
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.s$c */
    public enum c implements C10750i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* renamed from: i */
        private static C10750i.b<c> f39087i = new a();

        /* renamed from: k */
        private final int f39089k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.s$c$a */
        static class a implements C10750i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m35215g(i2);
            }
        }

        c(int i2, int i3) {
            this.f39089k = i3;
        }

        /* renamed from: g */
        public static c m35215g(int i2) {
            if (i2 == 0) {
                return IN;
            }
            if (i2 == 1) {
                return OUT;
            }
            if (i2 != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f39089k;
        }
    }

    static {
        C10140s c10140s = new C10140s(true);
        f39064h = c10140s;
        c10140s.m35182Z();
    }

    /* renamed from: K */
    public static C10140s m35181K() {
        return f39064h;
    }

    /* renamed from: Z */
    private void m35182Z() {
        this.f39068l = 0;
        this.f39069m = 0;
        this.f39070n = false;
        this.f39071o = c.INV;
        this.f39072p = Collections.emptyList();
        this.f39073q = Collections.emptyList();
    }

    /* renamed from: a0 */
    public static b m35183a0() {
        return b.m35205w();
    }

    /* renamed from: b0 */
    public static b m35184b0(C10140s c10140s) {
        return m35183a0().mo34096m(c10140s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C10140s mo34461b() {
        return f39064h;
    }

    /* renamed from: M */
    public int m35186M() {
        return this.f39068l;
    }

    /* renamed from: N */
    public int m35187N() {
        return this.f39069m;
    }

    /* renamed from: O */
    public boolean m35188O() {
        return this.f39070n;
    }

    /* renamed from: P */
    public C10138q m35189P(int i2) {
        return this.f39072p.get(i2);
    }

    /* renamed from: Q */
    public int m35190Q() {
        return this.f39072p.size();
    }

    /* renamed from: R */
    public List<Integer> m35191R() {
        return this.f39073q;
    }

    /* renamed from: S */
    public List<C10138q> m35192S() {
        return this.f39072p;
    }

    /* renamed from: T */
    public c m35193T() {
        return this.f39071o;
    }

    /* renamed from: U */
    public boolean m35194U() {
        return (this.f39067k & 1) == 1;
    }

    /* renamed from: V */
    public boolean m35195V() {
        return (this.f39067k & 2) == 2;
    }

    /* renamed from: X */
    public boolean m35196X() {
        return (this.f39067k & 4) == 4;
    }

    /* renamed from: Y */
    public boolean m35197Y() {
        return (this.f39067k & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35183a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35184b0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39076t;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f39067k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f39068l) + 0 : 0;
        if ((this.f39067k & 2) == 2) {
            iM38189o += CodedOutputStream.m38189o(2, this.f39069m);
        }
        if ((this.f39067k & 4) == 4) {
            iM38189o += CodedOutputStream.m38175a(3, this.f39070n);
        }
        if ((this.f39067k & 8) == 8) {
            iM38189o += CodedOutputStream.m38182h(4, this.f39071o.mo34235f());
        }
        for (int i3 = 0; i3 < this.f39072p.size(); i3++) {
            iM38189o += CodedOutputStream.m38193s(5, this.f39072p.get(i3));
        }
        int iM38190p = 0;
        for (int i4 = 0; i4 < this.f39073q.size(); i4++) {
            iM38190p += CodedOutputStream.m38190p(this.f39073q.get(i4).intValue());
        }
        int iM38190p2 = iM38189o + iM38190p;
        if (!m35191R().isEmpty()) {
            iM38190p2 = iM38190p2 + 1 + CodedOutputStream.m38190p(iM38190p);
        }
        this.f39074r = iM38190p;
        int iM38400t = iM38190p2 + m38400t() + this.f39066j.size();
        this.f39076t = iM38400t;
        return iM38400t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10140s> mo34080g() {
        return f39065i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f39067k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f39068l);
        }
        if ((this.f39067k & 2) == 2) {
            codedOutputStream.m38217a0(2, this.f39069m);
        }
        if ((this.f39067k & 4) == 4) {
            codedOutputStream.m38202L(3, this.f39070n);
        }
        if ((this.f39067k & 8) == 8) {
            codedOutputStream.m38209S(4, this.f39071o.mo34235f());
        }
        for (int i2 = 0; i2 < this.f39072p.size(); i2++) {
            codedOutputStream.m38220d0(5, this.f39072p.get(i2));
        }
        if (m35191R().size() > 0) {
            codedOutputStream.m38231o0(50);
            codedOutputStream.m38231o0(this.f39074r);
        }
        for (int i3 = 0; i3 < this.f39073q.size(); i3++) {
            codedOutputStream.m38218b0(this.f39073q.get(i3).intValue());
        }
        aVarM38405y.m38406a(1000, codedOutputStream);
        codedOutputStream.m38225i0(this.f39066j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f39075s;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m35194U()) {
            this.f39075s = (byte) 0;
            return false;
        }
        if (!m35195V()) {
            this.f39075s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m35190Q(); i2++) {
            if (!m35189P(i2).isInitialized()) {
                this.f39075s = (byte) 0;
                return false;
            }
        }
        if (m38399s()) {
            this.f39075s = (byte) 1;
            return true;
        }
        this.f39075s = (byte) 0;
        return false;
    }

    private C10140s(AbstractC10749h.c<C10140s, ?> cVar) {
        super(cVar);
        this.f39074r = -1;
        this.f39075s = (byte) -1;
        this.f39076t = -1;
        this.f39066j = cVar.m38391l();
    }

    private C10140s(boolean z) {
        this.f39074r = -1;
        this.f39075s = (byte) -1;
        this.f39076t = -1;
        this.f39066j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10140s(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f39074r = -1;
        this.f39075s = (byte) -1;
        this.f39076t = -1;
        m35182Z();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 8) {
                                this.f39067k |= 1;
                                this.f39068l = c10746e.m38339s();
                            } else if (iM38320K == 16) {
                                this.f39067k |= 2;
                                this.f39069m = c10746e.m38339s();
                            } else if (iM38320K == 24) {
                                this.f39067k |= 4;
                                this.f39070n = c10746e.m38331k();
                            } else if (iM38320K == 32) {
                                int iM38334n = c10746e.m38334n();
                                c cVarM35215g = c.m35215g(iM38334n);
                                if (cVarM35215g == null) {
                                    codedOutputStreamM38173J.m38231o0(iM38320K);
                                    codedOutputStreamM38173J.m38231o0(iM38334n);
                                } else {
                                    this.f39067k |= 8;
                                    this.f39071o = cVarM35215g;
                                }
                            } else if (iM38320K == 42) {
                                if ((i2 & 16) != 16) {
                                    this.f39072p = new ArrayList();
                                    i2 |= 16;
                                }
                                this.f39072p.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                            } else if (iM38320K == 48) {
                                if ((i2 & 32) != 32) {
                                    this.f39073q = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f39073q.add(Integer.valueOf(c10746e.m38339s()));
                            } else if (iM38320K != 50) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 32) != 32 && c10746e.m38327e() > 0) {
                                    this.f39073q = new ArrayList();
                                    i2 |= 32;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f39073q.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j);
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
                if ((i2 & 16) == 16) {
                    this.f39072p = Collections.unmodifiableList(this.f39072p);
                }
                if ((i2 & 32) == 32) {
                    this.f39073q = Collections.unmodifiableList(this.f39073q);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f39066j = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f39066j = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 16) == 16) {
            this.f39072p = Collections.unmodifiableList(this.f39072p);
        }
        if ((i2 & 32) == 32) {
            this.f39073q = Collections.unmodifiableList(this.f39073q);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39066j = bVarM38280w.m38299e();
            throw th3;
        }
        this.f39066j = bVarM38280w.m38299e();
        mo38389m();
    }
}
