package N2;

import S2.r;
import S2.s;
import U1.C1732h;
import U1.C1733i;
import U1.C1738n;
import X1.C1804a;
import X1.L;
import X1.n;
import X1.o;
import X1.y;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import v2.C4801g;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;
import v2.P;
import v2.r;
import v2.u;

/* compiled from: MatroskaExtractor.java */
/* loaded from: classes.dex */
public class e implements InterfaceC4810p {

    /* renamed from: e0, reason: collision with root package name */
    @Deprecated
    public static final u f12237e0 = new u() { // from class: N2.d
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return e.D();
        }
    };

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f12238f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f12239g0 = L.t0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f12240h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0, reason: collision with root package name */
    private static final byte[] f12241i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: j0, reason: collision with root package name */
    private static final UUID f12242j0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: k0, reason: collision with root package name */
    private static final Map<String, Integer> f12243k0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f12244A;

    /* renamed from: B, reason: collision with root package name */
    private long f12245B;

    /* renamed from: C, reason: collision with root package name */
    private long f12246C;

    /* renamed from: D, reason: collision with root package name */
    private long f12247D;

    /* renamed from: E, reason: collision with root package name */
    private o f12248E;

    /* renamed from: F, reason: collision with root package name */
    private o f12249F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f12250G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f12251H;

    /* renamed from: I, reason: collision with root package name */
    private int f12252I;

    /* renamed from: J, reason: collision with root package name */
    private long f12253J;

    /* renamed from: K, reason: collision with root package name */
    private long f12254K;

    /* renamed from: L, reason: collision with root package name */
    private int f12255L;

    /* renamed from: M, reason: collision with root package name */
    private int f12256M;

    /* renamed from: N, reason: collision with root package name */
    private int[] f12257N;

    /* renamed from: O, reason: collision with root package name */
    private int f12258O;

    /* renamed from: P, reason: collision with root package name */
    private int f12259P;

    /* renamed from: Q, reason: collision with root package name */
    private int f12260Q;

    /* renamed from: R, reason: collision with root package name */
    private int f12261R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f12262S;

    /* renamed from: T, reason: collision with root package name */
    private long f12263T;

    /* renamed from: U, reason: collision with root package name */
    private int f12264U;

    /* renamed from: V, reason: collision with root package name */
    private int f12265V;

    /* renamed from: W, reason: collision with root package name */
    private int f12266W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f12267X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f12268Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f12269Z;

    /* renamed from: a, reason: collision with root package name */
    private final N2.c f12270a;

    /* renamed from: a0, reason: collision with root package name */
    private int f12271a0;

    /* renamed from: b, reason: collision with root package name */
    private final g f12272b;

    /* renamed from: b0, reason: collision with root package name */
    private byte f12273b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f12274c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f12275c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12276d;

    /* renamed from: d0, reason: collision with root package name */
    private r f12277d0;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12278e;

    /* renamed from: f, reason: collision with root package name */
    private final r.a f12279f;

    /* renamed from: g, reason: collision with root package name */
    private final y f12280g;

    /* renamed from: h, reason: collision with root package name */
    private final y f12281h;

    /* renamed from: i, reason: collision with root package name */
    private final y f12282i;

    /* renamed from: j, reason: collision with root package name */
    private final y f12283j;

    /* renamed from: k, reason: collision with root package name */
    private final y f12284k;

    /* renamed from: l, reason: collision with root package name */
    private final y f12285l;

    /* renamed from: m, reason: collision with root package name */
    private final y f12286m;

    /* renamed from: n, reason: collision with root package name */
    private final y f12287n;

    /* renamed from: o, reason: collision with root package name */
    private final y f12288o;

    /* renamed from: p, reason: collision with root package name */
    private final y f12289p;

    /* renamed from: q, reason: collision with root package name */
    private ByteBuffer f12290q;

    /* renamed from: r, reason: collision with root package name */
    private long f12291r;

    /* renamed from: s, reason: collision with root package name */
    private long f12292s;

    /* renamed from: t, reason: collision with root package name */
    private long f12293t;

    /* renamed from: u, reason: collision with root package name */
    private long f12294u;

    /* renamed from: v, reason: collision with root package name */
    private long f12295v;

    /* renamed from: w, reason: collision with root package name */
    private c f12296w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12297x;

    /* renamed from: y, reason: collision with root package name */
    private int f12298y;

    /* renamed from: z, reason: collision with root package name */
    private long f12299z;

    /* compiled from: MatroskaExtractor.java */
    private final class b implements N2.b {
        private b() {
        }

        @Override // N2.b
        public void a(int i10) throws ParserException {
            e.this.r(i10);
        }

        @Override // N2.b
        public int b(int i10) {
            return e.this.x(i10);
        }

        @Override // N2.b
        public boolean c(int i10) {
            return e.this.C(i10);
        }

        @Override // N2.b
        public void d(int i10, String str) throws ParserException {
            e.this.K(i10, str);
        }

        @Override // N2.b
        public void e(int i10, double d10) {
            e.this.u(i10, d10);
        }

        @Override // N2.b
        public void f(int i10, int i11, InterfaceC4811q interfaceC4811q) throws ParserException {
            e.this.o(i10, i11, interfaceC4811q);
        }

        @Override // N2.b
        public void g(int i10, long j10, long j11) throws ParserException {
            e.this.J(i10, j10, j11);
        }

        @Override // N2.b
        public void h(int i10, long j10) throws ParserException {
            e.this.A(i10, j10);
        }
    }

    /* compiled from: MatroskaExtractor.java */
    protected static final class c {

        /* renamed from: O, reason: collision with root package name */
        public byte[] f12315O;

        /* renamed from: U, reason: collision with root package name */
        public P f12321U;

        /* renamed from: V, reason: collision with root package name */
        public boolean f12322V;

        /* renamed from: Y, reason: collision with root package name */
        public O f12325Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f12326Z;

        /* renamed from: a, reason: collision with root package name */
        public String f12327a;

        /* renamed from: b, reason: collision with root package name */
        public String f12328b;

        /* renamed from: c, reason: collision with root package name */
        public int f12329c;

        /* renamed from: d, reason: collision with root package name */
        public int f12330d;

        /* renamed from: e, reason: collision with root package name */
        public int f12331e;

        /* renamed from: f, reason: collision with root package name */
        public int f12332f;

        /* renamed from: g, reason: collision with root package name */
        private int f12333g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f12334h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f12335i;

        /* renamed from: j, reason: collision with root package name */
        public O.a f12336j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f12337k;

        /* renamed from: l, reason: collision with root package name */
        public C1738n f12338l;

        /* renamed from: m, reason: collision with root package name */
        public int f12339m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f12340n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f12341o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f12342p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f12343q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f12344r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f12345s = -1;

        /* renamed from: t, reason: collision with root package name */
        public float f12346t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f12347u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public float f12348v = 0.0f;

        /* renamed from: w, reason: collision with root package name */
        public byte[] f12349w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f12350x = -1;

        /* renamed from: y, reason: collision with root package name */
        public boolean f12351y = false;

        /* renamed from: z, reason: collision with root package name */
        public int f12352z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f12301A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f12302B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f12303C = 1000;

        /* renamed from: D, reason: collision with root package name */
        public int f12304D = 200;

        /* renamed from: E, reason: collision with root package name */
        public float f12305E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f12306F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f12307G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f12308H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f12309I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f12310J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f12311K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f12312L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f12313M = -1.0f;

        /* renamed from: N, reason: collision with root package name */
        public float f12314N = -1.0f;

        /* renamed from: P, reason: collision with root package name */
        public int f12316P = 1;

        /* renamed from: Q, reason: collision with root package name */
        public int f12317Q = -1;

        /* renamed from: R, reason: collision with root package name */
        public int f12318R = 8000;

        /* renamed from: S, reason: collision with root package name */
        public long f12319S = 0;

        /* renamed from: T, reason: collision with root package name */
        public long f12320T = 0;

        /* renamed from: W, reason: collision with root package name */
        public boolean f12323W = true;

        /* renamed from: X, reason: collision with root package name */
        private String f12324X = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            C1804a.e(this.f12325Y);
        }

        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f12337k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.f12305E == -1.0f || this.f12306F == -1.0f || this.f12307G == -1.0f || this.f12308H == -1.0f || this.f12309I == -1.0f || this.f12310J == -1.0f || this.f12311K == -1.0f || this.f12312L == -1.0f || this.f12313M == -1.0f || this.f12314N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f12305E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12306F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12307G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12308H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12309I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12310J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12311K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f12312L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f12313M + 0.5f));
            byteBufferOrder.putShort((short) (this.f12314N + 0.5f));
            byteBufferOrder.putShort((short) this.f12303C);
            byteBufferOrder.putShort((short) this.f12304D);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(y yVar) throws ParserException {
            try {
                yVar.X(16);
                long jX = yVar.x();
                if (jX == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jX != 826496599) {
                    n.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrE = yVar.e();
                for (int iF = yVar.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(y yVar) throws ParserException {
            try {
                int iZ = yVar.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ != 65534) {
                    return false;
                }
                yVar.W(24);
                if (yVar.A() == e.f12242j0.getMostSignificantBits()) {
                    if (yVar.A() == e.f12242j0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f12328b) ? z10 : this.f12332f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:211:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x045a  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0479  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x054d  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x05a4  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(v2.r r20, int r21) throws androidx.media3.common.ParserException {
            /*
                Method dump skipped, instructions count: 1722
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N2.e.c.i(v2.r, int):void");
        }

        public void j() {
            P p10 = this.f12321U;
            if (p10 != null) {
                p10.a(this.f12325Y, this.f12336j);
            }
        }

        public void n() {
            P p10 = this.f12321U;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f12243k0 = Collections.unmodifiableMap(map);
    }

    public e(r.a aVar, int i10) {
        this(new N2.a(), i10, aVar);
    }

    private static boolean B(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] D() {
        return new InterfaceC4810p[]{new e(r.a.f15292a, 2)};
    }

    private boolean E(I i10, long j10) {
        if (this.f12244A) {
            this.f12246C = j10;
            i10.f51048a = this.f12245B;
            this.f12244A = false;
            return true;
        }
        if (this.f12297x) {
            long j11 = this.f12246C;
            if (j11 != -1) {
                i10.f51048a = j11;
                this.f12246C = -1L;
                return true;
            }
        }
        return false;
    }

    private void F(InterfaceC4811q interfaceC4811q, int i10) {
        if (this.f12282i.g() >= i10) {
            return;
        }
        if (this.f12282i.b() < i10) {
            y yVar = this.f12282i;
            yVar.c(Math.max(yVar.b() * 2, i10));
        }
        interfaceC4811q.readFully(this.f12282i.e(), this.f12282i.g(), i10 - this.f12282i.g());
        this.f12282i.V(i10);
    }

    private void G() {
        this.f12264U = 0;
        this.f12265V = 0;
        this.f12266W = 0;
        this.f12267X = false;
        this.f12268Y = false;
        this.f12269Z = false;
        this.f12271a0 = 0;
        this.f12273b0 = (byte) 0;
        this.f12275c0 = false;
        this.f12285l.S(0);
    }

    private long H(long j10) throws ParserException {
        long j11 = this.f12293t;
        if (j11 != -9223372036854775807L) {
            return L.d1(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void I(String str, long j10, byte[] bArr) {
        byte[] bArrV;
        int i10;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                bArrV = v(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrV = v(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrV = v(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrV, 0, bArr, i10, bArrV.length);
    }

    private int L(InterfaceC4811q interfaceC4811q, c cVar, int i10, boolean z10) throws ParserException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f12328b)) {
            M(interfaceC4811q, f12238f0, i10);
            return t();
        }
        if ("S_TEXT/ASS".equals(cVar.f12328b)) {
            M(interfaceC4811q, f12240h0, i10);
            return t();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f12328b)) {
            M(interfaceC4811q, f12241i0, i10);
            return t();
        }
        O o10 = cVar.f12325Y;
        if (!this.f12267X) {
            if (cVar.f12334h) {
                this.f12260Q &= -1073741825;
                if (!this.f12268Y) {
                    interfaceC4811q.readFully(this.f12282i.e(), 0, 1);
                    this.f12264U++;
                    if ((this.f12282i.e()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f12273b0 = this.f12282i.e()[0];
                    this.f12268Y = true;
                }
                byte b10 = this.f12273b0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f12260Q |= 1073741824;
                    if (!this.f12275c0) {
                        interfaceC4811q.readFully(this.f12287n.e(), 0, 8);
                        this.f12264U += 8;
                        this.f12275c0 = true;
                        this.f12282i.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f12282i.W(0);
                        o10.b(this.f12282i, 1, 1);
                        this.f12265V++;
                        this.f12287n.W(0);
                        o10.b(this.f12287n, 8, 1);
                        this.f12265V += 8;
                    }
                    if (z11) {
                        if (!this.f12269Z) {
                            interfaceC4811q.readFully(this.f12282i.e(), 0, 1);
                            this.f12264U++;
                            this.f12282i.W(0);
                            this.f12271a0 = this.f12282i.H();
                            this.f12269Z = true;
                        }
                        int i12 = this.f12271a0 * 4;
                        this.f12282i.S(i12);
                        interfaceC4811q.readFully(this.f12282i.e(), 0, i12);
                        this.f12264U += i12;
                        short s10 = (short) ((this.f12271a0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f12290q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f12290q = ByteBuffer.allocate(i13);
                        }
                        this.f12290q.position(0);
                        this.f12290q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f12271a0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iL = this.f12282i.L();
                            if (i14 % 2 == 0) {
                                this.f12290q.putShort((short) (iL - i15));
                            } else {
                                this.f12290q.putInt(iL - i15);
                            }
                            i14++;
                            i15 = iL;
                        }
                        int i16 = (i10 - this.f12264U) - i15;
                        if (i11 % 2 == 1) {
                            this.f12290q.putInt(i16);
                        } else {
                            this.f12290q.putShort((short) i16);
                            this.f12290q.putInt(0);
                        }
                        this.f12288o.U(this.f12290q.array(), i13);
                        o10.b(this.f12288o, i13, 1);
                        this.f12265V += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f12335i;
                if (bArr != null) {
                    this.f12285l.U(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f12260Q |= 268435456;
                this.f12289p.S(0);
                int iG = (this.f12285l.g() + i10) - this.f12264U;
                this.f12282i.S(4);
                this.f12282i.e()[0] = (byte) ((iG >> 24) & 255);
                this.f12282i.e()[1] = (byte) ((iG >> 16) & 255);
                this.f12282i.e()[2] = (byte) ((iG >> 8) & 255);
                this.f12282i.e()[3] = (byte) (iG & 255);
                o10.b(this.f12282i, 4, 2);
                this.f12265V += 4;
            }
            this.f12267X = true;
        }
        int iG2 = i10 + this.f12285l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f12328b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f12328b)) {
            if (cVar.f12321U != null) {
                C1804a.g(this.f12285l.g() == 0);
                cVar.f12321U.d(interfaceC4811q);
            }
            while (true) {
                int i17 = this.f12264U;
                if (i17 >= iG2) {
                    break;
                }
                int iN = N(interfaceC4811q, o10, iG2 - i17);
                this.f12264U += iN;
                this.f12265V += iN;
            }
        } else {
            byte[] bArrE = this.f12281h.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.f12326Z;
            int i19 = 4 - i18;
            while (this.f12264U < iG2) {
                int i20 = this.f12266W;
                if (i20 == 0) {
                    O(interfaceC4811q, bArrE, i19, i18);
                    this.f12264U += i18;
                    this.f12281h.W(0);
                    this.f12266W = this.f12281h.L();
                    this.f12280g.W(0);
                    o10.d(this.f12280g, 4);
                    this.f12265V += 4;
                } else {
                    int iN2 = N(interfaceC4811q, o10, i20);
                    this.f12264U += iN2;
                    this.f12265V += iN2;
                    this.f12266W -= iN2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f12328b)) {
            this.f12283j.W(0);
            o10.d(this.f12283j, 4);
            this.f12265V += 4;
        }
        return t();
    }

    private void M(InterfaceC4811q interfaceC4811q, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f12286m.b() < length) {
            this.f12286m.T(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f12286m.e(), 0, bArr.length);
        }
        interfaceC4811q.readFully(this.f12286m.e(), bArr.length, i10);
        this.f12286m.W(0);
        this.f12286m.V(length);
    }

    private int N(InterfaceC4811q interfaceC4811q, O o10, int i10) {
        int iA = this.f12285l.a();
        if (iA <= 0) {
            return o10.c(interfaceC4811q, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o10.d(this.f12285l, iMin);
        return iMin;
    }

    private void O(InterfaceC4811q interfaceC4811q, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f12285l.a());
        interfaceC4811q.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f12285l.l(bArr, i10, iMin);
        }
    }

    private void l(int i10) throws ParserException {
        if (this.f12248E == null || this.f12249F == null) {
            throw ParserException.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void m(int i10) throws ParserException {
        if (this.f12296w != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void n() {
        C1804a.i(this.f12277d0);
    }

    private J p(o oVar, o oVar2) {
        int i10;
        if (this.f12292s == -1 || this.f12295v == -9223372036854775807L || oVar == null || oVar.d() == 0 || oVar2 == null || oVar2.d() != oVar.d()) {
            return new J.b(this.f12295v);
        }
        int iD = oVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = oVar.c(i12);
            jArrCopyOf[i12] = this.f12292s + oVar2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f12295v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f12292s + this.f12291r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f12295v - jArrCopyOf3[i14];
        if (i14 < i10) {
            n.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new C4801g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void q(c cVar, long j10, int i10, int i11, int i12) {
        P p10 = cVar.f12321U;
        if (p10 != null) {
            p10.c(cVar.f12325Y, j10, i10, i11, i12, cVar.f12336j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f12328b) || "S_TEXT/ASS".equals(cVar.f12328b) || "S_TEXT/WEBVTT".equals(cVar.f12328b)) {
                if (this.f12256M > 1) {
                    n.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f12254K;
                    if (j11 == -9223372036854775807L) {
                        n.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        I(cVar.f12328b, j11, this.f12286m.e());
                        int iF = this.f12286m.f();
                        while (true) {
                            if (iF >= this.f12286m.g()) {
                                break;
                            }
                            if (this.f12286m.e()[iF] == 0) {
                                this.f12286m.V(iF);
                                break;
                            }
                            iF++;
                        }
                        O o10 = cVar.f12325Y;
                        y yVar = this.f12286m;
                        o10.d(yVar, yVar.g());
                        i11 += this.f12286m.g();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.f12256M > 1) {
                    this.f12289p.S(0);
                } else {
                    int iG = this.f12289p.g();
                    cVar.f12325Y.b(this.f12289p, iG, 2);
                    i11 += iG;
                }
            }
            cVar.f12325Y.e(j10, i10, i11, i12, cVar.f12336j);
        }
        this.f12251H = true;
    }

    private static int[] s(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int t() {
        int i10 = this.f12265V;
        G();
        return i10;
    }

    private static byte[] v(long j10, String str, long j11) {
        C1804a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return L.t0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    protected void A(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw ParserException.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw ParserException.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                w(i10).f12330d = (int) j10;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                w(i10).f12323W = j10 == 1;
                return;
            case 155:
                this.f12254K = H(j10);
                return;
            case 159:
                w(i10).f12316P = (int) j10;
                return;
            case 176:
                w(i10).f12339m = (int) j10;
                return;
            case 179:
                l(i10);
                this.f12248E.a(H(j10));
                return;
            case 186:
                w(i10).f12340n = (int) j10;
                return;
            case 215:
                w(i10).f12329c = (int) j10;
                return;
            case 231:
                this.f12247D = H(j10);
                return;
            case 238:
                this.f12261R = (int) j10;
                return;
            case 241:
                if (this.f12250G) {
                    return;
                }
                l(i10);
                this.f12249F.a(j10);
                this.f12250G = true;
                return;
            case 251:
                this.f12262S = true;
                return;
            case 16871:
                w(i10).f12333g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw ParserException.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw ParserException.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw ParserException.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f12299z = j10 + this.f12292s;
                return;
            case 21432:
                int i11 = (int) j10;
                m(i10);
                if (i11 == 0) {
                    this.f12296w.f12350x = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f12296w.f12350x = 2;
                    return;
                } else if (i11 == 3) {
                    this.f12296w.f12350x = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f12296w.f12350x = 3;
                    return;
                }
            case 21680:
                w(i10).f12342p = (int) j10;
                return;
            case 21682:
                w(i10).f12344r = (int) j10;
                return;
            case 21690:
                w(i10).f12343q = (int) j10;
                return;
            case 21930:
                w(i10).f12322V = j10 == 1;
                return;
            case 21938:
                m(i10);
                c cVar = this.f12296w;
                cVar.f12351y = true;
                cVar.f12341o = (int) j10;
                return;
            case 21998:
                w(i10).f12332f = (int) j10;
                return;
            case 22186:
                w(i10).f12319S = j10;
                return;
            case 22203:
                w(i10).f12320T = j10;
                return;
            case 25188:
                w(i10).f12317Q = (int) j10;
                return;
            case 30114:
                this.f12263T = j10;
                return;
            case 30321:
                m(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f12296w.f12345s = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f12296w.f12345s = 1;
                    return;
                } else if (i12 == 2) {
                    this.f12296w.f12345s = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f12296w.f12345s = 3;
                    return;
                }
            case 2352003:
                w(i10).f12331e = (int) j10;
                return;
            case 2807729:
                this.f12293t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        m(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f12296w.f12302B = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f12296w.f12302B = 1;
                            return;
                        }
                    case 21946:
                        m(i10);
                        int iK = C1733i.k((int) j10);
                        if (iK != -1) {
                            this.f12296w.f12301A = iK;
                            return;
                        }
                        return;
                    case 21947:
                        m(i10);
                        this.f12296w.f12351y = true;
                        int iJ = C1733i.j((int) j10);
                        if (iJ != -1) {
                            this.f12296w.f12352z = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        w(i10).f12303C = (int) j10;
                        return;
                    case 21949:
                        w(i10).f12304D = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean C(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    protected void J(int i10, long j10, long j11) throws ParserException {
        n();
        if (i10 == 160) {
            this.f12262S = false;
            this.f12263T = 0L;
            return;
        }
        if (i10 == 174) {
            this.f12296w = new c();
            return;
        }
        if (i10 == 187) {
            this.f12250G = false;
            return;
        }
        if (i10 == 19899) {
            this.f12298y = -1;
            this.f12299z = -1L;
            return;
        }
        if (i10 == 20533) {
            w(i10).f12334h = true;
            return;
        }
        if (i10 == 21968) {
            w(i10).f12351y = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f12292s;
            if (j12 != -1 && j12 != j10) {
                throw ParserException.a("Multiple Segment elements not supported", null);
            }
            this.f12292s = j10;
            this.f12291r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f12248E = new o();
            this.f12249F = new o();
        } else if (i10 == 524531317 && !this.f12297x) {
            if (this.f12276d && this.f12245B != -1) {
                this.f12244A = true;
            } else {
                this.f12277d0.f(new J.b(this.f12295v));
                this.f12297x = true;
            }
        }
    }

    protected void K(int i10, String str) throws ParserException {
        if (i10 == 134) {
            w(i10).f12328b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                w(i10).f12327a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                w(i10).f12324X = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f12247D = -9223372036854775807L;
        this.f12252I = 0;
        this.f12270a.b();
        this.f12272b.e();
        G();
        for (int i10 = 0; i10 < this.f12274c.size(); i10++) {
            this.f12274c.valueAt(i10).n();
        }
    }

    @Override // v2.InterfaceC4810p
    public final boolean d(InterfaceC4811q interfaceC4811q) {
        return new f().b(interfaceC4811q);
    }

    @Override // v2.InterfaceC4810p
    public final void h(v2.r rVar) {
        if (this.f12278e) {
            rVar = new s(rVar, this.f12279f);
        }
        this.f12277d0 = rVar;
    }

    @Override // v2.InterfaceC4810p
    public final int i(InterfaceC4811q interfaceC4811q, I i10) {
        this.f12251H = false;
        boolean zD = true;
        while (zD && !this.f12251H) {
            zD = this.f12270a.d(interfaceC4811q);
            if (zD && E(i10, interfaceC4811q.getPosition())) {
                return 1;
            }
        }
        if (zD) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f12274c.size(); i11++) {
            c cVarValueAt = this.f12274c.valueAt(i11);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
    
        throw androidx.media3.common.ParserException.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void o(int r22, int r23, v2.InterfaceC4811q r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.e.o(int, int, v2.q):void");
    }

    protected void r(int i10) throws ParserException {
        n();
        if (i10 == 160) {
            if (this.f12252I != 2) {
                return;
            }
            c cVar = this.f12274c.get(this.f12258O);
            cVar.f();
            if (this.f12263T > 0 && "A_OPUS".equals(cVar.f12328b)) {
                this.f12289p.T(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f12263T).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f12256M; i12++) {
                i11 += this.f12257N[i12];
            }
            int i13 = 0;
            while (i13 < this.f12256M) {
                long j10 = this.f12253J + ((cVar.f12331e * i13) / 1000);
                int i14 = this.f12260Q;
                if (i13 == 0 && !this.f12262S) {
                    i14 |= 1;
                }
                int i15 = this.f12257N[i13];
                int i16 = i11 - i15;
                q(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f12252I = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) C1804a.i(this.f12296w);
            String str = cVar2.f12328b;
            if (str == null) {
                throw ParserException.a("CodecId is missing in TrackEntry element", null);
            }
            if (B(str)) {
                cVar2.i(this.f12277d0, cVar2.f12329c);
                this.f12274c.put(cVar2.f12329c, cVar2);
            }
            this.f12296w = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f12298y;
            if (i17 != -1) {
                long j11 = this.f12299z;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f12245B = j11;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            m(i10);
            c cVar3 = this.f12296w;
            if (cVar3.f12334h) {
                if (cVar3.f12336j == null) {
                    throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f12338l = new C1738n(new C1738n.b(C1732h.f17047a, "video/webm", this.f12296w.f12336j.f51066b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            m(i10);
            c cVar4 = this.f12296w;
            if (cVar4.f12334h && cVar4.f12335i != null) {
                throw ParserException.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f12293t == -9223372036854775807L) {
                this.f12293t = 1000000L;
            }
            long j12 = this.f12294u;
            if (j12 != -9223372036854775807L) {
                this.f12295v = H(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f12274c.size() == 0) {
                throw ParserException.a("No valid tracks were found", null);
            }
            this.f12277d0.n();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f12297x) {
                this.f12277d0.f(p(this.f12248E, this.f12249F));
                this.f12297x = true;
            }
            this.f12248E = null;
            this.f12249F = null;
        }
    }

    protected void u(int i10, double d10) {
        if (i10 == 181) {
            w(i10).f12318R = (int) d10;
        }
        if (i10 == 17545) {
            this.f12294u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                w(i10).f12305E = (float) d10;
                break;
            case 21970:
                w(i10).f12306F = (float) d10;
                break;
            case 21971:
                w(i10).f12307G = (float) d10;
                break;
            case 21972:
                w(i10).f12308H = (float) d10;
                break;
            case 21973:
                w(i10).f12309I = (float) d10;
                break;
            case 21974:
                w(i10).f12310J = (float) d10;
                break;
            case 21975:
                w(i10).f12311K = (float) d10;
                break;
            case 21976:
                w(i10).f12312L = (float) d10;
                break;
            case 21977:
                w(i10).f12313M = (float) d10;
                break;
            case 21978:
                w(i10).f12314N = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        w(i10).f12346t = (float) d10;
                        break;
                    case 30324:
                        w(i10).f12347u = (float) d10;
                        break;
                    case 30325:
                        w(i10).f12348v = (float) d10;
                        break;
                }
        }
    }

    protected c w(int i10) throws ParserException {
        m(i10);
        return this.f12296w;
    }

    protected int x(int i10) {
        switch (i10) {
            case 131:
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void y(c cVar, InterfaceC4811q interfaceC4811q, int i10) {
        if (cVar.f12333g != 1685485123 && cVar.f12333g != 1685480259) {
            interfaceC4811q.n(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f12315O = bArr;
        interfaceC4811q.readFully(bArr, 0, i10);
    }

    protected void z(c cVar, int i10, InterfaceC4811q interfaceC4811q, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f12328b)) {
            interfaceC4811q.n(i11);
        } else {
            this.f12289p.S(i11);
            interfaceC4811q.readFully(this.f12289p.e(), 0, i11);
        }
    }

    e(N2.c cVar, int i10, r.a aVar) {
        this.f12292s = -1L;
        this.f12293t = -9223372036854775807L;
        this.f12294u = -9223372036854775807L;
        this.f12295v = -9223372036854775807L;
        this.f12245B = -1L;
        this.f12246C = -1L;
        this.f12247D = -9223372036854775807L;
        this.f12270a = cVar;
        cVar.e(new b());
        this.f12279f = aVar;
        this.f12276d = (i10 & 1) == 0;
        this.f12278e = (i10 & 2) == 0;
        this.f12272b = new g();
        this.f12274c = new SparseArray<>();
        this.f12282i = new y(4);
        this.f12283j = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f12284k = new y(4);
        this.f12280g = new y(Y1.e.f19226a);
        this.f12281h = new y(4);
        this.f12285l = new y();
        this.f12286m = new y();
        this.f12287n = new y(8);
        this.f12288o = new y();
        this.f12289p = new y();
        this.f12257N = new int[1];
    }

    @Override // v2.InterfaceC4810p
    public final void c() {
    }
}
