package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class SetUserSettings extends AbstractC2229V7<BaseV7Response, Body> {

    public static class Body extends BaseBody {
        public boolean mature;

        public Body(boolean z) {
            this.mature = z;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody
        public boolean isMature() {
            return this.mature;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody
        public void setMature(boolean z) {
            this.mature = z;
        }
    }

    protected SetUserSettings(Body body, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost() {
        return "https://ws75-primary.aptoide.com/api/7/";
    }

    /* renamed from: of */
    public static SetUserSettings m7464of(boolean z, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        Body body = new Body(z);
        body.setMature(z);
        return new SetUserSettings(body, getHost(), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV7Response> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.setUserSettings((Body) this.body);
    }
}
