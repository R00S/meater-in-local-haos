package e3;

import X1.C1804a;
import X1.L;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: DefaultTrackNameProvider.java */
/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3189e implements InterfaceC3184E {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f40411a;

    public C3189e(Resources resources) {
        this.f40411a = (Resources) C1804a.e(resources);
    }

    private String b(U1.s sVar) {
        int i10 = sVar.f17137D;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f40411a.getString(C3181B.f40301B) : i10 != 8 ? this.f40411a.getString(C3181B.f40300A) : this.f40411a.getString(C3181B.f40302C) : this.f40411a.getString(C3181B.f40330z) : this.f40411a.getString(C3181B.f40321q);
    }

    private String c(U1.s sVar) {
        int i10 = sVar.f17157j;
        return i10 == -1 ? "" : this.f40411a.getString(C3181B.f40320p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(U1.s sVar) {
        return TextUtils.isEmpty(sVar.f17149b) ? "" : sVar.f17149b;
    }

    private String e(U1.s sVar) {
        String strJ = j(f(sVar), h(sVar));
        return TextUtils.isEmpty(strJ) ? d(sVar) : strJ;
    }

    private String f(U1.s sVar) {
        String str = sVar.f17151d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeW = L.W();
        String displayName = localeForLanguageTag.getDisplayName(localeW);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeW) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(U1.s sVar) {
        int i10 = sVar.f17169v;
        int i11 = sVar.f17170w;
        return (i10 == -1 || i11 == -1) ? "" : this.f40411a.getString(C3181B.f40322r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(U1.s sVar) {
        String string = (sVar.f17153f & 2) != 0 ? this.f40411a.getString(C3181B.f40323s) : "";
        if ((sVar.f17153f & 4) != 0) {
            string = j(string, this.f40411a.getString(C3181B.f40326v));
        }
        if ((sVar.f17153f & 8) != 0) {
            string = j(string, this.f40411a.getString(C3181B.f40325u));
        }
        return (sVar.f17153f & 1088) != 0 ? j(string, this.f40411a.getString(C3181B.f40324t)) : string;
    }

    private static int i(U1.s sVar) {
        int iK = U1.z.k(sVar.f17162o);
        if (iK != -1) {
            return iK;
        }
        if (U1.z.n(sVar.f17158k) != null) {
            return 2;
        }
        if (U1.z.c(sVar.f17158k) != null) {
            return 1;
        }
        if (sVar.f17169v == -1 && sVar.f17170w == -1) {
            return (sVar.f17137D == -1 && sVar.f17138E == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f40411a.getString(C3181B.f40319o, string, str);
            }
        }
        return string;
    }

    @Override // e3.InterfaceC3184E
    public String a(U1.s sVar) {
        int i10 = i(sVar);
        String strJ = i10 == 2 ? j(h(sVar), g(sVar), c(sVar)) : i10 == 1 ? j(e(sVar), b(sVar), c(sVar)) : e(sVar);
        if (strJ.length() != 0) {
            return strJ;
        }
        String str = sVar.f17151d;
        return (str == null || str.trim().isEmpty()) ? this.f40411a.getString(C3181B.f40303D) : this.f40411a.getString(C3181B.f40304E, str);
    }
}
