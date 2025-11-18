package P5;

import B4.l;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import g1.C3377a;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    private static long f14006a;

    public static String A(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        return Long.toHexString(byteBufferAllocate.getLong(0)).toUpperCase();
    }

    public static void B(Context context) throws PackageManager.NameNotFoundException {
        String str;
        if (!context.getResources().getBoolean(R.bool.amazon_device)) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                str = "market://details?id=";
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                str = "https://play.google.com/store/apps/details?id=";
            }
            C2316d.B(str + context.getPackageName());
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + context.getPackageName()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=" + context.getPackageName()));
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }

    public static String C(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "0000.0000.0000.0000";
        }
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(124);
        if (iIndexOf >= 0) {
            strTrim = strTrim.substring(iIndexOf + 1);
        }
        int iIndexOf2 = strTrim.indexOf(118);
        if (iIndexOf2 >= 0) {
            strTrim = strTrim.substring(iIndexOf2 + 1);
        }
        if (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1);
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (String str2 : strTrim.split("\\.")) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(String.format("%4s", str2).replace(' ', '0'));
            i10++;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                }
                return sb2.toString();
            }
            sb2.append(".0000");
            return sb2.toString();
        }
        sb2.append(".0000");
        sb2.append(".0000");
        sb2.append(".0000");
        return sb2.toString();
    }

    public static void D(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void E(EditText editText, int i10) {
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
    }

    public static void G(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            C1607o.f14055a.b();
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, context.getString(R.string.no_browser_found), 1).show();
        }
    }

    public static boolean H() {
        String language = Locale.getDefault().getLanguage();
        return language != null && language.equalsIgnoreCase("en");
    }

    public static long I(String str) {
        return s(str, 16);
    }

    public static boolean J() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis <= f14006a + 750) {
            return false;
        }
        f14006a = jCurrentTimeMillis;
        return true;
    }

    public static boolean K(String str) {
        return str != null && str.getBytes(StandardCharsets.UTF_8).length < 57;
    }

    public static boolean L(String str) {
        return str != null && str.getBytes(StandardCharsets.UTF_8).length < 64;
    }

    public static boolean a(int i10) {
        for (l.e eVar : l.e.values()) {
            if (eVar.getValue() == i10) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Parcelable> T b(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (parcel == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) parcel.readParcelable(classLoader, cls);
        }
        try {
            return (T) parcel.readParcelable(classLoader);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static float c(Probe probe, float f10) {
        float fD = d(f10);
        float celsiusFloat = (probe == null || probe.getCookState().getValue() == DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) ? 60.0f : Temperature.toCelsiusFloat(probe.getTargetInternalTemperature());
        float celsiusFloat2 = Temperature.toCelsiusFloat((int) fD);
        return (237.8f + (244.4f * (celsiusFloat2 != 0.0f ? (celsiusFloat > 20.0f || celsiusFloat2 >= celsiusFloat) ? (celsiusFloat2 >= celsiusFloat || celsiusFloat2 >= 20.0f) ? celsiusFloat2 < celsiusFloat ? (((celsiusFloat2 - 20.0f) / (celsiusFloat - 20.0f)) * 0.45f) + 0.05f : celsiusFloat2 < 200.0f ? (((celsiusFloat2 - celsiusFloat) / (200.0f - celsiusFloat)) * 0.45f) + 0.5f : (((celsiusFloat2 - 200.0f) / 100.0f) * 0.05f) + 0.95f : (celsiusFloat2 / 20.0f) * 0.05f : (celsiusFloat2 / celsiusFloat) * 0.5f : 0.0f))) % 360.0f;
    }

    private static float d(float f10) {
        return Math.min(4800.0f, Math.max(0.0f, f10));
    }

    public static int e(String str, String str2) {
        return C(str).compareTo(C(str2));
    }

    public static int f(String str) {
        if (str == null) {
            return 0;
        }
        return Integer.decode(str).intValue();
    }

    public static int g(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static Display h(Activity activity) {
        return Build.VERSION.SDK_INT >= 30 ? activity.getDisplay() : activity.getWindowManager().getDefaultDisplay();
    }

    public static int i(int i10) {
        return C3377a.c(x4.g.h(), i10);
    }

    public static int j(Context context, int i10) {
        if (context != null) {
            return C3377a.c(context, i10);
        }
        return -1;
    }

    public static <T extends Parcelable> T k(Bundle bundle, String str, Class<T> cls) {
        if (bundle == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getParcelable(str, cls);
        }
        try {
            return (T) bundle.getParcelable(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T extends Parcelable> ArrayList<T> l(Bundle bundle, String str, Class<T> cls) {
        if (bundle == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return bundle.getParcelableArrayList(str, cls);
        }
        try {
            return bundle.getParcelableArrayList(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T extends Serializable> T m(Bundle bundle, String str, Class<T> cls) {
        if (bundle == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getSerializable(str, cls);
        }
        try {
            return (T) bundle.getSerializable(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int n(Activity activity, boolean z10) {
        int iHeight;
        int i10;
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return z10 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }
        WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        Rect bounds = currentWindowMetrics.getBounds();
        if (z10) {
            iHeight = bounds.width() - insetsIgnoringVisibility.left;
            i10 = insetsIgnoringVisibility.right;
        } else {
            iHeight = bounds.height() - insetsIgnoringVisibility.top;
            i10 = insetsIgnoringVisibility.bottom;
        }
        return iHeight - i10;
    }

    public static SpannableStringBuilder o(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(1.4f), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        String strReplaceAll = str2.replaceAll("\n", "\n\n");
        SpannableString spannableString2 = new SpannableString(strReplaceAll);
        Matcher matcher = Pattern.compile("\n\n").matcher(strReplaceAll);
        while (matcher.find()) {
            spannableString2.setSpan(new AbsoluteSizeSpan(9, true), matcher.start() + 1, matcher.end(), 33);
        }
        return spannableStringBuilder.append((CharSequence) spannableString2);
    }

    public static SpannableStringBuilder p(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) new SpannableString(str));
        if (str2 != null && !str2.isEmpty()) {
            SpannableString spannableString = new SpannableString("\n" + str2);
            spannableString.setSpan(new RelativeSizeSpan(0.7f), 0, spannableString.length(), 0);
            spannableString.setSpan(new C1598f(i1.h.g(x4.g.h(), R.font.roboto_regular)), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString);
            if (str3 != null && !str3.isEmpty()) {
                SpannableString spannableString2 = new SpannableString(" " + str3);
                spannableString2.setSpan(new RelativeSizeSpan(0.7f), 0, spannableString2.length(), 0);
                spannableString2.setSpan(new ForegroundColorSpan(i(R.color.grey_e)), 0, spannableString2.length(), 0);
                spannableStringBuilder.append((CharSequence) spannableString2);
            }
        }
        return spannableStringBuilder;
    }

    public static String q(Context context, String str, int... iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 : iArr) {
            if (str != null && str.length() > 0 && sb2.length() > 0) {
                sb2.append(str);
            }
            sb2.append(context.getString(i10));
        }
        return sb2.toString();
    }

    public static long r(String str) {
        return s(str, -1);
    }

    public static long s(String str, int i10) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                String strReplaceAll = str.trim().toUpperCase().replaceAll("[^0-9A-F]+", "");
                if (i10 > 0 && strReplaceAll.length() > i10) {
                    strReplaceAll = strReplaceAll.substring(0, i10);
                }
                return new BigInteger(strReplaceAll, 16).longValue();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public static void t(Context context, View view) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            IBinder windowToken = view.getWindowToken();
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static long[] u(int i10) {
        int iMax = Math.max(60, i10);
        long j10 = (iMax / 60) / 60;
        long j11 = iMax - (3600 * j10);
        long j12 = j11 / 60;
        if (j11 % 60 > 10) {
            j12++;
        }
        if (j12 >= 60) {
            j10++;
            j12 = 0;
        }
        return new long[]{j10, j12};
    }

    public static boolean v(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean w(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        byte b10 = Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", Build.TYPE.equals("eng") ? 1 : 0) != 0;
        boolean zHasUserRestriction = userManager.hasUserRestriction("no_debugging_features");
        return Build.VERSION.SDK_INT >= 34 ? userManager.isAdminUser() && !zHasUserRestriction && b10 == true : !zHasUserRestriction && b10 == true;
    }

    public static boolean x() {
        return ((NotificationManager) x4.g.h().getSystemService("notification")).isNotificationPolicyAccessGranted();
    }

    public static boolean y(int i10, int i11) {
        return i10 >= 0 && i10 < i11;
    }

    public static String z(long j10) {
        String upperCase = Long.toHexString(j10).toUpperCase();
        if (upperCase.length() % 2 != 1) {
            return upperCase;
        }
        return "0" + upperCase;
    }

    public static void F(String str) {
    }
}
