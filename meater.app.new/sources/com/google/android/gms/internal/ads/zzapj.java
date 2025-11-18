package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzapj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzapj> CREATOR = new zzapk();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f22217f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final int f22218g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f22219h;

    @SafeParcelable.Constructor
    zzapj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4) {
        this.f22217f = i2;
        this.f22218g = i3;
        this.f22219h = i4;
    }

    /* renamed from: y */
    public static zzapj m16830y(VersionInfo versionInfo) {
        return new zzapj(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final String toString() {
        int i2 = this.f22217f;
        int i3 = this.f22218g;
        int i4 = this.f22219h;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f22217f);
        SafeParcelWriter.m14477l(parcel, 2, this.f22218g);
        SafeParcelWriter.m14477l(parcel, 3, this.f22219h);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
