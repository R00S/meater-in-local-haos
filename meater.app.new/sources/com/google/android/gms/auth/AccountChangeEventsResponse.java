package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f16882f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final List<AccountChangeEvent> f16883g;

    @SafeParcelable.Constructor
    AccountChangeEventsResponse(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) List<AccountChangeEvent> list) {
        this.f16882f = i2;
        this.f16883g = (List) Preconditions.m14372k(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f16882f);
        SafeParcelWriter.m14490y(parcel, 2, this.f16883g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
