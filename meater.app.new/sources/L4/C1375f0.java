package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: FragmentManualBinding.java */
/* renamed from: L4.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1375f0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10022a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f10023b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10024c;

    /* renamed from: d, reason: collision with root package name */
    public final WebView f10025d;

    private C1375f0(ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, WebView webView) {
        this.f10022a = constraintLayout;
        this.f10023b = progressBar;
        this.f10024c = textView;
        this.f10025d = webView;
    }

    public static C1375f0 a(View view) {
        int i10 = R.id.progressBarWeb;
        ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.progressBarWeb);
        if (progressBar != null) {
            i10 = R.id.send;
            TextView textView = (TextView) A3.a.a(view, R.id.send);
            if (textView != null) {
                i10 = R.id.webview;
                WebView webView = (WebView) A3.a.a(view, R.id.webview);
                if (webView != null) {
                    return new C1375f0((ConstraintLayout) view, progressBar, textView, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1375f0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_manual, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10022a;
    }
}
