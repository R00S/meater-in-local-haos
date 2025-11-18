package Xa;

import Xa.E;
import hb.InterfaceC3508a;
import hb.InterfaceC3513f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaArrayType.kt */
/* loaded from: classes3.dex */
public final class m extends E implements InterfaceC3513f {

    /* renamed from: b, reason: collision with root package name */
    private final Type f18967b;

    /* renamed from: c, reason: collision with root package name */
    private final E f18968c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection<InterfaceC3508a> f18969d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18970e;

    public m(Type reflectType) {
        E eA;
        C3862t.g(reflectType, "reflectType");
        this.f18967b = reflectType;
        Type typeQ = Q();
        if (!(typeQ instanceof GenericArrayType)) {
            if (typeQ instanceof Class) {
                Class cls = (Class) typeQ;
                if (cls.isArray()) {
                    E.a aVar = E.f18933a;
                    Class<?> componentType = cls.getComponentType();
                    C3862t.f(componentType, "getComponentType(...)");
                    eA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + Q().getClass() + "): " + Q());
        }
        E.a aVar2 = E.f18933a;
        Type genericComponentType = ((GenericArrayType) typeQ).getGenericComponentType();
        C3862t.f(genericComponentType, "getGenericComponentType(...)");
        eA = aVar2.a(genericComponentType);
        this.f18968c = eA;
        this.f18969d = kotlin.collections.r.m();
    }

    @Override // Xa.E
    protected Type Q() {
        return this.f18967b;
    }

    @Override // hb.InterfaceC3513f
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public E m() {
        return this.f18968c;
    }

    @Override // hb.InterfaceC3511d
    public Collection<InterfaceC3508a> getAnnotations() {
        return this.f18969d;
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return this.f18970e;
    }
}
