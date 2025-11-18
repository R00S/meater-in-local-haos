package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.r0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: BinaryReader.java */
/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2059e implements e0 {

    /* compiled from: BinaryReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24912a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f24912a = iArr;
            try {
                iArr[r0.b.f25058K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24912a[r0.b.f25062O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24912a[r0.b.f25051D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24912a[r0.b.f25064Q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24912a[r0.b.f25057J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24912a[r0.b.f25056I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24912a[r0.b.f25052E.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24912a[r0.b.f25055H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24912a[r0.b.f25053F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24912a[r0.b.f25061N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24912a[r0.b.f25065R.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24912a[r0.b.f25066S.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24912a[r0.b.f25067T.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24912a[r0.b.f25068U.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24912a[r0.b.f25059L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24912a[r0.b.f25063P.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24912a[r0.b.f25054G.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.e$b */
    private static final class b extends AbstractC2059e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f24913a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f24914b;

        /* renamed from: c, reason: collision with root package name */
        private int f24915c;

        /* renamed from: d, reason: collision with root package name */
        private final int f24916d;

        /* renamed from: e, reason: collision with root package name */
        private int f24917e;

        /* renamed from: f, reason: collision with root package name */
        private int f24918f;

        /* renamed from: g, reason: collision with root package name */
        private int f24919g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f24913a = z10;
            this.f24914b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f24915c = iArrayOffset;
            this.f24916d = iArrayOffset;
            this.f24917e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f24915c == this.f24917e;
        }

        private byte S() throws InvalidProtocolBufferException {
            int i10 = this.f24915c;
            if (i10 == this.f24917e) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f24914b;
            this.f24915c = i10 + 1;
            return bArr[i10];
        }

        private Object T(r0.b bVar, Class<?> cls, C2069o c2069o) {
            switch (a.f24912a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(i());
                case 2:
                    return z();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(q());
                case 5:
                    return Integer.valueOf(h());
                case 6:
                    return Long.valueOf(d());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(B());
                case 9:
                    return Long.valueOf(G());
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    return K(cls, c2069o);
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    return Integer.valueOf(D());
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    return Long.valueOf(j());
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    return Integer.valueOf(s());
                case 14:
                    return Long.valueOf(t());
                case 15:
                    return H();
                case 16:
                    return Integer.valueOf(l());
                case 17:
                    return Long.valueOf(c());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(f0<T> f0Var, C2069o c2069o) {
            int i10 = this.f24919g;
            this.f24919g = r0.c(r0.a(this.f24918f), 4);
            try {
                T tF = f0Var.f();
                f0Var.h(tF, this, c2069o);
                f0Var.b(tF);
                if (this.f24918f == this.f24919g) {
                    return tF;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f24919g = i10;
            }
        }

        private int V() throws InvalidProtocolBufferException {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f24915c;
            byte[] bArr = this.f24914b;
            this.f24915c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() throws InvalidProtocolBufferException {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f24915c;
            byte[] bArr = this.f24914b;
            this.f24915c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        private <T> T Z(f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException {
            int iC0 = c0();
            f0(iC0);
            int i10 = this.f24917e;
            int i11 = this.f24915c + iC0;
            this.f24917e = i11;
            try {
                T tF = f0Var.f();
                f0Var.h(tF, this, c2069o);
                f0Var.b(tF);
                if (this.f24915c == i11) {
                    return tF;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f24917e = i10;
            }
        }

        private int c0() throws InvalidProtocolBufferException {
            int i10;
            int i11 = this.f24915c;
            int i12 = this.f24917e;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f24914b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f24915c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) e0();
            }
            int i14 = i11 + 2;
            int i15 = (bArr[i13] << 7) ^ b10;
            if (i15 < 0) {
                i10 = i15 ^ (-128);
            } else {
                int i16 = i11 + 3;
                int i17 = (bArr[i14] << 14) ^ i15;
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    int i18 = i11 + 4;
                    int i19 = i17 ^ (bArr[i16] << 21);
                    if (i19 < 0) {
                        i10 = (-2080896) ^ i19;
                    } else {
                        i16 = i11 + 5;
                        byte b11 = bArr[i18];
                        int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                        if (b11 < 0) {
                            i18 = i11 + 6;
                            if (bArr[i16] < 0) {
                                i16 = i11 + 7;
                                if (bArr[i18] < 0) {
                                    i18 = i11 + 8;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 9;
                                        if (bArr[i18] < 0) {
                                            int i21 = i11 + 10;
                                            if (bArr[i16] < 0) {
                                                throw InvalidProtocolBufferException.e();
                                            }
                                            i14 = i21;
                                            i10 = i20;
                                        }
                                    }
                                }
                            }
                            i10 = i20;
                        }
                        i10 = i20;
                    }
                    i14 = i18;
                }
                i14 = i16;
            }
            this.f24915c = i14;
            return i10;
        }

        private long e0() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & 127) << i10;
                if ((S() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void f0(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0 || i10 > this.f24917e - this.f24915c) {
                throw InvalidProtocolBufferException.k();
            }
        }

        private void g0(int i10) throws InvalidProtocolBufferException {
            if (this.f24915c != i10) {
                throw InvalidProtocolBufferException.k();
            }
        }

        private void h0(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (r0.b(this.f24918f) != i10) {
                throw InvalidProtocolBufferException.d();
            }
        }

        private void i0(int i10) throws InvalidProtocolBufferException {
            f0(i10);
            this.f24915c += i10;
        }

        private void j0() throws InvalidProtocolBufferException {
            int i10 = this.f24919g;
            this.f24919g = r0.c(r0.a(this.f24918f), 4);
            while (w() != Integer.MAX_VALUE && C()) {
            }
            if (this.f24918f != this.f24919g) {
                throw InvalidProtocolBufferException.g();
            }
            this.f24919g = i10;
        }

        private void k0() throws InvalidProtocolBufferException {
            int i10 = this.f24917e;
            int i11 = this.f24915c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f24914b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f24915c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void m0(int i10) throws InvalidProtocolBufferException {
            f0(i10);
            if ((i10 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        private void n0(int i10) throws InvalidProtocolBufferException {
            f0(i10);
            if ((i10 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void A(List<Float> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2075v)) {
                int iB = r0.b(this.f24918f);
                if (iB == 2) {
                    int iC0 = c0();
                    m0(iC0);
                    int i12 = this.f24915c + iC0;
                    while (this.f24915c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2075v c2075v = (C2075v) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 2) {
                int iC02 = c0();
                m0(iC02);
                int i13 = this.f24915c + iC02;
                while (this.f24915c < i13) {
                    c2075v.i(Float.intBitsToFloat(W()));
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                c2075v.i(readFloat());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public boolean C() throws InvalidProtocolBufferException {
            int i10;
            if (R() || (i10 = this.f24918f) == this.f24919g) {
                return false;
            }
            int iB = r0.b(i10);
            if (iB == 0) {
                k0();
                return true;
            }
            if (iB == 1) {
                i0(8);
                return true;
            }
            if (iB == 2) {
                i0(c0());
                return true;
            }
            if (iB == 3) {
                j0();
                return true;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.d();
            }
            i0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void E(List<AbstractC2062h> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i10;
            if (r0.b(this.f24918f) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(z());
                if (R()) {
                    return;
                } else {
                    i10 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void F(List<Double> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2066l)) {
                int iB = r0.b(this.f24918f);
                if (iB == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f24915c;
                        }
                    } while (c0() == this.f24918f);
                    this.f24915c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC0 = c0();
                n0(iC0);
                int i12 = this.f24915c + iC0;
                while (this.f24915c < i12) {
                    list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                }
                return;
            }
            C2066l c2066l = (C2066l) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 1) {
                do {
                    c2066l.i(readDouble());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC02 = c0();
            n0(iC02);
            int i13 = this.f24915c + iC02;
            while (this.f24915c < i13) {
                c2066l.i(Double.longBitsToDouble(Y()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public long G() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public String H() {
            return a0(true);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void I(List<Long> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof G)) {
                int iB = r0.b(this.f24918f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f24915c;
                        }
                    } while (c0() == this.f24918f);
                    this.f24915c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC0 = c0();
                n0(iC0);
                int i12 = this.f24915c + iC0;
                while (this.f24915c < i12) {
                    list.add(Long.valueOf(Y()));
                }
                return;
            }
            G g10 = (G) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 1) {
                do {
                    g10.j(d());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC02 = c0();
            n0(iC02);
            int i13 = this.f24915c + iC02;
            while (this.f24915c < i13) {
                g10.j(Y());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public <T> T J(f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(2);
            return (T) Z(f0Var, c2069o);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public <T> T K(Class<T> cls, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(2);
            return (T) Z(b0.a().d(cls), c2069o);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public <T> T L(Class<T> cls, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(3);
            return (T) U(b0.a().d(cls), c2069o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.e0
        public <K, V> void M(Map<K, V> map, I.a<K, V> aVar, C2069o c2069o) throws InvalidProtocolBufferException {
            h0(2);
            int iC0 = c0();
            f0(iC0);
            int i10 = this.f24917e;
            this.f24917e = this.f24915c + iC0;
            try {
                Object objT = aVar.f24861b;
                Object objT2 = aVar.f24863d;
                while (true) {
                    int iW = w();
                    if (iW == Integer.MAX_VALUE) {
                        map.put(objT, objT2);
                        return;
                    }
                    if (iW == 1) {
                        objT = T(aVar.f24860a, null, null);
                    } else if (iW != 2) {
                        try {
                            if (!C()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!C()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objT2 = T(aVar.f24862c, aVar.f24863d.getClass(), c2069o);
                    }
                }
            } finally {
                this.f24917e = i10;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.e0
        public <T> void N(List<T> list, f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i10;
            if (r0.b(this.f24918f) != 3) {
                throw InvalidProtocolBufferException.d();
            }
            int i11 = this.f24918f;
            do {
                list.add(U(f0Var, c2069o));
                if (R()) {
                    return;
                } else {
                    i10 = this.f24915c;
                }
            } while (c0() == i11);
            this.f24915c = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.e0
        public <T> void O(List<T> list, f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i10;
            if (r0.b(this.f24918f) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int i11 = this.f24918f;
            do {
                list.add(Z(f0Var, c2069o));
                if (R()) {
                    return;
                } else {
                    i10 = this.f24915c;
                }
            } while (c0() == i11);
            this.f24915c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public <T> T P(f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(3);
            return (T) U(f0Var, c2069o);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int a() {
            return this.f24918f;
        }

        public String a0(boolean z10) throws InvalidProtocolBufferException {
            h0(2);
            int iC0 = c0();
            if (iC0 == 0) {
                return "";
            }
            f0(iC0);
            if (z10) {
                byte[] bArr = this.f24914b;
                int i10 = this.f24915c;
                if (!q0.n(bArr, i10, i10 + iC0)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.f24914b, this.f24915c, iC0, C2079z.f25184a);
            this.f24915c += iC0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void b(List<Integer> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2078y)) {
                int iB = r0.b(this.f24918f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iC0 = this.f24915c + c0();
                    while (this.f24915c < iC0) {
                        list.add(Integer.valueOf(AbstractC2063i.b(c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(s()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2078y c2078y = (C2078y) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC02 = this.f24915c + c0();
                while (this.f24915c < iC02) {
                    c2078y.X(AbstractC2063i.b(c0()));
                }
                return;
            }
            do {
                c2078y.X(s());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        public void b0(List<String> list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i10;
            int i11;
            if (r0.b(this.f24918f) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            if (!(list instanceof E) || z10) {
                do {
                    list.add(a0(z10));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            E e10 = (E) list;
            do {
                e10.i0(z());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public long d() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(1);
            return X();
        }

        public long d0() throws InvalidProtocolBufferException {
            long j10;
            long j11;
            long j12;
            int i10 = this.f24915c;
            int i11 = this.f24917e;
            if (i11 == i10) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f24914b;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f24915c = i12;
                return b10;
            }
            if (i11 - i12 < 9) {
                return e0();
            }
            int i13 = i10 + 2;
            int i14 = (bArr[i12] << 7) ^ b10;
            if (i14 < 0) {
                j10 = i14 ^ (-128);
            } else {
                int i15 = i10 + 3;
                int i16 = (bArr[i13] << 14) ^ i14;
                if (i16 >= 0) {
                    j10 = i16 ^ 16256;
                    i13 = i15;
                } else {
                    int i17 = i10 + 4;
                    int i18 = i16 ^ (bArr[i15] << 21);
                    if (i18 < 0) {
                        long j13 = (-2080896) ^ i18;
                        i13 = i17;
                        j10 = j13;
                    } else {
                        long j14 = i18;
                        i13 = i10 + 5;
                        long j15 = j14 ^ (bArr[i17] << 28);
                        if (j15 >= 0) {
                            j12 = 266354560;
                        } else {
                            int i19 = i10 + 6;
                            long j16 = j15 ^ (bArr[i13] << 35);
                            if (j16 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i13 = i10 + 7;
                                j15 = j16 ^ (bArr[i19] << 42);
                                if (j15 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i19 = i10 + 8;
                                    j16 = j15 ^ (bArr[i13] << 49);
                                    if (j16 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        i13 = i10 + 9;
                                        long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                        if (j17 < 0) {
                                            int i20 = i10 + 10;
                                            if (bArr[i13] < 0) {
                                                throw InvalidProtocolBufferException.e();
                                            }
                                            i13 = i20;
                                        }
                                        j10 = j17;
                                    }
                                }
                            }
                            j10 = j16 ^ j11;
                            i13 = i19;
                        }
                        j10 = j15 ^ j12;
                    }
                }
            }
            this.f24915c = i13;
            return j10;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void e(List<Integer> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2078y)) {
                int iB = r0.b(this.f24918f);
                if (iB == 2) {
                    int iC0 = c0();
                    m0(iC0);
                    int i12 = this.f24915c + iC0;
                    while (this.f24915c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(D()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2078y c2078y = (C2078y) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 2) {
                int iC02 = c0();
                m0(iC02);
                int i13 = this.f24915c + iC02;
                while (this.f24915c < i13) {
                    c2078y.X(W());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                c2078y.X(D());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void f(List<Long> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof G)) {
                int iB = r0.b(this.f24918f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iC0 = this.f24915c + c0();
                    while (this.f24915c < iC0) {
                        list.add(Long.valueOf(AbstractC2063i.c(d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(t()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            G g10 = (G) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC02 = this.f24915c + c0();
                while (this.f24915c < iC02) {
                    g10.j(AbstractC2063i.c(d0()));
                }
                return;
            }
            do {
                g10.j(t());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void g(List<Integer> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2078y)) {
                int iB = r0.b(this.f24918f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iC0 = this.f24915c + c0();
                    while (this.f24915c < iC0) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(l()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2078y c2078y = (C2078y) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC02 = this.f24915c + c0();
                while (this.f24915c < iC02) {
                    c2078y.X(c0());
                }
                return;
            }
            do {
                c2078y.X(l());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public boolean i() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return c0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(1);
            return X();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void k(List<Long> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof G)) {
                int iB = r0.b(this.f24918f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(c()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f24915c;
                        }
                    } while (c0() == this.f24918f);
                    this.f24915c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC0 = this.f24915c + c0();
                while (this.f24915c < iC0) {
                    list.add(Long.valueOf(d0()));
                }
                g0(iC0);
                return;
            }
            G g10 = (G) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 0) {
                do {
                    g10.j(c());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC02 = this.f24915c + c0();
            while (this.f24915c < iC02) {
                g10.j(d0());
            }
            g0(iC02);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void m(List<Long> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof G)) {
                int iB = r0.b(this.f24918f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(G()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f24915c;
                        }
                    } while (c0() == this.f24918f);
                    this.f24915c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC0 = this.f24915c + c0();
                while (this.f24915c < iC0) {
                    list.add(Long.valueOf(d0()));
                }
                g0(iC0);
                return;
            }
            G g10 = (G) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 0) {
                do {
                    g10.j(G());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC02 = this.f24915c + c0();
            while (this.f24915c < iC02) {
                g10.j(d0());
            }
            g0(iC02);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void n(List<Long> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof G)) {
                int iB = r0.b(this.f24918f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(j()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f24915c;
                        }
                    } while (c0() == this.f24918f);
                    this.f24915c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC0 = c0();
                n0(iC0);
                int i12 = this.f24915c + iC0;
                while (this.f24915c < i12) {
                    list.add(Long.valueOf(Y()));
                }
                return;
            }
            G g10 = (G) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 1) {
                do {
                    g10.j(j());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC02 = c0();
            n0(iC02);
            int i13 = this.f24915c + iC02;
            while (this.f24915c < i13) {
                g10.j(Y());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void o(List<Integer> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2078y)) {
                int iB = r0.b(this.f24918f);
                if (iB == 0) {
                    do {
                        list.add(Integer.valueOf(B()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f24915c;
                        }
                    } while (c0() == this.f24918f);
                    this.f24915c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC0 = this.f24915c + c0();
                while (this.f24915c < iC0) {
                    list.add(Integer.valueOf(c0()));
                }
                g0(iC0);
                return;
            }
            C2078y c2078y = (C2078y) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 0) {
                do {
                    c2078y.X(B());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC02 = this.f24915c + c0();
            while (this.f24915c < iC02) {
                c2078y.X(c0());
            }
            g0(iC02);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void p(List<Integer> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2078y)) {
                int iB = r0.b(this.f24918f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iC0 = this.f24915c + c0();
                    while (this.f24915c < iC0) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(q()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2078y c2078y = (C2078y) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC02 = this.f24915c + c0();
                while (this.f24915c < iC02) {
                    c2078y.X(c0());
                }
                return;
            }
            do {
                c2078y.X(q());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void r(List<Integer> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2078y)) {
                int iB = r0.b(this.f24918f);
                if (iB == 2) {
                    int iC0 = c0();
                    m0(iC0);
                    int i12 = this.f24915c + iC0;
                    while (this.f24915c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2078y c2078y = (C2078y) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 == 2) {
                int iC02 = c0();
                m0(iC02);
                int i13 = this.f24915c + iC02;
                while (this.f24915c < i13) {
                    c2078y.X(W());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                c2078y.X(h());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int s() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return AbstractC2063i.b(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
            h0(0);
            return AbstractC2063i.c(d0());
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void u(List<Boolean> list) throws InvalidProtocolBufferException {
            int i10;
            int i11;
            if (!(list instanceof C2060f)) {
                int iB = r0.b(this.f24918f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iC0 = this.f24915c + c0();
                    while (this.f24915c < iC0) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                    g0(iC0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(i()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f24915c;
                    }
                } while (c0() == this.f24918f);
                this.f24915c = i10;
                return;
            }
            C2060f c2060f = (C2060f) list;
            int iB2 = r0.b(this.f24918f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iC02 = this.f24915c + c0();
                while (this.f24915c < iC02) {
                    c2060f.j(c0() != 0);
                }
                g0(iC02);
                return;
            }
            do {
                c2060f.j(i());
                if (R()) {
                    return;
                } else {
                    i11 = this.f24915c;
                }
            } while (c0() == this.f24918f);
            this.f24915c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public String v() {
            return a0(false);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public int w() throws InvalidProtocolBufferException {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int iC0 = c0();
            this.f24918f = iC0;
            if (iC0 == this.f24919g) {
                return Integer.MAX_VALUE;
            }
            return r0.a(iC0);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void x(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            b0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public void y(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            b0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.e0
        public AbstractC2062h z() throws InvalidProtocolBufferException {
            h0(2);
            int iC0 = c0();
            if (iC0 == 0) {
                return AbstractC2062h.f24923C;
            }
            f0(iC0);
            AbstractC2062h abstractC2062hM = this.f24913a ? AbstractC2062h.M(this.f24914b, this.f24915c, iC0) : AbstractC2062h.r(this.f24914b, this.f24915c, iC0);
            this.f24915c += iC0;
            return abstractC2062hM;
        }
    }

    /* synthetic */ AbstractC2059e(a aVar) {
        this();
    }

    public static AbstractC2059e Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private AbstractC2059e() {
    }
}
