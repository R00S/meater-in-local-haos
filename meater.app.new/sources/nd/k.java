package nd;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Method f45891a;

    /* renamed from: b, reason: collision with root package name */
    private final List<?> f45892b;

    k(Method method, List<?> list) {
        this.f45891a = method;
        this.f45892b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f45891a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f45891a.getDeclaringClass().getName(), this.f45891a.getName(), this.f45892b);
    }
}
