package K0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SimpleArrayMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\"\u0010-\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0007¨\u0006."}, d2 = {"LK0/c;", "K", "V", "", "", "capacity", "<init>", "(I)V", "key", "hash", "c", "(Ljava/lang/Object;I)I", "e", "()I", "", "a", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", "i", "f", "()Z", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "set_size", "_size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] keyValues;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    public c() {
        this(0, 1, null);
    }

    public final boolean a(K key) {
        return d(key) >= 0;
    }

    public final V b(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return (V) this.keyValues[(iD << 1) + 1];
        }
        return null;
    }

    protected final int c(Object key, int hash) {
        int i10 = this._size;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.hashes, i10, hash);
        if (iA < 0 || C3862t.b(key, this.keyValues[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == hash) {
            if (C3862t.b(key, this.keyValues[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == hash; i12--) {
            if (C3862t.b(key, this.keyValues[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int d(Object key) {
        return key == null ? e() : c(key, key.hashCode());
    }

    protected final int e() {
        int i10 = this._size;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.hashes, i10, 0);
        if (iA < 0 || this.keyValues[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.keyValues[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.keyValues[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof c) {
                c cVar = (c) other;
                int i10 = this._size;
                if (i10 != cVar._size) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    K kG = g(i11);
                    V vI = i(i11);
                    Object objB = cVar.b(kG);
                    if (vI == null) {
                        if (objB != null || !cVar.a(kG)) {
                            return false;
                        }
                    } else if (!C3862t.b(vI, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i12 = this._size;
            for (int i13 = 0; i13 < i12; i13++) {
                K kG2 = g(i13);
                V vI2 = i(i13);
                Object obj = ((Map) other).get(kG2);
                if (vI2 == null) {
                    if (obj != null || !((Map) other).containsKey(kG2)) {
                        return false;
                    }
                } else if (!C3862t.b(vI2, obj)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this._size <= 0;
    }

    public final K g(int index) {
        return (K) this.keyValues[index << 1];
    }

    public final V h(K key, V value) {
        int iHashCode;
        int iC;
        int i10 = this._size;
        if (key == null) {
            iC = e();
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
            iC = c(key, iHashCode);
        }
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.keyValues;
            V v10 = (V) objArr[i11];
            objArr[i11] = value;
            return v10;
        }
        int i12 = ~iC;
        int[] iArr = this.hashes;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i13 << 1);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i10 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.hashes;
            int i14 = i12 + 1;
            C3831l.j(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.keyValues;
            C3831l.l(objArr2, objArr2, i14 << 1, i12 << 1, this._size << 1);
        }
        int i15 = this._size;
        if (i10 == i15) {
            int[] iArr3 = this.hashes;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i16 = i12 << 1;
                objArr3[i16] = key;
                objArr3[i16 + 1] = value;
                this._size = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i10 = this._size;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final V i(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this._size * 28);
        sb2.append('{');
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kG = g(i11);
            if (kG != this) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vI = i(i11);
            if (vI != this) {
                sb2.append(vI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public c(int i10) {
        if (i10 == 0) {
            this.hashes = a.f8632a;
            this.keyValues = a.f8633b;
        } else {
            this.hashes = new int[i10];
            this.keyValues = new Object[i10 << 1];
        }
        this._size = 0;
    }

    public /* synthetic */ c(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
