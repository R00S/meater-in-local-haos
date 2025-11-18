package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C7988a();

    /* renamed from: f */
    private final long f30076f;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    static class C7988a implements Parcelable.Creator<DateValidatorPointForward> {
        C7988a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i2) {
            return new DateValidatorPointForward[i2];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j2, C7988a c7988a) {
        this(j2);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m24329a(long j2) {
        return new DateValidatorPointForward(j2);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: F0 */
    public boolean mo24316F0(long j2) {
        return j2 >= this.f30076f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f30076f == ((DateValidatorPointForward) obj).f30076f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f30076f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f30076f);
    }

    private DateValidatorPointForward(long j2) {
        this.f30076f = j2;
    }
}
