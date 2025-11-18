package kotlin.reflect.p371y.internal.p374j0.p397f;

/* compiled from: Name.java */
/* renamed from: kotlin.f0.y.e.j0.f.f */
/* loaded from: classes3.dex */
public final class C10163f implements Comparable<C10163f> {

    /* renamed from: f */
    private final String f39261f;

    /* renamed from: g */
    private final boolean f39262g;

    private C10163f(String str, boolean z) {
        if (str == null) {
            m35452g(0);
        }
        this.f39261f = str;
        this.f39262g = z;
    }

    /* renamed from: A */
    public static boolean m35450A(String str) {
        if (str == null) {
            m35452g(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static C10163f m35451D(String str) {
        if (str == null) {
            m35452g(7);
        }
        if (str.startsWith("<")) {
            return new C10163f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    /* renamed from: g */
    private static /* synthetic */ void m35452g(int i2) {
        String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? 2 : 3];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i2 == 1) {
            objArr[1] = "asString";
        } else if (i2 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i2 == 3 || i2 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: v */
    public static C10163f m35453v(String str) {
        if (str == null) {
            m35452g(8);
        }
        return str.startsWith("<") ? m35451D(str) : m35454x(str);
    }

    /* renamed from: x */
    public static C10163f m35454x(String str) {
        if (str == null) {
            m35452g(5);
        }
        return new C10163f(str, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10163f)) {
            return false;
        }
        C10163f c10163f = (C10163f) obj;
        return this.f39262g == c10163f.f39262g && this.f39261f.equals(c10163f.f39261f);
    }

    public int hashCode() {
        return (this.f39261f.hashCode() * 31) + (this.f39262g ? 1 : 0);
    }

    /* renamed from: k */
    public String m35455k() {
        String str = this.f39261f;
        if (str == null) {
            m35452g(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(C10163f c10163f) {
        return this.f39261f.compareTo(c10163f.f39261f);
    }

    public String toString() {
        return this.f39261f;
    }

    /* renamed from: u */
    public String m35457u() {
        if (this.f39262g) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strM35455k = m35455k();
        if (strM35455k == null) {
            m35452g(2);
        }
        return strM35455k;
    }

    /* renamed from: y */
    public boolean m35458y() {
        return this.f39262g;
    }
}
