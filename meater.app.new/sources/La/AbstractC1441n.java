package La;

import Xa.C1822f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import pb.d;
import ra.C4370a;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LLa/n;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "e", "d", "c", "b", "LLa/n$a;", "LLa/n$b;", "LLa/n$c;", "LLa/n$d;", "LLa/n$e;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1441n {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LLa/n$a;", "LLa/n;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "methods", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.n$a */
    public static final class a extends AbstractC1441n {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Class<?> jClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method> methods;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: La.n$a$a, reason: collision with other inner class name */
        public static final class C0184a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return C4370a.d(((Method) t10).getName(), ((Method) t11).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> jClass) throws SecurityException {
            super(null);
            C3862t.g(jClass, "jClass");
            this.jClass = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            C3862t.f(declaredMethods, "getDeclaredMethods(...)");
            this.methods = C3831l.y0(declaredMethods, new C0184a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            C3862t.f(returnType, "getReturnType(...)");
            return C1822f.f(returnType);
        }

        @Override // La.AbstractC1441n
        /* renamed from: a */
        public String get_signature() {
            return kotlin.collections.r.s0(this.methods, "", "<init>(", ")V", 0, null, C1439m.f11238B, 24, null);
        }

        public final List<Method> d() {
            return this.methods;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLa/n$b;", "LLa/n;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "d", "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.n$b */
    public static final class b extends AbstractC1441n {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            C3862t.g(constructor, "constructor");
            this.constructor = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            C3862t.d(cls);
            return C1822f.f(cls);
        }

        @Override // La.AbstractC1441n
        /* renamed from: a */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            C3862t.f(parameterTypes, "getParameterTypes(...)");
            return C3831l.n0(parameterTypes, "", "<init>(", ")V", 0, null, C1443o.f11250B, 24, null);
        }

        public final Constructor<?> d() {
            return this.constructor;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLa/n$c;", "LLa/n;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.n$c */
    public static final class c extends AbstractC1441n {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            C3862t.g(method, "method");
            this.method = method;
        }

        @Override // La.AbstractC1441n
        /* renamed from: a */
        public String get_signature() {
            return h1.d(this.method);
        }

        /* renamed from: b, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"LLa/n$d;", "LLa/n;", "Lpb/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lpb/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "constructorDesc", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.n$d */
    public static final class d extends AbstractC1441n {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d.b signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.b signature) {
            super(null);
            C3862t.g(signature, "signature");
            this.signature = signature;
            this._signature = signature.a();
        }

        @Override // La.AbstractC1441n
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String b() {
            return this.signature.d();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"LLa/n$e;", "LLa/n;", "Lpb/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lpb/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "c", "methodName", "methodDesc", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.n$e */
    public static final class e extends AbstractC1441n {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d.b signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b signature) {
            super(null);
            C3862t.g(signature, "signature");
            this.signature = signature;
            this._signature = signature.a();
        }

        @Override // La.AbstractC1441n
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String b() {
            return this.signature.d();
        }

        public final String c() {
            return this.signature.e();
        }
    }

    public /* synthetic */ AbstractC1441n(C3854k c3854k) {
        this();
    }

    /* renamed from: a */
    public abstract String get_signature();

    private AbstractC1441n() {
    }
}
