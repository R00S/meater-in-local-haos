package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zak();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f29485f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final ConnectionResult f29486g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final ResolveAccountResponse f29487h;

    @SafeParcelable.Constructor
    zaj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.f29485f = i2;
        this.f29486g = connectionResult;
        this.f29487h = resolveAccountResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f29485f);
        SafeParcelWriter.m14484s(parcel, 2, this.f29486g, i2, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f29487h, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final ConnectionResult m23625y() {
        return this.f29486g;
    }

    /* renamed from: z */
    public final ResolveAccountResponse m23626z() {
        return this.f29487h;
    }

    public zaj(int i2) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }
}
