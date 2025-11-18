package com.facebook.p157o0.p160m0.p161n;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.C10528c;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: SensitiveUserDataUtils.kt */
/* renamed from: com.facebook.o0.m0.n.d */
/* loaded from: classes.dex */
public final class C5872d {

    /* renamed from: a */
    public static final C5872d f15253a = new C5872d();

    private C5872d() {
    }

    /* renamed from: a */
    private final boolean m12457a(TextView textView) {
        int i2;
        C5874f c5874f = C5874f.f15257a;
        String strM37439c = new Regex("\\s").m37439c(C5874f.m12478k(textView), HttpUrl.FRAGMENT_ENCODE_SET);
        int length = strM37439c.length();
        if (length < 12 || length > 19) {
            return false;
        }
        int i3 = length - 1;
        if (i3 >= 0) {
            boolean z = false;
            i2 = 0;
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = strM37439c.charAt(i3);
                if (!Character.isDigit(cCharAt)) {
                    return false;
                }
                int iM37414d = C10528c.m37414d(cCharAt);
                if (z && (iM37414d = iM37414d * 2) > 9) {
                    iM37414d = (iM37414d % 10) + 1;
                }
                i2 += iM37414d;
                z = !z;
                if (i4 < 0) {
                    break;
                }
                i3 = i4;
            }
        } else {
            i2 = 0;
        }
        return i2 % 10 == 0;
    }

    /* renamed from: b */
    private final boolean m12458b(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        C5874f c5874f = C5874f.f15257a;
        String strM12478k = C5874f.m12478k(textView);
        if (strM12478k == null) {
            return false;
        }
        if (strM12478k.length() == 0) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(strM12478k).matches();
    }

    /* renamed from: c */
    private final boolean m12459c(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    /* renamed from: d */
    private final boolean m12460d(TextView textView) {
        return textView.getInputType() == 96;
    }

    /* renamed from: e */
    private final boolean m12461e(TextView textView) {
        return textView.getInputType() == 3;
    }

    /* renamed from: f */
    private final boolean m12462f(TextView textView) {
        return textView.getInputType() == 112;
    }

    /* renamed from: g */
    public static final boolean m12463g(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        C5872d c5872d = f15253a;
        TextView textView = (TextView) view;
        return c5872d.m12459c(textView) || c5872d.m12457a(textView) || c5872d.m12460d(textView) || c5872d.m12462f(textView) || c5872d.m12461e(textView) || c5872d.m12458b(textView);
    }
}
