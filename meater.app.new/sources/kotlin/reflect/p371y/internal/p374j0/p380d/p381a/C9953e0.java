package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10485a;
import kotlin.text.C10546u;
import kotlin.text.C10547v;

/* compiled from: propertiesConventionUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.e0 */
/* loaded from: classes2.dex */
public final class C9953e0 {
    /* renamed from: a */
    public static final List<C10163f> m33079a(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        String strM35455k = c10163f.m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        return C10080z.m33830c(strM35455k) ? C10817u.m38892n(m33080b(c10163f)) : C10080z.m33831d(strM35455k) ? m33084f(c10163f) : C9956g.f37857a.m33097b(c10163f);
    }

    /* renamed from: b */
    public static final C10163f m33080b(C10163f c10163f) {
        C9801m.m32346f(c10163f, "methodName");
        C10163f c10163fM33083e = m33083e(c10163f, "get", false, null, 12, null);
        return c10163fM33083e == null ? m33083e(c10163f, "is", false, null, 8, null) : c10163fM33083e;
    }

    /* renamed from: c */
    public static final C10163f m33081c(C10163f c10163f, boolean z) {
        C9801m.m32346f(c10163f, "methodName");
        return m33083e(c10163f, "set", false, z ? "is" : null, 4, null);
    }

    /* renamed from: d */
    private static final C10163f m33082d(C10163f c10163f, String str, boolean z, String str2) {
        if (c10163f.m35458y()) {
            return null;
        }
        String strM35457u = c10163f.m35457u();
        C9801m.m32345e(strM35457u, "methodName.identifier");
        boolean z2 = false;
        if (!C10546u.m37511E(strM35457u, str, false, 2, null) || strM35457u.length() == str.length()) {
            return null;
        }
        char cCharAt = strM35457u.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            return C10163f.m35454x(str2 + C10547v.m37573m0(strM35457u, str));
        }
        if (!z) {
            return c10163f;
        }
        String strM37226c = C10485a.m37226c(C10547v.m37573m0(strM35457u, str), true);
        if (C10163f.m35450A(strM37226c)) {
            return C10163f.m35454x(strM37226c);
        }
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ C10163f m33083e(C10163f c10163f, String str, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return m33082d(c10163f, str, z, str2);
    }

    /* renamed from: f */
    public static final List<C10163f> m33084f(C10163f c10163f) {
        C9801m.m32346f(c10163f, "methodName");
        return C10817u.m38893o(m33081c(c10163f, false), m33081c(c10163f, true));
    }
}
