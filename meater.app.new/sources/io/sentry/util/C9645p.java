package io.sentry.util;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: LogUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.p */
/* loaded from: classes2.dex */
public final class C9645p {
    /* renamed from: a */
    public static void m31799a(Class<?> cls, Object obj, InterfaceC9670w1 interfaceC9670w1) {
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        Object[] objArr = new Object[2];
        objArr[0] = obj != null ? obj.getClass().getCanonicalName() : "Hint";
        objArr[1] = cls.getCanonicalName();
        interfaceC9670w1.mo30214c(enumC9587s4, "%s is not %s", objArr);
    }
}
