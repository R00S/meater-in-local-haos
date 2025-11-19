package Gb;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import oa.C4153F;

/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes3.dex */
public class f implements Gb.n {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4997d = Ub.n.S0(f.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final Gb.n f4998e = new a("NO_LOCKS", InterfaceC0094f.f5007a, Gb.e.f4996b);

    /* renamed from: a, reason: collision with root package name */
    protected final Gb.k f4999a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0094f f5000b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5001c;

    /* compiled from: LockBasedStorageManager.java */
    static class a extends f {
        a(String str, InterfaceC0094f interfaceC0094f, Gb.k kVar) {
            super(str, interfaceC0094f, kVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Gb.f
        protected <K, V> o<V> p(String str, K k10) {
            if (str == null) {
                j(0);
            }
            o<V> oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    class b<T> extends j<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f5002E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, Ba.a aVar, Object obj) {
            super(fVar, aVar);
            this.f5002E = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // Gb.f.h
        protected o<T> c(boolean z10) {
            o<T> oVarD = o.d(this.f5002E);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    class c<T> extends k<T> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.l f5004F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ba.l f5005G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, Ba.a aVar, Ba.l lVar, Ba.l lVar2) {
            super(fVar, aVar);
            this.f5004F = lVar;
            this.f5005G = lVar2;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // Gb.f.h
        protected o<T> c(boolean z10) {
            Ba.l lVar = this.f5004F;
            if (lVar == null) {
                o<T> oVarC = super.c(z10);
                if (oVarC == null) {
                    a(0);
                }
                return oVarC;
            }
            o<T> oVarD = o.d(lVar.invoke(Boolean.valueOf(z10)));
            if (oVarD == null) {
                a(1);
            }
            return oVarD;
        }

        @Override // Gb.f.i
        protected void d(T t10) {
            if (t10 == null) {
                a(2);
            }
            this.f5005G.invoke(t10);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class d<K, V> extends e<K, V> implements Gb.a<K, V> {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Gb.f.e, Gb.a
        public V a(K k10, Ba.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v10 = (V) super.a(k10, aVar);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class e<K, V> extends l<g<K, V>, V> implements Gb.b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        class a implements Ba.l<g<K, V>, V> {
            a() {
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f5009b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V a(K k10, Ba.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k10, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: Gb.f$f, reason: collision with other inner class name */
    public interface InterfaceC0094f {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0094f f5007a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: Gb.f$f$a */
        static class a implements InterfaceC0094f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // Gb.f.InterfaceC0094f
            public RuntimeException a(Throwable th) {
                if (th == null) {
                    b(0);
                }
                throw Rb.d.b(th);
            }
        }

        RuntimeException a(Throwable th);
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f5008a;

        /* renamed from: b, reason: collision with root package name */
        private final Ba.a<? extends V> f5009b;

        public g(K k10, Ba.a<? extends V> aVar) {
            this.f5008a = k10;
            this.f5009b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f5008a.equals(((g) obj).f5008a);
        }

        public int hashCode() {
            return this.f5008a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static abstract class i<T> extends h<T> {

        /* renamed from: E, reason: collision with root package name */
        private volatile Gb.l<T> f5013E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, Ba.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f5013E = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Gb.f.h
        protected final void b(T t10) {
            this.f5013E = new Gb.l<>(t10);
            try {
                d(t10);
            } finally {
                this.f5013E = null;
            }
        }

        protected abstract void d(T t10);

        @Override // Gb.f.h, Ba.a
        public T invoke() {
            Gb.l<T> lVar = this.f5013E;
            return (lVar == null || !lVar.b()) ? (T) super.invoke() : lVar.a();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class j<T> extends h<T> implements Gb.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, Ba.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Gb.f.h, Ba.a
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static abstract class k<T> extends i<T> implements Gb.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, Ba.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Gb.f.i, Gb.f.h, Ba.a
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class l<K, V> implements Gb.h<K, V> {

        /* renamed from: B, reason: collision with root package name */
        private final f f5014B;

        /* renamed from: C, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f5015C;

        /* renamed from: D, reason: collision with root package name */
        private final Ba.l<? super K, ? extends V> f5016D;

        public l(f fVar, ConcurrentMap<K, Object> concurrentMap, Ba.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f5014B = fVar;
            this.f5015C = concurrentMap;
            this.f5016D = lVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError c(K k10, Object obj) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k10 + " under " + this.f5014B));
        }

        private AssertionError d(K k10, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f5014B));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError j(K k10, Throwable th) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + k10 + " under " + this.f5014B, th));
        }

        protected o<V> i(K k10, boolean z10) {
            o<V> oVarP = this.f5014B.p("", k10);
            if (oVarP == null) {
                b(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // Ba.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V invoke(K r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f5015C
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                Gb.f$n r1 = Gb.f.n.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)
                return r6
            L11:
                Gb.f r0 = r5.f5014B
                Gb.k r0 = r0.f4999a
                r0.lock()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f5015C     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
                Gb.f$n r1 = Gb.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 != r1) goto L3e
                Gb.f$n r0 = Gb.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                r2 = 1
                Gb.f$o r2 = r5.i(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L3e
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
            L33:
                Gb.f r0 = r5.f5014B
                Gb.k r0 = r0.f4999a
                r0.unlock()
                return r6
            L3b:
                r6 = move-exception
                goto Ld3
            L3e:
                Gb.f$n r2 = Gb.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                if (r0 != r2) goto L52
                r2 = 0
                Gb.f$o r2 = r5.i(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L52
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
                goto L33
            L52:
                if (r0 == 0) goto L59
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)     // Catch: java.lang.Throwable -> L3b
                goto L33
            L59:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r5.f5015C     // Catch: java.lang.Throwable -> L7e
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
                Ba.l<? super K, ? extends V> r2 = r5.f5016D     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3 = r5.f5015C     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7e
                if (r3 != r1) goto L79
                Gb.f r6 = r5.f5014B
                Gb.k r6 = r6.f4999a
                r6.unlock()
                return r2
            L79:
                java.lang.AssertionError r0 = r5.d(r6, r3)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                boolean r2 = Rb.d.a(r1)     // Catch: java.lang.Throwable -> L3b
                if (r2 == 0) goto L9d
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f5015C     // Catch: java.lang.Throwable -> L97
                java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L97
                Gb.f$n r2 = Gb.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto L94
                java.lang.AssertionError r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L94:
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L3b
            L97:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.j(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L9d:
                if (r1 == r0) goto Lbd
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f5015C     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r1)     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> L3b
                Gb.f$n r2 = Gb.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto Lb2
                java.lang.AssertionError r6 = r5.d(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lb2:
                Gb.f r6 = r5.f5014B     // Catch: java.lang.Throwable -> L3b
                Gb.f$f r6 = Gb.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lbd:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f5015C     // Catch: java.lang.Throwable -> Lcd
                r0.remove(r6)     // Catch: java.lang.Throwable -> Lcd
                Gb.f r6 = r5.f5014B     // Catch: java.lang.Throwable -> L3b
                Gb.f$f r6 = Gb.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lcd:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.j(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Ld3:
                Gb.f r0 = r5.f5014B
                Gb.k r0 = r0.f4999a
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Gb.f.l.invoke(java.lang.Object):java.lang.Object");
        }

        @Override // Gb.h
        public boolean l(K k10) {
            Object obj = this.f5015C.get(k10);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class m<K, V> extends l<K, V> implements Gb.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap<K, Object> concurrentMap, Ba.l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Gb.f.l, Ba.l
        public V invoke(K k10) {
            V v10 = (V) super.invoke(k10);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f5021a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5022b;

        private o(T t10, boolean z10) {
            this.f5021a = t10;
            this.f5022b = z10;
        }

        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        public static <T> o<T> d(T t10) {
            return new o<>(t10, false);
        }

        public T b() {
            return this.f5021a;
        }

        public boolean c() {
            return this.f5022b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f5021a);
        }
    }

    /* synthetic */ f(String str, InterfaceC0094f interfaceC0094f, Gb.k kVar, a aVar) {
        this(str, interfaceC0094f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Gb.f.j(int):void");
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T q(T t10) {
        if (t10 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f4997d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        t10.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t10;
    }

    @Override // Gb.n
    public <K, V> Gb.b<K, V> a() {
        return new e(this, m(), null);
    }

    @Override // Gb.n
    public <T> Gb.i<T> b(Ba.a<? extends T> aVar, Ba.l<? super Boolean, ? extends T> lVar, Ba.l<? super T, C4153F> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // Gb.n
    public <T> T c(Ba.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f4999a.lock();
        try {
            return aVar.invoke();
        } finally {
        }
    }

    @Override // Gb.n
    public <K, V> Gb.a<K, V> d() {
        return new d(this, m(), null);
    }

    @Override // Gb.n
    public <K, V> Gb.h<K, V> e(Ba.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        Gb.h<K, V> hVarO = o(lVar, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    @Override // Gb.n
    public <T> Gb.i<T> f(Ba.a<? extends T> aVar, T t10) {
        if (aVar == null) {
            j(26);
        }
        if (t10 == null) {
            j(27);
        }
        return new b(this, aVar, t10);
    }

    @Override // Gb.n
    public <T> Gb.i<T> g(Ba.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // Gb.n
    public <K, V> Gb.g<K, V> h(Ba.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        Gb.g<K, V> gVarN = n(lVar, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    @Override // Gb.n
    public <T> Gb.j<T> i(Ba.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    public <K, V> Gb.g<K, V> n(Ba.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public <K, V> Gb.h<K, V> o(Ba.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    protected <K, V> o<V> p(String str, K k10) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k10 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k10;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f5001c + ")";
    }

    private f(String str, InterfaceC0094f interfaceC0094f, Gb.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0094f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f4999a = kVar;
        this.f5000b = interfaceC0094f;
        this.f5001c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (Ba.l<InterruptedException, C4153F>) null);
    }

    public f(String str, Runnable runnable, Ba.l<InterruptedException, C4153F> lVar) {
        this(str, InterfaceC0094f.f5007a, Gb.k.f5023a.a(runnable, lVar));
    }

    /* compiled from: LockBasedStorageManager.java */
    private static class h<T> implements Gb.j<T> {

        /* renamed from: B, reason: collision with root package name */
        private final f f5010B;

        /* renamed from: C, reason: collision with root package name */
        private final Ba.a<? extends T> f5011C;

        /* renamed from: D, reason: collision with root package name */
        private volatile Object f5012D;

        public h(f fVar, Ba.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f5012D = n.NOT_COMPUTED;
            this.f5010B = fVar;
            this.f5011C = aVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected o<T> c(boolean z10) {
            o<T> oVarP = this.f5010B.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        public boolean f() {
            return (this.f5012D == n.NOT_COMPUTED || this.f5012D == n.COMPUTING) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // Ba.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f5012D
                boolean r1 = r0 instanceof Gb.f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)
                return r0
            Lb:
                Gb.f r0 = r4.f5010B
                Gb.k r0 = r0.f4999a
                r0.lock()
                java.lang.Object r0 = r4.f5012D     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof Gb.f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                Gb.f r1 = r4.f5010B
                Gb.k r1 = r1.f4999a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                Gb.f$n r1 = Gb.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                Gb.f$n r2 = Gb.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f5012D = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                Gb.f$o r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                Gb.f$n r2 = Gb.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                Gb.f$o r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f5012D = r1     // Catch: java.lang.Throwable -> L24
                Ba.a<? extends T> r0 = r4.f5011C     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.b(r0)     // Catch: java.lang.Throwable -> L60
                r4.f5012D = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = Rb.d.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f5012D     // Catch: java.lang.Throwable -> L24
                Gb.f$n r2 = Gb.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f5012D = r1     // Catch: java.lang.Throwable -> L24
            L73:
                Gb.f r1 = r4.f5010B     // Catch: java.lang.Throwable -> L24
                Gb.f$f r1 = Gb.f.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                Gb.f$n r1 = Gb.f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f5012D = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                Gb.f r1 = r4.f5010B
                Gb.k r1 = r1.f4999a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Gb.f.h.invoke():java.lang.Object");
        }

        protected void b(T t10) {
        }
    }
}
