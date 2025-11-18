package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.SignUpAdapter;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.AccessToken;
import com.facebook.C5653d0;
import com.facebook.GraphRequest;
import com.facebook.login.C5804x;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class FacebookSignUpAdapter implements SignUpAdapter<FacebookLoginResult> {
    public static final String TYPE = "FACEBOOK";
    private final List<String> facebookRequiredPermissions;
    private final C5804x loginManager;
    private final LoginPreferences loginPreferences;

    public FacebookSignUpAdapter(List<String> list, C5804x c5804x, LoginPreferences loginPreferences) {
        this.facebookRequiredPermissions = list;
        this.loginManager = c5804x;
        this.loginPreferences = loginPreferences;
    }

    private Single<String> getFacebookEmail(final AccessToken accessToken) {
        return Single.m39910c(new Callable() { // from class: cm.aptoide.pt.account.o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FacebookSignUpAdapter.lambda$getFacebookEmail$3(accessToken);
            }
        }).m39930v(Schedulers.m40658io());
    }

    static /* synthetic */ Single lambda$getFacebookEmail$3(AccessToken accessToken) throws Exception {
        try {
            C5653d0 c5653d0M11179j = GraphRequest.m11155B(accessToken, null).m11179j();
            JSONObject jSONObjectM11339c = c5653d0M11179j.m11339c();
            if (c5653d0M11179j.m11338b() != null || jSONObjectM11339c == null) {
                return Single.m39911h(new FacebookSignUpException(99, "Unknown error(maybe network error when getting user data)"));
            }
            try {
                return Single.m39913m(jSONObjectM11339c.has("email") ? jSONObjectM11339c.getString("email") : jSONObjectM11339c.getString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID));
            } catch (JSONException unused) {
                return Single.m39911h(new FacebookSignUpException(99, "Error parsing email"));
            }
        } catch (RuntimeException e2) {
            return Single.m39911h(new FacebookSignUpException(99, e2.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$logout$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6861a() {
        this.loginManager.m12120m();
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public boolean isEnabled() {
        return this.loginPreferences.isFacebookLoginEnabled();
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public C11231b logout() {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.q0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7277f.m6861a();
            }
        });
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public Single<Account> signUp(final FacebookLoginResult facebookLoginResult, final AccountService accountService) {
        return !isEnabled() ? Single.m39911h(new IllegalStateException("Facebook sign up is not enabled")) : facebookLoginResult.getState() == 1 ? Single.m39911h(new FacebookSignUpException(2, "USER_CANCELLED")) : facebookLoginResult.getState() == 99 ? Single.m39910c(new Callable() { // from class: cm.aptoide.pt.account.p0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Single.m39911h(new FacebookSignUpException(99, facebookLoginResult.getError().getMessage()));
            }
        }) : !facebookLoginResult.getResult().m12129a().m11091j().containsAll(this.facebookRequiredPermissions) ? Single.m39911h(new FacebookSignUpException(1, "MISSING_REQUIRED_PERMISSIONS")) : getFacebookEmail(facebookLoginResult.getResult().m12129a()).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return accountService.createAccount((String) obj, facebookLoginResult.getResult().m12129a().m11093l(), FacebookSignUpAdapter.TYPE);
            }
        });
    }
}
