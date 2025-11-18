package androidx.lifecycle;

import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0502b;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0513i {

    /* renamed from: a */
    private final Object f3453a;

    /* renamed from: b */
    private final C0502b.a f3454b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3453a = obj;
        this.f3454b = C0502b.f3461a.m3847c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f3454b.m3850a(interfaceC0515k, bVar, this.f3453a);
    }
}
