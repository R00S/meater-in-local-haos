package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ox */
/* loaded from: classes2.dex */
final class C7022ox extends AbstractC6911lx {
    C7022ox() {
    }

    /* renamed from: g */
    private static int m15711g(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            return C6837jx.m15381h(i2);
        }
        if (i3 == 1) {
            return C6837jx.m15378e(i2, C6726gx.m15199a(bArr, j2));
        }
        if (i3 == 2) {
            return C6837jx.m15380g(i2, C6726gx.m15199a(bArr, j2), C6726gx.m15199a(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC6911lx
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int mo15519a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7022ox.mo15519a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6911lx
    /* renamed from: b */
    final int mo15520b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
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
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i2 + i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i5 = 0;
        while (true) {
            c2 = 128;
            j2 = 1;
            if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                break;
            }
            C6726gx.m15207i(bArr, j5, (byte) cCharAt);
            i5++;
            j5 = 1 + j5;
        }
        if (i5 == length) {
            return (int) j5;
        }
        while (i5 < length) {
            char cCharAt3 = charSequence.charAt(i5);
            if (cCharAt3 >= c2 || j5 >= j6) {
                if (cCharAt3 < 2048 && j5 <= j6 - 2) {
                    long j7 = j5 + j2;
                    C6726gx.m15207i(bArr, j5, (byte) ((cCharAt3 >>> 6) | 960));
                    C6726gx.m15207i(bArr, j7, (byte) ((cCharAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j5 > j6 - 3) {
                        if (j5 > j6 - 4) {
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i4)))) {
                                throw new C6985nx(i5, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(cCharAt3);
                            sb2.append(" at index ");
                            sb2.append(j5);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char cCharAt4 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                long j8 = j5 + 1;
                                C6726gx.m15207i(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j9 = j8 + 1;
                                C6726gx.m15207i(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = j9 + 1;
                                C6726gx.m15207i(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j10 + 1;
                                C6726gx.m15207i(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new C6985nx(i5 - 1, length);
                    }
                    long j11 = j5 + j2;
                    C6726gx.m15207i(bArr, j5, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    C6726gx.m15207i(bArr, j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    C6726gx.m15207i(bArr, j12, (byte) ((cCharAt3 & '?') | 128));
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
                C6726gx.m15207i(bArr, j5, (byte) cCharAt3);
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

    @Override // com.google.android.gms.internal.ads.AbstractC6911lx
    /* renamed from: c */
    final void mo15521c(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c2;
        long j2;
        int i2;
        char cCharAt;
        long jM15188J = C6726gx.m15188J(byteBuffer);
        long jPosition = byteBuffer.position() + jM15188J;
        long jLimit = byteBuffer.limit() + jM15188J;
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            char cCharAt2 = charSequence.charAt(length - 1);
            int iLimit = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(iLimit);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i3 = 0;
        while (true) {
            c2 = 128;
            if (i3 >= length || (cCharAt = charSequence.charAt(i3)) >= 128) {
                break;
            }
            C6726gx.m15200b(jPosition, (byte) cCharAt);
            i3++;
            jPosition = 1 + jPosition;
        }
        if (i3 == length) {
            byteBuffer.position((int) (jPosition - jM15188J));
            return;
        }
        while (i3 < length) {
            char cCharAt3 = charSequence.charAt(i3);
            if (cCharAt3 < c2 && jPosition < jLimit) {
                C6726gx.m15200b(jPosition, (byte) cCharAt3);
                jPosition++;
                j2 = jM15188J;
            } else if (cCharAt3 >= 2048 || jPosition > jLimit - 2) {
                j2 = jM15188J;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || jPosition > jLimit - 3) {
                    if (jPosition > jLimit - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i2)))) {
                            throw new C6985nx(i3, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt3);
                        sb2.append(" at index ");
                        sb2.append(jPosition);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i4 = i3 + 1;
                    if (i4 != length) {
                        char cCharAt4 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                            long j3 = jPosition + 1;
                            C6726gx.m15200b(jPosition, (byte) ((codePoint >>> 18) | 240));
                            long j4 = j3 + 1;
                            C6726gx.m15200b(j3, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j5 = j4 + 1;
                            C6726gx.m15200b(j4, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j6 = j5 + 1;
                            C6726gx.m15200b(j5, (byte) ((codePoint & 63) | 128));
                            i3 = i4;
                            jPosition = j6;
                        } else {
                            i3 = i4;
                        }
                    }
                    throw new C6985nx(i3 - 1, length);
                }
                long j7 = jPosition + 1;
                C6726gx.m15200b(jPosition, (byte) ((cCharAt3 >>> '\f') | 480));
                long j8 = j7 + 1;
                C6726gx.m15200b(j7, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                C6726gx.m15200b(j8, (byte) ((cCharAt3 & '?') | 128));
                jPosition = j8 + 1;
            } else {
                j2 = jM15188J;
                long j9 = jPosition + 1;
                C6726gx.m15200b(jPosition, (byte) ((cCharAt3 >>> 6) | 960));
                C6726gx.m15200b(j9, (byte) ((cCharAt3 & '?') | 128));
                jPosition = j9 + 1;
            }
            i3++;
            jM15188J = j2;
            c2 = 128;
        }
        byteBuffer.position((int) (jPosition - jM15188J));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6911lx
    /* renamed from: f */
    final String mo15523f(byte[] bArr, int i2, int i3) throws zzdok {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte bM15199a = C6726gx.m15199a(bArr, i2);
            if (!C6874kx.m15491i(bM15199a)) {
                break;
            }
            i2++;
            C6874kx.m15486d(bM15199a, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte bM15199a2 = C6726gx.m15199a(bArr, i2);
            if (C6874kx.m15491i(bM15199a2)) {
                int i8 = i6 + 1;
                C6874kx.m15486d(bM15199a2, cArr, i6);
                while (i7 < i4) {
                    byte bM15199a3 = C6726gx.m15199a(bArr, i7);
                    if (!C6874kx.m15491i(bM15199a3)) {
                        break;
                    }
                    i7++;
                    C6874kx.m15486d(bM15199a3, cArr, i8);
                    i8++;
                }
                i2 = i7;
                i6 = i8;
            } else if (C6874kx.m15492j(bM15199a2)) {
                if (i7 >= i4) {
                    throw zzdok.m19757h();
                }
                C6874kx.m15485c(bM15199a2, C6726gx.m15199a(bArr, i7), cArr, i6);
                i2 = i7 + 1;
                i6++;
            } else if (C6874kx.m15493k(bM15199a2)) {
                if (i7 >= i4 - 1) {
                    throw zzdok.m19757h();
                }
                int i9 = i7 + 1;
                C6874kx.m15484b(bM15199a2, C6726gx.m15199a(bArr, i7), C6726gx.m15199a(bArr, i9), cArr, i6);
                i2 = i9 + 1;
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw zzdok.m19757h();
                }
                int i10 = i7 + 1;
                byte bM15199a4 = C6726gx.m15199a(bArr, i7);
                int i11 = i10 + 1;
                C6874kx.m15483a(bM15199a2, bM15199a4, C6726gx.m15199a(bArr, i10), C6726gx.m15199a(bArr, i11), cArr, i6);
                i2 = i11 + 1;
                i6 = i6 + 1 + 1;
            }
        }
        return new String(cArr, 0, i6);
    }
}
