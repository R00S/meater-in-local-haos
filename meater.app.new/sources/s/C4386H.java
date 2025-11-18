package s;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ObjectList.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0012\u001a\u00028\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls/H;", "E", "Ls/O;", "", "initialCapacity", "<init>", "(I)V", "element", "", "e", "(Ljava/lang/Object;)Z", "Loa/F;", "f", "()V", "capacity", "g", "h", "index", "i", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4386H<E> extends O<E> {
    public C4386H() {
        this(0, 1, null);
    }

    public final boolean e(E element) {
        g(this._size + 1);
        Object[] objArr = this.content;
        int i10 = this._size;
        objArr[i10] = element;
        this._size = i10 + 1;
        return true;
    }

    public final void f() {
        C3831l.u(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void g(int capacity) {
        Object[] objArr = this.content;
        if (objArr.length < capacity) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(capacity, (objArr.length * 3) / 2));
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final boolean h(E element) {
        int iB = b(element);
        if (iB < 0) {
            return false;
        }
        i(iB);
        return true;
    }

    public final E i(int index) {
        int i10;
        if (index < 0 || index >= (i10 = this._size)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(index);
            sb2.append(" must be in 0..");
            sb2.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        Object[] objArr = this.content;
        E e10 = (E) objArr[index];
        if (index != i10 - 1) {
            C3831l.l(objArr, objArr, index, index + 1, i10);
        }
        int i11 = this._size - 1;
        this._size = i11;
        objArr[i11] = null;
        return e10;
    }

    public /* synthetic */ C4386H(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public C4386H(int i10) {
        super(i10, null);
    }
}
