package cm.aptoide.p092pt.permissions;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ApkPermission implements Parcelable {
    public static final Parcelable.Creator<ApkPermission> CREATOR = new Parcelable.Creator<ApkPermission>() { // from class: cm.aptoide.pt.permissions.ApkPermission.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApkPermission createFromParcel(Parcel parcel) {
            return new ApkPermission(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApkPermission[] newArray(int i2) {
            return new ApkPermission[i2];
        }
    };
    private String description;
    private String name;

    public ApkPermission(String str, String str2) {
        this.name = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
    }

    protected ApkPermission(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
    }
}
