package com.apptionlabs.meater_app.cloud.responses;

import bn.s;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.versions.DeviceJson;
import com.apptionlabs.meater_app.versions.SafetyInfoJson;
import com.google.gson.Gson;
import gg.a;
import gg.c;
import k6.b;
import y5.g;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterCloudAccountResponse {

    @c("accessToken")
    @a
    public String accessToken;

    @c("accountName")
    @a
    public String accountName;

    @c("accountType")
    @a
    public String accountType;

    @c("agree_to_terms_and_conditions")
    @a
    public boolean agree_to_terms_and_conditions;

    @c("app_compatible")
    @a
    public boolean appCompatible;

    @c("app_min_version")
    @a
    public String appMinVersion;

    @c("available")
    @a
    public boolean available;

    @c("clientVersion")
    @a
    public String clientVersion;

    @c("device")
    @a
    private final DeviceJson device = new DeviceJson();

    @c("device_id")
    @a
    public String device_id;

    @c("email")
    @a
    public String email;

    @c("email_club_opt_in")
    @a
    public boolean emailClubOptIn;

    @c("facebook_token")
    @a
    public String facebook_token;

    @c("fb_token")
    @a
    public String fb_token;

    @c("first_name")
    @a
    public String firstName;

    @c("google_token")
    @a
    public String google_token;

    @c("cook_info_upload_interval")
    @a
    public long keyCookInfoUploadInterval;

    @c("last_name")
    @a
    public String lastName;

    @c("locale")
    @a
    public String locale;

    @c("message_interval_master")
    @a
    public long messageIntervalMaster;

    @c("message_interval_stats")
    @a
    public long messageIntervalStats;

    @c("name")
    @a
    public String name;

    @c("os_version")
    @a
    public String os_version;

    @c("password")
    @a
    public String password;

    @c("platform")
    @a
    public String platform;

    @c("repeat_password")
    @a
    public String repeat_password;

    @c("safety_info")
    @a
    public SafetyInfoJson safety_info;

    @c("sync_on_launch")
    @a
    public boolean sync_on_launch;

    @c("temperature_scale")
    @a
    public String temperatureScale;

    @c("termsAndConditionsState")
    @a
    public String termsAndConditionsState;

    @c("token")
    @a
    public String token;

    @c("user_info_interval")
    @a
    public long userInfoIntervalMillis;

    @c("version")
    @a
    public String version;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class ErrorStatus {
        public int code;
        public String message;
    }

    public static ErrorStatus parseError(s<?> sVar) {
        ErrorStatus errorStatus = new ErrorStatus();
        errorStatus.code = -1;
        errorStatus.message = "";
        if (sVar != null) {
            try {
                if (sVar.d() != null) {
                    ResponseErrorBody responseErrorBody = (ResponseErrorBody) new Gson().i(sVar.d().j(), ResponseErrorBody.class);
                    errorStatus.code = responseErrorBody.errorCode;
                    errorStatus.message = responseErrorBody.message;
                }
            } catch (Exception unused) {
                b.e("IllegalStateException while parsing response", new Object[0]);
            }
        }
        return errorStatus;
    }

    public static void updatePreference(String str, String str2, String str3, String str4, MEATERCloudAccount.AccountType accountType) {
        MEATERCloudAccount mEATERCloudAccount = new MEATERCloudAccount();
        mEATERCloudAccount.name = str;
        mEATERCloudAccount.email = str2;
        mEATERCloudAccount.password = str3;
        mEATERCloudAccount.type = accountType;
        mEATERCloudAccount.accessToken = str4;
        com.apptionlabs.meater_app.app.a.u().J1(mEATERCloudAccount);
        g.E().M();
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getTermsAndConditionsState() {
        return this.termsAndConditionsState;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isSync_on_launch() {
        return this.sync_on_launch;
    }

    public void setAgree_to_terms_and_conditions(boolean z10) {
        this.agree_to_terms_and_conditions = z10;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailClubOptIn(boolean z10) {
        this.emailClubOptIn = z10;
    }

    public void setFacebook_token(String str) {
        this.facebook_token = str;
    }

    public void setFb_token(String str) {
        this.fb_token = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setGoogle_token(String str) {
        this.google_token = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setRepeat_password(String str) {
        this.repeat_password = str;
    }

    public void setSync_on_launch(boolean z10) {
        this.sync_on_launch = z10;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
