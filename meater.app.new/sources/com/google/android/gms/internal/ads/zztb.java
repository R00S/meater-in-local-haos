package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zztb implements Parcelable {
    public static final Parcelable.Creator<zztb> CREATOR = new p30();

    /* renamed from: f */
    public final int f27038f;

    /* renamed from: g */
    public final int f27039g;

    /* renamed from: h */
    public final int f27040h;

    /* renamed from: i */
    public final byte[] f27041i;

    /* renamed from: j */
    private int f27042j;

    public zztb(int i2, int i3, int i4, byte[] bArr) {
        this.f27038f = i2;
        this.f27039g = i3;
        this.f27040h = i4;
        this.f27041i = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztb.class == obj.getClass()) {
            zztb zztbVar = (zztb) obj;
            if (this.f27038f == zztbVar.f27038f && this.f27039g == zztbVar.f27039g && this.f27040h == zztbVar.f27040h && Arrays.equals(this.f27041i, zztbVar.f27041i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27042j == 0) {
            this.f27042j = ((((((this.f27038f + 527) * 31) + this.f27039g) * 31) + this.f27040h) * 31) + Arrays.hashCode(this.f27041i);
        }
        return this.f27042j;
    }

    public final String toString() {
        int i2 = this.f27038f;
        int i3 = this.f27039g;
        int i4 = this.f27040h;
        boolean z = this.f27041i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27038f);
        parcel.writeInt(this.f27039g);
        parcel.writeInt(this.f27040h);
        parcel.writeInt(this.f27041i != null ? 1 : 0);
        byte[] bArr = this.f27041i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    zztb(Parcel parcel) {
        this.f27038f = parcel.readInt();
        this.f27039g = parcel.readInt();
        this.f27040h = parcel.readInt();
        this.f27041i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
