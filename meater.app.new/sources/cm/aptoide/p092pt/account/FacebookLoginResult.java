package cm.aptoide.p092pt.account;

import com.facebook.FacebookException;
import com.facebook.login.C5805y;

/* loaded from: classes.dex */
public class FacebookLoginResult {
    public static final int STATE_CANCELLED = 1;
    public static final int STATE_ERROR = 99;
    public static final int STATE_SUCCESS = 0;
    private final FacebookException error;
    private final C5805y result;
    private final int state;

    public FacebookLoginResult(C5805y c5805y, int i2, FacebookException facebookException) {
        this.result = c5805y;
        this.state = i2;
        this.error = facebookException;
    }

    public FacebookException getError() {
        return this.error;
    }

    public C5805y getResult() {
        return this.result;
    }

    public int getState() {
        return this.state;
    }
}
