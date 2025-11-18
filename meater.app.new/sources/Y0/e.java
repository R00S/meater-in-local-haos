package Y0;

import java.text.DecimalFormat;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    protected a f19197a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f19198b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f19199c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    private int f19200d;

    /* renamed from: e, reason: collision with root package name */
    private String f19201e;

    public float a(float f10) {
        return (float) this.f19197a.a(f10, 0);
    }

    public String toString() {
        String str = this.f19201e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f19200d; i10++) {
            str = str + "[" + this.f19198b[i10] + " , " + decimalFormat.format(this.f19199c[i10]) + "] ";
        }
        return str;
    }
}
