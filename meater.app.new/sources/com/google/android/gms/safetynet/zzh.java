package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f29461f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f29462g;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z) {
        this.f29461f = i2;
        this.f29462g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 2, this.f29461f);
        SafeParcelWriter.m14468c(parcel, 3, this.f29462g);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
