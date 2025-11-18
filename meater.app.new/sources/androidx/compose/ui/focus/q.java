package androidx.compose.ui.focus;

import A0.AbstractC0834m;
import A0.C0832k;
import A0.InterfaceC0831j;
import A0.e0;
import androidx.compose.ui.focus.b;
import b0.i;
import h0.C3478i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import y0.InterfaceC5103h;

/* compiled from: TwoDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a>\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "direction", "Lh0/i;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ILh0/i;LBa/l;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILBa/l;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Lh0/i;ILBa/l;)Z", "r", "LA0/j;", "LQ/b;", "accessibleChildren", "Loa/F;", "i", "(LA0/j;LQ/b;)V", "focusRect", "j", "(LQ/b;Lh0/i;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(Lh0/i;Lh0/i;Lh0/i;I)Z", "source", "rect1", "rect2", "c", "s", "(Lh0/i;)Lh0/i;", "h", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22781a;

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
            f22781a = iArr;
        }
    }

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/h$a;", "", "a", "(Ly0/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<InterfaceC5103h.a, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22782B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3478i f22783C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f22784D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.l<FocusTargetNode, Boolean> f22785E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, C3478i c3478i, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f22782B = focusTargetNode;
            this.f22783C = c3478i;
            this.f22784D = i10;
            this.f22785E = lVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC5103h.a aVar) {
            boolean zR = q.r(this.f22782B, this.f22783C, this.f22784D, this.f22785E);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.q2() != g0.p.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = n.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(C3478i c3478i, C3478i c3478i2, C3478i c3478i3, int i10) {
        if (d(c3478i3, i10, c3478i) || !d(c3478i2, i10, c3478i)) {
            return false;
        }
        if (e(c3478i3, i10, c3478i)) {
            b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
            if (!androidx.compose.ui.focus.b.l(i10, companion.d()) && !androidx.compose.ui.focus.b.l(i10, companion.g()) && f(c3478i2, i10, c3478i) >= g(c3478i3, i10, c3478i)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(C3478i c3478i, int i10, C3478i c3478i2) {
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (!(androidx.compose.ui.focus.b.l(i10, companion.d()) ? true : androidx.compose.ui.focus.b.l(i10, companion.g()))) {
            if (!(androidx.compose.ui.focus.b.l(i10, companion.h()) ? true : androidx.compose.ui.focus.b.l(i10, companion.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c3478i.getRight() > c3478i2.getLeft() && c3478i.getLeft() < c3478i2.getRight()) {
                return true;
            }
        } else if (c3478i.getBottom() > c3478i2.getTop() && c3478i.getTop() < c3478i2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean e(C3478i c3478i, int i10, C3478i c3478i2) {
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.d())) {
            if (c3478i2.getLeft() < c3478i.getRight()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, companion.g())) {
            if (c3478i2.getRight() > c3478i.getLeft()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, companion.h())) {
            if (c3478i2.getTop() < c3478i.getBottom()) {
                return false;
            }
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c3478i2.getBottom() > c3478i.getTop()) {
                return false;
            }
        }
        return true;
    }

    private static final float f(C3478i c3478i, int i10, C3478i c3478i2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f10;
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (!androidx.compose.ui.focus.b.l(i10, companion.d())) {
            if (androidx.compose.ui.focus.b.l(i10, companion.g())) {
                top = c3478i.getLeft();
                bottom = c3478i2.getRight();
            } else if (androidx.compose.ui.focus.b.l(i10, companion.h())) {
                top2 = c3478i2.getTop();
                bottom2 = c3478i.getBottom();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = c3478i.getTop();
                bottom = c3478i2.getBottom();
            }
            f10 = top - bottom;
            return Math.max(0.0f, f10);
        }
        top2 = c3478i2.getLeft();
        bottom2 = c3478i.getRight();
        f10 = top2 - bottom2;
        return Math.max(0.0f, f10);
    }

    private static final float g(C3478i c3478i, int i10, C3478i c3478i2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f10;
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (!androidx.compose.ui.focus.b.l(i10, companion.d())) {
            if (androidx.compose.ui.focus.b.l(i10, companion.g())) {
                bottom = c3478i.getRight();
                bottom2 = c3478i2.getRight();
            } else if (androidx.compose.ui.focus.b.l(i10, companion.h())) {
                top = c3478i2.getTop();
                top2 = c3478i.getTop();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = c3478i.getBottom();
                bottom2 = c3478i2.getBottom();
            }
            f10 = bottom - bottom2;
            return Math.max(1.0f, f10);
        }
        top = c3478i2.getLeft();
        top2 = c3478i.getLeft();
        f10 = top - top2;
        return Math.max(1.0f, f10);
    }

    private static final C3478i h(C3478i c3478i) {
        return new C3478i(c3478i.getRight(), c3478i.getBottom(), c3478i.getRight(), c3478i.getBottom());
    }

    private static final void i(InterfaceC0831j interfaceC0831j, Q.b<FocusTargetNode> bVar) {
        int iA = e0.a(1024);
        if (!interfaceC0831j.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.b bVar2 = new Q.b(new i.c[16], 0);
        i.c child = interfaceC0831j.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar2, interfaceC0831j.getNode());
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
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                                if (focusTargetNode.getIsAttached() && !C0832k.k(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.o2().getCanFocus()) {
                                        bVar.c(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, bVar);
                                    }
                                }
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
    }

    private static final FocusTargetNode j(Q.b<FocusTargetNode> bVar, C3478i c3478i, int i10) {
        C3478i c3478iP;
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.d())) {
            c3478iP = c3478i.p(c3478i.k() + 1, 0.0f);
        } else if (androidx.compose.ui.focus.b.l(i10, companion.g())) {
            c3478iP = c3478i.p(-(c3478i.k() + 1), 0.0f);
        } else if (androidx.compose.ui.focus.b.l(i10, companion.h())) {
            c3478iP = c3478i.p(0.0f, c3478i.e() + 1);
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c3478iP = c3478i.p(0.0f, -(c3478i.e() + 1));
        }
        int size = bVar.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] focusTargetNodeArrT = bVar.t();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = focusTargetNodeArrT[i11];
                if (n.g(focusTargetNode2)) {
                    C3478i c3478iD = n.d(focusTargetNode2);
                    if (m(c3478iD, c3478iP, c3478i, i10)) {
                        focusTargetNode = focusTargetNode2;
                        c3478iP = c3478iD;
                    }
                }
                i11++;
            } while (i11 < size);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        C3478i c3478iH;
        Q.b bVar = new Q.b(new FocusTargetNode[16], 0);
        i(focusTargetNode, bVar);
        if (bVar.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (bVar.x() ? null : bVar.t()[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.b())) {
            i10 = companion.g();
        }
        if (androidx.compose.ui.focus.b.l(i10, companion.g()) ? true : androidx.compose.ui.focus.b.l(i10, companion.a())) {
            c3478iH = s(n.d(focusTargetNode));
        } else {
            if (!(androidx.compose.ui.focus.b.l(i10, companion.d()) ? true : androidx.compose.ui.focus.b.l(i10, companion.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c3478iH = h(n.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(bVar, c3478iH, i10);
        if (focusTargetNodeJ != null) {
            return lVar.invoke(focusTargetNodeJ).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, C3478i c3478i, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        if (r(focusTargetNode, c3478i, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, c3478i, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(C3478i c3478i, C3478i c3478i2, C3478i c3478i3, int i10) {
        if (n(c3478i, i10, c3478i3)) {
            return !n(c3478i2, i10, c3478i3) || c(c3478i3, c3478i, c3478i2, i10) || (!c(c3478i3, c3478i2, c3478i, i10) && q(i10, c3478i3, c3478i) < q(i10, c3478i3, c3478i2));
        }
        return false;
    }

    private static final boolean n(C3478i c3478i, int i10, C3478i c3478i2) {
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.d())) {
            if ((c3478i2.getRight() <= c3478i.getRight() && c3478i2.getLeft() < c3478i.getRight()) || c3478i2.getLeft() <= c3478i.getLeft()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, companion.g())) {
            if ((c3478i2.getLeft() >= c3478i.getLeft() && c3478i2.getRight() > c3478i.getLeft()) || c3478i2.getRight() >= c3478i.getRight()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, companion.h())) {
            if ((c3478i2.getBottom() <= c3478i.getBottom() && c3478i2.getTop() < c3478i.getBottom()) || c3478i2.getTop() <= c3478i.getTop()) {
                return false;
            }
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if ((c3478i2.getTop() >= c3478i.getTop() && c3478i2.getBottom() > c3478i.getTop()) || c3478i2.getBottom() >= c3478i.getBottom()) {
                return false;
            }
        }
        return true;
    }

    private static final float o(C3478i c3478i, int i10, C3478i c3478i2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f10;
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (!androidx.compose.ui.focus.b.l(i10, companion.d())) {
            if (androidx.compose.ui.focus.b.l(i10, companion.g())) {
                top = c3478i.getLeft();
                bottom = c3478i2.getRight();
            } else if (androidx.compose.ui.focus.b.l(i10, companion.h())) {
                top2 = c3478i2.getTop();
                bottom2 = c3478i.getBottom();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = c3478i.getTop();
                bottom = c3478i2.getBottom();
            }
            f10 = top - bottom;
            return Math.max(0.0f, f10);
        }
        top2 = c3478i2.getLeft();
        bottom2 = c3478i.getRight();
        f10 = top2 - bottom2;
        return Math.max(0.0f, f10);
    }

    private static final float p(C3478i c3478i, int i10, C3478i c3478i2) {
        float f10;
        float left;
        float left2;
        float fK;
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(i10, companion.d()) ? true : androidx.compose.ui.focus.b.l(i10, companion.g())) {
            f10 = 2;
            left = c3478i2.getTop() + (c3478i2.e() / f10);
            left2 = c3478i.getTop();
            fK = c3478i.e();
        } else {
            if (!(androidx.compose.ui.focus.b.l(i10, companion.h()) ? true : androidx.compose.ui.focus.b.l(i10, companion.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = 2;
            left = c3478i2.getLeft() + (c3478i2.k() / f10);
            left2 = c3478i.getLeft();
            fK = c3478i.k();
        }
        return left - (left2 + (fK / f10));
    }

    private static final long q(int i10, C3478i c3478i, C3478i c3478i2) {
        long jAbs = (long) Math.abs(o(c3478i2, i10, c3478i));
        long jAbs2 = (long) Math.abs(p(c3478i2, i10, c3478i));
        return (13 * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, C3478i c3478i, int i10, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode focusTargetNodeJ;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.getIsAttached()) {
                                    bVar.c(focusTargetNode2);
                                }
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
        while (bVar.y() && (focusTargetNodeJ = j(bVar, c3478i, i10)) != null) {
            if (focusTargetNodeJ.o2().getCanFocus()) {
                return lVar.invoke(focusTargetNodeJ).booleanValue();
            }
            if (l(focusTargetNodeJ, c3478i, i10, lVar)) {
                return true;
            }
            bVar.B(focusTargetNodeJ);
        }
        return false;
    }

    private static final C3478i s(C3478i c3478i) {
        return new C3478i(c3478i.getLeft(), c3478i.getTop(), c3478i.getLeft(), c3478i.getTop());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, C3478i c3478i, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        g0.p pVarQ2 = focusTargetNode.q2();
        int[] iArr = a.f22781a;
        int i11 = iArr[pVarQ2.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i10, lVar));
            }
            if (i11 == 4) {
                return focusTargetNode.o2().getCanFocus() ? lVar.invoke(focusTargetNode) : c3478i == null ? Boolean.valueOf(k(focusTargetNode, i10, lVar)) : Boolean.valueOf(r(focusTargetNode, c3478i, i10, lVar));
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode focusTargetNodeF = n.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[focusTargetNodeF.q2().ordinal()];
        if (i12 == 1) {
            Boolean boolT = t(focusTargetNodeF, i10, c3478i, lVar);
            if (!C3862t.b(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (c3478i == null) {
                c3478i = n.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, c3478i, i10, lVar));
        }
        if (i12 == 2 || i12 == 3) {
            if (c3478i == null) {
                c3478i = n.d(focusTargetNodeF);
            }
            return Boolean.valueOf(l(focusTargetNode, c3478i, i10, lVar));
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
