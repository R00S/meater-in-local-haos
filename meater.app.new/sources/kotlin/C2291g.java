package kotlin;

import Zb.d;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;
import ta.h;
import ua.C4696b;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbc/g;", "T", "Lbc/f;", "Lac/e;", "flow", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "<init>", "(Lac/e;Lta/g;ILZb/d;)V", "Lbc/d;", "k", "(Lta/g;ILZb/d;)Lbc/d;", "l", "()Lac/e;", "Lac/f;", "collector", "Loa/F;", "s", "(Lac/f;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2291g<T> extends AbstractC2290f<T, T> {
    public /* synthetic */ C2291g(InterfaceC1970e interfaceC1970e, g gVar, int i10, d dVar, int i11, C3854k c3854k) {
        this(interfaceC1970e, (i11 & 2) != 0 ? h.f50000B : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? d.f19650B : dVar);
    }

    @Override // kotlin.AbstractC2288d
    protected AbstractC2288d<T> k(g context, int capacity, d onBufferOverflow) {
        return new C2291g(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC2288d
    public InterfaceC1970e<T> l() {
        return (InterfaceC1970e<T>) this.flow;
    }

    @Override // kotlin.AbstractC2290f
    protected Object s(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objB = this.flow.b(interfaceC1971f, interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    public C2291g(InterfaceC1970e<? extends T> interfaceC1970e, g gVar, int i10, d dVar) {
        super(interfaceC1970e, gVar, i10, dVar);
    }
}
