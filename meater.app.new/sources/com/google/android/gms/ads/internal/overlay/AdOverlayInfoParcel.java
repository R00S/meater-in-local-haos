package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzxr;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();

    @SafeParcelable.Field
    public final int orientation;

    @SafeParcelable.Field
    public final String url;

    @SafeParcelable.Field
    public final zzbai zzbtc;

    @SafeParcelable.Field
    public final zzxr zzcgi;

    @SafeParcelable.Field
    public final zzagv zzczo;

    @SafeParcelable.Field
    public final zzagx zzczp;

    @SafeParcelable.Field
    public final zzbgz zzdbs;

    @SafeParcelable.Field
    public final zzc zzdkl;

    @SafeParcelable.Field
    public final zzo zzdkm;

    @SafeParcelable.Field
    public final String zzdkn;

    @SafeParcelable.Field
    public final boolean zzdko;

    @SafeParcelable.Field
    public final String zzdkp;

    @SafeParcelable.Field
    public final zzu zzdkq;

    @SafeParcelable.Field
    public final int zzdkr;

    @SafeParcelable.Field
    public final String zzdks;

    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.zzh zzdkt;

    public AdOverlayInfoParcel(zzxr zzxrVar, zzo zzoVar, zzu zzuVar, zzbgz zzbgzVar, int i2, zzbai zzbaiVar, String str, com.google.android.gms.ads.internal.zzh zzhVar) {
        this.zzdkl = null;
        this.zzcgi = null;
        this.zzdkm = zzoVar;
        this.zzdbs = zzbgzVar;
        this.zzczo = null;
        this.zzczp = null;
        this.zzdkn = null;
        this.zzdko = false;
        this.zzdkp = null;
        this.zzdkq = null;
        this.orientation = i2;
        this.zzdkr = 1;
        this.url = null;
        this.zzbtc = zzbaiVar;
        this.zzdks = str;
        this.zzdkt = zzhVar;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 2, this.zzdkl, i2, false);
        SafeParcelWriter.m14476k(parcel, 3, ObjectWrapper.m14708E0(this.zzcgi).asBinder(), false);
        SafeParcelWriter.m14476k(parcel, 4, ObjectWrapper.m14708E0(this.zzdkm).asBinder(), false);
        SafeParcelWriter.m14476k(parcel, 5, ObjectWrapper.m14708E0(this.zzdbs).asBinder(), false);
        SafeParcelWriter.m14476k(parcel, 6, ObjectWrapper.m14708E0(this.zzczp).asBinder(), false);
        SafeParcelWriter.m14486u(parcel, 7, this.zzdkn, false);
        SafeParcelWriter.m14468c(parcel, 8, this.zzdko);
        SafeParcelWriter.m14486u(parcel, 9, this.zzdkp, false);
        SafeParcelWriter.m14476k(parcel, 10, ObjectWrapper.m14708E0(this.zzdkq).asBinder(), false);
        SafeParcelWriter.m14477l(parcel, 11, this.orientation);
        SafeParcelWriter.m14477l(parcel, 12, this.zzdkr);
        SafeParcelWriter.m14486u(parcel, 13, this.url, false);
        SafeParcelWriter.m14484s(parcel, 14, this.zzbtc, i2, false);
        SafeParcelWriter.m14486u(parcel, 16, this.zzdks, false);
        SafeParcelWriter.m14484s(parcel, 17, this.zzdkt, i2, false);
        SafeParcelWriter.m14476k(parcel, 18, ObjectWrapper.m14708E0(this.zzczo).asBinder(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public AdOverlayInfoParcel(zzxr zzxrVar, zzo zzoVar, zzu zzuVar, zzbgz zzbgzVar, boolean z, int i2, zzbai zzbaiVar) {
        this.zzdkl = null;
        this.zzcgi = zzxrVar;
        this.zzdkm = zzoVar;
        this.zzdbs = zzbgzVar;
        this.zzczo = null;
        this.zzczp = null;
        this.zzdkn = null;
        this.zzdko = z;
        this.zzdkp = null;
        this.zzdkq = zzuVar;
        this.orientation = i2;
        this.zzdkr = 2;
        this.url = null;
        this.zzbtc = zzbaiVar;
        this.zzdks = null;
        this.zzdkt = null;
    }

    public AdOverlayInfoParcel(zzxr zzxrVar, zzo zzoVar, zzagv zzagvVar, zzagx zzagxVar, zzu zzuVar, zzbgz zzbgzVar, boolean z, int i2, String str, zzbai zzbaiVar) {
        this.zzdkl = null;
        this.zzcgi = zzxrVar;
        this.zzdkm = zzoVar;
        this.zzdbs = zzbgzVar;
        this.zzczo = zzagvVar;
        this.zzczp = zzagxVar;
        this.zzdkn = null;
        this.zzdko = z;
        this.zzdkp = null;
        this.zzdkq = zzuVar;
        this.orientation = i2;
        this.zzdkr = 3;
        this.url = str;
        this.zzbtc = zzbaiVar;
        this.zzdks = null;
        this.zzdkt = null;
    }

    public AdOverlayInfoParcel(zzxr zzxrVar, zzo zzoVar, zzagv zzagvVar, zzagx zzagxVar, zzu zzuVar, zzbgz zzbgzVar, boolean z, int i2, String str, String str2, zzbai zzbaiVar) {
        this.zzdkl = null;
        this.zzcgi = zzxrVar;
        this.zzdkm = zzoVar;
        this.zzdbs = zzbgzVar;
        this.zzczo = zzagvVar;
        this.zzczp = zzagxVar;
        this.zzdkn = str2;
        this.zzdko = z;
        this.zzdkp = str;
        this.zzdkq = zzuVar;
        this.orientation = i2;
        this.zzdkr = 3;
        this.url = null;
        this.zzbtc = zzbaiVar;
        this.zzdks = null;
        this.zzdkt = null;
    }

    public AdOverlayInfoParcel(zzc zzcVar, zzxr zzxrVar, zzo zzoVar, zzu zzuVar, zzbai zzbaiVar) {
        this.zzdkl = zzcVar;
        this.zzcgi = zzxrVar;
        this.zzdkm = zzoVar;
        this.zzdbs = null;
        this.zzczo = null;
        this.zzczp = null;
        this.zzdkn = null;
        this.zzdko = false;
        this.zzdkp = null;
        this.zzdkq = zzuVar;
        this.orientation = -1;
        this.zzdkr = 4;
        this.url = null;
        this.zzbtc = zzbaiVar;
        this.zzdks = null;
        this.zzdkt = null;
    }

    @SafeParcelable.Constructor
    AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzcVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 12) int i3, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) zzbai zzbaiVar, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzh zzhVar, @SafeParcelable.Param(id = 18) IBinder iBinder6) {
        this.zzdkl = zzcVar;
        this.zzcgi = (zzxr) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder));
        this.zzdkm = (zzo) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder2));
        this.zzdbs = (zzbgz) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder3));
        this.zzczo = (zzagv) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder6));
        this.zzczp = (zzagx) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder4));
        this.zzdkn = str;
        this.zzdko = z;
        this.zzdkp = str2;
        this.zzdkq = (zzu) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder5));
        this.orientation = i2;
        this.zzdkr = i3;
        this.url = str3;
        this.zzbtc = zzbaiVar;
        this.zzdks = str4;
        this.zzdkt = zzhVar;
    }
}
