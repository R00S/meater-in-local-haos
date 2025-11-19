package androidx.compose.ui.platform;

import java.util.List;
import kotlin.Metadata;
import s.AbstractC4405o;
import s.C4381C;

/* compiled from: SemanticsUtils.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/U0;", "", "LF0/p;", "semanticsNode", "Ls/o;", "Landroidx/compose/ui/platform/V0;", "currentSemanticsNodes", "<init>", "(LF0/p;Ls/o;)V", "LF0/l;", "a", "LF0/l;", "b", "()LF0/l;", "unmergedConfig", "Ls/C;", "Ls/C;", "()Ls/C;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final F0.l unmergedConfig;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4381C children = s.r.b();

    public U0(F0.p pVar, AbstractC4405o<V0> abstractC4405o) {
        this.unmergedConfig = pVar.getUnmergedConfig();
        List<F0.p> listT = pVar.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            F0.p pVar2 = listT.get(i10);
            if (abstractC4405o.a(pVar2.getId())) {
                this.children.f(pVar2.getId());
            }
        }
    }

    /* renamed from: a, reason: from getter */
    public final C4381C getChildren() {
        return this.children;
    }

    /* renamed from: b, reason: from getter */
    public final F0.l getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
