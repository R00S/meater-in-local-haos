package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C10976d0;
import okhttp3.HttpUrl;

/* compiled from: Errors.kt */
@Metadata(m32266d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ah\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\b\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\b\u0019\u001ac\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c23\b\u0002\u0010\u001d\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a}\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001d\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0!¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m32267d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", HttpUrl.FRAGMENT_ENCODE_SET, "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", "retry", "retries", HttpUrl.FRAGMENT_ENCODE_SET, "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.z2.h */
/* loaded from: classes3.dex */
final /* synthetic */ class C11082h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(m32266d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m32267d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.z2.h$a */
    public static final class a<T> implements Flow<T> {

        /* renamed from: f */
        final /* synthetic */ Flow f41908f;

        /* renamed from: g */
        final /* synthetic */ Function3 f41909g;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        @DebugMetadata(m39049c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m39050f = "Errors.kt", m39051l = {113, 114}, m39052m = "collect")
        /* renamed from: kotlinx.coroutines.z2.h$a$a, reason: collision with other inner class name */
        public static final class C11589a extends ContinuationImpl {

            /* renamed from: f */
            /* synthetic */ Object f41910f;

            /* renamed from: g */
            int f41911g;

            /* renamed from: i */
            Object f41913i;

            /* renamed from: j */
            Object f41914j;

            public C11589a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f41910f = obj;
                this.f41911g |= Integer.MIN_VALUE;
                return a.this.mo2408a(null, this);
            }
        }

        public a(Flow flow, Function3 function3) {
            this.f41908f = flow;
            this.f41909g = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo2408a(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.C10775u> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C11082h.a.C11589a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.z2.h$a$a r0 = (kotlinx.coroutines.flow.C11082h.a.C11589a) r0
                int r1 = r0.f41911g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f41911g = r1
                goto L18
            L13:
                kotlinx.coroutines.z2.h$a$a r0 = new kotlinx.coroutines.z2.h$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f41910f
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r2 = r0.f41911g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C10568o.m37655b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f41914j
                kotlinx.coroutines.z2.c r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                java.lang.Object r2 = r0.f41913i
                kotlinx.coroutines.z2.h$a r2 = (kotlinx.coroutines.flow.C11082h.a) r2
                kotlin.C10568o.m37655b(r7)
                goto L53
            L40:
                kotlin.C10568o.m37655b(r7)
                kotlinx.coroutines.z2.b r7 = r5.f41908f
                r0.f41913i = r5
                r0.f41914j = r6
                r0.f41911g = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.C11078d.m39720b(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                kotlin.a0.c.q r2 = r2.f41909g
                r4 = 0
                r0.f41913i = r4
                r0.f41914j = r4
                r0.f41911g = r3
                r3 = 6
                kotlin.jvm.internal.C9797k.m32325c(r3)
                java.lang.Object r6 = r2.mo26879d(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.C9797k.m32325c(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                kotlin.u r6 = kotlin.C10775u.f41439a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C11082h.a.mo2408a(kotlinx.coroutines.z2.c, kotlin.y.d):java.lang.Object");
        }
    }

    /* compiled from: Errors.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m39050f = "Errors.kt", m39051l = {156}, m39052m = "catchImpl")
    /* renamed from: kotlinx.coroutines.z2.h$b */
    static final class b<T> extends ContinuationImpl {

        /* renamed from: f */
        Object f41915f;

        /* renamed from: g */
        /* synthetic */ Object f41916g;

        /* renamed from: h */
        int f41917h;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41916g = obj;
            this.f41917h |= Integer.MIN_VALUE;
            return C11078d.m39720b(null, null, this);
        }
    }

    /* compiled from: Errors.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.z2.h$c */
    static final class c<T> implements FlowCollector {

        /* renamed from: f */
        final /* synthetic */ FlowCollector<T> f41918f;

        /* renamed from: g */
        final /* synthetic */ C9788f0<Throwable> f41919g;

        /* compiled from: Errors.kt */
        @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        @DebugMetadata(m39049c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m39050f = "Errors.kt", m39051l = {158}, m39052m = "emit")
        /* renamed from: kotlinx.coroutines.z2.h$c$a */
        static final class a extends ContinuationImpl {

            /* renamed from: f */
            Object f41920f;

            /* renamed from: g */
            /* synthetic */ Object f41921g;

            /* renamed from: h */
            final /* synthetic */ c<T> f41922h;

            /* renamed from: i */
            int f41923i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f41922h = cVar;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f41921g = obj;
                this.f41923i |= Integer.MIN_VALUE;
                return this.f41922h.mo2409c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(FlowCollector<? super T> flowCollector, C9788f0<Throwable> c9788f0) {
            this.f41918f = flowCollector;
            this.f41919g = c9788f0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo2409c(T r5, kotlin.coroutines.Continuation<? super kotlin.C10775u> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C11082h.c.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.z2.h$c$a r0 = (kotlinx.coroutines.flow.C11082h.c.a) r0
                int r1 = r0.f41923i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f41923i = r1
                goto L18
            L13:
                kotlinx.coroutines.z2.h$c$a r0 = new kotlinx.coroutines.z2.h$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f41921g
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r2 = r0.f41923i
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f41920f
                kotlinx.coroutines.z2.h$c r5 = (kotlinx.coroutines.flow.C11082h.c) r5
                kotlin.C10568o.m37655b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.C10568o.m37655b(r6)
                kotlinx.coroutines.z2.c<T> r6 = r4.f41918f     // Catch: java.lang.Throwable -> L4a
                r0.f41920f = r4     // Catch: java.lang.Throwable -> L4a
                r0.f41923i = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.mo2409c(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.u r5 = kotlin.C10775u.f41439a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.a0.d.f0<java.lang.Throwable> r5 = r5.f41919g
                r5.f37179f = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C11082h.c.mo2409c(java.lang.Object, kotlin.y.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> Flow<T> m39729a(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super C10775u>, ? extends Object> function3) {
        return new a(flow, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m39730b(kotlinx.coroutines.flow.Flow<? extends T> r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, kotlin.coroutines.Continuation<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C11082h.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.z2.h$b r0 = (kotlinx.coroutines.flow.C11082h.b) r0
            int r1 = r0.f41917h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41917h = r1
            goto L18
        L13:
            kotlinx.coroutines.z2.h$b r0 = new kotlinx.coroutines.z2.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41916g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f41917h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f41915f
            kotlin.a0.d.f0 r4 = (kotlin.jvm.internal.C9788f0) r4
            kotlin.C10568o.m37655b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.C10568o.m37655b(r6)
            kotlin.a0.d.f0 r6 = new kotlin.a0.d.f0
            r6.<init>()
            kotlinx.coroutines.z2.h$c r2 = new kotlinx.coroutines.z2.h$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f41915f = r6     // Catch: java.lang.Throwable -> L51
            r0.f41917h = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.mo2408a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f37179f
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m39732d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.y.g r6 = r0.getF41861l()
            boolean r6 = m39731c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.C9751a.m32273a(r4, r5)
            throw r4
        L72:
            kotlin.C9751a.m32273a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C11082h.m39730b(kotlinx.coroutines.z2.b, kotlinx.coroutines.z2.c, kotlin.y.d):java.lang.Object");
    }

    /* renamed from: c */
    private static final boolean m39731c(Throwable th, CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.f41899e);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return m39732d(th, job.mo39357j());
    }

    /* renamed from: d */
    private static final boolean m39732d(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (C11045s0.m39684d()) {
                th2 = C10976d0.m39464l(th2);
            }
            if (C11045s0.m39684d()) {
                th = C10976d0.m39464l(th);
            }
            if (C9801m.m32341a(th2, th)) {
                return true;
            }
        }
        return false;
    }
}
