package qb;

/* compiled from: Name.java */
/* loaded from: classes3.dex */
public final class f implements Comparable<f> {

    /* renamed from: B, reason: collision with root package name */
    private final String f48193B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f48194C;

    private f(String str, boolean z10) {
        if (str == null) {
            c(0);
        }
        this.f48193B = str;
        this.f48194C = z10;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
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
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f s(String str) {
        if (str == null) {
            c(9);
        }
        return str.startsWith("<") ? w(str) : t(str);
    }

    public static f t(String str) {
        if (str == null) {
            c(5);
        }
        return new f(str, false);
    }

    public static boolean v(String str) {
        if (str == null) {
            c(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f w(String str) {
        if (str == null) {
            c(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f48194C == fVar.f48194C && this.f48193B.equals(fVar.f48193B);
    }

    public int hashCode() {
        return (this.f48193B.hashCode() * 31) + (this.f48194C ? 1 : 0);
    }

    public String j() {
        String str = this.f48193B;
        if (str == null) {
            c(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f48193B.compareTo(fVar.f48193B);
    }

    public String p() {
        if (this.f48194C) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strJ = j();
        if (strJ == null) {
            c(2);
        }
        return strJ;
    }

    public String toString() {
        return this.f48193B;
    }

    public boolean u() {
        return this.f48194C;
    }
}
