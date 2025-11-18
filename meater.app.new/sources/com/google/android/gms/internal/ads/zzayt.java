package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzayt {

    /* renamed from: a */
    private final List<String> f22696a = new ArrayList();

    /* renamed from: b */
    private final List<Double> f22697b = new ArrayList();

    /* renamed from: c */
    private final List<Double> f22698c = new ArrayList();

    /* renamed from: a */
    public final zzayt m17253a(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.f22696a.size()) {
            double dDoubleValue = this.f22698c.get(i2).doubleValue();
            double dDoubleValue2 = this.f22697b.get(i2).doubleValue();
            if (d2 < dDoubleValue || (dDoubleValue == d2 && d3 < dDoubleValue2)) {
                break;
            }
            i2++;
        }
        this.f22696a.add(i2, str);
        this.f22698c.add(i2, Double.valueOf(d2));
        this.f22697b.add(i2, Double.valueOf(d3));
        return this;
    }

    /* renamed from: e */
    public final zzayq m17254e() {
        return new zzayq(this);
    }
}
