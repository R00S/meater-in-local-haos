package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzai();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f17788f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f17789g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f17790h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final int f17791i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final int f17792j;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) int i4) {
        this.f17788f = i2;
        this.f17789g = z;
        this.f17790h = z2;
        this.f17791i = i3;
        this.f17792j = i4;
    }

    @KeepForSdk
    /* renamed from: W */
    public boolean m14386W() {
        return this.f17789g;
    }

    @KeepForSdk
    /* renamed from: Y */
    public boolean m14387Y() {
        return this.f17790h;
    }

    @KeepForSdk
    /* renamed from: e0 */
    public int m14388e0() {
        return this.f17788f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, m14388e0());
        SafeParcelWriter.m14468c(parcel, 2, m14386W());
        SafeParcelWriter.m14468c(parcel, 3, m14387Y());
        SafeParcelWriter.m14477l(parcel, 4, m14389y());
        SafeParcelWriter.m14477l(parcel, 5, m14390z());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public int m14389y() {
        return this.f17791i;
    }

    @KeepForSdk
    /* renamed from: z */
    public int m14390z() {
        return this.f17792j;
    }
}
