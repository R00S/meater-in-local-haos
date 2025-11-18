package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: RenderingUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.h.n */
/* loaded from: classes3.dex */
public final class C10183n {
    /* renamed from: a */
    public static final String m35763a(C10161d c10161d) {
        C9801m.m32346f(c10161d, "<this>");
        List<C10163f> listM35437h = c10161d.m35437h();
        C9801m.m32345e(listM35437h, "pathSegments()");
        return m35765c(listM35437h);
    }

    /* renamed from: b */
    public static final String m35764b(C10163f c10163f) {
        C9801m.m32346f(c10163f, "<this>");
        if (!m35766d(c10163f)) {
            String strM35455k = c10163f.m35455k();
            C9801m.m32345e(strM35455k, "asString()");
            return strM35455k;
        }
        StringBuilder sb = new StringBuilder();
        String strM35455k2 = c10163f.m35455k();
        C9801m.m32345e(strM35455k2, "asString()");
        sb.append('`' + strM35455k2);
        sb.append('`');
        return sb.toString();
    }

    /* renamed from: c */
    public static final String m35765c(List<C10163f> list) {
        C9801m.m32346f(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C10163f c10163f : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m35764b(c10163f));
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: d */
    private static final boolean m35766d(C10163f c10163f) {
        boolean z;
        String strM35455k = c10163f.m35455k();
        C9801m.m32345e(strM35455k, "asString()");
        if (!C10178i.f39481a.contains(strM35455k)) {
            int i2 = 0;
            while (true) {
                if (i2 >= strM35455k.length()) {
                    z = false;
                    break;
                }
                char cCharAt = strM35455k.charAt(i2);
                if ((Character.isLetterOrDigit(cCharAt) || cCharAt == '_') ? false : true) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
