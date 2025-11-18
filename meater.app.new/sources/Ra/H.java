package Ra;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ModuleDescriptor.kt */
/* loaded from: classes3.dex */
public interface H extends InterfaceC1700m {

    /* compiled from: ModuleDescriptor.kt */
    public static final class a {
        public static <R, D> R a(H h10, InterfaceC1702o<R, D> visitor, D d10) {
            C3862t.g(visitor, "visitor");
            return visitor.l(h10, d10);
        }

        public static InterfaceC1700m b(H h10) {
            return null;
        }
    }

    V G(qb.c cVar);

    boolean I0(H h10);

    <T> T M(G<T> g10);

    Oa.j q();

    List<H> q0();

    Collection<qb.c> r(qb.c cVar, Ba.l<? super qb.f, Boolean> lVar);
}
