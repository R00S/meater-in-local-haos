package kotlin.reflect.p371y.internal.p374j0.p392e;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10142u;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.n */
/* loaded from: classes3.dex */
public final class C10135n extends AbstractC10749h.d<C10135n> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10135n f38913h;

    /* renamed from: i */
    public static InterfaceC10758q<C10135n> f38914i = new a();

    /* renamed from: A */
    private byte f38915A;

    /* renamed from: B */
    private int f38916B;

    /* renamed from: j */
    private final AbstractC10745d f38917j;

    /* renamed from: k */
    private int f38918k;

    /* renamed from: l */
    private int f38919l;

    /* renamed from: m */
    private int f38920m;

    /* renamed from: n */
    private int f38921n;

    /* renamed from: o */
    private C10138q f38922o;

    /* renamed from: p */
    private int f38923p;

    /* renamed from: q */
    private List<C10140s> f38924q;

    /* renamed from: r */
    private C10138q f38925r;

    /* renamed from: s */
    private int f38926s;

    /* renamed from: t */
    private List<C10138q> f38927t;

    /* renamed from: u */
    private List<Integer> f38928u;

    /* renamed from: v */
    private int f38929v;

    /* renamed from: w */
    private C10142u f38930w;

    /* renamed from: x */
    private int f38931x;

    /* renamed from: y */
    private int f38932y;

    /* renamed from: z */
    private List<Integer> f38933z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.n$a */
    static class a extends AbstractC10743b<C10135n> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10135n mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10135n(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.n$b */
    public static final class b extends AbstractC10749h.c<C10135n, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f38934i;

        /* renamed from: l */
        private int f38937l;

        /* renamed from: n */
        private int f38939n;

        /* renamed from: q */
        private int f38942q;

        /* renamed from: u */
        private int f38946u;

        /* renamed from: v */
        private int f38947v;

        /* renamed from: j */
        private int f38935j = 518;

        /* renamed from: k */
        private int f38936k = 2054;

        /* renamed from: m */
        private C10138q f38938m = C10138q.m35022Y();

        /* renamed from: o */
        private List<C10140s> f38940o = Collections.emptyList();

        /* renamed from: p */
        private C10138q f38941p = C10138q.m35022Y();

        /* renamed from: r */
        private List<C10138q> f38943r = Collections.emptyList();

        /* renamed from: s */
        private List<Integer> f38944s = Collections.emptyList();

        /* renamed from: t */
        private C10142u f38945t = C10142u.m35252I();

        /* renamed from: w */
        private List<Integer> f38948w = Collections.emptyList();

        private b() {
            m34914E();
        }

        /* renamed from: A */
        private void m34910A() {
            if ((this.f38934i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.f38944s = new ArrayList(this.f38944s);
                this.f38934i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        /* renamed from: B */
        private void m34911B() {
            if ((this.f38934i & 256) != 256) {
                this.f38943r = new ArrayList(this.f38943r);
                this.f38934i |= 256;
            }
        }

        /* renamed from: C */
        private void m34912C() {
            if ((this.f38934i & 32) != 32) {
                this.f38940o = new ArrayList(this.f38940o);
                this.f38934i |= 32;
            }
        }

        /* renamed from: D */
        private void m34913D() {
            if ((this.f38934i & 8192) != 8192) {
                this.f38948w = new ArrayList(this.f38948w);
                this.f38934i |= 8192;
            }
        }

        /* renamed from: E */
        private void m34914E() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34916w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10135n c10135n) {
            if (c10135n == C10135n.m34876Z()) {
                return this;
            }
            if (c10135n.m34899p0()) {
                m34922K(c10135n.m34885b0());
            }
            if (c10135n.m34902s0()) {
                m34925N(c10135n.m34888e0());
            }
            if (c10135n.m34901r0()) {
                m34924M(c10135n.m34887d0());
            }
            if (c10135n.m34905v0()) {
                m34920I(c10135n.m34891h0());
            }
            if (c10135n.m34906w0()) {
                m34927P(c10135n.m34892i0());
            }
            if (!c10135n.f38924q.isEmpty()) {
                if (this.f38940o.isEmpty()) {
                    this.f38940o = c10135n.f38924q;
                    this.f38934i &= -33;
                } else {
                    m34912C();
                    this.f38940o.addAll(c10135n.f38924q);
                }
            }
            if (c10135n.m34903t0()) {
                m34919H(c10135n.m34889f0());
            }
            if (c10135n.m34904u0()) {
                m34926O(c10135n.m34890g0());
            }
            if (!c10135n.f38927t.isEmpty()) {
                if (this.f38943r.isEmpty()) {
                    this.f38943r = c10135n.f38927t;
                    this.f38934i &= -257;
                } else {
                    m34911B();
                    this.f38943r.addAll(c10135n.f38927t);
                }
            }
            if (!c10135n.f38928u.isEmpty()) {
                if (this.f38944s.isEmpty()) {
                    this.f38944s = c10135n.f38928u;
                    this.f38934i &= -513;
                } else {
                    m34910A();
                    this.f38944s.addAll(c10135n.f38928u);
                }
            }
            if (c10135n.m34908y0()) {
                m34921J(c10135n.m34894k0());
            }
            if (c10135n.m34900q0()) {
                m34923L(c10135n.m34886c0());
            }
            if (c10135n.m34907x0()) {
                m34928Q(c10135n.m34893j0());
            }
            if (!c10135n.f38933z.isEmpty()) {
                if (this.f38948w.isEmpty()) {
                    this.f38948w = c10135n.f38933z;
                    this.f38934i &= -8193;
                } else {
                    m34913D();
                    this.f38948w.addAll(c10135n.f38933z);
                }
            }
            m38396r(c10135n);
            m38392n(m38391l().m38286f(c10135n.f38917j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10135n.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.n> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10135n.f38914i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.n r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10135n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.n r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10135n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10135n.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.n$b");
        }

        /* renamed from: H */
        public b m34919H(C10138q c10138q) {
            if ((this.f38934i & 64) != 64 || this.f38941p == C10138q.m35022Y()) {
                this.f38941p = c10138q;
            } else {
                this.f38941p = C10138q.m35025z0(this.f38941p).mo34096m(c10138q).m35110u();
            }
            this.f38934i |= 64;
            return this;
        }

        /* renamed from: I */
        public b m34920I(C10138q c10138q) {
            if ((this.f38934i & 8) != 8 || this.f38938m == C10138q.m35022Y()) {
                this.f38938m = c10138q;
            } else {
                this.f38938m = C10138q.m35025z0(this.f38938m).mo34096m(c10138q).m35110u();
            }
            this.f38934i |= 8;
            return this;
        }

        /* renamed from: J */
        public b m34921J(C10142u c10142u) {
            if ((this.f38934i & 1024) != 1024 || this.f38945t == C10142u.m35252I()) {
                this.f38945t = c10142u;
            } else {
                this.f38945t = C10142u.m35255Z(this.f38945t).mo34096m(c10142u).m35284u();
            }
            this.f38934i |= 1024;
            return this;
        }

        /* renamed from: K */
        public b m34922K(int i2) {
            this.f38934i |= 1;
            this.f38935j = i2;
            return this;
        }

        /* renamed from: L */
        public b m34923L(int i2) {
            this.f38934i |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            this.f38946u = i2;
            return this;
        }

        /* renamed from: M */
        public b m34924M(int i2) {
            this.f38934i |= 4;
            this.f38937l = i2;
            return this;
        }

        /* renamed from: N */
        public b m34925N(int i2) {
            this.f38934i |= 2;
            this.f38936k = i2;
            return this;
        }

        /* renamed from: O */
        public b m34926O(int i2) {
            this.f38934i |= 128;
            this.f38942q = i2;
            return this;
        }

        /* renamed from: P */
        public b m34927P(int i2) {
            this.f38934i |= 16;
            this.f38939n = i2;
            return this;
        }

        /* renamed from: Q */
        public b m34928Q(int i2) {
            this.f38934i |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f38947v = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10135n mo34093c() {
            C10135n c10135nM34930u = m34930u();
            if (c10135nM34930u.isInitialized()) {
                return c10135nM34930u;
            }
            throw AbstractC10742a.a.m38257j(c10135nM34930u);
        }

        /* renamed from: u */
        public C10135n m34930u() {
            C10135n c10135n = new C10135n(this);
            int i2 = this.f38934i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10135n.f38919l = this.f38935j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10135n.f38920m = this.f38936k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10135n.f38921n = this.f38937l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10135n.f38922o = this.f38938m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            c10135n.f38923p = this.f38939n;
            if ((this.f38934i & 32) == 32) {
                this.f38940o = Collections.unmodifiableList(this.f38940o);
                this.f38934i &= -33;
            }
            c10135n.f38924q = this.f38940o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            c10135n.f38925r = this.f38941p;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            c10135n.f38926s = this.f38942q;
            if ((this.f38934i & 256) == 256) {
                this.f38943r = Collections.unmodifiableList(this.f38943r);
                this.f38934i &= -257;
            }
            c10135n.f38927t = this.f38943r;
            if ((this.f38934i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.f38944s = Collections.unmodifiableList(this.f38944s);
                this.f38934i &= -513;
            }
            c10135n.f38928u = this.f38944s;
            if ((i2 & 1024) == 1024) {
                i3 |= 128;
            }
            c10135n.f38930w = this.f38945t;
            if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                i3 |= 256;
            }
            c10135n.f38931x = this.f38946u;
            if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i3 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            c10135n.f38932y = this.f38947v;
            if ((this.f38934i & 8192) == 8192) {
                this.f38948w = Collections.unmodifiableList(this.f38948w);
                this.f38934i &= -8193;
            }
            c10135n.f38933z = this.f38948w;
            c10135n.f38918k = i3;
            return c10135n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34916w().mo34096m(m34930u());
        }
    }

    static {
        C10135n c10135n = new C10135n(true);
        f38913h = c10135n;
        c10135n.m34877z0();
    }

    /* renamed from: A0 */
    public static b m34855A0() {
        return b.m34916w();
    }

    /* renamed from: B0 */
    public static b m34857B0(C10135n c10135n) {
        return m34855A0().mo34096m(c10135n);
    }

    /* renamed from: Z */
    public static C10135n m34876Z() {
        return f38913h;
    }

    /* renamed from: z0 */
    private void m34877z0() {
        this.f38919l = 518;
        this.f38920m = 2054;
        this.f38921n = 0;
        this.f38922o = C10138q.m35022Y();
        this.f38923p = 0;
        this.f38924q = Collections.emptyList();
        this.f38925r = C10138q.m35022Y();
        this.f38926s = 0;
        this.f38927t = Collections.emptyList();
        this.f38928u = Collections.emptyList();
        this.f38930w = C10142u.m35252I();
        this.f38931x = 0;
        this.f38932y = 0;
        this.f38933z = Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34855A0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34857B0(this);
    }

    /* renamed from: U */
    public C10138q m34880U(int i2) {
        return this.f38927t.get(i2);
    }

    /* renamed from: V */
    public int m34881V() {
        return this.f38927t.size();
    }

    /* renamed from: X */
    public List<Integer> m34882X() {
        return this.f38928u;
    }

    /* renamed from: Y */
    public List<C10138q> m34883Y() {
        return this.f38927t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C10135n mo34461b() {
        return f38913h;
    }

    /* renamed from: b0 */
    public int m34885b0() {
        return this.f38919l;
    }

    /* renamed from: c0 */
    public int m34886c0() {
        return this.f38931x;
    }

    /* renamed from: d0 */
    public int m34887d0() {
        return this.f38921n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38916B;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f38918k & 2) == 2 ? CodedOutputStream.m38189o(1, this.f38920m) + 0 : 0;
        if ((this.f38918k & 4) == 4) {
            iM38189o += CodedOutputStream.m38189o(2, this.f38921n);
        }
        if ((this.f38918k & 8) == 8) {
            iM38189o += CodedOutputStream.m38193s(3, this.f38922o);
        }
        for (int i3 = 0; i3 < this.f38924q.size(); i3++) {
            iM38189o += CodedOutputStream.m38193s(4, this.f38924q.get(i3));
        }
        if ((this.f38918k & 32) == 32) {
            iM38189o += CodedOutputStream.m38193s(5, this.f38925r);
        }
        if ((this.f38918k & 128) == 128) {
            iM38189o += CodedOutputStream.m38193s(6, this.f38930w);
        }
        if ((this.f38918k & 256) == 256) {
            iM38189o += CodedOutputStream.m38189o(7, this.f38931x);
        }
        if ((this.f38918k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            iM38189o += CodedOutputStream.m38189o(8, this.f38932y);
        }
        if ((this.f38918k & 16) == 16) {
            iM38189o += CodedOutputStream.m38189o(9, this.f38923p);
        }
        if ((this.f38918k & 64) == 64) {
            iM38189o += CodedOutputStream.m38189o(10, this.f38926s);
        }
        if ((this.f38918k & 1) == 1) {
            iM38189o += CodedOutputStream.m38189o(11, this.f38919l);
        }
        for (int i4 = 0; i4 < this.f38927t.size(); i4++) {
            iM38189o += CodedOutputStream.m38193s(12, this.f38927t.get(i4));
        }
        int iM38190p = 0;
        for (int i5 = 0; i5 < this.f38928u.size(); i5++) {
            iM38190p += CodedOutputStream.m38190p(this.f38928u.get(i5).intValue());
        }
        int iM38190p2 = iM38189o + iM38190p;
        if (!m34882X().isEmpty()) {
            iM38190p2 = iM38190p2 + 1 + CodedOutputStream.m38190p(iM38190p);
        }
        this.f38929v = iM38190p;
        int iM38190p3 = 0;
        for (int i6 = 0; i6 < this.f38933z.size(); i6++) {
            iM38190p3 += CodedOutputStream.m38190p(this.f38933z.get(i6).intValue());
        }
        int size = iM38190p2 + iM38190p3 + (m34898o0().size() * 2) + m38400t() + this.f38917j.size();
        this.f38916B = size;
        return size;
    }

    /* renamed from: e0 */
    public int m34888e0() {
        return this.f38920m;
    }

    /* renamed from: f0 */
    public C10138q m34889f0() {
        return this.f38925r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10135n> mo34080g() {
        return f38914i;
    }

    /* renamed from: g0 */
    public int m34890g0() {
        return this.f38926s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f38918k & 2) == 2) {
            codedOutputStream.m38217a0(1, this.f38920m);
        }
        if ((this.f38918k & 4) == 4) {
            codedOutputStream.m38217a0(2, this.f38921n);
        }
        if ((this.f38918k & 8) == 8) {
            codedOutputStream.m38220d0(3, this.f38922o);
        }
        for (int i2 = 0; i2 < this.f38924q.size(); i2++) {
            codedOutputStream.m38220d0(4, this.f38924q.get(i2));
        }
        if ((this.f38918k & 32) == 32) {
            codedOutputStream.m38220d0(5, this.f38925r);
        }
        if ((this.f38918k & 128) == 128) {
            codedOutputStream.m38220d0(6, this.f38930w);
        }
        if ((this.f38918k & 256) == 256) {
            codedOutputStream.m38217a0(7, this.f38931x);
        }
        if ((this.f38918k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            codedOutputStream.m38217a0(8, this.f38932y);
        }
        if ((this.f38918k & 16) == 16) {
            codedOutputStream.m38217a0(9, this.f38923p);
        }
        if ((this.f38918k & 64) == 64) {
            codedOutputStream.m38217a0(10, this.f38926s);
        }
        if ((this.f38918k & 1) == 1) {
            codedOutputStream.m38217a0(11, this.f38919l);
        }
        for (int i3 = 0; i3 < this.f38927t.size(); i3++) {
            codedOutputStream.m38220d0(12, this.f38927t.get(i3));
        }
        if (m34882X().size() > 0) {
            codedOutputStream.m38231o0(106);
            codedOutputStream.m38231o0(this.f38929v);
        }
        for (int i4 = 0; i4 < this.f38928u.size(); i4++) {
            codedOutputStream.m38218b0(this.f38928u.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.f38933z.size(); i5++) {
            codedOutputStream.m38217a0(31, this.f38933z.get(i5).intValue());
        }
        aVarM38405y.m38406a(19000, codedOutputStream);
        codedOutputStream.m38225i0(this.f38917j);
    }

    /* renamed from: h0 */
    public C10138q m34891h0() {
        return this.f38922o;
    }

    /* renamed from: i0 */
    public int m34892i0() {
        return this.f38923p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38915A;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m34901r0()) {
            this.f38915A = (byte) 0;
            return false;
        }
        if (m34905v0() && !m34891h0().isInitialized()) {
            this.f38915A = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34896m0(); i2++) {
            if (!m34895l0(i2).isInitialized()) {
                this.f38915A = (byte) 0;
                return false;
            }
        }
        if (m34903t0() && !m34889f0().isInitialized()) {
            this.f38915A = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < m34881V(); i3++) {
            if (!m34880U(i3).isInitialized()) {
                this.f38915A = (byte) 0;
                return false;
            }
        }
        if (m34908y0() && !m34894k0().isInitialized()) {
            this.f38915A = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f38915A = (byte) 1;
            return true;
        }
        this.f38915A = (byte) 0;
        return false;
    }

    /* renamed from: j0 */
    public int m34893j0() {
        return this.f38932y;
    }

    /* renamed from: k0 */
    public C10142u m34894k0() {
        return this.f38930w;
    }

    /* renamed from: l0 */
    public C10140s m34895l0(int i2) {
        return this.f38924q.get(i2);
    }

    /* renamed from: m0 */
    public int m34896m0() {
        return this.f38924q.size();
    }

    /* renamed from: n0 */
    public List<C10140s> m34897n0() {
        return this.f38924q;
    }

    /* renamed from: o0 */
    public List<Integer> m34898o0() {
        return this.f38933z;
    }

    /* renamed from: p0 */
    public boolean m34899p0() {
        return (this.f38918k & 1) == 1;
    }

    /* renamed from: q0 */
    public boolean m34900q0() {
        return (this.f38918k & 256) == 256;
    }

    /* renamed from: r0 */
    public boolean m34901r0() {
        return (this.f38918k & 4) == 4;
    }

    /* renamed from: s0 */
    public boolean m34902s0() {
        return (this.f38918k & 2) == 2;
    }

    /* renamed from: t0 */
    public boolean m34903t0() {
        return (this.f38918k & 32) == 32;
    }

    /* renamed from: u0 */
    public boolean m34904u0() {
        return (this.f38918k & 64) == 64;
    }

    /* renamed from: v0 */
    public boolean m34905v0() {
        return (this.f38918k & 8) == 8;
    }

    /* renamed from: w0 */
    public boolean m34906w0() {
        return (this.f38918k & 16) == 16;
    }

    /* renamed from: x0 */
    public boolean m34907x0() {
        return (this.f38918k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    /* renamed from: y0 */
    public boolean m34908y0() {
        return (this.f38918k & 128) == 128;
    }

    private C10135n(AbstractC10749h.c<C10135n, ?> cVar) {
        super(cVar);
        this.f38929v = -1;
        this.f38915A = (byte) -1;
        this.f38916B = -1;
        this.f38917j = cVar.m38391l();
    }

    private C10135n(boolean z) {
        this.f38929v = -1;
        this.f38915A = (byte) -1;
        this.f38916B = -1;
        this.f38917j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C10135n(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38929v = -1;
        this.f38915A = (byte) -1;
        this.f38916B = -1;
        m34877z0();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? Mo38390p = 256;
            if (!z) {
                try {
                    try {
                        try {
                            int iM38320K = c10746e.m38320K();
                            switch (iM38320K) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f38918k |= 2;
                                    this.f38920m = c10746e.m38339s();
                                case 16:
                                    this.f38918k |= 4;
                                    this.f38921n = c10746e.m38339s();
                                case 26:
                                    C10138q.c cVarM35027B0 = (this.f38918k & 8) == 8 ? this.f38922o.mo34077d() : null;
                                    C10138q c10138q = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f38922o = c10138q;
                                    if (cVarM35027B0 != null) {
                                        cVarM35027B0.mo34096m(c10138q);
                                        this.f38922o = cVarM35027B0.m35110u();
                                    }
                                    this.f38918k |= 8;
                                case 34:
                                    if ((i2 & 32) != 32) {
                                        this.f38924q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.f38924q.add(c10746e.m38341u(C10140s.f39065i, c10747f));
                                case 42:
                                    C10138q.c cVarM35027B02 = (this.f38918k & 32) == 32 ? this.f38925r.mo34077d() : null;
                                    C10138q c10138q2 = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f38925r = c10138q2;
                                    if (cVarM35027B02 != null) {
                                        cVarM35027B02.mo34096m(c10138q2);
                                        this.f38925r = cVarM35027B02.m35110u();
                                    }
                                    this.f38918k |= 32;
                                case 50:
                                    C10142u.b bVarM35270b0 = (this.f38918k & 128) == 128 ? this.f38930w.mo34077d() : null;
                                    C10142u c10142u = (C10142u) c10746e.m38341u(C10142u.f39102i, c10747f);
                                    this.f38930w = c10142u;
                                    if (bVarM35270b0 != null) {
                                        bVarM35270b0.mo34096m(c10142u);
                                        this.f38930w = bVarM35270b0.m35284u();
                                    }
                                    this.f38918k |= 128;
                                case 56:
                                    this.f38918k |= 256;
                                    this.f38931x = c10746e.m38339s();
                                case 64:
                                    this.f38918k |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    this.f38932y = c10746e.m38339s();
                                case 72:
                                    this.f38918k |= 16;
                                    this.f38923p = c10746e.m38339s();
                                case 80:
                                    this.f38918k |= 64;
                                    this.f38926s = c10746e.m38339s();
                                case 88:
                                    this.f38918k |= 1;
                                    this.f38919l = c10746e.m38339s();
                                case 98:
                                    if ((i2 & 256) != 256) {
                                        this.f38927t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    this.f38927t.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                                case 104:
                                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                        this.f38928u = new ArrayList();
                                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    this.f38928u.add(Integer.valueOf(c10746e.m38339s()));
                                case 106:
                                    int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 && c10746e.m38327e() > 0) {
                                        this.f38928u = new ArrayList();
                                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    while (c10746e.m38327e() > 0) {
                                        this.f38928u.add(Integer.valueOf(c10746e.m38339s()));
                                    }
                                    c10746e.m38329i(iM38330j);
                                    break;
                                case 248:
                                    if ((i2 & 8192) != 8192) {
                                        this.f38933z = new ArrayList();
                                        i2 |= 8192;
                                    }
                                    this.f38933z.add(Integer.valueOf(c10746e.m38339s()));
                                case 250:
                                    int iM38330j2 = c10746e.m38330j(c10746e.m38311A());
                                    if ((i2 & 8192) != 8192 && c10746e.m38327e() > 0) {
                                        this.f38933z = new ArrayList();
                                        i2 |= 8192;
                                    }
                                    while (c10746e.m38327e() > 0) {
                                        this.f38933z.add(Integer.valueOf(c10746e.m38339s()));
                                    }
                                    c10746e.m38329i(iM38330j2);
                                    break;
                                default:
                                    Mo38390p = mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K);
                                    if (Mo38390p == 0) {
                                        z = true;
                                    }
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).m38253i(this);
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        throw e3.m38253i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.f38924q = Collections.unmodifiableList(this.f38924q);
                    }
                    if ((i2 & 256) == Mo38390p) {
                        this.f38927t = Collections.unmodifiableList(this.f38927t);
                    }
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.f38928u = Collections.unmodifiableList(this.f38928u);
                    }
                    if ((i2 & 8192) == 8192) {
                        this.f38933z = Collections.unmodifiableList(this.f38933z);
                    }
                    try {
                        codedOutputStreamM38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38917j = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38917j = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } else {
                if ((i2 & 32) == 32) {
                    this.f38924q = Collections.unmodifiableList(this.f38924q);
                }
                if ((i2 & 256) == 256) {
                    this.f38927t = Collections.unmodifiableList(this.f38927t);
                }
                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.f38928u = Collections.unmodifiableList(this.f38928u);
                }
                if ((i2 & 8192) == 8192) {
                    this.f38933z = Collections.unmodifiableList(this.f38933z);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f38917j = bVarM38280w.m38299e();
                    throw th3;
                }
                this.f38917j = bVarM38280w.m38299e();
                mo38389m();
                return;
            }
        }
    }
}
