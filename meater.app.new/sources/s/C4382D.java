package s;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import oa.C4148A;
import t.C4535d;

/* compiled from: LongObjectMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\fR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Ls/D;", "V", "Ls/s;", "", "initialCapacity", "<init>", "(I)V", "Loa/F;", "m", "capacity", "l", "k", "()V", "", "key", "i", "(J)I", "hash1", "j", "(I)I", "f", "h", "newCapacity", "n", "value", "o", "(JLjava/lang/Object;)V", "g", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4382D<V> extends AbstractC4408s<V> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public C4382D(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C4535d.a("Capacity must be a positive value.");
        }
        m(U.g(i10));
    }

    private final void f() {
        if (this._capacity <= 8 || Long.compareUnsigned(C4148A.j(C4148A.j(this._size) * 32), C4148A.j(C4148A.j(this._capacity) * 25)) > 0) {
            n(U.e(this._capacity));
        } else {
            h();
        }
    }

    private final void h() {
        long[] jArr;
        int i10;
        int i11;
        long[] jArr2 = this.metadata;
        int i12 = this._capacity;
        long[] jArr3 = this.keys;
        Object[] objArr = this.values;
        U.a(jArr2, i12);
        char c10 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i12) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j10 = (jArr2[i14] >> i15) & 255;
            if (j10 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int iHashCode = Long.hashCode(jArr3[i13]) * (-862048943);
                    int i16 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                    int iJ = j(i16);
                    int i17 = i16 & i12;
                    if (((iJ - i17) & i12) / 8 == ((i13 - i17) & i12) / 8) {
                        jArr2[i14] = ((r10 & 127) << i15) | ((~(255 << i15)) & jArr2[i14]);
                        jArr2[C3831l.b0(jArr2)] = (jArr2[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iJ >> 3;
                        long j11 = jArr2[i18];
                        int i19 = (iJ & 7) << 3;
                        if (((j11 >> i19) & 255) == 128) {
                            int i20 = i13;
                            jArr = jArr3;
                            jArr2[i18] = (j11 & (~(255 << i19))) | ((r10 & 127) << i19);
                            jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (128 << i15);
                            jArr[iJ] = jArr[i20];
                            jArr[i20] = 0;
                            objArr[iJ] = objArr[i20];
                            objArr[i20] = null;
                            i11 = i20;
                            iB = i11;
                            i10 = i12;
                        } else {
                            int i21 = i12;
                            jArr = jArr3;
                            int i22 = i13;
                            jArr2[i18] = ((r10 & 127) << i19) | (j11 & (~(255 << i19)));
                            if (iB == -1) {
                                i10 = i21;
                                iB = U.b(jArr2, i22 + 1, i10);
                            } else {
                                i10 = i21;
                            }
                            jArr[iB] = jArr[iJ];
                            jArr[iJ] = jArr[i22];
                            jArr[i22] = jArr[iB];
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i22];
                            objArr[i22] = objArr[iB];
                            i11 = i22 - 1;
                        }
                        c10 = 0;
                        jArr2[C3831l.b0(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i11 + 1;
                        i12 = i10;
                        jArr3 = jArr;
                    }
                }
                i13++;
            }
        }
        k();
    }

    private final int i(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.growthLimit == 0 && ((this.metadata[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iJ >> 3;
                long j14 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iJ;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int j(int hash1) {
        int i10 = this._capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final void k() {
        this.growthLimit = U.c(get_capacity()) - this._size;
    }

    private final void l(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = U.f48663a;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            C3831l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        k();
    }

    private final void m(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, U.f(initialCapacity)) : 0;
        this._capacity = iMax;
        l(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    private final void n(int newCapacity) {
        long[] jArr;
        C4382D<V> c4382d = this;
        long[] jArr2 = c4382d.metadata;
        long[] jArr3 = c4382d.keys;
        Object[] objArr = c4382d.values;
        int i10 = c4382d._capacity;
        m(newCapacity);
        long[] jArr4 = c4382d.metadata;
        long[] jArr5 = c4382d.keys;
        Object[] objArr2 = c4382d.values;
        int i11 = c4382d._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i12];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iJ = c4382d.j(i13 >>> 7);
                long j11 = i13 & 127;
                int i14 = iJ >> 3;
                int i15 = (iJ & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i14] & (~(255 << i15))) | (j11 << i15);
                jArr4[i14] = j12;
                jArr4[(((iJ - 7) & i11) + (i11 & 7)) >> 3] = j12;
                jArr5[iJ] = j10;
                objArr2[iJ] = objArr[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            c4382d = this;
            jArr2 = jArr;
        }
    }

    public final void g() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != U.f48663a) {
            C3831l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C3831l.u(this.values, null, 0, this._capacity);
        k();
    }

    public final void o(long key, V value) {
        int i10 = i(key);
        this.keys[i10] = key;
        this.values[i10] = value;
    }
}
