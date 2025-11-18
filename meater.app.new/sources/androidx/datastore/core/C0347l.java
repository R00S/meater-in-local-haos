package androidx.datastore.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C10550i;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Lazy;
import kotlin.collections.C10782c0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10857b;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9782c0;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11068y;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C11078d;
import kotlinx.coroutines.flow.C11089o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: SingleProcessDataStore.kt */
/* renamed from: androidx.datastore.core.l */
/* loaded from: classes.dex */
public final class C0347l<T> implements InterfaceC0340e<T> {

    /* renamed from: a */
    public static final a f2557a = new a(null);

    /* renamed from: b */
    private static final Set<String> f2558b = new LinkedHashSet();

    /* renamed from: c */
    private static final Object f2559c = new Object();

    /* renamed from: d */
    private final Function0<File> f2560d;

    /* renamed from: e */
    private final InterfaceC0345j<T> f2561e;

    /* renamed from: f */
    private final InterfaceC0336a<T> f2562f;

    /* renamed from: g */
    private final CoroutineScope f2563g;

    /* renamed from: h */
    private final Flow<T> f2564h;

    /* renamed from: i */
    private final String f2565i;

    /* renamed from: j */
    private final Lazy f2566j;

    /* renamed from: k */
    private final MutableStateFlow<AbstractC0348m<T>> f2567k;

    /* renamed from: l */
    private List<? extends Function2<? super InterfaceC0343h<T>, ? super Continuation<? super C10775u>, ? extends Object>> f2568l;

    /* renamed from: m */
    private final C0346k<b<T>> f2569m;

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final Set<String> m2397a() {
            return C0347l.f2558b;
        }

        /* renamed from: b */
        public final Object m2398b() {
            return C0347l.f2559c;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$b */
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        /* renamed from: androidx.datastore.core.l$b$a */
        public static final class a<T> extends b<T> {

            /* renamed from: a */
            private final AbstractC0348m<T> f2570a;

            public a(AbstractC0348m<T> abstractC0348m) {
                super(null);
                this.f2570a = abstractC0348m;
            }

            /* renamed from: a */
            public AbstractC0348m<T> m2399a() {
                return this.f2570a;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        /* renamed from: androidx.datastore.core.l$b$b, reason: collision with other inner class name */
        public static final class C11436b<T> extends b<T> {

            /* renamed from: a */
            private final Function2<T, Continuation<? super T>, Object> f2571a;

            /* renamed from: b */
            private final CompletableDeferred<T> f2572b;

            /* renamed from: c */
            private final AbstractC0348m<T> f2573c;

            /* renamed from: d */
            private final CoroutineContext f2574d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11436b(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CompletableDeferred<T> completableDeferred, AbstractC0348m<T> abstractC0348m, CoroutineContext coroutineContext) {
                super(null);
                C9801m.m32346f(function2, "transform");
                C9801m.m32346f(completableDeferred, "ack");
                C9801m.m32346f(coroutineContext, "callerContext");
                this.f2571a = function2;
                this.f2572b = completableDeferred;
                this.f2573c = abstractC0348m;
                this.f2574d = coroutineContext;
            }

            /* renamed from: a */
            public final CompletableDeferred<T> m2400a() {
                return this.f2572b;
            }

            /* renamed from: b */
            public final CoroutineContext m2401b() {
                return this.f2574d;
            }

            /* renamed from: c */
            public AbstractC0348m<T> m2402c() {
                return this.f2573c;
            }

            /* renamed from: d */
            public final Function2<T, Continuation<? super T>, Object> m2403d() {
                return this.f2571a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$c */
    private static final class c extends OutputStream {

        /* renamed from: f */
        private final FileOutputStream f2575f;

        public c(FileOutputStream fileOutputStream) {
            C9801m.m32346f(fileOutputStream, "fileOutputStream");
            this.f2575f = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f2575f.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f2575f.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            C9801m.m32346f(bArr, "b");
            this.f2575f.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            C9801m.m32346f(bArr, "bytes");
            this.f2575f.write(bArr, i2, i3);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$d */
    static final class d extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: f */
        final /* synthetic */ C0347l<T> f2576f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C0347l<T> c0347l) {
            super(1);
            this.f2576f = c0347l;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                ((C0347l) this.f2576f).f2567k.setValue(new C0342g(th));
            }
            a aVar = C0347l.f2557a;
            Object objM2398b = aVar.m2398b();
            C0347l<T> c0347l = this.f2576f;
            synchronized (objM2398b) {
                aVar.m2397a().remove(c0347l.m2387r().getAbsolutePath());
                C10775u c10775u = C10775u.f41439a;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$e */
    static final class e extends Lambda implements Function2<b<T>, Throwable, C10775u> {

        /* renamed from: f */
        public static final e f2577f = new e();

        e() {
            super(2);
        }

        /* renamed from: b */
        public final void m2404b(b<T> bVar, Throwable th) {
            C9801m.m32346f(bVar, "msg");
            if (bVar instanceof b.C11436b) {
                CompletableDeferred<T> completableDeferredM2400a = ((b.C11436b) bVar).m2400a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                completableDeferredM2400a.mo39702A(th);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C10775u invoke(Object obj, Throwable th) {
            m2404b((b) obj, th);
            return C10775u.f41439a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m39050f = "SingleProcessDataStore.kt", m39051l = {239, 242}, m39052m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.l$f */
    static final class f extends SuspendLambda implements Function2<b<T>, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f2578f;

        /* renamed from: g */
        /* synthetic */ Object f2579g;

        /* renamed from: h */
        final /* synthetic */ C0347l<T> f2580h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C0347l<T> c0347l, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f2580h = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f2580h, continuation);
            fVar.f2579g = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<T> bVar, Continuation<? super C10775u> continuation) {
            return ((f) create(bVar, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f2578f;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                b bVar = (b) this.f2579g;
                if (bVar instanceof b.a) {
                    this.f2578f = 1;
                    if (this.f2580h.m2388s((b.a) bVar, this) == objM39045c) {
                        return objM39045c;
                    }
                } else if (bVar instanceof b.C11436b) {
                    this.f2578f = 2;
                    if (this.f2580h.m2389t((b.C11436b) bVar, this) == objM39045c) {
                        return objM39045c;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return C10775u.f41439a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore$data$1", m39050f = "SingleProcessDataStore.kt", m39051l = {117}, m39052m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.l$g */
    static final class g extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f2581f;

        /* renamed from: g */
        private /* synthetic */ Object f2582g;

        /* renamed from: h */
        final /* synthetic */ C0347l<T> f2583h;

        /* compiled from: SingleProcessDataStore.kt */
        @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m39050f = "SingleProcessDataStore.kt", m39051l = {}, m39052m = "invokeSuspend")
        /* renamed from: androidx.datastore.core.l$g$a */
        static final class a extends SuspendLambda implements Function2<AbstractC0348m<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: f */
            int f2584f;

            /* renamed from: g */
            /* synthetic */ Object f2585g;

            /* renamed from: h */
            final /* synthetic */ AbstractC0348m<T> f2586h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC0348m<T> abstractC0348m, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f2586h = abstractC0348m;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f2586h, continuation);
                aVar.f2585g = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC0348m<T> abstractC0348m, Continuation<? super Boolean> continuation) {
                return ((a) create(abstractC0348m, continuation)).invokeSuspend(C10775u.f41439a);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C10855d.m39045c();
                if (this.f2584f != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
                AbstractC0348m<T> abstractC0348m = (AbstractC0348m) this.f2585g;
                AbstractC0348m<T> abstractC0348m2 = this.f2586h;
                boolean z = false;
                if (!(abstractC0348m2 instanceof C0337b) && !(abstractC0348m2 instanceof C0342g) && abstractC0348m == abstractC0348m2) {
                    z = true;
                }
                return C10857b.m39046a(z);
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* renamed from: androidx.datastore.core.l$g$b */
        public static final class b implements Flow<T> {

            /* renamed from: f */
            final /* synthetic */ Flow f2587f;

            /* compiled from: Collect.kt */
            /* renamed from: androidx.datastore.core.l$g$b$a */
            public static final class a implements FlowCollector<AbstractC0348m<T>> {

                /* renamed from: f */
                final /* synthetic */ FlowCollector f2588f;

                @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m39050f = "SingleProcessDataStore.kt", m39051l = {137}, m39052m = "emit")
                /* renamed from: androidx.datastore.core.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C11437a extends ContinuationImpl {

                    /* renamed from: f */
                    /* synthetic */ Object f2589f;

                    /* renamed from: g */
                    int f2590g;

                    public C11437a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f2589f = obj;
                        this.f2590g |= Integer.MIN_VALUE;
                        return a.this.mo2409c(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.f2588f = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: c */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object mo2409c(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.datastore.core.C0347l.g.b.a.C11437a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.datastore.core.l$g$b$a$a r0 = (androidx.datastore.core.C0347l.g.b.a.C11437a) r0
                        int r1 = r0.f2590g
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f2590g = r1
                        goto L18
                    L13:
                        androidx.datastore.core.l$g$b$a$a r0 = new androidx.datastore.core.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f2589f
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                        int r2 = r0.f2590g
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C10568o.m37655b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C10568o.m37655b(r6)
                        kotlinx.coroutines.z2.c r6 = r4.f2588f
                        androidx.datastore.core.m r5 = (androidx.datastore.core.AbstractC0348m) r5
                        boolean r2 = r5 instanceof androidx.datastore.core.C0344i
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof androidx.datastore.core.C0342g
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof androidx.datastore.core.C0337b
                        if (r2 == 0) goto L56
                        androidx.datastore.core.b r5 = (androidx.datastore.core.C0337b) r5
                        java.lang.Object r5 = r5.m2348b()
                        r0.f2590g = r3
                        java.lang.Object r5 = r6.mo2409c(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        kotlin.u r5 = kotlin.C10775u.f41439a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof androidx.datastore.core.C0349n
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L6c:
                        androidx.datastore.core.g r5 = (androidx.datastore.core.C0342g) r5
                        java.lang.Throwable r5 = r5.m2361a()
                        throw r5
                    L73:
                        androidx.datastore.core.i r5 = (androidx.datastore.core.C0344i) r5
                        java.lang.Throwable r5 = r5.m2363a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.g.b.a.mo2409c(java.lang.Object, kotlin.y.d):java.lang.Object");
                }
            }

            public b(Flow flow) {
                this.f2587f = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            /* renamed from: a */
            public Object mo2408a(FlowCollector flowCollector, Continuation continuation) {
                Object objMo2408a = this.f2587f.mo2408a(new a(flowCollector), continuation);
                return objMo2408a == C10855d.m39045c() ? objMo2408a : C10775u.f41439a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C0347l<T> c0347l, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f2583h = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f2583h, continuation);
            gVar.f2582g = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super C10775u> continuation) {
            return ((g) create(flowCollector, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f2581f;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f2582g;
                AbstractC0348m abstractC0348m = (AbstractC0348m) ((C0347l) this.f2583h).f2567k.getValue();
                if (!(abstractC0348m instanceof C0337b)) {
                    ((C0347l) this.f2583h).f2569m.m2371e(new b.a(abstractC0348m));
                }
                b bVar = new b(C11078d.m39721c(((C0347l) this.f2583h).f2567k, new a(abstractC0348m, null)));
                this.f2581f = 1;
                if (C11078d.m39722d(flowCollector, bVar, this) == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return C10775u.f41439a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$h */
    static final class h extends Lambda implements Function0<File> {

        /* renamed from: f */
        final /* synthetic */ C0347l<T> f2592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C0347l<T> c0347l) {
            super(0);
            this.f2592f = c0347l;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((C0347l) this.f2592f).f2560d.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = C0347l.f2557a;
            synchronized (aVar.m2398b()) {
                if (!(!aVar.m2397a().contains(absolutePath))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> setM2397a = aVar.m2397a();
                C9801m.m32345e(absolutePath, "it");
                setM2397a.add(absolutePath);
            }
            return file;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {276, 281, 284}, m39052m = "handleUpdate")
    /* renamed from: androidx.datastore.core.l$i */
    static final class i extends ContinuationImpl {

        /* renamed from: f */
        Object f2593f;

        /* renamed from: g */
        Object f2594g;

        /* renamed from: h */
        Object f2595h;

        /* renamed from: i */
        /* synthetic */ Object f2596i;

        /* renamed from: j */
        final /* synthetic */ C0347l<T> f2597j;

        /* renamed from: k */
        int f2598k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C0347l<T> c0347l, Continuation<? super i> continuation) {
            super(continuation);
            this.f2597j = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2596i = obj;
            this.f2598k |= Integer.MIN_VALUE;
            return this.f2597j.m2389t(null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {322, 348, 505}, m39052m = "readAndInit")
    /* renamed from: androidx.datastore.core.l$j */
    static final class j extends ContinuationImpl {

        /* renamed from: f */
        Object f2599f;

        /* renamed from: g */
        Object f2600g;

        /* renamed from: h */
        Object f2601h;

        /* renamed from: i */
        Object f2602i;

        /* renamed from: j */
        Object f2603j;

        /* renamed from: k */
        Object f2604k;

        /* renamed from: l */
        /* synthetic */ Object f2605l;

        /* renamed from: m */
        final /* synthetic */ C0347l<T> f2606m;

        /* renamed from: n */
        int f2607n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C0347l<T> c0347l, Continuation<? super j> continuation) {
            super(continuation);
            this.f2606m = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2605l = obj;
            this.f2607n |= Integer.MIN_VALUE;
            return this.f2606m.m2390u(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* renamed from: androidx.datastore.core.l$k */
    public static final class k implements InterfaceC0343h<T> {

        /* renamed from: a */
        final /* synthetic */ Mutex f2608a;

        /* renamed from: b */
        final /* synthetic */ C9782c0 f2609b;

        /* renamed from: c */
        final /* synthetic */ C9788f0<T> f2610c;

        /* renamed from: d */
        final /* synthetic */ C0347l<T> f2611d;

        /* compiled from: SingleProcessDataStore.kt */
        @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", m39050f = "SingleProcessDataStore.kt", m39051l = {503, 337, 339}, m39052m = "updateData")
        /* renamed from: androidx.datastore.core.l$k$a */
        static final class a extends ContinuationImpl {

            /* renamed from: f */
            Object f2612f;

            /* renamed from: g */
            Object f2613g;

            /* renamed from: h */
            Object f2614h;

            /* renamed from: i */
            Object f2615i;

            /* renamed from: j */
            Object f2616j;

            /* renamed from: k */
            /* synthetic */ Object f2617k;

            /* renamed from: m */
            int f2619m;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f2617k = obj;
                this.f2619m |= Integer.MIN_VALUE;
                return k.this.mo2362a(null, this);
            }
        }

        k(Mutex mutex, C9782c0 c9782c0, C9788f0<T> c9788f0, C0347l<T> c0347l) {
            this.f2608a = mutex;
            this.f2609b = c9782c0;
            this.f2610c = c9788f0;
            this.f2611d = c0347l;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.InterfaceC0343h
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo2362a(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r11, kotlin.coroutines.Continuation<? super T> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.k.mo2362a(kotlin.a0.c.p, kotlin.y.d):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {302}, m39052m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: androidx.datastore.core.l$l */
    static final class l extends ContinuationImpl {

        /* renamed from: f */
        Object f2620f;

        /* renamed from: g */
        /* synthetic */ Object f2621g;

        /* renamed from: h */
        final /* synthetic */ C0347l<T> f2622h;

        /* renamed from: i */
        int f2623i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C0347l<T> c0347l, Continuation<? super l> continuation) {
            super(continuation);
            this.f2622h = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2621g = obj;
            this.f2623i |= Integer.MIN_VALUE;
            return this.f2622h.m2391v(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {311}, m39052m = "readAndInitOrPropagateFailure")
    /* renamed from: androidx.datastore.core.l$m */
    static final class m extends ContinuationImpl {

        /* renamed from: f */
        Object f2624f;

        /* renamed from: g */
        /* synthetic */ Object f2625g;

        /* renamed from: h */
        final /* synthetic */ C0347l<T> f2626h;

        /* renamed from: i */
        int f2627i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C0347l<T> c0347l, Continuation<? super m> continuation) {
            super(continuation);
            this.f2626h = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2625g = obj;
            this.f2627i |= Integer.MIN_VALUE;
            return this.f2626h.m2392w(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {381}, m39052m = "readData")
    /* renamed from: androidx.datastore.core.l$n */
    static final class n extends ContinuationImpl {

        /* renamed from: f */
        Object f2628f;

        /* renamed from: g */
        Object f2629g;

        /* renamed from: h */
        Object f2630h;

        /* renamed from: i */
        /* synthetic */ Object f2631i;

        /* renamed from: j */
        final /* synthetic */ C0347l<T> f2632j;

        /* renamed from: k */
        int f2633k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C0347l<T> c0347l, Continuation<? super n> continuation) {
            super(continuation);
            this.f2632j = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2631i = obj;
            this.f2633k |= Integer.MIN_VALUE;
            return this.f2632j.m2393x(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {359, 362, 365}, m39052m = "readDataOrHandleCorruption")
    /* renamed from: androidx.datastore.core.l$o */
    static final class o extends ContinuationImpl {

        /* renamed from: f */
        Object f2634f;

        /* renamed from: g */
        Object f2635g;

        /* renamed from: h */
        /* synthetic */ Object f2636h;

        /* renamed from: i */
        final /* synthetic */ C0347l<T> f2637i;

        /* renamed from: j */
        int f2638j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C0347l<T> c0347l, Continuation<? super o> continuation) {
            super(continuation);
            this.f2637i = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2636h = obj;
            this.f2638j |= Integer.MIN_VALUE;
            return this.f2637i.m2394y(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {402, 410}, m39052m = "transformAndWrite")
    /* renamed from: androidx.datastore.core.l$p */
    static final class p extends ContinuationImpl {

        /* renamed from: f */
        Object f2639f;

        /* renamed from: g */
        Object f2640g;

        /* renamed from: h */
        Object f2641h;

        /* renamed from: i */
        /* synthetic */ Object f2642i;

        /* renamed from: j */
        final /* synthetic */ C0347l<T> f2643j;

        /* renamed from: k */
        int f2644k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C0347l<T> c0347l, Continuation<? super p> continuation) {
            super(continuation);
            this.f2643j = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2642i = obj;
            this.f2644k |= Integer.MIN_VALUE;
            return this.f2643j.m2395z(null, null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m39050f = "SingleProcessDataStore.kt", m39051l = {402}, m39052m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.l$q */
    static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

        /* renamed from: f */
        int f2645f;

        /* renamed from: g */
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> f2646g;

        /* renamed from: h */
        final /* synthetic */ T f2647h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, T t, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f2646g = function2;
            this.f2647h = t;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return new q(this.f2646g, this.f2647h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f2645f;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                Function2<T, Continuation<? super T>, Object> function2 = this.f2646g;
                T t = this.f2647h;
                this.f2645f = 1;
                obj = function2.invoke(t, this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return obj;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SingleProcessDataStore", m39050f = "SingleProcessDataStore.kt", m39051l = {426}, m39052m = "writeData$datastore_core")
    /* renamed from: androidx.datastore.core.l$r */
    static final class r extends ContinuationImpl {

        /* renamed from: f */
        Object f2648f;

        /* renamed from: g */
        Object f2649g;

        /* renamed from: h */
        Object f2650h;

        /* renamed from: i */
        Object f2651i;

        /* renamed from: j */
        Object f2652j;

        /* renamed from: k */
        /* synthetic */ Object f2653k;

        /* renamed from: l */
        final /* synthetic */ C0347l<T> f2654l;

        /* renamed from: m */
        int f2655m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(C0347l<T> c0347l, Continuation<? super r> continuation) {
            super(continuation);
            this.f2654l = c0347l;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2653k = obj;
            this.f2655m |= Integer.MIN_VALUE;
            return this.f2654l.m2396A(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0347l(Function0<? extends File> function0, InterfaceC0345j<T> interfaceC0345j, List<? extends Function2<? super InterfaceC0343h<T>, ? super Continuation<? super C10775u>, ? extends Object>> list, InterfaceC0336a<T> interfaceC0336a, CoroutineScope coroutineScope) {
        C9801m.m32346f(function0, "produceFile");
        C9801m.m32346f(interfaceC0345j, "serializer");
        C9801m.m32346f(list, "initTasksList");
        C9801m.m32346f(interfaceC0336a, "corruptionHandler");
        C9801m.m32346f(coroutineScope, "scope");
        this.f2560d = function0;
        this.f2561e = interfaceC0345j;
        this.f2562f = interfaceC0336a;
        this.f2563g = coroutineScope;
        this.f2564h = C11078d.m39725g(new g(this, null));
        this.f2565i = ".tmp";
        this.f2566j = C10550i.m37594b(new h(this));
        this.f2567k = C11089o.m39738a(C0349n.f2656a);
        this.f2568l = C10782c0.m38569E0(list);
        this.f2569m = new C0346k<>(coroutineScope, new d(this), e.f2577f, new f(this, null));
    }

    /* renamed from: q */
    private final void m2386q(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(C9801m.m32354n("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final File m2387r() {
        return (File) this.f2566j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final Object m2388s(b.a<T> aVar, Continuation<? super C10775u> continuation) throws Throwable {
        AbstractC0348m<T> value = this.f2567k.getValue();
        if (!(value instanceof C0337b)) {
            if (value instanceof C0344i) {
                if (value == aVar.m2399a()) {
                    Object objM2392w = m2392w(continuation);
                    return objM2392w == C10855d.m39045c() ? objM2392w : C10775u.f41439a;
                }
            } else {
                if (C9801m.m32341a(value, C0349n.f2656a)) {
                    Object objM2392w2 = m2392w(continuation);
                    return objM2392w2 == C10855d.m39045c() ? objM2392w2 : C10775u.f41439a;
                }
                if (value instanceof C0342g) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return C10775u.f41439a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.l, androidx.datastore.core.l<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2389t(androidx.datastore.core.C0347l.b.C11436b<T> r9, kotlin.coroutines.Continuation<? super kotlin.C10775u> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2389t(androidx.datastore.core.l$b$b, kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2390u(kotlin.coroutines.Continuation<? super kotlin.C10775u> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2390u(kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2391v(kotlin.coroutines.Continuation<? super kotlin.C10775u> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.C0347l.l
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.l$l r0 = (androidx.datastore.core.C0347l.l) r0
            int r1 = r0.f2623i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2623i = r1
            goto L18
        L13:
            androidx.datastore.core.l$l r0 = new androidx.datastore.core.l$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2621g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f2623i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f2620f
            androidx.datastore.core.l r0 = (androidx.datastore.core.C0347l) r0
            kotlin.C10568o.m37655b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C10568o.m37655b(r5)
            r0.f2620f = r4     // Catch: java.lang.Throwable -> L48
            r0.f2623i = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.m2390u(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.u r5 = kotlin.C10775u.f41439a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            kotlinx.coroutines.z2.k<androidx.datastore.core.m<T>> r0 = r0.f2567k
            androidx.datastore.core.i r1 = new androidx.datastore.core.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2391v(kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2392w(kotlin.coroutines.Continuation<? super kotlin.C10775u> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.C0347l.m
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.l$m r0 = (androidx.datastore.core.C0347l.m) r0
            int r1 = r0.f2627i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2627i = r1
            goto L18
        L13:
            androidx.datastore.core.l$m r0 = new androidx.datastore.core.l$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2625g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f2627i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f2624f
            androidx.datastore.core.l r0 = (androidx.datastore.core.C0347l) r0
            kotlin.C10568o.m37655b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C10568o.m37655b(r5)
            r0.f2624f = r4     // Catch: java.lang.Throwable -> L45
            r0.f2627i = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.m2390u(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            kotlinx.coroutines.z2.k<androidx.datastore.core.m<T>> r0 = r0.f2567k
            androidx.datastore.core.i r1 = new androidx.datastore.core.i
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            kotlin.u r5 = kotlin.C10775u.f41439a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2392w(kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.l] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.l$n, kotlin.y.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.datastore.core.j, androidx.datastore.core.j<T>] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2393x(kotlin.coroutines.Continuation<? super T> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.C0347l.n
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.l$n r0 = (androidx.datastore.core.C0347l.n) r0
            int r1 = r0.f2633k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2633k = r1
            goto L18
        L13:
            androidx.datastore.core.l$n r0 = new androidx.datastore.core.l$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2631i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f2633k
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2630h
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f2629g
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f2628f
            androidx.datastore.core.l r0 = (androidx.datastore.core.C0347l) r0
            kotlin.C10568o.m37655b(r6)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L68
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            kotlin.C10568o.m37655b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6e
            java.io.File r6 = r5.m2387r()     // Catch: java.io.FileNotFoundException -> L6e
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6e
            r6 = 0
            androidx.datastore.core.j<T> r4 = r5.f2561e     // Catch: java.lang.Throwable -> L66
            r0.f2628f = r5     // Catch: java.lang.Throwable -> L66
            r0.f2629g = r2     // Catch: java.lang.Throwable -> L66
            r0.f2630h = r6     // Catch: java.lang.Throwable -> L66
            r0.f2633k = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r4.mo2366c(r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r0
            r0 = r5
        L60:
            kotlin.p429io.C10556a.m37638a(r2, r1)     // Catch: java.io.FileNotFoundException -> L64
            return r6
        L64:
            r6 = move-exception
            goto L70
        L66:
            r6 = move-exception
            r0 = r5
        L68:
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            kotlin.p429io.C10556a.m37638a(r2, r6)     // Catch: java.io.FileNotFoundException -> L64
            throw r1     // Catch: java.io.FileNotFoundException -> L64
        L6e:
            r6 = move-exception
            r0 = r5
        L70:
            java.io.File r1 = r0.m2387r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L81
            androidx.datastore.core.j<T> r6 = r0.f2561e
            java.lang.Object r6 = r6.mo2364a()
            return r6
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2393x(kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2394y(kotlin.coroutines.Continuation<? super T> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.C0347l.o
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.l$o r0 = (androidx.datastore.core.C0347l.o) r0
            int r1 = r0.f2638j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2638j = r1
            goto L18
        L13:
            androidx.datastore.core.l$o r0 = new androidx.datastore.core.l$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2636h
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f2638j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2635g
            java.lang.Object r0 = r0.f2634f
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.C10568o.m37655b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f2635g
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f2634f
            androidx.datastore.core.l r4 = (androidx.datastore.core.C0347l) r4
            kotlin.C10568o.m37655b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f2634f
            androidx.datastore.core.l r2 = (androidx.datastore.core.C0347l) r2
            kotlin.C10568o.m37655b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            kotlin.C10568o.m37655b(r8)
            r0.f2634f = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.f2638j = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.m2393x(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            androidx.datastore.core.a<T> r5 = r2.f2562f
            r0.f2634f = r2
            r0.f2635g = r8
            r0.f2638j = r4
            java.lang.Object r4 = r5.mo2346a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f2634f = r2     // Catch: java.io.IOException -> L88
            r0.f2635g = r8     // Catch: java.io.IOException -> L88
            r0.f2638j = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.m2396A(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            kotlin.C9751a.m32273a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2394y(kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2395z(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.Continuation<? super T> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.C0347l.p
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.l$p r0 = (androidx.datastore.core.C0347l.p) r0
            int r1 = r0.f2644k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2644k = r1
            goto L18
        L13:
            androidx.datastore.core.l$p r0 = new androidx.datastore.core.l$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f2642i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f2644k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f2640g
            java.lang.Object r9 = r0.f2639f
            androidx.datastore.core.l r9 = (androidx.datastore.core.C0347l) r9
            kotlin.C10568o.m37655b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f2641h
            java.lang.Object r9 = r0.f2640g
            androidx.datastore.core.b r9 = (androidx.datastore.core.C0337b) r9
            java.lang.Object r2 = r0.f2639f
            androidx.datastore.core.l r2 = (androidx.datastore.core.C0347l) r2
            kotlin.C10568o.m37655b(r10)
            goto L73
        L49:
            kotlin.C10568o.m37655b(r10)
            kotlinx.coroutines.z2.k<androidx.datastore.core.m<T>> r10 = r7.f2567k
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.b r10 = (androidx.datastore.core.C0337b) r10
            r10.m2347a()
            java.lang.Object r2 = r10.m2348b()
            androidx.datastore.core.l$q r6 = new androidx.datastore.core.l$q
            r6.<init>(r8, r2, r3)
            r0.f2639f = r7
            r0.f2640g = r10
            r0.f2641h = r2
            r0.f2644k = r5
            java.lang.Object r8 = kotlinx.coroutines.C10961h.m39412e(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.m2347a()
            boolean r9 = kotlin.jvm.internal.C9801m.m32341a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f2639f = r2
            r0.f2640g = r10
            r0.f2641h = r3
            r0.f2644k = r4
            java.lang.Object r8 = r2.m2396A(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            kotlinx.coroutines.z2.k<androidx.datastore.core.m<T>> r9 = r9.f2567k
            androidx.datastore.core.b r10 = new androidx.datastore.core.b
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2395z(kotlin.a0.c.p, kotlin.y.g, kotlin.y.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.StringBuilder] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2396A(T r8, kotlin.coroutines.Continuation<? super kotlin.C10775u> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.C0347l.r
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.l$r r0 = (androidx.datastore.core.C0347l.r) r0
            int r1 = r0.f2655m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2655m = r1
            goto L18
        L13:
            androidx.datastore.core.l$r r0 = new androidx.datastore.core.l$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f2653k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f2655m
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f2652j
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f2651i
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f2650h
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f2649g
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f2648f
            androidx.datastore.core.l r0 = (androidx.datastore.core.C0347l) r0
            kotlin.C10568o.m37655b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lbe
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            kotlin.C10568o.m37655b(r9)
            java.io.File r9 = r7.m2387r()
            r7.m2386q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.m2387r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f2565i
            java.lang.String r2 = kotlin.jvm.internal.C9801m.m32354n(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc7
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc7
            r4 = 0
            androidx.datastore.core.j<T> r5 = r7.f2561e     // Catch: java.lang.Throwable -> Lbc
            androidx.datastore.core.l$c r6 = new androidx.datastore.core.l$c     // Catch: java.lang.Throwable -> Lbc
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r0.f2648f = r7     // Catch: java.lang.Throwable -> Lbc
            r0.f2649g = r9     // Catch: java.lang.Throwable -> Lbc
            r0.f2650h = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f2651i = r4     // Catch: java.lang.Throwable -> Lbc
            r0.f2652j = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f2655m = r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r5.mo2365b(r8, r6, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            kotlin.u r8 = kotlin.C10775u.f41439a     // Catch: java.lang.Throwable -> L3d
            kotlin.p429io.C10556a.m37638a(r2, r1)     // Catch: java.io.IOException -> Lc4
            java.io.File r9 = r0.m2387r()     // Catch: java.io.IOException -> Lc4
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lc4
            if (r9 == 0) goto La0
            return r8
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lc4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc4
            r9.<init>()     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            r9.append(r3)     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lc4
            r8.<init>(r9)     // Catch: java.io.IOException -> Lc4
            throw r8     // Catch: java.io.IOException -> Lc4
        Lbc:
            r8 = move-exception
            r3 = r9
        Lbe:
            throw r8     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r9 = move-exception
            kotlin.p429io.C10556a.m37638a(r2, r8)     // Catch: java.io.IOException -> Lc4
            throw r9     // Catch: java.io.IOException -> Lc4
        Lc4:
            r8 = move-exception
            r9 = r3
            goto Lc8
        Lc7:
            r8 = move-exception
        Lc8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld1
            r9.delete()
        Ld1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0347l.m2396A(java.lang.Object, kotlin.y.d):java.lang.Object");
    }

    @Override // androidx.datastore.core.InterfaceC0340e
    /* renamed from: a */
    public Object mo2358a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        CompletableDeferred completableDeferredM39708b = C11068y.m39708b(null, 1, null);
        this.f2569m.m2371e(new b.C11436b(function2, completableDeferredM39708b, this.f2567k.getValue(), continuation.getF41861l()));
        return completableDeferredM39708b.mo39704k(continuation);
    }

    @Override // androidx.datastore.core.InterfaceC0340e
    /* renamed from: b */
    public Flow<T> mo2359b() {
        return this.f2564h;
    }
}
