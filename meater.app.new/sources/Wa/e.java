package Wa;

import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes3.dex */
public final class e {
    public static final Class<?> a(ClassLoader classLoader, String fqName) {
        C3862t.g(classLoader, "<this>");
        C3862t.g(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
