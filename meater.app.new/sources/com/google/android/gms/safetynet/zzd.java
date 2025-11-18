package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();

    /* renamed from: f */
    @SafeParcelable.Field
    public final long f29456f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final HarmfulAppsData[] f29457g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f29458h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final boolean f29459i;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z) {
        this.f29456f = j2;
        this.f29457g = harmfulAppsDataArr;
        this.f29459i = z;
        if (z) {
            this.f29458h = i2;
        } else {
            this.f29458h = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14481p(parcel, 2, this.f29456f);
        SafeParcelWriter.m14489x(parcel, 3, this.f29457g, i2, false);
        SafeParcelWriter.m14477l(parcel, 4, this.f29458h);
        SafeParcelWriter.m14468c(parcel, 5, this.f29459i);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
