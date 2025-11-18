package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import okhttp3.HttpUrl;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaym extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaym> CREATOR = new zzayo();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f22683f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final int f22684g;

    @SafeParcelable.Constructor
    zzaym(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2) {
        this.f22683f = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f22684g = i2;
    }

    /* renamed from: y */
    public static zzaym m17245y(Throwable th, int i2) {
        return new zzaym(th.getMessage(), i2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f22683f, false);
        SafeParcelWriter.m14477l(parcel, 2, this.f22684g);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
