package fb;

import Hb.L0;
import Ra.m0;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaTypeAttributes.kt */
/* renamed from: fb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3355b {
    public static final C3354a a(L0 l02, boolean z10, boolean z11, m0 m0Var) {
        C3862t.g(l02, "<this>");
        return new C3354a(l02, null, z11, z10, m0Var != null ? V.c(m0Var) : null, null, 34, null);
    }

    public static /* synthetic */ C3354a b(L0 l02, boolean z10, boolean z11, m0 m0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            m0Var = null;
        }
        return a(l02, z10, z11, m0Var);
    }
}
