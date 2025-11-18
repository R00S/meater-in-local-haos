package io.sentry;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: OptionsContainer.java */
@ApiStatus.Internal
/* renamed from: io.sentry.i3 */
/* loaded from: classes2.dex */
public final class C9472i3<T> {

    /* renamed from: a */
    private final Class<T> f36354a;

    private C9472i3(Class<T> cls) {
        this.f36354a = cls;
    }

    /* renamed from: a */
    public static <T> C9472i3<T> m30847a(Class<T> cls) {
        return new C9472i3<>(cls);
    }

    /* renamed from: b */
    public T m30848b() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.f36354a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
