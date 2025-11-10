package com.apptionlabs.meater_app.targets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.AbstractC0397k;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.w;
import androidx.recyclerview.widget.RecyclerView;
import b6.v4;
import com.apptionlabs.meater_app.activities.MEATERAlertActivity;
import com.apptionlabs.meater_app.data.DoneOnEditorActionListener;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.targets.i;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import j6.v;
import java.util.ArrayList;
import java.util.Iterator;
import lm.b;

/* compiled from: CustomCookFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class i extends h6.a implements v, j6.l {
    j6.h A0;
    MEATERScalesView B0;
    v4 D0;

    /* renamed from: t0, reason: collision with root package name */
    boolean f10132t0;

    /* renamed from: u0, reason: collision with root package name */
    Probe f10133u0;

    /* renamed from: v0, reason: collision with root package name */
    TextView f10134v0;

    /* renamed from: w0, reason: collision with root package name */
    String f10135w0;

    /* renamed from: x0, reason: collision with root package name */
    String f10136x0;

    /* renamed from: y0, reason: collision with root package name */
    q5.d f10137y0;

    /* renamed from: z0, reason: collision with root package name */
    ArrayList<Alert> f10138z0 = new ArrayList<>();
    private ArrayList<Alert> C0 = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomCookFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements w {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            String str;
            com.apptionlabs.meater_app.app.a.u().Q0(true);
            if (i.this.D0.X.getText() != null && i.this.D0.X.getText().length() > 0) {
                str = i.this.D0.X.getText().toString();
            } else {
                str = null;
            }
            i iVar = i.this;
            if (iVar.f10135w0 == null) {
                Iterator it = iVar.C0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Alert alert = (Alert) it.next();
                    if (alert.getType() == AlarmType.ALARM_TYPE_ESTIMATE_READY) {
                        i.this.C0.remove(alert);
                        break;
                    }
                }
            }
            i.this.f10133u0.setCookName(str);
            i iVar2 = i.this;
            iVar2.f10133u0.setTargetInternalTemperature(iVar2.B2());
            i iVar3 = i.this;
            iVar3.f10133u0.setAlerts(iVar3.C0);
            i iVar4 = i.this;
            if (iVar4.A0 != null) {
                if (iVar4.S() != null) {
                    lm.b.g(b.EnumC0292b.N.title, "", "");
                }
                i iVar5 = i.this;
                iVar5.A0.K(iVar5.f10133u0, MeaterTargetSetupActivity.c.TEMPERATURE_SELECTION, null, -1);
            }
        }

        @Override // androidx.core.view.w
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // androidx.core.view.w
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(2131689483, menu);
            View inflate = i.this.S().getLayoutInflater().inflate(2131558434, (ViewGroup) null);
            menu.findItem(2131362862).setActionView(inflate);
            i.this.f10134v0 = (TextView) inflate.findViewById(2131361903);
            i iVar = i.this;
            String str = iVar.f10135w0;
            if (str != null) {
                iVar.f10134v0.setText(str);
            } else {
                iVar.f10134v0.setText(2132018171);
            }
            i.this.f10134v0.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.targets.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.a.this.f(view);
                }
            });
        }
    }

    /* compiled from: CustomCookFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends RecyclerView.u {
        b(i iVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public int B2() {
        int i10;
        boolean T1 = com.apptionlabs.meater_app.app.a.u().T1();
        if (T1) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        if (this.B0.getScrollToValue() > i10) {
            return this.B0.getScrollToValue();
        }
        if (T1) {
            return Temperature.fromFahrenheit(60);
        }
        return Temperature.fromCelsius(60);
    }

    private MEATERScalesView.j C2() {
        MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(this.f10133u0.getProbeNumber());
        if (typeFromProbeNumber != null && typeFromProbeNumber.isG2Probe()) {
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                return MEATERScalesView.j.G2_COOK_FAHRENHEIT_SCALE;
            }
            return MEATERScalesView.j.G2_COOK_CELSIUS_SCALE;
        }
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            return MEATERScalesView.j.COOK_FAHRENHEIT_SCALE;
        }
        return MEATERScalesView.j.COOK_CELSIUS_SCALE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D2(View view) {
        l0.H(S(), "https://youtu.be/hsjUlzmo3o8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E2(View view) {
        MeaterTargetSetupActivity meaterTargetSetupActivity;
        if (this.C0.size() < 4) {
            this.f10132t0 = false;
            Intent intent = new Intent(S(), (Class<?>) MEATERAlertActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10133u0);
            bundle.putBoolean("copy_alert", true);
            bundle.putBoolean("alreadyHaveEstimate", F2());
            bundle.putSerializable("AT", MEATERAlertActivity.c.COPY_ALERT_ONLY);
            bundle.putSerializable("AS", MEATERAlertActivity.d.ALERT_TYPE_LIST);
            intent.putExtra("bundle", bundle);
            if ((S() instanceof MeaterTargetSetupActivity) && (meaterTargetSetupActivity = (MeaterTargetSetupActivity) S()) != null) {
                meaterTargetSetupActivity.f10076j0.a(intent);
            }
        }
    }

    private boolean F2() {
        Iterator<Alert> it = this.C0.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == AlarmType.ALARM_TYPE_ESTIMATE_READY) {
                return true;
            }
        }
        return false;
    }

    private void G2() {
        if (S() != null && K0()) {
            int size = this.C0.size();
            if (size > 0) {
                this.D0.f8353i0.setVisibility(0);
                this.D0.f8352h0.setVisibility(0);
            } else {
                this.D0.f8353i0.setVisibility(8);
                this.D0.f8352h0.setVisibility(8);
            }
            if (size == 1) {
                this.D0.Q.setText(A0(2132018342));
            } else {
                this.D0.Q.setText(B0(2132018314, Integer.valueOf(size)));
            }
            if (this.C0.size() < 4) {
                this.D0.R.setVisibility(0);
            } else {
                this.D0.R.setVisibility(4);
            }
        }
    }

    private void H2(View view) {
        int f10;
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        if (u0().getConfiguration().orientation == 2) {
            f10 = (int) u0().getDimension(2131165827);
        } else {
            f10 = l0.f(com.apptionlabs.meater_app.app.a.i().getResources().getDisplayMetrics().widthPixels);
        }
        bVar.T = f10;
    }

    @Override // j6.v
    public void A(int i10) {
        MeaterTargetSetupActivity meaterTargetSetupActivity;
        this.f10132t0 = true;
        this.f10133u0.setAlerts(this.C0);
        Intent intent = new Intent(S(), (Class<?>) MEATERAlertActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10133u0);
        bundle.putInt("copy_index", i10);
        bundle.putSerializable("AT", MEATERAlertActivity.c.COPY_ALERT_UPDATE);
        bundle.putSerializable("AS", MEATERAlertActivity.d.ALERT_TYPE_LIST);
        intent.putExtra("bundle", bundle);
        if ((S() instanceof MeaterTargetSetupActivity) && (meaterTargetSetupActivity = (MeaterTargetSetupActivity) S()) != null) {
            meaterTargetSetupActivity.f10076j0.a(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        super.X0(context);
        ((MeaterTargetSetupActivity) S()).f10069c0 = this;
    }

    @Override // j6.v
    public void a(int i10) {
        if (!l0.z(i10, this.C0.size())) {
            return;
        }
        this.f10137y0.N(i10);
        this.C0.remove(i10);
        G2();
        this.f10137y0.n();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c2().U(new a(), F0(), AbstractC0397k.b.RESUMED);
        this.A0 = (j6.h) S();
        v4 v4Var = (v4) androidx.databinding.g.h(layoutInflater, 2131558552, viewGroup, false);
        this.D0 = v4Var;
        View v10 = v4Var.v();
        MEATERScalesView mEATERScalesView = (MEATERScalesView) v10.findViewById(2131363419);
        this.B0 = mEATERScalesView;
        mEATERScalesView.setActivity(S());
        this.B0.setScrollToValue(Temperature.fromCelsius(60));
        Bundle W = W();
        this.A0 = (j6.h) S();
        LinearLayout linearLayout = (LinearLayout) v10.findViewById(2131363645);
        ((LinearLayout) v10.findViewById(2131362616)).setOnClickListener(new View.OnClickListener() { // from class: c8.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.apptionlabs.meater_app.targets.i.this.D2(view);
            }
        });
        if (W == null) {
            this.f10133u0 = new Probe();
        } else {
            this.f10133u0 = (Probe) l0.k(W, MEATERIntent.EXTRA_PROBE, Probe.class);
        }
        Probe probe = this.f10133u0;
        if (probe != null) {
            this.f10133u0 = probe.m4clone();
        }
        if (this.f10133u0.appearsToHaveCookInProgress()) {
            linearLayout.setVisibility(8);
            this.A0.d();
            this.D0.X.setText(this.f10133u0.getCookName());
            this.f10136x0 = this.f10133u0.getCookName();
            this.f10135w0 = A0(2132018165);
        } else {
            this.f10133u0.setTargetInternalTemperature(Temperature.fromCelsius(60));
        }
        this.B0.setScrollToValue(this.f10133u0.getTargetInternalTemperature());
        this.C0 = new ArrayList<>();
        ArrayList<Alert> alerts = this.f10133u0.getAlerts();
        int size = alerts.size();
        if (this.f10133u0 != null && size > 0) {
            if (alerts.size() == 1) {
                this.D0.Q.setText(A0(2132018341));
            } else {
                this.D0.Q.setText(B0(2132018312, Integer.valueOf(size)));
            }
            for (Alert alert : alerts) {
                this.C0.add(alert);
                this.f10138z0.add(alert);
            }
        }
        RecyclerView recyclerView = (RecyclerView) v10.findViewById(2131361950);
        recyclerView.setLayoutManager(new CustomLinearLayoutManager(S(), 1, false));
        q5.d dVar = new q5.d();
        this.f10137y0 = dVar;
        dVar.U(new ArrayList(this.C0), this.f10133u0);
        recyclerView.setAdapter(this.f10137y0);
        recyclerView.j(new l1());
        this.f10137y0.V(this);
        recyclerView.n(new b(this));
        this.D0.R.setOnClickListener(new View.OnClickListener() { // from class: c8.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.apptionlabs.meater_app.targets.i.this.E2(view);
            }
        });
        this.D0.X.setOnEditorActionListener(new DoneOnEditorActionListener());
        this.D0.X.addTextChangedListener(new c());
        return v10;
    }

    @Override // j6.l
    public void f(Intent intent) {
        if (intent != null) {
            Alert alert = (Alert) l0.k(intent.getExtras(), "alarm", Alert.class);
            int intExtra = intent.getIntExtra("index", -1);
            if (alert != null && alert.getCreatedDate() == 0) {
                alert.setCreatedDate(System.currentTimeMillis());
            }
            if (intExtra == -1) {
                this.C0.add(alert);
                this.f10137y0.M(alert);
            } else {
                this.C0.set(intExtra, alert);
                this.f10137y0.W(alert, intExtra);
            }
            G2();
            this.f10137y0.n();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H2(this.D0.f8349e0);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        this.f10133u0.setTargetInternalTemperature(B2());
        S().getWindow().setSoftInputMode(3);
        l0.u(S(), this.D0.X);
        super.q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.B0.C();
        this.B0.S(C2());
        this.B0.setScrollToValue(this.f10133u0.getTargetInternalTemperature());
        if (this.f10135w0 != null) {
            lm.b.m(S(), "Adjust Cook (Custom)");
        } else {
            lm.b.m(S(), "Setup Cook (Custom)");
        }
        if (!this.f10133u0.appearsToHaveCookInProgress()) {
            G2();
        }
        this.f10137y0.n();
        S().getWindow().setSoftInputMode(3);
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
    }

    /* compiled from: CustomCookFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            String replaceAll = obj.replaceAll("(\\r|\\n|\\r\\n)+", " ");
            if (replaceAll.getBytes().length > 31) {
                i iVar = i.this;
                iVar.D0.X.setText(iVar.f10136x0);
                if (i.this.f10136x0.length() > 1) {
                    i iVar2 = i.this;
                    iVar2.D0.X.setSelection(iVar2.f10136x0.trim().length());
                    return;
                }
                return;
            }
            if (!replaceAll.equals(obj)) {
                i.this.D0.X.setText(replaceAll);
            }
            i.this.f10136x0 = replaceAll;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
