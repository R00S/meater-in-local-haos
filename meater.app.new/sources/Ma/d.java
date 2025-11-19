package Ma;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import oa.InterfaceC4164i;

/* loaded from: classes3.dex */
class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f12150a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12151b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4164i f12152c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4164i f12153d;

    /* renamed from: e, reason: collision with root package name */
    private final List f12154e;

    public d(Class cls, Map map, InterfaceC4164i interfaceC4164i, InterfaceC4164i interfaceC4164i2, List list) {
        this.f12150a = cls;
        this.f12151b = map;
        this.f12152c = interfaceC4164i;
        this.f12153d = interfaceC4164i2;
        this.f12154e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f12150a, this.f12151b, this.f12152c, this.f12153d, this.f12154e, obj, method, objArr);
    }
}
