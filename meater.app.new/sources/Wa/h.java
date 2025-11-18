package Wa;

import Ub.n;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes3.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(qb.b bVar) {
        String strB = bVar.g().b();
        C3862t.f(strB, "asString(...)");
        String strB2 = n.B(strB, '.', '$', false, 4, null);
        if (bVar.f().d()) {
            return strB2;
        }
        return bVar.f() + '.' + strB2;
    }
}
