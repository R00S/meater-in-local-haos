package kotlin;

import kotlin.Metadata;
import ta.g;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LO/F0;", "T", "LO/E0;", "LO/p0;", "state", "Lta/g;", "coroutineContext", "<init>", "(LO/p0;Lta/g;)V", "B", "Lta/g;", "getCoroutineContext", "()Lta/g;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.F0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1499F0<T> implements InterfaceC1497E0<T>, InterfaceC1563p0<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final g coroutineContext;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ InterfaceC1563p0<T> f12610C;

    public C1499F0(InterfaceC1563p0<T> interfaceC1563p0, g gVar) {
        this.coroutineContext = gVar;
        this.f12610C = interfaceC1563p0;
    }

    @Override // Xb.I
    public g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // kotlin.InterfaceC1563p0, kotlin.x1
    public T getValue() {
        return this.f12610C.getValue();
    }

    @Override // kotlin.InterfaceC1563p0
    public void setValue(T t10) {
        this.f12610C.setValue(t10);
    }
}
