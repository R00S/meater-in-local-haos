package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10795j;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.calls.Caller;
import kotlin.reflect.p371y.internal.calls.CallerImpl;
import okhttp3.HttpUrl;

/* compiled from: InternalUnderlyingValOfInlineClass.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0004¢\u0006\u0002\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "member", "getMember", "()Ljava/lang/reflect/Method;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", HttpUrl.FRAGMENT_ENCODE_SET, "instance", "args", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class InternalUnderlyingValOfInlineClass implements Caller<Method> {

    /* renamed from: a */
    private final Method f37426a;

    /* renamed from: b */
    private final List<Type> f37427b;

    /* renamed from: c */
    private final Type f37428c;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "unboxMethod", "Ljava/lang/reflect/Method;", "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.i$a */
    public static final class a extends InternalUnderlyingValOfInlineClass implements BoundCaller {

        /* renamed from: d */
        private final Object f37429d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, C10817u.m38888j(), null);
            C9801m.m32346f(method, "unboxMethod");
            this.f37429d = obj;
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            C9801m.m32346f(args, "args");
            m32675c(args);
            return m32674b(this.f37429d, args);
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.i$b */
    public static final class b extends InternalUnderlyingValOfInlineClass {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, C10815t.m38883e(method.getDeclaringClass()), null);
            C9801m.m32346f(method, "unboxMethod");
        }

        @Override // kotlin.reflect.p371y.internal.calls.Caller
        public Object call(Object[] args) {
            Object[] objArrM38681i;
            C9801m.m32346f(args, "args");
            m32675c(args);
            Object obj = args[0];
            CallerImpl.d dVar = CallerImpl.f37407a;
            if (args.length <= 1) {
                objArrM38681i = new Object[0];
            } else {
                objArrM38681i = C10795j.m38681i(args, 1, args.length);
                C9801m.m32344d(objArrM38681i, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
            }
            return m32674b(obj, objArrM38681i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InternalUnderlyingValOfInlineClass(Method method, List<? extends Type> list) {
        this.f37426a = method;
        this.f37427b = list;
        Class<?> returnType = method.getReturnType();
        C9801m.m32345e(returnType, "unboxMethod.returnType");
        this.f37428c = returnType;
    }

    public /* synthetic */ InternalUnderlyingValOfInlineClass(Method method, List list, C9789g c9789g) {
        this(method, list);
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: a */
    public final List<Type> mo32637a() {
        return this.f37427b;
    }

    /* renamed from: b */
    protected final Object m32674b(Object obj, Object[] objArr) {
        C9801m.m32346f(objArr, "args");
        return this.f37426a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: c */
    public void m32675c(Object[] objArr) {
        Caller.a.m32656a(this, objArr);
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Method getMember() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: getReturnType, reason: from getter */
    public final Type getF37428c() {
        return this.f37428c;
    }
}
