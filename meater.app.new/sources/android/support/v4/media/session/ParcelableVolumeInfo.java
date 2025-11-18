package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0015a();

    /* renamed from: f */
    public int f43f;

    /* renamed from: g */
    public int f44g;

    /* renamed from: h */
    public int f45h;

    /* renamed from: i */
    public int f46i;

    /* renamed from: j */
    public int f47j;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0015a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0015a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f43f = parcel.readInt();
        this.f45h = parcel.readInt();
        this.f46i = parcel.readInt();
        this.f47j = parcel.readInt();
        this.f44g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f43f);
        parcel.writeInt(this.f45h);
        parcel.writeInt(this.f46i);
        parcel.writeInt(this.f47j);
        parcel.writeInt(this.f44g);
    }
}
