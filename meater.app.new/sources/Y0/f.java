package Y0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected a f19202a;

    /* renamed from: e, reason: collision with root package name */
    protected int f19206e;

    /* renamed from: f, reason: collision with root package name */
    protected String f19207f;

    /* renamed from: i, reason: collision with root package name */
    protected long f19210i;

    /* renamed from: b, reason: collision with root package name */
    protected int f19203b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f19204c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f19205d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    protected float[] f19208g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f19209h = false;

    /* renamed from: j, reason: collision with root package name */
    protected float f19211j = Float.NaN;

    public String toString() {
        String str = this.f19207f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f19206e; i10++) {
            str = str + "[" + this.f19204c[i10] + " , " + decimalFormat.format(this.f19205d[i10]) + "] ";
        }
        return str;
    }
}
