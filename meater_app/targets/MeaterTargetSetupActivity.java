package com.apptionlabs.meater_app.targets;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import b6.y;
import c8.w;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.activities.SearchActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatCategory;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutType;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.targets.a;
import com.apptionlabs.meater_app.targets.l;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import f8.a0;
import f8.l0;
import h6.x2;
import java.util.ArrayList;
import java.util.Locale;
import lm.b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterTargetSetupActivity extends com.apptionlabs.meater_app.activities.j implements l.c, a.InterfaceC0147a, j6.h {

    /* renamed from: b0, reason: collision with root package name */
    y f10068b0;

    /* renamed from: c0, reason: collision with root package name */
    public j6.l f10069c0;

    /* renamed from: d0, reason: collision with root package name */
    AlertDialog f10070d0;

    /* renamed from: g0, reason: collision with root package name */
    private Probe f10073g0;

    /* renamed from: a0, reason: collision with root package name */
    public b f10067a0 = new b(this);

    /* renamed from: e0, reason: collision with root package name */
    private boolean f10071e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    o f10072f0 = new a(true);

    /* renamed from: h0, reason: collision with root package name */
    android.view.result.c<Intent> f10074h0 = f0(new e.d(), new android.view.result.b() { // from class: c8.x
        @Override // android.view.result.b
        public final void a(Object obj) {
            MeaterTargetSetupActivity.this.l2((android.view.result.a) obj);
        }
    });

    /* renamed from: i0, reason: collision with root package name */
    android.view.result.c<Intent> f10075i0 = f0(new e.d(), new android.view.result.b() { // from class: c8.y
        @Override // android.view.result.b
        public final void a(Object obj) {
            MeaterTargetSetupActivity.this.m2((android.view.result.a) obj);
        }
    });

    /* renamed from: j0, reason: collision with root package name */
    public android.view.result.c<Intent> f10076j0 = f0(new e.d(), new android.view.result.b() { // from class: c8.z
        @Override // android.view.result.b
        public final void a(Object obj) {
            MeaterTargetSetupActivity.this.n2((android.view.result.a) obj);
        }
    });

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (MeaterTargetSetupActivity.this.m0().r0() > 0) {
                if (MeaterTargetSetupActivity.this.f10073g0.appearsToHaveCookInProgress()) {
                    MeaterTargetSetupActivity.this.finish();
                    return;
                } else {
                    MeaterTargetSetupActivity.this.m0().e1();
                    return;
                }
            }
            MeaterTargetSetupActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        int f10078a;

        /* renamed from: b, reason: collision with root package name */
        int f10079b;

        /* renamed from: c, reason: collision with root package name */
        int f10080c;

        /* renamed from: d, reason: collision with root package name */
        int f10081d;

        b(MeaterTargetSetupActivity meaterTargetSetupActivity) {
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum c {
        TEMPERATURE_SELECTION,
        PROBE_INSTRUCTION,
        CHARGER_INSTRUCTION,
        PREVIOUS_COOKS,
        TEMPERATURE_GRAPH
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2(android.view.result.a aVar) {
        if (aVar.a() == null) {
            return;
        }
        int intExtra = aVar.a().getIntExtra(MEATERIntent.EXTRA_CUT_ID, 0);
        MeatModel meatModel = new MeatModel();
        meatModel.id = Integer.valueOf(intExtra);
        this.f10067a0.f10081d = intExtra;
        w2(f.j3(meatModel, -1, this.f10073g0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(android.view.result.a aVar) {
        if (aVar.a().getBooleanExtra(MEATERIntent.INTENT_COOK_STARTED, false)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(android.view.result.a aVar) {
        j6.l lVar;
        if (aVar.a() != null && (lVar = this.f10069c0) != null) {
            lVar.f(aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2(Probe probe) {
        probe.confirmCookSetup();
        b1.f10472l = false;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(a0.b bVar) {
        if (bVar != a0.b.f12463s) {
            s2(bVar, this.f10073g0);
        } else {
            this.f10073g0.confirmCookSetup();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2() {
        this.f10071e0 = false;
    }

    private void s2(a0.b bVar, final Probe probe) {
        AlertDialog e10 = e0.INSTANCE.e(this, getString(bVar.n()), getString(bVar.i()), false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: c8.c0
            @Override // j6.e
            public final void a() {
                MeaterTargetSetupActivity.this.o2(probe);
            }
        }), null, null);
        this.f10070d0 = e10;
        e10.show();
    }

    private void t2(String str, String str2, final a0.b bVar) {
        String string;
        int i10;
        e0.AlertPair alertPair;
        e0.Companion companion = e0.INSTANCE;
        if (str != null) {
            string = str;
        } else {
            string = getString(2132018011);
        }
        if (str == null) {
            i10 = 2132018978;
        } else {
            i10 = 2132018340;
        }
        e0.AlertPair alertPair2 = new e0.AlertPair(getString(i10), new j6.e() { // from class: c8.a0
            @Override // j6.e
            public final void a() {
                MeaterTargetSetupActivity.this.p2(bVar);
            }
        });
        if (str == null) {
            alertPair = new e0.AlertPair(getString(2132018306), new j6.e() { // from class: c8.b0
                @Override // j6.e
                public final void a() {
                    MeaterTargetSetupActivity.this.q2();
                }
            });
        } else {
            alertPair = null;
        }
        AlertDialog e10 = companion.e(this, string, str2, false, alertPair2, alertPair, null);
        this.f10070d0 = e10;
        e10.show();
    }

    private void u2(Probe probe) {
        boolean z10;
        if (probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f10071e0) {
            this.f10073g0 = probe;
            this.f10071e0 = true;
            if (z10) {
                probe.confirmCookSetup();
                finish();
                return;
            }
            a0.b b10 = a0.INSTANCE.b(this);
            Probe probe2 = (Probe) c6.h.f8879a.o(probe.getDeviceID());
            if (!y2(probe2, probe2, b10)) {
                if (b10 != a0.b.f12463s) {
                    s2(b10, probe);
                } else {
                    probe.confirmCookSetup();
                    finish();
                }
            }
        }
    }

    private void w2(Fragment fragment) {
        if (fragment != null) {
            m0().p().t(2131362016, fragment).h("").j();
        }
    }

    private void x2(String str) {
        if (str == null) {
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -389582555:
                if (str.equals("poultry")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3019812:
                if (str.equals("beef")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3143256:
                if (str.equals("fish")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3314122:
                if (str.equals("lamb")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3446904:
                if (str.equals("pork")) {
                    c10 = 4;
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                lm.b.g(b.EnumC0292b.f17315d1.title, "", "");
                return;
            case 1:
                lm.b.g(b.EnumC0292b.f17311b1.title, "", "");
                return;
            case 2:
                lm.b.g(b.EnumC0292b.f17319f1.title, "", "");
                return;
            case 3:
                lm.b.g(b.EnumC0292b.f17317e1.title, "", "");
                return;
            case 4:
                lm.b.g(b.EnumC0292b.f17313c1.title, "", "");
                return;
            case 5:
                lm.b.g(b.EnumC0292b.f17321g1.title, "", "");
                return;
            default:
                return;
        }
    }

    private boolean y2(Probe probe, MEATERDevice mEATERDevice, a0.b bVar) {
        while (mEATERDevice != null) {
            int MEATERDeviceAvailableCookDurationForBatteryLevel = MEATERDeviceType.INSTANCE.MEATERDeviceAvailableCookDurationForBatteryLevel(mEATERDevice.getNormalizedBatteryLevel(), mEATERDevice.getMEATERDeviceType());
            if (mEATERDevice.hasLowBattery() && probe != null && probe.getCookState() == DeviceCookState.COOK_STATE_NOT_STARTED) {
                String deviceName = mEATERDevice.getDeviceName();
                Locale locale = Locale.US;
                t2(null, String.format(locale, getString(2132017601), deviceName) + "\n" + String.format(locale, getString(2132017262), deviceName), bVar);
                return true;
            }
            if (MEATERDeviceAvailableCookDurationForBatteryLevel != -1) {
                String deviceName2 = mEATERDevice.getDeviceName();
                t2(getString(2132017270), String.format(Locale.US, getString(2132017417), deviceName2, mEATERDevice.getBatteryLevel() + "", MEATERDeviceAvailableCookDurationForBatteryLevel + ""), bVar);
                return true;
            }
            mEATERDevice = mEATERDevice.getParentDevice();
        }
        return false;
    }

    @Override // j6.h
    public void K(Probe probe, c cVar, SavedCook savedCook, int i10) {
        if (probe == null) {
            finish();
            return;
        }
        if (cVar == c.PREVIOUS_COOKS) {
            x2 T2 = x2.T2();
            Bundle bundle = new Bundle();
            bundle.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, savedCook.getCookID());
            bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, x2.d.PREVIOUS_COOK.ordinal());
            T2.k2(bundle);
            w2(T2);
            return;
        }
        if (cVar == c.TEMPERATURE_GRAPH) {
            n H2 = n.H2();
            Bundle bundle2 = new Bundle();
            bundle2.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, savedCook.getCookID());
            bundle2.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10073g0);
            H2.k2(bundle2);
            w2(H2);
            return;
        }
        if (com.apptionlabs.meater_app.app.a.u().h0() && !probe.appearsToHaveCookInProgress() && cVar == c.TEMPERATURE_SELECTION) {
            w2(d8.f.M2(probe));
            return;
        }
        if (com.apptionlabs.meater_app.app.a.u().Y() && !probe.appearsToHaveCookInProgress() && (cVar == c.TEMPERATURE_SELECTION || cVar == c.PROBE_INSTRUCTION)) {
            w2(d8.a.O2(probe));
        } else {
            u2(probe);
        }
    }

    @Override // com.apptionlabs.meater_app.targets.a.InterfaceC0147a
    public void k(com.apptionlabs.meater_app.targets.a<?, ?> aVar, MeatModel meatModel) {
        Probe probe;
        Fragment j32;
        if (meatModel != null && (probe = this.f10073g0) != null) {
            if (meatModel instanceof MeatCategory) {
                this.f10067a0.f10078a = meatModel.id.intValue();
                j32 = k.W2(meatModel);
            } else if (meatModel instanceof Meat) {
                Meat meat = (Meat) meatModel;
                this.f10067a0.f10079b = meat.cutTypes.get(0).id.intValue();
                ArrayList<SearchableMeatCut> filteredCutsByCountry = MeatCutsHelper.getInstance().getFilteredCutsByCountry(Locale.getDefault().getCountry(), meat.cutTypes.get(0).cuts);
                if (meat.cutTypes.size() > 1) {
                    w2(k.W2(meatModel));
                    j32 = null;
                } else if (filteredCutsByCountry.size() > 1) {
                    j32 = j.W2(meatModel);
                } else {
                    this.f10067a0.f10081d = meatModel.id.intValue();
                    j32 = f.j3(filteredCutsByCountry.get(0), -1, this.f10073g0);
                }
            } else if (meatModel instanceof MeatCutType) {
                this.f10067a0.f10080c = meatModel.id.intValue();
                j32 = j.W2(meatModel);
            } else {
                boolean z10 = meatModel instanceof MeatCut;
                if (z10 && probe.getMEATERDeviceType().isG2Probe()) {
                    this.f10067a0.f10081d = meatModel.id.intValue();
                    j32 = d.D2(meatModel, this.f10073g0);
                } else {
                    if (z10) {
                        this.f10067a0.f10081d = meatModel.id.intValue();
                        j32 = f.j3(meatModel, -1, this.f10073g0);
                    }
                    j32 = null;
                }
            }
            if (j32 != null) {
                w2(j32);
            }
        }
    }

    public void k2() {
        this.f10073g0.resetCook();
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10073g0);
        bundle.putLong(MEATERIntent.EXTRA_DEVICE_ID, this.f10073g0.getDeviceID());
        iVar.k2(bundle);
        w2(iVar);
        if (x0() != null) {
            x0().I();
        }
    }

    @Override // com.apptionlabs.meater_app.targets.l.c
    public void o(MeatModel meatModel) {
        Fragment W2;
        this.f10067a0.f10078a = meatModel.id.intValue();
        b bVar = this.f10067a0;
        bVar.f10080c = 0;
        bVar.f10079b = 0;
        bVar.f10081d = 0;
        com.apptionlabs.meater_app.targets.b.V0 = -1;
        if (MeatCutsHelper.getInstance().categoryHasMoreThenOneAnimal(meatModel.id.intValue())) {
            W2 = j.W2(meatModel);
        } else {
            W2 = k.W2(meatModel);
        }
        w2(W2);
        x2(meatModel.name);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        Probe probe = (Probe) l0.k(bundleExtra, MEATERIntent.EXTRA_PROBE, Probe.class);
        this.f10073g0 = probe;
        if (probe != null) {
            this.f10073g0 = probe.m4clone();
        }
        this.f10068b0 = (y) androidx.databinding.g.j(this, 2131558448);
        if (this.f10073g0.appearsToHaveCookInProgress()) {
            FragmentManager m02 = m0();
            setTitle(getString(2132017220));
            MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(bundleExtra.getInt(MEATERIntent.EXTRA_CUT_ID, -1));
            if (meatCut != null) {
                if (m02.i0(2131362016) == null) {
                    w2(f.j3(meatCut, MeatCutsHelper.getInstance().getRangeIndex(meatCut.temperatureRanges, bundleExtra.getInt(MEATERIntent.EXTRA_PRESET_ID, -1)), this.f10073g0));
                }
            } else {
                i iVar = new i();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(MEATERIntent.EXTRA_PROBE, this.f10073g0);
                bundle2.putLong(MEATERIntent.EXTRA_DEVICE_ID, this.f10073g0.getDeviceID());
                iVar.k2(bundle2);
                w2(iVar);
            }
        } else {
            FragmentManager m03 = m0();
            n0 p10 = m03.p();
            if (m03.i0(2131362016) == null) {
                p10.b(2131362016, new w());
                p10.j();
            }
        }
        getOnBackPressedDispatcher().h(this, this.f10072f0);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        AlertDialog alertDialog = this.f10070d0;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void r2() {
        lm.b.g(b.EnumC0292b.f17364y0.title, "", "");
        Intent intent = new Intent(this, (Class<?>) CookHistory.class);
        intent.putExtra("PC", true);
        intent.putExtra(MEATERIntent.EXTRA_PREVIOUS_COOK_CONTEXT, CookHistory.b.setUp.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_PROBE, this.f10073g0);
        this.f10075i0.a(intent);
    }

    public void v2() {
        this.f10074h0.a(new Intent(this, (Class<?>) SearchActivity.class));
    }

    @Override // j6.h
    public void d() {
    }
}
