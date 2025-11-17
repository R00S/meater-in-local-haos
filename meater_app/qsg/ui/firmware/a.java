package com.apptionlabs.meater_app.qsg.ui.firmware;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import b6.x2;
import ih.g;
import kotlin.Metadata;
import rk.l0;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: BaseFirmwareFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u000bH&J\b\u0010\u0012\u001a\u00020\u000bH&J\u0006\u0010\u0014\u001a\u00020\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/firmware/a;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "view", "Lih/u;", "z1", "E2", "D2", "C2", "F2", "G2", "B2", "Lw6/b;", "y2", "Lb6/x2;", "t0", "Lb6/x2;", "x2", "()Lb6/x2;", "A2", "(Lb6/x2;)V", "binding", "Lg7/l0;", "u0", "Lih/g;", "z2", "()Lg7/l0;", "viewModel", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class a extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    protected x2 binding;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel;

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.qsg.ui.firmware.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class C0136a extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9788q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0136a(Fragment fragment) {
            super(0);
            this.f9788q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9788q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9789q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9790r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9791s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9792t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9789q = aVar;
            this.f9790r = aVar2;
            this.f9791s = aVar3;
            this.f9792t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9789q.a(), d0.b(l0.class), this.f9790r, this.f9791s, (vh.a) null, this.f9792t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9793q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vh.a aVar) {
            super(0);
            this.f9793q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9793q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public a() {
        C0136a c0136a = new C0136a(this);
        this.viewModel = s0.a(this, d0.b(l0.class), new c(c0136a), new b(c0136a, null, null, bm.a.a(this)));
    }

    protected final void A2(x2 x2Var) {
        m.f(x2Var, "<set-?>");
        this.binding = x2Var;
    }

    public abstract void B2();

    public abstract void C2();

    public abstract void D2();

    public abstract void E2();

    public abstract void F2();

    public abstract void G2();

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        ViewDataBinding h10 = androidx.databinding.g.h(inflater, 2131558522, null, false);
        m.e(h10, "inflate(...)");
        A2((x2) h10);
        View v10 = x2().v();
        m.e(v10, "getRoot(...)");
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final x2 x2() {
        x2 x2Var = this.binding;
        if (x2Var != null) {
            return x2Var;
        }
        m.t("binding");
        return null;
    }

    public final w6.b y2() {
        return z2().t();
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
        m.f(view, "view");
        super.z1(view, bundle);
        s c22 = c2();
        m.d(c22, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) c22;
        androidx.appcompat.app.a x02 = cVar.x0();
        if (x02 != null) {
            x02.m();
        }
        androidx.appcompat.app.a x03 = cVar.x0();
        if (x03 != null) {
            x03.G("");
        }
        E2();
        D2();
        C2();
        F2();
        G2();
        B2();
    }

    public final l0 z2() {
        return (l0) this.viewModel.getValue();
    }
}
