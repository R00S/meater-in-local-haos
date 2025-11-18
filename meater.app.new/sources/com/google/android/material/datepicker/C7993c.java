package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes2.dex */
class C7993c {
    /* renamed from: a */
    static String m24352a(long j2) {
        return m24353b(j2, Locale.getDefault());
    }

    /* renamed from: b */
    static String m24353b(long j2, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C8005o.m24424b(locale).format(new Date(j2)) : C8005o.m24428f(locale).format(new Date(j2));
    }

    /* renamed from: c */
    static String m24354c(long j2) {
        return m24355d(j2, Locale.getDefault());
    }

    /* renamed from: d */
    static String m24355d(long j2, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C8005o.m24436n(locale).format(new Date(j2)) : C8005o.m24428f(locale).format(new Date(j2));
    }
}
