package kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10801m;
import kotlin.collections.C10808p0;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;

/* compiled from: KotlinClassHeader.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.c0.a */
/* loaded from: classes3.dex */
public final class C10086a {

    /* renamed from: a */
    private final a f38402a;

    /* renamed from: b */
    private final C10117e f38403b;

    /* renamed from: c */
    private final String[] f38404c;

    /* renamed from: d */
    private final String[] f38405d;

    /* renamed from: e */
    private final String[] f38406e;

    /* renamed from: f */
    private final String f38407f;

    /* renamed from: g */
    private final int f38408g;

    /* renamed from: h */
    private final String f38409h;

    /* renamed from: i */
    private final byte[] f38410i;

    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c0.a$a */
    public enum a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* renamed from: f */
        public static final C11549a f38411f = new C11549a(null);

        /* renamed from: g */
        private static final Map<Integer, a> f38412g;

        /* renamed from: o */
        private final int f38420o;

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c0.a$a$a, reason: collision with other inner class name */
        public static final class C11549a {
            private C11549a() {
            }

            public /* synthetic */ C11549a(C9789g c9789g) {
                this();
            }

            /* renamed from: a */
            public final a m33924a(int i2) {
                a aVar = (a) a.f38412g.get(Integer.valueOf(i2));
                return aVar == null ? a.UNKNOWN : aVar;
            }
        }

        static {
            a[] aVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(aVarArrValues.length), 16));
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(Integer.valueOf(aVar.f38420o), aVar);
            }
            f38412g = linkedHashMap;
        }

        a(int i2) {
            this.f38420o = i2;
        }

        /* renamed from: q */
        public static final a m33923q(int i2) {
            return f38411f.m33924a(i2);
        }
    }

    public C10086a(a aVar, C10117e c10117e, String[] strArr, String[] strArr2, String[] strArr3, String str, int i2, String str2, byte[] bArr) {
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(c10117e, "metadataVersion");
        this.f38402a = aVar;
        this.f38403b = c10117e;
        this.f38404c = strArr;
        this.f38405d = strArr2;
        this.f38406e = strArr3;
        this.f38407f = str;
        this.f38408g = i2;
        this.f38409h = str2;
        this.f38410i = bArr;
    }

    /* renamed from: h */
    private final boolean m33910h(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    public final String[] m33911a() {
        return this.f38404c;
    }

    /* renamed from: b */
    public final String[] m33912b() {
        return this.f38405d;
    }

    /* renamed from: c */
    public final a m33913c() {
        return this.f38402a;
    }

    /* renamed from: d */
    public final C10117e m33914d() {
        return this.f38403b;
    }

    /* renamed from: e */
    public final String m33915e() {
        String str = this.f38407f;
        if (this.f38402a == a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> m33916f() {
        String[] strArr = this.f38404c;
        if (!(this.f38402a == a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> listM38702c = strArr != null ? C10801m.m38702c(strArr) : null;
        return listM38702c == null ? C10817u.m38888j() : listM38702c;
    }

    /* renamed from: g */
    public final String[] m33917g() {
        return this.f38406e;
    }

    /* renamed from: i */
    public final boolean m33918i() {
        return m33910h(this.f38408g, 2);
    }

    /* renamed from: j */
    public final boolean m33919j() {
        return m33910h(this.f38408g, 64) && !m33910h(this.f38408g, 32);
    }

    /* renamed from: k */
    public final boolean m33920k() {
        return m33910h(this.f38408g, 16) && !m33910h(this.f38408g, 32);
    }

    public String toString() {
        return this.f38402a + " version=" + this.f38403b;
    }
}
