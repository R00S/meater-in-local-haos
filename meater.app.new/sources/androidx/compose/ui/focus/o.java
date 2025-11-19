package androidx.compose.ui.focus;

import A0.C0832k;
import A0.G;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/o;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "LA0/G;", "layoutNode", "LQ/b;", "b", "(LA0/G;)LQ/b;", "a", "", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o implements Comparator<FocusTargetNode> {

    /* renamed from: B, reason: collision with root package name */
    public static final o f22775B = new o();

    private o() {
    }

    private final Q.b<G> b(G layoutNode) {
        Q.b<G> bVar = new Q.b<>(new G[16], 0);
        while (layoutNode != null) {
            bVar.a(0, layoutNode);
            layoutNode = layoutNode.o0();
        }
        return bVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode a10, FocusTargetNode b10) {
        int i10 = 0;
        if (!n.g(a10) || !n.g(b10)) {
            if (n.g(a10)) {
                return -1;
            }
            return n.g(b10) ? 1 : 0;
        }
        G gK = C0832k.k(a10);
        G gK2 = C0832k.k(b10);
        if (C3862t.b(gK, gK2)) {
            return 0;
        }
        Q.b<G> bVarB = b(gK);
        Q.b<G> bVarB2 = b(gK2);
        int iMin = Math.min(bVarB.getSize() - 1, bVarB2.getSize() - 1);
        if (iMin >= 0) {
            while (C3862t.b(bVarB.t()[i10], bVarB2.t()[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return C3862t.i(bVarB.t()[i10].p0(), bVarB2.t()[i10].p0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
