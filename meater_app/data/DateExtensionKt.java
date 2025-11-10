package com.apptionlabs.meater_app.data;

import androidx.core.net.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import wh.m;

/* compiled from: DateExtension.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0010\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003¨\u0006\u0011"}, d2 = {"dateFormatWithTimeZone", "Ljava/text/SimpleDateFormat;", "getDateFormatWithTimeZone", "()Ljava/text/SimpleDateFormat;", "dateFormatWithTimeZoneForRecipe", "getDateFormatWithTimeZoneForRecipe", "formatWithDayMonthYearHMS", "getFormatWithDayMonthYearHMS", "formatWithHourMinSec", "getFormatWithHourMinSec", "formatWithYearHourMinSec", "getFormatWithYearHourMinSec", "serverDateFormat", "getServerDateFormat", "toMEATERServerDateFormat", "Ljava/util/Date;", "", "app_playstoreLiveRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class DateExtensionKt {
    private static final SimpleDateFormat dateFormatWithTimeZone;
    private static final SimpleDateFormat dateFormatWithTimeZoneForRecipe;
    private static final SimpleDateFormat formatWithDayMonthYearHMS;
    private static final SimpleDateFormat formatWithHourMinSec;
    private static final SimpleDateFormat formatWithYearHourMinSec;
    private static final SimpleDateFormat serverDateFormat;

    static {
        Locale locale = Locale.UK;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        serverDateFormat = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        dateFormatWithTimeZone = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("UTC"));
        dateFormatWithTimeZoneForRecipe = simpleDateFormat3;
        formatWithDayMonthYearHMS = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", locale);
        formatWithYearHourMinSec = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        formatWithHourMinSec = new SimpleDateFormat("HH:mm:ss", locale);
    }

    public static final SimpleDateFormat getDateFormatWithTimeZone() {
        return dateFormatWithTimeZone;
    }

    public static final SimpleDateFormat getDateFormatWithTimeZoneForRecipe() {
        return dateFormatWithTimeZoneForRecipe;
    }

    public static final SimpleDateFormat getFormatWithDayMonthYearHMS() {
        return formatWithDayMonthYearHMS;
    }

    public static final SimpleDateFormat getFormatWithHourMinSec() {
        return formatWithHourMinSec;
    }

    public static final SimpleDateFormat getFormatWithYearHourMinSec() {
        return formatWithYearHourMinSec;
    }

    public static final SimpleDateFormat getServerDateFormat() {
        return serverDateFormat;
    }

    public static final Date toMEATERServerDateFormat(String str) {
        m.f(str, "<this>");
        try {
            return serverDateFormat.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }
}
