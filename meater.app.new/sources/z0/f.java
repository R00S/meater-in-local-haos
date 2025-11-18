package z0;

import A0.AbstractC0834m;
import A0.C0822c;
import A0.C0832k;
import A0.G;
import A0.e0;
import A0.m0;
import b0.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import x0.C5047a;

/* compiled from: ModifierLocalManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Lz0/f;", "", "LA0/m0;", "owner", "<init>", "(LA0/m0;)V", "Lb0/i$c;", "node", "Lz0/c;", "key", "", "LA0/c;", "set", "Loa/F;", "c", "(Lb0/i$c;Lz0/c;Ljava/util/Set;)V", "b", "()V", "e", "f", "(LA0/c;Lz0/c;)V", "a", "d", "LA0/m0;", "getOwner", "()LA0/m0;", "LQ/b;", "LQ/b;", "inserted", "insertedLocal", "LA0/G;", "removed", "removedLocal", "", "Z", "invalidated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m0 owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Q.b<C0822c> inserted = new Q.b<>(new C0822c[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Q.b<c<?>> insertedLocal = new Q.b<>(new c[16], 0);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Q.b<G> removed = new Q.b<>(new G[16], 0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Q.b<c<?>> removedLocal = new Q.b<>(new c[16], 0);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    /* compiled from: ModifierLocalManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {
        a() {
            super(0);
        }

        public final void a() {
            f.this.e();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public f(m0 m0Var) {
        this.owner = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Set, java.util.Set<A0.c>] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final void c(i.c node, c<?> key, Set<C0822c> set) {
        int iA = e0.a(32);
        if (!node.getNode().getIsAttached()) {
            C5047a.b("visitSubtreeIf called on an unattached node");
        }
        Q.b bVar = new Q.b(new i.c[16], 0);
        i.c child = node.getNode().getChild();
        if (child == null) {
            C0832k.c(bVar, node.getNode());
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
                            if (abstractC0834mG instanceof h) {
                                h hVar = (h) abstractC0834mG;
                                if (hVar instanceof C0822c) {
                                    C0822c c0822c = (C0822c) hVar;
                                    if ((c0822c.getElement() instanceof d) && c0822c.l2().contains(key)) {
                                        set.add(hVar);
                                    }
                                }
                                if (hVar.M0().a(key)) {
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

    public final void a(C0822c node, c<?> key) {
        this.inserted.c(node);
        this.insertedLocal.c(key);
        b();
    }

    public final void b() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.k(new a());
    }

    public final void d(C0822c node, c<?> key) {
        this.removed.c(C0832k.k(node));
        this.removedLocal.c(key);
        b();
    }

    public final void e() {
        int i10 = 0;
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        Q.b<G> bVar = this.removed;
        int size = bVar.getSize();
        if (size > 0) {
            G[] gArrT = bVar.t();
            int i11 = 0;
            do {
                G g10 = gArrT[i11];
                c<?> cVar = this.removedLocal.t()[i11];
                if (g10.getNodes().getHead().getIsAttached()) {
                    c(g10.getNodes().getHead(), cVar, hashSet);
                }
                i11++;
            } while (i11 < size);
        }
        this.removed.l();
        this.removedLocal.l();
        Q.b<C0822c> bVar2 = this.inserted;
        int size2 = bVar2.getSize();
        if (size2 > 0) {
            C0822c[] c0822cArrT = bVar2.t();
            do {
                C0822c c0822c = c0822cArrT[i10];
                c<?> cVar2 = this.insertedLocal.t()[i10];
                if (c0822c.getIsAttached()) {
                    c(c0822c, cVar2, hashSet);
                }
                i10++;
            } while (i10 < size2);
        }
        this.inserted.l();
        this.insertedLocal.l();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0822c) it.next()).r2();
        }
    }

    public final void f(C0822c node, c<?> key) {
        this.inserted.c(node);
        this.insertedLocal.c(key);
        b();
    }
}
