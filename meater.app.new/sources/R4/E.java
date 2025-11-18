package R4;

import L4.C1369c0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.CookNote;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.views.C2421z;
import java.util.List;
import x4.b;

/* compiled from: CookNotesFragment.java */
/* loaded from: classes2.dex */
public class E extends Fragment implements T4.u {

    /* renamed from: G0, reason: collision with root package name */
    private SavedCook f14806G0;

    /* renamed from: H0, reason: collision with root package name */
    private w4.E f14807H0;

    /* renamed from: J0, reason: collision with root package name */
    private FrameLayout f14809J0;

    /* renamed from: K0, reason: collision with root package name */
    C1369c0 f14810K0;

    /* renamed from: I0, reason: collision with root package name */
    private final Handler f14808I0 = new Handler(Looper.getMainLooper());

    /* renamed from: L0, reason: collision with root package name */
    private final BroadcastReceiver f14811L0 = new a();

    /* renamed from: M0, reason: collision with root package name */
    Runnable f14812M0 = new b();

    /* compiled from: CookNotesFragment.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null && intent.getAction().equals(MEATERIntent.INTENT_REFRESH_COOK_NOTES)) {
                List<CookNote> listI = LocalStorage.sharedStorage().cookNoteDAO().i(E.this.f14806G0.getCookID());
                listI.add(new CookNote());
                E.this.f14807H0.h0(listI);
            }
        }
    }

    /* compiled from: CookNotesFragment.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F4.f.f4544f.t();
            E.this.f14808I0.postDelayed(E.this.f14812M0, Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
        }
    }

    private void C2(View view) {
        this.f14806G0 = LocalStorage.sharedStorage().savedCookDAO().f(X().getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
        List<CookNote> listI = LocalStorage.sharedStorage().cookNoteDAO().i(this.f14806G0.getCookID());
        boolean z10 = listI != null && listI.size() == 0;
        this.f14810K0.f9951b.setVisibility(!z10 ? 0 : 8);
        this.f14810K0.f9952c.setVisibility(z10 ? 8 : 0);
        w4.E e10 = new w4.E(listI);
        this.f14807H0 = e10;
        e10.f0(this);
        this.f14807H0.g0(this.f14806G0.getTemperatureLog());
        ((androidx.recyclerview.widget.u) this.f14810K0.f9953d.getItemAnimator()).Q(false);
        this.f14810K0.f9953d.setLayoutManager(new LinearLayoutManager(Z()));
        this.f14810K0.f9953d.setAdapter(this.f14807H0);
        this.f14810K0.f9953d.j(new com.apptionlabs.meater_app.views.d0());
        this.f14810K0.f9953d.setHasFixedSize(true);
        this.f14810K0.f9953d.setNestedScrollingEnabled(false);
        this.f14809J0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D2(CookNote cookNote) {
        LocalStorage.sharedStorage().cookNoteDAO().h(cookNote);
        this.f14807H0.c0(cookNote);
        if (cookNote != null) {
            F4.f.f4544f.z(cookNote);
        }
    }

    private void F2(CookNote cookNote) {
        C1654i c1654i = new C1654i();
        Bundle bundle = new Bundle();
        bundle.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, this.f14806G0.getCookID());
        bundle.putParcelable("note_key", cookNote);
        bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, 1);
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, (Probe) P5.Q.k(X(), MEATERIntent.EXTRA_PROBE, Probe.class));
        bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, X() != null ? X().getInt(MEATERIntent.EXTRA_GRAPH_CONTEXT) : 0);
        c1654i.k2(bundle);
        androidx.fragment.app.C cR = o0().r();
        cR.u(R.id.baseLayoutContainer, c1654i, "addNote").h("");
        cR.B(4097);
        cR.j();
    }

    @Override // T4.u
    public void C(final CookNote cookNote) {
        x4.b.f(b.EnumC0768b.f52629D1.title, b.a.f52605C.title, "");
        C2421z.INSTANCE.e(T(), "", A0(R.string.are_you_sure_to_delete_note_text), true, new C2421z.AlertPair(A0(R.string.ok_label), new T4.e() { // from class: R4.C
            @Override // T4.e
            public final void a() {
                this.f14802a.D2(cookNote);
            }
        }), new C2421z.AlertPair(A0(R.string.cancel_label), new T4.e() { // from class: R4.D
            @Override // T4.e
            public final void a() {
                E.E2();
            }
        }), null).show();
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
    }

    @Override // T4.u
    public void e(CookNote cookNote) {
        x4.b.f(b.EnumC0768b.f52626C1.title, b.a.f52605C.title, "");
        F2(cookNote);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f14809J0 = frameLayout;
        C1369c0 c1369c0C = C1369c0.c(layoutInflater, frameLayout, false);
        this.f14810K0 = c1369c0C;
        C2(c1369c0C.b());
        return this.f14809J0;
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.f14807H0.n();
    }

    @Override // T4.u
    public void w() {
        F2(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MEATERIntent.INTENT_REFRESH_COOK_NOTES);
        P5.Q.D(T(), this.f14811L0, intentFilter);
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        c2().unregisterReceiver(this.f14811L0);
        this.f14808I0.removeCallbacks(this.f14812M0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E2() {
    }
}
