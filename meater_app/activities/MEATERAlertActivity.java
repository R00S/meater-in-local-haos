package com.apptionlabs.meater_app.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.n0;
import androidx.recyclerview.widget.RecyclerView;
import c6.h;
import com.apptionlabs.meater_app.activities.MEATERAlertActivity;
import com.apptionlabs.meater_app.data.Content;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import j6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q5.t;
import q5.y0;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERAlertActivity extends j implements v {

    /* renamed from: a0, reason: collision with root package name */
    b6.c f9390a0;

    /* renamed from: b0, reason: collision with root package name */
    View f9391b0;

    /* renamed from: c0, reason: collision with root package name */
    private ArrayList<Content> f9392c0;

    /* renamed from: d0, reason: collision with root package name */
    private Probe f9393d0;

    /* renamed from: e0, reason: collision with root package name */
    private ImageView f9394e0;

    /* renamed from: j0, reason: collision with root package name */
    RecyclerView f9399j0;

    /* renamed from: n0, reason: collision with root package name */
    private t f9403n0;

    /* renamed from: o0, reason: collision with root package name */
    Bundle f9404o0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f9395f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f9396g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f9397h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    private final q5.d f9398i0 = new q5.d();

    /* renamed from: k0, reason: collision with root package name */
    private c f9400k0 = c.ALERT_ONLY;

    /* renamed from: l0, reason: collision with root package name */
    d f9401l0 = d.ALERT_TYPE_LIST;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f9402m0 = false;

    /* renamed from: p0, reason: collision with root package name */
    Integer[] f9405p0 = {0, 3, 6, 11};

    /* renamed from: q0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f9406q0 = new a();

    /* renamed from: r0, reason: collision with root package name */
    android.view.o f9407r0 = new b(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (MEATERAlertActivity.this.f9402m0) {
                return;
            }
            if (MEATERAlertActivity.this.f9393d0.isLegacyBlockProbe()) {
                MEATERAlertActivity.this.B2(i10);
                return;
            }
            if (MEATERAlertActivity.this.C2() && i10 > 9) {
                i10++;
            }
            if (i10 == 12) {
                l0.H(MEATERAlertActivity.this, "https://youtu.be/F2g4LzPLaMQ");
                return;
            }
            if (i10 == 13) {
                l0.H(MEATERAlertActivity.this, "https://youtu.be/BZaL_o5kgTM");
                return;
            }
            if (i10 == 10) {
                if (MEATERAlertActivity.this.f9400k0 == c.COPY_ALERT_ONLY) {
                    Alert alert = new Alert();
                    alert.setType(AlarmType.ALARM_TYPE_ESTIMATE_READY);
                    alert.setState(AlarmState.ALARM_STATE_NOT_READY);
                    alert.setIsNewAlert(false);
                    alert.setCreatedDate(System.currentTimeMillis());
                    alert.updateAnalyticsForCurrentAlert();
                    Intent intent = new Intent();
                    intent.putExtra(MEATERIntent.EXTRA_PROBE, MEATERAlertActivity.this.f9393d0);
                    intent.putExtra("index", -1);
                    intent.putExtra("alarm", alert);
                    MEATERAlertActivity.this.setResult(-1, intent);
                } else {
                    MEATERAlertActivity.this.f9393d0.createDefaultEstimateAlert();
                    MEATERAlertActivity.this.f9393d0.markCookSetupModified();
                }
                MEATERAlertActivity.this.finish();
                return;
            }
            if (i10 > -1 && i10 < MEATERAlertActivity.this.f9392c0.size()) {
                MEATERAlertActivity mEATERAlertActivity = MEATERAlertActivity.this;
                mEATERAlertActivity.G2(mEATERAlertActivity.w2(((Content) mEATERAlertActivity.f9392c0.get(i10)).getContent()), MEATERAlertActivity.this.f9400k0);
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends android.view.o {
        b(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            int i10;
            MEATERAlertActivity.this.f9402m0 = false;
            if (!MEATERAlertActivity.this.f9395f0 && MEATERAlertActivity.this.m0().r0() > 0) {
                MEATERAlertActivity mEATERAlertActivity = MEATERAlertActivity.this;
                mEATERAlertActivity.f9401l0 = d.ADD_ALERT_FRAGMENT;
                if (mEATERAlertActivity.f9400k0 != c.ALERT_ONLY && MEATERAlertActivity.this.f9400k0 != c.COPY_ALERT_ONLY) {
                    MEATERAlertActivity.this.finish();
                    return;
                }
                MEATERAlertActivity mEATERAlertActivity2 = MEATERAlertActivity.this;
                mEATERAlertActivity2.setTitle(mEATERAlertActivity2.getString(2132018823));
                MEATERAlertActivity.this.f9394e0.setVisibility(4);
                MEATERAlertActivity.this.m0().e1();
                return;
            }
            if (MEATERAlertActivity.this.f9396g0 && MEATERAlertActivity.this.f9393d0.getAlerts().size() > 0 && MEATERAlertActivity.this.f9400k0 != c.COPY_ALERT_ONLY) {
                MEATERAlertActivity mEATERAlertActivity3 = MEATERAlertActivity.this;
                mEATERAlertActivity3.f9401l0 = d.ALERT_LIST;
                mEATERAlertActivity3.setTitle(mEATERAlertActivity3.getString(2132017233));
                if (MEATERAlertActivity.this.m0().r0() > 0) {
                    MEATERAlertActivity.this.m0().e1();
                }
                MEATERAlertActivity mEATERAlertActivity4 = MEATERAlertActivity.this;
                RelativeLayout relativeLayout = mEATERAlertActivity4.f9390a0.f7581a0;
                if (mEATERAlertActivity4.f9401l0 != d.ALERT_TYPE_LIST && mEATERAlertActivity4.f9393d0 != null && MEATERAlertActivity.this.f9393d0.getMEATERDeviceType().isG2Probe() && MEATERAlertActivity.this.f9393d0.appearsToHaveCookInProgress()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                relativeLayout.setVisibility(i10);
                MEATERAlertActivity.this.E2();
                MEATERAlertActivity.this.f9397h0 = true;
                MEATERAlertActivity.this.f9394e0.setVisibility(0);
                MEATERAlertActivity.this.f9396g0 = false;
                return;
            }
            MEATERAlertActivity mEATERAlertActivity5 = MEATERAlertActivity.this;
            mEATERAlertActivity5.f9401l0 = d.ALERT_LIST;
            mEATERAlertActivity5.finish();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum c {
        ALERT_ONLY,
        ALERT_UPDATE,
        COPY_ALERT_ONLY,
        COPY_ALERT_UPDATE
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum d {
        ALERT_TYPE_LIST,
        ALERT_LIST,
        ADD_ALERT_FRAGMENT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A2(View view) {
        if (this.f9393d0.getAlerts().size() < 4) {
            this.f9390a0.f7581a0.setVisibility(8);
            this.f9401l0 = d.ALERT_TYPE_LIST;
            y0.I();
            setTitle(getString(2132018823));
            this.f9397h0 = false;
            this.f9396g0 = true;
            F2();
            this.f9390a0.f7584d0.setAdapter((ListAdapter) this.f9403n0);
            this.f9390a0.f7584d0.addFooterView(this.f9391b0);
            this.f9394e0.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2(int i10) {
        if (i10 == 10) {
            l0.H(this, "https://youtu.be/F2g4LzPLaMQ");
            return;
        }
        if (i10 == 11) {
            l0.H(this, "https://youtu.be/BZaL_o5kgTM");
        } else if (i10 > -1 && i10 < this.f9392c0.size()) {
            G2(w2(this.f9392c0.get(i10).getContent()), this.f9400k0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C2() {
        Bundle bundle = this.f9404o0;
        if (bundle != null && bundle.getBoolean("alreadyHaveEstimate", false)) {
            return true;
        }
        return this.f9393d0.probeAlreadyHaveEstimateAlert();
    }

    private void D2() {
        c cVar = this.f9400k0;
        if (cVar == c.COPY_ALERT_ONLY) {
            F2();
            this.f9390a0.f7584d0.setAdapter((ListAdapter) this.f9403n0);
            this.f9390a0.f7584d0.addFooterView(this.f9391b0);
            this.f9401l0 = d.ALERT_TYPE_LIST;
            this.f9396g0 = true;
            return;
        }
        c cVar2 = c.COPY_ALERT_UPDATE;
        if (cVar == cVar2) {
            G2(this.f9404o0.getInt("copy_index", 0), cVar2);
            return;
        }
        if (this.f9393d0.getAlerts().size() < 1) {
            F2();
            this.f9390a0.f7584d0.setAdapter((ListAdapter) this.f9403n0);
            this.f9390a0.f7584d0.addFooterView(this.f9391b0);
            this.f9401l0 = d.ALERT_TYPE_LIST;
            return;
        }
        this.f9401l0 = d.ALERT_LIST;
        I2();
        this.f9399j0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2() {
        this.f9390a0.W.setVisibility(0);
        this.f9390a0.Z.setVisibility(0);
        this.f9390a0.f7584d0.setVisibility(8);
    }

    private void F2() {
        this.f9390a0.f7584d0.setVisibility(0);
        this.f9390a0.Z.setVisibility(8);
        this.f9390a0.W.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2(int i10, c cVar) {
        this.f9395f0 = this.f9397h0;
        this.f9402m0 = true;
        Bundle bundle = new Bundle();
        bundle.putInt("index", i10);
        this.f9401l0 = d.ADD_ALERT_FRAGMENT;
        bundle.putSerializable("AT", cVar);
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f9393d0);
        x7.b bVar = new x7.b();
        n0 p10 = m0().p();
        p10.b(2131361940, bVar);
        bVar.k2(bundle);
        p10.h(null);
        p10.j();
    }

    private void H2() {
        int i10;
        ImageView imageView = this.f9394e0;
        if (imageView != null) {
            if (this.f9393d0.getAlerts().size() < 4) {
                i10 = l0.i(this, 2131100472);
            } else {
                i10 = -12303292;
            }
            imageView.setColorFilter(i10);
        }
    }

    private void I2() {
        setTitle(getString(2132017233));
        E2();
        this.f9398i0.n();
        this.f9397h0 = true;
    }

    private void J2() {
        int size = this.f9393d0.getAlerts().size();
        if (size == 0) {
            this.f9390a0.S.setText(getString(2132018304).toUpperCase());
            this.f9390a0.Z.setVisibility(8);
            this.f9390a0.Y.setVisibility(8);
        } else {
            if (size == 1) {
                this.f9390a0.Z.setVisibility(0);
                this.f9390a0.Y.setVisibility(0);
                this.f9390a0.S.setText(getString(2132018341).toUpperCase());
                if (this.f9401l0 == d.ALERT_LIST) {
                    I2();
                    return;
                }
                return;
            }
            this.f9390a0.Z.setVisibility(0);
            this.f9390a0.Y.setVisibility(0);
            this.f9390a0.S.setText(getString(2132018312, Integer.valueOf(size)).toUpperCase());
            if (this.f9401l0 == d.ALERT_LIST) {
                I2();
            }
        }
    }

    private void v2() {
        RecyclerView recyclerView = (RecyclerView) findViewById(2131361950);
        this.f9399j0 = recyclerView;
        recyclerView.setLayoutManager(new CustomLinearLayoutManager(this, 1, false));
        this.f9398i0.U(this.f9393d0.getAlerts(), this.f9393d0);
        this.f9399j0.setAdapter(this.f9398i0);
        this.f9399j0.j(new l1());
        this.f9398i0.V(this);
        this.f9403n0 = new t(this, this.f9392c0, true);
        this.f9391b0 = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131558509, (ViewGroup) null, false);
        if (x0() != null) {
            x0().B(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w2(String str) {
        if (str.equalsIgnoreCase(getString(2132017193))) {
            return 0;
        }
        if (str.equalsIgnoreCase(getString(2132017192))) {
            return 1;
        }
        if (str.equalsIgnoreCase(getString(2132017199))) {
            return 2;
        }
        if (str.equalsIgnoreCase(getString(2132017198))) {
            return 3;
        }
        if (str.equalsIgnoreCase(getString(2132017202))) {
            return 4;
        }
        if (str.equalsIgnoreCase(getString(2132017201))) {
            return 5;
        }
        if (!str.equalsIgnoreCase(getString(2132018537))) {
            return 0;
        }
        return 6;
    }

    private void x2() {
        Resources resources;
        int i10;
        boolean z10;
        boolean C2 = C2();
        List asList = Arrays.asList(this.f9405p0);
        this.f9390a0.f7584d0.setOnItemClickListener(this.f9406q0);
        if (this.f9393d0.isLegacyBlockProbe()) {
            resources = getResources();
            i10 = 2130903041;
        } else {
            resources = getResources();
            i10 = 2130903040;
        }
        String[] stringArray = resources.getStringArray(i10);
        this.f9392c0 = new ArrayList<>();
        for (int i11 = 0; i11 < stringArray.length; i11++) {
            if (!stringArray[i11].equalsIgnoreCase(getString(2132017688)) || !C2) {
                Content content = new Content();
                if (this.f9393d0.isLegacyBlockProbe()) {
                    if (i11 % 3 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    content.setIsHeader(z10);
                } else {
                    content.setIsHeader(asList.contains(Integer.valueOf(i11)));
                }
                content.setContent(stringArray[i11]);
                this.f9392c0.add(content);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(CompoundButton compoundButton, boolean z10) {
        if (z10) {
            this.f9393d0.setFlareUpAlertState(AlarmState.ALARM_STATE_READY);
        } else {
            this.f9393d0.setFlareUpAlertState(AlarmState.ALARM_STATE_NOT_READY);
        }
        this.f9393d0.markCookSetupModified();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(MEATERDevice mEATERDevice) {
        int i10;
        Probe probe;
        if (this.f9401l0 == d.ALERT_LIST && !this.f9402m0) {
            this.f9398i0.n();
            J2();
            H2();
        }
        RelativeLayout relativeLayout = this.f9390a0.f7581a0;
        if (this.f9401l0 != d.ALERT_TYPE_LIST && (probe = this.f9393d0) != null && probe.getMEATERDeviceType().isG2Probe() && this.f9393d0.appearsToHaveCookInProgress()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        relativeLayout.setVisibility(i10);
    }

    @Override // j6.v
    public void A(int i10) {
        if (this.f9402m0) {
            return;
        }
        this.f9394e0.setVisibility(4);
        G2(i10, c.ALERT_UPDATE);
    }

    @Override // j6.v
    public void a(int i10) {
        if (i10 > -1 && i10 < this.f9393d0.getAlerts().size()) {
            this.f9398i0.N(i10);
            this.f9393d0.getAlerts().remove(i10);
            this.f9393d0.markCookSetupModified();
            if (this.f9393d0.getAlerts().size() == 0) {
                this.f9390a0.Z.setVisibility(8);
                this.f9390a0.Y.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        Probe probe;
        super.onCreate(bundle);
        this.f9390a0 = (b6.c) androidx.databinding.g.j(this, 2131558436);
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        this.f9404o0 = bundleExtra;
        if (bundleExtra != null) {
            long j10 = bundleExtra.getLong("SN", 0L);
            if (j10 != 0) {
                probe = (Probe) c6.h.f8879a.o(j10);
            } else {
                probe = (Probe) l0.k(this.f9404o0, MEATERIntent.EXTRA_PROBE, Probe.class);
            }
            this.f9393d0 = probe;
            this.f9400k0 = (c) l0.m(this.f9404o0, "AT", c.class);
            this.f9401l0 = (d) l0.m(this.f9404o0, "AS", d.class);
        }
        if (this.f9393d0 == null) {
            finish();
            return;
        }
        x2();
        v2();
        D2();
        SwitchCompat switchCompat = this.f9390a0.f7582b0;
        Probe probe2 = this.f9393d0;
        if (probe2 != null && probe2.appearsToHaveCookInProgress() && this.f9393d0.getFlareUpAlertState() == AlarmState.ALARM_STATE_READY) {
            z10 = true;
        } else {
            z10 = false;
        }
        switchCompat.setChecked(z10);
        this.f9390a0.f7582b0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.z2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                MEATERAlertActivity.this.y2(compoundButton, z11);
            }
        });
        c6.h.f8879a.A(this, this.f9393d0.getDeviceID(), new h.a() { // from class: p5.a3
            @Override // c6.h.a
            public final void a(MEATERDevice mEATERDevice) {
                MEATERAlertActivity.this.z2(mEATERDevice);
            }
        });
        getOnBackPressedDispatcher().h(this, this.f9407r0);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        String string;
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131689480, menu);
        if (this.f9393d0 == null) {
            return true;
        }
        View inflate = getLayoutInflater().inflate(2131558433, (ViewGroup) null);
        menu.findItem(2131362856).setActionView(inflate);
        this.f9394e0 = (ImageView) inflate.findViewById(2131361902);
        if (this.f9393d0.getAlerts().size() >= 1 && this.f9400k0 != c.COPY_ALERT_ONLY) {
            if (!this.f9402m0) {
                this.f9394e0.setVisibility(0);
            }
            TextView textView = this.f9390a0.S;
            if (this.f9393d0.getAlerts().size() == 1) {
                string = getString(2132018341);
            } else {
                string = getString(2132018312, Integer.valueOf(this.f9393d0.getAlerts().size()));
            }
            textView.setText(string.toUpperCase());
        } else {
            this.f9394e0.setVisibility(4);
        }
        if (this.f9393d0.getAlerts().size() > 3) {
            this.f9394e0.setColorFilter(-3355444);
        }
        String charSequence = getTitle().toString();
        if (charSequence != null && charSequence.equalsIgnoreCase(getString(2132018823))) {
            this.f9394e0.setVisibility(4);
        }
        this.f9394e0.setOnClickListener(new View.OnClickListener() { // from class: p5.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MEATERAlertActivity.this.A2(view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        y0.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9398i0.n();
    }
}
