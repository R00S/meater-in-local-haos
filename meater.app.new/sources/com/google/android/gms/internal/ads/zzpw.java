package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzpw extends zzpv {
    public static final Parcelable.Creator<zzpw> CREATOR = new w20();

    /* renamed from: g */
    private final String f26827g;

    /* renamed from: h */
    private final String f26828h;

    public zzpw(String str, String str2, String str3) {
        super(str);
        this.f26827g = null;
        this.f26828h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpw.class == obj.getClass()) {
            zzpw zzpwVar = (zzpw) obj;
            if (this.f26826f.equals(zzpwVar.f26826f) && zzsy.m20543g(this.f26827g, zzpwVar.f26827g) && zzsy.m20543g(this.f26828h, zzpwVar.f26828h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f26826f.hashCode() + 527) * 31;
        String str = this.f26827g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26828h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26826f);
        parcel.writeString(this.f26827g);
        parcel.writeString(this.f26828h);
    }

    zzpw(Parcel parcel) {
        super(parcel.readString());
        this.f26827g = parcel.readString();
        this.f26828h = parcel.readString();
    }
}
