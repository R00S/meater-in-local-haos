package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaiy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiy> CREATOR = new zzaiz();

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f22067f;

    @SafeParcelable.Constructor
    public zzaiy(@SafeParcelable.Param(id = 1) int i2) {
        this.f22067f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f22067f);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
