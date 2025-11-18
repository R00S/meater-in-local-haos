package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.AbstractC2106m;
import android.view.C2116x;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.b0;
import android.view.c0;
import d.ActivityC3006j;
import d.C2995G;
import f.InterfaceC3299b;
import f1.C3309b;
import g.AbstractC3373e;
import g.InterfaceC3374f;
import g1.InterfaceC3378b;
import g1.InterfaceC3379c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r1.InterfaceC4334a;
import s1.InterfaceC4420A;
import s1.InterfaceC4464w;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class o extends ActivityC3006j implements C3309b.e {

    /* renamed from: Z, reason: collision with root package name */
    boolean f25704Z;

    /* renamed from: a0, reason: collision with root package name */
    boolean f25705a0;

    /* renamed from: X, reason: collision with root package name */
    final q f25702X = q.b(new a());

    /* renamed from: Y, reason: collision with root package name */
    final C2116x f25703Y = new C2116x(this);

    /* renamed from: b0, reason: collision with root package name */
    boolean f25706b0 = true;

    /* compiled from: FragmentActivity.java */
    class a extends s<o> implements InterfaceC3378b, InterfaceC3379c, f1.r, f1.s, c0, d.J, InterfaceC3374f, InterfaceC4549f, J1.n, InterfaceC4464w {
        public a() {
            super(o.this);
        }

        @Override // t3.InterfaceC4549f
        public C4547d B() {
            return o.this.B();
        }

        @Override // s1.InterfaceC4464w
        public void C(InterfaceC4420A interfaceC4420A) {
            o.this.C(interfaceC4420A);
        }

        @Override // g1.InterfaceC3379c
        public void D(InterfaceC4334a<Integer> interfaceC4334a) {
            o.this.D(interfaceC4334a);
        }

        @Override // f1.s
        public void M(InterfaceC4334a<f1.v> interfaceC4334a) {
            o.this.M(interfaceC4334a);
        }

        @Override // J1.n
        public void a(v vVar, Fragment fragment) {
            o.this.E0(fragment);
        }

        @Override // d.J
        /* renamed from: c */
        public C2995G getOnBackPressedDispatcher() {
            return o.this.getOnBackPressedDispatcher();
        }

        @Override // f1.r
        public void d(InterfaceC4334a<f1.j> interfaceC4334a) {
            o.this.d(interfaceC4334a);
        }

        @Override // androidx.fragment.app.s, J1.g
        public View e(int i10) {
            return o.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.s, J1.g
        public boolean f() {
            Window window = o.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // g1.InterfaceC3379c
        public void g(InterfaceC4334a<Integer> interfaceC4334a) {
            o.this.g(interfaceC4334a);
        }

        @Override // android.view.InterfaceC2114v
        public AbstractC2106m getLifecycle() {
            return o.this.f25703Y;
        }

        @Override // g1.InterfaceC3378b
        public void j(InterfaceC4334a<Configuration> interfaceC4334a) {
            o.this.j(interfaceC4334a);
        }

        @Override // androidx.fragment.app.s
        public void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            o.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // s1.InterfaceC4464w
        public void o(InterfaceC4420A interfaceC4420A) {
            o.this.o(interfaceC4420A);
        }

        @Override // androidx.fragment.app.s
        public LayoutInflater p() {
            return o.this.getLayoutInflater().cloneInContext(o.this);
        }

        @Override // g.InterfaceC3374f
        /* renamed from: r */
        public AbstractC3373e getActivityResultRegistry() {
            return o.this.getActivityResultRegistry();
        }

        @Override // androidx.fragment.app.s
        public void s() {
            t();
        }

        public void t() {
            o.this.m0();
        }

        @Override // g1.InterfaceC3378b
        public void u(InterfaceC4334a<Configuration> interfaceC4334a) {
            o.this.u(interfaceC4334a);
        }

        @Override // android.view.c0
        public b0 v() {
            return o.this.v();
        }

        @Override // androidx.fragment.app.s
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public o n() {
            return o.this;
        }

        @Override // f1.s
        public void x(InterfaceC4334a<f1.v> interfaceC4334a) {
            o.this.x(interfaceC4334a);
        }

        @Override // f1.r
        public void z(InterfaceC4334a<f1.j> interfaceC4334a) {
            o.this.z(interfaceC4334a);
        }
    }

    public o() {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(Intent intent) {
        this.f25702X.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(Context context) {
        this.f25702X.a(null);
    }

    private static boolean D0(v vVar, AbstractC2106m.b bVar) {
        boolean zD0 = false;
        for (Fragment fragment : vVar.C0()) {
            if (fragment != null) {
                if (fragment.h0() != null) {
                    zD0 |= D0(fragment.Y(), bVar);
                }
                G g10 = fragment.f25501x0;
                if (g10 != null && g10.getLifecycle().getState().j(AbstractC2106m.b.STARTED)) {
                    fragment.f25501x0.g(bVar);
                    zD0 = true;
                }
                if (fragment.f25500w0.getState().j(AbstractC2106m.b.STARTED)) {
                    fragment.f25500w0.n(bVar);
                    zD0 = true;
                }
            }
        }
        return zD0;
    }

    private void x0() {
        B().h("android:support:lifecycle", new C4547d.c() { // from class: J1.c
            @Override // t3.C4547d.c
            public final Bundle a() {
                return this.f7217a.y0();
            }
        });
        j(new InterfaceC4334a() { // from class: J1.d
            @Override // r1.InterfaceC4334a
            public final void accept(Object obj) {
                this.f7218a.z0((Configuration) obj);
            }
        });
        h0(new InterfaceC4334a() { // from class: J1.e
            @Override // r1.InterfaceC4334a
            public final void accept(Object obj) {
                this.f7219a.A0((Intent) obj);
            }
        });
        g0(new InterfaceC3299b() { // from class: J1.f
            @Override // f.InterfaceC3299b
            public final void a(Context context) {
                this.f7220a.B0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle y0() {
        C0();
        this.f25703Y.i(AbstractC2106m.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(Configuration configuration) {
        this.f25702X.m();
    }

    void C0() {
        while (D0(w0(), AbstractC2106m.b.CREATED)) {
        }
    }

    protected void F0() {
        this.f25703Y.i(AbstractC2106m.a.ON_RESUME);
        this.f25702X.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (N(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f25704Z);
            printWriter.print(" mResumed=");
            printWriter.print(this.f25705a0);
            printWriter.print(" mStopped=");
            printWriter.print(this.f25706b0);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f25702X.l().b0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // d.ActivityC3006j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f25702X.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // d.ActivityC3006j, f1.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25703Y.i(AbstractC2106m.a.ON_CREATE);
        this.f25702X.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewV0 = v0(view, str, context, attributeSet);
        return viewV0 == null ? super.onCreateView(view, str, context, attributeSet) : viewV0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f25702X.f();
        this.f25703Y.i(AbstractC2106m.a.ON_DESTROY);
    }

    @Override // d.ActivityC3006j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f25702X.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f25705a0 = false;
        this.f25702X.g();
        this.f25703Y.i(AbstractC2106m.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        F0();
    }

    @Override // d.ActivityC3006j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f25702X.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f25702X.m();
        super.onResume();
        this.f25705a0 = true;
        this.f25702X.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f25702X.m();
        super.onStart();
        this.f25706b0 = false;
        if (!this.f25704Z) {
            this.f25704Z = true;
            this.f25702X.c();
        }
        this.f25702X.k();
        this.f25703Y.i(AbstractC2106m.a.ON_START);
        this.f25702X.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f25702X.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f25706b0 = true;
        C0();
        this.f25702X.j();
        this.f25703Y.i(AbstractC2106m.a.ON_STOP);
    }

    final View v0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f25702X.n(view, str, context, attributeSet);
    }

    public v w0() {
        return this.f25702X.l();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewV0 = v0(null, str, context, attributeSet);
        return viewV0 == null ? super.onCreateView(str, context, attributeSet) : viewV0;
    }

    @Deprecated
    public void E0(Fragment fragment) {
    }

    @Override // f1.C3309b.e
    @Deprecated
    public final void b(int i10) {
    }
}
