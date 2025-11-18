package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.RoundedLayout;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: CookRowItemBinding.java */
/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f9421a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9422b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9423c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f9424d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9425e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f9426f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f9427g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f9428h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9429i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f9430j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f9431k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f9432l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f9433m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f9434n;

    /* renamed from: o, reason: collision with root package name */
    public final RoundedLayout f9435o;

    /* renamed from: p, reason: collision with root package name */
    public final SwipeLayout f9436p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f9437q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f9438r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f9439s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f9440t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f9441u;

    private J(SwipeLayout swipeLayout, TextView textView, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, ImageView imageView3, TextView textView2, TextView textView3, TextView textView4, ImageView imageView4, ImageView imageView5, AppCompatTextView appCompatTextView, TextView textView5, LinearLayout linearLayout2, RoundedLayout roundedLayout, SwipeLayout swipeLayout2, TextView textView6, TextView textView7, TextView textView8, ImageView imageView6, ImageView imageView7) {
        this.f9421a = swipeLayout;
        this.f9422b = textView;
        this.f9423c = imageView;
        this.f9424d = linearLayout;
        this.f9425e = imageView2;
        this.f9426f = imageView3;
        this.f9427g = textView2;
        this.f9428h = textView3;
        this.f9429i = textView4;
        this.f9430j = imageView4;
        this.f9431k = imageView5;
        this.f9432l = appCompatTextView;
        this.f9433m = textView5;
        this.f9434n = linearLayout2;
        this.f9435o = roundedLayout;
        this.f9436p = swipeLayout2;
        this.f9437q = textView6;
        this.f9438r = textView7;
        this.f9439s = textView8;
        this.f9440t = imageView6;
        this.f9441u = imageView7;
    }

    public static J a(View view) {
        int i10 = R.id.alertText;
        TextView textView = (TextView) A3.a.a(view, R.id.alertText);
        if (textView != null) {
            i10 = R.id.bellImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.bellImage);
            if (imageView != null) {
                i10 = R.id.bottom_wrapper;
                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottom_wrapper);
                if (linearLayout != null) {
                    i10 = R.id.clockImage;
                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.clockImage);
                    if (imageView2 != null) {
                        i10 = R.id.cookImage;
                        ImageView imageView3 = (ImageView) A3.a.a(view, R.id.cookImage);
                        if (imageView3 != null) {
                            i10 = R.id.cookNameText;
                            TextView textView2 = (TextView) A3.a.a(view, R.id.cookNameText);
                            if (textView2 != null) {
                                i10 = R.id.cookPresetText;
                                TextView textView3 = (TextView) A3.a.a(view, R.id.cookPresetText);
                                if (textView3 != null) {
                                    i10 = R.id.dateText;
                                    TextView textView4 = (TextView) A3.a.a(view, R.id.dateText);
                                    if (textView4 != null) {
                                        i10 = R.id.deleteButton;
                                        ImageView imageView4 = (ImageView) A3.a.a(view, R.id.deleteButton);
                                        if (imageView4 != null) {
                                            i10 = R.id.noteImage;
                                            ImageView imageView5 = (ImageView) A3.a.a(view, R.id.noteImage);
                                            if (imageView5 != null) {
                                                i10 = R.id.peakLabel;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.peakLabel);
                                                if (appCompatTextView != null) {
                                                    i10 = R.id.peakTempText;
                                                    TextView textView5 = (TextView) A3.a.a(view, R.id.peakTempText);
                                                    if (textView5 != null) {
                                                        i10 = R.id.rootView;
                                                        LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.rootView);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.roundedLayout;
                                                            RoundedLayout roundedLayout = (RoundedLayout) A3.a.a(view, R.id.roundedLayout);
                                                            if (roundedLayout != null) {
                                                                SwipeLayout swipeLayout = (SwipeLayout) view;
                                                                i10 = R.id.targetTempText;
                                                                TextView textView6 = (TextView) A3.a.a(view, R.id.targetTempText);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.targetText;
                                                                    TextView textView7 = (TextView) A3.a.a(view, R.id.targetText);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.timeText;
                                                                        TextView textView8 = (TextView) A3.a.a(view, R.id.timeText);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.tvEdit;
                                                                            ImageView imageView6 = (ImageView) A3.a.a(view, R.id.tvEdit);
                                                                            if (imageView6 != null) {
                                                                                i10 = R.id.unFavourite;
                                                                                ImageView imageView7 = (ImageView) A3.a.a(view, R.id.unFavourite);
                                                                                if (imageView7 != null) {
                                                                                    return new J(swipeLayout, textView, imageView, linearLayout, imageView2, imageView3, textView2, textView3, textView4, imageView4, imageView5, appCompatTextView, textView5, linearLayout2, roundedLayout, swipeLayout, textView6, textView7, textView8, imageView6, imageView7);
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

    public static J c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.cook_row_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f9421a;
    }
}
