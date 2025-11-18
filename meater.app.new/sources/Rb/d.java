package Rb;

import kotlin.jvm.internal.C3862t;

/* compiled from: exceptionUtils.kt */
/* loaded from: classes3.dex */
public final class d {
    public static final boolean a(Throwable th) {
        C3862t.g(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!C3862t.b(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) throws Throwable {
        C3862t.g(e10, "e");
        throw e10;
    }
}
