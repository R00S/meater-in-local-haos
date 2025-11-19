package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: NewsVideoListItemBinding.java */
/* loaded from: classes2.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9567a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f9568b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9569c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9570d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9571e;

    private P0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        this.f9567a = constraintLayout;
        this.f9568b = appCompatTextView;
        this.f9569c = constraintLayout2;
        this.f9570d = appCompatImageView;
        this.f9571e = appCompatTextView2;
    }

    public static P0 a(View view) {
        int i10 = R.id.durationText;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.durationText);
        if (appCompatTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.thumbnail;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.thumbnail);
            if (appCompatImageView != null) {
                i10 = R.id.title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.title);
                if (appCompatTextView2 != null) {
                    return new P0(constraintLayout, appCompatTextView, constraintLayout, appCompatImageView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static P0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.news_video_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
