package l6;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import l6.InterfaceC3902a;

/* compiled from: StandardGifDecoder.java */
/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3906e implements InterfaceC3902a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f44396u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f44397a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f44398b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3902a.InterfaceC0591a f44399c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f44400d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f44401e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f44402f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f44403g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f44404h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f44405i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f44406j;

    /* renamed from: k, reason: collision with root package name */
    private int f44407k;

    /* renamed from: l, reason: collision with root package name */
    private C3904c f44408l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f44409m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f44410n;

    /* renamed from: o, reason: collision with root package name */
    private int f44411o;

    /* renamed from: p, reason: collision with root package name */
    private int f44412p;

    /* renamed from: q, reason: collision with root package name */
    private int f44413q;

    /* renamed from: r, reason: collision with root package name */
    private int f44414r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f44415s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f44416t;

    public C3906e(InterfaceC3902a.InterfaceC0591a interfaceC0591a, C3904c c3904c, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0591a);
        r(c3904c, byteBuffer, i10);
    }

    private int j(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f44412p + i10; i18++) {
            byte[] bArr = this.f44405i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f44397a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f44412p + i20; i21++) {
            byte[] bArr2 = this.f44405i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f44397a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void k(C3903b c3903b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f44406j;
        int i15 = c3903b.f44371d;
        int i16 = this.f44412p;
        int i17 = i15 / i16;
        int i18 = c3903b.f44369b / i16;
        int i19 = c3903b.f44370c / i16;
        int i20 = c3903b.f44368a / i16;
        boolean z10 = this.f44407k == 0;
        int i21 = this.f44414r;
        int i22 = this.f44413q;
        byte[] bArr = this.f44405i;
        int[] iArr2 = this.f44397a;
        Boolean bool = this.f44415s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i25 < i17) {
            Boolean bool2 = bool;
            if (c3903b.f44372e) {
                if (i24 >= i17) {
                    int i27 = i26 + 1;
                    i10 = i17;
                    if (i27 == 2) {
                        i24 = 4;
                    } else if (i27 == 3) {
                        i23 = 4;
                        i26 = i27;
                        i24 = 2;
                    } else if (i27 == 4) {
                        i26 = i27;
                        i24 = 1;
                        i23 = 2;
                    }
                    i26 = i27;
                } else {
                    i10 = i17;
                }
                i11 = i24 + i23;
            } else {
                i10 = i17;
                i11 = i24;
                i24 = i25;
            }
            int i28 = i24 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i25 * i16 * c3903b.f44370c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 >= i31) {
                            break;
                        }
                        int iJ = j(i33, i37, c3903b.f44370c);
                        if (iJ != 0) {
                            iArr[i38] = iJ;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i38++;
                        i19 = i13;
                    }
                    bool = bool2;
                    i25++;
                    i18 = i14;
                    i17 = i10;
                    i19 = i13;
                    i24 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i25++;
            i18 = i14;
            i17 = i10;
            i19 = i13;
            i24 = i12;
        }
        Boolean bool3 = bool;
        if (this.f44415s == null) {
            this.f44415s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void l(C3903b c3903b) {
        C3903b c3903b2 = c3903b;
        int[] iArr = this.f44406j;
        int i10 = c3903b2.f44371d;
        int i11 = c3903b2.f44369b;
        int i12 = c3903b2.f44370c;
        int i13 = c3903b2.f44368a;
        boolean z10 = this.f44407k == 0;
        int i14 = this.f44414r;
        byte[] bArr = this.f44405i;
        int[] iArr2 = this.f44397a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = c3903b2.f44370c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            c3903b2 = c3903b;
        }
        Boolean bool = this.f44415s;
        this.f44415s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f44415s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void m(C3903b c3903b) {
        int i10;
        int i11;
        short s10;
        C3906e c3906e = this;
        if (c3903b != null) {
            c3906e.f44400d.position(c3903b.f44377j);
        }
        if (c3903b == null) {
            C3904c c3904c = c3906e.f44408l;
            i10 = c3904c.f44384f;
            i11 = c3904c.f44385g;
        } else {
            i10 = c3903b.f44370c;
            i11 = c3903b.f44371d;
        }
        int i12 = i10 * i11;
        byte[] bArr = c3906e.f44405i;
        if (bArr == null || bArr.length < i12) {
            c3906e.f44405i = c3906e.f44399c.e(i12);
        }
        byte[] bArr2 = c3906e.f44405i;
        if (c3906e.f44402f == null) {
            c3906e.f44402f = new short[4096];
        }
        short[] sArr = c3906e.f44402f;
        if (c3906e.f44403g == null) {
            c3906e.f44403g = new byte[4096];
        }
        byte[] bArr3 = c3906e.f44403g;
        if (c3906e.f44404h == null) {
            c3906e.f44404h = new byte[4097];
        }
        byte[] bArr4 = c3906e.f44404h;
        int iQ = q();
        int i13 = 1 << iQ;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iQ + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = c3906e.f44401e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int iP = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (iP == 0) {
                iP = p();
                if (iP <= 0) {
                    c3906e.f44411o = 3;
                    break;
                }
                i23 = 0;
            }
            i25 += (bArr5[i23] & 255) << i24;
            i23++;
            iP--;
            int i30 = i24 + 8;
            int i31 = i21;
            int i32 = i29;
            int i33 = i20;
            int i34 = i16;
            int i35 = i28;
            while (true) {
                if (i30 < i33) {
                    i21 = i31;
                    i20 = i33;
                    i24 = i30;
                    i28 = i35;
                    i16 = i34;
                    i29 = i32;
                    break;
                }
                int i36 = i15;
                int i37 = i25 & i22;
                i25 >>= i33;
                i30 -= i33;
                if (i37 == i13) {
                    i22 = i17;
                    i33 = i34;
                    i31 = i36;
                    i15 = i31;
                    i32 = -1;
                } else {
                    if (i37 == i14) {
                        i24 = i30;
                        i28 = i35;
                        i21 = i31;
                        i16 = i34;
                        i15 = i36;
                        i29 = i32;
                        i20 = i33;
                        break;
                    }
                    if (i32 == -1) {
                        bArr2[i26] = bArr3[i37];
                        i26++;
                        i18++;
                        i32 = i37;
                        i35 = i32;
                        i15 = i36;
                        i30 = i30;
                    } else {
                        if (i37 >= i31) {
                            bArr4[i27] = (byte) i35;
                            i27++;
                            s10 = i32;
                        } else {
                            s10 = i37;
                        }
                        while (s10 >= i13) {
                            bArr4[i27] = bArr3[s10];
                            i27++;
                            s10 = sArr[s10];
                        }
                        i35 = bArr3[s10] & 255;
                        byte b10 = (byte) i35;
                        bArr2[i26] = b10;
                        while (true) {
                            i26++;
                            i18++;
                            if (i27 <= 0) {
                                break;
                            }
                            i27--;
                            bArr2[i26] = bArr4[i27];
                        }
                        byte[] bArr6 = bArr4;
                        if (i31 < 4096) {
                            sArr[i31] = (short) i32;
                            bArr3[i31] = b10;
                            i31++;
                            if ((i31 & i22) == 0 && i31 < 4096) {
                                i33++;
                                i22 += i31;
                            }
                        }
                        i32 = i37;
                        i15 = i36;
                        i30 = i30;
                        bArr4 = bArr6;
                    }
                }
            }
            c3906e = this;
        }
        Arrays.fill(bArr2, i26, i12, (byte) 0);
    }

    private Bitmap o() {
        Boolean bool = this.f44415s;
        Bitmap bitmapA = this.f44399c.a(this.f44414r, this.f44413q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f44416t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f44400d;
        byteBuffer.get(this.f44401e, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f44400d.get() & 255;
    }

    private Bitmap s(C3903b c3903b, C3903b c3903b2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f44406j;
        int i12 = 0;
        if (c3903b2 == null) {
            Bitmap bitmap2 = this.f44409m;
            if (bitmap2 != null) {
                this.f44399c.c(bitmap2);
            }
            this.f44409m = null;
            Arrays.fill(iArr, 0);
        }
        if (c3903b2 != null && c3903b2.f44374g == 3 && this.f44409m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c3903b2 != null && (i11 = c3903b2.f44374g) > 0) {
            if (i11 == 2) {
                if (!c3903b.f44373f) {
                    C3904c c3904c = this.f44408l;
                    int i13 = c3904c.f44390l;
                    if (c3903b.f44378k == null || c3904c.f44388j != c3903b.f44375h) {
                        i12 = i13;
                    }
                }
                int i14 = c3903b2.f44371d;
                int i15 = this.f44412p;
                int i16 = i14 / i15;
                int i17 = c3903b2.f44369b / i15;
                int i18 = c3903b2.f44370c / i15;
                int i19 = c3903b2.f44368a / i15;
                int i20 = this.f44414r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f44414r;
                }
            } else if (i11 == 3 && (bitmap = this.f44409m) != null) {
                int i25 = this.f44414r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f44413q);
            }
        }
        m(c3903b);
        if (c3903b.f44372e || this.f44412p != 1) {
            k(c3903b);
        } else {
            l(c3903b);
        }
        if (this.f44410n && ((i10 = c3903b.f44374g) == 0 || i10 == 1)) {
            if (this.f44409m == null) {
                this.f44409m = o();
            }
            Bitmap bitmap3 = this.f44409m;
            int i26 = this.f44414r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f44413q);
        }
        Bitmap bitmapO = o();
        int i27 = this.f44414r;
        bitmapO.setPixels(iArr, 0, i27, 0, 0, i27, this.f44413q);
        return bitmapO;
    }

    @Override // l6.InterfaceC3902a
    public synchronized Bitmap a() {
        try {
            if (this.f44408l.f44381c <= 0 || this.f44407k < 0) {
                String str = f44396u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f44408l.f44381c + ", framePointer=" + this.f44407k);
                }
                this.f44411o = 1;
            }
            int i10 = this.f44411o;
            if (i10 != 1 && i10 != 2) {
                this.f44411o = 0;
                if (this.f44401e == null) {
                    this.f44401e = this.f44399c.e(255);
                }
                C3903b c3903b = this.f44408l.f44383e.get(this.f44407k);
                int i11 = this.f44407k - 1;
                C3903b c3903b2 = i11 >= 0 ? this.f44408l.f44383e.get(i11) : null;
                int[] iArr = c3903b.f44378k;
                if (iArr == null) {
                    iArr = this.f44408l.f44379a;
                }
                this.f44397a = iArr;
                if (iArr == null) {
                    String str2 = f44396u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f44407k);
                    }
                    this.f44411o = 1;
                    return null;
                }
                if (c3903b.f44373f) {
                    System.arraycopy(iArr, 0, this.f44398b, 0, iArr.length);
                    int[] iArr2 = this.f44398b;
                    this.f44397a = iArr2;
                    iArr2[c3903b.f44375h] = 0;
                    if (c3903b.f44374g == 2 && this.f44407k == 0) {
                        this.f44415s = Boolean.TRUE;
                    }
                }
                return s(c3903b, c3903b2);
            }
            String str3 = f44396u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f44411o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l6.InterfaceC3902a
    public void b() {
        this.f44407k = (this.f44407k + 1) % this.f44408l.f44381c;
    }

    @Override // l6.InterfaceC3902a
    public int c() {
        return this.f44408l.f44381c;
    }

    @Override // l6.InterfaceC3902a
    public void clear() {
        this.f44408l = null;
        byte[] bArr = this.f44405i;
        if (bArr != null) {
            this.f44399c.d(bArr);
        }
        int[] iArr = this.f44406j;
        if (iArr != null) {
            this.f44399c.f(iArr);
        }
        Bitmap bitmap = this.f44409m;
        if (bitmap != null) {
            this.f44399c.c(bitmap);
        }
        this.f44409m = null;
        this.f44400d = null;
        this.f44415s = null;
        byte[] bArr2 = this.f44401e;
        if (bArr2 != null) {
            this.f44399c.d(bArr2);
        }
    }

    @Override // l6.InterfaceC3902a
    public int d() {
        int i10;
        if (this.f44408l.f44381c <= 0 || (i10 = this.f44407k) < 0) {
            return 0;
        }
        return n(i10);
    }

    @Override // l6.InterfaceC3902a
    public void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f44416t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // l6.InterfaceC3902a
    public ByteBuffer f() {
        return this.f44400d;
    }

    @Override // l6.InterfaceC3902a
    public void g() {
        this.f44407k = -1;
    }

    @Override // l6.InterfaceC3902a
    public int h() {
        return this.f44407k;
    }

    @Override // l6.InterfaceC3902a
    public int i() {
        return this.f44400d.limit() + this.f44405i.length + (this.f44406j.length * 4);
    }

    public int n(int i10) {
        if (i10 >= 0) {
            C3904c c3904c = this.f44408l;
            if (i10 < c3904c.f44381c) {
                return c3904c.f44383e.get(i10).f44376i;
            }
        }
        return -1;
    }

    public synchronized void r(C3904c c3904c, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f44411o = 0;
            this.f44408l = c3904c;
            this.f44407k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f44400d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f44400d.order(ByteOrder.LITTLE_ENDIAN);
            this.f44410n = false;
            Iterator<C3903b> it = c3904c.f44383e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f44374g == 3) {
                    this.f44410n = true;
                    break;
                }
            }
            this.f44412p = iHighestOneBit;
            int i11 = c3904c.f44384f;
            this.f44414r = i11 / iHighestOneBit;
            int i12 = c3904c.f44385g;
            this.f44413q = i12 / iHighestOneBit;
            this.f44405i = this.f44399c.e(i11 * i12);
            this.f44406j = this.f44399c.b(this.f44414r * this.f44413q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3906e(InterfaceC3902a.InterfaceC0591a interfaceC0591a) {
        this.f44398b = new int[256];
        this.f44416t = Bitmap.Config.ARGB_8888;
        this.f44399c = interfaceC0591a;
        this.f44408l = new C3904c();
    }
}
