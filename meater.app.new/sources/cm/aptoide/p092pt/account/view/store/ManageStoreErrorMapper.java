package cm.aptoide.p092pt.account.view.store;

import android.content.res.Resources;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.ErrorsMapper;

/* loaded from: classes.dex */
public class ManageStoreErrorMapper {
    private final ErrorsMapper errorsMapper;
    private final Resources resources;

    /* renamed from: cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$1 */
    static /* synthetic */ class C12861 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$account$view$store$ManageStoreErrorMapper$SocialErrorType */
        static final /* synthetic */ int[] f7362x4bddeb47;

        static {
            int[] iArr = new int[SocialErrorType.values().length];
            f7362x4bddeb47 = iArr;
            try {
                iArr[SocialErrorType.INVALID_URL_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7362x4bddeb47[SocialErrorType.LINK_CHANNEL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7362x4bddeb47[SocialErrorType.PAGE_DOES_NOT_EXIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7362x4bddeb47[SocialErrorType.GENERIC_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum SocialErrorType {
        INVALID_URL_TEXT,
        LINK_CHANNEL_ERROR,
        PAGE_DOES_NOT_EXIST,
        GENERIC_ERROR
    }

    public ManageStoreErrorMapper(Resources resources, ErrorsMapper errorsMapper) {
        this.resources = resources;
        this.errorsMapper = errorsMapper;
    }

    private int getErrorMessage(SocialErrorType socialErrorType) {
        int i2 = C12861.f7362x4bddeb47[socialErrorType.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? C1146R.string.all_message_general_error : C1146R.string.edit_store_page_doesnt_exist_error_short : C1146R.string.edit_store_social_link_channel_error : C1146R.string.edit_store_social_link_invalid_url_text;
    }

    public String getError(SocialErrorType socialErrorType) {
        return this.resources.getString(getErrorMessage(socialErrorType));
    }

    public String getGenericError() {
        return this.resources.getString(C1146R.string.all_message_general_error);
    }

    public String getImageError() {
        return this.resources.getString(C1146R.string.ws_error_IMAGE_ERROR_1);
    }

    public String getInvalidStoreError() {
        return this.resources.getString(C1146R.string.ws_error_WOP_2);
    }

    public String getNetworkError(String str, String str2) {
        Resources resources = this.resources;
        return resources.getString(this.errorsMapper.getWebServiceErrorMessageFromCode(str, str2, resources));
    }
}
