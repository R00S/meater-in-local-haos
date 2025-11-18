package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.collections.C10795j;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9796j0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.calls.Caller;
import okhttp3.HttpUrl;

/* compiled from: CallerImpl.kt */
@Metadata(m32266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001e*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b\u001b\u001c\u001d\u001e\u001f !\"B3\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0007#$%&'()¨\u0006*"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", HttpUrl.FRAGMENT_ENCODE_SET, "obj", HttpUrl.FRAGMENT_ENCODE_SET, "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class CallerImpl<M extends Member> implements Caller<M> {

    /* renamed from: a */
    public static final d f37407a = new d(null);

    /* renamed from: b */
    private final M f37408b;

    /* renamed from: c */
    private final Type f37409c;

    /* renamed from: d */
    private final Class<?> f37410d;

    /* renamed from: e */
    private final List<Type> f37411e;

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "constructor", "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$a */
    public static final class a extends CallerImpl<Constructor<?>> implements BoundCaller {

        /* renamed from: f */
        private final Object f37412f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor<?> constructor, Object obj) {
            Object[] objArr;
            C9801m.m32346f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C9801m.m32345e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C9801m.m32345e(genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 2) {
                objArr = new Type[0];
            } else {
                Object[] objArrM38681i = C10795j.m38681i(genericParameterTypes, 1, genericParameterTypes.length - 1);
                C9801m.m32344d(objArrM38681i, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirstAndLast>");
                objArr = objArrM38681i;
            }
            super(constructor, declaringClass, null, (Type[]) objArr, null);
            this.f37412f = obj;
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            C9801m.m32346f(args, "args");
            mo32657b(args);
            Constructor<?> member = getMember();
            C9796j0 c9796j0 = new C9796j0(3);
            c9796j0.m32319a(this.f37412f);
            c9796j0.m32320b(args);
            c9796j0.m32319a(null);
            return member.newInstance(c9796j0.m32322d(new Object[c9796j0.m32321c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$b */
    public static final class b extends CallerImpl<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor<?> constructor) {
            Object[] objArr;
            C9801m.m32346f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C9801m.m32345e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C9801m.m32345e(genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 1) {
                objArr = new Type[0];
            } else {
                Object[] objArrM38681i = C10795j.m38681i(genericParameterTypes, 0, genericParameterTypes.length - 1);
                C9801m.m32344d(objArrM38681i, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropLast>");
                objArr = objArrM38681i;
            }
            super(constructor, declaringClass, null, (Type[]) objArr, null);
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            C9801m.m32346f(args, "args");
            mo32657b(args);
            Constructor<?> member = getMember();
            C9796j0 c9796j0 = new C9796j0(2);
            c9796j0.m32320b(args);
            c9796j0.m32319a(null);
            return member.newInstance(c9796j0.m32322d(new Object[c9796j0.m32321c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$c */
    public static final class c extends CallerImpl<Constructor<?>> implements BoundCaller {

        /* renamed from: f */
        private final Object f37413f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor<?> constructor, Object obj) {
            C9801m.m32346f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C9801m.m32345e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C9801m.m32345e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f37413f = obj;
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            C9801m.m32346f(args, "args");
            mo32657b(args);
            Constructor<?> member = getMember();
            C9796j0 c9796j0 = new C9796j0(2);
            c9796j0.m32319a(this.f37413f);
            c9796j0.m32320b(args);
            return member.newInstance(c9796j0.m32322d(new Object[c9796j0.m32321c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "dropFirst", HttpUrl.FRAGMENT_ENCODE_SET, "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$d */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$e */
    public static final class e extends CallerImpl<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor<?> constructor) {
            C9801m.m32346f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C9801m.m32345e(declaringClass, "constructor.declaringClass");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C9801m.m32345e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            C9801m.m32346f(args, "args");
            mo32657b(args);
            return getMember().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;Z)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$f */
    public static abstract class f extends CallerImpl<Field> {

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$f$a */
        public static final class a extends f implements BoundCaller {

            /* renamed from: f */
            private final Object f37414f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                C9801m.m32346f(field, "field");
                this.f37414f = obj;
            }

            @Override // kotlin.reflect.p371y.internal.calls.CallerImpl.f, kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                return getMember().get(this.f37414f);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$f$b */
        public static final class b extends f implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                C9801m.m32346f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$f$c */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                C9801m.m32346f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "checkArguments", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$f$d */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                C9801m.m32346f(field, "field");
            }

            @Override // kotlin.reflect.p371y.internal.calls.CallerImpl
            /* renamed from: b */
            public void mo32657b(Object[] objArr) {
                C9801m.m32346f(objArr, "args");
                super.mo32657b(objArr);
                m32658c(C10795j.m38696x(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$f$e */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                C9801m.m32346f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z) {
            Type genericType = field.getGenericType();
            C9801m.m32345e(genericType, "field.genericType");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0], null);
        }

        public /* synthetic */ f(Field field, boolean z, C9789g c9789g) {
            this(field, z);
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            C9801m.m32346f(args, "args");
            mo32657b(args);
            return getMember().get(m32659d() != null ? C10795j.m38695w(args) : null);
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", HttpUrl.FRAGMENT_ENCODE_SET, "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$g */
    public static abstract class g extends CallerImpl<Field> {

        /* renamed from: f */
        private final boolean f37415f;

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0002\u0010\rR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", HttpUrl.FRAGMENT_ENCODE_SET, "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$g$a */
        public static final class a extends g implements BoundCaller {

            /* renamed from: g */
            private final Object f37416g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                C9801m.m32346f(field, "field");
                this.f37416g = obj;
            }

            @Override // kotlin.reflect.p371y.internal.calls.CallerImpl.g, kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                getMember().set(this.f37416g, C10795j.m38695w(args));
                return C10775u.f41439a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;Z)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$g$b */
        public static final class b extends g implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z) {
                super(field, z, false, null);
                C9801m.m32346f(field, "field");
            }

            @Override // kotlin.reflect.p371y.internal.calls.CallerImpl.g, kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                getMember().set(null, C10795j.m38658J(args));
                return C10775u.f41439a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$g$c */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z) {
                super(field, z, true, null);
                C9801m.m32346f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;Z)V", "checkArguments", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$g$d */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z) {
                super(field, z, true, null);
                C9801m.m32346f(field, "field");
            }

            @Override // kotlin.reflect.p371y.internal.calls.CallerImpl.g, kotlin.reflect.p371y.internal.calls.CallerImpl
            /* renamed from: b */
            public void mo32657b(Object[] objArr) {
                C9801m.m32346f(objArr, "args");
                super.mo32657b(objArr);
                m32658c(C10795j.m38696x(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$g$e */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z) {
                super(field, z, false, null);
                C9801m.m32346f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z, boolean z2) {
            Class cls = Void.TYPE;
            C9801m.m32345e(cls, "TYPE");
            Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            C9801m.m32345e(genericType, "field.genericType");
            super(field, cls, declaringClass, new Type[]{genericType}, null);
            this.f37415f = z;
        }

        public /* synthetic */ g(Field field, boolean z, boolean z2, C9789g c9789g) {
            this(field, z, z2);
        }

        @Override // kotlin.reflect.p371y.internal.calls.CallerImpl
        /* renamed from: b */
        public void mo32657b(Object[] objArr) {
            C9801m.m32346f(objArr, "args");
            super.mo32657b(objArr);
            if (this.f37415f && C10795j.m38658J(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
            C9801m.m32346f(args, "args");
            mo32657b(args);
            getMember().set(m32659d() != null ? C10795j.m38695w(args) : null, C10795j.m38658J(args));
            return C10775u.f41439a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private CallerImpl(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f37408b = r1
            r0.f37409c = r2
            r0.f37410d = r3
            if (r3 == 0) goto L27
            kotlin.a0.d.j0 r1 = new kotlin.a0.d.j0
            r2 = 2
            r1.<init>(r2)
            r1.m32319a(r3)
            r1.m32320b(r4)
            int r2 = r1.m32321c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.m32322d(r2)
            java.util.List r1 = kotlin.collections.C10813s.m38854m(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.C10795j.m38671Z(r4)
        L2b:
            r0.f37411e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.calls.CallerImpl.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public /* synthetic */ CallerImpl(Member member, Type type, Class cls, Type[] typeArr, C9789g c9789g) {
        this(member, type, cls, typeArr);
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: a */
    public List<Type> mo32637a() {
        return this.f37411e;
    }

    /* renamed from: b */
    public void mo32657b(Object[] objArr) {
        Caller.a.m32656a(this, objArr);
    }

    /* renamed from: c */
    protected final void m32658c(Object obj) {
        if (obj == null || !this.f37408b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* renamed from: d */
    public final Class<?> m32659d() {
        return this.f37410d;
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public final M getMember() {
        return this.f37408b;
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: getReturnType, reason: from getter */
    public final Type getF37409c() {
        return this.f37409c;
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "method", "requiresInstance", HttpUrl.FRAGMENT_ENCODE_SET, "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", HttpUrl.FRAGMENT_ENCODE_SET, "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.e$h */
    public static abstract class h extends CallerImpl<Method> {

        /* renamed from: f */
        private final boolean f37417f;

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$h$a */
        public static final class a extends h implements BoundCaller {

            /* renamed from: g */
            private final Object f37418g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                C9801m.m32346f(method, "method");
                this.f37418g = obj;
            }

            @Override // kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                return m32660e(this.f37418g, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$h$b */
        public static final class b extends h implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                C9801m.m32346f(method, "method");
            }

            @Override // kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                return m32660e(null, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$h$c */
        public static final class c extends h implements BoundCaller {

            /* renamed from: g */
            private final Object f37419g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, Object obj) {
                Object objM38681i;
                C9801m.m32346f(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                C9801m.m32345e(genericParameterTypes, "method.genericParameterTypes");
                boolean z = false;
                if (genericParameterTypes.length <= 1) {
                    objM38681i = new Type[0];
                } else {
                    objM38681i = C10795j.m38681i(genericParameterTypes, 1, genericParameterTypes.length);
                    C9801m.m32344d(objM38681i, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                super(method, z, (Type[]) objM38681i, null);
                this.f37419g = obj;
            }

            @Override // kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                C9796j0 c9796j0 = new C9796j0(2);
                c9796j0.m32319a(this.f37419g);
                c9796j0.m32320b(args);
                return m32660e(null, c9796j0.m32322d(new Object[c9796j0.m32321c()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$h$d */
        public static final class d extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, null, 6, null);
                C9801m.m32346f(method, "method");
            }

            @Override // kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                Object[] objArrM38681i;
                C9801m.m32346f(args, "args");
                mo32657b(args);
                Object obj = args[0];
                if (args.length <= 1) {
                    objArrM38681i = new Object[0];
                } else {
                    objArrM38681i = C10795j.m38681i(args, 1, args.length);
                    C9801m.m32344d(objArrM38681i, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                return m32660e(obj, objArrM38681i);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$h$e */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, null, 4, null);
                C9801m.m32346f(method, "method");
            }

            @Override // kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                Object[] objArrM38681i;
                C9801m.m32346f(args, "args");
                mo32657b(args);
                m32658c(C10795j.m38696x(args));
                if (args.length <= 1) {
                    objArrM38681i = new Object[0];
                } else {
                    objArrM38681i = C10795j.m38681i(args, 1, args.length);
                    C9801m.m32344d(objArrM38681i, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                return m32660e(null, objArrM38681i);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i0.e$h$f */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, null, 6, null);
                C9801m.m32346f(method, "method");
            }

            @Override // kotlin.reflect.p371y.internal.calls.Caller
            public Object call(Object[] args) {
                C9801m.m32346f(args, "args");
                mo32657b(args);
                return m32660e(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(Method method, boolean z, Type[] typeArr, int i2, C9789g c9789g) {
            z = (i2 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
            if ((i2 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                C9801m.m32345e(typeArr, "method.genericParameterTypes");
            }
            this(method, z, typeArr, null);
        }

        public /* synthetic */ h(Method method, boolean z, Type[] typeArr, C9789g c9789g) {
            this(method, z, typeArr);
        }

        /* renamed from: e */
        protected final Object m32660e(Object obj, Object[] objArr) {
            C9801m.m32346f(objArr, "args");
            return this.f37417f ? C10775u.f41439a : getMember().invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            C9801m.m32345e(genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.f37417f = C9801m.m32341a(getF37409c(), Void.TYPE);
        }
    }
}
