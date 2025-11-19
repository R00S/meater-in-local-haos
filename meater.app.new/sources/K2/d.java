package K2;

import U1.y;
import android.os.Parcel;
import android.os.Parcelable;
import p8.C4246c;

/* compiled from: SmtaMetadataEntry.java */
/* loaded from: classes.dex */
public final class d implements y.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final float f8675B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8676C;

    /* compiled from: SmtaMetadataEntry.java */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8675B == dVar.f8675B && this.f8676C == dVar.f8676C;
    }

    public int hashCode() {
        return ((527 + C4246c.a(this.f8675B)) * 31) + this.f8676C;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f8675B + ", svcTemporalLayerCount=" + this.f8676C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f8675B);
        parcel.writeInt(this.f8676C);
    }

    public d(float f10, int i10) {
        this.f8675B = f10;
        this.f8676C = i10;
    }

    private d(Parcel parcel) {
        this.f8675B = parcel.readFloat();
        this.f8676C = parcel.readInt();
    }
}
