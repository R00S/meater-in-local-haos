package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C9801m;

/* compiled from: exceptionUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.c */
/* loaded from: classes3.dex */
public final class C10769c {
    /* renamed from: a */
    public static final boolean m38523a(Throwable th) {
        C9801m.m32346f(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!C9801m.m32341a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m38524b(Throwable th) throws Throwable {
        C9801m.m32346f(th, "e");
        throw th;
    }
}
