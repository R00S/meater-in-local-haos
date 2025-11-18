package s;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import t.C4532a;
import t.C4535d;

/* compiled from: LongSparseArray.jvm.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0001\u00103¨\u00065"}, d2 = {"Ls/v;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Ls/v;", "", "key", "f", "(J)Ljava/lang/Object;", "Loa/F;", "l", "(J)V", "index", "m", "value", "k", "(JLjava/lang/Object;)V", "n", "()I", "", "h", "()Z", "i", "(I)J", "o", "(I)Ljava/lang/Object;", "g", "(J)I", "d", "(J)Z", "b", "()V", "", "toString", "()Ljava/lang/String;", "B", "Z", "garbage", "", "C", "[J", "keys", "", "", "D", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4411v<E> implements Cloneable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ long[] keys;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public C4411v() {
        this(0, 1, null);
    }

    public void b() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4411v<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        C3862t.e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C4411v<E> c4411v = (C4411v) objClone;
        c4411v.keys = (long[]) this.keys.clone();
        c4411v.values = (Object[]) this.values.clone();
        return c4411v;
    }

    public boolean d(long key) {
        return g(key) >= 0;
    }

    public E f(long key) {
        int iB = C4532a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == C4412w.f48750a) {
            return null;
        }
        return (E) this.values[iB];
    }

    public int g(long key) {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C4412w.f48750a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return C4532a.b(this.keys, this.size, key);
    }

    public boolean h() {
        return n() == 0;
    }

    public long i(int index) {
        if (!(index >= 0 && index < this.size)) {
            C4535d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C4412w.f48750a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return this.keys[index];
    }

    public void k(long key, E value) {
        int iB = C4532a.b(this.keys, this.size, key);
        if (iB >= 0) {
            this.values[iB] = value;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.size && this.values[i10] == C4412w.f48750a) {
            this.keys[i10] = key;
            this.values[i10] = value;
            return;
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = this.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != C4412w.f48750a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.garbage = false;
                this.size = i12;
                i10 = ~C4532a.b(this.keys, i12, key);
            }
        }
        int i14 = this.size;
        if (i14 >= this.keys.length) {
            int iF = C4532a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iF);
            C3862t.f(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iF);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i15 = this.size;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.keys;
            int i16 = i10 + 1;
            C3831l.k(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.values;
            C3831l.l(objArr2, objArr2, i16, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    public void l(long key) {
        int iB = C4532a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == C4412w.f48750a) {
            return;
        }
        this.values[iB] = C4412w.f48750a;
        this.garbage = true;
    }

    public void m(int index) {
        if (this.values[index] != C4412w.f48750a) {
            this.values[index] = C4412w.f48750a;
            this.garbage = true;
        }
    }

    public int n() {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C4412w.f48750a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return this.size;
    }

    public E o(int index) {
        if (!(index >= 0 && index < this.size)) {
            C4535d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C4412w.f48750a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return (E) this.values[index];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            E eO = o(i11);
            if (eO != sb2) {
                sb2.append(eO);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C4411v(int i10) {
        if (i10 == 0) {
            this.keys = C4532a.f49714b;
            this.values = C4532a.f49715c;
        } else {
            int iF = C4532a.f(i10);
            this.keys = new long[iF];
            this.values = new Object[iF];
        }
    }

    public /* synthetic */ C4411v(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
