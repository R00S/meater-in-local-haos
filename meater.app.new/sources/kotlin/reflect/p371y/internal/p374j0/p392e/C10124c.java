package kotlin.reflect.p371y.internal.p374j0.p392e;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10144w;
import okhttp3.internal.http2.Http2;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.c */
/* loaded from: classes3.dex */
public final class C10124c extends AbstractC10749h.d<C10124c> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10124c f38676h;

    /* renamed from: i */
    public static InterfaceC10758q<C10124c> f38677i = new a();

    /* renamed from: A */
    private List<C10139r> f38678A;

    /* renamed from: B */
    private List<C10128g> f38679B;

    /* renamed from: C */
    private List<Integer> f38680C;

    /* renamed from: D */
    private int f38681D;

    /* renamed from: E */
    private int f38682E;

    /* renamed from: F */
    private C10138q f38683F;

    /* renamed from: G */
    private int f38684G;

    /* renamed from: H */
    private List<Integer> f38685H;

    /* renamed from: I */
    private int f38686I;

    /* renamed from: J */
    private List<C10138q> f38687J;

    /* renamed from: K */
    private List<Integer> f38688K;

    /* renamed from: L */
    private int f38689L;

    /* renamed from: M */
    private C10141t f38690M;

    /* renamed from: N */
    private List<Integer> f38691N;

    /* renamed from: O */
    private C10144w f38692O;

    /* renamed from: P */
    private byte f38693P;

    /* renamed from: Q */
    private int f38694Q;

    /* renamed from: j */
    private final AbstractC10745d f38695j;

    /* renamed from: k */
    private int f38696k;

    /* renamed from: l */
    private int f38697l;

    /* renamed from: m */
    private int f38698m;

    /* renamed from: n */
    private int f38699n;

    /* renamed from: o */
    private List<C10140s> f38700o;

    /* renamed from: p */
    private List<C10138q> f38701p;

    /* renamed from: q */
    private List<Integer> f38702q;

    /* renamed from: r */
    private int f38703r;

    /* renamed from: s */
    private List<Integer> f38704s;

    /* renamed from: t */
    private int f38705t;

    /* renamed from: u */
    private List<C10138q> f38706u;

    /* renamed from: v */
    private List<Integer> f38707v;

    /* renamed from: w */
    private int f38708w;

    /* renamed from: x */
    private List<C10125d> f38709x;

    /* renamed from: y */
    private List<C10130i> f38710y;

    /* renamed from: z */
    private List<C10135n> f38711z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.c$a */
    static class a extends AbstractC10743b<C10124c> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10124c mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10124c(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.c$b */
    public static final class b extends AbstractC10749h.c<C10124c, b> implements InterfaceC10757p {

        /* renamed from: A */
        private int f38712A;

        /* renamed from: i */
        private int f38719i;

        /* renamed from: k */
        private int f38721k;

        /* renamed from: l */
        private int f38722l;

        /* renamed from: y */
        private int f38735y;

        /* renamed from: j */
        private int f38720j = 6;

        /* renamed from: m */
        private List<C10140s> f38723m = Collections.emptyList();

        /* renamed from: n */
        private List<C10138q> f38724n = Collections.emptyList();

        /* renamed from: o */
        private List<Integer> f38725o = Collections.emptyList();

        /* renamed from: p */
        private List<Integer> f38726p = Collections.emptyList();

        /* renamed from: q */
        private List<C10138q> f38727q = Collections.emptyList();

        /* renamed from: r */
        private List<Integer> f38728r = Collections.emptyList();

        /* renamed from: s */
        private List<C10125d> f38729s = Collections.emptyList();

        /* renamed from: t */
        private List<C10130i> f38730t = Collections.emptyList();

        /* renamed from: u */
        private List<C10135n> f38731u = Collections.emptyList();

        /* renamed from: v */
        private List<C10139r> f38732v = Collections.emptyList();

        /* renamed from: w */
        private List<C10128g> f38733w = Collections.emptyList();

        /* renamed from: x */
        private List<Integer> f38734x = Collections.emptyList();

        /* renamed from: z */
        private C10138q f38736z = C10138q.m35022Y();

        /* renamed from: B */
        private List<Integer> f38713B = Collections.emptyList();

        /* renamed from: C */
        private List<C10138q> f38714C = Collections.emptyList();

        /* renamed from: D */
        private List<Integer> f38715D = Collections.emptyList();

        /* renamed from: E */
        private C10141t f38716E = C10141t.m35225w();

        /* renamed from: F */
        private List<Integer> f38717F = Collections.emptyList();

        /* renamed from: G */
        private C10144w f38718G = C10144w.m35334u();

        private b() {
            m34507Q();
        }

        /* renamed from: A */
        private void m34491A() {
            if ((this.f38719i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.f38729s = new ArrayList(this.f38729s);
                this.f38719i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        /* renamed from: B */
        private void m34492B() {
            if ((this.f38719i & 256) != 256) {
                this.f38728r = new ArrayList(this.f38728r);
                this.f38719i |= 256;
            }
        }

        /* renamed from: C */
        private void m34493C() {
            if ((this.f38719i & 128) != 128) {
                this.f38727q = new ArrayList(this.f38727q);
                this.f38719i |= 128;
            }
        }

        /* renamed from: D */
        private void m34494D() {
            if ((this.f38719i & 8192) != 8192) {
                this.f38733w = new ArrayList(this.f38733w);
                this.f38719i |= 8192;
            }
        }

        /* renamed from: E */
        private void m34495E() {
            if ((this.f38719i & 1024) != 1024) {
                this.f38730t = new ArrayList(this.f38730t);
                this.f38719i |= 1024;
            }
        }

        /* renamed from: F */
        private void m34496F() {
            if ((this.f38719i & 262144) != 262144) {
                this.f38713B = new ArrayList(this.f38713B);
                this.f38719i |= 262144;
            }
        }

        /* renamed from: G */
        private void m34497G() {
            if ((this.f38719i & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576) {
                this.f38715D = new ArrayList(this.f38715D);
                this.f38719i |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            }
        }

        /* renamed from: H */
        private void m34498H() {
            if ((this.f38719i & 524288) != 524288) {
                this.f38714C = new ArrayList(this.f38714C);
                this.f38719i |= 524288;
            }
        }

        /* renamed from: I */
        private void m34499I() {
            if ((this.f38719i & 64) != 64) {
                this.f38726p = new ArrayList(this.f38726p);
                this.f38719i |= 64;
            }
        }

        /* renamed from: J */
        private void m34500J() {
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_MOVED) != 2048) {
                this.f38731u = new ArrayList(this.f38731u);
                this.f38719i |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            }
        }

        /* renamed from: K */
        private void m34501K() {
            if ((this.f38719i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f38734x = new ArrayList(this.f38734x);
                this.f38719i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* renamed from: L */
        private void m34502L() {
            if ((this.f38719i & 32) != 32) {
                this.f38725o = new ArrayList(this.f38725o);
                this.f38719i |= 32;
            }
        }

        /* renamed from: M */
        private void m34503M() {
            if ((this.f38719i & 16) != 16) {
                this.f38724n = new ArrayList(this.f38724n);
                this.f38719i |= 16;
            }
        }

        /* renamed from: N */
        private void m34504N() {
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f38732v = new ArrayList(this.f38732v);
                this.f38719i |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        /* renamed from: O */
        private void m34505O() {
            if ((this.f38719i & 8) != 8) {
                this.f38723m = new ArrayList(this.f38723m);
                this.f38719i |= 8;
            }
        }

        /* renamed from: P */
        private void m34506P() {
            if ((this.f38719i & 4194304) != 4194304) {
                this.f38717F = new ArrayList(this.f38717F);
                this.f38719i |= 4194304;
            }
        }

        /* renamed from: Q */
        private void m34507Q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34509w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10124c c10124c) {
            if (c10124c == C10124c.m34433z0()) {
                return this;
            }
            if (c10124c.m34473m1()) {
                m34516Z(c10124c.m34438E0());
            }
            if (c10124c.m34474n1()) {
                m34517a0(c10124c.m34439F0());
            }
            if (c10124c.m34472l1()) {
                m34515X(c10124c.m34478r0());
            }
            if (!c10124c.f38700o.isEmpty()) {
                if (this.f38723m.isEmpty()) {
                    this.f38723m = c10124c.f38700o;
                    this.f38719i &= -9;
                } else {
                    m34505O();
                    this.f38723m.addAll(c10124c.f38700o);
                }
            }
            if (!c10124c.f38701p.isEmpty()) {
                if (this.f38724n.isEmpty()) {
                    this.f38724n = c10124c.f38701p;
                    this.f38719i &= -17;
                } else {
                    m34503M();
                    this.f38724n.addAll(c10124c.f38701p);
                }
            }
            if (!c10124c.f38702q.isEmpty()) {
                if (this.f38725o.isEmpty()) {
                    this.f38725o = c10124c.f38702q;
                    this.f38719i &= -33;
                } else {
                    m34502L();
                    this.f38725o.addAll(c10124c.f38702q);
                }
            }
            if (!c10124c.f38704s.isEmpty()) {
                if (this.f38726p.isEmpty()) {
                    this.f38726p = c10124c.f38704s;
                    this.f38719i &= -65;
                } else {
                    m34499I();
                    this.f38726p.addAll(c10124c.f38704s);
                }
            }
            if (!c10124c.f38706u.isEmpty()) {
                if (this.f38727q.isEmpty()) {
                    this.f38727q = c10124c.f38706u;
                    this.f38719i &= -129;
                } else {
                    m34493C();
                    this.f38727q.addAll(c10124c.f38706u);
                }
            }
            if (!c10124c.f38707v.isEmpty()) {
                if (this.f38728r.isEmpty()) {
                    this.f38728r = c10124c.f38707v;
                    this.f38719i &= -257;
                } else {
                    m34492B();
                    this.f38728r.addAll(c10124c.f38707v);
                }
            }
            if (!c10124c.f38709x.isEmpty()) {
                if (this.f38729s.isEmpty()) {
                    this.f38729s = c10124c.f38709x;
                    this.f38719i &= -513;
                } else {
                    m34491A();
                    this.f38729s.addAll(c10124c.f38709x);
                }
            }
            if (!c10124c.f38710y.isEmpty()) {
                if (this.f38730t.isEmpty()) {
                    this.f38730t = c10124c.f38710y;
                    this.f38719i &= -1025;
                } else {
                    m34495E();
                    this.f38730t.addAll(c10124c.f38710y);
                }
            }
            if (!c10124c.f38711z.isEmpty()) {
                if (this.f38731u.isEmpty()) {
                    this.f38731u = c10124c.f38711z;
                    this.f38719i &= -2049;
                } else {
                    m34500J();
                    this.f38731u.addAll(c10124c.f38711z);
                }
            }
            if (!c10124c.f38678A.isEmpty()) {
                if (this.f38732v.isEmpty()) {
                    this.f38732v = c10124c.f38678A;
                    this.f38719i &= -4097;
                } else {
                    m34504N();
                    this.f38732v.addAll(c10124c.f38678A);
                }
            }
            if (!c10124c.f38679B.isEmpty()) {
                if (this.f38733w.isEmpty()) {
                    this.f38733w = c10124c.f38679B;
                    this.f38719i &= -8193;
                } else {
                    m34494D();
                    this.f38733w.addAll(c10124c.f38679B);
                }
            }
            if (!c10124c.f38680C.isEmpty()) {
                if (this.f38734x.isEmpty()) {
                    this.f38734x = c10124c.f38680C;
                    this.f38719i &= -16385;
                } else {
                    m34501K();
                    this.f38734x.addAll(c10124c.f38680C);
                }
            }
            if (c10124c.m34475o1()) {
                m34518b0(c10124c.m34443J0());
            }
            if (c10124c.m34476p1()) {
                m34512T(c10124c.m34444K0());
            }
            if (c10124c.m34477q1()) {
                m34519c0(c10124c.m34445L0());
            }
            if (!c10124c.f38685H.isEmpty()) {
                if (this.f38713B.isEmpty()) {
                    this.f38713B = c10124c.f38685H;
                    this.f38719i &= -262145;
                } else {
                    m34496F();
                    this.f38713B.addAll(c10124c.f38685H);
                }
            }
            if (!c10124c.f38687J.isEmpty()) {
                if (this.f38714C.isEmpty()) {
                    this.f38714C = c10124c.f38687J;
                    this.f38719i &= -524289;
                } else {
                    m34498H();
                    this.f38714C.addAll(c10124c.f38687J);
                }
            }
            if (!c10124c.f38688K.isEmpty()) {
                if (this.f38715D.isEmpty()) {
                    this.f38715D = c10124c.f38688K;
                    this.f38719i &= -1048577;
                } else {
                    m34497G();
                    this.f38715D.addAll(c10124c.f38688K);
                }
            }
            if (c10124c.m34479r1()) {
                m34513U(c10124c.m34469i1());
            }
            if (!c10124c.f38691N.isEmpty()) {
                if (this.f38717F.isEmpty()) {
                    this.f38717F = c10124c.f38691N;
                    this.f38719i &= -4194305;
                } else {
                    m34506P();
                    this.f38717F.addAll(c10124c.f38691N);
                }
            }
            if (c10124c.m34481s1()) {
                m34514V(c10124c.m34471k1());
            }
            m38396r(c10124c);
            m38392n(m38391l().m38286f(c10124c.f38695j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10124c.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.c> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10124c.f38677i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.c r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10124c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.c r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10124c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10124c.b.mo34092W(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.c$b");
        }

        /* renamed from: T */
        public b m34512T(C10138q c10138q) {
            if ((this.f38719i & 65536) != 65536 || this.f38736z == C10138q.m35022Y()) {
                this.f38736z = c10138q;
            } else {
                this.f38736z = C10138q.m35025z0(this.f38736z).mo34096m(c10138q).m35110u();
            }
            this.f38719i |= 65536;
            return this;
        }

        /* renamed from: U */
        public b m34513U(C10141t c10141t) {
            if ((this.f38719i & 2097152) != 2097152 || this.f38716E == C10141t.m35225w()) {
                this.f38716E = c10141t;
            } else {
                this.f38716E = C10141t.m35219E(this.f38716E).mo34096m(c10141t).m35240q();
            }
            this.f38719i |= 2097152;
            return this;
        }

        /* renamed from: V */
        public b m34514V(C10144w c10144w) {
            if ((this.f38719i & 8388608) != 8388608 || this.f38718G == C10144w.m35334u()) {
                this.f38718G = c10144w;
            } else {
                this.f38718G = C10144w.m35337z(this.f38718G).mo34096m(c10144w).m35348q();
            }
            this.f38719i |= 8388608;
            return this;
        }

        /* renamed from: X */
        public b m34515X(int i2) {
            this.f38719i |= 4;
            this.f38722l = i2;
            return this;
        }

        /* renamed from: Z */
        public b m34516Z(int i2) {
            this.f38719i |= 1;
            this.f38720j = i2;
            return this;
        }

        /* renamed from: a0 */
        public b m34517a0(int i2) {
            this.f38719i |= 2;
            this.f38721k = i2;
            return this;
        }

        /* renamed from: b0 */
        public b m34518b0(int i2) {
            this.f38719i |= 32768;
            this.f38735y = i2;
            return this;
        }

        /* renamed from: c0 */
        public b m34519c0(int i2) {
            this.f38719i |= 131072;
            this.f38712A = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10124c mo34093c() {
            C10124c c10124cM34521u = m34521u();
            if (c10124cM34521u.isInitialized()) {
                return c10124cM34521u;
            }
            throw AbstractC10742a.a.m38257j(c10124cM34521u);
        }

        /* renamed from: u */
        public C10124c m34521u() {
            C10124c c10124c = new C10124c(this);
            int i2 = this.f38719i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            c10124c.f38697l = this.f38720j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            c10124c.f38698m = this.f38721k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            c10124c.f38699n = this.f38722l;
            if ((this.f38719i & 8) == 8) {
                this.f38723m = Collections.unmodifiableList(this.f38723m);
                this.f38719i &= -9;
            }
            c10124c.f38700o = this.f38723m;
            if ((this.f38719i & 16) == 16) {
                this.f38724n = Collections.unmodifiableList(this.f38724n);
                this.f38719i &= -17;
            }
            c10124c.f38701p = this.f38724n;
            if ((this.f38719i & 32) == 32) {
                this.f38725o = Collections.unmodifiableList(this.f38725o);
                this.f38719i &= -33;
            }
            c10124c.f38702q = this.f38725o;
            if ((this.f38719i & 64) == 64) {
                this.f38726p = Collections.unmodifiableList(this.f38726p);
                this.f38719i &= -65;
            }
            c10124c.f38704s = this.f38726p;
            if ((this.f38719i & 128) == 128) {
                this.f38727q = Collections.unmodifiableList(this.f38727q);
                this.f38719i &= -129;
            }
            c10124c.f38706u = this.f38727q;
            if ((this.f38719i & 256) == 256) {
                this.f38728r = Collections.unmodifiableList(this.f38728r);
                this.f38719i &= -257;
            }
            c10124c.f38707v = this.f38728r;
            if ((this.f38719i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.f38729s = Collections.unmodifiableList(this.f38729s);
                this.f38719i &= -513;
            }
            c10124c.f38709x = this.f38729s;
            if ((this.f38719i & 1024) == 1024) {
                this.f38730t = Collections.unmodifiableList(this.f38730t);
                this.f38719i &= -1025;
            }
            c10124c.f38710y = this.f38730t;
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                this.f38731u = Collections.unmodifiableList(this.f38731u);
                this.f38719i &= -2049;
            }
            c10124c.f38711z = this.f38731u;
            if ((this.f38719i & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f38732v = Collections.unmodifiableList(this.f38732v);
                this.f38719i &= -4097;
            }
            c10124c.f38678A = this.f38732v;
            if ((this.f38719i & 8192) == 8192) {
                this.f38733w = Collections.unmodifiableList(this.f38733w);
                this.f38719i &= -8193;
            }
            c10124c.f38679B = this.f38733w;
            if ((this.f38719i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f38734x = Collections.unmodifiableList(this.f38734x);
                this.f38719i &= -16385;
            }
            c10124c.f38680C = this.f38734x;
            if ((i2 & 32768) == 32768) {
                i3 |= 8;
            }
            c10124c.f38682E = this.f38735y;
            if ((i2 & 65536) == 65536) {
                i3 |= 16;
            }
            c10124c.f38683F = this.f38736z;
            if ((i2 & 131072) == 131072) {
                i3 |= 32;
            }
            c10124c.f38684G = this.f38712A;
            if ((this.f38719i & 262144) == 262144) {
                this.f38713B = Collections.unmodifiableList(this.f38713B);
                this.f38719i &= -262145;
            }
            c10124c.f38685H = this.f38713B;
            if ((this.f38719i & 524288) == 524288) {
                this.f38714C = Collections.unmodifiableList(this.f38714C);
                this.f38719i &= -524289;
            }
            c10124c.f38687J = this.f38714C;
            if ((this.f38719i & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                this.f38715D = Collections.unmodifiableList(this.f38715D);
                this.f38719i &= -1048577;
            }
            c10124c.f38688K = this.f38715D;
            if ((i2 & 2097152) == 2097152) {
                i3 |= 64;
            }
            c10124c.f38690M = this.f38716E;
            if ((this.f38719i & 4194304) == 4194304) {
                this.f38717F = Collections.unmodifiableList(this.f38717F);
                this.f38719i &= -4194305;
            }
            c10124c.f38691N = this.f38717F;
            if ((i2 & 8388608) == 8388608) {
                i3 |= 128;
            }
            c10124c.f38692O = this.f38718G;
            c10124c.f38696k = i3;
            return c10124c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34509w().mo34096m(m34521u());
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.c$c */
    public enum c implements C10750i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* renamed from: m */
        private static C10750i.b<c> f38744m = new a();

        /* renamed from: o */
        private final int f38746o;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.c$c$a */
        static class a implements C10750i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo34236a(int i2) {
                return c.m34523g(i2);
            }
        }

        c(int i2, int i3) {
            this.f38746o = i3;
        }

        /* renamed from: g */
        public static c m34523g(int i2) {
            switch (i2) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
        /* renamed from: f */
        public final int mo34235f() {
            return this.f38746o;
        }
    }

    static {
        C10124c c10124c = new C10124c(true);
        f38676h = c10124c;
        c10124c.m34429t1();
    }

    /* renamed from: t1 */
    private void m34429t1() {
        this.f38697l = 6;
        this.f38698m = 0;
        this.f38699n = 0;
        this.f38700o = Collections.emptyList();
        this.f38701p = Collections.emptyList();
        this.f38702q = Collections.emptyList();
        this.f38704s = Collections.emptyList();
        this.f38706u = Collections.emptyList();
        this.f38707v = Collections.emptyList();
        this.f38709x = Collections.emptyList();
        this.f38710y = Collections.emptyList();
        this.f38711z = Collections.emptyList();
        this.f38678A = Collections.emptyList();
        this.f38679B = Collections.emptyList();
        this.f38680C = Collections.emptyList();
        this.f38682E = 0;
        this.f38683F = C10138q.m35022Y();
        this.f38684G = 0;
        this.f38685H = Collections.emptyList();
        this.f38687J = Collections.emptyList();
        this.f38688K = Collections.emptyList();
        this.f38690M = C10141t.m35225w();
        this.f38691N = Collections.emptyList();
        this.f38692O = C10144w.m35334u();
    }

    /* renamed from: u1 */
    public static b m34430u1() {
        return b.m34509w();
    }

    /* renamed from: v1 */
    public static b m34431v1(C10124c c10124c) {
        return m34430u1().mo34096m(c10124c);
    }

    /* renamed from: x1 */
    public static C10124c m34432x1(InputStream inputStream, C10747f c10747f) throws IOException {
        return f38677i.mo38260a(inputStream, c10747f);
    }

    /* renamed from: z0 */
    public static C10124c m34433z0() {
        return f38676h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public C10124c mo34461b() {
        return f38676h;
    }

    /* renamed from: B0 */
    public C10128g m34435B0(int i2) {
        return this.f38679B.get(i2);
    }

    /* renamed from: C0 */
    public int m34436C0() {
        return this.f38679B.size();
    }

    /* renamed from: D0 */
    public List<C10128g> m34437D0() {
        return this.f38679B;
    }

    /* renamed from: E0 */
    public int m34438E0() {
        return this.f38697l;
    }

    /* renamed from: F0 */
    public int m34439F0() {
        return this.f38698m;
    }

    /* renamed from: G0 */
    public C10130i m34440G0(int i2) {
        return this.f38710y.get(i2);
    }

    /* renamed from: H0 */
    public int m34441H0() {
        return this.f38710y.size();
    }

    /* renamed from: I0 */
    public List<C10130i> m34442I0() {
        return this.f38710y;
    }

    /* renamed from: J0 */
    public int m34443J0() {
        return this.f38682E;
    }

    /* renamed from: K0 */
    public C10138q m34444K0() {
        return this.f38683F;
    }

    /* renamed from: L0 */
    public int m34445L0() {
        return this.f38684G;
    }

    /* renamed from: M0 */
    public int m34446M0() {
        return this.f38685H.size();
    }

    /* renamed from: N0 */
    public List<Integer> m34447N0() {
        return this.f38685H;
    }

    /* renamed from: O0 */
    public C10138q m34448O0(int i2) {
        return this.f38687J.get(i2);
    }

    /* renamed from: P0 */
    public int m34449P0() {
        return this.f38687J.size();
    }

    /* renamed from: Q0 */
    public int m34450Q0() {
        return this.f38688K.size();
    }

    /* renamed from: R0 */
    public List<Integer> m34451R0() {
        return this.f38688K;
    }

    /* renamed from: S0 */
    public List<C10138q> m34452S0() {
        return this.f38687J;
    }

    /* renamed from: T0 */
    public List<Integer> m34453T0() {
        return this.f38704s;
    }

    /* renamed from: U0 */
    public C10135n m34454U0(int i2) {
        return this.f38711z.get(i2);
    }

    /* renamed from: V0 */
    public int m34455V0() {
        return this.f38711z.size();
    }

    /* renamed from: W0 */
    public List<C10135n> m34456W0() {
        return this.f38711z;
    }

    /* renamed from: X0 */
    public List<Integer> m34457X0() {
        return this.f38680C;
    }

    /* renamed from: Y0 */
    public C10138q m34458Y0(int i2) {
        return this.f38701p.get(i2);
    }

    /* renamed from: Z0 */
    public int m34459Z0() {
        return this.f38701p.size();
    }

    /* renamed from: a1 */
    public List<Integer> m34460a1() {
        return this.f38702q;
    }

    /* renamed from: b1 */
    public List<C10138q> m34462b1() {
        return this.f38701p;
    }

    /* renamed from: c1 */
    public C10139r m34463c1(int i2) {
        return this.f38678A.get(i2);
    }

    /* renamed from: d1 */
    public int m34464d1() {
        return this.f38678A.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38694Q;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = (this.f38696k & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38697l) + 0 : 0;
        int iM38190p = 0;
        for (int i3 = 0; i3 < this.f38702q.size(); i3++) {
            iM38190p += CodedOutputStream.m38190p(this.f38702q.get(i3).intValue());
        }
        int iM38193s = iM38189o + iM38190p;
        if (!m34460a1().isEmpty()) {
            iM38193s = iM38193s + 1 + CodedOutputStream.m38190p(iM38190p);
        }
        this.f38703r = iM38190p;
        if ((this.f38696k & 2) == 2) {
            iM38193s += CodedOutputStream.m38189o(3, this.f38698m);
        }
        if ((this.f38696k & 4) == 4) {
            iM38193s += CodedOutputStream.m38189o(4, this.f38699n);
        }
        for (int i4 = 0; i4 < this.f38700o.size(); i4++) {
            iM38193s += CodedOutputStream.m38193s(5, this.f38700o.get(i4));
        }
        for (int i5 = 0; i5 < this.f38701p.size(); i5++) {
            iM38193s += CodedOutputStream.m38193s(6, this.f38701p.get(i5));
        }
        int iM38190p2 = 0;
        for (int i6 = 0; i6 < this.f38704s.size(); i6++) {
            iM38190p2 += CodedOutputStream.m38190p(this.f38704s.get(i6).intValue());
        }
        int iM38193s2 = iM38193s + iM38190p2;
        if (!m34453T0().isEmpty()) {
            iM38193s2 = iM38193s2 + 1 + CodedOutputStream.m38190p(iM38190p2);
        }
        this.f38705t = iM38190p2;
        for (int i7 = 0; i7 < this.f38709x.size(); i7++) {
            iM38193s2 += CodedOutputStream.m38193s(8, this.f38709x.get(i7));
        }
        for (int i8 = 0; i8 < this.f38710y.size(); i8++) {
            iM38193s2 += CodedOutputStream.m38193s(9, this.f38710y.get(i8));
        }
        for (int i9 = 0; i9 < this.f38711z.size(); i9++) {
            iM38193s2 += CodedOutputStream.m38193s(10, this.f38711z.get(i9));
        }
        for (int i10 = 0; i10 < this.f38678A.size(); i10++) {
            iM38193s2 += CodedOutputStream.m38193s(11, this.f38678A.get(i10));
        }
        for (int i11 = 0; i11 < this.f38679B.size(); i11++) {
            iM38193s2 += CodedOutputStream.m38193s(13, this.f38679B.get(i11));
        }
        int iM38190p3 = 0;
        for (int i12 = 0; i12 < this.f38680C.size(); i12++) {
            iM38190p3 += CodedOutputStream.m38190p(this.f38680C.get(i12).intValue());
        }
        int iM38193s3 = iM38193s2 + iM38190p3;
        if (!m34457X0().isEmpty()) {
            iM38193s3 = iM38193s3 + 2 + CodedOutputStream.m38190p(iM38190p3);
        }
        this.f38681D = iM38190p3;
        if ((this.f38696k & 8) == 8) {
            iM38193s3 += CodedOutputStream.m38189o(17, this.f38682E);
        }
        if ((this.f38696k & 16) == 16) {
            iM38193s3 += CodedOutputStream.m38193s(18, this.f38683F);
        }
        if ((this.f38696k & 32) == 32) {
            iM38193s3 += CodedOutputStream.m38189o(19, this.f38684G);
        }
        for (int i13 = 0; i13 < this.f38706u.size(); i13++) {
            iM38193s3 += CodedOutputStream.m38193s(20, this.f38706u.get(i13));
        }
        int iM38190p4 = 0;
        for (int i14 = 0; i14 < this.f38707v.size(); i14++) {
            iM38190p4 += CodedOutputStream.m38190p(this.f38707v.get(i14).intValue());
        }
        int iM38190p5 = iM38193s3 + iM38190p4;
        if (!m34487x0().isEmpty()) {
            iM38190p5 = iM38190p5 + 2 + CodedOutputStream.m38190p(iM38190p4);
        }
        this.f38708w = iM38190p4;
        int iM38190p6 = 0;
        for (int i15 = 0; i15 < this.f38685H.size(); i15++) {
            iM38190p6 += CodedOutputStream.m38190p(this.f38685H.get(i15).intValue());
        }
        int iM38193s4 = iM38190p5 + iM38190p6;
        if (!m34447N0().isEmpty()) {
            iM38193s4 = iM38193s4 + 2 + CodedOutputStream.m38190p(iM38190p6);
        }
        this.f38686I = iM38190p6;
        for (int i16 = 0; i16 < this.f38687J.size(); i16++) {
            iM38193s4 += CodedOutputStream.m38193s(23, this.f38687J.get(i16));
        }
        int iM38190p7 = 0;
        for (int i17 = 0; i17 < this.f38688K.size(); i17++) {
            iM38190p7 += CodedOutputStream.m38190p(this.f38688K.get(i17).intValue());
        }
        int iM38193s5 = iM38193s4 + iM38190p7;
        if (!m34451R0().isEmpty()) {
            iM38193s5 = iM38193s5 + 2 + CodedOutputStream.m38190p(iM38190p7);
        }
        this.f38689L = iM38190p7;
        if ((this.f38696k & 64) == 64) {
            iM38193s5 += CodedOutputStream.m38193s(30, this.f38690M);
        }
        int iM38190p8 = 0;
        for (int i18 = 0; i18 < this.f38691N.size(); i18++) {
            iM38190p8 += CodedOutputStream.m38190p(this.f38691N.get(i18).intValue());
        }
        int size = iM38193s5 + iM38190p8 + (m34470j1().size() * 2);
        if ((this.f38696k & 128) == 128) {
            size += CodedOutputStream.m38193s(32, this.f38692O);
        }
        int iM38400t = size + m38400t() + this.f38695j.size();
        this.f38694Q = iM38400t;
        return iM38400t;
    }

    /* renamed from: e1 */
    public List<C10139r> m34465e1() {
        return this.f38678A;
    }

    /* renamed from: f1 */
    public C10140s m34466f1(int i2) {
        return this.f38700o.get(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10124c> mo34080g() {
        return f38677i;
    }

    /* renamed from: g1 */
    public int m34467g1() {
        return this.f38700o.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f38696k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38697l);
        }
        if (m34460a1().size() > 0) {
            codedOutputStream.m38231o0(18);
            codedOutputStream.m38231o0(this.f38703r);
        }
        for (int i2 = 0; i2 < this.f38702q.size(); i2++) {
            codedOutputStream.m38218b0(this.f38702q.get(i2).intValue());
        }
        if ((this.f38696k & 2) == 2) {
            codedOutputStream.m38217a0(3, this.f38698m);
        }
        if ((this.f38696k & 4) == 4) {
            codedOutputStream.m38217a0(4, this.f38699n);
        }
        for (int i3 = 0; i3 < this.f38700o.size(); i3++) {
            codedOutputStream.m38220d0(5, this.f38700o.get(i3));
        }
        for (int i4 = 0; i4 < this.f38701p.size(); i4++) {
            codedOutputStream.m38220d0(6, this.f38701p.get(i4));
        }
        if (m34453T0().size() > 0) {
            codedOutputStream.m38231o0(58);
            codedOutputStream.m38231o0(this.f38705t);
        }
        for (int i5 = 0; i5 < this.f38704s.size(); i5++) {
            codedOutputStream.m38218b0(this.f38704s.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.f38709x.size(); i6++) {
            codedOutputStream.m38220d0(8, this.f38709x.get(i6));
        }
        for (int i7 = 0; i7 < this.f38710y.size(); i7++) {
            codedOutputStream.m38220d0(9, this.f38710y.get(i7));
        }
        for (int i8 = 0; i8 < this.f38711z.size(); i8++) {
            codedOutputStream.m38220d0(10, this.f38711z.get(i8));
        }
        for (int i9 = 0; i9 < this.f38678A.size(); i9++) {
            codedOutputStream.m38220d0(11, this.f38678A.get(i9));
        }
        for (int i10 = 0; i10 < this.f38679B.size(); i10++) {
            codedOutputStream.m38220d0(13, this.f38679B.get(i10));
        }
        if (m34457X0().size() > 0) {
            codedOutputStream.m38231o0(130);
            codedOutputStream.m38231o0(this.f38681D);
        }
        for (int i11 = 0; i11 < this.f38680C.size(); i11++) {
            codedOutputStream.m38218b0(this.f38680C.get(i11).intValue());
        }
        if ((this.f38696k & 8) == 8) {
            codedOutputStream.m38217a0(17, this.f38682E);
        }
        if ((this.f38696k & 16) == 16) {
            codedOutputStream.m38220d0(18, this.f38683F);
        }
        if ((this.f38696k & 32) == 32) {
            codedOutputStream.m38217a0(19, this.f38684G);
        }
        for (int i12 = 0; i12 < this.f38706u.size(); i12++) {
            codedOutputStream.m38220d0(20, this.f38706u.get(i12));
        }
        if (m34487x0().size() > 0) {
            codedOutputStream.m38231o0(170);
            codedOutputStream.m38231o0(this.f38708w);
        }
        for (int i13 = 0; i13 < this.f38707v.size(); i13++) {
            codedOutputStream.m38218b0(this.f38707v.get(i13).intValue());
        }
        if (m34447N0().size() > 0) {
            codedOutputStream.m38231o0(178);
            codedOutputStream.m38231o0(this.f38686I);
        }
        for (int i14 = 0; i14 < this.f38685H.size(); i14++) {
            codedOutputStream.m38218b0(this.f38685H.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.f38687J.size(); i15++) {
            codedOutputStream.m38220d0(23, this.f38687J.get(i15));
        }
        if (m34451R0().size() > 0) {
            codedOutputStream.m38231o0(194);
            codedOutputStream.m38231o0(this.f38689L);
        }
        for (int i16 = 0; i16 < this.f38688K.size(); i16++) {
            codedOutputStream.m38218b0(this.f38688K.get(i16).intValue());
        }
        if ((this.f38696k & 64) == 64) {
            codedOutputStream.m38220d0(30, this.f38690M);
        }
        for (int i17 = 0; i17 < this.f38691N.size(); i17++) {
            codedOutputStream.m38217a0(31, this.f38691N.get(i17).intValue());
        }
        if ((this.f38696k & 128) == 128) {
            codedOutputStream.m38220d0(32, this.f38692O);
        }
        aVarM38405y.m38406a(19000, codedOutputStream);
        codedOutputStream.m38225i0(this.f38695j);
    }

    /* renamed from: h1 */
    public List<C10140s> m34468h1() {
        return this.f38700o;
    }

    /* renamed from: i1 */
    public C10141t m34469i1() {
        return this.f38690M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38693P;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!m34474n1()) {
            this.f38693P = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < m34467g1(); i2++) {
            if (!m34466f1(i2).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m34459Z0(); i3++) {
            if (!m34458Y0(i3).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m34485w0(); i4++) {
            if (!m34484v0(i4).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < m34482t0(); i5++) {
            if (!m34480s0(i5).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < m34441H0(); i6++) {
            if (!m34440G0(i6).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < m34455V0(); i7++) {
            if (!m34454U0(i7).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < m34464d1(); i8++) {
            if (!m34463c1(i8).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < m34436C0(); i9++) {
            if (!m34435B0(i9).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        if (m34476p1() && !m34444K0().isInitialized()) {
            this.f38693P = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < m34449P0(); i10++) {
            if (!m34448O0(i10).isInitialized()) {
                this.f38693P = (byte) 0;
                return false;
            }
        }
        if (m34479r1() && !m34469i1().isInitialized()) {
            this.f38693P = (byte) 0;
            return false;
        }
        if (m38399s()) {
            this.f38693P = (byte) 1;
            return true;
        }
        this.f38693P = (byte) 0;
        return false;
    }

    /* renamed from: j1 */
    public List<Integer> m34470j1() {
        return this.f38691N;
    }

    /* renamed from: k1 */
    public C10144w m34471k1() {
        return this.f38692O;
    }

    /* renamed from: l1 */
    public boolean m34472l1() {
        return (this.f38696k & 4) == 4;
    }

    /* renamed from: m1 */
    public boolean m34473m1() {
        return (this.f38696k & 1) == 1;
    }

    /* renamed from: n1 */
    public boolean m34474n1() {
        return (this.f38696k & 2) == 2;
    }

    /* renamed from: o1 */
    public boolean m34475o1() {
        return (this.f38696k & 8) == 8;
    }

    /* renamed from: p1 */
    public boolean m34476p1() {
        return (this.f38696k & 16) == 16;
    }

    /* renamed from: q1 */
    public boolean m34477q1() {
        return (this.f38696k & 32) == 32;
    }

    /* renamed from: r0 */
    public int m34478r0() {
        return this.f38699n;
    }

    /* renamed from: r1 */
    public boolean m34479r1() {
        return (this.f38696k & 64) == 64;
    }

    /* renamed from: s0 */
    public C10125d m34480s0(int i2) {
        return this.f38709x.get(i2);
    }

    /* renamed from: s1 */
    public boolean m34481s1() {
        return (this.f38696k & 128) == 128;
    }

    /* renamed from: t0 */
    public int m34482t0() {
        return this.f38709x.size();
    }

    /* renamed from: u0 */
    public List<C10125d> m34483u0() {
        return this.f38709x;
    }

    /* renamed from: v0 */
    public C10138q m34484v0(int i2) {
        return this.f38706u.get(i2);
    }

    /* renamed from: w0 */
    public int m34485w0() {
        return this.f38706u.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34430u1();
    }

    /* renamed from: x0 */
    public List<Integer> m34487x0() {
        return this.f38707v;
    }

    /* renamed from: y0 */
    public List<C10138q> m34488y0() {
        return this.f38706u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34431v1(this);
    }

    private C10124c(AbstractC10749h.c<C10124c, ?> cVar) {
        super(cVar);
        this.f38703r = -1;
        this.f38705t = -1;
        this.f38708w = -1;
        this.f38681D = -1;
        this.f38686I = -1;
        this.f38689L = -1;
        this.f38693P = (byte) -1;
        this.f38694Q = -1;
        this.f38695j = cVar.m38391l();
    }

    private C10124c(boolean z) {
        this.f38703r = -1;
        this.f38705t = -1;
        this.f38708w = -1;
        this.f38681D = -1;
        this.f38686I = -1;
        this.f38689L = -1;
        this.f38693P = (byte) -1;
        this.f38694Q = -1;
        this.f38695j = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    private C10124c(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38703r = -1;
        this.f38705t = -1;
        this.f38708w = -1;
        this.f38681D = -1;
        this.f38686I = -1;
        this.f38689L = -1;
        this.f38693P = (byte) -1;
        this.f38694Q = -1;
        m34429t1();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? Mo38390p = 4194304;
            if (!z) {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        switch (iM38320K) {
                            case 0:
                                z = true;
                            case 8:
                                this.f38696k |= 1;
                                this.f38697l = c10746e.m38339s();
                            case 16:
                                if ((i2 & 32) != 32) {
                                    this.f38702q = new ArrayList();
                                    i2 |= 32;
                                }
                                this.f38702q.add(Integer.valueOf(c10746e.m38339s()));
                            case 18:
                                int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 32) != 32 && c10746e.m38327e() > 0) {
                                    this.f38702q = new ArrayList();
                                    i2 |= 32;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38702q.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j);
                                break;
                            case 24:
                                this.f38696k |= 2;
                                this.f38698m = c10746e.m38339s();
                            case 32:
                                this.f38696k |= 4;
                                this.f38699n = c10746e.m38339s();
                            case 42:
                                if ((i2 & 8) != 8) {
                                    this.f38700o = new ArrayList();
                                    i2 |= 8;
                                }
                                this.f38700o.add(c10746e.m38341u(C10140s.f39065i, c10747f));
                            case 50:
                                if ((i2 & 16) != 16) {
                                    this.f38701p = new ArrayList();
                                    i2 |= 16;
                                }
                                this.f38701p.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                            case 56:
                                if ((i2 & 64) != 64) {
                                    this.f38704s = new ArrayList();
                                    i2 |= 64;
                                }
                                this.f38704s.add(Integer.valueOf(c10746e.m38339s()));
                            case 58:
                                int iM38330j2 = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 64) != 64 && c10746e.m38327e() > 0) {
                                    this.f38704s = new ArrayList();
                                    i2 |= 64;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38704s.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j2);
                                break;
                            case 66:
                                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                    this.f38709x = new ArrayList();
                                    i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                }
                                this.f38709x.add(c10746e.m38341u(C10125d.f38748i, c10747f));
                            case 74:
                                if ((i2 & 1024) != 1024) {
                                    this.f38710y = new ArrayList();
                                    i2 |= 1024;
                                }
                                this.f38710y.add(c10746e.m38341u(C10130i.f38832i, c10747f));
                            case 82:
                                if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 2048) {
                                    this.f38711z = new ArrayList();
                                    i2 |= RecyclerView.AbstractC0599l.FLAG_MOVED;
                                }
                                this.f38711z.add(c10746e.m38341u(C10135n.f38914i, c10747f));
                            case 90:
                                if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                                    this.f38678A = new ArrayList();
                                    i2 |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                this.f38678A.add(c10746e.m38341u(C10139r.f39040i, c10747f));
                            case 106:
                                if ((i2 & 8192) != 8192) {
                                    this.f38679B = new ArrayList();
                                    i2 |= 8192;
                                }
                                this.f38679B.add(c10746e.m38341u(C10128g.f38796i, c10747f));
                            case 128:
                                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                    this.f38680C = new ArrayList();
                                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                this.f38680C.add(Integer.valueOf(c10746e.m38339s()));
                            case 130:
                                int iM38330j3 = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384 && c10746e.m38327e() > 0) {
                                    this.f38680C = new ArrayList();
                                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38680C.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j3);
                                break;
                            case 136:
                                this.f38696k |= 8;
                                this.f38682E = c10746e.m38339s();
                            case 146:
                                C10138q.c cVarM35027B0 = (this.f38696k & 16) == 16 ? this.f38683F.mo34077d() : null;
                                C10138q c10138q = (C10138q) c10746e.m38341u(C10138q.f38985i, c10747f);
                                this.f38683F = c10138q;
                                if (cVarM35027B0 != null) {
                                    cVarM35027B0.mo34096m(c10138q);
                                    this.f38683F = cVarM35027B0.m35110u();
                                }
                                this.f38696k |= 16;
                            case 152:
                                this.f38696k |= 32;
                                this.f38684G = c10746e.m38339s();
                            case 162:
                                if ((i2 & 128) != 128) {
                                    this.f38706u = new ArrayList();
                                    i2 |= 128;
                                }
                                this.f38706u.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                            case 168:
                                if ((i2 & 256) != 256) {
                                    this.f38707v = new ArrayList();
                                    i2 |= 256;
                                }
                                this.f38707v.add(Integer.valueOf(c10746e.m38339s()));
                            case 170:
                                int iM38330j4 = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 256) != 256 && c10746e.m38327e() > 0) {
                                    this.f38707v = new ArrayList();
                                    i2 |= 256;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38707v.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j4);
                                break;
                            case 176:
                                if ((i2 & 262144) != 262144) {
                                    this.f38685H = new ArrayList();
                                    i2 |= 262144;
                                }
                                this.f38685H.add(Integer.valueOf(c10746e.m38339s()));
                            case 178:
                                int iM38330j5 = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 262144) != 262144 && c10746e.m38327e() > 0) {
                                    this.f38685H = new ArrayList();
                                    i2 |= 262144;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38685H.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j5);
                                break;
                            case 186:
                                if ((i2 & 524288) != 524288) {
                                    this.f38687J = new ArrayList();
                                    i2 |= 524288;
                                }
                                this.f38687J.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                            case 192:
                                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576) {
                                    this.f38688K = new ArrayList();
                                    i2 |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                                }
                                this.f38688K.add(Integer.valueOf(c10746e.m38339s()));
                            case 194:
                                int iM38330j6 = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576 && c10746e.m38327e() > 0) {
                                    this.f38688K = new ArrayList();
                                    i2 |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38688K.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j6);
                                break;
                            case 242:
                                C10141t.b bVarM35229G = (this.f38696k & 64) == 64 ? this.f38690M.mo34077d() : null;
                                C10141t c10141t = (C10141t) c10746e.m38341u(C10141t.f39091h, c10747f);
                                this.f38690M = c10141t;
                                if (bVarM35229G != null) {
                                    bVarM35229G.mo34096m(c10141t);
                                    this.f38690M = bVarM35229G.m35240q();
                                }
                                this.f38696k |= 64;
                            case 248:
                                if ((i2 & 4194304) != 4194304) {
                                    this.f38691N = new ArrayList();
                                    i2 |= 4194304;
                                }
                                this.f38691N.add(Integer.valueOf(c10746e.m38339s()));
                            case 250:
                                int iM38330j7 = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 4194304) != 4194304 && c10746e.m38327e() > 0) {
                                    this.f38691N = new ArrayList();
                                    i2 |= 4194304;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38691N.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j7);
                                break;
                            case 258:
                                C10144w.b bVarM35339B = (this.f38696k & 128) == 128 ? this.f38692O.mo34077d() : null;
                                C10144w c10144w = (C10144w) c10746e.m38341u(C10144w.f39152h, c10747f);
                                this.f38692O = c10144w;
                                if (bVarM35339B != null) {
                                    bVarM35339B.mo34096m(c10144w);
                                    this.f38692O = bVarM35339B.m35348q();
                                }
                                this.f38696k |= 128;
                            default:
                                Mo38390p = mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K);
                                if (Mo38390p == 0) {
                                    z = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.m38253i(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.f38702q = Collections.unmodifiableList(this.f38702q);
                    }
                    if ((i2 & 8) == 8) {
                        this.f38700o = Collections.unmodifiableList(this.f38700o);
                    }
                    if ((i2 & 16) == 16) {
                        this.f38701p = Collections.unmodifiableList(this.f38701p);
                    }
                    if ((i2 & 64) == 64) {
                        this.f38704s = Collections.unmodifiableList(this.f38704s);
                    }
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.f38709x = Collections.unmodifiableList(this.f38709x);
                    }
                    if ((i2 & 1024) == 1024) {
                        this.f38710y = Collections.unmodifiableList(this.f38710y);
                    }
                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                        this.f38711z = Collections.unmodifiableList(this.f38711z);
                    }
                    if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.f38678A = Collections.unmodifiableList(this.f38678A);
                    }
                    if ((i2 & 8192) == 8192) {
                        this.f38679B = Collections.unmodifiableList(this.f38679B);
                    }
                    if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                        this.f38680C = Collections.unmodifiableList(this.f38680C);
                    }
                    if ((i2 & 128) == 128) {
                        this.f38706u = Collections.unmodifiableList(this.f38706u);
                    }
                    if ((i2 & 256) == 256) {
                        this.f38707v = Collections.unmodifiableList(this.f38707v);
                    }
                    if ((i2 & 262144) == 262144) {
                        this.f38685H = Collections.unmodifiableList(this.f38685H);
                    }
                    if ((i2 & 524288) == 524288) {
                        this.f38687J = Collections.unmodifiableList(this.f38687J);
                    }
                    if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                        this.f38688K = Collections.unmodifiableList(this.f38688K);
                    }
                    if ((i2 & Mo38390p) == Mo38390p) {
                        this.f38691N = Collections.unmodifiableList(this.f38691N);
                    }
                    try {
                        codedOutputStreamM38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38695j = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38695j = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            } else {
                if ((i2 & 32) == 32) {
                    this.f38702q = Collections.unmodifiableList(this.f38702q);
                }
                if ((i2 & 8) == 8) {
                    this.f38700o = Collections.unmodifiableList(this.f38700o);
                }
                if ((i2 & 16) == 16) {
                    this.f38701p = Collections.unmodifiableList(this.f38701p);
                }
                if ((i2 & 64) == 64) {
                    this.f38704s = Collections.unmodifiableList(this.f38704s);
                }
                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.f38709x = Collections.unmodifiableList(this.f38709x);
                }
                if ((i2 & 1024) == 1024) {
                    this.f38710y = Collections.unmodifiableList(this.f38710y);
                }
                if ((i2 & RecyclerView.AbstractC0599l.FLAG_MOVED) == 2048) {
                    this.f38711z = Collections.unmodifiableList(this.f38711z);
                }
                if ((i2 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f38678A = Collections.unmodifiableList(this.f38678A);
                }
                if ((i2 & 8192) == 8192) {
                    this.f38679B = Collections.unmodifiableList(this.f38679B);
                }
                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f38680C = Collections.unmodifiableList(this.f38680C);
                }
                if ((i2 & 128) == 128) {
                    this.f38706u = Collections.unmodifiableList(this.f38706u);
                }
                if ((i2 & 256) == 256) {
                    this.f38707v = Collections.unmodifiableList(this.f38707v);
                }
                if ((i2 & 262144) == 262144) {
                    this.f38685H = Collections.unmodifiableList(this.f38685H);
                }
                if ((i2 & 524288) == 524288) {
                    this.f38687J = Collections.unmodifiableList(this.f38687J);
                }
                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                    this.f38688K = Collections.unmodifiableList(this.f38688K);
                }
                if ((i2 & 4194304) == 4194304) {
                    this.f38691N = Collections.unmodifiableList(this.f38691N);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f38695j = bVarM38280w.m38299e();
                    throw th3;
                }
                this.f38695j = bVarM38280w.m38299e();
                mo38389m();
                return;
            }
        }
    }
}
