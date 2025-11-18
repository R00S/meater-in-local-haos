package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzjg implements zzid {

    /* renamed from: A */
    private int f26328A;

    /* renamed from: B */
    private int f26329B;

    /* renamed from: C */
    private long f26330C;

    /* renamed from: D */
    private boolean f26331D;

    /* renamed from: E */
    private boolean f26332E;

    /* renamed from: F */
    private zzif f26333F;

    /* renamed from: a */
    private final e00 f26334a;

    /* renamed from: b */
    private final g00 f26335b;

    /* renamed from: c */
    private final zzkm f26336c;

    /* renamed from: d */
    private final zzkm f26337d;

    /* renamed from: e */
    private final zzkm f26338e;

    /* renamed from: f */
    private long f26339f;

    /* renamed from: g */
    private long f26340g;

    /* renamed from: h */
    private long f26341h;

    /* renamed from: i */
    private long f26342i;

    /* renamed from: j */
    private j00 f26343j;

    /* renamed from: k */
    private j00 f26344k;

    /* renamed from: l */
    private j00 f26345l;

    /* renamed from: m */
    private boolean f26346m;

    /* renamed from: n */
    private int f26347n;

    /* renamed from: o */
    private long f26348o;

    /* renamed from: p */
    private boolean f26349p;

    /* renamed from: q */
    private long f26350q;

    /* renamed from: r */
    private long f26351r;

    /* renamed from: s */
    private int f26352s;

    /* renamed from: t */
    private long f26353t;

    /* renamed from: u */
    private zzkk f26354u;

    /* renamed from: v */
    private zzkk f26355v;

    /* renamed from: w */
    private boolean f26356w;

    /* renamed from: x */
    private int f26357x;

    /* renamed from: y */
    private int f26358y;

    /* renamed from: z */
    private int f26359z;

    public zzjg() {
        this(new b00());
    }

    /* renamed from: g */
    private final void m20095g(zzip zzipVar) {
        zzipVar.mo15814d(this.f26330C, this.f26329B, this.f26359z, 0, null);
        this.f26358y = 0;
        this.f26331D = true;
    }

    /* renamed from: h */
    private static boolean m20096h(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str);
    }

    /* renamed from: k */
    private final long m20097k(long j2) {
        return TimeUnit.NANOSECONDS.toMicros(j2 * this.f26341h);
    }

    /* renamed from: l */
    private final ArrayList<byte[]> m20098l() throws zzhl {
        try {
            byte[] bArr = this.f26344k.f19418j;
            if (bArr[0] != 2) {
                throw new zzhl("Error parsing vorbis codec private");
            }
            int i2 = 1;
            int i3 = 0;
            while (bArr[i2] == -1) {
                i3 += 255;
                i2++;
            }
            int i4 = i2 + 1;
            int i5 = i3 + bArr[i2];
            int i6 = 0;
            while (bArr[i4] == -1) {
                i6 += 255;
                i4++;
            }
            int i7 = i4 + 1;
            int i8 = i6 + bArr[i4];
            if (bArr[i7] != 1) {
                throw new zzhl("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i7, bArr2, 0, i5);
            int i9 = i7 + i5;
            if (bArr[i9] != 3) {
                throw new zzhl("Error parsing vorbis codec private");
            }
            int i10 = i9 + i8;
            if (bArr[i10] != 5) {
                throw new zzhl("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i10];
            System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
            ArrayList<byte[]> arrayList = new ArrayList<>(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhl("Error parsing vorbis codec private");
        }
    }

    /* renamed from: a */
    final void m20099a(int i2, double d2) {
        if (i2 == 181) {
            this.f26343j.f19417i = (int) d2;
        } else {
            if (i2 != 17545) {
                return;
            }
            this.f26342i = m20097k((long) d2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m20100b(int r17, int r18, com.google.android.gms.internal.ads.zzie r19) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.m20100b(int, int, com.google.android.gms.internal.ads.zzie):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo20075c(com.google.android.gms.internal.ads.zzie r9, com.google.android.gms.internal.ads.zzij r10) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r8.f26331D = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3d
            boolean r3 = r8.f26331D
            if (r3 != 0) goto L3d
            com.google.android.gms.internal.ads.e00 r2 = r8.f26334a
            boolean r2 = r2.mo14836c(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.f26349p
            if (r5 == 0) goto L27
            r8.f26351r = r3
            long r3 = r8.f26350q
            r10.f26298a = r3
            r8.f26352s = r1
            r8.f26349p = r0
        L25:
            r3 = 1
            goto L3a
        L27:
            int r3 = r8.f26352s
            r4 = 2
            if (r3 != r4) goto L39
            long r3 = r8.f26351r
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            r10.f26298a = r3
            r8.f26351r = r5
            goto L25
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L5
            return r1
        L3d:
            if (r2 == 0) goto L40
            return r0
        L40:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.mo20075c(com.google.android.gms.internal.ads.zzie, com.google.android.gms.internal.ads.zzij):int");
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: d */
    public final void mo20076d(zzif zzifVar) {
        this.f26333F = zzifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: e */
    public final void mo20077e() {
        this.f26353t = -1L;
        this.f26358y = 0;
        this.f26334a.mo14834a();
        this.f26335b.m15153a();
    }

    /* renamed from: f */
    final void m20101f(int i2, String str) throws zzhl {
        if (i2 == 134) {
            this.f26343j.f19409a = str;
            return;
        }
        if (i2 == 17026 && !"webm".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhl(sb.toString());
        }
    }

    /* renamed from: i */
    final void m20102i(int i2, long j2, long j3) throws zzhl {
        if (i2 == 160) {
            this.f26332E = false;
            return;
        }
        if (i2 == 174) {
            this.f26343j = new j00();
            return;
        }
        if (i2 == 187) {
            this.f26356w = false;
            return;
        }
        if (i2 == 19899) {
            this.f26347n = -1;
            this.f26348o = -1L;
            return;
        }
        if (i2 == 20533) {
            this.f26343j.f19412d = true;
            return;
        }
        if (i2 == 408125543) {
            if (this.f26339f != -1) {
                throw new zzhl("Multiple Segment elements not supported");
            }
            this.f26339f = j2;
            this.f26340g = j3;
            return;
        }
        if (i2 == 475249515) {
            this.f26354u = new zzkk();
            this.f26355v = new zzkk();
        } else if (i2 == 524531317 && this.f26352s == 0 && this.f26350q != -1) {
            this.f26349p = true;
        }
    }

    /* renamed from: j */
    final void m20103j(int i2, long j2) throws zzhl {
        switch (i2) {
            case 131:
                this.f26343j.f19411c = (int) j2;
                return;
            case 159:
                this.f26343j.f19416h = (int) j2;
                return;
            case 176:
                this.f26343j.f19414f = (int) j2;
                return;
            case 179:
                this.f26354u.m20133a(m20097k(j2));
                return;
            case 186:
                this.f26343j.f19415g = (int) j2;
                return;
            case 215:
                this.f26343j.f19410b = (int) j2;
                return;
            case 231:
                this.f26353t = m20097k(j2);
                return;
            case 241:
                if (this.f26356w) {
                    return;
                }
                this.f26355v.m20133a(j2);
                this.f26356w = true;
                return;
            case 251:
                this.f26332E = true;
                return;
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("DocTypeReadVersion ");
                    sb.append(j2);
                    sb.append(" not supported");
                    throw new zzhl(sb.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("EBMLReadVersion ");
                sb2.append(j2);
                sb2.append(" not supported");
                throw new zzhl(sb2.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(49);
                sb3.append("ContentEncAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new zzhl(sb3.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(56);
                sb4.append("AESSettingsCipherMode ");
                sb4.append(j2);
                sb4.append(" not supported");
                throw new zzhl(sb4.toString());
            case 20529:
                if (j2 == 0) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(55);
                sb5.append("ContentEncodingOrder ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new zzhl(sb5.toString());
            case 20530:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new zzhl(sb6.toString());
            case 20531:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(54);
                sb7.append("ContentEncodingType ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new zzhl(sb7.toString());
            case 21420:
                this.f26348o = j2 + this.f26339f;
                return;
            case 22186:
                this.f26343j.f19419k = j2;
                return;
            case 22203:
                this.f26343j.f19420l = j2;
                return;
            case 2807729:
                this.f26341h = j2;
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    final void m20104m(int i2) throws zzhl {
        int i3;
        zzhj zzhjVarM20023e;
        zzhj zzhjVarM20025g;
        if (i2 == 160) {
            if (this.f26358y != 2) {
                return;
            }
            if (!this.f26332E) {
                this.f26329B |= 1;
            }
            j00 j00Var = this.f26344k;
            if (j00Var == null || this.f26328A != j00Var.f19410b) {
                j00Var = this.f26345l;
            }
            m20095g(j00Var.f19421m);
            return;
        }
        if (i2 == 174) {
            j00 j00Var2 = this.f26343j;
            if (j00Var2.f19410b == -1 || (i3 = j00Var2.f19411c) == -1) {
                throw new zzhl("Mandatory element TrackNumber or TrackType not found");
            }
            if ((i3 == 2 && this.f26344k != null) || (i3 == 1 && this.f26345l != null)) {
                this.f26343j = null;
                return;
            }
            if (i3 == 2 && m20096h(j00Var2.f19409a)) {
                j00 j00Var3 = this.f26343j;
                this.f26344k = j00Var3;
                j00Var3.f19421m = this.f26333F.mo20080f(j00Var3.f19410b);
                j00 j00Var4 = this.f26344k;
                zzip zzipVar = j00Var4.f19421m;
                if (j00Var4 == null || !"A_VORBIS".equals(j00Var4.f19409a)) {
                    j00 j00Var5 = this.f26344k;
                    if (j00Var5 == null || !"A_OPUS".equals(j00Var5.f19409a)) {
                        throw new zzhl("Unable to build format");
                    }
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(this.f26344k.f19418j);
                    arrayList.add(ByteBuffer.allocate(64).putLong(this.f26344k.f19419k).array());
                    arrayList.add(ByteBuffer.allocate(64).putLong(this.f26344k.f19420l).array());
                    long j2 = this.f26342i;
                    j00 j00Var6 = this.f26344k;
                    zzhjVarM20025g = zzhj.m20025g("audio/opus", 5760, j2, j00Var6.f19416h, j00Var6.f19417i, arrayList);
                } else {
                    long j3 = this.f26342i;
                    j00 j00Var7 = this.f26344k;
                    zzhjVarM20025g = zzhj.m20025g("audio/vorbis", 8192, j3, j00Var7.f19416h, j00Var7.f19417i, m20098l());
                }
                zzipVar.mo20065b(zzhjVarM20025g);
            } else {
                j00 j00Var8 = this.f26343j;
                if (j00Var8.f19411c == 1 && m20096h(j00Var8.f19409a)) {
                    j00 j00Var9 = this.f26343j;
                    this.f26345l = j00Var9;
                    j00Var9.f19421m = this.f26333F.mo20080f(j00Var9.f19410b);
                    j00 j00Var10 = this.f26345l;
                    zzip zzipVar2 = j00Var10.f19421m;
                    if (j00Var10 == null || !"V_VP8".equals(j00Var10.f19409a)) {
                        j00 j00Var11 = this.f26345l;
                        if (j00Var11 == null || !"V_VP9".equals(j00Var11.f19409a)) {
                            throw new zzhl("Unable to build format");
                        }
                        long j4 = this.f26342i;
                        j00 j00Var12 = this.f26345l;
                        zzhjVarM20023e = zzhj.m20023e("video/x-vnd.on2.vp9", -1, j4, j00Var12.f19414f, j00Var12.f19415g, null);
                    } else {
                        long j5 = this.f26342i;
                        j00 j00Var13 = this.f26345l;
                        zzhjVarM20023e = zzhj.m20023e("video/x-vnd.on2.vp8", -1, j5, j00Var13.f19414f, j00Var13.f19415g, null);
                    }
                    zzipVar2.mo20065b(zzhjVarM20023e);
                }
            }
            this.f26343j = null;
            return;
        }
        if (i2 == 19899) {
            int i4 = this.f26347n;
            if (i4 != -1) {
                long j6 = this.f26348o;
                if (j6 != -1) {
                    if (i4 == 475249515) {
                        this.f26350q = j6;
                        return;
                    }
                    return;
                }
            }
            throw new zzhl("Mandatory element SeekID or SeekPosition not found");
        }
        if (i2 == 25152) {
            j00 j00Var14 = this.f26343j;
            if (!j00Var14.f19412d) {
                throw new zzhl("Found an unsupported ContentEncoding");
            }
            byte[] bArr = j00Var14.f19413e;
            if (bArr == null) {
                throw new zzhl("Encrypted Track found but ContentEncKeyID was not found");
            }
            if (this.f26346m) {
                return;
            }
            this.f26333F.mo20079e(new zzhy("video/webm", bArr));
            this.f26346m = true;
            return;
        }
        if (i2 == 374648427) {
            if (this.f26345l == null && this.f26344k == null) {
                throw new zzhl("No valid tracks were found");
            }
            this.f26333F.mo20078d();
            return;
        }
        if (i2 != 475249515 || this.f26352s == 2) {
            return;
        }
        zzif zzifVar = this.f26333F;
        if (this.f26339f == -1) {
            throw new zzhl("Segment start/end offsets unknown");
        }
        if (this.f26342i == -1) {
            throw new zzhl("Duration unknown");
        }
        zzkk zzkkVar = this.f26354u;
        if (zzkkVar == null || this.f26355v == null || zzkkVar.m20135c() == 0 || this.f26354u.m20135c() != this.f26355v.m20135c()) {
            throw new zzhl("Invalid/missing cue points");
        }
        int iM20135c = this.f26354u.m20135c();
        int[] iArr = new int[iM20135c];
        long[] jArr = new long[iM20135c];
        long[] jArr2 = new long[iM20135c];
        long[] jArr3 = new long[iM20135c];
        int i5 = 0;
        for (int i6 = 0; i6 < iM20135c; i6++) {
            jArr3[i6] = this.f26354u.m20134b(i6);
            jArr[i6] = this.f26339f + this.f26355v.m20134b(i6);
        }
        while (true) {
            int i7 = iM20135c - 1;
            if (i5 >= i7) {
                iArr[i7] = (int) ((this.f26339f + this.f26340g) - jArr[i7]);
                jArr2[i7] = this.f26342i - jArr3[i7];
                this.f26354u = null;
                this.f26355v = null;
                zzifVar.mo20081g(new zzia(iArr, jArr, jArr2, jArr3));
                this.f26352s = 2;
                return;
            }
            int i8 = i5 + 1;
            iArr[i5] = (int) (jArr[i8] - jArr[i5]);
            jArr2[i5] = jArr3[i8] - jArr3[i5];
            i5 = i8;
        }
    }

    private zzjg(e00 e00Var) {
        this.f26339f = -1L;
        this.f26340g = -1L;
        this.f26341h = 1000000L;
        this.f26342i = -1L;
        this.f26350q = -1L;
        this.f26351r = -1L;
        this.f26352s = 0;
        this.f26353t = -1L;
        this.f26334a = e00Var;
        e00Var.mo14835b(new i00(this));
        this.f26335b = new g00();
        this.f26336c = new zzkm(4);
        this.f26337d = new zzkm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f26338e = new zzkm(4);
    }
}
