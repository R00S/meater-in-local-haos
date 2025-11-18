package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
class k implements Comparable<k> {

    /* renamed from: T, reason: collision with root package name */
    static String[] f23898T = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: B, reason: collision with root package name */
    Y0.b f23899B;

    /* renamed from: D, reason: collision with root package name */
    float f23901D;

    /* renamed from: E, reason: collision with root package name */
    float f23902E;

    /* renamed from: F, reason: collision with root package name */
    float f23903F;

    /* renamed from: G, reason: collision with root package name */
    float f23904G;

    /* renamed from: H, reason: collision with root package name */
    float f23905H;

    /* renamed from: I, reason: collision with root package name */
    float f23906I;

    /* renamed from: L, reason: collision with root package name */
    int f23909L;

    /* renamed from: M, reason: collision with root package name */
    int f23910M;

    /* renamed from: N, reason: collision with root package name */
    float f23911N;

    /* renamed from: O, reason: collision with root package name */
    g f23912O;

    /* renamed from: P, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f23913P;

    /* renamed from: Q, reason: collision with root package name */
    int f23914Q;

    /* renamed from: R, reason: collision with root package name */
    double[] f23915R;

    /* renamed from: S, reason: collision with root package name */
    double[] f23916S;

    /* renamed from: C, reason: collision with root package name */
    int f23900C = 0;

    /* renamed from: J, reason: collision with root package name */
    float f23907J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    float f23908K = Float.NaN;

    k() {
        int i10 = d.f23805a;
        this.f23909L = i10;
        this.f23910M = i10;
        this.f23911N = Float.NaN;
        this.f23912O = null;
        this.f23913P = new LinkedHashMap<>();
        this.f23914Q = 0;
        this.f23915R = new double[18];
        this.f23916S = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f23902E, kVar.f23902E);
    }

    void j(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float f11 = this.f23903F;
        float f12 = this.f23904G;
        float f13 = this.f23905H;
        float f14 = this.f23906I;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f19;
                f15 = f20;
            } else if (i11 == 2) {
                f12 = f19;
                f17 = f20;
            } else if (i11 == 3) {
                f13 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f14 = f19;
                f18 = f20;
            }
        }
        float f21 = 2.0f;
        float f22 = (f16 / 2.0f) + f15;
        float fCos = (f18 / 2.0f) + f17;
        g gVar = this.f23912O;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d10, fArr3, fArr4);
            float f23 = fArr3[0];
            float f24 = fArr3[1];
            float f25 = fArr4[0];
            float f26 = fArr4[1];
            double d11 = f11;
            double d12 = f12;
            f10 = f13;
            float fSin = (float) ((f23 + (Math.sin(d12) * d11)) - (f13 / 2.0f));
            float fCos2 = (float) ((f24 - (d11 * Math.cos(d12))) - (f14 / 2.0f));
            double d13 = f15;
            double d14 = f17;
            float fSin2 = (float) (f25 + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            fCos = (float) ((f26 - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f22 = fSin2;
            f11 = fSin;
            f12 = fCos2;
            f21 = 2.0f;
        } else {
            f10 = f13;
        }
        fArr[0] = f11 + (f10 / f21) + 0.0f;
        fArr[1] = f12 + (f14 / f21) + 0.0f;
        fArr2[0] = f22;
        fArr2[1] = fCos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void n(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float f12;
        float f13 = this.f23903F;
        float f14 = this.f23904G;
        float f15 = this.f23905H;
        float f16 = this.f23906I;
        if (iArr.length != 0 && this.f23915R.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f23915R = new double[i10];
            this.f23916S = new double[i10];
        }
        Arrays.fill(this.f23915R, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f23915R;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f23916S[i12] = dArr2[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr5 = this.f23915R;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f12 = f17;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f23915R[i13])) {
                    d10 = this.f23915R[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.f23916S[i13];
                if (i13 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i13 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i13 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i13 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i13 == 5) {
                    f17 = f22;
                }
                i13++;
            }
            f17 = f12;
            i13++;
        }
        float f24 = f17;
        g gVar = this.f23912O;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = f13;
            double d12 = f14;
            float fSin = (float) ((f25 + (Math.sin(d12) * d11)) - (f15 / 2.0f));
            f11 = f16;
            float fCos = (float) ((f26 - (Math.cos(d12) * d11)) - (f16 / 2.0f));
            double d13 = f18;
            double d14 = f19;
            float fSin2 = (float) (f27 + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float fCos2 = (float) ((f28 - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (f24 + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f13 = fSin;
            f14 = fCos;
        } else {
            f11 = f16;
            if (!Float.isNaN(f24)) {
                view.setRotation(f24 + ((float) Math.toDegrees(Math.atan2(f19 + (f21 / 2.0f), f18 + (f20 / 2.0f)))) + 0.0f);
            }
        }
        if (view instanceof c) {
            ((c) view).a(f13, f14, f15 + f13, f14 + f11);
            return;
        }
        float f29 = f13 + 0.5f;
        int i14 = (int) f29;
        float f30 = f14 + 0.5f;
        int i15 = (int) f30;
        int i16 = (int) (f29 + f15);
        int i17 = (int) (f30 + f11);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }
}
