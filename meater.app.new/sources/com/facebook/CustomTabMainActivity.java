package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C5676f0;
import com.facebook.internal.C5686k0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5731u;
import com.facebook.login.EnumC5806z;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p024c.p076q.p077a.C0997a;

/* compiled from: CustomTabMainActivity.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m32267d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", HttpUrl.FRAGMENT_ENCODE_SET, "resultCode", "Landroid/content/Intent;", "resultIntent", "Lkotlin/u;", "a", "(ILandroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "()V", "Landroid/content/BroadcastReceiver;", "o", "Landroid/content/BroadcastReceiver;", "redirectReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "n", "Z", "shouldCloseCustomTab", "<init>", "f", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g */
    public static final String f14113g = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* renamed from: h */
    public static final String f14114h = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* renamed from: i */
    public static final String f14115i = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* renamed from: j */
    public static final String f14116j = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* renamed from: k */
    public static final String f14117k = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* renamed from: l */
    public static final String f14118l = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* renamed from: m */
    public static final String f14119m = C9801m.m32354n(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* renamed from: n, reason: from kotlin metadata */
    private boolean shouldCloseCustomTab = true;

    /* renamed from: o, reason: from kotlin metadata */
    private BroadcastReceiver redirectReceiver;

    /* compiled from: CustomTabMainActivity.kt */
    /* renamed from: com.facebook.CustomTabMainActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Bundle m11133b(String str) {
            Uri uri = Uri.parse(str);
            C5696p0 c5696p0 = C5696p0.f14478a;
            Bundle bundleM11585o0 = C5696p0.m11585o0(uri.getQuery());
            bundleM11585o0.putAll(C5696p0.m11585o0(uri.getFragment()));
            return bundleM11585o0;
        }
    }

    /* compiled from: CustomTabMainActivity.kt */
    /* renamed from: com.facebook.CustomTabMainActivity$b */
    public /* synthetic */ class C5615b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14122a;

        static {
            int[] iArr = new int[EnumC5806z.valuesCustom().length];
            iArr[EnumC5806z.INSTAGRAM.ordinal()] = 1;
            f14122a = iArr;
        }
    }

    /* compiled from: CustomTabMainActivity.kt */
    /* renamed from: com.facebook.CustomTabMainActivity$c */
    public static final class C5616c extends BroadcastReceiver {
        C5616c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9801m.m32346f(context, "context");
            C9801m.m32346f(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f14118l);
            String str = CustomTabMainActivity.f14116j;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    /* renamed from: a */
    private final void m11131a(int resultCode, Intent resultIntent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            C0997a.m6341b(this).m6345e(broadcastReceiver);
        }
        if (resultIntent != null) {
            String stringExtra = resultIntent.getStringExtra(f14116j);
            Bundle bundleM11133b = stringExtra != null ? INSTANCE.m11133b(stringExtra) : new Bundle();
            C5686k0 c5686k0 = C5686k0.f14437a;
            Intent intent = getIntent();
            C9801m.m32345e(intent, "intent");
            Intent intentM11470l = C5686k0.m11470l(intent, bundleM11133b, null);
            if (intentM11470l != null) {
                resultIntent = intentM11470l;
            }
            setResult(resultCode, resultIntent);
        } else {
            C5686k0 c5686k02 = C5686k0.f14437a;
            Intent intent2 = getIntent();
            C9801m.m32345e(intent2, "intent");
            setResult(resultCode, C5686k0.m11470l(intent2, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        String str = CustomTabActivity.f14108g;
        if (C9801m.m32341a(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (savedInstanceState != null || (stringExtra = getIntent().getStringExtra(f14113g)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f14114h);
        boolean zM11798a = (C5615b.f14122a[EnumC5806z.f14878f.m12132a(getIntent().getStringExtra(f14117k)).ordinal()] == 1 ? new C5676f0(stringExtra, bundleExtra) : new C5731u(stringExtra, bundleExtra)).m11798a(this, getIntent().getStringExtra(f14115i));
        this.shouldCloseCustomTab = false;
        if (!zM11798a) {
            setResult(0, getIntent().putExtra(f14119m, true));
            finish();
        } else {
            C5616c c5616c = new C5616c();
            this.redirectReceiver = c5616c;
            C0997a.m6341b(this).m6343c(c5616c, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        C9801m.m32346f(intent, "intent");
        super.onNewIntent(intent);
        if (C9801m.m32341a(f14118l, intent.getAction())) {
            C0997a.m6341b(this).m6344d(new Intent(CustomTabActivity.f14109h));
            m11131a(-1, intent);
        } else if (C9801m.m32341a(CustomTabActivity.f14108g, intent.getAction())) {
            m11131a(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            m11131a(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
