package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;

/* compiled from: ProbeNumberTextViewBinding.java */
/* loaded from: classes2.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f9653a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9654b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9655c;

    private U0(FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatTextView appCompatTextView) {
        this.f9653a = frameLayout;
        this.f9654b = frameLayout2;
        this.f9655c = appCompatTextView;
    }

    public static U0 a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.probeNumber);
        if (appCompatTextView != null) {
            return new U0(frameLayout, frameLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.probeNumber)));
    }

    public static U0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.probe_number_text_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
