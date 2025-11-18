package F0;

import A0.v0;
import b0.i;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0015\u0010\u0013R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"LF0/d;", "Lb0/i$c;", "LA0/v0;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "LF0/x;", "Loa/F;", "properties", "<init>", "(ZZLBa/l;)V", "m1", "(LF0/x;)V", "O", "Z", "getMergeDescendants", "()Z", "j2", "(Z)V", "P", "setClearingSemantics", "Q", "LBa/l;", "getProperties", "()LBa/l;", "k2", "(LBa/l;)V", "y0", "shouldClearDescendantSemantics", "A1", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends i.c implements v0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean mergeDescendants;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super x, C4153F> properties;

    public d(boolean z10, boolean z11, Ba.l<? super x, C4153F> lVar) {
        this.mergeDescendants = z10;
        this.isClearingSemantics = z11;
        this.properties = lVar;
    }

    @Override // A0.v0
    /* renamed from: A1, reason: from getter */
    public boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final void j2(boolean z10) {
        this.mergeDescendants = z10;
    }

    public final void k2(Ba.l<? super x, C4153F> lVar) {
        this.properties = lVar;
    }

    @Override // A0.v0
    public void m1(x xVar) {
        this.properties.invoke(xVar);
    }

    @Override // A0.v0
    /* renamed from: y0, reason: from getter */
    public boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }
}
