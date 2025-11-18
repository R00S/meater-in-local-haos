package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzaq();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f29077f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final zzam f29078g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final String f29079h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final long f29080i;

    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzam zzamVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j2) {
        this.f29077f = str;
        this.f29078g = zzamVar;
        this.f29079h = str2;
        this.f29080i = j2;
    }

    public final String toString() {
        String str = this.f29079h;
        String str2 = this.f29077f;
        String strValueOf = String.valueOf(this.f29078g);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f29077f, false);
        SafeParcelWriter.m14484s(parcel, 3, this.f29078g, i2, false);
        SafeParcelWriter.m14486u(parcel, 4, this.f29079h, false);
        SafeParcelWriter.m14481p(parcel, 5, this.f29080i);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    zzan(zzan zzanVar, long j2) {
        Preconditions.m14372k(zzanVar);
        this.f29077f = zzanVar.f29077f;
        this.f29078g = zzanVar.f29078g;
        this.f29079h = zzanVar.f29079h;
        this.f29080i = j2;
    }
}
