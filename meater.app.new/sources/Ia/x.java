package Ia;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3863u;

/* compiled from: TypesJVM.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LIa/q;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(LIa/q;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "LIa/s;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(LIa/q;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(LIa/q;)V", "javaType", "g", "(LIa/s;)Ljava/lang/reflect/Type;", "(LIa/s;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class x {

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6962a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f6947C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f6946B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f6948D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6962a = iArr;
        }
    }

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends C3860q implements Ba.l<Class<?>, Class<?>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f6963B = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> p02) {
            C3862t.g(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(q qVar, boolean z10) {
        f fVarD = qVar.d();
        if (fVarD instanceof r) {
            return new w((r) fVarD);
        }
        if (!(fVarD instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + qVar);
        }
        d dVar = (d) fVarD;
        Class clsC = z10 ? Aa.a.c(dVar) : Aa.a.b(dVar);
        List<s> listB = qVar.b();
        if (listB.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listB);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        s sVar = (s) kotlin.collections.r.L0(listB);
        if (sVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + qVar);
        }
        t variance = sVar.getVariance();
        q type = sVar.getType();
        int i10 = variance == null ? -1 : a.f6962a[variance.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        C3862t.d(type);
        Type typeD = d(type, false, 1, null);
        return typeD instanceof Class ? clsC : new Ia.a(typeD);
    }

    static /* synthetic */ Type d(q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(qVar, z10);
    }

    private static final Type e(Class<?> cls, List<s> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<s> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((s) it.next()));
            }
            return new v(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<s> list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((s) it2.next()));
            }
            return new v(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<s> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((s) it3.next()));
        }
        return new v(cls, typeE, arrayList3);
    }

    public static final Type f(q qVar) {
        Type typeM;
        C3862t.g(qVar, "<this>");
        return (!(qVar instanceof InterfaceC3863u) || (typeM = ((InterfaceC3863u) qVar).m()) == null) ? d(qVar, false, 1, null) : typeM;
    }

    private static final Type g(s sVar) {
        t tVarD = sVar.d();
        if (tVarD == null) {
            return y.f6964D.a();
        }
        q qVarC = sVar.c();
        C3862t.d(qVarC);
        int i10 = a.f6962a[tVarD.ordinal()];
        if (i10 == 1) {
            return new y(null, c(qVarC, true));
        }
        if (i10 == 2) {
            return c(qVarC, true);
        }
        if (i10 == 3) {
            return new y(c(qVarC, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Tb.h hVarI = Tb.k.i(type, b.f6963B);
            name = ((Class) Tb.k.z(hVarI)).getName() + Ub.n.y("[]", Tb.k.m(hVarI));
        } else {
            name = cls.getName();
        }
        C3862t.d(name);
        return name;
    }
}
