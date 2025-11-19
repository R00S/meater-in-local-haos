package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ActivityAlertBinding.java */
/* renamed from: L4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1366b {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9845a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f9846b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f9847c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9848d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9849e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f9850f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f9851g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f9852h;

    /* renamed from: i, reason: collision with root package name */
    public final AppBarLayout f9853i;

    /* renamed from: j, reason: collision with root package name */
    public final View f9854j;

    /* renamed from: k, reason: collision with root package name */
    public final View f9855k;

    /* renamed from: l, reason: collision with root package name */
    public final View f9856l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f9857m;

    /* renamed from: n, reason: collision with root package name */
    public final SwitchCompat f9858n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f9859o;

    /* renamed from: p, reason: collision with root package name */
    public final ListView f9860p;

    /* renamed from: q, reason: collision with root package name */
    public final MaterialToolbar f9861q;

    private C1366b(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, RelativeLayout relativeLayout3, AppBarLayout appBarLayout, View view, View view2, View view3, RelativeLayout relativeLayout4, SwitchCompat switchCompat, TextView textView2, ListView listView, MaterialToolbar materialToolbar) {
        this.f9845a = constraintLayout;
        this.f9846b = relativeLayout;
        this.f9847c = relativeLayout2;
        this.f9848d = textView;
        this.f9849e = imageView;
        this.f9850f = imageView2;
        this.f9851g = recyclerView;
        this.f9852h = relativeLayout3;
        this.f9853i = appBarLayout;
        this.f9854j = view;
        this.f9855k = view2;
        this.f9856l = view3;
        this.f9857m = relativeLayout4;
        this.f9858n = switchCompat;
        this.f9859o = textView2;
        this.f9860p = listView;
        this.f9861q = materialToolbar;
    }

    public static C1366b a(View view) {
        int i10 = R.id.alert_activity_main_view;
        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.alert_activity_main_view);
        if (relativeLayout != null) {
            i10 = R.id.alert_count_container;
            RelativeLayout relativeLayout2 = (RelativeLayout) A3.a.a(view, R.id.alert_count_container);
            if (relativeLayout2 != null) {
                i10 = R.id.alertCountLabel;
                TextView textView = (TextView) A3.a.a(view, R.id.alertCountLabel);
                if (textView != null) {
                    i10 = R.id.alertImage;
                    ImageView imageView = (ImageView) A3.a.a(view, R.id.alertImage);
                    if (imageView != null) {
                        i10 = R.id.alertImage0;
                        ImageView imageView2 = (ImageView) A3.a.a(view, R.id.alertImage0);
                        if (imageView2 != null) {
                            i10 = R.id.alert_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.alert_recycler_view);
                            if (recyclerView != null) {
                                i10 = R.id.alertRecyclerViewContainer;
                                RelativeLayout relativeLayout3 = (RelativeLayout) A3.a.a(view, R.id.alertRecyclerViewContainer);
                                if (relativeLayout3 != null) {
                                    i10 = R.id.appBarLayout;
                                    AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
                                    if (appBarLayout != null) {
                                        i10 = R.id.divider0;
                                        View viewA = A3.a.a(view, R.id.divider0);
                                        if (viewA != null) {
                                            i10 = R.id.divider1;
                                            View viewA2 = A3.a.a(view, R.id.divider1);
                                            if (viewA2 != null) {
                                                i10 = R.id.divider3;
                                                View viewA3 = A3.a.a(view, R.id.divider3);
                                                if (viewA3 != null) {
                                                    i10 = R.id.flareUpContainer;
                                                    RelativeLayout relativeLayout4 = (RelativeLayout) A3.a.a(view, R.id.flareUpContainer);
                                                    if (relativeLayout4 != null) {
                                                        i10 = R.id.flareUpSwitch;
                                                        SwitchCompat switchCompat = (SwitchCompat) A3.a.a(view, R.id.flareUpSwitch);
                                                        if (switchCompat != null) {
                                                            i10 = R.id.flareUpSwtitchText;
                                                            TextView textView2 = (TextView) A3.a.a(view, R.id.flareUpSwtitchText);
                                                            if (textView2 != null) {
                                                                i10 = R.id.list;
                                                                ListView listView = (ListView) A3.a.a(view, R.id.list);
                                                                if (listView != null) {
                                                                    i10 = R.id.toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                    if (materialToolbar != null) {
                                                                        return new C1366b((ConstraintLayout) view, relativeLayout, relativeLayout2, textView, imageView, imageView2, recyclerView, relativeLayout3, appBarLayout, viewA, viewA2, viewA3, relativeLayout4, switchCompat, textView2, listView, materialToolbar);
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

    public static C1366b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1366b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_alert, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9845a;
    }
}
