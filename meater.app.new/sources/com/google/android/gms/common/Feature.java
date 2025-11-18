package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f17205f;

    /* renamed from: g */
    @SafeParcelable.Field
    @Deprecated
    private final int f17206g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final long f17207h;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j2) {
        this.f17205f = str;
        this.f17206g = i2;
        this.f17207h = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m13800y() != null && m13800y().equals(feature.m13800y())) || (m13800y() == null && feature.m13800y() == null)) && m13801z() == feature.m13801z()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m14356b(m13800y(), Long.valueOf(m13801z()));
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperM14357c = Objects.m14357c(this);
        toStringHelperM14357c.m14358a("name", m13800y());
        toStringHelperM14357c.m14358a("version", Long.valueOf(m13801z()));
        return toStringHelperM14357c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, m13800y(), false);
        SafeParcelWriter.m14477l(parcel, 2, this.f17206g);
        SafeParcelWriter.m14481p(parcel, 3, m13801z());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public String m13800y() {
        return this.f17205f;
    }

    @KeepForSdk
    /* renamed from: z */
    public long m13801z() {
        long j2 = this.f17207h;
        return j2 == -1 ? this.f17206g : j2;
    }
}
