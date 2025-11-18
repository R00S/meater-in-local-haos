package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzdtd {

    /* renamed from: a */
    public static final zzdtd f25970a = new zzdtd(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: b */
    private static final zzdtd f25971b = new zzdtd(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: c */
    private static final zzdtd f25972c = new zzdtd(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: d */
    private static final zzdtd f25973d = new zzdtd(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: e */
    private final double f25974e;

    /* renamed from: f */
    private final double f25975f;

    /* renamed from: g */
    private final double f25976g;

    /* renamed from: h */
    private final double f25977h;

    /* renamed from: i */
    private final double f25978i;

    /* renamed from: j */
    private final double f25979j;

    /* renamed from: k */
    private final double f25980k;

    /* renamed from: l */
    private final double f25981l;

    /* renamed from: m */
    private final double f25982m;

    private zzdtd(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f25974e = d6;
        this.f25975f = d7;
        this.f25976g = d8;
        this.f25977h = d2;
        this.f25978i = d3;
        this.f25979j = d4;
        this.f25980k = d5;
        this.f25981l = d9;
        this.f25982m = d10;
    }

    /* renamed from: a */
    public static zzdtd m19861a(ByteBuffer byteBuffer) {
        double dM17398e = zzbc.m17398e(byteBuffer);
        double dM17398e2 = zzbc.m17398e(byteBuffer);
        double dM17399f = zzbc.m17399f(byteBuffer);
        return new zzdtd(dM17398e, dM17398e2, zzbc.m17398e(byteBuffer), zzbc.m17398e(byteBuffer), dM17399f, zzbc.m17399f(byteBuffer), zzbc.m17399f(byteBuffer), zzbc.m17398e(byteBuffer), zzbc.m17398e(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdtd.class != obj.getClass()) {
            return false;
        }
        zzdtd zzdtdVar = (zzdtd) obj;
        return Double.compare(zzdtdVar.f25977h, this.f25977h) == 0 && Double.compare(zzdtdVar.f25978i, this.f25978i) == 0 && Double.compare(zzdtdVar.f25979j, this.f25979j) == 0 && Double.compare(zzdtdVar.f25980k, this.f25980k) == 0 && Double.compare(zzdtdVar.f25981l, this.f25981l) == 0 && Double.compare(zzdtdVar.f25982m, this.f25982m) == 0 && Double.compare(zzdtdVar.f25974e, this.f25974e) == 0 && Double.compare(zzdtdVar.f25975f, this.f25975f) == 0 && Double.compare(zzdtdVar.f25976g, this.f25976g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f25974e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f25975f);
        int i2 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f25976g);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f25977h);
        int i4 = (i3 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f25978i);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f25979j);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f25980k);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f25981l);
        int i8 = (i7 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f25982m);
        return (i8 * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f25970a)) {
            return "Rotate 0°";
        }
        if (equals(f25971b)) {
            return "Rotate 90°";
        }
        if (equals(f25972c)) {
            return "Rotate 180°";
        }
        if (equals(f25973d)) {
            return "Rotate 270°";
        }
        double d2 = this.f25974e;
        double d3 = this.f25975f;
        double d4 = this.f25976g;
        double d5 = this.f25977h;
        double d6 = this.f25978i;
        double d7 = this.f25979j;
        double d8 = this.f25980k;
        double d9 = this.f25981l;
        double d10 = this.f25982m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
