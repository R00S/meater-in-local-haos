package A0;

import b0.i;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: ObserverModifierNode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb0/i$c;", "LA0/h0;", "T", "Lkotlin/Function0;", "Loa/F;", "block", "a", "(Lb0/i$c;LBa/a;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {
    public static final <T extends i.c & h0> void a(T t10, Ba.a<C4153F> aVar) {
        j0 ownerScope = t10.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new j0(t10);
            t10.e2(ownerScope);
        }
        C0832k.l(t10).getSnapshotObserver().i(ownerScope, j0.INSTANCE.a(), aVar);
    }
}
