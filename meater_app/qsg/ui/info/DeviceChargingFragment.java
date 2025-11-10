package com.apptionlabs.meater_app.qsg.ui.info;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.apptionlabs.meater_app.qsg.ui.info.DeviceChargingFragment;
import e7.b;
import ih.t;
import kotlin.Metadata;
import rk.C0421d;
import rk.C0428k;
import w6.d;
import wh.m;

/* compiled from: DeviceChargingFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/DeviceChargingFragment;", "Le7/b;", "", "shouldSkipProgress", "Lih/u;", "O2", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class DeviceChargingFragment extends b {

    /* compiled from: DeviceChargingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9795a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19364x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9795a = iArr;
        }
    }

    private final void O2(boolean z10) {
        d B2 = B2();
        if (!z10) {
            d dVar = d.C;
            if (B2.compareTo(dVar) <= 0) {
                D2().I(dVar);
                return;
            }
        }
        ih.a aVar = ih.a.f268a;
        Context e22 = e2();
        m.e(e22, "requireContext(...)");
        if (!aVar.d(e22)) {
            t c10 = C0421d.c();
            m.e(c10, "actionToPermissionsScreen(...)");
            androidx.navigation.fragment.a.a(this).S(c10);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.a(e2(), "android.permission.POST_NOTIFICATIONS") != 0) {
            t b10 = C0421d.b();
            m.e(b10, "actionToNotificationPermissionFragment(...)");
            androidx.navigation.fragment.a.a(this).S(b10);
            return;
        }
        Object systemService = com.apptionlabs.meater_app.app.a.i().getSystemService("notification");
        m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        if (!((NotificationManager) systemService).isNotificationPolicyAccessGranted() && B2.compareTo(d.J) < 0) {
            t a10 = C0421d.a();
            m.e(a10, "actionToImportantAlertPermissionFragment(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
        } else {
            t a11 = C0428k.a();
            m.e(a11, "actionToPairingScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(DeviceChargingFragment deviceChargingFragment, View view) {
        m.f(deviceChargingFragment, "this$0");
        deviceChargingFragment.O2(true);
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(D2().t().w());
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(D2().t().x());
    }

    @Override // e7.b
    public void I2() {
        if (a.f9795a[C2().ordinal()] == 1) {
            A2().f8513k0.setText(A0(2132017542));
        } else {
            A2().f8513k0.setText(A0(2132017542));
        }
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceChargingFragment.P2(DeviceChargingFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void y2() {
        O2(false);
    }

    @Override // e7.b
    public void M2() {
    }
}
