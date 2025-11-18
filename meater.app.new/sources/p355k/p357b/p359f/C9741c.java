package p355k.p357b.p359f;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MessageFormatter.java */
/* renamed from: k.b.f.c */
/* loaded from: classes3.dex */
public final class C9741c {
    /* renamed from: a */
    public static final C9739a m32213a(String str, Object[] objArr) {
        Throwable thM32222j = m32222j(objArr);
        if (thM32222j != null) {
            objArr = m32230r(objArr);
        }
        return m32214b(str, objArr, thM32222j);
    }

    /* renamed from: b */
    public static final C9739a m32214b(String str, Object[] objArr, Throwable th) {
        int i2;
        if (str == null) {
            return new C9739a(null, objArr, th);
        }
        if (objArr == null) {
            return new C9739a(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i4);
            if (iIndexOf == -1) {
                if (i4 == 0) {
                    return new C9739a(str, objArr, th);
                }
                sb.append((CharSequence) str, i4, str.length());
                return new C9739a(sb.toString(), objArr, th);
            }
            if (!m32225m(str, iIndexOf)) {
                sb.append((CharSequence) str, i4, iIndexOf);
                m32218f(sb, objArr[i3], new HashMap());
            } else if (m32224l(str, iIndexOf)) {
                sb.append((CharSequence) str, i4, iIndexOf - 1);
                m32218f(sb, objArr[i3], new HashMap());
            } else {
                i3--;
                sb.append((CharSequence) str, i4, iIndexOf - 1);
                sb.append('{');
                i2 = iIndexOf + 1;
                i4 = i2;
                i3++;
            }
            i2 = iIndexOf + 2;
            i4 = i2;
            i3++;
        }
        sb.append((CharSequence) str, i4, str.length());
        return new C9739a(sb.toString(), objArr, th);
    }

    /* renamed from: c */
    private static void m32215c(StringBuilder sb, boolean[] zArr) {
        sb.append('[');
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(zArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: d */
    private static void m32216d(StringBuilder sb, byte[] bArr) {
        sb.append('[');
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append((int) bArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: e */
    private static void m32217e(StringBuilder sb, char[] cArr) {
        sb.append('[');
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(cArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: f */
    private static void m32218f(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            m32228p(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            m32215c(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            m32216d(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            m32217e(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            m32229q(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            m32223k(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            m32226n(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            m32220h(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            m32219g(sb, (double[]) obj);
        } else {
            m32227o(sb, (Object[]) obj, map);
        }
    }

    /* renamed from: g */
    private static void m32219g(StringBuilder sb, double[] dArr) {
        sb.append('[');
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(dArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: h */
    private static void m32220h(StringBuilder sb, float[] fArr) {
        sb.append('[');
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(fArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: i */
    public static final C9739a m32221i(String str, Object obj, Object obj2) {
        return m32213a(str, new Object[]{obj, obj2});
    }

    /* renamed from: j */
    static final Throwable m32222j(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static void m32223k(StringBuilder sb, int[] iArr) {
        sb.append('[');
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(iArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: l */
    static final boolean m32224l(String str, int i2) {
        return i2 >= 2 && str.charAt(i2 - 2) == '\\';
    }

    /* renamed from: m */
    static final boolean m32225m(String str, int i2) {
        return i2 != 0 && str.charAt(i2 - 1) == '\\';
    }

    /* renamed from: n */
    private static void m32226n(StringBuilder sb, long[] jArr) {
        sb.append('[');
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(jArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: o */
    private static void m32227o(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append('[');
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                m32218f(sb, objArr[i2], map);
                if (i2 != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb.append(']');
    }

    /* renamed from: p */
    private static void m32228p(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            C9747i.m32244b("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    /* renamed from: q */
    private static void m32229q(StringBuilder sb, short[] sArr) {
        sb.append('[');
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append((int) sArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: r */
    private static Object[] m32230r(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }
}
