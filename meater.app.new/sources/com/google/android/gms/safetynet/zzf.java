package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f29460f;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 2) String str) {
        this.f29460f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f29460f, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
