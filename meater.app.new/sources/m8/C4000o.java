package m8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: CompoundOrdering.java */
/* renamed from: m8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4000o<T> extends U<T> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    final Comparator<? super T>[] f45368B;

    C4000o(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f45368B = new Comparator[]{comparator, comparator2};
    }

    @Override // m8.U, java.util.Comparator
    public int compare(T t10, T t11) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f45368B;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4000o) {
            return Arrays.equals(this.f45368B, ((C4000o) obj).f45368B);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f45368B);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f45368B) + ")";
    }
}
