package c5;

import L5.c;
import P5.Q;
import P5.S;
import V4.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import java.io.IOException;
import java.util.Objects;
import z4.C5194y;

/* compiled from: MEATERRedNotificationBar.java */
/* renamed from: c5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogC2319g extends Dialog implements View.OnTouchListener {

    /* renamed from: B, reason: collision with root package name */
    private final com.apptionlabs.meater_app.activities.d f31034B;

    /* renamed from: C, reason: collision with root package name */
    private c.b f31035C;

    /* renamed from: D, reason: collision with root package name */
    private CountDownTimer f31036D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f31037E;

    /* renamed from: F, reason: collision with root package name */
    private String f31038F;

    /* renamed from: G, reason: collision with root package name */
    private Probe f31039G;

    /* renamed from: H, reason: collision with root package name */
    private Alert f31040H;

    /* renamed from: I, reason: collision with root package name */
    private MCNotificationType f31041I;

    /* compiled from: MEATERRedNotificationBar.java */
    /* renamed from: c5.g$a */
    class a extends CountDownTimer {
        a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() throws IllegalStateException {
            DialogC2319g.this.f31035C.k();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) throws IllegalStateException {
            if (DialogC2319g.this.f31037E) {
                DialogC2319g.this.f31035C.f(true);
            } else if (j10 < 4998000) {
                DialogC2319g.this.g();
                DialogC2319g.this.f31035C.k();
                cancel();
            }
        }
    }

    /* compiled from: MEATERRedNotificationBar.java */
    /* renamed from: c5.g$b */
    private class b extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent.getY() - motionEvent2.getY() <= 100.0f || Math.abs(f11) <= 190.0f) {
                DialogC2319g.this.v(true);
                return false;
            }
            if (Objects.equals(DialogC2319g.this.f31038F, MEATERIntent.ESTIMATOR_NOT_AVAIL_ABLE)) {
                x4.g.t().G0(true);
            }
            DialogC2319g.this.g();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        private b() {
        }
    }

    private DialogC2319g(com.apptionlabs.meater_app.activities.d dVar) {
        super(dVar, R.style.ThemeDialogCustom);
        setContentView(R.layout.toast);
        this.f31034B = dVar;
        this.f31035C = L5.c.p(dVar).j(f());
        r();
    }

    private Uri f() {
        return x4.g.t().f().p(this.f31034B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        if (gestureDetector.onTouchEvent(motionEvent)) {
            v(true);
        } else {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return true;
    }

    private void q(String str, String str2, int i10) {
        ((TextView) findViewById(R.id.titleText)).setText(str);
        ((TextView) findViewById(R.id.descriptionText)).setText(str2);
        ImageView imageView = (ImageView) findViewById(R.id.title_image);
        if (Q.v(getContext())) {
            S.h(imageView, R.color.grey_f6, true);
        }
        if (i10 <= 0) {
            i10 = R.drawable.bell;
        }
        imageView.setImageResource(i10);
    }

    private void r() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 48;
            attributes.flags = 32;
        }
        final GestureDetector gestureDetector = new GestureDetector(this.f31034B, new b());
        ((LinearLayout) findViewById(R.id.toast_layout_root)).setOnTouchListener(new View.OnTouchListener() { // from class: c5.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f31032B.l(gestureDetector, view, motionEvent);
            }
        });
    }

    private void s() throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        this.f31035C.g(true);
        this.f31037E = t();
        a aVar = new a(5000000, 10000);
        this.f31036D = aVar;
        aVar.start();
    }

    private boolean t() {
        if (x4.g.t().Y()) {
            return false;
        }
        MCNotificationType mCNotificationType = this.f31041I;
        if (mCNotificationType == null) {
            return true;
        }
        return (mCNotificationType == MCNotificationType.NOTIFICATION_TYPE_WARNING || mCNotificationType == MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST) ? false : true;
    }

    private void u() {
        this.f31037E = false;
        CountDownTimer countDownTimer = this.f31036D;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z10) {
        Alert alert = this.f31040H;
        if (alert != null && this.f31039G != null) {
            alert.setState(AlarmState.ALARM_STATE_DISMISSED);
            Probe probe = this.f31039G;
            probe.setSetupSeqNum(probe.getSetupSeqNum() + 1);
            l.g0().P(this.f31039G);
        }
        if (this.f31039G != null && z10) {
            androidx.appcompat.app.c cVarK = x4.g.k();
            if (cVarK instanceof com.apptionlabs.meater_app.activities.d) {
                com.apptionlabs.meater_app.activities.d dVar = (com.apptionlabs.meater_app.activities.d) cVarK;
                K4.b bVarG = K4.a.f8678a.g(this.f31039G.getDeviceID());
                if (bVarG != null) {
                    U4.b.t("Starting Recipe screen", new Object[0]);
                    dVar.y1(Long.valueOf(bVarG.getOngoingRecipeId()), bVarG.getRecipeId());
                } else {
                    dVar.x1(this.f31039G);
                }
            }
        }
        if (Objects.equals(this.f31038F, MEATERIntent.BLE_DISABLED_MESSAGE)) {
            C5194y.p();
        }
        if (z10 && Objects.equals(this.f31038F, MEATERIntent.ESTIMATOR_NOT_AVAIL_ABLE)) {
            x4.g.t().G0(true);
            Q.G(this.f31034B, "https://support.meater.com/faq/no-estimate");
        }
        g();
    }

    public static DialogC2319g w(com.apptionlabs.meater_app.activities.d dVar, String str, String str2) {
        return x(dVar, str, str2, 0);
    }

    public static DialogC2319g x(com.apptionlabs.meater_app.activities.d dVar, String str, String str2, int i10) {
        DialogC2319g dialogC2319g = new DialogC2319g(dVar);
        dialogC2319g.q(str, str2, i10);
        return dialogC2319g;
    }

    public void g() {
        if (!this.f31034B.isFinishing() && isShowing()) {
            this.f31034B.u1();
        }
        Alert alert = this.f31040H;
        if (alert != null) {
            alert.setState(AlarmState.ALARM_STATE_DISMISSED);
        }
    }

    public MCNotificationType h() {
        return this.f31041I;
    }

    public Alert i() {
        return this.f31040H;
    }

    public Probe j() {
        return this.f31039G;
    }

    public String k() {
        return this.f31038F;
    }

    public void m(MCNotificationType mCNotificationType) {
        this.f31041I = mCNotificationType;
        if (mCNotificationType != null) {
            this.f31035C = L5.c.p(this.f31034B).j(L5.c.q(x4.g.h(), L5.c.r(mCNotificationType)));
        }
    }

    public void n(Alert alert) {
        this.f31040H = alert;
    }

    public void o(Probe probe) {
        this.f31039G = probe;
    }

    @Override // android.app.Dialog
    public void onStart() throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        super.onStart();
        s();
    }

    @Override // android.app.Dialog
    public void onStop() {
        u();
        g();
        super.onStop();
        v(false);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public void p(String str) {
        this.f31038F = str;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        u();
    }
}
