package androidx.compose.foundation;

import A0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import w.InterfaceC4949B;
import z.InterfaceC5160i;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "LA0/V;", "Landroidx/compose/foundation/l;", "Lz/i;", "interactionSource", "Lw/B;", "indication", "<init>", "(Lz/i;Lw/B;)V", "p", "()Landroidx/compose/foundation/l;", "node", "Loa/F;", "s", "(Landroidx/compose/foundation/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lz/i;", "c", "Lw/B;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IndicationModifierElement extends V<l> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5160i interactionSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4949B indication;

    public IndicationModifierElement(InterfaceC5160i interfaceC5160i, InterfaceC4949B interfaceC4949B) {
        this.interactionSource = interfaceC5160i;
        this.indication = interfaceC4949B;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) other;
        return C3862t.b(this.interactionSource, indicationModifierElement.interactionSource) && C3862t.b(this.indication, indicationModifierElement.indication);
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public l m() {
        return new l(this.indication.a(this.interactionSource));
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(l node) {
        node.p2(this.indication.a(this.interactionSource));
    }
}
