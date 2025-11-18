package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzy();

    /* renamed from: f */
    @SafeParcelable.Field
    public final long f28389f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final long f28390g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final boolean f28391h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final String f28392i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final String f28393j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final String f28394k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final Bundle f28395l;

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) long j3, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Bundle bundle) {
        this.f28389f = j2;
        this.f28390g = j3;
        this.f28391h = z;
        this.f28392i = str;
        this.f28393j = str2;
        this.f28394k = str3;
        this.f28395l = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14481p(parcel, 1, this.f28389f);
        SafeParcelWriter.m14481p(parcel, 2, this.f28390g);
        SafeParcelWriter.m14468c(parcel, 3, this.f28391h);
        SafeParcelWriter.m14486u(parcel, 4, this.f28392i, false);
        SafeParcelWriter.m14486u(parcel, 5, this.f28393j, false);
        SafeParcelWriter.m14486u(parcel, 6, this.f28394k, false);
        SafeParcelWriter.m14470e(parcel, 7, this.f28395l, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
