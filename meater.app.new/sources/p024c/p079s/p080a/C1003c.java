package p024c.p079s.p080a;

/* compiled from: Target.java */
/* renamed from: c.s.a.c */
/* loaded from: classes.dex */
public final class C1003c {

    /* renamed from: a */
    public static final C1003c f6655a;

    /* renamed from: b */
    public static final C1003c f6656b;

    /* renamed from: c */
    public static final C1003c f6657c;

    /* renamed from: d */
    public static final C1003c f6658d;

    /* renamed from: e */
    public static final C1003c f6659e;

    /* renamed from: f */
    public static final C1003c f6660f;

    /* renamed from: g */
    final float[] f6661g;

    /* renamed from: h */
    final float[] f6662h;

    /* renamed from: i */
    final float[] f6663i = new float[3];

    /* renamed from: j */
    boolean f6664j = true;

    static {
        C1003c c1003c = new C1003c();
        f6655a = c1003c;
        m6432m(c1003c);
        m6435p(c1003c);
        C1003c c1003c2 = new C1003c();
        f6656b = c1003c2;
        m6434o(c1003c2);
        m6435p(c1003c2);
        C1003c c1003c3 = new C1003c();
        f6657c = c1003c3;
        m6431l(c1003c3);
        m6435p(c1003c3);
        C1003c c1003c4 = new C1003c();
        f6658d = c1003c4;
        m6432m(c1003c4);
        m6433n(c1003c4);
        C1003c c1003c5 = new C1003c();
        f6659e = c1003c5;
        m6434o(c1003c5);
        m6433n(c1003c5);
        C1003c c1003c6 = new C1003c();
        f6660f = c1003c6;
        m6431l(c1003c6);
        m6433n(c1003c6);
    }

    C1003c() {
        float[] fArr = new float[3];
        this.f6661g = fArr;
        float[] fArr2 = new float[3];
        this.f6662h = fArr2;
        m6437r(fArr);
        m6437r(fArr2);
        m6436q();
    }

    /* renamed from: l */
    private static void m6431l(C1003c c1003c) {
        float[] fArr = c1003c.f6662h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    private static void m6432m(C1003c c1003c) {
        float[] fArr = c1003c.f6662h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    private static void m6433n(C1003c c1003c) {
        float[] fArr = c1003c.f6661g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    private static void m6434o(C1003c c1003c) {
        float[] fArr = c1003c.f6662h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    private static void m6435p(C1003c c1003c) {
        float[] fArr = c1003c.f6661g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: q */
    private void m6436q() {
        float[] fArr = this.f6663i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* renamed from: r */
    private static void m6437r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float m6438a() {
        return this.f6663i[1];
    }

    /* renamed from: b */
    public float m6439b() {
        return this.f6662h[2];
    }

    /* renamed from: c */
    public float m6440c() {
        return this.f6661g[2];
    }

    /* renamed from: d */
    public float m6441d() {
        return this.f6662h[0];
    }

    /* renamed from: e */
    public float m6442e() {
        return this.f6661g[0];
    }

    /* renamed from: f */
    public float m6443f() {
        return this.f6663i[2];
    }

    /* renamed from: g */
    public float m6444g() {
        return this.f6663i[0];
    }

    /* renamed from: h */
    public float m6445h() {
        return this.f6662h[1];
    }

    /* renamed from: i */
    public float m6446i() {
        return this.f6661g[1];
    }

    /* renamed from: j */
    public boolean m6447j() {
        return this.f6664j;
    }

    /* renamed from: k */
    void m6448k() {
        int length = this.f6663i.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.f6663i[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.f6663i.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.f6663i;
                if (fArr[i3] > 0.0f) {
                    fArr[i3] = fArr[i3] / f2;
                }
            }
        }
    }
}
