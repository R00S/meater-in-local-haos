package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.SignUpAdapter;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class GoogleSignUpAdapter implements SignUpAdapter<GoogleSignInResult> {
    public static final String TYPE = "GOOGLE";
    private final GoogleApiClient client;
    private final LoginPreferences preferences;

    public GoogleSignUpAdapter(GoogleApiClient googleApiClient, LoginPreferences loginPreferences) {
        this.preferences = loginPreferences;
        this.client = googleApiClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$logout$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6862a() {
        if (!this.client.mo13868d().m13795e0()) {
            return C11231b.m39951s(new IllegalStateException("Could not connect to Google Play Services to sign out."));
        }
        Auth.f16906j.mo13663d(this.client);
        return C11231b.m39946e();
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public boolean isEnabled() {
        return this.preferences.isGoogleLoginEnabled();
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public C11231b logout() {
        return C11231b.m39949i(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.account.s0
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f7282f.m6862a();
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public Single<Account> signUp(GoogleSignInResult googleSignInResult, AccountService accountService) {
        if (!isEnabled()) {
            return Single.m39911h(new IllegalStateException("Google sign up is not enabled"));
        }
        GoogleSignInAccount googleSignInAccountM13692a = googleSignInResult.m13692a();
        return (!googleSignInResult.m13693b() || googleSignInAccountM13692a == null) ? Single.m39911h(new GoogleSignUpException(GoogleSignInStatusCodes.m13694a(googleSignInResult.getStatus().m13919z()), googleSignInResult.getStatus().m13919z())) : accountService.createAccount(googleSignInAccountM13692a.m13659z(), googleSignInAccountM13692a.m13650M0(), TYPE);
    }
}
