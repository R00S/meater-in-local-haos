package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* loaded from: classes2.dex */
class e {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strD = d(j10);
        if (z10) {
            strD = String.format(context.getString(C7.k.f2553v), strD);
        }
        return z11 ? String.format(context.getString(C7.k.f2552u), strD) : z12 ? String.format(context.getString(C7.k.f2549r), strD) : strD;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return u.d(locale).format(new Date(j10));
    }

    static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    static String e(Context context, int i10) {
        return u.g().get(1) == i10 ? String.format(context.getString(C7.k.f2550s), Integer.valueOf(i10)) : String.format(context.getString(C7.k.f2551t), Integer.valueOf(i10));
    }

    static String f(long j10) {
        return u.k(Locale.getDefault()).format(new Date(j10));
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return u.l(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar calendarG = u.g();
        Calendar calendarI = u.i();
        calendarI.setTimeInMillis(j10);
        return calendarG.get(1) == calendarI.get(1);
    }
}
