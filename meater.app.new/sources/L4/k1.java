package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ScaleButton;
import com.apptionlabs.meater_app.views.ScrollViewExt;

/* compiled from: TemperaturePickerViewBinding.java */
/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10191a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10192b;

    /* renamed from: c, reason: collision with root package name */
    public final ScaleButton f10193c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f10194d;

    /* renamed from: e, reason: collision with root package name */
    public final View f10195e;

    /* renamed from: f, reason: collision with root package name */
    public final ScaleButton f10196f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f10197g;

    /* renamed from: h, reason: collision with root package name */
    public final EditText f10198h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10199i;

    /* renamed from: j, reason: collision with root package name */
    public final ScrollViewExt f10200j;

    private k1(ConstraintLayout constraintLayout, ImageView imageView, ScaleButton scaleButton, ConstraintLayout constraintLayout2, View view, ScaleButton scaleButton2, EditText editText, EditText editText2, LinearLayout linearLayout, ScrollViewExt scrollViewExt) {
        this.f10191a = constraintLayout;
        this.f10192b = imageView;
        this.f10193c = scaleButton;
        this.f10194d = constraintLayout2;
        this.f10195e = view;
        this.f10196f = scaleButton2;
        this.f10197g = editText;
        this.f10198h = editText2;
        this.f10199i = linearLayout;
        this.f10200j = scrollViewExt;
    }

    public static k1 a(View view) {
        int i10 = R.id._arrow;
        ImageView imageView = (ImageView) A3.a.a(view, R.id._arrow);
        if (imageView != null) {
            i10 = R.id.back;
            ScaleButton scaleButton = (ScaleButton) A3.a.a(view, R.id.back);
            if (scaleButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.divider;
                View viewA = A3.a.a(view, R.id.divider);
                if (viewA != null) {
                    i10 = R.id.forward;
                    ScaleButton scaleButton2 = (ScaleButton) A3.a.a(view, R.id.forward);
                    if (scaleButton2 != null) {
                        i10 = R.id.maskEditScrollTextMask;
                        EditText editText = (EditText) A3.a.a(view, R.id.maskEditScrollTextMask);
                        if (editText != null) {
                            i10 = R.id.pickerScrollTextField;
                            EditText editText2 = (EditText) A3.a.a(view, R.id.pickerScrollTextField);
                            if (editText2 != null) {
                                i10 = R.id.scaleDivider;
                                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.scaleDivider);
                                if (linearLayout != null) {
                                    i10 = R.id.scrollView;
                                    ScrollViewExt scrollViewExt = (ScrollViewExt) A3.a.a(view, R.id.scrollView);
                                    if (scrollViewExt != null) {
                                        return new k1(constraintLayout, imageView, scaleButton, constraintLayout, viewA, scaleButton2, editText, editText2, linearLayout, scrollViewExt);
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

    public static k1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.temperature_picker_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
