package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import java.util.Locale;

/* loaded from: /tmp/meat/meat/classes.dex */
public class BlockStandAloneAnimationView extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    b6.f1 f10197q;

    /* renamed from: r, reason: collision with root package name */
    String f10198r;

    /* renamed from: s, reason: collision with root package name */
    private Handler f10199s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f10200t;

    /* renamed from: u, reason: collision with root package name */
    boolean f10201u;

    /* renamed from: v, reason: collision with root package name */
    private b f10202v;

    /* renamed from: w, reason: collision with root package name */
    int f10203w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10204a;

        static {
            int[] iArr = new int[b.values().length];
            f10204a = iArr;
            try {
                iArr[b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10204a[b.BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10204a[b.PANEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10204a[b.PANEL_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10204a[b.HEADER_WITH_START_UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10204a[b.PROGRESS_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10204a[b.RROGRESS_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10204a[b.RROGRESS_3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10204a[b.RROGRESS_4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10204a[b.SETUP_MODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10204a[b.STANDALONE_MODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10204a[b.CONNECTING_1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10204a[b.CONNECTING_2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10204a[b.CONNECTING_3.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10204a[b.SET_UP_1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10204a[b.SET_UP_1_1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10204a[b.SET_UP_2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10204a[b.SET_UP_2_1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10204a[b.SET_UP_3.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10204a[b.SET_UP_3_1.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10204a[b.SET_UP_4.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10204a[b.MEAT_SELECTION_1.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10204a[b.MEAT_SELECTION_2.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10204a[b.MEAT_SELECTION_3.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10204a[b.CUT_SELECTION_1.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10204a[b.CUT_SELECTION_2.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10204a[b.CUT_SELECTION_3.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f10204a[b.COOK_SELECTION_1.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f10204a[b.COOK_SELECTION_2.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f10204a[b.COOK_SELECTION_3.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f10204a[b.COOK_STARTED_1.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f10204a[b.COOK_STARTED_2.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f10204a[b.COOK_STARTED_3.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f10204a[b.COOK_STARTED_4.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f10204a[b.COOK_STARTED_5.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f10204a[b.COOK_STARTED_6.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f10204a[b.COOK_STARTED_7.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f10204a[b.TARGET_1.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f10204a[b.TARGET_2.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f10204a[b.TARGET_3.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f10204a[b.AMBIENT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f10204a[b.INTERNAL.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f10204a[b.UI_REMAINING_1.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f10204a[b.UI_REMAINING_2.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f10204a[b.UI_REMAINING_3.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f10204a[b.UI_REMAINING_4.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f10204a[b.FIVE_MIN_ALERT.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f10204a[b.REMOVE_FROM_HEAT_1.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f10204a[b.REMOVE_FROM_HEAT_2.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f10204a[b.REMOVE_FROM_HEAT_3.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f10204a[b.REMOVE_FROM_HEAT_4.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f10204a[b.EMPTY_DELAY.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum b {
        NONE,
        BLOCK,
        PANEL,
        PANEL_LIGHT,
        HEADER_WITH_START_UP,
        PROGRESS_1,
        RROGRESS_2,
        RROGRESS_3,
        RROGRESS_4,
        SETUP_MODE,
        STANDALONE_MODE,
        CONNECTING_1,
        CONNECTING_2,
        CONNECTING_3,
        SET_UP_1,
        SET_UP_1_1,
        SET_UP_2,
        SET_UP_2_1,
        SET_UP_3,
        SET_UP_3_1,
        SET_UP_4,
        MEAT_SELECTION_1,
        MEAT_SELECTION_2,
        MEAT_SELECTION_3,
        CUT_SELECTION_1,
        CUT_SELECTION_2,
        CUT_SELECTION_3,
        COOK_SELECTION_1,
        COOK_SELECTION_2,
        COOK_SELECTION_3,
        COOK_STARTED_1,
        COOK_STARTED_2,
        COOK_STARTED_3,
        COOK_STARTED_4,
        COOK_STARTED_5,
        COOK_STARTED_6,
        COOK_STARTED_7,
        TARGET_1,
        TARGET_2,
        TARGET_3,
        AMBIENT,
        INTERNAL,
        UI_REMAINING_1,
        UI_REMAINING_2,
        UI_REMAINING_3,
        UI_REMAINING_4,
        FIVE_MIN_ALERT,
        REMOVE_FROM_HEAT_1,
        REMOVE_FROM_HEAT_2,
        REMOVE_FROM_HEAT_3,
        REMOVE_FROM_HEAT_4,
        EMPTY_DELAY;

        public b i() {
            int ordinal = ordinal() + 1;
            if (ordinal >= values().length) {
                return values()[0];
            }
            return values()[ordinal];
        }
    }

    public BlockStandAloneAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10198r = "";
        this.f10201u = false;
        this.f10202v = b.NONE;
        this.f10203w = 3000;
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f10197q = (b6.f1) androidx.databinding.g.h(LayoutInflater.from(context), 2131558471, this, true);
        DisplayMetrics displayMetrics = com.apptionlabs.meater_app.app.a.i().getResources().getDisplayMetrics();
        int min = (int) (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 2.2d);
        this.f10197q.f7754f0.getLayoutParams().width = min;
        float f10 = min;
        int i10 = (int) (1.153f * f10);
        this.f10197q.f7754f0.getLayoutParams().height = i10;
        this.f10197q.f7755g0.getLayoutParams().height = i10;
        this.f10197q.f7762n0.getLayoutParams().height = i10;
        this.f10197q.f7751c0.getLayoutParams().height = i10;
        this.f10197q.f7756h0.getLayoutParams().height = i10;
        this.f10197q.f7758j0.getLayoutParams().height = i10;
        this.f10197q.f7759k0.getLayoutParams().height = i10;
        this.f10197q.f7760l0.getLayoutParams().height = i10;
        this.f10197q.S.getLayoutParams().height = i10;
        this.f10197q.Y.getLayoutParams().height = i10;
        this.f10197q.Z.getLayoutParams().height = i10;
        this.f10197q.f7749a0.getLayoutParams().height = i10;
        this.f10197q.f7750b0.getLayoutParams().height = i10;
        this.f10197q.f7770v0.getLayoutParams().height = i10;
        this.f10197q.f7771w0.getLayoutParams().height = i10;
        this.f10197q.f7772x0.getLayoutParams().height = i10;
        this.f10197q.f7773y0.getLayoutParams().height = i10;
        this.f10197q.f7769u0.getLayoutParams().height = i10;
        this.f10197q.f7768t0.getLayoutParams().height = i10;
        this.f10197q.f7767s0.getLayoutParams().height = i10;
        this.f10197q.f7766r0.getLayoutParams().height = i10;
        this.f10197q.f7765q0.getLayoutParams().height = i10;
        this.f10197q.f7764p0.getLayoutParams().height = i10;
        this.f10197q.U.getLayoutParams().height = i10;
        this.f10197q.T.getLayoutParams().height = i10;
        this.f10197q.X.getLayoutParams().height = i10;
        this.f10197q.R.getLayoutParams().height = i10;
        this.f10197q.V.getLayoutParams().height = i10;
        this.f10197q.W.getLayoutParams().height = i10;
        this.f10197q.Q.getLayoutParams().height = i10;
        this.f10197q.f7757i0.getLayoutParams().height = i10;
        int i11 = (int) (f10 / 4.4f);
        this.f10197q.f7755g0.getLayoutParams().width = i11;
        this.f10197q.f7762n0.getLayoutParams().width = i11;
        this.f10197q.f7751c0.getLayoutParams().width = i11;
        this.f10197q.f7756h0.getLayoutParams().width = i11;
        this.f10197q.f7758j0.getLayoutParams().width = i11;
        this.f10197q.f7759k0.getLayoutParams().width = i11;
        this.f10197q.f7760l0.getLayoutParams().width = i11;
        this.f10197q.S.getLayoutParams().width = i11;
        this.f10197q.Y.getLayoutParams().width = i11;
        this.f10197q.Z.getLayoutParams().width = i11;
        this.f10197q.f7749a0.getLayoutParams().width = i11;
        this.f10197q.f7750b0.getLayoutParams().width = i11;
        this.f10197q.f7770v0.getLayoutParams().width = i11;
        this.f10197q.f7771w0.getLayoutParams().width = i11;
        this.f10197q.f7772x0.getLayoutParams().width = i11;
        this.f10197q.f7773y0.getLayoutParams().width = i11;
        this.f10197q.f7769u0.getLayoutParams().width = i11;
        this.f10197q.f7768t0.getLayoutParams().width = i11;
        this.f10197q.f7767s0.getLayoutParams().width = i11;
        this.f10197q.f7766r0.getLayoutParams().width = i11;
        this.f10197q.f7765q0.getLayoutParams().width = i11;
        this.f10197q.f7764p0.getLayoutParams().width = i11;
        this.f10197q.U.getLayoutParams().width = i11;
        this.f10197q.T.getLayoutParams().width = i11;
        this.f10197q.X.getLayoutParams().width = i11;
        this.f10197q.R.getLayoutParams().width = i11;
        this.f10197q.V.getLayoutParams().width = i11;
        this.f10197q.W.getLayoutParams().width = i11;
        this.f10197q.Q.getLayoutParams().width = i11;
        this.f10197q.f7757i0.getLayoutParams().width = i11;
        this.f10198r = String.format(Locale.US, context.getString(2132018750), getCircleString());
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        Runnable runnable;
        Runnable runnable2;
        try {
            e();
            Handler handler = this.f10199s;
            if (handler != null && (runnable2 = this.f10200t) != null) {
                handler.postDelayed(runnable2, this.f10203w);
            }
        } catch (Throwable th) {
            if (this.f10199s != null && (runnable = this.f10200t) != null) {
                this.f10199s.postDelayed(runnable, this.f10203w);
            }
            throw th;
        }
    }

    private void d() {
        this.f10201u = true;
        this.f10199s = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: com.apptionlabs.meater_app.views.a
            @Override // java.lang.Runnable
            public final void run() {
                BlockStandAloneAnimationView.this.c();
            }
        };
        this.f10200t = runnable;
        runnable.run();
    }

    private void e() {
        switch (a.f10204a[this.f10202v.ordinal()]) {
            case 1:
                this.f10203w = 4000;
                this.f10197q.f7754f0.setImageResource(2131231230);
                break;
            case 2:
                this.f10197q.f7754f0.setVisibility(0);
                this.f10197q.f7754f0.setImageResource(2131231076);
                this.f10203w = 1200;
                break;
            case 3:
                this.f10197q.f7755g0.setVisibility(0);
                break;
            case 4:
                this.f10197q.f7755g0.setVisibility(8);
                this.f10197q.f7751c0.setVisibility(0);
                this.f10197q.f7762n0.setVisibility(0);
                break;
            case 5:
                this.f10197q.f7756h0.setVisibility(0);
                break;
            case 6:
                this.f10197q.f7756h0.setImageResource(2131231084);
                break;
            case 7:
                this.f10197q.f7756h0.setImageResource(2131231084);
                break;
            case 8:
                this.f10197q.f7756h0.setImageResource(2131231086);
                break;
            case 9:
                this.f10197q.f7762n0.setVisibility(8);
                this.f10197q.f7756h0.setVisibility(8);
                this.f10197q.f7758j0.setVisibility(0);
                this.f10197q.f7759k0.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018748));
                this.f10203w = ProtocolParameters.MAX_UDP_MSG_LENGTH;
                break;
            case 10:
                this.f10197q.f7759k0.setVisibility(8);
                this.f10197q.f7760l0.setVisibility(0);
                this.f10203w = ProtocolParameters.MAX_UDP_MSG_LENGTH;
                break;
            case 11:
                this.f10197q.f7751c0.setVisibility(8);
                this.f10197q.f7758j0.setVisibility(8);
                this.f10197q.f7760l0.setVisibility(8);
                this.f10197q.S.setVisibility(0);
                this.f10197q.Y.setVisibility(0);
                this.f10197q.Z.setVisibility(0);
                this.f10197q.f7749a0.setVisibility(0);
                this.f10197q.f7750b0.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018749));
                break;
            case 12:
                this.f10197q.Y.setImageResource(2131230857);
                this.f10197q.Z.setImageResource(2131230860);
                this.f10197q.f7749a0.setImageResource(2131230864);
                this.f10197q.f7750b0.setImageResource(2131230868);
                break;
            case 13:
                this.f10197q.Y.setImageResource(2131230858);
                this.f10197q.Z.setImageResource(2131230861);
                this.f10197q.f7749a0.setImageResource(2131230865);
                this.f10197q.f7750b0.setImageResource(2131230869);
                break;
            case 14:
                this.f10197q.Y.setVisibility(8);
                this.f10197q.f7770v0.setVisibility(0);
                this.f10197q.Z.setImageResource(2131230862);
                this.f10197q.f7749a0.setImageResource(2131230866);
                this.f10197q.f7750b0.setImageResource(2131230870);
                break;
            case 15:
                this.f10197q.Z.setImageResource(2131230859);
                this.f10197q.f7749a0.setImageResource(2131230863);
                this.f10197q.f7750b0.setImageResource(2131230867);
                break;
            case 16:
                this.f10197q.Z.setVisibility(8);
                this.f10197q.f7771w0.setVisibility(0);
                this.f10197q.f7749a0.setImageResource(2131230864);
                this.f10197q.f7750b0.setImageResource(2131230868);
                break;
            case 17:
                this.f10197q.f7749a0.setImageResource(2131230865);
                this.f10197q.f7750b0.setImageResource(2131230869);
                break;
            case 18:
                this.f10197q.f7749a0.setVisibility(8);
                this.f10197q.f7772x0.setVisibility(0);
                this.f10197q.f7750b0.setImageResource(2131230870);
                break;
            case 19:
                this.f10197q.f7750b0.setImageResource(2131230867);
                break;
            case 20:
                this.f10197q.f7750b0.setVisibility(8);
                this.f10197q.f7773y0.setVisibility(0);
                break;
            case 21:
                String str = this.f10198r;
                if (str != null) {
                    this.f10197q.f7763o0.setText(str);
                }
                this.f10203w = 3500;
                break;
            case 22:
                this.f10197q.S.setVisibility(8);
                this.f10197q.f7770v0.setVisibility(8);
                this.f10197q.f7771w0.setVisibility(8);
                this.f10197q.f7772x0.setVisibility(8);
                this.f10197q.f7773y0.setVisibility(8);
                this.f10197q.f7769u0.setVisibility(0);
                this.f10197q.f7768t0.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018751));
                this.f10203w = ProtocolParameters.MAX_UDP_MSG_LENGTH;
                break;
            case 23:
                this.f10197q.f7768t0.setImageResource(2131230888);
                break;
            case 24:
                this.f10197q.f7768t0.setImageResource(2131230887);
                break;
            case 25:
                this.f10197q.f7769u0.setVisibility(8);
                this.f10197q.f7768t0.setVisibility(8);
                this.f10197q.f7767s0.setVisibility(0);
                this.f10197q.f7766r0.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018752));
                break;
            case 26:
                this.f10197q.f7766r0.setImageResource(2131230882);
                break;
            case 27:
                this.f10197q.f7766r0.setImageResource(2131230883);
                break;
            case 28:
                this.f10197q.f7767s0.setVisibility(8);
                this.f10197q.f7766r0.setVisibility(8);
                this.f10197q.f7765q0.setVisibility(0);
                this.f10197q.f7764p0.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018753));
                break;
            case 29:
                this.f10197q.f7764p0.setImageResource(2131230872);
                break;
            case 30:
                this.f10197q.f7764p0.setImageResource(2131230873);
                break;
            case 31:
                this.f10197q.f7765q0.setVisibility(8);
                this.f10197q.f7764p0.setVisibility(8);
                this.f10197q.S.setVisibility(0);
                this.f10197q.U.setVisibility(0);
                this.f10197q.f7771w0.setVisibility(0);
                this.f10197q.f7772x0.setVisibility(0);
                this.f10197q.f7773y0.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018754));
                break;
            case 32:
                this.f10197q.T.setVisibility(0);
                this.f10197q.T.setImageResource(2131230876);
                break;
            case 33:
                this.f10197q.T.setImageResource(2131230877);
                break;
            case 34:
                this.f10197q.T.setImageResource(2131230878);
                break;
            case 35:
                this.f10197q.T.setImageResource(2131230879);
                this.f10197q.f7763o0.setText(getContext().getString(2132018755));
                break;
            case androidx.constraintlayout.widget.i.H1 /* 36 */:
                this.f10197q.T.setImageResource(2131230880);
                break;
            case 38:
                this.f10197q.S.setVisibility(8);
                this.f10197q.U.setVisibility(8);
                this.f10197q.f7771w0.setVisibility(8);
                this.f10197q.f7772x0.setVisibility(8);
                this.f10197q.f7773y0.setVisibility(8);
                this.f10197q.T.setVisibility(8);
                this.f10197q.X.setVisibility(0);
                break;
            case 39:
                this.f10197q.X.setImageResource(2131230902);
                break;
            case 40:
                this.f10197q.X.setImageResource(2131230901);
                break;
            case 41:
                this.f10197q.X.setVisibility(8);
                this.f10197q.R.setVisibility(0);
                break;
            case 42:
                this.f10197q.R.setVisibility(8);
                this.f10197q.V.setVisibility(0);
                break;
            case 43:
                this.f10197q.V.setVisibility(8);
                this.f10197q.W.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018745));
                break;
            case 44:
                this.f10197q.W.setImageResource(2131230892);
                break;
            case 45:
                this.f10197q.W.setImageResource(2131230891);
                break;
            case 46:
                this.f10197q.W.setImageResource(2131230893);
                break;
            case 47:
                this.f10197q.W.setVisibility(8);
                this.f10197q.Q.setVisibility(0);
                this.f10197q.f7763o0.setText(getContext().getString(2132018746));
                break;
            case 48:
                this.f10197q.Q.setVisibility(8);
                this.f10197q.f7757i0.setVisibility(0);
                break;
            case 49:
                this.f10197q.f7757i0.setImageResource(2131230895);
                this.f10197q.f7763o0.setText(getContext().getString(2132018747));
                break;
            case 50:
                this.f10197q.f7757i0.setImageResource(2131230894);
                break;
            case 51:
                this.f10203w = 3000;
                this.f10197q.f7757i0.setImageResource(2131230895);
                break;
            case 52:
                this.f10197q.f7757i0.setVisibility(8);
                this.f10197q.f7754f0.setImageResource(2131231230);
                break;
        }
        this.f10202v = this.f10202v.i();
    }

    private String getCircleString() {
        return new String(Character.toChars(9711));
    }
}
