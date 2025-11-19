package e5;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.widget.f;
import com.apptionlabs.meater_app.R;
import com.google.android.material.textfield.TextInputLayout;
import g1.C3377a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import l4.InterfaceC3899a;
import x4.g;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u0003*\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroid/view/View;", "", "enabled", "Loa/F;", "a", "(Landroid/view/View;Z)V", "Landroid/widget/EditText;", "h", "(Landroid/widget/EditText;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "d", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "", "message", "g", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V", "Ll4/a;", "", "b", "(Ll4/a;)I", "c", "(Ll4/a;)Ljava/lang/String;", "Landroid/widget/ImageView;", "colorRes", "e", "(Landroid/widget/ImageView;I)V", "f", "()Z", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3197a {
    public static final void a(View view, boolean z10) {
        C3862t.g(view, "<this>");
        view.setEnabled(z10);
    }

    public static final int b(InterfaceC3899a interfaceC3899a) {
        C3862t.g(interfaceC3899a, "<this>");
        if (interfaceC3899a instanceof InterfaceC3899a.NetworkError) {
            return ((InterfaceC3899a.NetworkError) interfaceC3899a).getCode();
        }
        return 0;
    }

    public static final String c(InterfaceC3899a interfaceC3899a) {
        C3862t.g(interfaceC3899a, "<this>");
        if (interfaceC3899a instanceof InterfaceC3899a.b) {
            return g.h().getString(R.string.error_no_internet);
        }
        if (!(interfaceC3899a instanceof InterfaceC3899a.NetworkError)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC3899a.NetworkError networkError = (InterfaceC3899a.NetworkError) interfaceC3899a;
        int code = networkError.getCode();
        if (code == 1000) {
            return g.h().getString(R.string.cloud_unavailable);
        }
        switch (code) {
            case 1:
            case 5:
                return g.h().getString(R.string.error_no_user_exist);
            case 2:
            case 4:
                return networkError.getMessage();
            case 3:
                return g.h().getString(R.string.existing_user_error);
            case 6:
                return g.h().getString(R.string.choose_different_password);
            case 7:
            case 8:
                return networkError.getMessage();
            case 9:
                return g.h().getString(R.string.cloud_unavailable) + " " + g.h().getString(R.string.update_your_app);
            default:
                return g.h().getString(R.string.error_text_something_went_wrong);
        }
    }

    public static final void d(TextInputLayout textInputLayout) {
        C3862t.g(textInputLayout, "<this>");
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
    }

    public static final void e(ImageView imageView, int i10) {
        C3862t.g(imageView, "<this>");
        f.c(imageView, ColorStateList.valueOf(C3377a.c(imageView.getContext(), i10)));
    }

    public static final boolean f() {
        return g.t().n1();
    }

    public static final void g(TextInputLayout textInputLayout, String message) {
        C3862t.g(textInputLayout, "<this>");
        C3862t.g(message, "message");
        textInputLayout.setError(message);
        textInputLayout.setErrorEnabled(true);
    }

    public static final void h(EditText editText) {
        C3862t.g(editText, "<this>");
        Object systemService = editText.getContext().getSystemService("input_method");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(editText, 1);
    }
}
