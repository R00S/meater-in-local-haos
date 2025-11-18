package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzne;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzod implements zznn {

    /* renamed from: a */
    private static final zznq f26662a = new t10();

    /* renamed from: b */
    private static final byte[] f26663b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c */
    private static final byte[] f26664c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: d */
    private static final UUID f26665d = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f26666A;

    /* renamed from: B */
    private boolean f26667B;

    /* renamed from: C */
    private long f26668C;

    /* renamed from: D */
    private long f26669D;

    /* renamed from: E */
    private long f26670E;

    /* renamed from: F */
    private zzsn f26671F;

    /* renamed from: G */
    private zzsn f26672G;

    /* renamed from: H */
    private boolean f26673H;

    /* renamed from: I */
    private int f26674I;

    /* renamed from: J */
    private long f26675J;

    /* renamed from: K */
    private long f26676K;

    /* renamed from: L */
    private int f26677L;

    /* renamed from: M */
    private int f26678M;

    /* renamed from: N */
    private int[] f26679N;

    /* renamed from: O */
    private int f26680O;

    /* renamed from: P */
    private int f26681P;

    /* renamed from: Q */
    private int f26682Q;

    /* renamed from: R */
    private int f26683R;

    /* renamed from: S */
    private boolean f26684S;

    /* renamed from: T */
    private boolean f26685T;

    /* renamed from: U */
    private boolean f26686U;

    /* renamed from: V */
    private boolean f26687V;

    /* renamed from: W */
    private byte f26688W;

    /* renamed from: X */
    private int f26689X;

    /* renamed from: Y */
    private int f26690Y;

    /* renamed from: Z */
    private int f26691Z;

    /* renamed from: a0 */
    private boolean f26692a0;

    /* renamed from: b0 */
    private boolean f26693b0;

    /* renamed from: c0 */
    private zznp f26694c0;

    /* renamed from: e */
    private final r10 f26695e;

    /* renamed from: f */
    private final x10 f26696f;

    /* renamed from: g */
    private final SparseArray<v10> f26697g;

    /* renamed from: h */
    private final boolean f26698h;

    /* renamed from: i */
    private final zzst f26699i;

    /* renamed from: j */
    private final zzst f26700j;

    /* renamed from: k */
    private final zzst f26701k;

    /* renamed from: l */
    private final zzst f26702l;

    /* renamed from: m */
    private final zzst f26703m;

    /* renamed from: n */
    private final zzst f26704n;

    /* renamed from: o */
    private final zzst f26705o;

    /* renamed from: p */
    private final zzst f26706p;

    /* renamed from: q */
    private final zzst f26707q;

    /* renamed from: r */
    private ByteBuffer f26708r;

    /* renamed from: s */
    private long f26709s;

    /* renamed from: t */
    private long f26710t;

    /* renamed from: u */
    private long f26711u;

    /* renamed from: v */
    private long f26712v;

    /* renamed from: w */
    private long f26713w;

    /* renamed from: x */
    private v10 f26714x;

    /* renamed from: y */
    private boolean f26715y;

    /* renamed from: z */
    private int f26716z;

    public zzod() {
        this(0);
    }

    /* renamed from: a */
    private final int m20341a(zzno zznoVar, zznw zznwVar, int i2) throws InterruptedException, IOException {
        int iMo20340d;
        int iM20520u = this.f26704n.m20520u();
        if (iM20520u > 0) {
            iMo20340d = Math.min(i2, iM20520u);
            zznwVar.mo20338b(this.f26704n, iMo20340d);
        } else {
            iMo20340d = zznwVar.mo20340d(zznoVar, i2, false);
        }
        this.f26683R += iMo20340d;
        this.f26691Z += iMo20340d;
        return iMo20340d;
    }

    /* renamed from: j */
    private final void m20342j(zzno zznoVar, v10 v10Var, int i2) throws InterruptedException, IOException {
        int i3;
        if ("S_TEXT/UTF8".equals(v10Var.f20684a)) {
            byte[] bArr = f26663b;
            int length = bArr.length + i2;
            if (this.f26705o.m20500a() < length) {
                this.f26705o.f27013a = Arrays.copyOf(bArr, length + i2);
            }
            zznoVar.readFully(this.f26705o.f27013a, bArr.length, i2);
            this.f26705o.m20510k(0);
            this.f26705o.m20514o(length);
            return;
        }
        zznw zznwVar = v10Var.f20682O;
        if (!this.f26684S) {
            if (v10Var.f20688e) {
                this.f26682Q &= -1073741825;
                if (!this.f26685T) {
                    zznoVar.readFully(this.f26701k.f27013a, 0, 1);
                    this.f26683R++;
                    byte[] bArr2 = this.f26701k.f27013a;
                    if ((bArr2[0] & 128) == 128) {
                        throw new zzlm("Extension bit is set in signal byte");
                    }
                    this.f26688W = bArr2[0];
                    this.f26685T = true;
                }
                byte b2 = this.f26688W;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.f26682Q |= 1073741824;
                    if (!this.f26686U) {
                        zznoVar.readFully(this.f26706p.f27013a, 0, 8);
                        this.f26683R += 8;
                        this.f26686U = true;
                        zzst zzstVar = this.f26701k;
                        zzstVar.f27013a[0] = (byte) ((z ? 128 : 0) | 8);
                        zzstVar.m20510k(0);
                        zznwVar.mo20338b(this.f26701k, 1);
                        this.f26691Z++;
                        this.f26706p.m20510k(0);
                        zznwVar.mo20338b(this.f26706p, 8);
                        this.f26691Z += 8;
                    }
                    if (z) {
                        if (!this.f26687V) {
                            zznoVar.readFully(this.f26701k.f27013a, 0, 1);
                            this.f26683R++;
                            this.f26701k.m20510k(0);
                            this.f26689X = this.f26701k.m20506g();
                            this.f26687V = true;
                        }
                        int i4 = this.f26689X << 2;
                        this.f26701k.m20509j(i4);
                        zznoVar.readFully(this.f26701k.f27013a, 0, i4);
                        this.f26683R += i4;
                        short s = (short) ((this.f26689X / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f26708r;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f26708r = ByteBuffer.allocate(i5);
                        }
                        this.f26708r.position(0);
                        this.f26708r.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i3 = this.f26689X;
                            if (i6 >= i3) {
                                break;
                            }
                            int iM20518s = this.f26701k.m20518s();
                            if (i6 % 2 == 0) {
                                this.f26708r.putShort((short) (iM20518s - i7));
                            } else {
                                this.f26708r.putInt(iM20518s - i7);
                            }
                            i6++;
                            i7 = iM20518s;
                        }
                        int i8 = (i2 - this.f26683R) - i7;
                        if (i3 % 2 == 1) {
                            this.f26708r.putInt(i8);
                        } else {
                            this.f26708r.putShort((short) i8);
                            this.f26708r.putInt(0);
                        }
                        this.f26707q.m20512m(this.f26708r.array(), i5);
                        zznwVar.mo20338b(this.f26707q, i5);
                        this.f26691Z += i5;
                    }
                }
            } else {
                byte[] bArr3 = v10Var.f20689f;
                if (bArr3 != null) {
                    this.f26704n.m20512m(bArr3, bArr3.length);
                }
            }
            this.f26684S = true;
        }
        int iM20502c = i2 + this.f26704n.m20502c();
        if (!"V_MPEG4/ISO/AVC".equals(v10Var.f20684a) && !"V_MPEGH/ISO/HEVC".equals(v10Var.f20684a)) {
            while (true) {
                int i9 = this.f26683R;
                if (i9 >= iM20502c) {
                    break;
                } else {
                    m20341a(zznoVar, zznwVar, iM20502c - i9);
                }
            }
        } else {
            byte[] bArr4 = this.f26700j.f27013a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i10 = v10Var.f20683P;
            int i11 = 4 - i10;
            while (this.f26683R < iM20502c) {
                int i12 = this.f26690Y;
                if (i12 == 0) {
                    int iMin = Math.min(i10, this.f26704n.m20520u());
                    zznoVar.readFully(bArr4, i11 + iMin, i10 - iMin);
                    if (iMin > 0) {
                        this.f26704n.m20513n(bArr4, i11, iMin);
                    }
                    this.f26683R += i10;
                    this.f26700j.m20510k(0);
                    this.f26690Y = this.f26700j.m20518s();
                    this.f26699i.m20510k(0);
                    zznwVar.mo20338b(this.f26699i, 4);
                    this.f26691Z += 4;
                } else {
                    this.f26690Y = i12 - m20341a(zznoVar, zznwVar, i12);
                }
            }
        }
        if ("A_VORBIS".equals(v10Var.f20684a)) {
            this.f26702l.m20510k(0);
            zznwVar.mo20338b(this.f26702l, 4);
            this.f26691Z += 4;
        }
    }

    /* renamed from: k */
    private final void m20343k(v10 v10Var, long j2) {
        byte[] bArrM20549m;
        if ("S_TEXT/UTF8".equals(v10Var.f20684a)) {
            byte[] bArr = this.f26705o.f27013a;
            long j3 = this.f26676K;
            if (j3 == -9223372036854775807L) {
                bArrM20549m = f26664c;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (i2 * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - (60000000 * i3);
                bArrM20549m = zzsy.m20549m(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j5 / 1000000)), Integer.valueOf((int) ((j5 - (1000000 * r4)) / 1000))));
            }
            System.arraycopy(bArrM20549m, 0, bArr, 19, 12);
            zznw zznwVar = v10Var.f20682O;
            zzst zzstVar = this.f26705o;
            zznwVar.mo20338b(zzstVar, zzstVar.m20502c());
            this.f26691Z += this.f26705o.m20502c();
        }
        v10Var.f20682O.mo20339c(j2, this.f26682Q, this.f26691Z, 0, v10Var.f20690g);
        this.f26692a0 = true;
        m20348r();
    }

    /* renamed from: l */
    private static int[] m20344l(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length << 1, i2)];
    }

    /* renamed from: m */
    static boolean m20345m(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    /* renamed from: o */
    private final void m20346o(zzno zznoVar, int i2) throws InterruptedException, IOException {
        if (this.f26701k.m20502c() >= i2) {
            return;
        }
        if (this.f26701k.m20500a() < i2) {
            zzst zzstVar = this.f26701k;
            byte[] bArr = zzstVar.f27013a;
            zzstVar.m20512m(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i2)), this.f26701k.m20502c());
        }
        zzst zzstVar2 = this.f26701k;
        zznoVar.readFully(zzstVar2.f27013a, zzstVar2.m20502c(), i2 - this.f26701k.m20502c());
        this.f26701k.m20514o(i2);
    }

    /* renamed from: q */
    private final long m20347q(long j2) throws zzlm {
        long j3 = this.f26711u;
        if (j3 != -9223372036854775807L) {
            return zzsy.m20539c(j2, j3, 1000L);
        }
        throw new zzlm("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: r */
    private final void m20348r() {
        this.f26683R = 0;
        this.f26691Z = 0;
        this.f26690Y = 0;
        this.f26684S = false;
        this.f26685T = false;
        this.f26687V = false;
        this.f26689X = 0;
        this.f26688W = (byte) 0;
        this.f26686U = false;
        this.f26704n.m20508i();
    }

    /* renamed from: t */
    static int m20350t(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
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
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    final void m20351b(int i2, double d2) {
        if (i2 == 181) {
            this.f26714x.f20676I = (int) d2;
            return;
        }
        if (i2 == 17545) {
            this.f26712v = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                this.f26714x.f20706w = (float) d2;
                break;
            case 21970:
                this.f26714x.f20707x = (float) d2;
                break;
            case 21971:
                this.f26714x.f20708y = (float) d2;
                break;
            case 21972:
                this.f26714x.f20709z = (float) d2;
                break;
            case 21973:
                this.f26714x.f20668A = (float) d2;
                break;
            case 21974:
                this.f26714x.f20669B = (float) d2;
                break;
            case 21975:
                this.f26714x.f20670C = (float) d2;
                break;
            case 21976:
                this.f26714x.f20671D = (float) d2;
                break;
            case 21977:
                this.f26714x.f20672E = (float) d2;
                break;
            case 21978:
                this.f26714x.f20673F = (float) d2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: c */
    public final void mo20329c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo20330d(com.google.android.gms.internal.ads.zzno r9, com.google.android.gms.internal.ads.zznt r10) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r8.f26692a0 = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.f26692a0
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.r10 r2 = r8.f26695e
            boolean r2 = r2.mo15668c(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.f26667B
            if (r5 == 0) goto L25
            r8.f26669D = r3
            long r3 = r8.f26668C
            r10.f26658a = r3
            r8.f26667B = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.f26715y
            if (r3 == 0) goto L36
            long r3 = r8.f26669D
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.f26658a = r3
            r8.f26669D = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.mo20330d(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: e */
    public final void mo20331e(zznp zznpVar) {
        this.f26694c0 = zznpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ee, code lost:
    
        throw new com.google.android.gms.internal.ads.zzlm("EBML lacing sample size out of range.");
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m20352f(int r20, int r21, com.google.android.gms.internal.ads.zzno r22) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.m20352f(int, int, com.google.android.gms.internal.ads.zzno):void");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: g */
    public final boolean mo20332g(zzno zznoVar) throws InterruptedException, IOException {
        return new w10().m15976a(zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: h */
    public final void mo20333h(long j2, long j3) {
        this.f26670E = -9223372036854775807L;
        this.f26674I = 0;
        this.f26695e.mo15666a();
        this.f26696f.m16004a();
        m20348r();
    }

    /* renamed from: i */
    final void m20353i(int i2, String str) throws zzlm {
        if (i2 == 134) {
            this.f26714x.f20684a = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 != 2274716) {
                return;
            }
            this.f26714x.f20681N = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzlm(sb.toString());
        }
    }

    /* renamed from: n */
    final void m20354n(int i2, long j2, long j3) throws zzlm {
        if (i2 == 160) {
            this.f26693b0 = false;
            return;
        }
        if (i2 == 174) {
            this.f26714x = new v10(null);
            return;
        }
        if (i2 == 187) {
            this.f26673H = false;
            return;
        }
        if (i2 == 19899) {
            this.f26716z = -1;
            this.f26666A = -1L;
            return;
        }
        if (i2 == 20533) {
            this.f26714x.f20688e = true;
            return;
        }
        if (i2 == 21968) {
            this.f26714x.f20700q = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.f26710t;
            if (j4 != -1 && j4 != j2) {
                throw new zzlm("Multiple Segment elements not supported");
            }
            this.f26710t = j2;
            this.f26709s = j3;
            return;
        }
        if (i2 == 475249515) {
            this.f26671F = new zzsn();
            this.f26672G = new zzsn();
        } else if (i2 == 524531317 && !this.f26715y) {
            if (this.f26698h && this.f26668C != -1) {
                this.f26667B = true;
            } else {
                this.f26694c0.mo16033z(new zznv(this.f26713w));
                this.f26715y = true;
            }
        }
    }

    /* renamed from: p */
    final void m20355p(int i2, long j2) throws zzlm {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw new zzlm(sb.toString());
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw new zzlm(sb2.toString());
        }
        switch (i2) {
            case 131:
                this.f26714x.f20686c = (int) j2;
                return;
            case 136:
                this.f26714x.f20679L = j2 == 1;
                return;
            case 155:
                this.f26676K = m20347q(j2);
                return;
            case 159:
                this.f26714x.f20674G = (int) j2;
                return;
            case 176:
                this.f26714x.f20693j = (int) j2;
                return;
            case 179:
                this.f26671F.m20491a(m20347q(j2));
                return;
            case 186:
                this.f26714x.f20694k = (int) j2;
                return;
            case 215:
                this.f26714x.f20685b = (int) j2;
                return;
            case 231:
                this.f26670E = m20347q(j2);
                return;
            case 241:
                if (this.f26673H) {
                    return;
                }
                this.f26672G.m20491a(j2);
                this.f26673H = true;
                return;
            case 251:
                this.f26693b0 = true;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new zzlm(sb3.toString());
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw new zzlm(sb4.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new zzlm(sb5.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new zzlm(sb6.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new zzlm(sb7.toString());
            case 21420:
                this.f26666A = j2 + this.f26710t;
                return;
            case 21432:
                int i3 = (int) j2;
                if (i3 == 0) {
                    this.f26714x.f20699p = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f26714x.f20699p = 2;
                    return;
                } else if (i3 == 3) {
                    this.f26714x.f20699p = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.f26714x.f20699p = 3;
                    return;
                }
            case 21680:
                this.f26714x.f20695l = (int) j2;
                return;
            case 21682:
                this.f26714x.f20697n = (int) j2;
                return;
            case 21690:
                this.f26714x.f20696m = (int) j2;
                return;
            case 21930:
                this.f26714x.f20680M = j2 == 1;
                return;
            case 22186:
                this.f26714x.f20677J = j2;
                return;
            case 22203:
                this.f26714x.f20678K = j2;
                return;
            case 25188:
                this.f26714x.f20675H = (int) j2;
                return;
            case 2352003:
                this.f26714x.f20687d = (int) j2;
                return;
            case 2807729:
                this.f26711u = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i4 = (int) j2;
                        if (i4 == 1) {
                            this.f26714x.f20703t = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f26714x.f20703t = 1;
                            return;
                        }
                    case 21946:
                        int i5 = (int) j2;
                        if (i5 != 1) {
                            if (i5 == 16) {
                                this.f26714x.f20702s = 6;
                                return;
                            } else if (i5 == 18) {
                                this.f26714x.f20702s = 7;
                                return;
                            } else if (i5 != 6 && i5 != 7) {
                                return;
                            }
                        }
                        this.f26714x.f20702s = 3;
                        return;
                    case 21947:
                        v10 v10Var = this.f26714x;
                        v10Var.f20700q = true;
                        int i6 = (int) j2;
                        if (i6 == 1) {
                            v10Var.f20701r = 1;
                            return;
                        }
                        if (i6 == 9) {
                            v10Var.f20701r = 6;
                            return;
                        } else {
                            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                v10Var.f20701r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.f26714x.f20704u = (int) j2;
                        return;
                    case 21949:
                        this.f26714x.f20705v = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: u */
    final void m20356u(int i2) throws zzlm {
        zznu zznvVar;
        zzsn zzsnVar;
        zzsn zzsnVar2;
        int i3;
        if (i2 == 160) {
            if (this.f26674I != 2) {
                return;
            }
            if (!this.f26693b0) {
                this.f26682Q |= 1;
            }
            m20343k(this.f26697g.get(this.f26680O), this.f26675J);
            this.f26674I = 0;
            return;
        }
        if (i2 == 174) {
            String str = this.f26714x.f20684a;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 0) != 0) {
                v10 v10Var = this.f26714x;
                v10Var.m15950c(this.f26694c0, v10Var.f20685b);
                SparseArray<v10> sparseArray = this.f26697g;
                v10 v10Var2 = this.f26714x;
                sparseArray.put(v10Var2.f20685b, v10Var2);
            }
            this.f26714x = null;
            return;
        }
        if (i2 == 19899) {
            int i4 = this.f26716z;
            if (i4 != -1) {
                long j2 = this.f26666A;
                if (j2 != -1) {
                    if (i4 == 475249515) {
                        this.f26668C = j2;
                        return;
                    }
                    return;
                }
            }
            throw new zzlm("Mandatory element SeekID or SeekPosition not found");
        }
        if (i2 == 25152) {
            v10 v10Var3 = this.f26714x;
            if (v10Var3.f20688e) {
                if (v10Var3.f20690g == null) {
                    throw new zzlm("Encrypted Track found but ContentEncKeyID was not found");
                }
                v10Var3.f20692i = new zzne(new zzne.zza(zzkt.f26440b, "video/webm", this.f26714x.f20690g.f26661b));
                return;
            }
            return;
        }
        if (i2 == 28032) {
            v10 v10Var4 = this.f26714x;
            if (v10Var4.f20688e && v10Var4.f20689f != null) {
                throw new zzlm("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.f26711u == -9223372036854775807L) {
                this.f26711u = 1000000L;
            }
            long j3 = this.f26712v;
            if (j3 != -9223372036854775807L) {
                this.f26713w = m20347q(j3);
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            if (this.f26697g.size() == 0) {
                throw new zzlm("No valid tracks were found");
            }
            this.f26694c0.mo16024d();
            return;
        }
        if (i2 == 475249515 && !this.f26715y) {
            zznp zznpVar = this.f26694c0;
            if (this.f26710t == -1 || this.f26713w == -9223372036854775807L || (zzsnVar = this.f26671F) == null || zzsnVar.m20493c() == 0 || (zzsnVar2 = this.f26672G) == null || zzsnVar2.m20493c() != this.f26671F.m20493c()) {
                this.f26671F = null;
                this.f26672G = null;
                zznvVar = new zznv(this.f26713w);
            } else {
                int iM20493c = this.f26671F.m20493c();
                int[] iArr = new int[iM20493c];
                long[] jArr = new long[iM20493c];
                long[] jArr2 = new long[iM20493c];
                long[] jArr3 = new long[iM20493c];
                for (int i5 = 0; i5 < iM20493c; i5++) {
                    jArr3[i5] = this.f26671F.m20492b(i5);
                    jArr[i5] = this.f26710t + this.f26672G.m20492b(i5);
                }
                while (true) {
                    i3 = iM20493c - 1;
                    if (i >= i3) {
                        break;
                    }
                    int i6 = i + 1;
                    iArr[i] = (int) (jArr[i6] - jArr[i]);
                    jArr2[i] = jArr3[i6] - jArr3[i];
                    i = i6;
                }
                iArr[i3] = (int) ((this.f26710t + this.f26709s) - jArr[i3]);
                jArr2[i3] = this.f26713w - jArr3[i3];
                this.f26671F = null;
                this.f26672G = null;
                zznvVar = new zznl(iArr, jArr, jArr2, jArr3);
            }
            zznpVar.mo16033z(zznvVar);
            this.f26715y = true;
        }
    }

    private zzod(int i2) {
        this(new o10(), 0);
    }

    private zzod(r10 r10Var, int i2) {
        this.f26710t = -1L;
        this.f26711u = -9223372036854775807L;
        this.f26712v = -9223372036854775807L;
        this.f26713w = -9223372036854775807L;
        this.f26668C = -1L;
        this.f26669D = -1L;
        this.f26670E = -9223372036854775807L;
        this.f26695e = r10Var;
        r10Var.mo15667b(new u10(this, null));
        this.f26698h = true;
        this.f26696f = new x10();
        this.f26697g = new SparseArray<>();
        this.f26701k = new zzst(4);
        this.f26702l = new zzst(ByteBuffer.allocate(4).putInt(-1).array());
        this.f26703m = new zzst(4);
        this.f26699i = new zzst(zzsq.f26995a);
        this.f26700j = new zzst(4);
        this.f26704n = new zzst();
        this.f26705o = new zzst();
        this.f26706p = new zzst(8);
        this.f26707q = new zzst();
    }
}
