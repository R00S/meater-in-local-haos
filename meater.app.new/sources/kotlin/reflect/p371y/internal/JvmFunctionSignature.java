package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.comparisons.C10839b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class JvmFunctionSignature {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.d$a */
    public static final class a extends JvmFunctionSignature {

        /* renamed from: a */
        private final Class<?> f37278a;

        /* renamed from: b */
        private final List<Method> f37279b;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.d$a$a, reason: collision with other inner class name */
        static final class C11537a extends Lambda implements Function1<Method, CharSequence> {

            /* renamed from: f */
            public static final C11537a f37280f = new C11537a();

            C11537a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                C9801m.m32345e(returnType, "it.returnType");
                return C10703d.m38070b(returnType);
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.d$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C10839b.m39017a(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls) throws SecurityException {
            super(null);
            C9801m.m32346f(cls, "jClass");
            this.f37278a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            C9801m.m32345e(declaredMethods, "jClass.declaredMethods");
            this.f37279b = C10803n.m38737Q(declaredMethods, new b());
        }

        @Override // kotlin.reflect.p371y.internal.JvmFunctionSignature
        /* renamed from: a */
        public String getF37287b() {
            return C10782c0.m38599e0(this.f37279b, HttpUrl.FRAGMENT_ENCODE_SET, "<init>(", ")V", 0, null, C11537a.f37280f, 24, null);
        }

        /* renamed from: b */
        public final List<Method> m32507b() {
            return this.f37279b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.d$b */
    public static final class b extends JvmFunctionSignature {

        /* renamed from: a */
        private final Constructor<?> f37281a;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.d$b$a */
        static final class a extends Lambda implements Function1<Class<?>, CharSequence> {

            /* renamed from: f */
            public static final a f37282f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Class<?> cls) {
                C9801m.m32345e(cls, "it");
                return C10703d.m38070b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            C9801m.m32346f(constructor, "constructor");
            this.f37281a = constructor;
        }

        @Override // kotlin.reflect.p371y.internal.JvmFunctionSignature
        /* renamed from: a */
        public String getF37287b() {
            Class<?>[] parameterTypes = this.f37281a.getParameterTypes();
            C9801m.m32345e(parameterTypes, "constructor.parameterTypes");
            return C10803n.m38729I(parameterTypes, HttpUrl.FRAGMENT_ENCODE_SET, "<init>(", ")V", 0, null, a.f37282f, 24, null);
        }

        /* renamed from: b */
        public final Constructor<?> m32509b() {
            return this.f37281a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.d$c */
    public static final class c extends JvmFunctionSignature {

        /* renamed from: a */
        private final Method f37283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            C9801m.m32346f(method, "method");
            this.f37283a = method;
        }

        @Override // kotlin.reflect.p371y.internal.JvmFunctionSignature
        /* renamed from: a */
        public String getF37287b() {
            return C9887e0.m32535b(this.f37283a);
        }

        /* renamed from: b, reason: from getter */
        public final Method getF37283a() {
            return this.f37283a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", RoomInstalled.SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", HttpUrl.FRAGMENT_ENCODE_SET, "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.d$d */
    public static final class d extends JvmFunctionSignature {

        /* renamed from: a */
        private final AbstractC10116d.b f37284a;

        /* renamed from: b */
        private final String f37285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC10116d.b bVar) {
            super(null);
            C9801m.m32346f(bVar, RoomInstalled.SIGNATURE);
            this.f37284a = bVar;
            this.f37285b = bVar.mo34247a();
        }

        @Override // kotlin.reflect.p371y.internal.JvmFunctionSignature
        /* renamed from: a, reason: from getter */
        public String getF37287b() {
            return this.f37285b;
        }

        /* renamed from: b */
        public final String m32512b() {
            return this.f37284a.mo34248b();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", RoomInstalled.SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", HttpUrl.FRAGMENT_ENCODE_SET, "methodDesc", "getMethodDesc", "()Ljava/lang/String;", "methodName", "getMethodName", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.d$e */
    public static final class e extends JvmFunctionSignature {

        /* renamed from: a */
        private final AbstractC10116d.b f37286a;

        /* renamed from: b */
        private final String f37287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC10116d.b bVar) {
            super(null);
            C9801m.m32346f(bVar, RoomInstalled.SIGNATURE);
            this.f37286a = bVar;
            this.f37287b = bVar.mo34247a();
        }

        @Override // kotlin.reflect.p371y.internal.JvmFunctionSignature
        /* renamed from: a, reason: from getter */
        public String getF37287b() {
            return this.f37287b;
        }

        /* renamed from: b */
        public final String m32513b() {
            return this.f37286a.mo34248b();
        }

        /* renamed from: c */
        public final String m32514c() {
            return this.f37286a.mo34249c();
        }
    }

    private JvmFunctionSignature() {
    }

    public /* synthetic */ JvmFunctionSignature(C9789g c9789g) {
        this();
    }

    /* renamed from: a */
    public abstract String getF37287b();
}
