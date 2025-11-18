package I2;

import U1.x;
import U1.y;
import X1.C1804a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: IcyInfo.java */
/* loaded from: classes.dex */
public final class c implements y.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final byte[] f6664B;

    /* renamed from: C, reason: collision with root package name */
    public final String f6665C;

    /* renamed from: D, reason: collision with root package name */
    public final String f6666D;

    /* compiled from: IcyInfo.java */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f6664B = bArr;
        this.f6665C = str;
        this.f6666D = str2;
    }

    @Override // U1.y.b
    public void L0(x.b bVar) {
        String str = this.f6665C;
        if (str != null) {
            bVar.p0(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6664B, ((c) obj).f6664B);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6664B);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f6665C, this.f6666D, Integer.valueOf(this.f6664B.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f6664B);
        parcel.writeString(this.f6665C);
        parcel.writeString(this.f6666D);
    }

    c(Parcel parcel) {
        this.f6664B = (byte[]) C1804a.e(parcel.createByteArray());
        this.f6665C = parcel.readString();
        this.f6666D = parcel.readString();
    }
}
