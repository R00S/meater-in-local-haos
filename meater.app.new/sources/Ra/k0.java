package Ra;

import Hb.y0;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes3.dex */
public interface k0 {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements k0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15161a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ra.k0
        public Collection<Hb.U> a(y0 currentTypeConstructor, Collection<? extends Hb.U> superTypes, Ba.l<? super y0, ? extends Iterable<? extends Hb.U>> neighbors, Ba.l<? super Hb.U, C4153F> reportLoop) {
            C3862t.g(currentTypeConstructor, "currentTypeConstructor");
            C3862t.g(superTypes, "superTypes");
            C3862t.g(neighbors, "neighbors");
            C3862t.g(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection<Hb.U> a(y0 y0Var, Collection<? extends Hb.U> collection, Ba.l<? super y0, ? extends Iterable<? extends Hb.U>> lVar, Ba.l<? super Hb.U, C4153F> lVar2);
}
