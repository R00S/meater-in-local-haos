package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0006a();

    /* renamed from: f */
    private final int f29f;

    /* renamed from: g */
    private final float f30g;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0006a implements Parcelable.Creator<RatingCompat> {
        C0006a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    RatingCompat(int i2, float f2) {
        this.f29f = i2;
        this.f30g = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f29f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f29f);
        sb.append(" rating=");
        float f2 = this.f30g;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f29f);
        parcel.writeFloat(this.f30g);
    }
}
