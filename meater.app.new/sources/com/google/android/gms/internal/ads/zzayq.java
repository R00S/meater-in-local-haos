package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzayq {

    /* renamed from: a */
    private final String[] f22686a;

    /* renamed from: b */
    private final double[] f22687b;

    /* renamed from: c */
    private final double[] f22688c;

    /* renamed from: d */
    private final int[] f22689d;

    /* renamed from: e */
    private int f22690e;

    private zzayq(zzayt zzaytVar) {
        int size = zzaytVar.f22697b.size();
        this.f22686a = (String[]) zzaytVar.f22696a.toArray(new String[size]);
        this.f22687b = m17247b(zzaytVar.f22697b);
        this.f22688c = m17247b(zzaytVar.f22698c);
        this.f22689d = new int[size];
        this.f22690e = 0;
    }

    /* renamed from: b */
    private static double[] m17247b(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = list.get(i2).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m17248a(double d2) {
        this.f22690e++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.f22688c;
            if (i2 >= dArr.length) {
                return;
            }
            if (dArr[i2] <= d2 && d2 < this.f22687b[i2]) {
                int[] iArr = this.f22689d;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d2 < dArr[i2]) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: c */
    public final List<zzays> m17249c() {
        ArrayList arrayList = new ArrayList(this.f22686a.length);
        int i2 = 0;
        while (true) {
            String[] strArr = this.f22686a;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double d2 = this.f22688c[i2];
            double d3 = this.f22687b[i2];
            int[] iArr = this.f22689d;
            double d4 = iArr[i2];
            double d5 = this.f22690e;
            Double.isNaN(d4);
            Double.isNaN(d5);
            arrayList.add(new zzays(str, d2, d3, d4 / d5, iArr[i2]));
            i2++;
        }
    }
}
