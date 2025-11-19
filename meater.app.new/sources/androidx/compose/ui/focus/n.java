package androidx.compose.ui.focus;

import A0.AbstractC0823c0;
import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.e0;
import U0.t;
import androidx.compose.ui.focus.b;
import b0.i;
import h0.C3478i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import y0.C5117w;

/* compiled from: FocusTraversal.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "focusDirection", "LU0/t;", "layoutDirection", "Landroidx/compose/ui/focus/k;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILU0/t;)Landroidx/compose/ui/focus/k;", "Lh0/i;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;ILU0/t;Lh0/i;LBa/l;)Ljava/lang/Boolean;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Lh0/i;", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22773a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22774b;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22773a = iArr;
            int[] iArr2 = new int[g0.p.values().length];
            try {
                iArr2[g0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g0.p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g0.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f22774b = iArr2;
        }
    }

    public static final k a(FocusTargetNode focusTargetNode, int i10, t tVar) {
        k end;
        g gVarO2 = focusTargetNode.o2();
        b.Companion companion = b.INSTANCE;
        if (b.l(i10, companion.e())) {
            return gVarO2.getNext();
        }
        if (b.l(i10, companion.f())) {
            return gVarO2.getPrevious();
        }
        if (b.l(i10, companion.h())) {
            return gVarO2.getUp();
        }
        if (b.l(i10, companion.a())) {
            return gVarO2.getDown();
        }
        if (b.l(i10, companion.d())) {
            int i11 = a.f22773a[tVar.ordinal()];
            if (i11 == 1) {
                end = gVarO2.getStart();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = gVarO2.getEnd();
            }
            if (end == k.INSTANCE.b()) {
                end = null;
            }
            if (end == null) {
                return gVarO2.getLeft();
            }
        } else {
            if (!b.l(i10, companion.g())) {
                if (b.l(i10, companion.b())) {
                    return gVarO2.z().invoke(b.i(i10));
                }
                if (b.l(i10, companion.c())) {
                    return gVarO2.u().invoke(b.i(i10));
                }
                throw new IllegalStateException("invalid FocusDirection");
            }
            int i12 = a.f22773a[tVar.ordinal()];
            if (i12 == 1) {
                end = gVarO2.getEnd();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = gVarO2.getStart();
            }
            if (end == k.INSTANCE.b()) {
                end = null;
            }
            if (end == null) {
                return gVarO2.getRight();
            }
        }
        return end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            g0.p r0 = r10.q2()
            int[] r1 = androidx.compose.ui.focus.n.a.f22774b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Ld3
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L20
            r1 = 3
            if (r0 == r1) goto Ld3
            r10 = 4
            if (r0 != r10) goto L1a
            return r3
        L1a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L20:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = A0.e0.a(r0)
            b0.i$c r2 = r10.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto Lcb
            Q.b r2 = new Q.b
            r4 = 16
            b0.i$c[] r5 = new b0.i.c[r4]
            r6 = 0
            r2.<init>(r5, r6)
            b0.i$c r5 = r10.getNode()
            b0.i$c r5 = r5.getChild()
            if (r5 != 0) goto L4c
            b0.i$c r10 = r10.getNode()
            A0.C0832k.a(r2, r10)
            goto L4f
        L4c:
            r2.c(r5)
        L4f:
            boolean r10 = r2.y()
            if (r10 == 0) goto Lca
            int r10 = r2.getSize()
            int r10 = r10 - r1
            java.lang.Object r10 = r2.E(r10)
            b0.i$c r10 = (b0.i.c) r10
            int r5 = r10.getAggregateChildKindSet()
            r5 = r5 & r0
            if (r5 != 0) goto L6b
            A0.C0832k.a(r2, r10)
            goto L4f
        L6b:
            if (r10 == 0) goto L4f
            int r5 = r10.getKindSet()
            r5 = r5 & r0
            if (r5 == 0) goto Lc5
            r5 = r3
        L75:
            if (r10 == 0) goto L4f
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L84
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusTargetNode r10 = b(r10)
            if (r10 == 0) goto Lc0
            return r10
        L84:
            int r7 = r10.getKindSet()
            r7 = r7 & r0
            if (r7 == 0) goto Lc0
            boolean r7 = r10 instanceof A0.AbstractC0834m
            if (r7 == 0) goto Lc0
            r7 = r10
            A0.m r7 = (A0.AbstractC0834m) r7
            b0.i$c r7 = r7.getDelegate()
            r8 = r6
        L97:
            if (r7 == 0) goto Lbd
            int r9 = r7.getKindSet()
            r9 = r9 & r0
            if (r9 == 0) goto Lb8
            int r8 = r8 + 1
            if (r8 != r1) goto La6
            r10 = r7
            goto Lb8
        La6:
            if (r5 != 0) goto Laf
            Q.b r5 = new Q.b
            b0.i$c[] r9 = new b0.i.c[r4]
            r5.<init>(r9, r6)
        Laf:
            if (r10 == 0) goto Lb5
            r5.c(r10)
            r10 = r3
        Lb5:
            r5.c(r7)
        Lb8:
            b0.i$c r7 = r7.getChild()
            goto L97
        Lbd:
            if (r8 != r1) goto Lc0
            goto L75
        Lc0:
            b0.i$c r10 = A0.C0832k.b(r5)
            goto L75
        Lc5:
            b0.i$c r10 = r10.getChild()
            goto L6b
        Lca:
            return r3
        Lcb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        Ld3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.n.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
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
                                if (focusTargetNode2.o2().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
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
        return null;
    }

    public static final C3478i d(FocusTargetNode focusTargetNode) {
        C3478i c3478iM;
        AbstractC0823c0 coordinator = focusTargetNode.getCoordinator();
        return (coordinator == null || (c3478iM = C5117w.d(coordinator).M(coordinator, false)) == null) ? C3478i.INSTANCE.a() : c3478iM;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i10, t tVar, C3478i c3478i, Ba.l<? super FocusTargetNode, Boolean> lVar) {
        int iG;
        b.Companion companion = b.INSTANCE;
        if (b.l(i10, companion.e()) ? true : b.l(i10, companion.f())) {
            return Boolean.valueOf(p.f(focusTargetNode, i10, lVar));
        }
        if (b.l(i10, companion.d()) ? true : b.l(i10, companion.g()) ? true : b.l(i10, companion.h()) ? true : b.l(i10, companion.a())) {
            return q.t(focusTargetNode, i10, c3478i, lVar);
        }
        if (!b.l(i10, companion.b())) {
            if (b.l(i10, companion.c())) {
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                return Boolean.valueOf((focusTargetNodeC == null || C3862t.b(focusTargetNodeC, focusTargetNode)) ? false : lVar.invoke(focusTargetNodeC).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.n(i10))).toString());
        }
        int i11 = a.f22773a[tVar.ordinal()];
        if (i11 == 1) {
            iG = companion.g();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iG = companion.d();
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        if (focusTargetNodeB2 != null) {
            return q.t(focusTargetNodeB2, iG, c3478i, lVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            b0.i$c r0 = r10.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = A0.e0.a(r0)
            b0.i$c r2 = r10.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto Ld1
            Q.b r2 = new Q.b
            r3 = 16
            b0.i$c[] r4 = new b0.i.c[r3]
            r5 = 0
            r2.<init>(r4, r5)
            b0.i$c r4 = r10.getNode()
            b0.i$c r4 = r4.getChild()
            if (r4 != 0) goto L38
            b0.i$c r10 = r10.getNode()
            A0.C0832k.a(r2, r10)
            goto L3b
        L38:
            r2.c(r4)
        L3b:
            boolean r10 = r2.y()
            if (r10 == 0) goto Ld0
            int r10 = r2.getSize()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.E(r10)
            b0.i$c r10 = (b0.i.c) r10
            int r6 = r10.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L58
            A0.C0832k.a(r2, r10)
            goto L3b
        L58:
            if (r10 == 0) goto L3b
            int r6 = r10.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Lcb
            r6 = r1
        L62:
            if (r10 == 0) goto L3b
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8a
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            b0.i$c r7 = r10.getNode()
            boolean r7 = r7.getIsAttached()
            if (r7 == 0) goto Lc6
            g0.p r7 = r10.q2()
            int[] r8 = androidx.compose.ui.focus.n.a.f22774b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L89
            r8 = 2
            if (r7 == r8) goto L89
            r8 = 3
            if (r7 == r8) goto L89
            goto Lc6
        L89:
            return r10
        L8a:
            int r7 = r10.getKindSet()
            r7 = r7 & r0
            if (r7 == 0) goto Lc6
            boolean r7 = r10 instanceof A0.AbstractC0834m
            if (r7 == 0) goto Lc6
            r7 = r10
            A0.m r7 = (A0.AbstractC0834m) r7
            b0.i$c r7 = r7.getDelegate()
            r8 = r5
        L9d:
            if (r7 == 0) goto Lc3
            int r9 = r7.getKindSet()
            r9 = r9 & r0
            if (r9 == 0) goto Lbe
            int r8 = r8 + 1
            if (r8 != r4) goto Lac
            r10 = r7
            goto Lbe
        Lac:
            if (r6 != 0) goto Lb5
            Q.b r6 = new Q.b
            b0.i$c[] r9 = new b0.i.c[r3]
            r6.<init>(r9, r5)
        Lb5:
            if (r10 == 0) goto Lbb
            r6.c(r10)
            r10 = r1
        Lbb:
            r6.c(r7)
        Lbe:
            b0.i$c r7 = r7.getChild()
            goto L9d
        Lc3:
            if (r8 != r4) goto Lc6
            goto L62
        Lc6:
            b0.i$c r10 = A0.C0832k.b(r6)
            goto L62
        Lcb:
            b0.i$c r10 = r10.getChild()
            goto L58
        Ld0:
            return r1
        Ld1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.n.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        G layoutNode;
        AbstractC0823c0 coordinator;
        G layoutNode2;
        AbstractC0823c0 coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.o() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.K0()) ? false : true;
    }
}
