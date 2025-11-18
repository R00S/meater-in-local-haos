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
import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.q */
/* loaded from: classes3.dex */
public final class C10138q extends AbstractC10749h.d<C10138q> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10138q f38984h;

    /* renamed from: i */
    public static InterfaceC10758q<C10138q> f38985i = new a();

    /* renamed from: A */
    private int f38986A;

    /* renamed from: j */
    private final AbstractC10745d f38987j;

    /* renamed from: k */
    private int f38988k;

    /* renamed from: l */
    private List<b> f38989l;

    /* renamed from: m */
    private boolean f38990m;

    /* renamed from: n */
    private int f38991n;

    /* renamed from: o */
    private C10138q f38992o;

    /* renamed from: p */
    private int f38993p;

    /* renamed from: q */
    private int f38994q;

    /* renamed from: r */
    private int f38995r;

    /* renamed from: s */
    private int f38996s;

    /* renamed from: t */
    private int f38997t;

    /* renamed from: u */
    private C10138q f38998u;

    /* renamed from: v */
    private int f38999v;

    /* renamed from: w */
    private C10138q f39000w;

    /* renamed from: x */
    private int f39001x;

    /* renamed from: y */
    private int f39002y;

    /* renamed from: z */
    private byte f39003z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.q$a */
    static class a extends AbstractC10743b<C10138q> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10138q mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10138q(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.q$c */
    public static final class c extends AbstractC10749h.c<C10138q, c> implements InterfaceC10757p {

        /* renamed from: i */
        private int f39024i;

        /* renamed from: k */
        private boolean f39026k;

        /* renamed from: l */
        private int f39027l;

        /* renamed from: n */
        private int f39029n;

        /* renamed from: o */
        private int f39030o;

        /* renamed from: p */
        private int f39031p;

        /* renamed from: q */
        private int f39032q;

        /* renamed from: r */
        private int f39033r;

        /* renamed from: t */
        private int f39035t;

        /* renamed from: v */
        private int f39037v;

        /* renamed from: w */
        private int f39038w;

        /* renamed from: j */
        private List<b> f39025j = Collections.emptyList();

        /* renamed from: m */
        private C10138q f39028m = C10138q.m35022Y();

        /* renamed from: s */
        private C10138q f39034s = C10138q.m35022Y();

        /* renamed from: u */
        private C10138q f39036u = C10138q.m35022Y();

        private c() {
            m35091B();
        }

        /* renamed from: A */
        private void m35090A() {
            if ((this.f39024i & 1) != 1) {
                this.f39025j = new ArrayList(this.f39025j);
                this.f39024i |= 1;
            }
        }

        /* renamed from: B */
        private void m35091B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static c m35093w() {
            return new c();
        }

        /* renamed from: C */
        public c m35094C(C10138q c10138q) {
            if ((this.f39024i & RecyclerView.AbstractC0599l.FLAG_MOVED) != 2048 || this.f39036u == C10138q.m35022Y()) {
                this.f39036u = c10138q;
            } else {
                this.f39036u = C10138q.m35025z0(this.f39036u).mo34096m(c10138q).m35110u();
            }
            this.f39024i |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            return this;
        }

        /* renamed from: D */
        public c m35095D(C10138q c10138q) {
            if ((this.f39024i & 8) != 8 || this.f39028m == C10138q.m35022Y()) {
                this.f39028m = c10138q;
            } else {
                this.f39028m = C10138q.m35025z0(this.f39028m).mo34096m(c10138q).m35110u();
            }
            this.f39024i |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c mo34096m(C10138q c10138q) {
            if (c10138q == C10138q.m35022Y()) {
                return this;
            }
            if (!c10138q.f38989l.isEmpty()) {
                if (this.f39025j.isEmpty()) {
                    this.f39025j = c10138q.f38989l;
                    this.f39024i &= -2;
                } else {
                    m35090A();
                    this.f39025j.addAll(c10138q.f38989l);
                }
            }
            if (c10138q.m35052r0()) {
                m35104M(c10138q.m35039e0());
            }
            if (c10138q.m35049o0()) {
                m35102K(c10138q.m35036b0());
            }
            if (c10138q.m35050p0()) {
                m35095D(c10138q.m35037c0());
            }
            if (c10138q.m35051q0()) {
                m35103L(c10138q.m35038d0());
            }
            if (c10138q.m35047m0()) {
                m35100I(c10138q.m35033X());
            }
            if (c10138q.m35056v0()) {
                m35107P(c10138q.m35043i0());
            }
            if (c10138q.m35057w0()) {
                m35108Q(c10138q.m35044j0());
            }
            if (c10138q.m35055u0()) {
                m35106O(c10138q.m35042h0());
            }
            if (c10138q.m35053s0()) {
                m35098G(c10138q.m35040f0());
            }
            if (c10138q.m35054t0()) {
                m35105N(c10138q.m35041g0());
            }
            if (c10138q.m35045k0()) {
                m35094C(c10138q.m35028R());
            }
            if (c10138q.m35046l0()) {
                m35099H(c10138q.m35029S());
            }
            if (c10138q.m35048n0()) {
                m35101J(c10138q.m35035a0());
            }
            m38396r(c10138q);
            m38392n(m38391l().m38286f(c10138q.f38987j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.c mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.q> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.f38985i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.q r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10138q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.q r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10138q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.c.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.q$c");
        }

        /* renamed from: G */
        public c m35098G(C10138q c10138q) {
            if ((this.f39024i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 || this.f39034s == C10138q.m35022Y()) {
                this.f39034s = c10138q;
            } else {
                this.f39034s = C10138q.m35025z0(this.f39034s).mo34096m(c10138q).m35110u();
            }
            this.f39024i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            return this;
        }

        /* renamed from: H */
        public c m35099H(int i2) {
            this.f39024i |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f39037v = i2;
            return this;
        }

        /* renamed from: I */
        public c m35100I(int i2) {
            this.f39024i |= 32;
            this.f39030o = i2;
            return this;
        }

        /* renamed from: J */
        public c m35101J(int i2) {
            this.f39024i |= 8192;
            this.f39038w = i2;
            return this;
        }

        /* renamed from: K */
        public c m35102K(int i2) {
            this.f39024i |= 4;
            this.f39027l = i2;
            return this;
        }

        /* renamed from: L */
        public c m35103L(int i2) {
            this.f39024i |= 16;
            this.f39029n = i2;
            return this;
        }

        /* renamed from: M */
        public c m35104M(boolean z) {
            this.f39024i |= 2;
            this.f39026k = z;
            return this;
        }

        /* renamed from: N */
        public c m35105N(int i2) {
            this.f39024i |= 1024;
            this.f39035t = i2;
            return this;
        }

        /* renamed from: O */
        public c m35106O(int i2) {
            this.f39024i |= 256;
            this.f39033r = i2;
            return this;
        }

        /* renamed from: P */
        public c m35107P(int i2) {
            this.f39024i |= 64;
            this.f39031p = i2;
            return this;
        }

        /* renamed from: Q */
        public c m35108Q(int i2) {
            this.f39024i |= 128;
            this.f39032q = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10138q mo34093c() {
            C10138q c10138qM35110u = m35110u();
            if (c10138qM35110u.isInitialized()) {
                return c10138qM35110u;
            }
            throw AbstractC10742a.a.m38257j(c10138qM35110u);
        }

        /* renamed from: u */
        public C10138q m35110u() {
            C10138q c10138q = new C10138q(this);
            int i2 = this.f39024i;
            if ((i2 & 1) == 1) {
                this.f39025j = Collections.unmodifiableList(this.f39025j);
                this.f39024i &= -2;
            }
            c10138q.f38989l = this.f39025j;
            int i3 = (i2 & 2) != 2 ? 0 : 1;
            c10138q.f38990m = this.f39026k;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            c10138q.f38991n = this.f39027l;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            c10138q.f38992o = this.f39028m;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            c10138q.f38993p = this.f39029n;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            c10138q.f38994q = this.f39030o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            c10138q.f38995r = this.f39031p;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            c10138q.f38996s = this.f39032q;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            c10138q.f38997t = this.f39033r;
            if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i3 |= 256;
            }
            c10138q.f38998u = this.f39034s;
            if ((i2 & 1024) == 1024) {
                i3 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            c10138q.f38999v = this.f39035t;
            if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                i3 |= 1024;
            }
            c10138q.f39000w = this.f39036u;
            if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i3 |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            }
            c10138q.f39001x = this.f39037v;
            if ((i2 & 8192) == 8192) {
                i3 |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            c10138q.f39002y = this.f39038w;
            c10138q.f38988k = i3;
            return c10138q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo34095k() {
            return m35093w().mo34096m(m35110u());
        }
    }

    static {
        C10138q c10138q = new C10138q(true);
        f38984h = c10138q;
        c10138q.m35023x0();
    }

    /* renamed from: Y */
    public static C10138q m35022Y() {
        return f38984h;
    }

    /* renamed from: x0 */
    private void m35023x0() {
        this.f38989l = Collections.emptyList();
        this.f38990m = false;
        this.f38991n = 0;
        this.f38992o = m35022Y();
        this.f38993p = 0;
        this.f38994q = 0;
        this.f38995r = 0;
        this.f38996s = 0;
        this.f38997t = 0;
        this.f38998u = m35022Y();
        this.f38999v = 0;
        this.f39000w = m35022Y();
        this.f39001x = 0;
        this.f39002y = 0;
    }

    /* renamed from: y0 */
    public static c m35024y0() {
        return c.m35093w();
    }

    /* renamed from: z0 */
    public static c m35025z0(C10138q c10138q) {
        return m35024y0().mo34096m(c10138q);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public c mo34079f() {
        return m35024y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c mo34077d() {
        return m35025z0(this);
    }

    /* renamed from: R */
    public C10138q m35028R() {
        return this.f39000w;
    }

    /* renamed from: S */
    public int m35029S() {
        return this.f39001x;
    }

    /* renamed from: T */
    public b m35030T(int i2) {
        return this.f38989l.get(i2);
    }

    /* renamed from: U */
    public int m35031U() {
        return this.f38989l.size();
    }

    /* renamed from: V */
    public List<b> m35032V() {
        return this.f38989l;
    }

    /* renamed from: X */
    public int m35033X() {
        return this.f38994q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C10138q mo34461b() {
        return f38984h;
    }

    /* renamed from: a0 */
    public int m35035a0() {
        return this.f39002y;
    }

    /* renamed from: b0 */
    public int m35036b0() {
        return this.f38991n;
    }

    /* renamed from: c0 */
    public C10138q m35037c0() {
        return this.f38992o;
    }

    /* renamed from: d0 */
    public int m35038d0() {
        return this.f38993p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38986A;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f38988k & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? CodedOutputStream.m38189o(1, this.f39002y) + 0 : 0;
        for (int i3 = 0; i3 < this.f38989l.size(); i3++) {
            iM38189o += CodedOutputStream.m38193s(2, this.f38989l.get(i3));
        }
        if ((this.f38988k & 1) == 1) {
            iM38189o += CodedOutputStream.m38175a(3, this.f38990m);
        }
        if ((this.f38988k & 2) == 2) {
            iM38189o += CodedOutputStream.m38189o(4, this.f38991n);
        }
        if ((this.f38988k & 4) == 4) {
            iM38189o += CodedOutputStream.m38193s(5, this.f38992o);
        }
        if ((this.f38988k & 16) == 16) {
            iM38189o += CodedOutputStream.m38189o(6, this.f38994q);
        }
        if ((this.f38988k & 32) == 32) {
            iM38189o += CodedOutputStream.m38189o(7, this.f38995r);
        }
        if ((this.f38988k & 8) == 8) {
            iM38189o += CodedOutputStream.m38189o(8, this.f38993p);
        }
        if ((this.f38988k & 64) == 64) {
            iM38189o += CodedOutputStream.m38189o(9, this.f38996s);
        }
        if ((this.f38988k & 256) == 256) {
            iM38189o += CodedOutputStream.m38193s(10, this.f38998u);
        }
        if ((this.f38988k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            iM38189o += CodedOutputStream.m38189o(11, this.f38999v);
        }
        if ((this.f38988k & 128) == 128) {
            iM38189o += CodedOutputStream.m38189o(12, this.f38997t);
        }
        if ((this.f38988k & 1024) == 1024) {
            iM38189o += CodedOutputStream.m38193s(13, this.f39000w);
        }
        if ((this.f38988k & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
            iM38189o += CodedOutputStream.m38189o(14, this.f39001x);
        }
        int iM38400t = iM38189o + m38400t() + this.f38987j.size();
        this.f38986A = iM38400t;
        return iM38400t;
    }

    /* renamed from: e0 */
    public boolean m35039e0() {
        return this.f38990m;
    }

    /* renamed from: f0 */
    public C10138q m35040f0() {
        return this.f38998u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10138q> mo34080g() {
        return f38985i;
    }

    /* renamed from: g0 */
    public int m35041g0() {
        return this.f38999v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f38988k & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            codedOutputStream.m38217a0(1, this.f39002y);
        }
        for (int i2 = 0; i2 < this.f38989l.size(); i2++) {
            codedOutputStream.m38220d0(2, this.f38989l.get(i2));
        }
        if ((this.f38988k & 1) == 1) {
            codedOutputStream.m38202L(3, this.f38990m);
        }
        if ((this.f38988k & 2) == 2) {
            codedOutputStream.m38217a0(4, this.f38991n);
        }
        if ((this.f38988k & 4) == 4) {
            codedOutputStream.m38220d0(5, this.f38992o);
        }
        if ((this.f38988k & 16) == 16) {
            codedOutputStream.m38217a0(6, this.f38994q);
        }
        if ((this.f38988k & 32) == 32) {
            codedOutputStream.m38217a0(7, this.f38995r);
        }
        if ((this.f38988k & 8) == 8) {
            codedOutputStream.m38217a0(8, this.f38993p);
        }
        if ((this.f38988k & 64) == 64) {
            codedOutputStream.m38217a0(9, this.f38996s);
        }
        if ((this.f38988k & 256) == 256) {
            codedOutputStream.m38220d0(10, this.f38998u);
        }
        if ((this.f38988k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            codedOutputStream.m38217a0(11, this.f38999v);
        }
        if ((this.f38988k & 128) == 128) {
            codedOutputStream.m38217a0(12, this.f38997t);
        }
        if ((this.f38988k & 1024) == 1024) {
            codedOutputStream.m38220d0(13, this.f39000w);
        }
        if ((this.f38988k & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
            codedOutputStream.m38217a0(14, this.f39001x);
        }
        aVarM38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f38987j);
    }

    /* renamed from: h0 */
    public int m35042h0() {
        return this.f38997t;
    }

    /* renamed from: i0 */
    public int m35043i0() {
        return this.f38995r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f39003z;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m35031U(); i2++) {
            if (!m35030T(i2).isInitialized()) {
                this.f39003z = (byte) 0;
                return false;
            }
        }
        if (m35050p0() && !m35037c0().isInitialized()) {
            this.f39003z = (byte) 0;
            return false;
        }
        if (m35053s0() && !m35040f0().isInitialized()) {
            this.f39003z = (byte) 0;
            return false;
        }
        if (m35045k0() && !m35028R().isInitialized()) {
            this.f39003z = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f39003z = (byte) 1;
            return true;
        }
        this.f39003z = (byte) 0;
        return false;
    }

    /* renamed from: j0 */
    public int m35044j0() {
        return this.f38996s;
    }

    /* renamed from: k0 */
    public boolean m35045k0() {
        return (this.f38988k & 1024) == 1024;
    }

    /* renamed from: l0 */
    public boolean m35046l0() {
        return (this.f38988k & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048;
    }

    /* renamed from: m0 */
    public boolean m35047m0() {
        return (this.f38988k & 16) == 16;
    }

    /* renamed from: n0 */
    public boolean m35048n0() {
        return (this.f38988k & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
    }

    /* renamed from: o0 */
    public boolean m35049o0() {
        return (this.f38988k & 2) == 2;
    }

    /* renamed from: p0 */
    public boolean m35050p0() {
        return (this.f38988k & 4) == 4;
    }

    /* renamed from: q0 */
    public boolean m35051q0() {
        return (this.f38988k & 8) == 8;
    }

    /* renamed from: r0 */
    public boolean m35052r0() {
        return (this.f38988k & 1) == 1;
    }

    /* renamed from: s0 */
    public boolean m35053s0() {
        return (this.f38988k & 256) == 256;
    }

    /* renamed from: t0 */
    public boolean m35054t0() {
        return (this.f38988k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    /* renamed from: u0 */
    public boolean m35055u0() {
        return (this.f38988k & 128) == 128;
    }

    /* renamed from: v0 */
    public boolean m35056v0() {
        return (this.f38988k & 32) == 32;
    }

    /* renamed from: w0 */
    public boolean m35057w0() {
        return (this.f38988k & 64) == 64;
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.q$b */
    public static final class b extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private static final b f39004g;

        /* renamed from: h */
        public static InterfaceC10758q<b> f39005h = new a();

        /* renamed from: i */
        private final AbstractC10745d f39006i;

        /* renamed from: j */
        private int f39007j;

        /* renamed from: k */
        private c f39008k;

        /* renamed from: l */
        private C10138q f39009l;

        /* renamed from: m */
        private int f39010m;

        /* renamed from: n */
        private byte f39011n;

        /* renamed from: o */
        private int f39012o;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.q$b$a */
        static class a extends AbstractC10743b<b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                return new b(c10746e, c10747f);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.q$b$b, reason: collision with other inner class name */
        public static final class C11558b extends AbstractC10749h.b<b, C11558b> implements InterfaceC10757p {

            /* renamed from: g */
            private int f39013g;

            /* renamed from: h */
            private c f39014h = c.INV;

            /* renamed from: i */
            private C10138q f39015i = C10138q.m35022Y();

            /* renamed from: j */
            private int f39016j;

            private C11558b() {
                m35079t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static C11558b m35078s() {
                return new C11558b();
            }

            /* renamed from: t */
            private void m35079t() {
            }

            /* renamed from: A */
            public C11558b m35080A(c cVar) {
                cVar.getClass();
                this.f39013g |= 1;
                this.f39014h = cVar;
                return this;
            }

            /* renamed from: B */
            public C11558b m35081B(int i2) {
                this.f39013g |= 4;
                this.f39016j = i2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b mo34093c() {
                b bVarM35083q = m35083q();
                if (bVarM35083q.isInitialized()) {
                    return bVarM35083q;
                }
                throw AbstractC10742a.a.m38257j(bVarM35083q);
            }

            /* renamed from: q */
            public b m35083q() {
                b bVar = new b(this);
                int i2 = this.f39013g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                bVar.f39008k = this.f39014h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.f39009l = this.f39015i;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                bVar.f39010m = this.f39016j;
                bVar.f39007j = i3;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C11558b mo34095k() {
                return m35078s().mo34096m(m35083q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C11558b mo34096m(b bVar) {
                if (bVar == b.m35067w()) {
                    return this;
                }
                if (bVar.m35068A()) {
                    m35080A(bVar.m35073x());
                }
                if (bVar.m35069B()) {
                    m35087w(bVar.m35074y());
                }
                if (bVar.m35070C()) {
                    m35081B(bVar.m35075z());
                }
                m38392n(m38391l().m38286f(bVar.f39006i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.b.C11558b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.q$b> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.b.f39005h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.q$b r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.y.e.j0.e.q$b r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10138q.b.C11558b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.q$b$b");
            }

            /* renamed from: w */
            public C11558b m35087w(C10138q c10138q) {
                if ((this.f39013g & 2) != 2 || this.f39015i == C10138q.m35022Y()) {
                    this.f39015i = c10138q;
                } else {
                    this.f39015i = C10138q.m35025z0(this.f39015i).mo34096m(c10138q).m35110u();
                }
                this.f39013g |= 2;
                return this;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.q$b$c */
        public enum c implements C10750i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* renamed from: j */
            private static C10750i.b<c> f39021j = new a();

            /* renamed from: l */
            private final int f39023l;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.q$b$c$a */
            static class a implements C10750i.b<c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public c mo34236a(int i2) {
                    return c.m35088g(i2);
                }
            }

            c(int i2, int i3) {
                this.f39023l = i3;
            }

            /* renamed from: g */
            public static c m35088g(int i2) {
                if (i2 == 0) {
                    return IN;
                }
                if (i2 == 1) {
                    return OUT;
                }
                if (i2 == 2) {
                    return INV;
                }
                if (i2 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
            /* renamed from: f */
            public final int mo34235f() {
                return this.f39023l;
            }
        }

        static {
            b bVar = new b(true);
            f39004g = bVar;
            bVar.m35059D();
        }

        /* renamed from: D */
        private void m35059D() {
            this.f39008k = c.INV;
            this.f39009l = C10138q.m35022Y();
            this.f39010m = 0;
        }

        /* renamed from: E */
        public static C11558b m35060E() {
            return C11558b.m35078s();
        }

        /* renamed from: F */
        public static C11558b m35061F(b bVar) {
            return m35060E().mo34096m(bVar);
        }

        /* renamed from: w */
        public static b m35067w() {
            return f39004g;
        }

        /* renamed from: A */
        public boolean m35068A() {
            return (this.f39007j & 1) == 1;
        }

        /* renamed from: B */
        public boolean m35069B() {
            return (this.f39007j & 2) == 2;
        }

        /* renamed from: C */
        public boolean m35070C() {
            return (this.f39007j & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C11558b mo34079f() {
            return m35060E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public C11558b mo34077d() {
            return m35061F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f39012o;
            if (i2 != -1) {
                return i2;
            }
            int iM38182h = (this.f39007j & 1) == 1 ? 0 + CodedOutputStream.m38182h(1, this.f39008k.mo34235f()) : 0;
            if ((this.f39007j & 2) == 2) {
                iM38182h += CodedOutputStream.m38193s(2, this.f39009l);
            }
            if ((this.f39007j & 4) == 4) {
                iM38182h += CodedOutputStream.m38189o(3, this.f39010m);
            }
            int size = iM38182h + this.f39006i.size();
            this.f39012o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: g */
        public InterfaceC10758q<b> mo34080g() {
            return f39005h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            if ((this.f39007j & 1) == 1) {
                codedOutputStream.m38209S(1, this.f39008k.mo34235f());
            }
            if ((this.f39007j & 2) == 2) {
                codedOutputStream.m38220d0(2, this.f39009l);
            }
            if ((this.f39007j & 4) == 4) {
                codedOutputStream.m38217a0(3, this.f39010m);
            }
            codedOutputStream.m38225i0(this.f39006i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
        public final boolean isInitialized() {
            byte b2 = this.f39011n;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!m35069B() || m35074y().isInitialized()) {
                this.f39011n = (byte) 1;
                return true;
            }
            this.f39011n = (byte) 0;
            return false;
        }

        /* renamed from: x */
        public c m35073x() {
            return this.f39008k;
        }

        /* renamed from: y */
        public C10138q m35074y() {
            return this.f39009l;
        }

        /* renamed from: z */
        public int m35075z() {
            return this.f39010m;
        }

        private b(AbstractC10749h.b bVar) {
            super(bVar);
            this.f39011n = (byte) -1;
            this.f39012o = -1;
            this.f39006i = bVar.m38391l();
        }

        private b(boolean z) {
            this.f39011n = (byte) -1;
            this.f39012o = -1;
            this.f39006i = AbstractC10745d.f41263f;
        }

        private b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            this.f39011n = (byte) -1;
            this.f39012o = -1;
            m35059D();
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
                                    int iM38334n = c10746e.m38334n();
                                    c cVarM35088g = c.m35088g(iM38334n);
                                    if (cVarM35088g == null) {
                                        codedOutputStreamM38173J.m38231o0(iM38320K);
                                        codedOutputStreamM38173J.m38231o0(iM38334n);
                                    } else {
                                        this.f39007j |= 1;
                                        this.f39008k = cVarM35088g;
                                    }
                                } else if (iM38320K == 18) {
                                    c cVarMo34077d = (this.f39007j & 2) == 2 ? this.f39009l.mo34077d() : null;
                                    C10138q c10138q = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f39009l = c10138q;
                                    if (cVarMo34077d != null) {
                                        cVarMo34077d.mo34096m(c10138q);
                                        this.f39009l = cVarMo34077d.m35110u();
                                    }
                                    this.f39007j |= 2;
                                } else if (iM38320K != 24) {
                                    if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                    }
                                } else {
                                    this.f39007j |= 4;
                                    this.f39010m = c10746e.m38339s();
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
                    try {
                        codedOutputStreamM38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f39006i = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f39006i = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            try {
                codedOutputStreamM38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f39006i = bVarM38280w.m38299e();
                throw th3;
            }
            this.f39006i = bVarM38280w.m38299e();
            mo38389m();
        }
    }

    private C10138q(AbstractC10749h.c<C10138q, ?> cVar) {
        super(cVar);
        this.f39003z = (byte) -1;
        this.f38986A = -1;
        this.f38987j = cVar.m38391l();
    }

    private C10138q(boolean z) {
        this.f39003z = (byte) -1;
        this.f38986A = -1;
        this.f38987j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10138q(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        c cVarMo34077d;
        this.f39003z = (byte) -1;
        this.f38986A = -1;
        m35023x0();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM38320K = c10746e.m38320K();
                    switch (iM38320K) {
                        case 0:
                            z = true;
                        case 8:
                            this.f38988k |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                            this.f39002y = c10746e.m38339s();
                        case 18:
                            if (!(z2 & true)) {
                                this.f38989l = new ArrayList();
                                z2 |= true;
                            }
                            this.f38989l.add(c10746e.m38341u(b.f39005h, c10747f));
                        case 24:
                            this.f38988k |= 1;
                            this.f38990m = c10746e.m38331k();
                        case 32:
                            this.f38988k |= 2;
                            this.f38991n = c10746e.m38339s();
                        case 42:
                            cVarMo34077d = (this.f38988k & 4) == 4 ? this.f38992o.mo34077d() : null;
                            C10138q c10138q = (C10138q) c10746e.m38341u(f38985i, c10747f);
                            this.f38992o = c10138q;
                            if (cVarMo34077d != null) {
                                cVarMo34077d.mo34096m(c10138q);
                                this.f38992o = cVarMo34077d.m35110u();
                            }
                            this.f38988k |= 4;
                        case 48:
                            this.f38988k |= 16;
                            this.f38994q = c10746e.m38339s();
                        case 56:
                            this.f38988k |= 32;
                            this.f38995r = c10746e.m38339s();
                        case 64:
                            this.f38988k |= 8;
                            this.f38993p = c10746e.m38339s();
                        case 72:
                            this.f38988k |= 64;
                            this.f38996s = c10746e.m38339s();
                        case 82:
                            cVarMo34077d = (this.f38988k & 256) == 256 ? this.f38998u.mo34077d() : null;
                            C10138q c10138q2 = (C10138q) c10746e.m38341u(f38985i, c10747f);
                            this.f38998u = c10138q2;
                            if (cVarMo34077d != null) {
                                cVarMo34077d.mo34096m(c10138q2);
                                this.f38998u = cVarMo34077d.m35110u();
                            }
                            this.f38988k |= 256;
                        case 88:
                            this.f38988k |= AdRequest.MAX_CONTENT_URL_LENGTH;
                            this.f38999v = c10746e.m38339s();
                        case 96:
                            this.f38988k |= 128;
                            this.f38997t = c10746e.m38339s();
                        case 106:
                            cVarMo34077d = (this.f38988k & 1024) == 1024 ? this.f39000w.mo34077d() : null;
                            C10138q c10138q3 = (C10138q) c10746e.m38341u(f38985i, c10747f);
                            this.f39000w = c10138q3;
                            if (cVarMo34077d != null) {
                                cVarMo34077d.mo34096m(c10138q3);
                                this.f39000w = cVarMo34077d.m35110u();
                            }
                            this.f38988k |= 1024;
                        case 112:
                            this.f38988k |= RecyclerView.AbstractC0599l.FLAG_MOVED;
                            this.f39001x = c10746e.m38339s();
                        default:
                            if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                z = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.m38253i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f38989l = Collections.unmodifiableList(this.f38989l);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38987j = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38987j = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f38989l = Collections.unmodifiableList(this.f38989l);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38987j = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38987j = bVarM38280w.m38299e();
        mo38389m();
    }
}
