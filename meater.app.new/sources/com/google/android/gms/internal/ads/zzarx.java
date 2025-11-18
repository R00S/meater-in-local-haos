package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzarx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarx> CREATOR = new zzary();

    /* renamed from: f */
    @SafeParcelable.Field
    public final Bundle f22411f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final zzbai f22412g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final ApplicationInfo f22413h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final String f22414i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final List<String> f22415j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final PackageInfo f22416k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final String f22417l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final boolean f22418m;

    /* renamed from: n */
    @SafeParcelable.Field
    public final String f22419n;

    @SafeParcelable.Constructor
    public zzarx(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) zzbai zzbaiVar, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str3) {
        this.f22411f = bundle;
        this.f22412g = zzbaiVar;
        this.f22414i = str;
        this.f22413h = applicationInfo;
        this.f22415j = list;
        this.f22416k = packageInfo;
        this.f22417l = str2;
        this.f22418m = z;
        this.f22419n = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14470e(parcel, 1, this.f22411f, false);
        SafeParcelWriter.m14484s(parcel, 2, this.f22412g, i2, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f22413h, i2, false);
        SafeParcelWriter.m14486u(parcel, 4, this.f22414i, false);
        SafeParcelWriter.m14488w(parcel, 5, this.f22415j, false);
        SafeParcelWriter.m14484s(parcel, 6, this.f22416k, i2, false);
        SafeParcelWriter.m14486u(parcel, 7, this.f22417l, false);
        SafeParcelWriter.m14468c(parcel, 8, this.f22418m);
        SafeParcelWriter.m14486u(parcel, 9, this.f22419n, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
