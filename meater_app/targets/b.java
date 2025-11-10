package com.apptionlabs.meater_app.targets;

import android.animation.Animator;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatCategory;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutType;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.model.RoundedTab;
import com.apptionlabs.meater_app.views.MEATERRoundedLayout;
import com.apptionlabs.meater_app.views.d0;
import com.apptionlabs.meater_app.views.l1;
import com.apptionlabs.meater_app.views.m0;
import com.apptionlabs.meater_app.views.r1;
import f8.l0;
import f8.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: AbstractItemSelectListFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class b<Item extends MeatModel, Parent extends MeatModel> extends com.apptionlabs.meater_app.targets.a<MeatModel, Parent> implements d0.a<Item, c.a> {
    private static final int[] R0 = {2131363195, 2131363196, 2131363197};
    private static final int[] S0 = {2131362664, 2131362665, 2131362666};
    private static final int[] T0 = {2131362669, 2131362670, 2131362671};
    private static MeatCategory U0 = null;
    public static int V0 = -1;
    protected TextView A0;
    protected TextView B0;
    protected TextView C0;
    protected View D0;
    protected View E0;
    protected RecyclerView F0;
    protected c<Item> G0;
    private MeatCategory H0;
    private final int L0;
    private View M0;
    private String P0;

    /* renamed from: x0, reason: collision with root package name */
    private FrameLayout f10092x0;

    /* renamed from: z0, reason: collision with root package name */
    protected TextView f10094z0;

    /* renamed from: y0, reason: collision with root package name */
    protected EnumC0148b f10093y0 = EnumC0148b.Other;
    private String I0 = "";
    protected String J0 = "";
    protected boolean K0 = false;
    private final List<RoundedTab> N0 = new ArrayList();
    private final List<MeatCutType> O0 = new ArrayList();
    private int Q0 = 0;

    /* compiled from: AbstractItemSelectListFragment.java */
    /* renamed from: com.apptionlabs.meater_app.targets.b$b, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum EnumC0148b {
        AnimalType,
        CutType,
        Other
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractItemSelectListFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class c<Item extends MeatModel> extends d0<Item, a> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractItemSelectListFragment.java */
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static class a extends RecyclerView.f0 {

            /* renamed from: q, reason: collision with root package name */
            final TextView f10102q;

            /* renamed from: r, reason: collision with root package name */
            final TextView f10103r;

            /* renamed from: s, reason: collision with root package name */
            LinearLayout f10104s;

            a(View view) {
                super(view);
                this.f10102q = (TextView) view.findViewById(2131362913);
                this.f10103r = (TextView) view.findViewById(2131362309);
                this.f10104s = (LinearLayout) view.findViewById(2131362806);
            }
        }

        c() {
        }

        @Override // com.apptionlabs.meater_app.views.d0
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public void J(a aVar, Item item, int i10) {
            aVar.f10102q.setText(item.getName());
            if (item instanceof Meat) {
                String str = ((Meat) item).description;
                if (str != null) {
                    aVar.f10103r.setText(str);
                    aVar.f10103r.setVisibility(0);
                } else {
                    aVar.f10103r.setVisibility(8);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public a y(ViewGroup viewGroup, int i10) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131558574, viewGroup, false));
        }
    }

    public b() {
        c<Item> K2 = K2();
        this.G0 = K2;
        K2.L(this);
        this.L0 = 2131558526;
    }

    private void M2(List<Item> list) {
        String A0;
        boolean z10 = false;
        Item item = list.get(0);
        if (item instanceof Meat) {
            this.J0 = A0(2132017891);
            Meat meat = (Meat) item;
            this.I0 = meat.category.getName();
            this.K0 = false;
            if (meat.category.meats.size() > 1) {
                this.K0 = true;
                return;
            }
            return;
        }
        if (item instanceof MeatCut) {
            SearchableMeatCut searchableMeatCut = (SearchableMeatCut) item;
            this.I0 = searchableMeatCut.getParentPath();
            if (searchableMeatCut.cutType.meat.cutTypes.size() <= 1) {
                A0 = searchableMeatCut.cutType.meat.getName();
            } else {
                A0 = A0(2132017892);
            }
            this.J0 = A0;
            this.K0 = false;
            if (searchableMeatCut.cutType.meat.category.meats.size() > 1) {
                this.I0 = searchableMeatCut.cutType.meat.category.getName();
                this.K0 = true;
                if (searchableMeatCut.cutType.meat.cutTypes.size() <= 1) {
                    z10 = true;
                }
                this.K0 = z10;
                return;
            }
            return;
        }
        if (item instanceof MeatCutType) {
            this.I0 = ((MeatCutType) item).meat.getName();
            this.J0 = A0(2132017583);
        }
    }

    private void N2() {
        int i10;
        MeatCategory meatCategory = this.H0;
        if (meatCategory == null) {
            S().finish();
            return;
        }
        if (meatCategory.equals(U0) && (i10 = V0) > 0) {
            S2(i10);
            U0 = null;
            V0 = -1;
        } else {
            i10 = 0;
        }
        this.M0.setVisibility(8);
        int i11 = 0;
        for (MeatCutType meatCutType : this.O0) {
            int b10 = q0.b(Y(), meatCutType.imageName);
            if (b10 <= 0) {
                b10 = q0.b(Y(), meatCutType.meat.imageName);
            }
            String name = meatCutType.getName();
            if (i11 < 3) {
                RoundedTab roundedTab = this.N0.get(i11);
                boolean z10 = true;
                roundedTab.setVisible(true);
                roundedTab.setTag(i11);
                roundedTab.setClickListener(new View.OnClickListener() { // from class: c8.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.apptionlabs.meater_app.targets.b.this.P2(view);
                    }
                });
                roundedTab.setView(this.P0, b10, name);
                if (i11 != i10) {
                    z10 = false;
                }
                roundedTab.update(z10);
            }
            i11++;
            this.M0.setVisibility(0);
        }
    }

    private void O2(View view) {
        int i10;
        int i11;
        String name;
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131363155);
        this.F0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(Y()));
        int i14 = 0;
        this.F0.j(new r1(0));
        this.F0.j(new l1());
        this.F0.setAdapter(this.G0);
        this.D0 = view.findViewById(2131362804);
        this.E0 = view.findViewById(2131363004);
        View view2 = this.D0;
        if (this.K0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        view2.setVisibility(i10);
        View view3 = this.E0;
        if (this.K0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view3.setVisibility(i11);
        this.f10094z0 = (TextView) view.findViewById(2131363467);
        this.A0 = (TextView) view.findViewById(2131363469);
        this.B0 = (TextView) view.findViewById(2131363468);
        this.C0 = (TextView) view.findViewById(2131363470);
        ImageView imageView = (ImageView) view.findViewById(2131363502);
        ImageView imageView2 = (ImageView) view.findViewById(2131363503);
        this.f10094z0.setText(this.I0);
        this.A0.setText(this.J0);
        this.B0.setText(this.I0);
        this.C0.setText(this.J0);
        this.f10094z0.setGravity(1);
        if (this.H0 != null) {
            if (l0.w(Y())) {
                q0.i(imageView2, 2131099784, true);
                q0.i(imageView, 2131099784, true);
            }
            q0.d(imageView.getBackground(), Color.parseColor(this.H0.colourHex), false);
            q0.f(imageView, this.H0.imageName);
            q0.d(imageView2.getBackground(), Color.parseColor(this.H0.colourHex), false);
            q0.f(imageView2, this.H0.imageName);
            this.P0 = this.H0.colourHex;
        } else {
            c2().finish();
        }
        this.M0 = view.findViewById(2131363391);
        this.N0.clear();
        int i15 = 0;
        while (true) {
            int[] iArr = R0;
            if (i15 >= iArr.length) {
                break;
            }
            RoundedTab roundedTab = new RoundedTab((MEATERRoundedLayout) view.findViewById(iArr[i15]), (ImageView) view.findViewById(S0[i15]), (TextView) view.findViewById(T0[i15]));
            roundedTab.setVisible(false);
            this.N0.add(roundedTab);
            i15++;
        }
        int i16 = V0;
        if (i16 != -1 && i16 != this.Q0) {
            this.Q0 = i16;
            S2(i16);
        }
        N2();
        if (this.f10093y0 == EnumC0148b.Other) {
            this.f10094z0.setTextSize(0, (int) (m0.d() * 1.3d));
            this.A0.setTextSize(0, m0.d());
        } else if (this.H0 != null) {
            if (z2() != -1 && y2() != null) {
                name = this.H0.getName() + " - " + y2().getName();
            } else {
                name = this.H0.getName();
            }
            this.f10094z0.setText(name);
        }
        int i17 = 4;
        if (this.K0) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        if (this.K0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView2.setVisibility(i13);
        if (!this.K0) {
            i17 = 0;
        }
        imageView.setVisibility(i17);
        if (!this.K0) {
            i14 = 8;
        }
        imageView2.setVisibility(i14);
        this.f10092x0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(View view) {
        if (view.getTag() != null && (view.getTag() instanceof Integer) && this.M0.isEnabled()) {
            V2(((Integer) view.getTag()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2(int i10) {
        MeatCutType meatCutType;
        MeatCutType cutType;
        if (y2() != null) {
            cutType = y2().cutTypes.get(i10);
        } else {
            ArrayList<MeatCutType> arrayList = this.H0.meats.get(0).cutTypes;
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            int intValue = this.H0.id.intValue();
            int intValue2 = this.H0.meats.get(0).id.intValue();
            if (l0.z(i10, arrayList.size())) {
                meatCutType = arrayList.get(i10);
            } else {
                meatCutType = arrayList.get(0);
            }
            cutType = meatCutsHelper.getCutType(intValue, intValue2, meatCutType.id.intValue());
        }
        if (cutType == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<MeatModel> it = MeatCutsHelper.getInstance().getFilteredCutsByCountryBase(Locale.getDefault().getCountry(), cutType.cuts).iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        this.G0.K(arrayList2);
        ((LinearLayoutManager) this.F0.getLayoutManager()).F2(0, 0);
    }

    protected c<Item> K2() {
        return new c<>();
    }

    public MeatCategory L2() {
        return this.H0;
    }

    @Override // com.apptionlabs.meater_app.views.d0.a
    /* renamed from: Q2, reason: merged with bridge method [inline-methods] */
    public void h(c.a aVar, Item item, int i10) {
        U0 = this.H0;
        V0 = this.Q0;
        B2(item);
    }

    public void R2(MeatCategory meatCategory) {
        this.H0 = meatCategory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void T2(List<Item> list) {
        this.G0.K(list);
        M2(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U2(List<MeatCutType> list) {
        this.O0.clear();
        this.O0.addAll(list);
    }

    protected void V2(int i10) {
        int i11 = this.Q0;
        if (i10 != i11) {
            MEATERRoundedLayout mEATERRoundedLayout = this.N0.get(i11).roundedLayout;
            float x10 = mEATERRoundedLayout.getX();
            float x11 = this.N0.get(i10).imageView.getX();
            this.N0.get(this.Q0).updateTabIcon(false);
            this.M0.setEnabled(false);
            mEATERRoundedLayout.animate().setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).x(x11).setListener(new a(i10, x10)).start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(S());
        this.f10092x0 = frameLayout;
        O2(layoutInflater.inflate(this.L0, (ViewGroup) frameLayout, false));
        return this.f10092x0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (S() == null) {
            return;
        }
        this.f10092x0.removeAllViews();
        O2(((LayoutInflater) S().getSystemService("layout_inflater")).inflate(this.L0, (ViewGroup) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractItemSelectListFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10095a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f10096b;

        a(int i10, float f10) {
            this.f10095a = i10;
            this.f10096b = f10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.M0.setEnabled(true);
            b.this.S2(this.f10095a);
            ((RoundedTab) b.this.N0.get(b.this.Q0)).update(false);
            ((RoundedTab) b.this.N0.get(this.f10095a)).update(true);
            ((RoundedTab) b.this.N0.get(b.this.Q0)).roundedLayout.setX(this.f10096b);
            b.this.Q0 = this.f10095a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
