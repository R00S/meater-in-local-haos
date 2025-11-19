package c7;

import a7.C1909a;
import a7.C1910b;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e7.InterfaceC3219i;
import f1.m;
import g7.C3445p;
import l7.C3907a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {p7.d.class, p7.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: c7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2336e extends C2337f {

    /* renamed from: c, reason: collision with root package name */
    private String f31081c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f31079e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final C2336e f31080f = new C2336e();

    /* renamed from: d, reason: collision with root package name */
    public static final int f31078d = C2337f.f31082a;

    public static C2336e m() {
        return f31080f;
    }

    @Override // c7.C2337f
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // c7.C2337f
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // c7.C2337f
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // c7.C2337f
    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    @Override // c7.C2337f
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // c7.C2337f
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, g7.E.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent l(Context context, C2333b c2333b) {
        return c2333b.v0() ? c2333b.r0() : c(context, c2333b.f0(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i10, i11, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) throws Resources.NotFoundException {
        t(context, i10, null, d(context, i10, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog p(Context context, int i10, g7.E e10, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(g7.B.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = g7.B.b(context, i10);
        if (strB != null) {
            if (e10 == null) {
                e10 = onClickListener;
            }
            builder.setPositiveButton(strB, e10);
        }
        String strF = g7.B.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(g7.B.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final e7.I r(Context context, e7.H h10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        e7.I i10 = new e7.I(h10);
        p7.h.p(context, i10, intentFilter);
        i10.a(context);
        if (i(context, "com.google.android.gms")) {
            return i10;
        }
        h10.a();
        i10.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.o) {
                C2342k.O2(dialog, onCancelListener).N2(((androidx.fragment.app.o) activity).w0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2334c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void t(Context context, int i10, String str, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = g7.B.e(context, i10);
        String strD = g7.B.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C3445p.k(context.getSystemService("notification"));
        m.e eVarB = new m.e(context).t(true).f(true).k(strE).B(new m.c().h(strD));
        if (com.google.android.gms.common.util.i.c(context)) {
            C3445p.n(com.google.android.gms.common.util.l.b());
            eVarB.z(context.getApplicationInfo().icon).x(2);
            if (com.google.android.gms.common.util.i.d(context)) {
                eVarB.a(C1909a.f20087a, resources.getString(C1910b.f20102o), pendingIntent);
            } else {
                eVarB.i(pendingIntent);
            }
        } else {
            eVarB.z(R.drawable.stat_sys_warning).C(resources.getString(C1910b.f20095h)).F(System.currentTimeMillis()).i(pendingIntent).j(strD);
        }
        if (com.google.android.gms.common.util.l.e()) {
            C3445p.n(com.google.android.gms.common.util.l.e());
            synchronized (f31079e) {
                str2 = this.f31081c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C1910b.f20094g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarB.g(str2);
        }
        Notification notificationB = eVarB.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C2339h.f31086b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }

    final void u(Context context) {
        new HandlerC2343l(this, context).sendEmptyMessageDelayed(1, Config.MC_STATS_INTERVAL_MAX);
    }

    @ResultIgnorabilityUnspecified
    public final boolean v(Activity activity, InterfaceC3219i interfaceC3219i, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i10, g7.E.c(interfaceC3219i, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, C2333b c2333b, int i10) throws Resources.NotFoundException {
        PendingIntent pendingIntentL;
        if (C3907a.a(context) || (pendingIntentL = l(context, c2333b)) == null) {
            return false;
        }
        t(context, c2333b.f0(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i10, true), p7.i.f47659a | 134217728));
        return true;
    }
}
