package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetUserRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class SetUserMultipartRequest extends AbstractC2229V7<BaseV7Response, HashMapNotNull<String, RequestBody>> {
    private final MultipartBody.Part multipartBody;

    private SetUserMultipartRequest(MultipartBody.Part part, HashMapNotNull<String, RequestBody> hashMapNotNull, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(hashMapNotNull, getHost(), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.multipartBody = part;
    }

    public static String getHost() {
        return "https://ws75-primary.aptoide.com/api/7/";
    }

    /* renamed from: of */
    public static SetUserMultipartRequest m7462of(String str, String str2, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, ObjectMapper objectMapper, TokenInvalidator tokenInvalidator) {
        RequestBodyFactory requestBodyFactory = new RequestBodyFactory();
        HashMapNotNull hashMapNotNull = new HashMapNotNull();
        try {
            hashMapNotNull.put("user_properties", requestBodyFactory.createBodyPartFromString(objectMapper.writeValueAsString(new SetUserRequest.UserProperties(str))));
            return new SetUserMultipartRequest(requestBodyFactory.createBodyPartFromFile("user_avatar", new File(str2)), hashMapNotNull, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        } catch (JsonProcessingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV7Response> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.editUser(this.multipartBody, (HashMapNotNull) this.body);
    }
}
