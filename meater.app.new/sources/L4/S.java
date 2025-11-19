package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: FeedBackFragmentBinding.java */
/* loaded from: classes2.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9590a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f9591b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f9592c;

    /* renamed from: d, reason: collision with root package name */
    public final H f9593d;

    private S(ConstraintLayout constraintLayout, ProgressBar progressBar, ListView listView, H h10) {
        this.f9590a = constraintLayout;
        this.f9591b = progressBar;
        this.f9592c = listView;
        this.f9593d = h10;
    }

    public static S a(View view) {
        int i10 = R.id.containerLoading;
        ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.containerLoading);
        if (progressBar != null) {
            i10 = R.id.cookMethodRecyclerView;
            ListView listView = (ListView) A3.a.a(view, R.id.cookMethodRecyclerView);
            if (listView != null) {
                i10 = R.id.topLayout;
                View viewA = A3.a.a(view, R.id.topLayout);
                if (viewA != null) {
                    return new S((ConstraintLayout) view, progressBar, listView, H.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static S c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.feed_back_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9590a;
    }
}
