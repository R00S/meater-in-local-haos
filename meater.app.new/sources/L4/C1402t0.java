package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentSetupPreviousCookBinding.java */
/* renamed from: L4.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1402t0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10572a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f10573b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f10574c;

    /* renamed from: d, reason: collision with root package name */
    public final ListView f10575d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10576e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10577f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f10578g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10579h;

    /* renamed from: i, reason: collision with root package name */
    public final AppBarLayout f10580i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f10581j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatEditText f10582k;

    /* renamed from: l, reason: collision with root package name */
    public final View f10583l;

    /* renamed from: m, reason: collision with root package name */
    public final View f10584m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10585n;

    /* renamed from: o, reason: collision with root package name */
    public final View f10586o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f10587p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f10588q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10589r;

    /* renamed from: s, reason: collision with root package name */
    public final MEATERScalesView f10590s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f10591t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialToolbar f10592u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f10593v;

    private C1402t0(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ListView listView, LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, TextView textView, AppBarLayout appBarLayout, ImageView imageView2, AppCompatEditText appCompatEditText, View view, View view2, TextView textView2, View view3, LinearLayout linearLayout2, ImageView imageView3, TextView textView3, MEATERScalesView mEATERScalesView, AppCompatImageView appCompatImageView, MaterialToolbar materialToolbar, LinearLayout linearLayout3) {
        this.f10572a = constraintLayout;
        this.f10573b = relativeLayout;
        this.f10574c = relativeLayout2;
        this.f10575d = listView;
        this.f10576e = linearLayout;
        this.f10577f = imageView;
        this.f10578g = recyclerView;
        this.f10579h = textView;
        this.f10580i = appBarLayout;
        this.f10581j = imageView2;
        this.f10582k = appCompatEditText;
        this.f10583l = view;
        this.f10584m = view2;
        this.f10585n = textView2;
        this.f10586o = view3;
        this.f10587p = linearLayout2;
        this.f10588q = imageView3;
        this.f10589r = textView3;
        this.f10590s = mEATERScalesView;
        this.f10591t = appCompatImageView;
        this.f10592u = materialToolbar;
        this.f10593v = linearLayout3;
    }

    public static C1402t0 a(View view) {
        int i10 = R.id.alert_header_view;
        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.alert_header_view);
        if (relativeLayout != null) {
            i10 = R.id.alert_layout;
            RelativeLayout relativeLayout2 = (RelativeLayout) A3.a.a(view, R.id.alert_layout);
            if (relativeLayout2 != null) {
                i10 = R.id.alert_list;
                ListView listView = (ListView) A3.a.a(view, R.id.alert_list);
                if (listView != null) {
                    i10 = R.id.alertListContainer;
                    LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alertListContainer);
                    if (linearLayout != null) {
                        i10 = R.id.alert_plus_icon;
                        ImageView imageView = (ImageView) A3.a.a(view, R.id.alert_plus_icon);
                        if (imageView != null) {
                            i10 = R.id.alert_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.alert_recycler_view);
                            if (recyclerView != null) {
                                i10 = R.id.alertTextCount;
                                TextView textView = (TextView) A3.a.a(view, R.id.alertTextCount);
                                if (textView != null) {
                                    i10 = R.id.appBarLayout;
                                    AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
                                    if (appBarLayout != null) {
                                        i10 = R.id.bell_image;
                                        ImageView imageView2 = (ImageView) A3.a.a(view, R.id.bell_image);
                                        if (imageView2 != null) {
                                            i10 = R.id.cookNameField;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.cookNameField);
                                            if (appCompatEditText != null) {
                                                i10 = R.id.d_1;
                                                View viewA = A3.a.a(view, R.id.d_1);
                                                if (viewA != null) {
                                                    i10 = R.id.d_2;
                                                    View viewA2 = A3.a.a(view, R.id.d_2);
                                                    if (viewA2 != null) {
                                                        i10 = R.id.detailText;
                                                        TextView textView2 = (TextView) A3.a.a(view, R.id.detailText);
                                                        if (textView2 != null) {
                                                            i10 = R.id.divider;
                                                            View viewA3 = A3.a.a(view, R.id.divider);
                                                            if (viewA3 != null) {
                                                                i10 = R.id.heading;
                                                                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.heading);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.picker_warning_image;
                                                                    ImageView imageView3 = (ImageView) A3.a.a(view, R.id.picker_warning_image);
                                                                    if (imageView3 != null) {
                                                                        i10 = R.id.picker_warning_text;
                                                                        TextView textView3 = (TextView) A3.a.a(view, R.id.picker_warning_text);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.temp_picker;
                                                                            MEATERScalesView mEATERScalesView = (MEATERScalesView) A3.a.a(view, R.id.temp_picker);
                                                                            if (mEATERScalesView != null) {
                                                                                i10 = R.id.titleImage;
                                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.titleImage);
                                                                                if (appCompatImageView != null) {
                                                                                    i10 = R.id.toolbar;
                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                    if (materialToolbar != null) {
                                                                                        i10 = R.id.warning_layout;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.warning_layout);
                                                                                        if (linearLayout3 != null) {
                                                                                            return new C1402t0((ConstraintLayout) view, relativeLayout, relativeLayout2, listView, linearLayout, imageView, recyclerView, textView, appBarLayout, imageView2, appCompatEditText, viewA, viewA2, textView2, viewA3, linearLayout2, imageView3, textView3, mEATERScalesView, appCompatImageView, materialToolbar, linearLayout3);
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

    public static C1402t0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_setup_previous_cook, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10572a;
    }
}
