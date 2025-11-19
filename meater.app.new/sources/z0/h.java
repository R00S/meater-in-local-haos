package z0;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.InterfaceC0831j;
import A0.e0;
import b0.i;
import kotlin.Metadata;
import x0.C5047a;

/* compiled from: ModifierLocalModifierNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lz0/h;", "Lz0/k;", "LA0/j;", "Lz0/g;", "M0", "()Lz0/g;", "providedValues", "T", "Lz0/c;", "J", "(Lz0/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h extends k, InterfaceC0831j {
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
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Q.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // z0.k
    default <T> T J(c<T> cVar) {
        C0819a0 nodes;
        if (!getNode().getIsAttached()) {
            C5047a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = e0.a(32);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = getNode().getParent();
        G gK = C0832k.k(this);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = parent;
                        ?? bVar = 0;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof h) {
                                h hVar = (h) abstractC0834mG;
                                if (hVar.M0().a(cVar)) {
                                    return (T) hVar.M0().b(cVar);
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c delegate = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                bVar = bVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            abstractC0834mG = delegate;
                                        } else {
                                            if (bVar == 0) {
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
                                    bVar = bVar;
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
        return cVar.a().invoke();
    }

    default g M0() {
        return b.f53324a;
    }
}
