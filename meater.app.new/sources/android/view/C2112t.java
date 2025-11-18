package android.view;

import Xb.R0;
import Xb.Z;
import kotlin.C4734X;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/m;", "Landroidx/lifecycle/p;", "a", "(Landroidx/lifecycle/m;)Landroidx/lifecycle/p;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2112t {
    public static final AbstractC2109p a(AbstractC2106m abstractC2106m) {
        C2110q c2110q;
        C3862t.g(abstractC2106m, "<this>");
        do {
            C2110q c2110q2 = (C2110q) abstractC2106m.c().get();
            if (c2110q2 != null) {
                return c2110q2;
            }
            c2110q = new C2110q(abstractC2106m, R0.b(null, 1, null).s(Z.c().M0()));
        } while (!C4734X.a(abstractC2106m.c(), null, c2110q));
        c2110q.c();
        return c2110q;
    }
}
