package com.apptionlabs.meater_app.qsg.ui.firmware;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.s;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.qsg.ui.firmware.ContinuousChargingFragment;
import g6.d;
import kotlin.Metadata;
import wh.m;

/* compiled from: ContinuousChargingFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/firmware/ContinuousChargingFragment;", "Lcom/apptionlabs/meater_app/qsg/ui/firmware/a;", "Lih/u;", "E2", "D2", "C2", "F2", "G2", "B2", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ContinuousChargingFragment extends a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(ContinuousChargingFragment continuousChargingFragment, View view) {
        m.f(continuousChargingFragment, "this$0");
        Intent intent = new Intent(continuousChargingFragment.c2(), (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_SETUP_COMPLETE);
        s S = continuousChargingFragment.S();
        if (S != null) {
            S.startActivity(intent);
        }
        s S2 = continuousChargingFragment.S();
        if (S2 != null) {
            S2.finish();
        }
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void B2() {
        LinearLayoutCompat linearLayoutCompat = x2().f8428f0;
        m.e(linearLayoutCompat, "progressHolder");
        d.g(linearLayoutCompat);
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void C2() {
        x2().Q.setAnimation(y2().v());
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void D2() {
        if (y2() == w6.b.f19364x) {
            x2().f8429g0.setText(A0(2132017540));
        } else {
            x2().f8429g0.setText(A0(2132017541));
        }
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void E2() {
        x2().f8430h0.setText(A0(2132017542));
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void F2() {
        x2().S.setText(A0(2132017539));
        x2().S.setOnClickListener(new View.OnClickListener() { // from class: f7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContinuousChargingFragment.I2(ContinuousChargingFragment.this, view);
            }
        });
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void G2() {
    }
}
