package Y1;

import U1.y;
import android.os.Parcel;
import android.os.Parcelable;
import p8.h;

/* compiled from: Mp4TimestampData.java */
/* loaded from: classes.dex */
public final class d implements y.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final long f19223B;

    /* renamed from: C, reason: collision with root package name */
    public final long f19224C;

    /* renamed from: D, reason: collision with root package name */
    public final long f19225D;

    /* compiled from: Mp4TimestampData.java */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19223B == dVar.f19223B && this.f19224C == dVar.f19224C && this.f19225D == dVar.f19225D;
    }

    public int hashCode() {
        return ((((527 + h.c(this.f19223B)) * 31) + h.c(this.f19224C)) * 31) + h.c(this.f19225D);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f19223B + ", modification time=" + this.f19224C + ", timescale=" + this.f19225D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f19223B);
        parcel.writeLong(this.f19224C);
        parcel.writeLong(this.f19225D);
    }

    public d(long j10, long j11, long j12) {
        this.f19223B = j10;
        this.f19224C = j11;
        this.f19225D = j12;
    }

    private d(Parcel parcel) {
        this.f19223B = parcel.readLong();
        this.f19224C = parcel.readLong();
        this.f19225D = parcel.readLong();
    }
}
