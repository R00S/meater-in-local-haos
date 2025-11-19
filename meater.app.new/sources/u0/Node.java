package u0;

import A0.AbstractC0834m;
import A0.C0832k;
import A0.e0;
import A0.s0;
import b0.i;
import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s.C4386H;
import s.C4411v;
import v0.C4790b;
import y0.InterfaceC5116v;

/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010:¨\u0006>"}, d2 = {"Lu0/l;", "Lu0/m;", "Lb0/i$c;", "modifierNode", "<init>", "(Lb0/i$c;)V", "Lu0/o;", "oldEvent", "newEvent", "", "m", "(Lu0/o;Lu0/o;)Z", "Loa/F;", "j", "()V", "", "pointerIdValue", "Ls/H;", "hitNodes", "i", "(JLs/H;)V", "Ls/v;", "Lu0/z;", "changes", "Ly0/v;", "parentCoordinates", "Lu0/g;", "internalPointerEvent", "isInBounds", "f", "(Ls/v;Ly0/v;Lu0/g;Z)Z", "e", "(Lu0/g;)Z", "a", "d", "n", "b", "(Lu0/g;)V", "", "toString", "()Ljava/lang/String;", "c", "Lb0/i$c;", "k", "()Lb0/i$c;", "Lv0/b;", "Lv0/b;", "l", "()Lv0/b;", "pointerIds", "Ls/v;", "relevantChanges", "Ly0/v;", "coordinates", "g", "Lu0/o;", "pointerEvent", "h", "Z", "wasIn", "isIn", "hasExited", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.l, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class Node extends C4647m {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.c pointerInputFilter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5116v coordinates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C4649o pointerEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasIn;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C4790b pointerIds = new C4790b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4411v<PointerInputChange> relevantChanges = new C4411v<>(2);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isIn = true;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hasExited = true;

    public Node(i.c cVar) {
        this.pointerInputFilter = cVar;
    }

    private final void j() {
        this.relevantChanges.b();
        this.coordinates = null;
    }

    private final boolean m(C4649o oldEvent, C4649o newEvent) {
        if (oldEvent == null || oldEvent.c().size() != newEvent.c().size()) {
            return true;
        }
        int size = newEvent.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!C3476g.j(oldEvent.c().get(i10).getPosition(), newEvent.c().get(i10).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /* JADX WARN: Type inference failed for: r5v2, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.i$c] */
    @Override // u0.C4647m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(s.C4411v<u0.PointerInputChange> r37, y0.InterfaceC5116v r38, u0.C4641g r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.Node.a(s.v, y0.v, u0.g, boolean):boolean");
    }

    @Override // u0.C4647m
    public void b(C4641g internalPointerEvent) {
        super.b(internalPointerEvent);
        C4649o c4649o = this.pointerEvent;
        if (c4649o == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> listC = c4649o.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = listC.get(i10);
            boolean pressed = pointerInputChange.getPressed();
            boolean zA = internalPointerEvent.a(pointerInputChange.getId());
            boolean z10 = this.isIn;
            if ((!pressed && !zA) || (!pressed && !z10)) {
                this.pointerIds.i(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = C4652r.i(c4649o.getType(), C4652r.INSTANCE.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // u0.C4647m
    public void d() {
        Q.b<Node> bVarG = g();
        int size = bVarG.getSize();
        if (size > 0) {
            Node[] nodeArrT = bVarG.t();
            int i10 = 0;
            do {
                nodeArrT[i10].d();
                i10++;
            } while (i10 < size);
        }
        AbstractC0834m abstractC0834mG = this.pointerInputFilter;
        int iA = e0.a(16);
        Q.b bVar = null;
        while (abstractC0834mG != 0) {
            if (abstractC0834mG instanceof s0) {
                ((s0) abstractC0834mG).w0();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // u0.C4647m
    public boolean e(C4641g internalPointerEvent) {
        Q.b<Node> bVarG;
        int size;
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (!this.relevantChanges.h() && this.pointerInputFilter.getIsAttached()) {
            C4649o c4649o = this.pointerEvent;
            C3862t.d(c4649o);
            InterfaceC5116v interfaceC5116v = this.coordinates;
            C3862t.d(interfaceC5116v);
            long jA = interfaceC5116v.a();
            AbstractC0834m abstractC0834mG = this.pointerInputFilter;
            int iA = e0.a(16);
            Q.b bVar = null;
            while (abstractC0834mG != 0) {
                if (abstractC0834mG instanceof s0) {
                    ((s0) abstractC0834mG).t0(c4649o, EnumC4651q.Final, jA);
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
            if (this.pointerInputFilter.getIsAttached() && (size = (bVarG = g()).getSize()) > 0) {
                Node[] nodeArrT = bVarG.t();
                do {
                    nodeArrT[i10].e(internalPointerEvent);
                    i10++;
                } while (i10 < size);
            }
            z10 = true;
        }
        b(internalPointerEvent);
        j();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // u0.C4647m
    public boolean f(C4411v<PointerInputChange> changes, InterfaceC5116v parentCoordinates, C4641g internalPointerEvent, boolean isInBounds) {
        Q.b<Node> bVarG;
        int size;
        if (this.relevantChanges.h() || !this.pointerInputFilter.getIsAttached()) {
            return false;
        }
        C4649o c4649o = this.pointerEvent;
        C3862t.d(c4649o);
        InterfaceC5116v interfaceC5116v = this.coordinates;
        C3862t.d(interfaceC5116v);
        long jA = interfaceC5116v.a();
        AbstractC0834m abstractC0834mG = this.pointerInputFilter;
        int iA = e0.a(16);
        Q.b bVar = null;
        while (abstractC0834mG != 0) {
            if (abstractC0834mG instanceof s0) {
                ((s0) abstractC0834mG).t0(c4649o, EnumC4651q.Initial, jA);
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
        if (this.pointerInputFilter.getIsAttached() && (size = (bVarG = g()).getSize()) > 0) {
            Node[] nodeArrT = bVarG.t();
            int i11 = 0;
            do {
                Node node = nodeArrT[i11];
                C4411v<PointerInputChange> c4411v = this.relevantChanges;
                InterfaceC5116v interfaceC5116v2 = this.coordinates;
                C3862t.d(interfaceC5116v2);
                node.f(c4411v, interfaceC5116v2, internalPointerEvent, isInBounds);
                i11++;
            } while (i11 < size);
        }
        if (this.pointerInputFilter.getIsAttached()) {
            AbstractC0834m abstractC0834mG2 = this.pointerInputFilter;
            int iA2 = e0.a(16);
            Q.b bVar2 = null;
            while (abstractC0834mG2 != 0) {
                if (abstractC0834mG2 instanceof s0) {
                    ((s0) abstractC0834mG2).t0(c4649o, EnumC4651q.Main, jA);
                } else if ((abstractC0834mG2.getKindSet() & iA2) != 0 && (abstractC0834mG2 instanceof AbstractC0834m)) {
                    i.c delegate2 = abstractC0834mG2.getDelegate();
                    int i12 = 0;
                    abstractC0834mG2 = abstractC0834mG2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & iA2) != 0) {
                            i12++;
                            if (i12 == 1) {
                                abstractC0834mG2 = delegate2;
                            } else {
                                if (bVar2 == null) {
                                    bVar2 = new Q.b(new i.c[16], 0);
                                }
                                if (abstractC0834mG2 != 0) {
                                    bVar2.c(abstractC0834mG2);
                                    abstractC0834mG2 = 0;
                                }
                                bVar2.c(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        abstractC0834mG2 = abstractC0834mG2;
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC0834mG2 = C0832k.g(bVar2);
            }
        }
        return true;
    }

    @Override // u0.C4647m
    public void i(long pointerIdValue, C4386H<Node> hitNodes) {
        if (this.pointerIds.d(pointerIdValue) && !hitNodes.a(this)) {
            this.pointerIds.h(pointerIdValue);
            this.relevantChanges.l(pointerIdValue);
        }
        Q.b<Node> bVarG = g();
        int size = bVarG.getSize();
        if (size > 0) {
            Node[] nodeArrT = bVarG.t();
            int i10 = 0;
            do {
                nodeArrT[i10].i(pointerIdValue, hitNodes);
                i10++;
            } while (i10 < size);
        }
    }

    /* renamed from: k, reason: from getter */
    public final i.c getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    /* renamed from: l, reason: from getter */
    public final C4790b getPointerIds() {
        return this.pointerIds;
    }

    public final void n() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + g() + ", pointerIds=" + this.pointerIds + ')';
    }
}
