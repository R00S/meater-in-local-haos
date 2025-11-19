package L4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;

/* compiled from: ItemLeftRightBinding.java */
/* loaded from: classes2.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f9314a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9315b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9316c;

    private D0(LinearLayout linearLayout, TextView textView, AppCompatTextView appCompatTextView) {
        this.f9314a = linearLayout;
        this.f9315b = textView;
        this.f9316c = appCompatTextView;
    }

    public static D0 a(View view) {
        int i10 = R.id.txtLeft;
        TextView textView = (TextView) A3.a.a(view, R.id.txtLeft);
        if (textView != null) {
            i10 = R.id.txtRight;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.txtRight);
            if (appCompatTextView != null) {
                return new D0((LinearLayout) view, textView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
