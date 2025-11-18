package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f28510f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final int f28511g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final long f28512h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final long f28513i;

    @SafeParcelable.Constructor
    zzaj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) long j3) {
        this.f28510f = i2;
        this.f28511g = i3;
        this.f28512h = j2;
        this.f28513i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzajVar = (zzaj) obj;
            if (this.f28510f == zzajVar.f28510f && this.f28511g == zzajVar.f28511g && this.f28512h == zzajVar.f28512h && this.f28513i == zzajVar.f28513i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f28511g), Integer.valueOf(this.f28510f), Long.valueOf(this.f28513i), Long.valueOf(this.f28512h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f28510f + " Cell status: " + this.f28511g + " elapsed time NS: " + this.f28513i + " system time ms: " + this.f28512h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f28510f);
        SafeParcelWriter.m14477l(parcel, 2, this.f28511g);
        SafeParcelWriter.m14481p(parcel, 3, this.f28512h);
        SafeParcelWriter.m14481p(parcel, 4, this.f28513i);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
