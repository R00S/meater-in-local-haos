package com.apptionlabs.meater_app.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookNote implements Parcelable {
    public static final Parcelable.Creator<CookNote> CREATOR = new Parcelable.Creator<CookNote>() { // from class: com.apptionlabs.meater_app.model.CookNote.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CookNote createFromParcel(Parcel parcel) {
            CookNote cookNote = new CookNote();
            cookNote.noteID = parcel.readLong();
            cookNote.noteCookId = parcel.readLong();
            cookNote.cookId = parcel.readString();
            cookNote.type = parcel.readInt();
            cookNote.timestamp = parcel.readDouble();
            cookNote.note = parcel.readString();
            cookNote.expanded = parcel.readByte() != 0;
            return cookNote;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CookNote[] newArray(int i10) {
            return new CookNote[i10];
        }
    };
    public String cookId;
    private boolean expanded;
    public boolean needsDeleting;
    public boolean needsUploading;
    public String note;
    public long noteCookId;
    public long noteID;
    public double timestamp;
    public int type;
    public long updatedAt;
    public long value;

    public String cookIDString() {
        return Long.toHexString(this.noteID).toUpperCase();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long generateNoteID() {
        byte[] f10 = kd.g.f(UUID.randomUUID().getLeastSignificantBits());
        f10[0] = 96;
        return kd.g.b(f10);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public String noteIDString() {
        return Long.toHexString(this.noteID).toUpperCase();
    }

    public void setExpanded(boolean z10) {
        this.expanded = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.noteID);
        parcel.writeLong(this.noteCookId);
        parcel.writeString(this.cookId);
        parcel.writeInt(this.type);
        parcel.writeDouble(this.timestamp);
        parcel.writeString(this.note);
        parcel.writeByte(isExpanded() ? (byte) 1 : (byte) 0);
    }
}
