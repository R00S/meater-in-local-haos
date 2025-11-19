package v2;

import U1.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f51013c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f51014a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f51015b = -1;

    private boolean b(String str) throws NumberFormatException {
        Matcher matcher = f51013c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) X1.L.i(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) X1.L.i(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f51014a = i10;
            this.f51015b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f51014a == -1 || this.f51015b == -1) ? false : true;
    }

    public boolean c(U1.y yVar) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            y.b bVarD = yVar.d(i10);
            if (bVarD instanceof J2.e) {
                J2.e eVar = (J2.e) bVarD;
                if ("iTunSMPB".equals(eVar.f7244D) && b(eVar.f7245E)) {
                    return true;
                }
            } else if (bVarD instanceof J2.k) {
                J2.k kVar = (J2.k) bVarD;
                if ("com.apple.iTunes".equals(kVar.f7257C) && "iTunSMPB".equals(kVar.f7258D) && b(kVar.f7259E)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
