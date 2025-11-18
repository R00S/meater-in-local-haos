package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: LocaleOverlayHelper.java */
/* loaded from: classes.dex */
final class u {
    private static n1.j a(n1.j jVar, n1.j jVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < jVar.f() + jVar2.f()) {
            Locale localeC = i10 < jVar.f() ? jVar.c(i10) : jVar2.c(i10 - jVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return n1.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static n1.j b(n1.j jVar, n1.j jVar2) {
        return (jVar == null || jVar.e()) ? n1.j.d() : a(jVar, jVar2);
    }
}
