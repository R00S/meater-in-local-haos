package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates.java */
/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes2.dex */
class C8005o {

    /* renamed from: a */
    static AtomicReference<C8004n> f30184a = new AtomicReference<>();

    /* renamed from: a */
    static long m24423a(long j2) {
        Calendar calendarM24434l = m24434l();
        calendarM24434l.setTimeInMillis(j2);
        return m24426d(calendarM24434l).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    static DateFormat m24424b(Locale locale) {
        return m24425c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m24425c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m24433k());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m24426d(Calendar calendar) {
        Calendar calendarM24435m = m24435m(calendar);
        Calendar calendarM24434l = m24434l();
        calendarM24434l.set(calendarM24435m.get(1), calendarM24435m.get(2), calendarM24435m.get(5));
        return calendarM24434l;
    }

    /* renamed from: e */
    private static java.text.DateFormat m24427e(int i2, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i2, locale);
        dateInstance.setTimeZone(m24431i());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m24428f(Locale locale) {
        return m24427e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m24429g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m24431i());
        return simpleDateFormat;
    }

    /* renamed from: h */
    static C8004n m24430h() {
        C8004n c8004n = f30184a.get();
        return c8004n == null ? C8004n.m24420c() : c8004n;
    }

    /* renamed from: i */
    private static TimeZone m24431i() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: j */
    static Calendar m24432j() {
        Calendar calendarM24421a = m24430h().m24421a();
        calendarM24421a.set(11, 0);
        calendarM24421a.set(12, 0);
        calendarM24421a.set(13, 0);
        calendarM24421a.set(14, 0);
        return m24426d(calendarM24421a);
    }

    @TargetApi(24)
    /* renamed from: k */
    private static android.icu.util.TimeZone m24433k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: l */
    static Calendar m24434l() {
        return m24435m(null);
    }

    /* renamed from: m */
    static Calendar m24435m(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m24431i());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    /* renamed from: n */
    static DateFormat m24436n(Locale locale) {
        return m24425c("yMMMEd", locale);
    }

    /* renamed from: o */
    static SimpleDateFormat m24437o() {
        return m24438p(Locale.getDefault());
    }

    /* renamed from: p */
    private static SimpleDateFormat m24438p(Locale locale) {
        return m24429g("LLLL, yyyy", locale);
    }
}
