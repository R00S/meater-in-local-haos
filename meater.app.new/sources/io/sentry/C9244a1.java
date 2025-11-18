package io.sentry;

import io.sentry.vendor.gson.internal.bind.util.C9664a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DateUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.a1 */
/* loaded from: classes2.dex */
public final class C9244a1 {
    /* renamed from: a */
    public static long m30006a(Date date) {
        return m30013h(date.getTime());
    }

    /* renamed from: b */
    public static double m30007b(Date date) {
        return m30014i(date.getTime());
    }

    /* renamed from: c */
    public static Date m30008c() {
        return Calendar.getInstance(C9664a.f36963a).getTime();
    }

    /* renamed from: d */
    public static Date m30009d(long j2) {
        Calendar calendar = Calendar.getInstance(C9664a.f36963a);
        calendar.setTimeInMillis(j2);
        return calendar.getTime();
    }

    /* renamed from: e */
    public static Date m30010e(String str) throws IllegalArgumentException {
        try {
            return C9664a.m31860f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    /* renamed from: f */
    public static Date m30011f(String str) throws IllegalArgumentException {
        try {
            return m30009d(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    /* renamed from: g */
    public static String m30012g(Date date) {
        return C9664a.m31856b(date, true);
    }

    /* renamed from: h */
    public static long m30013h(long j2) {
        return j2 * 1000000;
    }

    /* renamed from: i */
    public static double m30014i(double d2) {
        return d2 / 1000.0d;
    }

    /* renamed from: j */
    public static Date m30015j(long j2) {
        return m30009d(Double.valueOf(m30016k(Double.valueOf(j2).doubleValue())).longValue());
    }

    /* renamed from: k */
    public static double m30016k(double d2) {
        return d2 / 1000000.0d;
    }

    /* renamed from: l */
    public static double m30017l(long j2) {
        return Double.valueOf(j2).doubleValue() / 1.0E9d;
    }

    /* renamed from: m */
    public static long m30018m(long j2) {
        return j2 * 1000000000;
    }

    /* renamed from: n */
    public static Date m30019n(AbstractC9435f4 abstractC9435f4) {
        if (abstractC9435f4 == null) {
            return null;
        }
        return m30020o(abstractC9435f4);
    }

    /* renamed from: o */
    public static Date m30020o(AbstractC9435f4 abstractC9435f4) {
        return m30015j(abstractC9435f4.mo30792x());
    }
}
