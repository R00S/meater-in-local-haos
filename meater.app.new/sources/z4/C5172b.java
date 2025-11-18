package z4;

import B4.l;
import com.apptionlabs.meater_app.model.MEATERDeviceType;

/* compiled from: BLEDeviceInfo.java */
/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5172b {

    /* renamed from: c, reason: collision with root package name */
    static C5172b f53566c = new C5172b(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    long f53567a;

    /* renamed from: b, reason: collision with root package name */
    int f53568b;

    /* compiled from: BLEDeviceInfo.java */
    /* renamed from: z4.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53569a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            f53569a = iArr;
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53569a[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53569a[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53569a[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53569a[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53569a[MEATERDeviceType.PLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53569a[MEATERDeviceType.PLUS_SE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f53569a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    C5172b(long j10, int i10) {
        this.f53567a = j10;
        this.f53568b = i10;
    }

    private static int a(byte[] bArr) {
        if (bArr.length > 0) {
            return bArr[0] & 255;
        }
        return -1;
    }

    private static long b(byte[] bArr) {
        long j10 = 0;
        for (int i10 = 7; i10 > -1; i10--) {
            j10 = (j10 << 8) + (bArr[i10] & 255);
        }
        return j10;
    }

    static C5172b c(byte[] bArr) {
        long jD = d(bArr);
        int iA = a(bArr);
        if (bArr.length < 10) {
            return f53566c;
        }
        byte b10 = bArr[9];
        return b10 == -1 ? f53566c : !P5.Q.a(b10) ? f53566c : !B4.l.a(l.e.values()[b10]) ? f53566c : jD == 0 ? f53566c : new C5172b(jD, iA);
    }

    private static long d(byte[] bArr) {
        long j10 = 0;
        for (int i10 = 8; i10 > 0; i10--) {
            j10 = (j10 << 8) + (bArr[i10] & 255);
        }
        return j10;
    }

    static C5172b e(byte[] bArr) {
        long jB = b(bArr);
        return jB == 0 ? f53566c : new C5172b(jB, 8);
    }

    static C5172b f(String str) throws NumberFormatException {
        if (str == null) {
            return f53566c;
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length != 2) {
            return f53566c;
        }
        String str2 = strArrSplit[1];
        String str3 = strArrSplit[0];
        long jR = P5.Q.r(str2);
        try {
            int i10 = Integer.parseInt(str3, 16);
            if (j(i10) && jR != 0) {
                return new C5172b(jR, i10);
            }
            return f53566c;
        } catch (NumberFormatException unused) {
            return f53566c;
        }
    }

    static C5172b g(byte[] bArr) {
        long jD = d(bArr);
        int i10 = i(bArr);
        return (!j(i10) || jD == 0) ? f53566c : new C5172b(jD, i10);
    }

    private static int i(byte[] bArr) {
        if (bArr.length > 0) {
            return bArr[0] & 255;
        }
        return -1;
    }

    private static boolean j(int i10) {
        MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(i10);
        if (typeFromProbeNumber == null) {
            return false;
        }
        switch (a.f53569a[typeFromProbeNumber.ordinal()]) {
        }
        return false;
    }

    boolean h() {
        long j10 = this.f53567a;
        C5172b c5172b = f53566c;
        return j10 == c5172b.f53567a && this.f53568b == c5172b.f53568b;
    }
}
