package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.common.C5648b;
import com.facebook.common.C5649c;
import com.facebook.internal.C5686k0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5737w;
import com.facebook.internal.p154u0.p155a.InterfaceC5732a;
import com.facebook.login.C5802v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FacebookActivity.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0016\u0018\u0000  2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006!"}, m32267d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/d;", "Lkotlin/u;", "c", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", HttpUrl.FRAGMENT_ENCODE_SET, "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", HttpUrl.FRAGMENT_ENCODE_SET, "args", "dump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "<set-?>", "h", "Landroidx/fragment/app/Fragment;", "a", "currentFragment", "<init>", "f", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookActivity extends ActivityC0468d {

    /* renamed from: g */
    private static final String f14125g = FacebookActivity.class.getName();

    /* renamed from: h, reason: from kotlin metadata */
    private Fragment currentFragment;

    /* renamed from: c */
    private final void m11134c() {
        Intent intent = getIntent();
        C5686k0 c5686k0 = C5686k0.f14437a;
        C9801m.m32345e(intent, "requestIntent");
        FacebookException facebookExceptionM11474p = C5686k0.m11474p(C5686k0.m11478t(intent));
        Intent intent2 = getIntent();
        C9801m.m32345e(intent2, "intent");
        setResult(0, C5686k0.m11470l(intent2, null, facebookExceptionM11474p));
        finish();
    }

    /* renamed from: a, reason: from getter */
    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, androidx.fragment.app.c, com.facebook.internal.w] */
    /* renamed from: b */
    protected Fragment m11136b() {
        C5802v c5802v;
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C9801m.m32345e(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentM3488j0 = supportFragmentManager.m3488j0("SingleFragment");
        if (fragmentM3488j0 != null) {
            return fragmentM3488j0;
        }
        if (C9801m.m32341a("FacebookDialogFragment", intent.getAction())) {
            ?? c5737w = new C5737w();
            c5737w.setRetainInstance(true);
            c5737w.show(supportFragmentManager, "SingleFragment");
            c5802v = c5737w;
        } else {
            C5802v c5802v2 = new C5802v();
            c5802v2.setRetainInstance(true);
            supportFragmentManager.m3493m().m3735c(C5648b.f14250c, c5802v2, "SingleFragment").mo3548i();
            c5802v = c5802v2;
        }
        return c5802v;
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        C9801m.m32346f(prefix, "prefix");
        C9801m.m32346f(writer, "writer");
        InterfaceC5732a interfaceC5732aM11802a = InterfaceC5732a.f14623a.m11802a();
        if (C9801m.m32341a(interfaceC5732aM11802a == null ? null : Boolean.valueOf(interfaceC5732aM11802a.m11801a(prefix, writer, args)), Boolean.TRUE)) {
            return;
        }
        super.dump(prefix, fd, writer, args);
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C9801m.m32346f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.currentFragment;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (!C5641a0.m11304w()) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11575j0(f14125g, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            C9801m.m32345e(applicationContext, "applicationContext");
            C5641a0.m11273M(applicationContext);
        }
        setContentView(C5649c.f14254a);
        if (C9801m.m32341a("PassThrough", intent.getAction())) {
            m11134c();
        } else {
            this.currentFragment = m11136b();
        }
    }
}
