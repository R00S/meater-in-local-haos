package v2;

import X1.C1804a;

/* compiled from: SeekMap.java */
/* loaded from: classes.dex */
public interface J {

    /* compiled from: SeekMap.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final K f51049a;

        /* renamed from: b, reason: collision with root package name */
        public final K f51050b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f51049a.equals(aVar.f51049a) && this.f51050b.equals(aVar.f51050b);
        }

        public int hashCode() {
            return (this.f51049a.hashCode() * 31) + this.f51050b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f51049a);
            if (this.f51049a.equals(this.f51050b)) {
                str = "";
            } else {
                str = ", " + this.f51050b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(K k10, K k11) {
            this.f51049a = (K) C1804a.e(k10);
            this.f51050b = (K) C1804a.e(k11);
        }
    }

    /* compiled from: SeekMap.java */
    public static class b implements J {

        /* renamed from: a, reason: collision with root package name */
        private final long f51051a;

        /* renamed from: b, reason: collision with root package name */
        private final a f51052b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // v2.J
        public boolean g() {
            return false;
        }

        @Override // v2.J
        public a k(long j10) {
            return this.f51052b;
        }

        @Override // v2.J
        public long m() {
            return this.f51051a;
        }

        public b(long j10, long j11) {
            this.f51051a = j10;
            this.f51052b = new a(j11 == 0 ? K.f51053c : new K(0L, j11));
        }
    }

    boolean g();

    a k(long j10);

    long m();
}
