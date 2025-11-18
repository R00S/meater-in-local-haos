package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzaca extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaca> CREATOR = new zzacb();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f21572f;

    public zzaca(SearchAdRequest searchAdRequest) {
        this.f21572f = searchAdRequest.getQuery();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 15, this.f21572f, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    zzaca(@SafeParcelable.Param(id = 15) String str) {
        this.f21572f = str;
    }
}
