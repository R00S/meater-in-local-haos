package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DebugMetadata.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/i;", "", "<init>", "()V", "Lkotlin/coroutines/jvm/internal/a;", "continuation", "Lkotlin/coroutines/jvm/internal/i$a;", "a", "(Lkotlin/coroutines/jvm/internal/a;)Lkotlin/coroutines/jvm/internal/i$a;", "", "b", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/String;", "Lkotlin/coroutines/jvm/internal/i$a;", "notOnJava9", "c", "cache", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f43964a = new i();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final a notOnJava9 = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static a cache;

    /* compiled from: DebugMetadata.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/i$a;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "a", "Ljava/lang/reflect/Method;", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Method getModuleMethod;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Method getDescriptorMethod;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final Method nameMethod;

        public a(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a continuation) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            cache = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = notOnJava9;
            cache = aVar2;
            return aVar2;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        C3862t.g(continuation, "continuation");
        a aVarA = cache;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == notOnJava9) {
            return null;
        }
        Method method = aVarA.getModuleMethod;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.getDescriptorMethod;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.nameMethod;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
