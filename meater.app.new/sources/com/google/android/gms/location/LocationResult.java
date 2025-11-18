package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: g */
    @SafeParcelable.Field
    private final List<Location> f28480g;

    /* renamed from: f */
    static final List<Location> f28479f = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzac();

    @SafeParcelable.Constructor
    LocationResult(@SafeParcelable.Param(id = 1) List<Location> list) {
        this.f28480g = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f28480g.size() != this.f28480g.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f28480g.iterator();
        Iterator<Location> it2 = this.f28480g.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator<Location> it = this.f28480g.iterator();
        int i2 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i2 = (i2 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f28480g);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14490y(parcel, 1, m22646y(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final List<Location> m22646y() {
        return this.f28480g;
    }
}
