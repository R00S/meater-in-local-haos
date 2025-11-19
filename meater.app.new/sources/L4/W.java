package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;

/* compiled from: FragmentChooseProductBinding.java */
/* loaded from: classes2.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9688a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9689b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f9690c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f9691d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9692e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f9693f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f9694g;

    private W(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f9688a = constraintLayout;
        this.f9689b = textView;
        this.f9690c = recyclerView;
        this.f9691d = constraintLayout2;
        this.f9692e = textView2;
        this.f9693f = appCompatTextView;
        this.f9694g = appCompatTextView2;
    }

    public static W a(View view) {
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
                            return new W(constraintLayout, textView, recyclerView, constraintLayout, textView2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static W c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_product, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9688a;
    }
}
