package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new zzc();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f29439f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final byte[] f29440g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f29441h;

    @SafeParcelable.Constructor
    public HarmfulAppsData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i2) {
        this.f29439f = str;
        this.f29440g = bArr;
        this.f29441h = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f29439f, false);
        SafeParcelWriter.m14471f(parcel, 3, this.f29440g, false);
        SafeParcelWriter.m14477l(parcel, 4, this.f29441h);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
