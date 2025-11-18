package androidx.datastore.preferences.protobuf;

/* compiled from: Utf8.java */
/* renamed from: androidx.datastore.preferences.protobuf.q1 */
/* loaded from: classes.dex */
final class C0406q1 {

    /* renamed from: a */
    private static final b f2872a;

    /* compiled from: Utf8.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q1$a */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static void m3180h(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (m3185m(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || m3185m(b4) || m3185m(b5)) {
                throw InvalidProtocolBufferException.m2532c();
            }
            int iM3190r = ((b2 & 7) << 18) | (m3190r(b3) << 12) | (m3190r(b4) << 6) | m3190r(b5);
            cArr[i2] = m3184l(iM3190r);
            cArr[i2 + 1] = m3189q(iM3190r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static void m3181i(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static void m3182j(byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (m3185m(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m3185m(b4)))) {
                throw InvalidProtocolBufferException.m2532c();
            }
            cArr[i2] = (char) (((b2 & 15) << 12) | (m3190r(b3) << 6) | m3190r(b4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static void m3183k(byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b2 < -62 || m3185m(b3)) {
                throw InvalidProtocolBufferException.m2532c();
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | m3190r(b3));
        }

        /* renamed from: l */
        private static char m3184l(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        /* renamed from: m */
        private static boolean m3185m(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static boolean m3186n(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static boolean m3187o(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static boolean m3188p(byte b2) {
            return b2 < -32;
        }

        /* renamed from: q */
        private static char m3189q(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        /* renamed from: r */
        private static int m3190r(byte b2) {
            return b2 & 63;
        }
    }

    /* compiled from: Utf8.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q1$b */
    static abstract class b {
        b() {
        }

        /* renamed from: a */
        abstract String mo3191a(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        /* renamed from: b */
        abstract int mo3192b(CharSequence charSequence, byte[] bArr, int i2, int i3);

        /* renamed from: c */
        final boolean m3193c(byte[] bArr, int i2, int i3) {
            return mo3194d(0, bArr, i2, i3) == 0;
        }

        /* renamed from: d */
        abstract int mo3194d(int i2, byte[] bArr, int i3, int i4);
    }

    /* compiled from: Utf8.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q1$c */
    static final class c extends b {
        c() {
        }

        /* renamed from: e */
        private static int m3195e(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return m3196f(bArr, i2, i3);
        }

        /* renamed from: f */
        private static int m3196f(byte[] bArr, int i2, int i3) {
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
                            return C0406q1.m3170l(bArr, i4, i3);
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
                        return C0406q1.m3170l(bArr, i4, i3);
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

        @Override // androidx.datastore.preferences.protobuf.C0406q1.b
        /* renamed from: a */
        String mo3191a(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!a.m3186n(b2)) {
                    break;
                }
                i2++;
                a.m3181i(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = bArr[i2];
                if (a.m3186n(b3)) {
                    int i8 = i6 + 1;
                    a.m3181i(b3, cArr, i6);
                    while (i7 < i4) {
                        byte b4 = bArr[i7];
                        if (!a.m3186n(b4)) {
                            break;
                        }
                        i7++;
                        a.m3181i(b4, cArr, i8);
                        i8++;
                    }
                    i2 = i7;
                    i6 = i8;
                } else if (a.m3188p(b3)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.m2532c();
                    }
                    a.m3183k(b3, bArr[i7], cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                } else if (a.m3187o(b3)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.m2532c();
                    }
                    int i9 = i7 + 1;
                    a.m3182j(b3, bArr[i7], bArr[i9], cArr, i6);
                    i2 = i9 + 1;
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.m2532c();
                    }
                    int i10 = i7 + 1;
                    byte b5 = bArr[i7];
                    int i11 = i10 + 1;
                    a.m3180h(b3, b5, bArr[i10], bArr[i11], cArr, i6);
                    i2 = i11 + 1;
                    i6 = i6 + 1 + 1;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.C0406q1.b
        /* renamed from: b */
        int mo3192b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char cCharAt;
            int length = charSequence.length();
            int i7 = i3 + i2;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i2) < i7 && (cCharAt = charSequence.charAt(i8)) < 128) {
                bArr[i6] = (byte) cCharAt;
                i8++;
            }
            if (i8 == length) {
                return i2 + length;
            }
            int i9 = i2 + i8;
            while (i8 < length) {
                char cCharAt2 = charSequence.charAt(i8);
                if (cCharAt2 >= 128 || i9 >= i7) {
                    if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                        i9 = i10 + 1;
                        bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i9 > i7 - 3) {
                            if (i9 > i7 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                    throw new d(i8, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                            }
                            int i11 = i8 + 1;
                            if (i11 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i12 = i9 + 1;
                                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i13 + 1;
                                    bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 = i14 + 1;
                                    bArr[i14] = (byte) ((codePoint & 63) | 128);
                                    i8 = i11;
                                } else {
                                    i8 = i11;
                                }
                            }
                            throw new d(i8 - 1, length);
                        }
                        int i15 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i4 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i8++;
                } else {
                    i4 = i9 + 1;
                    bArr[i9] = (byte) cCharAt2;
                }
                i9 = i4;
                i8++;
            }
            return i9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
        
            if (r8[r9] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.C0406q1.b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int mo3194d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                r7 = r7 ^ r2
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.C0406q1.m3159a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                r1 = r1 ^ r2
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = androidx.datastore.preferences.protobuf.C0406q1.m3159a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = androidx.datastore.preferences.protobuf.C0406q1.m3160b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = m3195e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0406q1.c.mo3194d(int, byte[], int, int):int");
        }
    }

    /* compiled from: Utf8.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q1$d */
    static class d extends IllegalArgumentException {
        d(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    /* compiled from: Utf8.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q1$e */
    static final class e extends b {
        e() {
        }

        /* renamed from: e */
        static boolean m3197e() {
            return C0403p1.m3083C() && C0403p1.m3084D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
        
            return -1;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int m3198f(byte[] r8, long r9, int r11) {
            /*
                int r0 = m3199g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = m3200h(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = m3200h(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.C0403p1.m3116s(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0406q1.e.m3198f(byte[], long, int):int");
        }

        /* renamed from: g */
        private static int m3199g(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            while (i3 < i2) {
                long j3 = 1 + j2;
                if (C0403p1.m3116s(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            return i2;
        }

        /* renamed from: h */
        private static int m3200h(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return C0406q1.m3167i(i2);
            }
            if (i3 == 1) {
                return C0406q1.m3168j(i2, C0403p1.m3116s(bArr, j2));
            }
            if (i3 == 2) {
                return C0406q1.m3169k(i2, C0403p1.m3116s(bArr, j2), C0403p1.m3116s(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.C0406q1.b
        /* renamed from: a */
        String mo3191a(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte bM3116s = C0403p1.m3116s(bArr, i2);
                if (!a.m3186n(bM3116s)) {
                    break;
                }
                i2++;
                a.m3181i(bM3116s, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte bM3116s2 = C0403p1.m3116s(bArr, i2);
                if (a.m3186n(bM3116s2)) {
                    int i8 = i6 + 1;
                    a.m3181i(bM3116s2, cArr, i6);
                    while (i7 < i4) {
                        byte bM3116s3 = C0403p1.m3116s(bArr, i7);
                        if (!a.m3186n(bM3116s3)) {
                            break;
                        }
                        i7++;
                        a.m3181i(bM3116s3, cArr, i8);
                        i8++;
                    }
                    i2 = i7;
                    i6 = i8;
                } else if (a.m3188p(bM3116s2)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.m2532c();
                    }
                    a.m3183k(bM3116s2, C0403p1.m3116s(bArr, i7), cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                } else if (a.m3187o(bM3116s2)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.m2532c();
                    }
                    int i9 = i7 + 1;
                    a.m3182j(bM3116s2, C0403p1.m3116s(bArr, i7), C0403p1.m3116s(bArr, i9), cArr, i6);
                    i2 = i9 + 1;
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.m2532c();
                    }
                    int i10 = i7 + 1;
                    byte bM3116s4 = C0403p1.m3116s(bArr, i7);
                    int i11 = i10 + 1;
                    a.m3180h(bM3116s2, bM3116s4, C0403p1.m3116s(bArr, i10), C0403p1.m3116s(bArr, i11), cArr, i6);
                    i2 = i11 + 1;
                    i6 = i6 + 1 + 1;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.C0406q1.b
        /* renamed from: b */
        int mo3192b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            char c2;
            long j2;
            long j3;
            long j4;
            int i4;
            char cCharAt;
            long j5 = i2;
            long j6 = i3 + j5;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (true) {
                c2 = 128;
                j2 = 1;
                if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                C0403p1.m3088H(bArr, j5, (byte) cCharAt);
                i5++;
                j5 = 1 + j5;
            }
            if (i5 == length) {
                return (int) j5;
            }
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= c2 || j5 >= j6) {
                    if (cCharAt2 < 2048 && j5 <= j6 - 2) {
                        long j7 = j5 + j2;
                        C0403p1.m3088H(bArr, j5, (byte) ((cCharAt2 >>> 6) | 960));
                        C0403p1.m3088H(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                        j3 = j7 + j2;
                        j4 = j2;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j5 > j6 - 3) {
                            if (j5 > j6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                    throw new d(i5, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j5);
                            }
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char cCharAt3 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j8 = j5 + 1;
                                    C0403p1.m3088H(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                    long j9 = j8 + 1;
                                    C0403p1.m3088H(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = j9 + 1;
                                    C0403p1.m3088H(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 = 1;
                                    j3 = j10 + 1;
                                    C0403p1.m3088H(bArr, j10, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new d(i5 - 1, length);
                        }
                        long j11 = j5 + j2;
                        C0403p1.m3088H(bArr, j5, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j12 = j11 + j2;
                        C0403p1.m3088H(bArr, j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        C0403p1.m3088H(bArr, j12, (byte) ((cCharAt2 & '?') | 128));
                        j3 = j12 + 1;
                        j4 = 1;
                    }
                    i5++;
                    c2 = 128;
                    long j13 = j4;
                    j5 = j3;
                    j2 = j13;
                } else {
                    long j14 = j5 + j2;
                    C0403p1.m3088H(bArr, j5, (byte) cCharAt2);
                    j4 = j2;
                    j3 = j14;
                }
                i5++;
                c2 = 128;
                long j132 = j4;
                j5 = j3;
                j2 = j132;
            }
            return (int) j5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.C0403p1.m3116s(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.C0403p1.m3116s(r13, r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.C0406q1.b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int mo3194d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0406q1.e.mo3194d(int, byte[], int, int):int");
        }
    }

    static {
        f2872a = (!e.m3197e() || C0365d.m2594c()) ? new c() : new e();
    }

    /* renamed from: e */
    static String m3163e(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return f2872a.mo3191a(bArr, i2, i3);
    }

    /* renamed from: f */
    static int m3164f(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f2872a.mo3192b(charSequence, bArr, i2, i3);
    }

    /* renamed from: g */
    static int m3165g(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iM3166h = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 2048) {
                    iM3166h += m3166h(charSequence, i2);
                    break;
                }
                iM3166h += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (iM3166h >= length) {
            return iM3166h;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iM3166h + 4294967296L));
    }

    /* renamed from: h */
    private static int m3166h(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new d(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m3167i(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m3168j(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m3169k(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m3170l(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return m3167i(b2);
        }
        if (i4 == 1) {
            return m3168j(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return m3169k(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    public static boolean m3171m(byte[] bArr) {
        return f2872a.m3193c(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static boolean m3172n(byte[] bArr, int i2, int i3) {
        return f2872a.m3193c(bArr, i2, i3);
    }
}
