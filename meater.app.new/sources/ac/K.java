package ac;

import Xb.C1849m;
import cc.C2375f;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC2287c;
import kotlin.C2286b;
import kotlin.C4734X;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lac/K;", "Lbc/c;", "Lac/I;", "<init>", "()V", "flow", "", "d", "(Lac/I;)Z", "", "Lta/d;", "Loa/F;", "f", "(Lac/I;)[Lta/d;", "g", "h", "()Z", "e", "(Lta/d;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class K extends AbstractC2287c<I<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlin.AbstractC2287c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(I<?> flow) {
        if (C2375f.a(this._state) != null) {
            return false;
        }
        C2375f.b(this._state, J.f20328a);
        return true;
    }

    public final Object e(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        if (!C4734X.a(this._state, J.f20328a, c1849m)) {
            C4172q.Companion companion = C4172q.INSTANCE;
            c1849m.resumeWith(C4172q.a(C4153F.f46609a));
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    @Override // kotlin.AbstractC2287c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4588d<C4153F>[] b(I<?> flow) {
        C2375f.b(this._state, null);
        return C2286b.f30744a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objA = C2375f.a(atomicReference);
            if (objA == null || objA == J.f20329b) {
                return;
            }
            if (objA == J.f20328a) {
                if (C4734X.a(this._state, objA, J.f20329b)) {
                    return;
                }
            } else if (C4734X.a(this._state, objA, J.f20328a)) {
                C4172q.Companion companion = C4172q.INSTANCE;
                ((C1849m) objA).resumeWith(C4172q.a(C4153F.f46609a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this._state.getAndSet(J.f20328a);
        C3862t.d(andSet);
        return andSet == J.f20329b;
    }
}
