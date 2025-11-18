package cm.aptoide.p092pt.editorialList;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.DataList;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.EditorialListData;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.EditorialListRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.EditorialListResponse;
import cm.aptoide.p092pt.editorialList.EditorialCardListModel;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class EditorialCardListService {
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final Converter.Factory converterFactory;
    private final int limit;
    private boolean loading;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public EditorialCardListService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, SharedPreferences sharedPreferences, int i2) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences;
        this.limit = i2;
    }

    private List<CurationCard> buildCurationCardList(List<EditorialListData> list) {
        ArrayList arrayList = new ArrayList();
        for (EditorialListData editorialListData : list) {
            arrayList.add(new CurationCard(editorialListData.getId(), editorialListData.getCaption(), editorialListData.getIcon(), editorialListData.getTitle(), editorialListData.getType(), editorialListData.getDate(), editorialListData.getAppearance() != null ? editorialListData.getAppearance().getCaption().getTheme() : HttpUrl.FRAGMENT_ENCODE_SET, editorialListData.getFlair() != null ? editorialListData.getFlair() : HttpUrl.FRAGMENT_ENCODE_SET));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialCardListModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7744c() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialCardListModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7745d() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialCardListModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7746e() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditorialCardListModel mapEditorialCardList(EditorialListResponse editorialListResponse) {
        DataList<EditorialListData> dataList = editorialListResponse.getDataList();
        return new EditorialCardListModel(buildCurationCardList(dataList.getList()), dataList.getNext(), dataList.getTotal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditorialCardListModel mapEditorialCardListError(Throwable th) {
        return ((th instanceof NoNetworkConnectionException) || (th instanceof ConnectException)) ? new EditorialCardListModel(EditorialCardListModel.Error.NETWORK) : new EditorialCardListModel(EditorialCardListModel.Error.GENERIC);
    }

    public Single<EditorialCardListModel> loadEditorialCardListModel(int i2, boolean z) {
        return this.loading ? Single.m39913m(new EditorialCardListModel(true)) : EditorialListRequest.m7439of(this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.limit, i2).observe(z, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorialList.c
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9209f.m7744c();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorialList.e
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9217f.m7745d();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorialList.g
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9225f.m7746e();
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9221f.mapEditorialCardList((EditorialListResponse) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9213f.mapEditorialCardListError((Throwable) obj);
            }
        });
    }
}
