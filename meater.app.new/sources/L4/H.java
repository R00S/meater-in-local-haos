package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: CookFeedBackTopBinding.java */
/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9393a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9394b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9395c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9396d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9397e;

    /* renamed from: f, reason: collision with root package name */
    public final ProgressBar f9398f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f9399g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f9400h;

    /* renamed from: i, reason: collision with root package name */
    public final RatingBar f9401i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialToolbar f9402j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f9403k;

    private H(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ProgressBar progressBar, EditText editText, TextView textView3, RatingBar ratingBar, MaterialToolbar materialToolbar, TextView textView4) {
        this.f9393a = constraintLayout;
        this.f9394b = appBarLayout;
        this.f9395c = constraintLayout2;
        this.f9396d = textView;
        this.f9397e = textView2;
        this.f9398f = progressBar;
        this.f9399g = editText;
        this.f9400h = textView3;
        this.f9401i = ratingBar;
        this.f9402j = materialToolbar;
        this.f9403k = textView4;
    }

    public static H a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.cookNameText;
            TextView textView = (TextView) A3.a.a(view, R.id.cookNameText);
            if (textView != null) {
                i10 = R.id.dateText;
                TextView textView2 = (TextView) A3.a.a(view, R.id.dateText);
                if (textView2 != null) {
                    i10 = R.id.mLoading;
                    ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.mLoading);
                    if (progressBar != null) {
                        i10 = R.id.noteField;
                        EditText editText = (EditText) A3.a.a(view, R.id.noteField);
                        if (editText != null) {
                            i10 = R.id.ovenTypeText;
                            TextView textView3 = (TextView) A3.a.a(view, R.id.ovenTypeText);
                            if (textView3 != null) {
                                i10 = R.id.ratingBar;
                                RatingBar ratingBar = (RatingBar) A3.a.a(view, R.id.ratingBar);
                                if (ratingBar != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i10 = R.id.weDoRecallYouText;
                                        TextView textView4 = (TextView) A3.a.a(view, R.id.weDoRecallYouText);
                                        if (textView4 != null) {
                                            return new H(constraintLayout, appBarLayout, constraintLayout, textView, textView2, progressBar, editText, textView3, ratingBar, materialToolbar, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static H c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.cook_feed_back_top, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9393a;
    }
}
