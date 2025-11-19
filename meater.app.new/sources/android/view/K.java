package android.view;

import android.view.AbstractC2106m;
import android.view.C2095c;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ReflectiveGenericLifecycleObserver.java */
@Deprecated
/* loaded from: classes.dex */
class K implements InterfaceC2111s {

    /* renamed from: B, reason: collision with root package name */
    private final Object f25886B;

    /* renamed from: C, reason: collision with root package name */
    private final C2095c.a f25887C;

    K(Object obj) {
        this.f25886B = obj;
        this.f25887C = C2095c.f25940c.c(obj.getClass());
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f25887C.a(interfaceC2114v, aVar, this.f25886B);
    }
}
