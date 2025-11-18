package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERScalesView;

/* compiled from: FragmentAddAlertBinding.java */
/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9606a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatEditText f9607b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f9608c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f9609d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9610e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9611f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f9612g;

    /* renamed from: h, reason: collision with root package name */
    public final View f9613h;

    /* renamed from: i, reason: collision with root package name */
    public final View f9614i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f9615j;

    /* renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f9616k;

    /* renamed from: l, reason: collision with root package name */
    public final MEATERScalesView f9617l;

    /* renamed from: m, reason: collision with root package name */
    public final View f9618m;

    private T(ConstraintLayout constraintLayout, AppCompatEditText appCompatEditText, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, View view, View view2, LinearLayout linearLayout3, ConstraintLayout constraintLayout2, MEATERScalesView mEATERScalesView, View view3) {
        this.f9606a = constraintLayout;
        this.f9607b = appCompatEditText;
        this.f9608c = linearLayout;
        this.f9609d = linearLayout2;
        this.f9610e = textView;
        this.f9611f = textView2;
        this.f9612g = textView3;
        this.f9613h = view;
        this.f9614i = view2;
        this.f9615j = linearLayout3;
        this.f9616k = constraintLayout2;
        this.f9617l = mEATERScalesView;
        this.f9618m = view3;
    }

    public static T a(View view) {
        int i10 = R.id.alertNameField;
        AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.alertNameField);
        if (appCompatEditText != null) {
            i10 = R.id.alert_name_heading_layout;
            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alert_name_heading_layout);
            if (linearLayout != null) {
                i10 = R.id.alert_name_layout;
                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.alert_name_layout);
                if (linearLayout2 != null) {
                    i10 = R.id.alert_text_view1;
                    TextView textView = (TextView) A3.a.a(view, R.id.alert_text_view1);
                    if (textView != null) {
                        i10 = R.id.alertTypeText;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.alertTypeText);
                        if (textView2 != null) {
                            i10 = R.id.alertTypeText1;
                            TextView textView3 = (TextView) A3.a.a(view, R.id.alertTypeText1);
                            if (textView3 != null) {
                                i10 = R.id.divider;
                                View viewA = A3.a.a(view, R.id.divider);
                                if (viewA != null) {
                                    i10 = R.id.divider_1;
                                    View viewA2 = A3.a.a(view, R.id.divider_1);
                                    if (viewA2 != null) {
                                        i10 = R.id.heading;
                                        LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.heading);
                                        if (linearLayout3 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            i10 = R.id.temp_picker;
                                            MEATERScalesView mEATERScalesView = (MEATERScalesView) A3.a.a(view, R.id.temp_picker);
                                            if (mEATERScalesView != null) {
                                                i10 = R.id.timeDivider;
                                                View viewA3 = A3.a.a(view, R.id.timeDivider);
                                                if (viewA3 != null) {
                                                    return new T(constraintLayout, appCompatEditText, linearLayout, linearLayout2, textView, textView2, textView3, viewA, viewA2, linearLayout3, constraintLayout, mEATERScalesView, viewA3);
                                                }
                                            }
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

    public static T c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_alert, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9606a;
    }
}
