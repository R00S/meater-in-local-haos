package androidx.compose.foundation;

import A0.AbstractC0834m;
import A0.InterfaceC0831j;
import kotlin.Metadata;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/l;", "LA0/m;", "LA0/j;", "indicationNode", "<init>", "(LA0/j;)V", "Loa/F;", "p2", "Q", "LA0/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class l extends AbstractC0834m {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0831j indicationNode;

    public l(InterfaceC0831j interfaceC0831j) {
        this.indicationNode = interfaceC0831j;
        j2(interfaceC0831j);
    }

    public final void p2(InterfaceC0831j indicationNode) {
        m2(this.indicationNode);
        this.indicationNode = indicationNode;
        j2(indicationNode);
    }
}
