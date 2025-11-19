package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward.java */
/* loaded from: classes2.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final long f36401B;

    /* compiled from: DateValidatorPointForward.java */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* synthetic */ f(long j10, a aVar) {
        this(j10);
    }

    public static f a(long j10) {
        return new f(j10);
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean S0(long j10) {
        return j10 >= this.f36401B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f36401B == ((f) obj).f36401B;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f36401B)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f36401B);
    }

    private f(long j10) {
        this.f36401B = j10;
    }
}
