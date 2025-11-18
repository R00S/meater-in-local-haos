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
public final class zzaax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaax> CREATOR = new zzaay();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f21492f;

    @SafeParcelable.Constructor
    public zzaax(@SafeParcelable.Param(id = 2) int i2) {
        this.f21492f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 2, this.f21492f);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
