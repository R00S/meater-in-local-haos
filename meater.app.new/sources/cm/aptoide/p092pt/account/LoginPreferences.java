package cm.aptoide.p092pt.account;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes.dex */
public class LoginPreferences {
    private final Context context;
    private final GoogleApiAvailability googleApiAvailability;

    public LoginPreferences(Context context, GoogleApiAvailability googleApiAvailability) {
        this.context = context;
        this.googleApiAvailability = googleApiAvailability;
    }

    public boolean isFacebookLoginEnabled() {
        return true;
    }

    public boolean isGoogleLoginEnabled() {
        return this.googleApiAvailability.mo13812i(this.context) == 0;
    }
}
