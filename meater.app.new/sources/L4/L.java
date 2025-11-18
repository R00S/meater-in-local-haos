package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERHeaderTextOnly;
import com.apptionlabs.meater_app.views.MEATERLeftTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: DevicesActivityBinding.java */
/* loaded from: classes2.dex */
public final class L {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f9472A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f9473B;

    /* renamed from: C, reason: collision with root package name */
    public final MEATERLeftTextView f9474C;

    /* renamed from: D, reason: collision with root package name */
    public final MEATERLeftTextView f9475D;

    /* renamed from: E, reason: collision with root package name */
    public final MEATERLeftTextView f9476E;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9477a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9478b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9479c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9480d;

    /* renamed from: e, reason: collision with root package name */
    public final MEATERLeftTextView f9481e;

    /* renamed from: f, reason: collision with root package name */
    public final MEATERLeftTextView f9482f;

    /* renamed from: g, reason: collision with root package name */
    public final MEATERLeftTextView f9483g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f9484h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f9485i;

    /* renamed from: j, reason: collision with root package name */
    public final RelativeLayout f9486j;

    /* renamed from: k, reason: collision with root package name */
    public final View f9487k;

    /* renamed from: l, reason: collision with root package name */
    public final RecyclerView f9488l;

    /* renamed from: m, reason: collision with root package name */
    public final View f9489m;

    /* renamed from: n, reason: collision with root package name */
    public final MEATERHeaderTextOnly f9490n;

    /* renamed from: o, reason: collision with root package name */
    public final ProgressBar f9491o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f9492p;

    /* renamed from: q, reason: collision with root package name */
    public final MEATERHeaderTextOnly f9493q;

    /* renamed from: r, reason: collision with root package name */
    public final View f9494r;

    /* renamed from: s, reason: collision with root package name */
    public final MEATERHeaderTextOnly f9495s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f9496t;

    /* renamed from: u, reason: collision with root package name */
    public final RelativeLayout f9497u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f9498v;

    /* renamed from: w, reason: collision with root package name */
    public final ScrollView f9499w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialToolbar f9500x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f9501y;

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatTextView f9502z;

    private L(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ImageView imageView, ImageView imageView2, MEATERLeftTextView mEATERLeftTextView, MEATERLeftTextView mEATERLeftTextView2, MEATERLeftTextView mEATERLeftTextView3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, View view, RecyclerView recyclerView, View view2, MEATERHeaderTextOnly mEATERHeaderTextOnly, ProgressBar progressBar, LinearLayout linearLayout, MEATERHeaderTextOnly mEATERHeaderTextOnly2, View view3, MEATERHeaderTextOnly mEATERHeaderTextOnly3, LinearLayout linearLayout2, RelativeLayout relativeLayout4, RecyclerView recyclerView2, ScrollView scrollView, MaterialToolbar materialToolbar, ImageView imageView3, AppCompatTextView appCompatTextView, ImageView imageView4, ImageView imageView5, MEATERLeftTextView mEATERLeftTextView4, MEATERLeftTextView mEATERLeftTextView5, MEATERLeftTextView mEATERLeftTextView6) {
        this.f9477a = constraintLayout;
        this.f9478b = appBarLayout;
        this.f9479c = imageView;
        this.f9480d = imageView2;
        this.f9481e = mEATERLeftTextView;
        this.f9482f = mEATERLeftTextView2;
        this.f9483g = mEATERLeftTextView3;
        this.f9484h = relativeLayout;
        this.f9485i = relativeLayout2;
        this.f9486j = relativeLayout3;
        this.f9487k = view;
        this.f9488l = recyclerView;
        this.f9489m = view2;
        this.f9490n = mEATERHeaderTextOnly;
        this.f9491o = progressBar;
        this.f9492p = linearLayout;
        this.f9493q = mEATERHeaderTextOnly2;
        this.f9494r = view3;
        this.f9495s = mEATERHeaderTextOnly3;
        this.f9496t = linearLayout2;
        this.f9497u = relativeLayout4;
        this.f9498v = recyclerView2;
        this.f9499w = scrollView;
        this.f9500x = materialToolbar;
        this.f9501y = imageView3;
        this.f9502z = appCompatTextView;
        this.f9472A = imageView4;
        this.f9473B = imageView5;
        this.f9474C = mEATERLeftTextView4;
        this.f9475D = mEATERLeftTextView5;
        this.f9476E = mEATERLeftTextView6;
    }

    public static L a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.bleArrowImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.bleArrowImage);
            if (imageView != null) {
                i10 = R.id.ble_image;
                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.ble_image);
                if (imageView2 != null) {
                    i10 = R.id.ble_txt1;
                    MEATERLeftTextView mEATERLeftTextView = (MEATERLeftTextView) A3.a.a(view, R.id.ble_txt1);
                    if (mEATERLeftTextView != null) {
                        i10 = R.id.ble_txt2;
                        MEATERLeftTextView mEATERLeftTextView2 = (MEATERLeftTextView) A3.a.a(view, R.id.ble_txt2);
                        if (mEATERLeftTextView2 != null) {
                            i10 = R.id.ble_txt3;
                            MEATERLeftTextView mEATERLeftTextView3 = (MEATERLeftTextView) A3.a.a(view, R.id.ble_txt3);
                            if (mEATERLeftTextView3 != null) {
                                i10 = R.id.connect_bluetooth_container;
                                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.connect_bluetooth_container);
                                if (relativeLayout != null) {
                                    i10 = R.id.connect_wifi_container;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) A3.a.a(view, R.id.connect_wifi_container);
                                    if (relativeLayout2 != null) {
                                        i10 = R.id.dicover_list_view;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) A3.a.a(view, R.id.dicover_list_view);
                                        if (relativeLayout3 != null) {
                                            i10 = R.id.discoverListBottomDivider;
                                            View viewA = A3.a.a(view, R.id.discoverListBottomDivider);
                                            if (viewA != null) {
                                                i10 = R.id.discover_recyler_view;
                                                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.discover_recyler_view);
                                                if (recyclerView != null) {
                                                    i10 = R.id.divider;
                                                    View viewA2 = A3.a.a(view, R.id.divider);
                                                    if (viewA2 != null) {
                                                        i10 = R.id.howDoLebel;
                                                        MEATERHeaderTextOnly mEATERHeaderTextOnly = (MEATERHeaderTextOnly) A3.a.a(view, R.id.howDoLebel);
                                                        if (mEATERHeaderTextOnly != null) {
                                                            i10 = R.id.loading;
                                                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                                            if (progressBar != null) {
                                                                i10 = R.id.meater_link_video;
                                                                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.meater_link_video);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.nearbyLabel;
                                                                    MEATERHeaderTextOnly mEATERHeaderTextOnly2 = (MEATERHeaderTextOnly) A3.a.a(view, R.id.nearbyLabel);
                                                                    if (mEATERHeaderTextOnly2 != null) {
                                                                        i10 = R.id.nearbyLabelDivider;
                                                                        View viewA3 = A3.a.a(view, R.id.nearbyLabelDivider);
                                                                        if (viewA3 != null) {
                                                                            i10 = R.id.pairedLabel;
                                                                            MEATERHeaderTextOnly mEATERHeaderTextOnly3 = (MEATERHeaderTextOnly) A3.a.a(view, R.id.pairedLabel);
                                                                            if (mEATERHeaderTextOnly3 != null) {
                                                                                i10 = R.id.paired_layout;
                                                                                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.paired_layout);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.paired_list_view;
                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) A3.a.a(view, R.id.paired_list_view);
                                                                                    if (relativeLayout4 != null) {
                                                                                        i10 = R.id.paired_recyler_view;
                                                                                        RecyclerView recyclerView2 = (RecyclerView) A3.a.a(view, R.id.paired_recyler_view);
                                                                                        if (recyclerView2 != null) {
                                                                                            i10 = R.id.parentScroll;
                                                                                            ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.parentScroll);
                                                                                            if (scrollView != null) {
                                                                                                i10 = R.id.toolbar;
                                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                                if (materialToolbar != null) {
                                                                                                    i10 = R.id.video_image2;
                                                                                                    ImageView imageView3 = (ImageView) A3.a.a(view, R.id.video_image2);
                                                                                                    if (imageView3 != null) {
                                                                                                        i10 = R.id.video_label2;
                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.video_label2);
                                                                                                        if (appCompatTextView != null) {
                                                                                                            i10 = R.id.wifiArrowImage;
                                                                                                            ImageView imageView4 = (ImageView) A3.a.a(view, R.id.wifiArrowImage);
                                                                                                            if (imageView4 != null) {
                                                                                                                i10 = R.id.wifi_image;
                                                                                                                ImageView imageView5 = (ImageView) A3.a.a(view, R.id.wifi_image);
                                                                                                                if (imageView5 != null) {
                                                                                                                    i10 = R.id.wifi_txt1;
                                                                                                                    MEATERLeftTextView mEATERLeftTextView4 = (MEATERLeftTextView) A3.a.a(view, R.id.wifi_txt1);
                                                                                                                    if (mEATERLeftTextView4 != null) {
                                                                                                                        i10 = R.id.wifi_txt2;
                                                                                                                        MEATERLeftTextView mEATERLeftTextView5 = (MEATERLeftTextView) A3.a.a(view, R.id.wifi_txt2);
                                                                                                                        if (mEATERLeftTextView5 != null) {
                                                                                                                            i10 = R.id.wifi_txt3;
                                                                                                                            MEATERLeftTextView mEATERLeftTextView6 = (MEATERLeftTextView) A3.a.a(view, R.id.wifi_txt3);
                                                                                                                            if (mEATERLeftTextView6 != null) {
                                                                                                                                return new L((ConstraintLayout) view, appBarLayout, imageView, imageView2, mEATERLeftTextView, mEATERLeftTextView2, mEATERLeftTextView3, relativeLayout, relativeLayout2, relativeLayout3, viewA, recyclerView, viewA2, mEATERHeaderTextOnly, progressBar, linearLayout, mEATERHeaderTextOnly2, viewA3, mEATERHeaderTextOnly3, linearLayout2, relativeLayout4, recyclerView2, scrollView, materialToolbar, imageView3, appCompatTextView, imageView4, imageView5, mEATERLeftTextView4, mEATERLeftTextView5, mEATERLeftTextView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static L c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.devices_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9477a;
    }
}
