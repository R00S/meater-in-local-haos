package cm.aptoide.p092pt.account;

/* loaded from: classes.dex */
public class OAuthModeProvider {
    public String getAuthMode(String str) {
        str.hashCode();
        switch (str) {
            case "ABAN":
                return "aban";
            case "FACEBOOK":
                return "facebook";
            case "GOOGLE":
                return "google";
            default:
                return null;
        }
    }
}
