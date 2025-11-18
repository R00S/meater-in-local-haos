package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzady extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzady> CREATOR = new zzadz();

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f21961f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f21962g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f21963h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final boolean f21964i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final int f21965j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final zzacd f21966k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final boolean f21967l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final int f21968m;

    public zzady(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzacd(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzkr(), 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f21961f);
        SafeParcelWriter.m14468c(parcel, 2, this.f21962g);
        SafeParcelWriter.m14477l(parcel, 3, this.f21963h);
        SafeParcelWriter.m14468c(parcel, 4, this.f21964i);
        SafeParcelWriter.m14477l(parcel, 5, this.f21965j);
        SafeParcelWriter.m14484s(parcel, 6, this.f21966k, i2, false);
        SafeParcelWriter.m14468c(parcel, 7, this.f21967l);
        SafeParcelWriter.m14477l(parcel, 8, this.f21968m);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    public zzady(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) zzacd zzacdVar, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i5) {
        this.f21961f = i2;
        this.f21962g = z;
        this.f21963h = i3;
        this.f21964i = z2;
        this.f21965j = i4;
        this.f21966k = zzacdVar;
        this.f21967l = z3;
        this.f21968m = i5;
    }
}
