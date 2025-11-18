package Y2;

import android.text.TextUtils;
import java.util.regex.Pattern;
import l8.C3910c;
import m8.AbstractC3979B;

/* compiled from: TextEmphasis.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f19317d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3979B<String> f19318e = AbstractC3979B.K("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC3979B<String> f19319f = AbstractC3979B.L("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC3979B<String> f19320g = AbstractC3979B.K("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC3979B<String> f19321h = AbstractC3979B.L("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f19322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19324c;

    private b(int i10, int i11, int i12) {
        this.f19322a = i10;
        this.f19323b = i11;
        this.f19324c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = C3910c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(AbstractC3979B.F(TextUtils.split(strE, f19317d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Y2.b b(m8.AbstractC3979B<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.b.b(m8.B):Y2.b");
    }
}
