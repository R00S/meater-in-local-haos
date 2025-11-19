package s;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import oa.C4148A;
import t.C4535d;

/* compiled from: IntIntMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ls/z;", "Ls/k;", "", "initialCapacity", "<init>", "(I)V", "Loa/F;", "o", "capacity", "n", "m", "()V", "key", "l", "(I)I", "hash1", "k", "h", "j", "newCapacity", "p", "value", "q", "(II)V", "i", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4415z extends AbstractC4401k {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ C4415z(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this._capacity <= 8 || Long.compareUnsigned(C4148A.j(C4148A.j(this._size) * 32), C4148A.j(C4148A.j(this._capacity) * 25)) > 0) {
            p(U.e(this._capacity));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.metadata;
        int i12 = this._capacity;
        int[] iArr2 = this.keys;
        int[] iArr3 = this.values;
        U.a(jArr, i12);
        char c10 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i12) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j10 = (jArr[i14] >> i15) & 255;
            if (j10 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int iHashCode = Integer.hashCode(iArr2[i13]) * (-862048943);
                    int i16 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                    int iK = k(i16);
                    int i17 = i16 & i12;
                    if (((iK - i17) & i12) / 8 == ((i13 - i17) & i12) / 8) {
                        jArr[i14] = ((r10 & 127) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C3831l.b0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iK >> 3;
                        long j11 = jArr[i18];
                        int i19 = (iK & 7) << 3;
                        if (((j11 >> i19) & 255) == 128) {
                            int i20 = i13;
                            iArr = iArr2;
                            jArr[i18] = (j11 & (~(255 << i19))) | ((r10 & 127) << i19);
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            iArr[iK] = iArr[i20];
                            iArr[i20] = 0;
                            iArr3[iK] = iArr3[i20];
                            iArr3[i20] = 0;
                            i11 = i20;
                            iB = i11;
                            i10 = i12;
                        } else {
                            int i21 = i12;
                            iArr = iArr2;
                            int i22 = i13;
                            jArr[i18] = ((r10 & 127) << i19) | (j11 & (~(255 << i19)));
                            if (iB == -1) {
                                i10 = i21;
                                iB = U.b(jArr, i22 + 1, i10);
                            } else {
                                i10 = i21;
                            }
                            iArr[iB] = iArr[iK];
                            iArr[iK] = iArr[i22];
                            iArr[i22] = iArr[iB];
                            iArr3[iB] = iArr3[iK];
                            iArr3[iK] = iArr3[i22];
                            iArr3[i22] = iArr3[iB];
                            i11 = i22 - 1;
                        }
                        c10 = 0;
                        jArr[C3831l.b0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i11 + 1;
                        i12 = i10;
                        iArr2 = iArr;
                    }
                }
                i13++;
            }
        }
        m();
    }

    private final int k(int hash1) {
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

    private final int l(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
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
                int iK = k(i11);
                if (this.growthLimit == 0 && ((this.metadata[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iK >> 3;
                long j14 = jArr2[i20];
                int i21 = (iK & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iK - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iK;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void m() {
        this.growthLimit = U.c(get_capacity()) - this._size;
    }

    private final void n(int capacity) {
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
        m();
    }

    private final void o(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, U.f(initialCapacity)) : 0;
        this._capacity = iMax;
        n(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    private final void p(int newCapacity) {
        long[] jArr;
        C4415z c4415z = this;
        long[] jArr2 = c4415z.metadata;
        int[] iArr = c4415z.keys;
        int[] iArr2 = c4415z.values;
        int i10 = c4415z._capacity;
        o(newCapacity);
        long[] jArr3 = c4415z.metadata;
        int[] iArr3 = c4415z.keys;
        int[] iArr4 = c4415z.values;
        int i11 = c4415z._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int iHashCode = Integer.hashCode(i13) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iK = c4415z.k(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iK >> 3;
                int i16 = (iK & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iK - 7) & i11) + (i11 & 7)) >> 3] = j11;
                iArr3[iK] = i13;
                iArr4[iK] = iArr2[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            c4415z = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
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
        m();
    }

    public final void q(int key, int value) {
        int iL = l(key);
        if (iL < 0) {
            iL = ~iL;
        }
        this.keys[iL] = key;
        this.values[iL] = value;
    }

    public C4415z(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C4535d.a("Capacity must be a positive value.");
        }
        o(U.g(i10));
    }
}
