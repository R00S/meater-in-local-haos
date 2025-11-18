package K2;

import U1.y;
import android.os.Parcel;
import android.os.Parcelable;
import p8.h;

/* compiled from: MotionPhotoMetadata.java */
/* loaded from: classes.dex */
public final class a implements y.b {
    public static final Parcelable.Creator<a> CREATOR = new C0168a();

    /* renamed from: B, reason: collision with root package name */
    public final long f8665B;

    /* renamed from: C, reason: collision with root package name */
    public final long f8666C;

    /* renamed from: D, reason: collision with root package name */
    public final long f8667D;

    /* renamed from: E, reason: collision with root package name */
    public final long f8668E;

    /* renamed from: F, reason: collision with root package name */
    public final long f8669F;

    /* compiled from: MotionPhotoMetadata.java */
    /* renamed from: K2.a$a, reason: collision with other inner class name */
    class C0168a implements Parcelable.Creator<a> {
        C0168a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0168a c0168a) {
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8665B == aVar.f8665B && this.f8666C == aVar.f8666C && this.f8667D == aVar.f8667D && this.f8668E == aVar.f8668E && this.f8669F == aVar.f8669F;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f8665B)) * 31) + h.c(this.f8666C)) * 31) + h.c(this.f8667D)) * 31) + h.c(this.f8668E)) * 31) + h.c(this.f8669F);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8665B + ", photoSize=" + this.f8666C + ", photoPresentationTimestampUs=" + this.f8667D + ", videoStartPosition=" + this.f8668E + ", videoSize=" + this.f8669F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8665B);
        parcel.writeLong(this.f8666C);
        parcel.writeLong(this.f8667D);
        parcel.writeLong(this.f8668E);
        parcel.writeLong(this.f8669F);
    }

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f8665B = j10;
        this.f8666C = j11;
        this.f8667D = j12;
        this.f8668E = j13;
        this.f8669F = j14;
    }

    private a(Parcel parcel) {
        this.f8665B = parcel.readLong();
        this.f8666C = parcel.readLong();
        this.f8667D = parcel.readLong();
        this.f8668E = parcel.readLong();
        this.f8669F = parcel.readLong();
    }
}
