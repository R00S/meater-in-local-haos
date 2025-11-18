package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.AccountException;
import cm.aptoide.accountmanager.AccountValidationException;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV3Exception;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AccountAnalytics {
    public static final String CREATE_USER_PROFILE = "Account_Create_A_User_Profile_Screen";
    public static final String CREATE_YOUR_STORE = "Account_Create_Your_Store_Screen";
    public static final String ENTRY = "Account_Entry";
    public static final String GENERAL_ERROR = "General Error";
    public static final String HAS_PICTURE = "has_picture";
    private static final String INVALID_GRANT_CODE = "invalid_grant";
    public static final String LOGIN_EVENT_NAME = "Account_Login_Screen";
    private static final String LOGIN_METHOD = "Method";
    public static final String LOGIN_SIGN_UP_START_SCREEN = "Account_Login_Signup_Start_Screen";
    public static final String PERMISSIONS_DENIED = "Permissions Denied";
    private static final String PREVIOUS_CONTEXT = "previous_context";
    public static final String PROFILE_SETTINGS = "Account_Profile_Settings_Screen";
    private static final String PROMOTE_APTOIDE_BACKUP_APPS_PARAM_VALUE = "Backup Apps";
    public static final String PROMOTE_APTOIDE_EVENT_NAME = "Promote_Aptoide";
    private static final String PROMOTE_APTOIDE_PARAM_KEY = "aptoide_product";
    private static final String PROMOTE_APTOIDE_TV_PARAM_VALUE = "TV";
    private static final String PROMOTE_APTOIDE_UPLOADER_PARAM_VALUE = "Uploader";
    public static final String SCREEN = "Screen";
    public static final String SDK_ERROR = "SDK Error";
    public static final String SIGN_UP_EVENT_NAME = "Account_Signup_Screen";
    public static final String SOURCE = "Source";
    private static final String STATUS = "Status";
    private static final String STATUS_CODE = "Status Code";
    private static final String STATUS_DESCRIPTION = "Status Description";
    private static final String STATUS_DETAIL = "Status Detail";
    public static final String STORE = "store";
    public static final String STORE_ACTION = "Click";
    public static final String SUCCESS = "Success";
    public static final int UNKNOWN_STATUS_CODE = 12501;
    public static final String USER_CANCELED = "User canceled";
    public static final String WEB_ERROR = "Web";
    private final AnalyticsManager analyticsManager;
    private AccountEvent aptoideSuccessLoginEvent;
    private final CrashReport crashReport;
    private AccountEvent facebookAndFlurrySuccessLoginEvent;
    private final NavigationTracker navigationTracker;
    private AccountEvent signUpEvent;

    /* renamed from: cm.aptoide.pt.account.AccountAnalytics$1 */
    static /* synthetic */ class C11691 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$account$AccountAnalytics$LoginMethod;

        static {
            int[] iArr = new int[LoginMethod.values().length];
            $SwitchMap$cm$aptoide$pt$account$AccountAnalytics$LoginMethod = iArr;
            try {
                iArr[LoginMethod.APTOIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$account$AccountAnalytics$LoginMethod[LoginMethod.FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$account$AccountAnalytics$LoginMethod[LoginMethod.GOOGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class AccountEvent {
        private AnalyticsManager.Action action;
        private String context;
        private String eventName;
        private Map<String, Object> map;

        public AccountEvent(Map<String, Object> map, String str, AnalyticsManager.Action action, String str2) {
            this.map = map;
            this.eventName = str;
            this.action = action;
            this.context = str2;
        }

        public AnalyticsManager.Action getAction() {
            return this.action;
        }

        public String getContext() {
            return this.context;
        }

        public String getEventName() {
            return this.eventName;
        }

        public Map<String, Object> getMap() {
            return this.map;
        }
    }

    public enum AccountOrigins {
        WIZARD("Wizard"),
        MY_ACCOUNT("My Account"),
        TIMELINE("Timeline"),
        STORE("Store"),
        APP_VIEW_FLAG("App View Flag"),
        APP_VIEW_SHARE("App View Share on Timeline"),
        SHARE_CARD("Share Card"),
        LIKE_CARD("Like Card"),
        COMMENT_LIST("Comment List"),
        RATE_DIALOG("Reviews FAB"),
        REPLY_REVIEW("Reply Review"),
        REVIEW_FEEDBACK("Review Feedback"),
        SOCIAL_LIKE("Like Social Card"),
        STORE_COMMENT("Store Comment"),
        LATEST_COMMENTS_STORE("Comment on Latest Store Comments"),
        POST_ON_TIMELINE("Post on Timeline"),
        EDITORIAL("React on Editorial");

        private final String origin;

        AccountOrigins(String str) {
            this.origin = str;
        }

        public String getOrigin() {
            return this.origin;
        }
    }

    public enum CreateStoreAction {
        SKIP("Skip"),
        CREATE("Create store");

        private final String action;

        CreateStoreAction(String str) {
            this.action = str;
        }

        public String getAction() {
            return this.action;
        }
    }

    public enum LoginMethod {
        APTOIDE(BuildConfig.MARKET_NAME),
        FACEBOOK("FB"),
        GOOGLE("Google");

        private final String method;

        LoginMethod(String str) {
            this.method = str;
        }

        public String getMethod() {
            return this.method;
        }
    }

    public enum ProfileAction {
        MORE_INFO("More info"),
        CONTINUE("Continue"),
        PRIVATE_PROFILE("Make my profile private"),
        PUBLIC_PROFILE("Make my profile public");

        private final String action;

        ProfileAction(String str) {
            this.action = str;
        }

        public String getAction() {
            return this.action;
        }
    }

    private enum SignUpLoginStatus {
        SUCCESS(AccountAnalytics.SUCCESS),
        FAILED("Failed"),
        INVALID("Invalid");

        private final String status;

        SignUpLoginStatus(String str) {
            this.status = str;
        }

        public String getStatus() {
            return this.status;
        }
    }

    public enum StartupClick {
        JOIN_APTOIDE("Join Aptoide"),
        LOGIN("Login"),
        CONNECT_FACEBOOK("Connect with FB"),
        CONNECT_GOOGLE("Connect with Google");

        private final String clickEvent;

        StartupClick(String str) {
            this.clickEvent = str;
        }

        public String getClickEvent() {
            return this.clickEvent;
        }
    }

    public enum StartupClickOrigin {
        MAIN("Main"),
        JOIN_UP("Join Aptoide Slide Up"),
        LOGIN_UP("Login Slide Up"),
        NOT_LOGGED_IN_DIALOG("Not logged in Dialog");

        private String clickOrigin;

        StartupClickOrigin(String str) {
            this.clickOrigin = str;
        }

        public String getClickOrigin() {
            return this.clickOrigin;
        }
    }

    public AccountAnalytics(NavigationTracker navigationTracker, CrashReport crashReport, AnalyticsManager analyticsManager) {
        this.navigationTracker = navigationTracker;
        this.crashReport = crashReport;
        this.analyticsManager = analyticsManager;
    }

    private void clearLoginEvents() {
        this.aptoideSuccessLoginEvent = null;
        this.facebookAndFlurrySuccessLoginEvent = null;
    }

    private void clearSignUpEvents() {
        this.signUpEvent = null;
    }

    private AccountEvent createFacebookAndFlurryEvent(String str, LoginMethod loginMethod, SignUpLoginStatus signUpLoginStatus, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(LOGIN_METHOD, loginMethod.getMethod());
        map.put(STATUS, signUpLoginStatus.getStatus());
        map.put(STATUS_DETAIL, str2);
        if (str3 != null) {
            map.put(STATUS_CODE, str3);
        }
        if (str4 != null) {
            map.put(STATUS_DESCRIPTION, str4);
        }
        return new AccountEvent(map, str, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String getWsError(AccountException accountException) {
        return accountException.getErrors().keySet().toString().replace("[", HttpUrl.FRAGMENT_ENCODE_SET).replace("]", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void sendAptoideSignUpErrorEvent(Throwable th) {
        if (!(th instanceof AccountException)) {
            sendWebserviceErrors(SIGN_UP_EVENT_NAME, LoginMethod.APTOIDE, th);
        } else {
            AccountException accountException = (AccountException) th;
            sendEvents(SIGN_UP_EVENT_NAME, LoginMethod.APTOIDE, SignUpLoginStatus.FAILED, WEB_ERROR, accountException.getErrors().keySet().toString(), accountException.getErrors().values().toString());
        }
    }

    private void sendEvents(String str, LoginMethod loginMethod, SignUpLoginStatus signUpLoginStatus, String str2, String str3, String str4) {
        AccountEvent accountEventCreateFacebookAndFlurryEvent = createFacebookAndFlurryEvent(str, loginMethod, signUpLoginStatus, str2, str3, str4);
        this.analyticsManager.logEvent(accountEventCreateFacebookAndFlurryEvent.getMap(), accountEventCreateFacebookAndFlurryEvent.getEventName(), accountEventCreateFacebookAndFlurryEvent.getAction(), accountEventCreateFacebookAndFlurryEvent.getContext());
    }

    private void sendFacebookLoginErrorEvent(Throwable th) {
        if (!(th instanceof FacebookSignUpException)) {
            sendWebserviceErrors(LOGIN_EVENT_NAME, LoginMethod.FACEBOOK, th);
            return;
        }
        FacebookSignUpException facebookSignUpException = (FacebookSignUpException) th;
        int code = facebookSignUpException.getCode();
        if (code == 1) {
            sendEvents(LOGIN_EVENT_NAME, LoginMethod.FACEBOOK, SignUpLoginStatus.INVALID, PERMISSIONS_DENIED, String.valueOf(facebookSignUpException.getCode()), facebookSignUpException.getFacebookMessage());
        } else if (code != 2) {
            sendEvents(LOGIN_EVENT_NAME, LoginMethod.FACEBOOK, SignUpLoginStatus.FAILED, SDK_ERROR, String.valueOf(facebookSignUpException.getCode()), facebookSignUpException.getFacebookMessage());
        } else {
            sendEvents(LOGIN_EVENT_NAME, LoginMethod.FACEBOOK, SignUpLoginStatus.INVALID, USER_CANCELED, String.valueOf(facebookSignUpException.getCode()), facebookSignUpException.getFacebookMessage());
        }
    }

    private void sendGoogleLoginFailEvent(Throwable th) {
        if (!(th instanceof GoogleSignUpException)) {
            sendWebserviceErrors(LOGIN_EVENT_NAME, LoginMethod.GOOGLE, th);
            return;
        }
        GoogleSignUpException googleSignUpException = (GoogleSignUpException) th;
        if (googleSignUpException.getStatusCode() == 12501) {
            LoginMethod loginMethod = LoginMethod.GOOGLE;
            sendEvents(LOGIN_EVENT_NAME, loginMethod, SignUpLoginStatus.INVALID, SDK_ERROR, loginMethod.toString(), googleSignUpException.getError());
        } else {
            LoginMethod loginMethod2 = LoginMethod.GOOGLE;
            sendEvents(LOGIN_EVENT_NAME, loginMethod2, SignUpLoginStatus.FAILED, SDK_ERROR, loginMethod2.toString(), googleSignUpException.getError());
        }
    }

    private void sendV3ExceptionEvent(LoginMethod loginMethod, AccountException accountException) {
        String wsError = getWsError(accountException);
        String str = accountException.getErrors().get(wsError);
        if (wsError.equals(INVALID_GRANT_CODE)) {
            sendEvents(LOGIN_EVENT_NAME, loginMethod, SignUpLoginStatus.INVALID, WEB_ERROR, wsError, str);
        } else {
            sendEvents(LOGIN_EVENT_NAME, loginMethod, SignUpLoginStatus.FAILED, WEB_ERROR, wsError, str);
        }
    }

    private void sendV7ExceptionEvent(LoginMethod loginMethod, AptoideWsV7Exception aptoideWsV7Exception) {
        sendEvents(LOGIN_EVENT_NAME, loginMethod, SignUpLoginStatus.FAILED, WEB_ERROR, aptoideWsV7Exception.getBaseResponse().getErrors().get(0).getCode(), aptoideWsV7Exception.getBaseResponse().getErrors().get(0).getDescription());
    }

    private void sendWebserviceErrors(String str, LoginMethod loginMethod, Throwable th) {
        if (th instanceof AptoideWsV7Exception) {
            sendV7ExceptionEvent(loginMethod, (AptoideWsV7Exception) th);
            return;
        }
        if (th instanceof AptoideWsV3Exception) {
            sendV3ExceptionEvent(loginMethod, (AptoideWsV3Exception) th);
            return;
        }
        if (th instanceof AccountException) {
            sendV3ExceptionEvent(loginMethod, (AccountException) th);
        } else if (th instanceof AccountValidationException) {
            sendEvents(str, loginMethod, SignUpLoginStatus.INVALID, GENERAL_ERROR, "no_code", th.toString());
        } else {
            sendEvents(str, loginMethod, SignUpLoginStatus.FAILED, GENERAL_ERROR, "no_code", th.toString());
            this.crashReport.log(th);
        }
    }

    private void setupLoginEvents(LoginMethod loginMethod) {
        this.facebookAndFlurrySuccessLoginEvent = createFacebookAndFlurryEvent(LOGIN_EVENT_NAME, loginMethod, SignUpLoginStatus.SUCCESS, SUCCESS, null, null);
    }

    public void accountProfileAction(int i2, ProfileAction profileAction) {
        HashMap map = new HashMap();
        map.put("Action", profileAction.getAction());
        map.put("screen", Integer.toString(i2));
        this.analyticsManager.logEvent(map, PROFILE_SETTINGS, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void clickIn(StartupClick startupClick, StartupClickOrigin startupClickOrigin) {
        HashMap map = new HashMap();
        map.put("Action", startupClick.getClickEvent());
        map.put(SCREEN, startupClickOrigin.getClickOrigin());
        this.analyticsManager.logEvent(map, LOGIN_SIGN_UP_START_SCREEN, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void createStore(boolean z, CreateStoreAction createStoreAction) {
        HashMap map = new HashMap();
        map.put(STORE_ACTION, createStoreAction);
        map.put(HAS_PICTURE, z ? "True" : "False");
        this.analyticsManager.logEvent(map, CREATE_YOUR_STORE, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void createdUserProfile(boolean z) {
        HashMap map = new HashMap();
        map.put(HAS_PICTURE, z ? "True" : "False");
        this.analyticsManager.logEvent(map, CREATE_USER_PROFILE, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void enterAccountScreen(AccountOrigins accountOrigins) {
        HashMap map = new HashMap();
        map.put(SOURCE, accountOrigins.getOrigin());
        this.analyticsManager.logEvent(map, ENTRY, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void loginSuccess() {
        AccountEvent accountEvent = this.aptoideSuccessLoginEvent;
        if (accountEvent != null) {
            this.analyticsManager.logEvent(accountEvent.getMap(), this.aptoideSuccessLoginEvent.getEventName(), this.aptoideSuccessLoginEvent.getAction(), this.aptoideSuccessLoginEvent.getContext());
            this.aptoideSuccessLoginEvent = null;
        }
        AccountEvent accountEvent2 = this.facebookAndFlurrySuccessLoginEvent;
        if (accountEvent2 != null) {
            this.analyticsManager.logEvent(accountEvent2.getMap(), this.facebookAndFlurrySuccessLoginEvent.getEventName(), this.facebookAndFlurrySuccessLoginEvent.getAction(), this.facebookAndFlurrySuccessLoginEvent.getContext());
            this.facebookAndFlurrySuccessLoginEvent = null;
        }
        AccountEvent accountEvent3 = this.signUpEvent;
        if (accountEvent3 != null) {
            this.analyticsManager.logEvent(accountEvent3.getMap(), this.signUpEvent.getEventName(), this.signUpEvent.getAction(), this.signUpEvent.getContext());
            this.signUpEvent = null;
        }
    }

    public void sendAptoideLoginButtonPressed() {
        clearSignUpEvents();
        setupLoginEvents(LoginMethod.APTOIDE);
    }

    public void sendAptoideSignUpButtonPressed() {
        HashMap map = new HashMap();
        map.put(STATUS, SignUpLoginStatus.SUCCESS.getStatus());
        this.signUpEvent = new AccountEvent(map, SIGN_UP_EVENT_NAME, AnalyticsManager.Action.CLICK, getViewName(true));
        clearLoginEvents();
    }

    public void sendFacebookLoginButtonPressed() {
        clearSignUpEvents();
        setupLoginEvents(LoginMethod.FACEBOOK);
    }

    public void sendGoogleLoginButtonPressed() {
        clearSignUpEvents();
        setupLoginEvents(LoginMethod.GOOGLE);
    }

    public void sendLoginErrorEvent(LoginMethod loginMethod, Throwable th) {
        int i2 = C11691.$SwitchMap$cm$aptoide$pt$account$AccountAnalytics$LoginMethod[loginMethod.ordinal()];
        if (i2 == 1) {
            sendWebserviceErrors(LOGIN_EVENT_NAME, LoginMethod.APTOIDE, th);
        } else if (i2 == 2) {
            sendFacebookLoginErrorEvent(th);
        } else {
            if (i2 != 3) {
                return;
            }
            sendGoogleLoginFailEvent(th);
        }
    }

    public void sendPromoteAptoideBackupAppsEvent() {
        HashMap map = new HashMap();
        map.put(PROMOTE_APTOIDE_PARAM_KEY, PROMOTE_APTOIDE_BACKUP_APPS_PARAM_VALUE);
        this.analyticsManager.logEvent(map, PROMOTE_APTOIDE_EVENT_NAME, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromoteAptoideTVEvent() {
        HashMap map = new HashMap();
        map.put(PROMOTE_APTOIDE_PARAM_KEY, PROMOTE_APTOIDE_TV_PARAM_VALUE);
        this.analyticsManager.logEvent(map, PROMOTE_APTOIDE_EVENT_NAME, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromoteAptoideUploaderEvent() {
        HashMap map = new HashMap();
        map.put(PROMOTE_APTOIDE_PARAM_KEY, PROMOTE_APTOIDE_UPLOADER_PARAM_VALUE);
        this.analyticsManager.logEvent(map, PROMOTE_APTOIDE_EVENT_NAME, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendSignUpErrorEvent(LoginMethod loginMethod, Throwable th) {
        if (loginMethod.equals(LoginMethod.APTOIDE)) {
            sendAptoideSignUpErrorEvent(th);
            return;
        }
        throw new IllegalStateException("unknown sign up method: " + loginMethod.name());
    }

    private void sendV3ExceptionEvent(LoginMethod loginMethod, AptoideWsV3Exception aptoideWsV3Exception) {
        sendEvents(LOGIN_EVENT_NAME, loginMethod, SignUpLoginStatus.FAILED, WEB_ERROR, aptoideWsV3Exception.getBaseResponse().getErrors().get(0).code, aptoideWsV3Exception.getBaseResponse().getErrors().get(0).msg);
    }
}
