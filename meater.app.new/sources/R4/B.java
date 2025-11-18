package R4;

import E4.a;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.AbstractC2106m;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CookFeedBackActivity;
import com.apptionlabs.meater_app.cloud.requests.CookMethod;
import com.apptionlabs.meater_app.cloud.requests.PurchaseChannel;
import com.apptionlabs.meater_app.data.Data;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.views.C2421z;
import java.util.List;
import s1.InterfaceC4420A;

/* compiled from: CookFeedBackOvenTypeFragment.java */
/* loaded from: classes2.dex */
public class B extends Fragment implements a.d {

    /* renamed from: G0, reason: collision with root package name */
    L4.H f14797G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f14798H0;

    /* renamed from: I0, reason: collision with root package name */
    List<CookMethod> f14799I0;

    /* compiled from: CookFeedBackOvenTypeFragment.java */
    class a implements InterfaceC4420A {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            ((CookFeedBackActivity) B.this.T()).b1(B.this.f14797G0.f9399g.getText().toString());
        }

        @Override // s1.InterfaceC4420A
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // s1.InterfaceC4420A
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.menu_target_setup, menu);
            View viewInflate = B.this.T().getLayoutInflater().inflate(R.layout.action_bar_menu_layout, (ViewGroup) new LinearLayout(B.this.T()), false);
            menu.findItem(R.id.menu_target_setup_text).setActionView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
            textView.setText(B.this.u0().getString(R.string.menu_text_next));
            textView.setOnClickListener(new View.OnClickListener() { // from class: R4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14795B.f(view);
                }
            });
        }
    }

    /* compiled from: CookFeedBackOvenTypeFragment.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) B.this.T().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(B.this.f14797G0.f9399g, 1);
            }
        }
    }

    private void A2(View view) {
        if (T() == null) {
            return;
        }
        SavedCook savedCookY0 = ((CookFeedBackActivity) T()).Y0();
        this.f14797G0.f9401i.setRating(savedCookY0.getFeedback());
        this.f14797G0.f9396d.setText(savedCookY0.meatNameForDisplay());
        this.f14797G0.f9397e.setText(savedCookY0.getDateInStringFormat());
        this.f14797G0.f9400h.setText(R.string.which_oven_grill_brand_text);
        this.f14797G0.f9399g.setHint(A0(R.string.webber_genesis_big_green_text));
        this.f14797G0.f9399g.setVisibility(0);
        z2();
        E2();
        this.f14798H0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2() {
        this.f14797G0.f9398f.setVisibility(8);
        z2();
    }

    public static B D2() {
        return new B();
    }

    private void E2() {
        this.f14797G0.f9399g.requestFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new b(), 300L);
    }

    private void F2() {
        C2421z.INSTANCE.e(c2(), A0(R.string.title_error), A0(R.string.failed_to_load_cook_methods), false, new C2421z.AlertPair(A0(R.string.try_again_text), new T4.e() { // from class: R4.y
            @Override // T4.e
            public final void a() {
                this.f15025a.B2();
            }
        }), new C2421z.AlertPair(A0(R.string.cancel_label), new T4.e() { // from class: R4.z
            @Override // T4.e
            public final void a() {
                B.C2();
            }
        }), null).show();
    }

    private void z2() {
        E4.a aVar = new E4.a();
        aVar.e(this);
        aVar.c();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c2().d0(new a(), F0(), AbstractC2106m.b.RESUMED);
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f14798H0 = frameLayout;
        this.f14797G0 = L4.H.c(layoutInflater, frameLayout, false);
        ((androidx.appcompat.app.c) c2()).R0(this.f14797G0.f9402j);
        A2(this.f14797G0.b());
        return this.f14798H0;
    }

    @Override // E4.a.d
    public void n(List<CookMethod> list) {
        if (T() == null || T().isFinishing()) {
            return;
        }
        this.f14797G0.f9398f.setVisibility(8);
        if (list != null) {
            this.f14799I0 = list;
        } else {
            F2();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (T() == null) {
            return;
        }
        this.f14798H0.removeAllViews();
        L4.H hC = L4.H.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14797G0 = hC;
        A2(hC.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C2() {
    }

    @Override // E4.a.d
    public void I(List<PurchaseChannel> list) {
    }

    @Override // E4.a.d
    public void H(boolean z10, Data data) {
    }
}
