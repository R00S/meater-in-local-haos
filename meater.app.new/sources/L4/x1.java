package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: WebViewLayoutBinding.java */
/* loaded from: classes2.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10773a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f10774b;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f10775c;

    private x1(RelativeLayout relativeLayout, ProgressBar progressBar, WebView webView) {
        this.f10773a = relativeLayout;
        this.f10774b = progressBar;
        this.f10775c = webView;
    }

    public static x1 a(View view) {
        int i10 = R.id.progressBarWeb;
        ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.progressBarWeb);
        if (progressBar != null) {
            i10 = R.id.web_view;
            WebView webView = (WebView) A3.a.a(view, R.id.web_view);
            if (webView != null) {
                return new x1((RelativeLayout) view, progressBar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static x1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static x1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.web_view_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.f10773a;
    }
}
