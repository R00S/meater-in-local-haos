package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.C2098e0;
import android.view.InterfaceC2114v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import t3.C4550g;

/* compiled from: DialogFragment.java */
/* loaded from: classes.dex */
public class n extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: G0, reason: collision with root package name */
    private Handler f25680G0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f25689P0;

    /* renamed from: R0, reason: collision with root package name */
    private Dialog f25691R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f25692S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f25693T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f25694U0;

    /* renamed from: H0, reason: collision with root package name */
    private Runnable f25681H0 = new a();

    /* renamed from: I0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f25682I0 = new b();

    /* renamed from: J0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f25683J0 = new c();

    /* renamed from: K0, reason: collision with root package name */
    private int f25684K0 = 0;

    /* renamed from: L0, reason: collision with root package name */
    private int f25685L0 = 0;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f25686M0 = true;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f25687N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private int f25688O0 = -1;

    /* renamed from: Q0, reason: collision with root package name */
    private android.view.E<InterfaceC2114v> f25690Q0 = new d();

    /* renamed from: V0, reason: collision with root package name */
    private boolean f25695V0 = false;

    /* compiled from: DialogFragment.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f25683J0.onDismiss(n.this.f25691R0);
        }
    }

    /* compiled from: DialogFragment.java */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (n.this.f25691R0 != null) {
                n nVar = n.this;
                nVar.onCancel(nVar.f25691R0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (n.this.f25691R0 != null) {
                n nVar = n.this;
                nVar.onDismiss(nVar.f25691R0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class d implements android.view.E<InterfaceC2114v> {
        d() {
        }

        @Override // android.view.E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC2114v interfaceC2114v) {
            if (interfaceC2114v == null || !n.this.f25687N0) {
                return;
            }
            View viewF2 = n.this.f2();
            if (viewF2.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (n.this.f25691R0 != null) {
                if (v.Q0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + n.this.f25691R0);
                }
                n.this.f25691R0.setContentView(viewF2);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class e extends J1.g {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ J1.g f25700B;

        e(J1.g gVar) {
            this.f25700B = gVar;
        }

        @Override // J1.g
        public View e(int i10) {
            return this.f25700B.f() ? this.f25700B.e(i10) : n.this.G2(i10);
        }

        @Override // J1.g
        public boolean f() {
            return this.f25700B.f() || n.this.H2();
        }
    }

    private void C2(boolean z10, boolean z11, boolean z12) {
        if (this.f25693T0) {
            return;
        }
        this.f25693T0 = true;
        this.f25694U0 = false;
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f25691R0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f25680G0.getLooper()) {
                    onDismiss(this.f25691R0);
                } else {
                    this.f25680G0.post(this.f25681H0);
                }
            }
        }
        this.f25692S0 = true;
        if (this.f25688O0 >= 0) {
            if (z12) {
                o0().n1(this.f25688O0, 1);
            } else {
                o0().k1(this.f25688O0, 1, z10);
            }
            this.f25688O0 = -1;
            return;
        }
        C cR = o0().r();
        cR.A(true);
        cR.s(this);
        if (z12) {
            cR.l();
        } else if (z10) {
            cR.k();
        } else {
            cR.j();
        }
    }

    private void I2(Bundle bundle) {
        if (this.f25687N0 && !this.f25695V0) {
            try {
                this.f25689P0 = true;
                Dialog dialogF2 = F2(bundle);
                this.f25691R0 = dialogF2;
                if (this.f25687N0) {
                    M2(dialogF2, this.f25684K0);
                    Context contextZ = Z();
                    if (contextZ instanceof Activity) {
                        this.f25691R0.setOwnerActivity((Activity) contextZ);
                    }
                    this.f25691R0.setCancelable(this.f25686M0);
                    this.f25691R0.setOnCancelListener(this.f25682I0);
                    this.f25691R0.setOnDismissListener(this.f25683J0);
                    this.f25695V0 = true;
                } else {
                    this.f25691R0 = null;
                }
                this.f25689P0 = false;
            } catch (Throwable th) {
                this.f25689P0 = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        Bundle bundle2;
        super.A1(bundle);
        if (this.f25691R0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f25691R0.onRestoreInstanceState(bundle2);
    }

    public void A2() {
        C2(false, false, false);
    }

    public void B2() {
        C2(true, false, false);
    }

    public Dialog D2() {
        return this.f25691R0;
    }

    public int E2() {
        return this.f25685L0;
    }

    public Dialog F2(Bundle bundle) {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.r(e2(), E2());
    }

    View G2(int i10) {
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    void H1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.H1(layoutInflater, viewGroup, bundle);
        if (this.f25489l0 != null || this.f25691R0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f25691R0.onRestoreInstanceState(bundle2);
    }

    boolean H2() {
        return this.f25695V0;
    }

    public final Dialog J2() {
        Dialog dialogD2 = D2();
        if (dialogD2 != null) {
            return dialogD2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void K2(boolean z10) {
        this.f25686M0 = z10;
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void L2(boolean z10) {
        this.f25687N0 = z10;
    }

    public void M2(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void N2(v vVar, String str) {
        this.f25693T0 = false;
        this.f25694U0 = true;
        C cR = vVar.r();
        cR.A(true);
        cR.e(this, str);
        cR.j();
    }

    @Override // androidx.fragment.app.Fragment
    J1.g O() {
        return new e(super.O());
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void U0(Bundle bundle) {
        super.U0(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        super.X0(context);
        G0().i(this.f25690Q0);
        if (this.f25694U0) {
            return;
        }
        this.f25693T0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
        this.f25680G0 = new Handler();
        this.f25687N0 = this.f25479b0 == 0;
        if (bundle != null) {
            this.f25684K0 = bundle.getInt("android:style", 0);
            this.f25685L0 = bundle.getInt("android:theme", 0);
            this.f25686M0 = bundle.getBoolean("android:cancelable", true);
            this.f25687N0 = bundle.getBoolean("android:showsDialog", this.f25687N0);
            this.f25688O0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            this.f25692S0 = true;
            dialog.setOnDismissListener(null);
            this.f25691R0.dismiss();
            if (!this.f25693T0) {
                onDismiss(this.f25691R0);
            }
            this.f25691R0 = null;
            this.f25695V0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i1() {
        super.i1();
        if (!this.f25694U0 && !this.f25693T0) {
            this.f25693T0 = true;
        }
        G0().m(this.f25690Q0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater j1(Bundle bundle) {
        LayoutInflater layoutInflaterJ1 = super.j1(bundle);
        if (this.f25687N0 && !this.f25689P0) {
            I2(bundle);
            if (v.Q0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f25691R0;
            return dialog != null ? layoutInflaterJ1.cloneInContext(dialog.getContext()) : layoutInflaterJ1;
        }
        if (v.Q0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f25687N0) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterJ1;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f25692S0) {
            return;
        }
        if (v.Q0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        C2(true, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void w1(Bundle bundle) {
        super.w1(bundle);
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f25684K0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f25685L0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f25686M0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f25687N0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f25688O0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            this.f25692S0 = false;
            dialog.show();
            View decorView = this.f25691R0.getWindow().getDecorView();
            android.view.View.b(decorView, this);
            C2098e0.b(decorView, this);
            C4550g.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        Dialog dialog = this.f25691R0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
