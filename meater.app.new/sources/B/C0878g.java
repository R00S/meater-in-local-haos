package B;

import kotlin.InterfaceC0971j;
import kotlin.Metadata;
import y0.b0;

/* compiled from: LazyGridBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"LB/g;", "LC/j;", "LB/I;", "state", "<init>", "(LB/I;)V", "Loa/F;", "c", "()V", "a", "LB/I;", "getState", "()LB/I;", "", "()I", "itemCount", "", "d", "()Z", "hasVisibleItems", "e", "firstPlacedIndex", "b", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878g implements InterfaceC0971j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I state;

    public C0878g(I i10) {
        this.state = i10;
    }

    @Override // kotlin.InterfaceC0971j
    public int a() {
        return this.state.s().getTotalItemsCount();
    }

    @Override // kotlin.InterfaceC0971j
    public int b() {
        return ((InterfaceC0882k) kotlin.collections.r.u0(this.state.s().n())).getIndex();
    }

    @Override // kotlin.InterfaceC0971j
    public void c() {
        b0 remeasurement = this.state.getRemeasurement();
        if (remeasurement != null) {
            remeasurement.k();
        }
    }

    @Override // kotlin.InterfaceC0971j
    public boolean d() {
        return !this.state.s().n().isEmpty();
    }

    @Override // kotlin.InterfaceC0971j
    public int e() {
        return this.state.o();
    }
}
