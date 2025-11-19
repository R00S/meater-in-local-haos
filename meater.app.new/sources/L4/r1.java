package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: VideoTutorialItemBinding.java */
/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10519a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCardView f10520b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10521c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f10522d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f10523e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f10524f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f10525g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f10526h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f10527i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f10528j;

    private r1(ConstraintLayout constraintLayout, MaterialCardView materialCardView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, FrameLayout frameLayout, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f10519a = constraintLayout;
        this.f10520b = materialCardView;
        this.f10521c = appCompatTextView;
        this.f10522d = appCompatImageView;
        this.f10523e = appCompatImageView2;
        this.f10524f = appCompatImageView3;
        this.f10525g = frameLayout;
        this.f10526h = appCompatTextView2;
        this.f10527i = appCompatTextView3;
        this.f10528j = appCompatTextView4;
    }

    public static r1 a(View view) {
        int i10 = R.id.card;
        MaterialCardView materialCardView = (MaterialCardView) A3.a.a(view, R.id.card);
        if (materialCardView != null) {
            i10 = R.id.durationText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.durationText);
            if (appCompatTextView != null) {
                i10 = R.id.imageDuration;
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.imageDuration);
                if (appCompatImageView != null) {
                    i10 = R.id.imageInfo;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.imageInfo);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.preview;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.preview);
                        if (appCompatImageView3 != null) {
                            i10 = R.id.progressHolder;
                            FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.progressHolder);
                            if (frameLayout != null) {
                                i10 = R.id.progressIndicator;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.progressIndicator);
                                if (appCompatTextView2 != null) {
                                    i10 = R.id.subTitle;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.subTitle);
                                    if (appCompatTextView3 != null) {
                                        i10 = R.id.title;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.title);
                                        if (appCompatTextView4 != null) {
                                            return new r1((ConstraintLayout) view, materialCardView, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatImageView3, frameLayout, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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

    public static r1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.video_tutorial_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10519a;
    }
}
