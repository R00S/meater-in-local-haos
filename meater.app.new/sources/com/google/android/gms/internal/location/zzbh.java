package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@VisibleForTesting
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbh extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f27658f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final long f27659g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final short f27660h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final double f27661i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final double f27662j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final float f27663k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final int f27664l;

    /* renamed from: m */
    @SafeParcelable.Field
    private final int f27665m;

    /* renamed from: n */
    @SafeParcelable.Field
    private final int f27666n;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 3) short s, @SafeParcelable.Param(id = 4) double d2, @SafeParcelable.Param(id = 5) double d3, @SafeParcelable.Param(id = 6) float f2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 8) int i3, @SafeParcelable.Param(id = 9) int i4) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d3 > 180.0d || d3 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d3);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.f27660h = s;
        this.f27658f = str;
        this.f27661i = d2;
        this.f27662j = d3;
        this.f27663k = f2;
        this.f27659g = j2;
        this.f27664l = i5;
        this.f27665m = i3;
        this.f27666n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbhVar = (zzbh) obj;
        return this.f27663k == zzbhVar.f27663k && this.f27661i == zzbhVar.f27661i && this.f27662j == zzbhVar.f27662j && this.f27660h == zzbhVar.f27660h;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f27661i);
        int i2 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f27662j);
        return (((((((i2 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f27663k)) * 31) + this.f27660h) * 31) + this.f27664l;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f27660h != 1 ? null : "CIRCLE";
        objArr[1] = this.f27658f.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f27664l);
        objArr[3] = Double.valueOf(this.f27661i);
        objArr[4] = Double.valueOf(this.f27662j);
        objArr[5] = Float.valueOf(this.f27663k);
        objArr[6] = Integer.valueOf(this.f27665m / 1000);
        objArr[7] = Integer.valueOf(this.f27666n);
        objArr[8] = Long.valueOf(this.f27659g);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, m20964y(), false);
        SafeParcelWriter.m14481p(parcel, 2, this.f27659g);
        SafeParcelWriter.m14485t(parcel, 3, this.f27660h);
        SafeParcelWriter.m14472g(parcel, 4, this.f27661i);
        SafeParcelWriter.m14472g(parcel, 5, this.f27662j);
        SafeParcelWriter.m14474i(parcel, 6, this.f27663k);
        SafeParcelWriter.m14477l(parcel, 7, this.f27664l);
        SafeParcelWriter.m14477l(parcel, 8, this.f27665m);
        SafeParcelWriter.m14477l(parcel, 9, this.f27666n);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final String m20964y() {
        return this.f27658f;
    }
}
