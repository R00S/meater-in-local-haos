package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.views.b0;
import com.apptionlabs.meater_app.views.e0;

/* compiled from: DialogSingleton.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static AlertDialog f10460a;

    /* compiled from: DialogSingleton.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface a {
        void a();

        void b();
    }

    public static void d() {
        AlertDialog alertDialog = f10460a;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                Context baseContext = ((ContextWrapper) f10460a.getContext()).getBaseContext();
                if (!(baseContext instanceof Activity) || !((Activity) baseContext).isFinishing()) {
                    try {
                        f10460a.dismiss();
                    } catch (Exception e10) {
                        Log.error("DialogSingleton", "dismiss error " + e10.getMessage());
                    }
                }
            }
            f10460a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(a aVar, Activity activity) {
        d();
        if (aVar != null && !activity.isFinishing()) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(a aVar, Activity activity) {
        d();
        if (aVar != null && !activity.isFinishing()) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(a aVar, Activity activity) {
        d();
        if (aVar != null && !activity.isFinishing()) {
            aVar.b();
        }
    }

    public static void h(Activity activity, String str, String str2, int i10, a aVar) {
        i(activity, str, str2, activity.getString(i10), aVar);
    }

    public static void i(final Activity activity, String str, String str2, String str3, final a aVar) {
        d();
        AlertDialog e10 = e0.INSTANCE.e(activity, str, str2, false, new e0.AlertPair(str3, new j6.e() { // from class: com.apptionlabs.meater_app.views.a0
            @Override // j6.e
            public final void a() {
                b0.e(b0.a.this, activity);
            }
        }), null, null);
        f10460a = e10;
        e10.show();
    }

    public static void j(final Activity activity, String str, String str2, String str3, String str4, final a aVar) {
        d();
        AlertDialog e10 = e0.INSTANCE.e(activity, str, str2, false, new e0.AlertPair(str3, new j6.e() { // from class: com.apptionlabs.meater_app.views.y
            @Override // j6.e
            public final void a() {
                b0.f(b0.a.this, activity);
            }
        }), new e0.AlertPair(str4, new j6.e() { // from class: com.apptionlabs.meater_app.views.z
            @Override // j6.e
            public final void a() {
                b0.g(b0.a.this, activity);
            }
        }), null);
        f10460a = e10;
        e10.show();
    }
}
