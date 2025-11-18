package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f27569f = 1;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f27570g;

    @SafeParcelable.Constructor
    zzv(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str) {
        this.f27570g = (String) Preconditions.m14372k(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27569f);
        SafeParcelWriter.m14486u(parcel, 2, this.f27570g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
