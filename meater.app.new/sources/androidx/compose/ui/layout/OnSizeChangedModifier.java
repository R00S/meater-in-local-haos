package androidx.compose.ui.layout;

import A0.V;
import Ba.l;
import U0.r;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "LA0/V;", "Landroidx/compose/ui/layout/f;", "Lkotlin/Function1;", "LU0/r;", "Loa/F;", "onSizeChanged", "<init>", "(LBa/l;)V", "p", "()Landroidx/compose/ui/layout/f;", "node", "s", "(Landroidx/compose/ui/layout/f;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LBa/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends V<f> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<r, C4153F> onSizeChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(l<? super r, C4153F> lVar) {
        this.onSizeChanged = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnSizeChangedModifier) && this.onSizeChanged == ((OnSizeChangedModifier) other).onSizeChanged;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f m() {
        return new f(this.onSizeChanged);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(f node) {
        node.j2(this.onSizeChanged);
    }
}
