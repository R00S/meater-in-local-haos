package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERHeaderTextOnly;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: VersionActivityBinding.java */
/* loaded from: classes2.dex */
public final class q1 {

    /* renamed from: A, reason: collision with root package name */
    public final MEATERHeaderTextOnly f10441A;

    /* renamed from: B, reason: collision with root package name */
    public final LinearLayout f10442B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f10443C;

    /* renamed from: D, reason: collision with root package name */
    public final ScrollView f10444D;

    /* renamed from: E, reason: collision with root package name */
    public final MaterialToolbar f10445E;

    /* renamed from: F, reason: collision with root package name */
    public final LinearLayout f10446F;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10447a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10448b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10449c;

    /* renamed from: d, reason: collision with root package name */
    public final AppBarLayout f10450d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10451e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f10452f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10453g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10454h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10455i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f10456j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10457k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10458l;

    /* renamed from: m, reason: collision with root package name */
    public final MEATERHeaderTextOnly f10459m;

    /* renamed from: n, reason: collision with root package name */
    public final MEATERHeaderTextOnly f10460n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f10461o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f10462p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10463q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10464r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10465s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10466t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10467u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f10468v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10469w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f10470x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f10471y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f10472z;

    private q1(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, AppBarLayout appBarLayout, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView6, MEATERHeaderTextOnly mEATERHeaderTextOnly, MEATERHeaderTextOnly mEATERHeaderTextOnly2, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, LinearLayout linearLayout7, TextView textView14, LinearLayout linearLayout8, MEATERHeaderTextOnly mEATERHeaderTextOnly3, LinearLayout linearLayout9, RecyclerView recyclerView, ScrollView scrollView, MaterialToolbar materialToolbar, LinearLayout linearLayout10) {
        this.f10447a = constraintLayout;
        this.f10448b = linearLayout;
        this.f10449c = textView;
        this.f10450d = appBarLayout;
        this.f10451e = textView2;
        this.f10452f = linearLayout2;
        this.f10453g = textView3;
        this.f10454h = textView4;
        this.f10455i = textView5;
        this.f10456j = linearLayout3;
        this.f10457k = linearLayout4;
        this.f10458l = textView6;
        this.f10459m = mEATERHeaderTextOnly;
        this.f10460n = mEATERHeaderTextOnly2;
        this.f10461o = linearLayout5;
        this.f10462p = linearLayout6;
        this.f10463q = textView7;
        this.f10464r = textView8;
        this.f10465s = textView9;
        this.f10466t = textView10;
        this.f10467u = textView11;
        this.f10468v = textView12;
        this.f10469w = textView13;
        this.f10470x = linearLayout7;
        this.f10471y = textView14;
        this.f10472z = linearLayout8;
        this.f10441A = mEATERHeaderTextOnly3;
        this.f10442B = linearLayout9;
        this.f10443C = recyclerView;
        this.f10444D = scrollView;
        this.f10445E = materialToolbar;
        this.f10446F = linearLayout10;
    }

    public static q1 a(View view) {
        int i10 = R.id.androidContainer;
        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.androidContainer);
        if (linearLayout != null) {
            i10 = R.id.androidVersion;
            TextView textView = (TextView) A3.a.a(view, R.id.androidVersion);
            if (textView != null) {
                i10 = R.id.appBarLayout;
                AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
                if (appBarLayout != null) {
                    i10 = R.id.appVersion;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.appVersion);
                    if (textView2 != null) {
                        i10 = R.id.bleContainer;
                        LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.bleContainer);
                        if (linearLayout2 != null) {
                            i10 = R.id.blePermissions;
                            TextView textView3 = (TextView) A3.a.a(view, R.id.blePermissions);
                            if (textView3 != null) {
                                i10 = R.id.cloudSignIn;
                                TextView textView4 = (TextView) A3.a.a(view, R.id.cloudSignIn);
                                if (textView4 != null) {
                                    i10 = R.id.cloudStatus;
                                    TextView textView5 = (TextView) A3.a.a(view, R.id.cloudStatus);
                                    if (textView5 != null) {
                                        i10 = R.id.containerSE;
                                        LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.containerSE);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.devContainer;
                                            LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.devContainer);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.devMode;
                                                TextView textView6 = (TextView) A3.a.a(view, R.id.devMode);
                                                if (textView6 != null) {
                                                    i10 = R.id.devModeHeader;
                                                    MEATERHeaderTextOnly mEATERHeaderTextOnly = (MEATERHeaderTextOnly) A3.a.a(view, R.id.devModeHeader);
                                                    if (mEATERHeaderTextOnly != null) {
                                                        i10 = R.id.heading_1;
                                                        MEATERHeaderTextOnly mEATERHeaderTextOnly2 = (MEATERHeaderTextOnly) A3.a.a(view, R.id.heading_1);
                                                        if (mEATERHeaderTextOnly2 != null) {
                                                            i10 = R.id.listLayout;
                                                            LinearLayout linearLayout5 = (LinearLayout) A3.a.a(view, R.id.listLayout);
                                                            if (linearLayout5 != null) {
                                                                i10 = R.id.locationContainer;
                                                                LinearLayout linearLayout6 = (LinearLayout) A3.a.a(view, R.id.locationContainer);
                                                                if (linearLayout6 != null) {
                                                                    i10 = R.id.locationPermission;
                                                                    TextView textView7 = (TextView) A3.a.a(view, R.id.locationPermission);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.mBlockVersion;
                                                                        TextView textView8 = (TextView) A3.a.a(view, R.id.mBlockVersion);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.mMeaterPlus2;
                                                                            TextView textView9 = (TextView) A3.a.a(view, R.id.mMeaterPlus2);
                                                                            if (textView9 != null) {
                                                                                i10 = R.id.mPLUSSEVersion;
                                                                                TextView textView10 = (TextView) A3.a.a(view, R.id.mPLUSSEVersion);
                                                                                if (textView10 != null) {
                                                                                    i10 = R.id.mPLUSVersion;
                                                                                    TextView textView11 = (TextView) A3.a.a(view, R.id.mPLUSVersion);
                                                                                    if (textView11 != null) {
                                                                                        i10 = R.id.mProVersion;
                                                                                        TextView textView12 = (TextView) A3.a.a(view, R.id.mProVersion);
                                                                                        if (textView12 != null) {
                                                                                            i10 = R.id.mProXLVersion;
                                                                                            TextView textView13 = (TextView) A3.a.a(view, R.id.mProXLVersion);
                                                                                            if (textView13 != null) {
                                                                                                i10 = R.id.manageDeviceContainer;
                                                                                                LinearLayout linearLayout7 = (LinearLayout) A3.a.a(view, R.id.manageDeviceContainer);
                                                                                                if (linearLayout7 != null) {
                                                                                                    i10 = R.id.netWorkInterface;
                                                                                                    TextView textView14 = (TextView) A3.a.a(view, R.id.netWorkInterface);
                                                                                                    if (textView14 != null) {
                                                                                                        i10 = R.id.netWorkInterfaceContainer;
                                                                                                        LinearLayout linearLayout8 = (LinearLayout) A3.a.a(view, R.id.netWorkInterfaceContainer);
                                                                                                        if (linearLayout8 != null) {
                                                                                                            i10 = R.id.permissionHeader;
                                                                                                            MEATERHeaderTextOnly mEATERHeaderTextOnly3 = (MEATERHeaderTextOnly) A3.a.a(view, R.id.permissionHeader);
                                                                                                            if (mEATERHeaderTextOnly3 != null) {
                                                                                                                i10 = R.id.proContainer;
                                                                                                                LinearLayout linearLayout9 = (LinearLayout) A3.a.a(view, R.id.proContainer);
                                                                                                                if (linearLayout9 != null) {
                                                                                                                    i10 = R.id.recycler_view1;
                                                                                                                    RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.recycler_view1);
                                                                                                                    if (recyclerView != null) {
                                                                                                                        i10 = R.id.scrollView;
                                                                                                                        ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.scrollView);
                                                                                                                        if (scrollView != null) {
                                                                                                                            i10 = R.id.toolbar;
                                                                                                                            MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                                                            if (materialToolbar != null) {
                                                                                                                                i10 = R.id.xlContainer;
                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) A3.a.a(view, R.id.xlContainer);
                                                                                                                                if (linearLayout10 != null) {
                                                                                                                                    return new q1((ConstraintLayout) view, linearLayout, textView, appBarLayout, textView2, linearLayout2, textView3, textView4, textView5, linearLayout3, linearLayout4, textView6, mEATERHeaderTextOnly, mEATERHeaderTextOnly2, linearLayout5, linearLayout6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, linearLayout7, textView14, linearLayout8, mEATERHeaderTextOnly3, linearLayout9, recyclerView, scrollView, materialToolbar, linearLayout10);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static q1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.version_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10447a;
    }
}
