package M6;

import android.annotation.SuppressLint;

/* compiled from: ForcedSender.java */
/* loaded from: classes2.dex */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(K6.i<?> iVar, K6.f fVar) {
        if (!(iVar instanceof s)) {
            Q6.a.f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().u(((s) iVar).d().f(fVar), 1);
        }
    }
}
