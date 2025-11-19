package Z2;

import S2.e;
import S2.r;
import W1.a;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.L;
import X1.n;
import X1.y;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: Tx3gParser.java */
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final y f19584a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19585b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19586c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19587d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19588e;

    /* renamed from: f, reason: collision with root package name */
    private final float f19589f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19590g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f19586c = 0;
            this.f19587d = -1;
            this.f19588e = "sans-serif";
            this.f19585b = false;
            this.f19589f = 0.85f;
            this.f19590g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f19586c = bArr[24];
        this.f19587d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f19588e = "Serif".equals(L.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f19590g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f19585b = z10;
        if (z10) {
            this.f19589f = L.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f19589f = 0.85f;
        }
    }

    private void e(y yVar, SpannableStringBuilder spannableStringBuilder) {
        C1804a.a(yVar.a() >= 12);
        int iP = yVar.P();
        int iP2 = yVar.P();
        yVar.X(2);
        int iH = yVar.H();
        yVar.X(1);
        int iQ = yVar.q();
        if (iP2 > spannableStringBuilder.length()) {
            n.h("Tx3gParser", "Truncating styl end (" + iP2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iP2 = spannableStringBuilder.length();
        }
        if (iP < iP2) {
            int i10 = iP2;
            g(spannableStringBuilder, iH, this.f19586c, iP, i10, 0);
            f(spannableStringBuilder, iQ, this.f19587d, iP, i10, 0);
            return;
        }
        n.h("Tx3gParser", "Ignoring styl with start (" + iP + ") >= end (" + iP2 + ").");
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String i(y yVar) {
        C1804a.a(yVar.a() >= 2);
        int iP = yVar.P();
        if (iP == 0) {
            return "";
        }
        int iF = yVar.f();
        Charset charsetR = yVar.R();
        int iF2 = iP - (yVar.f() - iF);
        if (charsetR == null) {
            charsetR = StandardCharsets.UTF_8;
        }
        return yVar.F(iF2, charsetR);
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<e> interfaceC1811h) {
        this.f19584a.U(bArr, i10 + i11);
        this.f19584a.W(i10);
        String strI = i(this.f19584a);
        if (strI.isEmpty()) {
            interfaceC1811h.accept(new e(AbstractC4009y.G(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strI);
        g(spannableStringBuilder, this.f19586c, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder, this.f19587d, -1, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f19588e, 0, spannableStringBuilder.length());
        float fO = this.f19589f;
        while (this.f19584a.a() >= 8) {
            int iF = this.f19584a.f();
            int iQ = this.f19584a.q();
            int iQ2 = this.f19584a.q();
            if (iQ2 == 1937013100) {
                C1804a.a(this.f19584a.a() >= 2);
                int iP = this.f19584a.P();
                for (int i12 = 0; i12 < iP; i12++) {
                    e(this.f19584a, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f19585b) {
                C1804a.a(this.f19584a.a() >= 2);
                fO = L.o(this.f19584a.P() / this.f19590g, 0.0f, 0.95f);
            }
            this.f19584a.W(iF + iQ);
        }
        interfaceC1811h.accept(new e(AbstractC4009y.H(new a.b().o(spannableStringBuilder).h(fO, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // S2.r
    public int d() {
        return 2;
    }
}
