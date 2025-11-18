package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* compiled from: Share.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R:\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m32267d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z2.q, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {

    /* renamed from: f */
    private final FlowCollector<T> f41952f;

    /* renamed from: g */
    private final Function2<FlowCollector<? super T>, Continuation<? super C10775u>, Object> f41953g;

    /* compiled from: Share.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m39050f = "Share.kt", m39051l = {419, 423}, m39052m = "onSubscription")
    /* renamed from: kotlinx.coroutines.z2.q$a */
    static final class a extends ContinuationImpl {

        /* renamed from: f */
        Object f41954f;

        /* renamed from: g */
        Object f41955g;

        /* renamed from: h */
        /* synthetic */ Object f41956h;

        /* renamed from: i */
        final /* synthetic */ SubscribedFlowCollector<T> f41957i;

        /* renamed from: j */
        int f41958j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SubscribedFlowCollector<T> subscribedFlowCollector, Continuation<? super a> continuation) {
            super(continuation);
            this.f41957i = subscribedFlowCollector;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41956h = obj;
            this.f41958j |= Integer.MIN_VALUE;
            return this.f41957i.m39746a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.h] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39746a(kotlin.coroutines.Continuation<? super kotlin.C10775u> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.z2.q$a r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector.a) r0
            int r1 = r0.f41958j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41958j = r1
            goto L18
        L13:
            kotlinx.coroutines.z2.q$a r0 = new kotlinx.coroutines.z2.q$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f41956h
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f41958j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C10568o.m37655b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f41955g
            kotlinx.coroutines.flow.internal.h r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.f41954f
            kotlinx.coroutines.z2.q r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            kotlin.C10568o.m37655b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            kotlin.C10568o.m37655b(r7)
            kotlinx.coroutines.flow.internal.h r2 = new kotlinx.coroutines.flow.internal.h
            kotlinx.coroutines.z2.c<T> r7 = r6.f41952f
            kotlin.y.g r5 = r0.getF41861l()
            r2.<init>(r7, r5)
            kotlin.a0.c.p<kotlinx.coroutines.z2.c<? super T>, kotlin.y.d<? super kotlin.u>, java.lang.Object> r7 = r6.f41953g     // Catch: java.lang.Throwable -> L7d
            r0.f41954f = r6     // Catch: java.lang.Throwable -> L7d
            r0.f41955g = r2     // Catch: java.lang.Throwable -> L7d
            r0.f41958j = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.z2.c<T> r7 = r4.f41952f
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L7a
            kotlinx.coroutines.z2.q r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.f41954f = r2
            r0.f41955g = r2
            r0.f41958j = r3
            java.lang.Object r7 = r7.m39746a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.u r7 = kotlin.C10775u.f41439a
            return r7
        L7a:
            kotlin.u r7 = kotlin.C10775u.f41439a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.m39746a(kotlin.y.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: c */
    public Object mo2409c(T t, Continuation<? super C10775u> continuation) {
        return this.f41952f.mo2409c(t, continuation);
    }
}
