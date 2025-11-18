package cm.aptoide.p092pt.dataprovider.model.p095v3;

import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class CheckUserCredentialsJson extends BaseV3Response {
    public String access;

    @JsonProperty(AndroidAccountManagerPersistence.ACCOUNT_ACCESS_CONFIRMED)
    public boolean accessConfirmed;
    public String avatar;
    public String email;

    /* renamed from: id */
    public int f8523id;
    public String ravatarHd;
    public String repo;
    public Settings settings;
    public String token;
    public String username;

    public static class Settings {

        @JsonProperty("matureswitch")
        public String matureswitch;

        protected boolean canEqual(Object obj) {
            return obj instanceof Settings;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj;
            if (!settings.canEqual(this)) {
                return false;
            }
            String matureswitch = getMatureswitch();
            String matureswitch2 = settings.getMatureswitch();
            return matureswitch != null ? matureswitch.equals(matureswitch2) : matureswitch2 == null;
        }

        public String getMatureswitch() {
            return this.matureswitch;
        }

        public int hashCode() {
            String matureswitch = getMatureswitch();
            return 59 + (matureswitch == null ? 43 : matureswitch.hashCode());
        }

        public void setMatureswitch(String str) {
            this.matureswitch = str;
        }

        public String toString() {
            return "CheckUserCredentialsJson.Settings(matureswitch=" + getMatureswitch() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    protected boolean canEqual(Object obj) {
        return obj instanceof CheckUserCredentialsJson;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckUserCredentialsJson)) {
            return false;
        }
        CheckUserCredentialsJson checkUserCredentialsJson = (CheckUserCredentialsJson) obj;
        if (!checkUserCredentialsJson.canEqual(this) || !super.equals(obj) || getId() != checkUserCredentialsJson.getId()) {
            return false;
        }
        String token = getToken();
        String token2 = checkUserCredentialsJson.getToken();
        if (token != null ? !token.equals(token2) : token2 != null) {
            return false;
        }
        String repo = getRepo();
        String repo2 = checkUserCredentialsJson.getRepo();
        if (repo != null ? !repo.equals(repo2) : repo2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = checkUserCredentialsJson.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = checkUserCredentialsJson.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String email = getEmail();
        String email2 = checkUserCredentialsJson.getEmail();
        if (email != null ? !email.equals(email2) : email2 != null) {
            return false;
        }
        Settings settings = getSettings();
        Settings settings2 = checkUserCredentialsJson.getSettings();
        if (settings != null ? !settings.equals(settings2) : settings2 != null) {
            return false;
        }
        String access = getAccess();
        String access2 = checkUserCredentialsJson.getAccess();
        if (access != null ? !access.equals(access2) : access2 != null) {
            return false;
        }
        if (isAccessConfirmed() != checkUserCredentialsJson.isAccessConfirmed()) {
            return false;
        }
        String ravatarHd = getRavatarHd();
        String ravatarHd2 = checkUserCredentialsJson.getRavatarHd();
        return ravatarHd != null ? ravatarHd.equals(ravatarHd2) : ravatarHd2 == null;
    }

    public String getAccess() {
        return this.access;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getEmail() {
        return this.email;
    }

    public int getId() {
        return this.f8523id;
    }

    public String getRavatarHd() {
        return this.ravatarHd;
    }

    public String getRepo() {
        return this.repo;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public String getToken() {
        return this.token;
    }

    public String getUsername() {
        return this.username;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public int hashCode() {
        int iHashCode = ((super.hashCode() + 59) * 59) + getId();
        String token = getToken();
        int iHashCode2 = (iHashCode * 59) + (token == null ? 43 : token.hashCode());
        String repo = getRepo();
        int iHashCode3 = (iHashCode2 * 59) + (repo == null ? 43 : repo.hashCode());
        String avatar = getAvatar();
        int iHashCode4 = (iHashCode3 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String username = getUsername();
        int iHashCode5 = (iHashCode4 * 59) + (username == null ? 43 : username.hashCode());
        String email = getEmail();
        int iHashCode6 = (iHashCode5 * 59) + (email == null ? 43 : email.hashCode());
        Settings settings = getSettings();
        int iHashCode7 = (iHashCode6 * 59) + (settings == null ? 43 : settings.hashCode());
        String access = getAccess();
        int iHashCode8 = (((iHashCode7 * 59) + (access == null ? 43 : access.hashCode())) * 59) + (isAccessConfirmed() ? 79 : 97);
        String ravatarHd = getRavatarHd();
        return (iHashCode8 * 59) + (ravatarHd != null ? ravatarHd.hashCode() : 43);
    }

    public boolean isAccessConfirmed() {
        return this.accessConfirmed;
    }

    public void setAccess(String str) {
        this.access = str;
    }

    public void setAccessConfirmed(boolean z) {
        this.accessConfirmed = z;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(int i2) {
        this.f8523id = i2;
    }

    public void setRavatarHd(String str) {
        this.ravatarHd = str;
    }

    public void setRepo(String str) {
        this.repo = str;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public String toString() {
        return "CheckUserCredentialsJson(id=" + getId() + ", token=" + getToken() + ", repo=" + getRepo() + ", avatar=" + getAvatar() + ", username=" + getUsername() + ", email=" + getEmail() + ", settings=" + getSettings() + ", access=" + getAccess() + ", accessConfirmed=" + isAccessConfirmed() + ", ravatarHd=" + getRavatarHd() + ")";
    }
}
