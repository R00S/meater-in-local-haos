package com.apptionlabs.meater_app.qsg.ui.auth.signup;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import b6.r4;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.qsg.ui.auth.signup.SignupFragment;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import d7.SignUpState;
import f8.l0;
import f8.q0;
import f8.t;
import ih.u;
import java.util.ArrayList;
import kotlin.Metadata;
import wh.d0;
import wh.o;

/* compiled from: SignupFragment.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00022\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J=\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J$\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/auth/signup/SignupFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "O2", "L2", "Ld7/a;", "state", "H2", "S2", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "X2", "Landroid/view/View;", "view", "G2", "wholeValue", "Landroid/widget/TextView;", "textView", "", "clickableValue", "Landroid/text/style/ClickableSpan;", "clickableSpans", "R2", "(Ljava/lang/String;Landroid/widget/TextView;[Ljava/lang/String;[Landroid/text/style/ClickableSpan;)V", "error", "T2", "V2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "z1", "x1", "h1", "y1", "Lc7/a;", "t0", "Lih/g;", "K2", "()Lc7/a;", "viewModel", "Lg7/l0;", "u0", "J2", "()Lg7/l0;", "qsgShareViewModel", "Lb6/r4;", "v0", "Lb6/r4;", "I2", "()Lb6/r4;", "Q2", "(Lb6/r4;)V", "binding", "w0", "Landroid/text/style/ClickableSpan;", "getTermsClick", "()Landroid/text/style/ClickableSpan;", "setTermsClick", "(Landroid/text/style/ClickableSpan;)V", "termsClick", "x0", "getPrivacyClick", "setPrivacyClick", "privacyClick", "Lj6/i;", "y0", "Lj6/i;", "connectionStateListener", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class SignupFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final ih.g viewModel;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final ih.g qsgShareViewModel;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    public r4 binding;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private ClickableSpan termsClick;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private ClickableSpan privacyClick;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private final j6.i connectionStateListener;

    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/signup/SignupFragment$a", "Lj6/i;", "", "isAvailable", "Le6/b;", "connectionType", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements j6.i {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(boolean z10, SignupFragment signupFragment) {
            wh.m.f(signupFragment, "this$0");
            if (!z10) {
                signupFragment.V2();
                return;
            }
            MaterialButton materialButton = signupFragment.I2().V;
            wh.m.e(materialButton, "btnSkip");
            g6.d.g(materialButton);
        }

        @Override // j6.i
        public void a(final boolean z10, e6.b bVar) {
            wh.m.f(bVar, "connectionType");
            Handler handler = new Handler(Looper.getMainLooper());
            final SignupFragment signupFragment = SignupFragment.this;
            handler.postDelayed(new Runnable() { // from class: c7.g
                @Override // java.lang.Runnable
                public final void run() {
                    SignupFragment.a.c(z10, signupFragment);
                }
            }, 250L);
        }
    }

    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh/a;", "state", "Lih/u;", "b", "(Ldh/a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    static final class c extends o implements vh.l<dh.a, u> {
        c() {
            super(1);
        }

        public final void b(dh.a aVar) {
            wh.m.f(aVar, "state");
            SignupFragment.this.H2((SignUpState) aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((dh.a) obj);
            return u.a;
        }
    }

    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/signup/SignupFragment$d", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "p0", "Lih/u;", "onClick", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends ClickableSpan {
        d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            wh.m.f(view, "p0");
            l0.H(SignupFragment.this.Y(), "https://meater.com/privacy-policy/");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignupFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e implements a0, wh.h {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ vh.l f9745a;

        e(vh.l lVar) {
            wh.m.f(lVar, "function");
            this.f9745a = lVar;
        }

        public final ih.c<?> a() {
            return this.f9745a;
        }

        @Override // android.view.a0
        public final /* synthetic */ void d(Object obj) {
            this.f9745a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a0) || !(obj instanceof wh.h)) {
                return false;
            }
            return wh.m.a(a(), ((wh.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "Lih/u;", "b", "(Ljava/util/ArrayList;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f extends o implements vh.l<ArrayList<String>, u> {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ s f9747r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(s sVar) {
            super(1);
            this.f9747r = sVar;
        }

        public final void b(ArrayList<String> arrayList) {
            wh.m.f(arrayList, "strings");
            if (arrayList.size() < SignupFragment.this.J2().v()) {
                SignupFragment signupFragment = SignupFragment.this;
                signupFragment.X2(signupFragment.J2().r());
            } else if (SignupFragment.this.J2().v() < arrayList.size()) {
                SignupFragment.this.J2().A(arrayList);
            }
            SignupFragment.this.J2().x().m(SignupFragment.this.c2());
            this.f9747r.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ArrayList) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class g extends o implements vh.l<String, u> {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ s f9749r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(s sVar) {
            super(1);
            this.f9749r = sVar;
        }

        public final void b(String str) {
            SignupFragment.this.J2().w().m(SignupFragment.this.c2());
            this.f9749r.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return u.a;
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class h extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9750q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f9750q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9750q.c2();
            wh.m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class i extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9751q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9752r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9753s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9754t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9751q = aVar;
            this.f9752r = aVar2;
            this.f9753s = aVar3;
            this.f9754t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9751q.a(), d0.b(rk.a.class), this.f9752r, this.f9753s, (vh.a) null, this.f9754t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class j extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9755q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(vh.a aVar) {
            super(0);
            this.f9755q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9755q.a()).y();
            wh.m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class k extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9756q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f9756q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9756q.c2();
            wh.m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class l extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9757q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9758r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9759s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9760t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9757q = aVar;
            this.f9758r = aVar2;
            this.f9759s = aVar3;
            this.f9760t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9757q.a(), d0.b(rk.l0.class), this.f9758r, this.f9759s, (vh.a) null, this.f9760t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class m extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9761q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(vh.a aVar) {
            super(0);
            this.f9761q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9761q.a()).y();
            wh.m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/signup/SignupFragment$n", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "p0", "Lih/u;", "onClick", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class n extends ClickableSpan {
        n() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            wh.m.f(view, "p0");
            l0.H(SignupFragment.this.Y(), "https://meater.com/terms-of-use");
        }
    }

    public SignupFragment() {
        h hVar = new h(this);
        this.viewModel = s0.a(this, d0.b(rk.a.class), new j(hVar), new i(hVar, null, null, bm.a.a(this)));
        k kVar = new k(this);
        this.qsgShareViewModel = s0.a(this, d0.b(rk.l0.class), new m(kVar), new l(kVar, null, null, bm.a.a(this)));
        this.termsClick = new n();
        this.privacyClick = new d();
        this.connectionStateListener = new a();
    }

    private final void G2(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(Y(), 2130772022));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(SignUpState signUpState) {
        if (signUpState.getLoading()) {
            ProgressBar progressBar = I2().f8220l0;
            wh.m.e(progressBar, "loading");
            g6.d.j(progressBar);
            return;
        }
        if (signUpState.getFirstNameValidation() != null) {
            Integer firstNameValidation = signUpState.getFirstNameValidation();
            if (firstNameValidation != null && firstNameValidation.intValue() == 0) {
                TextInputLayout textInputLayout = I2().f8212d0;
                wh.m.e(textInputLayout, "firstName");
                u6.a.d(textInputLayout);
                return;
            } else {
                TextInputLayout textInputLayout2 = I2().f8212d0;
                wh.m.e(textInputLayout2, "firstName");
                String A0 = A0(signUpState.getFirstNameValidation().intValue());
                wh.m.e(A0, "getString(...)");
                u6.a.g(textInputLayout2, A0);
                return;
            }
        }
        if (signUpState.getLastNameValidation() != null) {
            Integer lastNameValidation = signUpState.getLastNameValidation();
            if (lastNameValidation != null && lastNameValidation.intValue() == 0) {
                TextInputLayout textInputLayout3 = I2().f8218j0;
                wh.m.e(textInputLayout3, "lastName");
                u6.a.d(textInputLayout3);
                return;
            } else {
                TextInputLayout textInputLayout4 = I2().f8218j0;
                wh.m.e(textInputLayout4, "lastName");
                String A02 = A0(signUpState.getLastNameValidation().intValue());
                wh.m.e(A02, "getString(...)");
                u6.a.g(textInputLayout4, A02);
                return;
            }
        }
        if (signUpState.getEmailValidation() != null) {
            Integer emailValidation = signUpState.getEmailValidation();
            if (emailValidation != null && emailValidation.intValue() == 0) {
                TextInputLayout textInputLayout5 = I2().f8210b0;
                wh.m.e(textInputLayout5, "emailField");
                u6.a.d(textInputLayout5);
                return;
            } else {
                TextInputLayout textInputLayout6 = I2().f8210b0;
                wh.m.e(textInputLayout6, "emailField");
                String A03 = A0(signUpState.getEmailValidation().intValue());
                wh.m.e(A03, "getString(...)");
                u6.a.g(textInputLayout6, A03);
                return;
            }
        }
        if (signUpState.getPasswordValidation() != null) {
            Integer passwordValidation = signUpState.getPasswordValidation();
            if (passwordValidation != null && passwordValidation.intValue() == 0) {
                TextInputLayout textInputLayout7 = I2().f8221m0;
                wh.m.e(textInputLayout7, "passwordField");
                u6.a.d(textInputLayout7);
                return;
            } else {
                TextInputLayout textInputLayout8 = I2().f8221m0;
                wh.m.e(textInputLayout8, "passwordField");
                String A04 = A0(signUpState.getPasswordValidation().intValue());
                wh.m.e(A04, "getString(...)");
                u6.a.g(textInputLayout8, A04);
                return;
            }
        }
        if (signUpState.getConfirmPasswordValidation() != null) {
            Integer confirmPasswordValidation = signUpState.getConfirmPasswordValidation();
            if (confirmPasswordValidation != null && confirmPasswordValidation.intValue() == 0) {
                TextInputLayout textInputLayout9 = I2().f8222n0;
                wh.m.e(textInputLayout9, "rePasswordField");
                u6.a.d(textInputLayout9);
                return;
            } else {
                TextInputLayout textInputLayout10 = I2().f8222n0;
                wh.m.e(textInputLayout10, "rePasswordField");
                String A05 = A0(signUpState.getConfirmPasswordValidation().intValue());
                wh.m.e(A05, "getString(...)");
                u6.a.g(textInputLayout10, A05);
                return;
            }
        }
        if (signUpState.getPasswordMatchValidation() != null) {
            Integer passwordMatchValidation = signUpState.getPasswordMatchValidation();
            if (passwordMatchValidation != null && passwordMatchValidation.intValue() == 0) {
                TextInputLayout textInputLayout11 = I2().f8222n0;
                wh.m.e(textInputLayout11, "rePasswordField");
                u6.a.d(textInputLayout11);
                return;
            } else {
                TextInputLayout textInputLayout12 = I2().f8222n0;
                wh.m.e(textInputLayout12, "rePasswordField");
                String A06 = A0(signUpState.getPasswordMatchValidation().intValue());
                wh.m.e(A06, "getString(...)");
                u6.a.g(textInputLayout12, A06);
                return;
            }
        }
        if (signUpState.getTermsCheckValidation()) {
            AppCompatCheckBox appCompatCheckBox = I2().W;
            wh.m.e(appCompatCheckBox, "checkAgreeToTerm");
            G2(appCompatCheckBox);
            AppCompatTextView appCompatTextView = I2().Q;
            wh.m.e(appCompatTextView, "agreeToTerm");
            G2(appCompatTextView);
            return;
        }
        if (signUpState.getUser() != null) {
            ProgressBar progressBar2 = I2().f8220l0;
            wh.m.e(progressBar2, "loading");
            g6.d.g(progressBar2);
            K2().E();
            return;
        }
        if (signUpState.getLoginUser() != null) {
            ProgressBar progressBar3 = I2().f8220l0;
            wh.m.e(progressBar3, "loading");
            g6.d.g(progressBar3);
            S2();
            return;
        }
        if (signUpState.getError() != null) {
            T2(signUpState.getError());
            return;
        }
        if (signUpState.getErrorMessage() != null) {
            T2(signUpState.getErrorMessage());
            return;
        }
        if (signUpState.getErrorExistingUser()) {
            String A07 = A0(2132017694);
            wh.m.e(A07, "getString(...)");
            T2(A07);
        } else if (signUpState.getServerNotReachable() != null) {
            I2().f8211c0.setText(signUpState.getServerNotReachable());
            LinearLayout linearLayout = I2().S;
            wh.m.e(linearLayout, "alertView");
            g6.d.j(linearLayout);
            q0.a(I2().S, true);
            V2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rk.l0 J2() {
        return (rk.l0) this.qsgShareViewModel.getValue();
    }

    private final rk.a K2() {
        return (rk.a) this.viewModel.getValue();
    }

    private final void L2() {
        b bVar = new b();
        I2().Z.addTextChangedListener(bVar);
        I2().Y.addTextChangedListener(bVar);
        I2().U.setOnClickListener(new View.OnClickListener() { // from class: c7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignupFragment.M2(SignupFragment.this, view);
            }
        });
        I2().f8227s0.setOnClickListener(new View.OnClickListener() { // from class: c7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignupFragment.N2(SignupFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(SignupFragment signupFragment, View view) {
        wh.m.f(signupFragment, "this$0");
        if (signupFragment.K2().D()) {
            q0.a(signupFragment.I2().S, false);
        } else {
            LinearLayout linearLayout = signupFragment.I2().S;
            wh.m.e(linearLayout, "alertView");
            g6.d.g(linearLayout);
        }
        signupFragment.K2().I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(SignupFragment signupFragment, View view) {
        wh.m.f(signupFragment, "this$0");
        l0.H(signupFragment.Y(), i6.c.INSTANCE.b());
    }

    private final void O2() {
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) c2();
        wh.m.c(cVar);
        androidx.appcompat.app.a x02 = cVar.x0();
        if (x02 != null) {
            x02.m();
        }
        androidx.appcompat.app.c cVar2 = (androidx.appcompat.app.c) c2();
        wh.m.c(cVar2);
        androidx.appcompat.app.a x03 = cVar2.x0();
        if (x03 != null) {
            x03.G("");
        }
        I2().V(K2());
        ProgressBar progressBar = I2().f8220l0;
        wh.m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = I2().U;
        wh.m.e(materialButton, "btnSignup");
        g6.d.a(materialButton);
        I2().f8227s0.setPaintFlags(I2().f8227s0.getPaintFlags() | 8);
        String A0 = A0(2132018447);
        wh.m.e(A0, "getString(...)");
        String A02 = A0(2132018803);
        wh.m.e(A02, "getString(...)");
        String B0 = B0(2132017911, A02, A0);
        wh.m.e(B0, "getString(...)");
        AppCompatTextView appCompatTextView = I2().Q;
        wh.m.e(appCompatTextView, "agreeToTerm");
        R2(B0, appCompatTextView, new String[]{A02, A0}, new ClickableSpan[]{this.termsClick, this.privacyClick});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(SignupFragment signupFragment) {
        wh.m.f(signupFragment, "this$0");
        if (!t.f12516a.b()) {
            signupFragment.V2();
        }
    }

    private final void R2(String wholeValue, TextView textView, String[] clickableValue, ClickableSpan[] clickableSpans) {
        SpannableString spannableString = new SpannableString(wholeValue);
        int length = clickableValue.length;
        for (int i10 = 0; i10 < length; i10++) {
            ClickableSpan clickableSpan = clickableSpans[i10];
            String str = clickableValue[i10];
            int Y = pk.m.Y(wholeValue, str, 0, false, 6, (Object) null);
            spannableString.setSpan(clickableSpan, Y, str.length() + Y, 33);
        }
        textView.setHighlightColor(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    private final void S2() {
        s c22 = c2();
        wh.m.e(c22, "requireActivity(...)");
        if (c22 instanceof CloudAccountActivity) {
            J2().m();
            J2().x().g(c2(), new e(new f(c22)));
            J2().w().g(c2(), new e(new g(c22)));
        } else {
            K2().C();
            ih.t a10 = rk.h.a();
            wh.m.e(a10, "actionToChooseProductScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
        }
    }

    private final void T2(String str) {
        IBinder iBinder;
        Object systemService = c2().getSystemService("input_method");
        wh.m.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View E0 = E0();
        if (E0 != null) {
            iBinder = E0.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        ProgressBar progressBar = I2().f8220l0;
        wh.m.e(progressBar, "loading");
        g6.d.g(progressBar);
        I2().f8211c0.setText(str);
        LinearLayout linearLayout = I2().S;
        wh.m.e(linearLayout, "alertView");
        g6.d.j(linearLayout);
        q0.a(I2().S, true);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: c7.e
            @Override // java.lang.Runnable
            public final void run() {
                SignupFragment.U2(SignupFragment.this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(SignupFragment signupFragment) {
        wh.m.f(signupFragment, "this$0");
        signupFragment.I2().f8223o0.fullScroll(33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V2() {
        ProgressBar progressBar = I2().f8220l0;
        wh.m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = I2().V;
        wh.m.e(materialButton, "btnSkip");
        g6.d.j(materialButton);
        I2().V.setOnClickListener(new View.OnClickListener() { // from class: c7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignupFragment.W2(SignupFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(SignupFragment signupFragment, View view) {
        wh.m.f(signupFragment, "this$0");
        signupFragment.S2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(ArrayList<String> arrayList) {
        Intent intent = new Intent(Y(), (Class<?>) VideoTutorialSummaryActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, arrayList);
        c2().startActivity(intent);
    }

    public final r4 I2() {
        r4 r4Var = this.binding;
        if (r4Var != null) {
            return r4Var;
        }
        wh.m.t("binding");
        return null;
    }

    public final void Q2(r4 r4Var) {
        wh.m.f(r4Var, "<set-?>");
        this.binding = r4Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        wh.m.f(inflater, "inflater");
        r4 T = r4.T(inflater, container, false);
        wh.m.e(T, "inflate(...)");
        Q2(T);
        View v10 = I2().v();
        wh.m.e(v10, "getRoot(...)");
        return v10;
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        K2().G();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        t.f12516a.c(this.connectionStateListener);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: c7.b
            @Override // java.lang.Runnable
            public final void run() {
                SignupFragment.P2(SignupFragment.this);
            }
        }, 500L);
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        t.f12516a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
        wh.m.f(view, "view");
        super.z1(view, bundle);
        O2();
        L2();
        ah.b.c(this, K2(), new c());
    }

    /* compiled from: SignupFragment.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/auth/signup/SignupFragment$b", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Lih/u;", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            MaterialButton materialButton = SignupFragment.this.I2().U;
            wh.m.e(materialButton, "btnSignup");
            if (pk.m.N0(String.valueOf(SignupFragment.this.I2().Y.getText())).toString().length() > 0 && String.valueOf(SignupFragment.this.I2().Z.getText()).length() > 0) {
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
