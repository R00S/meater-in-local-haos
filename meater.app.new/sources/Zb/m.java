package Zb;

import cc.AbstractC2358C;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0001\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r028\u0002X\u0082\u0004¨\u00064"}, d2 = {"LZb/m;", "E", "Lcc/C;", "", "id", "prev", "LZb/e;", "channel", "", "pointers", "<init>", "(JLZb/m;LZb/e;I)V", "index", "", "value", "Loa/F;", "(ILjava/lang/Object;)V", "element", "G", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "B", "F", "from", "to", "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lta/g;", "context", "s", "(ILjava/lang/Throwable;Lta/g;)V", "receiver", "C", "(IZ)V", "LZb/e;", "_channel", "y", "()LZb/e;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m<E> extends AbstractC2358C<m<E>> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final e<E> _channel;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f19705G;

    public m(long j10, m<E> mVar, e<E> eVar, int i10) {
        super(j10, mVar, i10);
        this._channel = eVar;
        this.f19705G = new AtomicReferenceArray(f.f19677b * 2);
    }

    private final void E(int index, Object value) {
        getF19705G().set(index * 2, value);
    }

    /* renamed from: z, reason: from getter */
    private final /* synthetic */ AtomicReferenceArray getF19705G() {
        return this.f19705G;
    }

    public final E A(int index) {
        return (E) getF19705G().get(index * 2);
    }

    public final Object B(int index) {
        return getF19705G().get((index * 2) + 1);
    }

    public final void C(int index, boolean receiver) {
        if (receiver) {
            y().S0((this.id * f.f19677b) + index);
        }
        t();
    }

    public final E D(int index) {
        E eA = A(index);
        w(index);
        return eA;
    }

    public final void F(int index, Object value) {
        getF19705G().set((index * 2) + 1, value);
    }

    public final void G(int index, E element) {
        E(index, element);
    }

    @Override // cc.AbstractC2358C
    public int r() {
        return f.f19677b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = y().onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        cc.C2393x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // cc.AbstractC2358C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, ta.g r6) {
        /*
            r3 = this;
            int r5 = Zb.f.f19677b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof Xb.Z0
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof Zb.WaiterEB
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            cc.F r2 = Zb.f.j()
            if (r1 == r2) goto L63
            cc.F r2 = Zb.f.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            cc.F r2 = Zb.f.p()
            if (r1 == r2) goto Le
            cc.F r2 = Zb.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            cc.F r4 = Zb.f.f()
            if (r1 == r4) goto L62
            cc.F r4 = Zb.f.f19679d
            if (r1 != r4) goto L40
            goto L62
        L40:
            cc.F r4 = Zb.f.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.w(r4)
            if (r0 == 0) goto L73
            Zb.e r4 = r3.y()
            Ba.l<E, oa.F> r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L73
            cc.C2393x.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            cc.F r2 = Zb.f.j()
            goto L7f
        L7b:
            cc.F r2 = Zb.f.i()
        L7f:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L9a
            Zb.e r4 = r3.y()
            Ba.l<E, oa.F> r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L9a
            cc.C2393x.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.m.s(int, java.lang.Throwable, ta.g):void");
    }

    public final boolean v(int index, Object from, Object to) {
        return l.a(getF19705G(), (index * 2) + 1, from, to);
    }

    public final void w(int index) {
        E(index, null);
    }

    public final Object x(int index, Object update) {
        return getF19705G().getAndSet((index * 2) + 1, update);
    }

    public final e<E> y() {
        e<E> eVar = this._channel;
        C3862t.d(eVar);
        return eVar;
    }
}
