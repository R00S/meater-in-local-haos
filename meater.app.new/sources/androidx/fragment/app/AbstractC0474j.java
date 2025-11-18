package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0237a;
import androidx.core.content.C0255a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024c.p052i.p059j.C0959i;

/* compiled from: FragmentHostCallback.java */
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public abstract class AbstractC0474j<E> extends AbstractC0470f {

    /* renamed from: f */
    private final Activity f3287f;

    /* renamed from: g */
    private final Context f3288g;

    /* renamed from: h */
    private final Handler f3289h;

    /* renamed from: i */
    private final int f3290i;

    /* renamed from: j */
    final FragmentManager f3291j;

    AbstractC0474j(ActivityC0468d activityC0468d) {
        this(activityC0468d, activityC0468d, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0470f
    /* renamed from: c */
    public View mo3383c(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0470f
    /* renamed from: d */
    public boolean mo3384d() {
        return true;
    }

    /* renamed from: e */
    Activity m3653e() {
        return this.f3287f;
    }

    /* renamed from: f */
    Context m3654f() {
        return this.f3288g;
    }

    /* renamed from: g */
    Handler m3655g() {
        return this.f3289h;
    }

    /* renamed from: h */
    public void mo3614h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo3615i();

    /* renamed from: j */
    public LayoutInflater mo3616j() {
        return LayoutInflater.from(this.f3288g);
    }

    @Deprecated
    /* renamed from: k */
    public void m3656k(Fragment fragment, String[] strArr, int i2) {
    }

    /* renamed from: l */
    public boolean mo3617l(Fragment fragment) {
        return true;
    }

    /* renamed from: m */
    public boolean mo3618m(String str) {
        return false;
    }

    /* renamed from: n */
    public void m3657n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C0255a.m1682k(this.f3288g, intent, bundle);
    }

    @Deprecated
    /* renamed from: o */
    public void m3658o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C0237a.m1530v(this.f3287f, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    /* renamed from: p */
    public void mo3619p() {
    }

    AbstractC0474j(Activity activity, Context context, Handler handler, int i2) {
        this.f3291j = new C0477m();
        this.f3287f = activity;
        this.f3288g = (Context) C0959i.m6066d(context, "context == null");
        this.f3289h = (Handler) C0959i.m6066d(handler, "handler == null");
        this.f3290i = i2;
    }
}
