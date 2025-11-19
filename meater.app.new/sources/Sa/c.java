package Sa;

import Hb.U;
import Ra.InterfaceC1692e;
import Ra.h0;
import java.util.Map;
import vb.AbstractC4943g;
import xb.C5087e;

/* compiled from: AnnotationDescriptor.kt */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: AnnotationDescriptor.kt */
    public static final class a {
        public static qb.c a(c cVar) {
            InterfaceC1692e interfaceC1692eL = C5087e.l(cVar);
            if (interfaceC1692eL == null) {
                return null;
            }
            if (Jb.l.m(interfaceC1692eL)) {
                interfaceC1692eL = null;
            }
            if (interfaceC1692eL != null) {
                return C5087e.k(interfaceC1692eL);
            }
            return null;
        }
    }

    U a();

    Map<qb.f, AbstractC4943g<?>> b();

    qb.c f();

    h0 j();
}
