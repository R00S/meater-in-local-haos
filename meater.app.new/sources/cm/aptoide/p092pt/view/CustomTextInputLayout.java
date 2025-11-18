package cm.aptoide.p092pt.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.core.view.C0281a0;
import androidx.core.view.C0311u;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import com.google.android.material.textfield.TextInputLayout;
import p024c.p068n.p069a.p070a.C0988b;

/* loaded from: classes.dex */
public class CustomTextInputLayout extends TextInputLayout {
    static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C0988b();
    private boolean errorEnabled;
    private CharSequence helperText;
    private int helperTextAppearance;
    private ColorStateList helperTextColor;
    private boolean helperTextEnabled;
    private TextView helperView;

    public CustomTextInputLayout(Context context) {
        super(context);
        this.errorEnabled = false;
        this.helperTextEnabled = false;
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setErrorEnabled(boolean z) {
        if (this.errorEnabled == z) {
            return;
        }
        this.errorEnabled = z;
        if (z && this.helperTextEnabled) {
            setHelperTextEnabled(false);
        }
        super.setErrorEnabled(z);
        if (z || TextUtils.isEmpty(this.helperText)) {
            return;
        }
        setHelperText(this.helperText);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setHelperText(CharSequence charSequence) {
        this.helperText = charSequence;
        if (!this.helperTextEnabled) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setHelperTextEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.helperView.setText(charSequence);
            this.helperView.setVisibility(0);
            C0311u.m2137l0(this.helperView, 0.0f);
            C0311u.m2118c(this.helperView).m2217a(1.0f).m2220d(200L).m2221e(FAST_OUT_SLOW_IN_INTERPOLATOR).m2222f(null).m2225j();
        } else if (this.helperView.getVisibility() == 0) {
            C0311u.m2118c(this.helperView).m2217a(0.0f).m2220d(200L).m2221e(FAST_OUT_SLOW_IN_INTERPOLATOR).m2222f(new C0281a0() { // from class: cm.aptoide.pt.view.CustomTextInputLayout.1
                @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
                public void onAnimationEnd(View view) {
                    CustomTextInputLayout.this.helperView.setText((CharSequence) null);
                    CustomTextInputLayout.this.helperView.setVisibility(4);
                }
            }).m2225j();
        }
        sendAccessibilityEvent(RecyclerView.AbstractC0599l.FLAG_MOVED);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setHelperTextColor(ColorStateList colorStateList) {
        this.helperTextColor = colorStateList;
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setHelperTextEnabled(boolean z) {
        if (this.helperTextEnabled == z) {
            return;
        }
        if (z && this.errorEnabled) {
            setErrorEnabled(false);
        }
        if (this.helperTextEnabled != z) {
            if (z) {
                TextView textView = new TextView(getContext());
                this.helperView = textView;
                textView.setTextSize(2, 12.0f);
                this.helperView.setTextAppearance(getContext(), this.helperTextAppearance);
                ColorStateList colorStateList = this.helperTextColor;
                if (colorStateList != null) {
                    this.helperView.setTextColor(colorStateList);
                }
                this.helperView.setText(this.helperText);
                this.helperView.setVisibility(0);
                addView(this.helperView);
                if (this.helperView != null && getEditText() != null) {
                    C0311u.m2159w0(this.helperView, C0311u.m2090D(getEditText()), 0, C0311u.m2088C(getEditText()), getEditText().getPaddingBottom());
                }
            } else {
                removeView(this.helperView);
                this.helperView = null;
            }
            this.helperTextEnabled = z;
        }
    }

    public CustomTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.errorEnabled = false;
        this.helperTextEnabled = false;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1146R.styleable.CustomTextInputLayout, 0, 0);
        try {
            this.helperTextColor = typedArrayObtainStyledAttributes.getColorStateList(1);
            this.helperText = typedArrayObtainStyledAttributes.getText(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
