package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: RingToneActivityBinding.java */
/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9876a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9877b;

    /* renamed from: c, reason: collision with root package name */
    public final View f9878c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f9879d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f9880e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f9881f;

    /* renamed from: g, reason: collision with root package name */
    public final ScrollView f9882g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f9883h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialToolbar f9884i;

    private b1(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, View view, ConstraintLayout constraintLayout2, LinearLayout linearLayout, RecyclerView recyclerView, ScrollView scrollView, TextView textView, MaterialToolbar materialToolbar) {
        this.f9876a = constraintLayout;
        this.f9877b = appBarLayout;
        this.f9878c = view;
        this.f9879d = constraintLayout2;
        this.f9880e = linearLayout;
        this.f9881f = recyclerView;
        this.f9882g = scrollView;
        this.f9883h = textView;
        this.f9884i = materialToolbar;
    }

    public static b1 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.divider;
            View viewA = A3.a.a(view, R.id.divider);
            if (viewA != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.listLayout;
                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.listLayout);
                if (linearLayout != null) {
                    i10 = R.id.ringToneRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.ringToneRecyclerView);
                    if (recyclerView != null) {
                        i10 = R.id.scroll_layout;
                        ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.scroll_layout);
                        if (scrollView != null) {
                            i10 = R.id.soundText;
                            TextView textView = (TextView) A3.a.a(view, R.id.soundText);
                            if (textView != null) {
                                i10 = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                if (materialToolbar != null) {
                                    return new b1(constraintLayout, appBarLayout, viewA, constraintLayout, linearLayout, recyclerView, scrollView, textView, materialToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.ring_tone_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9876a;
    }
}
