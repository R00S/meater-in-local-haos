package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: JvmClassName.java */
/* renamed from: kotlin.f0.y.e.j0.i.u.d */
/* loaded from: classes3.dex */
public class C10239d {

    /* renamed from: a */
    private final String f39600a;

    /* renamed from: b */
    private C10160c f39601b;

    private C10239d(String str) {
        if (str == null) {
            m36106a(5);
        }
        this.f39600a = str;
    }

    /* renamed from: a */
    private static /* synthetic */ void m36106a(int i2) {
        String str = (i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i2 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i2 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i2 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i2) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 3 && i2 != 6 && i2 != 7 && i2 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    public static C10239d m36107b(C10159b c10159b) {
        if (c10159b == null) {
            m36106a(1);
        }
        C10160c c10160cM35413h = c10159b.m35413h();
        String strReplace = c10159b.m35414i().m35420b().replace('.', '$');
        if (c10160cM35413h.m35422d()) {
            return new C10239d(strReplace);
        }
        return new C10239d(c10160cM35413h.m35420b().replace('.', '/') + "/" + strReplace);
    }

    /* renamed from: c */
    public static C10239d m36108c(C10160c c10160c) {
        if (c10160c == null) {
            m36106a(2);
        }
        C10239d c10239d = new C10239d(c10160c.m35420b().replace('.', '/'));
        c10239d.f39601b = c10160c;
        return c10239d;
    }

    /* renamed from: d */
    public static C10239d m36109d(String str) {
        if (str == null) {
            m36106a(0);
        }
        return new C10239d(str);
    }

    /* renamed from: e */
    public C10160c m36110e() {
        return new C10160c(this.f39600a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10239d.class != obj.getClass()) {
            return false;
        }
        return this.f39600a.equals(((C10239d) obj).f39600a);
    }

    /* renamed from: f */
    public String m36111f() {
        String str = this.f39600a;
        if (str == null) {
            m36106a(8);
        }
        return str;
    }

    /* renamed from: g */
    public C10160c m36112g() {
        int iLastIndexOf = this.f39600a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new C10160c(this.f39600a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        C10160c c10160c = C10160c.f39250a;
        if (c10160c == null) {
            m36106a(7);
        }
        return c10160c;
    }

    public int hashCode() {
        return this.f39600a.hashCode();
    }

    public String toString() {
        return this.f39600a;
    }
}
