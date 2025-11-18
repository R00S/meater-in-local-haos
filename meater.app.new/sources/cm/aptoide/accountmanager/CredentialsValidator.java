package cm.aptoide.accountmanager;

import android.util.Patterns;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceCallableC11255d;

/* loaded from: classes.dex */
public class CredentialsValidator {
    private boolean checkIsEmailValid(String str) {
        return !isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    private boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$validate$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6781a(AptoideCredentials aptoideCredentials) {
        int iValidateFields = validateFields(aptoideCredentials);
        return iValidateFields != -1 ? C11231b.m39951s(new AccountValidationException(iValidateFields)) : C11231b.m39946e();
    }

    public Single<Boolean> isEmailValid(String str) {
        return Single.m39913m(Boolean.valueOf(checkIsEmailValid(str)));
    }

    public C11231b validate(final AptoideCredentials aptoideCredentials) {
        return C11231b.m39949i(new InterfaceCallableC11255d() { // from class: cm.aptoide.accountmanager.w
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f7111f.m6781a(aptoideCredentials);
            }
        });
    }

    protected int validateFields(AptoideCredentials aptoideCredentials) {
        if (isEmpty(aptoideCredentials.getEmail()) && isEmpty(aptoideCredentials.getCode())) {
            return 3;
        }
        if (isEmpty(aptoideCredentials.getCode())) {
            return 2;
        }
        return isEmpty(aptoideCredentials.getEmail()) ? 1 : -1;
    }
}
