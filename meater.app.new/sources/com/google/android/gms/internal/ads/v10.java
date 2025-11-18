package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class v10 {

    /* renamed from: A */
    public float f20668A;

    /* renamed from: B */
    public float f20669B;

    /* renamed from: C */
    public float f20670C;

    /* renamed from: D */
    public float f20671D;

    /* renamed from: E */
    public float f20672E;

    /* renamed from: F */
    public float f20673F;

    /* renamed from: G */
    public int f20674G;

    /* renamed from: H */
    public int f20675H;

    /* renamed from: I */
    public int f20676I;

    /* renamed from: J */
    public long f20677J;

    /* renamed from: K */
    public long f20678K;

    /* renamed from: L */
    public boolean f20679L;

    /* renamed from: M */
    public boolean f20680M;

    /* renamed from: N */
    private String f20681N;

    /* renamed from: O */
    public zznw f20682O;

    /* renamed from: P */
    public int f20683P;

    /* renamed from: a */
    public String f20684a;

    /* renamed from: b */
    public int f20685b;

    /* renamed from: c */
    public int f20686c;

    /* renamed from: d */
    public int f20687d;

    /* renamed from: e */
    public boolean f20688e;

    /* renamed from: f */
    public byte[] f20689f;

    /* renamed from: g */
    public zznx f20690g;

    /* renamed from: h */
    public byte[] f20691h;

    /* renamed from: i */
    public zzne f20692i;

    /* renamed from: j */
    public int f20693j;

    /* renamed from: k */
    public int f20694k;

    /* renamed from: l */
    public int f20695l;

    /* renamed from: m */
    public int f20696m;

    /* renamed from: n */
    public int f20697n;

    /* renamed from: o */
    public byte[] f20698o;

    /* renamed from: p */
    public int f20699p;

    /* renamed from: q */
    public boolean f20700q;

    /* renamed from: r */
    public int f20701r;

    /* renamed from: s */
    public int f20702s;

    /* renamed from: t */
    public int f20703t;

    /* renamed from: u */
    public int f20704u;

    /* renamed from: v */
    public int f20705v;

    /* renamed from: w */
    public float f20706w;

    /* renamed from: x */
    public float f20707x;

    /* renamed from: y */
    public float f20708y;

    /* renamed from: z */
    public float f20709z;

    private v10() {
        this.f20693j = -1;
        this.f20694k = -1;
        this.f20695l = -1;
        this.f20696m = -1;
        this.f20697n = 0;
        this.f20698o = null;
        this.f20699p = -1;
        this.f20700q = false;
        this.f20701r = -1;
        this.f20702s = -1;
        this.f20703t = -1;
        this.f20704u = 1000;
        this.f20705v = 200;
        this.f20706w = -1.0f;
        this.f20707x = -1.0f;
        this.f20708y = -1.0f;
        this.f20709z = -1.0f;
        this.f20668A = -1.0f;
        this.f20669B = -1.0f;
        this.f20670C = -1.0f;
        this.f20671D = -1.0f;
        this.f20672E = -1.0f;
        this.f20673F = -1.0f;
        this.f20674G = 1;
        this.f20675H = -1;
        this.f20676I = 8000;
        this.f20677J = 0L;
        this.f20678K = 0L;
        this.f20680M = true;
        this.f20681N = "eng";
    }

    /* renamed from: b */
    private static List<byte[]> m15947b(zzst zzstVar) throws zzlm {
        try {
            zzstVar.m20511l(16);
            if (zzstVar.m20522w() != 826496599) {
                return null;
            }
            byte[] bArr = zzstVar.f27013a;
            for (int iM20501b = zzstVar.m20501b() + 20; iM20501b < bArr.length - 4; iM20501b++) {
                if (bArr[iM20501b] == 0 && bArr[iM20501b + 1] == 0 && bArr[iM20501b + 2] == 1 && bArr[iM20501b + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, iM20501b, bArr.length));
                }
            }
            throw new zzlm("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzlm("Error parsing FourCC VC1 codec private");
        }
    }

    /* renamed from: d */
    private static boolean m15948d(zzst zzstVar) throws zzlm {
        try {
            int iM20521v = zzstVar.m20521v();
            if (iM20521v == 1) {
                return true;
            }
            if (iM20521v == 65534) {
                zzstVar.m20510k(24);
                if (zzstVar.m20504e() == zzod.f26665d.getMostSignificantBits()) {
                    if (zzstVar.m20504e() == zzod.f26665d.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzlm("Error parsing MS/ACM codec private");
        }
    }

    /* renamed from: e */
    private static List<byte[]> m15949e(byte[] bArr) throws zzlm {
        try {
            if (bArr[0] != 2) {
                throw new zzlm("Error parsing vorbis codec private");
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
                throw new zzlm("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i7, bArr2, 0, i5);
            int i9 = i7 + i5;
            if (bArr[i9] != 3) {
                throw new zzlm("Error parsing vorbis codec private");
            }
            int i10 = i9 + i8;
            if (bArr[i10] != 5) {
                throw new zzlm("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i10];
            System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzlm("Error parsing vorbis codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15950c(com.google.android.gms.internal.ads.zznp r43, int r44) throws com.google.android.gms.internal.ads.zzlm {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v10.m15950c(com.google.android.gms.internal.ads.zznp, int):void");
    }

    /* synthetic */ v10(t10 t10Var) {
        this();
    }
}
