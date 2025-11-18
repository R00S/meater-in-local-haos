package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* renamed from: f */
    @SafeParcelable.Field
    private boolean f28517f;

    /* renamed from: g */
    @SafeParcelable.Field
    private long f28518g;

    /* renamed from: h */
    @SafeParcelable.Field
    private float f28519h;

    /* renamed from: i */
    @SafeParcelable.Field
    private long f28520i;

    /* renamed from: j */
    @SafeParcelable.Field
    private int f28521j;

    public zzj() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) float f2, @SafeParcelable.Param(id = 4) long j3, @SafeParcelable.Param(id = 5) int i2) {
        this.f28517f = z;
        this.f28518g = j2;
        this.f28519h = f2;
        this.f28520i = j3;
        this.f28521j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return this.f28517f == zzjVar.f28517f && this.f28518g == zzjVar.f28518g && Float.compare(this.f28519h, zzjVar.f28519h) == 0 && this.f28520i == zzjVar.f28520i && this.f28521j == zzjVar.f28521j;
    }

    public final int hashCode() {
        return Objects.m14356b(Boolean.valueOf(this.f28517f), Long.valueOf(this.f28518g), Float.valueOf(this.f28519h), Long.valueOf(this.f28520i), Integer.valueOf(this.f28521j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f28517f);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f28518g);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f28519h);
        long j2 = this.f28520i;
        if (j2 != Long.MAX_VALUE) {
            long jElapsedRealtime = j2 - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f28521j != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f28521j);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, this.f28517f);
        SafeParcelWriter.m14481p(parcel, 2, this.f28518g);
        SafeParcelWriter.m14474i(parcel, 3, this.f28519h);
        SafeParcelWriter.m14481p(parcel, 4, this.f28520i);
        SafeParcelWriter.m14477l(parcel, 5, this.f28521j);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
