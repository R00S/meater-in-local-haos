package com.google.android.gms.internal.location;

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
public final class zzad extends AbstractSafeParcelable implements Result {

    /* renamed from: g */
    @SafeParcelable.Field
    private final Status f27634g;

    /* renamed from: f */
    private static final zzad f27633f = new zzad(Status.f17291g);
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) Status status) {
        this.f27634g = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f27634g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, getStatus(), i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
