package A0;

import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.r1;

/* compiled from: IntrinsicsPolicy.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010\u000b¨\u0006!"}, d2 = {"LA0/y;", "", "LA0/G;", "layoutNode", "Ly0/I;", "policy", "<init>", "(LA0/G;Ly0/I;)V", "measurePolicy", "Loa/F;", "k", "(Ly0/I;)V", "", "height", "g", "(I)I", "width", "f", "c", "b", "i", "h", "e", "d", "a", "LA0/G;", "getLayoutNode", "()LA0/G;", "<set-?>", "LO/p0;", "()Ly0/I;", "j", "measurePolicyState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 measurePolicyState;

    public C0845y(G g10, y0.I i10) {
        this.layoutNode = g10;
        this.measurePolicyState = r1.c(i10, null, 2, null);
    }

    private final y0.I a() {
        return (y0.I) this.measurePolicyState.getValue();
    }

    private final void j(y0.I i10) {
        this.measurePolicyState.setValue(i10);
    }

    public final int b(int width) {
        return a().i(this.layoutNode.m0(), this.layoutNode.G(), width);
    }

    public final int c(int height) {
        return a().d(this.layoutNode.m0(), this.layoutNode.G(), height);
    }

    public final int d(int width) {
        return a().i(this.layoutNode.m0(), this.layoutNode.F(), width);
    }

    public final int e(int height) {
        return a().d(this.layoutNode.m0(), this.layoutNode.F(), height);
    }

    public final int f(int width) {
        return a().h(this.layoutNode.m0(), this.layoutNode.G(), width);
    }

    public final int g(int height) {
        return a().c(this.layoutNode.m0(), this.layoutNode.G(), height);
    }

    public final int h(int width) {
        return a().h(this.layoutNode.m0(), this.layoutNode.F(), width);
    }

    public final int i(int height) {
        return a().c(this.layoutNode.m0(), this.layoutNode.F(), height);
    }

    public final void k(y0.I measurePolicy) {
        j(measurePolicy);
    }
}
