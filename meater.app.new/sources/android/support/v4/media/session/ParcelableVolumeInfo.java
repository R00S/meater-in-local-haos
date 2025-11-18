package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public int f20504B;

    /* renamed from: C, reason: collision with root package name */
    public int f20505C;

    /* renamed from: D, reason: collision with root package name */
    public int f20506D;

    /* renamed from: E, reason: collision with root package name */
    public int f20507E;

    /* renamed from: F, reason: collision with root package name */
    public int f20508F;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f20504B = parcel.readInt();
        this.f20506D = parcel.readInt();
        this.f20507E = parcel.readInt();
        this.f20508F = parcel.readInt();
        this.f20505C = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20504B);
        parcel.writeInt(this.f20506D);
        parcel.writeInt(this.f20507E);
        parcel.writeInt(this.f20508F);
        parcel.writeInt(this.f20505C);
    }
}
