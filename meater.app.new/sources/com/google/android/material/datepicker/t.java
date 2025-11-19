package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes2.dex */
class t {

    /* renamed from: c, reason: collision with root package name */
    private static final t f36516c = new t(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f36517a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f36518b;

    private t(Long l10, TimeZone timeZone) {
        this.f36517a = l10;
        this.f36518b = timeZone;
    }

    static t c() {
        return f36516c;
    }

    Calendar a() {
        return b(this.f36518b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f36517a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
