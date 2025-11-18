package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f28507f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f28508g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f28509h;

    @SafeParcelable.Constructor
    zzae(@SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 1) String str2, @SafeParcelable.Param(id = 2) String str3) {
        this.f28509h = str;
        this.f28507f = str2;
        this.f28508g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f28507f, false);
        SafeParcelWriter.m14486u(parcel, 2, this.f28508g, false);
        SafeParcelWriter.m14486u(parcel, 5, this.f28509h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
