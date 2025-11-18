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
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();

    /* renamed from: f */
    @SafeParcelable.Field
    private final RootTelemetryConfiguration f17723f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f17724g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f17725h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final int[] f17726i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final int f17727j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final int[] f17728k;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@SafeParcelable.Param(id = 1) RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) int[] iArr, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) int[] iArr2) {
        this.f17723f = rootTelemetryConfiguration;
        this.f17724g = z;
        this.f17725h = z2;
        this.f17726i = iArr;
        this.f17727j = i2;
        this.f17728k = iArr2;
    }

    @KeepForSdk
    /* renamed from: W */
    public int[] m14315W() {
        return this.f17728k;
    }

    @KeepForSdk
    /* renamed from: Y */
    public boolean m14316Y() {
        return this.f17724g;
    }

    @KeepForSdk
    /* renamed from: e0 */
    public boolean m14317e0() {
        return this.f17725h;
    }

    /* renamed from: i0 */
    public final RootTelemetryConfiguration m14318i0() {
        return this.f17723f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, this.f17723f, i2, false);
        SafeParcelWriter.m14468c(parcel, 2, m14316Y());
        SafeParcelWriter.m14468c(parcel, 3, m14317e0());
        SafeParcelWriter.m14478m(parcel, 4, m14320z(), false);
        SafeParcelWriter.m14477l(parcel, 5, m14319y());
        SafeParcelWriter.m14478m(parcel, 6, m14315W(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public int m14319y() {
        return this.f17727j;
    }

    @KeepForSdk
    /* renamed from: z */
    public int[] m14320z() {
        return this.f17726i;
    }
}
