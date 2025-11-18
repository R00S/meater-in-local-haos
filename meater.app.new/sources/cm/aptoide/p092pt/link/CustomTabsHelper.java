package cm.aptoide.p092pt.link;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.C1146R;
import p024c.p038c.p039b.C0859c;

/* loaded from: classes.dex */
public class CustomTabsHelper {
    private static CustomTabsHelper customTabsHelper;

    private CustomTabsHelper() {
        if (customTabsHelper != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    private void addRefererHttpHeader(Context context, C0859c c0859c) {
        Bundle bundle = new Bundle();
        bundle.putString("Referer", "http://m.aptoide.com");
        c0859c.f5675a.putExtra("com.android.browser.headers", bundle);
        c0859c.f5675a.getExtras();
        if (Build.VERSION.SDK_INT >= 22) {
            c0859c.f5675a.putExtra("android.intent.extra.REFERRER_NAME", "android-app://" + context.getPackageName() + "/");
        }
    }

    private C0859c.a getBuilder(Context context, int i2) {
        return new C0859c.a().m5405h(C0255a.m1675d(context, i2)).m5403f(true).m5401d(BitmapFactory.decodeResource(context.getResources(), C1146R.drawable.ic_arrow_back)).m5398a().m5399b(context.getString(C1146R.string.customtabs_open_native_app), PendingIntent.getBroadcast(context.getApplicationContext(), 0, new Intent(context.getApplicationContext(), (Class<?>) CustomTabNativeReceiver.class), 67108864)).m5404g(context, C1146R.anim.slide_in_right, C1146R.anim.slide_out_left).m5402e(context, C1146R.anim.slide_in_left, C1146R.anim.slide_out_right);
    }

    public static CustomTabsHelper getInstance() {
        if (customTabsHelper == null) {
            customTabsHelper = new CustomTabsHelper();
        }
        return customTabsHelper;
    }

    public void openInChromeCustomTab(String str, Context context, int i2) {
        C0859c c0859cM5400c = getBuilder(context, i2).m5400c();
        addRefererHttpHeader(context, c0859cM5400c);
        c0859cM5400c.f5675a.setFlags(268435456);
        c0859cM5400c.m5397a(context, Uri.parse(str));
    }
}
