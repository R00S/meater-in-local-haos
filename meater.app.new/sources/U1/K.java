package U1;

import X1.C1804a;
import java.util.Arrays;
import java.util.List;
import m8.AbstractC4009y;
import p8.C4244a;

/* compiled from: Tracks.java */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final K f16970b = new K(AbstractC4009y.G());

    /* renamed from: c, reason: collision with root package name */
    private static final String f16971c = X1.L.B0(0);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4009y<a> f16972a;

    /* compiled from: Tracks.java */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final String f16973f = X1.L.B0(0);

        /* renamed from: g, reason: collision with root package name */
        private static final String f16974g = X1.L.B0(1);

        /* renamed from: h, reason: collision with root package name */
        private static final String f16975h = X1.L.B0(3);

        /* renamed from: i, reason: collision with root package name */
        private static final String f16976i = X1.L.B0(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f16977a;

        /* renamed from: b, reason: collision with root package name */
        private final H f16978b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16979c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f16980d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean[] f16981e;

        public a(H h10, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = h10.f16862a;
            this.f16977a = i10;
            boolean z11 = false;
            C1804a.a(i10 == iArr.length && i10 == zArr.length);
            this.f16978b = h10;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f16979c = z11;
            this.f16980d = (int[]) iArr.clone();
            this.f16981e = (boolean[]) zArr.clone();
        }

        public H a() {
            return this.f16978b;
        }

        public s b(int i10) {
            return this.f16978b.a(i10);
        }

        public int c() {
            return this.f16978b.f16864c;
        }

        public boolean d() {
            return this.f16979c;
        }

        public boolean e() {
            return C4244a.a(this.f16981e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16979c == aVar.f16979c && this.f16978b.equals(aVar.f16978b) && Arrays.equals(this.f16980d, aVar.f16980d) && Arrays.equals(this.f16981e, aVar.f16981e);
        }

        public boolean f(boolean z10) {
            for (int i10 = 0; i10 < this.f16980d.length; i10++) {
                if (i(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i10) {
            return this.f16981e[i10];
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public int hashCode() {
            return (((((this.f16978b.hashCode() * 31) + (this.f16979c ? 1 : 0)) * 31) + Arrays.hashCode(this.f16980d)) * 31) + Arrays.hashCode(this.f16981e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f16980d[i10];
            return i11 == 4 || (z10 && i11 == 3);
        }
    }

    public K(List<a> list) {
        this.f16972a = AbstractC4009y.B(list);
    }

    public AbstractC4009y<a> a() {
        return this.f16972a;
    }

    public boolean b() {
        return this.f16972a.isEmpty();
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f16972a.size(); i11++) {
            a aVar = this.f16972a.get(i11);
            if (aVar.e() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f16972a.size(); i11++) {
            if (this.f16972a.get(i11).c() == i10 && this.f16972a.get(i11).f(z10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        return this.f16972a.equals(((K) obj).f16972a);
    }

    public int hashCode() {
        return this.f16972a.hashCode();
    }
}
