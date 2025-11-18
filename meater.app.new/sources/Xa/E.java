package Xa;

import hb.InterfaceC3508a;
import hb.InterfaceC3531x;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaType.kt */
/* loaded from: classes3.dex */
public abstract class E implements InterfaceC3531x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18933a = new a(null);

    /* compiled from: ReflectJavaType.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final E a(Type type) {
            C3862t.g(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new H((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    protected abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof E) && C3862t.b(Q(), ((E) obj).Q());
    }

    public int hashCode() {
        return Q().hashCode();
    }

    @Override // hb.InterfaceC3511d
    public InterfaceC3508a o(qb.c fqName) {
        Object obj;
        C3862t.g(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            qb.b bVarC = ((InterfaceC3508a) next).c();
            if (C3862t.b(bVarC != null ? bVarC.a() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC3508a) obj;
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }
}
