package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.R;

/* compiled from: ViewOuterDialIndicatorBinding.java */
/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final View f10637a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f10638b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f10639c;

    private u1(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f10637a = view;
        this.f10638b = appCompatImageView;
        this.f10639c = appCompatImageView2;
    }

    public static u1 a(View view) {
        int i10 = R.id.arc_base_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.arc_base_image);
        if (appCompatImageView != null) {
            i10 = R.id.arc_mask_image;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.arc_mask_image);
            if (appCompatImageView2 != null) {
                return new u1(view, appCompatImageView, appCompatImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static u1 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_outer_dial_indicator, viewGroup);
        return a(viewGroup);
    }
}
