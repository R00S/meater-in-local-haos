package com.google.android.gms.common;

import android.annotation.SuppressLint;
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
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0245i;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.downloadmanager.Constants;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.base.C6325R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: c */
    private static final Object f17211c = new Object();

    /* renamed from: d */
    private static final GoogleApiAvailability f17212d = new GoogleApiAvailability();

    /* renamed from: e */
    public static final int f17213e = GoogleApiAvailabilityLight.f17217a;

    /* renamed from: f */
    private String f17214f;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.GoogleApiAvailability$a */
    private class HandlerC6348a extends zap {

        /* renamed from: a */
        private final Context f17215a;

        public HandlerC6348a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f17215a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i2);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int iMo13812i = GoogleApiAvailability.this.mo13812i(this.f17215a);
            if (GoogleApiAvailability.this.mo13814m(iMo13812i)) {
                GoogleApiAvailability.this.m13819s(this.f17215a, iMo13812i);
            }
        }
    }

    /* renamed from: B */
    private final String m13802B() {
        String str;
        synchronized (f17211c) {
            str = this.f17214f;
        }
        return str;
    }

    /* renamed from: q */
    public static GoogleApiAvailability m13803q() {
        return f17212d;
    }

    /* renamed from: t */
    public static Dialog m13804t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ConnectionErrorMessages.m14309d(activity, 18));
        builder.setPositiveButton(HttpUrl.FRAGMENT_ENCODE_SET, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        m13806w(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    /* renamed from: u */
    static Dialog m13805u(Context context, int i2, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ConnectionErrorMessages.m14309d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strM14308c = ConnectionErrorMessages.m14308c(context, i2);
        if (strM14308c != null) {
            builder.setPositiveButton(strM14308c, dialogRedirect);
        }
        String strM14312g = ConnectionErrorMessages.m14312g(context, i2);
        if (strM14312g != null) {
            builder.setTitle(strM14312g);
        }
        return builder.create();
    }

    /* renamed from: w */
    static void m13806w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0468d) {
            SupportErrorDialogFragment.m13837d(dialog, onCancelListener).show(((ActivityC0468d) activity).getSupportFragmentManager(), str);
        } else {
            ErrorDialogFragment.m13799a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(20)
    /* renamed from: y */
    private final void m13807y(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        if (i2 == 18) {
            m13821x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM14311f = ConnectionErrorMessages.m14311f(context, i2);
        String strM14310e = ConnectionErrorMessages.m14310e(context, i2);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        C0245i.e eVarM1583A = new C0245i.e(context).m1602r(true).m1592g(true).m1597l(strM14311f).m1583A(new C0245i.c().m1576h(strM14310e));
        if (DeviceProperties.m14624d(context)) {
            Preconditions.m14375n(PlatformVersion.m14643g());
            eVarM1583A.m1609y(context.getApplicationInfo().icon).m1606v(2);
            if (DeviceProperties.m14625e(context)) {
                eVarM1583A.m1588a(C6325R.drawable.f17112a, resources.getString(C6325R.string.f17131o), pendingIntent);
            } else {
                eVarM1583A.m1595j(pendingIntent);
            }
        } else {
            eVarM1583A.m1609y(android.R.drawable.stat_sys_warning).m1584B(resources.getString(C6325R.string.f17124h)).m1587E(System.currentTimeMillis()).m1595j(pendingIntent).m1596k(strM14310e);
        }
        if (PlatformVersion.m14647k()) {
            Preconditions.m14375n(PlatformVersion.m14647k());
            String strM13802B = m13802B();
            if (strM13802B == null) {
                strM13802B = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strM14307b = ConnectionErrorMessages.m14307b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strM14307b, 4));
                } else if (!strM14307b.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strM14307b);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarM1583A.m1593h(strM13802B);
        }
        Notification notificationM1590c = eVarM1583A.m1590c();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i3 = 10436;
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationM1590c);
    }

    /* renamed from: A */
    public final boolean m13808A(Context context, ConnectionResult connectionResult, int i2) {
        PendingIntent pendingIntentM13817p = m13817p(context, connectionResult);
        if (pendingIntentM13817p == null) {
            return false;
        }
        m13807y(context, connectionResult.m13797y(), null, GoogleApiActivity.m13864a(context, pendingIntentM13817p, i2));
        return true;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    /* renamed from: d */
    public Intent mo13809d(Context context, int i2, String str) {
        return super.mo13809d(context, i2, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    /* renamed from: e */
    public PendingIntent mo13810e(Context context, int i2, int i3) {
        return super.mo13810e(context, i2, i3);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    /* renamed from: g */
    public final String mo13811g(int i2) {
        return super.mo13811g(i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    /* renamed from: i */
    public int mo13812i(Context context) {
        return super.mo13812i(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    /* renamed from: j */
    public int mo13813j(Context context, int i2) {
        return super.mo13813j(context, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    /* renamed from: m */
    public final boolean mo13814m(int i2) {
        return super.mo13814m(i2);
    }

    /* renamed from: n */
    public Dialog m13815n(Activity activity, int i2, int i3) {
        return m13816o(activity, i2, i3, null);
    }

    /* renamed from: o */
    public Dialog m13816o(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return m13805u(activity, i2, DialogRedirect.m14321a(activity, mo13809d(activity, i2, "d"), i3), onCancelListener);
    }

    /* renamed from: p */
    public PendingIntent m13817p(Context context, ConnectionResult connectionResult) {
        return connectionResult.m13794Y() ? connectionResult.m13793W() : mo13810e(context, connectionResult.m13797y(), 0);
    }

    /* renamed from: r */
    public boolean m13818r(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM13816o = m13816o(activity, i2, i3, onCancelListener);
        if (dialogM13816o == null) {
            return false;
        }
        m13806w(activity, dialogM13816o, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: s */
    public void m13819s(Context context, int i2) {
        m13807y(context, i2, null, m13827f(context, i2, 0, "n"));
    }

    /* renamed from: v */
    public final zabq m13820v(Context context, zabr zabrVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(Constants.PACKAGE);
        zabq zabqVar = new zabq(zabrVar);
        context.registerReceiver(zabqVar, intentFilter);
        zabqVar.m14184b(context);
        if (m13829l(context, "com.google.android.gms")) {
            return zabqVar;
        }
        zabrVar.mo14072a();
        zabqVar.m14183a();
        return null;
    }

    /* renamed from: x */
    final void m13821x(Context context) {
        new HandlerC6348a(context).sendEmptyMessageDelayed(1, LocalNotificationSyncManager.TWO_MINUTES);
    }

    /* renamed from: z */
    public final boolean m13822z(Activity activity, LifecycleFragment lifecycleFragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM13805u = m13805u(activity, i2, DialogRedirect.m14323c(lifecycleFragment, mo13809d(activity, i2, "d"), 2), onCancelListener);
        if (dialogM13805u == null) {
            return false;
        }
        m13806w(activity, dialogM13805u, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
