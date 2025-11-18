package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zaj();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17953f;

    /* renamed from: g */
    @SafeParcelable.Field
    final String f17954g;

    /* renamed from: h */
    @SafeParcelable.Field
    final FastJsonResponse.Field<?, ?> f17955h;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) FastJsonResponse.Field<?, ?> field) {
        this.f17953f = i2;
        this.f17954g = str;
        this.f17955h = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17953f);
        SafeParcelWriter.m14486u(parcel, 2, this.f17954g, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f17955h, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f17953f = 1;
        this.f17954g = str;
        this.f17955h = field;
    }
}
