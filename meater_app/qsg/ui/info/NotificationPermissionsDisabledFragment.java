package com.apptionlabs.meater_app.qsg.ui.info;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.qsg.ui.info.NotificationPermissionsDisabledFragment;
import e7.b;
import f8.l0;
import g6.d;
import i6.c;
import ih.t;
import kotlin.Metadata;
import rk.u;
import wh.m;

/* compiled from: NotificationPermissionsDisabledFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/NotificationPermissionsDisabledFragment;", "Le7/b;", "", "P2", "Lih/u;", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "v1", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class NotificationPermissionsDisabledFragment extends b {
    private final boolean P2() {
        if (androidx.core.content.a.a(e2(), "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(NotificationPermissionsDisabledFragment notificationPermissionsDisabledFragment, View view) {
        m.f(notificationPermissionsDisabledFragment, "this$0");
        if (!notificationPermissionsDisabledFragment.P2()) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", notificationPermissionsDisabledFragment.c2().getPackageName(), null));
            notificationPermissionsDisabledFragment.t2(intent);
            return;
        }
        t a10 = u.a();
        m.e(a10, "actionToImportantAlertScreen(...)");
        androidx.navigation.fragment.a.a(notificationPermissionsDisabledFragment).S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(NotificationPermissionsDisabledFragment notificationPermissionsDisabledFragment, View view) {
        m.f(notificationPermissionsDisabledFragment, "this$0");
        l0.H(notificationPermissionsDisabledFragment.Y(), c.INSTANCE.n());
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(2131951724);
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(A0(2132018332));
    }

    @Override // e7.b
    public void I2() {
        A2().f8513k0.setText(A0(2132018333));
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationPermissionsDisabledFragment.Q2(NotificationPermissionsDisabledFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void M2() {
        A2().f8516n0.setText(A0(2132018335));
        A2().f8516n0.setVisibility(0);
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: g7.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationPermissionsDisabledFragment.R2(NotificationPermissionsDisabledFragment.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (!P2()) {
            A2().S.setText(A0(2132017818));
            return;
        }
        TextView textView = A2().f8512j0;
        m.e(textView, "screenSubTitle");
        d.i(textView);
        A2().Y.setAnimation(2131951716);
        LottieAnimationView lottieAnimationView = A2().Y;
        m.e(lottieAnimationView, "greenTick");
        d.j(lottieAnimationView);
        A2().S.setText(A0(2132017539));
    }

    @Override // e7.b
    public void y2() {
        w6.d B2 = B2();
        w6.d dVar = w6.d.G;
        if (B2.compareTo(dVar) > 0 && Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.a(e2(), "android.permission.POST_NOTIFICATIONS") == 0) {
            t a10 = u.a();
            m.e(a10, "actionToImportantAlertScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
            return;
        }
        D2().I(dVar);
    }
}
