package A0;

import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: TraversableNode.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0012\u0010\u000e\u001a/\u0010\u0013\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"LA0/j;", "", "key", "LA0/A0;", "a", "(LA0/j;Ljava/lang/Object;)LA0/A0;", "T", "b", "(LA0/A0;)LA0/A0;", "Lkotlin/Function1;", "", "block", "Loa/F;", "c", "(LA0/j;Ljava/lang/Object;LBa/l;)V", "d", "(LA0/A0;LBa/l;)V", "LA0/z0;", "e", "f", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final A0 a(InterfaceC0831j interfaceC0831j, Object obj) {
        C0819a0 nodes;
        int iA = e0.a(262144);
        if (!interfaceC0831j.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = interfaceC0831j.getNode().getParent();
        G gK = C0832k.k(interfaceC0831j);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = parent;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A0) {
                                A0 a02 = (A0) abstractC0834mG;
                                if (C3862t.b(obj, a02.getTraverseKey())) {
                                    return a02;
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c delegate = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final <T extends A0> T b(T t10) {
        C0819a0 nodes;
        int iA = e0.a(262144);
        if (!t10.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = t10.getNode().getParent();
        G gK = C0832k.k(t10);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = parent;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A0) {
                                T t11 = (T) abstractC0834mG;
                                if (C3862t.b(t10.getTraverseKey(), t11.getTraverseKey()) && b0.b.a(t10, t11)) {
                                    return t11;
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c delegate = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b0.i$c] */
    public static final void c(InterfaceC0831j interfaceC0831j, Object obj, Ba.l<? super A0, Boolean> lVar) {
        C0819a0 nodes;
        int iA = e0.a(262144);
        if (!interfaceC0831j.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = interfaceC0831j.getNode().getParent();
        G gK = C0832k.k(interfaceC0831j);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = parent;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A0) {
                                A0 a02 = (A0) abstractC0834mG;
                                if (!(C3862t.b(obj, a02.getTraverseKey()) ? lVar.invoke(a02).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((abstractC0834mG.getKindSet() & iA) != 0) && (abstractC0834mG instanceof AbstractC0834m)) {
                                    i.c delegate = abstractC0834mG.getDelegate();
                                    int i10 = 0;
                                    abstractC0834mG = abstractC0834mG;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gK = gK.o0();
            parent = (gK == null || (nodes = gK.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b0.i$c] */
    public static final <T extends A0> void d(T t10, Ba.l<? super T, Boolean> lVar) {
        C0819a0 nodes;
        int iA = e0.a(262144);
        if (!t10.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = t10.getNode().getParent();
        G gK = C0832k.k(t10);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = parent;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            boolean zBooleanValue = true;
                            if (abstractC0834mG instanceof A0) {
                                A0 a02 = (A0) abstractC0834mG;
                                if (C3862t.b(t10.getTraverseKey(), a02.getTraverseKey()) && b0.b.a(t10, a02)) {
                                    zBooleanValue = lVar.invoke(a02).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((abstractC0834mG.getKindSet() & iA) != 0) && (abstractC0834mG instanceof AbstractC0834m)) {
                                    i.c delegate = abstractC0834mG.getDelegate();
                                    int i10 = 0;
                                    abstractC0834mG = abstractC0834mG;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gK = gK.o0();
            parent = (gK == null || (nodes = gK.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void e(InterfaceC0831j interfaceC0831j, Object obj, Ba.l<? super A0, ? extends z0> lVar) {
        int iA = e0.a(262144);
        if (!interfaceC0831j.getNode().getIsAttached()) {
            C5047a.b("visitSubtreeIf called on an unattached node");
        }
        Q.b bVar = new Q.b(new i.c[16], 0);
        i.c child = interfaceC0831j.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar, interfaceC0831j.getNode());
        } else {
            bVar.c(child);
        }
        while (bVar.y()) {
            i.c cVar = (i.c) bVar.E(bVar.getSize() - 1);
            if ((cVar.getAggregateChildKindSet() & iA) != 0) {
                for (i.c child2 = cVar; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = child2;
                        Q.b bVar2 = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A0) {
                                A0 a02 = (A0) abstractC0834mG;
                                z0 z0VarInvoke = C3862t.b(obj, a02.getTraverseKey()) ? lVar.invoke(a02) : z0.ContinueTraversal;
                                if (z0VarInvoke == z0.CancelTraversal) {
                                    return;
                                }
                                if (z0VarInvoke == z0.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c delegate = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC0834mG = delegate;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new Q.b(new i.c[16], 0);
                                            }
                                            if (abstractC0834mG != 0) {
                                                bVar2.c(abstractC0834mG);
                                                abstractC0834mG = 0;
                                            }
                                            bVar2.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC0834mG = abstractC0834mG;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar2);
                        }
                    }
                }
            }
            C0832k.c(bVar, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends A0> void f(T t10, Ba.l<? super T, ? extends z0> lVar) {
        int iA = e0.a(262144);
        if (!t10.getNode().getIsAttached()) {
            C5047a.b("visitSubtreeIf called on an unattached node");
        }
        Q.b bVar = new Q.b(new i.c[16], 0);
        i.c child = t10.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar, t10.getNode());
        } else {
            bVar.c(child);
        }
        while (bVar.y()) {
            i.c cVar = (i.c) bVar.E(bVar.getSize() - 1);
            if ((cVar.getAggregateChildKindSet() & iA) != 0) {
                for (i.c child2 = cVar; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = child2;
                        Q.b bVar2 = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A0) {
                                A0 a02 = (A0) abstractC0834mG;
                                z0 z0VarInvoke = (C3862t.b(t10.getTraverseKey(), a02.getTraverseKey()) && b0.b.a(t10, a02)) ? lVar.invoke(a02) : z0.ContinueTraversal;
                                if (z0VarInvoke == z0.CancelTraversal) {
                                    return;
                                }
                                if (z0VarInvoke == z0.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c delegate = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC0834mG = delegate;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new Q.b(new i.c[16], 0);
                                            }
                                            if (abstractC0834mG != 0) {
                                                bVar2.c(abstractC0834mG);
                                                abstractC0834mG = 0;
                                            }
                                            bVar2.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC0834mG = abstractC0834mG;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar2);
                        }
                    }
                }
            }
            C0832k.c(bVar, cVar);
        }
    }
}
