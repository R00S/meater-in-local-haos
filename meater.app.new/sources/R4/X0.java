package R4;

import B4.l;
import M4.h;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import z4.C5177g;
import z4.C5181k;

/* compiled from: UnPairProbesBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"LR4/X0;", "Lcom/google/android/material/bottomsheet/b;", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "block", "<init>", "(Lcom/apptionlabs/meater_app/model/MEATERBlock;)V", "Loa/F;", "c3", "()V", "LB4/l$c;", "resetType", "a3", "(Lcom/apptionlabs/meater_app/model/MEATERBlock;LB4/l$c;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "x1", "y1", "X0", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "getBlock", "()Lcom/apptionlabs/meater_app/model/MEATERBlock;", "setBlock", "", "Y0", "Z", "X2", "()Z", "b3", "(Z)V", "hasDisconnected", "Landroid/os/CountDownTimer;", "Z0", "Landroid/os/CountDownTimer;", "blockOTAStartTimer", "Landroid/widget/ProgressBar;", "a1", "Landroid/widget/ProgressBar;", "loading", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "b1", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "progressBars", "Landroid/widget/TextView;", "c1", "Landroid/widget/TextView;", "startButton", "d1", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class X0 extends com.google.android.material.bottomsheet.b {

    /* renamed from: d1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e1, reason: collision with root package name */
    public static final int f14909e1 = 8;

    /* renamed from: f1, reason: collision with root package name */
    private static boolean f14910f1;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private MEATERBlock block;

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    private boolean hasDisconnected;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private CountDownTimer blockOTAStartTimer;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private ProgressBar loading;

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    private LinearProgressIndicator progressBars;

    /* renamed from: c1, reason: collision with root package name and from kotlin metadata */
    private TextView startButton;

    /* compiled from: UnPairProbesBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LR4/X0$a;", "", "<init>", "()V", "", "pairingScreenStarted", "Z", "a", "()Z", "b", "(Z)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.X0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final boolean a() {
            return X0.f14910f1;
        }

        public final void b(boolean z10) {
            X0.f14910f1 = z10;
        }

        private Companion() {
        }
    }

    /* compiled from: UnPairProbesBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R4/X0$b", "LM4/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h.a {
        b() {
        }

        @Override // M4.h.a
        public void a(MEATERDevice device) {
            C3862t.g(device, "device");
            MEATERBlock mEATERBlock = (MEATERBlock) device;
            if (mEATERBlock.getBleConnection() == null) {
                U4.b.a("Pair_probe_screen bluetooth disconnected ", new Object[0]);
                return;
            }
            C5181k bleConnection = mEATERBlock.getBleConnection();
            C3862t.e(bleConnection, "null cannot be cast to non-null type com.apptionlabs.meater_app.ble.BlockKeepAliveBLEConnection");
            C5177g c5177g = (C5177g) bleConnection;
            U4.b.a("Pair_probe_screen hasDisconnected =%s ,secondaryConnectionState =  %s , currentMode = %s", Boolean.valueOf(X0.this.getHasDisconnected()), mEATERBlock.getSecondaryConnectionState(), c5177g.n0());
            DeviceConnectionState secondaryConnectionState = mEATERBlock.getSecondaryConnectionState();
            DeviceConnectionState deviceConnectionState = DeviceConnectionState.OFFLINE;
            if (secondaryConnectionState == deviceConnectionState) {
                X0.this.b3(true);
            } else if (mEATERBlock.getSecondaryConnectionState() == deviceConnectionState && X0.this.getHasDisconnected() && c5177g.n0() == l.e.eBlockStatusModeWifiClient) {
                X0.this.A2();
            }
        }
    }

    public X0(MEATERBlock block) {
        C3862t.g(block, "block");
        this.block = block;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(X0 x02, View view) {
        Intent intent = new Intent(x02.c2(), (Class<?>) WebViewActivity.class);
        intent.putExtra("url", "https://support.meater.com/faqs/duo-probe-pairing");
        x02.t2(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(X0 x02, View view) {
        x02.a3(x02.block, l.c.MEATERBlockResetTypeUnpairProbes);
    }

    private final void a3(MEATERBlock block, l.c resetType) {
        if (block == null || !(block.getBleConnection() instanceof C5177g)) {
            return;
        }
        U4.b.a("Pair_probe_screen MEATERBlockResetTypeUnpairProbes sent ", new Object[0]);
        C5181k bleConnection = block.getBleConnection();
        C3862t.e(bleConnection, "null cannot be cast to non-null type com.apptionlabs.meater_app.ble.BlockKeepAliveBLEConnection");
        ((C5177g) bleConnection).u0(resetType);
        c3();
    }

    private final void c3() {
        TextView textView = this.startButton;
        LinearProgressIndicator linearProgressIndicator = null;
        if (textView == null) {
            C3862t.u("startButton");
            textView = null;
        }
        textView.setVisibility(4);
        ProgressBar progressBar = this.loading;
        if (progressBar == null) {
            C3862t.u("loading");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        LinearProgressIndicator linearProgressIndicator2 = this.progressBars;
        if (linearProgressIndicator2 == null) {
            C3862t.u("progressBars");
        } else {
            linearProgressIndicator = linearProgressIndicator2;
        }
        linearProgressIndicator.setProgress(100);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.W0
            @Override // java.lang.Runnable
            public final void run() {
                X0.d3(this.f14907B);
            }
        }, Config.MC_STATS_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(X0 x02) {
        if (x02.K0()) {
            x02.a3(x02.block, l.c.MEATERBlockResetTypeReboot);
            x02.A2();
        }
    }

    /* renamed from: X2, reason: from getter */
    public final boolean getHasDisconnected() {
        return this.hasDisconnected;
    }

    public final void b3(boolean z10) {
        this.hasDisconnected = z10;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        f14910f1 = true;
        View viewInflate = inflater.inflate(R.layout.unpair_probes_screen, container, false);
        this.loading = (ProgressBar) viewInflate.findViewById(R.id.loading);
        this.progressBars = (LinearProgressIndicator) viewInflate.findViewById(R.id.progress1);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(R.id.animationView);
        String strB0 = B0(R.string.probe_pairing_body, A0(R.string.start_pairing));
        C3862t.f(strB0, "getString(...)");
        ((AppCompatTextView) viewInflate.findViewById(R.id.screenSubTitle)).setText(strB0);
        lottieAnimationView.setAnimation(R.raw.pro_duo_pairing_mode);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R.id.whyDoINeed);
        appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() | 8);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: R4.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                X0.Y2(this.f14890B, view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(R.id.button);
        this.startButton = textView;
        if (textView == null) {
            C3862t.u("startButton");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: R4.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                X0.Z2(this.f14892B, view);
            }
        });
        M4.h.f11978a.A(this, this.block.getDeviceID(), new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        Object parent = f2().getParent();
        C3862t.e(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0((View) parent);
        C3862t.f(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.W0(3);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        CountDownTimer countDownTimer = this.blockOTAStartTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        f14910f1 = false;
    }
}
