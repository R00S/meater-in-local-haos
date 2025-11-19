package R4;

import E4.a;
import L4.C1408w0;
import M4.h;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.AbstractC2106m;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.activities.CookFeedBackActivity;
import com.apptionlabs.meater_app.cloud.requests.CookFeedBack;
import com.apptionlabs.meater_app.cloud.requests.CookMethod;
import com.apptionlabs.meater_app.cloud.requests.PurchaseChannel;
import com.apptionlabs.meater_app.data.Data;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.CookNote;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.views.C2421z;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import s1.InterfaceC4420A;
import x4.b;

/* compiled from: TemperatureGraphFragment.java */
/* loaded from: classes2.dex */
public class T0 extends AbstractC1638a implements a.d {

    /* renamed from: G0, reason: collision with root package name */
    private SavedCook f14867G0;

    /* renamed from: H0, reason: collision with root package name */
    private d f14868H0;

    /* renamed from: I0, reason: collision with root package name */
    private Probe f14869I0;

    /* renamed from: J0, reason: collision with root package name */
    T4.h f14870J0;

    /* renamed from: L0, reason: collision with root package name */
    C1408w0 f14872L0;

    /* renamed from: N0, reason: collision with root package name */
    private T5.c f14874N0;

    /* renamed from: O0, reason: collision with root package name */
    private FrameLayout f14875O0;

    /* renamed from: T0, reason: collision with root package name */
    private e f14880T0;

    /* renamed from: K0, reason: collision with root package name */
    boolean f14871K0 = false;

    /* renamed from: M0, reason: collision with root package name */
    boolean f14873M0 = false;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f14876P0 = true;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f14877Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    private int f14878R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    private final BroadcastReceiver f14879S0 = new b();

    /* compiled from: TemperatureGraphFragment.java */
    class a implements InterfaceC4420A {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean g(MenuItem menuItem) {
            T0.this.e3();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(View view) {
            T0 t02 = T0.this;
            if (t02.f14870J0 == null || t02.f14868H0 != d.PREVIOUS_COOK) {
                return;
            }
            T0 t03 = T0.this;
            t03.f14870J0.K(t03.f14869I0, MeaterTargetSetupActivity.c.TEMPERATURE_GRAPH, T0.this.f14867G0, -1);
        }

        @Override // s1.InterfaceC4420A
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // s1.InterfaceC4420A
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.graph_menu, menu);
            View viewInflate = T0.this.T().getLayoutInflater().inflate(R.layout.graph_action_bar_menu_layout, (ViewGroup) new LinearLayout(T0.this.T()), false);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_target_setup_text);
            menu.findItem(R.id.shareIcon).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: R4.R0
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return this.f14863a.g(menuItem);
                }
            });
            menuItemFindItem.setActionView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
            if (T0.this.f14868H0 == d.PREVIOUS_COOK) {
                textView.setText(R.string.menu_text_repeat);
            } else {
                textView.setVisibility(8);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: R4.S0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14865B.h(view);
                }
            });
        }
    }

    /* compiled from: TemperatureGraphFragment.java */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SavedCook savedCook;
            ArrayList arrayListL;
            Bundle extras = intent.getExtras();
            if (extras == null || intent.getAction() == null) {
                return;
            }
            String action = intent.getAction();
            if (action.equals(ProtocolParameters.MEATER_SERVICE_NOTIF_COOK_FINISH) && T0.this.f14868H0 != d.COOK_SUMMARY) {
                T0.this.c2().finish();
            }
            if (action.equals(MEATERIntent.INTENT_COOK_NOTE) && (arrayListL = P5.Q.l(extras, MEATERIntent.EXTRA_COOK_NOTE_LIST, CookNote.class)) != null) {
                T0.this.h3(arrayListL);
            }
            if (action.equals(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS)) {
                T0 t02 = T0.this;
                if (!t02.N2(t02.f14867G0) || (savedCook = T0.this.f14867G0) == null) {
                    return;
                }
                SavedCook savedCookF = LocalStorage.sharedStorage().savedCookDAO().f(savedCook.getCookID());
                Bundle bundleX = T0.this.X();
                if (bundleX == null || savedCookF == null || T0.this.N2(savedCookF)) {
                    return;
                }
                bundleX.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, savedCookF.getCookID());
                T0.this.o0().r().n(T0.this).i(T0.this).j();
            }
        }
    }

    /* compiled from: TemperatureGraphFragment.java */
    public enum d {
        COOK_IN_PROGRESS,
        COOK_SUMMARY,
        PREVIOUS_COOK,
        COOK_HISTORY
    }

    /* compiled from: TemperatureGraphFragment.java */
    public interface e {
        void k(double d10);
    }

    private void K2(int i10) {
        E4.a aVar = new E4.a();
        aVar.e(this);
        aVar.d(new CookFeedBack(this.f14867G0.cookIDString(), i10));
    }

    private boolean L2() {
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.f14867G0.getCutId());
        if (meatCut == null) {
            return false;
        }
        ArrayList<MeatCookingTemperature> temperatureRangesHavingGradient = MeatCutsHelper.getInstance().getTemperatureRangesHavingGradient(meatCut.temperatureRanges);
        return temperatureRangesHavingGradient.size() >= 2 && U2(temperatureRangesHavingGradient, Temperature.convertToUserScale(this.f14867G0.getPeakTemperature()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    private void M2(View view) {
        a3();
        androidx.fragment.app.o oVarT = T();
        Bundle bundleX = X();
        if (bundleX == null) {
            T().finish();
            return;
        }
        this.f14871K0 = u0().getBoolean(R.bool.amazon_device);
        this.f14870J0 = (T4.h) oVarT;
        this.f14867G0 = LocalStorage.sharedStorage().savedCookDAO().f(bundleX.getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
        this.f14868H0 = d.values()[bundleX.getInt(MEATERIntent.EXTRA_GRAPH_CONTEXT)];
        long j10 = bundleX.getLong(MEATERIntent.EXTRA_DEVICE_ID);
        this.f14873M0 = bundleX.getBoolean(MEATERIntent.EXTRA_ONLY_FOR_SHARE_COOK, false);
        Probe probe = (Probe) P5.Q.k(bundleX, MEATERIntent.EXTRA_PROBE, Probe.class);
        this.f14869I0 = probe;
        if (probe == null && j10 != 0) {
            this.f14869I0 = (Probe) M4.h.f11978a.o(j10);
        }
        if (this.f14867G0 == null) {
            if (oVarT != 0) {
                oVarT.finish();
                return;
            }
            return;
        }
        if (oVarT != 0) {
            this.f14872L0.f10709h.getLayoutParams().height = (int) (P5.Q.n(oVarT, false) * 0.5f);
        }
        d3(new C1670q(), "detail");
        Z2();
        this.f14872L0.f10709h.setTargetTemp(this.f14867G0.getTargetTemperature());
        this.f14872L0.f10712k.setRating(this.f14867G0.getFeedback());
        X2(false);
        Y2(false);
        d dVar = this.f14868H0;
        if (dVar == d.COOK_IN_PROGRESS) {
            this.f14872L0.f10721t.setTitle(R.string.temperature_graph_screen_title);
            M4.h.f11978a.A(this, this.f14869I0.getDeviceID(), new h.a() { // from class: R4.M0
                @Override // M4.h.a
                public final void a(MEATERDevice mEATERDevice) {
                    this.f14850a.O2(mEATERDevice);
                }
            });
        } else if (dVar != d.COOK_SUMMARY && dVar == d.PREVIOUS_COOK) {
            this.f14872L0.f10721t.setTitle(R.string.cook_summary_screen_title);
        } else {
            this.f14872L0.f10721t.setTitle(R.string.cook_summary_screen_title);
        }
        i3();
        if (this.f14869I0 != null) {
            T5.c cVar = (T5.c) new android.view.a0(this).b(T5.c.class);
            this.f14874N0 = cVar;
            cVar.w(this.f14869I0);
            g3(!this.f14869I0.getShouldShowAsConnected());
            this.f14872L0.f10709h.setTemperatureLog(this.f14869I0.getTemperatureLog());
            f3(this.f14869I0);
        } else {
            this.f14872L0.f10709h.setTemperatureLog(this.f14867G0.getTemperatureLog() == null ? new HighResTemperatureLog() : this.f14867G0.getTemperatureLog());
        }
        if (this.f14873M0) {
            e3();
        }
        this.f14872L0.f10712k.setOnTouchListener(new View.OnTouchListener() { // from class: R4.N0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f14851B.P2(view2, motionEvent);
            }
        });
        h3(LocalStorage.sharedStorage().cookNoteDAO().i(this.f14867G0.getCookID()));
        this.f14875O0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N2(SavedCook savedCook) {
        if (this.f14868H0 != d.COOK_SUMMARY) {
            return false;
        }
        return savedCook == null || savedCook.getCookTime() == 0 || savedCook.getCookStartTime() == 0 || savedCook.getTemperatureLog().getTotalTime() == 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O2(MEATERDevice mEATERDevice) {
        j3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean P2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (x4.g.t().l() == null && T() != null) {
                T().startActivity(new Intent(T(), (Class<?>) CloudAccountActivity.class));
                return false;
            }
            if (!this.f14876P0) {
                return false;
            }
            this.f14876P0 = false;
            int x10 = ((int) ((motionEvent.getX() / this.f14872L0.f10712k.getWidth()) * 5.0f)) + 1;
            this.f14872L0.f10712k.setRating(x10);
            K2(x10);
            view.setPressed(false);
        }
        if (motionEvent.getAction() == 0) {
            view.setPressed(true);
        }
        if (motionEvent.getAction() == 3) {
            view.setPressed(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2() {
        this.f14876P0 = true;
        if (T() == null) {
            return;
        }
        Intent intent = new Intent(T(), (Class<?>) CookFeedBackActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_COOK_ID, this.f14867G0.getCookID());
        intent.putExtra(MEATERIntent.EXTRA_COOK_FEED_BACK_RATING, (int) this.f14872L0.f10712k.getRating());
        T().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R2() {
        this.f14876P0 = true;
        this.f14872L0.f10712k.setRating(this.f14867G0.getFeedback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S2() {
        this.f14872L0.f10714m.scrollTo(0, 0);
    }

    public static T0 T2() {
        return new T0();
    }

    private boolean U2(ArrayList<MeatCookingTemperature> arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return false;
        }
        return !MeatCutsHelper.getInstance().temperatureIsBelowOfFirstRange(i10, arrayList);
    }

    private void V2() {
        this.f14872L0.f10717p.b(this.f14869I0, O4.g.f13261D);
    }

    private void X2(boolean z10) {
        if (z10) {
            this.f14872L0.f10718q.b(this.f14869I0, O4.g.f13259B);
            return;
        }
        SavedCook savedCook = this.f14867G0;
        if (savedCook != null) {
            this.f14872L0.f10718q.c(savedCook, O4.g.f13259B);
        }
    }

    private void Y2(boolean z10) {
        if (z10) {
            this.f14872L0.f10719r.b(this.f14869I0, O4.g.f13260C);
            return;
        }
        SavedCook savedCook = this.f14867G0;
        if (savedCook != null) {
            this.f14872L0.f10719r.c(savedCook, O4.g.f13260C);
        }
    }

    private void Z2() {
        TabLayout.f fVarE = this.f14872L0.f10716o.E();
        fVarE.t(A0(R.string.details_text));
        this.f14872L0.f10716o.i(fVarE);
        TabLayout.f fVarE2 = this.f14872L0.f10716o.E();
        fVarE2.t(A0(R.string.notes_text));
        this.f14872L0.f10716o.i(fVarE2);
        this.f14872L0.f10716o.h(new c());
        TabLayout tabLayout = this.f14872L0.f10716o;
        tabLayout.M(tabLayout.B(this.f14878R0));
    }

    private void a3() {
        if (Z() != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-3.0f, 3.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatMode(2);
            rotateAnimation.setRepeatCount(2);
            rotateAnimation.setDuration(100L);
        }
    }

    private void b3() {
        if (N2(this.f14867G0)) {
            U4.b.w("WE'VE GOT BAD DATA. SYNC SYNC SYNC", new Object[0]);
            F4.d.f4532f.t();
        }
    }

    private void c3(boolean z10) {
        if (T() == null || T().isFinishing()) {
            return;
        }
        C2421z.INSTANCE.e(T(), A0(z10 ? R.string.cook_feedback : R.string.title_error), A0(z10 ? R.string.would_you_like_to_provide_text : R.string.unable_to_submit_feedback_text), false, !z10 ? null : new C2421z.AlertPair(A0(R.string.yes_alert_button_text), new T4.e() { // from class: R4.P0
            @Override // T4.e
            public final void a() {
                this.f14855a.Q2();
            }
        }), new C2421z.AlertPair(A0(z10 ? R.string.no_alert_button_text : R.string.ok_label), new T4.e() { // from class: R4.Q0
            @Override // T4.e
            public final void a() {
                this.f14862a.R2();
            }
        }), null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3(Fragment fragment, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, this.f14867G0.getCookID());
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, this.f14869I0);
        bundle.putLong(MEATERIntent.EXTRA_DEVICE_ID, X() != null ? X().getLong(MEATERIntent.EXTRA_DEVICE_ID) : 0L);
        bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, this.f14868H0.ordinal());
        fragment.k2(bundle);
        androidx.fragment.app.C cR = o0().r();
        cR.u(R.id.simpleFrameLayout, fragment, str);
        cR.B(4097);
        cR.j();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.O0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14853B.S2();
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        L0 l02 = new L0();
        Bundle bundle = new Bundle();
        bundle.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, this.f14867G0.getCookID());
        bundle.putInt(MEATERIntent.EXTRA_COOK_SUMMARY_BAR_VISIBILITY, L2() ? 1 : 0);
        l02.k2(bundle);
        T().w0().r().t(R.id.baseLayoutContainer, l02).h("").j();
        this.f14872L0.f10721t.setTitle(R.string.preview);
    }

    private void f3(Probe probe) {
        if (this.f14868H0 == d.COOK_IN_PROGRESS && probe != null) {
            com.apptionlabs.meater_app.views.connectionwarning.a.i(probe, this.f14872L0.f10704c, this.f14874N0);
        }
    }

    private void g3(boolean z10) {
        if (z10) {
            this.f14872L0.f10718q.setAlpha(0.5f);
            this.f14872L0.f10719r.setAlpha(0.5f);
        } else {
            this.f14872L0.f10718q.setAlpha(1.0f);
            this.f14872L0.f10719r.setAlpha(1.0f);
        }
        if (this.f14868H0 == d.COOK_IN_PROGRESS) {
            this.f14872L0.f10716o.setAlpha(z10 ? 0.5f : 1.0f);
            TabLayout.f fVarB = this.f14872L0.f10716o.B(0);
            TabLayout.f fVarB2 = this.f14872L0.f10716o.B(1);
            if (fVarB == null || fVarB2 == null) {
                return;
            }
            fVarB.f37220i.setClickable(!z10);
            fVarB2.f37220i.setClickable(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(List<CookNote> list) {
        this.f14872L0.f10709h.setNoteList(list);
    }

    private void i3() {
        SavedCook savedCook;
        this.f14872L0.f10713l.setVisibility(this.f14868H0 == d.COOK_IN_PROGRESS || (savedCook = this.f14867G0) == null || !savedCook.readyForSync() ? 8 : 0);
    }

    private void j3() {
        Probe probe;
        Probe probe2;
        if (this.f14869I0 == null || !K0()) {
            return;
        }
        if (!this.f14873M0 && (this.f14869I0.getCookID() != this.f14867G0.getCookID() || this.f14869I0.getCookState() == DeviceCookState.COOK_STATE_NOT_STARTED)) {
            if (T() != null) {
                T().finish();
                return;
            }
            return;
        }
        e eVar = this.f14880T0;
        if (eVar != null) {
            eVar.k(this.f14872L0.f10709h.getTemperatureLog().graphDuration());
        }
        X2(true);
        Y2(true);
        this.f14872L0.f10709h.setTemperatureLog(this.f14869I0.getTemperatureLog());
        d dVar = this.f14868H0;
        d dVar2 = d.COOK_IN_PROGRESS;
        boolean z10 = dVar == dVar2 && (probe2 = this.f14869I0) != null && probe2.getShouldShowAsConnected();
        this.f14872L0.f10709h.setRealTimeGraph(z10);
        this.f14872L0.f10718q.setLabel(A0(R.string.internal_label));
        boolean z11 = this.f14872L0.f10709h.u() && System.currentTimeMillis() - this.f14872L0.f10709h.getLastUpdatedTime() >= 1000;
        if (z10 && this.f14869I0.getTemperatureLog().shouldDisplayFetchingLogMessage()) {
            if (this.f14872L0.f10706e.getVisibility() != 0) {
                this.f14872L0.f10706e.setVisibility(0);
                z11 = true;
            }
        } else if (this.f14872L0.f10706e.getVisibility() != 4) {
            this.f14872L0.f10706e.setVisibility(4);
            z11 = true;
        }
        if (z11) {
            this.f14872L0.f10709h.invalidate();
        }
        if (this.f14868H0 != dVar2 || (probe = this.f14869I0) == null) {
            return;
        }
        f3(probe);
        if (!this.f14869I0.getShouldShowAsConnected()) {
            this.f14872L0.f10717p.setVisibility(8);
            this.f14872L0.f10709h.setConnectedState(false);
            if (this.f14877Q0) {
                return;
            }
            this.f14872L0.f10709h.setConnectedState(false);
            this.f14877Q0 = true;
            g3(true);
            return;
        }
        this.f14872L0.f10717p.setVisibility(0);
        V2();
        this.f14872L0.f10709h.setConnectedState(true);
        if (this.f14877Q0) {
            this.f14877Q0 = false;
            g3(false);
            this.f14872L0.f10709h.setConnectedState(true);
        }
    }

    @Override // E4.a.d
    public void H(boolean z10, Data data) {
        if (z10) {
            this.f14867G0.setFeedback((int) this.f14872L0.f10712k.getRating());
            this.f14867G0.writeToDB();
        }
        c3(z10);
    }

    public void W2(e eVar) {
        this.f14880T0 = eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c2().d0(new a(), F0(), AbstractC2106m.b.RESUMED);
        FrameLayout frameLayout = new FrameLayout(e2());
        this.f14875O0 = frameLayout;
        C1408w0 c1408w0C = C1408w0.c(layoutInflater, frameLayout, false);
        this.f14872L0 = c1408w0C;
        ConstraintLayout constraintLayoutB = c1408w0C.b();
        ((androidx.appcompat.app.c) c2()).R0(this.f14872L0.f10721t);
        M2(constraintLayoutB);
        return this.f14875O0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14875O0.removeAllViews();
        if (T() == null) {
            return;
        }
        C1408w0 c1408w0C = C1408w0.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14872L0 = c1408w0C;
        M2(c1408w0C.b());
        v1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        boolean z10 = this.f14868H0 == d.COOK_IN_PROGRESS;
        i3();
        if (z10) {
            j3();
        } else {
            this.f14872L0.f10709h.invalidate();
            Y2(false);
            X2(false);
        }
        super.v1();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProtocolParameters.MEATER_SERVICE_NOTIF_COOK_FINISH);
        intentFilter.addAction(MEATERIntent.INTENT_COOK_NOTE);
        intentFilter.addAction(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS);
        P5.Q.D(T(), this.f14879S0, intentFilter);
        b3();
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        c2().unregisterReceiver(this.f14879S0);
    }

    /* compiled from: TemperatureGraphFragment.java */
    class c implements TabLayout.d {
        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f fVar) {
            T0.this.f14878R0 = fVar.g();
            int iG = fVar.g();
            if (iG == 0) {
                x4.b.f(b.EnumC0768b.f52623B1.title, b.a.f52605C.title, "");
                T0.this.d3(new C1670q(), "detail");
            } else {
                if (iG != 1) {
                    return;
                }
                x4.b.f(b.EnumC0768b.f52621A1.title, b.a.f52605C.title, "");
                T0.this.d3(new E(), "note");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f fVar) {
        }
    }

    @Override // E4.a.d
    public void I(List<PurchaseChannel> list) {
    }

    @Override // E4.a.d
    public void n(List<CookMethod> list) {
    }
}
