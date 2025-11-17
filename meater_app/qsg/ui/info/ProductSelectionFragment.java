package com.apptionlabs.meater_app.qsg.ui.info;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6.d4;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.qsg.ui.info.ProductSelectionFragment;
import com.apptionlabs.meater_app.qsg.ui.info.a;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import ih.g;
import ih.t;
import java.util.ArrayList;
import kotlin.Metadata;
import rk.k0;
import rk.l0;
import v6.d;
import w6.Product;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: ProductSelectionFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/ProductSelectionFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "F2", "J2", "Ljava/util/ArrayList;", "Lw6/c;", "Lkotlin/collections/ArrayList;", "productList", "D2", "E2", "C2", "N2", "I2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lg7/l0;", "t0", "Lih/g;", "H2", "()Lg7/l0;", "viewModel", "Lb6/d4;", "u0", "Lb6/d4;", "G2", "()Lb6/d4;", "M2", "(Lb6/d4;)V", "binding", "Landroidx/recyclerview/widget/RecyclerView$p;", "v0", "Landroidx/recyclerview/widget/RecyclerView$p;", "layoutManager", "Lv6/d;", "w0", "Lv6/d;", "chooseProductAdapter", "Landroid/widget/FrameLayout;", "x0", "Landroid/widget/FrameLayout;", "frameLayout", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ProductSelectionFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public d4 binding;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private RecyclerView.p layoutManager;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private v6.d chooseProductAdapter;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: ProductSelectionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9819a;

        static {
            int[] iArr = new int[w6.a.values().length];
            try {
                iArr[w6.a.f19352s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.a.f19353t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.a.f19354u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9819a = iArr;
        }
    }

    /* compiled from: ProductSelectionFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/info/ProductSelectionFragment$b", "Lv6/d$b;", "", "productId", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements d.b {
        b() {
        }

        @Override // v6.d.b
        public void a(int i10) {
            if (i10 == w6.b.f19359s.getType()) {
                ProductSelectionFragment.this.N2();
                return;
            }
            if (i10 == w6.b.f19360t.getType()) {
                ProductSelectionFragment.this.N2();
                return;
            }
            w6.b bVar = w6.b.f19361u;
            if (i10 == bVar.getType()) {
                ProductSelectionFragment.this.H2().J(bVar);
                ProductSelectionFragment.this.I2();
                return;
            }
            w6.b bVar2 = w6.b.f19362v;
            if (i10 == bVar2.getType()) {
                ProductSelectionFragment.this.H2().J(bVar2);
                ProductSelectionFragment.this.I2();
                return;
            }
            w6.b bVar3 = w6.b.f19364x;
            if (i10 == bVar3.getType()) {
                ProductSelectionFragment.this.H2().J(bVar3);
                ProductSelectionFragment.this.I2();
                return;
            }
            w6.b bVar4 = w6.b.f19365y;
            if (i10 == bVar4.getType()) {
                ProductSelectionFragment.this.H2().J(bVar4);
                ProductSelectionFragment.this.I2();
            }
        }
    }

    /* compiled from: ProductSelectionFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/info/ProductSelectionFragment$c", "Lcom/apptionlabs/meater_app/qsg/ui/info/a$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c implements a.InterfaceC0137a {
        c() {
        }

        @Override // com.apptionlabs.meater_app.qsg.ui.info.a.InterfaceC0137a
        public void a() {
            ProductSelectionFragment.this.H2().J(w6.b.f19360t);
            ProductSelectionFragment.this.I2();
        }

        @Override // com.apptionlabs.meater_app.qsg.ui.info.a.InterfaceC0137a
        public void b() {
            ProductSelectionFragment.this.H2().J(w6.b.f19359s);
            ProductSelectionFragment.this.I2();
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9822q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f9822q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9822q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9823q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9824r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9825s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9826t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9823q = aVar;
            this.f9824r = aVar2;
            this.f9825s = aVar3;
            this.f9826t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9823q.a(), d0.b(l0.class), this.f9824r, this.f9825s, (vh.a) null, this.f9826t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9827q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(vh.a aVar) {
            super(0);
            this.f9827q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9827q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public ProductSelectionFragment() {
        d dVar = new d(this);
        this.viewModel = s0.a(this, d0.b(l0.class), new f(dVar), new e(dVar, null, null, bm.a.a(this)));
    }

    private final void C2(ArrayList<Product> arrayList) {
        for (w6.b bVar : w6.b.y()) {
            if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(bVar) && bVar.i(bVar) && bVar.G() != -1) {
                arrayList.add(new Product(bVar.getType(), bVar.F(), bVar.G()));
            }
        }
    }

    private final void D2(ArrayList<Product> arrayList) {
        for (w6.b bVar : w6.b.y()) {
            if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(bVar) && bVar.J(bVar) && bVar.G() != -1) {
                arrayList.add(new Product(bVar.getType(), bVar.F(), bVar.G()));
            }
        }
    }

    private final void F2() {
        w6.d s10 = H2().s();
        w6.d dVar = w6.d.f19376v;
        if (s10.compareTo(dVar) > 0) {
            t a10 = k0.a();
            m.e(a10, "actionToManualScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
            return;
        }
        H2().I(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 H2() {
        return (l0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        ih.s C = androidx.navigation.fragment.a.a(this).C();
        if (C != null && C.getId() == 2131363095) {
            ih.o a10 = androidx.navigation.fragment.a.a(this);
            t a11 = k0.a();
            m.e(a11, "actionToManualScreen(...)");
            a10.S(a11);
        }
    }

    private final void J2() {
        androidx.appcompat.app.a aVar;
        androidx.appcompat.app.a x02;
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) c2();
        if (cVar != null && (x02 = cVar.x0()) != null) {
            x02.m();
        }
        androidx.appcompat.app.c cVar2 = (androidx.appcompat.app.c) c2();
        FrameLayout frameLayout = null;
        if (cVar2 != null) {
            aVar = cVar2.x0();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.G("");
        }
        G2().f7666g.setText(A0(2132018272));
        G2().f7666g.setVisibility(0);
        G2().f7666g.setPaintFlags(G2().f7666g.getPaintFlags() | 8);
        if (H2().y() || !H2().getShouldSaveQSGProgress()) {
            if (!H2().getShouldSaveQSGProgress()) {
                G2().f7664e.setText(A0(2132017405));
            }
            TextView textView = G2().f7664e;
            m.e(textView, "skipLabel");
            g6.d.j(textView);
            G2().f7664e.setOnClickListener(new View.OnClickListener() { // from class: g7.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductSelectionFragment.K2(ProductSelectionFragment.this, view);
                }
            });
        }
        this.layoutManager = new LinearLayoutManager(e2(), 0, false);
        RecyclerView recyclerView = G2().f7662c;
        RecyclerView.p pVar = this.layoutManager;
        if (pVar == null) {
            m.t("layoutManager");
            pVar = null;
        }
        recyclerView.setLayoutManager(pVar);
        G2().f7662c.setItemAnimator(null);
        this.chooseProductAdapter = new v6.d();
        ArrayList<Product> arrayList = new ArrayList<>();
        int i10 = a.f9819a[H2().n().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    C2(arrayList);
                }
            } else {
                E2(arrayList);
            }
        } else {
            D2(arrayList);
        }
        v6.d dVar = this.chooseProductAdapter;
        if (dVar == null) {
            m.t("chooseProductAdapter");
            dVar = null;
        }
        dVar.M(arrayList);
        RecyclerView recyclerView2 = G2().f7662c;
        v6.d dVar2 = this.chooseProductAdapter;
        if (dVar2 == null) {
            m.t("chooseProductAdapter");
            dVar2 = null;
        }
        recyclerView2.setAdapter(dVar2);
        v6.d dVar3 = this.chooseProductAdapter;
        if (dVar3 == null) {
            m.t("chooseProductAdapter");
            dVar3 = null;
        }
        dVar3.L(new b());
        G2().f7666g.setOnClickListener(new View.OnClickListener() { // from class: g7.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductSelectionFragment.L2(ProductSelectionFragment.this, view);
            }
        });
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            m.t("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(G2().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(ProductSelectionFragment productSelectionFragment, View view) {
        m.f(productSelectionFragment, "this$0");
        if (productSelectionFragment.H2().getShouldSaveQSGProgress()) {
            Intent intent = new Intent(productSelectionFragment.S(), (Class<?>) MainActivity.class);
            intent.putExtra("fromQsgScreen", true);
            productSelectionFragment.t2(intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
            productSelectionFragment.c2().setResult(-1, intent2);
        }
        productSelectionFragment.c2().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(ProductSelectionFragment productSelectionFragment, View view) {
        m.f(productSelectionFragment, "this$0");
        f8.l0.H(productSelectionFragment.Y(), i6.c.INSTANCE.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.apptionlabs.meater_app.qsg.ui.info.a, androidx.fragment.app.m] */
    public final void N2() {
        ?? aVar = new com.apptionlabs.meater_app.qsg.ui.info.a();
        aVar.N2(c2().m0(), "bottomSheetDialog");
        aVar.U2(new c());
    }

    public final d4 G2() {
        d4 d4Var = this.binding;
        if (d4Var != null) {
            return d4Var;
        }
        m.t("binding");
        return null;
    }

    public final void M2(d4 d4Var) {
        m.f(d4Var, "<set-?>");
        this.binding = d4Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        this.frameLayout = new FrameLayout(e2());
        d4 c10 = d4.c(inflater, container, false);
        m.e(c10, "inflate(...)");
        M2(c10);
        if (H2().s() != w6.d.N) {
            F2();
        }
        J2();
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            m.t("frameLayout");
            return null;
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            m.t("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        m.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        d4 c10 = d4.c((LayoutInflater) systemService, null, false);
        m.e(c10, "inflate(...)");
        M2(c10);
        J2();
    }

    private final void E2(ArrayList<Product> arrayList) {
    }
}
