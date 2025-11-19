package androidx.compose.ui.focus;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.e0;
import A0.i0;
import androidx.compose.ui.focus.k;
import b0.i;
import g0.EnumC3376a;
import g0.s;
import g0.t;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0003\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "Landroidx/compose/ui/focus/b;", "focusDirection", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;", "i", "forced", "refreshFocusEvents", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "d", "a", "childNode", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "m", "n", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Lg0/a;", "h", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Lg0/a;", "e", "f", "g", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22769a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22770b;

        static {
            int[] iArr = new int[EnumC3376a.values().length];
            try {
                iArr[EnumC3376a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3376a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3376a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3376a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22769a = iArr;
            int[] iArr2 = new int[g0.p.values().length];
            try {
                iArr2[g0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g0.p.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g0.p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f22770b = iArr2;
        }
    }

    /* compiled from: FocusTransactions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22771B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f22771B = focusTargetNode;
        }

        public final void a() {
            this.f22771B.o2();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: FocusTransactions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22772B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusTargetNode focusTargetNode) {
            super(0);
            this.f22772B = focusTargetNode;
        }

        public final void a() {
            if (this.f22772B.getNode().getIsAttached()) {
                g0.d.c(this.f22772B);
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode focusTargetNodeF = n.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.f22770b[focusTargetNode.q2().ordinal()];
        if (i10 == 1) {
            focusTargetNode.w2(g0.p.Inactive);
            if (z11) {
                g0.d.c(focusTargetNode);
            }
        } else {
            if (i10 == 2) {
                if (!z10) {
                    return z10;
                }
                focusTargetNode.w2(g0.p.Inactive);
                if (!z11) {
                    return z10;
                }
                g0.d.c(focusTargetNode);
                return z10;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!a(focusTargetNode, z10, z11)) {
                    return false;
                }
                focusTargetNode.w2(g0.p.Inactive);
                if (z11) {
                    g0.d.c(focusTargetNode);
                }
            }
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        i0.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f22770b[focusTargetNode.q2().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        focusTargetNode.w2(g0.p.Active);
        return true;
    }

    public static final EnumC3376a e(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f22770b[focusTargetNode.q2().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return EnumC3376a.Cancelled;
            }
            if (i11 == 3) {
                EnumC3376a enumC3376aE = e(n(focusTargetNode), i10);
                if (enumC3376aE == EnumC3376a.None) {
                    enumC3376aE = null;
                }
                return enumC3376aE == null ? g(focusTargetNode, i10) : enumC3376aE;
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EnumC3376a.None;
    }

    private static final EnumC3376a f(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                k kVarInvoke = focusTargetNode.o2().z().invoke(androidx.compose.ui.focus.b.i(i10));
                k.Companion companion = k.INSTANCE;
                if (kVarInvoke != companion.b()) {
                    if (kVarInvoke == companion.a()) {
                        return EnumC3376a.Cancelled;
                    }
                    return kVarInvoke.d() ? EnumC3376a.Redirected : EnumC3376a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return EnumC3376a.None;
    }

    private static final EnumC3376a g(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                k kVarInvoke = focusTargetNode.o2().u().invoke(androidx.compose.ui.focus.b.i(i10));
                k.Companion companion = k.INSTANCE;
                if (kVarInvoke != companion.b()) {
                    if (kVarInvoke == companion.a()) {
                        return EnumC3376a.Cancelled;
                    }
                    return kVarInvoke.d() ? EnumC3376a.Redirected : EnumC3376a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return EnumC3376a.None;
    }

    public static final EnumC3376a h(FocusTargetNode focusTargetNode, int i10) {
        i.c cVarG;
        C0819a0 nodes;
        int i11 = a.f22770b[focusTargetNode.q2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return EnumC3376a.None;
        }
        if (i11 == 3) {
            return e(n(focusTargetNode), i10);
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
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
                                int i12 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        if (focusTargetNode2 == null) {
            return EnumC3376a.None;
        }
        int i13 = a.f22770b[focusTargetNode2.q2().ordinal()];
        if (i13 == 1) {
            return f(focusTargetNode2, i10);
        }
        if (i13 == 2) {
            return EnumC3376a.Cancelled;
        }
        if (i13 == 3) {
            return h(focusTargetNode2, i10);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC3376a enumC3376aH = h(focusTargetNode2, i10);
        EnumC3376a enumC3376a = enumC3376aH != EnumC3376a.None ? enumC3376aH : null;
        return enumC3376a == null ? f(focusTargetNode2, i10) : enumC3376a;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.m.i(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        Boolean boolK = k(focusTargetNode, androidx.compose.ui.focus.b.INSTANCE.b());
        if (boolK != null) {
            return boolK.booleanValue();
        }
        return false;
    }

    public static final Boolean k(FocusTargetNode focusTargetNode, int i10) {
        Boolean boolValueOf;
        t tVarD = s.d(focusTargetNode);
        c cVar = new c(focusTargetNode);
        try {
            if (tVarD.ongoingTransaction) {
                tVarD.g();
            }
            tVarD.f();
            tVarD.cancellationListener.c(cVar);
            int i11 = a.f22769a[h(focusTargetNode, i10).ordinal()];
            if (i11 == 1) {
                boolValueOf = Boolean.valueOf(i(focusTargetNode));
            } else if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.TRUE;
            }
            return boolValueOf;
        } finally {
            tVarD.h();
        }
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        i.c cVar;
        i.c cVarG;
        C0819a0 nodes;
        C0819a0 nodes2;
        int iA = e0.a(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = focusTargetNode2.getNode().getParent();
        G gK = C0832k.k(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
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
            parent = (gK == null || (nodes2 = gK.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!C3862t.b(cVarG, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i11 = a.f22770b[focusTargetNode.q2().ordinal()];
        if (i11 == 1) {
            boolean zD = d(focusTargetNode2);
            if (!zD) {
                return zD;
            }
            focusTargetNode.w2(g0.p.ActiveParent);
            return zD;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                n(focusTargetNode);
                if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                    return true;
                }
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iA2 = e0.a(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                i.c parent2 = focusTargetNode.getNode().getParent();
                G gK2 = C0832k.k(focusTargetNode);
                loop4: while (true) {
                    if (gK2 == null) {
                        break;
                    }
                    if ((gK2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iA2) != 0) {
                                i.c cVarG2 = parent2;
                                Q.b bVar2 = null;
                                while (cVarG2 != null) {
                                    if (cVarG2 instanceof FocusTargetNode) {
                                        cVar = cVarG2;
                                        break loop4;
                                    }
                                    if ((cVarG2.getKindSet() & iA2) != 0 && (cVarG2 instanceof AbstractC0834m)) {
                                        int i12 = 0;
                                        for (i.c delegate2 = ((AbstractC0834m) cVarG2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iA2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVarG2 = delegate2;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new Q.b(new i.c[16], 0);
                                                    }
                                                    if (cVarG2 != null) {
                                                        bVar2.c(cVarG2);
                                                        cVarG2 = null;
                                                    }
                                                    bVar2.c(delegate2);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVarG2 = C0832k.g(bVar2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    gK2 = gK2.o0();
                    parent2 = (gK2 == null || (nodes = gK2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && m(focusTargetNode)) {
                    boolean zD2 = d(focusTargetNode2);
                    if (!zD2) {
                        return zD2;
                    }
                    focusTargetNode.w2(g0.p.ActiveParent);
                    return zD2;
                }
                if (focusTargetNode3 != null && l(focusTargetNode3, focusTargetNode)) {
                    boolean zL = l(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.q2() != g0.p.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if (!zL) {
                        return zL;
                    }
                    g0.d.c(focusTargetNode3);
                    return zL;
                }
            }
        }
        return false;
    }

    private static final boolean m(FocusTargetNode focusTargetNode) {
        return C0832k.l(focusTargetNode).getFocusOwner().j(null, null);
    }

    private static final FocusTargetNode n(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = n.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
