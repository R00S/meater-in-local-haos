package androidx.compose.foundation.layout;

import A.c0;
import A0.V;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "LA0/V;", "LA/c0;", "Lb0/c$c;", "alignment", "<init>", "(Lb0/c$c;)V", "p", "()LA/c0;", "node", "Loa/F;", "s", "(LA/c0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lb0/c$c;", "getAlignment", "()Lb0/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends V<c0> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c.InterfaceC0420c alignment;

    public VerticalAlignElement(c.InterfaceC0420c interfaceC0420c) {
        this.alignment = interfaceC0420c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = other instanceof VerticalAlignElement ? (VerticalAlignElement) other : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return C3862t.b(this.alignment, verticalAlignElement.alignment);
    }

    public int hashCode() {
        return this.alignment.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c0 m() {
        return new c0(this.alignment);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(c0 node) {
        node.k2(this.alignment);
    }
}
