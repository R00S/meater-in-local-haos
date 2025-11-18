package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.p176io.NumberInput;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class StdDateFormat extends DateFormat {
    protected static final String[] ALL_FORMATS = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
    protected static final DateFormat DATE_FORMAT_ISO8601;
    protected static final DateFormat DATE_FORMAT_ISO8601_Z;
    protected static final DateFormat DATE_FORMAT_PLAIN;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    private static final Locale DEFAULT_LOCALE;
    private static final TimeZone DEFAULT_TIMEZONE;
    public static final StdDateFormat instance;
    protected transient DateFormat _formatISO8601;
    protected transient DateFormat _formatISO8601_z;
    protected transient DateFormat _formatPlain;
    protected transient DateFormat _formatRFC1123;
    protected Boolean _lenient;
    protected final Locale _locale;
    protected transient TimeZone _timezone;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        DEFAULT_TIMEZONE = timeZone;
        Locale locale = Locale.US;
        DEFAULT_LOCALE = locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
        DATE_FORMAT_RFC1123 = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        DATE_FORMAT_ISO8601 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        DATE_FORMAT_ISO8601_Z = simpleDateFormat3;
        simpleDateFormat3.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd", locale);
        DATE_FORMAT_PLAIN = simpleDateFormat4;
        simpleDateFormat4.setTimeZone(timeZone);
        instance = new StdDateFormat();
    }

    public StdDateFormat() {
        this._locale = DEFAULT_LOCALE;
    }

    private static final DateFormat _cloneFormat(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (locale.equals(DEFAULT_LOCALE)) {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    private static final boolean hasTimeZone(String str) {
        char cCharAt;
        char cCharAt2;
        int length = str.length();
        if (length < 6) {
            return false;
        }
        char cCharAt3 = str.charAt(length - 6);
        return cCharAt3 == '+' || cCharAt3 == '-' || (cCharAt = str.charAt(length + (-5))) == '+' || cCharAt == '-' || (cCharAt2 = str.charAt(length + (-3))) == '+' || cCharAt2 == '-';
    }

    protected void _clearFormats() {
        this._formatRFC1123 = null;
        this._formatISO8601 = null;
        this._formatISO8601_z = null;
        this._formatPlain = null;
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (this._formatISO8601 == null) {
            this._formatISO8601 = _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", this._timezone, this._locale, this._lenient);
        }
        return this._formatISO8601.format(date, stringBuffer, fieldPosition);
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this._timezone;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this._lenient;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    protected boolean looksLikeISO8601(String str) {
        return str.length() >= 5 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-';
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        Date asRFC1123;
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        if (looksLikeISO8601(strTrim)) {
            asRFC1123 = parseAsISO8601(strTrim, parsePosition, true);
        } else {
            int length = strTrim.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                char cCharAt = strTrim.charAt(length);
                if (cCharAt < '0' || cCharAt > '9') {
                    if (length > 0 || cCharAt != '-') {
                        break;
                    }
                }
            }
            asRFC1123 = (length >= 0 || !(strTrim.charAt(0) == '-' || NumberInput.inLongRange(strTrim, false))) ? parseAsRFC1123(strTrim, parsePosition) : new Date(Long.parseLong(strTrim));
        }
        if (asRFC1123 != null) {
            return asRFC1123;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb.toString()), parsePosition.getErrorIndex());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected Date parseAsISO8601(String str, ParsePosition parsePosition, boolean z) throws ParseException {
        DateFormat dateFormat_cloneFormat;
        int length = str.length();
        int i2 = length - 1;
        char cCharAt = str.charAt(i2);
        String str2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        if (length <= 10 && Character.isDigit(cCharAt)) {
            dateFormat_cloneFormat = this._formatPlain;
            str2 = "yyyy-MM-dd";
            if (dateFormat_cloneFormat == null) {
                dateFormat_cloneFormat = _cloneFormat(DATE_FORMAT_PLAIN, "yyyy-MM-dd", this._timezone, this._locale, this._lenient);
                this._formatPlain = dateFormat_cloneFormat;
            }
        } else if (cCharAt == 'Z') {
            DateFormat dateFormat_cloneFormat2 = this._formatISO8601_z;
            if (dateFormat_cloneFormat2 == null) {
                dateFormat_cloneFormat2 = _cloneFormat(DATE_FORMAT_ISO8601_Z, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", this._timezone, this._locale, this._lenient);
                this._formatISO8601_z = dateFormat_cloneFormat2;
            }
            if (str.charAt(length - 4) == ':') {
                StringBuilder sb = new StringBuilder(str);
                sb.insert(i2, ".000");
                str = sb.toString();
            }
            dateFormat_cloneFormat = dateFormat_cloneFormat2;
        } else if (hasTimeZone(str)) {
            int i3 = length - 3;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 == ':') {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.delete(i3, length - 2);
                str = sb2.toString();
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                str = str + "00";
            }
            int length2 = str.length();
            int iLastIndexOf = (length2 - str.lastIndexOf(84)) - 6;
            if (iLastIndexOf < 12) {
                int i4 = length2 - 5;
                StringBuilder sb3 = new StringBuilder(str);
                switch (iLastIndexOf) {
                    case 6:
                        sb3.insert(i4, "00.000");
                    case 5:
                        sb3.insert(i4, ":00.000");
                        break;
                    case 8:
                        sb3.insert(i4, ".000");
                        break;
                    case 9:
                        sb3.insert(i4, "000");
                        break;
                    case 10:
                        sb3.insert(i4, "00");
                        break;
                    case 11:
                        sb3.insert(i4, '0');
                        break;
                }
                str = sb3.toString();
            }
            dateFormat_cloneFormat = this._formatISO8601;
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
            if (dateFormat_cloneFormat == null) {
                dateFormat_cloneFormat = _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", this._timezone, this._locale, this._lenient);
                this._formatISO8601 = dateFormat_cloneFormat;
            }
        } else {
            StringBuilder sb4 = new StringBuilder(str);
            int iLastIndexOf2 = (length - str.lastIndexOf(84)) - 1;
            if (iLastIndexOf2 < 12) {
                switch (iLastIndexOf2) {
                    case 9:
                        sb4.append('0');
                        break;
                    case 10:
                        sb4.append('0');
                        sb4.append('0');
                        break;
                    case 11:
                        sb4.append('0');
                        sb4.append('0');
                        sb4.append('0');
                        break;
                    default:
                        sb4.append(".000");
                        break;
                }
            }
            sb4.append('Z');
            str = sb4.toString();
            dateFormat_cloneFormat = this._formatISO8601_z;
            if (dateFormat_cloneFormat == null) {
                dateFormat_cloneFormat = _cloneFormat(DATE_FORMAT_ISO8601_Z, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", this._timezone, this._locale, this._lenient);
                this._formatISO8601_z = dateFormat_cloneFormat;
            }
        }
        Date date = dateFormat_cloneFormat.parse(str, parsePosition);
        if (date != null) {
            return date;
        }
        throw new ParseException(String.format("Can not parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this._lenient), parsePosition.getErrorIndex());
    }

    protected Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this._formatRFC1123 == null) {
            this._formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123, "EEE, dd MMM yyyy HH:mm:ss zzz", this._timezone, this._locale, this._lenient);
        }
        return this._formatRFC1123.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        if (this._lenient != boolValueOf) {
            this._lenient = boolValueOf;
            _clearFormats();
        }
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this._timezone)) {
            return;
        }
        _clearFormats();
        this._timezone = timeZone;
    }

    public String toString() {
        String str = "DateFormat " + StdDateFormat.class.getName();
        TimeZone timeZone = this._timezone;
        if (timeZone != null) {
            str = str + " (timezone: " + timeZone + ")";
        }
        return str + "(locale: " + this._locale + ")";
    }

    public StdDateFormat withLocale(Locale locale) {
        return locale.equals(this._locale) ? this : new StdDateFormat(this._timezone, locale, this._lenient);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this._locale, this._lenient);
    }

    @Override // java.text.DateFormat, java.text.Format
    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient);
    }

    protected StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool) {
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        if (looksLikeISO8601(str)) {
            try {
                return parseAsISO8601(str, parsePosition, false);
            } catch (ParseException unused) {
                return null;
            }
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || NumberInput.inLongRange(str, false))) {
            return new Date(Long.parseLong(str));
        }
        return parseAsRFC1123(str, parsePosition);
    }
}
