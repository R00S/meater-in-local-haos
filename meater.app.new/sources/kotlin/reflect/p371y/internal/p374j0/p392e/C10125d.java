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
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.d */
/* loaded from: classes3.dex */
public final class C10125d extends AbstractC10749h.d<C10125d> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10125d f38747h;

    /* renamed from: i */
    public static InterfaceC10758q<C10125d> f38748i = new a();

    /* renamed from: j */
    private final AbstractC10745d f38749j;

    /* renamed from: k */
    private int f38750k;

    /* renamed from: l */
    private int f38751l;

    /* renamed from: m */
    private List<C10142u> f38752m;

    /* renamed from: n */
    private List<Integer> f38753n;

    /* renamed from: o */
    private byte f38754o;

    /* renamed from: p */
    private int f38755p;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.d$a */
    static class a extends AbstractC10743b<C10125d> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10125d mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10125d(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.d$b */
    public static final class b extends AbstractC10749h.c<C10125d, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f38756i;

        /* renamed from: j */
        private int f38757j = 6;

        /* renamed from: k */
        private List<C10142u> f38758k = Collections.emptyList();

        /* renamed from: l */
        private List<Integer> f38759l = Collections.emptyList();

        private b() {
            m34548C();
        }

        /* renamed from: A */
        private void m34546A() {
            if ((this.f38756i & 2) != 2) {
                this.f38758k = new ArrayList(this.f38758k);
                this.f38756i |= 2;
            }
        }

        /* renamed from: B */
        private void m34547B() {
            if ((this.f38756i & 4) != 4) {
                this.f38759l = new ArrayList(this.f38759l);
                this.f38756i |= 4;
            }
        }

        /* renamed from: C */
        private void m34548C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34550w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10125d c10125d) {
            if (c10125d == C10125d.m34532H()) {
                return this;
            }
            if (c10125d.m34542O()) {
                m34553F(c10125d.m34537J());
            }
            if (!c10125d.f38752m.isEmpty()) {
                if (this.f38758k.isEmpty()) {
                    this.f38758k = c10125d.f38752m;
                    this.f38756i &= -3;
                } else {
                    m34546A();
                    this.f38758k.addAll(c10125d.f38752m);
                }
            }
            if (!c10125d.f38753n.isEmpty()) {
                if (this.f38759l.isEmpty()) {
                    this.f38759l = c10125d.f38753n;
                    this.f38756i &= -5;
                } else {
                    m34547B();
                    this.f38759l.addAll(c10125d.f38753n);
                }
            }
            m38396r(c10125d);
            m38392n(m38391l().m38286f(c10125d.f38749j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10125d.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.d> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10125d.f38748i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.d r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10125d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.d r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10125d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10125d.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.d$b");
        }

        /* renamed from: F */
        public b m34553F(int i2) {
            this.f38756i |= 1;
            this.f38757j = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10125d mo34093c() {
            C10125d c10125dM34555u = m34555u();
            if (c10125dM34555u.isInitialized()) {
                return c10125dM34555u;
            }
            throw AbstractC10742a.a.m38257j(c10125dM34555u);
        }

        /* renamed from: u */
        public C10125d m34555u() {
            C10125d c10125d = new C10125d(this);
            int i2 = (this.f38756i & 1) != 1 ? 0 : 1;
            c10125d.f38751l = this.f38757j;
            if ((this.f38756i & 2) == 2) {
                this.f38758k = Collections.unmodifiableList(this.f38758k);
                this.f38756i &= -3;
            }
            c10125d.f38752m = this.f38758k;
            if ((this.f38756i & 4) == 4) {
                this.f38759l = Collections.unmodifiableList(this.f38759l);
                this.f38756i &= -5;
            }
            c10125d.f38753n = this.f38759l;
            c10125d.f38750k = i2;
            return c10125d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34550w().mo34096m(m34555u());
        }
    }

    static {
        C10125d c10125d = new C10125d(true);
        f38747h = c10125d;
        c10125d.m34533P();
    }

    /* renamed from: H */
    public static C10125d m34532H() {
        return f38747h;
    }

    /* renamed from: P */
    private void m34533P() {
        this.f38751l = 6;
        this.f38752m = Collections.emptyList();
        this.f38753n = Collections.emptyList();
    }

    /* renamed from: Q */
    public static b m34534Q() {
        return b.m34550w();
    }

    /* renamed from: R */
    public static b m34535R(C10125d c10125d) {
        return m34534Q().mo34096m(c10125d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C10125d mo34461b() {
        return f38747h;
    }

    /* renamed from: J */
    public int m34537J() {
        return this.f38751l;
    }

    /* renamed from: K */
    public C10142u m34538K(int i2) {
        return this.f38752m.get(i2);
    }

    /* renamed from: L */
    public int m34539L() {
        return this.f38752m.size();
    }

    /* renamed from: M */
    public List<C10142u> m34540M() {
        return this.f38752m;
    }

    /* renamed from: N */
    public List<Integer> m34541N() {
        return this.f38753n;
    }

    /* renamed from: O */
    public boolean m34542O() {
        return (this.f38750k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34534Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34535R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38755p;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f38750k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38751l) + 0 : 0;
        for (int i3 = 0; i3 < this.f38752m.size(); i3++) {
            iM38189o += CodedOutputStream.m38193s(2, this.f38752m.get(i3));
        }
        int iM38190p = 0;
        for (int i4 = 0; i4 < this.f38753n.size(); i4++) {
            iM38190p += CodedOutputStream.m38190p(this.f38753n.get(i4).intValue());
        }
        int size = iM38189o + iM38190p + (m34541N().size() * 2) + m38400t() + this.f38749j.size();
        this.f38755p = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10125d> mo34080g() {
        return f38748i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f38750k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38751l);
        }
        for (int i2 = 0; i2 < this.f38752m.size(); i2++) {
            codedOutputStream.m38220d0(2, this.f38752m.get(i2));
        }
        for (int i3 = 0; i3 < this.f38753n.size(); i3++) {
            codedOutputStream.m38217a0(31, this.f38753n.get(i3).intValue());
        }
        aVarM38405y.m38406a(19000, codedOutputStream);
        codedOutputStream.m38225i0(this.f38749j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38754o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34539L(); i2++) {
            if (!m34538K(i2).isInitialized()) {
                this.f38754o = (byte) 0;
                return false;
            }
        }
        if (m38399s()) {
            this.f38754o = (byte) 1;
            return true;
        }
        this.f38754o = (byte) 0;
        return false;
    }

    private C10125d(AbstractC10749h.c<C10125d, ?> cVar) {
        super(cVar);
        this.f38754o = (byte) -1;
        this.f38755p = -1;
        this.f38749j = cVar.m38391l();
    }

    private C10125d(boolean z) {
        this.f38754o = (byte) -1;
        this.f38755p = -1;
        this.f38749j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10125d(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38754o = (byte) -1;
        this.f38755p = -1;
        m34533P();
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
                                this.f38750k |= 1;
                                this.f38751l = c10746e.m38339s();
                            } else if (iM38320K == 18) {
                                if ((i2 & 2) != 2) {
                                    this.f38752m = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f38752m.add(c10746e.m38341u(C10142u.f39102i, c10747f));
                            } else if (iM38320K == 248) {
                                if ((i2 & 4) != 4) {
                                    this.f38753n = new ArrayList();
                                    i2 |= 4;
                                }
                                this.f38753n.add(Integer.valueOf(c10746e.m38339s()));
                            } else if (iM38320K != 250) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 4) != 4 && c10746e.m38327e() > 0) {
                                    this.f38753n = new ArrayList();
                                    i2 |= 4;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38753n.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j);
                            }
                        }
                        z = true;
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).m38253i(this);
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw e3.m38253i(this);
                }
            } catch (Throwable th) {
                if ((i2 & 2) == 2) {
                    this.f38752m = Collections.unmodifiableList(this.f38752m);
                }
                if ((i2 & 4) == 4) {
                    this.f38753n = Collections.unmodifiableList(this.f38753n);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38749j = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38749j = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 2) == 2) {
            this.f38752m = Collections.unmodifiableList(this.f38752m);
        }
        if ((i2 & 4) == 4) {
            this.f38753n = Collections.unmodifiableList(this.f38753n);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38749j = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38749j = bVarM38280w.m38299e();
        mo38389m();
    }
}
