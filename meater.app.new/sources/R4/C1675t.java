package R4;

import E4.a;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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

/* compiled from: CookFeedBackExtraNoteFragment.java */
/* renamed from: R4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1675t extends Fragment implements a.d {

    /* renamed from: G0, reason: collision with root package name */
    L4.H f15001G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f15002H0;

    /* compiled from: CookFeedBackExtraNoteFragment.java */
    /* renamed from: R4.t$a */
    class a implements InterfaceC4420A {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            if (C1675t.this.T() == null) {
                return;
            }
            P5.Q.t(C1675t.this.T(), C1675t.this.f15001G0.f9395c);
            C1675t.this.f15001G0.f9398f.setVisibility(0);
            CookFeedBackActivity cookFeedBackActivity = (CookFeedBackActivity) C1675t.this.T();
            C1675t c1675t = C1675t.this;
            cookFeedBackActivity.X0(c1675t, c1675t.f15001G0.f9399g.getText().toString());
        }

        @Override // s1.InterfaceC4420A
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // s1.InterfaceC4420A
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.menu_target_setup, menu);
            View viewInflate = C1675t.this.T().getLayoutInflater().inflate(R.layout.action_bar_menu_layout, (ViewGroup) new LinearLayout(C1675t.this.T()), false);
            menu.findItem(R.id.menu_target_setup_text).setActionView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
            textView.setText(C1675t.this.u0().getString(R.string.submit));
            textView.setOnClickListener(new View.OnClickListener() { // from class: R4.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14998B.f(view);
                }
            });
        }
    }

    public static C1675t A2() {
        return new C1675t();
    }

    private void B2() {
        C2421z.INSTANCE.d(T(), A0(R.string.title_error), A0(R.string.unable_to_submit_feedback_text), false, new C2421z.AlertPair(A0(R.string.ok_label), new T4.e() { // from class: R4.r
            @Override // T4.e
            public final void a() {
                this.f14996a.z2();
            }
        }), null).show();
    }

    private void y2(View view) {
        if (T() == null) {
            return;
        }
        SavedCook savedCookY0 = ((CookFeedBackActivity) T()).Y0();
        this.f15001G0.f9401i.setRating(savedCookY0.getFeedback());
        this.f15001G0.f9396d.setText(savedCookY0.meatNameForDisplay());
        this.f15001G0.f9397e.setText(savedCookY0.getDateInStringFormat());
        this.f15001G0.f9400h.setText(R.string.any_other_notes_text);
        this.f15001G0.f9399g.setVisibility(0);
        this.f15001G0.f9403k.setVisibility(0);
        if (this.f15001G0.f9399g.getVisibility() == 0) {
            this.f15001G0.f9399g.requestFocus();
        }
        this.f15002H0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2() {
        if (T() != null) {
            T().finish();
        }
    }

    @Override // E4.a.d
    public void H(boolean z10, Data data) {
        this.f15001G0.f9398f.setVisibility(8);
        if (T() == null || T().isFinishing()) {
            return;
        }
        if (z10) {
            ((CookFeedBackActivity) T()).Z0(data);
        } else {
            B2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c2().d0(new a(), F0(), AbstractC2106m.b.RESUMED);
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f15002H0 = frameLayout;
        this.f15001G0 = L4.H.c(layoutInflater, frameLayout, false);
        ((androidx.appcompat.app.c) c2()).R0(this.f15001G0.f9402j);
        y2(this.f15001G0.b());
        return this.f15002H0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (T() == null) {
            return;
        }
        this.f15002H0.removeAllViews();
        L4.H hC = L4.H.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f15001G0 = hC;
        y2(hC.b());
    }

    @Override // E4.a.d
    public void I(List<PurchaseChannel> list) {
    }

    @Override // E4.a.d
    public void n(List<CookMethod> list) {
    }
}
