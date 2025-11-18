package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17016f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final int f17017g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final PendingIntent f17018h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final int f17019i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final Bundle f17020j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final byte[] f17021k;

    @SafeParcelable.Constructor
    ProxyResponse(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) byte[] bArr) {
        this.f17016f = i2;
        this.f17017g = i3;
        this.f17019i = i4;
        this.f17020j = bundle;
        this.f17021k = bArr;
        this.f17018h = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17017g);
        SafeParcelWriter.m14484s(parcel, 2, this.f17018h, i2, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f17019i);
        SafeParcelWriter.m14470e(parcel, 4, this.f17020j, false);
        SafeParcelWriter.m14471f(parcel, 5, this.f17021k, false);
        SafeParcelWriter.m14477l(parcel, 1000, this.f17016f);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
