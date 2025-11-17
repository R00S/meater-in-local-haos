package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.view.t0;
import android.view.v0;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s0;
import b6.x9;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.WifiSetUpSignInFragment;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSIDEncryptionType;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import f8.l0;
import ih.g;
import ih.h;
import k7.p;
import kotlin.Metadata;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: WifiSetUpSignInFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpSignInFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "E2", "C2", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetupHostActivity;", "activity", "y2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "view", "z1", "y1", "Lk7/p;", "t0", "Lh3/h;", "z2", "()Lk7/p;", "args", "", "u0", "I", "getMaxPasswordLength", "()I", "setMaxPasswordLength", "(I)V", "maxPasswordLength", "Lcom/apptionlabs/meater_app/v3protobuf/MEATERSSIDEncryptionType;", "v0", "Lcom/apptionlabs/meater_app/v3protobuf/MEATERSSIDEncryptionType;", "getEncryptionType", "()Lcom/apptionlabs/meater_app/v3protobuf/MEATERSSIDEncryptionType;", "setEncryptionType", "(Lcom/apptionlabs/meater_app/v3protobuf/MEATERSSIDEncryptionType;)V", "encryptionType", "Lb6/x9;", "w0", "Lb6/x9;", "A2", "()Lb6/x9;", "F2", "(Lb6/x9;)V", "binding", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/c;", "x0", "Lih/g;", "B2", "()Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/c;", "wifiSetUpViewModel", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class WifiSetUpSignInFragment extends Fragment {

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public x9 binding;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final h args = new h(d0.b(p.class), new e(this));

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private int maxPasswordLength = 63;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private MEATERSSIDEncryptionType encryptionType = MEATERSSIDEncryptionType.MEATER_SSID_ENCRYPTION_TYPE_WPA2_AES;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final g wifiSetUpViewModel = s0.b(this, d0.b(com.apptionlabs.meater_app.qsg.ui.wifisetup.c.class), new b(this), new c(null, this), new d(this));

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "b", "()Landroidx/lifecycle/v0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9903q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f9903q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = this.f9903q.c2().y();
            m.e(y10, "requireActivity().viewModelStore");
            return y10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Lv0/a;", "b", "()Lv0/a;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<v0.a> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9904q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f9905r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vh.a aVar, Fragment fragment) {
            super(0);
            this.f9904q = aVar;
            this.f9905r = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0.a a() {
            v0.a aVar;
            vh.a aVar2 = this.f9904q;
            if (aVar2 == null || (aVar = (v0.a) aVar2.a()) == null) {
                v0.a n10 = this.f9905r.c2().n();
                m.e(n10, "requireActivity().defaultViewModelCreationExtras");
                return n10;
            }
            return aVar;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9906q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f9906q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            t0.b defaultViewModelProviderFactory = this.f9906q.c2().getDefaultViewModelProviderFactory();
            m.e(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh3/g;", "Args", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.a<Bundle> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9907q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f9907q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle W = this.f9907q.W();
            if (W != null) {
                return W;
            }
            throw new IllegalStateException("Fragment " + this.f9907q + " has null arguments");
        }
    }

    private final com.apptionlabs.meater_app.qsg.ui.wifisetup.c B2() {
        return (com.apptionlabs.meater_app.qsg.ui.wifisetup.c) this.wifiSetUpViewModel.getValue();
    }

    private final void C2() {
        A2().W.addTextChangedListener(new a());
        A2().U.setOnClickListener(new View.OnClickListener() { // from class: k7.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetUpSignInFragment.D2(WifiSetUpSignInFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(WifiSetUpSignInFragment wifiSetUpSignInFragment, View view) {
        m.f(wifiSetUpSignInFragment, "this$0");
        String valueOf = String.valueOf(wifiSetUpSignInFragment.A2().W.getText());
        WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) wifiSetUpSignInFragment.c2();
        if (valueOf.length() < 6) {
            wifiSetUpSignInFragment.A2().f8462a0.setError(wifiSetUpSignInFragment.A0(2132017682));
            return;
        }
        if (l0.d(wifiSetUpSignInFragment.B2().f9921e, "2.0") == -1) {
            wifiSetUpSignInFragment.A2().f8462a0.setError(null);
            if (!l0.M(valueOf)) {
                if (wifiSetupHostActivity != null) {
                    wifiSetupHostActivity.s2();
                    return;
                }
                return;
            }
            wifiSetUpSignInFragment.y2(wifiSetupHostActivity);
            return;
        }
        wifiSetUpSignInFragment.A2().f8462a0.setError(null);
        if (!l0.N(valueOf) && !l0.M(valueOf) && wifiSetupHostActivity != null) {
            wifiSetupHostActivity.s2();
        }
        if (valueOf.length() > 6) {
            wifiSetUpSignInFragment.y2(wifiSetupHostActivity);
        }
    }

    private final void E2() {
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
        A2().f8462a0.requestFocus();
        TextInputEditText textInputEditText = A2().W;
        m.e(textInputEditText, "editTextPassword");
        u6.a.h(textInputEditText);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = A2().U;
        m.e(materialButton, "btnLogin");
        u6.a.a(materialButton, false);
        String d10 = z2().d();
        m.e(d10, "getWifiNetworkName(...)");
        if (z2().a().getEncryptionType() != null) {
            MEATERSSIDEncryptionType encryptionType = z2().a().getEncryptionType();
            m.e(encryptionType, "getEncryptionType(...)");
            this.encryptionType = encryptionType;
        }
        this.maxPasswordLength = z2().c();
        A2().V.setText(d10);
        A2().V.setInputType(0);
        A2().W.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxPasswordLength)});
        if (B2().f9922f != null) {
            LinearLayout linearLayout = A2().S;
            m.e(linearLayout, "alertView");
            g6.d.j(linearLayout);
            A2().R.setText(B2().l());
            A2().Q.setText(B2().k());
            return;
        }
        LinearLayout linearLayout2 = A2().S;
        m.e(linearLayout2, "alertView");
        g6.d.g(linearLayout2);
    }

    private final void y2(WifiSetupHostActivity wifiSetupHostActivity) {
        l0.u(c2(), A2().f8462a0);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.j(progressBar);
        A2().R.setText((CharSequence) null);
        A2().Q.setText((CharSequence) null);
        if (wifiSetupHostActivity != null) {
            wifiSetupHostActivity.q2(String.valueOf(A2().V.getText()), String.valueOf(A2().W.getText()));
        }
    }

    public final x9 A2() {
        x9 x9Var = this.binding;
        if (x9Var != null) {
            return x9Var;
        }
        m.t("binding");
        return null;
    }

    public final void F2(x9 x9Var) {
        m.f(x9Var, "<set-?>");
        this.binding = x9Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        x9 T = x9.T(inflater, container, false);
        m.e(T, "inflate(...)");
        F2(T);
        View v10 = A2().v();
        m.e(v10, "getRoot(...)");
        return v10;
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
        E2();
        C2();
    }

    public final p z2() {
        return (p) this.args.getValue();
    }

    /* compiled from: WifiSetUpSignInFragment.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpSignInFragment$a", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Lih/u;", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            MaterialButton materialButton = WifiSetUpSignInFragment.this.A2().U;
            m.e(materialButton, "btnLogin");
            if (String.valueOf(WifiSetUpSignInFragment.this.A2().W.getText()).length() > 0) {
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
