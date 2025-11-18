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
public final class zzarz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarz> CREATOR = new zzasa();

    /* renamed from: f */
    @SafeParcelable.Field
    String f22420f;

    @SafeParcelable.Constructor
    public zzarz(@SafeParcelable.Param(id = 2) String str) {
        this.f22420f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f22420f, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
