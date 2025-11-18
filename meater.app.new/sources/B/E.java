package B;

import kotlin.Metadata;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"LB/E;", "", "", "sizes", "positions", "<init>", "([I[I)V", "a", "[I", "b", "()[I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int[] sizes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] positions;

    public E(int[] iArr, int[] iArr2) {
        this.sizes = iArr;
        this.positions = iArr2;
    }

    /* renamed from: a, reason: from getter */
    public final int[] getPositions() {
        return this.positions;
    }

    /* renamed from: b, reason: from getter */
    public final int[] getSizes() {
        return this.sizes;
    }
}
