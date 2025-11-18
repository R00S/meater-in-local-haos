package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaio extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaio> CREATOR = new zzaip();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f22061f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f22062g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f22063h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final String f22064i;

    @SafeParcelable.Constructor
    public zzaio(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) String str2) {
        this.f22061f = str;
        this.f22062g = z;
        this.f22063h = i2;
        this.f22064i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f22061f, false);
        SafeParcelWriter.m14468c(parcel, 2, this.f22062g);
        SafeParcelWriter.m14477l(parcel, 3, this.f22063h);
        SafeParcelWriter.m14486u(parcel, 4, this.f22064i, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
