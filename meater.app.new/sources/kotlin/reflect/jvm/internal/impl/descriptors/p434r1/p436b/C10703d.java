package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C10773s;
import kotlin.Function;
import kotlin.collections.C10803n;
import kotlin.collections.C10810q0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.C9752a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.sequences.C10520l;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;
import kotlin.text.C10546u;

/* compiled from: reflectClassUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d */
/* loaded from: classes2.dex */
public final class C10703d {

    /* renamed from: a */
    private static final List<KClass<? extends Object>> f41178a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f41179b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f41180c;

    /* renamed from: d */
    private static final Map<Class<? extends Function<?>>, Integer> f41181d;

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d$a */
    static final class a extends Lambda implements Function1<ParameterizedType, ParameterizedType> {

        /* renamed from: f */
        public static final a f41182f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            C9801m.m32346f(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d$b */
    static final class b extends Lambda implements Function1<ParameterizedType, Sequence<? extends Type>> {

        /* renamed from: f */
        public static final b f41183f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<Type> invoke(ParameterizedType parameterizedType) {
            C9801m.m32346f(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C9801m.m32345e(actualTypeArguments, "it.actualTypeArguments");
            return C10803n.m38762r(actualTypeArguments);
        }
    }

    static {
        int i2 = 0;
        List<KClass<? extends Object>> listM38891m = C10817u.m38891m(C9790g0.m32298b(Boolean.TYPE), C9790g0.m32298b(Byte.TYPE), C9790g0.m32298b(Character.TYPE), C9790g0.m32298b(Double.TYPE), C9790g0.m32298b(Float.TYPE), C9790g0.m32298b(Integer.TYPE), C9790g0.m32298b(Long.TYPE), C9790g0.m32298b(Short.TYPE));
        f41178a = listM38891m;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38891m, 10));
        Iterator<T> it = listM38891m.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(C10773s.m38547a(C9752a.m32277c(kClass), C9752a.m32278d(kClass)));
        }
        f41179b = C10810q0.m38805q(arrayList);
        List<KClass<? extends Object>> list = f41178a;
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(C10773s.m38547a(C9752a.m32278d(kClass2), C9752a.m32277c(kClass2)));
        }
        f41180c = C10810q0.m38805q(arrayList2);
        List listM38891m2 = C10817u.m38891m(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(listM38891m2, 10));
        for (Object obj : listM38891m2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10817u.m38898t();
            }
            arrayList3.add(C10773s.m38547a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f41181d = C10810q0.m38805q(arrayList3);
    }

    /* renamed from: a */
    public static final C10159b m38069a(Class<?> cls) {
        C10159b c10159bM35408m;
        C10159b c10159bM38069a;
        C9801m.m32346f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            C9801m.m32345e(simpleName, "simpleName");
            if (!(simpleName.length() == 0)) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (c10159bM38069a = m38069a(declaringClass)) == null || (c10159bM35408m = c10159bM38069a.m35411d(C10163f.m35454x(cls.getSimpleName()))) == null) {
                    c10159bM35408m = C10159b.m35408m(new C10160c(cls.getName()));
                }
                C9801m.m32345e(c10159bM35408m, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                return c10159bM35408m;
            }
        }
        C10160c c10160c = new C10160c(cls.getName());
        return new C10159b(c10160c.m35423e(), C10160c.m35419k(c10160c.m35425g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final String m38070b(Class<?> cls) {
        C9801m.m32346f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                C9801m.m32345e(name, "name");
                return C10546u.m37524z(name, '.', '/', false, 4, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name2 = cls.getName();
            C9801m.m32345e(name2, "name");
            sb.append(C10546u.m37524z(name2, '.', '/', false, 4, null));
            sb.append(';');
            return sb.toString();
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

    /* renamed from: c */
    public static final List<Type> m38071c(Type type) {
        C9801m.m32346f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C10817u.m38888j();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C10522n.m37377A(C10522n.m37386p(C10520l.m37373f(type, a.f41182f), b.f41183f));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C9801m.m32345e(actualTypeArguments, "actualTypeArguments");
        return C10803n.m38746Z(actualTypeArguments);
    }

    /* renamed from: d */
    public static final Class<?> m38072d(Class<?> cls) {
        C9801m.m32346f(cls, "<this>");
        return f41179b.get(cls);
    }

    /* renamed from: e */
    public static final ClassLoader m38073e(Class<?> cls) {
        C9801m.m32346f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C9801m.m32345e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: f */
    public static final Class<?> m38074f(Class<?> cls) {
        C9801m.m32346f(cls, "<this>");
        return f41180c.get(cls);
    }

    /* renamed from: g */
    public static final boolean m38075g(Class<?> cls) {
        C9801m.m32346f(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
