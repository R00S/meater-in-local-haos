package M5;

import P5.Q;
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
import com.apptionlabs.meater_app.data.NetworkConstant;
import oa.InterfaceC4164i;
import s1.InterfaceC4420A;
import x4.b;

/* compiled from: ClipInfoFragment.java */
/* loaded from: classes2.dex */
public class f extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    L4.C f12002G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f12003H0;

    /* renamed from: I0, reason: collision with root package name */
    private final InterfaceC4164i<NetworkConstant> f12004I0 = jd.b.d(NetworkConstant.class);

    /* compiled from: ClipInfoFragment.java */
    class a implements InterfaceC4420A {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            f.this.T().getOnBackPressedDispatcher().l();
        }

        @Override // s1.InterfaceC4420A
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // s1.InterfaceC4420A
        public void c(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.menu_target_setup, menu);
            View viewInflate = f.this.T().getLayoutInflater().inflate(R.layout.action_bar_menu_layout, (ViewGroup) new LinearLayout(f.this.T()), false);
            menu.findItem(R.id.menu_target_setup_text).setActionView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
            textView.setTextColor(Q.i(R.color.primary_color));
            textView.setText(R.string.menu_text_done);
            textView.setOnClickListener(new View.OnClickListener() { // from class: M5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12001B.f(view);
                }
            });
        }
    }

    public static f A2(int i10) {
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putInt("cid", i10);
        fVar.k2(bundle);
        return fVar;
    }

    private void y2(View view) {
        ((androidx.appcompat.app.c) c2()).R0(this.f12002G0.f9305g);
        this.f12002G0.f9302d.setOnClickListener(new View.OnClickListener() { // from class: M5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12000B.z2(view2);
            }
        });
        this.f12002G0.f9300b.setAnimation(R.raw.meaterclip);
        this.f12003H0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(View view) {
        if (T() != null) {
            x4.b.f(b.EnumC0768b.f52665P1.title, "", "");
            Q.G(T(), this.f12004I0.getValue().getNetworkConstant().f());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c2().d0(new a(), F0(), AbstractC2106m.b.RESUMED);
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f12003H0 = frameLayout;
        L4.C c10 = L4.C.c(layoutInflater, frameLayout, false);
        this.f12002G0 = c10;
        y2(c10.b());
        return this.f12003H0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12003H0.removeAllViews();
        if (T() == null) {
            return;
        }
        L4.C c10 = L4.C.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f12002G0 = c10;
        y2(c10.b());
    }
}
