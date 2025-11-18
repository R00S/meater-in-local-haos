package F2;

import U1.y;
import X1.C1804a;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AppInfoTable.java */
/* loaded from: classes.dex */
public final class a implements y.b {
    public static final Parcelable.Creator<a> CREATOR = new C0083a();

    /* renamed from: B, reason: collision with root package name */
    public final int f4477B;

    /* renamed from: C, reason: collision with root package name */
    public final String f4478C;

    /* compiled from: AppInfoTable.java */
    /* renamed from: F2.a$a, reason: collision with other inner class name */
    class C0083a implements Parcelable.Creator<a> {
        C0083a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) C1804a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f4477B = i10;
        this.f4478C = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f4477B + ",url=" + this.f4478C + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4478C);
        parcel.writeInt(this.f4477B);
    }
}
