package androidx.compose.ui.focus;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.e0;
import androidx.compose.ui.focus.b;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import y0.InterfaceC5103h;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "direction", "Lkotlin/Function1;", "Ly0/h$a;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILBa/l;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i10, Ba.l<? super InterfaceC5103h.a, ? extends T> lVar) {
        i.c cVarG;
        InterfaceC5103h interfaceC5103hP2;
        int iC;
        C0819a0 nodes;
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = focusTargetNode.getNode().getParent();
        G gK = C0832k.k(focusTargetNode);
        loop0: while (true) {
            if (gK == null) {
                cVarG = null;
                break;
            }
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarG = parent;
                        Q.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i11 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new Q.b(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar.c(cVarG);
                                                cVarG = null;
                                            }
                                            bVar.c(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = C0832k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gK = gK.o0();
            parent = (gK == null || (nodes = gK.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if ((focusTargetNode2 != null && C3862t.b(focusTargetNode2.p2(), focusTargetNode.p2())) || (interfaceC5103hP2 = focusTargetNode.p2()) == null) {
            return null;
        }
        b.Companion companion = b.INSTANCE;
        if (b.l(i10, companion.h())) {
            iC = InterfaceC5103h.b.INSTANCE.a();
        } else if (b.l(i10, companion.a())) {
            iC = InterfaceC5103h.b.INSTANCE.d();
        } else if (b.l(i10, companion.d())) {
            iC = InterfaceC5103h.b.INSTANCE.e();
        } else if (b.l(i10, companion.g())) {
            iC = InterfaceC5103h.b.INSTANCE.f();
        } else if (b.l(i10, companion.e())) {
            iC = InterfaceC5103h.b.INSTANCE.b();
        } else {
            if (!b.l(i10, companion.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = InterfaceC5103h.b.INSTANCE.c();
        }
        return (T) interfaceC5103hP2.m(iC, lVar);
    }
}
