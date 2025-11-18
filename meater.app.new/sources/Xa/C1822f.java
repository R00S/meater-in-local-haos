package Xa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C3831l;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.InterfaceC4160e;

/* compiled from: reflectClassUtil.kt */
/* renamed from: Xa.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1822f {

    /* renamed from: a, reason: collision with root package name */
    private static final List<Ia.d<? extends Object>> f18958a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f18959b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f18960c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Class<? extends InterfaceC4160e<?>>, Integer> f18961d;

    static {
        int i10 = 0;
        List<Ia.d<? extends Object>> listP = kotlin.collections.r.p(P.b(Boolean.TYPE), P.b(Byte.TYPE), P.b(Character.TYPE), P.b(Double.TYPE), P.b(Float.TYPE), P.b(Integer.TYPE), P.b(Long.TYPE), P.b(Short.TYPE));
        f18958a = listP;
        List<Ia.d<? extends Object>> list = listP;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Ia.d dVar = (Ia.d) it.next();
            arrayList.add(oa.v.a(Aa.a.c(dVar), Aa.a.d(dVar)));
        }
        f18959b = M.p(arrayList);
        List<Ia.d<? extends Object>> list2 = f18958a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Ia.d dVar2 = (Ia.d) it2.next();
            arrayList2.add(oa.v.a(Aa.a.d(dVar2), Aa.a.c(dVar2)));
        }
        f18960c = M.p(arrayList2);
        List listP2 = kotlin.collections.r.p(Ba.a.class, Ba.l.class, Ba.p.class, Ba.q.class, Ba.r.class, Ba.s.class, Ba.t.class, Ba.u.class, Ba.v.class, Ba.w.class, Ba.b.class, Ba.c.class, Ba.d.class, Ba.e.class, Ba.f.class, Ba.g.class, Ba.h.class, Ba.i.class, Ba.j.class, Ba.k.class, Ba.m.class, Ba.n.class, Ba.o.class);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(listP2, 10));
        for (Object obj : listP2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            arrayList3.add(oa.v.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f18961d = M.p(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType it) {
        C3862t.g(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tb.h b(ParameterizedType it) {
        C3862t.g(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        C3862t.f(actualTypeArguments, "getActualTypeArguments(...)");
        return C3831l.O(actualTypeArguments);
    }

    public static final qb.b e(Class<?> cls) {
        qb.b bVarE;
        C3862t.g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            C3862t.f(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (bVarE = e(declaringClass)) != null) {
                    qb.f fVarT = qb.f.t(cls.getSimpleName());
                    C3862t.f(fVarT, "identifier(...)");
                    qb.b bVarD = bVarE.d(fVarT);
                    if (bVarD != null) {
                        return bVarD;
                    }
                }
                return qb.b.f48178d.c(new qb.c(cls.getName()));
            }
        }
        qb.c cVar = new qb.c(cls.getName());
        qb.c cVarE = cVar.e();
        C3862t.f(cVarE, "parent(...)");
        qb.c cVarK = qb.c.k(cVar.g());
        C3862t.f(cVarK, "topLevel(...)");
        return new qb.b(cVarE, cVarK, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String f(Class<?> cls) {
        C3862t.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                C3862t.f(name, "getName(...)");
                return Ub.n.B(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            C3862t.f(name2, "getName(...)");
            sb2.append(Ub.n.B(name2, '.', '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class<?> cls) {
        C3862t.g(cls, "<this>");
        return f18961d.get(cls);
    }

    public static final List<Type> h(Type type) {
        C3862t.g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return kotlin.collections.r.m();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return Tb.k.H(Tb.k.u(Tb.k.i(type, C1820d.f18956B), C1821e.f18957B));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C3862t.f(actualTypeArguments, "getActualTypeArguments(...)");
        return C3831l.I0(actualTypeArguments);
    }

    public static final Class<?> i(Class<?> cls) {
        C3862t.g(cls, "<this>");
        return f18959b.get(cls);
    }

    public static final ClassLoader j(Class<?> cls) {
        C3862t.g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C3862t.f(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> k(Class<?> cls) {
        C3862t.g(cls, "<this>");
        return f18960c.get(cls);
    }

    public static final boolean l(Class<?> cls) {
        C3862t.g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
