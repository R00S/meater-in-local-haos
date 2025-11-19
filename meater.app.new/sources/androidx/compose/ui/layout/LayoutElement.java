package androidx.compose.ui.layout;

import A0.V;
import Ba.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import y0.H;
import y0.J;
import y0.K;
import y0.LayoutModifierImpl;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "LA0/V;", "Ly0/C;", "Lkotlin/Function3;", "Ly0/K;", "Ly0/H;", "LU0/b;", "Ly0/J;", "measure", "<init>", "(LBa/q;)V", "p", "()Ly0/C;", "node", "Loa/F;", "s", "(Ly0/C;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LBa/q;", "getMeasure", "()LBa/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends V<LayoutModifierImpl> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q<K, H, U0.b, J> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(q<? super K, ? super H, ? super U0.b, ? extends J> qVar) {
        this.measure = qVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutElement) && C3862t.b(this.measure, ((LayoutElement) other).measure);
    }

    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutModifierImpl m() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(LayoutModifierImpl node) {
        node.j2(this.measure);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }
}
