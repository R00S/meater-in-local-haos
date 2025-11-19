package androidx.compose.foundation.lazy.layout;

import A0.V;
import kotlin.C;
import kotlin.EnumC5037q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.q;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "LA0/V;", "Landroidx/compose/foundation/lazy/layout/g;", "Lkotlin/Function0;", "LC/q;", "itemProviderLambda", "LC/C;", "state", "Lx/q;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(LBa/a;LC/C;Lx/q;ZZ)V", "p", "()Landroidx/compose/foundation/lazy/layout/g;", "node", "Loa/F;", "s", "(Landroidx/compose/foundation/lazy/layout/g;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LBa/a;", "getItemProviderLambda", "()LBa/a;", "c", "LC/C;", "getState", "()LC/C;", "d", "Lx/q;", "getOrientation", "()Lx/q;", "e", "Z", "getUserScrollEnabled", "()Z", "f", "getReverseScrolling", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends V<g> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<q> itemProviderLambda;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final EnumC5037q orientation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean userScrollEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsModifier(Ba.a<? extends q> aVar, C c10, EnumC5037q enumC5037q, boolean z10, boolean z11) {
        this.itemProviderLambda = aVar;
        this.state = c10;
        this.orientation = enumC5037q;
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) other;
        return this.itemProviderLambda == lazyLayoutSemanticsModifier.itemProviderLambda && C3862t.b(this.state, lazyLayoutSemanticsModifier.state) && this.orientation == lazyLayoutSemanticsModifier.orientation && this.userScrollEnabled == lazyLayoutSemanticsModifier.userScrollEnabled && this.reverseScrolling == lazyLayoutSemanticsModifier.reverseScrolling;
    }

    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g m() {
        return new g(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(g node) {
        node.n2(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }
}
