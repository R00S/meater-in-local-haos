package androidx.compose.foundation.lazy.layout;

import com.apptionlabs.meater_app.data.Temperature;
import kotlin.C;
import kotlin.C1560o;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.q;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb0/i;", "Lkotlin/Function0;", "LC/q;", "itemProviderLambda", "LC/C;", "state", "Lx/q;", "orientation", "", "userScrollEnabled", "reverseScrolling", "c", "(Lb0/i;LBa/a;LC/C;Lx/q;ZZLO/l;I)Lb0/i;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "b", "(II)F", "canScrollForward", "a", "(IIZ)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final float a(int i10, int i11, boolean z10) {
        return z10 ? b(i10, i11) + 100 : b(i10, i11);
    }

    public static final float b(int i10, int i11) {
        return i11 + (i10 * Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);
    }

    public static final b0.i c(b0.i iVar, Ba.a<? extends q> aVar, C c10, EnumC5037q enumC5037q, boolean z10, boolean z11, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        b0.i iVarE = iVar.e(new LazyLayoutSemanticsModifier(aVar, c10, enumC5037q, z10, z11));
        if (C1560o.J()) {
            C1560o.R();
        }
        return iVarE;
    }
}
