package w4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: SwipingRecyclerViewAdapter.java */
/* loaded from: classes.dex */
public abstract class P<T> extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name */
    static SwipeLayout f51864E;

    public static void I() {
        SwipeLayout swipeLayout = f51864E;
        if (swipeLayout != null) {
            swipeLayout.k();
            f51864E = null;
        }
    }

    /* compiled from: SwipingRecyclerViewAdapter.java */
    public static abstract class a extends RecyclerView.G {
        public SwipeLayout swipeLayout;

        public a(View view) {
            super(view);
            SwipeLayout swipeLayout = getSwipeLayout();
            this.swipeLayout = swipeLayout;
            if (swipeLayout != null) {
                swipeLayout.setOnSwipeListener(new C0750a(this));
            }
        }

        public abstract SwipeLayout getSwipeLayout();

        /* compiled from: SwipingRecyclerViewAdapter.java */
        /* renamed from: w4.P$a$a, reason: collision with other inner class name */
        class C0750a implements SwipeLayout.c {
            C0750a(a aVar) {
            }

            @Override // ru.rambler.libs.swipe_layout.SwipeLayout.c
            public void d(SwipeLayout swipeLayout, boolean z10) {
                SwipeLayout swipeLayout2 = P.f51864E;
                if (swipeLayout2 != null && swipeLayout2 != swipeLayout) {
                    swipeLayout2.k();
                }
                P.f51864E = swipeLayout;
            }

            @Override // ru.rambler.libs.swipe_layout.SwipeLayout.c
            public void a(SwipeLayout swipeLayout, boolean z10) {
            }

            @Override // ru.rambler.libs.swipe_layout.SwipeLayout.c
            public void b(SwipeLayout swipeLayout, boolean z10) {
            }

            @Override // ru.rambler.libs.swipe_layout.SwipeLayout.c
            public void c(SwipeLayout swipeLayout, boolean z10) {
            }
        }
    }
}
