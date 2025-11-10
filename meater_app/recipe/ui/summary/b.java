package com.apptionlabs.meater_app.recipe.ui.summary;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6.i4;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.recipe.ui.summary.b;
import i5.Recipe;
import ih.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import n7.PreparationItem;
import n7.h;
import rk.C0475j;
import rk.C0565e;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: RecipeIngredientsFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/b;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "view", "Lih/u;", "F2", "", "J2", "K2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "v1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Ll7/j;", "t0", "Ll7/j;", "preparationItemAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "u0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Lb6/i4;", "v0", "Lb6/i4;", "binding", "Lt7/e;", "w0", "Lih/g;", "E2", "()Lt7/e;", "viewModel", "", "Ln7/c;", "x0", "Ljava/util/List;", "dataList", "Landroid/widget/FrameLayout;", "y0", "Landroid/widget/FrameLayout;", "frameLayout", "<init>", "()V", "z0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class b extends Fragment {
    public static RecipeStepsActivity.a A0;
    private static Recipe B0;
    private static h C0;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private C0475j preparationItemAdapter;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private LinearLayoutManager linearLayoutManager;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private i4 binding;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private List<PreparationItem> dataList;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: RecipeIngredientsFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/b$a;", "", "Li5/o;", "recipe", "Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$a;", "displayOption", "Ln7/h;", "screenType", "Lcom/apptionlabs/meater_app/recipe/ui/summary/b;", "a", "Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$a;", "getDisplayOption", "()Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$a;", "b", "(Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$a;)V", "Li5/o;", "Ln7/h;", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.recipe.ui.summary.b$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final b a(Recipe recipe, RecipeStepsActivity.a displayOption, h screenType) {
            m.f(recipe, "recipe");
            m.f(displayOption, "displayOption");
            m.f(screenType, "screenType");
            b bVar = new b();
            b.B0 = recipe;
            b(displayOption);
            b.C0 = screenType;
            return bVar;
        }

        public final void b(RecipeStepsActivity.a aVar) {
            m.f(aVar, "<set-?>");
            b.A0 = aVar;
        }
    }

    /* compiled from: RecipeIngredientsFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/summary/b$b", "Lm7/a;", "", "itemCount", "", "title", "Lih/u;", "c", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.recipe.ui.summary.b$b, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class C0144b implements m7.a {
        C0144b() {
        }

        @Override // m7.a
        public void a() {
            Recipe recipe = b.B0;
            if (recipe != null) {
                b.this.E2().k(recipe);
            }
        }

        @Override // m7.a
        public void b(int i10, String str) {
            m.f(str, "title");
            Recipe recipe = b.B0;
            if (recipe != null) {
                b.this.E2().o(recipe, i10, str);
            }
        }

        @Override // m7.a
        public void c(int i10, String str) {
            m.f(str, "title");
            Recipe recipe = b.B0;
            if (recipe != null) {
                b.this.E2().p(recipe, i10, str);
            }
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<Fragment> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f10022q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f10022q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment a() {
            return this.f10022q;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f10023q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f10024r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f10025s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f10026t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f10023q = aVar;
            this.f10024r = aVar2;
            this.f10025s = aVar3;
            this.f10026t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f10023q.a(), d0.b(C0565e.class), this.f10024r, this.f10025s, (vh.a) null, this.f10026t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f10027q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vh.a aVar) {
            super(0);
            this.f10027q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f10027q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public b() {
        c cVar = new c(this);
        this.viewModel = s0.a(this, d0.b(C0565e.class), new e(cVar), new d(cVar, null, null, bm.a.a(this)));
        this.dataList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0565e E2() {
        return (C0565e) this.viewModel.getValue();
    }

    private final void F2(View view) {
        this.linearLayoutManager = new LinearLayoutManager(e2());
        i4 i4Var = this.binding;
        FrameLayout frameLayout = null;
        if (i4Var == null) {
            m.t("binding");
            i4Var = null;
        }
        RecyclerView recyclerView = i4Var.f7876c;
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        if (linearLayoutManager == null) {
            m.t("linearLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        this.preparationItemAdapter = new C0475j();
        i4 i4Var2 = this.binding;
        if (i4Var2 == null) {
            m.t("binding");
            i4Var2 = null;
        }
        RecyclerView recyclerView2 = i4Var2.f7876c;
        C0475j c0475j = this.preparationItemAdapter;
        if (c0475j == null) {
            m.t("preparationItemAdapter");
            c0475j = null;
        }
        recyclerView2.setAdapter(c0475j);
        a0<? super Boolean> a0Var = new a0() { // from class: t7.a
            @Override // android.view.a0
            public final void d(Object obj) {
                b.G2(b.this, ((Boolean) obj).booleanValue());
            }
        };
        C0475j c0475j2 = this.preparationItemAdapter;
        if (c0475j2 == null) {
            m.t("preparationItemAdapter");
            c0475j2 = null;
        }
        c0475j2.M().g(F0(), a0Var);
        i4 i4Var3 = this.binding;
        if (i4Var3 == null) {
            m.t("binding");
            i4Var3 = null;
        }
        i4Var3.f7878e.setOnClickListener(new View.OnClickListener() { // from class: t7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.H2(b.this, view2);
            }
        });
        i4 i4Var4 = this.binding;
        if (i4Var4 == null) {
            m.t("binding");
            i4Var4 = null;
        }
        i4Var4.f7877d.setOnClickListener(new View.OnClickListener() { // from class: t7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.I2(b.this, view2);
            }
        });
        C0475j c0475j3 = this.preparationItemAdapter;
        if (c0475j3 == null) {
            m.t("preparationItemAdapter");
            c0475j3 = null;
        }
        c0475j3.Q(new C0144b());
        h hVar = C0;
        if (hVar == null) {
            m.t("screenType");
            hVar = null;
        }
        if (hVar == h.f15796u) {
            K2();
        }
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            m.t("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(b bVar, boolean z10) {
        m.f(bVar, "this$0");
        i4 i4Var = null;
        if (z10) {
            i4 i4Var2 = bVar.binding;
            if (i4Var2 == null) {
                m.t("binding");
            } else {
                i4Var = i4Var2;
            }
            i4Var.f7877d.setText(bVar.A0(2132018349));
            return;
        }
        i4 i4Var3 = bVar.binding;
        if (i4Var3 == null) {
            m.t("binding");
        } else {
            i4Var = i4Var3;
        }
        i4Var.f7877d.setText(bVar.A0(2132017444));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H2(b bVar, View view) {
        m.f(bVar, "this$0");
        C0475j c0475j = bVar.preparationItemAdapter;
        if (c0475j == null) {
            m.t("preparationItemAdapter");
            c0475j = null;
        }
        c0475j.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(b bVar, View view) {
        m.f(bVar, "this$0");
        C0475j c0475j = bVar.preparationItemAdapter;
        if (c0475j == null) {
            m.t("preparationItemAdapter");
            c0475j = null;
        }
        c0475j.O();
    }

    private final boolean J2() {
        return u0().getBoolean(2131034115);
    }

    private final boolean K2() {
        if (J2() && u0().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        i4 c10 = i4.c(inflater, frameLayout, false);
        m.e(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            m.t("binding");
            c10 = null;
        }
        ConstraintLayout b10 = c10.b();
        m.e(b10, "getRoot(...)");
        F2(b10);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            m.t("frameLayout");
            return null;
        }
        return frameLayout2;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        FrameLayout frameLayout = this.frameLayout;
        i4 i4Var = null;
        if (frameLayout == null) {
            m.t("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        m.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        i4 c10 = i4.c((LayoutInflater) systemService, null, false);
        m.e(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            m.t("binding");
        } else {
            i4Var = c10;
        }
        ConstraintLayout b10 = i4Var.b();
        m.e(b10, "getRoot(...)");
        F2(b10);
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        Recipe recipe = B0;
        C0475j c0475j = null;
        if (recipe != null) {
            this.dataList = E2().m(recipe);
            if (E2().j(this.dataList)) {
                i4 i4Var = this.binding;
                if (i4Var == null) {
                    m.t("binding");
                    i4Var = null;
                }
                TextView textView = i4Var.f7877d;
                m.e(textView, "rightCornerText");
                g6.d.g(textView);
            }
        }
        C0475j c0475j2 = this.preparationItemAdapter;
        if (c0475j2 == null) {
            m.t("preparationItemAdapter");
        } else {
            c0475j = c0475j2;
        }
        c0475j.P(this.dataList);
    }
}
