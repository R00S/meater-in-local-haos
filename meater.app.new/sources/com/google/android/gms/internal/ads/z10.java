package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class z10 extends y10 {

    /* renamed from: Q0 */
    public final long f21351Q0;

    /* renamed from: R0 */
    public final List<a20> f21352R0;

    /* renamed from: S0 */
    public final List<z10> f21353S0;

    public z10(int i2, long j2) {
        super(i2);
        this.f21351Q0 = j2;
        this.f21352R0 = new ArrayList();
        this.f21353S0 = new ArrayList();
    }

    /* renamed from: d */
    public final a20 m16152d(int i2) {
        int size = this.f21352R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            a20 a20Var = this.f21352R0.get(i3);
            if (a20Var.f21091P0 == i2) {
                return a20Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final z10 m16153e(int i2) {
        int size = this.f21353S0.size();
        for (int i3 = 0; i3 < size; i3++) {
            z10 z10Var = this.f21353S0.get(i3);
            if (z10Var.f21091P0 == i2) {
                return z10Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y10
    public final String toString() {
        String strM16051c = y10.m16051c(this.f21091P0);
        String string = Arrays.toString(this.f21352R0.toArray());
        String string2 = Arrays.toString(this.f21353S0.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(strM16051c).length() + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(strM16051c);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
