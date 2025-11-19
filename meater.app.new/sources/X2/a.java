package X2;

import S2.e;
import S2.r;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.n;
import X1.y;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.apptionlabs.meater_app.data.Config;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m8.AbstractC4009y;

/* compiled from: SubripParser.java */
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18709d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f18710e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f18711a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f18712b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final y f18713c = new y();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private W1.a e(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.a.e(android.text.Spanned, java.lang.String):W1.a");
    }

    private Charset f(y yVar) {
        Charset charsetR = yVar.R();
        return charsetR != null ? charsetR : StandardCharsets.UTF_8;
    }

    public static float g(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long h(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) C1804a.e(matcher.group(i10 + 2))) * Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX) + (Long.parseLong((String) C1804a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String i(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f18710e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<e> interfaceC1811h) throws NumberFormatException {
        String str;
        InterfaceC1811h<e> interfaceC1811h2;
        String strT;
        String str2;
        String str3;
        InterfaceC1811h<e> interfaceC1811h3;
        InterfaceC1811h<e> interfaceC1811h4 = interfaceC1811h;
        String str4 = "SubripParser";
        this.f18713c.U(bArr, i10 + i11);
        this.f18713c.W(i10);
        Charset charsetF = f(this.f18713c);
        ArrayList arrayList = (bVar.f15294a == -9223372036854775807L || !bVar.f15295b) ? null : new ArrayList();
        while (true) {
            String strT2 = this.f18713c.t(charsetF);
            if (strT2 == null) {
                break;
            }
            if (strT2.length() != 0) {
                try {
                    Integer.parseInt(strT2);
                    strT = this.f18713c.t(charsetF);
                } catch (NumberFormatException unused) {
                    str = str4;
                    interfaceC1811h2 = interfaceC1811h4;
                    n.h(str, "Skipping invalid index: " + strT2);
                }
                if (strT == null) {
                    n.h(str4, "Unexpected end");
                    break;
                }
                Matcher matcher = f18709d.matcher(strT);
                if (matcher.matches()) {
                    long jH = h(matcher, 1);
                    long jH2 = h(matcher, 6);
                    int i12 = 0;
                    this.f18711a.setLength(0);
                    this.f18712b.clear();
                    String strT3 = this.f18713c.t(charsetF);
                    while (!TextUtils.isEmpty(strT3)) {
                        if (this.f18711a.length() > 0) {
                            this.f18711a.append("<br>");
                        }
                        this.f18711a.append(i(strT3, this.f18712b));
                        strT3 = this.f18713c.t(charsetF);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f18711a.toString());
                    while (true) {
                        if (i12 >= this.f18712b.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = this.f18712b.get(i12);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i12++;
                        }
                    }
                    long j10 = bVar.f15294a;
                    if (j10 == -9223372036854775807L || jH >= j10) {
                        interfaceC1811h3 = interfaceC1811h;
                        interfaceC1811h3.accept(new e(AbstractC4009y.H(e(spannedFromHtml, str3)), jH, jH2 - jH));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new e(AbstractC4009y.H(e(spannedFromHtml, str3)), jH, jH2 - jH));
                        }
                        interfaceC1811h3 = interfaceC1811h;
                    }
                    interfaceC1811h4 = interfaceC1811h3;
                    str4 = str2;
                } else {
                    String str5 = str4;
                    interfaceC1811h2 = interfaceC1811h4;
                    str = str5;
                    n.h(str, "Skipping invalid timing: " + strT);
                    interfaceC1811h4 = interfaceC1811h2;
                    str4 = str;
                }
            }
        }
        InterfaceC1811h<e> interfaceC1811h5 = interfaceC1811h4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC1811h5.accept((e) it.next());
            }
        }
    }

    @Override // S2.r
    public int d() {
        return 1;
    }
}
