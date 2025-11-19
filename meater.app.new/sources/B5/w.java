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
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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

/* compiled from: StepsBottomDialog.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"LB5/w;", "LB5/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "d3", "(Landroid/view/View;)V", "f1", "Lv5/p;", "Z0", "Lv5/p;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "LXb/x;", "b1", "LXb/x;", "getJob", "()LXb/x;", "job", "LXb/I;", "c1", "LXb/I;", "uiScope", "d1", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class w extends AbstractC0884b {

    /* renamed from: f1, reason: collision with root package name */
    private static ArrayList<String> f1673f1;

    /* renamed from: g1, reason: collision with root package name */
    private static int f1674g1;

    /* renamed from: i1, reason: collision with root package name */
    private static Recipe f1676i1;

    /* renamed from: j1, reason: collision with root package name */
    private static EnumC5056a f1677j1;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private v5.p adapter;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private LinearLayoutManager linearLayoutManager;

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1870x job;

    /* renamed from: c1, reason: collision with root package name and from kotlin metadata */
    private final I uiScope;

    /* renamed from: d1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e1, reason: collision with root package name */
    public static final int f1672e1 = 8;

    /* renamed from: h1, reason: collision with root package name */
    private static long f1675h1 = -1;

    /* compiled from: StepsBottomDialog.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"LB5/w$a;", "", "<init>", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "steps", "", "currentStep", "Lo4/o;", "recipe", "", "probeID", "Lx5/a;", "heightType", "LB5/w;", "a", "(Ljava/util/ArrayList;ILo4/o;JLx5/a;)LB5/w;", "Ljava/util/ArrayList;", "I", "J", "Lo4/o;", "Lx5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ w b(Companion companion, ArrayList arrayList, int i10, Recipe recipe, long j10, EnumC5056a enumC5056a, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                enumC5056a = EnumC5056a.f52803E;
            }
            return companion.a(arrayList, i10, recipe, j10, enumC5056a);
        }

        public final w a(ArrayList<String> steps, int currentStep, Recipe recipe, long probeID, EnumC5056a heightType) {
            C3862t.g(steps, "steps");
            C3862t.g(recipe, "recipe");
            C3862t.g(heightType, "heightType");
            w wVar = new w();
            w.f1673f1 = steps;
            w.f1674g1 = currentStep;
            w.f1676i1 = recipe;
            w.f1675h1 = probeID;
            w.f1677j1 = heightType;
            return wVar;
        }

        private Companion() {
        }
    }

    /* compiled from: StepsBottomDialog.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.dialogs.StepsBottomDialog$initViews$1", f = "StepsBottomDialog.kt", l = {77, 78}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1682B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ RecyclerView f1683C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ NestedScrollView f1684D;

        /* compiled from: StepsBottomDialog.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.dialogs.StepsBottomDialog$initViews$1$1", f = "StepsBottomDialog.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f1685B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ RecyclerView f1686C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ NestedScrollView f1687D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(RecyclerView recyclerView, NestedScrollView nestedScrollView, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f1686C = recyclerView;
                this.f1687D = nestedScrollView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f1686C, this.f1687D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f1685B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f1687D.V(0, (int) this.f1686C.getChildAt(w.f1674g1 - 1).getY());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView, NestedScrollView nestedScrollView, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1683C = recyclerView;
            this.f1684D = nestedScrollView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f1683C, this.f1684D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f1682B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f1682B = 1;
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
            a aVar = new a(this.f1683C, this.f1684D, null);
            this.f1682B = 2;
            if (C1837g.g(g0C, aVar, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    public w() {
        super(null);
        InterfaceC1870x interfaceC1870xB = A0.b(null, 1, null);
        this.job = interfaceC1870xB;
        this.uiScope = J.a(Z.c().s(interfaceC1870xB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(w wVar, View view) {
        wVar.A2();
    }

    public void d3(View view) {
        C3862t.g(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.titleText);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.rootView);
        textView.setText(A0(R.string.steps_label));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(e2());
        this.linearLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        Recipe recipe = f1676i1;
        if (recipe == null) {
            C3862t.u("recipe");
            recipe = null;
        }
        androidx.fragment.app.v vVarO0 = o0();
        C3862t.f(vVarO0, "getParentFragmentManager(...)");
        v5.p pVar = new v5.p(recipe, vVarO0);
        this.adapter = pVar;
        ArrayList<String> arrayList = f1673f1;
        if (arrayList == null) {
            C3862t.u("steps");
            arrayList = null;
        }
        pVar.M(arrayList, f1674g1, f1675h1);
        v5.p pVar2 = this.adapter;
        if (pVar2 == null) {
            C3862t.u("adapter");
            pVar2 = null;
        }
        recyclerView.setAdapter(pVar2);
        if (f1674g1 > 10) {
            C1841i.d(this.uiScope, Z.b(), null, new b(recyclerView, nestedScrollView, null), 2, null);
        }
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w.e3(this.f1670B, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_steps_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        d3(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void f1() {
        InterfaceC1867v0.a.a(this.job, null, 1, null);
        super.f1();
    }

    @Override // B5.AbstractC0884b, androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        Window window;
        super.x1();
        Dialog dialogD2 = D2();
        if (dialogD2 == null || (window = dialogD2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
