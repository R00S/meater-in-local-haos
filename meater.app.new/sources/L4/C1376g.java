package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ActivityFirmwareListBinding.java */
/* renamed from: L4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1376g {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10028a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10029b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f10030c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialToolbar f10031d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10032e;

    private C1376g(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ListView listView, MaterialToolbar materialToolbar, TextView textView) {
        this.f10028a = constraintLayout;
        this.f10029b = appBarLayout;
        this.f10030c = listView;
        this.f10031d = materialToolbar;
        this.f10032e = textView;
    }

    public static C1376g a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.listView;
            ListView listView = (ListView) A3.a.a(view, R.id.listView);
            if (listView != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                if (materialToolbar != null) {
                    i10 = R.id.txtMessage;
                    TextView textView = (TextView) A3.a.a(view, R.id.txtMessage);
                    if (textView != null) {
                        return new C1376g((ConstraintLayout) view, appBarLayout, listView, materialToolbar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1376g c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1376g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_firmware_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10028a;
    }
}
