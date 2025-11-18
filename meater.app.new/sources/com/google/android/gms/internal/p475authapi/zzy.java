package com.google.android.gms.internal.p475authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();

    /* renamed from: f */
    @SafeParcelable.Field
    private final Credential f27495f;

    @SafeParcelable.Constructor
    public zzy(@SafeParcelable.Param(id = 1) Credential credential) {
        this.f27495f = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, this.f27495f, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
