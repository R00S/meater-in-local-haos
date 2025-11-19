package B8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MonitoringAnnotations.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1896b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f1897a;

    /* compiled from: MonitoringAnnotations.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f1898a = new HashMap<>();

        public a a() {
            if (this.f1898a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            a aVar = new a(Collections.unmodifiableMap(this.f1898a));
            this.f1898a = null;
            return aVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f1897a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f1897a.equals(((a) obj).f1897a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1897a.hashCode();
    }

    public String toString() {
        return this.f1897a.toString();
    }

    private a(Map<String, String> map) {
        this.f1897a = map;
    }
}
