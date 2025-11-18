package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityShareGraphBinding.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f10473a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f10474b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f10475c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10476d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f10477e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10478f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f10479g;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f10480h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f10481i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f10482j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatTextView f10483k;

    /* renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f10484l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f10485m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f10486n;

    /* renamed from: o, reason: collision with root package name */
    public final ProgressBar f10487o;

    /* renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f10488p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f10489q;

    /* renamed from: r, reason: collision with root package name */
    public final AppCompatTextView f10490r;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f10491s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10492t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10493u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f10494v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10495w;

    private r(ScrollView scrollView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ConstraintLayout constraintLayout3, ImageView imageView, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout4, ImageView imageView2, ImageView imageView3, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout5, ImageView imageView4, AppCompatTextView appCompatTextView3, ProgressBar progressBar, ConstraintLayout constraintLayout6, ImageView imageView5, AppCompatTextView appCompatTextView4, ImageView imageView6, TextView textView2, TextView textView3, ConstraintLayout constraintLayout7, TextView textView4) {
        this.f10473a = scrollView;
        this.f10474b = constraintLayout;
        this.f10475c = constraintLayout2;
        this.f10476d = textView;
        this.f10477e = constraintLayout3;
        this.f10478f = imageView;
        this.f10479g = appCompatTextView;
        this.f10480h = constraintLayout4;
        this.f10481i = imageView2;
        this.f10482j = imageView3;
        this.f10483k = appCompatTextView2;
        this.f10484l = constraintLayout5;
        this.f10485m = imageView4;
        this.f10486n = appCompatTextView3;
        this.f10487o = progressBar;
        this.f10488p = constraintLayout6;
        this.f10489q = imageView5;
        this.f10490r = appCompatTextView4;
        this.f10491s = imageView6;
        this.f10492t = textView2;
        this.f10493u = textView3;
        this.f10494v = constraintLayout7;
        this.f10495w = textView4;
    }

    public static r a(View view) {
        int i10 = R.id.baseLayoutContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.baseLayoutContainer);
        if (constraintLayout != null) {
            i10 = R.id.btns;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) A3.a.a(view, R.id.btns);
            if (constraintLayout2 != null) {
                i10 = R.id.cancelLabel;
                TextView textView = (TextView) A3.a.a(view, R.id.cancelLabel);
                if (textView != null) {
                    i10 = R.id.chromeContainer;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) A3.a.a(view, R.id.chromeContainer);
                    if (constraintLayout3 != null) {
                        i10 = R.id.chromeImage;
                        ImageView imageView = (ImageView) A3.a.a(view, R.id.chromeImage);
                        if (imageView != null) {
                            i10 = R.id.chromeText;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.chromeText);
                            if (appCompatTextView != null) {
                                i10 = R.id.copy;
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) A3.a.a(view, R.id.copy);
                                if (constraintLayout4 != null) {
                                    i10 = R.id.copyImage;
                                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.copyImage);
                                    if (imageView2 != null) {
                                        i10 = R.id.copyLinkImage;
                                        ImageView imageView3 = (ImageView) A3.a.a(view, R.id.copyLinkImage);
                                        if (imageView3 != null) {
                                            i10 = R.id.copyText;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.copyText);
                                            if (appCompatTextView2 != null) {
                                                i10 = R.id.email;
                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) A3.a.a(view, R.id.email);
                                                if (constraintLayout5 != null) {
                                                    i10 = R.id.emailImage;
                                                    ImageView imageView4 = (ImageView) A3.a.a(view, R.id.emailImage);
                                                    if (imageView4 != null) {
                                                        i10 = R.id.emailText;
                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.emailText);
                                                        if (appCompatTextView3 != null) {
                                                            i10 = R.id.loading;
                                                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                                            if (progressBar != null) {
                                                                i10 = R.id.more;
                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) A3.a.a(view, R.id.more);
                                                                if (constraintLayout6 != null) {
                                                                    i10 = R.id.moreImage;
                                                                    ImageView imageView5 = (ImageView) A3.a.a(view, R.id.moreImage);
                                                                    if (imageView5 != null) {
                                                                        i10 = R.id.moreText;
                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.moreText);
                                                                        if (appCompatTextView4 != null) {
                                                                            i10 = R.id.shareCookImage;
                                                                            ImageView imageView6 = (ImageView) A3.a.a(view, R.id.shareCookImage);
                                                                            if (imageView6 != null) {
                                                                                i10 = R.id.shareCookLabel;
                                                                                TextView textView2 = (TextView) A3.a.a(view, R.id.shareCookLabel);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.share_cook_text1;
                                                                                    TextView textView3 = (TextView) A3.a.a(view, R.id.share_cook_text1);
                                                                                    if (textView3 != null) {
                                                                                        i10 = R.id.shareView;
                                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) A3.a.a(view, R.id.shareView);
                                                                                        if (constraintLayout7 != null) {
                                                                                            i10 = R.id.talkingMeaterText;
                                                                                            TextView textView4 = (TextView) A3.a.a(view, R.id.talkingMeaterText);
                                                                                            if (textView4 != null) {
                                                                                                return new r((ScrollView) view, constraintLayout, constraintLayout2, textView, constraintLayout3, imageView, appCompatTextView, constraintLayout4, imageView2, imageView3, appCompatTextView2, constraintLayout5, imageView4, appCompatTextView3, progressBar, constraintLayout6, imageView5, appCompatTextView4, imageView6, textView2, textView3, constraintLayout7, textView4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static r c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_share_graph, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f10473a;
    }
}
