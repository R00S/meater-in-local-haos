package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.listapps;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppsUpdates;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBodyWithAlphaBetaKey;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.listapps.ListAppsUpdatesRequest;
import cm.aptoide.p092pt.downloadmanager.Constants;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListAppsUpdatesRequest extends AbstractC2229V7<ListAppsUpdates, Body> {
    private static final int SPLIT_SIZE = 100;
    private final SharedPreferences sharedPreferences;

    public static class ApksData {
        private boolean isEnabled;

        @JsonProperty(Constants.PACKAGE)
        private String packageName;
        private String signature;

        @JsonProperty("vercode")
        private int versionCode;

        public ApksData(String str, int i2, String str2, boolean z) {
            this.packageName = str;
            this.versionCode = i2;
            this.signature = str2;
            this.isEnabled = z;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getSignature() {
            return this.signature;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public boolean isEnabled() {
            return this.isEnabled;
        }
    }

    private ListAppsUpdatesRequest(Body body, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.sharedPreferences = sharedPreferences;
    }

    private Body getBody(List<ApksData> list, int i2, SharedPreferences sharedPreferences) {
        Body body = new Body((Body) this.body, sharedPreferences);
        int size = i2 + 100;
        if (size > list.size()) {
            size = (list.size() % 100) + i2;
        }
        body.setApksData(list.subList(i2, size));
        return body;
    }

    static /* synthetic */ Iterable lambda$loadDataFromNetwork$2(List list) {
        return list;
    }

    static /* synthetic */ Iterable lambda$loadDataFromNetwork$4(List list) {
        return list;
    }

    static /* synthetic */ ListAppsUpdates lambda$loadDataFromNetwork$5(List list) {
        ListAppsUpdates listAppsUpdates = new ListAppsUpdates();
        listAppsUpdates.setList(list);
        return listAppsUpdates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDataFromNetwork$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7479h(final AbstractC2229V7.Interfaces interfaces, final boolean z, Integer num) {
        if (num.intValue() <= 100) {
            return interfaces.listAppsUpdates((Body) this.body, z, true);
        }
        List<ApksData> apksData = ((Body) this.body).getApksData();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < apksData.size(); i2 += 100) {
            arrayList.add(getBody(apksData, i2, this.sharedPreferences));
        }
        return C11234e.m40020N(arrayList).m40095j0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return interfaces.listAppsUpdates((ListAppsUpdatesRequest.Body) obj, z, true);
            }
        }).m40084Y0().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40031Y((List) obj);
            }
        }).m40084Y0().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                ListAppsUpdatesRequest.lambda$loadDataFromNetwork$2(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((ListAppsUpdates) obj).getList();
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                ListAppsUpdatesRequest.lambda$loadDataFromNetwork$4(list);
                return list;
            }
        }).m40084Y0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsUpdatesRequest.lambda$loadDataFromNetwork$5((List) obj);
            }
        });
    }

    /* renamed from: of */
    public static ListAppsUpdatesRequest m7478of(List<ApksData> list, List<Long> list2, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListAppsUpdatesRequest(new Body(list, list2, str, sharedPreferences), AbstractC2229V7.getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListAppsUpdates> loadDataFromNetwork(final AbstractC2229V7.Interfaces interfaces, final boolean z) {
        return C11234e.m40025S(Integer.valueOf(((Body) this.body).getApksData().size())).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.listapps.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8612f.m7479h(interfaces, z, (Integer) obj);
            }
        });
    }

    public static class Body extends BaseBodyWithAlphaBetaKey {
        private String aaid;
        private List<ApksData> apksData;
        private String notPackageTags;
        private List<Long> storeIds;

        public Body(List<ApksData> list, List<Long> list2, String str, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.apksData = list;
            this.storeIds = list2;
            this.aaid = str;
            setSystemAppsUpdates(sharedPreferences);
        }

        private void setSystemAppsUpdates(SharedPreferences sharedPreferences) {
            if (ManagerPreferences.getUpdatesSystemAppsKey(sharedPreferences)) {
                return;
            }
            this.notPackageTags = "system";
        }

        public String getAaid() {
            return this.aaid;
        }

        public List<ApksData> getApksData() {
            return this.apksData;
        }

        public String getNotPackageTags() {
            return this.notPackageTags;
        }

        public List<Long> getStoreIds() {
            return this.storeIds;
        }

        public void setAaid(String str) {
            this.aaid = str;
        }

        public void setApksData(List<ApksData> list) {
            this.apksData = list;
        }

        public Body(Body body, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.apksData = body.getApksData();
            this.storeIds = body.getStoreIds();
            setQ(body.getQ());
            setCountry(body.getCountry());
            setAptoideVercode(body.getAptoideVercode());
            this.aaid = body.getAaid();
            setAptoideId(body.getAptoideId());
            this.notPackageTags = body.getNotPackageTags();
            setAptoideMd5sum(body.getAptoideMd5sum());
            setAptoidePackage(body.getAptoidePackage());
            setLang(body.getLang());
            setCdn(body.getCdn());
            setMature(body.isMature());
        }
    }
}
