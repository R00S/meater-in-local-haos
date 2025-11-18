package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* compiled from: dates.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\r\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m32267d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/Date;", "toHttpDateOrNull", "(Ljava/lang/String;)Ljava/util/Date;", "toHttpDateString", "(Ljava/util/Date;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "MAX_DATE", "J", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "[Ljava/text/DateFormat;", "okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "STANDARD_DATE_FORMAT", "Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "[Ljava/lang/String;", "okhttp"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DatesKt {
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 253402300799999L;
    private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.UTC);
            return simpleDateFormat;
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.text.DateFormat[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    public static final Date toHttpDateOrNull(String str) {
        C9801m.m32346f(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = STANDARD_DATE_FORMAT.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                ?? r6 = BROWSER_COMPATIBLE_DATE_FORMATS;
                ?? r7 = r6[i2];
                SimpleDateFormat simpleDateFormat = r7;
                if (r7 == 0) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i2], Locale.US);
                    simpleDateFormat2.setTimeZone(Util.UTC);
                    r6[i2] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            C10775u c10775u = C10775u.f41439a;
            return null;
        }
    }

    public static final String toHttpDateString(Date date) {
        C9801m.m32346f(date, "$this$toHttpDateString");
        String str = STANDARD_DATE_FORMAT.get().format(date);
        C9801m.m32345e(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
