package p355k.p357b.p359f;

/* compiled from: Util.java */
/* renamed from: k.b.f.i */
/* loaded from: classes3.dex */
public final class C9747i {
    /* renamed from: a */
    public static final void m32243a(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* renamed from: b */
    public static final void m32244b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: c */
    public static boolean m32245c(String str) {
        String strM32246d = m32246d(str);
        if (strM32246d == null) {
            return false;
        }
        return strM32246d.equalsIgnoreCase("true");
    }

    /* renamed from: d */
    public static String m32246d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
