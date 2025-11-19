package W2;

import S2.e;
import S2.r;
import W1.a;
import W2.c;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.L;
import X1.n;
import X1.y;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.C3910c;

/* compiled from: SsaParser.java */
/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f18360g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18361a;

    /* renamed from: b, reason: collision with root package name */
    private final a f18362b;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, c> f18364d;

    /* renamed from: e, reason: collision with root package name */
    private float f18365e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    private float f18366f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    private final y f18363c = new y();

    public b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f18361a = false;
            this.f18362b = null;
            return;
        }
        this.f18361a = true;
        String strH = L.H(list.get(0));
        C1804a.a(strH.startsWith("Format:"));
        this.f18362b = (a) C1804a.e(a.a(strH));
        k(new y(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int e(long j10, List<Long> list, List<List<W1.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float f(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static W1.a g(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        a.b bVarO = new a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f18369c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f18369c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f18376j == 3 && cVar.f18370d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f18370d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f18371e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f18372f;
            if (z10 && cVar.f18373g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f18373g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f18374h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f18375i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f18392a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f18368b : -1;
        }
        bVarO.p(q(i10)).l(p(i10)).i(o(i10));
        PointF pointF = bVar.f18393b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarO.k(f(bVarO.d()));
            bVarO.h(f(bVarO.c()), 0);
        } else {
            bVarO.k(pointF.x / f10);
            bVarO.h(bVar.f18393b.y / f11, 0);
        }
        return bVarO.a();
    }

    private Charset h(y yVar) {
        Charset charsetR = yVar.R();
        return charsetR != null ? charsetR : StandardCharsets.UTF_8;
    }

    private void i(String str, a aVar, List<List<W1.a>> list, List<Long> list2) {
        int i10;
        C1804a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f18359e);
        if (strArrSplit.length != aVar.f18359e) {
            n.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jN = n(strArrSplit[aVar.f18355a]);
        if (jN == -9223372036854775807L) {
            n.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jN2 = n(strArrSplit[aVar.f18356b]);
        if (jN2 == -9223372036854775807L) {
            n.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f18364d;
        c cVar = (map == null || (i10 = aVar.f18357c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[aVar.f18358d];
        W1.a aVarG = g(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f18365e, this.f18366f);
        int iE = e(jN2, list2, list);
        for (int iE2 = e(jN, list2, list); iE2 < iE; iE2++) {
            list.get(iE2).add(aVarG);
        }
    }

    private void j(y yVar, List<List<W1.a>> list, List<Long> list2, Charset charset) {
        a aVarA = this.f18361a ? this.f18362b : null;
        while (true) {
            String strT = yVar.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                aVarA = a.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    n.h("SsaParser", "Skipping dialogue line before complete format: " + strT);
                } else {
                    i(strT, aVarA, list, list2);
                }
            }
        }
    }

    private void k(y yVar, Charset charset) {
        while (true) {
            String strT = yVar.t(charset);
            if (strT == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strT)) {
                l(yVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                this.f18364d = m(yVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                n.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strT)) {
                return;
            }
        }
    }

    private void l(y yVar, Charset charset) {
        while (true) {
            String strT = yVar.t(charset);
            if (strT == null) {
                return;
            }
            if (yVar.a() != 0 && yVar.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strT.split(":");
            if (strArrSplit.length == 2) {
                String strE = C3910c.e(strArrSplit[0].trim());
                strE.hashCode();
                if (strE.equals("playresx")) {
                    this.f18365e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f18366f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> m(y yVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = yVar.t(charset);
            if (strT == null || (yVar.a() != 0 && yVar.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    n.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f18367a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long n(String str) {
        Matcher matcher = f18360g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) L.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) L.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) L.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) L.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                n.h("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int p(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                n.h("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment q(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                n.h("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<e> interfaceC1811h) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f18363c.U(bArr, i10 + i11);
        this.f18363c.W(i10);
        Charset charsetH = h(this.f18363c);
        if (!this.f18361a) {
            k(this.f18363c, charsetH);
        }
        j(this.f18363c, arrayList3, arrayList4, charsetH);
        ArrayList arrayList5 = (bVar.f15294a == -9223372036854775807L || !bVar.f15295b) ? null : new ArrayList();
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            List<W1.a> list = arrayList3.get(i12);
            if (list.isEmpty() && i12 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i12 == arrayList3.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList4.get(i12).longValue();
                long jLongValue2 = arrayList4.get(i12 + 1).longValue() - arrayList4.get(i12).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                long j10 = bVar.f15294a;
                if (j10 == -9223372036854775807L || jLongValue >= j10) {
                    interfaceC1811h.accept(new e(list, jLongValue, jLongValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new e(list, jLongValue, jLongValue2));
                }
            }
            i12++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                interfaceC1811h.accept((e) it.next());
            }
        }
    }

    @Override // S2.r
    public int d() {
        return 1;
    }
}
