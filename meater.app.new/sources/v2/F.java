package v2;

/* compiled from: MpegAudioUtil.java */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f51034a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f51035b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f51036c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f51037d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f51038e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f51039f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f51040g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f51041a;

        /* renamed from: b, reason: collision with root package name */
        public String f51042b;

        /* renamed from: c, reason: collision with root package name */
        public int f51043c;

        /* renamed from: d, reason: collision with root package name */
        public int f51044d;

        /* renamed from: e, reason: collision with root package name */
        public int f51045e;

        /* renamed from: f, reason: collision with root package name */
        public int f51046f;

        /* renamed from: g, reason: collision with root package name */
        public int f51047g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f51041a = i11;
            this.f51042b = F.f51034a[3 - i12];
            int i15 = F.f51035b[i14];
            this.f51044d = i15;
            if (i11 == 2) {
                this.f51044d = i15 / 2;
            } else if (i11 == 0) {
                this.f51044d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f51047g = F.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? F.f51036c[i13 - 1] : F.f51037d[i13 - 1];
                this.f51046f = i17;
                this.f51043c = (((i17 * 12) / this.f51044d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? F.f51038e[i13 - 1] : F.f51039f[i13 - 1];
                    this.f51046f = i18;
                    this.f51043c = ((i18 * 144) / this.f51044d) + i16;
                } else {
                    int i19 = F.f51040g[i13 - 1];
                    this.f51046f = i19;
                    this.f51043c = (((i12 == 1 ? 72 : 144) * i19) / this.f51044d) + i16;
                }
            }
            this.f51045e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f51041a = aVar.f51041a;
            this.f51042b = aVar.f51042b;
            this.f51043c = aVar.f51043c;
            this.f51044d = aVar.f51044d;
            this.f51045e = aVar.f51045e;
            this.f51046f = aVar.f51046f;
            this.f51047g = aVar.f51047g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f51035b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f51036c[i13 - 1] : f51037d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f51038e[i13 - 1] : f51039f[i13 - 1] : f51040g[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
