package com.apptionlabs.meater_app.activities;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import b6.g0;
import b8.c;
import c6.h;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.activities.ProbeHighTemperatureWarningActivity;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.data.TemperatureSelection;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import f4.c0;
import f4.u;
import f8.l0;
import kotlin.Metadata;

/* compiled from: ProbeHighTemperatureWarningActivity.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 G2\u00020\u0001:\u0002HIB\u0007¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fH\u0002J@\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\tH\u0002J\u0012\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0014J\b\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'J\u0006\u0010*\u001a\u00020\u0004J\b\u0010+\u001a\u00020\u0004H\u0016J\u0012\u0010,\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0018\u0010/\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00101¨\u0006J"}, d2 = {"Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity;", "Lcom/apptionlabs/meater_app/activities/j;", "", "shouldShow", "Lih/u;", "x2", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "y2", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "A2", "", "name", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "", "opacity", "v2", "input", "Lf4/c0;", "textViewDelegate", "lottieAnimationView", "sensorValues", "B2", "textDelegate", "selectedBG", "screenBGColor", "unSelectedTextColor", "fiveSensor", "z2", "Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity$b;", "o2", "currentProbe", "q2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStop", "Lb8/c$c;", "soundType", "t2", "u2", "onBackPressed", "p1", "a0", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "meaterDevice", "b0", "Z", "getAlreadySoundStarted", "()Z", "setAlreadySoundStarted", "(Z)V", "alreadySoundStarted", "Landroid/os/CountDownTimer;", "c0", "Landroid/os/CountDownTimer;", "timer", "", "d0", "J", "deviceID", "Lb6/g0;", "e0", "Lb6/g0;", "binding", "f0", "darkTheme", "<init>", "()V", "g0", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ProbeHighTemperatureWarningActivity extends j {

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h0, reason: collision with root package name */
    private static ProbeHighTemperatureWarningActivity f9477h0;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private MEATERDevice meaterDevice;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private boolean alreadySoundStarted;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private CountDownTimer timer;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private long deviceID;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private g0 binding;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private boolean darkTheme;

    /* compiled from: ProbeHighTemperatureWarningActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity$a;", "", "Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity;", "visibleActivity", "Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity;", "a", "()Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity;", "b", "(Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity;)V", "getVisibleActivity$annotations", "()V", "<init>", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.activities.ProbeHighTemperatureWarningActivity$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final ProbeHighTemperatureWarningActivity a() {
            return ProbeHighTemperatureWarningActivity.f9477h0;
        }

        public final void b(ProbeHighTemperatureWarningActivity probeHighTemperatureWarningActivity) {
            ProbeHighTemperatureWarningActivity.f9477h0 = probeHighTemperatureWarningActivity;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProbeHighTemperatureWarningActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "s", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b {

        /* renamed from: q, reason: collision with root package name */
        public static final b f9484q = new b("FlareUp", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final b f9485r = new b("ProbeWithSensorAnimation", 1);

        /* renamed from: s, reason: collision with root package name */
        public static final b f9486s = new b("WithOutAnimation", 2);

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ b[] f9487t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ ph.a f9488u;

        static {
            b[] g10 = g();
            f9487t = g10;
            f9488u = ph.b.a(g10);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] g() {
            return new b[]{f9484q, f9485r, f9486s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9487t.clone();
        }
    }

    /* compiled from: ProbeHighTemperatureWarningActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity$c", "Lc6/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c implements h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f9490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f9491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9493e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9494f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c0 f9495g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f9496h;

        c(c0 c0Var, LottieAnimationView lottieAnimationView, int i10, int i11, int i12, c0 c0Var2, LottieAnimationView lottieAnimationView2) {
            this.f9490b = c0Var;
            this.f9491c = lottieAnimationView;
            this.f9492d = i10;
            this.f9493e = i11;
            this.f9494f = i12;
            this.f9495g = c0Var2;
            this.f9496h = lottieAnimationView2;
        }

        @Override // c6.h.a
        public void a(MEATERDevice mEATERDevice) {
            wh.m.f(mEATERDevice, "device");
            b o22 = ProbeHighTemperatureWarningActivity.this.o2(mEATERDevice);
            g0 g0Var = null;
            if (o22 == b.f9484q) {
                g0 g0Var2 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var2 == null) {
                    wh.m.t("binding");
                    g0Var2 = null;
                }
                g0Var2.V.setVisibility(0);
                g0 g0Var3 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var3 == null) {
                    wh.m.t("binding");
                    g0Var3 = null;
                }
                g0Var3.S.setVisibility(8);
                g0 g0Var4 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var4 == null) {
                    wh.m.t("binding");
                    g0Var4 = null;
                }
                g0Var4.U.setVisibility(8);
                g0 g0Var5 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var5 == null) {
                    wh.m.t("binding");
                    g0Var5 = null;
                }
                g0Var5.T.setVisibility(0);
                g0 g0Var6 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var6 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var6;
                }
                g0Var.W.setVisibility(0);
                ProbeHighTemperatureWarningActivity probeHighTemperatureWarningActivity = ProbeHighTemperatureWarningActivity.this;
                c0 c0Var = this.f9490b;
                LottieAnimationView lottieAnimationView = this.f9491c;
                wh.m.e(lottieAnimationView, "$flareUPLottieView");
                probeHighTemperatureWarningActivity.z2(mEATERDevice, c0Var, lottieAnimationView, this.f9492d, this.f9493e, this.f9494f, false);
                return;
            }
            if (o22 == b.f9485r) {
                g0 g0Var7 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var7 == null) {
                    wh.m.t("binding");
                    g0Var7 = null;
                }
                g0Var7.U.setVisibility(0);
                g0 g0Var8 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var8 == null) {
                    wh.m.t("binding");
                    g0Var8 = null;
                }
                g0Var8.V.setVisibility(8);
                g0 g0Var9 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var9 == null) {
                    wh.m.t("binding");
                    g0Var9 = null;
                }
                g0Var9.T.setVisibility(8);
                g0 g0Var10 = ProbeHighTemperatureWarningActivity.this.binding;
                if (g0Var10 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var10;
                }
                g0Var.W.setVisibility(8);
                ProbeHighTemperatureWarningActivity probeHighTemperatureWarningActivity2 = ProbeHighTemperatureWarningActivity.this;
                c0 c0Var2 = this.f9495g;
                LottieAnimationView lottieAnimationView2 = this.f9496h;
                wh.m.e(lottieAnimationView2, "$fiveSensorLottieView");
                probeHighTemperatureWarningActivity2.z2(mEATERDevice, c0Var2, lottieAnimationView2, this.f9492d, this.f9493e, this.f9494f, true);
                ProbeHighTemperatureWarningActivity.this.x2(!mEATERDevice.getShouldShowAsConnected());
                return;
            }
            ProbeHighTemperatureWarningActivity probeHighTemperatureWarningActivity3 = ProbeHighTemperatureWarningActivity.this;
            if (!probeHighTemperatureWarningActivity3.y2(probeHighTemperatureWarningActivity3.meaterDevice)) {
                ProbeHighTemperatureWarningActivity.this.u2();
                ProbeHighTemperatureWarningActivity.this.finish();
                if (ProbeHighTemperatureWarningActivity.this.x0() != null) {
                    androidx.appcompat.app.a x02 = ProbeHighTemperatureWarningActivity.this.x0();
                    wh.m.c(x02);
                    x02.I();
                }
                ProbeHighTemperatureWarningActivity.INSTANCE.b(null);
            }
            g0 g0Var11 = ProbeHighTemperatureWarningActivity.this.binding;
            if (g0Var11 == null) {
                wh.m.t("binding");
            } else {
                g0Var = g0Var11;
            }
            g0Var.W.setVisibility(8);
            ProbeHighTemperatureWarningActivity.this.x2(!mEATERDevice.getShouldShowAsConnected());
        }
    }

    /* compiled from: ProbeHighTemperatureWarningActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/apptionlabs/meater_app/activities/ProbeHighTemperatureWarningActivity$d", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lih/u;", "onTick", "onFinish", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.b f9497a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c.b bVar, long j10, long j11) {
            super(j10, j11);
            this.f9497a = bVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            c.b bVar = this.f9497a;
            wh.m.c(bVar);
            bVar.k();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            c.b bVar = this.f9497a;
            if (bVar != null) {
                bVar.f(true);
            }
        }
    }

    private final void A2(Probe probe) {
        wh.m.c(probe);
        g0 g0Var = null;
        if (probe.getClipNumber() > 0) {
            g0 g0Var2 = this.binding;
            if (g0Var2 == null) {
                wh.m.t("binding");
                g0Var2 = null;
            }
            g0Var2.X.setVisibility(0);
            g0 g0Var3 = this.binding;
            if (g0Var3 == null) {
                wh.m.t("binding");
                g0Var3 = null;
            }
            g0Var3.Y.setVisibility(8);
            g0 g0Var4 = this.binding;
            if (g0Var4 == null) {
                wh.m.t("binding");
                g0Var4 = null;
            }
            g0Var4.X.setImageResource(2131231298);
            int clipNumber = probe.getClipNumber();
            if (clipNumber != 1) {
                if (clipNumber != 2) {
                    if (clipNumber != 3) {
                        if (clipNumber != 4) {
                            g0 g0Var5 = this.binding;
                            if (g0Var5 == null) {
                                wh.m.t("binding");
                            } else {
                                g0Var = g0Var5;
                            }
                            g0Var.X.setVisibility(8);
                            return;
                        }
                        g0 g0Var6 = this.binding;
                        if (g0Var6 == null) {
                            wh.m.t("binding");
                        } else {
                            g0Var = g0Var6;
                        }
                        g0Var.X.setImageResource(2131230933);
                        return;
                    }
                    g0 g0Var7 = this.binding;
                    if (g0Var7 == null) {
                        wh.m.t("binding");
                    } else {
                        g0Var = g0Var7;
                    }
                    g0Var.X.setImageResource(2131230932);
                    return;
                }
                g0 g0Var8 = this.binding;
                if (g0Var8 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var8;
                }
                g0Var.X.setImageResource(2131230931);
                return;
            }
            g0 g0Var9 = this.binding;
            if (g0Var9 == null) {
                wh.m.t("binding");
            } else {
                g0Var = g0Var9;
            }
            g0Var.X.setImageResource(2131230930);
            return;
        }
        if (probe.isBlockProbe()) {
            g0 g0Var10 = this.binding;
            if (g0Var10 == null) {
                wh.m.t("binding");
                g0Var10 = null;
            }
            g0Var10.X.setVisibility(8);
            g0 g0Var11 = this.binding;
            if (g0Var11 == null) {
                wh.m.t("binding");
                g0Var11 = null;
            }
            g0Var11.Y.setVisibility(0);
            g0 g0Var12 = this.binding;
            if (g0Var12 == null) {
                wh.m.t("binding");
            } else {
                g0Var = g0Var12;
            }
            g0Var.Y.setText(String.valueOf(probe.displayProbeNumber()));
        }
    }

    private final void B2(String str, c0 c0Var, LottieAnimationView lottieAnimationView, String str2) {
        c0Var.e(str, str2);
        lottieAnimationView.setTextDelegate(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b o2(MEATERDevice device) {
        if (device.isMEATERProbe()) {
            wh.m.d(device, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
            Probe probe = (Probe) device;
            boolean q22 = q2(probe);
            if (probe.getMEATERDeviceType().isG2Probe()) {
                g0 g0Var = null;
                if (q22) {
                    g0 g0Var2 = this.binding;
                    if (g0Var2 == null) {
                        wh.m.t("binding");
                        g0Var2 = null;
                    }
                    g0Var2.f7804b0.setText(2132017899);
                    g0 g0Var3 = this.binding;
                    if (g0Var3 == null) {
                        wh.m.t("binding");
                    } else {
                        g0Var = g0Var3;
                    }
                    g0Var.Q.setBackgroundColor(getColor(2131100472));
                    return b.f9485r;
                }
                if (probe.getAmbientTemperature() >= probe.getMEATERDeviceType().minimumFlareUpTemperatureForDevice()) {
                    g0 g0Var4 = this.binding;
                    if (g0Var4 == null) {
                        wh.m.t("binding");
                        g0Var4 = null;
                    }
                    g0Var4.Q.setBackgroundColor(getColor(2131099772));
                    g0 g0Var5 = this.binding;
                    if (g0Var5 == null) {
                        wh.m.t("binding");
                    } else {
                        g0Var = g0Var5;
                    }
                    g0Var.f7804b0.setText(getString(2132017800));
                    return b.f9484q;
                }
                finish();
                return b.f9485r;
            }
            if (!q22) {
                finish();
            }
            return b.f9486s;
        }
        if (device.getAmbientTemperature() < device.maximumAmbientTemperature()) {
            finish();
        }
        return b.f9486s;
    }

    public static final ProbeHighTemperatureWarningActivity p2() {
        return INSTANCE.a();
    }

    private final boolean q2(Probe currentProbe) {
        int internalTemperature;
        if (currentProbe.getTemperatures() != null && currentProbe.getTemperatures().internalTemperatures.length > 1) {
            internalTemperature = TemperatureSelection.HighestTemperatureFromSet(currentProbe.getTemperatures());
        } else {
            internalTemperature = currentProbe.getInternalTemperature();
        }
        if (Temperature.toCelsius(internalTemperature) >= Temperature.toCelsius(currentProbe.maximumInternalTemperature()) || Temperature.toCelsius(currentProbe.getAmbientTemperature()) >= Temperature.toCelsius(currentProbe.maximumAmbientTemperature())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(ProbeHighTemperatureWarningActivity probeHighTemperatureWarningActivity, View view) {
        wh.m.f(probeHighTemperatureWarningActivity, "this$0");
        l0.H(probeHighTemperatureWarningActivity, "https://support.meater.com/faqs/temp-flare-up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(ProbeHighTemperatureWarningActivity probeHighTemperatureWarningActivity, View view) {
        wh.m.f(probeHighTemperatureWarningActivity, "this$0");
        probeHighTemperatureWarningActivity.u2();
        probeHighTemperatureWarningActivity.finish();
        MEATERDevice mEATERDevice = probeHighTemperatureWarningActivity.meaterDevice;
        if (mEATERDevice != null && mEATERDevice.isMEATERProbe()) {
            MEATERDevice mEATERDevice2 = probeHighTemperatureWarningActivity.meaterDevice;
            wh.m.d(mEATERDevice2, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
            ((Probe) mEATERDevice2).setFlareUpAlertState(AlarmState.ALARM_STATE_NOT_READY);
        }
        if (probeHighTemperatureWarningActivity.x0() != null) {
            androidx.appcompat.app.a x02 = probeHighTemperatureWarningActivity.x0();
            wh.m.c(x02);
            x02.I();
        }
        f9477h0 = null;
    }

    private final void v2(String str, LottieAnimationView lottieAnimationView, final int i10) {
        lottieAnimationView.j(new k4.e(str, "**"), u.f12289d, new s4.e() { // from class: p5.a4
            @Override // s4.e
            public final Object a(s4.b bVar) {
                Integer w22;
                w22 = ProbeHighTemperatureWarningActivity.w2(i10, bVar);
                return w22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer w2(int i10, s4.b bVar) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(boolean z10) {
        g0 g0Var = null;
        if (z10) {
            g0 g0Var2 = this.binding;
            if (g0Var2 == null) {
                wh.m.t("binding");
            } else {
                g0Var = g0Var2;
            }
            g0Var.T.setVisibility(0);
            return;
        }
        g0 g0Var3 = this.binding;
        if (g0Var3 == null) {
            wh.m.t("binding");
        } else {
            g0Var = g0Var3;
        }
        g0Var.T.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y2(MEATERDevice device) {
        int internalTemperature;
        wh.m.c(device);
        g0 g0Var = null;
        if (device.isMEATERProbe()) {
            Probe probe = (Probe) this.meaterDevice;
            A2(probe);
            int maximumInternalTemperatureForDevice = device.getMEATERDeviceType().maximumInternalTemperatureForDevice();
            MEATERDeviceType mEATERDeviceType = device.getMEATERDeviceType();
            wh.m.c(probe);
            int maximumAmbientTemperatureForDevice = mEATERDeviceType.maximumAmbientTemperatureForDevice(probe.getFirmwareRevision());
            Temperature.Temperatures_t temperatures = probe.getTemperatures();
            if (temperatures == null) {
                return true;
            }
            Probe probe2 = (Probe) device;
            if (temperatures.internalTemperatures.length > 1) {
                internalTemperature = TemperatureSelection.HighestTemperatureFromSet(temperatures);
            } else {
                internalTemperature = probe.getInternalTemperature();
            }
            int ambientTemperature = probe2.getAmbientTemperature();
            if (ambientTemperature >= maximumAmbientTemperatureForDevice && internalTemperature >= maximumInternalTemperatureForDevice) {
                g0 g0Var2 = this.binding;
                if (g0Var2 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var2;
                }
                g0Var.S.setImageResource(2131231297);
            } else if (ambientTemperature >= maximumAmbientTemperatureForDevice) {
                g0 g0Var3 = this.binding;
                if (g0Var3 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var3;
                }
                g0Var.S.setImageResource(2131231296);
            } else {
                if (internalTemperature < maximumInternalTemperatureForDevice) {
                    return false;
                }
                g0 g0Var4 = this.binding;
                if (g0Var4 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var4;
                }
                g0Var.S.setImageResource(2131231298);
            }
            if (!this.alreadySoundStarted) {
                t2(c.EnumC0118c.COOK_OVERCOOK_SOUND);
                this.alreadySoundStarted = true;
            }
        } else {
            if (device.isMEATERPlus()) {
                g0 g0Var5 = this.binding;
                if (g0Var5 == null) {
                    wh.m.t("binding");
                    g0Var5 = null;
                }
                g0Var5.V.setVisibility(8);
                g0 g0Var6 = this.binding;
                if (g0Var6 == null) {
                    wh.m.t("binding");
                    g0Var6 = null;
                }
                g0Var6.S.setVisibility(0);
                if (device.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS) {
                    g0 g0Var7 = this.binding;
                    if (g0Var7 == null) {
                        wh.m.t("binding");
                    } else {
                        g0Var = g0Var7;
                    }
                    g0Var.S.setImageResource(2131231292);
                }
                return true;
            }
            if (device.isMEATERBlock()) {
                g0 g0Var8 = this.binding;
                if (g0Var8 == null) {
                    wh.m.t("binding");
                    g0Var8 = null;
                }
                g0Var8.V.setVisibility(8);
                g0 g0Var9 = this.binding;
                if (g0Var9 == null) {
                    wh.m.t("binding");
                    g0Var9 = null;
                }
                g0Var9.S.setVisibility(0);
                if (device.getAmbientTemperature() < device.getMEATERDeviceType().maximumAmbientTemperatureForDevice(device.getFirmwareRevision())) {
                    return false;
                }
                g0 g0Var10 = this.binding;
                if (g0Var10 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var = g0Var10;
                }
                g0Var.S.setImageResource(2131231078);
                if (!this.alreadySoundStarted) {
                    t2(c.EnumC0118c.COOK_OVERCOOK_SOUND);
                    this.alreadySoundStarted = true;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(MEATERDevice mEATERDevice, c0 c0Var, LottieAnimationView lottieAnimationView, int i10, int i11, int i12, boolean z10) {
        if (mEATERDevice.isMEATERProbe()) {
            wh.m.d(mEATERDevice, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
            Probe probe = (Probe) mEATERDevice;
            if (probe.getTemperatures() == null) {
                return;
            }
            String displayTemperature = Temperature.displayTemperature(probe.getTemperatures().ambientTemperature);
            wh.m.e(displayTemperature, "displayTemperature(...)");
            B2("a0", c0Var, lottieAnimationView, displayTemperature);
            if (!z10) {
                return;
            }
            if (probe.getTemperatures().ambientTemperature >= probe.maximumAmbientTemperature()) {
                v2("a0_fire", lottieAnimationView, 100);
            } else {
                v2("a0_fire", lottieAnimationView, 1);
            }
            int[] iArr = probe.getTemperatures().internalTemperatures;
            wh.m.e(iArr, "internalTemperatures");
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                String displayTemperatureFloatValues = Temperature.displayTemperatureFloatValues(i14);
                wh.m.e(displayTemperatureFloatValues, "displayTemperatureFloatValues(...)");
                if (i14 >= probe.maximumInternalTemperature()) {
                    v2("i" + i13 + "_fire", lottieAnimationView, 100);
                } else {
                    v2("i" + i13 + "_fire", lottieAnimationView, 1);
                }
                B2("i" + i13, c0Var, lottieAnimationView, displayTemperatureFloatValues);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        ViewDataBinding j10 = androidx.databinding.g.j(this, 2131558455);
        wh.m.e(j10, "setContentView(...)");
        this.binding = (g0) j10;
        this.darkTheme = l0.w(this);
        int color = getColor(2131100399);
        int color2 = getColor(2131100532);
        int color3 = getColor(2131100529);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(2131362535);
        lottieAnimationView.setAnimation(2131951631);
        c0 c0Var = new c0(lottieAnimationView);
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) findViewById(2131362530);
        lottieAnimationView2.setAnimation(2131951664);
        c0 c0Var2 = new c0(lottieAnimationView2);
        TextView textView = (TextView) findViewById(2131362876);
        SpannableString spannableString = new SpannableString(getString(2132018191));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: p5.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProbeHighTemperatureWarningActivity.r2(ProbeHighTemperatureWarningActivity.this, view);
            }
        });
        g0 g0Var = this.binding;
        g0 g0Var2 = null;
        if (g0Var == null) {
            wh.m.t("binding");
            g0Var = null;
        }
        g0Var.T.setOnClickListener(new View.OnClickListener() { // from class: p5.z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProbeHighTemperatureWarningActivity.s2(ProbeHighTemperatureWarningActivity.this, view);
            }
        });
        if (x0() != null) {
            androidx.appcompat.app.a x02 = x0();
            wh.m.c(x02);
            x02.m();
        }
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            wh.m.c(extras);
            MEATERDevice o10 = c6.h.f8879a.o(extras.getLong("probe_serial"));
            if (o10 != null) {
                this.meaterDevice = o10;
                y2(o10);
                this.deviceID = o10.getDeviceID();
            }
            f9477h0 = this;
        }
        MEATERDevice mEATERDevice = this.meaterDevice;
        if (mEATERDevice != null) {
            if (mEATERDevice.getMEATERDeviceType().isG2Probe()) {
                Probe probe = (Probe) mEATERDevice;
                if (probe.appearsToHaveCookInProgress()) {
                    string = probe.cookNameForDisplay();
                } else {
                    string = com.apptionlabs.meater_app.app.a.i().getString(2132018368);
                }
                g0 g0Var3 = this.binding;
                if (g0Var3 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var2 = g0Var3;
                }
                g0Var2.f7805c0.setText(string);
            } else {
                g0 g0Var4 = this.binding;
                if (g0Var4 == null) {
                    wh.m.t("binding");
                    g0Var4 = null;
                }
                g0Var4.V.setVisibility(8);
                g0 g0Var5 = this.binding;
                if (g0Var5 == null) {
                    wh.m.t("binding");
                    g0Var5 = null;
                }
                g0Var5.S.setVisibility(0);
                g0 g0Var6 = this.binding;
                if (g0Var6 == null) {
                    wh.m.t("binding");
                    g0Var6 = null;
                }
                g0Var6.Q.setBackgroundColor(getColor(2131100472));
                g0 g0Var7 = this.binding;
                if (g0Var7 == null) {
                    wh.m.t("binding");
                    g0Var7 = null;
                }
                g0Var7.f7804b0.setText(2132017899);
                g0 g0Var8 = this.binding;
                if (g0Var8 == null) {
                    wh.m.t("binding");
                } else {
                    g0Var2 = g0Var8;
                }
                g0Var2.f7805c0.setText(2132018368);
            }
        }
        c6.h.f8879a.A(this, this.deviceID, new c(c0Var, lottieAnimationView, color, color2, color3, c0Var2, lottieAnimationView2));
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        u2();
        f9477h0 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j
    public void p1(Probe probe) {
        super.p1(probe);
        if (probe != null && this.deviceID == probe.getDeviceID()) {
            finish();
        }
    }

    public final void t2(c.EnumC0118c enumC0118c) {
        c.b i10 = b8.c.p(this).i(enumC0118c);
        if (i10 != null) {
            i10.g(true);
        }
        d dVar = new d(i10, 5000000, 10000);
        this.timer = dVar;
        dVar.start();
    }

    public final void u2() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            wh.m.c(countDownTimer);
            countDownTimer.cancel();
        }
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
