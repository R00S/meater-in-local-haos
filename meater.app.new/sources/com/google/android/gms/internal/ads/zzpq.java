package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzpq extends zzpv {
    public static final Parcelable.Creator<zzpq> CREATOR = new u20();

    /* renamed from: g */
    private final String f26819g;

    /* renamed from: h */
    private final String f26820h;

    /* renamed from: i */
    private final int f26821i;

    /* renamed from: j */
    private final byte[] f26822j;

    public zzpq(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f26819g = str;
        this.f26820h = null;
        this.f26821i = 3;
        this.f26822j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpq.class == obj.getClass()) {
            zzpq zzpqVar = (zzpq) obj;
            if (this.f26821i == zzpqVar.f26821i && zzsy.m20543g(this.f26819g, zzpqVar.f26819g) && zzsy.m20543g(this.f26820h, zzpqVar.f26820h) && Arrays.equals(this.f26822j, zzpqVar.f26822j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f26821i + 527) * 31;
        String str = this.f26819g;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26820h;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f26822j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26819g);
        parcel.writeString(this.f26820h);
        parcel.writeInt(this.f26821i);
        parcel.writeByteArray(this.f26822j);
    }

    zzpq(Parcel parcel) {
        super("APIC");
        this.f26819g = parcel.readString();
        this.f26820h = parcel.readString();
        this.f26821i = parcel.readInt();
        this.f26822j = parcel.createByteArray();
    }
}
