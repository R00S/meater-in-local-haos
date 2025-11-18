package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: CodedInputStream.java */
/* renamed from: androidx.datastore.preferences.protobuf.j */
/* loaded from: classes.dex */
public abstract class AbstractC0383j {

    /* renamed from: a */
    int f2777a;

    /* renamed from: b */
    int f2778b;

    /* renamed from: c */
    int f2779c;

    /* renamed from: d */
    C0386k f2780d;

    /* renamed from: e */
    private boolean f2781e;

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j$b */
    private static final class b extends AbstractC0383j {

        /* renamed from: f */
        private final byte[] f2782f;

        /* renamed from: g */
        private final boolean f2783g;

        /* renamed from: h */
        private int f2784h;

        /* renamed from: i */
        private int f2785i;

        /* renamed from: j */
        private int f2786j;

        /* renamed from: k */
        private int f2787k;

        /* renamed from: l */
        private int f2788l;

        /* renamed from: m */
        private boolean f2789m;

        /* renamed from: n */
        private int f2790n;

        /* renamed from: M */
        private void m2878M() {
            int i2 = this.f2784h + this.f2785i;
            this.f2784h = i2;
            int i3 = i2 - this.f2787k;
            int i4 = this.f2790n;
            if (i3 <= i4) {
                this.f2785i = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f2785i = i5;
            this.f2784h = i2 - i5;
        }

        /* renamed from: P */
        private void m2879P() throws IOException {
            if (this.f2784h - this.f2786j >= 10) {
                m2880Q();
            } else {
                m2881R();
            }
        }

        /* renamed from: Q */
        private void m2880Q() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.f2782f;
                int i3 = this.f2786j;
                this.f2786j = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: R */
        private void m2881R() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (m2882F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: A */
        public String mo2854A() throws IOException {
            int iM2886J = m2886J();
            if (iM2886J > 0) {
                int i2 = this.f2784h;
                int i3 = this.f2786j;
                if (iM2886J <= i2 - i3) {
                    String strM3163e = C0406q1.m3163e(this.f2782f, i3, iM2886J);
                    this.f2786j += iM2886J;
                    return strM3163e;
                }
            }
            if (iM2886J == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (iM2886J <= 0) {
                throw InvalidProtocolBufferException.m2535f();
            }
            throw InvalidProtocolBufferException.m2539k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: B */
        public int mo2855B() throws IOException {
            if (mo2861e()) {
                this.f2788l = 0;
                return 0;
            }
            int iM2886J = m2886J();
            this.f2788l = iM2886J;
            if (C0409r1.m3202a(iM2886J) != 0) {
                return this.f2788l;
            }
            throw InvalidProtocolBufferException.m2531b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: C */
        public int mo2856C() throws IOException {
            return m2886J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: D */
        public long mo2857D() throws IOException {
            return m2887K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: E */
        public boolean mo2858E(int i2) throws IOException {
            int iM3203b = C0409r1.m3203b(i2);
            if (iM3203b == 0) {
                m2879P();
                return true;
            }
            if (iM3203b == 1) {
                m2890O(8);
                return true;
            }
            if (iM3203b == 2) {
                m2890O(m2886J());
                return true;
            }
            if (iM3203b == 3) {
                m2889N();
                mo2859a(C0409r1.m3204c(C0409r1.m3202a(i2), 4));
                return true;
            }
            if (iM3203b == 4) {
                return false;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            m2890O(4);
            return true;
        }

        /* renamed from: F */
        public byte m2882F() throws IOException {
            int i2 = this.f2786j;
            if (i2 == this.f2784h) {
                throw InvalidProtocolBufferException.m2539k();
            }
            byte[] bArr = this.f2782f;
            this.f2786j = i2 + 1;
            return bArr[i2];
        }

        /* renamed from: G */
        public byte[] m2883G(int i2) throws IOException {
            if (i2 > 0) {
                int i3 = this.f2784h;
                int i4 = this.f2786j;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.f2786j = i5;
                    return Arrays.copyOfRange(this.f2782f, i4, i5);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.m2539k();
            }
            if (i2 == 0) {
                return C0357a0.f2675c;
            }
            throw InvalidProtocolBufferException.m2535f();
        }

        /* renamed from: H */
        public int m2884H() throws IOException {
            int i2 = this.f2786j;
            if (this.f2784h - i2 < 4) {
                throw InvalidProtocolBufferException.m2539k();
            }
            byte[] bArr = this.f2782f;
            this.f2786j = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        /* renamed from: I */
        public long m2885I() throws IOException {
            int i2 = this.f2786j;
            if (this.f2784h - i2 < 8) {
                throw InvalidProtocolBufferException.m2539k();
            }
            byte[] bArr = this.f2782f;
            this.f2786j = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m2886J() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f2786j
                int r1 = r5.f2784h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f2782f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f2786j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m2888L()
                int r1 = (int) r0
                return r1
            L70:
                r5.f2786j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0383j.b.m2886J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L41;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m2887K() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0383j.b.m2887K():long");
        }

        /* renamed from: L */
        long m2888L() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & 127) << i2;
                if ((m2882F() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: N */
        public void m2889N() throws IOException {
            int iMo2855B;
            do {
                iMo2855B = mo2855B();
                if (iMo2855B == 0) {
                    return;
                }
            } while (mo2858E(iMo2855B));
        }

        /* renamed from: O */
        public void m2890O(int i2) throws IOException {
            if (i2 >= 0) {
                int i3 = this.f2784h;
                int i4 = this.f2786j;
                if (i2 <= i3 - i4) {
                    this.f2786j = i4 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.m2539k();
            }
            throw InvalidProtocolBufferException.m2535f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: a */
        public void mo2859a(int i2) throws InvalidProtocolBufferException {
            if (this.f2788l != i2) {
                throw InvalidProtocolBufferException.m2530a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: d */
        public int mo2860d() {
            return this.f2786j - this.f2787k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: e */
        public boolean mo2861e() throws IOException {
            return this.f2786j == this.f2784h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: k */
        public void mo2862k(int i2) {
            this.f2790n = i2;
            m2878M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: l */
        public int mo2863l(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m2535f();
            }
            int iMo2860d = i2 + mo2860d();
            int i3 = this.f2790n;
            if (iMo2860d > i3) {
                throw InvalidProtocolBufferException.m2539k();
            }
            this.f2790n = iMo2860d;
            m2878M();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: m */
        public boolean mo2864m() throws IOException {
            return m2887K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: n */
        public AbstractC0377h mo2865n() throws IOException {
            int iM2886J = m2886J();
            if (iM2886J > 0) {
                int i2 = this.f2784h;
                int i3 = this.f2786j;
                if (iM2886J <= i2 - i3) {
                    AbstractC0377h abstractC0377hM2712G = (this.f2783g && this.f2789m) ? AbstractC0377h.m2712G(this.f2782f, i3, iM2886J) : AbstractC0377h.m2717n(this.f2782f, i3, iM2886J);
                    this.f2786j += iM2886J;
                    return abstractC0377hM2712G;
                }
            }
            return iM2886J == 0 ? AbstractC0377h.f2734f : AbstractC0377h.m2711F(m2883G(iM2886J));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: o */
        public double mo2866o() throws IOException {
            return Double.longBitsToDouble(m2885I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: p */
        public int mo2867p() throws IOException {
            return m2886J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: q */
        public int mo2868q() throws IOException {
            return m2884H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: r */
        public long mo2869r() throws IOException {
            return m2885I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: s */
        public float mo2870s() throws IOException {
            return Float.intBitsToFloat(m2884H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: t */
        public int mo2871t() throws IOException {
            return m2886J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: u */
        public long mo2872u() throws IOException {
            return m2887K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: v */
        public int mo2873v() throws IOException {
            return m2884H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: w */
        public long mo2874w() throws IOException {
            return m2885I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: x */
        public int mo2875x() throws IOException {
            return AbstractC0383j.m2847b(m2886J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: y */
        public long mo2876y() throws IOException {
            return AbstractC0383j.m2848c(m2887K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: z */
        public String mo2877z() throws IOException {
            int iM2886J = m2886J();
            if (iM2886J > 0 && iM2886J <= this.f2784h - this.f2786j) {
                String str = new String(this.f2782f, this.f2786j, iM2886J, C0357a0.f2673a);
                this.f2786j += iM2886J;
                return str;
            }
            if (iM2886J == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (iM2886J < 0) {
                throw InvalidProtocolBufferException.m2535f();
            }
            throw InvalidProtocolBufferException.m2539k();
        }

        private b(byte[] bArr, int i2, int i3, boolean z) {
            super();
            this.f2790n = Integer.MAX_VALUE;
            this.f2782f = bArr;
            this.f2784h = i3 + i2;
            this.f2786j = i2;
            this.f2787k = i2;
            this.f2783g = z;
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j$c */
    private static final class c extends AbstractC0383j {

        /* renamed from: f */
        private final InputStream f2791f;

        /* renamed from: g */
        private final byte[] f2792g;

        /* renamed from: h */
        private int f2793h;

        /* renamed from: i */
        private int f2794i;

        /* renamed from: j */
        private int f2795j;

        /* renamed from: k */
        private int f2796k;

        /* renamed from: l */
        private int f2797l;

        /* renamed from: m */
        private int f2798m;

        /* renamed from: n */
        private a f2799n;

        /* compiled from: CodedInputStream.java */
        /* renamed from: androidx.datastore.preferences.protobuf.j$c$a */
        private interface a {
            /* renamed from: a */
            void m2910a();
        }

        /* renamed from: F */
        private AbstractC0377h m2891F(int i2) throws IOException {
            byte[] bArrM2893I = m2893I(i2);
            if (bArrM2893I != null) {
                return AbstractC0377h.m2716i(bArrM2893I);
            }
            int i3 = this.f2795j;
            int i4 = this.f2793h;
            int length = i4 - i3;
            this.f2797l += i4;
            this.f2795j = 0;
            this.f2793h = 0;
            List<byte[]> listM2894J = m2894J(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f2792g, i3, bArr, 0, length);
            for (byte[] bArr2 : listM2894J) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC0377h.m2711F(bArr);
        }

        /* renamed from: H */
        private byte[] m2892H(int i2, boolean z) throws IOException {
            byte[] bArrM2893I = m2893I(i2);
            if (bArrM2893I != null) {
                return z ? (byte[]) bArrM2893I.clone() : bArrM2893I;
            }
            int i3 = this.f2795j;
            int i4 = this.f2793h;
            int length = i4 - i3;
            this.f2797l += i4;
            this.f2795j = 0;
            this.f2793h = 0;
            List<byte[]> listM2894J = m2894J(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f2792g, i3, bArr, 0, length);
            for (byte[] bArr2 : listM2894J) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: I */
        private byte[] m2893I(int i2) throws IOException {
            if (i2 == 0) {
                return C0357a0.f2675c;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m2535f();
            }
            int i3 = this.f2797l;
            int i4 = this.f2795j;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f2779c > 0) {
                throw InvalidProtocolBufferException.m2538j();
            }
            int i6 = this.f2798m;
            if (i5 > i6) {
                m2909S((i6 - i3) - i4);
                throw InvalidProtocolBufferException.m2539k();
            }
            int i7 = this.f2793h - i4;
            int i8 = i2 - i7;
            if (i8 >= 4096 && i8 > this.f2791f.available()) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f2792g, this.f2795j, bArr, 0, i7);
            this.f2797l += this.f2793h;
            this.f2795j = 0;
            this.f2793h = 0;
            while (i7 < i2) {
                int i9 = this.f2791f.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw InvalidProtocolBufferException.m2539k();
                }
                this.f2797l += i9;
                i7 += i9;
            }
            return bArr;
        }

        /* renamed from: J */
        private List<byte[]> m2894J(int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int iMin = Math.min(i2, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[iMin];
                int i3 = 0;
                while (i3 < iMin) {
                    int i4 = this.f2791f.read(bArr, i3, iMin - i3);
                    if (i4 == -1) {
                        throw InvalidProtocolBufferException.m2539k();
                    }
                    this.f2797l += i4;
                    i3 += i4;
                }
                i2 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: P */
        private void m2895P() {
            int i2 = this.f2793h + this.f2794i;
            this.f2793h = i2;
            int i3 = this.f2797l + i2;
            int i4 = this.f2798m;
            if (i3 <= i4) {
                this.f2794i = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f2794i = i5;
            this.f2793h = i2 - i5;
        }

        /* renamed from: Q */
        private void m2896Q(int i2) throws IOException {
            if (m2901X(i2)) {
                return;
            }
            if (i2 <= (this.f2779c - this.f2797l) - this.f2795j) {
                throw InvalidProtocolBufferException.m2539k();
            }
            throw InvalidProtocolBufferException.m2538j();
        }

        /* renamed from: T */
        private void m2897T(int i2) throws IOException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m2535f();
            }
            int i3 = this.f2797l;
            int i4 = this.f2795j;
            int i5 = i3 + i4 + i2;
            int i6 = this.f2798m;
            if (i5 > i6) {
                m2909S((i6 - i3) - i4);
                throw InvalidProtocolBufferException.m2539k();
            }
            int i7 = 0;
            if (this.f2799n == null) {
                this.f2797l = i3 + i4;
                int i8 = this.f2793h - i4;
                this.f2793h = 0;
                this.f2795j = 0;
                i7 = i8;
                while (i7 < i2) {
                    try {
                        long j2 = i2 - i7;
                        long jSkip = this.f2791f.skip(j2);
                        if (jSkip < 0 || jSkip > j2) {
                            throw new IllegalStateException(this.f2791f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i7 += (int) jSkip;
                        }
                    } finally {
                        this.f2797l += i7;
                        m2895P();
                    }
                }
            }
            if (i7 >= i2) {
                return;
            }
            int i9 = this.f2793h;
            int i10 = i9 - this.f2795j;
            this.f2795j = i9;
            m2896Q(1);
            while (true) {
                int i11 = i2 - i10;
                int i12 = this.f2793h;
                if (i11 <= i12) {
                    this.f2795j = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f2795j = i12;
                    m2896Q(1);
                }
            }
        }

        /* renamed from: U */
        private void m2898U() throws IOException {
            if (this.f2793h - this.f2795j >= 10) {
                m2899V();
            } else {
                m2900W();
            }
        }

        /* renamed from: V */
        private void m2899V() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.f2792g;
                int i3 = this.f2795j;
                this.f2795j = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: W */
        private void m2900W() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (m2902G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: X */
        private boolean m2901X(int i2) throws IOException {
            int i3 = this.f2795j;
            if (i3 + i2 <= this.f2793h) {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
            int i4 = this.f2779c;
            int i5 = this.f2797l;
            if (i2 > (i4 - i5) - i3 || i5 + i3 + i2 > this.f2798m) {
                return false;
            }
            a aVar = this.f2799n;
            if (aVar != null) {
                aVar.m2910a();
            }
            int i6 = this.f2795j;
            if (i6 > 0) {
                int i7 = this.f2793h;
                if (i7 > i6) {
                    byte[] bArr = this.f2792g;
                    System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                }
                this.f2797l += i6;
                this.f2793h -= i6;
                this.f2795j = 0;
            }
            InputStream inputStream = this.f2791f;
            byte[] bArr2 = this.f2792g;
            int i8 = this.f2793h;
            int i9 = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.f2779c - this.f2797l) - i8));
            if (i9 == 0 || i9 < -1 || i9 > this.f2792g.length) {
                throw new IllegalStateException(this.f2791f.getClass() + "#read(byte[]) returned invalid result: " + i9 + "\nThe InputStream implementation is buggy.");
            }
            if (i9 <= 0) {
                return false;
            }
            this.f2793h += i9;
            m2895P();
            if (this.f2793h >= i2) {
                return true;
            }
            return m2901X(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: A */
        public String mo2854A() throws IOException {
            byte[] bArrM2892H;
            int iM2905M = m2905M();
            int i2 = this.f2795j;
            int i3 = this.f2793h;
            if (iM2905M <= i3 - i2 && iM2905M > 0) {
                bArrM2892H = this.f2792g;
                this.f2795j = i2 + iM2905M;
            } else {
                if (iM2905M == 0) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (iM2905M <= i3) {
                    m2896Q(iM2905M);
                    bArrM2892H = this.f2792g;
                    this.f2795j = iM2905M + 0;
                } else {
                    bArrM2892H = m2892H(iM2905M, false);
                }
                i2 = 0;
            }
            return C0406q1.m3163e(bArrM2892H, i2, iM2905M);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: B */
        public int mo2855B() throws IOException {
            if (mo2861e()) {
                this.f2796k = 0;
                return 0;
            }
            int iM2905M = m2905M();
            this.f2796k = iM2905M;
            if (C0409r1.m3202a(iM2905M) != 0) {
                return this.f2796k;
            }
            throw InvalidProtocolBufferException.m2531b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: C */
        public int mo2856C() throws IOException {
            return m2905M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: D */
        public long mo2857D() throws IOException {
            return m2906N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: E */
        public boolean mo2858E(int i2) throws IOException {
            int iM3203b = C0409r1.m3203b(i2);
            if (iM3203b == 0) {
                m2898U();
                return true;
            }
            if (iM3203b == 1) {
                m2909S(8);
                return true;
            }
            if (iM3203b == 2) {
                m2909S(m2905M());
                return true;
            }
            if (iM3203b == 3) {
                m2908R();
                mo2859a(C0409r1.m3204c(C0409r1.m3202a(i2), 4));
                return true;
            }
            if (iM3203b == 4) {
                return false;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            m2909S(4);
            return true;
        }

        /* renamed from: G */
        public byte m2902G() throws IOException {
            if (this.f2795j == this.f2793h) {
                m2896Q(1);
            }
            byte[] bArr = this.f2792g;
            int i2 = this.f2795j;
            this.f2795j = i2 + 1;
            return bArr[i2];
        }

        /* renamed from: K */
        public int m2903K() throws IOException {
            int i2 = this.f2795j;
            if (this.f2793h - i2 < 4) {
                m2896Q(4);
                i2 = this.f2795j;
            }
            byte[] bArr = this.f2792g;
            this.f2795j = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        /* renamed from: L */
        public long m2904L() throws IOException {
            int i2 = this.f2795j;
            if (this.f2793h - i2 < 8) {
                m2896Q(8);
                i2 = this.f2795j;
            }
            byte[] bArr = this.f2792g;
            this.f2795j = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m2905M() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f2795j
                int r1 = r5.f2793h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f2792g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f2795j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m2907O()
                int r1 = (int) r0
                return r1
            L70:
                r5.f2795j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0383j.c.m2905M():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L41;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m2906N() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0383j.c.m2906N():long");
        }

        /* renamed from: O */
        long m2907O() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & 127) << i2;
                if ((m2902G() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: R */
        public void m2908R() throws IOException {
            int iMo2855B;
            do {
                iMo2855B = mo2855B();
                if (iMo2855B == 0) {
                    return;
                }
            } while (mo2858E(iMo2855B));
        }

        /* renamed from: S */
        public void m2909S(int i2) throws IOException {
            int i3 = this.f2793h;
            int i4 = this.f2795j;
            if (i2 > i3 - i4 || i2 < 0) {
                m2897T(i2);
            } else {
                this.f2795j = i4 + i2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: a */
        public void mo2859a(int i2) throws InvalidProtocolBufferException {
            if (this.f2796k != i2) {
                throw InvalidProtocolBufferException.m2530a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: d */
        public int mo2860d() {
            return this.f2797l + this.f2795j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: e */
        public boolean mo2861e() throws IOException {
            return this.f2795j == this.f2793h && !m2901X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: k */
        public void mo2862k(int i2) {
            this.f2798m = i2;
            m2895P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: l */
        public int mo2863l(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m2535f();
            }
            int i3 = i2 + this.f2797l + this.f2795j;
            int i4 = this.f2798m;
            if (i3 > i4) {
                throw InvalidProtocolBufferException.m2539k();
            }
            this.f2798m = i3;
            m2895P();
            return i4;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: m */
        public boolean mo2864m() throws IOException {
            return m2906N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: n */
        public AbstractC0377h mo2865n() throws IOException {
            int iM2905M = m2905M();
            int i2 = this.f2793h;
            int i3 = this.f2795j;
            if (iM2905M > i2 - i3 || iM2905M <= 0) {
                return iM2905M == 0 ? AbstractC0377h.f2734f : m2891F(iM2905M);
            }
            AbstractC0377h abstractC0377hM2717n = AbstractC0377h.m2717n(this.f2792g, i3, iM2905M);
            this.f2795j += iM2905M;
            return abstractC0377hM2717n;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: o */
        public double mo2866o() throws IOException {
            return Double.longBitsToDouble(m2904L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: p */
        public int mo2867p() throws IOException {
            return m2905M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: q */
        public int mo2868q() throws IOException {
            return m2903K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: r */
        public long mo2869r() throws IOException {
            return m2904L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: s */
        public float mo2870s() throws IOException {
            return Float.intBitsToFloat(m2903K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: t */
        public int mo2871t() throws IOException {
            return m2905M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: u */
        public long mo2872u() throws IOException {
            return m2906N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: v */
        public int mo2873v() throws IOException {
            return m2903K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: w */
        public long mo2874w() throws IOException {
            return m2904L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: x */
        public int mo2875x() throws IOException {
            return AbstractC0383j.m2847b(m2905M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: y */
        public long mo2876y() throws IOException {
            return AbstractC0383j.m2848c(m2906N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0383j
        /* renamed from: z */
        public String mo2877z() throws IOException {
            int iM2905M = m2905M();
            if (iM2905M > 0 && iM2905M <= this.f2793h - this.f2795j) {
                String str = new String(this.f2792g, this.f2795j, iM2905M, C0357a0.f2673a);
                this.f2795j += iM2905M;
                return str;
            }
            if (iM2905M == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (iM2905M > this.f2793h) {
                return new String(m2892H(iM2905M, false), C0357a0.f2673a);
            }
            m2896Q(iM2905M);
            String str2 = new String(this.f2792g, this.f2795j, iM2905M, C0357a0.f2673a);
            this.f2795j += iM2905M;
            return str2;
        }

        private c(InputStream inputStream, int i2) {
            super();
            this.f2798m = Integer.MAX_VALUE;
            this.f2799n = null;
            C0357a0.m2557b(inputStream, "input");
            this.f2791f = inputStream;
            this.f2792g = new byte[i2];
            this.f2793h = 0;
            this.f2795j = 0;
            this.f2797l = 0;
        }
    }

    /* renamed from: b */
    public static int m2847b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* renamed from: c */
    public static long m2848c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* renamed from: f */
    public static AbstractC0383j m2849f(InputStream inputStream) {
        return m2850g(inputStream, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    /* renamed from: g */
    public static AbstractC0383j m2850g(InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? m2851h(C0357a0.f2675c) : new c(inputStream, i2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static AbstractC0383j m2851h(byte[] bArr) {
        return m2852i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC0383j m2852i(byte[] bArr, int i2, int i3) {
        return m2853j(bArr, i2, i3, false);
    }

    /* renamed from: j */
    static AbstractC0383j m2853j(byte[] bArr, int i2, int i3, boolean z) {
        b bVar = new b(bArr, i2, i3, z);
        try {
            bVar.mo2863l(i3);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: A */
    public abstract String mo2854A() throws IOException;

    /* renamed from: B */
    public abstract int mo2855B() throws IOException;

    /* renamed from: C */
    public abstract int mo2856C() throws IOException;

    /* renamed from: D */
    public abstract long mo2857D() throws IOException;

    /* renamed from: E */
    public abstract boolean mo2858E(int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo2859a(int i2) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo2860d();

    /* renamed from: e */
    public abstract boolean mo2861e() throws IOException;

    /* renamed from: k */
    public abstract void mo2862k(int i2);

    /* renamed from: l */
    public abstract int mo2863l(int i2) throws InvalidProtocolBufferException;

    /* renamed from: m */
    public abstract boolean mo2864m() throws IOException;

    /* renamed from: n */
    public abstract AbstractC0377h mo2865n() throws IOException;

    /* renamed from: o */
    public abstract double mo2866o() throws IOException;

    /* renamed from: p */
    public abstract int mo2867p() throws IOException;

    /* renamed from: q */
    public abstract int mo2868q() throws IOException;

    /* renamed from: r */
    public abstract long mo2869r() throws IOException;

    /* renamed from: s */
    public abstract float mo2870s() throws IOException;

    /* renamed from: t */
    public abstract int mo2871t() throws IOException;

    /* renamed from: u */
    public abstract long mo2872u() throws IOException;

    /* renamed from: v */
    public abstract int mo2873v() throws IOException;

    /* renamed from: w */
    public abstract long mo2874w() throws IOException;

    /* renamed from: x */
    public abstract int mo2875x() throws IOException;

    /* renamed from: y */
    public abstract long mo2876y() throws IOException;

    /* renamed from: z */
    public abstract String mo2877z() throws IOException;

    private AbstractC0383j() {
        this.f2778b = 100;
        this.f2779c = Integer.MAX_VALUE;
        this.f2781e = false;
    }
}
