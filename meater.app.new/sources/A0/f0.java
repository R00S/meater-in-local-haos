package A0;

import androidx.compose.ui.focus.FocusTargetNode;
import b0.i;
import f0.InterfaceC3306g;
import kotlin.Metadata;
import s.C4385G;
import u0.InterfaceC4621G;
import w0.InterfaceC4969a;
import x0.C5047a;
import y0.InterfaceC5091B;
import y0.InterfaceC5100e;

/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d\"\u001c\u0010\"\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lb0/i$b;", "element", "", "f", "(Lb0/i$b;)I", "Lb0/i$c;", "node", "g", "(Lb0/i$c;)I", "Loa/F;", "d", "(Lb0/i$c;)V", "a", "e", "remainingSet", "phase", "b", "(Lb0/i$c;II)V", "selfKindSet", "c", "Lg0/j;", "j", "(Lg0/j;)V", "", "k", "(Lg0/j;)Z", "h", "Ls/G;", "", "Ls/G;", "classToKindSetMap", "LA0/e0;", "i", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C4385G<Object> f602a = s.N.b();

    public static final void a(i.c cVar) {
        if (!cVar.getIsAttached()) {
            C5047a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(i.c cVar, int i10, int i11) {
        if (!(cVar instanceof AbstractC0834m)) {
            c(cVar, i10 & cVar.getKindSet(), i11);
            return;
        }
        AbstractC0834m abstractC0834m = (AbstractC0834m) cVar;
        c(cVar, abstractC0834m.getSelfKindSet() & i10, i11);
        int i12 = (~abstractC0834m.getSelfKindSet()) & i10;
        for (i.c cVarK2 = abstractC0834m.getDelegate(); cVarK2 != null; cVarK2 = cVarK2.getChild()) {
            b(cVarK2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(i.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((e0.a(2) & i10) != 0 && (cVar instanceof B)) {
                E.b((B) cVar);
                if (i11 == 2) {
                    C0832k.h(cVar, e0.a(2)).M2();
                }
            }
            if ((e0.a(128) & i10) != 0 && (cVar instanceof A) && i11 != 2) {
                C0832k.k(cVar).F0();
            }
            if ((e0.a(256) & i10) != 0 && (cVar instanceof InterfaceC0840t) && i11 != 2) {
                C0832k.k(cVar).G0();
            }
            if ((e0.a(4) & i10) != 0 && (cVar instanceof r)) {
                C0839s.a((r) cVar);
            }
            if ((e0.a(8) & i10) != 0 && (cVar instanceof v0)) {
                w0.b((v0) cVar);
            }
            if ((e0.a(64) & i10) != 0 && (cVar instanceof p0)) {
                q0.a((p0) cVar);
            }
            if ((e0.a(1024) & i10) != 0 && (cVar instanceof FocusTargetNode) && i11 != 2) {
                g0.s.c((FocusTargetNode) cVar);
            }
            if ((e0.a(2048) & i10) != 0 && (cVar instanceof g0.j)) {
                g0.j jVar = (g0.j) cVar;
                if (k(jVar)) {
                    if (i11 == 2) {
                        j(jVar);
                    } else {
                        g0.k.a(jVar);
                    }
                }
            }
            if ((i10 & e0.a(4096)) == 0 || !(cVar instanceof g0.c)) {
                return;
            }
            g0.d.b((g0.c) cVar);
        }
    }

    public static final void d(i.c cVar) {
        if (!cVar.getIsAttached()) {
            C5047a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(i.c cVar) {
        if (!cVar.getIsAttached()) {
            C5047a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(i.b bVar) {
        int iA = e0.a(1);
        if (bVar instanceof InterfaceC5091B) {
            iA |= e0.a(2);
        }
        if (bVar instanceof InterfaceC3306g) {
            iA |= e0.a(4);
        }
        if (bVar instanceof F0.n) {
            iA |= e0.a(8);
        }
        if (bVar instanceof InterfaceC4621G) {
            iA |= e0.a(16);
        }
        if ((bVar instanceof z0.d) || (bVar instanceof z0.j)) {
            iA |= e0.a(32);
        }
        if (bVar instanceof g0.b) {
            iA |= e0.a(4096);
        }
        if (bVar instanceof g0.h) {
            iA |= e0.a(2048);
        }
        if (bVar instanceof y0.S) {
            iA |= e0.a(256);
        }
        if (bVar instanceof y0.W) {
            iA |= e0.a(64);
        }
        return ((bVar instanceof y0.T) || (bVar instanceof y0.U)) ? iA | e0.a(128) : iA;
    }

    public static final int g(i.c cVar) {
        if (cVar.getKindSet() != 0) {
            return cVar.getKindSet();
        }
        C4385G<Object> c4385g = f602a;
        Object objB = b0.b.b(cVar);
        int iB = c4385g.b(objB);
        if (iB >= 0) {
            return c4385g.values[iB];
        }
        int iA = e0.a(1);
        if (cVar instanceof B) {
            iA |= e0.a(2);
        }
        if (cVar instanceof r) {
            iA |= e0.a(4);
        }
        if (cVar instanceof v0) {
            iA |= e0.a(8);
        }
        if (cVar instanceof s0) {
            iA |= e0.a(16);
        }
        if (cVar instanceof z0.h) {
            iA |= e0.a(32);
        }
        if (cVar instanceof p0) {
            iA |= e0.a(64);
        }
        if (cVar instanceof A) {
            iA |= e0.a(128);
        }
        if (cVar instanceof InterfaceC0840t) {
            iA |= e0.a(256);
        }
        if (cVar instanceof InterfaceC5100e) {
            iA |= e0.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA |= e0.a(1024);
        }
        if (cVar instanceof g0.j) {
            iA |= e0.a(2048);
        }
        if (cVar instanceof g0.c) {
            iA |= e0.a(4096);
        }
        if (cVar instanceof s0.e) {
            iA |= e0.a(8192);
        }
        if (cVar instanceof InterfaceC4969a) {
            iA |= e0.a(16384);
        }
        if (cVar instanceof InterfaceC0829h) {
            iA |= e0.a(32768);
        }
        if (cVar instanceof s0.g) {
            iA |= e0.a(131072);
        }
        int iA2 = cVar instanceof A0 ? e0.a(262144) | iA : iA;
        c4385g.s(objB, iA2);
        return iA2;
    }

    public static final int h(i.c cVar) {
        if (!(cVar instanceof AbstractC0834m)) {
            return g(cVar);
        }
        AbstractC0834m abstractC0834m = (AbstractC0834m) cVar;
        int iL2 = abstractC0834m.getSelfKindSet();
        for (i.c cVarK2 = abstractC0834m.getDelegate(); cVarK2 != null; cVarK2 = cVarK2.getChild()) {
            iL2 |= h(cVarK2);
        }
        return iL2;
    }

    public static final boolean i(int i10) {
        return (i10 & e0.a(128)) != 0;
    }

    private static final void j(g0.j jVar) {
        int iA = e0.a(1024);
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.b bVar = new Q.b(new i.c[16], 0);
        i.c child = jVar.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar, jVar.getNode());
        } else {
            bVar.c(child);
        }
        while (bVar.y()) {
            i.c cVarG = (i.c) bVar.E(bVar.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                C0832k.c(bVar, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.getKindSet() & iA) != 0) {
                        Q.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                g0.s.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                int i10 = 0;
                                for (i.c cVarK2 = ((AbstractC0834m) cVarG).getDelegate(); cVarK2 != null; cVarK2 = cVarK2.getChild()) {
                                    if ((cVarK2.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = cVarK2;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new Q.b(new i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar2.c(cVarG);
                                                cVarG = null;
                                            }
                                            bVar2.c(cVarK2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = C0832k.g(bVar2);
                        }
                    } else {
                        cVarG = cVarG.getChild();
                    }
                }
            }
        }
    }

    private static final boolean k(g0.j jVar) {
        C0826e c0826e = C0826e.f600a;
        c0826e.b();
        jVar.j0(c0826e);
        return c0826e.a();
    }
}
