package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17072f;

    /* renamed from: g */
    @SafeParcelable.Field
    private int f17073g;

    /* renamed from: h */
    @SafeParcelable.Field
    private Bundle f17074h;

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) Bundle bundle) {
        this.f17072f = i2;
        this.f17073g = i3;
        this.f17074h = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17072f);
        SafeParcelWriter.m14477l(parcel, 2, m13696y());
        SafeParcelWriter.m14470e(parcel, 3, this.f17074h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public int m13696y() {
        return this.f17073g;
    }
}
