package s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import t.C4532a;
import t.C4535d;

/* compiled from: SimpleArrayMap.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Ls/X;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Ls/X;)V", "Loa/F;", "clear", "()V", "minimumCapacity", "b", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "value", "a", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "h", "(I)Ljava/lang/Object;", "l", "k", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "i", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "j", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "c", "(Ljava/lang/Object;I)I", "g", "", "B", "[I", "hashes", "", "C", "[Ljava/lang/Object;", "array", "D", "I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class X<K, V> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int size;

    public X() {
        this(0, 1, null);
    }

    private final int c(K key, int hash) {
        int i10 = this.size;
        if (i10 == 0) {
            return -1;
        }
        int iA = C4532a.a(this.hashes, i10, hash);
        if (iA < 0 || C3862t.b(key, this.array[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == hash) {
            if (C3862t.b(key, this.array[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == hash; i12--) {
            if (C3862t.b(key, this.array[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    private final int g() {
        int i10 = this.size;
        if (i10 == 0) {
            return -1;
        }
        int iA = C4532a.a(this.hashes, i10, 0);
        if (iA < 0 || this.array[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.array[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.array[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(V value) {
        int i10 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (C3862t.b(value, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int minimumCapacity) {
        int i10 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
        }
        if (this.size != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = C4532a.f49713a;
            this.array = C4532a.f49715c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return d(key) >= 0;
    }

    public boolean containsValue(V value) {
        return a(value) >= 0;
    }

    public int d(K key) {
        return key == null ? g() : c(key, key.hashCode());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof X) {
                if (getSize() != ((X) other).getSize()) {
                    return false;
                }
                X x10 = (X) other;
                int i10 = this.size;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kH = h(i11);
                    V vL = l(i11);
                    Object obj = x10.get(kH);
                    if (vL == null) {
                        if (obj != null || !x10.containsKey(kH)) {
                            return false;
                        }
                    } else if (!C3862t.b(vL, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i12 = this.size;
            for (int i13 = 0; i13 < i12; i13++) {
                K kH2 = h(i13);
                V vL2 = l(i13);
                Object obj2 = ((Map) other).get(kH2);
                if (vL2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kH2)) {
                        return false;
                    }
                } else if (!C3862t.b(vL2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return (V) this.array[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object key, V defaultValue) {
        int iD = d(key);
        return iD >= 0 ? (V) this.array[(iD << 1) + 1] : defaultValue;
    }

    public K h(int index) {
        boolean z10 = false;
        if (index >= 0 && index < this.size) {
            z10 = true;
        }
        if (!z10) {
            C4535d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (K) this.array[index << 1];
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i10 = this.size;
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

    public void i(X<? extends K, ? extends V> map) {
        C3862t.g(map, "map");
        int i10 = map.size;
        b(this.size + i10);
        if (this.size != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.h(i11), map.l(i11));
            }
        } else if (i10 > 0) {
            C3831l.j(map.hashes, this.hashes, 0, 0, i10);
            C3831l.l(map.array, this.array, 0, 0, i10 << 1);
            this.size = i10;
        }
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V j(int index) {
        if (!(index >= 0 && index < this.size)) {
            C4535d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i10 = index << 1;
        V v10 = (V) objArr[i10 + 1];
        int i11 = this.size;
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (index < i12) {
                    int i13 = index + 1;
                    C3831l.j(iArr, iArr, index, i13, i11);
                    Object[] objArr2 = this.array;
                    C3831l.l(objArr2, objArr2, i10, i13 << 1, i11 << 1);
                }
                Object[] objArr3 = this.array;
                int i14 = i12 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                int i15 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
                C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
                this.hashes = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.array, i15 << 1);
                C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
                this.array = objArrCopyOf;
                if (i11 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (index > 0) {
                    C3831l.j(iArr, this.hashes, 0, 0, index);
                    C3831l.l(objArr, this.array, 0, 0, i10);
                }
                if (index < i12) {
                    int i16 = index + 1;
                    C3831l.j(iArr, this.hashes, index, i16, i11);
                    C3831l.l(objArr, this.array, i10, i16 << 1, i11 << 1);
                }
            }
            if (i11 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i12;
        }
        return v10;
    }

    public V k(int index, V value) {
        boolean z10 = false;
        if (index >= 0 && index < this.size) {
            z10 = true;
        }
        if (!z10) {
            C4535d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        int i10 = (index << 1) + 1;
        Object[] objArr = this.array;
        V v10 = (V) objArr[i10];
        objArr[i10] = value;
        return v10;
    }

    public V l(int index) {
        boolean z10 = false;
        if (index >= 0 && index < this.size) {
            z10 = true;
        }
        if (!z10) {
            C4535d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (V) this.array[(index << 1) + 1];
    }

    public V put(K key, V value) {
        int i10 = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iC = key != null ? c(key, iHashCode) : g();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.array;
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
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i13 << 1);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i10 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.hashes;
            int i14 = i12 + 1;
            C3831l.j(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.array;
            C3831l.l(objArr2, objArr2, i14 << 1, i12 << 1, this.size << 1);
        }
        int i15 = this.size;
        if (i10 == i15) {
            int[] iArr3 = this.hashes;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.array;
                int i16 = i12 << 1;
                objArr3[i16] = key;
                objArr3[i16 + 1] = value;
                this.size = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K key, V value) {
        V v10 = get(key);
        return v10 == null ? put(key, value) : v10;
    }

    public V remove(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return j(iD);
        }
        return null;
    }

    public V replace(K key, V value) {
        int iD = d(key);
        if (iD >= 0) {
            return k(iD, value);
        }
        return null;
    }

    /* renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kH = h(i11);
            if (kH != sb2) {
                sb2.append(kH);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vL = l(i11);
            if (vL != sb2) {
                sb2.append(vL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public X(int i10) {
        this.hashes = i10 == 0 ? C4532a.f49713a : new int[i10];
        this.array = i10 == 0 ? C4532a.f49715c : new Object[i10 << 1];
    }

    public boolean remove(K key, V value) {
        int iD = d(key);
        if (iD < 0 || !C3862t.b(value, l(iD))) {
            return false;
        }
        j(iD);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iD = d(key);
        if (iD < 0 || !C3862t.b(oldValue, l(iD))) {
            return false;
        }
        k(iD, newValue);
        return true;
    }

    public /* synthetic */ X(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public X(X<? extends K, ? extends V> x10) {
        this(0, 1, null);
        if (x10 != null) {
            i(x10);
        }
    }
}
