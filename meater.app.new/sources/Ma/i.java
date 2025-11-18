package Ma;

import Ma.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.U;
import oa.C4153F;

/* compiled from: CallerImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001b*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u001b\u0019\u0014\u0012!\"#\u0010B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f\u0082\u0001\u0007$%&'()*¨\u0006+"}, d2 = {"LMa/i;", "Ljava/lang/reflect/Member;", "M", "LMa/h;", "member", "Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "instanceClass", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "obj", "Loa/F;", "d", "(Ljava/lang/Object;)V", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "h", "f", "g", "LMa/i$a;", "LMa/i$b;", "LMa/i$c;", "LMa/i$e;", "LMa/i$f;", "LMa/i$g;", "LMa/i$h;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class i<M extends Member> implements Ma.h<M> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Type returnType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Class<?> instanceClass;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LMa/i$a;", "LMa/i;", "Ljava/lang/reflect/Constructor;", "LMa/g;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends i<Constructor<?>> implements Ma.g {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor<?> constructor, Object obj) {
            C3862t.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C3862t.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : C3831l.r(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.boundReceiver = obj;
        }

        @Override // Ma.h
        public Object call(Object[] args) {
            C3862t.g(args, "args");
            c(args);
            Constructor<?> constructorB = b();
            U u10 = new U(3);
            u10.a(this.boundReceiver);
            u10.b(args);
            u10.a(null);
            return constructorB.newInstance(u10.d(new Object[u10.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMa/i$b;", "LMa/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor<?> constructor) {
            C3862t.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C3862t.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C3831l.r(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // Ma.h
        public Object call(Object[] args) {
            C3862t.g(args, "args");
            c(args);
            Constructor<?> constructorB = b();
            U u10 = new U(2);
            u10.b(args);
            u10.a(null);
            return constructorB.newInstance(u10.d(new Object[u10.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LMa/i$c;", "LMa/g;", "LMa/i;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends i<Constructor<?>> implements Ma.g {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor<?> constructor, Object obj) {
            C3862t.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C3862t.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.boundReceiver = obj;
        }

        @Override // Ma.h
        public Object call(Object[] args) {
            C3862t.g(args, "args");
            c(args);
            Constructor<?> constructorB = b();
            U u10 = new U(2);
            u10.a(this.boundReceiver);
            u10.b(args);
            return constructorB.newInstance(u10.d(new Object[u10.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"LMa/i$d;", "", "<init>", "()V", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ma.i$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMa/i$e;", "LMa/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor<?> constructor) {
            C3862t.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C3862t.f(declaringClass, "getDeclaringClass(...)");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // Ma.h
        public Object call(Object[] args) {
            C3862t.g(args, "args");
            c(args);
            return b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"LMa/i$f;", "LMa/i;", "Ljava/lang/reflect/Field;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "e", "c", "d", "a", "b", "LMa/i$f$a;", "LMa/i$f$b;", "LMa/i$f$c;", "LMa/i$f$d;", "LMa/i$f$e;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class f extends i<Field> {

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LMa/i$f$a;", "LMa/g;", "LMa/i$f;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends f implements Ma.g {

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                C3862t.g(field, "field");
                this.boundReceiver = obj;
            }

            @Override // Ma.i.f, Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                return b().get(this.boundReceiver);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMa/i$f$b;", "LMa/g;", "LMa/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends f implements Ma.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                C3862t.g(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LMa/i$f$c;", "LMa/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                C3862t.g(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMa/i$f$d;", "LMa/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "args", "Loa/F;", "c", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                C3862t.g(field, "field");
            }

            @Override // Ma.i
            public void c(Object[] args) {
                C3862t.g(args, "args");
                super.c(args);
                d(C3831l.Y(args));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LMa/i$f$e;", "LMa/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                C3862t.g(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, C3854k c3854k) {
            this(field, z10);
        }

        @Override // Ma.h
        public Object call(Object[] args) {
            C3862t.g(args, "args");
            c(args);
            return b().get(e() != null ? C3831l.X(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            C3862t.f(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\f\u0014\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LMa/i$g;", "LMa/i;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "args", "Loa/F;", "c", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Z", "e", "d", "a", "b", "LMa/i$g$a;", "LMa/i$g$b;", "LMa/i$g$c;", "LMa/i$g$d;", "LMa/i$g$e;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class g extends i<Field> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean notNull;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LMa/i$g$a;", "LMa/g;", "LMa/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends g implements Ma.g {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                C3862t.g(field, "field");
                this.boundReceiver = obj;
            }

            @Override // Ma.i.g, Ma.h
            public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                C3862t.g(args, "args");
                c(args);
                b().set(this.boundReceiver, C3831l.X(args));
                return C4153F.f46609a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LMa/i$g$b;", "LMa/g;", "LMa/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends g implements Ma.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                C3862t.g(field, "field");
            }

            @Override // Ma.i.g, Ma.h
            public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                C3862t.g(args, "args");
                c(args);
                b().set(null, C3831l.o0(args));
                return C4153F.f46609a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LMa/i$g$c;", "LMa/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                C3862t.g(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LMa/i$g$d;", "LMa/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "Loa/F;", "c", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                C3862t.g(field, "field");
            }

            @Override // Ma.i.g, Ma.i
            public void c(Object[] args) {
                C3862t.g(args, "args");
                super.c(args);
                d(C3831l.Y(args));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LMa/i$g$e;", "LMa/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                C3862t.g(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, C3854k c3854k) {
            this(field, z10, z11);
        }

        @Override // Ma.i
        public void c(Object[] args) {
            C3862t.g(args, "args");
            super.c(args);
            if (this.notNull && C3831l.o0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // Ma.h
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
            C3862t.g(args, "args");
            c(args);
            b().set(e() != null ? C3831l.X(args) : null, C3831l.o0(args));
            return C4153F.f46609a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            C3862t.f(TYPE, "TYPE");
            super(field, TYPE, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.notNull = z10;
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0012\u0013\u000e\u0014\u0015\u0016\u0017B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"LMa/i$h;", "LMa/i;", "Ljava/lang/reflect/Method;", "method", "", "requiresInstance", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", "instance", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Z", "isVoidMethod", "g", "e", "c", "d", "a", "b", "LMa/i$h$a;", "LMa/i$h$b;", "LMa/i$h$c;", "LMa/i$h$d;", "LMa/i$h$e;", "LMa/i$h$f;", "LMa/i$h$g;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class h extends i<Method> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isVoidMethod;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LMa/i$h$a;", "LMa/g;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends h implements Ma.g {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                C3862t.g(method, "method");
                this.boundReceiver = obj;
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                return f(this.boundReceiver, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LMa/i$h$b;", "LMa/g;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends h implements Ma.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                C3862t.g(method, "method");
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                return f(null, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LMa/i$h$c;", "LMa/g;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends h implements Ma.g {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, Object obj) {
                C3862t.g(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C3831l.r(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.boundReceiver = obj;
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                U u10 = new U(2);
                u10.a(this.boundReceiver);
                u10.b(args);
                return f(null, u10.d(new Object[u10.c()]));
            }

            /* renamed from: g, reason: from getter */
            public final Object getBoundReceiver() {
                return this.boundReceiver;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LMa/i$h$d;", "LMa/g;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "", "h", "()I", "receiverComponentsCount", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends h implements Ma.g {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object[] boundReceiverComponents;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] boundReceiverComponents) {
                C3862t.g(method, "method");
                C3862t.g(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) C3831l.U(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.boundReceiverComponents = boundReceiverComponents;
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                U u10 = new U(2);
                u10.b(this.boundReceiverComponents);
                u10.b(args);
                return f(null, u10.d(new Object[u10.c()]));
            }

            /* renamed from: g, reason: from getter */
            public final Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            public final int h() {
                return this.boundReceiverComponents.length;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMa/i$h$e;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                C3862t.g(method, "method");
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                return f(args[0], args.length <= 1 ? new Object[0] : C3831l.r(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMa/i$h$f;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                C3862t.g(method, "method");
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                d(C3831l.Y(args));
                return f(null, args.length <= 1 ? new Object[0] : C3831l.r(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMa/i$h$g;", "LMa/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                C3862t.g(method, "method");
            }

            @Override // Ma.h
            public Object call(Object[] args) {
                C3862t.g(args, "args");
                c(args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, C3854k c3854k) {
            this(method, z10, typeArr);
        }

        protected final Object f(Object instance, Object[] args) {
            C3862t.g(args, "args");
            return this.isVoidMethod ? C4153F.f46609a : b().invoke(instance, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, C3854k c3854k) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            C3862t.f(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.isVoidMethod = C3862t.b(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, C3854k c3854k) {
        this(member, type, cls, typeArr);
    }

    @Override // Ma.h
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // Ma.h
    public final M b() {
        return this.member;
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    protected final void d(Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class<?> e() {
        return this.instanceClass;
    }

    @Override // Ma.h
    public final Type getReturnType() {
        return this.returnType;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private i(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.member = r1
            r0.returnType = r2
            r0.instanceClass = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.U r1 = new kotlin.jvm.internal.U
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = kotlin.collections.r.p(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.C3831l.I0(r4)
        L2b:
            r0.parameterTypes = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
