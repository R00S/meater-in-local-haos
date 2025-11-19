package x7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c7.C2333b;
import com.google.android.gms.common.api.c;
import g7.AbstractC3433d;
import g7.AbstractC3437h;
import g7.C3434e;
import g7.C3445p;
import g7.M;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5063a extends AbstractC3437h<C5069g> implements w7.f {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f52878n0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    private final boolean f52879j0;

    /* renamed from: k0, reason: collision with root package name */
    private final C3434e f52880k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Bundle f52881l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Integer f52882m0;

    public C5063a(Context context, Looper looper, boolean z10, C3434e c3434e, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 44, c3434e, aVar, bVar);
        this.f52879j0 = true;
        this.f52880k0 = c3434e;
        this.f52881l0 = bundle;
        this.f52882m0 = c3434e.g();
    }

    public static Bundle l0(C3434e c3434e) {
        c3434e.f();
        Integer numG = c3434e.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3434e.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // g7.AbstractC3433d
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.f52880k0.d())) {
            this.f52881l0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f52880k0.d());
        }
        return this.f52881l0;
    }

    @Override // g7.AbstractC3433d
    protected final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // g7.AbstractC3433d
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 12451000;
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final boolean n() {
        return this.f52879j0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w7.f
    public final void o(InterfaceC5068f interfaceC5068f) {
        C3445p.l(interfaceC5068f, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f52880k0.b();
            ((C5069g) D()).u1(new C5072j(1, new M(accountB, ((Integer) C3445p.k(this.f52882m0)).intValue(), "<<default account>>".equals(accountB.name) ? Z6.a.a(y()).b() : null)), interfaceC5068f);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC5068f.l0(new C5074l(1, new C2333b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // w7.f
    public final void p() {
        a(new AbstractC3433d.C0534d());
    }

    @Override // g7.AbstractC3433d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5069g ? (C5069g) iInterfaceQueryLocalInterface : new C5069g(iBinder);
    }
}
