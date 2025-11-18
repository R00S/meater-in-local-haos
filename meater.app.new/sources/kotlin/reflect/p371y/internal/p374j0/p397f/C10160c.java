package kotlin.reflect.p371y.internal.p374j0.p397f;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: FqName.java */
/* renamed from: kotlin.f0.y.e.j0.f.c */
/* loaded from: classes3.dex */
public final class C10160c {

    /* renamed from: a */
    public static final C10160c f39250a = new C10160c(HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b */
    private final C10161d f39251b;

    /* renamed from: c */
    private transient C10160c f39252c;

    public C10160c(String str) {
        if (str == null) {
            m35418a(1);
        }
        this.f39251b = new C10161d(str, this);
    }

    /* renamed from: a */
    private static /* synthetic */ void m35418a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i3 = 2;
                break;
            case 8:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: k */
    public static C10160c m35419k(C10163f c10163f) {
        if (c10163f == null) {
            m35418a(13);
        }
        return new C10160c(C10161d.m35431m(c10163f));
    }

    /* renamed from: b */
    public String m35420b() {
        String strM35432b = this.f39251b.m35432b();
        if (strM35432b == null) {
            m35418a(4);
        }
        return strM35432b;
    }

    /* renamed from: c */
    public C10160c m35421c(C10163f c10163f) {
        if (c10163f == null) {
            m35418a(8);
        }
        return new C10160c(this.f39251b.m35433c(c10163f), this);
    }

    /* renamed from: d */
    public boolean m35422d() {
        return this.f39251b.m35434e();
    }

    /* renamed from: e */
    public C10160c m35423e() {
        C10160c c10160c = this.f39252c;
        if (c10160c != null) {
            if (c10160c == null) {
                m35418a(6);
            }
            return c10160c;
        }
        if (m35422d()) {
            throw new IllegalStateException("root");
        }
        C10160c c10160c2 = new C10160c(this.f39251b.m35436g());
        this.f39252c = c10160c2;
        if (c10160c2 == null) {
            m35418a(7);
        }
        return c10160c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10160c) && this.f39251b.equals(((C10160c) obj).f39251b);
    }

    /* renamed from: f */
    public List<C10163f> m35424f() {
        List<C10163f> listM35437h = this.f39251b.m35437h();
        if (listM35437h == null) {
            m35418a(11);
        }
        return listM35437h;
    }

    /* renamed from: g */
    public C10163f m35425g() {
        C10163f c10163fM35438i = this.f39251b.m35438i();
        if (c10163fM35438i == null) {
            m35418a(9);
        }
        return c10163fM35438i;
    }

    /* renamed from: h */
    public C10163f m35426h() {
        C10163f c10163fM35439j = this.f39251b.m35439j();
        if (c10163fM35439j == null) {
            m35418a(10);
        }
        return c10163fM35439j;
    }

    public int hashCode() {
        return this.f39251b.hashCode();
    }

    /* renamed from: i */
    public boolean m35427i(C10163f c10163f) {
        if (c10163f == null) {
            m35418a(12);
        }
        return this.f39251b.m35440k(c10163f);
    }

    /* renamed from: j */
    public C10161d m35428j() {
        C10161d c10161d = this.f39251b;
        if (c10161d == null) {
            m35418a(5);
        }
        return c10161d;
    }

    public String toString() {
        return this.f39251b.toString();
    }

    public C10160c(C10161d c10161d) {
        if (c10161d == null) {
            m35418a(2);
        }
        this.f39251b = c10161d;
    }

    private C10160c(C10161d c10161d, C10160c c10160c) {
        if (c10161d == null) {
            m35418a(3);
        }
        this.f39251b = c10161d;
        this.f39252c = c10160c;
    }
}
