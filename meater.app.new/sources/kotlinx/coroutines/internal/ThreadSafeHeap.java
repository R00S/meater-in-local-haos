package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import okhttp3.HttpUrl;

/* compiled from: ThreadSafeHeap.kt */
@Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000605j\u0002`6B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0005J2\u0010\u0015\u001a\u0004\u0018\u00018\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"J&\u0010#\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b$\u0010\u0018J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001fH\u0082\u0010¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001fH\u0082\u0010¢\u0006\u0004\b(\u0010'J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+R \u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00103\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u0010'¨\u00064"}, m32267d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", HttpUrl.FRAGMENT_ENCODE_SET, "T", "<init>", "()V", "node", HttpUrl.FRAGMENT_ENCODE_SET, "addImpl", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "Lkotlin/ParameterName;", "name", "value", "predicate", "find", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", HttpUrl.FRAGMENT_ENCODE_SET, "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "i", "siftDownFrom", "(I)V", "siftUpFrom", "j", "swap", "(II)V", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "()Z", "getSize", "()I", "setSize", "size", "kotlinx-coroutines-core", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/SynchronizedObject;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.j0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f41798a;

    /* renamed from: f */
    private final T[] m39508f() {
        T[] tArr = this.f41798a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.f41798a = tArr2;
            return tArr2;
        }
        if (get_size() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, get_size() * 2);
        C9801m.m32345e(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.f41798a = tArr3;
        return tArr3;
    }

    /* renamed from: j */
    private final void m39509j(int i2) {
        this._size = i2;
    }

    /* renamed from: k */
    private final void m39510k(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 >= get_size()) {
                return;
            }
            T[] tArr = this.f41798a;
            C9801m.m32343c(tArr);
            int i4 = i3 + 1;
            if (i4 < get_size()) {
                T t = tArr[i4];
                C9801m.m32343c(t);
                T t2 = tArr[i3];
                C9801m.m32343c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i3 = i4;
                }
            }
            T t3 = tArr[i2];
            C9801m.m32343c(t3);
            T t4 = tArr[i3];
            C9801m.m32343c(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m39512m(i2, i3);
            i2 = i3;
        }
    }

    /* renamed from: l */
    private final void m39511l(int i2) {
        while (i2 > 0) {
            T[] tArr = this.f41798a;
            C9801m.m32343c(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            C9801m.m32343c(t);
            T t2 = tArr[i2];
            C9801m.m32343c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m39512m(i2, i3);
            i2 = i3;
        }
    }

    /* renamed from: m */
    private final void m39512m(int i2, int i3) {
        T[] tArr = this.f41798a;
        C9801m.m32343c(tArr);
        T t = tArr[i3];
        C9801m.m32343c(t);
        T t2 = tArr[i2];
        C9801m.m32343c(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.mo39527D(i2);
        t2.mo39527D(i3);
    }

    /* renamed from: a */
    public final void m39513a(T t) {
        if (C11045s0.m39681a()) {
            if (!(t.mo39530v() == null)) {
                throw new AssertionError();
            }
        }
        t.mo39529q(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrM39508f = m39508f();
        int i2 = get_size();
        m39509j(i2 + 1);
        threadSafeHeapNodeArrM39508f[i2] = t;
        t.mo39527D(i2);
        m39511l(i2);
    }

    /* renamed from: b */
    public final T m39514b() {
        T[] tArr = this.f41798a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m39516d() {
        return get_size() == 0;
    }

    /* renamed from: e */
    public final T m39517e() {
        T t;
        synchronized (this) {
            t = (T) m39514b();
        }
        return t;
    }

    /* renamed from: g */
    public final boolean m39518g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            if (t.mo39530v() == null) {
                z = false;
            } else {
                int iMo39528g = t.mo39528g();
                if (C11045s0.m39681a()) {
                    if (!(iMo39528g >= 0)) {
                        throw new AssertionError();
                    }
                }
                m39519h(iMo39528g);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T m39519h(int r8) {
        /*
            r7 = this;
            boolean r0 = kotlinx.coroutines.C11045s0.m39681a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            int r0 = r7.get_size()
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1a:
            T extends kotlinx.coroutines.internal.k0 & java.lang.Comparable<? super T>[] r0 = r7.f41798a
            kotlin.jvm.internal.C9801m.m32343c(r0)
            int r3 = r7.get_size()
            r4 = -1
            int r3 = r3 + r4
            r7.m39509j(r3)
            int r3 = r7.get_size()
            if (r8 >= r3) goto L57
            int r3 = r7.get_size()
            r7.m39512m(r8, r3)
            int r3 = r8 + (-1)
            int r3 = r3 / 2
            if (r8 <= 0) goto L54
            r5 = r0[r8]
            kotlin.jvm.internal.C9801m.m32343c(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r0[r3]
            kotlin.jvm.internal.C9801m.m32343c(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L54
            r7.m39512m(r8, r3)
            r7.m39511l(r3)
            goto L57
        L54:
            r7.m39510k(r8)
        L57:
            int r8 = r7.get_size()
            r8 = r0[r8]
            kotlin.jvm.internal.C9801m.m32343c(r8)
            boolean r3 = kotlinx.coroutines.C11045s0.m39681a()
            if (r3 == 0) goto L76
            kotlinx.coroutines.internal.j0 r3 = r8.mo39530v()
            if (r3 != r7) goto L6d
            r1 = 1
        L6d:
            if (r1 == 0) goto L70
            goto L76
        L70:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L76:
            r1 = 0
            r8.mo39529q(r1)
            r8.mo39527D(r4)
            int r2 = r7.get_size()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.m39519h(int):kotlinx.coroutines.internal.k0");
    }

    /* renamed from: i */
    public final T m39520i() {
        T t;
        synchronized (this) {
            t = get_size() > 0 ? (T) m39519h(0) : null;
        }
        return t;
    }
}
