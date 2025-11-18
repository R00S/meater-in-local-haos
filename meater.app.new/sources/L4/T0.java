package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ProbeCleanFragmentBinding.java */
/* loaded from: classes2.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f9619a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9620b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9621c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f9622d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f9623e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f9624f;

    /* renamed from: g, reason: collision with root package name */
    public final ScrollView f9625g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f9626h;

    /* renamed from: i, reason: collision with root package name */
    public final VideoView f9627i;

    private T0(ScrollView scrollView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3, ScrollView scrollView2, TextView textView, VideoView videoView) {
        this.f9619a = scrollView;
        this.f9620b = constraintLayout;
        this.f9621c = appCompatTextView;
        this.f9622d = appCompatTextView2;
        this.f9623e = appCompatImageView;
        this.f9624f = appCompatTextView3;
        this.f9625g = scrollView2;
        this.f9626h = textView;
        this.f9627i = videoView;
    }

    public static T0 a(View view) {
        int i10 = R.id.baseLayoutContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.baseLayoutContainer);
        if (constraintLayout != null) {
            i10 = R.id.dismissButton;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.dismissButton);
            if (appCompatTextView != null) {
                i10 = R.id.doNotShowButton;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.doNotShowButton);
                if (appCompatTextView2 != null) {
                    i10 = R.id.probe_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.probe_image);
                    if (appCompatImageView != null) {
                        i10 = R.id.readMoreButton;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.readMoreButton);
                        if (appCompatTextView3 != null) {
                            ScrollView scrollView = (ScrollView) view;
                            i10 = R.id.textView1;
                            TextView textView = (TextView) A3.a.a(view, R.id.textView1);
                            if (textView != null) {
                                i10 = R.id.video;
                                VideoView videoView = (VideoView) A3.a.a(view, R.id.video);
                                if (videoView != null) {
                                    return new T0(scrollView, constraintLayout, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatTextView3, scrollView, textView, videoView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static T0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.probe_clean_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f9619a;
    }
}
