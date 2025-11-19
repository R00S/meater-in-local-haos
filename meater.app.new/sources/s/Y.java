package s;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import t.C4532a;

/* compiled from: SparseArrayCompat.jvm.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0001\u00103R\u0011\u00106\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b5\u0010\u0018¨\u00067"}, d2 = {"Ls/Y;", "E", "", "", "initialCapacity", "<init>", "(I)V", "d", "()Ls/Y;", "key", "g", "(I)Ljava/lang/Object;", "index", "Loa/F;", "o", "value", "p", "(ILjava/lang/Object;)Ljava/lang/Object;", "n", "(ILjava/lang/Object;)V", "q", "()I", "", "l", "()Z", "m", "(I)I", "r", "i", "k", "(Ljava/lang/Object;)I", "f", "(I)Z", "c", "()V", "b", "", "toString", "()Ljava/lang/String;", "B", "Z", "garbage", "", "C", "[I", "keys", "", "", "D", "[Ljava/lang/Object;", "values", "I", "size", "h", "isEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class Y<E> implements Cloneable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public Y() {
        this(0, 1, null);
    }

    public void b(int key, E value) {
        int i10 = this.size;
        if (i10 != 0 && key <= this.keys[i10 - 1]) {
            n(key, value);
            return;
        }
        if (this.garbage && i10 >= this.keys.length) {
            Z.d(this);
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iE = C4532a.e(i11 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size = i11 + 1;
    }

    public void c() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Y<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        C3862t.e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Y<E> y10 = (Y) objClone;
        y10.keys = (int[]) this.keys.clone();
        y10.values = (Object[]) this.values.clone();
        return y10;
    }

    public boolean f(int key) {
        return i(key) >= 0;
    }

    public E g(int key) {
        return (E) Z.c(this, key);
    }

    public final boolean h() {
        return l();
    }

    public int i(int key) {
        if (this.garbage) {
            Z.d(this);
        }
        return C4532a.a(this.keys, this.size, key);
    }

    public int k(E value) {
        if (this.garbage) {
            Z.d(this);
        }
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.values[i11] == value) {
                return i11;
            }
        }
        return -1;
    }

    public boolean l() {
        return q() == 0;
    }

    public int m(int index) {
        if (this.garbage) {
            Z.d(this);
        }
        return this.keys[index];
    }

    public void n(int key, E value) {
        int iA = C4532a.a(this.keys, this.size, key);
        if (iA >= 0) {
            this.values[iA] = value;
            return;
        }
        int i10 = ~iA;
        if (i10 < this.size && this.values[i10] == Z.f48679a) {
            this.keys[i10] = key;
            this.values[i10] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            Z.d(this);
            i10 = ~C4532a.a(this.keys, this.size, key);
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iE = C4532a.e(i11 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i12 = this.size;
        if (i12 - i10 != 0) {
            int[] iArr = this.keys;
            int i13 = i10 + 1;
            C3831l.j(iArr, iArr, i13, i10, i12);
            Object[] objArr = this.values;
            C3831l.l(objArr, objArr, i13, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    public void o(int index) {
        if (this.values[index] != Z.f48679a) {
            this.values[index] = Z.f48679a;
            this.garbage = true;
        }
    }

    public E p(int key, E value) {
        int i10 = i(key);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e10 = (E) objArr[i10];
        objArr[i10] = value;
        return e10;
    }

    public int q() {
        if (this.garbage) {
            Z.d(this);
        }
        return this.size;
    }

    public E r(int index) {
        if (this.garbage) {
            Z.d(this);
        }
        return (E) this.values[index];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append('=');
            E eR = r(i11);
            if (eR != this) {
                sb2.append(eR);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        C3862t.f(string, "buffer.toString()");
        return string;
    }

    public Y(int i10) {
        if (i10 == 0) {
            this.keys = C4532a.f49713a;
            this.values = C4532a.f49715c;
        } else {
            int iE = C4532a.e(i10);
            this.keys = new int[iE];
            this.values = new Object[iE];
        }
    }

    public /* synthetic */ Y(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
