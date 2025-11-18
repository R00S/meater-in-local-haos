package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.C10568o;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.C10803n;
import kotlin.comparisons.C10839b;
import kotlin.jvm.C9752a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CopyableThrowable;
import okhttp3.HttpUrl;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a!\u0010\u0010\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0015\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0018"}, m32267d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", HttpUrl.FRAGMENT_ENCODE_SET, "createConstructor", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "createSafeConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes3.dex */
public final class C10987j {

    /* renamed from: a */
    private static final int f41791a = m39501f(Throwable.class, -1);

    /* renamed from: b */
    private static final CtorCache f41792b;

    /* compiled from: Comparisons.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.j$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C10839b.m39017a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "E", HttpUrl.FRAGMENT_ENCODE_SET, "it", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.j$b */
    static final class b extends Lambda implements Function1 {

        /* renamed from: f */
        public static final b f41793f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.j$c */
    public static final class c extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f41794f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f41794f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objM37650a;
            Object objNewInstance;
            try {
                Result.a aVar = Result.f40714f;
                objNewInstance = this.f41794f.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f40714f;
                objM37650a = Result.m37650a(C10568o.m37654a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objM37650a = Result.m37650a((Throwable) objNewInstance);
            if (Result.m37652c(objM37650a)) {
                objM37650a = null;
            }
            return (Throwable) objM37650a;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.j$d */
    public static final class d extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f41795f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f41795f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objM37650a;
            Object objNewInstance;
            try {
                Result.a aVar = Result.f40714f;
                objNewInstance = this.f41795f.newInstance(th);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f40714f;
                objM37650a = Result.m37650a(C10568o.m37654a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objM37650a = Result.m37650a((Throwable) objNewInstance);
            if (Result.m37652c(objM37650a)) {
                objM37650a = null;
            }
            return (Throwable) objM37650a;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.j$e */
    public static final class e extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f41796f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f41796f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objM37650a;
            Object objNewInstance;
            try {
                Result.a aVar = Result.f40714f;
                objNewInstance = this.f41796f.newInstance(th.getMessage());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f40714f;
                objM37650a = Result.m37650a(C10568o.m37654a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objM37650a = Result.m37650a(th3);
            if (Result.m37652c(objM37650a)) {
                objM37650a = null;
            }
            return (Throwable) objM37650a;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.j$f */
    public static final class f extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f41797f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f41797f = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objM37650a;
            Object objNewInstance;
            try {
                Result.a aVar = Result.f40714f;
                objNewInstance = this.f41797f.newInstance(new Object[0]);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f40714f;
                objM37650a = Result.m37650a(C10568o.m37654a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objM37650a = Result.m37650a(th3);
            if (Result.m37652c(objM37650a)) {
                objM37650a = null;
            }
            return (Throwable) objM37650a;
        }
    }

    static {
        CtorCache ctorCache;
        try {
            ctorCache = C10991l.m39531a() ? WeakMapCtorCache.f41805a : ClassValueCtorCache.f41769a;
        } catch (Throwable unused) {
            ctorCache = WeakMapCtorCache.f41805a;
        }
        f41792b = ctorCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final <E extends Throwable> Function1<Throwable, Throwable> m39497b(Class<E> cls) {
        b bVar = b.f41793f;
        if (f41791a != m39501f(cls, 0)) {
            return bVar;
        }
        Iterator it = C10803n.m38737Q(cls.getConstructors(), new a()).iterator();
        while (it.hasNext()) {
            Function1<Throwable, Throwable> function1M39498c = m39498c((Constructor) it.next());
            if (function1M39498c != null) {
                return function1M39498c;
            }
        }
        return bVar;
    }

    /* renamed from: c */
    private static final Function1<Throwable, Throwable> m39498c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new f(constructor);
        }
        if (length != 1) {
            if (length == 2 && C9801m.m32341a(parameterTypes[0], String.class) && C9801m.m32341a(parameterTypes[1], Throwable.class)) {
                return new c(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (C9801m.m32341a(cls, Throwable.class)) {
            return new d(constructor);
        }
        if (C9801m.m32341a(cls, String.class)) {
            return new e(constructor);
        }
        return null;
    }

    /* renamed from: d */
    private static final int m39499d(Class<?> cls, int i2) {
        do {
            int length = cls.getDeclaredFields().length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (!Modifier.isStatic(r0[i4].getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    /* renamed from: e */
    static /* synthetic */ int m39500e(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return m39499d(cls, i2);
    }

    /* renamed from: f */
    private static final int m39501f(Class<?> cls, int i2) {
        Object objM37650a;
        C9752a.m32279e(cls);
        try {
            Result.a aVar = Result.f40714f;
            objM37650a = Result.m37650a(Integer.valueOf(m39500e(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f40714f;
            objM37650a = Result.m37650a(C10568o.m37654a(th));
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (Result.m37652c(objM37650a)) {
            objM37650a = numValueOf;
        }
        return ((Number) objM37650a).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final <E extends Throwable> E m39502g(E e2) {
        Object objM37650a;
        if (!(e2 instanceof CopyableThrowable)) {
            return (E) f41792b.mo39452a(e2.getClass()).invoke(e2);
        }
        try {
            Result.a aVar = Result.f40714f;
            objM37650a = Result.m37650a(((CopyableThrowable) e2).mo39074a());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f40714f;
            objM37650a = Result.m37650a(C10568o.m37654a(th));
        }
        if (Result.m37652c(objM37650a)) {
            objM37650a = null;
        }
        return (E) objM37650a;
    }
}
