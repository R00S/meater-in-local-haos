package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10775u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.C10917g;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* compiled from: SimpleActor.kt */
/* renamed from: androidx.datastore.core.k */
/* loaded from: classes.dex */
public final class C0346k<T> {

    /* renamed from: a */
    private final CoroutineScope f2547a;

    /* renamed from: b */
    private final Function2<T, Continuation<? super C10775u>, Object> f2548b;

    /* renamed from: c */
    private final Channel<T> f2549c;

    /* renamed from: d */
    private final AtomicInteger f2550d;

    /* compiled from: SimpleActor.kt */
    /* renamed from: androidx.datastore.core.k$a */
    static final class a extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: f */
        final /* synthetic */ Function1<Throwable, C10775u> f2551f;

        /* renamed from: g */
        final /* synthetic */ C0346k<T> f2552g;

        /* renamed from: h */
        final /* synthetic */ Function2<T, Throwable, C10775u> f2553h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Throwable, C10775u> function1, C0346k<T> c0346k, Function2<? super T, ? super Throwable, C10775u> function2) {
            super(1);
            this.f2551f = function1;
            this.f2552g = c0346k;
            this.f2553h = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C10775u c10775u;
            this.f2551f.invoke(th);
            ((C0346k) this.f2552g).f2549c.mo39230c(th);
            do {
                Object objM39254f = ChannelResult.m39254f(((C0346k) this.f2552g).f2549c.mo39208a());
                if (objM39254f == null) {
                    c10775u = null;
                } else {
                    this.f2553h.invoke(objM39254f, th);
                    c10775u = C10775u.f41439a;
                }
            } while (c10775u != null);
        }
    }

    /* compiled from: SimpleActor.kt */
    @DebugMetadata(m39049c = "androidx.datastore.core.SimpleActor$offer$2", m39050f = "SimpleActor.kt", m39051l = {122, 122}, m39052m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.k$b */
    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        Object f2554f;

        /* renamed from: g */
        int f2555g;

        /* renamed from: h */
        final /* synthetic */ C0346k<T> f2556h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0346k<T> c0346k, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f2556h = c0346k;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return new b(this.f2556h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r1 = r7.f2555g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.C10568o.m37655b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f2554f
                kotlin.a0.c.p r1 = (kotlin.jvm.functions.Function2) r1
                kotlin.C10568o.m37655b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                kotlin.C10568o.m37655b(r8)
                androidx.datastore.core.k<T> r8 = r7.f2556h
                java.util.concurrent.atomic.AtomicInteger r8 = androidx.datastore.core.C0346k.m2369c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = 1
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                androidx.datastore.core.k<T> r1 = r8.f2556h
                kotlinx.coroutines.o0 r1 = androidx.datastore.core.C0346k.m2370d(r1)
                kotlinx.coroutines.C11033p0.m39669b(r1)
                androidx.datastore.core.k<T> r1 = r8.f2556h
                kotlin.a0.c.p r1 = androidx.datastore.core.C0346k.m2367a(r1)
                androidx.datastore.core.k<T> r4 = r8.f2556h
                kotlinx.coroutines.channels.f r4 = androidx.datastore.core.C0346k.m2368b(r4)
                r8.f2554f = r1
                r8.f2555g = r3
                java.lang.Object r4 = r4.mo39209b(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f2554f = r5
                r0.f2555g = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                androidx.datastore.core.k<T> r1 = r8.f2556h
                java.util.concurrent.atomic.AtomicInteger r1 = androidx.datastore.core.C0346k.m2369c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                kotlin.u r8 = kotlin.C10775u.f41439a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                goto L8a
            L89:
                throw r8
            L8a:
                goto L89
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0346k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0346k(CoroutineScope coroutineScope, Function1<? super Throwable, C10775u> function1, Function2<? super T, ? super Throwable, C10775u> function2, Function2<? super T, ? super Continuation<? super C10775u>, ? extends Object> function22) {
        C9801m.m32346f(coroutineScope, "scope");
        C9801m.m32346f(function1, "onComplete");
        C9801m.m32346f(function2, "onUndeliveredElement");
        C9801m.m32346f(function22, "consumeMessage");
        this.f2547a = coroutineScope;
        this.f2548b = function22;
        this.f2549c = C10917g.m39248b(Integer.MAX_VALUE, null, null, 6, null);
        this.f2550d = new AtomicInteger(0);
        Job job = (Job) coroutineScope.getF41775f().get(Job.f41899e);
        if (job == null) {
            return;
        }
        job.mo39360m(new a(function1, this, function2));
    }

    /* renamed from: e */
    public final void m2371e(T t) throws Throwable {
        Object objMo39231d = this.f2549c.mo39231d(t);
        if (objMo39231d instanceof ChannelResult.Closed) {
            Throwable thM39253e = ChannelResult.m39253e(objMo39231d);
            if (thM39253e != null) {
                throw thM39253e;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m39256h(objMo39231d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f2550d.getAndIncrement() == 0) {
            C11008j.m39597b(this.f2547a, null, null, new b(this, null), 3, null);
        }
    }
}
