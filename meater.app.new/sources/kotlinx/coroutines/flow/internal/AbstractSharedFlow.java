package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import okhttp3.HttpUrl;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001c\u001a\u00020\tH$¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0!H\u0084\bJ\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010$R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m32267d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "S", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", HttpUrl.FRAGMENT_ENCODE_SET, "nCollectors", "getNCollectors", "()I", "nextIndex", HttpUrl.FRAGMENT_ENCODE_SET, "slots", "getSlots$annotations", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", HttpUrl.FRAGMENT_ENCODE_SET, "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {

    /* renamed from: f */
    private S[] f41720f;

    /* renamed from: g */
    private int f41721g;

    /* renamed from: h */
    private int f41722h;

    /* renamed from: i */
    private SubscriptionCountStateFlow f41723i;

    /* renamed from: b */
    protected final S m39382b() {
        S s;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            S[] sArr = this.f41720f;
            if (sArr == null) {
                sArr = (S[]) mo39384e(2);
                this.f41720f = sArr;
            } else if (this.f41721g >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C9801m.m32345e(objArrCopyOf, "copyOf(this, newSize)");
                this.f41720f = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
                sArr = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
            }
            int i2 = this.f41722h;
            do {
                s = sArr[i2];
                if (s == null) {
                    s = (S) mo39383d();
                    sArr[i2] = s;
                }
                i2++;
                if (i2 >= sArr.length) {
                    i2 = 0;
                }
            } while (!s.mo39387a(this));
            this.f41722h = i2;
            this.f41721g++;
            subscriptionCountStateFlow = this.f41723i;
        }
        if (subscriptionCountStateFlow == null) {
            return s;
        }
        throw null;
    }

    /* renamed from: d */
    protected abstract S mo39383d();

    /* renamed from: e */
    protected abstract S[] mo39384e(int i2);

    /* renamed from: f */
    protected final void m39385f(S s) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i2;
        Continuation<C10775u>[] continuationArrMo39388b;
        synchronized (this) {
            int i3 = this.f41721g - 1;
            this.f41721g = i3;
            subscriptionCountStateFlow = this.f41723i;
            if (i3 == 0) {
                this.f41722h = 0;
            }
            continuationArrMo39388b = s.mo39388b(this);
        }
        for (Continuation<C10775u> continuation : continuationArrMo39388b) {
            if (continuation != null) {
                Result.a aVar = Result.f40714f;
                continuation.resumeWith(Result.m37650a(C10775u.f41439a));
            }
        }
        if (subscriptionCountStateFlow != null) {
            throw null;
        }
    }

    /* renamed from: g */
    protected final S[] m39386g() {
        return this.f41720f;
    }
}
