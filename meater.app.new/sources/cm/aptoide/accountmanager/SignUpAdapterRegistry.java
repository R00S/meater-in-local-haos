package cm.aptoide.accountmanager;

import java.util.Map;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class SignUpAdapterRegistry {
    private final AccountService accountService;
    private final Map<String, SignUpAdapter> adapters;

    public SignUpAdapterRegistry(Map<String, SignUpAdapter> map, AccountService accountService) {
        this.adapters = map;
        this.accountService = accountService;
    }

    static /* synthetic */ C11231b lambda$logoutAll$2(C11231b c11231b) {
        return c11231b;
    }

    public boolean isEnabled(String str) {
        return this.adapters.get(str).isEnabled();
    }

    public C11231b logoutAll() {
        return C11234e.m40020N(this.adapters.values()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((SignUpAdapter) obj).isEnabled());
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((SignUpAdapter) obj).logout();
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                C11231b c11231b = (C11231b) obj;
                SignUpAdapterRegistry.lambda$logoutAll$2(c11231b);
                return c11231b;
            }
        }).m40083X0();
    }

    public void register(String str, SignUpAdapter signUpAdapter) {
        this.adapters.put(str, signUpAdapter);
    }

    public <T> Single<Account> signUp(String str, T t) {
        return this.adapters.get(str).signUp(t, this.accountService);
    }
}
