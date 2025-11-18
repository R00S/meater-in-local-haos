package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaiw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiw> CREATOR = new zzaix();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f22065f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final Bundle f22066g;

    @SafeParcelable.Constructor
    public zzaiw(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f22065f = str;
        this.f22066g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f22065f, false);
        SafeParcelWriter.m14470e(parcel, 2, this.f22066g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
