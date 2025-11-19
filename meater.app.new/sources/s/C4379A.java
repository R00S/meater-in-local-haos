package s;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ls/A;", "Ls/m;", "", "initialCapacity", "<init>", "(I)V", "element", "", "i", "(I)Z", "index", "Loa/F;", "h", "(II)V", "", "elements", "j", "(I[I)Z", "l", "([I)V", "capacity", "k", "m", "n", "(I)I", "o", "(II)I", "p", "()V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4379A extends AbstractC4403m {
    public /* synthetic */ C4379A(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void h(int index, int element) {
        int i10;
        if (index < 0 || index > (i10 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        k(i10 + 1);
        int[] iArr = this.content;
        int i11 = this._size;
        if (index != i11) {
            C3831l.j(iArr, iArr, index + 1, index, i11);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean i(int element) {
        k(this._size + 1);
        int[] iArr = this.content;
        int i10 = this._size;
        iArr[i10] = element;
        this._size = i10 + 1;
        return true;
    }

    public final boolean j(int index, int[] elements) {
        int i10;
        C3862t.g(elements, "elements");
        if (index < 0 || index > (i10 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        k(i10 + elements.length);
        int[] iArr = this.content;
        int i11 = this._size;
        if (index != i11) {
            C3831l.j(iArr, iArr, elements.length + index, index, i11);
        }
        C3831l.o(elements, iArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void k(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final void l(int[] elements) {
        C3862t.g(elements, "elements");
        j(this._size, elements);
    }

    public final boolean m(int element) {
        int iC = c(element);
        if (iC < 0) {
            return false;
        }
        n(iC);
        return true;
    }

    public final int n(int index) {
        int i10;
        if (index < 0 || index >= (i10 = this._size)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(index);
            sb2.append(" must be in 0..");
            sb2.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.content;
        int i11 = iArr[index];
        if (index != i10 - 1) {
            C3831l.j(iArr, iArr, index, index + 1, i10);
        }
        this._size--;
        return i11;
    }

    public final int o(int index, int element) {
        if (index >= 0 && index < this._size) {
            int[] iArr = this.content;
            int i10 = iArr[index];
            iArr[index] = element;
            return i10;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set index ");
        sb2.append(index);
        sb2.append(" must be between 0 .. ");
        sb2.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void p() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        C3831l.F(this.content, 0, i10);
    }

    public C4379A(int i10) {
        super(i10, null);
    }
}
