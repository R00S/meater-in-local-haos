package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import java.io.InputStream;
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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10144w;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.l */
/* loaded from: classes3.dex */
public final class C10133l extends AbstractC10749h.d<C10133l> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10133l f38881h;

    /* renamed from: i */
    public static InterfaceC10758q<C10133l> f38882i = new a();

    /* renamed from: j */
    private final AbstractC10745d f38883j;

    /* renamed from: k */
    private int f38884k;

    /* renamed from: l */
    private List<C10130i> f38885l;

    /* renamed from: m */
    private List<C10135n> f38886m;

    /* renamed from: n */
    private List<C10139r> f38887n;

    /* renamed from: o */
    private C10141t f38888o;

    /* renamed from: p */
    private C10144w f38889p;

    /* renamed from: q */
    private byte f38890q;

    /* renamed from: r */
    private int f38891r;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.l$a */
    static class a extends AbstractC10743b<C10133l> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10133l mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10133l(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.l$b */
    public static final class b extends AbstractC10749h.c<C10133l, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f38892i;

        /* renamed from: j */
        private List<C10130i> f38893j = Collections.emptyList();

        /* renamed from: k */
        private List<C10135n> f38894k = Collections.emptyList();

        /* renamed from: l */
        private List<C10139r> f38895l = Collections.emptyList();

        /* renamed from: m */
        private C10141t f38896m = C10141t.m35225w();

        /* renamed from: n */
        private C10144w f38897n = C10144w.m35334u();

        private b() {
            m34807D();
        }

        /* renamed from: A */
        private void m34804A() {
            if ((this.f38892i & 1) != 1) {
                this.f38893j = new ArrayList(this.f38893j);
                this.f38892i |= 1;
            }
        }

        /* renamed from: B */
        private void m34805B() {
            if ((this.f38892i & 2) != 2) {
                this.f38894k = new ArrayList(this.f38894k);
                this.f38892i |= 2;
            }
        }

        /* renamed from: C */
        private void m34806C() {
            if ((this.f38892i & 4) != 4) {
                this.f38895l = new ArrayList(this.f38895l);
                this.f38892i |= 4;
            }
        }

        /* renamed from: D */
        private void m34807D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34809w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10133l c10133l) {
            if (c10133l == C10133l.m34782K()) {
                return this;
            }
            if (!c10133l.f38885l.isEmpty()) {
                if (this.f38893j.isEmpty()) {
                    this.f38893j = c10133l.f38885l;
                    this.f38892i &= -2;
                } else {
                    m34804A();
                    this.f38893j.addAll(c10133l.f38885l);
                }
            }
            if (!c10133l.f38886m.isEmpty()) {
                if (this.f38894k.isEmpty()) {
                    this.f38894k = c10133l.f38886m;
                    this.f38892i &= -3;
                } else {
                    m34805B();
                    this.f38894k.addAll(c10133l.f38886m);
                }
            }
            if (!c10133l.f38887n.isEmpty()) {
                if (this.f38895l.isEmpty()) {
                    this.f38895l = c10133l.f38887n;
                    this.f38892i &= -5;
                } else {
                    m34806C();
                    this.f38895l.addAll(c10133l.f38887n);
                }
            }
            if (c10133l.m34799Y()) {
                m34812G(c10133l.m34797V());
            }
            if (c10133l.m34800Z()) {
                m34813H(c10133l.m34798X());
            }
            m38396r(c10133l);
            m38392n(m38391l().m38286f(c10133l.f38883j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10133l.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.l> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10133l.f38882i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.l r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10133l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.l r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10133l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10133l.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.l$b");
        }

        /* renamed from: G */
        public b m34812G(C10141t c10141t) {
            if ((this.f38892i & 8) != 8 || this.f38896m == C10141t.m35225w()) {
                this.f38896m = c10141t;
            } else {
                this.f38896m = C10141t.m35219E(this.f38896m).mo34096m(c10141t).m35240q();
            }
            this.f38892i |= 8;
            return this;
        }

        /* renamed from: H */
        public b m34813H(C10144w c10144w) {
            if ((this.f38892i & 16) != 16 || this.f38897n == C10144w.m35334u()) {
                this.f38897n = c10144w;
            } else {
                this.f38897n = C10144w.m35337z(this.f38897n).mo34096m(c10144w).m35348q();
            }
            this.f38892i |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10133l mo34093c() {
            C10133l c10133lM34815u = m34815u();
            if (c10133lM34815u.isInitialized()) {
                return c10133lM34815u;
            }
            throw AbstractC10742a.a.m38257j(c10133lM34815u);
        }

        /* renamed from: u */
        public C10133l m34815u() {
            C10133l c10133l = new C10133l(this);
            int i2 = this.f38892i;
            if ((i2 & 1) == 1) {
                this.f38893j = Collections.unmodifiableList(this.f38893j);
                this.f38892i &= -2;
            }
            c10133l.f38885l = this.f38893j;
            if ((this.f38892i & 2) == 2) {
                this.f38894k = Collections.unmodifiableList(this.f38894k);
                this.f38892i &= -3;
            }
            c10133l.f38886m = this.f38894k;
            if ((this.f38892i & 4) == 4) {
                this.f38895l = Collections.unmodifiableList(this.f38895l);
                this.f38892i &= -5;
            }
            c10133l.f38887n = this.f38895l;
            int i3 = (i2 & 8) != 8 ? 0 : 1;
            c10133l.f38888o = this.f38896m;
            if ((i2 & 16) == 16) {
                i3 |= 2;
            }
            c10133l.f38889p = this.f38897n;
            c10133l.f38884k = i3;
            return c10133l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34809w().mo34096m(m34815u());
        }
    }

    static {
        C10133l c10133l = new C10133l(true);
        f38881h = c10133l;
        c10133l.m34783a0();
    }

    /* renamed from: K */
    public static C10133l m34782K() {
        return f38881h;
    }

    /* renamed from: a0 */
    private void m34783a0() {
        this.f38885l = Collections.emptyList();
        this.f38886m = Collections.emptyList();
        this.f38887n = Collections.emptyList();
        this.f38888o = C10141t.m35225w();
        this.f38889p = C10144w.m35334u();
    }

    /* renamed from: b0 */
    public static b m34784b0() {
        return b.m34809w();
    }

    /* renamed from: c0 */
    public static b m34785c0(C10133l c10133l) {
        return m34784b0().mo34096m(c10133l);
    }

    /* renamed from: e0 */
    public static C10133l m34786e0(InputStream inputStream, C10747f c10747f) throws IOException {
        return f38882i.mo38260a(inputStream, c10747f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C10133l mo34461b() {
        return f38881h;
    }

    /* renamed from: M */
    public C10130i m34788M(int i2) {
        return this.f38885l.get(i2);
    }

    /* renamed from: N */
    public int m34789N() {
        return this.f38885l.size();
    }

    /* renamed from: O */
    public List<C10130i> m34790O() {
        return this.f38885l;
    }

    /* renamed from: P */
    public C10135n m34791P(int i2) {
        return this.f38886m.get(i2);
    }

    /* renamed from: Q */
    public int m34792Q() {
        return this.f38886m.size();
    }

    /* renamed from: R */
    public List<C10135n> m34793R() {
        return this.f38886m;
    }

    /* renamed from: S */
    public C10139r m34794S(int i2) {
        return this.f38887n.get(i2);
    }

    /* renamed from: T */
    public int m34795T() {
        return this.f38887n.size();
    }

    /* renamed from: U */
    public List<C10139r> m34796U() {
        return this.f38887n;
    }

    /* renamed from: V */
    public C10141t m34797V() {
        return this.f38888o;
    }

    /* renamed from: X */
    public C10144w m34798X() {
        return this.f38889p;
    }

    /* renamed from: Y */
    public boolean m34799Y() {
        return (this.f38884k & 1) == 1;
    }

    /* renamed from: Z */
    public boolean m34800Z() {
        return (this.f38884k & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34784b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38891r;
        if (i2 != -1) {
            return i2;
        }
        int iM38193s = 0;
        for (int i3 = 0; i3 < this.f38885l.size(); i3++) {
            iM38193s += CodedOutputStream.m38193s(3, this.f38885l.get(i3));
        }
        for (int i4 = 0; i4 < this.f38886m.size(); i4++) {
            iM38193s += CodedOutputStream.m38193s(4, this.f38886m.get(i4));
        }
        for (int i5 = 0; i5 < this.f38887n.size(); i5++) {
            iM38193s += CodedOutputStream.m38193s(5, this.f38887n.get(i5));
        }
        if ((this.f38884k & 1) == 1) {
            iM38193s += CodedOutputStream.m38193s(30, this.f38888o);
        }
        if ((this.f38884k & 2) == 2) {
            iM38193s += CodedOutputStream.m38193s(32, this.f38889p);
        }
        int iM38400t = iM38193s + m38400t() + this.f38883j.size();
        this.f38891r = iM38400t;
        return iM38400t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34785c0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10133l> mo34080g() {
        return f38882i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        for (int i2 = 0; i2 < this.f38885l.size(); i2++) {
            codedOutputStream.m38220d0(3, this.f38885l.get(i2));
        }
        for (int i3 = 0; i3 < this.f38886m.size(); i3++) {
            codedOutputStream.m38220d0(4, this.f38886m.get(i3));
        }
        for (int i4 = 0; i4 < this.f38887n.size(); i4++) {
            codedOutputStream.m38220d0(5, this.f38887n.get(i4));
        }
        if ((this.f38884k & 1) == 1) {
            codedOutputStream.m38220d0(30, this.f38888o);
        }
        if ((this.f38884k & 2) == 2) {
            codedOutputStream.m38220d0(32, this.f38889p);
        }
        aVarM38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f38883j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38890q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34789N(); i2++) {
            if (!m34788M(i2).isInitialized()) {
                this.f38890q = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m34792Q(); i3++) {
            if (!m34791P(i3).isInitialized()) {
                this.f38890q = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m34795T(); i4++) {
            if (!m34794S(i4).isInitialized()) {
                this.f38890q = (byte) 0;
                return false;
            }
        }
        if (m34799Y() && !m34797V().isInitialized()) {
            this.f38890q = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f38890q = (byte) 1;
            return true;
        }
        this.f38890q = (byte) 0;
        return false;
    }

    private C10133l(AbstractC10749h.c<C10133l, ?> cVar) {
        super(cVar);
        this.f38890q = (byte) -1;
        this.f38891r = -1;
        this.f38883j = cVar.m38391l();
    }

    private C10133l(boolean z) {
        this.f38890q = (byte) -1;
        this.f38891r = -1;
        this.f38883j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10133l(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38890q = (byte) -1;
        this.f38891r = -1;
        m34783a0();
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
                            if (iM38320K == 26) {
                                if ((i2 & 1) != 1) {
                                    this.f38885l = new ArrayList();
                                    i2 |= 1;
                                }
                                this.f38885l.add(c10746e.m38341u(C10130i.f38832i, c10747f));
                            } else if (iM38320K == 34) {
                                if ((i2 & 2) != 2) {
                                    this.f38886m = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f38886m.add(c10746e.m38341u(C10135n.f38914i, c10747f));
                            } else if (iM38320K != 42) {
                                if (iM38320K == 242) {
                                    C10141t.b bVarM35229G = (this.f38884k & 1) == 1 ? this.f38888o.mo34077d() : null;
                                    C10141t c10141t = (C10141t) c10746e.m38341u(C10141t.f39091h, c10747f);
                                    this.f38888o = c10141t;
                                    if (bVarM35229G != null) {
                                        bVarM35229G.mo34096m(c10141t);
                                        this.f38888o = bVarM35229G.m35240q();
                                    }
                                    this.f38884k |= 1;
                                } else if (iM38320K != 258) {
                                    if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                    }
                                } else {
                                    C10144w.b bVarM35339B = (this.f38884k & 2) == 2 ? this.f38889p.mo34077d() : null;
                                    C10144w c10144w = (C10144w) c10746e.m38341u(C10144w.f39152h, c10747f);
                                    this.f38889p = c10144w;
                                    if (bVarM35339B != null) {
                                        bVarM35339B.mo34096m(c10144w);
                                        this.f38889p = bVarM35339B.m35348q();
                                    }
                                    this.f38884k |= 2;
                                }
                            } else {
                                if ((i2 & 4) != 4) {
                                    this.f38887n = new ArrayList();
                                    i2 |= 4;
                                }
                                this.f38887n.add(c10746e.m38341u(C10139r.f39040i, c10747f));
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
                if ((i2 & 1) == 1) {
                    this.f38885l = Collections.unmodifiableList(this.f38885l);
                }
                if ((i2 & 2) == 2) {
                    this.f38886m = Collections.unmodifiableList(this.f38886m);
                }
                if ((i2 & 4) == 4) {
                    this.f38887n = Collections.unmodifiableList(this.f38887n);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38883j = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38883j = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if ((i2 & 1) == 1) {
            this.f38885l = Collections.unmodifiableList(this.f38885l);
        }
        if ((i2 & 2) == 2) {
            this.f38886m = Collections.unmodifiableList(this.f38886m);
        }
        if ((i2 & 4) == 4) {
            this.f38887n = Collections.unmodifiableList(this.f38887n);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38883j = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38883j = bVarM38280w.m38299e();
        mo38389m();
    }
}
