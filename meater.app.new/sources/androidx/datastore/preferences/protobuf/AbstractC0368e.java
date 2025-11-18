package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0384j0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: BinaryReader.java */
/* renamed from: androidx.datastore.preferences.protobuf.e */
/* loaded from: classes.dex */
abstract class AbstractC0368e implements InterfaceC0370e1 {

    /* compiled from: BinaryReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.e$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2717a;

        static {
            int[] iArr = new int[C0409r1.b.values().length];
            f2717a = iArr;
            try {
                iArr[C0409r1.b.f2885m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2717a[C0409r1.b.f2889q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2717a[C0409r1.b.f2878f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2717a[C0409r1.b.f2891s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2717a[C0409r1.b.f2884l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2717a[C0409r1.b.f2883k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2717a[C0409r1.b.f2879g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2717a[C0409r1.b.f2882j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2717a[C0409r1.b.f2880h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2717a[C0409r1.b.f2888p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2717a[C0409r1.b.f2892t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2717a[C0409r1.b.f2893u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2717a[C0409r1.b.f2894v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2717a[C0409r1.b.f2895w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2717a[C0409r1.b.f2886n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2717a[C0409r1.b.f2890r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2717a[C0409r1.b.f2881i.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.e$b */
    private static final class b extends AbstractC0368e {

        /* renamed from: a */
        private final boolean f2718a;

        /* renamed from: b */
        private final byte[] f2719b;

        /* renamed from: c */
        private int f2720c;

        /* renamed from: d */
        private final int f2721d;

        /* renamed from: e */
        private int f2722e;

        /* renamed from: f */
        private int f2723f;

        /* renamed from: g */
        private int f2724g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f2718a = z;
            this.f2719b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f2720c = iArrayOffset;
            this.f2721d = iArrayOffset;
            this.f2722e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: Q */
        private boolean m2606Q() {
            return this.f2720c == this.f2722e;
        }

        /* renamed from: R */
        private byte m2607R() throws IOException {
            int i2 = this.f2720c;
            if (i2 == this.f2722e) {
                throw InvalidProtocolBufferException.m2539k();
            }
            byte[] bArr = this.f2719b;
            this.f2720c = i2 + 1;
            return bArr[i2];
        }

        /* renamed from: S */
        private Object m2608S(C0409r1.b bVar, Class<?> cls, C0401p c0401p) throws IOException {
            switch (a.f2717a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo2655l());
                case 2:
                    return mo2628C();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo2665v());
                case 5:
                    return Integer.valueOf(mo2654k());
                case 6:
                    return Long.valueOf(mo2649f());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo2630E());
                case 9:
                    return Long.valueOf(mo2637L());
                case 10:
                    return mo2650g(cls, c0401p);
                case 11:
                    return Integer.valueOf(mo2633H());
                case 12:
                    return Long.valueOf(mo2656m());
                case 13:
                    return Integer.valueOf(mo2667x());
                case 14:
                    return Long.valueOf(mo2668y());
                case 15:
                    return mo2638M();
                case 16:
                    return Integer.valueOf(mo2659p());
                case 17:
                    return Long.valueOf(mo2648e());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: T */
        private <T> T m2609T(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
            int i2 = this.f2724g;
            this.f2724g = C0409r1.m3204c(C0409r1.m3202a(this.f2723f), 4);
            try {
                T tMo2694c = interfaceC0373f1.mo2694c();
                interfaceC0373f1.mo2696e(tMo2694c, this, c0401p);
                interfaceC0373f1.mo2697f(tMo2694c);
                if (this.f2723f == this.f2724g) {
                    return tMo2694c;
                }
                throw InvalidProtocolBufferException.m2536g();
            } finally {
                this.f2724g = i2;
            }
        }

        /* renamed from: U */
        private int m2610U() throws IOException {
            m2617e0(4);
            return m2611V();
        }

        /* renamed from: V */
        private int m2611V() {
            int i2 = this.f2720c;
            byte[] bArr = this.f2719b;
            this.f2720c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        /* renamed from: W */
        private long m2612W() throws IOException {
            m2617e0(8);
            return m2613X();
        }

        /* renamed from: X */
        private long m2613X() {
            int i2 = this.f2720c;
            byte[] bArr = this.f2719b;
            this.f2720c = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* renamed from: Y */
        private <T> T m2614Y(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
            int iM2615b0 = m2615b0();
            m2617e0(iM2615b0);
            int i2 = this.f2722e;
            int i3 = this.f2720c + iM2615b0;
            this.f2722e = i3;
            try {
                T tMo2694c = interfaceC0373f1.mo2694c();
                interfaceC0373f1.mo2696e(tMo2694c, this, c0401p);
                interfaceC0373f1.mo2697f(tMo2694c);
                if (this.f2720c == i3) {
                    return tMo2694c;
                }
                throw InvalidProtocolBufferException.m2536g();
            } finally {
                this.f2722e = i2;
            }
        }

        /* renamed from: b0 */
        private int m2615b0() throws IOException {
            int i2;
            int i3 = this.f2720c;
            int i4 = this.f2722e;
            if (i4 == i3) {
                throw InvalidProtocolBufferException.m2539k();
            }
            byte[] bArr = this.f2719b;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f2720c = i5;
                return b2;
            }
            if (i4 - i5 < 9) {
                return (int) m2616d0();
            }
            int i6 = i5 + 1;
            int i7 = b2 ^ (bArr[i5] << 7);
            if (i7 < 0) {
                i2 = i7 ^ (-128);
            } else {
                int i8 = i6 + 1;
                int i9 = i7 ^ (bArr[i6] << 14);
                if (i9 >= 0) {
                    i2 = i9 ^ 16256;
                } else {
                    i6 = i8 + 1;
                    int i10 = i9 ^ (bArr[i8] << 21);
                    if (i10 < 0) {
                        i2 = i10 ^ (-2080896);
                    } else {
                        i8 = i6 + 1;
                        byte b3 = bArr[i6];
                        i2 = (i10 ^ (b3 << 28)) ^ 266354560;
                        if (b3 < 0) {
                            i6 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i6 + 1;
                                if (bArr[i6] < 0) {
                                    i6 = i8 + 1;
                                    if (bArr[i8] < 0) {
                                        i8 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            i6 = i8 + 1;
                                            if (bArr[i8] < 0) {
                                                throw InvalidProtocolBufferException.m2534e();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i6 = i8;
            }
            this.f2720c = i6;
            return i2;
        }

        /* renamed from: d0 */
        private long m2616d0() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & 127) << i2;
                if ((m2607R() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: e0 */
        private void m2617e0(int i2) throws IOException {
            if (i2 < 0 || i2 > this.f2722e - this.f2720c) {
                throw InvalidProtocolBufferException.m2539k();
            }
        }

        /* renamed from: f0 */
        private void m2618f0(int i2) throws IOException {
            if (this.f2720c != i2) {
                throw InvalidProtocolBufferException.m2539k();
            }
        }

        /* renamed from: g0 */
        private void m2619g0(int i2) throws IOException {
            if (C0409r1.m3203b(this.f2723f) != i2) {
                throw InvalidProtocolBufferException.m2533d();
            }
        }

        /* renamed from: h0 */
        private void m2620h0(int i2) throws IOException {
            m2617e0(i2);
            this.f2720c += i2;
        }

        /* renamed from: i0 */
        private void m2621i0() throws IOException {
            int i2 = this.f2724g;
            this.f2724g = C0409r1.m3204c(C0409r1.m3202a(this.f2723f), 4);
            while (mo2626A() != Integer.MAX_VALUE && mo2632G()) {
            }
            if (this.f2723f != this.f2724g) {
                throw InvalidProtocolBufferException.m2536g();
            }
            this.f2724g = i2;
        }

        /* renamed from: j0 */
        private void m2622j0() throws IOException {
            int i2 = this.f2722e;
            int i3 = this.f2720c;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.f2719b;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.f2720c = i5;
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
            m2623k0();
        }

        /* renamed from: k0 */
        private void m2623k0() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (m2607R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m2534e();
        }

        /* renamed from: l0 */
        private void m2624l0(int i2) throws IOException {
            m2617e0(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.m2536g();
            }
        }

        /* renamed from: m0 */
        private void m2625m0(int i2) throws IOException {
            m2617e0(i2);
            if ((i2 & 7) != 0) {
                throw InvalidProtocolBufferException.m2536g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: A */
        public int mo2626A() throws IOException {
            if (m2606Q()) {
                return Integer.MAX_VALUE;
            }
            int iM2615b0 = m2615b0();
            this.f2723f = iM2615b0;
            if (iM2615b0 == this.f2724g) {
                return Integer.MAX_VALUE;
            }
            return C0409r1.m3202a(iM2615b0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: B */
        public void mo2627B(List<String> list) throws IOException {
            m2643a0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: C */
        public AbstractC0377h mo2628C() throws IOException {
            m2619g0(2);
            int iM2615b0 = m2615b0();
            if (iM2615b0 == 0) {
                return AbstractC0377h.f2734f;
            }
            m2617e0(iM2615b0);
            AbstractC0377h abstractC0377hM2712G = this.f2718a ? AbstractC0377h.m2712G(this.f2719b, this.f2720c, iM2615b0) : AbstractC0377h.m2717n(this.f2719b, this.f2720c, iM2615b0);
            this.f2720c += iM2615b0;
            return abstractC0377hM2712G;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: D */
        public void mo2629D(List<Float> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0419w)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 2) {
                    int iM2615b0 = m2615b0();
                    m2624l0(iM2615b0);
                    int i4 = this.f2720c + iM2615b0;
                    while (this.f2720c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m2611V())));
                    }
                    return;
                }
                if (iM3203b != 5) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0419w c0419w = (C0419w) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 2) {
                int iM2615b02 = m2615b0();
                m2624l0(iM2615b02);
                int i5 = this.f2720c + iM2615b02;
                while (this.f2720c < i5) {
                    c0419w.m3318h(Float.intBitsToFloat(m2611V()));
                }
                return;
            }
            if (iM3203b2 != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                c0419w.m3318h(readFloat());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: E */
        public int mo2630E() throws IOException {
            m2619g0(0);
            return m2615b0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: F */
        public <T> void mo2631F(List<T> list, InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
            int i2;
            if (C0409r1.m3203b(this.f2723f) != 3) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int i3 = this.f2723f;
            do {
                list.add(m2609T(interfaceC0373f1, c0401p));
                if (m2606Q()) {
                    return;
                } else {
                    i2 = this.f2720c;
                }
            } while (m2615b0() == i3);
            this.f2720c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: G */
        public boolean mo2632G() throws IOException {
            int i2;
            if (m2606Q() || (i2 = this.f2723f) == this.f2724g) {
                return false;
            }
            int iM3203b = C0409r1.m3203b(i2);
            if (iM3203b == 0) {
                m2622j0();
                return true;
            }
            if (iM3203b == 1) {
                m2620h0(8);
                return true;
            }
            if (iM3203b == 2) {
                m2620h0(m2615b0());
                return true;
            }
            if (iM3203b == 3) {
                m2621i0();
                return true;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            m2620h0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: H */
        public int mo2633H() throws IOException {
            m2619g0(5);
            return m2610U();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: I */
        public void mo2634I(List<AbstractC0377h> list) throws IOException {
            int i2;
            if (C0409r1.m3203b(this.f2723f) != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                list.add(mo2628C());
                if (m2606Q()) {
                    return;
                } else {
                    i2 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: J */
        public void mo2635J(List<Double> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0392m)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (m2606Q()) {
                            return;
                        } else {
                            i2 = this.f2720c;
                        }
                    } while (m2615b0() == this.f2723f);
                    this.f2720c = i2;
                    return;
                }
                if (iM3203b != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b0 = m2615b0();
                m2625m0(iM2615b0);
                int i4 = this.f2720c + iM2615b0;
                while (this.f2720c < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m2613X())));
                }
                return;
            }
            C0392m c0392m = (C0392m) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 1) {
                do {
                    c0392m.m3023h(readDouble());
                    if (m2606Q()) {
                        return;
                    } else {
                        i3 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i3;
                return;
            }
            if (iM3203b2 != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iM2615b02 = m2615b0();
            m2625m0(iM2615b02);
            int i5 = this.f2720c + iM2615b02;
            while (this.f2720c < i5) {
                c0392m.m3023h(Double.longBitsToDouble(m2613X()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: K */
        public <T> void mo2636K(List<T> list, InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
            int i2;
            if (C0409r1.m3203b(this.f2723f) != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int i3 = this.f2723f;
            do {
                list.add(m2614Y(interfaceC0373f1, c0401p));
                if (m2606Q()) {
                    return;
                } else {
                    i2 = this.f2720c;
                }
            } while (m2615b0() == i3);
            this.f2720c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: L */
        public long mo2637L() throws IOException {
            m2619g0(0);
            return m2646c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: M */
        public String mo2638M() throws IOException {
            return m2641Z(true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: N */
        public void mo2639N(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0378h0)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 1) {
                    do {
                        list.add(Long.valueOf(mo2649f()));
                        if (m2606Q()) {
                            return;
                        } else {
                            i2 = this.f2720c;
                        }
                    } while (m2615b0() == this.f2723f);
                    this.f2720c = i2;
                    return;
                }
                if (iM3203b != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b0 = m2615b0();
                m2625m0(iM2615b0);
                int i4 = this.f2720c + iM2615b0;
                while (this.f2720c < i4) {
                    list.add(Long.valueOf(m2613X()));
                }
                return;
            }
            C0378h0 c0378h0 = (C0378h0) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 1) {
                do {
                    c0378h0.m2747i(mo2649f());
                    if (m2606Q()) {
                        return;
                    } else {
                        i3 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i3;
                return;
            }
            if (iM3203b2 != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iM2615b02 = m2615b0();
            m2625m0(iM2615b02);
            int i5 = this.f2720c + iM2615b02;
            while (this.f2720c < i5) {
                c0378h0.m2747i(m2613X());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: O */
        public <T> T mo2640O(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
            m2619g0(3);
            return (T) m2609T(interfaceC0373f1, c0401p);
        }

        /* renamed from: Z */
        public String m2641Z(boolean z) throws IOException {
            m2619g0(2);
            int iM2615b0 = m2615b0();
            if (iM2615b0 == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            m2617e0(iM2615b0);
            if (z) {
                byte[] bArr = this.f2719b;
                int i2 = this.f2720c;
                if (!C0406q1.m3172n(bArr, i2, i2 + iM2615b0)) {
                    throw InvalidProtocolBufferException.m2532c();
                }
            }
            String str = new String(this.f2719b, this.f2720c, iM2615b0, C0357a0.f2673a);
            this.f2720c += iM2615b0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: a */
        public String mo2642a() throws IOException {
            return m2641Z(false);
        }

        /* renamed from: a0 */
        public void m2643a0(List<String> list, boolean z) throws IOException {
            int i2;
            int i3;
            if (C0409r1.m3203b(this.f2723f) != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            if (!(list instanceof InterfaceC0372f0) || z) {
                do {
                    list.add(m2641Z(z));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            InterfaceC0372f0 interfaceC0372f0 = (InterfaceC0372f0) list;
            do {
                interfaceC0372f0.mo2671a0(mo2628C());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: b */
        public void mo2644b(List<String> list) throws IOException {
            m2643a0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: c */
        public <T> T mo2645c(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
            m2619g0(2);
            return (T) m2614Y(interfaceC0373f1, c0401p);
        }

        /* renamed from: c0 */
        public long m2646c0() throws IOException {
            long j2;
            long j3;
            long j4;
            long j5;
            int i2;
            int i3 = this.f2720c;
            int i4 = this.f2722e;
            if (i4 == i3) {
                throw InvalidProtocolBufferException.m2539k();
            }
            byte[] bArr = this.f2719b;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f2720c = i5;
                return b2;
            }
            if (i4 - i5 < 9) {
                return m2616d0();
            }
            int i6 = i5 + 1;
            int i7 = b2 ^ (bArr[i5] << 7);
            if (i7 >= 0) {
                int i8 = i6 + 1;
                int i9 = i7 ^ (bArr[i6] << 14);
                if (i9 >= 0) {
                    i6 = i8;
                    j5 = i9 ^ 16256;
                } else {
                    i6 = i8 + 1;
                    int i10 = i9 ^ (bArr[i8] << 21);
                    if (i10 < 0) {
                        i2 = i10 ^ (-2080896);
                    } else {
                        long j6 = i10;
                        int i11 = i6 + 1;
                        long j7 = j6 ^ (bArr[i6] << 28);
                        if (j7 >= 0) {
                            j4 = 266354560;
                        } else {
                            i6 = i11 + 1;
                            long j8 = j7 ^ (bArr[i11] << 35);
                            if (j8 < 0) {
                                j3 = -34093383808L;
                            } else {
                                i11 = i6 + 1;
                                j7 = j8 ^ (bArr[i6] << 42);
                                if (j7 >= 0) {
                                    j4 = 4363953127296L;
                                } else {
                                    i6 = i11 + 1;
                                    j8 = j7 ^ (bArr[i11] << 49);
                                    if (j8 < 0) {
                                        j3 = -558586000294016L;
                                    } else {
                                        int i12 = i6 + 1;
                                        j2 = (j8 ^ (bArr[i6] << 56)) ^ 71499008037633920L;
                                        if (j2 < 0) {
                                            i6 = i12 + 1;
                                            if (bArr[i12] < 0) {
                                                throw InvalidProtocolBufferException.m2534e();
                                            }
                                        } else {
                                            i6 = i12;
                                        }
                                        j5 = j2;
                                    }
                                }
                            }
                            j2 = j8 ^ j3;
                            j5 = j2;
                        }
                        j5 = j4 ^ j7;
                        i6 = i11;
                    }
                }
                this.f2720c = i6;
                return j5;
            }
            i2 = i7 ^ (-128);
            j5 = i2;
            this.f2720c = i6;
            return j5;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: d */
        public void mo2647d(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0425z)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b != 0) {
                    if (iM3203b != 2) {
                        throw InvalidProtocolBufferException.m2533d();
                    }
                    int iM2615b0 = this.f2720c + m2615b0();
                    while (this.f2720c < iM2615b0) {
                        list.add(Integer.valueOf(AbstractC0383j.m2847b(m2615b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo2667x()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0425z c0425z = (C0425z) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 != 0) {
                if (iM3203b2 != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b02 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b02) {
                    c0425z.m3370h(AbstractC0383j.m2847b(m2615b0()));
                }
                return;
            }
            do {
                c0425z.m3370h(mo2667x());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: e */
        public long mo2648e() throws IOException {
            m2619g0(0);
            return m2646c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: f */
        public long mo2649f() throws IOException {
            m2619g0(1);
            return m2612W();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: g */
        public <T> T mo2650g(Class<T> cls, C0401p c0401p) throws IOException {
            m2619g0(2);
            return (T) m2614Y(C0361b1.m2578a().m2581d(cls), c0401p);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        public int getTag() {
            return this.f2723f;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: h */
        public void mo2651h(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0425z)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 2) {
                    int iM2615b0 = m2615b0();
                    m2624l0(iM2615b0);
                    int i4 = this.f2720c + iM2615b0;
                    while (this.f2720c < i4) {
                        list.add(Integer.valueOf(m2611V()));
                    }
                    return;
                }
                if (iM3203b != 5) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                do {
                    list.add(Integer.valueOf(mo2633H()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0425z c0425z = (C0425z) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 2) {
                int iM2615b02 = m2615b0();
                m2624l0(iM2615b02);
                int i5 = this.f2720c + iM2615b02;
                while (this.f2720c < i5) {
                    c0425z.m3370h(m2611V());
                }
                return;
            }
            if (iM3203b2 != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                c0425z.m3370h(mo2633H());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: i */
        public void mo2652i(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0378h0)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b != 0) {
                    if (iM3203b != 2) {
                        throw InvalidProtocolBufferException.m2533d();
                    }
                    int iM2615b0 = this.f2720c + m2615b0();
                    while (this.f2720c < iM2615b0) {
                        list.add(Long.valueOf(AbstractC0383j.m2848c(m2646c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo2668y()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0378h0 c0378h0 = (C0378h0) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 != 0) {
                if (iM3203b2 != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b02 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b02) {
                    c0378h0.m2747i(AbstractC0383j.m2848c(m2646c0()));
                }
                return;
            }
            do {
                c0378h0.m2747i(mo2668y());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: j */
        public void mo2653j(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0425z)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b != 0) {
                    if (iM3203b != 2) {
                        throw InvalidProtocolBufferException.m2533d();
                    }
                    int iM2615b0 = this.f2720c + m2615b0();
                    while (this.f2720c < iM2615b0) {
                        list.add(Integer.valueOf(m2615b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo2659p()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0425z c0425z = (C0425z) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 != 0) {
                if (iM3203b2 != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b02 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b02) {
                    c0425z.m3370h(m2615b0());
                }
                return;
            }
            do {
                c0425z.m3370h(mo2659p());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: k */
        public int mo2654k() throws IOException {
            m2619g0(5);
            return m2610U();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: l */
        public boolean mo2655l() throws IOException {
            m2619g0(0);
            return m2615b0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: m */
        public long mo2656m() throws IOException {
            m2619g0(1);
            return m2612W();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: n */
        public void mo2657n(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0378h0)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 0) {
                    do {
                        list.add(Long.valueOf(mo2648e()));
                        if (m2606Q()) {
                            return;
                        } else {
                            i2 = this.f2720c;
                        }
                    } while (m2615b0() == this.f2723f);
                    this.f2720c = i2;
                    return;
                }
                if (iM3203b != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b0 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b0) {
                    list.add(Long.valueOf(m2646c0()));
                }
                m2618f0(iM2615b0);
                return;
            }
            C0378h0 c0378h0 = (C0378h0) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 0) {
                do {
                    c0378h0.m2747i(mo2648e());
                    if (m2606Q()) {
                        return;
                    } else {
                        i3 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i3;
                return;
            }
            if (iM3203b2 != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iM2615b02 = this.f2720c + m2615b0();
            while (this.f2720c < iM2615b02) {
                c0378h0.m2747i(m2646c0());
            }
            m2618f0(iM2615b02);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: o */
        public <T> T mo2658o(Class<T> cls, C0401p c0401p) throws IOException {
            m2619g0(3);
            return (T) m2609T(C0361b1.m2578a().m2581d(cls), c0401p);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: p */
        public int mo2659p() throws IOException {
            m2619g0(0);
            return m2615b0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: q */
        public void mo2660q(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0378h0)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 0) {
                    do {
                        list.add(Long.valueOf(mo2637L()));
                        if (m2606Q()) {
                            return;
                        } else {
                            i2 = this.f2720c;
                        }
                    } while (m2615b0() == this.f2723f);
                    this.f2720c = i2;
                    return;
                }
                if (iM3203b != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b0 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b0) {
                    list.add(Long.valueOf(m2646c0()));
                }
                m2618f0(iM2615b0);
                return;
            }
            C0378h0 c0378h0 = (C0378h0) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 0) {
                do {
                    c0378h0.m2747i(mo2637L());
                    if (m2606Q()) {
                        return;
                    } else {
                        i3 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i3;
                return;
            }
            if (iM3203b2 != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iM2615b02 = this.f2720c + m2615b0();
            while (this.f2720c < iM2615b02) {
                c0378h0.m2747i(m2646c0());
            }
            m2618f0(iM2615b02);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: r */
        public void mo2661r(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0378h0)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 1) {
                    do {
                        list.add(Long.valueOf(mo2656m()));
                        if (m2606Q()) {
                            return;
                        } else {
                            i2 = this.f2720c;
                        }
                    } while (m2615b0() == this.f2723f);
                    this.f2720c = i2;
                    return;
                }
                if (iM3203b != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b0 = m2615b0();
                m2625m0(iM2615b0);
                int i4 = this.f2720c + iM2615b0;
                while (this.f2720c < i4) {
                    list.add(Long.valueOf(m2613X()));
                }
                return;
            }
            C0378h0 c0378h0 = (C0378h0) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 1) {
                do {
                    c0378h0.m2747i(mo2656m());
                    if (m2606Q()) {
                        return;
                    } else {
                        i3 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i3;
                return;
            }
            if (iM3203b2 != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iM2615b02 = m2615b0();
            m2625m0(iM2615b02);
            int i5 = this.f2720c + iM2615b02;
            while (this.f2720c < i5) {
                c0378h0.m2747i(m2613X());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        public double readDouble() throws IOException {
            m2619g0(1);
            return Double.longBitsToDouble(m2612W());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        public float readFloat() throws IOException {
            m2619g0(5);
            return Float.intBitsToFloat(m2610U());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: s */
        public void mo2662s(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0425z)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 0) {
                    do {
                        list.add(Integer.valueOf(mo2630E()));
                        if (m2606Q()) {
                            return;
                        } else {
                            i2 = this.f2720c;
                        }
                    } while (m2615b0() == this.f2723f);
                    this.f2720c = i2;
                    return;
                }
                if (iM3203b != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b0 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b0) {
                    list.add(Integer.valueOf(m2615b0()));
                }
                m2618f0(iM2615b0);
                return;
            }
            C0425z c0425z = (C0425z) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 0) {
                do {
                    c0425z.m3370h(mo2630E());
                    if (m2606Q()) {
                        return;
                    } else {
                        i3 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i3;
                return;
            }
            if (iM3203b2 != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iM2615b02 = this.f2720c + m2615b0();
            while (this.f2720c < iM2615b02) {
                c0425z.m3370h(m2615b0());
            }
            m2618f0(iM2615b02);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: t */
        public void mo2663t(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0425z)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b != 0) {
                    if (iM3203b != 2) {
                        throw InvalidProtocolBufferException.m2533d();
                    }
                    int iM2615b0 = this.f2720c + m2615b0();
                    while (this.f2720c < iM2615b0) {
                        list.add(Integer.valueOf(m2615b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo2665v()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0425z c0425z = (C0425z) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 != 0) {
                if (iM3203b2 != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b02 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b02) {
                    c0425z.m3370h(m2615b0());
                }
                return;
            }
            do {
                c0425z.m3370h(mo2665v());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: u */
        public <K, V> void mo2664u(Map<K, V> map, C0384j0.a<K, V> aVar, C0401p c0401p) throws IOException {
            m2619g0(2);
            int iM2615b0 = m2615b0();
            m2617e0(iM2615b0);
            int i2 = this.f2722e;
            this.f2722e = this.f2720c + iM2615b0;
            try {
                Object objM2608S = aVar.f2804b;
                Object objM2608S2 = aVar.f2806d;
                while (true) {
                    int iMo2626A = mo2626A();
                    if (iMo2626A == Integer.MAX_VALUE) {
                        map.put(objM2608S, objM2608S2);
                        return;
                    }
                    if (iMo2626A == 1) {
                        objM2608S = m2608S(aVar.f2803a, null, null);
                    } else if (iMo2626A != 2) {
                        try {
                            if (!mo2632G()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!mo2632G()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objM2608S2 = m2608S(aVar.f2805c, aVar.f2806d.getClass(), c0401p);
                    }
                }
            } finally {
                this.f2722e = i2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: v */
        public int mo2665v() throws IOException {
            m2619g0(0);
            return m2615b0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: w */
        public void mo2666w(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0425z)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b == 2) {
                    int iM2615b0 = m2615b0();
                    m2624l0(iM2615b0);
                    int i4 = this.f2720c + iM2615b0;
                    while (this.f2720c < i4) {
                        list.add(Integer.valueOf(m2611V()));
                    }
                    return;
                }
                if (iM3203b != 5) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                do {
                    list.add(Integer.valueOf(mo2654k()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0425z c0425z = (C0425z) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 == 2) {
                int iM2615b02 = m2615b0();
                m2624l0(iM2615b02);
                int i5 = this.f2720c + iM2615b02;
                while (this.f2720c < i5) {
                    c0425z.m3370h(m2611V());
                }
                return;
            }
            if (iM3203b2 != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                c0425z.m3370h(mo2654k());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: x */
        public int mo2667x() throws IOException {
            m2619g0(0);
            return AbstractC0383j.m2847b(m2615b0());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: y */
        public long mo2668y() throws IOException {
            m2619g0(0);
            return AbstractC0383j.m2848c(m2646c0());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
        /* renamed from: z */
        public void mo2669z(List<Boolean> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof C0371f)) {
                int iM3203b = C0409r1.m3203b(this.f2723f);
                if (iM3203b != 0) {
                    if (iM3203b != 2) {
                        throw InvalidProtocolBufferException.m2533d();
                    }
                    int iM2615b0 = this.f2720c + m2615b0();
                    while (this.f2720c < iM2615b0) {
                        list.add(Boolean.valueOf(m2615b0() != 0));
                    }
                    m2618f0(iM2615b0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(mo2655l()));
                    if (m2606Q()) {
                        return;
                    } else {
                        i2 = this.f2720c;
                    }
                } while (m2615b0() == this.f2723f);
                this.f2720c = i2;
                return;
            }
            C0371f c0371f = (C0371f) list;
            int iM3203b2 = C0409r1.m3203b(this.f2723f);
            if (iM3203b2 != 0) {
                if (iM3203b2 != 2) {
                    throw InvalidProtocolBufferException.m2533d();
                }
                int iM2615b02 = this.f2720c + m2615b0();
                while (this.f2720c < iM2615b02) {
                    c0371f.m2685i(m2615b0() != 0);
                }
                m2618f0(iM2615b02);
                return;
            }
            do {
                c0371f.m2685i(mo2655l());
                if (m2606Q()) {
                    return;
                } else {
                    i3 = this.f2720c;
                }
            } while (m2615b0() == this.f2723f);
            this.f2720c = i3;
        }
    }

    /* synthetic */ AbstractC0368e(a aVar) {
        this();
    }

    /* renamed from: P */
    public static AbstractC0368e m2605P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private AbstractC0368e() {
    }
}
