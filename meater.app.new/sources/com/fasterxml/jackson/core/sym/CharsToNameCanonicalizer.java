package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class CharsToNameCanonicalizer {
    static final CharsToNameCanonicalizer sBootstrapSymbolTable = new CharsToNameCanonicalizer();
    private Bucket[] _buckets;
    private boolean _canonicalize;
    private boolean _dirty;
    private final int _flags;
    private final int _hashSeed;
    private int _indexMask;
    private int _longestCollisionList;
    private BitSet _overflows;
    private CharsToNameCanonicalizer _parent;
    private int _size;
    private int _sizeThreshold;
    private String[] _symbols;

    static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i2, int i3) {
            if (this.symbol.length() != i3) {
                return null;
            }
            int i4 = 0;
            while (this.symbol.charAt(i4) == cArr[i2 + i4]) {
                i4++;
                if (i4 >= i3) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer() {
        this._canonicalize = true;
        this._flags = -1;
        this._dirty = true;
        this._hashSeed = 0;
        this._longestCollisionList = 0;
        initTables(64);
    }

    private String _addSymbol(char[] cArr, int i2, int i3, int i4, int i5) {
        if (!this._dirty) {
            copyArrays();
            this._dirty = true;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i5 = _hashToIndex(calcHash(cArr, i2, i3));
        }
        String str = new String(cArr, i2, i3);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i5] == null) {
            strArr[i5] = str;
        } else {
            int i6 = i5 >> 1;
            Bucket bucket = new Bucket(str, this._buckets[i6]);
            int i7 = bucket.length;
            if (i7 > 100) {
                _handleSpillOverflow(i6, bucket);
            } else {
                this._buckets[i6] = bucket;
                this._longestCollisionList = Math.max(i7, this._longestCollisionList);
            }
        }
        return str;
    }

    private String _findSymbol2(char[] cArr, int i2, int i3, Bucket bucket) {
        while (bucket != null) {
            String strHas = bucket.has(cArr, i2, i3);
            if (strHas != null) {
                return strHas;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i2, Bucket bucket) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i2);
        } else if (bitSet.get(i2)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                reportTooManyCollisions(100);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i2);
        }
        this._symbols[i2 + i2] = bucket.symbol;
        this._buckets[i2] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i2) {
        return i2 - (i2 >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    private void initTables(int i2) {
        this._symbols = new String[i2];
        this._buckets = new Bucket[i2 >> 1];
        this._indexMask = i2 - 1;
        this._size = 0;
        this._longestCollisionList = 0;
        this._sizeThreshold = _thresholdSize(i2);
    }

    private CharsToNameCanonicalizer makeOrphan(int i2) {
        return new CharsToNameCanonicalizer(null, -1, this._symbols, this._buckets, this._size, i2, this._longestCollisionList);
    }

    private void mergeChild(CharsToNameCanonicalizer charsToNameCanonicalizer) {
        if (charsToNameCanonicalizer.size() > 12000) {
            synchronized (this) {
                initTables(256);
                this._dirty = false;
            }
        } else {
            if (charsToNameCanonicalizer.size() <= size()) {
                return;
            }
            synchronized (this) {
                this._symbols = charsToNameCanonicalizer._symbols;
                this._buckets = charsToNameCanonicalizer._buckets;
                this._size = charsToNameCanonicalizer._size;
                this._sizeThreshold = charsToNameCanonicalizer._sizeThreshold;
                this._indexMask = charsToNameCanonicalizer._indexMask;
                this._longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
                this._dirty = false;
            }
        }
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int length = strArr.length;
        int i2 = length + length;
        if (i2 > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._dirty = true;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i2];
        this._buckets = new Bucket[i2 >> 1];
        this._indexMask = i2 - 1;
        this._sizeThreshold = _thresholdSize(i2);
        int i3 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i3++;
                int i_hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this._symbols;
                if (strArr2[i_hashToIndex] == null) {
                    strArr2[i_hashToIndex] = str;
                } else {
                    int i4 = i_hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i4]);
                    this._buckets[i4] = bucket;
                    iMax = Math.max(iMax, bucket.length);
                }
            }
        }
        int i5 = length >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (Bucket bucket2 = bucketArr[i6]; bucket2 != null; bucket2 = bucket2.next) {
                i3++;
                String str2 = bucket2.symbol;
                int i_hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this._symbols;
                if (strArr3[i_hashToIndex2] == null) {
                    strArr3[i_hashToIndex2] = str2;
                } else {
                    int i7 = i_hashToIndex2 >> 1;
                    Bucket bucket3 = new Bucket(str2, this._buckets[i7]);
                    this._buckets[i7] = bucket3;
                    iMax = Math.max(iMax, bucket3.length);
                }
            }
        }
        this._longestCollisionList = iMax;
        this._overflows = null;
        if (i3 == this._size) {
            return;
        }
        throw new Error("Internal error on SymbolTable.rehash(): had " + this._size + " entries; now have " + i3 + ".");
    }

    public int _hashToIndex(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return (i4 + (i4 >>> 3)) & this._indexMask;
    }

    public int calcHash(char[] cArr, int i2, int i3) {
        int i4 = this._hashSeed;
        int i5 = i3 + i2;
        while (i2 < i5) {
            i4 = (i4 * 33) + cArr[i2];
            i2++;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public String findSymbol(char[] cArr, int i2, int i3, int i4) {
        if (i3 < 1) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!this._canonicalize) {
            return new String(cArr, i2, i3);
        }
        int i_hashToIndex = _hashToIndex(i4);
        String str = this._symbols[i_hashToIndex];
        if (str != null) {
            if (str.length() == i3) {
                int i5 = 0;
                while (str.charAt(i5) == cArr[i2 + i5]) {
                    i5++;
                    if (i5 == i3) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[i_hashToIndex >> 1];
            if (bucket != null) {
                String strHas = bucket.has(cArr, i2, i3);
                if (strHas != null) {
                    return strHas;
                }
                String str_findSymbol2 = _findSymbol2(cArr, i2, i3, bucket.next);
                if (str_findSymbol2 != null) {
                    return str_findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i2, i3, i4, i_hashToIndex);
    }

    public int hashSeed() {
        return this._hashSeed;
    }

    public CharsToNameCanonicalizer makeChild(int i2) {
        String[] strArr;
        Bucket[] bucketArr;
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            strArr = this._symbols;
            bucketArr = this._buckets;
            i3 = this._size;
            i4 = this._hashSeed;
            i5 = this._longestCollisionList;
        }
        return new CharsToNameCanonicalizer(this, i2, strArr, bucketArr, i3, i4, i5);
    }

    public boolean maybeDirty() {
        return this._dirty;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(this);
            this._dirty = false;
        }
    }

    protected void reportTooManyCollisions(int i2) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + i2 + " -- suspect a DoS attack based on hash collisions");
    }

    public int size() {
        return this._size;
    }

    protected static CharsToNameCanonicalizer createRoot(int i2) {
        return sBootstrapSymbolTable.makeOrphan(i2);
    }

    public int calcHash(String str) {
        int length = str.length();
        int iCharAt = this._hashSeed;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt * 33) + str.charAt(i2);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i2, String[] strArr, Bucket[] bucketArr, int i3, int i4, int i5) {
        this._parent = charsToNameCanonicalizer;
        this._flags = i2;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2);
        this._symbols = strArr;
        this._buckets = bucketArr;
        this._size = i3;
        this._hashSeed = i4;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._longestCollisionList = i5;
        this._dirty = false;
    }
}
