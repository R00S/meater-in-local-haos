package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new zzxu();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f27398f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f27399g;

    @SafeParcelable.Constructor
    public zzxt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f27398f = str;
        this.f27399g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f27398f, false);
        SafeParcelWriter.m14486u(parcel, 2, this.f27399g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
