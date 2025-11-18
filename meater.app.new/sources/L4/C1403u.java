package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ActivityWifiSetupBinding.java */
/* renamed from: L4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1403u {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10603a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10604b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10605c;

    /* renamed from: d, reason: collision with root package name */
    public final ProgressBar f10606d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialToolbar f10607e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10608f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10609g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10610h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10611i;

    /* renamed from: j, reason: collision with root package name */
    public final D0 f10612j;

    private C1403u(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, ProgressBar progressBar, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, D0 d02) {
        this.f10603a = constraintLayout;
        this.f10604b = appBarLayout;
        this.f10605c = recyclerView;
        this.f10606d = progressBar;
        this.f10607e = materialToolbar;
        this.f10608f = textView;
        this.f10609g = textView2;
        this.f10610h = textView3;
        this.f10611i = textView4;
        this.f10612j = d02;
    }

    public static C1403u a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.listDetails;
            RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.listDetails);
            if (recyclerView != null) {
                i10 = R.id.mProgressBar;
                ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.mProgressBar);
                if (progressBar != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        i10 = R.id.txtHeaderConnectionStatus;
                        TextView textView = (TextView) A3.a.a(view, R.id.txtHeaderConnectionStatus);
                        if (textView != null) {
                            i10 = R.id.txtHeaderNetworkDetails;
                            TextView textView2 = (TextView) A3.a.a(view, R.id.txtHeaderNetworkDetails);
                            if (textView2 != null) {
                                i10 = R.id.txtHeaderWifiConfigure;
                                TextView textView3 = (TextView) A3.a.a(view, R.id.txtHeaderWifiConfigure);
                                if (textView3 != null) {
                                    i10 = R.id.txtWifiConfigure;
                                    TextView textView4 = (TextView) A3.a.a(view, R.id.txtWifiConfigure);
                                    if (textView4 != null) {
                                        i10 = R.id.viewConnectionStatus;
                                        View viewA = A3.a.a(view, R.id.viewConnectionStatus);
                                        if (viewA != null) {
                                            return new C1403u((ConstraintLayout) view, appBarLayout, recyclerView, progressBar, materialToolbar, textView, textView2, textView3, textView4, D0.a(viewA));
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

    public static C1403u c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1403u d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_wifi_setup, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10603a;
    }
}
