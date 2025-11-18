package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f27506f = 1;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f27507g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final PendingIntent f27508h;

    @SafeParcelable.Constructor
    zzah(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.f27507g = (String) Preconditions.m14372k(str);
        this.f27508h = (PendingIntent) Preconditions.m14372k(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27506f);
        SafeParcelWriter.m14486u(parcel, 2, this.f27507g, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f27508h, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
