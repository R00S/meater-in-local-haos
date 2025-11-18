package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzab();

    /* renamed from: f */
    @SafeParcelable.Field
    private int f28471f;

    /* renamed from: g */
    @SafeParcelable.Field
    private long f28472g;

    /* renamed from: h */
    @SafeParcelable.Field
    private long f28473h;

    /* renamed from: i */
    @SafeParcelable.Field
    private boolean f28474i;

    /* renamed from: j */
    @SafeParcelable.Field
    private long f28475j;

    /* renamed from: k */
    @SafeParcelable.Field
    private int f28476k;

    /* renamed from: l */
    @SafeParcelable.Field
    private float f28477l;

    /* renamed from: m */
    @SafeParcelable.Field
    private long f28478m;

    public LocationRequest() {
        this.f28471f = 102;
        this.f28472g = 3600000L;
        this.f28473h = 600000L;
        this.f28474i = false;
        this.f28475j = Long.MAX_VALUE;
        this.f28476k = Integer.MAX_VALUE;
        this.f28477l = 0.0f;
        this.f28478m = 0L;
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) long j3, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) long j4, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) long j5) {
        this.f28471f = i2;
        this.f28472g = j2;
        this.f28473h = j3;
        this.f28474i = z;
        this.f28475j = j4;
        this.f28476k = i3;
        this.f28477l = f2;
        this.f28478m = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f28471f == locationRequest.f28471f && this.f28472g == locationRequest.f28472g && this.f28473h == locationRequest.f28473h && this.f28474i == locationRequest.f28474i && this.f28475j == locationRequest.f28475j && this.f28476k == locationRequest.f28476k && this.f28477l == locationRequest.f28477l && m22645y() == locationRequest.m22645y();
    }

    public final int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f28471f), Long.valueOf(this.f28472g), Float.valueOf(this.f28477l), Long.valueOf(this.f28478m));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i2 = this.f28471f;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f28471f != 105) {
            sb.append(" requested=");
            sb.append(this.f28472g);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f28473h);
        sb.append("ms");
        if (this.f28478m > this.f28472g) {
            sb.append(" maxWait=");
            sb.append(this.f28478m);
            sb.append("ms");
        }
        if (this.f28477l > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f28477l);
            sb.append("m");
        }
        long j2 = this.f28475j;
        if (j2 != Long.MAX_VALUE) {
            long jElapsedRealtime = j2 - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f28476k != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f28476k);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f28471f);
        SafeParcelWriter.m14481p(parcel, 2, this.f28472g);
        SafeParcelWriter.m14481p(parcel, 3, this.f28473h);
        SafeParcelWriter.m14468c(parcel, 4, this.f28474i);
        SafeParcelWriter.m14481p(parcel, 5, this.f28475j);
        SafeParcelWriter.m14477l(parcel, 6, this.f28476k);
        SafeParcelWriter.m14474i(parcel, 7, this.f28477l);
        SafeParcelWriter.m14481p(parcel, 8, this.f28478m);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final long m22645y() {
        long j2 = this.f28478m;
        long j3 = this.f28472g;
        return j2 < j3 ? j3 : j2;
    }
}
