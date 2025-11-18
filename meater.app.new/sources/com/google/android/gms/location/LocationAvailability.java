package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzaa();

    /* renamed from: f */
    @SafeParcelable.Field
    @Deprecated
    private int f28466f;

    /* renamed from: g */
    @SafeParcelable.Field
    @Deprecated
    private int f28467g;

    /* renamed from: h */
    @SafeParcelable.Field
    private long f28468h;

    /* renamed from: i */
    @SafeParcelable.Field
    private int f28469i;

    /* renamed from: j */
    @SafeParcelable.Field
    private zzaj[] f28470j;

    @SafeParcelable.Constructor
    LocationAvailability(@SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 5) zzaj[] zzajVarArr) {
        this.f28469i = i2;
        this.f28466f = i3;
        this.f28467g = i4;
        this.f28468h = j2;
        this.f28470j = zzajVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f28466f == locationAvailability.f28466f && this.f28467g == locationAvailability.f28467g && this.f28468h == locationAvailability.f28468h && this.f28469i == locationAvailability.f28469i && Arrays.equals(this.f28470j, locationAvailability.f28470j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f28469i), Integer.valueOf(this.f28466f), Integer.valueOf(this.f28467g), Long.valueOf(this.f28468h), this.f28470j);
    }

    public final String toString() {
        boolean zM22644y = m22644y();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(zM22644y);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f28466f);
        SafeParcelWriter.m14477l(parcel, 2, this.f28467g);
        SafeParcelWriter.m14481p(parcel, 3, this.f28468h);
        SafeParcelWriter.m14477l(parcel, 4, this.f28469i);
        SafeParcelWriter.m14489x(parcel, 5, this.f28470j, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final boolean m22644y() {
        return this.f28469i < 1000;
    }
}
