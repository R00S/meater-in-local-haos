package v5;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RecyclerViewScrollListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lv5/n;", "Landroidx/recyclerview/widget/RecyclerView$v;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "Loa/F;", "b", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "index", "c", "(I)V", "a", "I", "firstVisibleItem", "visibleItemCount", "", "Z", "enabled", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class n extends RecyclerView.v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int visibleItemCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile boolean enabled = true;

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void b(RecyclerView recyclerView, int dx, int dy) {
        C3862t.g(recyclerView, "recyclerView");
        super.b(recyclerView, dx, dy);
        if (this.enabled) {
            RecyclerView.q layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new IllegalArgumentException("Expected recyclerview to have linear layout manager");
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.visibleItemCount = linearLayoutManager.O();
            int iA2 = linearLayoutManager.a2();
            this.firstVisibleItem = iA2;
            c(iA2);
        }
    }

    public abstract void c(int index);
}
