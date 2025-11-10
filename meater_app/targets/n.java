package com.apptionlabs.meater_app.targets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.AbstractC0397k;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6.n4;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.activities.MEATERAlertActivity;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.targets.n;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import f8.q0;
import j6.v;
import java.util.ArrayList;
import java.util.List;
import lm.b;

/* compiled from: SetUpPreviousCookFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class n extends h6.a implements v, j6.l {
    n4 A0;
    private ArrayList<Alert> C0;
    private FrameLayout D0;

    /* renamed from: t0, reason: collision with root package name */
    private q5.d f10153t0;

    /* renamed from: u0, reason: collision with root package name */
    private ImageView f10154u0;

    /* renamed from: v0, reason: collision with root package name */
    private SavedCook f10155v0;

    /* renamed from: x0, reason: collision with root package name */
    private MEATERScalesView f10157x0;

    /* renamed from: y0, reason: collision with root package name */
    private j6.h f10158y0;

    /* renamed from: w0, reason: collision with root package name */
    private Probe f10156w0 = null;

    /* renamed from: z0, reason: collision with root package name */
    private int f10159z0 = 60;
    ArrayList<Alert> B0 = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetUpPreviousCookFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements w {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            int fromCelsius;
            String str;
            if (n.this.f10158y0 != null) {
                int pickerEditTextValue = n.this.f10157x0.getPickerEditTextValue();
                if (com.apptionlabs.meater_app.app.a.u().T1()) {
                    fromCelsius = Temperature.fromFahrenheit(pickerEditTextValue);
                } else {
                    fromCelsius = Temperature.fromCelsius(pickerEditTextValue);
                }
                if (n.this.f10155v0.getCookName() != null && !n.this.f10155v0.getCookName().isEmpty()) {
                    str = n.this.f10155v0.getCookName();
                } else {
                    str = null;
                }
                if (n.this.A0.Y.getText().length() > 0) {
                    str = n.this.A0.Y.getText().toString();
                }
                n.this.f10156w0.setAlerts(n.this.C0);
                n.this.f10156w0.setmCut(MeatCutsHelper.getInstance().getMeatCut(n.this.f10155v0.getCutId()));
                n.this.f10156w0.setTargetInternalTemperature(fromCelsius);
                n.this.f10156w0.setCookName(str);
                n.this.f10156w0.setTargetMinimumAmbientTemperature(n.this.f10155v0.getTargetMinimumAmbientTemperature());
                n.this.f10156w0.setTargetMaximumAmbientTemperature(n.this.f10155v0.getTargetMaximumAmbientTemperature());
                if (n.this.f10158y0 != null) {
                    lm.b.g(b.EnumC0292b.B0.title, "", "");
                    n.this.f10158y0.K(n.this.f10156w0, MeaterTargetSetupActivity.c.PROBE_INSTRUCTION, null, -1);
                }
            }
        }

        @Override // androidx.core.view.w
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // androidx.core.view.w
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(2131689483, menu);
            View inflate = n.this.S().getLayoutInflater().inflate(2131558434, (ViewGroup) new LinearLayout(n.this.S()), false);
            menu.findItem(2131362862).setActionView(inflate);
            TextView textView = (TextView) inflate.findViewById(2131361903);
            textView.setText(n.this.A0(2132018171));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.targets.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.a.this.f(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetUpPreviousCookFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b extends RecyclerView.u {
        b(n nVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            super.b(recyclerView, i10, i11);
        }
    }

    private void D2(String str) {
        String str2 = str + " " + A0(2132018780);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(l0.h(2131099779)), 0, str2.indexOf(40), 18);
        this.A0.Y.setHint(spannableStringBuilder);
    }

    private String E2() {
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.f10155v0.getCutId());
        if (meatCut != null) {
            return ((SearchableMeatCut) meatCut).getParentPath();
        }
        return "";
    }

    private void F2(View view) {
        this.f10158y0 = (j6.h) S();
        this.f10155v0 = LocalStorage.sharedStorage().savedCookDAO().f(W().getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
        this.f10156w0 = (Probe) l0.k(W(), MEATERIntent.EXTRA_PROBE, Probe.class);
        MEATERScalesView mEATERScalesView = (MEATERScalesView) view.findViewById(2131363419);
        this.f10157x0 = mEATERScalesView;
        mEATERScalesView.setActivity(S());
        this.f10157x0.setScrollToValue(Temperature.fromCelsius(60));
        S().setTitle(A0(2132018675));
        q0.f(this.A0.f8061h0, MeatCutsHelper.getInstance().getMeatIcon(this.f10155v0.getCutId()));
        q0.d(this.A0.f8061h0.getBackground(), Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(this.f10155v0.getCutId())), false);
        q0.f(this.A0.f8061h0, MeatCutsHelper.getInstance().getMeatIcon(this.f10155v0.getCutId()));
        this.A0.Y.setSaveFromParentEnabled(false);
        this.A0.Y.setSaveEnabled(true);
        this.A0.Y.setText(this.f10155v0.getCookName());
        List<Alert> alerts = this.f10155v0.getAlerts();
        this.C0 = new ArrayList<>();
        this.f10156w0.getAlerts().clear();
        if (alerts.size() > 0) {
            for (Alert alert : alerts) {
                alert.setState(AlarmState.ALARM_STATE_NOT_READY);
                this.C0.add(alert);
                this.B0.add(alert);
                this.f10156w0.getAlerts().add(alert);
            }
        }
        int size = alerts.size();
        if (size == 0) {
            this.A0.W.setText(A0(2132018305));
            this.A0.T.setVisibility(8);
        } else if (size == 1) {
            this.A0.W.setText(A0(2132018342));
            this.A0.T.setVisibility(0);
        } else {
            this.A0.W.setText(B0(2132018314, Integer.valueOf(size)));
            this.A0.T.setVisibility(0);
        }
        new LinearLayoutManager(view.getContext()).G2(0);
        this.A0.V.setLayoutManager(new CustomLinearLayoutManager(S(), 1, false));
        q5.d dVar = new q5.d();
        this.f10153t0 = dVar;
        dVar.U(new ArrayList(this.C0), this.f10156w0);
        this.A0.V.setAdapter(this.f10153t0);
        this.A0.V.j(new l1());
        this.f10153t0.V(this);
        this.A0.V.n(new b(this));
        I2();
        ImageView imageView = (ImageView) view.findViewById(2131361949);
        this.f10154u0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: c8.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.apptionlabs.meater_app.targets.n.this.G2(view2);
            }
        });
        if (this.f10155v0.getCookName() != null && !this.f10155v0.getCookName().isEmpty()) {
            String trim = this.f10155v0.getCookName().trim();
            this.A0.Y.setText(trim);
            this.A0.Y.setTempCookName(trim);
        } else if (this.f10155v0.getCutId() == 0) {
            D2(A0(2132017581));
        } else {
            D2(E2());
        }
        this.f10159z0 = this.f10155v0.getTargetTemperature();
        lm.b.m(S(), "Customise Previous Cook");
        this.D0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G2(View view) {
        if (this.C0.size() < 4) {
            this.f10156w0.setAlerts(this.C0);
            Intent intent = new Intent(S(), (Class<?>) MEATERAlertActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10156w0);
            bundle.putBoolean("copy_alert", true);
            bundle.putSerializable("AT", MEATERAlertActivity.c.COPY_ALERT_ONLY);
            bundle.putSerializable("AS", MEATERAlertActivity.d.ALERT_TYPE_LIST);
            intent.putExtra("bundle", bundle);
            CookHistory cookHistory = (CookHistory) S();
            if (cookHistory != null) {
                cookHistory.f9335k0.a(intent);
            }
        }
    }

    public static n H2() {
        n nVar = new n();
        nVar.k2(new Bundle());
        return nVar;
    }

    private void I2() {
        if (this.C0.size() == 1) {
            this.A0.W.setText(A0(2132018342));
        } else {
            this.A0.W.setText(B0(2132018314, Integer.valueOf(this.C0.size())));
        }
        if (this.C0.size() > 0) {
            this.A0.T.setVisibility(0);
        } else {
            this.A0.T.setVisibility(8);
        }
    }

    @Override // j6.v
    public void A(int i10) {
        this.f10156w0.setAlerts(this.C0);
        Intent intent = new Intent(S(), (Class<?>) MEATERAlertActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10156w0);
        bundle.putInt("copy_index", i10);
        bundle.putSerializable("AT", MEATERAlertActivity.c.COPY_ALERT_UPDATE);
        bundle.putSerializable("AS", MEATERAlertActivity.d.ALERT_TYPE_LIST);
        intent.putExtra("bundle", bundle);
        CookHistory cookHistory = (CookHistory) S();
        if (cookHistory != null) {
            cookHistory.f9335k0.a(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        super.X0(context);
        ((CookHistory) S()).f9332h0 = this;
    }

    @Override // j6.v
    public void a(int i10) {
        if (!l0.z(i10, this.C0.size())) {
            return;
        }
        this.f10153t0.N(i10);
        this.C0.remove(i10);
        I2();
        this.f10153t0.n();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c2().U(new a(), F0(), AbstractC0397k.b.RESUMED);
        FrameLayout frameLayout = new FrameLayout(Y());
        this.D0 = frameLayout;
        n4 n4Var = (n4) androidx.databinding.g.h(layoutInflater, 2131558548, frameLayout, false);
        this.A0 = n4Var;
        F2(n4Var.v());
        return this.D0;
    }

    @Override // j6.l
    public void f(Intent intent) {
        if (intent != null) {
            Alert alert = (Alert) l0.k(intent.getExtras(), "alarm", Alert.class);
            int intExtra = intent.getIntExtra("index", -1);
            if (intExtra == -1) {
                this.C0.add(alert);
                this.f10153t0.M(alert);
            } else {
                this.C0.set(intExtra, alert);
                this.f10153t0.W(alert, intExtra);
            }
            I2();
            this.f10153t0.n();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D0.removeAllViews();
        if (S() == null) {
            return;
        }
        n4 n4Var = (n4) androidx.databinding.g.h((LayoutInflater) S().getSystemService("layout_inflater"), 2131558548, null, false);
        this.A0 = n4Var;
        F2(n4Var.v());
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        this.f10159z0 = this.f10157x0.getScrollToValue();
        S().getWindow().setSoftInputMode(3);
        l0.u(S(), this.A0.Y);
        super.q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        int i10 = this.f10159z0;
        this.f10157x0.C();
        this.f10157x0.setScrollToValue(i10);
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            this.f10157x0.S(MEATERScalesView.j.COOK_FAHRENHEIT_SCALE);
        } else {
            this.f10157x0.S(MEATERScalesView.j.COOK_CELSIUS_SCALE);
        }
        this.f10153t0.n();
        S().getWindow().setSoftInputMode(3);
        if (this.C0.size() < 4) {
            this.f10154u0.setVisibility(0);
        } else {
            this.f10154u0.setVisibility(4);
        }
    }
}
