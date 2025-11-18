package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import cm.aptoide.p092pt.utils.AptoideUtils;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class CreateUserRequest extends AbstractC2225V3<BaseV3Response> {
    private final MultipartBody.Part multipartBodyFile;
    private final HashMapNotNull<String, RequestBody> multipartRequestBody;

    public CreateUserRequest(MultipartBody.Part part, BaseBody baseBody, OkHttpClient okHttpClient, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, WebService.getDefaultConverter(), bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.multipartBodyFile = part;
        this.multipartRequestBody = null;
    }

    private static void addBaseParameters(String str, BaseBody baseBody, String str2, String str3) {
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        baseBody.put("email", str);
        baseBody.put("passhash", str2);
        if (!TextUtils.isEmpty(str3)) {
            baseBody.put("oem_id", str3);
        }
        baseBody.put("accepts", "tos,privacy");
    }

    /* renamed from: of */
    public static CreateUserRequest m7429of(String str, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        BaseBody baseBody = new BaseBody();
        String strComputeSha1 = AptoideUtils.AlgorithmU.computeSha1(str2);
        addBaseParameters(str, baseBody, strComputeSha1, str3);
        baseBody.put("hmac", AptoideUtils.AlgorithmU.computeHmacSha1(str + strComputeSha1, "bazaar_hmac"));
        return new CreateUserRequest(null, baseBody, okHttpClient, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV3Response> loadDataFromNetwork(Service service, boolean z) {
        MultipartBody.Part part = this.multipartBodyFile;
        return part != null ? service.createUserWithFile(part, this.multipartRequestBody, z) : service.createUser(this.map, z);
    }
}
