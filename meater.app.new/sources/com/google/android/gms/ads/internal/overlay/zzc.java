package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
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
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();

    @SafeParcelable.Field
    public final Intent intent;

    @SafeParcelable.Field
    public final String mimeType;

    @SafeParcelable.Field
    public final String packageName;

    @SafeParcelable.Field
    public final String url;

    @SafeParcelable.Field
    private final String zzdjg;

    @SafeParcelable.Field
    public final String zzdjh;

    @SafeParcelable.Field
    public final String zzdji;

    @SafeParcelable.Field
    private final String zzdjj;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.zzdjg, false);
        SafeParcelWriter.m14486u(parcel, 3, this.url, false);
        SafeParcelWriter.m14486u(parcel, 4, this.mimeType, false);
        SafeParcelWriter.m14486u(parcel, 5, this.packageName, false);
        SafeParcelWriter.m14486u(parcel, 6, this.zzdjh, false);
        SafeParcelWriter.m14486u(parcel, 7, this.zzdji, false);
        SafeParcelWriter.m14486u(parcel, 8, this.zzdjj, false);
        SafeParcelWriter.m14484s(parcel, 9, this.intent, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) Intent intent) {
        this.zzdjg = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzdjh = str5;
        this.zzdji = str6;
        this.zzdjj = str7;
        this.intent = intent;
    }
}
