package a3;

import X1.L;
import X1.y;
import androidx.media3.common.ParserException;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f20070a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(y yVar) {
        String strS = yVar.s();
        return strS != null && strS.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] strArrM1 = L.m1(str, "\\.");
        long j10 = 0;
        for (String str2 : L.l1(strArrM1[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrM1.length == 2) {
            j11 += Long.parseLong(strArrM1[1]);
        }
        return j11 * 1000;
    }

    public static void d(y yVar) throws ParserException {
        int iF = yVar.f();
        if (a(yVar)) {
            return;
        }
        yVar.W(iF);
        throw ParserException.a("Expected WEBVTT. Got " + yVar.s(), null);
    }
}
