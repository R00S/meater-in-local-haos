package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: T, reason: collision with root package name */
    private static SimpleDateFormat f25309T;

    /* renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f25310U;

    /* renamed from: Y, reason: collision with root package name */
    private static final d[] f25314Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final d[] f25315Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final d[] f25316a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final d[] f25317b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final d[] f25318c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final d f25319d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final d[] f25320e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final d[] f25321f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final d[] f25322g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final d[] f25323h0;

    /* renamed from: i0, reason: collision with root package name */
    static final d[][] f25324i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final d[] f25325j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final HashMap<Integer, d>[] f25326k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap<String, d>[] f25327l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashSet<String> f25328m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f25329n0;

    /* renamed from: o0, reason: collision with root package name */
    static final Charset f25330o0;

    /* renamed from: p0, reason: collision with root package name */
    static final byte[] f25331p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final byte[] f25332q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final Pattern f25333r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f25334s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f25335t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f25337u0;

    /* renamed from: a, reason: collision with root package name */
    private String f25343a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f25344b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f25345c;

    /* renamed from: d, reason: collision with root package name */
    private int f25346d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25347e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, c>[] f25348f;

    /* renamed from: g, reason: collision with root package name */
    private Set<Integer> f25349g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f25350h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25351i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25352j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25353k;

    /* renamed from: l, reason: collision with root package name */
    private int f25354l;

    /* renamed from: m, reason: collision with root package name */
    private int f25355m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f25356n;

    /* renamed from: o, reason: collision with root package name */
    private int f25357o;

    /* renamed from: p, reason: collision with root package name */
    private int f25358p;

    /* renamed from: q, reason: collision with root package name */
    private int f25359q;

    /* renamed from: r, reason: collision with root package name */
    private int f25360r;

    /* renamed from: s, reason: collision with root package name */
    private int f25361s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25362t;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f25336u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v, reason: collision with root package name */
    private static final List<Integer> f25338v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w, reason: collision with root package name */
    private static final List<Integer> f25339w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f25340x = {8, 8, 8};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f25341y = {4};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f25342z = {8};

    /* renamed from: A, reason: collision with root package name */
    static final byte[] f25290A = {-1, -40, -1};

    /* renamed from: B, reason: collision with root package name */
    private static final byte[] f25291B = {102, 116, 121, 112};

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f25292C = {109, 105, 102, 49};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f25293D = {104, 101, 105, 99};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f25294E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f25295F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f25296G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f25297H = {101, 88, 73, 102};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f25298I = {73, 72, 68, 82};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f25299J = {73, 69, 78, 68};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f25300K = {82, 73, 70, 70};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f25301L = {87, 69, 66, 80};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f25302M = {69, 88, 73, 70};

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f25303N = {-99, 1, 42};

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f25304O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f25305P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f25306Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    private static final byte[] f25307R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f25308S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V, reason: collision with root package name */
    static final String[] f25311V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W, reason: collision with root package name */
    static final int[] f25312W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X, reason: collision with root package name */
    static final byte[] f25313X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    private static class b extends InputStream implements DataInput {

        /* renamed from: F, reason: collision with root package name */
        private static final ByteOrder f25366F = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: G, reason: collision with root package name */
        private static final ByteOrder f25367G = ByteOrder.BIG_ENDIAN;

        /* renamed from: B, reason: collision with root package name */
        final DataInputStream f25368B;

        /* renamed from: C, reason: collision with root package name */
        private ByteOrder f25369C;

        /* renamed from: D, reason: collision with root package name */
        int f25370D;

        /* renamed from: E, reason: collision with root package name */
        private byte[] f25371E;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f25370D;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f25368B.available();
        }

        public long b() {
            return readInt() & 4294967295L;
        }

        public void c(ByteOrder byteOrder) {
            this.f25369C = byteOrder;
        }

        public void d(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f25368B.skip(i12);
                if (iSkip <= 0) {
                    if (this.f25371E == null) {
                        this.f25371E = new byte[8192];
                    }
                    iSkip = this.f25368B.read(this.f25371E, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f25370D += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f25370D++;
            return this.f25368B.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f25370D++;
            return this.f25368B.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f25370D++;
            int i10 = this.f25368B.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f25370D += 2;
            return this.f25368B.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f25370D += i11;
            this.f25368B.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f25370D += 4;
            int i10 = this.f25368B.read();
            int i11 = this.f25368B.read();
            int i12 = this.f25368B.read();
            int i13 = this.f25368B.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f25369C;
            if (byteOrder == f25366F) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f25367G) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f25369C);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f25370D += 8;
            int i10 = this.f25368B.read();
            int i11 = this.f25368B.read();
            int i12 = this.f25368B.read();
            int i13 = this.f25368B.read();
            int i14 = this.f25368B.read();
            int i15 = this.f25368B.read();
            int i16 = this.f25368B.read();
            int i17 = this.f25368B.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f25369C;
            if (byteOrder == f25366F) {
                return (i17 << 56) + (i16 << 48) + (i15 << 40) + (i14 << 32) + (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f25367G) {
                return (i10 << 56) + (i11 << 48) + (i12 << 40) + (i13 << 32) + (i14 << 24) + (i15 << 16) + (i16 << 8) + i17;
            }
            throw new IOException("Invalid byte order: " + this.f25369C);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f25370D += 2;
            int i10 = this.f25368B.read();
            int i11 = this.f25368B.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f25369C;
            if (byteOrder == f25366F) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f25367G) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f25369C);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f25370D += 2;
            return this.f25368B.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f25370D++;
            return this.f25368B.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f25370D += 2;
            int i10 = this.f25368B.read();
            int i11 = this.f25368B.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f25369C;
            if (byteOrder == f25366F) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f25367G) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f25369C);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f25369C = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f25368B = dataInputStream;
            dataInputStream.mark(0);
            this.f25370D = 0;
            this.f25369C = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f25368B.read(bArr, i10, i11);
            this.f25370D += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f25370D += bArr.length;
            this.f25368B.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f25372a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25373b;

        /* renamed from: c, reason: collision with root package name */
        public final long f25374c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f25375d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f25330o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f25312W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f25312W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f25380a);
                byteBufferWrap.putInt((int) eVar.f25381b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f25312W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                if (((long[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                if (((int[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f25380a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f25381b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:17:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 436
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f25311V[this.f25372a] + ", data length:" + this.f25375d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f25372a = i10;
            this.f25373b = i11;
            this.f25374c = j10;
            this.f25375d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f25380a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25381b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f25380a = 0L;
                this.f25381b = 1L;
            } else {
                this.f25380a = j10;
                this.f25381b = j11;
            }
        }

        public double a() {
            return this.f25380a / this.f25381b;
        }

        public String toString() {
            return this.f25380a + "/" + this.f25381b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f25314Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f25315Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f25316a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f25317b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f25318c0 = dVarArr5;
        f25319d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f25320e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f25321f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f25322g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f25323h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f25324i0 = dVarArr10;
        f25325j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f25326k0 = new HashMap[dVarArr10.length];
        f25327l0 = new HashMap[dVarArr10.length];
        f25328m0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f25329n0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f25330o0 = charsetForName;
        f25331p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f25332q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f25309T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f25310U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f25324i0;
            if (i10 >= dVarArr11.length) {
                HashMap<Integer, Integer> map = f25329n0;
                d[] dVarArr12 = f25325j0;
                map.put(Integer.valueOf(dVarArr12[0].f25376a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f25376a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f25376a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f25376a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f25376a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f25376a), 8);
                f25333r0 = Pattern.compile(".*[1-9].*");
                f25334s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f25335t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f25337u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f25326k0[i10] = new HashMap<>();
            f25327l0[i10] = new HashMap<>();
            for (d dVar : dVarArr11[i10]) {
                f25326k0[i10].put(Integer.valueOf(dVar.f25376a), dVar);
                f25327l0[i10].put(dVar.f25377b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f25350h) <= 512 && cVar2.i(this.f25350h) <= 512;
    }

    private boolean B(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f25300K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f25301L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f25300K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void C(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = r0
        L4:
            androidx.exifinterface.media.a$d[][] r2 = androidx.exifinterface.media.a.f25324i0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$c>[] r2 = r4.f25348f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f25347e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.g(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f25346d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f25346d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = L(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            androidx.exifinterface.media.a$f r0 = new androidx.exifinterface.media.a$f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f25347e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.n(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f25346d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.e(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.h(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.k(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f25358p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.e(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.K(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f25346d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.f(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.o(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = androidx.exifinterface.media.a.f25336u
            if (r5 == 0) goto Lac
        L97:
            r4.E()
            goto Lac
        L9b:
            boolean r0 = androidx.exifinterface.media.a.f25336u     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.a()
            boolean r0 = androidx.exifinterface.media.a.f25336u
            if (r0 == 0) goto Lb7
            r4.E()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.C(java.io.InputStream):void");
    }

    private void D(b bVar) throws IOException {
        ByteOrder byteOrderF = F(bVar);
        this.f25350h = byteOrderF;
        bVar.c(byteOrderF);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f25346d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.d(i12);
        }
    }

    private void E() {
        for (int i10 = 0; i10 < this.f25348f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f25348f[i10].size());
            for (Map.Entry<String, c> entry : this.f25348f[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.f25350h) + "'");
            }
        }
    }

    private ByteOrder F(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f25336u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f25336u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void G(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        D(fVar);
        H(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(androidx.exifinterface.media.a.f r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.H(androidx.exifinterface.media.a$f, int):void");
    }

    private void I(int i10, String str, String str2) {
        if (this.f25348f[i10].isEmpty() || this.f25348f[i10].get(str) == null) {
            return;
        }
        HashMap<String, c> map = this.f25348f[i10];
        map.put(str2, map.get(str));
        this.f25348f[i10].remove(str);
    }

    private void J(f fVar, int i10) throws Throwable {
        c cVar = this.f25348f[i10].get("ImageLength");
        c cVar2 = this.f25348f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f25348f[i10].get("JPEGInterchangeFormat");
            c cVar4 = this.f25348f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f25350h);
            int i12 = cVar3.i(this.f25350h);
            fVar.e(i11);
            byte[] bArr = new byte[i12];
            fVar.read(bArr);
            f(new b(bArr), i11, i10);
        }
    }

    private void K(b bVar) throws Throwable {
        HashMap<String, c> map = this.f25348f[4];
        c cVar = map.get("Compression");
        if (cVar == null) {
            this.f25357o = 6;
            p(bVar, map);
            return;
        }
        int i10 = cVar.i(this.f25350h);
        this.f25357o = i10;
        if (i10 != 1) {
            if (i10 == 6) {
                p(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        if (z(map)) {
            q(bVar, map);
        }
    }

    private static boolean L(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void M(int i10, int i11) throws Throwable {
        if (this.f25348f[i10].isEmpty() || this.f25348f[i11].isEmpty()) {
            if (f25336u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = this.f25348f[i10].get("ImageLength");
        c cVar2 = this.f25348f[i10].get("ImageWidth");
        c cVar3 = this.f25348f[i11].get("ImageLength");
        c cVar4 = this.f25348f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f25336u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f25336u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = cVar.i(this.f25350h);
        int i13 = cVar2.i(this.f25350h);
        int i14 = cVar3.i(this.f25350h);
        int i15 = cVar4.i(this.f25350h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap<String, c>[] mapArr = this.f25348f;
        HashMap<String, c> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void N(f fVar, int i10) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = this.f25348f[i10].get("DefaultCropSize");
        c cVar2 = this.f25348f[i10].get("SensorTopBorder");
        c cVar3 = this.f25348f[i10].get("SensorLeftBorder");
        c cVar4 = this.f25348f[i10].get("SensorBottomBorder");
        c cVar5 = this.f25348f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                J(fVar, i10);
                return;
            }
            int i11 = cVar2.i(this.f25350h);
            int i12 = cVar4.i(this.f25350h);
            int i13 = cVar5.i(this.f25350h);
            int i14 = cVar3.i(this.f25350h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c cVarF3 = c.f(i12 - i11, this.f25350h);
            c cVarF4 = c.f(i13 - i14, this.f25350h);
            this.f25348f[i10].put("ImageLength", cVarF3);
            this.f25348f[i10].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f25372a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f25350h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f25350h);
            cVarF2 = c.d(eVarArr[1], this.f25350h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f25350h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f25350h);
            cVarF2 = c.f(iArr[1], this.f25350h);
        }
        this.f25348f[i10].put("ImageWidth", cVarF);
        this.f25348f[i10].put("ImageLength", cVarF2);
    }

    private void O() throws Throwable {
        M(0, 5);
        M(0, 4);
        M(5, 4);
        c cVar = this.f25348f[1].get("PixelXDimension");
        c cVar2 = this.f25348f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f25348f[0].put("ImageWidth", cVar);
            this.f25348f[0].put("ImageLength", cVar2);
        }
        if (this.f25348f[4].isEmpty() && A(this.f25348f[5])) {
            HashMap<String, c>[] mapArr = this.f25348f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!A(this.f25348f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        I(0, "ThumbnailOrientation", "Orientation");
        I(0, "ThumbnailImageLength", "ImageLength");
        I(0, "ThumbnailImageWidth", "ImageWidth");
        I(5, "ThumbnailOrientation", "Orientation");
        I(5, "ThumbnailImageLength", "ImageLength");
        I(5, "ThumbnailImageWidth", "ImageWidth");
        I(4, "Orientation", "ThumbnailOrientation");
        I(4, "ImageLength", "ThumbnailImageLength");
        I(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.f25348f[0].put("DateTime", c.a(strB));
        }
        if (b("ImageWidth") == null) {
            this.f25348f[0].put("ImageWidth", c.b(0L, this.f25350h));
        }
        if (b("ImageLength") == null) {
            this.f25348f[0].put("ImageLength", c.b(0L, this.f25350h));
        }
        if (b("Orientation") == null) {
            this.f25348f[0].put("Orientation", c.b(0L, this.f25350h));
        }
        if (b("LightSource") == null) {
            this.f25348f[1].put("LightSource", c.b(0L, this.f25350h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f25336u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f25324i0.length; i10++) {
            c cVar = this.f25348f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0357b.a(mediaMetadataRetriever, new C0356a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f25348f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f25350h));
                }
                if (strExtractMetadata2 != null) {
                    this.f25348f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata2), this.f25350h));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    this.f25348f[0].put("Orientation", c.f(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f25350h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.e(i11);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f25331p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (fVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f25358p = i13;
                    G(bArr2, 0);
                }
                if (f25336u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
    
        r22.c(r21.f25350h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b A[LOOP:0: B:10:0x0037->B:63:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(androidx.exifinterface.media.a.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.f(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (t(bArr)) {
            return 4;
        }
        if (w(bArr)) {
            return 9;
        }
        if (s(bArr)) {
            return 12;
        }
        if (u(bArr)) {
            return 7;
        }
        if (x(bArr)) {
            return 10;
        }
        if (v(bArr)) {
            return 13;
        }
        return B(bArr) ? 14 : 0;
    }

    private void h(f fVar) throws Throwable {
        int i10;
        int i11;
        k(fVar);
        c cVar = this.f25348f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f25375d);
            fVar2.c(this.f25350h);
            byte[] bArr = f25294E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.e(0L);
            byte[] bArr3 = f25295F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.e(12L);
            }
            H(fVar2, 6);
            c cVar2 = this.f25348f[7].get("PreviewImageStart");
            c cVar3 = this.f25348f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f25348f[5].put("JPEGInterchangeFormat", cVar2);
                this.f25348f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f25348f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f25350h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarF = c.f(i14, this.f25350h);
                c cVarF2 = c.f(i15, this.f25350h);
                this.f25348f[0].put("ImageWidth", cVarF);
                this.f25348f[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void i(b bVar) throws Throwable {
        if (f25336u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f25296G;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f25298I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f25299J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f25297H)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f25358p = i11;
                        G(bArr3, 0);
                        O();
                        K(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.d(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) throws Throwable {
        boolean z10 = f25336u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.d(i10 - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.d(i12 - bVar.a());
        bVar.c(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f25319d0.f25376a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarF = c.f(s10, this.f25350h);
                c cVarF2 = c.f(s11, this.f25350h);
                this.f25348f[0].put("ImageLength", cVarF);
                this.f25348f[0].put("ImageWidth", cVarF2);
                if (f25336u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.d(unsignedShort2);
        }
    }

    private void k(f fVar) throws Throwable {
        c cVar;
        D(fVar);
        H(fVar, 0);
        N(fVar, 0);
        N(fVar, 5);
        N(fVar, 4);
        O();
        if (this.f25346d != 8 || (cVar = this.f25348f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f25375d);
        fVar2.c(this.f25350h);
        fVar2.d(6);
        H(fVar2, 9);
        c cVar2 = this.f25348f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f25348f[1].put("ColorSpace", cVar2);
        }
    }

    private void m(f fVar) throws Throwable {
        if (f25336u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = this.f25348f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f25375d), (int) cVar.f25374c, 5);
        }
        c cVar2 = this.f25348f[0].get("ISO");
        c cVar3 = this.f25348f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f25348f[1].put("PhotographicSensitivity", cVar2);
    }

    private void n(f fVar) throws IOException {
        byte[] bArr = f25331p0;
        fVar.d(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f25358p = bArr.length;
        G(bArr2, 0);
    }

    private void o(b bVar) throws Throwable {
        if (f25336u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.d(f25300K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f25301L;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f25302M, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f25358p = i12;
                        G(bArr3, 0);
                        K(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f25350h);
        int i11 = cVar2.i(this.f25350h);
        if (this.f25346d == 7) {
            i10 += this.f25359q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f25351i = true;
            if (this.f25343a == null && this.f25345c == null && this.f25344b == null) {
                byte[] bArr = new byte[i11];
                bVar.skip(i10);
                bVar.read(bArr);
                this.f25356n = bArr;
            }
            this.f25354l = i10;
            this.f25355m = i11;
        }
        if (f25336u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    private void q(b bVar, HashMap map) {
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrB = androidx.exifinterface.media.b.b(cVar.k(this.f25350h));
        long[] jArrB2 = androidx.exifinterface.media.b.b(cVar2.k(this.f25350h));
        if (jArrB == null || jArrB.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrB2 == null || jArrB2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrB.length != jArrB2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrB2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f25353k = true;
        this.f25352j = true;
        this.f25351i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrB.length; i13++) {
            int i14 = (int) jArrB[i13];
            int i15 = (int) jArrB2[i13];
            if (i13 < jArrB.length - 1 && i14 + i15 != jArrB[i13 + 1]) {
                this.f25353k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f25356n = bArr;
        if (this.f25353k) {
            this.f25354l = (int) jArrB[0];
            this.f25355m = i10;
        }
    }

    private static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f25331p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f25331p0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean s(byte[] bArr) throws Throwable {
        b bVar;
        long length;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    length = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e10) {
                    e = e10;
                    bVar2 = bVar;
                    if (f25336u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (!Arrays.equals(bArr2, f25291B)) {
            bVar.close();
            return false;
        }
        if (length == 1) {
            length = bVar.readLong();
            j10 = 16;
            if (length < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        long j11 = length - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, f25292C)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, f25293D)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean t(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f25290A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean u(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderF = F(bVar);
            this.f25350h = byteOrderF;
            bVar.c(byteOrderF);
            short s10 = bVar.readShort();
            boolean z10 = s10 == 20306 || s10 == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean v(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f25296G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean w(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean x(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderF = F(bVar);
            this.f25350h = byteOrderF;
            bVar.c(byteOrderF);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean y(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f25336u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean z(HashMap map) {
        c cVar;
        int i10;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f25350h);
            int[] iArr2 = f25340x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f25346d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f25350h)) == 1 && Arrays.equals(iArr, f25342z)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f25336u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            if (!f25328m0.contains(str)) {
                return cVarD.j(this.f25350h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarD.f25372a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarD.f25372a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.k(this.f25350h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f25380a / eVar.f25381b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f25380a / eVar2.f25381b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f25380a / eVar3.f25381b)));
            }
            try {
                return Double.toString(cVarD.h(this.f25350h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD == null) {
            return i10;
        }
        try {
            return cVarD.i(this.f25350h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f25368B.mark(Integer.MAX_VALUE);
        }

        public void e(long j10) throws IOException {
            int i10 = this.f25370D;
            if (i10 > j10) {
                this.f25370D = 0;
                this.f25368B.reset();
            } else {
                j10 -= i10;
            }
            d((int) j10);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f25368B.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.a$d[][] r0 = androidx.exifinterface.media.a.f25324i0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f25348f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f25349g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f25350h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f25343a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.a.f25331p0
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = r(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L34:
            r3.f25347e = r1
            r3.f25345c = r0
            r3.f25344b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f25345c = r5
            r3.f25344b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = y(r1)
            if (r1 == 0) goto L62
            r3.f25345c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f25344b = r5
            goto L66
        L62:
            r3.f25345c = r0
            r3.f25344b = r0
        L66:
            r3.C(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.<init>(java.io.InputStream, int):void");
    }

    /* compiled from: ExifInterface.java */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f25376a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25377b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25378c;

        /* renamed from: d, reason: collision with root package name */
        public final int f25379d;

        d(String str, int i10, int i11) {
            this.f25377b = str;
            this.f25376a = i10;
            this.f25378c = i11;
            this.f25379d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f25378c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f25379d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f25377b = str;
            this.f25376a = i10;
            this.f25378c = i11;
            this.f25379d = i12;
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0356a extends MediaDataSource {

        /* renamed from: B, reason: collision with root package name */
        long f25363B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ f f25364C;

        C0356a(f fVar) {
            this.f25364C = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f25363B;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f25364C.available()) {
                        return -1;
                    }
                    this.f25364C.e(j10);
                    this.f25363B = j10;
                }
                if (i11 > this.f25364C.available()) {
                    i11 = this.f25364C.available();
                }
                int i12 = this.f25364C.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f25363B += i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f25363B = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
