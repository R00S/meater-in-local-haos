package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzdbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdbb> CREATOR = new zzdbc();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f25451f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f25452g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f25453h;

    @SafeParcelable.Constructor
    zzdbb(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.f25451f = i2;
        this.f25452g = str;
        this.f25453h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f25451f);
        SafeParcelWriter.m14486u(parcel, 2, this.f25452g, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f25453h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzdbb(String str, String str2) {
        this(1, str, str2);
    }
}
