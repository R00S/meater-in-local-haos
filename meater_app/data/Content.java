package com.apptionlabs.meater_app.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Content implements Parcelable {
    public static final Parcelable.Creator<Content> CREATOR = new Parcelable.Creator<Content>() { // from class: com.apptionlabs.meater_app.data.Content.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Content createFromParcel(Parcel parcel) {
            Content content = new Content();
            content.content = parcel.readString();
            content.isHeader = parcel.readByte() != 0;
            return content;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Content[] newArray(int i10) {
            return new Content[i10];
        }
    };
    private String content;
    private boolean isHeader;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        return this.content;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIsHeader(boolean z10) {
        this.isHeader = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.content);
        parcel.writeByte(this.isHeader ? (byte) 1 : (byte) 0);
    }
}
