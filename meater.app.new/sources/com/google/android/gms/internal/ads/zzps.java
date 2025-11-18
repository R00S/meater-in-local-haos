package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzps extends zzpv {
    public static final Parcelable.Creator<zzps> CREATOR = new v20();

    /* renamed from: g */
    private final String f26823g;

    /* renamed from: h */
    public final String f26824h;

    /* renamed from: i */
    public final String f26825i;

    public zzps(String str, String str2, String str3) {
        super("COMM");
        this.f26823g = str;
        this.f26824h = str2;
        this.f26825i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzps.class == obj.getClass()) {
            zzps zzpsVar = (zzps) obj;
            if (zzsy.m20543g(this.f26824h, zzpsVar.f26824h) && zzsy.m20543g(this.f26823g, zzpsVar.f26823g) && zzsy.m20543g(this.f26825i, zzpsVar.f26825i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26823g;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f26824h;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26825i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26826f);
        parcel.writeString(this.f26823g);
        parcel.writeString(this.f26825i);
    }

    zzps(Parcel parcel) {
        super("COMM");
        this.f26823g = parcel.readString();
        this.f26824h = parcel.readString();
        this.f26825i = parcel.readString();
    }
}
