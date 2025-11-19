package J4;

import N.WindowSizeClass;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.e1;
import androidx.fragment.app.Fragment;
import d.ActivityC3006j;
import java.util.List;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: MainFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018²\u0006\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\nX\u008a\u0084\u0002"}, d2 = {"LJ4/b0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LT5/m;", "G0", "Loa/i;", "y2", "()LT5/m;", "viewModel", "H0", "a", "", "", "dashboardInfoList", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1206b0 extends Fragment {

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: I0, reason: collision with root package name */
    public static final int f7453I0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new d(this, null, new c(this), null, null));

    /* compiled from: MainFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJ4/b0$a;", "", "<init>", "()V", "LJ4/b0;", "a", "()LJ4/b0;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.b0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C1206b0 a() {
            C1206b0 c1206b0 = new C1206b0();
            c1206b0.k2(new Bundle());
            return c1206b0;
        }

        private Companion() {
        }
    }

    /* compiled from: MainFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.b0$b */
    static final class b implements Ba.p<InterfaceC1554l, Integer, C4153F> {
        b() {
        }

        private static final List<Object> b(x1<? extends List<? extends Object>> x1Var) {
            return x1Var.getValue();
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-338888384, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainFragment.onCreateView.<anonymous>.<anonymous> (MainFragment.kt:41)");
            }
            androidx.fragment.app.o oVarC2 = C1206b0.this.c2();
            C3862t.f(oVarC2, "requireActivity(...)");
            WindowSizeClass windowSizeClassA = N.a.a(oVarC2, interfaceC1554l, 0);
            androidx.fragment.app.o oVarC22 = C1206b0.this.c2();
            C3862t.f(oVarC22, "requireActivity(...)");
            List<F3.a> listA = J6.a.a(oVarC22, interfaceC1554l, 0);
            x1 x1VarB = m1.b(C1206b0.this.y2().r(), null, interfaceC1554l, 0, 1);
            z0.e0(windowSizeClassA, listA, b(x1VarB), m1.b(C1206b0.this.y2().q(), null, interfaceC1554l, 0, 1), C1206b0.this.y2(), interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.b0$c */
    public static final class c implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f7456B;

        public c(Fragment fragment) {
            this.f7456B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f7456B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.b0$d */
    public static final class d implements Ba.a<T5.m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f7457B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f7458C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f7459D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f7460E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f7461F;

        public d(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f7457B = fragment;
            this.f7458C = aVar;
            this.f7459D = aVar2;
            this.f7460E = aVar3;
            this.f7461F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T5.m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f7457B;
            dd.a aVar3 = this.f7458C;
            Ba.a aVar4 = this.f7459D;
            Ba.a aVar5 = this.f7460E;
            Ba.a aVar6 = this.f7461F;
            android.view.c0 c0Var = (android.view.c0) aVar4.invoke();
            android.view.b0 b0VarV = c0Var.v();
            if (aVar5 == null || (aVar2 = (Q1.a) aVar5.invoke()) == null) {
                ActivityC3006j activityC3006j = c0Var instanceof ActivityC3006j ? (ActivityC3006j) c0Var : null;
                if (activityC3006j != null) {
                    aVarM = activityC3006j.m();
                } else {
                    aVarM = fragment.m();
                    C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
                }
                aVar = aVarM;
            } else {
                aVar = aVar2;
            }
            return ld.b.b(kotlin.jvm.internal.P.b(T5.m.class), b0VarV, (4 & 4) != 0 ? null : null, aVar, (4 & 16) != 0 ? null : aVar3, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T5.m y2() {
        return (T5.m) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        Context contextE2 = e2();
        C3862t.f(contextE2, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextE2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(e1.c.f23125b);
        composeView.setContent(W.c.b(-338888384, true, new b()));
        return composeView;
    }
}
