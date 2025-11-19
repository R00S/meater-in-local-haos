package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: InternalFrame.java */
/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7257C;

    /* renamed from: D, reason: collision with root package name */
    public final String f7258D;

    /* renamed from: E, reason: collision with root package name */
    public final String f7259E;

    /* compiled from: InternalFrame.java */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f7257C = str;
        this.f7258D = str2;
        this.f7259E = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return L.d(this.f7258D, kVar.f7258D) && L.d(this.f7257C, kVar.f7257C) && L.d(this.f7259E, kVar.f7259E);
    }

    public int hashCode() {
        String str = this.f7257C;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7258D;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7259E;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": domain=" + this.f7257C + ", description=" + this.f7258D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7255B);
        parcel.writeString(this.f7257C);
        parcel.writeString(this.f7259E);
    }

    k(Parcel parcel) {
        super("----");
        this.f7257C = (String) L.i(parcel.readString());
        this.f7258D = (String) L.i(parcel.readString());
        this.f7259E = (String) L.i(parcel.readString());
    }
}
