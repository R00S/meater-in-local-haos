package B8;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import r8.k;

/* compiled from: MonitoringKeysetInfo.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final B8.a f1899a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C0030c> f1900b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f1901c;

    /* compiled from: MonitoringKeysetInfo.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<C0030c> f1902a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private B8.a f1903b = B8.a.f1896b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1904c = null;

        private boolean c(int i10) {
            Iterator<C0030c> it = this.f1902a.iterator();
            while (it.hasNext()) {
                if (it.next().a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b a(k kVar, int i10, String str, String str2) {
            ArrayList<C0030c> arrayList = this.f1902a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0030c(kVar, i10, str, str2));
            return this;
        }

        public c b() throws GeneralSecurityException {
            if (this.f1902a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f1904c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f1903b, Collections.unmodifiableList(this.f1902a), this.f1904c);
            this.f1902a = null;
            return cVar;
        }

        public b d(B8.a aVar) {
            if (this.f1902a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f1903b = aVar;
            return this;
        }

        public b e(int i10) {
            if (this.f1902a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f1904c = Integer.valueOf(i10);
            return this;
        }
    }

    /* compiled from: MonitoringKeysetInfo.java */
    /* renamed from: B8.c$c, reason: collision with other inner class name */
    public static final class C0030c {

        /* renamed from: a, reason: collision with root package name */
        private final k f1905a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1906b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1907c;

        /* renamed from: d, reason: collision with root package name */
        private final String f1908d;

        public int a() {
            return this.f1906b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0030c)) {
                return false;
            }
            C0030c c0030c = (C0030c) obj;
            return this.f1905a == c0030c.f1905a && this.f1906b == c0030c.f1906b && this.f1907c.equals(c0030c.f1907c) && this.f1908d.equals(c0030c.f1908d);
        }

        public int hashCode() {
            return Objects.hash(this.f1905a, Integer.valueOf(this.f1906b), this.f1907c, this.f1908d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f1905a, Integer.valueOf(this.f1906b), this.f1907c, this.f1908d);
        }

        private C0030c(k kVar, int i10, String str, String str2) {
            this.f1905a = kVar;
            this.f1906b = i10;
            this.f1907c = str;
            this.f1908d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1899a.equals(cVar.f1899a) && this.f1900b.equals(cVar.f1900b) && Objects.equals(this.f1901c, cVar.f1901c);
    }

    public int hashCode() {
        return Objects.hash(this.f1899a, this.f1900b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f1899a, this.f1900b, this.f1901c);
    }

    private c(B8.a aVar, List<C0030c> list, Integer num) {
        this.f1899a = aVar;
        this.f1900b = list;
        this.f1901c = num;
    }
}
