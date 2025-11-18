package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: TextOnlyHeaderBinding.java */
/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10244a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10245b;

    /* renamed from: c, reason: collision with root package name */
    public final View f10246c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10247d;

    private m1(LinearLayout linearLayout, LinearLayout linearLayout2, View view, TextView textView) {
        this.f10244a = linearLayout;
        this.f10245b = linearLayout2;
        this.f10246c = view;
        this.f10247d = textView;
    }

    public static m1 a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.headerDivider;
        View viewA = A3.a.a(view, R.id.headerDivider);
        if (viewA != null) {
            i10 = R.id.headerText;
            TextView textView = (TextView) A3.a.a(view, R.id.headerText);
            if (textView != null) {
                return new m1(linearLayout, linearLayout, viewA, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.text_only_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f10244a;
    }
}
