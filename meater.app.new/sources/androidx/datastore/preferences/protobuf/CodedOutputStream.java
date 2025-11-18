package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0406q1;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC0374g {

    /* renamed from: a */
    private static final Logger f2658a = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: b */
    private static final boolean f2659b = C0403p1.m3083C();

    /* renamed from: c */
    C0389l f2660c;

    /* renamed from: d */
    private boolean f2661d;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$b */
    private static abstract class AbstractC0353b extends CodedOutputStream {

        /* renamed from: e */
        final byte[] f2662e;

        /* renamed from: f */
        final int f2663f;

        /* renamed from: g */
        int f2664g;

        /* renamed from: h */
        int f2665h;

        AbstractC0353b(int i2) {
            super();
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.f2662e = bArr;
            this.f2663f = bArr.length;
        }

        /* renamed from: b1 */
        final void m2515b1(byte b2) {
            byte[] bArr = this.f2662e;
            int i2 = this.f2664g;
            this.f2664g = i2 + 1;
            bArr[i2] = b2;
            this.f2665h++;
        }

        /* renamed from: c1 */
        final void m2516c1(int i2) {
            byte[] bArr = this.f2662e;
            int i3 = this.f2664g;
            int i4 = i3 + 1;
            this.f2664g = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.f2664g = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.f2664g = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f2664g = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
            this.f2665h += 4;
        }

        /* renamed from: d1 */
        final void m2517d1(long j2) {
            byte[] bArr = this.f2662e;
            int i2 = this.f2664g;
            int i3 = i2 + 1;
            this.f2664g = i3;
            bArr[i2] = (byte) (j2 & 255);
            int i4 = i3 + 1;
            this.f2664g = i4;
            bArr[i3] = (byte) ((j2 >> 8) & 255);
            int i5 = i4 + 1;
            this.f2664g = i5;
            bArr[i4] = (byte) ((j2 >> 16) & 255);
            int i6 = i5 + 1;
            this.f2664g = i6;
            bArr[i5] = (byte) (255 & (j2 >> 24));
            int i7 = i6 + 1;
            this.f2664g = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.f2664g = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.f2664g = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f2664g = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            this.f2665h += 8;
        }

        /* renamed from: e1 */
        final void m2518e1(int i2) {
            if (i2 >= 0) {
                m2520g1(i2);
            } else {
                m2521h1(i2);
            }
        }

        /* renamed from: f1 */
        final void m2519f1(int i2, int i3) {
            m2520g1(C0409r1.m3204c(i2, i3));
        }

        /* renamed from: g1 */
        final void m2520g1(int i2) {
            if (!CodedOutputStream.f2659b) {
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.f2662e;
                    int i3 = this.f2664g;
                    this.f2664g = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    this.f2665h++;
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f2662e;
                int i4 = this.f2664g;
                this.f2664g = i4 + 1;
                bArr2[i4] = (byte) i2;
                this.f2665h++;
                return;
            }
            long j2 = this.f2664g;
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.f2662e;
                int i5 = this.f2664g;
                this.f2664g = i5 + 1;
                C0403p1.m3088H(bArr3, i5, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            byte[] bArr4 = this.f2662e;
            int i6 = this.f2664g;
            this.f2664g = i6 + 1;
            C0403p1.m3088H(bArr4, i6, (byte) i2);
            this.f2665h += (int) (this.f2664g - j2);
        }

        /* renamed from: h1 */
        final void m2521h1(long j2) {
            if (!CodedOutputStream.f2659b) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f2662e;
                    int i2 = this.f2664g;
                    this.f2664g = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    this.f2665h++;
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f2662e;
                int i3 = this.f2664g;
                this.f2664g = i3 + 1;
                bArr2[i3] = (byte) j2;
                this.f2665h++;
                return;
            }
            long j3 = this.f2664g;
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.f2662e;
                int i4 = this.f2664g;
                this.f2664g = i4 + 1;
                C0403p1.m3088H(bArr3, i4, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f2662e;
            int i5 = this.f2664g;
            this.f2664g = i5 + 1;
            C0403p1.m3088H(bArr4, i5, (byte) j2);
            this.f2665h += (int) (this.f2664g - j3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: i0 */
        public final int mo2497i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$c */
    private static class C0354c extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f2666e;

        /* renamed from: f */
        private final int f2667f;

        /* renamed from: g */
        private final int f2668g;

        /* renamed from: h */
        private int f2669h;

        C0354c(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i4 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i4)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.f2666e = bArr;
            this.f2667f = i2;
            this.f2669h = i2;
            this.f2668g = i4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public final void mo2470E0(int i2, int i3) throws IOException {
            mo2488W0(i2, 0);
            mo2471F0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public final void mo2471F0(int i2) throws IOException {
            if (i2 >= 0) {
                mo2490Y0(i2);
            } else {
                mo2492a1(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: I0 */
        final void mo2474I0(int i2, InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) throws IOException {
            mo2488W0(i2, 2);
            mo2490Y0(((AbstractC0356a) interfaceC0405q0).m2546k(interfaceC0373f1));
            interfaceC0373f1.mo2699h(interfaceC0405q0, this.f2660c);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public final void mo2475J0(InterfaceC0405q0 interfaceC0405q0) throws IOException {
            mo2490Y0(interfaceC0405q0.mo3153e());
            interfaceC0405q0.mo3156i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public final void mo2476K0(int i2, InterfaceC0405q0 interfaceC0405q0) throws IOException {
            mo2488W0(1, 3);
            mo2489X0(2, i2);
            m2524c1(3, interfaceC0405q0);
            mo2488W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public final void mo2477L0(int i2, AbstractC0377h abstractC0377h) throws IOException {
            mo2488W0(1, 3);
            mo2489X0(2, i2);
            mo2503o0(3, abstractC0377h);
            mo2488W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: U0 */
        public final void mo2486U0(int i2, String str) throws IOException {
            mo2488W0(i2, 2);
            mo2487V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: V0 */
        public final void mo2487V0(String str) throws IOException {
            int i2 = this.f2669h;
            try {
                int iM2434X = CodedOutputStream.m2434X(str.length() * 3);
                int iM2434X2 = CodedOutputStream.m2434X(str.length());
                if (iM2434X2 == iM2434X) {
                    int i3 = i2 + iM2434X2;
                    this.f2669h = i3;
                    int iM3164f = C0406q1.m3164f(str, this.f2666e, i3, mo2497i0());
                    this.f2669h = i2;
                    mo2490Y0((iM3164f - i2) - iM2434X2);
                    this.f2669h = iM3164f;
                } else {
                    mo2490Y0(C0406q1.m3165g(str));
                    this.f2669h = C0406q1.m3164f(str, this.f2666e, this.f2669h, mo2497i0());
                }
            } catch (C0406q1.d e2) {
                this.f2669h = i2;
                m2495d0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: W0 */
        public final void mo2488W0(int i2, int i3) throws IOException {
            mo2490Y0(C0409r1.m3204c(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: X0 */
        public final void mo2489X0(int i2, int i3) throws IOException {
            mo2488W0(i2, 0);
            mo2490Y0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: Y0 */
        public final void mo2490Y0(int i2) throws IOException {
            if (!CodedOutputStream.f2659b || C0365d.m2594c() || mo2497i0() < 5) {
                while ((i2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f2666e;
                        int i3 = this.f2669h;
                        this.f2669h = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2669h), Integer.valueOf(this.f2668g), 1), e2);
                    }
                }
                byte[] bArr2 = this.f2666e;
                int i4 = this.f2669h;
                this.f2669h = i4 + 1;
                bArr2[i4] = (byte) i2;
                return;
            }
            if ((i2 & (-128)) == 0) {
                byte[] bArr3 = this.f2666e;
                int i5 = this.f2669h;
                this.f2669h = i5 + 1;
                C0403p1.m3088H(bArr3, i5, (byte) i2);
                return;
            }
            byte[] bArr4 = this.f2666e;
            int i6 = this.f2669h;
            this.f2669h = i6 + 1;
            C0403p1.m3088H(bArr4, i6, (byte) (i2 | 128));
            int i7 = i2 >>> 7;
            if ((i7 & (-128)) == 0) {
                byte[] bArr5 = this.f2666e;
                int i8 = this.f2669h;
                this.f2669h = i8 + 1;
                C0403p1.m3088H(bArr5, i8, (byte) i7);
                return;
            }
            byte[] bArr6 = this.f2666e;
            int i9 = this.f2669h;
            this.f2669h = i9 + 1;
            C0403p1.m3088H(bArr6, i9, (byte) (i7 | 128));
            int i10 = i7 >>> 7;
            if ((i10 & (-128)) == 0) {
                byte[] bArr7 = this.f2666e;
                int i11 = this.f2669h;
                this.f2669h = i11 + 1;
                C0403p1.m3088H(bArr7, i11, (byte) i10);
                return;
            }
            byte[] bArr8 = this.f2666e;
            int i12 = this.f2669h;
            this.f2669h = i12 + 1;
            C0403p1.m3088H(bArr8, i12, (byte) (i10 | 128));
            int i13 = i10 >>> 7;
            if ((i13 & (-128)) == 0) {
                byte[] bArr9 = this.f2666e;
                int i14 = this.f2669h;
                this.f2669h = i14 + 1;
                C0403p1.m3088H(bArr9, i14, (byte) i13);
                return;
            }
            byte[] bArr10 = this.f2666e;
            int i15 = this.f2669h;
            this.f2669h = i15 + 1;
            C0403p1.m3088H(bArr10, i15, (byte) (i13 | 128));
            byte[] bArr11 = this.f2666e;
            int i16 = this.f2669h;
            this.f2669h = i16 + 1;
            C0403p1.m3088H(bArr11, i16, (byte) (i13 >>> 7));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: Z0 */
        public final void mo2491Z0(int i2, long j2) throws IOException {
            mo2488W0(i2, 0);
            mo2492a1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0374g
        /* renamed from: a */
        public final void mo2522a(byte[] bArr, int i2, int i3) throws IOException {
            m2523b1(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: a1 */
        public final void mo2492a1(long j2) throws IOException {
            if (CodedOutputStream.f2659b && mo2497i0() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f2666e;
                    int i2 = this.f2669h;
                    this.f2669h = i2 + 1;
                    C0403p1.m3088H(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f2666e;
                int i3 = this.f2669h;
                this.f2669h = i3 + 1;
                C0403p1.m3088H(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f2666e;
                    int i4 = this.f2669h;
                    this.f2669h = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2669h), Integer.valueOf(this.f2668g), 1), e2);
                }
            }
            byte[] bArr4 = this.f2666e;
            int i5 = this.f2669h;
            this.f2669h = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        /* renamed from: b1 */
        public final void m2523b1(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.f2666e, this.f2669h, i3);
                this.f2669h += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2669h), Integer.valueOf(this.f2668g), Integer.valueOf(i3)), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: c0 */
        public void mo2494c0() {
        }

        /* renamed from: c1 */
        public final void m2524c1(int i2, InterfaceC0405q0 interfaceC0405q0) throws IOException {
            mo2488W0(i2, 2);
            mo2475J0(interfaceC0405q0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: i0 */
        public final int mo2497i0() {
            return this.f2668g - this.f2669h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: j0 */
        public final void mo2498j0(byte b2) throws IOException {
            try {
                byte[] bArr = this.f2666e;
                int i2 = this.f2669h;
                this.f2669h = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2669h), Integer.valueOf(this.f2668g), 1), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: k0 */
        public final void mo2499k0(int i2, boolean z) throws IOException {
            mo2488W0(i2, 0);
            mo2498j0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: n0 */
        public final void mo2502n0(byte[] bArr, int i2, int i3) throws IOException {
            mo2490Y0(i3);
            m2523b1(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: o0 */
        public final void mo2503o0(int i2, AbstractC0377h abstractC0377h) throws IOException {
            mo2488W0(i2, 2);
            mo2504p0(abstractC0377h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: p0 */
        public final void mo2504p0(AbstractC0377h abstractC0377h) throws IOException {
            mo2490Y0(abstractC0377h.size());
            abstractC0377h.mo2723L(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: u0 */
        public final void mo2509u0(int i2, int i3) throws IOException {
            mo2488W0(i2, 5);
            mo2510v0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: v0 */
        public final void mo2510v0(int i2) throws IOException {
            try {
                byte[] bArr = this.f2666e;
                int i3 = this.f2669h;
                int i4 = i3 + 1;
                this.f2669h = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i4 + 1;
                this.f2669h = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i5 + 1;
                this.f2669h = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                this.f2669h = i6 + 1;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2669h), Integer.valueOf(this.f2668g), 1), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: w0 */
        public final void mo2511w0(int i2, long j2) throws IOException {
            mo2488W0(i2, 1);
            mo2512x0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: x0 */
        public final void mo2512x0(long j2) throws IOException {
            try {
                byte[] bArr = this.f2666e;
                int i2 = this.f2669h;
                int i3 = i2 + 1;
                this.f2669h = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i4 = i3 + 1;
                this.f2669h = i4;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i5 = i4 + 1;
                this.f2669h = i5;
                bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
                int i6 = i5 + 1;
                this.f2669h = i6;
                bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
                int i7 = i6 + 1;
                this.f2669h = i7;
                bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
                int i8 = i7 + 1;
                this.f2669h = i8;
                bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
                int i9 = i8 + 1;
                this.f2669h = i9;
                bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
                this.f2669h = i9 + 1;
                bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2669h), Integer.valueOf(this.f2668g), 1), e2);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$d */
    private static final class C0355d extends AbstractC0353b {

        /* renamed from: i */
        private final OutputStream f2670i;

        C0355d(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f2670i = outputStream;
        }

        /* renamed from: i1 */
        private void m2525i1() throws IOException {
            this.f2670i.write(this.f2662e, 0, this.f2664g);
            this.f2664g = 0;
        }

        /* renamed from: j1 */
        private void m2526j1(int i2) throws IOException {
            if (this.f2663f - this.f2664g < i2) {
                m2525i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public void mo2470E0(int i2, int i3) throws IOException {
            m2526j1(20);
            m2519f1(i2, 0);
            m2518e1(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public void mo2471F0(int i2) throws IOException {
            if (i2 >= 0) {
                mo2490Y0(i2);
            } else {
                mo2492a1(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: I0 */
        void mo2474I0(int i2, InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) throws IOException {
            mo2488W0(i2, 2);
            m2529m1(interfaceC0405q0, interfaceC0373f1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public void mo2475J0(InterfaceC0405q0 interfaceC0405q0) throws IOException {
            mo2490Y0(interfaceC0405q0.mo3153e());
            interfaceC0405q0.mo3156i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public void mo2476K0(int i2, InterfaceC0405q0 interfaceC0405q0) throws IOException {
            mo2488W0(1, 3);
            mo2489X0(2, i2);
            m2528l1(3, interfaceC0405q0);
            mo2488W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public void mo2477L0(int i2, AbstractC0377h abstractC0377h) throws IOException {
            mo2488W0(1, 3);
            mo2489X0(2, i2);
            mo2503o0(3, abstractC0377h);
            mo2488W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: U0 */
        public void mo2486U0(int i2, String str) throws IOException {
            mo2488W0(i2, 2);
            mo2487V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: V0 */
        public void mo2487V0(String str) throws IOException {
            int iM3165g;
            try {
                int length = str.length() * 3;
                int iM2434X = CodedOutputStream.m2434X(length);
                int i2 = iM2434X + length;
                int i3 = this.f2663f;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iM3164f = C0406q1.m3164f(str, bArr, 0, length);
                    mo2490Y0(iM3164f);
                    mo2522a(bArr, 0, iM3164f);
                    return;
                }
                if (i2 > i3 - this.f2664g) {
                    m2525i1();
                }
                int iM2434X2 = CodedOutputStream.m2434X(str.length());
                int i4 = this.f2664g;
                try {
                    if (iM2434X2 == iM2434X) {
                        int i5 = i4 + iM2434X2;
                        this.f2664g = i5;
                        int iM3164f2 = C0406q1.m3164f(str, this.f2662e, i5, this.f2663f - i5);
                        this.f2664g = i4;
                        iM3165g = (iM3164f2 - i4) - iM2434X2;
                        m2520g1(iM3165g);
                        this.f2664g = iM3164f2;
                    } else {
                        iM3165g = C0406q1.m3165g(str);
                        m2520g1(iM3165g);
                        this.f2664g = C0406q1.m3164f(str, this.f2662e, this.f2664g, iM3165g);
                    }
                    this.f2665h += iM3165g;
                } catch (C0406q1.d e2) {
                    this.f2665h -= this.f2664g - i4;
                    this.f2664g = i4;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (C0406q1.d e4) {
                m2495d0(str, e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: W0 */
        public void mo2488W0(int i2, int i3) throws IOException {
            mo2490Y0(C0409r1.m3204c(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: X0 */
        public void mo2489X0(int i2, int i3) throws IOException {
            m2526j1(20);
            m2519f1(i2, 0);
            m2520g1(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: Y0 */
        public void mo2490Y0(int i2) throws IOException {
            m2526j1(5);
            m2520g1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: Z0 */
        public void mo2491Z0(int i2, long j2) throws IOException {
            m2526j1(20);
            m2519f1(i2, 0);
            m2521h1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0374g
        /* renamed from: a */
        public void mo2522a(byte[] bArr, int i2, int i3) throws IOException {
            m2527k1(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: a1 */
        public void mo2492a1(long j2) throws IOException {
            m2526j1(10);
            m2521h1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: c0 */
        public void mo2494c0() throws IOException {
            if (this.f2664g > 0) {
                m2525i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: j0 */
        public void mo2498j0(byte b2) throws IOException {
            if (this.f2664g == this.f2663f) {
                m2525i1();
            }
            m2515b1(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: k0 */
        public void mo2499k0(int i2, boolean z) throws IOException {
            m2526j1(11);
            m2519f1(i2, 0);
            m2515b1(z ? (byte) 1 : (byte) 0);
        }

        /* renamed from: k1 */
        public void m2527k1(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f2663f;
            int i5 = this.f2664g;
            if (i4 - i5 >= i3) {
                System.arraycopy(bArr, i2, this.f2662e, i5, i3);
                this.f2664g += i3;
                this.f2665h += i3;
                return;
            }
            int i6 = i4 - i5;
            System.arraycopy(bArr, i2, this.f2662e, i5, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f2664g = this.f2663f;
            this.f2665h += i6;
            m2525i1();
            if (i8 <= this.f2663f) {
                System.arraycopy(bArr, i7, this.f2662e, 0, i8);
                this.f2664g = i8;
            } else {
                this.f2670i.write(bArr, i7, i8);
            }
            this.f2665h += i8;
        }

        /* renamed from: l1 */
        public void m2528l1(int i2, InterfaceC0405q0 interfaceC0405q0) throws IOException {
            mo2488W0(i2, 2);
            mo2475J0(interfaceC0405q0);
        }

        /* renamed from: m1 */
        void m2529m1(InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) throws IOException {
            mo2490Y0(((AbstractC0356a) interfaceC0405q0).m2546k(interfaceC0373f1));
            interfaceC0373f1.mo2699h(interfaceC0405q0, this.f2660c);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: n0 */
        public void mo2502n0(byte[] bArr, int i2, int i3) throws IOException {
            mo2490Y0(i3);
            m2527k1(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: o0 */
        public void mo2503o0(int i2, AbstractC0377h abstractC0377h) throws IOException {
            mo2488W0(i2, 2);
            mo2504p0(abstractC0377h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: p0 */
        public void mo2504p0(AbstractC0377h abstractC0377h) throws IOException {
            mo2490Y0(abstractC0377h.size());
            abstractC0377h.mo2723L(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: u0 */
        public void mo2509u0(int i2, int i3) throws IOException {
            m2526j1(14);
            m2519f1(i2, 5);
            m2516c1(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: v0 */
        public void mo2510v0(int i2) throws IOException {
            m2526j1(4);
            m2516c1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: w0 */
        public void mo2511w0(int i2, long j2) throws IOException {
            m2526j1(18);
            m2519f1(i2, 1);
            m2517d1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: x0 */
        public void mo2512x0(long j2) throws IOException {
            m2526j1(8);
            m2517d1(j2);
        }
    }

    /* renamed from: A */
    public static int m2411A(int i2, C0366d0 c0366d0) {
        return m2432V(i2) + m2412B(c0366d0);
    }

    /* renamed from: B */
    public static int m2412B(C0366d0 c0366d0) {
        return m2413C(c0366d0.m2596b());
    }

    /* renamed from: C */
    static int m2413C(int i2) {
        return m2434X(i2) + i2;
    }

    /* renamed from: D */
    public static int m2414D(int i2, InterfaceC0405q0 interfaceC0405q0) {
        return (m2432V(1) * 2) + m2433W(2, i2) + m2415E(3, interfaceC0405q0);
    }

    /* renamed from: E */
    public static int m2415E(int i2, InterfaceC0405q0 interfaceC0405q0) {
        return m2432V(i2) + m2417G(interfaceC0405q0);
    }

    /* renamed from: F */
    static int m2416F(int i2, InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) {
        return m2432V(i2) + m2418H(interfaceC0405q0, interfaceC0373f1);
    }

    /* renamed from: G */
    public static int m2417G(InterfaceC0405q0 interfaceC0405q0) {
        return m2413C(interfaceC0405q0.mo3153e());
    }

    /* renamed from: H */
    static int m2418H(InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) {
        return m2413C(((AbstractC0356a) interfaceC0405q0).m2546k(interfaceC0373f1));
    }

    /* renamed from: I */
    static int m2419I(int i2) {
        return i2 > 4096 ? RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT : i2;
    }

    /* renamed from: J */
    public static int m2420J(int i2, AbstractC0377h abstractC0377h) {
        return (m2432V(1) * 2) + m2433W(2, i2) + m2444g(3, abstractC0377h);
    }

    @Deprecated
    /* renamed from: K */
    public static int m2421K(int i2) {
        return m2434X(i2);
    }

    /* renamed from: L */
    public static int m2422L(int i2, int i3) {
        return m2432V(i2) + m2423M(i3);
    }

    /* renamed from: M */
    public static int m2423M(int i2) {
        return 4;
    }

    /* renamed from: N */
    public static int m2424N(int i2, long j2) {
        return m2432V(i2) + m2425O(j2);
    }

    /* renamed from: O */
    public static int m2425O(long j2) {
        return 8;
    }

    /* renamed from: P */
    public static int m2426P(int i2, int i3) {
        return m2432V(i2) + m2427Q(i3);
    }

    /* renamed from: Q */
    public static int m2427Q(int i2) {
        return m2434X(m2437a0(i2));
    }

    /* renamed from: R */
    public static int m2428R(int i2, long j2) {
        return m2432V(i2) + m2429S(j2);
    }

    /* renamed from: S */
    public static int m2429S(long j2) {
        return m2436Z(m2439b0(j2));
    }

    /* renamed from: T */
    public static int m2430T(int i2, String str) {
        return m2432V(i2) + m2431U(str);
    }

    /* renamed from: U */
    public static int m2431U(String str) {
        int length;
        try {
            length = C0406q1.m3165g(str);
        } catch (C0406q1.d unused) {
            length = str.getBytes(C0357a0.f2673a).length;
        }
        return m2413C(length);
    }

    /* renamed from: V */
    public static int m2432V(int i2) {
        return m2434X(C0409r1.m3204c(i2, 0));
    }

    /* renamed from: W */
    public static int m2433W(int i2, int i3) {
        return m2432V(i2) + m2434X(i3);
    }

    /* renamed from: X */
    public static int m2434X(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: Y */
    public static int m2435Y(int i2, long j2) {
        return m2432V(i2) + m2436Z(j2);
    }

    /* renamed from: Z */
    public static int m2436Z(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    /* renamed from: a0 */
    public static int m2437a0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    /* renamed from: b0 */
    public static long m2439b0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* renamed from: d */
    public static int m2440d(int i2, boolean z) {
        return m2432V(i2) + m2441e(z);
    }

    /* renamed from: e */
    public static int m2441e(boolean z) {
        return 1;
    }

    /* renamed from: f */
    public static int m2442f(byte[] bArr) {
        return m2413C(bArr.length);
    }

    /* renamed from: f0 */
    public static CodedOutputStream m2443f0(OutputStream outputStream, int i2) {
        return new C0355d(outputStream, i2);
    }

    /* renamed from: g */
    public static int m2444g(int i2, AbstractC0377h abstractC0377h) {
        return m2432V(i2) + m2446h(abstractC0377h);
    }

    /* renamed from: g0 */
    public static CodedOutputStream m2445g0(byte[] bArr) {
        return m2447h0(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static int m2446h(AbstractC0377h abstractC0377h) {
        return m2413C(abstractC0377h.size());
    }

    /* renamed from: h0 */
    public static CodedOutputStream m2447h0(byte[] bArr, int i2, int i3) {
        return new C0354c(bArr, i2, i3);
    }

    /* renamed from: i */
    public static int m2448i(int i2, double d2) {
        return m2432V(i2) + m2449j(d2);
    }

    /* renamed from: j */
    public static int m2449j(double d2) {
        return 8;
    }

    /* renamed from: k */
    public static int m2450k(int i2, int i3) {
        return m2432V(i2) + m2451l(i3);
    }

    /* renamed from: l */
    public static int m2451l(int i2) {
        return m2462w(i2);
    }

    /* renamed from: m */
    public static int m2452m(int i2, int i3) {
        return m2432V(i2) + m2453n(i3);
    }

    /* renamed from: n */
    public static int m2453n(int i2) {
        return 4;
    }

    /* renamed from: o */
    public static int m2454o(int i2, long j2) {
        return m2432V(i2) + m2455p(j2);
    }

    /* renamed from: p */
    public static int m2455p(long j2) {
        return 8;
    }

    /* renamed from: q */
    public static int m2456q(int i2, float f2) {
        return m2432V(i2) + m2457r(f2);
    }

    /* renamed from: r */
    public static int m2457r(float f2) {
        return 4;
    }

    @Deprecated
    /* renamed from: s */
    static int m2458s(int i2, InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) {
        return (m2432V(i2) * 2) + m2460u(interfaceC0405q0, interfaceC0373f1);
    }

    @Deprecated
    /* renamed from: t */
    public static int m2459t(InterfaceC0405q0 interfaceC0405q0) {
        return interfaceC0405q0.mo3153e();
    }

    @Deprecated
    /* renamed from: u */
    static int m2460u(InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) {
        return ((AbstractC0356a) interfaceC0405q0).m2546k(interfaceC0373f1);
    }

    /* renamed from: v */
    public static int m2461v(int i2, int i3) {
        return m2432V(i2) + m2462w(i3);
    }

    /* renamed from: w */
    public static int m2462w(int i2) {
        if (i2 >= 0) {
            return m2434X(i2);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m2463x(int i2, long j2) {
        return m2432V(i2) + m2464y(j2);
    }

    /* renamed from: y */
    public static int m2464y(long j2) {
        return m2436Z(j2);
    }

    /* renamed from: z */
    public static int m2465z(int i2, C0366d0 c0366d0) {
        return (m2432V(1) * 2) + m2433W(2, i2) + m2411A(3, c0366d0);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void m2466A0(int i2, InterfaceC0405q0 interfaceC0405q0) throws IOException {
        mo2488W0(i2, 3);
        m2468C0(interfaceC0405q0);
        mo2488W0(i2, 4);
    }

    @Deprecated
    /* renamed from: B0 */
    final void m2467B0(int i2, InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        mo2488W0(i2, 3);
        m2469D0(interfaceC0405q0, interfaceC0373f1);
        mo2488W0(i2, 4);
    }

    @Deprecated
    /* renamed from: C0 */
    public final void m2468C0(InterfaceC0405q0 interfaceC0405q0) throws IOException {
        interfaceC0405q0.mo3156i(this);
    }

    @Deprecated
    /* renamed from: D0 */
    final void m2469D0(InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        interfaceC0373f1.mo2699h(interfaceC0405q0, this.f2660c);
    }

    /* renamed from: E0 */
    public abstract void mo2470E0(int i2, int i3) throws IOException;

    /* renamed from: F0 */
    public abstract void mo2471F0(int i2) throws IOException;

    /* renamed from: G0 */
    public final void m2472G0(int i2, long j2) throws IOException {
        mo2491Z0(i2, j2);
    }

    /* renamed from: H0 */
    public final void m2473H0(long j2) throws IOException {
        mo2492a1(j2);
    }

    /* renamed from: I0 */
    abstract void mo2474I0(int i2, InterfaceC0405q0 interfaceC0405q0, InterfaceC0373f1 interfaceC0373f1) throws IOException;

    /* renamed from: J0 */
    public abstract void mo2475J0(InterfaceC0405q0 interfaceC0405q0) throws IOException;

    /* renamed from: K0 */
    public abstract void mo2476K0(int i2, InterfaceC0405q0 interfaceC0405q0) throws IOException;

    /* renamed from: L0 */
    public abstract void mo2477L0(int i2, AbstractC0377h abstractC0377h) throws IOException;

    /* renamed from: M0 */
    public final void m2478M0(int i2, int i3) throws IOException {
        mo2509u0(i2, i3);
    }

    /* renamed from: N0 */
    public final void m2479N0(int i2) throws IOException {
        mo2510v0(i2);
    }

    /* renamed from: O0 */
    public final void m2480O0(int i2, long j2) throws IOException {
        mo2511w0(i2, j2);
    }

    /* renamed from: P0 */
    public final void m2481P0(long j2) throws IOException {
        mo2512x0(j2);
    }

    /* renamed from: Q0 */
    public final void m2482Q0(int i2, int i3) throws IOException {
        mo2489X0(i2, m2437a0(i3));
    }

    /* renamed from: R0 */
    public final void m2483R0(int i2) throws IOException {
        mo2490Y0(m2437a0(i2));
    }

    /* renamed from: S0 */
    public final void m2484S0(int i2, long j2) throws IOException {
        mo2491Z0(i2, m2439b0(j2));
    }

    /* renamed from: T0 */
    public final void m2485T0(long j2) throws IOException {
        mo2492a1(m2439b0(j2));
    }

    /* renamed from: U0 */
    public abstract void mo2486U0(int i2, String str) throws IOException;

    /* renamed from: V0 */
    public abstract void mo2487V0(String str) throws IOException;

    /* renamed from: W0 */
    public abstract void mo2488W0(int i2, int i3) throws IOException;

    /* renamed from: X0 */
    public abstract void mo2489X0(int i2, int i3) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo2490Y0(int i2) throws IOException;

    /* renamed from: Z0 */
    public abstract void mo2491Z0(int i2, long j2) throws IOException;

    /* renamed from: a1 */
    public abstract void mo2492a1(long j2) throws IOException;

    /* renamed from: c */
    public final void m2493c() {
        if (mo2497i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    public abstract void mo2494c0() throws IOException;

    /* renamed from: d0 */
    final void m2495d0(String str, C0406q1.d dVar) throws IOException {
        f2658a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C0357a0.f2673a);
        try {
            mo2490Y0(bytes.length);
            mo2522a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new OutOfSpaceException(e3);
        }
    }

    /* renamed from: e0 */
    boolean m2496e0() {
        return this.f2661d;
    }

    /* renamed from: i0 */
    public abstract int mo2497i0();

    /* renamed from: j0 */
    public abstract void mo2498j0(byte b2) throws IOException;

    /* renamed from: k0 */
    public abstract void mo2499k0(int i2, boolean z) throws IOException;

    /* renamed from: l0 */
    public final void m2500l0(boolean z) throws IOException {
        mo2498j0(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: m0 */
    public final void m2501m0(byte[] bArr) throws IOException {
        mo2502n0(bArr, 0, bArr.length);
    }

    /* renamed from: n0 */
    abstract void mo2502n0(byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: o0 */
    public abstract void mo2503o0(int i2, AbstractC0377h abstractC0377h) throws IOException;

    /* renamed from: p0 */
    public abstract void mo2504p0(AbstractC0377h abstractC0377h) throws IOException;

    /* renamed from: q0 */
    public final void m2505q0(int i2, double d2) throws IOException {
        mo2511w0(i2, Double.doubleToRawLongBits(d2));
    }

    /* renamed from: r0 */
    public final void m2506r0(double d2) throws IOException {
        mo2512x0(Double.doubleToRawLongBits(d2));
    }

    /* renamed from: s0 */
    public final void m2507s0(int i2, int i3) throws IOException {
        mo2470E0(i2, i3);
    }

    /* renamed from: t0 */
    public final void m2508t0(int i2) throws IOException {
        mo2471F0(i2);
    }

    /* renamed from: u0 */
    public abstract void mo2509u0(int i2, int i3) throws IOException;

    /* renamed from: v0 */
    public abstract void mo2510v0(int i2) throws IOException;

    /* renamed from: w0 */
    public abstract void mo2511w0(int i2, long j2) throws IOException;

    /* renamed from: x0 */
    public abstract void mo2512x0(long j2) throws IOException;

    /* renamed from: y0 */
    public final void m2513y0(int i2, float f2) throws IOException {
        mo2509u0(i2, Float.floatToRawIntBits(f2));
    }

    /* renamed from: z0 */
    public final void m2514z0(float f2) throws IOException {
        mo2510v0(Float.floatToRawIntBits(f2));
    }

    private CodedOutputStream() {
    }
}
