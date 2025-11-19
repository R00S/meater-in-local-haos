package s6;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes2.dex */
public final class k implements InterfaceC4489i {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f49328c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f49329d;

    /* compiled from: LazyHeaders.java */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f49330d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map<String, List<j>> f49331e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f49332a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f49333b = f49331e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f49334c = true;

        static {
            String strB = b();
            f49330d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f49331e = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public k a() {
            this.f49332a = true;
            return new k(this.f49333b);
        }
    }

    /* compiled from: LazyHeaders.java */
    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final String f49335a;

        b(String str) {
            this.f49335a = str;
        }

        @Override // s6.j
        public String a() {
            return this.f49335a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f49335a.equals(((b) obj).f49335a);
            }
            return false;
        }

        public int hashCode() {
            return this.f49335a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f49335a + "'}";
        }
    }

    k(Map<String, List<j>> map) {
        this.f49328c = Collections.unmodifiableMap(map);
    }

    private String b(List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = list.get(i10).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f49328c.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // s6.InterfaceC4489i
    public Map<String, String> a() {
        if (this.f49329d == null) {
            synchronized (this) {
                try {
                    if (this.f49329d == null) {
                        this.f49329d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f49329d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f49328c.equals(((k) obj).f49328c);
        }
        return false;
    }

    public int hashCode() {
        return this.f49328c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f49328c + '}';
    }
}
