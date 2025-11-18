package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: f */
    @SafeParcelable.Field
    private int f27675f;

    /* renamed from: g */
    @SafeParcelable.Field
    private zzm f27676g;

    /* renamed from: h */
    @SafeParcelable.Field
    private zzr f27677h;

    /* renamed from: i */
    @SafeParcelable.Field
    private zzaj f27678i;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) zzm zzmVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        this.f27675f = i2;
        this.f27676g = zzmVar;
        zzaj zzalVar = null;
        this.f27677h = iBinder == null ? null : zzs.m22656P(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzalVar = iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzal(iBinder2);
        }
        this.f27678i = zzalVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27675f);
        SafeParcelWriter.m14484s(parcel, 2, this.f27676g, i2, false);
        zzr zzrVar = this.f27677h;
        SafeParcelWriter.m14476k(parcel, 3, zzrVar == null ? null : zzrVar.asBinder(), false);
        zzaj zzajVar = this.f27678i;
        SafeParcelWriter.m14476k(parcel, 4, zzajVar != null ? zzajVar.asBinder() : null, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
