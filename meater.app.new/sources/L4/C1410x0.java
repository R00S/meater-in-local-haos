package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERHeaderRow;
import com.apptionlabs.meater_app.views.MEATERHeaderTextOnly;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentTemperatureListBinding.java */
/* renamed from: L4.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1410x0 {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f10745A;

    /* renamed from: B, reason: collision with root package name */
    public final LinearLayout f10746B;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10747a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10748b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10749c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10750d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10751e;

    /* renamed from: f, reason: collision with root package name */
    public final AppBarLayout f10752f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10753g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f10754h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10755i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatEditText f10756j;

    /* renamed from: k, reason: collision with root package name */
    public final View f10757k;

    /* renamed from: l, reason: collision with root package name */
    public final MEATERHeaderTextOnly f10758l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f10759m;

    /* renamed from: n, reason: collision with root package name */
    public final MEATERHeaderRow f10760n;

    /* renamed from: o, reason: collision with root package name */
    public final View f10761o;

    /* renamed from: p, reason: collision with root package name */
    public final RelativeLayout f10762p;

    /* renamed from: q, reason: collision with root package name */
    public final ScrollView f10763q;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f10764r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10765s;

    /* renamed from: t, reason: collision with root package name */
    public final View f10766t;

    /* renamed from: u, reason: collision with root package name */
    public final View f10767u;

    /* renamed from: v, reason: collision with root package name */
    public final MEATERScalesView f10768v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialToolbar f10769w;

    /* renamed from: x, reason: collision with root package name */
    public final RelativeLayout f10770x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f10771y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f10772z;

    private C1410x0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, RecyclerView recyclerView, LinearLayout linearLayout, AppBarLayout appBarLayout, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatEditText appCompatEditText, View view, MEATERHeaderTextOnly mEATERHeaderTextOnly, LinearLayout linearLayout4, MEATERHeaderRow mEATERHeaderRow, View view2, RelativeLayout relativeLayout, ScrollView scrollView, ImageView imageView3, TextView textView2, View view3, View view4, MEATERScalesView mEATERScalesView, MaterialToolbar materialToolbar, RelativeLayout relativeLayout2, ImageView imageView4, LinearLayout linearLayout5, TextView textView3, LinearLayout linearLayout6) {
        this.f10747a = constraintLayout;
        this.f10748b = textView;
        this.f10749c = imageView;
        this.f10750d = recyclerView;
        this.f10751e = linearLayout;
        this.f10752f = appBarLayout;
        this.f10753g = imageView2;
        this.f10754h = linearLayout2;
        this.f10755i = linearLayout3;
        this.f10756j = appCompatEditText;
        this.f10757k = view;
        this.f10758l = mEATERHeaderTextOnly;
        this.f10759m = linearLayout4;
        this.f10760n = mEATERHeaderRow;
        this.f10761o = view2;
        this.f10762p = relativeLayout;
        this.f10763q = scrollView;
        this.f10764r = imageView3;
        this.f10765s = textView2;
        this.f10766t = view3;
        this.f10767u = view4;
        this.f10768v = mEATERScalesView;
        this.f10769w = materialToolbar;
        this.f10770x = relativeLayout2;
        this.f10771y = imageView4;
        this.f10772z = linearLayout5;
        this.f10745A = textView3;
        this.f10746B = linearLayout6;
    }

    public static C1410x0 a(View view) {
        int i10 = R.id.alertCountText;
        TextView textView = (TextView) A3.a.a(view, R.id.alertCountText);
        if (textView != null) {
            i10 = R.id.alertPlusView;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.alertPlusView);
            if (imageView != null) {
                i10 = R.id.alert_recycler_view;
                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.alert_recycler_view);
                if (recyclerView != null) {
                    i10 = R.id.alert_recycler_view_container;
                    LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alert_recycler_view_container);
                    if (linearLayout != null) {
                        i10 = R.id.appBarLayout;
                        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
                        if (appBarLayout != null) {
                            i10 = R.id.bell_image;
                            ImageView imageView2 = (ImageView) A3.a.a(view, R.id.bell_image);
                            if (imageView2 != null) {
                                i10 = R.id.cook_name;
                                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.cook_name);
                                if (linearLayout2 != null) {
                                    i10 = R.id.cook_name1;
                                    LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.cook_name1);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.customCookField;
                                        AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.customCookField);
                                        if (appCompatEditText != null) {
                                            i10 = R.id.divider_;
                                            View viewA = A3.a.a(view, R.id.divider_);
                                            if (viewA != null) {
                                                i10 = R.id.heading_1;
                                                MEATERHeaderTextOnly mEATERHeaderTextOnly = (MEATERHeaderTextOnly) A3.a.a(view, R.id.heading_1);
                                                if (mEATERHeaderTextOnly != null) {
                                                    i10 = R.id.help_link_row;
                                                    LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.help_link_row);
                                                    if (linearLayout4 != null) {
                                                        i10 = R.id.info_container;
                                                        MEATERHeaderRow mEATERHeaderRow = (MEATERHeaderRow) A3.a.a(view, R.id.info_container);
                                                        if (mEATERHeaderRow != null) {
                                                            i10 = R.id.line;
                                                            View viewA2 = A3.a.a(view, R.id.line);
                                                            if (viewA2 != null) {
                                                                i10 = R.id.paired_list_view;
                                                                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.paired_list_view);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.parentScroll;
                                                                    ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.parentScroll);
                                                                    if (scrollView != null) {
                                                                        i10 = R.id.picker_warning_image;
                                                                        ImageView imageView3 = (ImageView) A3.a.a(view, R.id.picker_warning_image);
                                                                        if (imageView3 != null) {
                                                                            i10 = R.id.picker_warning_text;
                                                                            TextView textView2 = (TextView) A3.a.a(view, R.id.picker_warning_text);
                                                                            if (textView2 != null) {
                                                                                i10 = R.id.rcBottomDivider;
                                                                                View viewA3 = A3.a.a(view, R.id.rcBottomDivider);
                                                                                if (viewA3 != null) {
                                                                                    i10 = R.id.rcTopDivider;
                                                                                    View viewA4 = A3.a.a(view, R.id.rcTopDivider);
                                                                                    if (viewA4 != null) {
                                                                                        i10 = R.id.temp_picker;
                                                                                        MEATERScalesView mEATERScalesView = (MEATERScalesView) A3.a.a(view, R.id.temp_picker);
                                                                                        if (mEATERScalesView != null) {
                                                                                            i10 = R.id.toolbar;
                                                                                            MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                            if (materialToolbar != null) {
                                                                                                i10 = R.id.video_container;
                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) A3.a.a(view, R.id.video_container);
                                                                                                if (relativeLayout2 != null) {
                                                                                                    i10 = R.id.video_icon;
                                                                                                    ImageView imageView4 = (ImageView) A3.a.a(view, R.id.video_icon);
                                                                                                    if (imageView4 != null) {
                                                                                                        i10 = R.id.video_link_container;
                                                                                                        LinearLayout linearLayout5 = (LinearLayout) A3.a.a(view, R.id.video_link_container);
                                                                                                        if (linearLayout5 != null) {
                                                                                                            i10 = R.id.video_link_title;
                                                                                                            TextView textView3 = (TextView) A3.a.a(view, R.id.video_link_title);
                                                                                                            if (textView3 != null) {
                                                                                                                i10 = R.id.warning_layout;
                                                                                                                LinearLayout linearLayout6 = (LinearLayout) A3.a.a(view, R.id.warning_layout);
                                                                                                                if (linearLayout6 != null) {
                                                                                                                    return new C1410x0((ConstraintLayout) view, textView, imageView, recyclerView, linearLayout, appBarLayout, imageView2, linearLayout2, linearLayout3, appCompatEditText, viewA, mEATERHeaderTextOnly, linearLayout4, mEATERHeaderRow, viewA2, relativeLayout, scrollView, imageView3, textView2, viewA3, viewA4, mEATERScalesView, materialToolbar, relativeLayout2, imageView4, linearLayout5, textView3, linearLayout6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1410x0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_temperature_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10747a;
    }
}
