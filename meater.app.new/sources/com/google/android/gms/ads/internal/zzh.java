package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzard;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Field
    public final boolean zzbre;

    @SafeParcelable.Field
    public final boolean zzbrf;

    @SafeParcelable.Field
    private final String zzbrg;

    @SafeParcelable.Field
    public final boolean zzbrh;

    @SafeParcelable.Field
    public final float zzbri;

    @SafeParcelable.Field
    public final int zzbrj;

    @SafeParcelable.Field
    public final boolean zzbrk;

    @SafeParcelable.Field
    public final boolean zzbrl;

    @SafeParcelable.Field
    public final boolean zzbrm;

    public zzh(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(false, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 2, this.zzbre);
        SafeParcelWriter.m14468c(parcel, 3, this.zzbrf);
        SafeParcelWriter.m14486u(parcel, 4, this.zzbrg, false);
        SafeParcelWriter.m14468c(parcel, 5, this.zzbrh);
        SafeParcelWriter.m14474i(parcel, 6, this.zzbri);
        SafeParcelWriter.m14477l(parcel, 7, this.zzbrj);
        SafeParcelWriter.m14468c(parcel, 8, this.zzbrk);
        SafeParcelWriter.m14468c(parcel, 9, this.zzbrl);
        SafeParcelWriter.m14468c(parcel, 10, this.zzbrm);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    zzh(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) float f2, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6) {
        this.zzbre = z;
        this.zzbrf = z2;
        this.zzbrg = str;
        this.zzbrh = z3;
        this.zzbri = f2;
        this.zzbrj = i2;
        this.zzbrk = z4;
        this.zzbrl = z5;
        this.zzbrm = z6;
    }
}
