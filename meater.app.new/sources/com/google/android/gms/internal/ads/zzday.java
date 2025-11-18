package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzday extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzday> CREATOR = new zzdaz();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f25449f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final byte[] f25450g;

    @SafeParcelable.Constructor
    zzday(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f25449f = i2;
        this.f25450g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f25449f);
        SafeParcelWriter.m14471f(parcel, 2, this.f25450g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzday(byte[] bArr) {
        this(1, bArr);
    }
}
