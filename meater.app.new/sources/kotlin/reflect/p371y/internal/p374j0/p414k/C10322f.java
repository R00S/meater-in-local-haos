package kotlin.reflect.p371y.internal.p374j0.p414k;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C10775u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.C10769c;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;

/* compiled from: LockBasedStorageManager.java */
/* renamed from: kotlin.f0.y.e.j0.k.f */
/* loaded from: classes3.dex */
public class C10322f implements InterfaceC10330n {

    /* renamed from: a */
    private static final String f40007a = C10547v.m37547N0(C10322f.class.getCanonicalName(), ".", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b */
    public static final InterfaceC10330n f40008b = new a("NO_LOCKS", f.f40017a, C10321e.f40006b);

    /* renamed from: c */
    protected final InterfaceC10327k f40009c;

    /* renamed from: d */
    private final f f40010d;

    /* renamed from: e */
    private final String f40011e;

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$a */
    static class a extends C10322f {
        a(String str, f fVar, InterfaceC10327k interfaceC10327k) {
            super(str, fVar, interfaceC10327k, null);
        }

        /* renamed from: j */
        private static /* synthetic */ void m36525j(int i2) {
            String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 1 ? 3 : 2];
            if (i2 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i2 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i2 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f
        /* renamed from: p */
        protected <K, V> o<V> mo36524p(String str, K k2) {
            if (str == null) {
                m36525j(0);
            }
            o<V> oVarM36547a = o.m36547a();
            if (oVarM36547a == null) {
                m36525j(1);
            }
            return oVarM36547a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$b */
    class b<T> extends j<T> {

        /* renamed from: i */
        final /* synthetic */ Object f40012i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10322f c10322f, Function0 function0, Object obj) {
            super(c10322f, function0);
            this.f40012i = obj;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36526b(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h
        /* renamed from: e */
        protected o<T> mo36527e(boolean z) {
            o<T> oVarM36548d = o.m36548d(this.f40012i);
            if (oVarM36548d == null) {
                m36526b(0);
            }
            return oVarM36548d;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$c */
    class c<T> extends k<T> {

        /* renamed from: j */
        final /* synthetic */ Function1 f40014j;

        /* renamed from: k */
        final /* synthetic */ Function1 f40015k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C10322f c10322f, Function0 function0, Function1 function1, Function1 function12) {
            super(c10322f, function0);
            this.f40014j = function1;
            this.f40015k = function12;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36528b(int i2) {
            String str = i2 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i2 != 2 ? 2 : 3];
            if (i2 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i2 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i2 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h
        /* renamed from: e */
        protected o<T> mo36527e(boolean z) {
            Function1 function1 = this.f40014j;
            if (function1 == null) {
                o<T> oVarMo36527e = super.mo36527e(z);
                if (oVarMo36527e == null) {
                    m36528b(0);
                }
                return oVarMo36527e;
            }
            o<T> oVarM36548d = o.m36548d(function1.invoke(Boolean.valueOf(z)));
            if (oVarM36548d == null) {
                m36528b(1);
            }
            return oVarM36548d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.i
        /* renamed from: g */
        protected void mo36529g(T t) {
            if (t == null) {
                m36528b(2);
            }
            this.f40015k.invoke(t);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$d */
    private static class d<K, V> extends e<K, V> implements InterfaceC10317a<K, V> {
        /* synthetic */ d(C10322f c10322f, ConcurrentMap concurrentMap, a aVar) {
            this(c10322f, concurrentMap);
        }

        /* renamed from: c */
        private static /* synthetic */ void m36530c(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 3 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "computation";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i2 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.e, kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10317a
        /* renamed from: b */
        public V mo36506b(K k2, Function0<? extends V> function0) {
            if (function0 == null) {
                m36530c(2);
            }
            V v = (V) super.mo36506b(k2, function0);
            if (v == null) {
                m36530c(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(C10322f c10322f, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(c10322f, concurrentMap, null);
            if (c10322f == null) {
                m36530c(0);
            }
            if (concurrentMap == null) {
                m36530c(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$e */
    private static class e<K, V> extends l<g<K, V>, V> implements InterfaceC10318b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.f0.y.e.j0.k.f$e$a */
        class a implements Function1<g<K, V>, V> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f40019b.invoke();
            }
        }

        /* synthetic */ e(C10322f c10322f, ConcurrentMap concurrentMap, a aVar) {
            this(c10322f, concurrentMap);
        }

        /* renamed from: c */
        private static /* synthetic */ void m36531c(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i2 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public V mo36506b(K k2, Function0<? extends V> function0) {
            if (function0 == null) {
                m36531c(2);
            }
            return invoke(new g(k2, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(C10322f c10322f, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(c10322f, concurrentMap, new a());
            if (c10322f == null) {
                m36531c(0);
            }
            if (concurrentMap == null) {
                m36531c(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$f */
    public interface f {

        /* renamed from: a */
        public static final f f40017a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.f0.y.e.j0.k.f$f$a */
        static class a implements f {
            a() {
            }

            /* renamed from: b */
            private static /* synthetic */ void m36534b(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.f
            /* renamed from: a */
            public RuntimeException mo36533a(Throwable th) {
                if (th == null) {
                    m36534b(0);
                }
                throw C10769c.m38524b(th);
            }
        }

        /* renamed from: a */
        RuntimeException mo36533a(Throwable th);
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$g */
    private static class g<K, V> {

        /* renamed from: a */
        private final K f40018a;

        /* renamed from: b */
        private final Function0<? extends V> f40019b;

        public g(K k2, Function0<? extends V> function0) {
            this.f40018a = k2;
            this.f40019b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.f40018a.equals(((g) obj).f40018a);
        }

        public int hashCode() {
            return this.f40018a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$h */
    private static class h<T> implements InterfaceC10326j<T> {

        /* renamed from: f */
        private final C10322f f40020f;

        /* renamed from: g */
        private final Function0<? extends T> f40021g;

        /* renamed from: h */
        private volatile Object f40022h;

        public h(C10322f c10322f, Function0<? extends T> function0) {
            if (c10322f == null) {
                m36536b(0);
            }
            if (function0 == null) {
                m36536b(1);
            }
            this.f40022h = n.NOT_COMPUTED;
            this.f40020f = c10322f;
            this.f40021g = function0;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36536b(int i2) {
            String str = (i2 == 2 || i2 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 2 || i2 == 3) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 == 2 || i2 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i2 != 2 && i2 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 2 && i2 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* renamed from: a */
        public boolean m36537a() {
            return (this.f40022h == n.NOT_COMPUTED || this.f40022h == n.COMPUTING) ? false : true;
        }

        /* renamed from: c */
        protected void mo36538c(T t) {
        }

        /* renamed from: e */
        protected o<T> mo36527e(boolean z) {
            o<T> oVarMo36524p = this.f40020f.mo36524p("in a lazy value", null);
            if (oVarMo36524p == null) {
                m36536b(2);
            }
            return oVarMo36524p;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:39:0x0012, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x005f, B:28:0x0065, B:30:0x006b, B:31:0x0071, B:32:0x007b, B:33:0x007c, B:34:0x0082, B:23:0x0052), top: B:39:0x0012, inners: #1 }] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f40022h
                boolean r1 = r0 instanceof kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38505f(r0)
                return r0
            Lb:
                kotlin.f0.y.e.j0.k.f r0 = r4.f40020f
                kotlin.f0.y.e.j0.k.k r0 = r0.f40009c
                r0.lock()
                java.lang.Object r0 = r4.f40022h     // Catch: java.lang.Throwable -> L83
                boolean r1 = r0 instanceof kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n     // Catch: java.lang.Throwable -> L83
                if (r1 != 0) goto L24
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38505f(r0)     // Catch: java.lang.Throwable -> L83
            L1c:
                kotlin.f0.y.e.j0.k.f r1 = r4.f40020f
                kotlin.f0.y.e.j0.k.k r1 = r1.f40009c
                r1.unlock()
                return r0
            L24:
                kotlin.f0.y.e.j0.k.f$n r1 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.COMPUTING     // Catch: java.lang.Throwable -> L83
                if (r0 != r1) goto L3c
                kotlin.f0.y.e.j0.k.f$n r2 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L83
                r4.f40022h = r2     // Catch: java.lang.Throwable -> L83
                r2 = 1
                kotlin.f0.y.e.j0.k.f$o r2 = r4.mo36527e(r2)     // Catch: java.lang.Throwable -> L83
                boolean r3 = r2.m36550c()     // Catch: java.lang.Throwable -> L83
                if (r3 != 0) goto L3c
                java.lang.Object r0 = r2.m36549b()     // Catch: java.lang.Throwable -> L83
                goto L1c
            L3c:
                kotlin.f0.y.e.j0.k.f$n r2 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L83
                if (r0 != r2) goto L50
                r0 = 0
                kotlin.f0.y.e.j0.k.f$o r0 = r4.mo36527e(r0)     // Catch: java.lang.Throwable -> L83
                boolean r2 = r0.m36550c()     // Catch: java.lang.Throwable -> L83
                if (r2 != 0) goto L50
                java.lang.Object r0 = r0.m36549b()     // Catch: java.lang.Throwable -> L83
                goto L1c
            L50:
                r4.f40022h = r1     // Catch: java.lang.Throwable -> L83
                kotlin.a0.c.a<? extends T> r0 = r4.f40021g     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L5e
                r4.mo36538c(r0)     // Catch: java.lang.Throwable -> L5e
                r4.f40022h = r0     // Catch: java.lang.Throwable -> L5e
                goto L1c
            L5e:
                r0 = move-exception
                boolean r1 = kotlin.reflect.jvm.internal.impl.utils.C10769c.m38523a(r0)     // Catch: java.lang.Throwable -> L83
                if (r1 != 0) goto L7c
                java.lang.Object r1 = r4.f40022h     // Catch: java.lang.Throwable -> L83
                kotlin.f0.y.e.j0.k.f$n r2 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.COMPUTING     // Catch: java.lang.Throwable -> L83
                if (r1 != r2) goto L71
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38502c(r0)     // Catch: java.lang.Throwable -> L83
                r4.f40022h = r1     // Catch: java.lang.Throwable -> L83
            L71:
                kotlin.f0.y.e.j0.k.f r1 = r4.f40020f     // Catch: java.lang.Throwable -> L83
                kotlin.f0.y.e.j0.k.f$f r1 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.m36509k(r1)     // Catch: java.lang.Throwable -> L83
                java.lang.RuntimeException r0 = r1.mo36533a(r0)     // Catch: java.lang.Throwable -> L83
                throw r0     // Catch: java.lang.Throwable -> L83
            L7c:
                kotlin.f0.y.e.j0.k.f$n r1 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L83
                r4.f40022h = r1     // Catch: java.lang.Throwable -> L83
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L83
                throw r0     // Catch: java.lang.Throwable -> L83
            L83:
                r0 = move-exception
                kotlin.f0.y.e.j0.k.f r1 = r4.f40020f
                kotlin.f0.y.e.j0.k.k r1 = r1.f40009c
                r1.unlock()
                goto L8d
            L8c:
                throw r0
            L8d:
                goto L8c
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h.invoke():java.lang.Object");
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$i */
    private static abstract class i<T> extends h<T> {

        /* renamed from: i */
        private volatile C10328l<T> f40023i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C10322f c10322f, Function0<? extends T> function0) {
            super(c10322f, function0);
            if (c10322f == null) {
                m36539b(0);
            }
            if (function0 == null) {
                m36539b(1);
            }
            this.f40023i = null;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36539b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h
        /* renamed from: c */
        protected final void mo36538c(T t) {
            this.f40023i = new C10328l<>(t);
            try {
                mo36529g(t);
            } finally {
                this.f40023i = null;
            }
        }

        /* renamed from: g */
        protected abstract void mo36529g(T t);

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            C10328l<T> c10328l = this.f40023i;
            return (c10328l == null || !c10328l.m36554b()) ? (T) super.invoke() : c10328l.m36553a();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$j */
    private static class j<T> extends h<T> implements InterfaceC10325i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C10322f c10322f, Function0<? extends T> function0) {
            super(c10322f, function0);
            if (c10322f == null) {
                m36540b(0);
            }
            if (function0 == null) {
                m36540b(1);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m36540b(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m36540b(2);
            }
            return t;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$k */
    private static abstract class k<T> extends i<T> implements InterfaceC10325i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C10322f c10322f, Function0<? extends T> function0) {
            super(c10322f, function0);
            if (c10322f == null) {
                m36541b(0);
            }
            if (function0 == null) {
                m36541b(1);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m36541b(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.i, kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m36541b(2);
            }
            return t;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$l */
    private static class l<K, V> implements InterfaceC10324h<K, V> {

        /* renamed from: f */
        private final C10322f f40024f;

        /* renamed from: g */
        private final ConcurrentMap<K, Object> f40025g;

        /* renamed from: h */
        private final Function1<? super K, ? extends V> f40026h;

        public l(C10322f c10322f, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (c10322f == null) {
                m36542c(0);
            }
            if (concurrentMap == null) {
                m36542c(1);
            }
            if (function1 == null) {
                m36542c(2);
            }
            this.f40024f = c10322f;
            this.f40025g = concurrentMap;
            this.f40026h = function1;
        }

        /* renamed from: c */
        private static /* synthetic */ void m36542c(int i2) {
            String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 3 || i2 == 4) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 == 3 || i2 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i2 != 3 && i2 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 3 && i2 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* renamed from: e */
        private AssertionError m36543e(K k2, Object obj) {
            AssertionError assertionError = (AssertionError) C10322f.m36512q(new AssertionError("Race condition detected on input " + k2 + ". Old value is " + obj + " under " + this.f40024f));
            if (assertionError == null) {
                m36542c(4);
            }
            return assertionError;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h
        /* renamed from: f */
        public boolean mo36544f(K k2) {
            Object obj = this.f40025g.get(k2);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        /* renamed from: g */
        protected o<V> m36545g(K k2, boolean z) {
            o<V> oVarMo36524p = this.f40024f.mo36524p(HttpUrl.FRAGMENT_ENCODE_SET, k2);
            if (oVarMo36524p == null) {
                m36542c(3);
            }
            return oVarMo36524p;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[Catch: all -> 0x00b5, PHI: r0
          0x003b: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v17 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b5, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:16:0x003b, B:18:0x003f, B:20:0x004a, B:22:0x0051, B:32:0x007c, B:35:0x0084, B:37:0x0092, B:38:0x0096, B:39:0x0097, B:40:0x00a1, B:41:0x00a2, B:42:0x00ac, B:43:0x00ad, B:44:0x00b4, B:25:0x0057, B:29:0x0076, B:30:0x007a), top: B:49:0x0018, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V invoke(K r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f40025g
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                kotlin.f0.y.e.j0.k.f$n r1 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38503d(r0)
                return r6
            L11:
                kotlin.f0.y.e.j0.k.f r0 = r5.f40024f
                kotlin.f0.y.e.j0.k.k r0 = r0.f40009c
                r0.lock()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f40025g     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> Lb5
                kotlin.f0.y.e.j0.k.f$n r1 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.COMPUTING     // Catch: java.lang.Throwable -> Lb5
                if (r0 != r1) goto L3b
                kotlin.f0.y.e.j0.k.f$n r0 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lb5
                r2 = 1
                kotlin.f0.y.e.j0.k.f$o r2 = r5.m36545g(r6, r2)     // Catch: java.lang.Throwable -> Lb5
                boolean r3 = r2.m36550c()     // Catch: java.lang.Throwable -> Lb5
                if (r3 != 0) goto L3b
                java.lang.Object r6 = r2.m36549b()     // Catch: java.lang.Throwable -> Lb5
            L33:
                kotlin.f0.y.e.j0.k.f r0 = r5.f40024f
                kotlin.f0.y.e.j0.k.k r0 = r0.f40009c
                r0.unlock()
                return r6
            L3b:
                kotlin.f0.y.e.j0.k.f$n r2 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lb5
                if (r0 != r2) goto L4f
                r2 = 0
                kotlin.f0.y.e.j0.k.f$o r2 = r5.m36545g(r6, r2)     // Catch: java.lang.Throwable -> Lb5
                boolean r3 = r2.m36550c()     // Catch: java.lang.Throwable -> Lb5
                if (r3 != 0) goto L4f
                java.lang.Object r6 = r2.m36549b()     // Catch: java.lang.Throwable -> Lb5
                goto L33
            L4f:
                if (r0 == 0) goto L56
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38503d(r0)     // Catch: java.lang.Throwable -> Lb5
                goto L33
            L56:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r5.f40025g     // Catch: java.lang.Throwable -> L7b
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7b
                kotlin.a0.c.l<? super K, ? extends V> r2 = r5.f40026h     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7b
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3 = r5.f40025g     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38501b(r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7b
                if (r3 != r1) goto L76
                kotlin.f0.y.e.j0.k.f r6 = r5.f40024f
                kotlin.f0.y.e.j0.k.k r6 = r6.f40009c
                r6.unlock()
                return r2
            L76:
                java.lang.AssertionError r0 = r5.m36543e(r6, r3)     // Catch: java.lang.Throwable -> L7b
                throw r0     // Catch: java.lang.Throwable -> L7b
            L7b:
                r1 = move-exception
                boolean r2 = kotlin.reflect.jvm.internal.impl.utils.C10769c.m38523a(r1)     // Catch: java.lang.Throwable -> Lb5
                if (r2 != 0) goto Lad
                if (r1 == r0) goto La2
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f40025g     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.m38502c(r1)     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> Lb5
                kotlin.f0.y.e.j0.k.f$n r2 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.n.COMPUTING     // Catch: java.lang.Throwable -> Lb5
                if (r0 == r2) goto L97
                java.lang.AssertionError r6 = r5.m36543e(r6, r0)     // Catch: java.lang.Throwable -> Lb5
                throw r6     // Catch: java.lang.Throwable -> Lb5
            L97:
                kotlin.f0.y.e.j0.k.f r6 = r5.f40024f     // Catch: java.lang.Throwable -> Lb5
                kotlin.f0.y.e.j0.k.f$f r6 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.m36509k(r6)     // Catch: java.lang.Throwable -> Lb5
                java.lang.RuntimeException r6 = r6.mo36533a(r1)     // Catch: java.lang.Throwable -> Lb5
                throw r6     // Catch: java.lang.Throwable -> Lb5
            La2:
                kotlin.f0.y.e.j0.k.f r6 = r5.f40024f     // Catch: java.lang.Throwable -> Lb5
                kotlin.f0.y.e.j0.k.f$f r6 = kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.m36509k(r6)     // Catch: java.lang.Throwable -> Lb5
                java.lang.RuntimeException r6 = r6.mo36533a(r1)     // Catch: java.lang.Throwable -> Lb5
                throw r6     // Catch: java.lang.Throwable -> Lb5
            Lad:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f40025g     // Catch: java.lang.Throwable -> Lb5
                r0.remove(r6)     // Catch: java.lang.Throwable -> Lb5
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> Lb5
                throw r1     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r6 = move-exception
                kotlin.f0.y.e.j0.k.f r0 = r5.f40024f
                kotlin.f0.y.e.j0.k.k r0 = r0.f40009c
                r0.unlock()
                goto Lbf
            Lbe:
                throw r6
            Lbf:
                goto Lbe
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$m */
    private static class m<K, V> extends l<K, V> implements InterfaceC10323g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C10322f c10322f, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(c10322f, concurrentMap, function1);
            if (c10322f == null) {
                m36546c(0);
            }
            if (concurrentMap == null) {
                m36546c(1);
            }
            if (function1 == null) {
                m36546c(2);
            }
        }

        /* renamed from: c */
        private static /* synthetic */ void m36546c(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 3 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.l, kotlin.jvm.functions.Function1
        public V invoke(K k2) {
            V v = (V) super.invoke(k2);
            if (v == null) {
                m36546c(3);
            }
            return v;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$n */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$o */
    private static class o<T> {

        /* renamed from: a */
        private final T f40031a;

        /* renamed from: b */
        private final boolean f40032b;

        private o(T t, boolean z) {
            this.f40031a = t;
            this.f40032b = z;
        }

        /* renamed from: a */
        public static <T> o<T> m36547a() {
            return new o<>(null, true);
        }

        /* renamed from: d */
        public static <T> o<T> m36548d(T t) {
            return new o<>(t, false);
        }

        /* renamed from: b */
        public T m36549b() {
            return this.f40031a;
        }

        /* renamed from: c */
        public boolean m36550c() {
            return this.f40032b;
        }

        public String toString() {
            return m36550c() ? "FALL_THROUGH" : String.valueOf(this.f40031a);
        }
    }

    /* synthetic */ C10322f(String str, f fVar, InterfaceC10327k interfaceC10327k, a aVar) {
        this(str, fVar, interfaceC10327k);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m36508j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p414k.C10322f.m36508j(int):void");
    }

    /* renamed from: m */
    private static <K> ConcurrentMap<K, Object> m36511m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <T extends Throwable> T m36512q(T t) {
        if (t == null) {
            m36508j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (!stackTrace[i3].getClassName().startsWith(f40007a)) {
                i2 = i3;
                break;
            }
            i3++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i2, length);
        t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: a */
    public <K, V> InterfaceC10318b<K, V> mo36513a() {
        return new e(this, m36511m(), null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: b */
    public <K, V> InterfaceC10317a<K, V> mo36514b() {
        return new d(this, m36511m(), null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: c */
    public <T> InterfaceC10325i<T> mo36515c(Function0<? extends T> function0, T t) {
        if (function0 == null) {
            m36508j(26);
        }
        if (t == null) {
            m36508j(27);
        }
        return new b(this, function0, t);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: d */
    public <T> InterfaceC10325i<T> mo36516d(Function0<? extends T> function0) {
        if (function0 == null) {
            m36508j(23);
        }
        return new j(this, function0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: e */
    public <T> T mo36517e(Function0<? extends T> function0) {
        if (function0 == null) {
            m36508j(34);
        }
        this.f40009c.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: f */
    public <T> InterfaceC10326j<T> mo36518f(Function0<? extends T> function0) {
        if (function0 == null) {
            m36508j(30);
        }
        return new h(this, function0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: g */
    public <T> InterfaceC10325i<T> mo36519g(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, C10775u> function12) {
        if (function0 == null) {
            m36508j(28);
        }
        if (function12 == null) {
            m36508j(29);
        }
        return new c(this, function0, function1, function12);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: h */
    public <K, V> InterfaceC10323g<K, V> mo36520h(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m36508j(9);
        }
        InterfaceC10323g<K, V> interfaceC10323gM36522n = m36522n(function1, m36511m());
        if (interfaceC10323gM36522n == null) {
            m36508j(10);
        }
        return interfaceC10323gM36522n;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n
    /* renamed from: i */
    public <K, V> InterfaceC10324h<K, V> mo36521i(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m36508j(19);
        }
        InterfaceC10324h<K, V> interfaceC10324hM36523o = m36523o(function1, m36511m());
        if (interfaceC10324hM36523o == null) {
            m36508j(20);
        }
        return interfaceC10324hM36523o;
    }

    /* renamed from: n */
    public <K, V> InterfaceC10323g<K, V> m36522n(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m36508j(14);
        }
        if (concurrentMap == null) {
            m36508j(15);
        }
        return new m(this, concurrentMap, function1);
    }

    /* renamed from: o */
    public <K, V> InterfaceC10324h<K, V> m36523o(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m36508j(21);
        }
        if (concurrentMap == null) {
            m36508j(22);
        }
        return new l(this, concurrentMap, function1);
    }

    /* renamed from: p */
    protected <K, V> o<V> mo36524p(String str, K k2) {
        String str2;
        if (str == null) {
            m36508j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = "on input: " + k2;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m36512q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f40011e + ")";
    }

    private C10322f(String str, f fVar, InterfaceC10327k interfaceC10327k) {
        if (str == null) {
            m36508j(4);
        }
        if (fVar == null) {
            m36508j(5);
        }
        if (interfaceC10327k == null) {
            m36508j(6);
        }
        this.f40009c = interfaceC10327k;
        this.f40010d = fVar;
        this.f40011e = str;
    }

    public C10322f(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, C10775u>) null);
    }

    public C10322f(String str, Runnable runnable, Function1<InterruptedException, C10775u> function1) {
        this(str, f.f40017a, InterfaceC10327k.f40033a.m36552a(runnable, function1));
    }
}
