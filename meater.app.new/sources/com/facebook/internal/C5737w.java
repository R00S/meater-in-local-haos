package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import com.facebook.C5641a0;
import com.facebook.FacebookException;
import com.facebook.internal.DialogC5700r0;
import com.facebook.internal.DialogC5740z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: FacebookDialogFragment.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u000eR$\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, m32267d2 = {"Lcom/facebook/internal/w;", "Landroidx/fragment/app/c;", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "Lkotlin/u;", "i", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "j", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "d", "()V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", "g", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "k", "(Landroid/app/Dialog;)V", "innerDialog", "<init>", "f", "a", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* renamed from: com.facebook.internal.w */
/* loaded from: classes2.dex */
public final class C5737w extends DialogInterfaceOnCancelListenerC0466c {

    /* renamed from: g, reason: from kotlin metadata */
    private Dialog innerDialog;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m11812e(C5737w c5737w, Bundle bundle, FacebookException facebookException) {
        C9801m.m32346f(c5737w, "this$0");
        c5737w.m11816i(bundle, facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11813f(C5737w c5737w, Bundle bundle, FacebookException facebookException) {
        C9801m.m32346f(c5737w, "this$0");
        c5737w.m11817j(bundle);
    }

    /* renamed from: i */
    private final void m11816i(Bundle values, FacebookException error) {
        ActivityC0468d activity = getActivity();
        if (activity == null) {
            return;
        }
        C5686k0 c5686k0 = C5686k0.f14437a;
        Intent intent = activity.getIntent();
        C9801m.m32345e(intent, "fragmentActivity.intent");
        activity.setResult(error == null ? -1 : 0, C5686k0.m11470l(intent, values, error));
        activity.finish();
    }

    /* renamed from: j */
    private final void m11817j(Bundle values) {
        ActivityC0468d activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (values == null) {
            values = new Bundle();
        }
        intent.putExtras(values);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: d */
    public final void m11818d() throws PackageManager.NameNotFoundException {
        ActivityC0468d activity;
        DialogC5700r0 dialogC5700r0M11831a;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            C5686k0 c5686k0 = C5686k0.f14437a;
            C9801m.m32345e(intent, "intent");
            Bundle bundleM11478t = C5686k0.m11478t(intent);
            if (bundleM11478t == null ? false : bundleM11478t.getBoolean("is_fallback", false)) {
                String string = bundleM11478t != null ? bundleM11478t.getString("url") : null;
                C5696p0 c5696p0 = C5696p0.f14478a;
                if (C5696p0.m11557a0(string)) {
                    C5696p0.m11575j0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                C5641a0 c5641a0 = C5641a0.f14199a;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{C5641a0.m11285d()}, 1));
                C9801m.m32345e(str, "java.lang.String.format(format, *args)");
                DialogC5740z.a aVar = DialogC5740z.f14649v;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                dialogC5700r0M11831a = aVar.m11831a(activity, string, str);
                dialogC5700r0M11831a.m11673B(new DialogC5700r0.e() { // from class: com.facebook.internal.b
                    @Override // com.facebook.internal.DialogC5700r0.e
                    /* renamed from: a */
                    public final void mo11371a(Bundle bundle, FacebookException facebookException) {
                        C5737w.m11813f(this.f14355a, bundle, facebookException);
                    }
                });
            } else {
                String string2 = bundleM11478t == null ? null : bundleM11478t.getString("action");
                Bundle bundle = bundleM11478t != null ? bundleM11478t.getBundle("params") : null;
                C5696p0 c5696p02 = C5696p0.f14478a;
                if (C5696p0.m11557a0(string2)) {
                    C5696p0.m11575j0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    dialogC5700r0M11831a = new DialogC5700r0.a(activity, string2, bundle).m11688h(new DialogC5700r0.e() { // from class: com.facebook.internal.a
                        @Override // com.facebook.internal.DialogC5700r0.e
                        /* renamed from: a */
                        public final void mo11371a(Bundle bundle2, FacebookException facebookException) {
                            C5737w.m11812e(this.f14312a, bundle2, facebookException);
                        }
                    }).mo11682a();
                }
            }
            this.innerDialog = dialogC5700r0M11831a;
        }
    }

    /* renamed from: k */
    public final void m11819k(Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C9801m.m32346f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof DialogC5700r0) && isResumed()) {
            Dialog dialog = this.innerDialog;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((DialogC5700r0) dialog).m11678x();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) throws PackageManager.NameNotFoundException {
        super.onCreate(savedInstanceState);
        m11818d();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        m11816i(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        C9801m.m32345e(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof DialogC5700r0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((DialogC5700r0) dialog).m11678x();
        }
    }
}
