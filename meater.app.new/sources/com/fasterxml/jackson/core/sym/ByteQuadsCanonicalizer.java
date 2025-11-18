package com.fasterxml.jackson.core.sym;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ByteQuadsCanonicalizer {
    private int _count;
    private final boolean _failOnDoS;
    private int[] _hashArea;
    private boolean _hashShared;
    private int _hashSize;
    private boolean _intern;
    private int _longNameOffset;
    private String[] _names;
    private transient boolean _needRehash;
    private final ByteQuadsCanonicalizer _parent;
    private int _secondaryStart;
    private final int _seed;
    private int _spilloverEnd;
    private final AtomicReference<TableInfo> _tableInfo;
    private int _tertiaryShift;
    private int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i2, boolean z, int i3, boolean z2) {
        this._parent = null;
        this._seed = i3;
        this._intern = z;
        this._failOnDoS = z2;
        int i4 = 16;
        if (i2 < 16) {
            i2 = 16;
        } else if (((i2 - 1) & i2) != 0) {
            while (i4 < i2) {
                i4 += i4;
            }
            i2 = i4;
        }
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i2));
    }

    private int _appendLongName(int[] iArr, int i2) {
        int i3 = this._longNameOffset;
        int i4 = i3 + i2;
        int[] iArr2 = this._hashArea;
        if (i4 > iArr2.length) {
            this._hashArea = Arrays.copyOf(this._hashArea, this._hashArea.length + Math.max(i4 - iArr2.length, Math.min(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, this._hashSize)));
        }
        System.arraycopy(iArr, 0, this._hashArea, i3, i2);
        this._longNameOffset += i2;
        return i3;
    }

    private final int _calcOffset(int i2) {
        return (i2 & (this._hashSize - 1)) << 2;
    }

    static int _calcTertiaryShift(int i2) {
        int i3 = i2 >> 2;
        if (i3 < 64) {
            return 4;
        }
        if (i3 <= 256) {
            return 5;
        }
        return i3 <= 1024 ? 6 : 7;
    }

    private int _findOffsetForAdd(int i2) {
        int i_calcOffset = _calcOffset(i2);
        int[] iArr = this._hashArea;
        if (iArr[i_calcOffset + 3] == 0) {
            return i_calcOffset;
        }
        int i3 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i_calcOffset >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this._spilloverEnd;
        int i9 = i8 + 4;
        this._spilloverEnd = i9;
        if (i9 >= (this._hashSize << 3)) {
            if (this._failOnDoS) {
                _reportTooManyCollisions();
            }
            this._needRehash = true;
        }
        return i8;
    }

    private String _findSecondary(int i2, int i3) {
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i2 >> (i5 + 2)) << i5);
        int[] iArr = this._hashArea;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i3 == iArr[i6] && 1 == i8) {
                return this._names[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr[i_spilloverStart] && 1 == iArr[i_spilloverStart + 3]) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    private final int _spilloverStart() {
        int i2 = this._hashSize;
        return (i2 << 3) - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean _verifyLongName(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5._hashArea
            r1 = 0
            r2 = 1
            switch(r7) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r6 = r5._verifyLongName2(r6, r7, r8)
            return r6
        Lc:
            r7 = r6[r1]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L15
            return r1
        L15:
            r8 = r3
            r7 = 1
            goto L19
        L18:
            r7 = 0
        L19:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L24
            return r1
        L24:
            r8 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L32
            return r1
        L32:
            r8 = r4
            goto L35
        L34:
            r7 = 0
        L35:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L40
            return r1
        L40:
            r8 = r4
            goto L43
        L42:
            r3 = 0
        L43:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L4e
            return r1
        L4e:
            int r8 = r7 + 1
            r7 = r6[r7]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r7 == r4) goto L59
            return r1
        L59:
            int r7 = r8 + 1
            r8 = r6[r8]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r8 == r3) goto L64
            return r1
        L64:
            r6 = r6[r7]
            r7 = r0[r4]
            if (r6 == r7) goto L6b
            return r1
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            if (iArr[i4] != this._hashArea[i3]) {
                return false;
            }
            if (i5 >= i2) {
                return true;
            }
            i4 = i5;
            i3 = i6;
        }
    }

    private void _verifyNeedForRehash() {
        if (this._count > (this._hashSize >> 1)) {
            int i_spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
            int i2 = this._count;
            if (i_spilloverStart <= ((i2 + 1) >> 7)) {
                double d2 = i2;
                double d3 = this._hashSize;
                Double.isNaN(d3);
                if (d2 <= d3 * 0.8d) {
                    return;
                }
            }
            this._needRehash = true;
        }
    }

    private void _verifySharing() {
        if (this._hashShared) {
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
            _verifyNeedForRehash();
        }
        if (this._needRehash) {
            rehash();
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i2 = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i2 == tableInfo2.count) {
            return;
        }
        if (i2 > 6000) {
            tableInfo = TableInfo.createInitial(64);
        }
        this._tableInfo.compareAndSet(tableInfo2, tableInfo);
    }

    private void nukeSymbols(boolean z) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() {
        this._needRehash = false;
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i2 = this._hashSize;
        int i3 = this._count;
        int i4 = i2 + i2;
        int i5 = this._spilloverEnd;
        if (i4 > 65536) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[iArr.length + (i2 << 3)];
        this._hashSize = i4;
        int i6 = i4 << 2;
        this._secondaryStart = i6;
        this._tertiaryStart = i6 + (i6 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i4);
        this._names = new String[strArr.length << 1];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i9 != 0) {
                i7++;
                String str = strArr[i8 >> 2];
                if (i9 == 1) {
                    iArr2[0] = iArr[i8];
                    addName(str, iArr2, 1);
                } else if (i9 == 2) {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    addName(str, iArr2, 2);
                } else if (i9 != 3) {
                    if (i9 > iArr2.length) {
                        iArr2 = new int[i9];
                    }
                    System.arraycopy(iArr, iArr[i8 + 1], iArr2, 0, i9);
                    addName(str, iArr2, i9);
                } else {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    iArr2[2] = iArr[i8 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i7 == i3) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i3 + ", copyCount=" + i7);
    }

    protected void _reportTooManyCollisions() {
        if (this._hashSize <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this._count + " entries, hash area of " + this._hashSize + " slots is now full (all " + (this._hashSize >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String addName(String str, int[] iArr, int i2) {
        int i_findOffsetForAdd;
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i2 == 1) {
            i_findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[i_findOffsetForAdd] = iArr[0];
            iArr2[i_findOffsetForAdd + 3] = 1;
        } else if (i2 == 2) {
            i_findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[i_findOffsetForAdd] = iArr[0];
            iArr3[i_findOffsetForAdd + 1] = iArr[1];
            iArr3[i_findOffsetForAdd + 3] = 2;
        } else if (i2 != 3) {
            int iCalcHash = calcHash(iArr, i2);
            i_findOffsetForAdd = _findOffsetForAdd(iCalcHash);
            this._hashArea[i_findOffsetForAdd] = iCalcHash;
            int i_appendLongName = _appendLongName(iArr, i2);
            int[] iArr4 = this._hashArea;
            iArr4[i_findOffsetForAdd + 1] = i_appendLongName;
            iArr4[i_findOffsetForAdd + 3] = i2;
        } else {
            int i_findOffsetForAdd2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[i_findOffsetForAdd2] = iArr[0];
            iArr5[i_findOffsetForAdd2 + 1] = iArr[1];
            iArr5[i_findOffsetForAdd2 + 2] = iArr[2];
            iArr5[i_findOffsetForAdd2 + 3] = 3;
            i_findOffsetForAdd = i_findOffsetForAdd2;
        }
        this._names[i_findOffsetForAdd >> 2] = str;
        this._count++;
        _verifyNeedForRehash();
        return str;
    }

    public int calcHash(int i2) {
        int i3 = i2 ^ this._seed;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        return i5 + (i5 >>> 12);
    }

    public String findName(int i2) {
        int i_calcOffset = _calcOffset(calcHash(i2));
        int[] iArr = this._hashArea;
        int i3 = iArr[i_calcOffset + 3];
        if (i3 == 1) {
            if (iArr[i_calcOffset] == i2) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 1) {
            if (iArr[i4] == i2) {
                return this._names[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i2);
    }

    public ByteQuadsCanonicalizer makeChild(int i2) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i2), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i2), this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i2 = this._secondaryStart;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public void release() {
        if (this._parent == null || !maybeDirty()) {
            return;
        }
        this._parent.mergeChild(new TableInfo(this));
        this._hashShared = true;
    }

    public int secondaryCount() {
        int i2 = this._tertiaryStart;
        int i3 = 0;
        for (int i4 = this._secondaryStart + 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i2 = this._tertiaryStart + 3;
        int i3 = this._hashSize + i2;
        int i4 = 0;
        while (i2 < i3) {
            if (this._hashArea[i2] != 0) {
                i4++;
            }
            i2 += 4;
        }
        return i4;
    }

    public String toString() {
        int iPrimaryCount = primaryCount();
        int iSecondaryCount = secondaryCount();
        int iTertiaryCount = tertiaryCount();
        int iSpilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(iPrimaryCount), Integer.valueOf(iSecondaryCount), Integer.valueOf(iTertiaryCount), Integer.valueOf(iSpilloverCount), Integer.valueOf(iPrimaryCount + iSecondaryCount + iTertiaryCount + iSpilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i2 = this._hashSize << 3;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int calcHash(int i2, int i3) {
        int i4 = i2 + (i2 >>> 15);
        int i5 = ((i4 ^ (i4 >>> 9)) + (i3 * 33)) ^ this._seed;
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    protected static ByteQuadsCanonicalizer createRoot(int i2) {
        return new ByteQuadsCanonicalizer(64, true, i2, true);
    }

    public int calcHash(int i2, int i3, int i4) {
        int i5 = i2 ^ this._seed;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i3) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i4;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        return i9 ^ (i9 << 9);
    }

    public int calcHash(int[] iArr, int i2) {
        if (i2 >= 4) {
            int i3 = iArr[0] ^ this._seed;
            int i4 = i3 + (i3 >>> 9) + iArr[1];
            int i5 = ((i4 + (i4 >>> 15)) * 33) ^ iArr[2];
            int i6 = i5 + (i5 >>> 4);
            for (int i7 = 3; i7 < i2; i7++) {
                int i8 = iArr[i7];
                i6 += i8 ^ (i8 >> 21);
            }
            int i9 = i6 * 65599;
            int i10 = i9 + (i9 >>> 19);
            return (i10 << 5) ^ i10;
        }
        throw new IllegalArgumentException();
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z, int i2, boolean z2, TableInfo tableInfo) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i2;
        this._intern = z;
        this._failOnDoS = z2;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i3 = tableInfo.size;
        this._hashSize = i3;
        int i4 = i3 << 2;
        this._secondaryStart = i4;
        this._tertiaryStart = i4 + (i4 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._needRehash = false;
        this._hashShared = true;
    }

    private static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i2, int i3, int i4, int[] iArr, String[] strArr, int i5, int i6) {
            this.size = i2;
            this.count = i3;
            this.tertiaryShift = i4;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i5;
            this.longNameOffset = i6;
        }

        public static TableInfo createInitial(int i2) {
            int i3 = i2 << 3;
            return new TableInfo(i2, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i2), new int[i3], new String[i2 << 1], i3 - i2, i3);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    private String _findSecondary(int i2, int i3, int i4) {
        int i5 = this._tertiaryStart;
        int i6 = this._tertiaryShift;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int[] iArr = this._hashArea;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i3 == iArr[i7] && i4 == iArr[i7 + 1] && 2 == i9) {
                return this._names[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr[i_spilloverStart] && i4 == iArr[i_spilloverStart + 1] && 2 == iArr[i_spilloverStart + 3]) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String findName(int i2, int i3) {
        int i_calcOffset = _calcOffset(calcHash(i2, i3));
        int[] iArr = this._hashArea;
        int i4 = iArr[i_calcOffset + 3];
        if (i4 == 2) {
            if (i2 == iArr[i_calcOffset] && i3 == iArr[i_calcOffset + 1]) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i2 == iArr[i5] && i3 == iArr[i5 + 1]) {
                return this._names[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i2, i3);
    }

    private String _findSecondary(int i2, int i3, int i4, int i5) {
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((i2 >> (i7 + 2)) << i7);
        int[] iArr = this._hashArea;
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i3 == iArr[i8] && i4 == iArr[i8 + 1] && i5 == iArr[i8 + 2] && 3 == i10) {
                return this._names[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr[i_spilloverStart] && i4 == iArr[i_spilloverStart + 1] && i5 == iArr[i_spilloverStart + 2] && 3 == iArr[i_spilloverStart + 3]) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String findName(int i2, int i3, int i4) {
        int i_calcOffset = _calcOffset(calcHash(i2, i3, i4));
        int[] iArr = this._hashArea;
        int i5 = iArr[i_calcOffset + 3];
        if (i5 == 3) {
            if (i2 == iArr[i_calcOffset] && iArr[i_calcOffset + 1] == i3 && iArr[i_calcOffset + 2] == i4) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 3) {
            if (i2 == iArr[i6] && iArr[i6 + 1] == i3 && iArr[i6 + 2] == i4) {
                return this._names[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i2, i3, i4);
    }

    private String _findSecondary(int i2, int i3, int[] iArr, int i4) {
        int i5 = this._tertiaryStart;
        int i6 = this._tertiaryShift;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int[] iArr2 = this._hashArea;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr2[i7 + 3];
            if (i3 == iArr2[i7] && i4 == i9 && _verifyLongName(iArr, i4, iArr2[i7 + 1])) {
                return this._names[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i3 == iArr2[i_spilloverStart] && i4 == iArr2[i_spilloverStart + 3] && _verifyLongName(iArr, i4, iArr2[i_spilloverStart + 1])) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String findName(int[] iArr, int i2) {
        if (i2 < 4) {
            if (i2 == 3) {
                return findName(iArr[0], iArr[1], iArr[2]);
            }
            if (i2 == 2) {
                return findName(iArr[0], iArr[1]);
            }
            return findName(iArr[0]);
        }
        int iCalcHash = calcHash(iArr, i2);
        int i_calcOffset = _calcOffset(iCalcHash);
        int[] iArr2 = this._hashArea;
        int i3 = iArr2[i_calcOffset + 3];
        if (iCalcHash == iArr2[i_calcOffset] && i3 == i2 && _verifyLongName(iArr, i2, iArr2[i_calcOffset + 1])) {
            return this._names[i_calcOffset >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i5 = iArr2[i4 + 3];
        if (iCalcHash == iArr2[i4] && i5 == i2 && _verifyLongName(iArr, i2, iArr2[i4 + 1])) {
            return this._names[i4 >> 2];
        }
        return _findSecondary(i_calcOffset, iCalcHash, iArr, i2);
    }
}
