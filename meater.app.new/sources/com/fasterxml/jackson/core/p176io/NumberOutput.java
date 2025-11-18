package com.fasterxml.jackson.core.p176io;

/* loaded from: classes2.dex */
public final class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs;
    private static final String[] sSmallIntStrs2;

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = 0;
                while (i5 < 10) {
                    TRIPLET_TO_CHARS[i2] = ((i3 + 48) << 16) | ((i4 + 48) << 8) | (i5 + 48);
                    i5++;
                    i2++;
                }
            }
        }
        sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int _full3(int i2, char[] cArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 >> 16);
        int i6 = i5 + 1;
        cArr[i5] = (char) ((i4 >> 8) & 127);
        int i7 = i6 + 1;
        cArr[i6] = (char) (i4 & 127);
        return i7;
    }

    private static int _leading3(int i2, char[] cArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i3] = (char) (i4 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i4 >> 8) & 127);
            i3++;
        }
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 & 127);
        return i5;
    }

    private static int _outputFullBillion(int i2, char[] cArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int[] iArr = TRIPLET_TO_CHARS;
        int i7 = iArr[i6];
        int i8 = i3 + 1;
        cArr[i3] = (char) (i7 >> 16);
        int i9 = i8 + 1;
        cArr[i8] = (char) ((i7 >> 8) & 127);
        int i10 = i9 + 1;
        cArr[i9] = (char) (i7 & 127);
        int i11 = iArr[i4 - (i6 * 1000)];
        int i12 = i10 + 1;
        cArr[i10] = (char) (i11 >> 16);
        int i13 = i12 + 1;
        cArr[i12] = (char) ((i11 >> 8) & 127);
        int i14 = i13 + 1;
        cArr[i13] = (char) (i11 & 127);
        int i15 = iArr[i5];
        int i16 = i14 + 1;
        cArr[i14] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        return i18;
    }

    private static int _outputSmallestI(char[] cArr, int i2) {
        String str = SMALLEST_INT;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    private static int _outputSmallestL(char[] cArr, int i2) {
        String str = SMALLEST_LONG;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    private static int _outputUptoBillion(int i2, char[] cArr, int i3) {
        if (i2 < MILLION) {
            if (i2 < 1000) {
                return _leading3(i2, cArr, i3);
            }
            int i4 = i2 / 1000;
            return _outputUptoMillion(cArr, i3, i4, i2 - (i4 * 1000));
        }
        int i5 = i2 / 1000;
        int i6 = i2 - (i5 * 1000);
        int i7 = i5 / 1000;
        int i8 = i5 - (i7 * 1000);
        int i_leading3 = _leading3(i7, cArr, i3);
        int[] iArr = TRIPLET_TO_CHARS;
        int i9 = iArr[i8];
        int i10 = i_leading3 + 1;
        cArr[i_leading3] = (char) (i9 >> 16);
        int i11 = i10 + 1;
        cArr[i10] = (char) ((i9 >> 8) & 127);
        int i12 = i11 + 1;
        cArr[i11] = (char) (i9 & 127);
        int i13 = iArr[i6];
        int i14 = i12 + 1;
        cArr[i12] = (char) (i13 >> 16);
        int i15 = i14 + 1;
        cArr[i14] = (char) ((i13 >> 8) & 127);
        int i16 = i15 + 1;
        cArr[i15] = (char) (i13 & 127);
        return i16;
    }

    private static int _outputUptoMillion(char[] cArr, int i2, int i3, int i4) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                cArr[i2] = (char) (i5 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i5 >> 8) & 127);
            i2++;
        }
        int i6 = i2 + 1;
        cArr[i2] = (char) (i5 & 127);
        int i7 = iArr[i4];
        int i8 = i6 + 1;
        cArr[i6] = (char) (i7 >> 16);
        int i9 = i8 + 1;
        cArr[i8] = (char) ((i7 >> 8) & 127);
        int i10 = i9 + 1;
        cArr[i9] = (char) (i7 & 127);
        return i10;
    }

    public static int outputInt(int i2, char[] cArr, int i3) {
        int i4;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i3);
            }
            cArr[i3] = '-';
            i2 = -i2;
            i3++;
        }
        if (i2 < MILLION) {
            if (i2 >= 1000) {
                int i5 = i2 / 1000;
                return _full3(i2 - (i5 * 1000), cArr, _leading3(i5, cArr, i3));
            }
            if (i2 >= 10) {
                return _leading3(i2, cArr, i3);
            }
            cArr[i3] = (char) (i2 + 48);
            return i3 + 1;
        }
        int i6 = BILLION;
        if (i2 < i6) {
            int i7 = i2 / 1000;
            int i8 = i7 / 1000;
            return _full3(i2 - (i7 * 1000), cArr, _full3(i7 - (i8 * 1000), cArr, _leading3(i8, cArr, i3)));
        }
        int i9 = i2 - i6;
        if (i9 >= i6) {
            i9 -= i6;
            i4 = i3 + 1;
            cArr[i3] = '2';
        } else {
            i4 = i3 + 1;
            cArr[i3] = '1';
        }
        return _outputFullBillion(i9, cArr, i4);
    }

    public static int outputLong(long j2, char[] cArr, int i2) {
        int i_outputFullBillion;
        if (j2 < 0) {
            if (j2 > MIN_INT_AS_LONG) {
                return outputInt((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i2);
            }
            cArr[i2] = '-';
            j2 = -j2;
            i2++;
        } else if (j2 <= MAX_INT_AS_LONG) {
            return outputInt((int) j2, cArr, i2);
        }
        long j3 = BILLION_L;
        long j4 = j2 / j3;
        long j5 = j2 - (j4 * j3);
        if (j4 < j3) {
            i_outputFullBillion = _outputUptoBillion((int) j4, cArr, i2);
        } else {
            long j6 = j4 / j3;
            int i_leading3 = _leading3((int) j6, cArr, i2);
            i_outputFullBillion = _outputFullBillion((int) (j4 - (j3 * j6)), cArr, i_leading3);
        }
        return _outputFullBillion((int) j5, cArr, i_outputFullBillion);
    }

    public static String toString(int i2) {
        String[] strArr = sSmallIntStrs;
        if (i2 < strArr.length) {
            if (i2 >= 0) {
                return strArr[i2];
            }
            int i3 = (-i2) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i3 < strArr2.length) {
                return strArr2[i3];
            }
        }
        return Integer.toString(i2);
    }

    private static int _outputSmallestI(byte[] bArr, int i2) {
        int length = SMALLEST_INT.length();
        int i3 = 0;
        while (i3 < length) {
            bArr[i2] = (byte) SMALLEST_INT.charAt(i3);
            i3++;
            i2++;
        }
        return i2;
    }

    private static int _outputSmallestL(byte[] bArr, int i2) {
        int length = SMALLEST_LONG.length();
        int i3 = 0;
        while (i3 < length) {
            bArr[i2] = (byte) SMALLEST_LONG.charAt(i3);
            i3++;
            i2++;
        }
        return i2;
    }

    private static int _full3(int i2, byte[] bArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        int i5 = i3 + 1;
        bArr[i3] = (byte) (i4 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i4 >> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) i4;
        return i7;
    }

    private static int _leading3(int i2, byte[] bArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i3] = (byte) (i4 >> 16);
                i3++;
            }
            bArr[i3] = (byte) (i4 >> 8);
            i3++;
        }
        int i5 = i3 + 1;
        bArr[i3] = (byte) i4;
        return i5;
    }

    public static String toString(long j2) {
        if (j2 <= 2147483647L && j2 >= -2147483648L) {
            return toString((int) j2);
        }
        return Long.toString(j2);
    }

    public static String toString(double d2) {
        return Double.toString(d2);
    }

    private static int _outputUptoMillion(byte[] bArr, int i2, int i3, int i4) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                bArr[i2] = (byte) (i5 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i5 >> 8);
            i2++;
        }
        int i6 = i2 + 1;
        bArr[i2] = (byte) i5;
        int i7 = iArr[i4];
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        return i10;
    }

    public static int outputLong(long j2, byte[] bArr, int i2) {
        int i_outputFullBillion;
        if (j2 < 0) {
            if (j2 > MIN_INT_AS_LONG) {
                return outputInt((int) j2, bArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return _outputSmallestL(bArr, i2);
            }
            bArr[i2] = 45;
            j2 = -j2;
            i2++;
        } else if (j2 <= MAX_INT_AS_LONG) {
            return outputInt((int) j2, bArr, i2);
        }
        long j3 = BILLION_L;
        long j4 = j2 / j3;
        long j5 = j2 - (j4 * j3);
        if (j4 < j3) {
            i_outputFullBillion = _outputUptoBillion((int) j4, bArr, i2);
        } else {
            long j6 = j4 / j3;
            int i_leading3 = _leading3((int) j6, bArr, i2);
            i_outputFullBillion = _outputFullBillion((int) (j4 - (j3 * j6)), bArr, i_leading3);
        }
        return _outputFullBillion((int) j5, bArr, i_outputFullBillion);
    }

    private static int _outputFullBillion(int i2, byte[] bArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int[] iArr = TRIPLET_TO_CHARS;
        int i8 = iArr[i6];
        int i9 = i3 + 1;
        bArr[i3] = (byte) (i8 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i8;
        int i12 = iArr[i7];
        int i13 = i11 + 1;
        bArr[i11] = (byte) (i12 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i12 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) i12;
        int i16 = iArr[i5];
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 >> 16);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >> 8);
        int i19 = i18 + 1;
        bArr[i18] = (byte) i16;
        return i19;
    }

    private static int _outputUptoBillion(int i2, byte[] bArr, int i3) {
        if (i2 < MILLION) {
            if (i2 < 1000) {
                return _leading3(i2, bArr, i3);
            }
            int i4 = i2 / 1000;
            return _outputUptoMillion(bArr, i3, i4, i2 - (i4 * 1000));
        }
        int i5 = i2 / 1000;
        int i6 = i2 - (i5 * 1000);
        int i7 = i5 / 1000;
        int i8 = i5 - (i7 * 1000);
        int i_leading3 = _leading3(i7, bArr, i3);
        int[] iArr = TRIPLET_TO_CHARS;
        int i9 = iArr[i8];
        int i10 = i_leading3 + 1;
        bArr[i_leading3] = (byte) (i9 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i9 >> 8);
        int i12 = i11 + 1;
        bArr[i11] = (byte) i9;
        int i13 = iArr[i6];
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 16);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 8);
        int i16 = i15 + 1;
        bArr[i15] = (byte) i13;
        return i16;
    }

    public static int outputInt(int i2, byte[] bArr, int i3) {
        int i4;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return _outputSmallestI(bArr, i3);
            }
            bArr[i3] = 45;
            i2 = -i2;
            i3++;
        }
        if (i2 < MILLION) {
            if (i2 >= 1000) {
                int i5 = i2 / 1000;
                return _full3(i2 - (i5 * 1000), bArr, _leading3(i5, bArr, i3));
            }
            if (i2 < 10) {
                int i6 = i3 + 1;
                bArr[i3] = (byte) (i2 + 48);
                return i6;
            }
            return _leading3(i2, bArr, i3);
        }
        int i7 = BILLION;
        if (i2 >= i7) {
            int i8 = i2 - i7;
            if (i8 >= i7) {
                i8 -= i7;
                i4 = i3 + 1;
                bArr[i3] = 50;
            } else {
                i4 = i3 + 1;
                bArr[i3] = 49;
            }
            return _outputFullBillion(i8, bArr, i4);
        }
        int i9 = i2 / 1000;
        int i10 = i9 / 1000;
        return _full3(i2 - (i9 * 1000), bArr, _full3(i9 - (i10 * 1000), bArr, _leading3(i10, bArr, i3)));
    }
}
