package A0;

import kotlin.AbstractC1527a;
import kotlin.Metadata;

/* compiled from: UiApplier.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LA0/D0;", "LO/a;", "LA0/G;", "root", "<init>", "(LA0/G;)V", "", "index", "instance", "Loa/F;", "n", "(ILA0/G;)V", "m", "count", "a", "(II)V", "from", "to", "f", "(III)V", "k", "()V", "i", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D0 extends AbstractC1527a<G> {
    public D0(G g10) {
        super(g10);
    }

    @Override // kotlin.InterfaceC1542f
    public void a(int index, int count) {
        b().n1(index, count);
    }

    @Override // kotlin.InterfaceC1542f
    public void f(int from, int to, int count) {
        b().e1(from, to, count);
    }

    @Override // kotlin.InterfaceC1542f
    public void i() {
        super.i();
        m0 owner = j().getOwner();
        if (owner != null) {
            owner.v();
        }
    }

    @Override // kotlin.AbstractC1527a
    protected void k() {
        j().m1();
    }

    @Override // kotlin.InterfaceC1542f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(int index, G instance) {
        b().B0(index, instance);
    }

    @Override // kotlin.InterfaceC1542f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(int index, G instance) {
    }
}
