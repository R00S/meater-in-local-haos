package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: CookFeedBackFinishBinding.java */
/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9375a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9376b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f9377c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9378d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9379e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f9380f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f9381g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f9382h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9383i;

    private G(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView4, TextView textView5) {
        this.f9375a = constraintLayout;
        this.f9376b = imageView;
        this.f9377c = textView;
        this.f9378d = textView2;
        this.f9379e = textView3;
        this.f9380f = appCompatImageView;
        this.f9381g = linearLayout;
        this.f9382h = textView4;
        this.f9383i = textView5;
    }

    public static G a(View view) {
        int i10 = R.id.check_mark_icon;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.check_mark_icon);
        if (imageView != null) {
            i10 = R.id.cookNameText;
            TextView textView = (TextView) A3.a.a(view, R.id.cookNameText);
            if (textView != null) {
                i10 = R.id.dateText;
                TextView textView2 = (TextView) A3.a.a(view, R.id.dateText);
                if (textView2 != null) {
                    i10 = R.id.feedBackRequestText;
                    TextView textView3 = (TextView) A3.a.a(view, R.id.feedBackRequestText);
                    if (textView3 != null) {
                        i10 = R.id.linkImageView;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.linkImageView);
                        if (appCompatImageView != null) {
                            i10 = R.id.linkViewContainer;
                            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.linkViewContainer);
                            if (linearLayout != null) {
                                i10 = R.id.reviewBtn;
                                TextView textView4 = (TextView) A3.a.a(view, R.id.reviewBtn);
                                if (textView4 != null) {
                                    i10 = R.id.submitTextView;
                                    TextView textView5 = (TextView) A3.a.a(view, R.id.submitTextView);
                                    if (textView5 != null) {
                                        return new G((ConstraintLayout) view, imageView, textView, textView2, textView3, appCompatImageView, linearLayout, textView4, textView5);
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

    public static G c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.cook_feed_back_finish, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9375a;
    }
}
