package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import okhttp3.HttpUrl;

/* compiled from: Flow.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m32267d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z2.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class AbstractFlow<T> implements Flow<T> {

    /* compiled from: Flow.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "kotlinx.coroutines.flow.AbstractFlow", m39050f = "Flow.kt", m39051l = {230}, m39052m = "collect")
    /* renamed from: kotlinx.coroutines.z2.a$a */
    static final class a extends ContinuationImpl {

        /* renamed from: f */
        Object f41904f;

        /* renamed from: g */
        /* synthetic */ Object f41905g;

        /* renamed from: h */
        final /* synthetic */ AbstractFlow<T> f41906h;

        /* renamed from: i */
        int f41907i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractFlow<T> abstractFlow, Continuation<? super a> continuation) {
            super(continuation);
            this.f41906h = abstractFlow;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41905g = obj;
            this.f41907i |= Integer.MIN_VALUE;
            return this.f41906h.mo2408a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2408a(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.C10775u> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractFlow.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.z2.a$a r0 = (kotlinx.coroutines.flow.AbstractFlow.a) r0
            int r1 = r0.f41907i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41907i = r1
            goto L18
        L13:
            kotlinx.coroutines.z2.a$a r0 = new kotlinx.coroutines.z2.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f41905g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f41907i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f41904f
            kotlinx.coroutines.flow.internal.h r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            kotlin.C10568o.m37655b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C10568o.m37655b(r7)
            kotlinx.coroutines.flow.internal.h r7 = new kotlinx.coroutines.flow.internal.h
            kotlin.y.g r2 = r0.getF41861l()
            r7.<init>(r6, r2)
            r0.f41904f = r7     // Catch: java.lang.Throwable -> L55
            r0.f41907i = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo39718b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.u r6 = kotlin.C10775u.f41439a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.mo2408a(kotlinx.coroutines.z2.c, kotlin.y.d):java.lang.Object");
    }

    /* renamed from: b */
    public abstract Object mo39718b(FlowCollector<? super T> flowCollector, Continuation<? super C10775u> continuation);
}
