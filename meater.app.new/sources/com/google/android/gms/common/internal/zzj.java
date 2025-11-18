package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* renamed from: f */
    @SafeParcelable.Field
    Bundle f17857f;

    /* renamed from: g */
    @SafeParcelable.Field
    Feature[] f17858g;

    /* renamed from: h */
    @SafeParcelable.Field
    int f17859h;

    /* renamed from: i */
    @SafeParcelable.Field
    ConnectionTelemetryConfiguration f17860i;

    public zzj() {
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Feature[] featureArr, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f17857f = bundle;
        this.f17858g = featureArr;
        this.f17859h = i2;
        this.f17860i = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14470e(parcel, 1, this.f17857f, false);
        SafeParcelWriter.m14489x(parcel, 2, this.f17858g, i2, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f17859h);
        SafeParcelWriter.m14484s(parcel, 4, this.f17860i, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
