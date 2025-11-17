package com.apptionlabs.meater_app.qsg.ui.firmware;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.s;
import c6.h;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareUpdateFragment;
import com.apptionlabs.meater_app.qsg.ui.firmware.b;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.versions.VersionNode;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import f8.l0;
import g6.d;
import i6.c;
import kotlin.Metadata;
import rk.C0415g;
import rk.InterfaceC0413e;
import rk.InterfaceC0414f;
import wh.m;

/* compiled from: FirmwareUpdateFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/firmware/FirmwareUpdateFragment;", "Lcom/apptionlabs/meater_app/qsg/ui/firmware/a;", "Lih/u;", "O2", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "R2", "M2", "P2", "E2", "D2", "C2", "F2", "G2", "B2", "Lf7/f;", "v0", "Lf7/f;", "updateFactory", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class FirmwareUpdateFragment extends com.apptionlabs.meater_app.qsg.ui.firmware.a {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0414f updateFactory;

    /* compiled from: FirmwareUpdateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9784a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19360t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9784a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2() {
        if (!m.a(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: f7.j
            @Override // java.lang.Runnable
            public final void run() {
                FirmwareUpdateFragment.N2(FirmwareUpdateFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(FirmwareUpdateFragment firmwareUpdateFragment) {
        m.f(firmwareUpdateFragment, "this$0");
        if (firmwareUpdateFragment.K0()) {
            firmwareUpdateFragment.x2().f8423a0.setProgress(0);
            firmwareUpdateFragment.x2().f8430h0.setText(firmwareUpdateFragment.A0(2132017785));
            firmwareUpdateFragment.x2().f8429g0.setText(firmwareUpdateFragment.A0(2132017784));
            firmwareUpdateFragment.x2().S.setText(firmwareUpdateFragment.A0(2132018850));
            firmwareUpdateFragment.x2().f8434l0.setText(firmwareUpdateFragment.A0(2132017788));
            AppCompatTextView appCompatTextView = firmwareUpdateFragment.x2().f8434l0;
            m.e(appCompatTextView, "whyDoINeed");
            d.j(appCompatTextView);
            MaterialButton materialButton = firmwareUpdateFragment.x2().S;
            m.e(materialButton, "button");
            d.j(materialButton);
            LinearProgressIndicator linearProgressIndicator = firmwareUpdateFragment.x2().f8423a0;
            m.e(linearProgressIndicator, "progress");
            d.g(linearProgressIndicator);
            AppCompatTextView appCompatTextView2 = firmwareUpdateFragment.x2().f8433k0;
            m.e(appCompatTextView2, "textProgress");
            d.g(appCompatTextView2);
            firmwareUpdateFragment.x2().Q.setAnimation(firmwareUpdateFragment.z2().t().z());
            firmwareUpdateFragment.x2().Q.v();
        }
    }

    private final void O2() {
        x2().f8430h0.setText(A0(2132017791));
        x2().f8429g0.setText(A0(2132017790));
        s c22 = c2();
        m.d(c22, "null cannot be cast to non-null type com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareActivity");
        MEATERDevice o10 = h.f8879a.o(((FirmwareActivity) c22).getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
        x2().Q.setAnimation(z2().t().A());
        x2().Q.v();
        m.c(o10);
        R2(o10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(FirmwareUpdateFragment firmwareUpdateFragment, View view) {
        m.f(firmwareUpdateFragment, "this$0");
        MaterialButton materialButton = firmwareUpdateFragment.x2().S;
        m.e(materialButton, "button");
        d.i(materialButton);
        LinearProgressIndicator linearProgressIndicator = firmwareUpdateFragment.x2().f8423a0;
        m.e(linearProgressIndicator, "progress");
        d.j(linearProgressIndicator);
        AppCompatTextView appCompatTextView = firmwareUpdateFragment.x2().f8433k0;
        m.e(appCompatTextView, "textProgress");
        d.j(appCompatTextView);
        AppCompatTextView appCompatTextView2 = firmwareUpdateFragment.x2().f8434l0;
        m.e(appCompatTextView2, "whyDoINeed");
        d.i(appCompatTextView2);
        firmwareUpdateFragment.O2();
    }

    private final void R2(MEATERDevice mEATERDevice) {
        String str;
        String str2;
        if (mEATERDevice.getFirmwareRevision() == null) {
            return;
        }
        b bVar = new b();
        VersionNode firmwareForMEATERDevice = FirmwareVersion.sharedInstance().firmwareForMEATERDevice(mEATERDevice.getMEATERDeviceType());
        C0415g f10 = new C0415g().g(mEATERDevice).f(bVar);
        InterfaceC0414f interfaceC0414f = null;
        if (firmwareForMEATERDevice != null) {
            str = firmwareForMEATERDevice.url;
        } else {
            str = null;
        }
        C0415g i10 = f10.i(str);
        if (firmwareForMEATERDevice != null) {
            str2 = firmwareForMEATERDevice.crc;
        } else {
            str2 = null;
        }
        InterfaceC0414f a10 = i10.h(str2).a();
        this.updateFactory = a10;
        if (a10 == null) {
            m.t("updateFactory");
        } else {
            interfaceC0414f = a10;
        }
        interfaceC0414f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(FirmwareUpdateFragment firmwareUpdateFragment, View view) {
        m.f(firmwareUpdateFragment, "this$0");
        if (a.f9784a[firmwareUpdateFragment.y2().ordinal()] == 1) {
            l0.H(firmwareUpdateFragment.Y(), c.INSTANCE.d());
        } else {
            l0.H(firmwareUpdateFragment.Y(), c.INSTANCE.c());
        }
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void B2() {
        x2().f8424b0.setProgress(100);
        x2().f8425c0.setProgress(100);
        x2().f8426d0.setProgress(100);
        x2().f8427e0.setProgress(100);
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void C2() {
        x2().Q.setAnimation(z2().t().z());
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void D2() {
        if (y2() == w6.b.f19364x) {
            x2().f8429g0.setText(A0(2132017782));
        } else {
            x2().f8429g0.setText(A0(2132017787));
        }
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void E2() {
        x2().f8430h0.setText(A0(2132017789));
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void F2() {
        x2().S.setText(A0(2132018887));
        x2().S.setOnClickListener(new View.OnClickListener() { // from class: f7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirmwareUpdateFragment.Q2(FirmwareUpdateFragment.this, view);
            }
        });
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void G2() {
        AppCompatTextView appCompatTextView = x2().f8434l0;
        m.e(appCompatTextView, "whyDoINeed");
        d.i(appCompatTextView);
        x2().f8434l0.setPaintFlags(x2().f8434l0.getPaintFlags() | 8);
        x2().f8434l0.setOnClickListener(new View.OnClickListener() { // from class: f7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirmwareUpdateFragment.S2(FirmwareUpdateFragment.this, view);
            }
        });
    }

    /* compiled from: FirmwareUpdateFragment.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/firmware/FirmwareUpdateFragment$b", "Lf7/e;", "Lih/u;", "e", "a", "f", "", "progress", "b", "", "reason", "c", "d", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements InterfaceC0413e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(FirmwareUpdateFragment firmwareUpdateFragment, double d10) {
            m.f(firmwareUpdateFragment, "this$0");
            int i10 = (int) d10;
            firmwareUpdateFragment.x2().f8423a0.setProgress(i10);
            firmwareUpdateFragment.x2().f8433k0.setText(i10 + "%");
        }

        @Override // rk.InterfaceC0413e
        public void b(final double d10) {
            Handler handler = new Handler(Looper.getMainLooper());
            final FirmwareUpdateFragment firmwareUpdateFragment = FirmwareUpdateFragment.this;
            handler.post(new Runnable() { // from class: f7.k
                @Override // java.lang.Runnable
                public final void run() {
                    FirmwareUpdateFragment.b.h(FirmwareUpdateFragment.this, d10);
                }
            });
        }

        @Override // rk.InterfaceC0413e
        public void c(String str) {
            FirmwareUpdateFragment.this.M2();
        }

        @Override // rk.InterfaceC0413e
        public void d() {
            b.a a10 = com.apptionlabs.meater_app.qsg.ui.firmware.b.a(true);
            m.e(a10, "actionToFirmwareCompleteScreen(...)");
            androidx.navigation.fragment.a.a(FirmwareUpdateFragment.this).S(a10);
            FirmwareUpdateFragment.this.P2();
        }

        @Override // rk.InterfaceC0413e
        public void a() {
        }

        @Override // rk.InterfaceC0413e
        public void e() {
        }

        @Override // rk.InterfaceC0413e
        public void f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2() {
    }
}
