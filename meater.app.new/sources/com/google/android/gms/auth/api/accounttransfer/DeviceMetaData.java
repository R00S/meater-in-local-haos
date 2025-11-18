package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzv();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f16925f;

    /* renamed from: g */
    @SafeParcelable.Field
    private boolean f16926g;

    /* renamed from: h */
    @SafeParcelable.Field
    private long f16927h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final boolean f16928i;

    @SafeParcelable.Constructor
    DeviceMetaData(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f16925f = i2;
        this.f16926g = z;
        this.f16927h = j2;
        this.f16928i = z2;
    }

    /* renamed from: W */
    public boolean m13607W() {
        return this.f16926g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f16925f);
        SafeParcelWriter.m14468c(parcel, 2, m13607W());
        SafeParcelWriter.m14481p(parcel, 3, m13608y());
        SafeParcelWriter.m14468c(parcel, 4, m13609z());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public long m13608y() {
        return this.f16927h;
    }

    /* renamed from: z */
    public boolean m13609z() {
        return this.f16928i;
    }
}
