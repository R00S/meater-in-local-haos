package qb;

import Ub.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: FqNamesUtil.kt */
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: FqNamesUtil.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48192a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f48306B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f48308D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f48307C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48192a = iArr;
        }
    }

    public static final <V> V a(c cVar, Map<c, ? extends V> values) {
        Object next;
        C3862t.g(cVar, "<this>");
        C3862t.g(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<c, ? extends V> entry : values.entrySet()) {
            c key = entry.getKey();
            if (C3862t.b(cVar, key) || b(cVar, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c packageName) {
        C3862t.g(cVar, "<this>");
        C3862t.g(packageName, "packageName");
        return C3862t.b(f(cVar), packageName);
    }

    private static final boolean c(String str, String str2) {
        return n.G(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c packageName) {
        C3862t.g(cVar, "<this>");
        C3862t.g(packageName, "packageName");
        if (C3862t.b(cVar, packageName) || packageName.d()) {
            return true;
        }
        String strB = cVar.b();
        C3862t.f(strB, "asString(...)");
        String strB2 = packageName.b();
        C3862t.f(strB2, "asString(...)");
        return c(strB, strB2);
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.f48306B;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f48192a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = k.f48307C;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt == '.') {
                    kVar = k.f48308D;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return kVar != k.f48308D;
    }

    public static final c f(c cVar) {
        C3862t.g(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c prefix) {
        C3862t.g(cVar, "<this>");
        C3862t.g(prefix, "prefix");
        if (!d(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (C3862t.b(cVar, prefix)) {
            c ROOT = c.f48182c;
            C3862t.f(ROOT, "ROOT");
            return ROOT;
        }
        String strB = cVar.b();
        C3862t.f(strB, "asString(...)");
        String strSubstring = strB.substring(prefix.b().length() + 1);
        C3862t.f(strSubstring, "substring(...)");
        return new c(strSubstring);
    }
}
