package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class zzaq {
    /* renamed from: a */
    public static zzc m16857a(zzp zzpVar) throws NumberFormatException {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzpVar.f26741c;
        String str = map.get("Date");
        long jM16859c = str != null ? m16859c(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i3 = 0;
            j2 = 0;
            j3 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long jM16859c2 = str3 != null ? m16859c(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jM16859c3 = str4 != null ? m16859c(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j5 = jCurrentTimeMillis + (j2 * 1000);
            if (i2 != 0) {
                j6 = j5;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j5;
            }
            j4 = j6;
        } else {
            j4 = 0;
            if (jM16859c <= 0 || jM16859c2 < jM16859c) {
                j5 = 0;
            } else {
                j5 = jCurrentTimeMillis + (jM16859c2 - jM16859c);
                j4 = j5;
            }
        }
        zzc zzcVar = new zzc();
        zzcVar.f23917a = zzpVar.f26740b;
        zzcVar.f23918b = str5;
        zzcVar.f23922f = j5;
        zzcVar.f23921e = j4;
        zzcVar.f23919c = jM16859c;
        zzcVar.f23920d = jM16859c3;
        zzcVar.f23923g = map;
        zzcVar.f23924h = zzpVar.f26742d;
        return zzcVar;
    }

    /* renamed from: b */
    static String m16858b(long j2) {
        return m16860d().format(new Date(j2));
    }

    /* renamed from: c */
    private static long m16859c(String str) {
        try {
            return m16860d().parse(str).getTime();
        } catch (ParseException e2) {
            zzag.m16530e(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* renamed from: d */
    private static SimpleDateFormat m16860d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
