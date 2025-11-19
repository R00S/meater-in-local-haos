package androidx.compose.ui.focus;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.InterfaceC0829h;
import A0.V;
import A0.e0;
import A0.h0;
import A0.i0;
import b0.i;
import g0.s;
import g0.t;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import x0.C5047a;
import y0.C5104i;
import y0.InterfaceC5103h;

/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001*B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b$\u0010\u0007\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "LA0/h;", "Lg0/q;", "LA0/h0;", "Lz0/h;", "Lb0/i$c;", "<init>", "()V", "Loa/F;", "r2", "e1", "U1", "Landroidx/compose/ui/focus/g;", "o2", "()Landroidx/compose/ui/focus/g;", "n2", "v2", "", "O", "Z", "isProcessingCustomExit", "P", "isProcessingCustomEnter", "Lg0/p;", "Q", "Lg0/p;", "committedFocusState", "R", "O1", "()Z", "shouldAutoInvalidate", "value", "q2", "()Lg0/p;", "w2", "(Lg0/p;)V", "getFocusState$annotations", "focusState", "Ly0/h;", "p2", "()Ly0/h;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTargetNode extends i.c implements InterfaceC0829h, g0.q, h0, z0.h {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private g0.p committedFocusState;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22731a;

        static {
            int[] iArr = new int[g0.p.values().length];
            try {
                iArr[g0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.p.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22731a = iArr;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<g> f22732B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22733C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O<g> o10, FocusTargetNode focusTargetNode) {
            super(0);
            this.f22732B = o10;
            this.f22733C = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.g] */
        public final void a() {
            this.f22732B.f43978B = this.f22733C.o2();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    private final void r2() {
        if (u2(this)) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        t tVarD = s.d(this);
        try {
            if (tVarD.ongoingTransaction) {
                tVarD.g();
            }
            tVarD.f();
            w2((t2(this) && s2(this)) ? g0.p.ActiveParent : g0.p.Inactive);
            C4153F c4153f = C4153F.f46609a;
            tVarD.h();
        } catch (Throwable th) {
            tVarD.h();
            throw th;
        }
    }

    private static final boolean s2(FocusTargetNode focusTargetNode) {
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C5047a.b("visitSubtreeIf called on an unattached node");
        }
        Q.b bVar = new Q.b(new i.c[16], 0);
        i.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar, focusTargetNode.getNode());
        } else {
            bVar.c(child);
        }
        while (bVar.y()) {
            i.c cVar = (i.c) bVar.E(bVar.getSize() - 1);
            if ((cVar.getAggregateChildKindSet() & iA) != 0) {
                for (i.c child2 = cVar; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        i.c cVarG = child2;
                        Q.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (u2(focusTargetNode2)) {
                                    int i10 = a.f22731a[focusTargetNode2.q2().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i11 = 0;
                                for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new Q.b(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar2.c(cVarG);
                                                cVarG = null;
                                            }
                                            bVar2.c(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = C0832k.g(bVar2);
                        }
                    }
                }
            }
            C0832k.c(bVar, cVar);
        }
        return false;
    }

    private static final boolean t2(FocusTargetNode focusTargetNode) {
        C0819a0 nodes;
        int iA = e0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = focusTargetNode.getNode().getParent();
        G gK = C0832k.k(focusTargetNode);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        i.c cVarG = parent;
                        Q.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (u2(focusTargetNode2)) {
                                    int i10 = a.f22731a[focusTargetNode2.q2().ordinal()];
                                    if (i10 == 1 || i10 == 2) {
                                        return false;
                                    }
                                    if (i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
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
        return false;
    }

    private static final boolean u2(FocusTargetNode focusTargetNode) {
        return focusTargetNode.committedFocusState != null;
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // b0.i.c
    public void U1() {
        int i10 = a.f22731a[q2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C0832k.l(this).getFocusOwner().d(true, true, false, androidx.compose.ui.focus.b.INSTANCE.c());
            s.c(this);
        } else if (i10 == 3) {
            t tVarD = s.d(this);
            try {
                if (tVarD.ongoingTransaction) {
                    tVarD.g();
                }
                tVarD.f();
                w2(g0.p.Inactive);
                C4153F c4153f = C4153F.f46609a;
                tVarD.h();
            } catch (Throwable th) {
                tVarD.h();
                throw th;
            }
        }
        this.committedFocusState = null;
    }

    @Override // A0.h0
    public void e1() {
        g0.p pVarQ2 = q2();
        v2();
        if (pVarQ2 != q2()) {
            g0.d.c(this);
        }
    }

    public final void n2() {
        g0.p pVarI = s.d(this).i(this);
        if (pVarI != null) {
            this.committedFocusState = pVarI;
        } else {
            C5047a.c("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [b0.i$c] */
    public final g o2() {
        C0819a0 nodes;
        h hVar = new h();
        int iA = e0.a(2048);
        int iA2 = e0.a(1024);
        i.c node = getNode();
        int i10 = iA | iA2;
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c node2 = getNode();
        G gK = C0832k.k(this);
        loop0: while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            AbstractC0834m abstractC0834mG = node2;
                            Q.b bVar = null;
                            while (abstractC0834mG != 0) {
                                if (abstractC0834mG instanceof g0.j) {
                                    ((g0.j) abstractC0834mG).j0(hVar);
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
        return hVar;
    }

    public final InterfaceC5103h p2() {
        return (InterfaceC5103h) J(C5104i.a());
    }

    public g0.p q2() {
        g0.p pVarI;
        t tVarB = s.b(this);
        if (tVarB != null && (pVarI = tVarB.i(this)) != null) {
            return pVarI;
        }
        g0.p pVar = this.committedFocusState;
        return pVar == null ? g0.p.Inactive : pVar;
    }

    public final void v2() {
        g gVar;
        if (this.committedFocusState == null) {
            r2();
        }
        int i10 = a.f22731a[q2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            O o10 = new O();
            i0.a(this, new b(o10, this));
            T t10 = o10.f43978B;
            if (t10 == 0) {
                C3862t.u("focusProperties");
                gVar = null;
            } else {
                gVar = (g) t10;
            }
            if (gVar.getCanFocus()) {
                return;
            }
            C0832k.l(this).getFocusOwner().p(true);
        }
    }

    public void w2(g0.p pVar) {
        s.d(this).j(this, pVar);
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "LA0/V;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "p", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "Loa/F;", "s", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends V<FocusTargetNode> {

        /* renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f22730b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // A0.V
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode m() {
            return new FocusTargetNode();
        }

        @Override // A0.V
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void n(FocusTargetNode node) {
        }
    }
}
