package s;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4148A;
import t.C4535d;

/* compiled from: ObjectLongMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ls/I;", "K", "Ls/Q;", "", "initialCapacity", "<init>", "(I)V", "Loa/F;", "n", "capacity", "m", "l", "()V", "key", "k", "(Ljava/lang/Object;)I", "hash1", "j", "(I)I", "h", "i", "newCapacity", "o", "", "value", "p", "(Ljava/lang/Object;J)V", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4387I<K> extends Q<K> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ C4387I(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this._capacity <= 8 || Long.compareUnsigned(C4148A.j(C4148A.j(this._size) * 32), C4148A.j(C4148A.j(this._capacity) * 25)) > 0) {
            o(U.e(this._capacity));
        } else {
            i();
        }
    }

    private final void i() {
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr = this.metadata;
        int i12 = this._capacity;
        Object[] objArr2 = this.keys;
        long[] jArr2 = this.values;
        U.a(jArr, i12);
        int i13 = 0;
        int i14 = 0;
        int iB = -1;
        while (i14 != i12) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j10 = (jArr[i15] >> i16) & 255;
            if (j10 == 128) {
                iB = i14;
                i14++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr2[i14];
                    int iHashCode = (obj != null ? obj.hashCode() : i13) * (-862048943);
                    int i17 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                    int iJ = j(i17);
                    int i18 = i17 & i12;
                    if (((iJ - i18) & i12) / 8 == ((i14 - i18) & i12) / 8) {
                        jArr[i15] = ((r10 & 127) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[C3831l.b0(jArr)] = (jArr[i13] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iJ >> 3;
                        long j11 = jArr[i19];
                        int i20 = (iJ & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i14;
                            objArr = objArr2;
                            jArr[i19] = (j11 & (~(255 << i20))) | ((r10 & 127) << i20);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            objArr[iJ] = objArr[i21];
                            objArr[i21] = null;
                            jArr2[iJ] = jArr2[i21];
                            jArr2[i21] = 0;
                            i11 = i21;
                            iB = i11;
                            i10 = i12;
                        } else {
                            int i22 = i12;
                            objArr = objArr2;
                            int i23 = i14;
                            jArr[i19] = ((r10 & 127) << i20) | (j11 & (~(255 << i20)));
                            if (iB == -1) {
                                i10 = i22;
                                iB = U.b(jArr, i23 + 1, i10);
                            } else {
                                i10 = i22;
                            }
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            jArr2[iB] = jArr2[iJ];
                            jArr2[iJ] = jArr2[i23];
                            jArr2[i23] = jArr2[iB];
                            i11 = i23 - 1;
                        }
                        i13 = 0;
                        jArr[C3831l.b0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i14 = i11 + 1;
                        i12 = i10;
                        objArr2 = objArr;
                    }
                }
                i14++;
            }
        }
        l();
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

    private final int k(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (C3862t.b(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.growthLimit == 0 && ((this.metadata[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    h();
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
                return ~iJ;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void l() {
        this.growthLimit = U.c(get_capacity()) - this._size;
    }

    private final void m(int capacity) {
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
        l();
    }

    private final void n(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, U.f(initialCapacity)) : 0;
        this._capacity = iMax;
        m(iMax);
        this.keys = new Object[iMax];
        this.values = new long[iMax];
    }

    private final void o(int newCapacity) {
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i11 = this._capacity;
        n(newCapacity);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.keys;
        long[] jArr4 = this.values;
        int i12 = this._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iJ = j(i14 >>> 7);
                i10 = i13;
                long j10 = i14 & 127;
                int i15 = iJ >> 3;
                int i16 = (iJ & 7) << 3;
                long j11 = (j10 << i16) | (jArr3[i15] & (~(255 << i16)));
                jArr3[i15] = j11;
                jArr3[(((iJ - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iJ] = obj;
                jArr4[iJ] = jArr2[i10];
            } else {
                i10 = i13;
            }
            i13 = i10 + 1;
        }
    }

    public final void p(K key, long value) {
        int iK = k(key);
        if (iK < 0) {
            iK = ~iK;
        }
        this.keys[iK] = key;
        this.values[iK] = value;
    }

    public C4387I(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C4535d.a("Capacity must be a positive value.");
        }
        n(U.g(i10));
    }
}
