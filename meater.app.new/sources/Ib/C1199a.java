package Ib;

import Hb.x0;
import Ib.f;
import Ib.g;
import kotlin.jvm.internal.C3862t;

/* compiled from: ClassicTypeCheckerState.kt */
/* renamed from: Ib.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1199a {
    public static final x0 a(boolean z10, boolean z11, InterfaceC1200b typeSystemContext, f kotlinTypePreparator, g kotlinTypeRefiner) {
        C3862t.g(typeSystemContext, "typeSystemContext");
        C3862t.g(kotlinTypePreparator, "kotlinTypePreparator");
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new x0(z10, z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ x0 b(boolean z10, boolean z11, InterfaceC1200b interfaceC1200b, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC1200b = u.f7008a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f6981a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f6982a;
        }
        return a(z10, z11, interfaceC1200b, fVar, gVar);
    }
}
