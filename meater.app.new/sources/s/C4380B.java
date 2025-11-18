package s;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import oa.C4148A;
import t.C4535d;

/* compiled from: IntObjectMap.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J \u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\fR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Ls/B;", "V", "Ls/o;", "", "initialCapacity", "<init>", "(I)V", "Loa/F;", "o", "capacity", "n", "m", "()V", "key", "k", "(I)I", "hash1", "l", "h", "j", "newCapacity", "s", "value", "t", "(ILjava/lang/Object;)V", "p", "(ILjava/lang/Object;)Ljava/lang/Object;", "q", "(I)Ljava/lang/Object;", "index", "r", "i", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4380B<V> extends AbstractC4405o<V> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ C4380B(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this._capacity <= 8 || Long.compareUnsigned(C4148A.j(C4148A.j(this._size) * 32), C4148A.j(C4148A.j(this._capacity) * 25)) > 0) {
            s(U.e(this._capacity));
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
        Object[] objArr = this.values;
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
                    int iL = l(i16);
                    int i17 = i16 & i12;
                    if (((iL - i17) & i12) / 8 == ((i13 - i17) & i12) / 8) {
                        jArr[i14] = ((r10 & 127) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C3831l.b0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iL >> 3;
                        long j11 = jArr[i18];
                        int i19 = (iL & 7) << 3;
                        if (((j11 >> i19) & 255) == 128) {
                            int i20 = i13;
                            iArr = iArr2;
                            jArr[i18] = (j11 & (~(255 << i19))) | ((r10 & 127) << i19);
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            iArr[iL] = iArr[i20];
                            iArr[i20] = 0;
                            objArr[iL] = objArr[i20];
                            objArr[i20] = null;
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
                            iArr[iB] = iArr[iL];
                            iArr[iL] = iArr[i22];
                            iArr[i22] = iArr[iB];
                            objArr[iB] = objArr[iL];
                            objArr[iL] = objArr[i22];
                            objArr[i22] = objArr[iB];
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

    private final int k(int key) {
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
                int iL = l(i11);
                if (this.growthLimit == 0 && ((this.metadata[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    h();
                    iL = l(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iL >> 3;
                long j14 = jArr2[i20];
                int i21 = (iL & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iL - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iL;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int l(int hash1) {
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
        this.values = new Object[iMax];
    }

    private final void s(int newCapacity) {
        long[] jArr;
        C4380B<V> c4380b = this;
        long[] jArr2 = c4380b.metadata;
        int[] iArr = c4380b.keys;
        Object[] objArr = c4380b.values;
        int i10 = c4380b._capacity;
        o(newCapacity);
        long[] jArr3 = c4380b.metadata;
        int[] iArr2 = c4380b.keys;
        Object[] objArr2 = c4380b.values;
        int i11 = c4380b._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int iHashCode = Integer.hashCode(i13) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iL = c4380b.l(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iL >> 3;
                int i16 = (iL & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iL - 7) & i11) + (i11 & 7)) >> 3] = j11;
                iArr2[iL] = i13;
                objArr2[iL] = objArr[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            c4380b = this;
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
        C3831l.u(this.values, null, 0, this._capacity);
        m();
    }

    public final V p(int key, V value) {
        int iK = k(key);
        Object[] objArr = this.values;
        V v10 = (V) objArr[iK];
        this.keys[iK] = key;
        objArr[iK] = value;
        return v10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V q(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.keys
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.r(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C4380B.q(int):java.lang.Object");
    }

    public final V r(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        Object[] objArr = this.values;
        V v10 = (V) objArr[index];
        objArr[index] = null;
        return v10;
    }

    public final void t(int key, V value) {
        int iK = k(key);
        this.keys[iK] = key;
        this.values[iK] = value;
    }

    public C4380B(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C4535d.a("Capacity must be a positive value.");
        }
        o(U.g(i10));
    }
}
