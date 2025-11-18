package cc;

import cc.InterfaceC2368M;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ThreadSafeHeap.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR$\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010'\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, d2 = {"Lcc/L;", "Lcc/M;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "i", "Loa/F;", "m", "(I)V", "l", "", "g", "()[Lcc/M;", "j", "n", "(II)V", "f", "()Lcc/M;", "node", "", "h", "(Lcc/M;)Z", "b", "index", "(I)Lcc/M;", "a", "(Lcc/M;)V", "[Lcc/M;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.L, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2367L<T extends InterfaceC2368M & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f31159b = AtomicIntegerFieldUpdater.newUpdater(C2367L.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final T[] g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC2368M[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        C3862t.f(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((InterfaceC2368M[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void k(int i10) {
        f31159b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends cc.M & java.lang.Comparable<? super T>[] r2 = r5.a
            kotlin.jvm.internal.C3862t.d(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.C3862t.d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.C3862t.d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.C3862t.d(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.C3862t.d(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C2367L.l(int):void");
    }

    private final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.a;
            C3862t.d(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C3862t.d(t10);
            T t11 = tArr[i10];
            C3862t.d(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int j10) {
        T[] tArr = this.a;
        C3862t.d(tArr);
        T t10 = tArr[j10];
        C3862t.d(t10);
        T t11 = tArr[i10];
        C3862t.d(t11);
        tArr[i10] = t10;
        tArr[j10] = t11;
        t10.setIndex(i10);
        t11.setIndex(j10);
    }

    public final void a(T node) {
        node.p(this);
        InterfaceC2368M[] interfaceC2368MArrG = g();
        int iC = c();
        k(iC + 1);
        interfaceC2368MArrG[iC] = node;
        node.setIndex(iC);
        m(iC);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f31159b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final T f() {
        T t10;
        synchronized (this) {
            t10 = (T) b();
        }
        return t10;
    }

    public final boolean h(T node) {
        boolean z10;
        synchronized (this) {
            if (node.n() == null) {
                z10 = false;
            } else {
                i(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T i(int r6) {
        /*
            r5 = this;
            T extends cc.M & java.lang.Comparable<? super T>[] r0 = r5.a
            kotlin.jvm.internal.C3862t.d(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.C3862t.d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.C3862t.d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.C3862t.d(r6)
            r1 = 0
            r6.p(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C2367L.i(int):cc.M");
    }

    public final T j() {
        T t10;
        synchronized (this) {
            t10 = c() > 0 ? (T) i(0) : null;
        }
        return t10;
    }
}
