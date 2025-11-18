package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: GeobFrame.java */
/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7246C;

    /* renamed from: D, reason: collision with root package name */
    public final String f7247D;

    /* renamed from: E, reason: collision with root package name */
    public final String f7248E;

    /* renamed from: F, reason: collision with root package name */
    public final byte[] f7249F;

    /* compiled from: GeobFrame.java */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7246C = str;
        this.f7247D = str2;
        this.f7248E = str3;
        this.f7249F = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return L.d(this.f7246C, fVar.f7246C) && L.d(this.f7247D, fVar.f7247D) && L.d(this.f7248E, fVar.f7248E) && Arrays.equals(this.f7249F, fVar.f7249F);
    }

    public int hashCode() {
        String str = this.f7246C;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7247D;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7248E;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7249F);
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": mimeType=" + this.f7246C + ", filename=" + this.f7247D + ", description=" + this.f7248E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7246C);
        parcel.writeString(this.f7247D);
        parcel.writeString(this.f7248E);
        parcel.writeByteArray(this.f7249F);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f7246C = (String) L.i(parcel.readString());
        this.f7247D = (String) L.i(parcel.readString());
        this.f7248E = (String) L.i(parcel.readString());
        this.f7249F = (byte[]) L.i(parcel.createByteArray());
    }
}
