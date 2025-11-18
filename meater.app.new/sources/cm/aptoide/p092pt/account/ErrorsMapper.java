package cm.aptoide.p092pt.account;

import android.content.res.Resources;
import cm.aptoide.p092pt.C1146R;

/* loaded from: classes.dex */
public class ErrorsMapper {
    public int getWebServiceErrorMessageFromCode(String str, String str2, Resources resources) {
        int identifier = resources.getIdentifier(String.format("ws_error_%1s", str.replace("-", "_")), "string", str2);
        return identifier == 0 ? C1146R.string.unknown_error : identifier;
    }
}
