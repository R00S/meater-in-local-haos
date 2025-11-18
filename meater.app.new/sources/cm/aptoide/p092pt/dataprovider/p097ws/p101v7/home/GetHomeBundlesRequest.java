package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.WidgetsArgs;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetHomeBundlesRequest extends AbstractC2229V7<GetStoreWidgets, Body> {

    public static class Body extends BaseBody implements Endless {
        private Integer limit;
        private int offset;
        private WidgetsArgs widgetsArgs;
        private StoreContext context = StoreContext.home;
        private long storeId = 15;

        public Body(Integer num, int i2, WidgetsArgs widgetsArgs) {
            this.limit = num;
            this.offset = i2;
            this.widgetsArgs = widgetsArgs;
        }

        public StoreContext getContext() {
            return this.context;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public long getStoreId() {
            return this.storeId;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public void setStoreId(long j2) {
            this.storeId = j2;
        }

        public void setWidgetsArgs(WidgetsArgs widgetsArgs) {
            this.widgetsArgs = widgetsArgs;
        }
    }

    private GetHomeBundlesRequest(Body body, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, AbstractC2229V7.getCacheHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDataFromNetwork$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7476h(AbstractC2229V7.Interfaces interfaces, boolean z, Object obj) {
        return interfaces.getHomeBundles(z, getQueryStringMapper().map((Body) this.body));
    }

    /* renamed from: of */
    public static GetHomeBundlesRequest m7475of(int i2, int i3, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        return new GetHomeBundlesRequest(new Body(Integer.valueOf(i2), i3, WidgetsArgs.createDefault(resources, windowManager)), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7
    public C11234e<GetStoreWidgets> observe(boolean z, boolean z2) {
        return super.observe(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetStoreWidgets> loadDataFromNetwork(final AbstractC2229V7.Interfaces interfaces, final boolean z) {
        return C11234e.m40025S(null).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.home.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8590f.m7476h(interfaces, z, obj);
            }
        });
    }
}
