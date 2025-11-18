package kotlin.reflect.p371y.internal.p374j0.p392e;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
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
import kotlin.reflect.p371y.internal.p374j0.p392e.C10126e;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.i */
/* loaded from: classes3.dex */
public final class C10130i extends AbstractC10749h.d<C10130i> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10130i f38831h;

    /* renamed from: i */
    public static InterfaceC10758q<C10130i> f38832i = new a();

    /* renamed from: A */
    private byte f38833A;

    /* renamed from: B */
    private int f38834B;

    /* renamed from: j */
    private final AbstractC10745d f38835j;

    /* renamed from: k */
    private int f38836k;

    /* renamed from: l */
    private int f38837l;

    /* renamed from: m */
    private int f38838m;

    /* renamed from: n */
    private int f38839n;

    /* renamed from: o */
    private C10138q f38840o;

    /* renamed from: p */
    private int f38841p;

    /* renamed from: q */
    private List<C10140s> f38842q;

    /* renamed from: r */
    private C10138q f38843r;

    /* renamed from: s */
    private int f38844s;

    /* renamed from: t */
    private List<C10138q> f38845t;

    /* renamed from: u */
    private List<Integer> f38846u;

    /* renamed from: v */
    private int f38847v;

    /* renamed from: w */
    private List<C10142u> f38848w;

    /* renamed from: x */
    private C10141t f38849x;

    /* renamed from: y */
    private List<Integer> f38850y;

    /* renamed from: z */
    private C10126e f38851z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.i$a */
    static class a extends AbstractC10743b<C10130i> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10130i mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10130i(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.i$b */
    public static final class b extends AbstractC10749h.c<C10130i, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f38852i;

        /* renamed from: l */
        private int f38855l;

        /* renamed from: n */
        private int f38857n;

        /* renamed from: q */
        private int f38860q;

        /* renamed from: j */
        private int f38853j = 6;

        /* renamed from: k */
        private int f38854k = 6;

        /* renamed from: m */
        private C10138q f38856m = C10138q.m35022Y();

        /* renamed from: o */
        private List<C10140s> f38858o = Collections.emptyList();

        /* renamed from: p */
        private C10138q f38859p = C10138q.m35022Y();

        /* renamed from: r */
        private List<C10138q> f38861r = Collections.emptyList();

        /* renamed from: s */
        private List<Integer> f38862s = Collections.emptyList();

        /* renamed from: t */
        private List<C10142u> f38863t = Collections.emptyList();

        /* renamed from: u */
        private C10141t f38864u = C10141t.m35225w();

        /* renamed from: v */
        private List<Integer> f38865v = Collections.emptyList();

        /* renamed from: w */
        private C10126e f38866w = C10126e.m34560u();

        private b() {
            m34751F();
        }

        /* renamed from: A */
        private void m34746A() {
            if ((this.f38852i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.f38862s = new ArrayList(this.f38862s);
                this.f38852i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        /* renamed from: B */
        private void m34747B() {
            if ((this.f38852i & 256) != 256) {
                this.f38861r = new ArrayList(this.f38861r);
                this.f38852i |= 256;
            }
        }

        /* renamed from: C */
        private void m34748C() {
            if ((this.f38852i & 32) != 32) {
                this.f38858o = new ArrayList(this.f38858o);
                this.f38852i |= 32;
            }
        }

        /* renamed from: D */
        private void m34749D() {
            if ((this.f38852i & 1024) != 1024) {
                this.f38863t = new ArrayList(this.f38863t);
                this.f38852i |= 1024;
            }
        }

        /* renamed from: E */
        private void m34750E() {
            if ((this.f38852i & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f38865v = new ArrayList(this.f38865v);
                this.f38852i |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        /* renamed from: F */
        private void m34751F() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34753w() {
            return new b();
        }

        /* renamed from: G */
        public b m34754G(C10126e c10126e) {
            if ((this.f38852i & 8192) != 8192 || this.f38866w == C10126e.m34560u()) {
                this.f38866w = c10126e;
            } else {
                this.f38866w = C10126e.m34563z(this.f38866w).mo34096m(c10126e).m34574q();
            }
            this.f38852i |= 8192;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10130i c10130i) {
            if (c10130i == C10130i.m34712b0()) {
                return this;
            }
            if (c10130i.m34738t0()) {
                m34760M(c10130i.m34722d0());
            }
            if (c10130i.m34740v0()) {
                m34762O(c10130i.m34724f0());
            }
            if (c10130i.m34739u0()) {
                m34761N(c10130i.m34723e0());
            }
            if (c10130i.m34743y0()) {
                m34758K(c10130i.m34727i0());
            }
            if (c10130i.m34744z0()) {
                m34764Q(c10130i.m34728j0());
            }
            if (!c10130i.f38842q.isEmpty()) {
                if (this.f38858o.isEmpty()) {
                    this.f38858o = c10130i.f38842q;
                    this.f38852i &= -33;
                } else {
                    m34748C();
                    this.f38858o.addAll(c10130i.f38842q);
                }
            }
            if (c10130i.m34741w0()) {
                m34757J(c10130i.m34725g0());
            }
            if (c10130i.m34742x0()) {
                m34763P(c10130i.m34726h0());
            }
            if (!c10130i.f38845t.isEmpty()) {
                if (this.f38861r.isEmpty()) {
                    this.f38861r = c10130i.f38845t;
                    this.f38852i &= -257;
                } else {
                    m34747B();
                    this.f38861r.addAll(c10130i.f38845t);
                }
            }
            if (!c10130i.f38846u.isEmpty()) {
                if (this.f38862s.isEmpty()) {
                    this.f38862s = c10130i.f38846u;
                    this.f38852i &= -513;
                } else {
                    m34746A();
                    this.f38862s.addAll(c10130i.f38846u);
                }
            }
            if (!c10130i.f38848w.isEmpty()) {
                if (this.f38863t.isEmpty()) {
                    this.f38863t = c10130i.f38848w;
                    this.f38852i &= -1025;
                } else {
                    m34749D();
                    this.f38863t.addAll(c10130i.f38848w);
                }
            }
            if (c10130i.m34713A0()) {
                m34759L(c10130i.m34732n0());
            }
            if (!c10130i.f38850y.isEmpty()) {
                if (this.f38865v.isEmpty()) {
                    this.f38865v = c10130i.f38850y;
                    this.f38852i &= -4097;
                } else {
                    m34750E();
                    this.f38865v.addAll(c10130i.f38850y);
                }
            }
            if (c10130i.m34737s0()) {
                m34754G(c10130i.m34720a0());
            }
            m38396r(c10130i);
            m38392n(m38391l().m38286f(c10130i.f38835j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10130i.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.i> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10130i.f38832i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.i r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10130i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.i r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10130i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10130i.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.i$b");
        }

        /* renamed from: J */
        public b m34757J(C10138q c10138q) {
            if ((this.f38852i & 64) != 64 || this.f38859p == C10138q.m35022Y()) {
                this.f38859p = c10138q;
            } else {
                this.f38859p = C10138q.m35025z0(this.f38859p).mo34096m(c10138q).m35110u();
            }
            this.f38852i |= 64;
            return this;
        }

        /* renamed from: K */
        public b m34758K(C10138q c10138q) {
            if ((this.f38852i & 8) != 8 || this.f38856m == C10138q.m35022Y()) {
                this.f38856m = c10138q;
            } else {
                this.f38856m = C10138q.m35025z0(this.f38856m).mo34096m(c10138q).m35110u();
            }
            this.f38852i |= 8;
            return this;
        }

        /* renamed from: L */
        public b m34759L(C10141t c10141t) {
            if ((this.f38852i & RecyclerView.AbstractC0599l.FLAG_MOVED) != 2048 || this.f38864u == C10141t.m35225w()) {
                this.f38864u = c10141t;
            } else {
                this.f38864u = C10141t.m35219E(this.f38864u).mo34096m(c10141t).m35240q();
            }
            this.f38852i |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            return this;
        }

        /* renamed from: M */
        public b m34760M(int i2) {
            this.f38852i |= 1;
            this.f38853j = i2;
            return this;
        }

        /* renamed from: N */
        public b m34761N(int i2) {
            this.f38852i |= 4;
            this.f38855l = i2;
            return this;
        }

        /* renamed from: O */
        public b m34762O(int i2) {
            this.f38852i |= 2;
            this.f38854k = i2;
            return this;
        }

        /* renamed from: P */
        public b m34763P(int i2) {
            this.f38852i |= 128;
            this.f38860q = i2;
            return this;
        }

        /* renamed from: Q */
        public b m34764Q(int i2) {
            this.f38852i |= 16;
            this.f38857n = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10130i mo34093c() {
            C10130i c10130iM34766u = m34766u();
            if (c10130iM34766u.isInitialized()) {
                return c10130iM34766u;
            }
            throw AbstractC10742a.a.m38257j(c10130iM34766u);
        }

        /* renamed from: u */
        public C10130i m34766u() {
            C10130i c10130i = new C10130i(this);
            int i2 = this.f38852i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10130i.f38837l = this.f38853j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10130i.f38838m = this.f38854k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10130i.f38839n = this.f38855l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            c10130i.f38840o = this.f38856m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            c10130i.f38841p = this.f38857n;
            if ((this.f38852i & 32) == 32) {
                this.f38858o = Collections.unmodifiableList(this.f38858o);
                this.f38852i &= -33;
            }
            c10130i.f38842q = this.f38858o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            c10130i.f38843r = this.f38859p;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            c10130i.f38844s = this.f38860q;
            if ((this.f38852i & 256) == 256) {
                this.f38861r = Collections.unmodifiableList(this.f38861r);
                this.f38852i &= -257;
            }
            c10130i.f38845t = this.f38861r;
            if ((this.f38852i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.f38862s = Collections.unmodifiableList(this.f38862s);
                this.f38852i &= -513;
            }
            c10130i.f38846u = this.f38862s;
            if ((this.f38852i & 1024) == 1024) {
                this.f38863t = Collections.unmodifiableList(this.f38863t);
                this.f38852i &= -1025;
            }
            c10130i.f38848w = this.f38863t;
            if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                i3 |= 128;
            }
            c10130i.f38849x = this.f38864u;
            if ((this.f38852i & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f38865v = Collections.unmodifiableList(this.f38865v);
                this.f38852i &= -4097;
            }
            c10130i.f38850y = this.f38865v;
            if ((i2 & 8192) == 8192) {
                i3 |= 256;
            }
            c10130i.f38851z = this.f38866w;
            c10130i.f38836k = i3;
            return c10130i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34753w().mo34096m(m34766u());
        }
    }

    static {
        C10130i c10130i = new C10130i(true);
        f38831h = c10130i;
        c10130i.m34689B0();
    }

    /* renamed from: B0 */
    private void m34689B0() {
        this.f38837l = 6;
        this.f38838m = 6;
        this.f38839n = 0;
        this.f38840o = C10138q.m35022Y();
        this.f38841p = 0;
        this.f38842q = Collections.emptyList();
        this.f38843r = C10138q.m35022Y();
        this.f38844s = 0;
        this.f38845t = Collections.emptyList();
        this.f38846u = Collections.emptyList();
        this.f38848w = Collections.emptyList();
        this.f38849x = C10141t.m35225w();
        this.f38850y = Collections.emptyList();
        this.f38851z = C10126e.m34560u();
    }

    /* renamed from: C0 */
    public static b m34691C0() {
        return b.m34753w();
    }

    /* renamed from: D0 */
    public static b m34693D0(C10130i c10130i) {
        return m34691C0().mo34096m(c10130i);
    }

    /* renamed from: F0 */
    public static C10130i m34696F0(InputStream inputStream, C10747f c10747f) throws IOException {
        return f38832i.mo38260a(inputStream, c10747f);
    }

    /* renamed from: b0 */
    public static C10130i m34712b0() {
        return f38831h;
    }

    /* renamed from: A0 */
    public boolean m34713A0() {
        return (this.f38836k & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34691C0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34693D0(this);
    }

    /* renamed from: V */
    public C10138q m34716V(int i2) {
        return this.f38845t.get(i2);
    }

    /* renamed from: X */
    public int m34717X() {
        return this.f38845t.size();
    }

    /* renamed from: Y */
    public List<Integer> m34718Y() {
        return this.f38846u;
    }

    /* renamed from: Z */
    public List<C10138q> m34719Z() {
        return this.f38845t;
    }

    /* renamed from: a0 */
    public C10126e m34720a0() {
        return this.f38851z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C10130i mo34461b() {
        return f38831h;
    }

    /* renamed from: d0 */
    public int m34722d0() {
        return this.f38837l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38834B;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f38836k & 2) == 2 ? CodedOutputStream.m38189o(1, this.f38838m) + 0 : 0;
        if ((this.f38836k & 4) == 4) {
            iM38189o += CodedOutputStream.m38189o(2, this.f38839n);
        }
        if ((this.f38836k & 8) == 8) {
            iM38189o += CodedOutputStream.m38193s(3, this.f38840o);
        }
        for (int i3 = 0; i3 < this.f38842q.size(); i3++) {
            iM38189o += CodedOutputStream.m38193s(4, this.f38842q.get(i3));
        }
        if ((this.f38836k & 32) == 32) {
            iM38189o += CodedOutputStream.m38193s(5, this.f38843r);
        }
        for (int i4 = 0; i4 < this.f38848w.size(); i4++) {
            iM38189o += CodedOutputStream.m38193s(6, this.f38848w.get(i4));
        }
        if ((this.f38836k & 16) == 16) {
            iM38189o += CodedOutputStream.m38189o(7, this.f38841p);
        }
        if ((this.f38836k & 64) == 64) {
            iM38189o += CodedOutputStream.m38189o(8, this.f38844s);
        }
        if ((this.f38836k & 1) == 1) {
            iM38189o += CodedOutputStream.m38189o(9, this.f38837l);
        }
        for (int i5 = 0; i5 < this.f38845t.size(); i5++) {
            iM38189o += CodedOutputStream.m38193s(10, this.f38845t.get(i5));
        }
        int iM38190p = 0;
        for (int i6 = 0; i6 < this.f38846u.size(); i6++) {
            iM38190p += CodedOutputStream.m38190p(this.f38846u.get(i6).intValue());
        }
        int iM38193s = iM38189o + iM38190p;
        if (!m34718Y().isEmpty()) {
            iM38193s = iM38193s + 1 + CodedOutputStream.m38190p(iM38190p);
        }
        this.f38847v = iM38190p;
        if ((this.f38836k & 128) == 128) {
            iM38193s += CodedOutputStream.m38193s(30, this.f38849x);
        }
        int iM38190p2 = 0;
        for (int i7 = 0; i7 < this.f38850y.size(); i7++) {
            iM38190p2 += CodedOutputStream.m38190p(this.f38850y.get(i7).intValue());
        }
        int size = iM38193s + iM38190p2 + (m34736r0().size() * 2);
        if ((this.f38836k & 256) == 256) {
            size += CodedOutputStream.m38193s(32, this.f38851z);
        }
        int iM38400t = size + m38400t() + this.f38835j.size();
        this.f38834B = iM38400t;
        return iM38400t;
    }

    /* renamed from: e0 */
    public int m34723e0() {
        return this.f38839n;
    }

    /* renamed from: f0 */
    public int m34724f0() {
        return this.f38838m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10130i> mo34080g() {
        return f38832i;
    }

    /* renamed from: g0 */
    public C10138q m34725g0() {
        return this.f38843r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f38836k & 2) == 2) {
            codedOutputStream.m38217a0(1, this.f38838m);
        }
        if ((this.f38836k & 4) == 4) {
            codedOutputStream.m38217a0(2, this.f38839n);
        }
        if ((this.f38836k & 8) == 8) {
            codedOutputStream.m38220d0(3, this.f38840o);
        }
        for (int i2 = 0; i2 < this.f38842q.size(); i2++) {
            codedOutputStream.m38220d0(4, this.f38842q.get(i2));
        }
        if ((this.f38836k & 32) == 32) {
            codedOutputStream.m38220d0(5, this.f38843r);
        }
        for (int i3 = 0; i3 < this.f38848w.size(); i3++) {
            codedOutputStream.m38220d0(6, this.f38848w.get(i3));
        }
        if ((this.f38836k & 16) == 16) {
            codedOutputStream.m38217a0(7, this.f38841p);
        }
        if ((this.f38836k & 64) == 64) {
            codedOutputStream.m38217a0(8, this.f38844s);
        }
        if ((this.f38836k & 1) == 1) {
            codedOutputStream.m38217a0(9, this.f38837l);
        }
        for (int i4 = 0; i4 < this.f38845t.size(); i4++) {
            codedOutputStream.m38220d0(10, this.f38845t.get(i4));
        }
        if (m34718Y().size() > 0) {
            codedOutputStream.m38231o0(90);
            codedOutputStream.m38231o0(this.f38847v);
        }
        for (int i5 = 0; i5 < this.f38846u.size(); i5++) {
            codedOutputStream.m38218b0(this.f38846u.get(i5).intValue());
        }
        if ((this.f38836k & 128) == 128) {
            codedOutputStream.m38220d0(30, this.f38849x);
        }
        for (int i6 = 0; i6 < this.f38850y.size(); i6++) {
            codedOutputStream.m38217a0(31, this.f38850y.get(i6).intValue());
        }
        if ((this.f38836k & 256) == 256) {
            codedOutputStream.m38220d0(32, this.f38851z);
        }
        aVarM38405y.m38406a(19000, codedOutputStream);
        codedOutputStream.m38225i0(this.f38835j);
    }

    /* renamed from: h0 */
    public int m34726h0() {
        return this.f38844s;
    }

    /* renamed from: i0 */
    public C10138q m34727i0() {
        return this.f38840o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38833A;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m34739u0()) {
            this.f38833A = (byte) 0;
            return false;
        }
        if (m34743y0() && !m34727i0().isInitialized()) {
            this.f38833A = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34730l0(); i2++) {
            if (!m34729k0(i2).isInitialized()) {
                this.f38833A = (byte) 0;
                return false;
            }
        }
        if (m34741w0() && !m34725g0().isInitialized()) {
            this.f38833A = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < m34717X(); i3++) {
            if (!m34716V(i3).isInitialized()) {
                this.f38833A = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m34734p0(); i4++) {
            if (!m34733o0(i4).isInitialized()) {
                this.f38833A = (byte) 0;
                return false;
            }
        }
        if (m34713A0() && !m34732n0().isInitialized()) {
            this.f38833A = (byte) 0;
            return false;
        }
        if (m34737s0() && !m34720a0().isInitialized()) {
            this.f38833A = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f38833A = (byte) 1;
            return true;
        }
        this.f38833A = (byte) 0;
        return false;
    }

    /* renamed from: j0 */
    public int m34728j0() {
        return this.f38841p;
    }

    /* renamed from: k0 */
    public C10140s m34729k0(int i2) {
        return this.f38842q.get(i2);
    }

    /* renamed from: l0 */
    public int m34730l0() {
        return this.f38842q.size();
    }

    /* renamed from: m0 */
    public List<C10140s> m34731m0() {
        return this.f38842q;
    }

    /* renamed from: n0 */
    public C10141t m34732n0() {
        return this.f38849x;
    }

    /* renamed from: o0 */
    public C10142u m34733o0(int i2) {
        return this.f38848w.get(i2);
    }

    /* renamed from: p0 */
    public int m34734p0() {
        return this.f38848w.size();
    }

    /* renamed from: q0 */
    public List<C10142u> m34735q0() {
        return this.f38848w;
    }

    /* renamed from: r0 */
    public List<Integer> m34736r0() {
        return this.f38850y;
    }

    /* renamed from: s0 */
    public boolean m34737s0() {
        return (this.f38836k & 256) == 256;
    }

    /* renamed from: t0 */
    public boolean m34738t0() {
        return (this.f38836k & 1) == 1;
    }

    /* renamed from: u0 */
    public boolean m34739u0() {
        return (this.f38836k & 4) == 4;
    }

    /* renamed from: v0 */
    public boolean m34740v0() {
        return (this.f38836k & 2) == 2;
    }

    /* renamed from: w0 */
    public boolean m34741w0() {
        return (this.f38836k & 32) == 32;
    }

    /* renamed from: x0 */
    public boolean m34742x0() {
        return (this.f38836k & 64) == 64;
    }

    /* renamed from: y0 */
    public boolean m34743y0() {
        return (this.f38836k & 8) == 8;
    }

    /* renamed from: z0 */
    public boolean m34744z0() {
        return (this.f38836k & 16) == 16;
    }

    private C10130i(AbstractC10749h.c<C10130i, ?> cVar) {
        super(cVar);
        this.f38847v = -1;
        this.f38833A = (byte) -1;
        this.f38834B = -1;
        this.f38835j = cVar.m38391l();
    }

    private C10130i(boolean z) {
        this.f38847v = -1;
        this.f38833A = (byte) -1;
        this.f38834B = -1;
        this.f38835j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C10130i(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38847v = -1;
        this.f38833A = (byte) -1;
        this.f38834B = -1;
        m34689B0();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? Mo38390p = 1024;
            if (!z) {
                try {
                    try {
                        try {
                            int iM38320K = c10746e.m38320K();
                            switch (iM38320K) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f38836k |= 2;
                                    this.f38838m = c10746e.m38339s();
                                case 16:
                                    this.f38836k |= 4;
                                    this.f38839n = c10746e.m38339s();
                                case 26:
                                    C10138q.c cVarM35027B0 = (this.f38836k & 8) == 8 ? this.f38840o.mo34077d() : null;
                                    C10138q c10138q = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f38840o = c10138q;
                                    if (cVarM35027B0 != null) {
                                        cVarM35027B0.mo34096m(c10138q);
                                        this.f38840o = cVarM35027B0.m35110u();
                                    }
                                    this.f38836k |= 8;
                                case 34:
                                    if ((i2 & 32) != 32) {
                                        this.f38842q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.f38842q.add(c10746e.m38341u(C10140s.f39065i, c10747f));
                                case 42:
                                    C10138q.c cVarM35027B02 = (this.f38836k & 32) == 32 ? this.f38843r.mo34077d() : null;
                                    C10138q c10138q2 = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                    this.f38843r = c10138q2;
                                    if (cVarM35027B02 != null) {
                                        cVarM35027B02.mo34096m(c10138q2);
                                        this.f38843r = cVarM35027B02.m35110u();
                                    }
                                    this.f38836k |= 32;
                                case 50:
                                    if ((i2 & 1024) != 1024) {
                                        this.f38848w = new ArrayList();
                                        i2 |= 1024;
                                    }
                                    this.f38848w.add(c10746e.m38341u(C10142u.f39102i, c10747f));
                                case 56:
                                    this.f38836k |= 16;
                                    this.f38841p = c10746e.m38339s();
                                case 64:
                                    this.f38836k |= 64;
                                    this.f38844s = c10746e.m38339s();
                                case 72:
                                    this.f38836k |= 1;
                                    this.f38837l = c10746e.m38339s();
                                case 82:
                                    if ((i2 & 256) != 256) {
                                        this.f38845t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    this.f38845t.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                                case 88:
                                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                        this.f38846u = new ArrayList();
                                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    this.f38846u.add(Integer.valueOf(c10746e.m38339s()));
                                case 90:
                                    int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 && c10746e.m38327e() > 0) {
                                        this.f38846u = new ArrayList();
                                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    while (c10746e.m38327e() > 0) {
                                        this.f38846u.add(Integer.valueOf(c10746e.m38339s()));
                                    }
                                    c10746e.m38329i(iM38330j);
                                    break;
                                case 242:
                                    C10141t.b bVarM35229G = (this.f38836k & 128) == 128 ? this.f38849x.mo34077d() : null;
                                    C10141t c10141t = (C10141t) c10746e.m38341u(C10141t.f39091h, c10747f);
                                    this.f38849x = c10141t;
                                    if (bVarM35229G != null) {
                                        bVarM35229G.mo34096m(c10141t);
                                        this.f38849x = bVarM35229G.m35240q();
                                    }
                                    this.f38836k |= 128;
                                case 248:
                                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                                        this.f38850y = new ArrayList();
                                        i2 |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    }
                                    this.f38850y.add(Integer.valueOf(c10746e.m38339s()));
                                case 250:
                                    int iM38330j2 = c10746e.m38330j(c10746e.m38311A());
                                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096 && c10746e.m38327e() > 0) {
                                        this.f38850y = new ArrayList();
                                        i2 |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    }
                                    while (c10746e.m38327e() > 0) {
                                        this.f38850y.add(Integer.valueOf(c10746e.m38339s()));
                                    }
                                    c10746e.m38329i(iM38330j2);
                                    break;
                                case 258:
                                    C10126e.b bVarM34565B = (this.f38836k & 256) == 256 ? this.f38851z.mo34077d() : null;
                                    C10126e c10126e = (C10126e) c10746e.m38341u(C10126e.f38761h, c10747f);
                                    this.f38851z = c10126e;
                                    if (bVarM34565B != null) {
                                        bVarM34565B.mo34096m(c10126e);
                                        this.f38851z = bVarM34565B.m34574q();
                                    }
                                    this.f38836k |= 256;
                                default:
                                    Mo38390p = mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K);
                                    if (Mo38390p == 0) {
                                        z = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.m38253i(this);
                        }
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.f38842q = Collections.unmodifiableList(this.f38842q);
                    }
                    if ((i2 & 1024) == Mo38390p) {
                        this.f38848w = Collections.unmodifiableList(this.f38848w);
                    }
                    if ((i2 & 256) == 256) {
                        this.f38845t = Collections.unmodifiableList(this.f38845t);
                    }
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.f38846u = Collections.unmodifiableList(this.f38846u);
                    }
                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.f38850y = Collections.unmodifiableList(this.f38850y);
                    }
                    try {
                        codedOutputStreamM38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38835j = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38835j = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } else {
                if ((i2 & 32) == 32) {
                    this.f38842q = Collections.unmodifiableList(this.f38842q);
                }
                if ((i2 & 1024) == 1024) {
                    this.f38848w = Collections.unmodifiableList(this.f38848w);
                }
                if ((i2 & 256) == 256) {
                    this.f38845t = Collections.unmodifiableList(this.f38845t);
                }
                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.f38846u = Collections.unmodifiableList(this.f38846u);
                }
                if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f38850y = Collections.unmodifiableList(this.f38850y);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f38835j = bVarM38280w.m38299e();
                    throw th3;
                }
                this.f38835j = bVarM38280w.m38299e();
                mo38389m();
                return;
            }
        }
    }
}
