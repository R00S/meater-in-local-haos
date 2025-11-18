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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10129h;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.f */
/* loaded from: classes3.dex */
public final class C10127f extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10127f f38768g;

    /* renamed from: h */
    public static InterfaceC10758q<C10127f> f38769h = new a();

    /* renamed from: i */
    private final AbstractC10745d f38770i;

    /* renamed from: j */
    private int f38771j;

    /* renamed from: k */
    private c f38772k;

    /* renamed from: l */
    private List<C10129h> f38773l;

    /* renamed from: m */
    private C10129h f38774m;

    /* renamed from: n */
    private d f38775n;

    /* renamed from: o */
    private byte f38776o;

    /* renamed from: p */
    private int f38777p;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$a */
    static class a extends AbstractC10743b<C10127f> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10127f mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10127f(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$b */
    public static final class b extends AbstractC10749h.b<C10127f, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f38778g;

        /* renamed from: h */
        private c f38779h = c.RETURNS_CONSTANT;

        /* renamed from: i */
        private List<C10129h> f38780i = Collections.emptyList();

        /* renamed from: j */
        private C10129h f38781j = C10129h.m34640F();

        /* renamed from: k */
        private d f38782k = d.AT_MOST_ONCE;

        private b() {
            m34603u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34601s() {
            return new b();
        }

        /* renamed from: t */
        private void m34602t() {
            if ((this.f38778g & 2) != 2) {
                this.f38780i = new ArrayList(this.f38780i);
                this.f38778g |= 2;
            }
        }

        /* renamed from: u */
        private void m34603u() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10127f.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.f> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10127f.f38769h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.f r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10127f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.f r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10127f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10127f.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.f$b");
        }

        /* renamed from: B */
        public b m34605B(c cVar) {
            cVar.getClass();
            this.f38778g |= 1;
            this.f38779h = cVar;
            return this;
        }

        /* renamed from: C */
        public b m34606C(d dVar) {
            dVar.getClass();
            this.f38778g |= 8;
            this.f38782k = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10127f mo34093c() {
            C10127f c10127fM34608q = m34608q();
            if (c10127fM34608q.isInitialized()) {
                return c10127fM34608q;
            }
            throw AbstractC10742a.a.m38257j(c10127fM34608q);
        }

        /* renamed from: q */
        public C10127f m34608q() {
            C10127f c10127f = new C10127f(this);
            int i2 = this.f38778g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10127f.f38772k = this.f38779h;
            if ((this.f38778g & 2) == 2) {
                this.f38780i = Collections.unmodifiableList(this.f38780i);
                this.f38778g &= -3;
            }
            c10127f.f38773l = this.f38780i;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            c10127f.f38774m = this.f38781j;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            c10127f.f38775n = this.f38782k;
            c10127f.f38771j = i3;
            return c10127f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34601s().mo34096m(m34608q());
        }

        /* renamed from: v */
        public b m34610v(C10129h c10129h) {
            if ((this.f38778g & 4) != 4 || this.f38781j == C10129h.m34640F()) {
                this.f38781j = c10129h;
            } else {
                this.f38781j = C10129h.m34643T(this.f38781j).mo34096m(c10129h).m34682q();
            }
            this.f38778g |= 4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10127f c10127f) {
            if (c10127f == C10127f.m34588z()) {
                return this;
            }
            if (c10127f.m34594F()) {
                m34605B(c10127f.m34591C());
            }
            if (!c10127f.f38773l.isEmpty()) {
                if (this.f38780i.isEmpty()) {
                    this.f38780i = c10127f.f38773l;
                    this.f38778g &= -3;
                } else {
                    m34602t();
                    this.f38780i.addAll(c10127f.f38773l);
                }
            }
            if (c10127f.m34593E()) {
                m34610v(c10127f.m34598y());
            }
            if (c10127f.m34595G()) {
                m34606C(c10127f.m34592D());
            }
            m38392n(m38391l().m38286f(c10127f.f38770i));
            return this;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$c */
    public enum c implements C10750i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* renamed from: i */
        private static C10750i.b<c> f38786i = new a();

        /* renamed from: k */
        private final int f38788k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.f$c$a */
        static class a implements C10750i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m34612g(i2);
            }
        }

        c(int i2, int i3) {
            this.f38788k = i3;
        }

        /* renamed from: g */
        public static c m34612g(int i2) {
            if (i2 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i2 == 1) {
                return CALLS;
            }
            if (i2 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38788k;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.f$d */
    public enum d implements C10750i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* renamed from: i */
        private static C10750i.b<d> f38792i = new a();

        /* renamed from: k */
        private final int f38794k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.f$d$a */
        static class a implements C10750i.b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo34236a(int i2) {
                return d.m34614g(i2);
            }
        }

        d(int i2, int i3) {
            this.f38794k = i3;
        }

        /* renamed from: g */
        public static d m34614g(int i2) {
            if (i2 == 0) {
                return AT_MOST_ONCE;
            }
            if (i2 == 1) {
                return EXACTLY_ONCE;
            }
            if (i2 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38794k;
        }
    }

    static {
        C10127f c10127f = new C10127f(true);
        f38768g = c10127f;
        c10127f.m34578H();
    }

    /* renamed from: H */
    private void m34578H() {
        this.f38772k = c.RETURNS_CONSTANT;
        this.f38773l = Collections.emptyList();
        this.f38774m = C10129h.m34640F();
        this.f38775n = d.AT_MOST_ONCE;
    }

    /* renamed from: I */
    public static b m34579I() {
        return b.m34601s();
    }

    /* renamed from: J */
    public static b m34580J(C10127f c10127f) {
        return m34579I().mo34096m(c10127f);
    }

    /* renamed from: z */
    public static C10127f m34588z() {
        return f38768g;
    }

    /* renamed from: A */
    public C10129h m34589A(int i2) {
        return this.f38773l.get(i2);
    }

    /* renamed from: B */
    public int m34590B() {
        return this.f38773l.size();
    }

    /* renamed from: C */
    public c m34591C() {
        return this.f38772k;
    }

    /* renamed from: D */
    public d m34592D() {
        return this.f38775n;
    }

    /* renamed from: E */
    public boolean m34593E() {
        return (this.f38771j & 2) == 2;
    }

    /* renamed from: F */
    public boolean m34594F() {
        return (this.f38771j & 1) == 1;
    }

    /* renamed from: G */
    public boolean m34595G() {
        return (this.f38771j & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34579I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34580J(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38777p;
        if (i2 != -1) {
            return i2;
        }
        int iM38182h = (this.f38771j & 1) == 1 ? CodedOutputStream.m38182h(1, this.f38772k.mo34235f()) + 0 : 0;
        for (int i3 = 0; i3 < this.f38773l.size(); i3++) {
            iM38182h += CodedOutputStream.m38193s(2, this.f38773l.get(i3));
        }
        if ((this.f38771j & 2) == 2) {
            iM38182h += CodedOutputStream.m38193s(3, this.f38774m);
        }
        if ((this.f38771j & 4) == 4) {
            iM38182h += CodedOutputStream.m38182h(4, this.f38775n.mo34235f());
        }
        int size = iM38182h + this.f38770i.size();
        this.f38777p = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10127f> mo34080g() {
        return f38769h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        if ((this.f38771j & 1) == 1) {
            codedOutputStream.m38209S(1, this.f38772k.mo34235f());
        }
        for (int i2 = 0; i2 < this.f38773l.size(); i2++) {
            codedOutputStream.m38220d0(2, this.f38773l.get(i2));
        }
        if ((this.f38771j & 2) == 2) {
            codedOutputStream.m38220d0(3, this.f38774m);
        }
        if ((this.f38771j & 4) == 4) {
            codedOutputStream.m38209S(4, this.f38775n.mo34235f());
        }
        codedOutputStream.m38225i0(this.f38770i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38776o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34590B(); i2++) {
            if (!m34589A(i2).isInitialized()) {
                this.f38776o = (byte) 0;
                return false;
            }
        }
        if (!m34593E() || m34598y().isInitialized()) {
            this.f38776o = (byte) 1;
            return true;
        }
        this.f38776o = (byte) 0;
        return false;
    }

    /* renamed from: y */
    public C10129h m34598y() {
        return this.f38774m;
    }

    private C10127f(AbstractC10749h.b bVar) {
        super(bVar);
        this.f38776o = (byte) -1;
        this.f38777p = -1;
        this.f38770i = bVar.m38391l();
    }

    private C10127f(boolean z) {
        this.f38776o = (byte) -1;
        this.f38777p = -1;
        this.f38770i = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10127f(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38776o = (byte) -1;
        this.f38777p = -1;
        m34578H();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    int iM38320K = c10746e.m38320K();
                    if (iM38320K != 0) {
                        if (iM38320K == 8) {
                            int iM38334n = c10746e.m38334n();
                            c cVarM34612g = c.m34612g(iM38334n);
                            if (cVarM34612g == null) {
                                codedOutputStreamM38173J.m38231o0(iM38320K);
                                codedOutputStreamM38173J.m38231o0(iM38334n);
                            } else {
                                this.f38771j |= 1;
                                this.f38772k = cVarM34612g;
                            }
                        } else if (iM38320K == 18) {
                            if ((i2 & 2) != 2) {
                                this.f38773l = new ArrayList();
                                i2 |= 2;
                            }
                            this.f38773l.add(c10746e.m38341u(C10129h.f38805h, c10747f));
                        } else if (iM38320K == 26) {
                            C10129h.b bVarMo34077d = (this.f38771j & 2) == 2 ? this.f38774m.mo34077d() : null;
                            C10129h c10129h = (C10129h) c10746e.m38341u(C10129h.f38805h, c10747f);
                            this.f38774m = c10129h;
                            if (bVarMo34077d != null) {
                                bVarMo34077d.mo34096m(c10129h);
                                this.f38774m = bVarMo34077d.m34682q();
                            }
                            this.f38771j |= 2;
                        } else if (iM38320K != 32) {
                            if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                            }
                        } else {
                            int iM38334n2 = c10746e.m38334n();
                            d dVarM34614g = d.m34614g(iM38334n2);
                            if (dVarM34614g == null) {
                                codedOutputStreamM38173J.m38231o0(iM38320K);
                                codedOutputStreamM38173J.m38231o0(iM38334n2);
                            } else {
                                this.f38771j |= 4;
                                this.f38775n = dVarM34614g;
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
                if ((i2 & 2) == 2) {
                    this.f38773l = Collections.unmodifiableList(this.f38773l);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38770i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38770i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 2) == 2) {
            this.f38773l = Collections.unmodifiableList(this.f38773l);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38770i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38770i = bVarM38280w.m38299e();
        mo38389m();
    }
}
