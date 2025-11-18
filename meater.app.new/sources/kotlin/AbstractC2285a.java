package kotlin;

import ac.H;
import java.util.Arrays;
import kotlin.AbstractC2287c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lbc/a;", "Lbc/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "k", "()Lbc/c;", "", "size", "", "l", "(I)[Lbc/c;", "h", "slot", "Loa/F;", "m", "(Lbc/c;)V", "<set-?>", "B", "[Lbc/c;", "o", "()[Lbc/c;", "slots", "C", "I", "n", "()I", "nCollectors", "D", "nextIndex", "Lbc/t;", "E", "Lbc/t;", "_subscriptionCount", "Lac/H;", "j", "()Lac/H;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2285a<S extends AbstractC2287c<?>> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private S[] slots;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int nCollectors;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int nextIndex;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private C2303t _subscriptionCount;

    protected final S h() {
        S s10;
        C2303t c2303t;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) l(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    C3862t.f(objArrCopyOf, "copyOf(...)");
                    this.slots = (S[]) ((AbstractC2287c[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC2287c[]) objArrCopyOf);
                }
                int i10 = this.nextIndex;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) k();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    C3862t.e(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s10.a(this));
                this.nextIndex = i10;
                this.nCollectors++;
                c2303t = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2303t != null) {
            c2303t.b0(1);
        }
        return s10;
    }

    public final H<Integer> j() {
        C2303t c2303t;
        synchronized (this) {
            c2303t = this._subscriptionCount;
            if (c2303t == null) {
                c2303t = new C2303t(this.nCollectors);
                this._subscriptionCount = c2303t;
            }
        }
        return c2303t;
    }

    protected abstract S k();

    protected abstract S[] l(int size);

    protected final void m(S slot) {
        C2303t c2303t;
        int i10;
        InterfaceC4588d<C4153F>[] interfaceC4588dArrB;
        synchronized (this) {
            try {
                int i11 = this.nCollectors - 1;
                this.nCollectors = i11;
                c2303t = this._subscriptionCount;
                if (i11 == 0) {
                    this.nextIndex = 0;
                }
                C3862t.e(slot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC4588dArrB = slot.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4588d<C4153F> interfaceC4588d : interfaceC4588dArrB) {
            if (interfaceC4588d != null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
            }
        }
        if (c2303t != null) {
            c2303t.b0(-1);
        }
    }

    /* renamed from: n, reason: from getter */
    protected final int getNCollectors() {
        return this.nCollectors;
    }

    protected final S[] o() {
        return this.slots;
    }
}
