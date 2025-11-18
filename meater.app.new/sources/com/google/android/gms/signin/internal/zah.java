package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new zai();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f29483f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final ResolveAccountRequest f29484g;

    @SafeParcelable.Constructor
    zah(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.f29483f = i2;
        this.f29484g = resolveAccountRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f29483f);
        SafeParcelWriter.m14484s(parcel, 2, this.f29484g, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }
}
