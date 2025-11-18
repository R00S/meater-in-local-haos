package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0015\u0010(\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0015\u0010*\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0011\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¨\u00060"}, d2 = {"Lcc/q;", "", "<init>", "()V", "Lcc/z;", "u", "()Lcc/z;", "Lkotlinx/coroutines/internal/Node;", "current", "i", "(Lcc/q;)Lcc/q;", "next", "Loa/F;", "k", "(Lcc/q;)V", "Lcc/y;", "op", "h", "(Lcc/y;)Lcc/q;", "node", "", "g", "(Lcc/q;)Z", "Lcc/q$a;", "condAdd", "", "v", "(Lcc/q;Lcc/q;Lcc/q$a;)I", "s", "()Z", "t", "()Lcc/q;", "", "toString", "()Ljava/lang/String;", "r", "isRemoved", "l", "()Ljava/lang/Object;", "m", "nextNode", "n", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2386q {

    /* renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31189B = AtomicReferenceFieldUpdater.newUpdater(C2386q.class, Object.class, "_next$volatile");

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31190C = AtomicReferenceFieldUpdater.newUpdater(C2386q.class, Object.class, "_prev$volatile");

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31191D = AtomicReferenceFieldUpdater.newUpdater(C2386q.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcc/q$a;", "Lcc/b;", "Lcc/q;", "Lkotlinx/coroutines/internal/Node;", "newNode", "<init>", "(Lcc/q;)V", "affected", "", "failure", "Loa/F;", "f", "(Lcc/q;Ljava/lang/Object;)V", "b", "Lcc/q;", "c", "oldNext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cc.q$a */
    public static abstract class a extends AbstractC2371b<C2386q> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final C2386q newNode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public C2386q oldNext;

        public a(C2386q c2386q) {
            this.newNode = c2386q;
        }

        @Override // cc.AbstractC2371b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(C2386q affected, Object failure) {
            boolean z10 = failure == null;
            C2386q c2386q = z10 ? this.newNode : this.oldNext;
            if (c2386q != null && androidx.concurrent.futures.b.a(C2386q.o(), affected, this, c2386q) && z10) {
                C2386q c2386q2 = this.newNode;
                C2386q c2386q3 = this.oldNext;
                C3862t.d(c2386q3);
                c2386q2.k(c2386q3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (androidx.concurrent.futures.b.a(cc.C2386q.f31189B, r3, r2, ((cc.C2395z) r4).f31209a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final cc.C2386q h(cc.AbstractC2394y r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p()
            java.lang.Object r0 = r0.get(r7)
            cc.q r0 = (cc.C2386q) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.r()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            if (r4 != r8) goto L30
            return r2
        L30:
            boolean r5 = r4 instanceof cc.AbstractC2394y
            if (r5 == 0) goto L3a
            cc.y r4 = (cc.AbstractC2394y) r4
            r4.a(r2)
            goto L0
        L3a:
            boolean r5 = r4 instanceof cc.C2395z
            if (r5 == 0) goto L5c
            if (r3 == 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o()
            cc.z r4 = (cc.C2395z) r4
            cc.q r4 = r4.ref
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4f
            goto L0
        L4f:
            r2 = r3
            goto Lc
        L51:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p()
            java.lang.Object r2 = r4.get(r2)
            cc.q r2 = (cc.C2386q) r2
            goto Ld
        L5c:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C3862t.e(r4, r3)
            r3 = r4
            cc.q r3 = (cc.C2386q) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C2386q.h(cc.y):cc.q");
    }

    private final C2386q i(C2386q current) {
        while (current.r()) {
            current = (C2386q) f31190C.get(current);
        }
        return current;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(C2386q next) {
        C2386q c2386q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31190C;
        do {
            c2386q = (C2386q) atomicReferenceFieldUpdater.get(next);
            if (l() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f31190C, next, c2386q, this));
        if (r()) {
            next.h(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater o() {
        return f31189B;
    }

    private final C2395z u() {
        C2395z c2395z = (C2395z) f31191D.get(this);
        if (c2395z != null) {
            return c2395z;
        }
        C2395z c2395z2 = new C2395z(this);
        f31191D.set(this, c2395z2);
        return c2395z2;
    }

    public final boolean g(C2386q node) {
        f31190C.set(node, this);
        f31189B.set(node, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f31189B, this, this, node)) {
                node.k(this);
                return true;
            }
        }
        return false;
    }

    public final Object l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31189B;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2394y)) {
                return obj;
            }
            ((AbstractC2394y) obj).a(this);
        }
    }

    public final C2386q m() {
        C2386q c2386q;
        Object objL = l();
        C2395z c2395z = objL instanceof C2395z ? (C2395z) objL : null;
        if (c2395z != null && (c2386q = c2395z.ref) != null) {
            return c2386q;
        }
        C3862t.e(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C2386q) objL;
    }

    public final C2386q n() {
        C2386q c2386qH = h(null);
        return c2386qH == null ? i((C2386q) f31190C.get(this)) : c2386qH;
    }

    public boolean r() {
        return l() instanceof C2395z;
    }

    public boolean s() {
        return t() == null;
    }

    public final C2386q t() {
        Object objL;
        C2386q c2386q;
        do {
            objL = l();
            if (objL instanceof C2395z) {
                return ((C2395z) objL).ref;
            }
            if (objL == this) {
                return (C2386q) objL;
            }
            C3862t.e(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c2386q = (C2386q) objL;
        } while (!androidx.concurrent.futures.b.a(f31189B, this, objL, c2386q.u()));
        c2386q.h(null);
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.E(this) { // from class: cc.q.b
            @Override // Ia.n
            public Object get() {
                return Xb.M.a(this.receiver);
            }
        } + '@' + Xb.M.b(this);
    }

    public final int v(C2386q node, C2386q next, a condAdd) {
        f31190C.set(node, this);
        f31189B.set(node, next);
        condAdd.oldNext = next;
        if (androidx.concurrent.futures.b.a(f31189B, this, next, condAdd)) {
            return condAdd.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
