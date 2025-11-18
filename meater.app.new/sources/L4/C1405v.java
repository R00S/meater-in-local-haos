package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityWifiSetupHostBinding.java */
/* renamed from: L4.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1405v {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10640a;

    /* renamed from: b, reason: collision with root package name */
    public final Toolbar f10641b;

    private C1405v(ConstraintLayout constraintLayout, Toolbar toolbar) {
        this.f10640a = constraintLayout;
        this.f10641b = toolbar;
    }

    public static C1405v a(View view) {
        Toolbar toolbar = (Toolbar) A3.a.a(view, R.id.toolbar);
        if (toolbar != null) {
            return new C1405v((ConstraintLayout) view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.toolbar)));
    }

    public static C1405v c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1405v d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_wifi_setup_host, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10640a;
    }
}
