package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10485a;
import kotlin.text.C10546u;

/* compiled from: JvmAbi.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.z */
/* loaded from: classes2.dex */
public final class C10080z {

    /* renamed from: a */
    public static final C10080z f38329a = new C10080z();

    /* renamed from: b */
    public static final C10160c f38330b;

    /* renamed from: c */
    public static final C10159b f38331c;

    /* renamed from: d */
    private static final C10159b f38332d;

    /* renamed from: e */
    private static final C10159b f38333e;

    static {
        C10160c c10160c = new C10160c("kotlin.jvm.JvmField");
        f38330b = c10160c;
        C10159b c10159bM35408m = C10159b.m35408m(c10160c);
        C9801m.m32345e(c10159bM35408m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f38331c = c10159bM35408m;
        C10159b c10159bM35408m2 = C10159b.m35408m(new C10160c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        C9801m.m32345e(c10159bM35408m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f38332d = c10159bM35408m2;
        C10159b c10159bM35406e = C10159b.m35406e("kotlin/jvm/internal/RepeatableContainer");
        C9801m.m32345e(c10159bM35406e, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f38333e = c10159bM35406e;
    }

    private C10080z() {
    }

    /* renamed from: b */
    public static final String m33829b(String str) {
        C9801m.m32346f(str, "propertyName");
        if (m33833f(str)) {
            return str;
        }
        return "get" + C10485a.m37224a(str);
    }

    /* renamed from: c */
    public static final boolean m33830c(String str) {
        C9801m.m32346f(str, "name");
        return C10546u.m37511E(str, "get", false, 2, null) || C10546u.m37511E(str, "is", false, 2, null);
    }

    /* renamed from: d */
    public static final boolean m33831d(String str) {
        C9801m.m32346f(str, "name");
        return C10546u.m37511E(str, "set", false, 2, null);
    }

    /* renamed from: e */
    public static final String m33832e(String str) {
        String strM37224a;
        C9801m.m32346f(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (m33833f(str)) {
            strM37224a = str.substring(2);
            C9801m.m32345e(strM37224a, "this as java.lang.String).substring(startIndex)");
        } else {
            strM37224a = C10485a.m37224a(str);
        }
        sb.append(strM37224a);
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m33833f(String str) {
        C9801m.m32346f(str, "name");
        if (!C10546u.m37511E(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return C9801m.m32348h(97, cCharAt) > 0 || C9801m.m32348h(cCharAt, 122) > 0;
    }

    /* renamed from: a */
    public final C10159b m33834a() {
        return f38333e;
    }
}
