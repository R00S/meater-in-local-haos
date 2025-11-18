package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzdni extends zzdmq {

    /* renamed from: a */
    private static final Logger f25670a = Logger.getLogger(zzdni.class.getName());

    /* renamed from: b */
    private static final boolean f25671b = C6726gx.m15214p();

    /* renamed from: c */
    C7167su f25672c;

    /* renamed from: com.google.android.gms.internal.ads.zzdni$a */
    static class C7437a extends zzdni {

        /* renamed from: d */
        private final byte[] f25673d;

        /* renamed from: e */
        private final int f25674e;

        /* renamed from: f */
        private final int f25675f;

        /* renamed from: g */
        private int f25676g;

        C7437a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i4 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i4)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.f25673d = bArr;
            this.f25674e = i2;
            this.f25676g = i2;
            this.f25675f = i4;
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: D */
        public final void mo19662D(int i2, zzdmr zzdmrVar) throws IOException {
            mo19665H0(1, 3);
            mo19667J0(2, i2);
            mo19682g(3, zzdmrVar);
            mo19665H0(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: E */
        public final void mo19663E(int i2, zzdpk zzdpkVar) throws IOException {
            mo19665H0(1, 3);
            mo19667J0(2, i2);
            mo19684h(3, zzdpkVar);
            mo19665H0(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: H0 */
        public final void mo19665H0(int i2, int i3) throws IOException {
            mo19679e0((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: I0 */
        public final void mo19666I0(int i2, int i3) throws IOException {
            mo19665H0(i2, 0);
            mo19676b0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: J0 */
        public final void mo19667J0(int i2, int i3) throws IOException {
            mo19665H0(i2, 0);
            mo19679e0(i3);
        }

        /* renamed from: L0 */
        public final int m19697L0() {
            return this.f25676g - this.f25674e;
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: M */
        public final void mo19669M(zzdmr zzdmrVar) throws IOException {
            mo19679e0(zzdmrVar.size());
            zzdmrVar.mo15568g(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: P */
        public final void mo19670P(byte b2) throws IOException {
            try {
                byte[] bArr = this.f25673d;
                int i2 = this.f25676g;
                this.f25676g = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25676g), Integer.valueOf(this.f25675f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: R */
        public final void mo19671R(int i2, String str) throws IOException {
            mo19665H0(i2, 2);
            mo19689q0(str);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: S */
        public final void mo19672S(long j2) throws IOException {
            if (zzdni.f25671b && mo19691u() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f25673d;
                    int i2 = this.f25676g;
                    this.f25676g = i2 + 1;
                    C6726gx.m15207i(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f25673d;
                int i3 = this.f25676g;
                this.f25676g = i3 + 1;
                C6726gx.m15207i(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f25673d;
                    int i4 = this.f25676g;
                    this.f25676g = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25676g), Integer.valueOf(this.f25675f), 1), e2);
                }
            }
            byte[] bArr4 = this.f25673d;
            int i5 = this.f25676g;
            this.f25676g = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: U */
        public final void mo19674U(long j2) throws IOException {
            try {
                byte[] bArr = this.f25673d;
                int i2 = this.f25676g;
                int i3 = i2 + 1;
                this.f25676g = i3;
                bArr[i2] = (byte) j2;
                int i4 = i3 + 1;
                this.f25676g = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i4 + 1;
                this.f25676g = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i5 + 1;
                this.f25676g = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i6 + 1;
                this.f25676g = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i7 + 1;
                this.f25676g = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i8 + 1;
                this.f25676g = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.f25676g = i9 + 1;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25676g), Integer.valueOf(this.f25675f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdmq
        /* renamed from: a */
        public final void mo19594a(byte[] bArr, int i2, int i3) throws IOException {
            mo19677c(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: b */
        public void mo19675b() {
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: b0 */
        public final void mo19676b0(int i2) throws IOException {
            if (i2 >= 0) {
                mo19679e0(i2);
            } else {
                mo19672S(i2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: c */
        public final void mo19677c(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.f25673d, this.f25676g, i3);
                this.f25676g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25676g), Integer.valueOf(this.f25675f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: e0 */
        public final void mo19679e0(int i2) throws IOException {
            if (zzdni.f25671b && mo19691u() >= 10) {
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.f25673d;
                    int i3 = this.f25676g;
                    this.f25676g = i3 + 1;
                    C6726gx.m15207i(bArr, i3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f25673d;
                int i4 = this.f25676g;
                this.f25676g = i4 + 1;
                C6726gx.m15207i(bArr2, i4, (byte) i2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f25673d;
                    int i5 = this.f25676g;
                    this.f25676g = i5 + 1;
                    bArr3[i5] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25676g), Integer.valueOf(this.f25675f), 1), e2);
                }
            }
            byte[] bArr4 = this.f25673d;
            int i6 = this.f25676g;
            this.f25676g = i6 + 1;
            bArr4[i6] = (byte) i2;
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: g */
        public final void mo19682g(int i2, zzdmr zzdmrVar) throws IOException {
            mo19665H0(i2, 2);
            mo19669M(zzdmrVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: g0 */
        public final void mo19683g0(int i2) throws IOException {
            try {
                byte[] bArr = this.f25673d;
                int i3 = this.f25676g;
                int i4 = i3 + 1;
                this.f25676g = i4;
                bArr[i3] = (byte) i2;
                int i5 = i4 + 1;
                this.f25676g = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i5 + 1;
                this.f25676g = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f25676g = i6 + 1;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25676g), Integer.valueOf(this.f25675f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: h */
        public final void mo19684h(int i2, zzdpk zzdpkVar) throws IOException {
            mo19665H0(i2, 2);
            mo19696y0(zzdpkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: i */
        final void mo19685i(int i2, zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException {
            mo19665H0(i2, 2);
            zzdmi zzdmiVar = (zzdmi) zzdpkVar;
            int iMo19585c = zzdmiVar.mo19585c();
            if (iMo19585c == -1) {
                iMo19585c = interfaceC6910lw.mo14829i(zzdmiVar);
                zzdmiVar.mo19588j(iMo19585c);
            }
            mo19679e0(iMo19585c);
            interfaceC6910lw.mo14825e(zzdpkVar, this.f25672c);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: j */
        final void mo19686j(zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException {
            zzdmi zzdmiVar = (zzdmi) zzdpkVar;
            int iMo19585c = zzdmiVar.mo19585c();
            if (iMo19585c == -1) {
                iMo19585c = interfaceC6910lw.mo14829i(zzdmiVar);
                zzdmiVar.mo19588j(iMo19585c);
            }
            mo19679e0(iMo19585c);
            interfaceC6910lw.mo14825e(zzdpkVar, this.f25672c);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: l */
        public final void mo19688l(int i2, int i3) throws IOException {
            mo19665H0(i2, 5);
            mo19683g0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: q0 */
        public final void mo19689q0(String str) throws IOException {
            int i2 = this.f25676g;
            try {
                int iM19637j0 = zzdni.m19637j0(str.length() * 3);
                int iM19637j02 = zzdni.m19637j0(str.length());
                if (iM19637j02 != iM19637j0) {
                    mo19679e0(C6837jx.m15374a(str));
                    this.f25676g = C6837jx.m15375b(str, this.f25673d, this.f25676g, mo19691u());
                    return;
                }
                int i3 = i2 + iM19637j02;
                this.f25676g = i3;
                int iM15375b = C6837jx.m15375b(str, this.f25673d, i3, mo19691u());
                this.f25676g = i2;
                mo19679e0((iM15375b - i2) - iM19637j02);
                this.f25676g = iM15375b;
            } catch (C6985nx e2) {
                this.f25676g = i2;
                m19687k(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: t0 */
        public final void mo19690t0(int i2, long j2) throws IOException {
            mo19665H0(i2, 0);
            mo19672S(j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: u */
        public final int mo19691u() {
            return this.f25675f - this.f25676g;
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: v0 */
        public final void mo19694v0(int i2, boolean z) throws IOException {
            mo19665H0(i2, 0);
            mo19670P(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: x0 */
        public final void mo19695x0(int i2, long j2) throws IOException {
            mo19665H0(i2, 1);
            mo19674U(j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: y0 */
        public final void mo19696y0(zzdpk zzdpkVar) throws IOException {
            mo19679e0(zzdpkVar.mo19729i());
            zzdpkVar.mo19728h(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzdni$b */
    static final class C7438b extends C7437a {

        /* renamed from: h */
        private final ByteBuffer f25677h;

        /* renamed from: i */
        private int f25678i;

        C7438b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f25677h = byteBuffer;
            this.f25678i = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.ads.zzdni.C7437a, com.google.android.gms.internal.ads.zzdni
        /* renamed from: b */
        public final void mo19675b() {
            this.f25677h.position(this.f25678i + m19697L0());
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzdni$c */
    static final class C7439c extends zzdni {

        /* renamed from: d */
        private final ByteBuffer f25679d;

        /* renamed from: e */
        private final ByteBuffer f25680e;

        /* renamed from: f */
        private final int f25681f;

        C7439c(ByteBuffer byteBuffer) {
            super();
            this.f25679d = byteBuffer;
            this.f25680e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f25681f = byteBuffer.position();
        }

        /* renamed from: L0 */
        private final void m19698L0(String str) throws IOException {
            try {
                C6837jx.m15376c(str, this.f25680e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: D */
        public final void mo19662D(int i2, zzdmr zzdmrVar) throws IOException {
            mo19665H0(1, 3);
            mo19667J0(2, i2);
            mo19682g(3, zzdmrVar);
            mo19665H0(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: E */
        public final void mo19663E(int i2, zzdpk zzdpkVar) throws IOException {
            mo19665H0(1, 3);
            mo19667J0(2, i2);
            mo19684h(3, zzdpkVar);
            mo19665H0(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: H0 */
        public final void mo19665H0(int i2, int i3) throws IOException {
            mo19679e0((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: I0 */
        public final void mo19666I0(int i2, int i3) throws IOException {
            mo19665H0(i2, 0);
            mo19676b0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: J0 */
        public final void mo19667J0(int i2, int i3) throws IOException {
            mo19665H0(i2, 0);
            mo19679e0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: M */
        public final void mo19669M(zzdmr zzdmrVar) throws IOException {
            mo19679e0(zzdmrVar.size());
            zzdmrVar.mo15568g(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: P */
        public final void mo19670P(byte b2) throws IOException {
            try {
                this.f25680e.put(b2);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: R */
        public final void mo19671R(int i2, String str) throws IOException {
            mo19665H0(i2, 2);
            mo19689q0(str);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: S */
        public final void mo19672S(long j2) throws IOException {
            while (((-128) & j2) != 0) {
                try {
                    this.f25680e.put((byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new zzc(e2);
                }
            }
            this.f25680e.put((byte) j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: U */
        public final void mo19674U(long j2) throws IOException {
            try {
                this.f25680e.putLong(j2);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdmq
        /* renamed from: a */
        public final void mo19594a(byte[] bArr, int i2, int i3) throws IOException {
            mo19677c(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: b */
        public final void mo19675b() {
            this.f25679d.position(this.f25680e.position());
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: b0 */
        public final void mo19676b0(int i2) throws IOException {
            if (i2 >= 0) {
                mo19679e0(i2);
            } else {
                mo19672S(i2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: c */
        public final void mo19677c(byte[] bArr, int i2, int i3) throws IOException {
            try {
                this.f25680e.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            } catch (BufferOverflowException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: e0 */
        public final void mo19679e0(int i2) throws IOException {
            while ((i2 & (-128)) != 0) {
                try {
                    this.f25680e.put((byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new zzc(e2);
                }
            }
            this.f25680e.put((byte) i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: g */
        public final void mo19682g(int i2, zzdmr zzdmrVar) throws IOException {
            mo19665H0(i2, 2);
            mo19669M(zzdmrVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: g0 */
        public final void mo19683g0(int i2) throws IOException {
            try {
                this.f25680e.putInt(i2);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: h */
        public final void mo19684h(int i2, zzdpk zzdpkVar) throws IOException {
            mo19665H0(i2, 2);
            mo19696y0(zzdpkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: i */
        final void mo19685i(int i2, zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException {
            mo19665H0(i2, 2);
            mo19686j(zzdpkVar, interfaceC6910lw);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: j */
        final void mo19686j(zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException {
            zzdmi zzdmiVar = (zzdmi) zzdpkVar;
            int iMo19585c = zzdmiVar.mo19585c();
            if (iMo19585c == -1) {
                iMo19585c = interfaceC6910lw.mo14829i(zzdmiVar);
                zzdmiVar.mo19588j(iMo19585c);
            }
            mo19679e0(iMo19585c);
            interfaceC6910lw.mo14825e(zzdpkVar, this.f25672c);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: l */
        public final void mo19688l(int i2, int i3) throws IOException {
            mo19665H0(i2, 5);
            mo19683g0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: q0 */
        public final void mo19689q0(String str) throws IOException {
            int iPosition = this.f25680e.position();
            try {
                int iM19637j0 = zzdni.m19637j0(str.length() * 3);
                int iM19637j02 = zzdni.m19637j0(str.length());
                if (iM19637j02 != iM19637j0) {
                    mo19679e0(C6837jx.m15374a(str));
                    m19698L0(str);
                    return;
                }
                int iPosition2 = this.f25680e.position() + iM19637j02;
                this.f25680e.position(iPosition2);
                m19698L0(str);
                int iPosition3 = this.f25680e.position();
                this.f25680e.position(iPosition);
                mo19679e0(iPosition3 - iPosition2);
                this.f25680e.position(iPosition3);
            } catch (C6985nx e2) {
                this.f25680e.position(iPosition);
                m19687k(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: t0 */
        public final void mo19690t0(int i2, long j2) throws IOException {
            mo19665H0(i2, 0);
            mo19672S(j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: u */
        public final int mo19691u() {
            return this.f25680e.remaining();
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: v0 */
        public final void mo19694v0(int i2, boolean z) throws IOException {
            mo19665H0(i2, 0);
            mo19670P(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: x0 */
        public final void mo19695x0(int i2, long j2) throws IOException {
            mo19665H0(i2, 1);
            mo19674U(j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: y0 */
        public final void mo19696y0(zzdpk zzdpkVar) throws IOException {
            mo19679e0(zzdpkVar.mo19729i());
            zzdpkVar.mo19728h(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzdni$d */
    static final class C7440d extends zzdni {

        /* renamed from: d */
        private final ByteBuffer f25682d;

        /* renamed from: e */
        private final ByteBuffer f25683e;

        /* renamed from: f */
        private final long f25684f;

        /* renamed from: g */
        private final long f25685g;

        /* renamed from: h */
        private final long f25686h;

        /* renamed from: i */
        private final long f25687i;

        /* renamed from: j */
        private long f25688j;

        C7440d(ByteBuffer byteBuffer) {
            super();
            this.f25682d = byteBuffer;
            this.f25683e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jM15188J = C6726gx.m15188J(byteBuffer);
            this.f25684f = jM15188J;
            long jPosition = byteBuffer.position() + jM15188J;
            this.f25685g = jPosition;
            long jLimit = jM15188J + byteBuffer.limit();
            this.f25686h = jLimit;
            this.f25687i = jLimit - 10;
            this.f25688j = jPosition;
        }

        /* renamed from: L0 */
        private final void m19699L0(long j2) {
            this.f25683e.position((int) (j2 - this.f25684f));
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: D */
        public final void mo19662D(int i2, zzdmr zzdmrVar) throws IOException {
            mo19665H0(1, 3);
            mo19667J0(2, i2);
            mo19682g(3, zzdmrVar);
            mo19665H0(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: E */
        public final void mo19663E(int i2, zzdpk zzdpkVar) throws IOException {
            mo19665H0(1, 3);
            mo19667J0(2, i2);
            mo19684h(3, zzdpkVar);
            mo19665H0(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: H0 */
        public final void mo19665H0(int i2, int i3) throws IOException {
            mo19679e0((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: I0 */
        public final void mo19666I0(int i2, int i3) throws IOException {
            mo19665H0(i2, 0);
            mo19676b0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: J0 */
        public final void mo19667J0(int i2, int i3) throws IOException {
            mo19665H0(i2, 0);
            mo19679e0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: M */
        public final void mo19669M(zzdmr zzdmrVar) throws IOException {
            mo19679e0(zzdmrVar.size());
            zzdmrVar.mo15568g(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: P */
        public final void mo19670P(byte b2) throws IOException {
            long j2 = this.f25688j;
            if (j2 >= this.f25686h) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f25688j), Long.valueOf(this.f25686h), 1));
            }
            this.f25688j = 1 + j2;
            C6726gx.m15200b(j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: R */
        public final void mo19671R(int i2, String str) throws IOException {
            mo19665H0(i2, 2);
            mo19689q0(str);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: S */
        public final void mo19672S(long j2) throws IOException {
            if (this.f25688j <= this.f25687i) {
                while ((j2 & (-128)) != 0) {
                    long j3 = this.f25688j;
                    this.f25688j = j3 + 1;
                    C6726gx.m15200b(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.f25688j;
                this.f25688j = 1 + j4;
                C6726gx.m15200b(j4, (byte) j2);
                return;
            }
            while (true) {
                long j5 = this.f25688j;
                if (j5 >= this.f25686h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f25688j), Long.valueOf(this.f25686h), 1));
                }
                if ((j2 & (-128)) == 0) {
                    this.f25688j = 1 + j5;
                    C6726gx.m15200b(j5, (byte) j2);
                    return;
                } else {
                    this.f25688j = j5 + 1;
                    C6726gx.m15200b(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: U */
        public final void mo19674U(long j2) throws IOException {
            this.f25683e.putLong((int) (this.f25688j - this.f25684f), j2);
            this.f25688j += 8;
        }

        @Override // com.google.android.gms.internal.ads.zzdmq
        /* renamed from: a */
        public final void mo19594a(byte[] bArr, int i2, int i3) throws IOException {
            mo19677c(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: b */
        public final void mo19675b() {
            this.f25682d.position((int) (this.f25688j - this.f25684f));
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: b0 */
        public final void mo19676b0(int i2) throws IOException {
            if (i2 >= 0) {
                mo19679e0(i2);
            } else {
                mo19672S(i2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: c */
        public final void mo19677c(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = i3;
                long j3 = this.f25686h - j2;
                long j4 = this.f25688j;
                if (j3 >= j4) {
                    C6726gx.m15208j(bArr, i2, j4, j2);
                    this.f25688j += j2;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f25688j), Long.valueOf(this.f25686h), Integer.valueOf(i3)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: e0 */
        public final void mo19679e0(int i2) throws IOException {
            if (this.f25688j <= this.f25687i) {
                while ((i2 & (-128)) != 0) {
                    long j2 = this.f25688j;
                    this.f25688j = j2 + 1;
                    C6726gx.m15200b(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.f25688j;
                this.f25688j = 1 + j3;
                C6726gx.m15200b(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.f25688j;
                if (j4 >= this.f25686h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f25688j), Long.valueOf(this.f25686h), 1));
                }
                if ((i2 & (-128)) == 0) {
                    this.f25688j = 1 + j4;
                    C6726gx.m15200b(j4, (byte) i2);
                    return;
                } else {
                    this.f25688j = j4 + 1;
                    C6726gx.m15200b(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: g */
        public final void mo19682g(int i2, zzdmr zzdmrVar) throws IOException {
            mo19665H0(i2, 2);
            mo19669M(zzdmrVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: g0 */
        public final void mo19683g0(int i2) throws IOException {
            this.f25683e.putInt((int) (this.f25688j - this.f25684f), i2);
            this.f25688j += 4;
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: h */
        public final void mo19684h(int i2, zzdpk zzdpkVar) throws IOException {
            mo19665H0(i2, 2);
            mo19696y0(zzdpkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: i */
        final void mo19685i(int i2, zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException {
            mo19665H0(i2, 2);
            mo19686j(zzdpkVar, interfaceC6910lw);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: j */
        final void mo19686j(zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException {
            zzdmi zzdmiVar = (zzdmi) zzdpkVar;
            int iMo19585c = zzdmiVar.mo19585c();
            if (iMo19585c == -1) {
                iMo19585c = interfaceC6910lw.mo14829i(zzdmiVar);
                zzdmiVar.mo19588j(iMo19585c);
            }
            mo19679e0(iMo19585c);
            interfaceC6910lw.mo14825e(zzdpkVar, this.f25672c);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: l */
        public final void mo19688l(int i2, int i3) throws IOException {
            mo19665H0(i2, 5);
            mo19683g0(i3);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: q0 */
        public final void mo19689q0(String str) throws IOException {
            long j2 = this.f25688j;
            try {
                int iM19637j0 = zzdni.m19637j0(str.length() * 3);
                int iM19637j02 = zzdni.m19637j0(str.length());
                if (iM19637j02 != iM19637j0) {
                    int iM15374a = C6837jx.m15374a(str);
                    mo19679e0(iM15374a);
                    m19699L0(this.f25688j);
                    C6837jx.m15376c(str, this.f25683e);
                    this.f25688j += iM15374a;
                    return;
                }
                int i2 = ((int) (this.f25688j - this.f25684f)) + iM19637j02;
                this.f25683e.position(i2);
                C6837jx.m15376c(str, this.f25683e);
                int iPosition = this.f25683e.position() - i2;
                mo19679e0(iPosition);
                this.f25688j += iPosition;
            } catch (C6985nx e2) {
                this.f25688j = j2;
                m19699L0(j2);
                m19687k(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new zzc(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzc(e4);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: t0 */
        public final void mo19690t0(int i2, long j2) throws IOException {
            mo19665H0(i2, 0);
            mo19672S(j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: u */
        public final int mo19691u() {
            return (int) (this.f25686h - this.f25688j);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: v0 */
        public final void mo19694v0(int i2, boolean z) throws IOException {
            mo19665H0(i2, 0);
            mo19670P(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: x0 */
        public final void mo19695x0(int i2, long j2) throws IOException {
            mo19665H0(i2, 1);
            mo19674U(j2);
        }

        @Override // com.google.android.gms.internal.ads.zzdni
        /* renamed from: y0 */
        public final void mo19696y0(zzdpk zzdpkVar) throws IOException {
            mo19679e0(zzdpkVar.mo19729i());
            zzdpkVar.mo19728h(this);
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    private zzdni() {
    }

    /* renamed from: A */
    static int m19609A(zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) {
        zzdmi zzdmiVar = (zzdmi) zzdpkVar;
        int iMo19585c = zzdmiVar.mo19585c();
        if (iMo19585c == -1) {
            iMo19585c = interfaceC6910lw.mo14829i(zzdmiVar);
            zzdmiVar.mo19588j(iMo19585c);
        }
        return m19637j0(iMo19585c) + iMo19585c;
    }

    /* renamed from: A0 */
    public static int m19610A0(zzdpk zzdpkVar) {
        int iMo19729i = zzdpkVar.mo19729i();
        return m19637j0(iMo19729i) + iMo19729i;
    }

    /* renamed from: B0 */
    public static int m19611B0(int i2, long j2) {
        return m19635h0(i2) + m19627W(j2);
    }

    @Deprecated
    /* renamed from: C0 */
    public static int m19612C0(zzdpk zzdpkVar) {
        return zzdpkVar.mo19729i();
    }

    /* renamed from: D0 */
    public static int m19613D0(int i2, long j2) {
        return m19635h0(i2) + m19627W(m19631a0(j2));
    }

    /* renamed from: E0 */
    public static zzdni m19614E0(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C7438b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return C6726gx.m15215q() ? new C7440d(byteBuffer) : new C7439c(byteBuffer);
    }

    /* renamed from: F0 */
    public static int m19615F0(int i2, long j2) {
        return m19635h0(i2) + 8;
    }

    /* renamed from: G */
    public static int m19616G(boolean z) {
        return 1;
    }

    /* renamed from: G0 */
    public static int m19617G0(int i2, long j2) {
        return m19635h0(i2) + 8;
    }

    /* renamed from: H */
    public static int m19618H(double d2) {
        return 8;
    }

    /* renamed from: I */
    public static int m19619I(int i2, double d2) {
        return m19635h0(i2) + 8;
    }

    /* renamed from: J */
    public static int m19620J(int i2, zzdmr zzdmrVar) {
        int iM19635h0 = m19635h0(i2);
        int size = zzdmrVar.size();
        return iM19635h0 + m19637j0(size) + size;
    }

    /* renamed from: K */
    public static int m19621K(int i2, zzdpk zzdpkVar) {
        return m19635h0(i2) + m19610A0(zzdpkVar);
    }

    @Deprecated
    /* renamed from: L */
    static int m19622L(int i2, zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) {
        int iM19635h0 = m19635h0(i2) << 1;
        zzdmi zzdmiVar = (zzdmi) zzdpkVar;
        int iMo19585c = zzdmiVar.mo19585c();
        if (iMo19585c == -1) {
            iMo19585c = interfaceC6910lw.mo14829i(zzdmiVar);
            zzdmiVar.mo19588j(iMo19585c);
        }
        return iM19635h0 + iMo19585c;
    }

    /* renamed from: N */
    public static int m19623N(int i2, zzdmr zzdmrVar) {
        return (m19635h0(1) << 1) + m19644o(2, i2) + m19620J(3, zzdmrVar);
    }

    /* renamed from: O */
    public static int m19624O(int i2, zzdpk zzdpkVar) {
        return (m19635h0(1) << 1) + m19644o(2, i2) + m19621K(3, zzdpkVar);
    }

    /* renamed from: Q */
    public static int m19625Q(zzdmr zzdmrVar) {
        int size = zzdmrVar.size();
        return m19637j0(size) + size;
    }

    /* renamed from: V */
    public static int m19626V(long j2) {
        return m19627W(j2);
    }

    /* renamed from: W */
    public static int m19627W(long j2) {
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

    /* renamed from: X */
    public static int m19628X(long j2) {
        return m19627W(m19631a0(j2));
    }

    /* renamed from: Y */
    public static int m19629Y(long j2) {
        return 8;
    }

    /* renamed from: Z */
    public static int m19630Z(long j2) {
        return 8;
    }

    /* renamed from: a0 */
    private static long m19631a0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* renamed from: c0 */
    public static int m19632c0(int i2, String str) {
        return m19635h0(i2) + m19650r0(str);
    }

    /* renamed from: d */
    public static int m19633d(int i2, zzdor zzdorVar) {
        int iM19635h0 = m19635h0(i2);
        int iM19763b = zzdorVar.m19763b();
        return iM19635h0 + m19637j0(iM19763b) + iM19763b;
    }

    /* renamed from: e */
    public static int m19634e(zzdor zzdorVar) {
        int iM19763b = zzdorVar.m19763b();
        return m19637j0(iM19763b) + iM19763b;
    }

    /* renamed from: h0 */
    public static int m19635h0(int i2) {
        return m19637j0(i2 << 3);
    }

    /* renamed from: i0 */
    public static int m19636i0(int i2) {
        if (i2 >= 0) {
            return m19637j0(i2);
        }
        return 10;
    }

    /* renamed from: j0 */
    public static int m19637j0(int i2) {
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

    /* renamed from: k0 */
    public static int m19638k0(int i2) {
        return m19637j0(m19645o0(i2));
    }

    /* renamed from: l0 */
    public static int m19639l0(int i2) {
        return 4;
    }

    /* renamed from: m */
    public static int m19640m(int i2, int i3) {
        return m19635h0(i2) + m19636i0(i3);
    }

    /* renamed from: m0 */
    public static int m19641m0(int i2) {
        return 4;
    }

    /* renamed from: n */
    public static zzdni m19642n(byte[] bArr) {
        return new C7437a(bArr, 0, bArr.length);
    }

    /* renamed from: n0 */
    public static int m19643n0(int i2) {
        return m19636i0(i2);
    }

    /* renamed from: o */
    public static int m19644o(int i2, int i3) {
        return m19635h0(i2) + m19637j0(i3);
    }

    /* renamed from: o0 */
    private static int m19645o0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    /* renamed from: p */
    public static int m19646p(byte[] bArr) {
        int length = bArr.length;
        return m19637j0(length) + length;
    }

    @Deprecated
    /* renamed from: p0 */
    public static int m19647p0(int i2) {
        return m19637j0(i2);
    }

    /* renamed from: q */
    public static int m19648q(int i2, int i3) {
        return m19635h0(i2) + m19637j0(m19645o0(i3));
    }

    /* renamed from: r */
    public static int m19649r(int i2, int i3) {
        return m19635h0(i2) + 4;
    }

    /* renamed from: r0 */
    public static int m19650r0(String str) {
        int length;
        try {
            length = C6837jx.m15374a(str);
        } catch (C6985nx unused) {
            length = str.getBytes(zzdod.f25772a).length;
        }
        return m19637j0(length) + length;
    }

    /* renamed from: s */
    public static int m19651s(int i2, int i3) {
        return m19635h0(i2) + 4;
    }

    /* renamed from: s0 */
    public static int m19652s0(float f2) {
        return 4;
    }

    /* renamed from: t */
    public static int m19653t(int i2, int i3) {
        return m19635h0(i2) + m19636i0(i3);
    }

    /* renamed from: w0 */
    public static int m19655w0(int i2, boolean z) {
        return m19635h0(i2) + 1;
    }

    /* renamed from: x */
    public static int m19656x(int i2, float f2) {
        return m19635h0(i2) + 4;
    }

    /* renamed from: y */
    public static int m19657y(int i2, zzdor zzdorVar) {
        return (m19635h0(1) << 1) + m19644o(2, i2) + m19633d(3, zzdorVar);
    }

    /* renamed from: z */
    static int m19658z(int i2, zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) {
        return m19635h0(i2) + m19609A(zzdpkVar, interfaceC6910lw);
    }

    /* renamed from: z0 */
    public static int m19659z0(int i2, long j2) {
        return m19635h0(i2) + m19627W(j2);
    }

    /* renamed from: B */
    public final void m19660B(double d2) throws IOException {
        mo19674U(Double.doubleToRawLongBits(d2));
    }

    /* renamed from: C */
    public final void m19661C(int i2, double d2) throws IOException {
        mo19695x0(i2, Double.doubleToRawLongBits(d2));
    }

    /* renamed from: D */
    public abstract void mo19662D(int i2, zzdmr zzdmrVar) throws IOException;

    /* renamed from: E */
    public abstract void mo19663E(int i2, zzdpk zzdpkVar) throws IOException;

    /* renamed from: F */
    public final void m19664F(boolean z) throws IOException {
        mo19670P(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: H0 */
    public abstract void mo19665H0(int i2, int i3) throws IOException;

    /* renamed from: I0 */
    public abstract void mo19666I0(int i2, int i3) throws IOException;

    /* renamed from: J0 */
    public abstract void mo19667J0(int i2, int i3) throws IOException;

    /* renamed from: K0 */
    public final void m19668K0(int i2, int i3) throws IOException {
        mo19667J0(i2, m19645o0(i3));
    }

    /* renamed from: M */
    public abstract void mo19669M(zzdmr zzdmrVar) throws IOException;

    /* renamed from: P */
    public abstract void mo19670P(byte b2) throws IOException;

    /* renamed from: R */
    public abstract void mo19671R(int i2, String str) throws IOException;

    /* renamed from: S */
    public abstract void mo19672S(long j2) throws IOException;

    /* renamed from: T */
    public final void m19673T(long j2) throws IOException {
        mo19672S(m19631a0(j2));
    }

    /* renamed from: U */
    public abstract void mo19674U(long j2) throws IOException;

    /* renamed from: b */
    public abstract void mo19675b() throws IOException;

    /* renamed from: b0 */
    public abstract void mo19676b0(int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo19677c(byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: d0 */
    public final void m19678d0(float f2) throws IOException {
        mo19683g0(Float.floatToRawIntBits(f2));
    }

    /* renamed from: e0 */
    public abstract void mo19679e0(int i2) throws IOException;

    /* renamed from: f */
    public final void m19680f(int i2, float f2) throws IOException {
        mo19688l(i2, Float.floatToRawIntBits(f2));
    }

    /* renamed from: f0 */
    public final void m19681f0(int i2) throws IOException {
        mo19679e0(m19645o0(i2));
    }

    /* renamed from: g */
    public abstract void mo19682g(int i2, zzdmr zzdmrVar) throws IOException;

    /* renamed from: g0 */
    public abstract void mo19683g0(int i2) throws IOException;

    /* renamed from: h */
    public abstract void mo19684h(int i2, zzdpk zzdpkVar) throws IOException;

    /* renamed from: i */
    abstract void mo19685i(int i2, zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException;

    /* renamed from: j */
    abstract void mo19686j(zzdpk zzdpkVar, InterfaceC6910lw interfaceC6910lw) throws IOException;

    /* renamed from: k */
    final void m19687k(String str, C6985nx c6985nx) throws IOException {
        f25670a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c6985nx);
        byte[] bytes = str.getBytes(zzdod.f25772a);
        try {
            mo19679e0(bytes.length);
            mo19594a(bytes, 0, bytes.length);
        } catch (zzc e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zzc(e3);
        }
    }

    /* renamed from: l */
    public abstract void mo19688l(int i2, int i3) throws IOException;

    /* renamed from: q0 */
    public abstract void mo19689q0(String str) throws IOException;

    /* renamed from: t0 */
    public abstract void mo19690t0(int i2, long j2) throws IOException;

    /* renamed from: u */
    public abstract int mo19691u();

    /* renamed from: u0 */
    public final void m19692u0(int i2, long j2) throws IOException {
        mo19690t0(i2, m19631a0(j2));
    }

    /* renamed from: v */
    public final void m19693v() {
        if (mo19691u() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: v0 */
    public abstract void mo19694v0(int i2, boolean z) throws IOException;

    /* renamed from: x0 */
    public abstract void mo19695x0(int i2, long j2) throws IOException;

    /* renamed from: y0 */
    public abstract void mo19696y0(zzdpk zzdpkVar) throws IOException;
}
