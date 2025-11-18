package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzath extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzath> CREATOR = new zzati();

    /* renamed from: f */
    @SafeParcelable.Field
    public final zzxz f22507f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f22508g;

    @SafeParcelable.Constructor
    public zzath(@SafeParcelable.Param(id = 2) zzxz zzxzVar, @SafeParcelable.Param(id = 3) String str) {
        this.f22507f = zzxzVar;
        this.f22508g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 2, this.f22507f, i2, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f22508g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
