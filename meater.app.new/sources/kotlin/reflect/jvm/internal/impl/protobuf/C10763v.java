package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: Utf8.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.v */
/* loaded from: classes3.dex */
final class C10763v {
    /* renamed from: a */
    private static int m38485a(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* renamed from: b */
    private static int m38486b(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* renamed from: c */
    private static int m38487c(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* renamed from: d */
    private static int m38488d(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return m38485a(b2);
        }
        if (i4 == 1) {
            return m38486b(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return m38487c(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public static boolean m38489e(byte[] bArr) {
        return m38490f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static boolean m38490f(byte[] bArr, int i2, int i3) {
        return m38492h(bArr, i2, i3) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        if (r7[r8] > (-65)) goto L53;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m38491g(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L82
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L82
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            r6 = r6 ^ r2
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = m38486b(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r4 = 0
            if (r1 != 0) goto L5d
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5b
            int r6 = m38486b(r0, r1)
            return r6
        L5b:
            r8 = r6
            goto L60
        L5d:
            int r6 = r6 >> 16
            byte r4 = (byte) r6
        L60:
            if (r4 != 0) goto L6e
            int r6 = r8 + 1
            r4 = r7[r8]
            if (r6 < r9) goto L6d
            int r6 = m38487c(r0, r1, r4)
            return r6
        L6d:
            r8 = r6
        L6e:
            if (r1 > r3) goto L81
            int r6 = r0 << 28
            int r1 = r1 + 112
            int r6 = r6 + r1
            int r6 = r6 >> 30
            if (r6 != 0) goto L81
            if (r4 > r3) goto L81
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L81:
            return r2
        L82:
            int r6 = m38492h(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10763v.m38491g(int, byte[], int, int):int");
    }

    /* renamed from: h */
    public static int m38492h(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        return m38493i(bArr, i2, i3);
    }

    /* renamed from: i */
    private static int m38493i(byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i4 >= i3 - 2) {
                        return m38488d(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i4 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 1) {
                    return m38488d(bArr, i4, i3);
                }
                int i7 = i4 + 1;
                byte b4 = bArr[i4];
                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                    i2 = i7 + 1;
                    if (bArr[i7] > -65) {
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }
}
