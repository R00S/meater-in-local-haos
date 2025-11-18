package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzy;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();

    /* renamed from: f */
    @SafeParcelable.Field
    private int f27652f;

    /* renamed from: g */
    @SafeParcelable.Field
    private zzbd f27653g;

    /* renamed from: h */
    @SafeParcelable.Field
    private zzx f27654h;

    /* renamed from: i */
    @SafeParcelable.Field
    private PendingIntent f27655i;

    /* renamed from: j */
    @SafeParcelable.Field
    private zzu f27656j;

    /* renamed from: k */
    @SafeParcelable.Field
    private zzaj f27657k;

    @SafeParcelable.Constructor
    zzbf(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) zzbd zzbdVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 5) IBinder iBinder2, @SafeParcelable.Param(id = 6) IBinder iBinder3) {
        this.f27652f = i2;
        this.f27653g = zzbdVar;
        zzaj zzalVar = null;
        this.f27654h = iBinder == null ? null : zzy.m22658P(iBinder);
        this.f27655i = pendingIntent;
        this.f27656j = iBinder2 == null ? null : zzv.m22657P(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzalVar = iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzal(iBinder3);
        }
        this.f27657k = zzalVar;
    }

    /* renamed from: y */
    public static zzbf m20962y(zzu zzuVar, zzaj zzajVar) {
        return new zzbf(2, null, null, null, zzuVar.asBinder(), zzajVar != null ? zzajVar.asBinder() : null);
    }

    /* renamed from: z */
    public static zzbf m20963z(zzx zzxVar, zzaj zzajVar) {
        return new zzbf(2, null, zzxVar.asBinder(), null, null, zzajVar != null ? zzajVar.asBinder() : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f27652f);
        SafeParcelWriter.m14484s(parcel, 2, this.f27653g, i2, false);
        zzx zzxVar = this.f27654h;
        SafeParcelWriter.m14476k(parcel, 3, zzxVar == null ? null : zzxVar.asBinder(), false);
        SafeParcelWriter.m14484s(parcel, 4, this.f27655i, i2, false);
        zzu zzuVar = this.f27656j;
        SafeParcelWriter.m14476k(parcel, 5, zzuVar == null ? null : zzuVar.asBinder(), false);
        zzaj zzajVar = this.f27657k;
        SafeParcelWriter.m14476k(parcel, 6, zzajVar != null ? zzajVar.asBinder() : null, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
