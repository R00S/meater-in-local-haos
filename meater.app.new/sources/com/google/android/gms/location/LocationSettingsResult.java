package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzah();

    /* renamed from: f */
    @SafeParcelable.Field
    private final Status f28495f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final LocationSettingsStates f28496g;

    @SafeParcelable.Constructor
    public LocationSettingsResult(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) LocationSettingsStates locationSettingsStates) {
        this.f28495f = status;
        this.f28496g = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f28495f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, getStatus(), i2, false);
        SafeParcelWriter.m14484s(parcel, 2, m22647y(), i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final LocationSettingsStates m22647y() {
        return this.f28496g;
    }
}
