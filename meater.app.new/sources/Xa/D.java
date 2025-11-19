package Xa;

import hb.InterfaceC3530w;
import hb.InterfaceC3531x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes3.dex */
public final class D extends y implements InterfaceC3530w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18932a;

    public D(Object recordComponent) {
        C3862t.g(recordComponent, "recordComponent");
        this.f18932a = recordComponent;
    }

    @Override // Xa.y
    public Member R() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodC = C1817a.f18942a.c(this.f18932a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // hb.InterfaceC3530w
    public InterfaceC3531x a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsD = C1817a.f18942a.d(this.f18932a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // hb.InterfaceC3530w
    public boolean j() {
        return false;
    }
}
