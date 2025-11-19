package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: UrlLinkFrame.java */
/* loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7270C;

    /* renamed from: D, reason: collision with root package name */
    public final String f7271D;

    /* compiled from: UrlLinkFrame.java */
    class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f7270C = str2;
        this.f7271D = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7255B.equals(oVar.f7255B) && L.d(this.f7270C, oVar.f7270C) && L.d(this.f7271D, oVar.f7271D);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f7255B.hashCode()) * 31;
        String str = this.f7270C;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7271D;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": url=" + this.f7271D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7255B);
        parcel.writeString(this.f7270C);
        parcel.writeString(this.f7271D);
    }

    o(Parcel parcel) {
        super((String) L.i(parcel.readString()));
        this.f7270C = parcel.readString();
        this.f7271D = (String) L.i(parcel.readString());
    }
}
