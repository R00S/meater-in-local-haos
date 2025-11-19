package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates.java */
/* loaded from: classes2.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static AtomicReference<t> f36519a = new AtomicReference<>();

    static long a(long j10) {
        Calendar calendarI = i();
        calendarI.setTimeInMillis(j10);
        return c(calendarI).getTimeInMillis();
    }

    @TargetApi(24)
    private static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar calendarJ = j(calendar);
        Calendar calendarI = i();
        calendarI.set(calendarJ.get(1), calendarJ.get(2), calendarJ.get(5));
        return calendarI;
    }

    @TargetApi(24)
    static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static t e() {
        t tVar = f36519a.get();
        return tVar == null ? t.c() : tVar;
    }

    private static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar g() {
        Calendar calendarA = e().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(f());
        return calendarA;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return j(null);
    }

    static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    @TargetApi(24)
    static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
