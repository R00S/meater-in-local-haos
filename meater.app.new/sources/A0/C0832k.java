package A0;

import b0.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;
import y0.InterfaceC5116v;

/* compiled from: DelegatableNode.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\t*\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000e\u001a\u00020\r*\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \"\u0018\u0010#\u001a\u00020\t*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"LQ/b;", "Lb0/i$c;", "node", "Loa/F;", "c", "(LQ/b;Lb0/i$c;)V", "LA0/j;", "LA0/e0;", "type", "", "e", "(LA0/j;I)Z", "kind", "LA0/c0;", "h", "(LA0/j;I)LA0/c0;", "LA0/G;", "k", "(LA0/j;)LA0/G;", "LA0/m0;", "l", "(LA0/j;)LA0/m0;", "LU0/d;", "i", "(LA0/j;)LU0/d;", "Ly0/v;", "j", "(LA0/j;)Ly0/v;", "LA0/B;", "d", "(Lb0/i$c;)LA0/B;", "g", "(LQ/b;)Lb0/i$c;", "f", "(LA0/j;)Z", "isDelegationRoot", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Q.b<i.c> bVar, i.c cVar) {
        Q.b<G> bVarW0 = k(cVar).w0();
        int iV = bVarW0.getSize();
        if (iV > 0) {
            int i10 = iV - 1;
            G[] gArrT = bVarW0.t();
            do {
                bVar.c(gArrT[i10].getNodes().getHead());
                i10--;
            } while (i10 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final B d(i.c cVar) {
        if ((e0.a(2) & cVar.getKindSet()) != 0) {
            if (cVar instanceof B) {
                return (B) cVar;
            }
            if (cVar instanceof AbstractC0834m) {
                i.c cVarK2 = ((AbstractC0834m) cVar).getDelegate();
                while (cVarK2 != 0) {
                    if (cVarK2 instanceof B) {
                        return (B) cVarK2;
                    }
                    cVarK2 = (!(cVarK2 instanceof AbstractC0834m) || (e0.a(2) & cVarK2.getKindSet()) == 0) ? cVarK2.getChild() : ((AbstractC0834m) cVarK2).getDelegate();
                }
            }
        }
        return null;
    }

    public static final boolean e(InterfaceC0831j interfaceC0831j, int i10) {
        return (interfaceC0831j.getNode().getAggregateChildKindSet() & i10) != 0;
    }

    public static final boolean f(InterfaceC0831j interfaceC0831j) {
        return interfaceC0831j.getNode() == interfaceC0831j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.c g(Q.b<i.c> bVar) {
        if (bVar == null || bVar.x()) {
            return null;
        }
        return bVar.E(bVar.getSize() - 1);
    }

    public static final AbstractC0823c0 h(InterfaceC0831j interfaceC0831j, int i10) {
        AbstractC0823c0 coordinator = interfaceC0831j.getNode().getCoordinator();
        C3862t.d(coordinator);
        if (coordinator.r2() != interfaceC0831j || !f0.i(i10)) {
            return coordinator;
        }
        AbstractC0823c0 abstractC0823c0S2 = coordinator.getWrapped();
        C3862t.d(abstractC0823c0S2);
        return abstractC0823c0S2;
    }

    public static final U0.d i(InterfaceC0831j interfaceC0831j) {
        return k(interfaceC0831j).getDensity();
    }

    public static final InterfaceC5116v j(InterfaceC0831j interfaceC0831j) {
        if (!interfaceC0831j.getNode().getIsAttached()) {
            C5047a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        InterfaceC5116v interfaceC5116vW0 = h(interfaceC0831j, e0.a(2)).W0();
        if (!interfaceC5116vW0.L()) {
            C5047a.b("LayoutCoordinates is not attached.");
        }
        return interfaceC5116vW0;
    }

    public static final G k(InterfaceC0831j interfaceC0831j) {
        AbstractC0823c0 coordinator = interfaceC0831j.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        C5047a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final m0 l(InterfaceC0831j interfaceC0831j) {
        m0 m0VarN0 = k(interfaceC0831j).getOwner();
        if (m0VarN0 != null) {
            return m0VarN0;
        }
        C5047a.c("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }
}
