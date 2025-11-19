package C5;

import L4.E0;
import M4.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import d.ActivityC3006j;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: CompactProbeView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"LC5/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Loa/F;", "z2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "LL4/E0;", "G0", "LL4/E0;", "binding", "LA5/m;", "H0", "Loa/i;", "y2", "()LA5/m;", "viewModel", "I0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends Fragment {

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: J0, reason: collision with root package name */
    public static final int f2174J0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private E0 binding;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new d(this, null, new c(this), null, null));

    /* compiled from: CompactProbeView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LC5/e$a;", "", "<init>", "()V", "LC5/e;", "a", "()LC5/e;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C5.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final e a() {
            e eVar = new e();
            eVar.k2(new Bundle());
            return eVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CompactProbeView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C5/e$b", "LM4/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Probe f2178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T5.o f2179c;

        b(Probe probe, T5.o oVar) {
            this.f2178b = probe;
            this.f2179c = oVar;
        }

        @Override // M4.h.a
        public void a(MEATERDevice device) {
            C3862t.g(device, "device");
            E0 e02 = e.this.binding;
            E0 e03 = null;
            if (e02 == null) {
                C3862t.u("binding");
                e02 = null;
            }
            e02.f9344t.b(this.f2178b, O4.g.f13259B);
            E0 e04 = e.this.binding;
            if (e04 == null) {
                C3862t.u("binding");
                e04 = null;
            }
            e04.f9345u.b(this.f2178b, O4.g.f13260C);
            E0 e05 = e.this.binding;
            if (e05 == null) {
                C3862t.u("binding");
                e05 = null;
            }
            e05.f9343s.b(this.f2178b, O4.g.f13261D);
            E0 e06 = e.this.binding;
            if (e06 == null) {
                C3862t.u("binding");
                e06 = null;
            }
            e06.f9326b.setAlpha(this.f2179c.i());
            E0 e07 = e.this.binding;
            if (e07 == null) {
                C3862t.u("binding");
                e07 = null;
            }
            e07.f9330f.g(this.f2178b);
            E0 e08 = e.this.binding;
            if (e08 == null) {
                C3862t.u("binding");
                e08 = null;
            }
            e08.f9347w.setText(this.f2179c.j());
            E0 e09 = e.this.binding;
            if (e09 == null) {
                C3862t.u("binding");
                e09 = null;
            }
            AppCompatImageView appCompatImageView = e09.f9340p;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(this.f2179c.l() == null ? 4 : 0);
            }
            E0 e010 = e.this.binding;
            if (e010 == null) {
                C3862t.u("binding");
                e010 = null;
            }
            AppCompatTextView appCompatTextView = e010.f9339o;
            if (appCompatTextView != null) {
                appCompatTextView.setText(this.f2179c.l());
            }
            E0 e011 = e.this.binding;
            if (e011 == null) {
                C3862t.u("binding");
                e011 = null;
            }
            AppCompatTextView appCompatTextView2 = e011.f9339o;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(this.f2179c.l() == null ? 4 : 0);
            }
            E0 e012 = e.this.binding;
            if (e012 == null) {
                C3862t.u("binding");
            } else {
                e03 = e012;
            }
            e03.f9331g.setText(this.f2179c.k());
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2180B;

        public c(Fragment fragment) {
            this.f2180B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f2180B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Ba.a<A5.m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2181B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f2182C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f2183D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f2184E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f2185F;

        public d(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f2181B = fragment;
            this.f2182C = aVar;
            this.f2183D = aVar2;
            this.f2184E = aVar3;
            this.f2185F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [A5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A5.m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f2181B;
            dd.a aVar3 = this.f2182C;
            Ba.a aVar4 = this.f2183D;
            Ba.a aVar5 = this.f2184E;
            Ba.a aVar6 = this.f2185F;
            c0 c0Var = (c0) aVar4.invoke();
            b0 b0VarV = c0Var.v();
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
            return ld.b.b(P.b(A5.m.class), b0VarV, (4 & 4) != 0 ? null : null, aVar, (4 & 16) != 0 ? null : aVar3, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar6);
        }
    }

    private final A5.m y2() {
        return (A5.m) this.viewModel.getValue();
    }

    private final void z2() {
        if (y2().getProbeID() != -1) {
            M4.h hVar = M4.h.f11978a;
            MEATERDevice mEATERDeviceO = hVar.o(y2().getProbeID());
            C3862t.d(mEATERDeviceO);
            Probe probe = (Probe) mEATERDeviceO;
            E0 e02 = this.binding;
            E0 e03 = null;
            if (e02 == null) {
                C3862t.u("binding");
                e02 = null;
            }
            e02.f9337m.q(probe);
            T5.o oVar = new T5.o();
            oVar.u(probe);
            oVar.s(null);
            E0 e04 = this.binding;
            if (e04 == null) {
                C3862t.u("binding");
                e04 = null;
            }
            e04.f9344t.b(probe, O4.g.f13259B);
            E0 e05 = this.binding;
            if (e05 == null) {
                C3862t.u("binding");
                e05 = null;
            }
            e05.f9345u.b(probe, O4.g.f13260C);
            E0 e06 = this.binding;
            if (e06 == null) {
                C3862t.u("binding");
                e06 = null;
            }
            e06.f9343s.b(probe, O4.g.f13261D);
            E0 e07 = this.binding;
            if (e07 == null) {
                C3862t.u("binding");
                e07 = null;
            }
            e07.f9330f.g(probe);
            E0 e08 = this.binding;
            if (e08 == null) {
                C3862t.u("binding");
            } else {
                e03 = e08;
            }
            SwipeLayout swipeLayout = e03.f9342r;
            if (swipeLayout != null) {
                swipeLayout.setRightSwipeEnabled(false);
            }
            hVar.A(this, probe.getDeviceID(), new b(probe, oVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        E0 e0C = E0.c(inflater, container, false);
        this.binding = e0C;
        if (e0C == null) {
            C3862t.u("binding");
            e0C = null;
        }
        SwipeLayout swipeLayoutB = e0C.b();
        C3862t.f(swipeLayoutB, "getRoot(...)");
        return swipeLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        z2();
    }
}
