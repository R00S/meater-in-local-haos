package Y1;

import U1.y;
import X1.C1804a;
import android.os.Parcel;
import android.os.Parcelable;
import p8.C4246c;

/* compiled from: Mp4LocationData.java */
/* loaded from: classes.dex */
public final class c implements y.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final float f19221B;

    /* renamed from: C, reason: collision with root package name */
    public final float f19222C;

    /* compiled from: Mp4LocationData.java */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
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
        c cVar = (c) obj;
        return this.f19221B == cVar.f19221B && this.f19222C == cVar.f19222C;
    }

    public int hashCode() {
        return ((527 + C4246c.a(this.f19221B)) * 31) + C4246c.a(this.f19222C);
    }

    public String toString() {
        return "xyz: latitude=" + this.f19221B + ", longitude=" + this.f19222C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f19221B);
        parcel.writeFloat(this.f19222C);
    }

    public c(float f10, float f11) {
        C1804a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f19221B = f10;
        this.f19222C = f11;
    }

    private c(Parcel parcel) {
        this.f19221B = parcel.readFloat();
        this.f19222C = parcel.readFloat();
    }
}
