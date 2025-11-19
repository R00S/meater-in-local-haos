package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CommentFrame.java */
/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7243C;

    /* renamed from: D, reason: collision with root package name */
    public final String f7244D;

    /* renamed from: E, reason: collision with root package name */
    public final String f7245E;

    /* compiled from: CommentFrame.java */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f7243C = str;
        this.f7244D = str2;
        this.f7245E = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return L.d(this.f7244D, eVar.f7244D) && L.d(this.f7243C, eVar.f7243C) && L.d(this.f7245E, eVar.f7245E);
    }

    public int hashCode() {
        String str = this.f7243C;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7244D;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7245E;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": language=" + this.f7243C + ", description=" + this.f7244D + ", text=" + this.f7245E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7255B);
        parcel.writeString(this.f7243C);
        parcel.writeString(this.f7245E);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f7243C = (String) L.i(parcel.readString());
        this.f7244D = (String) L.i(parcel.readString());
        this.f7245E = (String) L.i(parcel.readString());
    }
}
