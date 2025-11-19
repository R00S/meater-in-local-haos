package A0;

import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0002CGB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u0010\u000eJ\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b9\u0010\u000eJ\u001e\u0010<\u001a\u00020\u00162\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:H\u0000ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0004\b?\u0010=J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b1\u0010ER\u001a\u0010K\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010Q\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010\bR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010XR\u001c\u0010\\\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010[R\u0014\u0010_\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"LA0/a0;", "", "LA0/G;", "layoutNode", "<init>", "(LA0/G;)V", "Lb0/i$c;", "u", "()Lb0/i$c;", "paddedHead", "D", "(Lb0/i$c;)Lb0/i$c;", "Loa/F;", "B", "()V", "head", "", "offset", "LQ/b;", "Lb0/i$b;", "before", "after", "", "shouldAttachOnInsert", "LA0/a0$a;", "j", "(Lb0/i$c;ILQ/b;LQ/b;Z)LA0/a0$a;", "start", "LA0/c0;", "coordinator", "v", "(Lb0/i$c;LA0/c0;)V", "tail", "A", "(ILQ/b;LQ/b;Lb0/i$c;Z)V", "node", "h", "w", "element", "parent", "g", "(Lb0/i$b;Lb0/i$c;)Lb0/i$c;", "r", "(Lb0/i$c;Lb0/i$c;)Lb0/i$c;", "prev", "next", "F", "(Lb0/i$b;Lb0/i$b;Lb0/i$c;)V", "Lb0/i;", "m", "E", "(Lb0/i;)V", "x", "C", "s", "y", "t", "z", "LA0/e0;", "type", "q", "(I)Z", "mask", "p", "", "toString", "()Ljava/lang/String;", "a", "LA0/G;", "()LA0/G;", "LA0/w;", "b", "LA0/w;", "l", "()LA0/w;", "innerCoordinator", "<set-?>", "c", "LA0/c0;", "n", "()LA0/c0;", "outerCoordinator", "d", "Lb0/i$c;", "o", "e", "k", "f", "LQ/b;", "current", "buffer", "LA0/a0$a;", "cachedDiffer", "i", "()I", "aggregateChildKindSet", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0843w innerCoordinator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC0823c0 outerCoordinator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i.c tail;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i.c head;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Q.b<i.b> current;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Q.b<i.b> buffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a cachedDiffer;

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"LA0/a0$a;", "LA0/p;", "Lb0/i$c;", "node", "", "offset", "LQ/b;", "Lb0/i$b;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(LA0/a0;Lb0/i$c;ILQ/b;LQ/b;Z)V", "oldIndex", "newIndex", "b", "(II)Z", "Loa/F;", "d", "(I)V", "atIndex", "a", "(II)V", "c", "Lb0/i$c;", "getNode", "()Lb0/i$c;", "g", "(Lb0/i$c;)V", "I", "getOffset", "()I", "h", "LQ/b;", "getBefore", "()LQ/b;", "f", "(LQ/b;)V", "getAfter", "e", "Z", "getShouldAttachOnInsert", "()Z", "i", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.a0$a */
    private final class a implements InterfaceC0837p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private i.c node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int offset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Q.b<i.b> before;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Q.b<i.b> after;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean shouldAttachOnInsert;

        public a(i.c cVar, int i10, Q.b<i.b> bVar, Q.b<i.b> bVar2, boolean z10) {
            this.node = cVar;
            this.offset = i10;
            this.before = bVar;
            this.after = bVar2;
            this.shouldAttachOnInsert = z10;
        }

        @Override // A0.InterfaceC0837p
        public void a(int atIndex, int oldIndex) {
            i.c child = this.node.getChild();
            C3862t.d(child);
            C0819a0.d(C0819a0.this);
            if ((e0.a(2) & child.getKindSet()) != 0) {
                AbstractC0823c0 coordinator = child.getCoordinator();
                C3862t.d(coordinator);
                AbstractC0823c0 abstractC0823c0T2 = coordinator.getWrappedBy();
                AbstractC0823c0 abstractC0823c0S2 = coordinator.getWrapped();
                C3862t.d(abstractC0823c0S2);
                if (abstractC0823c0T2 != null) {
                    abstractC0823c0T2.X2(abstractC0823c0S2);
                }
                abstractC0823c0S2.Y2(abstractC0823c0T2);
                C0819a0.this.v(this.node, abstractC0823c0S2);
            }
            this.node = C0819a0.this.h(child);
        }

        @Override // A0.InterfaceC0837p
        public boolean b(int oldIndex, int newIndex) {
            return C0821b0.d(this.before.t()[this.offset + oldIndex], this.after.t()[this.offset + newIndex]) != 0;
        }

        @Override // A0.InterfaceC0837p
        public void c(int oldIndex, int newIndex) {
            i.c child = this.node.getChild();
            C3862t.d(child);
            this.node = child;
            Q.b<i.b> bVar = this.before;
            i.b bVar2 = bVar.t()[this.offset + oldIndex];
            Q.b<i.b> bVar3 = this.after;
            i.b bVar4 = bVar3.t()[this.offset + newIndex];
            if (C3862t.b(bVar2, bVar4)) {
                C0819a0.d(C0819a0.this);
            } else {
                C0819a0.this.F(bVar2, bVar4, this.node);
                C0819a0.d(C0819a0.this);
            }
        }

        @Override // A0.InterfaceC0837p
        public void d(int newIndex) {
            int i10 = this.offset + newIndex;
            this.node = C0819a0.this.g(this.after.t()[i10], this.node);
            C0819a0.d(C0819a0.this);
            if (!this.shouldAttachOnInsert) {
                this.node.c2(true);
                return;
            }
            i.c child = this.node.getChild();
            C3862t.d(child);
            AbstractC0823c0 coordinator = child.getCoordinator();
            C3862t.d(coordinator);
            B bD = C0832k.d(this.node);
            if (bD != null) {
                C c10 = new C(C0819a0.this.getLayoutNode(), bD);
                this.node.i2(c10);
                C0819a0.this.v(this.node, c10);
                c10.Y2(coordinator.getWrappedBy());
                c10.X2(coordinator);
                coordinator.Y2(c10);
            } else {
                this.node.i2(coordinator);
            }
            this.node.R1();
            this.node.X1();
            f0.a(this.node);
        }

        public final void e(Q.b<i.b> bVar) {
            this.after = bVar;
        }

        public final void f(Q.b<i.b> bVar) {
            this.before = bVar;
        }

        public final void g(i.c cVar) {
            this.node = cVar;
        }

        public final void h(int i10) {
            this.offset = i10;
        }

        public final void i(boolean z10) {
            this.shouldAttachOnInsert = z10;
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LA0/a0$b;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.a0$b */
    public interface b {
    }

    public C0819a0(G g10) {
        this.layoutNode = g10;
        C0843w c0843w = new C0843w(g10);
        this.innerCoordinator = c0843w;
        this.outerCoordinator = c0843w;
        y0 y0VarK3 = c0843w.r2();
        this.tail = y0VarK3;
        this.head = y0VarK3;
    }

    private final void A(int offset, Q.b<i.b> before, Q.b<i.b> after, i.c tail, boolean shouldAttachOnInsert) {
        Y.e(before.getSize() - offset, after.getSize() - offset, j(tail, offset, before, after, shouldAttachOnInsert));
        B();
    }

    private final void B() {
        int kindSet = 0;
        for (i.c parent = this.tail.getParent(); parent != null && parent != C0821b0.f522a; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.Z1(kindSet);
        }
    }

    private final i.c D(i.c paddedHead) {
        if (!(paddedHead == C0821b0.f522a)) {
            C5047a.b("trimChain called on already trimmed chain");
        }
        i.c child = C0821b0.f522a.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.f2(null);
        C0821b0.f522a.b2(null);
        C0821b0.f522a.Z1(-1);
        C0821b0.f522a.i2(null);
        if (!(child != C0821b0.f522a)) {
            C5047a.b("trimChain did not update the head");
        }
        return child;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(i.b prev, i.b next, i.c node) {
        if ((prev instanceof V) && (next instanceof V)) {
            C0821b0.f((V) next, node);
            if (node.getIsAttached()) {
                f0.e(node);
                return;
            } else {
                node.g2(true);
                return;
            }
        }
        if (!(node instanceof C0822c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((C0822c) node).o2(next);
        if (node.getIsAttached()) {
            f0.e(node);
        } else {
            node.g2(true);
        }
    }

    public static final /* synthetic */ b d(C0819a0 c0819a0) {
        c0819a0.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.c g(i.b element, i.c parent) {
        i.c c0822c;
        if (element instanceof V) {
            c0822c = ((V) element).m();
            c0822c.d2(f0.h(c0822c));
        } else {
            c0822c = new C0822c(element);
        }
        if (c0822c.getIsAttached()) {
            C5047a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c0822c.c2(true);
        return r(c0822c, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.c h(i.c node) {
        if (node.getIsAttached()) {
            f0.d(node);
            node.Y1();
            node.S1();
        }
        return w(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.head.getAggregateChildKindSet();
    }

    private final a j(i.c head, int offset, Q.b<i.b> before, Q.b<i.b> after, boolean shouldAttachOnInsert) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.g(head);
        aVar.h(offset);
        aVar.f(before);
        aVar.e(after);
        aVar.i(shouldAttachOnInsert);
        return aVar;
    }

    private final i.c r(i.c node, i.c parent) {
        i.c child = parent.getChild();
        if (child != null) {
            child.f2(node);
            node.b2(child);
        }
        parent.b2(node);
        node.f2(parent);
        return node;
    }

    private final i.c u() {
        if (!(this.head != C0821b0.f522a)) {
            C5047a.b("padChain called on already padded chain");
        }
        i.c cVar = this.head;
        cVar.f2(C0821b0.f522a);
        C0821b0.f522a.b2(cVar);
        return C0821b0.f522a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(i.c start, AbstractC0823c0 coordinator) {
        for (i.c parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == C0821b0.f522a) {
                G gO0 = this.layoutNode.o0();
                coordinator.Y2(gO0 != null ? gO0.P() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((e0.a(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.i2(coordinator);
            }
        }
    }

    private final i.c w(i.c node) {
        i.c child = node.getChild();
        i.c parent = node.getParent();
        if (child != null) {
            child.f2(parent);
            node.b2(null);
        }
        if (parent != null) {
            parent.b2(child);
            node.f2(null);
        }
        C3862t.d(parent);
        return parent;
    }

    public final void C() {
        AbstractC0823c0 c10;
        AbstractC0823c0 abstractC0823c0 = this.innerCoordinator;
        for (i.c parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            B bD = C0832k.d(parent);
            if (bD != null) {
                if (parent.getCoordinator() != null) {
                    AbstractC0823c0 coordinator = parent.getCoordinator();
                    C3862t.e(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    c10 = (C) coordinator;
                    B bL3 = c10.getLayoutModifierNode();
                    c10.p3(bD);
                    if (bL3 != parent) {
                        c10.H2();
                    }
                } else {
                    c10 = new C(this.layoutNode, bD);
                    parent.i2(c10);
                }
                abstractC0823c0.Y2(c10);
                c10.X2(abstractC0823c0);
                abstractC0823c0 = c10;
            } else {
                parent.i2(abstractC0823c0);
            }
        }
        G gO0 = this.layoutNode.o0();
        abstractC0823c0.Y2(gO0 != null ? gO0.P() : null);
        this.outerCoordinator = abstractC0823c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r2 >= r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        A(r2, r7, r13, r5, !r12.layoutNode.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        x0.C5047a.c("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        x0.C5047a.c("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(b0.i r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C0819a0.E(b0.i):void");
    }

    /* renamed from: k, reason: from getter */
    public final i.c getHead() {
        return this.head;
    }

    /* renamed from: l, reason: from getter */
    public final C0843w getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* renamed from: m, reason: from getter */
    public final G getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC0823c0 getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* renamed from: o, reason: from getter */
    public final i.c getTail() {
        return this.tail;
    }

    public final boolean p(int mask) {
        return (mask & i()) != 0;
    }

    public final boolean q(int type) {
        return (type & i()) != 0;
    }

    public final void s() {
        for (i.c head = getHead(); head != null; head = head.getChild()) {
            head.R1();
        }
    }

    public final void t() {
        for (i.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.S1();
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.head == this.tail) {
            sb2.append("]");
        } else {
            i.c head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb2.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                head = head.getChild();
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void x() {
        for (i.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.W1();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (i.c head = getHead(); head != null; head = head.getChild()) {
            head.X1();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                f0.a(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                f0.e(head);
            }
            head.c2(false);
            head.g2(false);
        }
    }

    public final void z() {
        for (i.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.Y1();
            }
        }
    }
}
