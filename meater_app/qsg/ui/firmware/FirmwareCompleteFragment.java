package com.apptionlabs.meater_app.qsg.ui.firmware;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareCompleteFragment;
import g6.d;
import ih.h;
import ih.t;
import kotlin.Metadata;
import rk.C0411c;
import rk.C0412d;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: FirmwareCompleteFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/firmware/FirmwareCompleteFragment;", "Lcom/apptionlabs/meater_app/qsg/ui/firmware/a;", "Lih/u;", "E2", "D2", "C2", "F2", "G2", "B2", "Lf7/c;", "v0", "Lh3/h;", "getArgs", "()Lf7/c;", "args", "Lcom/apptionlabs/meater_app/qsg/ui/firmware/FirmwareCompleteFragment$a;", "w0", "Lcom/apptionlabs/meater_app/qsg/ui/firmware/FirmwareCompleteFragment$a;", "screenState", "<init>", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class FirmwareCompleteFragment extends com.apptionlabs.meater_app.qsg.ui.firmware.a {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final h args = new h(d0.b(C0411c.class), new c(this));

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private a screenState = a.f9777q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FirmwareCompleteFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/firmware/FirmwareCompleteFragment$a;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a {

        /* renamed from: q, reason: collision with root package name */
        public static final a f9777q = new a("SUCCESS", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final a f9778r = new a("FAILED", 1);

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ a[] f9779s;

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ ph.a f9780t;

        static {
            a[] g10 = g();
            f9779s = g10;
            f9780t = ph.b.a(g10);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] g() {
            return new a[]{f9777q, f9778r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9779s.clone();
        }
    }

    /* compiled from: FirmwareCompleteFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9781a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19360t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.b.f19362v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.b.f19361u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.b.f19364x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9781a = iArr;
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh3/g;", "Args", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<Bundle> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9782q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f9782q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle W = this.f9782q.W();
            if (W != null) {
                return W;
            }
            throw new IllegalStateException("Fragment " + this.f9782q + " has null arguments");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(FirmwareCompleteFragment firmwareCompleteFragment, View view) {
        m.f(firmwareCompleteFragment, "this$0");
        t a10 = C0412d.a();
        m.e(a10, "actionToContinuousChargingScreen(...)");
        androidx.navigation.fragment.a.a(firmwareCompleteFragment).S(a10);
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
        if (this.screenState == a.f9777q) {
            int i10 = b.f9781a[y2().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        x2().Q.setImageResource(2131231521);
                        return;
                    }
                    x2().Q.setAnimation(2131951710);
                    return;
                }
                x2().Q.setAnimation(2131951711);
                return;
            }
            x2().Q.setAnimation(2131951709);
            return;
        }
        int i11 = b.f9781a[y2().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    x2().Q.setImageResource(2131231518);
                    return;
                }
                x2().Q.setImageResource(2131231520);
                return;
            }
            x2().Q.setAnimation(2131951704);
            return;
        }
        x2().Q.setImageResource(2131231519);
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void D2() {
        if (this.screenState == a.f9777q) {
            TextView textView = x2().f8429g0;
            m.e(textView, "screenSubTitle");
            d.g(textView);
            x2().W.setAnimation(2131951716);
            LottieAnimationView lottieAnimationView = x2().W;
            m.e(lottieAnimationView, "greenTick");
            d.j(lottieAnimationView);
            return;
        }
        if (y2() == w6.b.f19364x) {
            x2().f8429g0.setText(A0(2132017783));
        } else {
            x2().f8429g0.setText(A0(2132017784));
        }
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void E2() {
        if (this.screenState == a.f9777q) {
            x2().f8430h0.setText(A0(2132017786));
        } else {
            x2().f8430h0.setText(A0(2132017785));
        }
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void F2() {
        x2().S.setText(A0(2132017539));
        x2().S.setOnClickListener(new View.OnClickListener() { // from class: f7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirmwareCompleteFragment.I2(FirmwareCompleteFragment.this, view);
            }
        });
    }

    @Override // com.apptionlabs.meater_app.qsg.ui.firmware.a
    public void G2() {
    }
}
