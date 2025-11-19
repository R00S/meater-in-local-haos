package org.eclipse.paho.android.service;

import Fc.m;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableMqttMessage.java */
/* loaded from: classes3.dex */
public class i extends m implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: H, reason: collision with root package name */
    String f47308H;

    /* compiled from: ParcelableMqttMessage.java */
    class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    i(m mVar) {
        super(mVar.b());
        this.f47308H = null;
        j(mVar.c());
        k(mVar.e());
        f(mVar.d());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(b());
        parcel.writeInt(c());
        parcel.writeBooleanArray(new boolean[]{e(), d()});
        parcel.writeString(this.f47308H);
    }

    i(Parcel parcel) {
        super(parcel.createByteArray());
        this.f47308H = null;
        j(parcel.readInt());
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        k(zArrCreateBooleanArray[0]);
        f(zArrCreateBooleanArray[1]);
        this.f47308H = parcel.readString();
    }
}
