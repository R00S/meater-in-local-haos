package Hb;

import Ra.InterfaceC1700m;

/* compiled from: TypeAttributeTranslator.kt */
/* loaded from: classes3.dex */
public interface t0 {

    /* compiled from: TypeAttributeTranslator.kt */
    public static final class a {
        public static /* synthetic */ u0 a(t0 t0Var, Sa.h hVar, y0 y0Var, InterfaceC1700m interfaceC1700m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                y0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC1700m = null;
            }
            return t0Var.a(hVar, y0Var, interfaceC1700m);
        }
    }

    u0 a(Sa.h hVar, y0 y0Var, InterfaceC1700m interfaceC1700m);
}
