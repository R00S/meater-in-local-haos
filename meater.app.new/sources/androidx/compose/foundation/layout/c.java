package androidx.compose.foundation.layout;

import A0.p0;
import b0.i;
import kotlin.Metadata;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/c;", "LA0/p0;", "Lb0/i$c;", "Lb0/c;", "alignment", "", "matchParentSize", "<init>", "(Lb0/c;Z)V", "LU0/d;", "", "parentData", "l2", "(LU0/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/c;", "O", "Lb0/c;", "j2", "()Lb0/c;", "m2", "(Lb0/c;)V", "P", "Z", "k2", "()Z", "n2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends i.c implements p0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private b0.c alignment;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean matchParentSize;

    public c(b0.c cVar, boolean z10) {
        this.alignment = cVar;
        this.matchParentSize = z10;
    }

    /* renamed from: j2, reason: from getter */
    public final b0.c getAlignment() {
        return this.alignment;
    }

    /* renamed from: k2, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public final void m2(b0.c cVar) {
        this.alignment = cVar;
    }

    public final void n2(boolean z10) {
        this.matchParentSize = z10;
    }

    @Override // A0.p0
    /* renamed from: l2, reason: merged with bridge method [inline-methods] */
    public c r(U0.d dVar, Object obj) {
        return this;
    }
}
