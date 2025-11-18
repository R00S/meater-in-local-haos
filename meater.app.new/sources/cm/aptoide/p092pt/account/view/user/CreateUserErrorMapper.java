package cm.aptoide.p092pt.account.view.user;

import android.content.Context;
import android.content.res.Resources;
import cm.aptoide.accountmanager.AccountValidationException;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.AccountErrorMapper;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.ThrowableToStringMapper;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class CreateUserErrorMapper implements ThrowableToStringMapper {
    private final AccountErrorMapper accountErrorMapper;
    private final Context context;
    private Resources resources;

    public CreateUserErrorMapper(Context context, AccountErrorMapper accountErrorMapper, Resources resources) {
        this.context = context;
        this.accountErrorMapper = accountErrorMapper;
        this.resources = resources;
    }

    @Override // cm.aptoide.p092pt.view.ThrowableToStringMapper
    public String map(Throwable th) {
        String map = this.accountErrorMapper.map(th);
        if ((th instanceof SocketTimeoutException) || (th instanceof TimeoutException)) {
            return this.context.getString(C1146R.string.user_upload_photo_failed);
        }
        if (!(th instanceof AccountValidationException)) {
            return map;
        }
        int code = ((AccountValidationException) th).getCode();
        return code != 5 ? code != 6 ? map : AptoideUtils.StringU.getResString(C1146R.string.nothing_inserted_user, this.resources) : AptoideUtils.StringU.getResString(C1146R.string.no_username_inserted, this.resources);
    }
}
