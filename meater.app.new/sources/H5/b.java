package H5;

import L4.T;
import P5.Q;
import android.content.Intent;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.MEATERAlertActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import java.util.ArrayList;
import s1.InterfaceC4420A;
import x4.g;

/* compiled from: AddAlertFragment.java */
/* loaded from: classes2.dex */
public class b extends Fragment implements MEATERScalesView.j {

    /* renamed from: G0, reason: collision with root package name */
    Probe f5563G0;

    /* renamed from: H0, reason: collision with root package name */
    int f5564H0;

    /* renamed from: I0, reason: collision with root package name */
    int f5565I0;

    /* renamed from: L0, reason: collision with root package name */
    MEATERScalesView f5568L0;

    /* renamed from: N0, reason: collision with root package name */
    T f5570N0;

    /* renamed from: J0, reason: collision with root package name */
    MEATERAlertActivity.c f5566J0 = MEATERAlertActivity.c.COPY_ALERT_ONLY;

    /* renamed from: K0, reason: collision with root package name */
    int f5567K0 = 60;

    /* renamed from: M0, reason: collision with root package name */
    String f5569M0 = "";

    /* compiled from: AddAlertFragment.java */
    class a implements InterfaceC4420A {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            Alert alert;
            ArrayList<Alert> alerts = b.this.f5563G0.getAlerts();
            if (alerts.size() <= 3 || b.this.f5566J0 != MEATERAlertActivity.c.ALERT_ONLY) {
                int pickerEditTextValue = b.this.f5568L0.getPickerEditTextValue();
                b bVar = b.this;
                MEATERAlertActivity.c cVar = bVar.f5566J0;
                if (cVar != MEATERAlertActivity.c.ALERT_UPDATE && cVar != MEATERAlertActivity.c.COPY_ALERT_UPDATE) {
                    x4.b.l(bVar.T(), "Create Alert");
                    alert = new Alert();
                    alert.setName(b.this.f5570N0.f9607b.getText().toString());
                    alert.setType(AlarmType.fromValue(b.this.f5564H0));
                    alert.setCreatedDate(System.currentTimeMillis());
                    int iFromFahrenheit = g.t().n1() ? Temperature.fromFahrenheit(pickerEditTextValue) : Temperature.fromCelsius(pickerEditTextValue);
                    if (b.this.f5564H0 < AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()) {
                        alert.setLimit(iFromFahrenheit);
                    } else {
                        alert.setLimit(pickerEditTextValue * 60);
                    }
                    if (alert.needsToFireForProbe(b.this.f5563G0)) {
                        alert.setState(AlarmState.ALARM_STATE_NOT_READY);
                    } else {
                        alert.setState(AlarmState.ALARM_STATE_READY);
                    }
                    b.this.f5563G0.getAlerts().add(alert);
                    b.this.f5563G0.markCookSetupModified();
                    alert.updateAnalyticsForCurrentAlert();
                } else {
                    if (!Q.y(bVar.f5565I0, alerts.size())) {
                        b.this.T().finish();
                        return;
                    }
                    alert = alerts.get(b.this.f5565I0);
                    int iFromFahrenheit2 = g.t().n1() ? Temperature.fromFahrenheit(pickerEditTextValue) : Temperature.fromCelsius(pickerEditTextValue);
                    if (b.this.f5564H0 < AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()) {
                        alert.setLimit(iFromFahrenheit2);
                        x4.b.l(b.this.T(), "Edit Alert (Temperature-based)");
                    } else {
                        alert.setLimit(pickerEditTextValue * 60);
                        x4.b.l(b.this.T(), "Edit Alert (Time-based)");
                    }
                    alert.setName(b.this.f5570N0.f9607b.getText().toString());
                    if (alert.getType() == AlarmType.ALARM_TYPE_REPEAT_DURATION) {
                        alert.setCreatedDate(System.currentTimeMillis());
                    }
                    if (alert.needsToFireForProbe(b.this.f5563G0)) {
                        alert.setState(AlarmState.ALARM_STATE_NOT_READY);
                    } else {
                        alert.setState(AlarmState.ALARM_STATE_READY);
                    }
                    b.this.f5563G0.markCookSetupModified();
                }
                b bVar2 = b.this;
                MEATERAlertActivity.c cVar2 = bVar2.f5566J0;
                if (cVar2 != MEATERAlertActivity.c.COPY_ALERT_ONLY && cVar2 != MEATERAlertActivity.c.COPY_ALERT_UPDATE) {
                    bVar2.T().finish();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra(MEATERIntent.EXTRA_PROBE, b.this.f5563G0);
                b bVar3 = b.this;
                if (bVar3.f5566J0 == MEATERAlertActivity.c.COPY_ALERT_UPDATE) {
                    intent.putExtra("index", bVar3.f5565I0);
                } else {
                    intent.putExtra("index", -1);
                }
                intent.putExtra("alarm", alert);
                b.this.T().setResult(-1, intent);
                b.this.T().finish();
            }
        }

        @Override // s1.InterfaceC4420A
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // s1.InterfaceC4420A
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.menu_add_alert_fragment, menu);
            View viewInflate = b.this.c2().getLayoutInflater().inflate(R.layout.action_bar_menu_layout, (ViewGroup) new LinearLayout(b.this.T()), false);
            menu.findItem(R.id.menu_add_alert_text).setActionView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
            b bVar = b.this;
            MEATERAlertActivity.c cVar = bVar.f5566J0;
            if (cVar == MEATERAlertActivity.c.ALERT_UPDATE || cVar == MEATERAlertActivity.c.COPY_ALERT_UPDATE) {
                textView.setText(bVar.A0(R.string.menu_text_done));
            } else {
                textView.setText(bVar.A0(R.string.menu_text_add));
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: H5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5562B.f(view);
                }
            });
        }
    }

    /* compiled from: AddAlertFragment.java */
    /* renamed from: H5.b$b, reason: collision with other inner class name */
    class C0106b implements TextView.OnEditorActionListener {
        C0106b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 6) {
                return false;
            }
            ((InputMethodManager) b.this.T().getSystemService("input_method")).hideSoftInputFromWindow(b.this.f5570N0.f9607b.getWindowToken(), 0);
            return true;
        }
    }

    /* compiled from: AddAlertFragment.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5573a;

        static {
            int[] iArr = new int[AlarmType.values().length];
            f5573a = iArr;
            try {
                iArr[AlarmType.ALARM_TYPE_MAX_AMBIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5573a[AlarmType.ALARM_TYPE_MIN_AMBIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5573a[AlarmType.ALARM_TYPE_MAX_INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5573a[AlarmType.ALARM_TYPE_MIN_INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5573a[AlarmType.ALARM_TYPE_TIME_BEFORE_READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5573a[AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private MEATERScalesView.i A2() {
        MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(this.f5563G0.getProbeNumber());
        return (typeFromProbeNumber == null || !typeFromProbeNumber.isG2Probe()) ? g.t().n1() ? MEATERScalesView.i.INTERNAL_FAHRENHEIT_SCALE : MEATERScalesView.i.INTERNAL_CELSIUS_SCALE : g.t().n1() ? MEATERScalesView.i.G2_COOK_FAHRENHEIT_SCALE : MEATERScalesView.i.G2_COOK_CELSIUS_SCALE;
    }

    private int x2(Alert alert) {
        int i10 = c.f5573a[alert.getType().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? R.string.alert_me_label : R.string.alert_me_internal_temperature_falls_below_label : R.string.alert_me_internal_temperature_rises_above_label : R.string.alert_me_ambient_temperature_falls_below_label : R.string.alert_me_ambient_temperature_rises_above_label;
    }

    private int y2(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? R.string.alert_me_label : R.string.alert_me_every : R.string.alert_me_internal_temperature_rises_above_label : R.string.alert_me_internal_temperature_falls_below_label : R.string.alert_me_ambient_temperature_rises_above_label : R.string.alert_me_ambient_temperature_falls_below_label;
    }

    private MEATERScalesView.i z2() {
        MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(this.f5563G0.getProbeNumber());
        return (typeFromProbeNumber == null || !typeFromProbeNumber.isG2Probe()) ? g.t().n1() ? MEATERScalesView.i.AMBIENT_FAHRENHEIT_SCALE : MEATERScalesView.i.AMBIENT_CELSIUS_SCALE : g.t().n1() ? MEATERScalesView.i.G2_AMBIENT_FAHRENHEIT_SCALE : MEATERScalesView.i.G2_AMBIENT_CELSIUS_SCALE;
    }

    @Override // com.apptionlabs.meater_app.views.MEATERScalesView.j
    public void J(int i10) {
        if (K0() && this.f5564H0 == 4) {
            if (i10 == 1 || i10 == 60) {
                this.f5570N0.f9612g.setText(A0(R.string.has_elapsed_dotted_label));
            } else {
                this.f5570N0.f9612g.setText(A0(R.string.have_elapsed_dotted_label));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strA0;
        MEATERAlertActivity.c cVar;
        c2().d0(new a(), F0(), AbstractC2106m.b.RESUMED);
        T tC = T.c(layoutInflater, viewGroup, false);
        this.f5570N0 = tC;
        ConstraintLayout constraintLayoutB = tC.b();
        MEATERScalesView mEATERScalesView = (MEATERScalesView) constraintLayoutB.findViewById(R.id.temp_picker);
        this.f5568L0 = mEATERScalesView;
        mEATERScalesView.setActivity(T());
        this.f5568L0.setListener(this);
        Bundle bundleX = X();
        this.f5565I0 = bundleX.getInt("index", 0);
        this.f5564H0 = bundleX.getInt("index", 0);
        this.f5563G0 = (Probe) Q.k(bundleX, MEATERIntent.EXTRA_PROBE, Probe.class);
        this.f5566J0 = (MEATERAlertActivity.c) Q.m(bundleX, "AT", MEATERAlertActivity.c.class);
        if (Q.y(this.f5564H0, this.f5563G0.getAlerts().size()) && ((cVar = this.f5566J0) == MEATERAlertActivity.c.ALERT_UPDATE || cVar == MEATERAlertActivity.c.COPY_ALERT_UPDATE)) {
            T().setTitle(A0(R.string.edit_label));
            int i10 = this.f5564H0;
            if (i10 < 0 || i10 >= this.f5563G0.getAlerts().size()) {
                T().finish();
                this.f5564H0 = 0;
            }
            strA0 = A0(x2(this.f5563G0.getAlerts().get(this.f5564H0)));
            Alert alert = this.f5563G0.getAlerts().get(this.f5564H0);
            this.f5564H0 = alert.getType().ordinal();
            if (alert.getName() != null) {
                this.f5570N0.f9607b.setText(alert.getName());
                this.f5569M0 = alert.getName();
            }
            if (this.f5564H0 < AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()) {
                this.f5567K0 = alert.getLimit();
            } else {
                this.f5567K0 = alert.getLimit() / 60;
            }
        } else {
            T().setTitle(A0(R.string.title_activity_alert));
            strA0 = A0(y2(this.f5564H0));
        }
        this.f5570N0.f9611f.setText(strA0);
        Q.E(this.f5570N0.f9607b, 29);
        this.f5570N0.f9607b.setOnEditorActionListener(new C0106b());
        if (this.f5564H0 == AlarmType.ALARM_TYPE_TIME_BEFORE_READY.getValue()) {
            this.f5570N0.f9612g.setVisibility(0);
            this.f5570N0.f9618m.setVisibility(0);
            this.f5570N0.f9611f.setText(A0(R.string.alert_me_label));
            this.f5570N0.f9612g.setText(A0(R.string.before_the_cook_end_label));
        } else if (this.f5564H0 == AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()) {
            this.f5570N0.f9612g.setVisibility(0);
            this.f5570N0.f9618m.setVisibility(0);
            this.f5570N0.f9611f.setText(A0(R.string.alert_me_when_label));
            int i11 = this.f5567K0;
            if (i11 == 1 || i11 == 60) {
                this.f5570N0.f9612g.setText(A0(R.string.has_elapsed_dotted_label));
            } else {
                this.f5570N0.f9612g.setText(A0(R.string.have_elapsed_dotted_label));
            }
        } else if (this.f5564H0 == AlarmType.ALARM_TYPE_REPEAT_DURATION.getValue()) {
            this.f5570N0.f9612g.setVisibility(0);
            this.f5570N0.f9618m.setVisibility(0);
            this.f5570N0.f9611f.setText(A0(R.string.alert_me_every));
            this.f5570N0.f9612g.setText(A0(R.string.minutes_text));
        } else {
            this.f5570N0.f9612g.setVisibility(8);
            this.f5570N0.f9618m.setVisibility(8);
        }
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        this.f5567K0 = this.f5568L0.getScrollToValue();
        T().getWindow().setSoftInputMode(3);
        super.q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        int i10 = this.f5567K0;
        MEATERAlertActivity.c cVar = this.f5566J0;
        if (cVar == MEATERAlertActivity.c.ALERT_ONLY || cVar == MEATERAlertActivity.c.COPY_ALERT_ONLY) {
            Alert alertAlertWithTypeForProbe = Alert.alertWithTypeForProbe(AlarmType.fromValue(this.f5564H0), this.f5563G0);
            int limit = alertAlertWithTypeForProbe.getLimit();
            i10 = (alertAlertWithTypeForProbe.getType() == AlarmType.ALARM_TYPE_TIME_BEFORE_READY || alertAlertWithTypeForProbe.getType() == AlarmType.ALARM_TYPE_TIME_FROM_NOW || alertAlertWithTypeForProbe.getType() == AlarmType.ALARM_TYPE_REPEAT_DURATION) ? limit / 60 : limit;
        }
        if (this.f5564H0 == AlarmType.ALARM_TYPE_MIN_AMBIENT.ordinal() || this.f5564H0 == AlarmType.ALARM_TYPE_MAX_AMBIENT.ordinal()) {
            this.f5568L0.S(z2());
        } else if (this.f5564H0 == AlarmType.ALARM_TYPE_MIN_INTERNAL.ordinal() || this.f5564H0 == AlarmType.ALARM_TYPE_MAX_INTERNAL.ordinal()) {
            this.f5568L0.S(A2());
        } else {
            MEATERScalesView mEATERScalesView = this.f5568L0;
            MEATERScalesView.i iVar = MEATERScalesView.i.TIME_SCALE;
            mEATERScalesView.setScaleType(iVar);
            this.f5568L0.S(iVar);
        }
        this.f5568L0.C();
        this.f5568L0.setScrollToValue(i10);
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
    }
}
