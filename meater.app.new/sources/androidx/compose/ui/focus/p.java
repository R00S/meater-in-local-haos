package androidx.compose.ui.focus;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.e0;
import androidx.compose.ui.focus.b;
import b0.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import y0.InterfaceC5103h;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;ILBa/l;)Z", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;LBa/l;)Z", "b", "focusedItem", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILBa/l;)Z", "i", "h", "g", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22776a;

        static {
            int[] iArr = new int[g0.p.values().length];
            try {
                iArr[g0.p.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.p.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22776a = iArr;
        }
    }

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/h$a;", "", "a", "(Ly0/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<InterfaceC5103h.a, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22777B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22778C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f22779D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.l<FocusTargetNode, Boolean> f22780E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f22777B = focusTargetNode;
            this.f22778C = focusTargetNode2;
            this.f22779D = i10;
            this.f22780E = lVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC5103h.a aVar) {
            boolean zI = p.i(this.f22777B, this.f22778C, this.f22779D, this.f22780E);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        g0.p pVarQ2 = focusTargetNode.q2();
        int[] iArr = a.f22776a;
        int i10 = iArr[pVarQ2.ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = n.f(focusTargetNode);
            if (focusTargetNodeF == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int i11 = iArr[focusTargetNodeF.q2().ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.b.INSTANCE.f(), lVar);
                }
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (!b(focusTargetNodeF, lVar) && !d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.b.INSTANCE.f(), lVar) && (!focusTargetNodeF.o2().getCanFocus() || !lVar.invoke(focusTargetNodeF).booleanValue())) {
                return false;
            }
        } else {
            if (i10 == 2 || i10 == 3) {
                return g(focusTargetNode, lVar);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!g(focusTargetNode, lVar)) {
                if (!(focusTargetNode.o2().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        int i10 = a.f22776a[focusTargetNode.q2().ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = n.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, lVar) || d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.b.INSTANCE.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i10 == 2 || i10 == 3) {
            return h(focusTargetNode, lVar);
        }
        if (i10 == 4) {
            return focusTargetNode.o2().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : h(focusTargetNode, lVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        if (i(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        i.c cVar;
        C0819a0 nodes;
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = focusTargetNode.getNode().getParent();
        G gK = C0832k.k(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (gK == null) {
                break;
            }
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        i.c cVarG = parent;
                        Q.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                cVar = cVarG;
                                break loop0;
                            }
                            if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i10 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
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
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.e())) {
            return c(focusTargetNode, lVar);
        }
        if (androidx.compose.ui.focus.b.l(i10, companion.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        Q.b bVar = new Q.b(new FocusTargetNode[16], 0);
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.b bVar2 = new Q.b(new i.c[16], 0);
        i.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.c(child);
        }
        while (bVar2.y()) {
            i.c cVarG = (i.c) bVar2.E(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                C0832k.c(bVar2, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.getKindSet() & iA) != 0) {
                        Q.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                bVar.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i10 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new Q.b(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.c(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = C0832k.g(bVar3);
                        }
                    } else {
                        cVarG = cVarG.getChild();
                    }
                }
            }
        }
        bVar.J(o.f22775B);
        int size = bVar.getSize();
        if (size > 0) {
            int i11 = size - 1;
            Object[] objArrT = bVar.t();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrT[i11];
                if (n.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                    return true;
                }
                i11--;
            } while (i11 >= 0);
        }
        return false;
    }

    private static final boolean h(FocusTargetNode focusTargetNode, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        Q.b bVar = new Q.b(new FocusTargetNode[16], 0);
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.b bVar2 = new Q.b(new i.c[16], 0);
        i.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.c(child);
        }
        while (bVar2.y()) {
            i.c cVarG = (i.c) bVar2.E(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                C0832k.c(bVar2, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.getKindSet() & iA) != 0) {
                        Q.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                bVar.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i10 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new Q.b(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.c(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = C0832k.g(bVar3);
                        }
                    } else {
                        cVarG = cVarG.getChild();
                    }
                }
            }
        }
        bVar.J(o.f22775B);
        int size = bVar.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] objArrT = bVar.t();
        int i11 = 0;
        do {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrT[i11];
            if (n.g(focusTargetNode2) && c(focusTargetNode2, lVar)) {
                return true;
            }
            i11++;
        } while (i11 < size);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        if (focusTargetNode.q2() != g0.p.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Q.b bVar = new Q.b(new FocusTargetNode[16], 0);
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.b bVar2 = new Q.b(new i.c[16], 0);
        i.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.c(child);
        }
        while (bVar2.y()) {
            i.c cVarG = (i.c) bVar2.E(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                C0832k.c(bVar2, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.getKindSet() & iA) != 0) {
                        Q.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                bVar.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i11 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new Q.b(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.c(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.c(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = C0832k.g(bVar3);
                        }
                    } else {
                        cVarG = cVarG.getChild();
                    }
                }
            }
        }
        bVar.J(o.f22775B);
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.e())) {
            Ha.f fVar = new Ha.f(0, bVar.getSize() - 1);
            int first = fVar.getFirst();
            int last = fVar.getLast();
            if (first <= last) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) bVar.t()[first];
                        if (n.g(focusTargetNode3) && c(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (C3862t.b(bVar.t()[first], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, companion.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            Ha.f fVar2 = new Ha.f(0, bVar.getSize() - 1);
            int first2 = fVar2.getFirst();
            int last2 = fVar2.getLast();
            if (first2 <= last2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) bVar.t()[last2];
                        if (n.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (C3862t.b(bVar.t()[last2], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (androidx.compose.ui.focus.b.l(i10, androidx.compose.ui.focus.b.INSTANCE.e()) || !focusTargetNode.o2().getCanFocus() || e(focusTargetNode)) {
            return false;
        }
        return lVar.invoke(focusTargetNode).booleanValue();
    }
}
