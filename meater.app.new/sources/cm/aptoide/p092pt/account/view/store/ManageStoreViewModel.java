package cm.aptoide.p092pt.account.view.store;

import android.text.TextUtils;
import cm.aptoide.p092pt.themes.StoreTheme;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ManageStoreViewModel {
    boolean newAvatar;
    String pictureUri;
    String storeDescription;
    long storeId;
    String storeName;
    StoreTheme storeTheme;

    public ManageStoreViewModel() {
        this.storeId = -1L;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeDescription = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pictureUri = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeTheme = StoreTheme.DEFAULT;
        this.newAvatar = false;
    }

    public static ManageStoreViewModel update(ManageStoreViewModel manageStoreViewModel, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            manageStoreViewModel.setStoreName(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            manageStoreViewModel.setStoreDescription(str2);
        }
        return manageStoreViewModel;
    }

    public String getPictureUri() {
        return this.pictureUri;
    }

    public String getStoreDescription() {
        return this.storeDescription;
    }

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public StoreTheme getStoreTheme() {
        return this.storeTheme;
    }

    public boolean hasNewAvatar() {
        return this.newAvatar;
    }

    public boolean hasPicture() {
        return !TextUtils.isEmpty(this.pictureUri);
    }

    public void setNewAvatar(boolean z) {
        this.newAvatar = z;
    }

    public void setPictureUri(String str) {
        this.pictureUri = str;
    }

    public void setStoreDescription(String str) {
        this.storeDescription = str;
    }

    public void setStoreId(long j2) {
        this.storeId = j2;
    }

    public void setStoreName(String str) {
        this.storeName = str;
    }

    public void setStoreTheme(StoreTheme storeTheme) {
        this.storeTheme = storeTheme;
    }

    public boolean storeExists() {
        return this.storeId >= 0;
    }

    public ManageStoreViewModel(long j2, StoreTheme storeTheme, String str, String str2, String str3) {
        this.storeId = j2;
        this.storeName = str;
        this.storeDescription = str2;
        this.pictureUri = str3;
        this.storeTheme = storeTheme;
        this.newAvatar = false;
    }
}
