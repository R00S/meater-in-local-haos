package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f27503f = 1;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f27504g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final byte[] f27505h;

    @SafeParcelable.Constructor
    zzaf(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.f27504g = (String) Preconditions.m14372k(str);
        this.f27505h = (byte[]) Preconditions.m14372k(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27503f);
        SafeParcelWriter.m14486u(parcel, 2, this.f27504g, false);
        SafeParcelWriter.m14471f(parcel, 3, this.f27505h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
