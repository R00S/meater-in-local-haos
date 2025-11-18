package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.p176io.NumberInput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class TextBuffer {
    static final char[] NO_CHARS = new char[0];
    private final BufferRecycler _allocator;
    private char[] _currentSegment;
    private int _currentSize;
    private boolean _hasSegments;
    private char[] _inputBuffer;
    private int _inputLen;
    private int _inputStart;
    private char[] _resultArray;
    private String _resultString;
    private int _segmentSize;
    private ArrayList<char[]> _segments;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    private char[] buf(int i2) {
        BufferRecycler bufferRecycler = this._allocator;
        return bufferRecycler != null ? bufferRecycler.allocCharBuffer(2, i2) : new char[Math.max(i2, 1000)];
    }

    private char[] carr(int i2) {
        return new char[i2];
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    private void expand(int i2) {
        if (this._segments == null) {
            this._segments = new ArrayList<>();
        }
        char[] cArr = this._currentSegment;
        this._hasSegments = true;
        this._segments.add(cArr);
        this._segmentSize += cArr.length;
        this._currentSize = 0;
        int length = cArr.length;
        int i3 = length + (length >> 1);
        if (i3 < 1000) {
            i3 = 1000;
        } else if (i3 > 262144) {
            i3 = 262144;
        }
        this._currentSegment = carr(i3);
    }

    private char[] resultArray() {
        int i2;
        String str = this._resultString;
        if (str != null) {
            return str.toCharArray();
        }
        int i3 = this._inputStart;
        if (i3 >= 0) {
            int i4 = this._inputLen;
            return i4 < 1 ? NO_CHARS : i3 == 0 ? Arrays.copyOf(this._inputBuffer, i4) : Arrays.copyOfRange(this._inputBuffer, i3, i4 + i3);
        }
        int size = size();
        if (size < 1) {
            return NO_CHARS;
        }
        char[] carr = carr(size);
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i2 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                char[] cArr = this._segments.get(i5);
                int length = cArr.length;
                System.arraycopy(cArr, 0, carr, i2, length);
                i2 += length;
            }
        } else {
            i2 = 0;
        }
        System.arraycopy(this._currentSegment, 0, carr, i2, this._currentSize);
        return carr;
    }

    private void unshare(int i2) {
        int i3 = this._inputLen;
        this._inputLen = 0;
        char[] cArr = this._inputBuffer;
        this._inputBuffer = null;
        int i4 = this._inputStart;
        this._inputStart = -1;
        int i5 = i2 + i3;
        char[] cArr2 = this._currentSegment;
        if (cArr2 == null || i5 > cArr2.length) {
            this._currentSegment = buf(i5);
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i4, this._currentSegment, 0, i3);
        }
        this._segmentSize = 0;
        this._currentSize = i3;
    }

    public void append(char c2) {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            expand(1);
            cArr = this._currentSegment;
        }
        int i2 = this._currentSize;
        this._currentSize = i2 + 1;
        cArr[i2] = c2;
    }

    public char[] contentsAsArray() {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrResultArray = resultArray();
        this._resultArray = cArrResultArray;
        return cArrResultArray;
    }

    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this._resultArray;
        if (cArr3 != null) {
            return NumberInput.parseBigDecimal(cArr3);
        }
        int i2 = this._inputStart;
        return (i2 < 0 || (cArr2 = this._inputBuffer) == null) ? (this._segmentSize != 0 || (cArr = this._currentSegment) == null) ? NumberInput.parseBigDecimal(contentsAsArray()) : NumberInput.parseBigDecimal(cArr, 0, this._currentSize) : NumberInput.parseBigDecimal(cArr2, i2, this._inputLen);
    }

    public double contentsAsDouble() throws NumberFormatException {
        return NumberInput.parseDouble(contentsAsString());
    }

    public String contentsAsString() {
        if (this._resultString == null) {
            if (this._resultArray != null) {
                this._resultString = new String(this._resultArray);
            } else {
                int i2 = this._inputStart;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (i2 < 0) {
                    int i3 = this._segmentSize;
                    int i4 = this._currentSize;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this._currentSegment, 0, i4);
                        }
                        this._resultString = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this._segments;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr = this._segments.get(i5);
                                sb.append(cArr, 0, cArr.length);
                            }
                        }
                        sb.append(this._currentSegment, 0, this._currentSize);
                        this._resultString = sb.toString();
                    }
                } else {
                    if (this._inputLen < 1) {
                        this._resultString = HttpUrl.FRAGMENT_ENCODE_SET;
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this._resultString = new String(this._inputBuffer, this._inputStart, this._inputLen);
                }
            }
        }
        return this._resultString;
    }

    public char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrBuf = buf(0);
        this._currentSegment = cArrBuf;
        return cArrBuf;
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i2 = (length >> 1) + length;
        if (i2 > 262144) {
            i2 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i2);
        this._currentSegment = cArrCopyOf;
        return cArrCopyOf;
    }

    public char[] finishCurrentSegment() {
        if (this._segments == null) {
            this._segments = new ArrayList<>();
        }
        this._hasSegments = true;
        this._segments.add(this._currentSegment);
        int length = this._currentSegment.length;
        this._segmentSize += length;
        this._currentSize = 0;
        int i2 = length + (length >> 1);
        if (i2 < 1000) {
            i2 = 1000;
        } else if (i2 > 262144) {
            i2 = 262144;
        }
        char[] carr = carr(i2);
        this._currentSegment = carr;
        return carr;
    }

    public char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = buf(0);
            } else if (this._currentSize >= cArr.length) {
                expand(1);
            }
        }
        return this._currentSegment;
    }

    public int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public char[] getTextBuffer() {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        String str = this._resultString;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this._resultArray = charArray;
            return charArray;
        }
        if (this._hasSegments) {
            return contentsAsArray();
        }
        char[] cArr2 = this._currentSegment;
        return cArr2 == null ? NO_CHARS : cArr2;
    }

    public int getTextOffset() {
        int i2 = this._inputStart;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public void releaseBuffers() {
        if (this._allocator == null) {
            resetWithEmpty();
        } else if (this._currentSegment != null) {
            resetWithEmpty();
            char[] cArr = this._currentSegment;
            this._currentSegment = null;
            this._allocator.releaseCharBuffer(2, cArr);
        }
    }

    public void resetWithCopy(char[] cArr, int i2, int i3) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i3);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i2, i3);
    }

    public void resetWithEmpty() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithShared(char[] cArr, int i2, int i3) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i2;
        this._inputLen = i3;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithString(String str) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public String setCurrentAndReturn(int i2) {
        this._currentSize = i2;
        if (this._segmentSize > 0) {
            return contentsAsString();
        }
        String str = i2 == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : new String(this._currentSegment, 0, i2);
        this._resultString = str;
        return str;
    }

    public void setCurrentLength(int i2) {
        this._currentSize = i2;
    }

    public int size() {
        if (this._inputStart >= 0) {
            return this._inputLen;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this._resultString;
        return str != null ? str.length() : this._segmentSize + this._currentSize;
    }

    public String toString() {
        return contentsAsString();
    }

    public void append(char[] cArr, int i2, int i3) {
        if (this._inputStart >= 0) {
            unshare(i3);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr2 = this._currentSegment;
        int length = cArr2.length;
        int i4 = this._currentSize;
        int i5 = length - i4;
        if (i5 >= i3) {
            System.arraycopy(cArr, i2, cArr2, i4, i3);
            this._currentSize += i3;
            return;
        }
        if (i5 > 0) {
            System.arraycopy(cArr, i2, cArr2, i4, i5);
            i2 += i5;
            i3 -= i5;
        }
        do {
            expand(i3);
            int iMin = Math.min(this._currentSegment.length, i3);
            System.arraycopy(cArr, i2, this._currentSegment, 0, iMin);
            this._currentSize += iMin;
            i2 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    public void append(String str, int i2, int i3) {
        if (this._inputStart >= 0) {
            unshare(i3);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i4 = this._currentSize;
        int i5 = length - i4;
        if (i5 >= i3) {
            str.getChars(i2, i2 + i3, cArr, i4);
            this._currentSize += i3;
            return;
        }
        if (i5 > 0) {
            int i6 = i2 + i5;
            str.getChars(i2, i6, cArr, i4);
            i3 -= i5;
            i2 = i6;
        }
        while (true) {
            expand(i3);
            int iMin = Math.min(this._currentSegment.length, i3);
            int i7 = i2 + iMin;
            str.getChars(i2, i7, this._currentSegment, 0);
            this._currentSize += iMin;
            i3 -= iMin;
            if (i3 <= 0) {
                return;
            } else {
                i2 = i7;
            }
        }
    }
}
