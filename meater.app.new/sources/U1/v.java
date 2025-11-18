package U1;

import X1.C1804a;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m8.AbstractC4009y;
import m8.AbstractC4010z;

/* compiled from: MediaItem.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: i, reason: collision with root package name */
    public static final v f17226i = new c().a();

    /* renamed from: j, reason: collision with root package name */
    private static final String f17227j = X1.L.B0(0);

    /* renamed from: k, reason: collision with root package name */
    private static final String f17228k = X1.L.B0(1);

    /* renamed from: l, reason: collision with root package name */
    private static final String f17229l = X1.L.B0(2);

    /* renamed from: m, reason: collision with root package name */
    private static final String f17230m = X1.L.B0(3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f17231n = X1.L.B0(4);

    /* renamed from: o, reason: collision with root package name */
    private static final String f17232o = X1.L.B0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f17233a;

    /* renamed from: b, reason: collision with root package name */
    public final h f17234b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f17235c;

    /* renamed from: d, reason: collision with root package name */
    public final g f17236d;

    /* renamed from: e, reason: collision with root package name */
    public final x f17237e;

    /* renamed from: f, reason: collision with root package name */
    public final d f17238f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f17239g;

    /* renamed from: h, reason: collision with root package name */
    public final i f17240h;

    /* compiled from: MediaItem.java */
    public static final class b {
    }

    /* compiled from: MediaItem.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f17241a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f17242b;

        /* renamed from: c, reason: collision with root package name */
        private String f17243c;

        /* renamed from: d, reason: collision with root package name */
        private d.a f17244d;

        /* renamed from: e, reason: collision with root package name */
        private f.a f17245e;

        /* renamed from: f, reason: collision with root package name */
        private List<E> f17246f;

        /* renamed from: g, reason: collision with root package name */
        private String f17247g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC4009y<k> f17248h;

        /* renamed from: i, reason: collision with root package name */
        private Object f17249i;

        /* renamed from: j, reason: collision with root package name */
        private long f17250j;

        /* renamed from: k, reason: collision with root package name */
        private x f17251k;

        /* renamed from: l, reason: collision with root package name */
        private g.a f17252l;

        /* renamed from: m, reason: collision with root package name */
        private i f17253m;

        public v a() {
            h hVar;
            C1804a.g(this.f17245e.f17295b == null || this.f17245e.f17294a != null);
            Uri uri = this.f17242b;
            if (uri != null) {
                hVar = new h(uri, this.f17243c, this.f17245e.f17294a != null ? this.f17245e.i() : null, null, this.f17246f, this.f17247g, this.f17248h, this.f17249i, this.f17250j);
            } else {
                hVar = null;
            }
            String str = this.f17241a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f17244d.g();
            g gVarF = this.f17252l.f();
            x xVar = this.f17251k;
            if (xVar == null) {
                xVar = x.f17368I;
            }
            return new v(str2, eVarG, hVar, gVarF, xVar, this.f17253m);
        }

        public c b(g gVar) {
            this.f17252l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f17241a = (String) C1804a.e(str);
            return this;
        }

        public c d(List<k> list) {
            this.f17248h = AbstractC4009y.B(list);
            return this;
        }

        public c e(Object obj) {
            this.f17249i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f17242b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f17244d = new d.a();
            this.f17245e = new f.a();
            this.f17246f = Collections.emptyList();
            this.f17248h = AbstractC4009y.G();
            this.f17252l = new g.a();
            this.f17253m = i.f17335d;
            this.f17250j = -9223372036854775807L;
        }

        private c(v vVar) {
            f.a aVar;
            this();
            this.f17244d = vVar.f17238f.a();
            this.f17241a = vVar.f17233a;
            this.f17251k = vVar.f17237e;
            this.f17252l = vVar.f17236d.a();
            this.f17253m = vVar.f17240h;
            h hVar = vVar.f17234b;
            if (hVar != null) {
                this.f17247g = hVar.f17330e;
                this.f17243c = hVar.f17327b;
                this.f17242b = hVar.f17326a;
                this.f17246f = hVar.f17329d;
                this.f17248h = hVar.f17331f;
                this.f17249i = hVar.f17333h;
                f fVar = hVar.f17328c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f17245e = aVar;
                this.f17250j = hVar.f17334i;
            }
        }
    }

    /* compiled from: MediaItem.java */
    public static class d {

        /* renamed from: h, reason: collision with root package name */
        public static final d f17254h = new a().f();

        /* renamed from: i, reason: collision with root package name */
        private static final String f17255i = X1.L.B0(0);

        /* renamed from: j, reason: collision with root package name */
        private static final String f17256j = X1.L.B0(1);

        /* renamed from: k, reason: collision with root package name */
        private static final String f17257k = X1.L.B0(2);

        /* renamed from: l, reason: collision with root package name */
        private static final String f17258l = X1.L.B0(3);

        /* renamed from: m, reason: collision with root package name */
        private static final String f17259m = X1.L.B0(4);

        /* renamed from: n, reason: collision with root package name */
        static final String f17260n = X1.L.B0(5);

        /* renamed from: o, reason: collision with root package name */
        static final String f17261o = X1.L.B0(6);

        /* renamed from: a, reason: collision with root package name */
        public final long f17262a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17263b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17264c;

        /* renamed from: d, reason: collision with root package name */
        public final long f17265d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f17266e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f17267f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f17268g;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f17269a;

            /* renamed from: b, reason: collision with root package name */
            private long f17270b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f17271c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f17272d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f17273e;

            public d f() {
                return new d(this);
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a() {
                this.f17270b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f17269a = dVar.f17263b;
                this.f17270b = dVar.f17265d;
                this.f17271c = dVar.f17266e;
                this.f17272d = dVar.f17267f;
                this.f17273e = dVar.f17268g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f17263b == dVar.f17263b && this.f17265d == dVar.f17265d && this.f17266e == dVar.f17266e && this.f17267f == dVar.f17267f && this.f17268g == dVar.f17268g;
        }

        public int hashCode() {
            long j10 = this.f17263b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f17265d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f17266e ? 1 : 0)) * 31) + (this.f17267f ? 1 : 0)) * 31) + (this.f17268g ? 1 : 0);
        }

        private d(a aVar) {
            this.f17262a = X1.L.u1(aVar.f17269a);
            this.f17264c = X1.L.u1(aVar.f17270b);
            this.f17263b = aVar.f17269a;
            this.f17265d = aVar.f17270b;
            this.f17266e = aVar.f17271c;
            this.f17267f = aVar.f17272d;
            this.f17268g = aVar.f17273e;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class e extends d {

        /* renamed from: p, reason: collision with root package name */
        public static final e f17274p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    public static final class f {

        /* renamed from: l, reason: collision with root package name */
        private static final String f17275l = X1.L.B0(0);

        /* renamed from: m, reason: collision with root package name */
        private static final String f17276m = X1.L.B0(1);

        /* renamed from: n, reason: collision with root package name */
        private static final String f17277n = X1.L.B0(2);

        /* renamed from: o, reason: collision with root package name */
        private static final String f17278o = X1.L.B0(3);

        /* renamed from: p, reason: collision with root package name */
        static final String f17279p = X1.L.B0(4);

        /* renamed from: q, reason: collision with root package name */
        private static final String f17280q = X1.L.B0(5);

        /* renamed from: r, reason: collision with root package name */
        private static final String f17281r = X1.L.B0(6);

        /* renamed from: s, reason: collision with root package name */
        private static final String f17282s = X1.L.B0(7);

        /* renamed from: a, reason: collision with root package name */
        public final UUID f17283a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f17284b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f17285c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final AbstractC4010z<String, String> f17286d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC4010z<String, String> f17287e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f17288f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f17289g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f17290h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public final AbstractC4009y<Integer> f17291i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC4009y<Integer> f17292j;

        /* renamed from: k, reason: collision with root package name */
        private final byte[] f17293k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f17293k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f17283a.equals(fVar.f17283a) && X1.L.d(this.f17285c, fVar.f17285c) && X1.L.d(this.f17287e, fVar.f17287e) && this.f17288f == fVar.f17288f && this.f17290h == fVar.f17290h && this.f17289g == fVar.f17289g && this.f17292j.equals(fVar.f17292j) && Arrays.equals(this.f17293k, fVar.f17293k);
        }

        public int hashCode() {
            int iHashCode = this.f17283a.hashCode() * 31;
            Uri uri = this.f17285c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f17287e.hashCode()) * 31) + (this.f17288f ? 1 : 0)) * 31) + (this.f17290h ? 1 : 0)) * 31) + (this.f17289g ? 1 : 0)) * 31) + this.f17292j.hashCode()) * 31) + Arrays.hashCode(this.f17293k);
        }

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f17294a;

            /* renamed from: b, reason: collision with root package name */
            private Uri f17295b;

            /* renamed from: c, reason: collision with root package name */
            private AbstractC4010z<String, String> f17296c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f17297d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f17298e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f17299f;

            /* renamed from: g, reason: collision with root package name */
            private AbstractC4009y<Integer> f17300g;

            /* renamed from: h, reason: collision with root package name */
            private byte[] f17301h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f17296c = AbstractC4010z.l();
                this.f17298e = true;
                this.f17300g = AbstractC4009y.G();
            }

            private a(f fVar) {
                this.f17294a = fVar.f17283a;
                this.f17295b = fVar.f17285c;
                this.f17296c = fVar.f17287e;
                this.f17297d = fVar.f17288f;
                this.f17298e = fVar.f17289g;
                this.f17299f = fVar.f17290h;
                this.f17300g = fVar.f17292j;
                this.f17301h = fVar.f17293k;
            }
        }

        private f(a aVar) {
            C1804a.g((aVar.f17299f && aVar.f17295b == null) ? false : true);
            UUID uuid = (UUID) C1804a.e(aVar.f17294a);
            this.f17283a = uuid;
            this.f17284b = uuid;
            this.f17285c = aVar.f17295b;
            this.f17286d = aVar.f17296c;
            this.f17287e = aVar.f17296c;
            this.f17288f = aVar.f17297d;
            this.f17290h = aVar.f17299f;
            this.f17289g = aVar.f17298e;
            this.f17291i = aVar.f17300g;
            this.f17292j = aVar.f17300g;
            this.f17293k = aVar.f17301h != null ? Arrays.copyOf(aVar.f17301h, aVar.f17301h.length) : null;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f17302f = new a().f();

        /* renamed from: g, reason: collision with root package name */
        private static final String f17303g = X1.L.B0(0);

        /* renamed from: h, reason: collision with root package name */
        private static final String f17304h = X1.L.B0(1);

        /* renamed from: i, reason: collision with root package name */
        private static final String f17305i = X1.L.B0(2);

        /* renamed from: j, reason: collision with root package name */
        private static final String f17306j = X1.L.B0(3);

        /* renamed from: k, reason: collision with root package name */
        private static final String f17307k = X1.L.B0(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f17308a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17309b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17310c;

        /* renamed from: d, reason: collision with root package name */
        public final float f17311d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17312e;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f17313a;

            /* renamed from: b, reason: collision with root package name */
            private long f17314b;

            /* renamed from: c, reason: collision with root package name */
            private long f17315c;

            /* renamed from: d, reason: collision with root package name */
            private float f17316d;

            /* renamed from: e, reason: collision with root package name */
            private float f17317e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f17315c = j10;
                return this;
            }

            public a h(float f10) {
                this.f17317e = f10;
                return this;
            }

            public a i(long j10) {
                this.f17314b = j10;
                return this;
            }

            public a j(float f10) {
                this.f17316d = f10;
                return this;
            }

            public a k(long j10) {
                this.f17313a = j10;
                return this;
            }

            public a() {
                this.f17313a = -9223372036854775807L;
                this.f17314b = -9223372036854775807L;
                this.f17315c = -9223372036854775807L;
                this.f17316d = -3.4028235E38f;
                this.f17317e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f17313a = gVar.f17308a;
                this.f17314b = gVar.f17309b;
                this.f17315c = gVar.f17310c;
                this.f17316d = gVar.f17311d;
                this.f17317e = gVar.f17312e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f17308a == gVar.f17308a && this.f17309b == gVar.f17309b && this.f17310c == gVar.f17310c && this.f17311d == gVar.f17311d && this.f17312e == gVar.f17312e;
        }

        public int hashCode() {
            long j10 = this.f17308a;
            long j11 = this.f17309b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f17310c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f17311d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f17312e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f17313a, aVar.f17314b, aVar.f17315c, aVar.f17316d, aVar.f17317e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f17308a = j10;
            this.f17309b = j11;
            this.f17310c = j12;
            this.f17311d = f10;
            this.f17312e = f11;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class h {

        /* renamed from: j, reason: collision with root package name */
        private static final String f17318j = X1.L.B0(0);

        /* renamed from: k, reason: collision with root package name */
        private static final String f17319k = X1.L.B0(1);

        /* renamed from: l, reason: collision with root package name */
        private static final String f17320l = X1.L.B0(2);

        /* renamed from: m, reason: collision with root package name */
        private static final String f17321m = X1.L.B0(3);

        /* renamed from: n, reason: collision with root package name */
        private static final String f17322n = X1.L.B0(4);

        /* renamed from: o, reason: collision with root package name */
        private static final String f17323o = X1.L.B0(5);

        /* renamed from: p, reason: collision with root package name */
        private static final String f17324p = X1.L.B0(6);

        /* renamed from: q, reason: collision with root package name */
        private static final String f17325q = X1.L.B0(7);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17326a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17327b;

        /* renamed from: c, reason: collision with root package name */
        public final f f17328c;

        /* renamed from: d, reason: collision with root package name */
        public final List<E> f17329d;

        /* renamed from: e, reason: collision with root package name */
        public final String f17330e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC4009y<k> f17331f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public final List<j> f17332g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f17333h;

        /* renamed from: i, reason: collision with root package name */
        public final long f17334i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f17326a.equals(hVar.f17326a) && X1.L.d(this.f17327b, hVar.f17327b) && X1.L.d(this.f17328c, hVar.f17328c) && X1.L.d(null, null) && this.f17329d.equals(hVar.f17329d) && X1.L.d(this.f17330e, hVar.f17330e) && this.f17331f.equals(hVar.f17331f) && X1.L.d(this.f17333h, hVar.f17333h) && X1.L.d(Long.valueOf(this.f17334i), Long.valueOf(hVar.f17334i));
        }

        public int hashCode() {
            int iHashCode = this.f17326a.hashCode() * 31;
            String str = this.f17327b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f17328c;
            int iHashCode3 = (((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f17329d.hashCode()) * 31;
            String str2 = this.f17330e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17331f.hashCode()) * 31;
            return (int) (((iHashCode4 + (this.f17333h != null ? r1.hashCode() : 0)) * 31) + this.f17334i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<E> list, String str2, AbstractC4009y<k> abstractC4009y, Object obj, long j10) {
            this.f17326a = uri;
            this.f17327b = z.t(str);
            this.f17328c = fVar;
            this.f17329d = list;
            this.f17330e = str2;
            this.f17331f = abstractC4009y;
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            for (int i10 = 0; i10 < abstractC4009y.size(); i10++) {
                aVarY.a(abstractC4009y.get(i10).a().i());
            }
            this.f17332g = aVarY.k();
            this.f17333h = obj;
            this.f17334i = j10;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class i {

        /* renamed from: d, reason: collision with root package name */
        public static final i f17335d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        private static final String f17336e = X1.L.B0(0);

        /* renamed from: f, reason: collision with root package name */
        private static final String f17337f = X1.L.B0(1);

        /* renamed from: g, reason: collision with root package name */
        private static final String f17338g = X1.L.B0(2);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17339a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17340b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f17341c;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f17342a;

            /* renamed from: b, reason: collision with root package name */
            private String f17343b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f17344c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (X1.L.d(this.f17339a, iVar.f17339a) && X1.L.d(this.f17340b, iVar.f17340b)) {
                if ((this.f17341c == null) == (iVar.f17341c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f17339a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f17340b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f17341c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f17339a = aVar.f17342a;
            this.f17340b = aVar.f17343b;
            this.f17341c = aVar.f17344c;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    public static class k {

        /* renamed from: h, reason: collision with root package name */
        private static final String f17345h = X1.L.B0(0);

        /* renamed from: i, reason: collision with root package name */
        private static final String f17346i = X1.L.B0(1);

        /* renamed from: j, reason: collision with root package name */
        private static final String f17347j = X1.L.B0(2);

        /* renamed from: k, reason: collision with root package name */
        private static final String f17348k = X1.L.B0(3);

        /* renamed from: l, reason: collision with root package name */
        private static final String f17349l = X1.L.B0(4);

        /* renamed from: m, reason: collision with root package name */
        private static final String f17350m = X1.L.B0(5);

        /* renamed from: n, reason: collision with root package name */
        private static final String f17351n = X1.L.B0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17352a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17353b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17354c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17355d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17356e;

        /* renamed from: f, reason: collision with root package name */
        public final String f17357f;

        /* renamed from: g, reason: collision with root package name */
        public final String f17358g;

        /* compiled from: MediaItem.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f17359a;

            /* renamed from: b, reason: collision with root package name */
            private String f17360b;

            /* renamed from: c, reason: collision with root package name */
            private String f17361c;

            /* renamed from: d, reason: collision with root package name */
            private int f17362d;

            /* renamed from: e, reason: collision with root package name */
            private int f17363e;

            /* renamed from: f, reason: collision with root package name */
            private String f17364f;

            /* renamed from: g, reason: collision with root package name */
            private String f17365g;

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f17359a = kVar.f17352a;
                this.f17360b = kVar.f17353b;
                this.f17361c = kVar.f17354c;
                this.f17362d = kVar.f17355d;
                this.f17363e = kVar.f17356e;
                this.f17364f = kVar.f17357f;
                this.f17365g = kVar.f17358g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f17352a.equals(kVar.f17352a) && X1.L.d(this.f17353b, kVar.f17353b) && X1.L.d(this.f17354c, kVar.f17354c) && this.f17355d == kVar.f17355d && this.f17356e == kVar.f17356e && X1.L.d(this.f17357f, kVar.f17357f) && X1.L.d(this.f17358g, kVar.f17358g);
        }

        public int hashCode() {
            int iHashCode = this.f17352a.hashCode() * 31;
            String str = this.f17353b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f17354c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17355d) * 31) + this.f17356e) * 31;
            String str3 = this.f17357f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f17358g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f17352a = aVar.f17359a;
            this.f17353b = aVar.f17360b;
            this.f17354c = aVar.f17361c;
            this.f17355d = aVar.f17362d;
            this.f17356e = aVar.f17363e;
            this.f17357f = aVar.f17364f;
            this.f17358g = aVar.f17365g;
        }
    }

    public static v b(Uri uri) {
        return new c().f(uri).a();
    }

    public static v c(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return X1.L.d(this.f17233a, vVar.f17233a) && this.f17238f.equals(vVar.f17238f) && X1.L.d(this.f17234b, vVar.f17234b) && X1.L.d(this.f17236d, vVar.f17236d) && X1.L.d(this.f17237e, vVar.f17237e) && X1.L.d(this.f17240h, vVar.f17240h);
    }

    public int hashCode() {
        int iHashCode = this.f17233a.hashCode() * 31;
        h hVar = this.f17234b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f17236d.hashCode()) * 31) + this.f17238f.hashCode()) * 31) + this.f17237e.hashCode()) * 31) + this.f17240h.hashCode();
    }

    private v(String str, e eVar, h hVar, g gVar, x xVar, i iVar) {
        this.f17233a = str;
        this.f17234b = hVar;
        this.f17235c = hVar;
        this.f17236d = gVar;
        this.f17237e = xVar;
        this.f17238f = eVar;
        this.f17239g = eVar;
        this.f17240h = iVar;
    }
}
