package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import g6.d;
import ih.h;
import k7.e;
import kotlin.Metadata;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: NetworkConnectingFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/NetworkConnectingFragment;", "Le7/b;", "Lih/u;", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "Lk7/e;", "v0", "Lh3/h;", "getArgs", "()Lk7/e;", "args", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class NetworkConnectingFragment extends e7.b {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final h args = new h(d0.b(e.class), new a(this));

    /* compiled from: FragmentNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh3/g;", "Args", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a extends o implements vh.a<Bundle> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9881q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f9881q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle W = this.f9881q.W();
            if (W != null) {
                return W;
            }
            throw new IllegalStateException("Fragment " + this.f9881q + " has null arguments");
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
        LottieAnimationView lottieAnimationView = A2().Q;
        WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) S();
        m.c(wifiSetupHostActivity);
        lottieAnimationView.setAnimation(wifiSetupHostActivity.w2());
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(A0(2132017790));
    }

    @Override // e7.b
    public void I2() {
        A2().f8513k0.setText(A0(2132017494));
    }

    @Override // e7.b
    public void L2() {
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        d.g(materialButton);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        d.j(progressBar);
    }

    @Override // e7.b
    public void M2() {
    }

    @Override // e7.b
    public void y2() {
    }
}
