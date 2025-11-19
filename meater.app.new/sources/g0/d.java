package g0;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.e0;
import androidx.compose.ui.focus.FocusTargetNode;
import b0.i;
import kotlin.Metadata;

/* compiled from: FocusEventModifierNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg0/c;", "Loa/F;", "b", "(Lg0/c;)V", "Lg0/o;", "a", "(Lg0/c;)Lg0/o;", "Landroidx/compose/ui/focus/FocusTargetNode;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41526a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41526a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0095, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final g0.o a(g0.c r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.a(g0.c):g0.o");
    }

    public static final void b(c cVar) {
        C0832k.l(cVar).getFocusOwner().o(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [b0.i$c] */
    public static final void c(FocusTargetNode focusTargetNode) {
        C0819a0 nodes;
        int iA = e0.a(4096);
        int iA2 = e0.a(1024);
        i.c node = focusTargetNode.getNode();
        int i10 = iA | iA2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c node2 = focusTargetNode.getNode();
        G gK = C0832k.k(focusTargetNode);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            AbstractC0834m abstractC0834mG = node2;
                            Q.b bVar = null;
                            while (abstractC0834mG != 0) {
                                if (abstractC0834mG instanceof c) {
                                    c cVar = (c) abstractC0834mG;
                                    cVar.u(a(cVar));
                                } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                    i.c delegate = abstractC0834mG.getDelegate();
                                    int i11 = 0;
                                    abstractC0834mG = abstractC0834mG;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC0834mG = delegate;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new Q.b(new i.c[16], 0);
                                                }
                                                if (abstractC0834mG != 0) {
                                                    bVar.c(abstractC0834mG);
                                                    abstractC0834mG = 0;
                                                }
                                                bVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC0834mG = abstractC0834mG;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC0834mG = C0832k.g(bVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            gK = gK.o0();
            node2 = (gK == null || (nodes = gK.getNodes()) == null) ? null : nodes.getTail();
        }
    }
}
