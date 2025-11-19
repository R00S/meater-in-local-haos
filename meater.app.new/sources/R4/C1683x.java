package R4;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Data;
import java.util.Locale;

/* compiled from: CookFeedBackFinishFragment.java */
/* renamed from: R4.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1683x extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    L4.G f15022G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f15023H0;

    private void A2(View view) {
        this.f15022G0.f9376b.setOnClickListener(new View.OnClickListener() { // from class: R4.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1683x.B2(view2);
            }
        });
        this.f15022G0.f9383i.setOnClickListener(new View.OnClickListener() { // from class: R4.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15006B.C2(view2);
            }
        });
        Bundle bundleX = X();
        if (bundleX != null) {
            String string = bundleX.getString("title");
            final String string2 = bundleX.getString("url");
            String string3 = bundleX.getString("image");
            if (string == null || string2 == null || string3 == null) {
                this.f15022G0.f9376b.setVisibility(0);
                this.f15022G0.f9381g.setVisibility(8);
            } else {
                this.f15022G0.f9381g.setVisibility(0);
                this.f15022G0.f9376b.setVisibility(8);
                com.bumptech.glide.b.u(c2()).m().N0(string3).H0(this.f15022G0.f9380f);
                this.f15022G0.f9379e.setText(String.format(Locale.US, A0(R.string.we_love_it_if_you_review), string));
                this.f15022G0.f9382h.setOnClickListener(new View.OnClickListener() { // from class: R4.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f15008B.D2(string2, view2);
                    }
                });
            }
        } else {
            this.f15022G0.f9376b.setVisibility(0);
            this.f15022G0.f9381g.setVisibility(8);
        }
        this.f15023H0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C2(View view) {
        if (T() != null) {
            T().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D2(String str, View view) {
        if (T() != null) {
            P5.Q.G(c2(), str);
            c2().finish();
        }
    }

    public static C1683x E2(Data data) {
        C1683x c1683x = new C1683x();
        if (data != null) {
            Bundle bundle = new Bundle();
            bundle.putString("title", data.getLink().getTitle());
            bundle.putString("url", data.getLink().getUrl());
            bundle.putString("image", data.getLink().getImage());
            c1683x.k2(bundle);
        }
        return c1683x;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f15023H0 = frameLayout;
        L4.G gC = L4.G.c(layoutInflater, frameLayout, false);
        this.f15022G0 = gC;
        A2(gC.b());
        return this.f15023H0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (T() == null) {
            return;
        }
        this.f15023H0.removeAllViews();
        L4.G gC = L4.G.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f15022G0 = gC;
        A2(gC.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B2(View view) {
    }
}
