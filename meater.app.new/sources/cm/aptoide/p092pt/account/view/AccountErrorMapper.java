package cm.aptoide.p092pt.account.view;

import android.content.Context;
import cm.aptoide.accountmanager.AccountException;
import cm.aptoide.accountmanager.AccountValidationException;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.ErrorsMapper;
import cm.aptoide.p092pt.account.FacebookSignUpException;
import cm.aptoide.p092pt.account.GoogleSignUpException;
import cm.aptoide.p092pt.dataprovider.util.ErrorUtils;
import cm.aptoide.p092pt.view.ThrowableToStringMapper;

/* loaded from: classes.dex */
public class AccountErrorMapper implements ThrowableToStringMapper {
    private final Context context;
    private final ErrorsMapper errorsMapper;

    public AccountErrorMapper(Context context, ErrorsMapper errorsMapper) {
        this.context = context;
        this.errorsMapper = errorsMapper;
    }

    @Override // cm.aptoide.p092pt.view.ThrowableToStringMapper
    public String map(Throwable th) {
        String string;
        String string2 = this.context.getString(C1146R.string.unknown_error);
        if (th instanceof GoogleSignUpException) {
            return this.context.getString(C1146R.string.google_login_cancelled);
        }
        if (th instanceof FacebookSignUpException) {
            int code = ((FacebookSignUpException) th).getCode();
            return code != 1 ? code != 2 ? code != 99 ? string2 : this.context.getString(C1146R.string.error_occured) : this.context.getString(C1146R.string.facebook_login_cancelled) : this.context.getString(C1146R.string.facebook_email_permission_regected_message);
        }
        if (th instanceof AccountException) {
            AccountException accountException = (AccountException) th;
            if (accountException.hasCode()) {
                return this.context.getString(this.errorsMapper.getWebServiceErrorMessageFromCode(accountException.getCode(), this.context.getApplicationContext().getPackageName(), this.context.getResources()));
            }
            return this.context.getString(this.context.getResources().getIdentifier("ws_error_" + accountException.getErrors().entrySet().iterator().next().getKey().replace("-", "_"), "string", this.context.getPackageName()));
        }
        if (!(th instanceof AccountValidationException)) {
            return ErrorUtils.isNoNetworkConnection(th) ? this.context.getString(C1146R.string.connection_error) : string2;
        }
        int code2 = ((AccountValidationException) th).getCode();
        if (code2 == 1) {
            string = this.context.getString(C1146R.string.no_email_error_message);
        } else if (code2 == 2) {
            string = this.context.getString(C1146R.string.no_pass_error_message);
        } else if (code2 == 3) {
            string = this.context.getString(C1146R.string.no_email_and_pass_error_message);
        } else if (code2 == 4) {
            string = this.context.getString(C1146R.string.password_validation_text);
        } else {
            if (code2 != 5) {
                return string2;
            }
            string = this.context.getString(C1146R.string.nothing_inserted_user);
        }
        return string;
    }
}
