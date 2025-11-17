package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareActivity;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.WifiSetUpCompleteFragment;
import f8.l0;
import g6.d;
import ih.h;
import k7.e;
import kotlin.Metadata;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: WifiSetUpCompleteFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpCompleteFragment;", "Le7/b;", "Lih/u;", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "Lk7/e;", "v0", "Lh3/h;", "P2", "()Lk7/e;", "args", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class WifiSetUpCompleteFragment extends e7.b {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final h args = new h(d0.b(e.class), new a(this));

    /* compiled from: FragmentNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh3/g;", "Args", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a extends o implements vh.a<Bundle> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9883q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f9883q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle W = this.f9883q.W();
            if (W != null) {
                return W;
            }
            throw new IllegalStateException("Fragment " + this.f9883q + " has null arguments");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(boolean z10, WifiSetUpCompleteFragment wifiSetUpCompleteFragment, View view) {
        m.f(wifiSetUpCompleteFragment, "this$0");
        if (!z10) {
            s S = wifiSetUpCompleteFragment.S();
            if (S != null) {
                S.finish();
                return;
            }
            return;
        }
        if (wifiSetUpCompleteFragment.P2().b()) {
            Intent intent = new Intent(wifiSetUpCompleteFragment.c2(), (Class<?>) FirmwareActivity.class);
            MEATERDevice o10 = c6.h.f8879a.o(wifiSetUpCompleteFragment.P2().a());
            m.d(o10, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.MEATERBlock");
            MEATERBlock mEATERBlock = (MEATERBlock) o10;
            if (mEATERBlock.isPaired() && mEATERBlock.isOnline() && mEATERBlock.needsFirmwareUpdate()) {
                intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_FIRMWARE_UPDATE);
                intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, wifiSetUpCompleteFragment.P2().a());
            }
            s S2 = wifiSetUpCompleteFragment.S();
            if (S2 != null) {
                S2.overridePendingTransition(2130772027, 2130772025);
            }
            s S3 = wifiSetUpCompleteFragment.S();
            if (S3 != null) {
                S3.startActivity(intent);
            }
            s S4 = wifiSetUpCompleteFragment.S();
            if (S4 != null) {
                S4.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(WifiSetUpCompleteFragment wifiSetUpCompleteFragment, View view) {
        m.f(wifiSetUpCompleteFragment, "this$0");
        l0.H(wifiSetUpCompleteFragment.Y(), i6.c.INSTANCE.j());
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
        A2().f8508f0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        if (P2().b()) {
            A2().Q.setImageResource(2131231351);
        } else {
            A2().Q.setImageResource(2131231350);
        }
    }

    @Override // e7.b
    public void H2() {
        if (P2().b()) {
            TextView textView = A2().f8512j0;
            m.e(textView, "screenSubTitle");
            d.i(textView);
            A2().Y.setAnimation(2131951716);
            LottieAnimationView lottieAnimationView = A2().Y;
            m.e(lottieAnimationView, "greenTick");
            d.j(lottieAnimationView);
            return;
        }
        A2().f8512j0.setText(A0(2132018041));
    }

    @Override // e7.b
    public void I2() {
        if (P2().b()) {
            A2().f8513k0.setText(A0(2132017500));
        } else {
            A2().f8513k0.setText(A0(2132017525));
        }
    }

    @Override // e7.b
    public void L2() {
        c2().getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        final boolean booleanExtra = c2().getIntent().getBooleanExtra(MEATERIntent.FROM_QSG, false);
        if (booleanExtra) {
            if (P2().b()) {
                A2().S.setText(A0(2132017539));
            } else {
                A2().S.setText(A0(2132018850));
            }
        } else {
            A2().S.setText(A0(2132017847));
        }
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: k7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetUpCompleteFragment.Q2(booleanExtra, this, view);
            }
        });
    }

    @Override // e7.b
    public void M2() {
        if (P2().b()) {
            AppCompatTextView appCompatTextView = A2().f8516n0;
            m.e(appCompatTextView, "whyDoINeed");
            d.g(appCompatTextView);
        } else {
            A2().f8516n0.setText(2132017526);
            AppCompatTextView appCompatTextView2 = A2().f8516n0;
            m.e(appCompatTextView2, "whyDoINeed");
            d.j(appCompatTextView2);
            A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: k7.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WifiSetUpCompleteFragment.R2(WifiSetUpCompleteFragment.this, view);
                }
            });
        }
    }

    public final e P2() {
        return (e) this.args.getValue();
    }

    @Override // e7.b
    public void y2() {
    }
}
