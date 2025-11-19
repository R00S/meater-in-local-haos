package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month.java */
/* loaded from: classes2.dex */
final class n implements Comparable<n>, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final Calendar f36490B;

    /* renamed from: C, reason: collision with root package name */
    final int f36491C;

    /* renamed from: D, reason: collision with root package name */
    final int f36492D;

    /* renamed from: E, reason: collision with root package name */
    final int f36493E;

    /* renamed from: F, reason: collision with root package name */
    final int f36494F;

    /* renamed from: G, reason: collision with root package name */
    final long f36495G;

    /* renamed from: H, reason: collision with root package name */
    private String f36496H;

    /* compiled from: Month.java */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return n.j(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    private n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = u.c(calendar);
        this.f36490B = calendarC;
        this.f36491C = calendarC.get(2);
        this.f36492D = calendarC.get(1);
        this.f36493E = calendarC.getMaximum(7);
        this.f36494F = calendarC.getActualMaximum(5);
        this.f36495G = calendarC.getTimeInMillis();
    }

    static n j(int i10, int i11) {
        Calendar calendarI = u.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new n(calendarI);
    }

    static n n(long j10) {
        Calendar calendarI = u.i();
        calendarI.setTimeInMillis(j10);
        return new n(calendarI);
    }

    static n p() {
        return new n(u.g());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f36490B.compareTo(nVar.f36490B);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f36491C == nVar.f36491C && this.f36492D == nVar.f36492D;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36491C), Integer.valueOf(this.f36492D)});
    }

    int s(int i10) {
        int i11 = this.f36490B.get(7);
        if (i10 <= 0) {
            i10 = this.f36490B.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f36493E : i12;
    }

    long t(int i10) {
        Calendar calendarC = u.c(this.f36490B);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    int u(long j10) {
        Calendar calendarC = u.c(this.f36490B);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String v() {
        if (this.f36496H == null) {
            this.f36496H = e.f(this.f36490B.getTimeInMillis());
        }
        return this.f36496H;
    }

    long w() {
        return this.f36490B.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f36492D);
        parcel.writeInt(this.f36491C);
    }

    n x(int i10) {
        Calendar calendarC = u.c(this.f36490B);
        calendarC.add(2, i10);
        return new n(calendarC);
    }

    int y(n nVar) {
        if (this.f36490B instanceof GregorianCalendar) {
            return ((nVar.f36492D - this.f36492D) * 12) + (nVar.f36491C - this.f36491C);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
