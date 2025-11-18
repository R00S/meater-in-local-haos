package v5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: GridSpacingItemDecoration.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv5/a;", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "spanCount", "spacing", "", "includeEdge", "<init>", "(IIZ)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "Loa/F;", "e", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "a", "I", "b", "c", "Z", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4893a extends RecyclerView.p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int spanCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean includeEdge;

    public C4893a(int i10, int i11, boolean z10) {
        this.spanCount = i10;
        this.spacing = i11;
        this.includeEdge = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(Rect outRect, View view, RecyclerView parent, RecyclerView.C state) {
        C3862t.g(outRect, "outRect");
        C3862t.g(view, "view");
        C3862t.g(parent, "parent");
        C3862t.g(state, "state");
        int iL0 = parent.l0(view);
        int i10 = this.spanCount;
        int i11 = iL0 % i10;
        if (this.includeEdge) {
            int i12 = this.spacing;
            outRect.left = i12 - ((i11 * i12) / i10);
            outRect.right = ((i11 + 1) * i12) / i10;
            if (iL0 < i10) {
                outRect.top = i12;
            }
            outRect.bottom = i12;
            return;
        }
        int i13 = this.spacing;
        outRect.left = (i11 * i13) / i10;
        outRect.right = i13 - (((i11 + 1) * i13) / i10);
        if (iL0 >= i10) {
            outRect.top = i13;
        }
    }
}
