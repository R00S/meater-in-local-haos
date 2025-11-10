package com.apptionlabs.meater_app.qsg.ui.info.chooseDevice;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import androidx.recyclerview.widget.RecyclerView;
import b6.b3;
import c6.h;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment;
import com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a;
import com.apptionlabs.meater_app.recipe.adapter.RecipeLinearLayoutManager;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.views.b0;
import com.apptionlabs.meater_app.views.b1;
import h5.Device;
import ih.g;
import ih.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import rk.l0;
import v6.b;
import w6.Product;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: ChooseProductFragment.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J \u0010\u0012\u001a\u00020\u00022\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0002H\u0016R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/ChooseProductFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "G2", "N2", "", "Q2", "R2", "J2", "", "Lh5/a;", "pairedDevices", "P2", "V2", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "Lkotlin/collections/ArrayList;", "devices", "T2", "W2", "U2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "y1", "Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a;", "t0", "Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a;", "bottomSheet", "Lg7/l0;", "u0", "Lih/g;", "I2", "()Lg7/l0;", "viewModel", "Lb6/b3;", "v0", "Lb6/b3;", "H2", "()Lb6/b3;", "S2", "(Lb6/b3;)V", "binding", "w0", "Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView$p;", "x0", "Landroidx/recyclerview/widget/RecyclerView$p;", "layoutManager", "Lv6/b;", "y0", "Lv6/b;", "chooseProductAdapter", "Landroid/widget/FrameLayout;", "z0", "Landroid/widget/FrameLayout;", "frameLayout", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ChooseProductFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a bottomSheet;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    public b3 binding;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private List<Device> pairedDevices;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private RecyclerView.p layoutManager;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private v6.b chooseProductAdapter;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: ChooseProductFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/info/chooseDevice/ChooseProductFragment$a", "Lv6/b$b;", "", "productId", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements b.InterfaceC0327b {
        a() {
        }

        @Override // v6.b.InterfaceC0327b
        public void a(int i10) {
            w6.a aVar = w6.a.f19352s;
            if (i10 == aVar.getType()) {
                ChooseProductFragment.this.I2().E(aVar);
            } else {
                w6.a aVar2 = w6.a.f19353t;
                if (i10 == aVar2.getType()) {
                    ChooseProductFragment.this.I2().E(aVar2);
                } else {
                    w6.a aVar3 = w6.a.f19354u;
                    if (i10 == aVar3.getType()) {
                        ChooseProductFragment.this.I2().E(aVar3);
                    }
                }
            }
            ChooseProductFragment.this.U2();
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9839q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f9839q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9839q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9840q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9841r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9842s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9843t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9840q = aVar;
            this.f9841r = aVar2;
            this.f9842s = aVar3;
            this.f9843t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9840q.a(), d0.b(l0.class), this.f9841r, this.f9842s, (vh.a) null, this.f9843t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9844q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vh.a aVar) {
            super(0);
            this.f9844q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9844q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public ChooseProductFragment() {
        c cVar = new c(this);
        this.viewModel = s0.a(this, d0.b(l0.class), new e(cVar), new d(cVar, null, null, bm.a.a(this)));
    }

    private final void G2() {
        w6.d s10 = I2().s();
        w6.d dVar = w6.d.f19375u;
        if (s10.compareTo(dVar) > 0) {
            t b10 = h7.e.b();
            m.e(b10, "actionToProductSelectionFragment(...)");
            androidx.navigation.fragment.a.a(this).S(b10);
            return;
        }
        I2().I(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 I2() {
        return (l0) this.viewModel.getValue();
    }

    private final void J2() {
        a0<? super List<Device>> a0Var = new a0() { // from class: h7.b
            @Override // android.view.a0
            public final void d(Object obj) {
                ChooseProductFragment.K2(ChooseProductFragment.this, (List) obj);
            }
        };
        a0<? super String> a0Var2 = new a0() { // from class: h7.c
            @Override // android.view.a0
            public final void d(Object obj) {
                ChooseProductFragment.L2((String) obj);
            }
        };
        I2().o().g(F0(), a0Var);
        I2().p().g(F0(), a0Var2);
        v6.b bVar = this.chooseProductAdapter;
        if (bVar == null) {
            m.t("chooseProductAdapter");
            bVar = null;
        }
        bVar.L(new a());
        H2().f7571g.setOnClickListener(new View.OnClickListener() { // from class: h7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseProductFragment.M2(ChooseProductFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(ChooseProductFragment chooseProductFragment, List list) {
        m.f(chooseProductFragment, "this$0");
        m.f(list, "devices");
        k6.b.e("(ChooseProductFragment) Existing Devices Found. Showing the list.", new Object[0]);
        if (chooseProductFragment.pairedDevices == null) {
            chooseProductFragment.pairedDevices = list;
            chooseProductFragment.P2(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(String str) {
        m.f(str, "error");
        k6.b.e("(ChooseProductFragment) Error on Existing Device API: " + str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(ChooseProductFragment chooseProductFragment, View view) {
        m.f(chooseProductFragment, "this$0");
        f8.l0.H(chooseProductFragment.Y(), i6.c.INSTANCE.i());
    }

    private final void N2() {
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
        if (this.pairedDevices == null && h.f8879a.L().isEmpty() && !b1.f10486z) {
            I2().l();
            I2().m();
        }
        H2().f7571g.setText(A0(2132018272));
        H2().f7571g.setVisibility(0);
        H2().f7571g.setPaintFlags(H2().f7571g.getPaintFlags() | 8);
        if (I2().y() || !I2().getShouldSaveQSGProgress()) {
            if (!I2().getShouldSaveQSGProgress()) {
                H2().f7569e.setText(A0(2132017405));
            }
            TextView textView = H2().f7569e;
            m.e(textView, "skipLabel");
            g6.d.j(textView);
            H2().f7569e.setOnClickListener(new View.OnClickListener() { // from class: h7.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseProductFragment.O2(ChooseProductFragment.this, view);
                }
            });
        }
        this.layoutManager = new RecipeLinearLayoutManager(e2());
        RecyclerView recyclerView = H2().f7567c;
        RecyclerView.p pVar = this.layoutManager;
        if (pVar == null) {
            m.t("layoutManager");
            pVar = null;
        }
        recyclerView.setLayoutManager(pVar);
        H2().f7567c.setItemAnimator(null);
        this.chooseProductAdapter = new v6.b();
        ArrayList arrayList = new ArrayList();
        int type = w6.a.f19352s.getType();
        String A0 = A0(2132018348);
        m.e(A0, "getString(...)");
        arrayList.add(new Product(type, A0, Q2()));
        int type2 = w6.a.f19354u.getType();
        String A02 = A0(2132017805);
        m.e(A02, "getString(...)");
        arrayList.add(new Product(type2, A02, R2()));
        v6.b bVar = this.chooseProductAdapter;
        if (bVar == null) {
            m.t("chooseProductAdapter");
            bVar = null;
        }
        bVar.M(arrayList);
        RecyclerView recyclerView2 = H2().f7567c;
        v6.b bVar2 = this.chooseProductAdapter;
        if (bVar2 == null) {
            m.t("chooseProductAdapter");
            bVar2 = null;
        }
        recyclerView2.setAdapter(bVar2);
        J2();
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            m.t("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(H2().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(ChooseProductFragment chooseProductFragment, View view) {
        m.f(chooseProductFragment, "this$0");
        if (chooseProductFragment.I2().getShouldSaveQSGProgress()) {
            Intent intent = new Intent(chooseProductFragment.S(), (Class<?>) MainActivity.class);
            intent.putExtra("fromQsgScreen", true);
            chooseProductFragment.t2(intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
            chooseProductFragment.c2().setResult(-1, intent2);
        }
        chooseProductFragment.c2().finish();
    }

    private final void P2(List<Device> list) {
        if (list.size() > 1) {
            V2(list);
        }
    }

    private final int Q2() {
        StringBuilder sb = new StringBuilder("qsg");
        for (w6.b bVar : w6.b.y()) {
            if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(bVar) && bVar.J(bVar) && bVar.G() != -1) {
                sb.append("_");
                sb.append(bVar.getType());
            }
        }
        if (pk.m.L(sb, "603", false, 2, (Object) null)) {
            return 2131231514;
        }
        return 2131231513;
    }

    private final int R2() {
        StringBuilder sb = new StringBuilder("qsg");
        for (w6.b bVar : w6.b.y()) {
            if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(bVar) && bVar.i(bVar) && bVar.G() != -1) {
                sb.append("_");
                sb.append(bVar.getType());
            }
        }
        if (pk.m.L(sb, "802", false, 2, (Object) null)) {
            return 2131231516;
        }
        return 2131231515;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2(ArrayList<MEATERDevice> arrayList) {
        w6.b bVar = w6.b.f19359s;
        Iterator<MEATERDevice> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MEATERDevice next = it.next();
            if (next.isMEATERPlus() && bVar == w6.b.f19359s) {
                bVar = w6.b.f19360t;
            }
            if (next.isMEATERBlock()) {
                bVar = w6.b.f19364x;
                break;
            }
        }
        I2().J(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2() {
        ih.s C = androidx.navigation.fragment.a.a(this).C();
        if (C != null && C.getId() == 2131362127) {
            t b10 = h7.e.b();
            m.e(b10, "actionToProductSelectionFragment(...)");
            androidx.navigation.fragment.a.a(this).S(b10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a, androidx.fragment.app.m] */
    private final void V2(List<Device> list) {
        com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a aVar = this.bottomSheet;
        if (aVar != null) {
            if (aVar != null) {
                aVar.A2();
            }
            this.bottomSheet = null;
        }
        ?? aVar2 = new com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a();
        this.bottomSheet = aVar2;
        aVar2.N2(c2().m0(), "bottomSheetDialog");
        b bVar = new b(list);
        com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a aVar3 = this.bottomSheet;
        if (aVar3 != null) {
            aVar3.U2(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        ih.s C = androidx.navigation.fragment.a.a(this).C();
        if (C != null && C.getId() == 2131362127) {
            t a10 = h7.e.a();
            m.e(a10, "actionToPermissionScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
        }
    }

    public final b3 H2() {
        b3 b3Var = this.binding;
        if (b3Var != null) {
            return b3Var;
        }
        m.t("binding");
        return null;
    }

    public final void S2(b3 b3Var) {
        m.f(b3Var, "<set-?>");
        this.binding = b3Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        this.frameLayout = new FrameLayout(e2());
        b3 c10 = b3.c(inflater, container, false);
        m.e(c10, "inflate(...)");
        S2(c10);
        if (I2().s() != w6.d.N) {
            G2();
        }
        N2();
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
        b3 c10 = b3.c((LayoutInflater) systemService, null, false);
        m.e(c10, "inflate(...)");
        S2(c10);
        N2();
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        I2().o().m(this);
    }

    /* compiled from: ChooseProductFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/info/chooseDevice/ChooseProductFragment$b", "Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a$a;", "Lih/u;", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements a.InterfaceC0138a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Device> f9837b;

        b(List<Device> list) {
            this.f9837b = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[Catch: Exception -> 0x0083, TryCatch #0 {Exception -> 0x0083, blocks: (B:10:0x0004, B:11:0x000f, B:13:0x0015, B:15:0x0021, B:18:0x0028, B:19:0x0036, B:21:0x003c, B:22:0x0049, B:24:0x004f, B:27:0x0059, B:35:0x005d, B:36:0x006b, B:38:0x0071), top: B:9:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: Exception -> 0x0083, TryCatch #0 {Exception -> 0x0083, blocks: (B:10:0x0004, B:11:0x000f, B:13:0x0015, B:15:0x0021, B:18:0x0028, B:19:0x0036, B:21:0x003c, B:22:0x0049, B:24:0x004f, B:27:0x0059, B:35:0x005d, B:36:0x006b, B:38:0x0071), top: B:9:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x000f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
        @Override // com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a.InterfaceC0138a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                r6 = this;
                java.util.List<h5.a> r0 = r6.f9837b
                if (r0 == 0) goto L89
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L83
                r0.<init>()     // Catch: java.lang.Exception -> L83
                java.util.List<h5.a> r1 = r6.f9837b     // Catch: java.lang.Exception -> L83
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L83
            Lf:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L83
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L83
                h5.a r2 = (h5.Device) r2     // Catch: java.lang.Exception -> L83
                java.lang.String r3 = r2.getId()     // Catch: java.lang.Exception -> L83
                if (r3 == 0) goto L34
                int r3 = r3.length()     // Catch: java.lang.Exception -> L83
                if (r3 != 0) goto L28
                goto L34
            L28:
                java.lang.String r3 = r2.getId()     // Catch: java.lang.Exception -> L83
                wh.m.c(r3)     // Catch: java.lang.Exception -> L83
                long r3 = f8.l0.K(r3)     // Catch: java.lang.Exception -> L83
                goto L36
            L34:
                r3 = 0
            L36:
                java.lang.Integer r5 = r2.getProbeNumber()     // Catch: java.lang.Exception -> L83
                if (r5 == 0) goto L48
                java.lang.Integer r2 = r2.getProbeNumber()     // Catch: java.lang.Exception -> L83
                wh.m.c(r2)     // Catch: java.lang.Exception -> L83
                int r2 = r2.intValue()     // Catch: java.lang.Exception -> L83
                goto L49
            L48:
                r2 = -1
            L49:
                com.apptionlabs.meater_app.model.MEATERDevice r5 = com.apptionlabs.meater_app.model.MEATERDevice.newDevice(r2, r3)     // Catch: java.lang.Exception -> L83
                if (r5 == 0) goto L56
                r5.setDeviceID(r3)     // Catch: java.lang.Exception -> L83
                r5.setProbeNumber(r2)     // Catch: java.lang.Exception -> L83
                goto L57
            L56:
                r5 = 0
            L57:
                if (r5 == 0) goto Lf
                r0.add(r5)     // Catch: java.lang.Exception -> L83
                goto Lf
            L5d:
                c6.h r1 = c6.h.f8879a     // Catch: java.lang.Exception -> L83
                r1.b0(r0)     // Catch: java.lang.Exception -> L83
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r1 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this     // Catch: java.lang.Exception -> L83
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.D2(r1, r0)     // Catch: java.lang.Exception -> L83
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L83
            L6b:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L83
                if (r1 == 0) goto L89
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L83
                com.apptionlabs.meater_app.model.MEATERDevice r1 = (com.apptionlabs.meater_app.model.MEATERDevice) r1     // Catch: java.lang.Exception -> L83
                r1.getMEATERDeviceType()     // Catch: java.lang.Exception -> L83
                c6.h r2 = c6.h.f8879a     // Catch: java.lang.Exception -> L83
                wh.m.c(r1)     // Catch: java.lang.Exception -> L83
                r2.K(r1)     // Catch: java.lang.Exception -> L83
                goto L6b
            L83:
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r0 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.F2(r0)
                return
            L89:
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r0 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a r0 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.B2(r0)
                if (r0 == 0) goto L94
                r0.A2()
            L94:
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r0 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this
                androidx.fragment.app.s r0 = r0.S()
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r1 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this
                r2 = 2132018764(0x7f14064c, float:1.9675844E38)
                java.lang.String r1 = r1.A0(r2)
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r2 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this
                r3 = 2132018376(0x7f1404c8, float:1.9675057E38)
                java.lang.String r2 = r2.A0(r3)
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment$b$a r3 = new com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment$b$a
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment r4 = com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.this
                r3.<init>(r4)
                r4 = 2132018340(0x7f1404a4, float:1.9674984E38)
                com.apptionlabs.meater_app.views.b0.h(r0, r1, r2, r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.ChooseProductFragment.b.a():void");
        }

        @Override // com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a.InterfaceC0138a
        public void b() {
            com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a aVar = ChooseProductFragment.this.bottomSheet;
            if (aVar != null) {
                aVar.A2();
            }
        }

        /* compiled from: ChooseProductFragment.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/info/chooseDevice/ChooseProductFragment$b$a", "Lcom/apptionlabs/meater_app/views/b0$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static final class a implements b0.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ChooseProductFragment f9838a;

            a(ChooseProductFragment chooseProductFragment) {
                this.f9838a = chooseProductFragment;
            }

            @Override // com.apptionlabs.meater_app.views.b0.a
            public void a() {
                this.f9838a.W2();
            }

            @Override // com.apptionlabs.meater_app.views.b0.a
            public void b() {
            }
        }
    }
}
