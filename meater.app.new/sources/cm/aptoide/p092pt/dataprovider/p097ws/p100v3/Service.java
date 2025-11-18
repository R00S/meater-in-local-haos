package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response;
import cm.aptoide.p092pt.dataprovider.model.p095v3.CheckUserCredentialsJson;
import cm.aptoide.p092pt.dataprovider.model.p095v3.OAuth;
import cm.aptoide.p092pt.dataprovider.model.p095v3.TermsAndConditionsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.GenericResponseV2;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p456rx.C11234e;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* loaded from: classes.dex */
public interface Service {
    @FormUrlEncoded
    @POST("addApkFlag")
    C11234e<GenericResponseV2> addApkFlag(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("checkUserCredentials")
    C11234e<CheckUserCredentialsJson> checkUserCredentials(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("createUser")
    C11234e<BaseV3Response> createUser(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @POST("createUser")
    @Multipart
    C11234e<BaseV3Response> createUserWithFile(@Part MultipartBody.Part part, @PartMap HashMapNotNull<String, RequestBody> hashMapNotNull, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("getPushNotifications")
    C11234e<GetPushNotificationsResponse> getPushNotifications(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("getUserInfo")
    C11234e<TermsAndConditionsResponse> getTermsAndConditionsStatus(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("getUserInfo")
    C11234e<CheckUserCredentialsJson> getUserInfo(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("oauth2Authentication")
    C11234e<OAuth> oauth2Authentication(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

    @FormUrlEncoded
    @POST("acceptUserAgreement")
    C11234e<BaseV3Response> updateTermsAndConditions(@FieldMap BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);
}
