package R4;

import L4.C1383j0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.views.C2421z;
import g.AbstractC3371c;
import g.C3369a;
import g.InterfaceC3370b;
import g1.C3377a;
import h.C3469d;
import java.util.ArrayList;
import java.util.Iterator;
import w4.C4996p;

/* compiled from: PreviousCookFragment.java */
/* renamed from: R4.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1661l0 extends Fragment implements T4.r {

    /* renamed from: G0, reason: collision with root package name */
    w4.M f14962G0;

    /* renamed from: H0, reason: collision with root package name */
    C4996p f14963H0;

    /* renamed from: I0, reason: collision with root package name */
    w4.I f14964I0;

    /* renamed from: J0, reason: collision with root package name */
    Probe f14965J0;

    /* renamed from: K0, reason: collision with root package name */
    T4.h f14966K0;

    /* renamed from: L0, reason: collision with root package name */
    private FrameLayout f14967L0;

    /* renamed from: M0, reason: collision with root package name */
    private w4.M f14968M0;

    /* renamed from: N0, reason: collision with root package name */
    private CookHistory.b f14969N0;

    /* renamed from: O0, reason: collision with root package name */
    C1383j0 f14970O0;

    /* renamed from: P0, reason: collision with root package name */
    androidx.recyclerview.widget.e f14971P0;

    /* renamed from: Q0, reason: collision with root package name */
    private final BroadcastReceiver f14972Q0 = new d();

    /* renamed from: R0, reason: collision with root package name */
    boolean f14973R0 = false;

    /* renamed from: S0, reason: collision with root package name */
    AbstractC3371c<Intent> f14974S0 = a2(new C3469d(), new InterfaceC3370b() { // from class: R4.b0
        @Override // g.InterfaceC3370b
        public final void a(Object obj) {
            this.f14934a.R2((C3369a) obj);
        }
    });

    /* compiled from: PreviousCookFragment.java */
    /* renamed from: R4.l0$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1661l0.this.f14970O0.f10168q.setVisibility(0);
            C1661l0.this.f14970O0.f10168q.setIconified(false);
            C1661l0.this.f14970O0.f10168q.requestFocus();
            C1661l0.this.f14970O0.f10167p.setVisibility(8);
        }
    }

    /* compiled from: PreviousCookFragment.java */
    /* renamed from: R4.l0$b */
    class b implements SearchView.l {
        b() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onClose() {
            C1661l0.this.f14970O0.f10168q.setVisibility(4);
            C1661l0.this.f14970O0.f10167p.setVisibility(0);
            C1661l0.this.f14970O0.f10161j.setVisibility(8);
            C1661l0.this.f14970O0.f10172u.setVisibility(0);
            return false;
        }
    }

    /* compiled from: PreviousCookFragment.java */
    /* renamed from: R4.l0$c */
    class c implements SearchView.m {
        c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            ArrayList<SavedCook> arrayListSearch = SavedCook.search(C1661l0.this.L2(), str);
            if (str == null || str.isEmpty()) {
                C1661l0 c1661l0 = C1661l0.this;
                c1661l0.f14970O0.f10165n.setAdapter(c1661l0.f14971P0);
                C1661l0.this.f14970O0.f10161j.setVisibility(8);
                return true;
            }
            C1661l0.this.f14970O0.f10161j.setVisibility(arrayListSearch.isEmpty() ? 0 : 8);
            C1661l0.this.f14970O0.f10172u.setVisibility(arrayListSearch.isEmpty() ? 4 : 0);
            C1661l0.this.f14968M0.M(arrayListSearch);
            C1661l0 c1661l02 = C1661l0.this;
            c1661l02.f14970O0.f10165n.setAdapter(c1661l02.f14968M0);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return true;
        }
    }

    /* compiled from: PreviousCookFragment.java */
    /* renamed from: R4.l0$d */
    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null && intent.getAction().equals(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS)) {
                C1661l0.this.Y2();
            }
        }
    }

    private void K2(SavedCook savedCook) {
        if (x4.g.t().l() != null) {
            F4.d.f4532f.H(savedCook);
        } else {
            LocalStorage.sharedStorage().savedCookDAO().c(savedCook);
        }
        a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<SavedCook> L2() {
        ArrayList<SavedCook> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) LocalStorage.sharedStorage().savedCookDAO().a();
        ArrayList arrayList3 = (ArrayList) LocalStorage.sharedStorage().cookNoteDAO().e();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            SavedCook savedCook = (SavedCook) it.next();
            if (arrayList3.contains(Long.valueOf(savedCook.getCookID()))) {
                savedCook.setCookHaveNote(true);
            }
            arrayList.add(savedCook);
        }
        return arrayList;
    }

    private ArrayList<SavedCook> M2() {
        ArrayList<SavedCook> arrayList = new ArrayList<>();
        for (Probe probe : M4.h.f11978a.L()) {
            if (probe.getSavedCook() != null) {
                arrayList.add(probe.getSavedCook());
            }
        }
        return arrayList;
    }

    private void N2(View view) {
        Bundle bundleX = X();
        this.f14965J0 = (Probe) P5.Q.k(bundleX, MEATERIntent.EXTRA_PROBE, Probe.class);
        this.f14966K0 = (T4.h) T();
        this.f14970O0.f10171t.setTitle(A0(R.string.previous_cook_fragment_title));
        if (bundleX != null) {
            CookHistory.b bVar = CookHistory.b.values()[bundleX.getInt(MEATERIntent.INTENT_FRAGMENT_CONTEXT)];
            this.f14969N0 = CookHistory.b.values()[bundleX.getInt(MEATERIntent.INTENT_FRAGMENT_CONTEXT)];
            if (bVar == CookHistory.b.history) {
                this.f14970O0.f10170s.setText(A0(R.string.previous_cook_fragment_label_1));
                this.f14970O0.f10171t.setTitle(A0(R.string.previous_cook_fragment_title));
            } else {
                this.f14970O0.f10170s.setText(P5.Q.q(T(), "\n\n", R.string.previous_cook_fragment_label_2, R.string.previous_cook_fragment_label_1));
            }
        }
        this.f14970O0.f10164m.setColor(P5.Q.j(Z(), R.color.meater_olive_green));
        this.f14970O0.f10165n.setLayoutManager(new LinearLayoutManager(Z()));
        CookHistory.b bVar2 = this.f14969N0;
        CookHistory.b bVar3 = CookHistory.b.setUp;
        this.f14962G0 = new w4.M(bVar2 != bVar3);
        this.f14970O0.f10165n.j(new com.apptionlabs.meater_app.views.d0());
        this.f14962G0.U(this);
        this.f14963H0 = new C4996p(this.f14969N0 != bVar3);
        this.f14964I0 = new w4.I();
        this.f14970O0.f10165n.j(new com.apptionlabs.meater_app.views.d0());
        this.f14963H0.U(this);
        this.f14964I0.U(this);
        w4.M m10 = new w4.M(this.f14969N0 != bVar3);
        this.f14968M0 = m10;
        m10.U(this);
        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(this.f14963H0, this.f14964I0, this.f14962G0);
        this.f14971P0 = eVar;
        this.f14970O0.f10165n.setAdapter(eVar);
        this.f14970O0.f10165n.setNestedScrollingEnabled(false);
        Y2();
        x4.b.l(T(), "Previous Cooks List");
        this.f14970O0.f10157f.setOnClickListener(new View.OnClickListener() { // from class: R4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14936B.O2(view2);
            }
        });
        this.f14970O0.f10169r.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: R4.d0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                this.f14938a.Q2();
            }
        });
        F4.d.f4532f.t();
        this.f14967L0.addView(view);
        Z2();
        ((SearchView.SearchAutoComplete) this.f14970O0.f10168q.findViewById(R.id.search_src_text)).setHintTextColor(C3377a.c(e2(), R.color.grey_6));
        this.f14970O0.f10168q.setQueryHint("Search cooks...");
        this.f14970O0.f10167p.setOnClickListener(new a());
        this.f14970O0.f10168q.setOnCloseListener(new b());
        this.f14970O0.f10168q.setOnQueryTextListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O2(View view) {
        this.f14974S0.a(new Intent(Z(), (Class<?>) CloudAccountActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2() {
        this.f14970O0.f10169r.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2() {
        F4.d.f4532f.t();
        F4.f.f4544f.t();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14944B.P2();
            }
        }, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R2(C3369a c3369a) {
        if (x4.g.t().l() != null) {
            this.f14973R0 = true;
            this.f14970O0.f10166o.setVisibility(0);
            this.f14970O0.f10159h.setVisibility(8);
            F4.d.f4532f.t();
            F4.f.f4544f.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S2() {
        this.f14963H0.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14960B.S2();
            }
        }, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U2(SavedCook savedCook) {
        K2(savedCook);
        this.f14962G0.K(savedCook);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W2() {
        this.f14970O0.f10166o.setVisibility(8);
        this.f14970O0.f10165n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X2(View view) {
        Intent intent = new Intent(T(), (Class<?>) WebViewActivity.class);
        intent.putExtra("url", S4.a.f15458F);
        t2(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2() {
        this.f14970O0.f10169r.setRefreshing(false);
        ArrayList<SavedCook> arrayListL2 = L2();
        ArrayList<SavedCook> arrayList = new ArrayList<>();
        ArrayList<SavedCook> arrayList2 = new ArrayList<>();
        Iterator<SavedCook> it = arrayListL2.iterator();
        while (it.hasNext()) {
            SavedCook next = it.next();
            if (next.isFavourite()) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        if (this.f14969N0 == CookHistory.b.setUp) {
            this.f14964I0.M(M2());
        }
        this.f14963H0.M(arrayList2);
        this.f14962G0.M(arrayList);
        if (this.f14973R0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14940B.W2();
                }
            }, 1000L);
        } else {
            this.f14970O0.f10166o.setVisibility(8);
        }
        a3();
    }

    private void Z2() {
        this.f14970O0.f10160i.setOnClickListener(new View.OnClickListener() { // from class: R4.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14942B.X2(view);
            }
        });
    }

    private void a3() {
        if (this.f14962G0.h() == 0 && this.f14963H0.h() == 0) {
            this.f14970O0.f10172u.setVisibility(8);
            this.f14970O0.f10163l.setVisibility(8);
            this.f14970O0.f10159h.setVisibility(0);
        } else {
            this.f14970O0.f10172u.setVisibility(0);
            this.f14970O0.f10163l.setVisibility(0);
            this.f14970O0.f10159h.setVisibility(8);
        }
    }

    @Override // T4.r
    public void E(SavedCook savedCook, int i10) {
        T4.h hVar = this.f14966K0;
        if (hVar == null || savedCook == null) {
            return;
        }
        hVar.K(this.f14965J0, MeaterTargetSetupActivity.c.PREVIOUS_COOKS, savedCook, i10);
    }

    @Override // T4.r
    public void G(SavedCook savedCook) {
        if (savedCook == null) {
            return;
        }
        b3(savedCook, false);
        Y2();
    }

    @Override // T4.r
    public void b(SavedCook savedCook) {
        if (savedCook == null) {
            return;
        }
        K2(savedCook);
        this.f14963H0.K(savedCook);
        c2().runOnUiThread(new Runnable() { // from class: R4.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14958B.T2();
            }
        });
    }

    public void b3(SavedCook savedCook, boolean z10) {
        SavedCook savedCook2;
        savedCook.setFavourite(z10);
        if (x4.g.t().l() != null) {
            F4.d.f4532f.N(savedCook, false);
        } else {
            LocalStorage.sharedStorage().savedCookDAO().j(savedCook);
        }
        for (Probe probe : M4.h.f11978a.L()) {
            if (probe.getCookID() == savedCook.getCookID() && (savedCook2 = probe.getSavedCook()) != null) {
                savedCook2.setFavourite(z10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(e2());
        this.f14967L0 = frameLayout;
        C1383j0 c1383j0C = C1383j0.c(layoutInflater, frameLayout, false);
        this.f14970O0 = c1383j0C;
        N2(c1383j0C.b());
        return this.f14967L0;
    }

    @Override // T4.r
    public void j(SavedCook savedCook) {
        if (savedCook == null) {
            return;
        }
        b3(savedCook, true);
        Y2();
    }

    @Override // T4.r
    public void o(SavedCook savedCook, int i10) {
        T4.h hVar = this.f14966K0;
        if (hVar == null || savedCook == null) {
            return;
        }
        hVar.K(this.f14965J0, MeaterTargetSetupActivity.c.PREVIOUS_COOKS, savedCook, i10);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14967L0.removeAllViews();
        if (T() == null) {
            return;
        }
        C1383j0 c1383j0C = C1383j0.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14970O0 = c1383j0C;
        N2(c1383j0C.b());
        this.f14970O0.f10158g.setVisibility(x4.g.t().l() != null ? 8 : 0);
    }

    @Override // T4.r
    public void q(final SavedCook savedCook) {
        if (savedCook == null) {
            return;
        }
        C2421z.INSTANCE.d(c2(), A0(R.string.are_you_sure_title), A0(R.string.previous_cook_delete_message), false, new C2421z.AlertPair(A0(R.string.delete_alert_button_text), new T4.e() { // from class: R4.h0
            @Override // T4.e
            public final void a() {
                this.f14946a.U2(savedCook);
            }
        }), new C2421z.AlertPair(A0(R.string.cancel_label), new T4.e() { // from class: R4.i0
            @Override // T4.e
            public final void a() {
                C1661l0.V2();
            }
        })).show();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.f14970O0.f10158g.setVisibility(x4.g.t().l() == null ? 0 : 8);
        this.f14970O0.f10171t.setTitle(A0(R.string.previous_cook_fragment_title));
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS);
        P5.Q.D(c2(), this.f14972Q0, intentFilter);
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        c2().unregisterReceiver(this.f14972Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V2() {
    }
}
