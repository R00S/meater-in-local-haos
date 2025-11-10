package com.apptionlabs.meater_app.targets;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.meatCutStructure.MeatCategory;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.targets.a;
import com.apptionlabs.meater_app.views.MeaterTextRow;
import com.apptionlabs.meater_app.views.RoundCircleImage;
import com.apptionlabs.meater_app.views.d0;
import java.util.List;

/* compiled from: MeatItemSelectListFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class l<Item extends MeatModel, Parent extends MeatModel> extends Fragment {

    /* renamed from: t0, reason: collision with root package name */
    TextView f10141t0;

    /* renamed from: v0, reason: collision with root package name */
    private CharSequence f10143v0;

    /* renamed from: x0, reason: collision with root package name */
    MeaterTextRow f10145x0;

    /* renamed from: y0, reason: collision with root package name */
    private FrameLayout f10146y0;

    /* renamed from: z0, reason: collision with root package name */
    private c f10147z0;

    /* renamed from: u0, reason: collision with root package name */
    protected l<Item, Parent>.b<MeatModel> f10142u0 = B2();

    /* renamed from: w0, reason: collision with root package name */
    private final int f10144w0 = 2131558609;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeatItemSelectListFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a extends GridLayoutManager.c {
        a(l lVar) {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            int i11 = i10 % 5;
            if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                return 2;
            }
            throw new IllegalStateException("internal error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeatItemSelectListFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b<Item extends MeatModel> extends d0<Item, a> implements RoundCircleImage.b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MeatItemSelectListFragment.java */
        /* loaded from: /tmp/meat/meat/classes.dex */
        public class a extends RecyclerView.f0 {

            /* renamed from: q, reason: collision with root package name */
            private final TextView f10149q;

            /* renamed from: r, reason: collision with root package name */
            LinearLayout f10150r;

            /* renamed from: s, reason: collision with root package name */
            private final RoundCircleImage f10151s;

            private a(b bVar, View view) {
                super(view);
                this.f10151s = (RoundCircleImage) view.findViewById(2131363194);
                this.f10149q = (TextView) view.findViewById(2131362913);
                this.f10150r = (LinearLayout) view.findViewById(2131362843);
            }
        }

        private void O(RoundCircleImage roundCircleImage, Item item) {
            roundCircleImage.setListener(this);
            roundCircleImage.setItemIndex(item.id.intValue());
            roundCircleImage.setColor(((MeatCategory) item).colourHex);
            roundCircleImage.setIcon(item.imageName);
        }

        @Override // com.apptionlabs.meater_app.views.d0
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public void J(a aVar, Item item, int i10) {
            aVar.f10149q.setText(item.getName());
            aVar.f10151s.setContentDescription(item.getName());
            O(aVar.f10151s, item);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public a y(ViewGroup viewGroup, int i10) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131558608, viewGroup, false));
        }

        @Override // com.apptionlabs.meater_app.views.RoundCircleImage.b
        public void c(int i10) {
            for (Item item : I()) {
                if (i10 == item.id.intValue()) {
                    l.this.f10147z0.o(item);
                }
            }
        }

        private b() {
        }
    }

    /* compiled from: MeatItemSelectListFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface c {
        void o(MeatModel meatModel);
    }

    private boolean C2() {
        if (LocalStorage.sharedStorage().savedCookDAO().a().size() > 0) {
            return true;
        }
        return false;
    }

    private void D2(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131363155);
        this.f10141t0 = (TextView) view.findViewById(2131363469);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Y(), 6);
        gridLayoutManager.j3(new a(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f10142u0);
        this.f10141t0.setText(this.f10143v0);
        this.f10141t0.setGravity(1);
        TextView textView = (TextView) view.findViewById(2131362397);
        MeaterTextRow meaterTextRow = (MeaterTextRow) view.findViewById(2131362267);
        this.f10145x0 = (MeaterTextRow) view.findViewById(2131363082);
        meaterTextRow.b(2131231172);
        this.f10145x0.b(2131230934);
        final MeaterTargetSetupActivity meaterTargetSetupActivity = (MeaterTargetSetupActivity) S();
        if (meaterTargetSetupActivity == null) {
            return;
        }
        meaterTextRow.setOnClickListener(new View.OnClickListener() { // from class: c8.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MeaterTargetSetupActivity.this.k2();
            }
        });
        this.f10145x0.setOnClickListener(new View.OnClickListener() { // from class: c8.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MeaterTargetSetupActivity.this.r2();
            }
        });
        if (!C2()) {
            this.f10145x0.setVisibility(8);
        }
        view.findViewById(2131362398).setOnClickListener(new View.OnClickListener() { // from class: c8.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MeaterTargetSetupActivity.this.v2();
            }
        });
        textView.setClickable(false);
        this.f10146y0.addView(view);
    }

    protected l<Item, Parent>.b<MeatModel> B2() {
        return new b<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H2(List<MeatModel> list) {
        this.f10142u0.K(list);
    }

    public void I2(c cVar) {
        this.f10147z0 = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J2(int i10) {
        K2(u0().getText(i10));
    }

    protected void K2(CharSequence charSequence) {
        this.f10143v0 = charSequence;
        TextView textView = this.f10141t0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        c cVar;
        super.X0(context);
        Fragment fragment = this;
        while (true) {
            cVar = this.f10147z0;
            if (cVar != null || fragment == 0) {
                break;
            }
            fragment = fragment.n0();
            if (fragment instanceof a.InterfaceC0147a) {
                I2((c) fragment);
            }
        }
        if (cVar == null && (context instanceof c)) {
            this.f10147z0 = (c) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(S());
        this.f10146y0 = frameLayout;
        D2(layoutInflater.inflate(this.f10144w0, (ViewGroup) frameLayout, false));
        return this.f10146y0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (S() == null) {
            return;
        }
        this.f10146y0.removeAllViews();
        D2(((LayoutInflater) S().getSystemService("layout_inflater")).inflate(this.f10144w0, (ViewGroup) null));
    }
}
