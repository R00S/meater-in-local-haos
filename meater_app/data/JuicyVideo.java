package com.apptionlabs.meater_app.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: /tmp/meat/meat/classes.dex */
public class JuicyVideo implements Parcelable {
    public static final Parcelable.Creator<JuicyVideo> CREATOR = new Parcelable.Creator<JuicyVideo>() { // from class: com.apptionlabs.meater_app.data.JuicyVideo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JuicyVideo createFromParcel(Parcel parcel) {
            JuicyVideo juicyVideo = new JuicyVideo();
            juicyVideo.id = parcel.readString();
            juicyVideo.url = parcel.readString();
            juicyVideo.title = parcel.readString();
            juicyVideo.datePublished = parcel.readString();
            juicyVideo.thumbnail = parcel.readString();
            juicyVideo.duration = parcel.readInt();
            juicyVideo.type = parcel.readInt();
            return juicyVideo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JuicyVideo[] newArray(int i10) {
            return new JuicyVideo[i10];
        }
    };
    public String datePublished;
    public int duration;
    public String id;
    public String thumbnail;
    public String title;
    public int type;
    public String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.url, ((JuicyVideo) obj).url);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.title, this.datePublished, this.thumbnail, this.url, Integer.valueOf(this.duration));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
        parcel.writeString(this.datePublished);
        parcel.writeString(this.thumbnail);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.type);
    }
}
