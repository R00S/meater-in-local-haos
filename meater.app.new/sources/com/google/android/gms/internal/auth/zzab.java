package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f27498f = 1;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f27499g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f27500h;

    @SafeParcelable.Constructor
    zzab(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
        this.f27499g = (String) Preconditions.m14372k(str);
        this.f27500h = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27498f);
        SafeParcelWriter.m14486u(parcel, 2, this.f27499g, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f27500h);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
