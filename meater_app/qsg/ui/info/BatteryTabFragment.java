package com.apptionlabs.meater_app.qsg.ui.info;

import android.view.View;
import com.apptionlabs.meater_app.qsg.ui.info.BatteryTabFragment;
import e7.b;
import ih.t;
import kotlin.Metadata;
import rk.C0419b;
import w6.d;
import wh.m;

/* compiled from: BatteryTabFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/BatteryTabFragment;", "Le7/b;", "", "shouldSkipProgress", "Lih/u;", "O2", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class BatteryTabFragment extends b {
    private final void O2(boolean z10) {
        d B2 = B2();
        if (!z10) {
            d dVar = d.f19380z;
            if (B2.compareTo(dVar) <= 0) {
                D2().I(dVar);
                return;
            }
        }
        t a10 = C0419b.a();
        m.e(a10, "actionToQsgChargeScreen(...)");
        androidx.navigation.fragment.a.a(this).S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(BatteryTabFragment batteryTabFragment, View view) {
        m.f(batteryTabFragment, "this$0");
        batteryTabFragment.O2(true);
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(D2().t().s());
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(A0(2132017271));
    }

    @Override // e7.b
    public void I2() {
        A2().f8513k0.setText(A0(2132017272));
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BatteryTabFragment.P2(BatteryTabFragment.this, view);
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
