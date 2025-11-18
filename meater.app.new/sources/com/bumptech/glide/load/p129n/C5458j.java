package com.bumptech.glide.load.p129n;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* renamed from: com.bumptech.glide.load.n.j */
/* loaded from: classes.dex */
public final class C5458j implements InterfaceC5456h {

    /* renamed from: c */
    private final Map<String, List<InterfaceC5457i>> f13635c;

    /* renamed from: d */
    private volatile Map<String, String> f13636d;

    /* compiled from: LazyHeaders.java */
    /* renamed from: com.bumptech.glide.load.n.j$a */
    public static final class a {

        /* renamed from: a */
        private static final String f13637a;

        /* renamed from: b */
        private static final Map<String, List<InterfaceC5457i>> f13638b;

        /* renamed from: c */
        private boolean f13639c = true;

        /* renamed from: d */
        private Map<String, List<InterfaceC5457i>> f13640d = f13638b;

        /* renamed from: e */
        private boolean f13641e = true;

        static {
            String strM10547b = m10547b();
            f13637a = strM10547b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM10547b)) {
                map.put("User-Agent", Collections.singletonList(new b(strM10547b)));
            }
            f13638b = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        static String m10547b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = property.charAt(i2);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C5458j m10548a() {
            this.f13639c = true;
            return new C5458j(this.f13640d);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* renamed from: com.bumptech.glide.load.n.j$b */
    static final class b implements InterfaceC5457i {

        /* renamed from: a */
        private final String f13642a;

        b(String str) {
            this.f13642a = str;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5457i
        /* renamed from: a */
        public String mo10544a() {
            return this.f13642a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f13642a.equals(((b) obj).f13642a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13642a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f13642a + "'}";
        }
    }

    C5458j(Map<String, List<InterfaceC5457i>> map) {
        this.f13635c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m10545b(List<InterfaceC5457i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strMo10544a = list.get(i2).mo10544a();
            if (!TextUtils.isEmpty(strMo10544a)) {
                sb.append(strMo10544a);
                if (i2 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m10546c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC5457i>> entry : this.f13635c.entrySet()) {
            String strM10545b = m10545b(entry.getValue());
            if (!TextUtils.isEmpty(strM10545b)) {
                map.put(entry.getKey(), strM10545b);
            }
        }
        return map;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5456h
    /* renamed from: a */
    public Map<String, String> mo10543a() {
        if (this.f13636d == null) {
            synchronized (this) {
                if (this.f13636d == null) {
                    this.f13636d = Collections.unmodifiableMap(m10546c());
                }
            }
        }
        return this.f13636d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5458j) {
            return this.f13635c.equals(((C5458j) obj).f13635c);
        }
        return false;
    }

    public int hashCode() {
        return this.f13635c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f13635c + '}';
    }
}
