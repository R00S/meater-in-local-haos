package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C7990a();

    /* renamed from: f */
    private final Calendar f30079f;

    /* renamed from: g */
    private final String f30080g;

    /* renamed from: h */
    final int f30081h;

    /* renamed from: i */
    final int f30082i;

    /* renamed from: j */
    final int f30083j;

    /* renamed from: k */
    final int f30084k;

    /* renamed from: l */
    final long f30085l;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    static class C7990a implements Parcelable.Creator<Month> {
        C7990a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.m24336k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM24426d = C8005o.m24426d(calendar);
        this.f30079f = calendarM24426d;
        this.f30081h = calendarM24426d.get(2);
        this.f30082i = calendarM24426d.get(1);
        this.f30083j = calendarM24426d.getMaximum(7);
        this.f30084k = calendarM24426d.getActualMaximum(5);
        this.f30080g = C8005o.m24437o().format(calendarM24426d.getTime());
        this.f30085l = calendarM24426d.getTimeInMillis();
    }

    /* renamed from: k */
    static Month m24336k(int i2, int i3) {
        Calendar calendarM24434l = C8005o.m24434l();
        calendarM24434l.set(1, i2);
        calendarM24434l.set(2, i3);
        return new Month(calendarM24434l);
    }

    /* renamed from: q */
    static Month m24337q(long j2) {
        Calendar calendarM24434l = C8005o.m24434l();
        calendarM24434l.setTimeInMillis(j2);
        return new Month(calendarM24434l);
    }

    /* renamed from: u */
    static Month m24338u() {
        return new Month(C8005o.m24432j());
    }

    /* renamed from: E */
    long m24339E() {
        return this.f30079f.getTimeInMillis();
    }

    /* renamed from: F */
    Month m24340F(int i2) {
        Calendar calendarM24426d = C8005o.m24426d(this.f30079f);
        calendarM24426d.add(2, i2);
        return new Month(calendarM24426d);
    }

    /* renamed from: G */
    int m24341G(Month month) {
        if (this.f30079f instanceof GregorianCalendar) {
            return ((month.f30082i - this.f30082i) * 12) + (month.f30081h - this.f30081h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f30081h == month.f30081h && this.f30082i == month.f30082i;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f30079f.compareTo(month.f30079f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30081h), Integer.valueOf(this.f30082i)});
    }

    /* renamed from: v */
    int m24343v() {
        int firstDayOfWeek = this.f30079f.get(7) - this.f30079f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f30083j : firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f30082i);
        parcel.writeInt(this.f30081h);
    }

    /* renamed from: x */
    long m24344x(int i2) {
        Calendar calendarM24426d = C8005o.m24426d(this.f30079f);
        calendarM24426d.set(5, i2);
        return calendarM24426d.getTimeInMillis();
    }

    /* renamed from: y */
    String m24345y() {
        return this.f30080g;
    }
}
