package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;

/* compiled from: FragmentGraphNotesBinding.java */
/* renamed from: L4.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1369c0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f9950a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9951b;

    /* renamed from: c, reason: collision with root package name */
    public final View f9952c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f9953d;

    /* renamed from: e, reason: collision with root package name */
    public final ScrollView f9954e;

    private C1369c0(ScrollView scrollView, View view, View view2, RecyclerView recyclerView, ScrollView scrollView2) {
        this.f9950a = scrollView;
        this.f9951b = view;
        this.f9952c = view2;
        this.f9953d = recyclerView;
        this.f9954e = scrollView2;
    }

    public static C1369c0 a(View view) {
        int i10 = R.id.divider;
        View viewA = A3.a.a(view, R.id.divider);
        if (viewA != null) {
            i10 = R.id.divider_1;
            View viewA2 = A3.a.a(view, R.id.divider_1);
            if (viewA2 != null) {
                i10 = R.id.noteRecyclerView;
                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.noteRecyclerView);
                if (recyclerView != null) {
                    ScrollView scrollView = (ScrollView) view;
                    return new C1369c0(scrollView, viewA, viewA2, recyclerView, scrollView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1369c0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_graph_notes, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f9950a;
    }
}
