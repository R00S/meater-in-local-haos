package A0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: OnPositionedDispatcher.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"LA0/k0;", "", "<init>", "()V", "LA0/G;", "layoutNode", "Loa/F;", "b", "(LA0/G;)V", "", "c", "()Z", "node", "d", "f", "rootNode", "e", "a", "LQ/b;", "LQ/b;", "layoutNodes", "", "[LA0/G;", "cachedNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f638d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q.b<G> layoutNodes = new Q.b<>(new G[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private G[] cachedNodes;

    private final void b(G layoutNode) {
        layoutNode.A();
        int i10 = 0;
        layoutNode.F1(false);
        Q.b<G> bVarW0 = layoutNode.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            do {
                b(gArrT[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void a() {
        this.layoutNodes.J(Companion.C0013a.f641B);
        int size = this.layoutNodes.getSize();
        G[] gArr = this.cachedNodes;
        if (gArr == null || gArr.length < size) {
            gArr = new G[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i10 = 0; i10 < size; i10++) {
            gArr[i10] = this.layoutNodes.t()[i10];
        }
        this.layoutNodes.l();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = gArr;
                return;
            }
            G g10 = gArr[size];
            C3862t.d(g10);
            if (g10.getNeedsOnPositionedDispatch()) {
                b(g10);
            }
        }
    }

    public final boolean c() {
        return this.layoutNodes.y();
    }

    public final void d(G node) {
        this.layoutNodes.c(node);
        node.F1(true);
    }

    public final void e(G rootNode) {
        this.layoutNodes.l();
        this.layoutNodes.c(rootNode);
        rootNode.F1(true);
    }

    public final void f(G node) {
        this.layoutNodes.B(node);
    }
}
