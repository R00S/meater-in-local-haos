package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.C10947b;
import okhttp3.HttpUrl;

/* compiled from: StateFlow.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m32267d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", HttpUrl.FRAGMENT_ENCODE_SET, "allocateLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/Continuation;", "freeLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z2.p, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f41951a = AtomicReferenceFieldUpdater.newUpdater(StateFlowSlot.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo39387a(StateFlowImpl<?> stateFlowImpl) {
        if (this._state != null) {
            return false;
        }
        this._state = C11089o.f41949a;
        return true;
    }

    /* renamed from: d */
    public final Object m39742d(Continuation<? super C10775u> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(continuation), 1);
        cancellableContinuationImpl.m39666z();
        if (C11045s0.m39681a() && !(!(this._state instanceof CancellableContinuationImpl))) {
            throw new AssertionError();
        }
        if (!f41951a.compareAndSet(this, C11089o.f41949a, cancellableContinuationImpl)) {
            if (C11045s0.m39681a()) {
                if (!(this._state == C11089o.f41950b)) {
                    throw new AssertionError();
                }
            }
            Result.a aVar = Result.f40714f;
            cancellableContinuationImpl.resumeWith(Result.m37650a(C10775u.f41439a));
        }
        Object objM39664w = cancellableContinuationImpl.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w == C10855d.m39045c() ? objM39664w : C10775u.f41439a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Continuation<C10775u>[] mo39388b(StateFlowImpl<?> stateFlowImpl) {
        this._state = null;
        return C10947b.f41724a;
    }

    /* renamed from: f */
    public final void m39744f() {
        while (true) {
            Object obj = this._state;
            if (obj == null || obj == C11089o.f41950b) {
                return;
            }
            if (obj == C11089o.f41949a) {
                if (f41951a.compareAndSet(this, obj, C11089o.f41950b)) {
                    return;
                }
            } else if (f41951a.compareAndSet(this, obj, C11089o.f41949a)) {
                Result.a aVar = Result.f40714f;
                ((CancellableContinuationImpl) obj).resumeWith(Result.m37650a(C10775u.f41439a));
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean m39745g() {
        Object andSet = f41951a.getAndSet(this, C11089o.f41949a);
        C9801m.m32343c(andSet);
        if (!C11045s0.m39681a() || (!(andSet instanceof CancellableContinuationImpl))) {
            return andSet == C11089o.f41950b;
        }
        throw new AssertionError();
    }
}
