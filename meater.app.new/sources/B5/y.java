package B5;

import Xb.A0;
import Xb.C1837g;
import Xb.C1841i;
import Xb.G0;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.InterfaceC1870x;
import Xb.J;
import Xb.T;
import Xb.Z;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import x5.EnumC5056a;

/* compiled from: StepsDialog.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"LB5/y;", "Landroidx/fragment/app/n;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "V2", "(Landroid/view/View;)V", "f1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lv5/p;", "W0", "Lv5/p;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "X0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "LXb/x;", "Y0", "LXb/x;", "getJob", "()LXb/x;", "job", "LXb/I;", "Z0", "LXb/I;", "uiScope", "Landroid/widget/FrameLayout;", "a1", "Landroid/widget/FrameLayout;", "frameLayout", "b1", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class y extends androidx.fragment.app.n {

    /* renamed from: d1, reason: collision with root package name */
    private static ArrayList<String> f1691d1;

    /* renamed from: e1, reason: collision with root package name */
    private static int f1692e1;

    /* renamed from: g1, reason: collision with root package name */
    private static Recipe f1694g1;

    /* renamed from: h1, reason: collision with root package name */
    private static EnumC5056a f1695h1;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    private v5.p adapter;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private LinearLayoutManager linearLayoutManager;

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1870x job;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private final I uiScope;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c1, reason: collision with root package name */
    public static final int f1690c1 = 8;

    /* renamed from: f1, reason: collision with root package name */
    private static long f1693f1 = -1;

    /* compiled from: StepsDialog.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"LB5/y$a;", "", "<init>", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "steps", "", "currentStep", "Lo4/o;", "recipe", "", "probeID", "Lx5/a;", "heightType", "LB5/y;", "a", "(Ljava/util/ArrayList;ILo4/o;JLx5/a;)LB5/y;", "Ljava/util/ArrayList;", "I", "J", "Lo4/o;", "Lx5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ y b(Companion companion, ArrayList arrayList, int i10, Recipe recipe, long j10, EnumC5056a enumC5056a, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                enumC5056a = EnumC5056a.f52803E;
            }
            return companion.a(arrayList, i10, recipe, j10, enumC5056a);
        }

        public final y a(ArrayList<String> steps, int currentStep, Recipe recipe, long probeID, EnumC5056a heightType) {
            C3862t.g(steps, "steps");
            C3862t.g(recipe, "recipe");
            C3862t.g(heightType, "heightType");
            y yVar = new y();
            y.f1691d1 = steps;
            y.f1692e1 = currentStep;
            y.f1694g1 = recipe;
            y.f1693f1 = probeID;
            y.f1695h1 = heightType;
            return yVar;
        }

        private Companion() {
        }
    }

    /* compiled from: StepsDialog.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.dialogs.StepsDialog$initViews$1", f = "StepsDialog.kt", l = {83, 84}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1701B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ RecyclerView f1702C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ NestedScrollView f1703D;

        /* compiled from: StepsDialog.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.dialogs.StepsDialog$initViews$1$1", f = "StepsDialog.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f1704B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ RecyclerView f1705C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ NestedScrollView f1706D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(RecyclerView recyclerView, NestedScrollView nestedScrollView, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f1705C = recyclerView;
                this.f1706D = nestedScrollView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f1705C, this.f1706D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f1704B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f1706D.V(0, (int) this.f1705C.getChildAt(y.f1692e1 - 1).getY());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView, NestedScrollView nestedScrollView, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1702C = recyclerView;
            this.f1703D = nestedScrollView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f1702C, this.f1703D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f1701B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f1701B = 1;
                if (T.a(300L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    return C4153F.f46609a;
                }
                C4173r.b(obj);
            }
            G0 g0C = Z.c();
            a aVar = new a(this.f1702C, this.f1703D, null);
            this.f1701B = 2;
            if (C1837g.g(g0C, aVar, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    public y() {
        InterfaceC1870x interfaceC1870xB = A0.b(null, 1, null);
        this.job = interfaceC1870xB;
        this.uiScope = J.a(Z.c().s(interfaceC1870xB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(y yVar, View view) {
        yVar.A2();
    }

    public final void V2(View view) {
        C3862t.g(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.titleText);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.rootView);
        textView.setText(A0(R.string.steps_label));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(e2());
        this.linearLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        Recipe recipe = f1694g1;
        FrameLayout frameLayout = null;
        if (recipe == null) {
            C3862t.u("recipe");
            recipe = null;
        }
        androidx.fragment.app.v vVarO0 = o0();
        C3862t.f(vVarO0, "getParentFragmentManager(...)");
        v5.p pVar = new v5.p(recipe, vVarO0);
        this.adapter = pVar;
        ArrayList<String> arrayList = f1691d1;
        if (arrayList == null) {
            C3862t.u("steps");
            arrayList = null;
        }
        pVar.M(arrayList, f1692e1, f1693f1);
        v5.p pVar2 = this.adapter;
        if (pVar2 == null) {
            C3862t.u("adapter");
            pVar2 = null;
        }
        recyclerView.setAdapter(pVar2);
        if (f1692e1 > 10) {
            C1841i.d(this.uiScope, Z.b(), null, new b(recyclerView, nestedScrollView, null), 2, null);
        }
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                y.W2(this.f1688B, view2);
            }
        });
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        K2(true);
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        View viewInflate = inflater.inflate(R.layout.recipe_steps_dialog, (ViewGroup) frameLayout, false);
        C3862t.f(viewInflate, "inflate(...)");
        V2(viewInflate);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void f1() {
        InterfaceC1867v0.a.a(this.job, null, 1, null);
        super.f1();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.recipe_steps_dialog, (ViewGroup) null, false);
        C3862t.d(viewInflate);
        V2(viewInflate);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        Window window;
        super.x1();
        Dialog dialogD2 = D2();
        if (dialogD2 == null || (window = dialogD2.getWindow()) == null) {
            return;
        }
        window.setLayout(-2, -1);
    }
}
