package h2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: UrlTemplate.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f42303a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Integer> f42304b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f42305c;

    private n(List<String> list, List<Integer> list2, List<String> list3) {
        this.f42303a = list;
        this.f42304b = list2;
        this.f42305c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(java.lang.String r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.Integer> r13, java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.n.c(java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f42304b.size(); i11++) {
            sb2.append(this.f42303a.get(i11));
            if (this.f42304b.get(i11).intValue() == 1) {
                sb2.append(str);
            } else if (this.f42304b.get(i11).intValue() == 2) {
                sb2.append(String.format(Locale.US, this.f42305c.get(i11), Long.valueOf(j10)));
            } else if (this.f42304b.get(i11).intValue() == 3) {
                sb2.append(String.format(Locale.US, this.f42305c.get(i11), Integer.valueOf(i10)));
            } else if (this.f42304b.get(i11).intValue() == 4) {
                sb2.append(String.format(Locale.US, this.f42305c.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append(this.f42303a.get(this.f42304b.size()));
        return sb2.toString();
    }
}
