package ac;

import Xb.InterfaceC1867v0;
import kotlin.InterfaceC2295k;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096A¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lac/v;", "T", "Lac/H;", "", "Lbc/k;", "flow", "LXb/v0;", "job", "<init>", "(Lac/H;LXb/v0;)V", "Lac/f;", "collector", "", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "Lac/e;", "e", "(Lta/g;ILZb/d;)Lac/e;", "B", "LXb/v0;", "getValue", "()Ljava/lang/Object;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class v<T> implements H<T>, InterfaceC1970e, InterfaceC2295k<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1867v0 job;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ H<T> f20433C;

    /* JADX WARN: Multi-variable type inference failed */
    public v(H<? extends T> h10, InterfaceC1867v0 interfaceC1867v0) {
        this.job = interfaceC1867v0;
        this.f20433C = h10;
    }

    @Override // ac.x, ac.InterfaceC1970e
    public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<?> interfaceC4588d) {
        return this.f20433C.b(interfaceC1971f, interfaceC4588d);
    }

    @Override // kotlin.InterfaceC2295k
    public InterfaceC1970e<T> e(ta.g context, int capacity, Zb.d onBufferOverflow) {
        return J.d(this, context, capacity, onBufferOverflow);
    }

    @Override // ac.H
    public T getValue() {
        return this.f20433C.getValue();
    }
}
