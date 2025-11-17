package com.apptionlabs.meater_app.qsg.ui.auth.forgot;

import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import b6.i3;
import com.apptionlabs.meater_app.qsg.ui.auth.forgot.ForgotPasswordFragment;
import com.apptionlabs.meater_app.views.b0;
import com.google.android.material.button.MaterialButton;
import dh.C0577d;
import dh.C0578e;
import f8.l0;
import ih.t;
import ih.u;
import kotlin.Metadata;
import vh.l;
import wh.d0;
import wh.m;
import wh.o;
import z6.ForgotState;

/* compiled from: ForgotPasswordFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/auth/forgot/ForgotPasswordFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "H2", "E2", "Lz6/a;", "state", "B2", "K2", "J2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "view", "z1", "y1", "h1", "Ly6/e;", "t0", "Lih/g;", "D2", "()Ly6/e;", "viewModel", "Lb6/i3;", "u0", "Lb6/i3;", "C2", "()Lb6/i3;", "I2", "(Lb6/i3;)V", "binding", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ForgotPasswordFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final ih.g viewModel;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public i3 binding;

    /* compiled from: ForgotPasswordFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh/a;", "state", "Lih/u;", "b", "(Ldh/a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    static final class d extends o implements l<dh.a, u> {
        d() {
            super(1);
        }

        public final void b(dh.a aVar) {
            m.f(aVar, "state");
            ForgotPasswordFragment.this.B2((ForgotState) aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((dh.a) obj);
            return u.a;
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9704q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f9704q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9704q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class g extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9705q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9706r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9707s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9708t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9705q = aVar;
            this.f9706r = aVar2;
            this.f9707s = aVar3;
            this.f9708t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9705q.a(), d0.b(C0578e.class), this.f9706r, this.f9707s, (vh.a) null, this.f9708t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class h extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9709q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(vh.a aVar) {
            super(0);
            this.f9709q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9709q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public ForgotPasswordFragment() {
        f fVar = new f(this);
        this.viewModel = s0.a(this, d0.b(C0578e.class), new h(fVar), new g(fVar, null, null, bm.a.a(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(ForgotState forgotState) {
        if (forgotState.getLoading()) {
            ProgressBar progressBar = C2().V;
            m.e(progressBar, "loading");
            g6.d.j(progressBar);
            return;
        }
        if (forgotState.getEmailValidation() != null) {
            Integer emailValidation = forgotState.getEmailValidation();
            if (emailValidation != null && emailValidation.intValue() == 0) {
                C2().U.setError(null);
                return;
            } else {
                C2().U.setError(A0(forgotState.getEmailValidation().intValue()));
                return;
            }
        }
        if (forgotState.getServerNotReachable() != null) {
            K2();
            return;
        }
        if (forgotState.getResponse() != null) {
            ProgressBar progressBar2 = C2().V;
            m.e(progressBar2, "loading");
            g6.d.g(progressBar2);
            b0.h(S(), A0(2132018538), A0(2132017802), 2132018340, new a());
            return;
        }
        if (forgotState.getError() != null) {
            ProgressBar progressBar3 = C2().V;
            m.e(progressBar3, "loading");
            g6.d.g(progressBar3);
            b0.h(S(), A0(2132017232), forgotState.getError(), 2132018340, new b());
        }
    }

    private final C0578e D2() {
        return (C0578e) this.viewModel.getValue();
    }

    private final void E2() {
        AppCompatEditText appCompatEditText = C2().T;
        m.e(appCompatEditText, "editTextEmail");
        appCompatEditText.addTextChangedListener(new c());
        C2().R.setOnClickListener(new View.OnClickListener() { // from class: y6.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotPasswordFragment.F2(ForgotPasswordFragment.this, view);
            }
        });
        C2().X.setOnClickListener(new View.OnClickListener() { // from class: y6.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotPasswordFragment.G2(ForgotPasswordFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(ForgotPasswordFragment forgotPasswordFragment, View view) {
        m.f(forgotPasswordFragment, "this$0");
        forgotPasswordFragment.D2().u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(ForgotPasswordFragment forgotPasswordFragment, View view) {
        m.f(forgotPasswordFragment, "this$0");
        l0.H(forgotPasswordFragment.Y(), i6.c.INSTANCE.b());
    }

    private final void H2() {
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) c2();
        m.c(cVar);
        androidx.appcompat.app.a x02 = cVar.x0();
        if (x02 != null) {
            x02.m();
        }
        androidx.appcompat.app.c cVar2 = (androidx.appcompat.app.c) c2();
        m.c(cVar2);
        androidx.appcompat.app.a x03 = cVar2.x0();
        if (x03 != null) {
            x03.G("");
        }
        ProgressBar progressBar = C2().V;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        C2().V(D2());
        MaterialButton materialButton = C2().R;
        m.e(materialButton, "btnSendEmail");
        u6.a.a(materialButton, false);
        C2().U.requestFocus();
        AppCompatEditText appCompatEditText = C2().T;
        m.e(appCompatEditText, "editTextEmail");
        u6.a.h(appCompatEditText);
        C2().X.setPaintFlags(C2().X.getPaintFlags() | 8);
    }

    private final void J2() {
        t a10 = C0577d.a();
        m.e(a10, "actionToChooseProductScreen(...)");
        androidx.navigation.fragment.a.a(this).S(a10);
    }

    private final void K2() {
        b0.h(S(), A0(2132018832), A0(2132017683), 2132018340, new e());
        ProgressBar progressBar = C2().V;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = C2().S;
        m.e(materialButton, "btnSkip");
        g6.d.j(materialButton);
        C2().S.setOnClickListener(new View.OnClickListener() { // from class: y6.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotPasswordFragment.L2(ForgotPasswordFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(ForgotPasswordFragment forgotPasswordFragment, View view) {
        m.f(forgotPasswordFragment, "this$0");
        forgotPasswordFragment.J2();
    }

    public final i3 C2() {
        i3 i3Var = this.binding;
        if (i3Var != null) {
            return i3Var;
        }
        m.t("binding");
        return null;
    }

    public final void I2(i3 i3Var) {
        m.f(i3Var, "<set-?>");
        this.binding = i3Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        i3 T = i3.T(inflater, container, false);
        m.e(T, "inflate(...)");
        I2(T);
        View v10 = C2().v();
        m.e(v10, "getRoot(...)");
        return v10;
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        D2().v();
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        IBinder iBinder;
        super.y1();
        Object systemService = c2().getSystemService("input_method");
        m.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View E0 = E0();
        if (E0 != null) {
            iBinder = E0.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
        m.f(view, "view");
        super.z1(view, bundle);
        H2();
        E2();
        ah.b.c(this, D2(), new d());
    }

    /* compiled from: ForgotPasswordFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/forgot/ForgotPasswordFragment$a", "Lcom/apptionlabs/meater_app/views/b0$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements b0.a {
        a() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void a() {
            androidx.navigation.fragment.a.a(ForgotPasswordFragment.this).V();
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void b() {
        }
    }

    /* compiled from: ForgotPasswordFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/forgot/ForgotPasswordFragment$b", "Lcom/apptionlabs/meater_app/views/b0$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements b0.a {
        b() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void a() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void b() {
        }
    }

    /* compiled from: ForgotPasswordFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/forgot/ForgotPasswordFragment$e", "Lcom/apptionlabs/meater_app/views/b0$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e implements b0.a {
        e() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void a() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void b() {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/forgot/ForgotPasswordFragment$c", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lih/u;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            String obj = pk.m.N0(String.valueOf(ForgotPasswordFragment.this.C2().T.getText())).toString();
            MaterialButton materialButton = ForgotPasswordFragment.this.C2().R;
            m.e(materialButton, "btnSendEmail");
            if (obj.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.a.a(materialButton, z10);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
