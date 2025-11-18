package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    private CompactStringObjectMap(int i2, int i3, Object[] objArr) {
        this._hashMask = i2;
        this._spillCount = i3;
        this._hashArea = objArr;
    }

    private final Object _find2(String str, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        int i3 = this._hashMask + 1;
        int i4 = ((i2 >> 1) + i3) << 1;
        Object obj2 = this._hashArea[i4];
        if (str.equals(obj2)) {
            return this._hashArea[i4 + 1];
        }
        if (obj2 != null) {
            int i5 = (i3 + (i3 >> 1)) << 1;
            int i6 = this._spillCount + i5;
            while (i5 < i6) {
                Object obj3 = this._hashArea[i5];
                if (obj3 == str || str.equals(obj3)) {
                    return this._hashArea[i5 + 1];
                }
                i5 += 2;
            }
        }
        return null;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        int iFindSize = findSize(map.size());
        int i2 = iFindSize - 1;
        int i3 = (iFindSize >> 1) + iFindSize;
        Object[] objArrCopyOf = new Object[i3 * 2];
        int i4 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            int iHashCode = key.hashCode() & i2;
            int i5 = iHashCode + iHashCode;
            if (objArrCopyOf[i5] != null) {
                i5 = ((iHashCode >> 1) + iFindSize) << 1;
                if (objArrCopyOf[i5] != null) {
                    i5 = (i3 << 1) + i4;
                    i4 += 2;
                    if (i5 >= objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                    }
                }
            }
            objArrCopyOf[i5] = key;
            objArrCopyOf[i5 + 1] = entry.getValue();
        }
        return new CompactStringObjectMap(i2, i4, objArrCopyOf);
    }

    private static final int findSize(int i2) {
        if (i2 <= 5) {
            return 8;
        }
        if (i2 <= 12) {
            return 16;
        }
        int i3 = 32;
        while (i3 < i2 + (i2 >> 2)) {
            i3 += i3;
        }
        return i3;
    }

    public Object find(String str) {
        int iHashCode = str.hashCode() & this._hashMask;
        int i2 = iHashCode << 1;
        Object obj = this._hashArea[i2];
        return (obj == str || str.equals(obj)) ? this._hashArea[i2 + 1] : _find2(str, iHashCode, obj);
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i2 = 0; i2 < length; i2 += 2) {
            Object obj = this._hashArea[i2];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
