package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.NoteCookGraph;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: GraphSelectorFragmentBinding.java */
/* renamed from: L4.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1414z0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10816a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10817b;

    /* renamed from: c, reason: collision with root package name */
    public final NoteCookGraph f10818c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10819d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f10820e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f10821f;

    private C1414z0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, NoteCookGraph noteCookGraph, TextView textView, AppCompatTextView appCompatTextView, MaterialToolbar materialToolbar) {
        this.f10816a = constraintLayout;
        this.f10817b = appBarLayout;
        this.f10818c = noteCookGraph;
        this.f10819d = textView;
        this.f10820e = appCompatTextView;
        this.f10821f = materialToolbar;
    }

    public static C1414z0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.graph;
            NoteCookGraph noteCookGraph = (NoteCookGraph) A3.a.a(view, R.id.graph);
            if (noteCookGraph != null) {
                i10 = R.id.saveTextView;
                TextView textView = (TextView) A3.a.a(view, R.id.saveTextView);
                if (textView != null) {
                    i10 = R.id.timeText;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.timeText);
                    if (appCompatTextView != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new C1414z0((ConstraintLayout) view, appBarLayout, noteCookGraph, textView, appCompatTextView, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1414z0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.graph_selector_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10816a;
    }
}
