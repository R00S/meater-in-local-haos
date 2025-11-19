package Xa;

import Xa.E;
import hb.InterfaceC3508a;
import hb.InterfaceC3516i;
import hb.InterfaceC3517j;
import hb.InterfaceC3531x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaClassifierType.kt */
/* loaded from: classes3.dex */
public final class s extends E implements InterfaceC3517j {

    /* renamed from: b, reason: collision with root package name */
    private final Type f18981b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3516i f18982c;

    public s(Type reflectType) {
        InterfaceC3516i qVar;
        C3862t.g(reflectType, "reflectType");
        this.f18981b = reflectType;
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            qVar = new q((Class) typeQ);
        } else if (typeQ instanceof TypeVariable) {
            qVar = new F((TypeVariable) typeQ);
        } else {
            if (!(typeQ instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeQ.getClass() + "): " + typeQ);
            }
            Type rawType = ((ParameterizedType) typeQ).getRawType();
            C3862t.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f18982c = qVar;
    }

    @Override // hb.InterfaceC3517j
    public List<InterfaceC3531x> F() {
        List<Type> listH = C1822f.h(Q());
        E.a aVar = E.f18933a;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Xa.E
    public Type Q() {
        return this.f18981b;
    }

    @Override // hb.InterfaceC3517j
    public InterfaceC3516i d() {
        return this.f18982c;
    }

    @Override // hb.InterfaceC3511d
    public Collection<InterfaceC3508a> getAnnotations() {
        return kotlin.collections.r.m();
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return false;
    }

    @Override // Xa.E, hb.InterfaceC3511d
    public InterfaceC3508a o(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return null;
    }

    @Override // hb.InterfaceC3517j
    public String p() {
        return Q().toString();
    }

    @Override // hb.InterfaceC3517j
    public boolean y() {
        Type typeQ = Q();
        if (!(typeQ instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) typeQ).getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }

    @Override // hb.InterfaceC3517j
    public String z() {
        throw new UnsupportedOperationException("Type not found: " + Q());
    }
}
