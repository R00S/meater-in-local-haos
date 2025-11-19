package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERRoundedLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentCutListBinding.java */
/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialToolbar f9732A;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9734b;

    /* renamed from: c, reason: collision with root package name */
    public final Barrier f9735c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9736d;

    /* renamed from: e, reason: collision with root package name */
    public final View f9737e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9738f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9739g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f9740h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f9741i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f9742j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f9743k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f9744l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f9745m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f9746n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f9747o;

    /* renamed from: p, reason: collision with root package name */
    public final RecyclerView f9748p;

    /* renamed from: q, reason: collision with root package name */
    public final MEATERRoundedLayout f9749q;

    /* renamed from: r, reason: collision with root package name */
    public final MEATERRoundedLayout f9750r;

    /* renamed from: s, reason: collision with root package name */
    public final MEATERRoundedLayout f9751s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f9752t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f9753u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f9754v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f9755w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f9756x;

    /* renamed from: y, reason: collision with root package name */
    public final AppCompatImageView f9757y;

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatImageView f9758z;

    private Y(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, Barrier barrier, View view, View view2, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, MEATERRoundedLayout mEATERRoundedLayout, MEATERRoundedLayout mEATERRoundedLayout2, MEATERRoundedLayout mEATERRoundedLayout3, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialToolbar materialToolbar) {
        this.f9733a = constraintLayout;
        this.f9734b = appBarLayout;
        this.f9735c = barrier;
        this.f9736d = view;
        this.f9737e = view2;
        this.f9738f = guideline;
        this.f9739g = guideline2;
        this.f9740h = imageView;
        this.f9741i = imageView2;
        this.f9742j = imageView3;
        this.f9743k = textView;
        this.f9744l = textView2;
        this.f9745m = textView3;
        this.f9746n = linearLayout;
        this.f9747o = linearLayout2;
        this.f9748p = recyclerView;
        this.f9749q = mEATERRoundedLayout;
        this.f9750r = mEATERRoundedLayout2;
        this.f9751s = mEATERRoundedLayout3;
        this.f9752t = constraintLayout2;
        this.f9753u = textView4;
        this.f9754v = textView5;
        this.f9755w = textView6;
        this.f9756x = textView7;
        this.f9757y = appCompatImageView;
        this.f9758z = appCompatImageView2;
        this.f9732A = materialToolbar;
    }

    public static Y a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.barrier_bottom;
            Barrier barrier = (Barrier) A3.a.a(view, R.id.barrier_bottom);
            if (barrier != null) {
                i10 = R.id.divider;
                View viewA = A3.a.a(view, R.id.divider);
                if (viewA != null) {
                    i10 = R.id.extraSpace;
                    View viewA2 = A3.a.a(view, R.id.extraSpace);
                    if (viewA2 != null) {
                        i10 = R.id.guideline;
                        Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline);
                        if (guideline != null) {
                            i10 = R.id.guideline1;
                            Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guideline1);
                            if (guideline2 != null) {
                                i10 = R.id.imgIcon1;
                                ImageView imageView = (ImageView) A3.a.a(view, R.id.imgIcon1);
                                if (imageView != null) {
                                    i10 = R.id.imgIcon2;
                                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.imgIcon2);
                                    if (imageView2 != null) {
                                        i10 = R.id.imgIcon3;
                                        ImageView imageView3 = (ImageView) A3.a.a(view, R.id.imgIcon3);
                                        if (imageView3 != null) {
                                            i10 = R.id.imgIconText1;
                                            TextView textView = (TextView) A3.a.a(view, R.id.imgIconText1);
                                            if (textView != null) {
                                                i10 = R.id.imgIconText2;
                                                TextView textView2 = (TextView) A3.a.a(view, R.id.imgIconText2);
                                                if (textView2 != null) {
                                                    i10 = R.id.imgIconText3;
                                                    TextView textView3 = (TextView) A3.a.a(view, R.id.imgIconText3);
                                                    if (textView3 != null) {
                                                        i10 = R.id.mainTitles;
                                                        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.mainTitles);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.otherTitles;
                                                            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.otherTitles);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.recycler_view_setup_items;
                                                                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.recycler_view_setup_items);
                                                                if (recyclerView != null) {
                                                                    i10 = R.id.rounded1;
                                                                    MEATERRoundedLayout mEATERRoundedLayout = (MEATERRoundedLayout) A3.a.a(view, R.id.rounded1);
                                                                    if (mEATERRoundedLayout != null) {
                                                                        i10 = R.id.rounded2;
                                                                        MEATERRoundedLayout mEATERRoundedLayout2 = (MEATERRoundedLayout) A3.a.a(view, R.id.rounded2);
                                                                        if (mEATERRoundedLayout2 != null) {
                                                                            i10 = R.id.rounded3;
                                                                            MEATERRoundedLayout mEATERRoundedLayout3 = (MEATERRoundedLayout) A3.a.a(view, R.id.rounded3);
                                                                            if (mEATERRoundedLayout3 != null) {
                                                                                i10 = R.id.tabLayout;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.tabLayout);
                                                                                if (constraintLayout != null) {
                                                                                    i10 = R.id.text_title;
                                                                                    TextView textView4 = (TextView) A3.a.a(view, R.id.text_title);
                                                                                    if (textView4 != null) {
                                                                                        i10 = R.id.text_title2;
                                                                                        TextView textView5 = (TextView) A3.a.a(view, R.id.text_title2);
                                                                                        if (textView5 != null) {
                                                                                            i10 = R.id.text_title_detail;
                                                                                            TextView textView6 = (TextView) A3.a.a(view, R.id.text_title_detail);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.text_title_detail2;
                                                                                                TextView textView7 = (TextView) A3.a.a(view, R.id.text_title_detail2);
                                                                                                if (textView7 != null) {
                                                                                                    i10 = R.id.titleImage;
                                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.titleImage);
                                                                                                    if (appCompatImageView != null) {
                                                                                                        i10 = R.id.titleImage2;
                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.titleImage2);
                                                                                                        if (appCompatImageView2 != null) {
                                                                                                            i10 = R.id.toolbar;
                                                                                                            MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                                            if (materialToolbar != null) {
                                                                                                                return new Y((ConstraintLayout) view, appBarLayout, barrier, viewA, viewA2, guideline, guideline2, imageView, imageView2, imageView3, textView, textView2, textView3, linearLayout, linearLayout2, recyclerView, mEATERRoundedLayout, mEATERRoundedLayout2, mEATERRoundedLayout3, constraintLayout, textView4, textView5, textView6, textView7, appCompatImageView, appCompatImageView2, materialToolbar);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_cut_list_, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9733a;
    }
}
