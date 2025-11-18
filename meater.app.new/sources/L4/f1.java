package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;

/* compiled from: SingleTextRowBinding.java */
/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10026a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f10027b;

    private f1(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.f10026a = linearLayout;
        this.f10027b = appCompatTextView;
    }

    public static f1 a(View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.deviceDetail);
        if (appCompatTextView != null) {
            return new f1((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.deviceDetail)));
    }

    public static f1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.single_text_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f10026a;
    }
}
