package y0;

import kotlin.Metadata;
import y0.Z;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ly0/E;", "Ly0/Z$a;", "LA0/P;", "within", "<init>", "(LA0/P;)V", "b", "LA0/P;", "", "e", "()I", "parentWidth", "LU0/t;", "d", "()LU0/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5094E extends Z.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final A0.P within;

    public C5094E(A0.P p10) {
        this.within = p10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y0.Z.a
    /* renamed from: d */
    public U0.t getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y0.Z.a
    /* renamed from: e */
    public int getParentWidth() {
        return this.within.y0();
    }
}
