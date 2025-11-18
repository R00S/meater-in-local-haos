package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaic extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaid();

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f22051f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f22052g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f22053h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final byte[] f22054i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final String[] f22055j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final String[] f22056k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final boolean f22057l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final long f22058m;

    @SafeParcelable.Constructor
    zzaic(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String[] strArr, @SafeParcelable.Param(id = 6) String[] strArr2, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) long j2) {
        this.f22051f = z;
        this.f22052g = str;
        this.f22053h = i2;
        this.f22054i = bArr;
        this.f22055j = strArr;
        this.f22056k = strArr2;
        this.f22057l = z2;
        this.f22058m = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, this.f22051f);
        SafeParcelWriter.m14486u(parcel, 2, this.f22052g, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f22053h);
        SafeParcelWriter.m14471f(parcel, 4, this.f22054i, false);
        SafeParcelWriter.m14487v(parcel, 5, this.f22055j, false);
        SafeParcelWriter.m14487v(parcel, 6, this.f22056k, false);
        SafeParcelWriter.m14468c(parcel, 7, this.f22057l);
        SafeParcelWriter.m14481p(parcel, 8, this.f22058m);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
