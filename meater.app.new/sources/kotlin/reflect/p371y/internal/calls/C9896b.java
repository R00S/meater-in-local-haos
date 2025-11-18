package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10795j;
import kotlin.collections.C10803n;
import kotlin.collections.C10819v;
import kotlin.jvm.C9752a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.p371y.internal.KotlinReflectionInternalError;
import okhttp3.HttpUrl;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002"}, m32267d2 = {"createAnnotationInstance", "T", HttpUrl.FRAGMENT_ENCODE_SET, "annotationClass", "Ljava/lang/Class;", "values", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "methods", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", HttpUrl.FRAGMENT_ENCODE_SET, "index", HttpUrl.FRAGMENT_ENCODE_SET, "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.b */
/* loaded from: classes2.dex */
public final class C9896b {

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Integer;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.b$a */
    static final class a extends Lambda implements Function0<Integer> {

        /* renamed from: f */
        final /* synthetic */ Map<String, Object> f37398f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map<String, ? extends Object> map) {
            super(0);
            this.f37398f = map;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Iterator<T> it = this.f37398f.entrySet().iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", "<anonymous parameter 0>", "method", "Ljava/lang/reflect/Method;", "args", HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.b$b */
    static final class b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class<T> f37399a;

        /* renamed from: b */
        final /* synthetic */ Map<String, Object> f37400b;

        /* renamed from: c */
        final /* synthetic */ Lazy<String> f37401c;

        /* renamed from: d */
        final /* synthetic */ Lazy<Integer> f37402d;

        /* renamed from: e */
        final /* synthetic */ List<Method> f37403e;

        b(Class<T> cls, Map<String, ? extends Object> map, Lazy<String> lazy, Lazy<Integer> lazy2, List<Method> list) {
            this.f37399a = cls;
            this.f37400b = map;
            this.f37401c = lazy;
            this.f37402d = lazy2;
            this.f37403e = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != 147696667) {
                        if (iHashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f37399a;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(C9896b.m32650i(this.f37402d));
                    }
                } else if (name.equals("toString")) {
                    return C9896b.m32651j(this.f37401c);
                }
            }
            if (C9801m.m32341a(name, "equals")) {
                if (objArr != null && objArr.length == 1) {
                    Class<T> cls = this.f37399a;
                    List<Method> list = this.f37403e;
                    Map<String, Object> map = this.f37400b;
                    C9801m.m32345e(objArr, "args");
                    return Boolean.valueOf(C9896b.m32649h(cls, list, map, C10795j.m38661N(objArr)));
                }
            }
            if (this.f37400b.containsKey(name)) {
                return this.f37400b.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C10803n.m38746Z(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.b$c */
    static final class c extends Lambda implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ Class<T> f37404f;

        /* renamed from: g */
        final /* synthetic */ Map<String, Object> f37405g;

        /* compiled from: AnnotationConstructorCaller.kt */
        @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "entry", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.b$c$a */
        static final class a extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: f */
            public static final a f37406f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String string;
                C9801m.m32346f(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    C9801m.m32345e(string, "toString(this)");
                } else {
                    string = value.toString();
                }
                return key + '=' + string;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f37404f = cls;
            this.f37405g = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Class<T> cls = this.f37404f;
            Map<String, Object> map = this.f37405g;
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            C10782c0.m38597c0(map.entrySet(), sb, ", ", "(", ")", 0, null, a.f37406f, 48, null);
            String string = sb.toString();
            C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* renamed from: f */
    public static final <T> T m32647f(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C9801m.m32346f(cls, "annotationClass");
        C9801m.m32346f(map, "values");
        C9801m.m32346f(list, "methods");
        Lazy lazyM37594b = C10550i.m37594b(new a(map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(cls, map, C10550i.m37594b(new c(cls, map)), lazyM37594b, list));
        C9801m.m32344d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m32648g(Class cls, Map map, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(C10819v.m38911u(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list = arrayList;
        }
        return m32647f(cls, map, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> boolean m32649h(java.lang.Class<T> r4, java.util.List<java.lang.reflect.Method> r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6, java.lang.Object r7) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.calls.C9896b.m32649h(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final int m32650i(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final String m32651j(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final Void m32652k(int i2, String str, Class<?> cls) {
        String strMo32290p;
        KClass kClassM32298b = C9801m.m32341a(cls, Class.class) ? C9790g0.m32298b(KClass.class) : (cls.isArray() && C9801m.m32341a(cls.getComponentType(), Class.class)) ? C9790g0.m32298b(KClass[].class) : C9752a.m32279e(cls);
        if (C9801m.m32341a(kClassM32298b.mo32290p(), C9790g0.m32298b(Object[].class).mo32290p())) {
            StringBuilder sb = new StringBuilder();
            sb.append(kClassM32298b.mo32290p());
            sb.append('<');
            Class<?> componentType = C9752a.m32276b(kClassM32298b).getComponentType();
            C9801m.m32345e(componentType, "kotlinClass.java.componentType");
            sb.append(C9752a.m32279e(componentType).mo32290p());
            sb.append('>');
            strMo32290p = sb.toString();
        } else {
            strMo32290p = kClassM32298b.mo32290p();
        }
        throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strMo32290p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final Object m32653l(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = C9752a.m32276b((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(C9752a.m32276b(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
                C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
