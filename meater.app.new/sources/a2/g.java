package a2;

import U1.w;
import X1.C1804a;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19983a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19985c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f19986d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f19987e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f19988f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19989g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19990h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19991i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19992j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f19993k;

    /* compiled from: DataSpec.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f19994a;

        /* renamed from: b, reason: collision with root package name */
        private long f19995b;

        /* renamed from: c, reason: collision with root package name */
        private int f19996c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f19997d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f19998e;

        /* renamed from: f, reason: collision with root package name */
        private long f19999f;

        /* renamed from: g, reason: collision with root package name */
        private long f20000g;

        /* renamed from: h, reason: collision with root package name */
        private String f20001h;

        /* renamed from: i, reason: collision with root package name */
        private int f20002i;

        /* renamed from: j, reason: collision with root package name */
        private Object f20003j;

        public g a() {
            C1804a.j(this.f19994a, "The uri must be set.");
            return new g(this.f19994a, this.f19995b, this.f19996c, this.f19997d, this.f19998e, this.f19999f, this.f20000g, this.f20001h, this.f20002i, this.f20003j);
        }

        public b b(int i10) {
            this.f20002i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f19997d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f19996c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f19998e = map;
            return this;
        }

        public b f(String str) {
            this.f20001h = str;
            return this;
        }

        public b g(long j10) {
            this.f20000g = j10;
            return this;
        }

        public b h(long j10) {
            this.f19999f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f19994a = uri;
            return this;
        }

        public b j(String str) {
            this.f19994a = Uri.parse(str);
            return this;
        }

        public b k(long j10) {
            this.f19995b = j10;
            return this;
        }

        public b() {
            this.f19996c = 1;
            this.f19998e = Collections.emptyMap();
            this.f20000g = -1L;
        }

        private b(g gVar) {
            this.f19994a = gVar.f19983a;
            this.f19995b = gVar.f19984b;
            this.f19996c = gVar.f19985c;
            this.f19997d = gVar.f19986d;
            this.f19998e = gVar.f19987e;
            this.f19999f = gVar.f19989g;
            this.f20000g = gVar.f19990h;
            this.f20001h = gVar.f19991i;
            this.f20002i = gVar.f19992j;
            this.f20003j = gVar.f19993k;
        }
    }

    static {
        w.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f19985c);
    }

    public boolean d(int i10) {
        return (this.f19992j & i10) == i10;
    }

    public g e(long j10) {
        long j11 = this.f19990h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public g f(long j10, long j11) {
        return (j10 == 0 && this.f19990h == j11) ? this : new g(this.f19983a, this.f19984b, this.f19985c, this.f19986d, this.f19987e, this.f19989g + j10, j11, this.f19991i, this.f19992j, this.f19993k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f19983a + ", " + this.f19989g + ", " + this.f19990h + ", " + this.f19991i + ", " + this.f19992j + "]";
    }

    public g(Uri uri) {
        this(uri, 0L, -1L);
    }

    public g(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    @Deprecated
    public g(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, str, 0, null);
    }

    private g(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        C1804a.a(j13 >= 0);
        C1804a.a(j11 >= 0);
        C1804a.a(j12 > 0 || j12 == -1);
        this.f19983a = (Uri) C1804a.e(uri);
        this.f19984b = j10;
        this.f19985c = i10;
        this.f19986d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f19987e = Collections.unmodifiableMap(new HashMap(map));
        this.f19989g = j11;
        this.f19988f = j13;
        this.f19990h = j12;
        this.f19991i = str;
        this.f19992j = i11;
        this.f19993k = obj;
    }
}
