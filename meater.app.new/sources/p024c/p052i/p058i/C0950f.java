package p024c.p052i.p058i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: TextUtilsCompat.java */
/* renamed from: c.i.i.f */
/* loaded from: classes.dex */
public final class C0950f {

    /* renamed from: a */
    private static final Locale f6404a = new Locale(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: a */
    private static int m6052a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m6053b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f6404a)) {
            return 0;
        }
        String strM6034c = C0946b.m6034c(locale);
        return strM6034c == null ? m6052a(locale) : (strM6034c.equalsIgnoreCase("Arab") || strM6034c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
