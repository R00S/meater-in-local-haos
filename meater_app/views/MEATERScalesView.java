package com.apptionlabs.meater_app.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b6.r8;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.views.ScaleButton;
import java.util.Locale;
import java.util.Objects;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERScalesView extends RelativeLayout implements k1, ScaleButton.b {
    public static final String[] H = {"40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210"};
    public static final String[] I = {"40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360", "370", "380", "390", "400", "410", "420", "430", "440", "450", "460", "470", "480", "490", "500", "510", "520", "530", "540", "550", "560", "570"};
    public static final String[] J = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360", "370", "380", "390", "400", "410", "420", "430", "440", "450", "460", "470", "480", "490", "500"};
    public static String[] K = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100"};
    public static String[] L = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110"};
    public static String[] M = {"40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220"};
    public static String[] N = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300"};
    public static String[] O = {"40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360", "370", "380", "390", "400", "410", "420", "430", "440", "450", "460", "470", "480", "490", "500", "510", "520", "530", "540", "550", "560", "570", "580", "590", "600", "610", "620", "630", "640", "650", "660", "670", "680", "690", "700", "710", "720", "730", "740", "750", "760", "770", "780", "790", "800", "810", "820", "830", "840", "850", "860", "870", "880", "890", "900", "910", "920", "930", "940"};
    public static String[] P = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360", "370", "380", "390", "400", "410", "420", "430", "440", "450", "460", "470", "480", "490", "500", "510", "520", "530", "540", "550", "560", "570", "580", "590", "600", "610", "620", "630", "640", "650", "660", "670", "680", "690", "700", "710", "720", "730", "740", "750", "760", "770", "780", "790", "800", "810", "820", "830", "840", "850", "860", "870", "880", "890", "900", "910", "920", "930", "940", "950", "960", "970", "980", "990", "1000", "1010", "1020", "1030", "1040", "1050", "1060", "1070", "1080", "1090", "1100", "1110", "1120", "1130", "1140", "1150", "1160", "1170", "1180", "1190", "1200", "1210", "1220", "1230", "1240", "1250", "1260", "1270", "1280", "1290", "1300", "1310", "1320", "1330", "1340", "1350", "1360", "1370", "1380", "1390", "1400", "1410", "1420", "1430", "1440"};
    Activity A;
    private int B;
    private boolean C;
    r8 D;
    private boolean E;
    private float F;
    j G;

    /* renamed from: q, reason: collision with root package name */
    int f10325q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10326r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10327s;

    /* renamed from: t, reason: collision with root package name */
    private int f10328t;

    /* renamed from: u, reason: collision with root package name */
    private int f10329u;

    /* renamed from: v, reason: collision with root package name */
    private int f10330v;

    /* renamed from: w, reason: collision with root package name */
    private k f10331w;

    /* renamed from: x, reason: collision with root package name */
    int f10332x;

    /* renamed from: y, reason: collision with root package name */
    String[] f10333y;

    /* renamed from: z, reason: collision with root package name */
    Context f10334z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            MEATERScalesView.this.D.V.setVisibility(0);
            MEATERScalesView mEATERScalesView = MEATERScalesView.this;
            if (mEATERScalesView.G == j.TIME_SCALE) {
                if (mEATERScalesView.B == -1) {
                    MEATERScalesView mEATERScalesView2 = MEATERScalesView.this;
                    mEATERScalesView2.D.V.setText(mEATERScalesView2.Y(mEATERScalesView2.f10330v));
                } else {
                    MEATERScalesView mEATERScalesView3 = MEATERScalesView.this;
                    mEATERScalesView3.D.V.setText(mEATERScalesView3.Y(mEATERScalesView3.B));
                }
            } else {
                String trim = mEATERScalesView.D.W.getText().toString().trim();
                String substring = trim.substring(0, trim.length() - 1);
                MEATERScalesView.this.D.V.setText(substring);
                if (!substring.isEmpty()) {
                    MEATERScalesView.this.B = Integer.parseInt(substring);
                } else {
                    MEATERScalesView mEATERScalesView4 = MEATERScalesView.this;
                    mEATERScalesView4.B = mEATERScalesView4.f10332x;
                }
                MEATERScalesView mEATERScalesView5 = MEATERScalesView.this;
                mEATERScalesView5.D.V.setText(mEATERScalesView5.getResources().getString(2132018313, Integer.valueOf(MEATERScalesView.this.B)));
            }
            MEATERScalesView.this.D.V.setFocusableInTouchMode(true);
            MEATERScalesView.this.D.V.requestFocus();
            MEATERScalesView.this.D.V.selectAll();
            MEATERScalesView.this.D.W.setVisibility(4);
            ((InputMethodManager) MEATERScalesView.this.A.getSystemService("input_method")).showSoftInput(MEATERScalesView.this.D.V, 1);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10350a;

        static {
            int[] iArr = new int[j.values().length];
            f10350a = iArr;
            try {
                iArr[j.G2_COOK_FAHRENHEIT_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10350a[j.COOK_FAHRENHEIT_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10350a[j.G2_COOK_CELSIUS_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10350a[j.COOK_CELSIUS_SCALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10350a[j.AMBIENT_CELSIUS_SCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10350a[j.G2_AMBIENT_CELSIUS_SCALE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10350a[j.AMBIENT_FAHRENHEIT_SCALE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10350a[j.G2_AMBIENT_FAHRENHEIT_SCALE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10350a[j.INTERNAL_CELSIUS_SCALE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10350a[j.INTERNAL_FAHRENHEIT_SCALE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10350a[j.TIME_SCALE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum j {
        G2_COOK_CELSIUS_SCALE(102),
        G2_COOK_FAHRENHEIT_SCALE(215),
        COOK_CELSIUS_SCALE(98),
        COOK_FAHRENHEIT_SCALE(208),
        AMBIENT_CELSIUS_SCALE(295),
        AMBIENT_FAHRENHEIT_SCALE(563),
        G2_AMBIENT_CELSIUS_SCALE(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE),
        G2_AMBIENT_FAHRENHEIT_SCALE(932),
        INTERNAL_CELSIUS_SCALE(98),
        INTERNAL_FAHRENHEIT_SCALE(208),
        TIME_SCALE(1440);


        /* renamed from: q, reason: collision with root package name */
        int f10360q;

        j(int i10) {
            this.f10360q = i10;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface k {
        void J(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class l {

        /* renamed from: a, reason: collision with root package name */
        int f10361a;

        /* renamed from: b, reason: collision with root package name */
        String f10362b;

        private l(MEATERScalesView mEATERScalesView) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10) {
            this.f10361a = i10;
        }

        int b() {
            return this.f10361a;
        }

        String c() {
            return this.f10362b;
        }

        void e(String str) {
            this.f10362b = str;
        }
    }

    public MEATERScalesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10326r = false;
        this.f10327s = false;
        this.B = -1;
        this.C = true;
        this.F = -1.0f;
        this.G = j.COOK_FAHRENHEIT_SCALE;
        E(context);
    }

    private int A(boolean z10) {
        DisplayMetrics displayMetrics = com.apptionlabs.meater_app.app.a.i().getResources().getDisplayMetrics();
        if (z10) {
            return Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        return Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
    }

    private int B(String str) {
        if (str.contains(":")) {
            String substring = str.substring(0, str.indexOf(":"));
            String substring2 = str.substring(str.indexOf(":") + 1);
            return (Integer.parseInt(substring) * 60) + Integer.parseInt(substring2);
        }
        return Integer.parseInt(str);
    }

    private void D() {
        try {
            f8.l0.u(this.f10334z, this.D.V);
            this.D.W.setVisibility(0);
            this.D.V.setVisibility(4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void E(Context context) {
        setWillNotDraw(false);
        r8 r8Var = (r8) androidx.databinding.g.h(LayoutInflater.from(context), 2131558712, this, true);
        this.D = r8Var;
        this.f10334z = context;
        r8Var.Y.setScrollViewListener(this);
        this.D.R.setIcon(2131231268);
        this.D.U.setIcon(2131231289);
        final GestureDetector gestureDetector = new GestureDetector(context, new a());
        this.D.Y.setOnTouchListener(new View.OnTouchListener() { // from class: com.apptionlabs.meater_app.views.n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean G;
                G = MEATERScalesView.G(gestureDetector, view, motionEvent);
                return G;
            }
        });
        this.D.V.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.apptionlabs.meater_app.views.q0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean H2;
                H2 = MEATERScalesView.this.H(textView, i10, keyEvent);
                return H2;
            }
        });
        this.D.V.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.apptionlabs.meater_app.views.r0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                MEATERScalesView.this.I(view, z10);
            }
        });
        this.D.V.addTextChangedListener(new b());
    }

    private void F() {
        int i10;
        int i11 = this.f10325q;
        if (this.G == j.TIME_SCALE) {
            i10 = i11 / 40;
        } else {
            i10 = i11 / 45;
        }
        this.f10328t = i10;
        this.D.X.setPadding((i11 - (i10 * 5)) / 2, 0, (i11 - (i10 * 5)) / 2, 0);
        Log.info("MEATERScalesView_Test", "<initmethod> width = " + i11 + ", scrollW = " + this.f10328t + " left r padding = " + ((i11 - (this.f10328t * 5)) / 2));
        this.D.R.setButtonClickValue(-1);
        this.D.U.setButtonClickValue(1);
        this.D.R.setListener(this);
        this.D.U.setListener(this);
        int A = (int) (((float) A(true)) / 6.64f);
        this.D.R.getLayoutParams().width = A;
        this.D.R.getLayoutParams().height = A;
        this.D.R.requestLayout();
        this.D.U.getLayoutParams().width = A;
        this.D.U.getLayoutParams().height = A;
        this.D.U.requestLayout();
        this.D.Y.getLayoutParams().height = (int) (A(true) / 4.6f);
        this.D.Y.setPadding(0, A, 0, 0);
        this.D.Y.requestLayout();
        D();
        w();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.s0
            @Override // java.lang.Runnable
            public final void run() {
                MEATERScalesView.this.R();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H(TextView textView, int i10, KeyEvent keyEvent) {
        int U;
        if (i10 == 6) {
            this.f10326r = false;
            String obj = this.D.V.getText().toString();
            if (obj.equals("")) {
                z(0);
            } else {
                if (this.G == j.TIME_SCALE) {
                    U = B(obj);
                    if (U <= this.f10332x) {
                        U = 1;
                    }
                } else {
                    int parseInt = Integer.parseInt(obj);
                    int i11 = this.f10332x;
                    if (parseInt < i11) {
                        parseInt = i11;
                    }
                    U = U(parseInt);
                }
                if (this.f10332x > 0 && U < 0) {
                    U = 0;
                }
                z(U);
            }
            D();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view, boolean z10) {
        int U;
        if (!z10) {
            String obj = this.D.V.getText().toString();
            int i10 = 0;
            if (obj.equals("")) {
                z(0);
            } else {
                if (this.G == j.TIME_SCALE) {
                    U = B(obj);
                } else {
                    int parseInt = Integer.parseInt(obj);
                    int i11 = this.f10332x;
                    if (parseInt < i11) {
                        parseInt = i11;
                    }
                    U = U(parseInt);
                }
                if (this.f10332x <= 0 || U >= 0) {
                    i10 = U;
                }
                z(i10);
            }
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        if (this.C) {
            this.D.R.getButtonImage().setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        if (this.C) {
            this.D.R.getButtonImage().setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        if (this.C) {
            this.D.W.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        if (this.C) {
            this.D.U.getButtonImage().setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(ValueAnimator valueAnimator) {
        this.D.U.getButtonImage().setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(ValueAnimator valueAnimator) {
        if (this.C) {
            this.D.W.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.D.Y.scrollTo((this.f10330v - this.f10332x) * this.f10328t, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        z(this.f10330v + this.f10332x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public void R() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(f8.l0.i(this.f10334z, 2131100472), f8.l0.i(this.f10334z, 2131099682));
        valueAnimator.setEvaluator(new androidx.vectordrawable.graphics.drawable.f());
        valueAnimator.setDuration(400L);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setIntValues(f8.l0.i(this.f10334z, 2131100472), f8.l0.i(this.f10334z, 2131099682));
        valueAnimator2.setEvaluator(new androidx.vectordrawable.graphics.drawable.f());
        valueAnimator2.setDuration(400L);
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setIntValues(f8.l0.i(this.f10334z, 2131100472), f8.l0.i(this.f10334z, 2131099682));
        valueAnimator3.setEvaluator(new androidx.vectordrawable.graphics.drawable.f());
        valueAnimator3.setDuration(400L);
        ValueAnimator valueAnimator4 = new ValueAnimator();
        valueAnimator4.setIntValues(f8.l0.i(this.f10334z, 2131100472), f8.l0.i(this.f10334z, 2131099682));
        valueAnimator4.setEvaluator(new androidx.vectordrawable.graphics.drawable.f());
        valueAnimator4.setDuration(400L);
        ValueAnimator valueAnimator5 = new ValueAnimator();
        valueAnimator5.setIntValues(f8.l0.i(this.f10334z, 2131100472), f8.l0.i(this.f10334z, 2131099682));
        valueAnimator5.setEvaluator(new androidx.vectordrawable.graphics.drawable.f());
        valueAnimator5.setDuration(400L);
        ValueAnimator valueAnimator6 = new ValueAnimator();
        valueAnimator6.setIntValues(f8.l0.i(this.f10334z, 2131100472), f8.l0.i(this.f10334z, 2131099682));
        valueAnimator6.setEvaluator(new androidx.vectordrawable.graphics.drawable.f());
        valueAnimator6.setDuration(400L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.v0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                MEATERScalesView.this.K(valueAnimator7);
            }
        });
        valueAnimator.addListener(new c(valueAnimator2));
        valueAnimator.start();
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.w0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                MEATERScalesView.this.L(valueAnimator7);
            }
        });
        valueAnimator2.addListener(new d(valueAnimator3));
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.x0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                MEATERScalesView.this.M(valueAnimator7);
            }
        });
        valueAnimator3.addListener(new e(valueAnimator4));
        valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.y0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                MEATERScalesView.this.N(valueAnimator7);
            }
        });
        valueAnimator4.addListener(new f(valueAnimator5));
        valueAnimator5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.o0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                MEATERScalesView.this.O(valueAnimator7);
            }
        });
        valueAnimator5.addListener(new g(valueAnimator6));
        valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.apptionlabs.meater_app.views.p0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                MEATERScalesView.this.J(valueAnimator7);
            }
        });
        valueAnimator6.addListener(new h(valueAnimator));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void T(j jVar, boolean z10) {
        if (this.G == jVar && !z10) {
            return;
        }
        this.D.W.setPadding(V(), 0, 0, 0);
        this.G = jVar;
        this.f10327s = false;
        this.f10329u = jVar.f10360q;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D.X.getLayoutParams();
        int i10 = 30;
        switch (i.f10350a[jVar.ordinal()]) {
            case 1:
                this.f10332x = 32;
                layoutParams.setMargins(-(this.f10328t * 2), -(A(false) / 50), 0, 0);
                this.f10333y = M;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 6);
                break;
            case 2:
                this.f10332x = 32;
                layoutParams.setMargins(-(this.f10328t * 2), -(A(false) / 50), 0, 0);
                this.f10333y = H;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 6);
                break;
            case 3:
                this.f10332x = 0;
                Log.info("MEATERScalesView_Test", "<adjustViews> p-((int) (getScreenSize(false) / 50)) = " + (-(A(false) / 50)));
                layoutParams.setMargins(-(this.f10328t * this.f10332x), -(A(false) / 50), 0, 0);
                this.f10333y = L;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 4);
                i10 = 0;
                break;
            case 4:
                this.f10332x = 0;
                Log.info("MEATERScalesView_Test", "<adjustViews> p-((int) (getScreenSize(false) / 50)) = " + (-(A(false) / 50)));
                layoutParams.setMargins(-(this.f10328t * this.f10332x), -(A(false) / 50), 0, 0);
                this.f10333y = K;
                f8.l0.F(this.D.V, 2);
                f8.l0.F(this.D.W, 4);
                i10 = 0;
                break;
            case 5:
                this.f10332x = 2;
                layoutParams.setMargins(-(this.f10328t * 2), -(A(false) / 50), 0, 0);
                this.f10333y = N;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 4);
                i10 = 0;
                break;
            case 6:
                this.f10332x = 2;
                layoutParams.setMargins(-(this.f10328t * 2), -(A(false) / 50), 0, 0);
                this.f10333y = J;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 4);
                i10 = 0;
                break;
            case 7:
                this.f10332x = 35;
                layoutParams.setMargins(-(this.f10328t * 5), -(A(false) / 50), 0, 0);
                this.f10333y = I;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 4);
                break;
            case 8:
                this.f10332x = 35;
                layoutParams.setMargins(-(this.f10328t * 5), -(A(false) / 50), 0, 0);
                this.f10333y = O;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 4);
                break;
            case 9:
                this.f10332x = 2;
                layoutParams.setMargins(-(this.f10328t * 2), -(A(false) / 50), 0, 0);
                this.f10333y = K;
                f8.l0.F(this.D.V, 2);
                f8.l0.F(this.D.W, 4);
                i10 = 0;
                break;
            case 10:
                this.f10332x = 35;
                layoutParams.setMargins(-(this.f10328t * 5), -(A(false) / 50), 0, 0);
                this.f10333y = H;
                f8.l0.F(this.D.V, 3);
                f8.l0.F(this.D.W, 6);
                break;
            case 11:
                this.D.W.setPadding(0, 0, 0, 0);
                this.f10332x = 1;
                layoutParams.setMargins(-this.f10328t, -(A(false) / 70), 0, 0);
                this.f10333y = P;
                f8.l0.F(this.D.V, 6);
                f8.l0.F(this.D.W, 6);
                i10 = 0;
                break;
            default:
                i10 = 0;
                break;
        }
        this.D.X.removeAllViewsInLayout();
        this.D.X.invalidate();
        int i11 = 0;
        while (true) {
            if (i11 < this.f10333y.length) {
                if (jVar == j.TIME_SCALE) {
                    v(i11, f8.c0.f(Integer.parseInt(r0[i11]) * 60), i10);
                } else {
                    v(i11, this.f10333y[i11] + (char) 176, i10);
                }
                i11++;
            } else {
                this.f10327s = true;
                this.f10326r = false;
                this.C = true;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MEATERScalesView.this.P();
                    }
                }, 100L);
                if (jVar == j.TIME_SCALE) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MEATERScalesView.this.Q();
                        }
                    }, 300L);
                    return;
                }
                return;
            }
        }
    }

    private int U(int i10) {
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            return Temperature.fromFahrenheit(i10);
        }
        return Temperature.fromCelsius(i10);
    }

    private int V() {
        Paint paint = new Paint();
        paint.setTypeface(this.D.W.getTypeface());
        paint.setTextSize(this.D.W.getTextSize());
        return (int) paint.measureText("°");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Y(int i10) {
        int i11 = this.f10332x;
        if (i10 < i11) {
            i10 = i11;
        }
        return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l Z(String str) {
        String replace = str.replace(":", "");
        l lVar = new l();
        if (replace.length() == 3) {
            String substring = replace.substring(0, 2);
            String substring2 = replace.substring(2, 3);
            int parseInt = Integer.parseInt(substring2);
            int parseInt2 = Integer.parseInt(substring);
            if (parseInt > 5) {
                substring2 = "5";
            }
            lVar.e(substring + ":" + substring2);
            lVar.d((parseInt2 * 60) + parseInt);
            return lVar;
        }
        if (replace.length() != 4 && replace.length() != 5) {
            int parseInt3 = Integer.parseInt(replace.trim());
            if (parseInt3 > 24) {
                replace = getResources().getString(2132018313, 24);
                parseInt3 = 24;
            }
            lVar.e(replace);
            lVar.d(parseInt3 * 60);
            return lVar;
        }
        String substring3 = replace.substring(0, 2);
        String substring4 = replace.substring(2, 4);
        int parseInt4 = Integer.parseInt(substring4);
        int parseInt5 = Integer.parseInt(substring3);
        lVar.e(substring3 + ":" + substring4);
        lVar.d((parseInt5 * 60) + parseInt4);
        return lVar;
    }

    private void a0() {
        if (this.D.V.getVisibility() == 0) {
            D();
        }
    }

    private void v(int i10, String str, int i11) {
        if (this.G == j.TIME_SCALE) {
            this.D.X.addView(new j1(this.f10334z, i10, str, true, i11, this.f10325q));
        } else {
            this.D.X.addView(new j1(this.f10334z, i10, str, false, i11, this.f10325q));
        }
    }

    private void w() {
        EditText editText = (EditText) findViewById(2131363057);
        int A = (int) (A(false) / 4.0f);
        editText.getLayoutParams().height = A;
        editText.requestLayout();
        this.D.Y.getLayoutParams().height = (int) (A(false) / 3.0f);
        this.D.Y.requestLayout();
        this.D.Y.setPadding(0, A, 0, 0);
        Log.info("MEATERScalesView_Test", "<adjustViews> pickerTopH (getScreenSize(false) / 4f)  = " + A + " ,getScreenSize(false) / 3f) = " + ((int) (A(false) / 3.0f)) + ", picker toP (pickerTopHeight) = " + A);
    }

    private String x(int i10) {
        return getResources().getString(2132017590, Integer.valueOf(i10));
    }

    private int y() {
        Resources resources = com.apptionlabs.meater_app.app.a.i().getResources();
        int i10 = resources.getConfiguration().orientation;
        int i11 = resources.getDisplayMetrics().widthPixels;
        int f10 = f8.l0.f(600);
        if (com.apptionlabs.meater_app.app.a.f() && i10 != 2) {
            return Math.max(i11, f10);
        }
        return Math.min(i11, f10);
    }

    public void C() {
        this.D.W.setVisibility(0);
        this.D.V.setVisibility(4);
    }

    public void S(j jVar) {
        T(jVar, false);
    }

    public void W(int i10) {
        a0();
        if (this.f10330v < 0) {
            this.f10330v = 0;
        }
        if (this.f10326r) {
            this.f10330v += i10;
        } else {
            this.f10330v = (this.f10330v - this.f10332x) + i10;
        }
        this.D.Y.scrollTo(this.f10330v * this.f10328t, 0);
        this.D.Y.smoothScrollBy(0, 0);
    }

    public void X() {
        k kVar = this.f10331w;
        if (kVar != null) {
            kVar.J(this.f10330v);
        }
    }

    @Override // com.apptionlabs.meater_app.views.ScaleButton.b
    public void a(int i10) {
        W(i10);
    }

    @Override // com.apptionlabs.meater_app.views.k1
    public void b(ScrollViewExt scrollViewExt, int i10, int i11, int i12, int i13) {
        if (this.f10327s) {
            int i14 = this.f10328t;
            int i15 = i10 / i14;
            this.f10330v = i15;
            int i16 = this.f10332x;
            int i17 = i15 + i16;
            int i18 = this.f10329u;
            if (i17 > i18) {
                scrollViewExt.scrollTo((i18 - i16) * i14, 0);
                this.f10330v = this.f10329u - this.f10332x;
            }
            int i19 = this.f10330v + this.f10332x;
            if (i19 != this.B) {
                if (this.G == j.TIME_SCALE) {
                    String Y = Y(i19);
                    this.D.V.setText(Y);
                    this.D.W.setText(Y);
                } else {
                    this.D.V.setText(getResources().getString(2132018313, Integer.valueOf(i19)));
                    this.D.W.setText(x(i19));
                }
                this.B = i19;
            }
            a0();
            this.f10326r = true;
            this.C = false;
            k kVar = this.f10331w;
            if (kVar != null) {
                kVar.J(i19);
            }
        }
    }

    public int getPickerEditTextValue() {
        int i10;
        if (this.f10326r) {
            i10 = this.f10330v + this.f10332x;
        } else {
            i10 = this.f10330v;
        }
        String obj = this.D.V.getText().toString();
        if (!obj.isEmpty()) {
            if (this.G == j.TIME_SCALE) {
                i10 = B(obj);
            } else {
                i10 = Integer.parseInt(obj);
            }
        }
        int i11 = this.f10329u;
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.f10332x;
        if (i10 < i12) {
            return i12;
        }
        return i10;
    }

    public int getScrollToValue() {
        if (this.G == j.TIME_SCALE) {
            int i10 = this.B;
            if (i10 == -1) {
                return this.f10330v;
            }
            return i10;
        }
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            int i11 = this.B;
            if (i11 == -1) {
                i11 = this.f10330v;
            }
            return Temperature.fromFahrenheit(i11);
        }
        int i12 = this.B;
        if (i12 == -1) {
            i12 = this.f10330v;
        }
        return Temperature.fromCelsius(i12);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            if (this.E) {
                return true;
            }
            float f10 = this.F;
            if (f10 > -1.0f && Math.abs(f10 - motionEvent.getX()) > 25.0f) {
                this.E = true;
            }
            this.F = motionEvent.getX();
        } else {
            this.E = false;
            this.F = -1.0f;
        }
        return false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int y10;
        super.onMeasure(i10, i11);
        if (!isInEditMode() && (y10 = y()) != 0 && this.f10325q != y10) {
            this.f10325q = y10;
            F();
            T(this.G, true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.Y.onTouchEvent(motionEvent);
    }

    public void setActivity(Activity activity) {
        this.A = activity;
    }

    public void setInitialTextValue(int i10) {
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            this.D.W.setText(x(Temperature.toFahrenheit(i10)));
        } else {
            this.D.W.setText(x(Temperature.toCelsius(i10)));
        }
    }

    public void setListener(k kVar) {
        this.f10331w = kVar;
    }

    public void setScaleType(j jVar) {
        this.G = jVar;
    }

    public void setScrollToValue(int i10) {
        j jVar = this.G;
        j jVar2 = j.TIME_SCALE;
        if (jVar == jVar2) {
            this.D.W.setText(Y(i10));
        } else {
            this.D.W.setText(x(Temperature.convertToUserScale(i10)));
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                i10 = Temperature.toFahrenheit(i10);
            } else {
                i10 = Temperature.toCelsius(i10);
            }
        }
        j jVar3 = this.G;
        if (jVar3 != j.G2_COOK_CELSIUS_SCALE && jVar3 != j.G2_COOK_FAHRENHEIT_SCALE && jVar3 != j.COOK_CELSIUS_SCALE && jVar3 != j.COOK_FAHRENHEIT_SCALE && jVar3 != jVar2) {
            this.f10330v = i10 + this.f10332x;
        } else {
            this.f10330v = i10;
        }
    }

    public void z(int i10) {
        k kVar;
        j jVar = this.G;
        j jVar2 = j.TIME_SCALE;
        if (jVar != jVar2) {
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                i10 = Temperature.toFahrenheit(i10);
            } else {
                i10 = Temperature.toCelsius(i10);
            }
        } else if (i10 <= 1) {
            i10 = 1;
        }
        int i11 = this.f10329u;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 >= 0) {
            this.f10330v = i10;
            this.f10326r = false;
            this.D.Y.scrollTo((i10 - this.f10332x) * this.f10328t, 0);
            if (i10 == 0 && (kVar = this.f10331w) != null) {
                kVar.J(this.f10330v);
            }
        }
        if (this.G == jVar2) {
            this.D.W.setText(Y(this.f10330v));
        } else {
            this.D.W.setText(x(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class c implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f10338a;

        c(ValueAnimator valueAnimator) {
            this.f10338a = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MEATERScalesView.this.C) {
                this.f10338a.start();
            } else {
                MEATERScalesView.this.D.R.getButtonImage().setColorFilter(f8.l0.i(MEATERScalesView.this.f10334z, 2131099682));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f10340a;

        d(ValueAnimator valueAnimator) {
            this.f10340a = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MEATERScalesView.this.C) {
                this.f10340a.start();
            } else {
                MEATERScalesView mEATERScalesView = MEATERScalesView.this;
                mEATERScalesView.D.W.setTextColor(f8.l0.i(mEATERScalesView.f10334z, 2131099682));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f10342a;

        e(ValueAnimator valueAnimator) {
            this.f10342a = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MEATERScalesView.this.C) {
                Handler handler = new Handler(Looper.getMainLooper());
                ValueAnimator valueAnimator = this.f10342a;
                Objects.requireNonNull(valueAnimator);
                handler.postDelayed(new z0(valueAnimator), 2500L);
                return;
            }
            MEATERScalesView.this.D.U.getButtonImage().setColorFilter(f8.l0.h(2131099682));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f10344a;

        f(ValueAnimator valueAnimator) {
            this.f10344a = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MEATERScalesView.this.C) {
                this.f10344a.start();
            }
            MEATERScalesView.this.D.U.getButtonImage().setColorFilter(f8.l0.i(MEATERScalesView.this.f10334z, 2131099682));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f10346a;

        g(ValueAnimator valueAnimator) {
            this.f10346a = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MEATERScalesView.this.C) {
                this.f10346a.start();
            } else {
                MEATERScalesView mEATERScalesView = MEATERScalesView.this;
                mEATERScalesView.D.W.setTextColor(f8.l0.i(mEATERScalesView.f10334z, 2131099682));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class h implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f10348a;

        h(ValueAnimator valueAnimator) {
            this.f10348a = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MEATERScalesView.this.C) {
                Handler handler = new Handler(Looper.getMainLooper());
                ValueAnimator valueAnimator = this.f10348a;
                Objects.requireNonNull(valueAnimator);
                handler.postDelayed(new z0(valueAnimator), 2500L);
                return;
            }
            MEATERScalesView.this.D.R.getButtonImage().setColorFilter(f8.l0.i(MEATERScalesView.this.f10334z, 2131099682));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b implements TextWatcher {

        /* renamed from: q, reason: collision with root package name */
        boolean f10336q = false;

        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().matches("[0-9]+")) {
                MEATERScalesView.this.D.W.setText(editable.toString());
                if (!editable.toString().equals("") && Integer.parseInt(editable.toString()) > MEATERScalesView.this.f10329u) {
                    MEATERScalesView mEATERScalesView = MEATERScalesView.this;
                    mEATERScalesView.D.W.setText(mEATERScalesView.getResources().getString(2132018313, Integer.valueOf(MEATERScalesView.this.f10329u)));
                }
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            MEATERScalesView mEATERScalesView = MEATERScalesView.this;
            if (mEATERScalesView.G == j.TIME_SCALE) {
                mEATERScalesView.D.V.setCursorVisible(false);
                if (!this.f10336q && !charSequence.toString().isEmpty()) {
                    this.f10336q = true;
                    l Z = MEATERScalesView.this.Z(charSequence.toString());
                    MEATERScalesView.this.D.V.setText(Z.c());
                    this.f10336q = false;
                    if (Z.b() > 1439) {
                        MEATERScalesView mEATERScalesView2 = MEATERScalesView.this;
                        mEATERScalesView2.D.W.setText(mEATERScalesView2.getResources().getString(2132018313, 1439));
                    } else {
                        MEATERScalesView mEATERScalesView3 = MEATERScalesView.this;
                        mEATERScalesView3.D.W.setText(mEATERScalesView3.getResources().getString(2132018313, Integer.valueOf(Z.b())));
                    }
                }
                EditText editText = MEATERScalesView.this.D.V;
                editText.setSelection(editText.getText().toString().trim().length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
