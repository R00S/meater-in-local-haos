package A0;

import A0.G;
import A0.S;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LayoutTreeConsistencyChecker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"LA0/N;", "", "LA0/G;", "root", "LA0/o;", "relayoutNodes", "", "LA0/S$a;", "postponedMeasureRequests", "<init>", "(LA0/G;LA0/o;Ljava/util/List;)V", "node", "", "c", "(LA0/G;)Z", "b", "", "f", "(LA0/G;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "Loa/F;", "a", "()V", "LA0/G;", "LA0/o;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0836o relayoutNodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<S.a> postponedMeasureRequests;

    public N(G g10, C0836o c0836o, List<S.a> list) {
        this.root = g10;
        this.relayoutNodes = c0836o;
        this.postponedMeasureRequests = list;
    }

    private final boolean b(G g10) {
        S.a aVar;
        G gO0 = g10.o0();
        S.a aVar2 = null;
        G.e eVarW = gO0 != null ? gO0.W() : null;
        if (g10.o() || (g10.p0() != Integer.MAX_VALUE && gO0 != null && gO0.o())) {
            if (g10.e0()) {
                List<S.a> list = this.postponedMeasureRequests;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i10);
                    S.a aVar3 = aVar;
                    if (C3862t.b(aVar3.getNode(), g10) && !aVar3.getIsLookahead()) {
                        break;
                    }
                    i10++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (g10.e0()) {
                return this.relayoutNodes.d(g10) || g10.W() == G.e.LookaheadMeasuring || (gO0 != null && gO0.e0()) || ((gO0 != null && gO0.Y()) || eVarW == G.e.Measuring);
            }
            if (g10.V()) {
                return this.relayoutNodes.d(g10) || gO0 == null || gO0.e0() || gO0.V() || eVarW == G.e.Measuring || eVarW == G.e.LayingOut;
            }
        }
        if (C3862t.b(g10.N0(), Boolean.TRUE)) {
            if (g10.Y()) {
                List<S.a> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    S.a aVar4 = list2.get(i11);
                    S.a aVar5 = aVar4;
                    if (C3862t.b(aVar5.getNode(), g10) && aVar5.getIsLookahead()) {
                        aVar2 = aVar4;
                        break;
                    }
                    i11++;
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (g10.Y()) {
                return this.relayoutNodes.e(g10, true) || (gO0 != null && gO0.Y()) || eVarW == G.e.LookaheadMeasuring || (gO0 != null && gO0.e0() && C3862t.b(g10.getLookaheadRoot(), g10));
            }
            if (g10.X()) {
                return this.relayoutNodes.e(g10, true) || gO0 == null || gO0.Y() || gO0.X() || eVarW == G.e.LookaheadMeasuring || eVarW == G.e.LookaheadLayingOut || (gO0.V() && C3862t.b(g10.getLookaheadRoot(), g10));
            }
        }
        return true;
    }

    private final boolean c(G node) {
        if (!b(node)) {
            return false;
        }
        List<G> listH = node.H();
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(listH.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        C3862t.f(sb2, "append(value)");
        sb2.append('\n');
        C3862t.f(sb2, "append('\\n')");
        e(this, sb2, this.root, 0);
        return sb2.toString();
    }

    private static final void e(N n10, StringBuilder sb2, G g10, int i10) {
        String strF = n10.f(g10);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            C3862t.f(sb2, "append(value)");
            sb2.append('\n');
            C3862t.f(sb2, "append('\\n')");
            i10++;
        }
        List<G> listH = g10.H();
        int size = listH.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(n10, sb2, listH.get(i12), i10);
        }
    }

    private final String f(G node) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(node);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(node.W());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!node.o()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + node.g0() + ']');
        if (!b(node)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (c(this.root)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
