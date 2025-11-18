package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C7986a();

    /* renamed from: f */
    private final Month f30064f;

    /* renamed from: g */
    private final Month f30065g;

    /* renamed from: h */
    private final Month f30066h;

    /* renamed from: i */
    private final DateValidator f30067i;

    /* renamed from: j */
    private final int f30068j;

    /* renamed from: k */
    private final int f30069k;

    public interface DateValidator extends Parcelable {
        /* renamed from: F0 */
        boolean mo24316F0(long j2);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    static class C7986a implements Parcelable.Creator<CalendarConstraints> {
        C7986a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C7987b {

        /* renamed from: a */
        static final long f30070a = C8005o.m24423a(Month.m24336k(1900, 0).f30085l);

        /* renamed from: b */
        static final long f30071b = C8005o.m24423a(Month.m24336k(2100, 11).f30085l);

        /* renamed from: c */
        private long f30072c;

        /* renamed from: d */
        private long f30073d;

        /* renamed from: e */
        private Long f30074e;

        /* renamed from: f */
        private DateValidator f30075f;

        C7987b(CalendarConstraints calendarConstraints) {
            this.f30072c = f30070a;
            this.f30073d = f30071b;
            this.f30075f = DateValidatorPointForward.m24329a(Long.MIN_VALUE);
            this.f30072c = calendarConstraints.f30064f.f30085l;
            this.f30073d = calendarConstraints.f30065g.f30085l;
            this.f30074e = Long.valueOf(calendarConstraints.f30066h.f30085l);
            this.f30075f = calendarConstraints.f30067i;
        }

        /* renamed from: a */
        public CalendarConstraints m24319a() {
            if (this.f30074e == null) {
                long jM24394u = C7996f.m24394u();
                long j2 = this.f30072c;
                if (j2 > jM24394u || jM24394u > this.f30073d) {
                    jM24394u = j2;
                }
                this.f30074e = Long.valueOf(jM24394u);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f30075f);
            return new CalendarConstraints(Month.m24337q(this.f30072c), Month.m24337q(this.f30073d), Month.m24337q(this.f30074e.longValue()), (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        /* renamed from: b */
        public C7987b m24320b(long j2) {
            this.f30074e = Long.valueOf(j2);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, C7986a c7986a) {
        this(month, month2, month3, dateValidator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    Month m24309e(Month month) {
        return month.compareTo(this.f30064f) < 0 ? this.f30064f : month.compareTo(this.f30065g) > 0 ? this.f30065g : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f30064f.equals(calendarConstraints.f30064f) && this.f30065g.equals(calendarConstraints.f30065g) && this.f30066h.equals(calendarConstraints.f30066h) && this.f30067i.equals(calendarConstraints.f30067i);
    }

    /* renamed from: f */
    public DateValidator m24310f() {
        return this.f30067i;
    }

    /* renamed from: g */
    Month m24311g() {
        return this.f30065g;
    }

    /* renamed from: h */
    int m24312h() {
        return this.f30069k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30064f, this.f30065g, this.f30066h, this.f30067i});
    }

    /* renamed from: i */
    Month m24313i() {
        return this.f30066h;
    }

    /* renamed from: j */
    Month m24314j() {
        return this.f30064f;
    }

    /* renamed from: k */
    int m24315k() {
        return this.f30068j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f30064f, 0);
        parcel.writeParcelable(this.f30065g, 0);
        parcel.writeParcelable(this.f30066h, 0);
        parcel.writeParcelable(this.f30067i, 0);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f30064f = month;
        this.f30065g = month2;
        this.f30066h = month3;
        this.f30067i = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f30069k = month.m24341G(month2) + 1;
        this.f30068j = (month2.f30082i - month.f30082i) + 1;
    }
}
