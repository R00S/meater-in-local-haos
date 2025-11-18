package A;

import A0.p0;
import b0.i;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LA/K;", "LA0/p0;", "Lb0/i$c;", "", "weight", "", "fill", "<init>", "(FZ)V", "LU0/d;", "", "parentData", "LA/T;", "j2", "(LU0/d;Ljava/lang/Object;)LA/T;", "O", "F", "getWeight", "()F", "l2", "(F)V", "P", "Z", "getFill", "()Z", "k2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K extends i.c implements p0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float weight;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean fill;

    public K(float f10, boolean z10) {
        this.weight = f10;
        this.fill = z10;
    }

    @Override // A0.p0
    /* renamed from: j2, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData r(U0.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.g(this.weight);
        rowColumnParentData.f(this.fill);
        return rowColumnParentData;
    }

    public final void k2(boolean z10) {
        this.fill = z10;
    }

    public final void l2(float f10) {
        this.weight = f10;
    }
}
