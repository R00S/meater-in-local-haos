package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetUserInfo;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetUserInfoRequest extends AbstractC2229V7<GetUserInfo, Body> {

    public static class Body extends BaseBody {
        private List<String> nodes;

        public Body(List<String> list) {
            this.nodes = list;
        }

        public List<String> getNodes() {
            return this.nodes;
        }

        public void setNodes(List<String> list) {
            this.nodes = list;
        }
    }

    protected GetUserInfoRequest(Body body, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost() {
        return "https://ws75.aptoide.com/api/7/";
    }

    /* renamed from: of */
    public static GetUserInfoRequest m7447of(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("meta");
        arrayList.add("settings");
        return new GetUserInfoRequest(new Body(arrayList), getHost(), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetUserInfo> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        ((Body) this.body).setRefresh(z);
        return interfaces.getUserInfo((Body) this.body, z);
    }
}
