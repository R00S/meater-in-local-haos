package com.apptionlabs.meater_app.qsg.ui.auth.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.a0;
import android.view.inputmethod.InputMethodManager;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import b6.q3;
import b7.UserState;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.activities.GoogleFaceBookRegistrationActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.qsg.ui.auth.login.LoginFragment;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import com.google.android.material.button.MaterialButton;
import f8.q0;
import ih.t;
import ih.u;
import java.util.ArrayList;
import kotlin.Metadata;
import rk.l0;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: LoginFragment.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J \u0010\u0010\u001a\u00020\u00022\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u0010<\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010808078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/auth/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "R2", "N2", "Lb7/a;", "state", "H2", "V2", "M2", "I2", "U2", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "Z2", "Y2", "W2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "x1", "view", "z1", "y1", "h1", "La7/i;", "t0", "Lih/g;", "L2", "()La7/i;", "viewModel", "Lg7/l0;", "u0", "K2", "()Lg7/l0;", "qsgShareViewModel", "Lb6/q3;", "v0", "Lb6/q3;", "J2", "()Lb6/q3;", "T2", "(Lb6/q3;)V", "binding", "Lj6/i;", "w0", "Lj6/i;", "connectionStateListener", "Landroidx/activity/result/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "x0", "Landroidx/activity/result/c;", "termsAndConditionLauncher", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class LoginFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final ih.g viewModel;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final ih.g qsgShareViewModel;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    public q3 binding;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final j6.i connectionStateListener;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private android.view.result.c<Intent> termsAndConditionLauncher;

    /* compiled from: LoginFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/login/LoginFragment$a", "Lj6/i;", "", "isAvailable", "Le6/b;", "connectionType", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements j6.i {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(boolean z10, LoginFragment loginFragment) {
            m.f(loginFragment, "this$0");
            if (!z10) {
                loginFragment.W2();
                return;
            }
            MaterialButton materialButton = loginFragment.J2().T;
            m.e(materialButton, "btnSkip");
            g6.d.g(materialButton);
        }

        @Override // j6.i
        public void a(final boolean z10, e6.b bVar) {
            m.f(bVar, "connectionType");
            Handler handler = new Handler(Looper.getMainLooper());
            final LoginFragment loginFragment = LoginFragment.this;
            handler.postDelayed(new Runnable() { // from class: a7.g
                @Override // java.lang.Runnable
                public final void run() {
                    LoginFragment.a.c(z10, loginFragment);
                }
            }, 250L);
        }
    }

    /* compiled from: LoginFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh/a;", "state", "Lih/u;", "b", "(Ldh/a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    static final class c extends o implements vh.l<dh.a, u> {
        c() {
            super(1);
        }

        public final void b(dh.a aVar) {
            m.f(aVar, "state");
            LoginFragment.this.H2((UserState) aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((dh.a) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d implements a0, wh.h {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ vh.l f9718a;

        d(vh.l lVar) {
            m.f(lVar, "function");
            this.f9718a = lVar;
        }

        public final ih.c<?> a() {
            return this.f9718a;
        }

        @Override // android.view.a0
        public final /* synthetic */ void d(Object obj) {
            this.f9718a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a0) || !(obj instanceof wh.h)) {
                return false;
            }
            return m.a(a(), ((wh.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "Lih/u;", "b", "(Ljava/util/ArrayList;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.l<ArrayList<String>, u> {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ s f9720r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(s sVar) {
            super(1);
            this.f9720r = sVar;
        }

        public final void b(ArrayList<String> arrayList) {
            m.f(arrayList, "strings");
            if (arrayList.size() < LoginFragment.this.K2().v()) {
                LoginFragment loginFragment = LoginFragment.this;
                loginFragment.Z2(loginFragment.K2().r());
            } else if (LoginFragment.this.K2().v() < arrayList.size()) {
                LoginFragment.this.K2().A(arrayList);
            }
            LoginFragment.this.K2().x().m(LoginFragment.this.c2());
            this.f9720r.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ArrayList) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f extends o implements vh.l<String, u> {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ s f9722r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(s sVar) {
            super(1);
            this.f9722r = sVar;
        }

        public final void b(String str) {
            LoginFragment.this.K2().w().m(LoginFragment.this.c2());
            this.f9722r.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return u.a;
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class g extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9723q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f9723q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9723q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class h extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9724q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9725r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9726s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9727t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9724q = aVar;
            this.f9725r = aVar2;
            this.f9726s = aVar3;
            this.f9727t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9724q.a(), d0.b(dh.i.class), this.f9725r, this.f9726s, (vh.a) null, this.f9727t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class i extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9728q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(vh.a aVar) {
            super(0);
            this.f9728q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9728q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class j extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9729q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f9729q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9729q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class k extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9730q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9731r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9732s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9733t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9730q = aVar;
            this.f9731r = aVar2;
            this.f9732s = aVar3;
            this.f9733t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9730q.a(), d0.b(l0.class), this.f9731r, this.f9732s, (vh.a) null, this.f9733t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class l extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9734q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(vh.a aVar) {
            super(0);
            this.f9734q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9734q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public LoginFragment() {
        g gVar = new g(this);
        this.viewModel = s0.a(this, d0.b(dh.i.class), new i(gVar), new h(gVar, null, null, bm.a.a(this)));
        j jVar = new j(this);
        this.qsgShareViewModel = s0.a(this, d0.b(l0.class), new l(jVar), new k(jVar, null, null, bm.a.a(this)));
        this.connectionStateListener = new a();
        android.view.result.c<Intent> a22 = a2(new e.d(), new android.view.result.b() { // from class: a7.a
            @Override // android.view.result.b
            public final void a(Object obj) {
                LoginFragment.a3(LoginFragment.this, (android.view.result.a) obj);
            }
        });
        m.e(a22, "registerForActivityResult(...)");
        this.termsAndConditionLauncher = a22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(UserState userState) {
        if (userState.getLoading()) {
            V2();
            return;
        }
        if (userState.getEmailValidation() != null) {
            Integer emailValidation = userState.getEmailValidation();
            if (emailValidation != null && emailValidation.intValue() == 0) {
                J2().W.setError(null);
                return;
            } else {
                J2().W.setError(A0(userState.getEmailValidation().intValue()));
                return;
            }
        }
        if (userState.getPasswordValidation() != null) {
            Integer passwordValidation = userState.getPasswordValidation();
            if (passwordValidation != null && passwordValidation.intValue() == 0) {
                J2().f8163b0.setError(null);
                return;
            } else {
                J2().f8163b0.setError(A0(userState.getPasswordValidation().intValue()));
                return;
            }
        }
        if (userState.getInvalidTermsAndCondition() != null) {
            M2();
            J2().X.setText(userState.getError());
            LinearLayout linearLayout = J2().Q;
            m.e(linearLayout, "alertView");
            g6.d.j(linearLayout);
            q0.a(J2().Q, true);
            Y2();
            return;
        }
        if (userState.getError() != null) {
            M2();
            J2().X.setText(userState.getError());
            LinearLayout linearLayout2 = J2().Q;
            m.e(linearLayout2, "alertView");
            g6.d.j(linearLayout2);
            q0.a(J2().Q, true);
            return;
        }
        if (userState.getUser() != null) {
            M2();
            LinearLayout linearLayout3 = J2().Q;
            m.e(linearLayout3, "alertView");
            g6.d.g(linearLayout3);
            U2();
            return;
        }
        if (userState.getServerNotReachable() != null) {
            M2();
            J2().X.setText(userState.getServerNotReachable());
            LinearLayout linearLayout4 = J2().Q;
            m.e(linearLayout4, "alertView");
            g6.d.j(linearLayout4);
            q0.a(J2().Q, true);
            W2();
        }
    }

    private final void I2() {
        J2().W.setAlpha(1.0f);
        J2().f8163b0.setAlpha(1.0f);
        J2().S.setAlpha(1.0f);
        J2().Y.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 K2() {
        return (l0) this.qsgShareViewModel.getValue();
    }

    private final dh.i L2() {
        return (dh.i) this.viewModel.getValue();
    }

    private final void M2() {
        Window window;
        ProgressBar progressBar = J2().f8162a0;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        s S = S();
        if (S != null && (window = S.getWindow()) != null) {
            g6.e.b(window);
        }
        I2();
    }

    private final void N2() {
        b bVar = new b();
        J2().V.addTextChangedListener(bVar);
        J2().U.addTextChangedListener(bVar);
        J2().S.setOnClickListener(new View.OnClickListener() { // from class: a7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.O2(LoginFragment.this, view);
            }
        });
        J2().Y.setOnClickListener(new View.OnClickListener() { // from class: a7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.P2(LoginFragment.this, view);
            }
        });
        J2().f8165d0.setOnClickListener(new View.OnClickListener() { // from class: a7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.Q2(LoginFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(LoginFragment loginFragment, View view) {
        m.f(loginFragment, "this$0");
        LinearLayout linearLayout = loginFragment.J2().Q;
        m.e(linearLayout, "alertView");
        g6.d.g(linearLayout);
        q0.a(loginFragment.J2().Q, false);
        loginFragment.L2().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(LoginFragment loginFragment, View view) {
        m.f(loginFragment, "this$0");
        t b10 = dh.h.b();
        m.e(b10, "actionToForgotPasswordScreen(...)");
        androidx.navigation.fragment.a.a(loginFragment).S(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(LoginFragment loginFragment, View view) {
        m.f(loginFragment, "this$0");
        f8.l0.H(loginFragment.Y(), i6.c.INSTANCE.b());
    }

    private final void R2() {
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
        J2().W.requestFocus();
        AppCompatEditText appCompatEditText = J2().U;
        m.e(appCompatEditText, "editTextEmail");
        u6.a.h(appCompatEditText);
        ProgressBar progressBar = J2().f8162a0;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        J2().V(L2());
        MaterialButton materialButton = J2().S;
        m.e(materialButton, "btnLogin");
        u6.a.a(materialButton, false);
        J2().f8165d0.setPaintFlags(J2().f8165d0.getPaintFlags() | 8);
        J2().Y.setPaintFlags(J2().Y.getPaintFlags() | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(LoginFragment loginFragment) {
        m.f(loginFragment, "this$0");
        if (!f8.t.f12516a.b()) {
            loginFragment.W2();
        }
    }

    private final void U2() {
        L2().v();
        s c22 = c2();
        m.e(c22, "requireActivity(...)");
        if (c22 instanceof CloudAccountActivity) {
            K2().m();
            K2().x().g(c2(), new d(new e(c22)));
            K2().w().g(c2(), new d(new f(c22)));
        } else {
            t a10 = dh.h.a();
            m.e(a10, "actionToChooseProductScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
        }
    }

    private final void V2() {
        Window window;
        ProgressBar progressBar = J2().f8162a0;
        m.e(progressBar, "loading");
        g6.d.j(progressBar);
        LinearLayout linearLayout = J2().Q;
        m.e(linearLayout, "alertView");
        g6.d.g(linearLayout);
        s S = S();
        if (S != null && (window = S.getWindow()) != null) {
            g6.e.a(window);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        ProgressBar progressBar = J2().f8162a0;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = J2().T;
        m.e(materialButton, "btnSkip");
        g6.d.j(materialButton);
        J2().T.setOnClickListener(new View.OnClickListener() { // from class: a7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.X2(LoginFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(LoginFragment loginFragment, View view) {
        m.f(loginFragment, "this$0");
        loginFragment.U2();
    }

    private final void Y2() {
        Intent intent = new Intent(c2(), (Class<?>) GoogleFaceBookRegistrationActivity.class);
        intent.putExtra("tm_screen", true);
        intent.putExtra("MA", true);
        this.termsAndConditionLauncher.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(ArrayList<String> arrayList) {
        Intent intent = new Intent(Y(), (Class<?>) VideoTutorialSummaryActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, arrayList);
        c2().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(LoginFragment loginFragment, android.view.result.a aVar) {
        m.f(loginFragment, "this$0");
        if (aVar != null && aVar.b() == -1 && aVar.a() != null) {
            Intent a10 = aVar.a();
            m.c(a10);
            if (!a10.getBooleanExtra("error", false)) {
                loginFragment.M2();
                LinearLayout linearLayout = loginFragment.J2().Q;
                m.e(linearLayout, "alertView");
                g6.d.g(linearLayout);
                loginFragment.U2();
            }
        }
    }

    public final q3 J2() {
        q3 q3Var = this.binding;
        if (q3Var != null) {
            return q3Var;
        }
        m.t("binding");
        return null;
    }

    public final void T2(q3 q3Var) {
        m.f(q3Var, "<set-?>");
        this.binding = q3Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        q3 T = q3.T(inflater, container, false);
        m.e(T, "inflate(...)");
        T2(T);
        View v10 = J2().v();
        m.e(v10, "getRoot(...)");
        return v10;
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        M2();
        L2().y();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        f8.t.f12516a.c(this.connectionStateListener);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: a7.f
            @Override // java.lang.Runnable
            public final void run() {
                LoginFragment.S2(LoginFragment.this);
            }
        }, 500L);
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
        f8.t.f12516a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
        m.f(view, "view");
        super.z1(view, bundle);
        R2();
        N2();
        ah.b.c(this, L2(), new c());
    }

    /* compiled from: LoginFragment.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/login/LoginFragment$b", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Lih/u;", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            MaterialButton materialButton = LoginFragment.this.J2().S;
            m.e(materialButton, "btnLogin");
            if (pk.m.N0(String.valueOf(LoginFragment.this.J2().U.getText())).toString().length() > 0 && String.valueOf(LoginFragment.this.J2().V.getText()).length() > 0) {
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
