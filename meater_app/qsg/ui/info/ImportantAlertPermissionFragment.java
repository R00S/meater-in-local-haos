package com.apptionlabs.meater_app.qsg.ui.info;

import android.app.NotificationManager;
import android.content.Intent;
import android.view.View;
import android.view.result.a;
import android.view.result.c;
import android.widget.TextView;
import androidx.fragment.app.s;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.qsg.ui.info.ImportantAlertPermissionFragment;
import com.google.android.material.button.MaterialButton;
import e.d;
import e7.b;
import f8.l0;
import ih.t;
import java.util.Iterator;
import kotlin.Metadata;
import rk.C0428k;
import wh.m;

/* compiled from: ImportantAlertPermissionFragment.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R$\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/ImportantAlertPermissionFragment;", "Le7/b;", "Lih/u;", "T2", "", "S2", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "Landroidx/activity/result/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "v0", "Landroidx/activity/result/c;", "softPermissionLauncher", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ImportantAlertPermissionFragment extends b {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private c<Intent> softPermissionLauncher;

    public ImportantAlertPermissionFragment() {
        c<Intent> a22 = a2(new d(), new android.view.result.b() { // from class: g7.o
            @Override // android.view.result.b
            public final void a(Object obj) {
                ImportantAlertPermissionFragment.U2(ImportantAlertPermissionFragment.this, (a) obj);
            }
        });
        m.e(a22, "registerForActivityResult(...)");
        this.softPermissionLauncher = a22;
    }

    private final boolean S2() {
        Iterator<MEATERDevice> it = LocalStorage.sharedStorage().deviceDAO().a().iterator();
        while (it.hasNext()) {
            if (it.next().isPaired()) {
                return true;
            }
        }
        return false;
    }

    private final void T2() {
        boolean z10;
        boolean S2 = S2();
        if (B2().compareTo(w6.d.N) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (S2 && z10) {
            Intent intent = new Intent(c2(), (Class<?>) QSGActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_SETUP_COMPLETE);
            s S = S();
            if (S != null) {
                S.startActivity(intent);
            }
            s S3 = S();
            if (S3 != null) {
                S3.finish();
                return;
            }
            return;
        }
        t a10 = C0428k.a();
        m.e(a10, "actionToPairingScreen(...)");
        androidx.navigation.fragment.a.a(this).S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(ImportantAlertPermissionFragment importantAlertPermissionFragment, android.view.result.a aVar) {
        m.f(importantAlertPermissionFragment, "this$0");
        importantAlertPermissionFragment.L2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(ImportantAlertPermissionFragment importantAlertPermissionFragment, View view) {
        m.f(importantAlertPermissionFragment, "this$0");
        importantAlertPermissionFragment.softPermissionLauncher.a(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(ImportantAlertPermissionFragment importantAlertPermissionFragment, View view) {
        m.f(importantAlertPermissionFragment, "this$0");
        importantAlertPermissionFragment.T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(ImportantAlertPermissionFragment importantAlertPermissionFragment, View view) {
        m.f(importantAlertPermissionFragment, "this$0");
        importantAlertPermissionFragment.T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(ImportantAlertPermissionFragment importantAlertPermissionFragment, View view) {
        m.f(importantAlertPermissionFragment, "this$0");
        l0.H(importantAlertPermissionFragment.Y(), i6.c.INSTANCE.k());
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(D2().t().B());
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(A0(2132017921));
    }

    @Override // e7.b
    public void I2() {
        A2().f8513k0.setText(A0(2132017924));
    }

    @Override // e7.b
    public void L2() {
        Object systemService = com.apptionlabs.meater_app.app.a.i().getSystemService("notification");
        m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        if (!((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
            A2().S.setText(A0(2132018628));
            A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImportantAlertPermissionFragment.V2(ImportantAlertPermissionFragment.this, view);
                }
            });
            MaterialButton materialButton = A2().U;
            m.e(materialButton, "buttonSkip");
            g6.d.j(materialButton);
            A2().U.setText(A0(2132018727));
            A2().U.setOnClickListener(new View.OnClickListener() { // from class: g7.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImportantAlertPermissionFragment.W2(ImportantAlertPermissionFragment.this, view);
                }
            });
            return;
        }
        TextView textView = A2().f8512j0;
        m.e(textView, "screenSubTitle");
        g6.d.i(textView);
        A2().Y.setAnimation(2131951716);
        LottieAnimationView lottieAnimationView = A2().Y;
        m.e(lottieAnimationView, "greenTick");
        g6.d.j(lottieAnimationView);
        A2().S.setText(A0(2132017539));
        com.apptionlabs.meater_app.app.a.u().J0(l0.y());
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImportantAlertPermissionFragment.X2(ImportantAlertPermissionFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void M2() {
        A2().f8516n0.setText(A0(2132017572));
        A2().f8516n0.setVisibility(0);
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: g7.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImportantAlertPermissionFragment.Y2(ImportantAlertPermissionFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void y2() {
        w6.d B2 = B2();
        w6.d dVar = w6.d.H;
        if (B2.compareTo(dVar) > 0) {
            T2();
        } else {
            D2().I(dVar);
        }
    }
}
