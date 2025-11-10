package com.apptionlabs.meater_app.qsg.ui.pairing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import c6.h;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareActivity;
import com.apptionlabs.meater_app.qsg.ui.pairing.DevicePairingCompleteFragment;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.WifiSetupHostActivity;
import com.google.android.material.button.MaterialButton;
import g6.d;
import ih.h;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import t5.g;
import t5.j;
import wh.d0;
import wh.h0;
import wh.m;
import wh.o;

/* compiled from: DevicePairingCompleteFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/pairing/DevicePairingCompleteFragment;", "Le7/b;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Lih/u;", "U2", "Q2", "y2", "I2", "H2", "G2", "L2", "M2", "y1", "x1", "F2", "", "v0", "Z", "T2", "()Z", "setScreenIsVisible", "(Z)V", "screenIsVisible", "Li7/c;", "w0", "Lh3/h;", "S2", "()Li7/c;", "args", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class DevicePairingCompleteFragment extends e7.b {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private boolean screenIsVisible;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final h args = new h(d0.b(i7.c.class), new c(this));

    /* compiled from: DevicePairingCompleteFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9847a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19359s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.b.f19360t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.b.f19361u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.b.f19362v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w6.b.f19364x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w6.b.f19363w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w6.b.f19365y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9847a = iArr;
        }
    }

    /* compiled from: DevicePairingCompleteFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/pairing/DevicePairingCompleteFragment$b", "Lc6/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements h.a {
        b() {
        }

        @Override // c6.h.a
        public void a(MEATERDevice mEATERDevice) {
            m.f(mEATERDevice, "device");
            if (!DevicePairingCompleteFragment.this.getScreenIsVisible()) {
                return;
            }
            if (mEATERDevice.isMEATERBlock()) {
                if (mEATERDevice.getBleConnection() instanceof g) {
                    j bleConnection = mEATERDevice.getBleConnection();
                    m.d(bleConnection, "null cannot be cast to non-null type com.apptionlabs.meater_app.ble.BlockKeepAliveBLEConnection");
                    if (((g) bleConnection).l0() != null) {
                        ProgressBar progressBar = DevicePairingCompleteFragment.this.A2().Z;
                        m.e(progressBar, "loading");
                        d.g(progressBar);
                        MaterialButton materialButton = DevicePairingCompleteFragment.this.A2().S;
                        m.e(materialButton, "button");
                        d.j(materialButton);
                        return;
                    }
                    return;
                }
                if (mEATERDevice.getFirmwareRevision() != null) {
                    ProgressBar progressBar2 = DevicePairingCompleteFragment.this.A2().Z;
                    m.e(progressBar2, "loading");
                    d.g(progressBar2);
                    MaterialButton materialButton2 = DevicePairingCompleteFragment.this.A2().S;
                    m.e(materialButton2, "button");
                    d.j(materialButton2);
                    return;
                }
                return;
            }
            if (mEATERDevice.isMEATERPlus()) {
                if (mEATERDevice.getFirmwareRevision() != null) {
                    ProgressBar progressBar3 = DevicePairingCompleteFragment.this.A2().Z;
                    m.e(progressBar3, "loading");
                    d.g(progressBar3);
                    MaterialButton materialButton3 = DevicePairingCompleteFragment.this.A2().S;
                    m.e(materialButton3, "button");
                    d.j(materialButton3);
                    return;
                }
                return;
            }
            ProgressBar progressBar4 = DevicePairingCompleteFragment.this.A2().Z;
            m.e(progressBar4, "loading");
            d.g(progressBar4);
            MaterialButton materialButton4 = DevicePairingCompleteFragment.this.A2().S;
            m.e(materialButton4, "button");
            d.j(materialButton4);
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh3/g;", "Args", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<Bundle> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9849q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f9849q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle W = this.f9849q.W();
            if (W != null) {
                return W;
            }
            throw new IllegalStateException("Fragment " + this.f9849q + " has null arguments");
        }
    }

    private final void Q2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: i7.b
            @Override // java.lang.Runnable
            public final void run() {
                DevicePairingCompleteFragment.R2(DevicePairingCompleteFragment.this);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(DevicePairingCompleteFragment devicePairingCompleteFragment) {
        m.f(devicePairingCompleteFragment, "this$0");
        if (devicePairingCompleteFragment.screenIsVisible) {
            ProgressBar progressBar = devicePairingCompleteFragment.A2().Z;
            m.e(progressBar, "loading");
            d.g(progressBar);
            MaterialButton materialButton = devicePairingCompleteFragment.A2().S;
            m.e(materialButton, "button");
            d.j(materialButton);
        }
    }

    private final void U2(MEATERDevice mEATERDevice) {
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        d.g(materialButton);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        d.j(progressBar);
        c6.h.f8879a.A(this, mEATERDevice.getDeviceID(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(DevicePairingCompleteFragment devicePairingCompleteFragment, View view) {
        m.f(devicePairingCompleteFragment, "this$0");
        long a10 = devicePairingCompleteFragment.S2().a();
        MEATERDevice o10 = c6.h.f8879a.o(a10);
        if (o10 == null) {
            Intent intent = new Intent(devicePairingCompleteFragment.c2(), (Class<?>) FirmwareActivity.class);
            s S = devicePairingCompleteFragment.S();
            if (S != null) {
                S.overridePendingTransition(2130772027, 2130772025);
            }
            s S2 = devicePairingCompleteFragment.S();
            if (S2 != null) {
                S2.startActivity(intent);
            }
            s S3 = devicePairingCompleteFragment.S();
            if (S3 != null) {
                S3.finish();
                return;
            }
            return;
        }
        k6.b.a("**** ID %s mustUpdate? = %s  firmware %s isPaired %s ,online %s", o10.shortDeviceIDString(), Boolean.valueOf(o10.mustFirmwareUpdate()), o10.getFirmwareRevision(), Boolean.valueOf(o10.isPaired()), Boolean.valueOf(o10.isOnline()));
        if (o10.isMEATERBlock()) {
            Log.debug("WIFI_DEBUG", " isInWiFiSetupMode = " + o10.isInWiFiSetupMode());
            if (o10.isInWiFiSetupMode()) {
                Intent intent2 = new Intent(devicePairingCompleteFragment.c2(), (Class<?>) WifiSetupHostActivity.class);
                intent2.putExtra(MEATERIntent.EXTRA_DEVICE_ID, a10);
                intent2.putExtra(MEATERIntent.FROM_QSG, true);
                s S4 = devicePairingCompleteFragment.S();
                if (S4 != null) {
                    S4.startActivity(intent2);
                }
                s S5 = devicePairingCompleteFragment.S();
                if (S5 != null) {
                    S5.finish();
                    return;
                }
                return;
            }
            Intent intent3 = new Intent(devicePairingCompleteFragment.c2(), (Class<?>) FirmwareActivity.class);
            if (o10.isPaired() && o10.isOnline()) {
                if (o10.mustFirmwareUpdate()) {
                    intent3.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_FIRMWARE_UPDATE);
                    intent3.putExtra(MEATERIntent.EXTRA_DEVICE_ID, a10);
                } else {
                    intent3.putExtra(MEATERIntent.QSG_SHOW_LOW_BATTERY, o10.hasLowBattery());
                }
                Log.debug("WIFI_DEBUG", " it.mustFirmwareUpdate()  = " + o10.mustFirmwareUpdate());
            }
            s S6 = devicePairingCompleteFragment.S();
            if (S6 != null) {
                S6.startActivity(intent3);
            }
            s S7 = devicePairingCompleteFragment.S();
            if (S7 != null) {
                S7.finish();
                return;
            }
            return;
        }
        if (o10.isMEATERPlus()) {
            Intent intent4 = new Intent(devicePairingCompleteFragment.c2(), (Class<?>) FirmwareActivity.class);
            intent4.putExtra(MEATERIntent.QSG_SHOW_LOW_BATTERY, o10.hasLowBattery());
            if (o10.isPaired() && o10.isOnline() && o10.mustFirmwareUpdate()) {
                intent4.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_FIRMWARE_UPDATE);
                intent4.putExtra(MEATERIntent.EXTRA_DEVICE_ID, a10);
            }
            s S8 = devicePairingCompleteFragment.S();
            if (S8 != null) {
                S8.startActivity(intent4);
            }
            s S9 = devicePairingCompleteFragment.S();
            if (S9 != null) {
                S9.finish();
                return;
            }
            return;
        }
        if (o10.isMEATERProbe()) {
            Intent intent5 = new Intent(devicePairingCompleteFragment.c2(), (Class<?>) FirmwareActivity.class);
            s S10 = devicePairingCompleteFragment.S();
            if (S10 != null) {
                S10.overridePendingTransition(2130772027, 2130772025);
            }
            s S11 = devicePairingCompleteFragment.S();
            if (S11 != null) {
                S11.startActivity(intent5);
            }
            s S12 = devicePairingCompleteFragment.S();
            if (S12 != null) {
                S12.finish();
            }
        }
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
        A2().f8508f0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        switch (a.f9847a[C2().ordinal()]) {
            case 1:
                A2().Q.setImageResource(2131231300);
                return;
            case 2:
                A2().Q.setAnimation(2131951727);
                return;
            case 3:
                A2().Q.setAnimation(2131951728);
                return;
            case 4:
                A2().Q.setAnimation(2131951729);
                return;
            case 5:
            case 6:
            case 7:
                A2().Q.setImageResource(2131231299);
                return;
            default:
                return;
        }
    }

    @Override // e7.b
    public void H2() {
        TextView textView = A2().f8512j0;
        m.e(textView, "screenSubTitle");
        d.i(textView);
        A2().Y.setAnimation(2131951716);
        LottieAnimationView lottieAnimationView = A2().Y;
        m.e(lottieAnimationView, "greenTick");
        d.j(lottieAnimationView);
        MEATERDevice o10 = c6.h.f8879a.o(S2().a());
        if (o10 != null) {
            U2(o10);
            Q2();
            return;
        }
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        d.g(progressBar);
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        d.j(materialButton);
    }

    @Override // e7.b
    public void I2() {
        if (a.f9847a[C2().ordinal()] == 1) {
            AppCompatTextView appCompatTextView = A2().f8513k0;
            h0 h0Var = h0.a;
            Locale locale = Locale.US;
            String A0 = A0(2132018378);
            m.e(A0, "getString(...)");
            String format = String.format(locale, A0, Arrays.copyOf(new Object[]{A0(2132018143)}, 1));
            m.e(format, "format(locale, format, *args)");
            appCompatTextView.setText(format);
            return;
        }
        A2().f8513k0.setText(z2(2132018378));
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: i7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevicePairingCompleteFragment.V2(DevicePairingCompleteFragment.this, view);
            }
        });
    }

    public final i7.c S2() {
        return (i7.c) this.args.getValue();
    }

    /* renamed from: T2, reason: from getter */
    public final boolean getScreenIsVisible() {
        return this.screenIsVisible;
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        this.screenIsVisible = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        this.screenIsVisible = false;
    }

    @Override // e7.b
    public void y2() {
        D2().I(w6.d.L);
    }

    @Override // e7.b
    public void M2() {
    }
}
