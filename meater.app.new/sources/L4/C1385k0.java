package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;

/* compiled from: FragmentProductSelectionBinding.java */
/* renamed from: L4.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1385k0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10184a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10185b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10186c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f10187d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10188e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f10189f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f10190g;

    private C1385k0(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f10184a = constraintLayout;
        this.f10185b = textView;
        this.f10186c = recyclerView;
        this.f10187d = constraintLayout2;
        this.f10188e = textView2;
        this.f10189f = appCompatTextView;
        this.f10190g = appCompatTextView2;
    }

    public static C1385k0 a(View view) {
        int i10 = R.id.body1;
        TextView textView = (TextView) A3.a.a(view, R.id.body1);
        if (textView != null) {
            i10 = R.id.list;
            RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.list);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.skipLabel;
                TextView textView2 = (TextView) A3.a.a(view, R.id.skipLabel);
                if (textView2 != null) {
                    i10 = R.id.title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.title);
                    if (appCompatTextView != null) {
                        i10 = R.id.whyDoINeed;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.whyDoINeed);
                        if (appCompatTextView2 != null) {
                            return new C1385k0(constraintLayout, textView, recyclerView, constraintLayout, textView2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1385k0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_product_selection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10184a;
    }
}
