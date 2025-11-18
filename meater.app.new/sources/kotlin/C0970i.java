package kotlin;

import U0.t;
import b0.i;
import kotlin.C1560o;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aC\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb0/i;", "LC/j;", "state", "LC/g;", "beyondBoundsInfo", "", "reverseLayout", "LU0/t;", "layoutDirection", "Lx/q;", "orientation", "enabled", "b", "(Lb0/i;LC/j;LC/g;ZLU0/t;Lx/q;ZLO/l;I)Lb0/i;", "", "c", "()Ljava/lang/Void;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970i {
    public static final i b(i iVar, InterfaceC0971j interfaceC0971j, C0968g c0968g, boolean z10, t tVar, EnumC5037q enumC5037q, boolean z11, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1331498025, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z11) {
            interfaceC1554l.S(-1890632411);
            boolean z12 = ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.R(interfaceC0971j)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.R(c0968g)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC1554l.c(z10)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC1554l.R(tVar)) || (i10 & 24576) == 16384) | ((((458752 & i10) ^ 196608) > 131072 && interfaceC1554l.R(enumC5037q)) || (i10 & 196608) == 131072);
            Object objF = interfaceC1554l.f();
            if (z12 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new C0969h(interfaceC0971j, c0968g, z10, tVar, enumC5037q);
                interfaceC1554l.J(objF);
            }
            iVar = iVar.e((C0969h) objF);
            interfaceC1554l.I();
        } else {
            interfaceC1554l.S(-1890658823);
            interfaceC1554l.I();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
