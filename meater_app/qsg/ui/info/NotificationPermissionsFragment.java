package com.apptionlabs.meater_app.qsg.ui.info;

import android.os.Build;
import android.view.View;
import android.view.result.c;
import com.apptionlabs.meater_app.qsg.ui.info.NotificationPermissionsFragment;
import e7.b;
import f8.l0;
import ih.t;
import kotlin.Metadata;
import rk.f0;
import rk.y;
import w6.d;
import wh.m;

/* compiled from: NotificationPermissionsFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/NotificationPermissionsFragment;", "Le7/b;", "Lih/u;", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "", "v0", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "permission", "Landroidx/activity/result/c;", "kotlin.jvm.PlatformType", "w0", "Landroidx/activity/result/c;", "requestNotificationPermission", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class NotificationPermissionsFragment extends b {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final String permission = "android.permission.POST_NOTIFICATIONS";

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final c<String> requestNotificationPermission;

    public NotificationPermissionsFragment() {
        c<String> a22 = a2(new e.c(), new android.view.result.b() { // from class: g7.v
            @Override // android.view.result.b
            public final void a(Object obj) {
                NotificationPermissionsFragment.Q2(NotificationPermissionsFragment.this, ((Boolean) obj).booleanValue());
            }
        });
        m.e(a22, "registerForActivityResult(...)");
        this.requestNotificationPermission = a22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(NotificationPermissionsFragment notificationPermissionsFragment, boolean z10) {
        m.f(notificationPermissionsFragment, "this$0");
        if (!z10) {
            if (!androidx.core.app.b.v(notificationPermissionsFragment.c2(), notificationPermissionsFragment.permission)) {
                k6.b.p("Notification Permission Never ask again", new Object[0]);
                t a10 = y.a();
                m.e(a10, "actionToNotificationPermissionDisableScreen(...)");
                androidx.navigation.fragment.a.a(notificationPermissionsFragment).S(a10);
                return;
            }
            k6.b.p("Notification Permission Denied", new Object[0]);
            return;
        }
        k6.b.p("Notification Permission Granted", new Object[0]);
        t b10 = f0.b();
        m.e(b10, "actionToImportantAlertPermissionFragment(...)");
        androidx.navigation.fragment.a.a(notificationPermissionsFragment).S(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(NotificationPermissionsFragment notificationPermissionsFragment, View view) {
        m.f(notificationPermissionsFragment, "this$0");
        notificationPermissionsFragment.requestNotificationPermission.a(notificationPermissionsFragment.permission);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(NotificationPermissionsFragment notificationPermissionsFragment, View view) {
        m.f(notificationPermissionsFragment, "this$0");
        l0.H(notificationPermissionsFragment.Y(), i6.c.INSTANCE.n());
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(2131951723);
        if (u6.a.f()) {
            A2().Q.setAnimation(2131951725);
        }
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(A0(2132018331));
    }

    @Override // e7.b
    public void I2() {
        A2().f8513k0.setText(A0(2132018334));
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationPermissionsFragment.R2(NotificationPermissionsFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void M2() {
        A2().f8516n0.setText(A0(2132018335));
        A2().f8516n0.setVisibility(0);
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: g7.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationPermissionsFragment.S2(NotificationPermissionsFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void y2() {
        d B2 = B2();
        d dVar = d.F;
        if (B2.compareTo(dVar) > 0) {
            if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.a(e2(), "android.permission.POST_NOTIFICATIONS") != 0) {
                t a10 = y.a();
                m.e(a10, "actionToNotificationPermissionDisableScreen(...)");
                androidx.navigation.fragment.a.a(this).S(a10);
                return;
            } else {
                t b10 = f0.b();
                m.e(b10, "actionToImportantAlertPermissionFragment(...)");
                androidx.navigation.fragment.a.a(this).S(b10);
                return;
            }
        }
        D2().I(dVar);
    }
}
