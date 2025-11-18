package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzai();

    /* renamed from: f */
    @SafeParcelable.Field
    private final boolean f28497f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f28498g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f28499h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final boolean f28500i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final boolean f28501j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final boolean f28502k;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6) {
        this.f28497f = z;
        this.f28498g = z2;
        this.f28499h = z3;
        this.f28500i = z4;
        this.f28501j = z5;
        this.f28502k = z6;
    }

    /* renamed from: W */
    public final boolean m22648W() {
        return this.f28500i;
    }

    /* renamed from: Y */
    public final boolean m22649Y() {
        return this.f28497f;
    }

    /* renamed from: e0 */
    public final boolean m22650e0() {
        return this.f28501j;
    }

    /* renamed from: i0 */
    public final boolean m22651i0() {
        return this.f28498g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, m22649Y());
        SafeParcelWriter.m14468c(parcel, 2, m22651i0());
        SafeParcelWriter.m14468c(parcel, 3, m22653z());
        SafeParcelWriter.m14468c(parcel, 4, m22648W());
        SafeParcelWriter.m14468c(parcel, 5, m22650e0());
        SafeParcelWriter.m14468c(parcel, 6, m22652y());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final boolean m22652y() {
        return this.f28502k;
    }

    /* renamed from: z */
    public final boolean m22653z() {
        return this.f28499h;
    }
}
