package com.apptionlabs.meater_app.targets;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n0;
import androidx.fragment.app.s;
import b6.h1;
import com.apptionlabs.meater_app.data.Appliance;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.model.Probe;
import i5.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChooseApplianceScreen.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/apptionlabs/meater_app/targets/d;", "Landroidx/fragment/app/Fragment;", "Lj6/d;", "Lih/u;", "G2", "Landroid/view/View;", "view", "C2", "", "Lcom/apptionlabs/meater_app/data/Appliance;", "z2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "", "showDialog", "appliance", "z", "Lb6/h1;", "t0", "Lb6/h1;", "A2", "()Lb6/h1;", "E2", "(Lb6/h1;)V", "binding", "Lcom/apptionlabs/meater_app/targets/c;", "u0", "Lcom/apptionlabs/meater_app/targets/c;", "B2", "()Lcom/apptionlabs/meater_app/targets/c;", "F2", "(Lcom/apptionlabs/meater_app/targets/c;)V", "dialog", "Landroid/widget/FrameLayout;", "v0", "Landroid/widget/FrameLayout;", "mFrameLayout", "<init>", "()V", "w0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class d extends Fragment implements j6.d {

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: x0, reason: collision with root package name */
    private static MeatModel f10106x0;

    /* renamed from: y0, reason: collision with root package name */
    private static Probe f10107y0;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public h1 binding;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public com.apptionlabs.meater_app.targets.c dialog;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout mFrameLayout;

    /* compiled from: ChooseApplianceScreen.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/apptionlabs/meater_app/targets/d$a;", "", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "meat", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Lcom/apptionlabs/meater_app/targets/d;", "a", "c_meat", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "getC_meat", "()Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "b", "(Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;)V", "c_probe", "Lcom/apptionlabs/meater_app/model/Probe;", "getC_probe", "()Lcom/apptionlabs/meater_app/model/Probe;", "c", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.targets.d$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final d a(MeatModel meat, Probe probe) {
            d dVar = new d();
            dVar.k2(a.x2(meat));
            b(meat);
            c(probe);
            return dVar;
        }

        public final void b(MeatModel meatModel) {
            d.f10106x0 = meatModel;
        }

        public final void c(Probe probe) {
            d.f10107y0 = probe;
        }
    }

    /* compiled from: ChooseApplianceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ ph.a<r> f10111a = ph.b.a(r.values());
    }

    /* compiled from: ChooseApplianceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10112a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f14056t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f14057u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.f14058v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.f14059w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.f14060x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10112a = iArr;
        }
    }

    private final void C2(View view) {
        List<Appliance> z22 = z2();
        s c22 = c2();
        wh.m.e(c22, "requireActivity(...)");
        q5.f fVar = new q5.f(c22, 2131558464, z22);
        A2().R.setAdapter((ListAdapter) fVar);
        fVar.c(this);
        fVar.notifyDataSetChanged();
        FrameLayout frameLayout = this.mFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    public static final d D2(MeatModel meatModel, Probe probe) {
        return INSTANCE.a(meatModel, probe);
    }

    private final void G2() {
        MeatModel meatModel = f10106x0;
        wh.m.c(meatModel);
        Probe probe = f10107y0;
        wh.m.c(probe);
        f j32 = f.j3(meatModel, -1, probe);
        wh.m.e(j32, "newInstance(...)");
        MeaterTargetSetupActivity meaterTargetSetupActivity = (MeaterTargetSetupActivity) S();
        if (meaterTargetSetupActivity != null) {
            n0 h10 = meaterTargetSetupActivity.m0().p().t(2131362016, j32).h("");
            wh.m.e(h10, "addToBackStack(...)");
            h10.j();
        }
    }

    private final List<Appliance> z2() {
        ArrayList arrayList = new ArrayList();
        Iterator it = b.f10111a.iterator();
        while (it.hasNext()) {
            int i10 = c.f10112a[((r) it.next()).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                String A0 = A0(2132018356);
                                wh.m.e(A0, "getString(...)");
                                String A02 = A0(2132018576);
                                wh.m.e(A02, "getString(...)");
                                arrayList.add(new Appliance(2131230842, A0, A02, true));
                            }
                        } else {
                            String A03 = A0(2132018732);
                            wh.m.e(A03, "getString(...)");
                            arrayList.add(new Appliance(2131231547, A03, "", false));
                        }
                    } else {
                        String A04 = A0(2132017808);
                        wh.m.e(A04, "getString(...)");
                        arrayList.add(new Appliance(2131231053, A04, "", false));
                    }
                } else {
                    String A05 = A0(2132017416);
                    wh.m.e(A05, "getString(...)");
                    String A06 = A0(2132018576);
                    wh.m.e(A06, "getString(...)");
                    arrayList.add(new Appliance(2131230921, A05, A06, true));
                }
            } else {
                String A07 = A0(2132018366);
                wh.m.e(A07, "getString(...)");
                arrayList.add(new Appliance(2131231503, A07, "", false));
            }
        }
        return arrayList;
    }

    public final h1 A2() {
        h1 h1Var = this.binding;
        if (h1Var != null) {
            return h1Var;
        }
        wh.m.t("binding");
        return null;
    }

    public final com.apptionlabs.meater_app.targets.c B2() {
        com.apptionlabs.meater_app.targets.c cVar = this.dialog;
        if (cVar != null) {
            return cVar;
        }
        wh.m.t("dialog");
        return null;
    }

    public final void E2(h1 h1Var) {
        wh.m.f(h1Var, "<set-?>");
        this.binding = h1Var;
    }

    public final void F2(com.apptionlabs.meater_app.targets.c cVar) {
        wh.m.f(cVar, "<set-?>");
        this.dialog = cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        wh.m.f(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(c2());
        this.mFrameLayout = frameLayout;
        ViewDataBinding h10 = androidx.databinding.g.h(inflater, 2131558473, frameLayout, false);
        wh.m.e(h10, "inflate(...)");
        E2((h1) h10);
        View v10 = A2().v();
        wh.m.e(v10, "getRoot(...)");
        C2(v10);
        lm.b.m(S(), "Cook Setup Appliance Selection");
        return this.mFrameLayout;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        wh.m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((B2() instanceof com.apptionlabs.meater_app.targets.c) && B2().R0()) {
            B2().A2();
        }
        FrameLayout frameLayout = this.mFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        Object systemService = c2().getSystemService("layout_inflater");
        wh.m.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ViewDataBinding h10 = androidx.databinding.g.h((LayoutInflater) systemService, 2131558473, null, false);
        wh.m.e(h10, "inflate(...)");
        E2((h1) h10);
        View v10 = A2().v();
        wh.m.e(v10, "getRoot(...)");
        C2(v10);
    }

    @Override // j6.d
    public void z(boolean z10, Appliance appliance) {
        wh.m.f(appliance, "appliance");
        if (z10 && appliance.getHaveSafetyInfo()) {
            s c22 = c2();
            wh.m.e(c22, "requireActivity(...)");
            F2(com.apptionlabs.meater_app.targets.c.INSTANCE.b(appliance));
            B2().X2(this);
            B2().N2(c22.m0(), "safetyDialog");
            return;
        }
        G2();
    }
}
