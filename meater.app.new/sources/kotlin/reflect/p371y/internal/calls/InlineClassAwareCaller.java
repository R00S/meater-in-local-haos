package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.IntRange;
import kotlin.reflect.p371y.internal.C9891g0;
import okhttp3.HttpUrl;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.g, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {

    /* renamed from: a */
    private final Caller<M> f37420a;

    /* renamed from: b */
    private final boolean f37421b;

    /* renamed from: c */
    private final a f37422c;

    /* compiled from: InlineClassAwareCaller.kt */
    @Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", HttpUrl.FRAGMENT_ENCODE_SET, "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.g$a */
    private static final class a {

        /* renamed from: a */
        private final IntRange f37423a;

        /* renamed from: b */
        private final Method[] f37424b;

        /* renamed from: c */
        private final Method f37425c;

        public a(IntRange intRange, Method[] methodArr, Method method) {
            C9801m.m32346f(intRange, "argumentRange");
            C9801m.m32346f(methodArr, "unbox");
            this.f37423a = intRange;
            this.f37424b = methodArr;
            this.f37425c = method;
        }

        /* renamed from: a, reason: from getter */
        public final IntRange getF37423a() {
            return this.f37423a;
        }

        /* renamed from: b, reason: from getter */
        public final Method[] getF37424b() {
            return this.f37424b;
        }

        /* renamed from: c, reason: from getter */
        public final Method getF37425c() {
            return this.f37425c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InlineClassAwareCaller(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b r11, kotlin.reflect.p371y.internal.calls.Caller<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.calls.InlineClassAwareCaller.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.f0.y.e.i0.d, boolean):void");
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: a */
    public List<Type> mo32637a() {
        return this.f37420a.mo32637a();
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        C9801m.m32346f(args, "args");
        a aVar = this.f37422c;
        IntRange f37423a = aVar.getF37423a();
        Method[] f37424b = aVar.getF37424b();
        Method f37425c = aVar.getF37425c();
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        C9801m.m32345e(objArrCopyOf, "copyOf(this, size)");
        C9801m.m32344d(objArrCopyOf, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int f37215g = f37423a.getF37215g();
        int f37216h = f37423a.getF37216h();
        if (f37215g <= f37216h) {
            while (true) {
                Method method = f37424b[f37215g];
                Object objM32562g = args[f37215g];
                if (method != null) {
                    if (objM32562g != null) {
                        objM32562g = method.invoke(objM32562g, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        C9801m.m32345e(returnType, "method.returnType");
                        objM32562g = C9891g0.m32562g(returnType);
                    }
                }
                objArrCopyOf[f37215g] = objM32562g;
                if (f37215g == f37216h) {
                    break;
                }
                f37215g++;
            }
        }
        Object objCall = this.f37420a.call(objArrCopyOf);
        return (f37425c == null || (objInvoke = f37425c.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public M getMember() {
        return (M) this.f37420a.getMember();
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: getReturnType */
    public Type getF37428c() {
        return this.f37420a.getF37428c();
    }
}
