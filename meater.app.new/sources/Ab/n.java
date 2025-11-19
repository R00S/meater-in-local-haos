package Ab;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import java.util.Collection;

/* compiled from: ResolutionScope.kt */
/* loaded from: classes3.dex */
public interface n {

    /* compiled from: ResolutionScope.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(n nVar, d dVar, Ba.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                dVar = d.f1121o;
            }
            if ((i10 & 2) != 0) {
                lVar = k.f1147a.c();
            }
            return nVar.f(dVar, lVar);
        }
    }

    Collection<InterfaceC1700m> f(d dVar, Ba.l<? super qb.f, Boolean> lVar);

    InterfaceC1695h g(qb.f fVar, Za.b bVar);
}
