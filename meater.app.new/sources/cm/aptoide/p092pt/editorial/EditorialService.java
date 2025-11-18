package cm.aptoide.p092pt.editorial;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.aab.SplitsMapper;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.EditorialCard;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.editorial.EditorialViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class EditorialService {
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private CampaignMapper campaignMapper;
    private final Converter.Factory converterFactory;
    private boolean loading;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final TokenInvalidator tokenInvalidator;

    public EditorialService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, SharedPreferences sharedPreferences, SplitsMapper splitsMapper, CampaignMapper campaignMapper) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences;
        this.splitsMapper = splitsMapper;
        this.campaignMapper = campaignMapper;
    }

    private EditorialContent buildEditorialContent(EditorialCard.Content content, List<EditorialMedia> list, App app, EditorialCard.Action action, int i2) {
        if (action != null && app != null) {
            Store store = app.getStore();
            File file = app.getFile();
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), app.getId(), app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getPackageName(), app.getSize(), app.getGraphic(), app.getObb(), store.getId(), store.getName(), file.getVername(), file.getVercode(), file.getPath(), file.getPathAlt(), file.getMd5sum(), action.getTitle(), action.getUrl(), i2, this.splitsMapper.mapSplits(app.hasSplits() ? app.getAab().getSplits() : Collections.emptyList()), app.hasSplits() ? app.getAab().getRequiredSplits() : Collections.emptyList(), app.getAppcoins().hasAdvertising() || app.getAppcoins().hasBilling(), app.getFile().getMalware().getRank().toString(), app.getAppcoins().getFlags(), this.campaignMapper.mapCampaign(app.getUrls()));
        }
        if (app == null) {
            return action != null ? new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), action.getTitle(), action.getUrl(), i2) : new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), i2);
        }
        Store store2 = app.getStore();
        File file2 = app.getFile();
        return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), app.getId(), app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getPackageName(), app.getSize(), app.getGraphic(), app.getObb(), store2.getId(), store2.getName(), file2.getVername(), file2.getVercode(), file2.getPath(), file2.getPathAlt(), file2.getMd5sum(), i2, this.splitsMapper.mapSplits(app.hasSplits() ? app.getAab().getSplits() : Collections.emptyList()), app.hasSplits() ? app.getAab().getRequiredSplits() : Collections.emptyList(), app.getAppcoins().hasAdvertising() || app.getAppcoins().hasBilling(), app.getFile().getMalware().getRank().toString(), app.getAppcoins().getFlags(), this.campaignMapper.mapCampaign(app.getUrls()));
    }

    private EditorialViewModel buildEditorialViewModel(List<EditorialContent> list, EditorialCard.Data data, List<Integer> list2, List<EditorialContent> list3, EditorialContent editorialContent, String str, String str2) {
        String theme = data.getAppearance() != null ? data.getAppearance().getCaption().getTheme() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (editorialContent != null) {
            return new EditorialViewModel(list, data.getTitle(), data.getCaption(), data.getBackground(), list2, list3, editorialContent.getAppName(), editorialContent.getIcon(), editorialContent.getId(), editorialContent.getPackageName(), editorialContent.getMd5sum(), editorialContent.getVerCode(), editorialContent.getVerName(), editorialContent.getPath(), editorialContent.getPathAlt(), editorialContent.getObb(), true, str, str2, editorialContent.getSize(), theme, editorialContent.getSplits(), editorialContent.getRequiredSplits(), editorialContent.hasAppc(), editorialContent.getRank(), editorialContent.getStoreName(), editorialContent.getBdsFlags(), editorialContent.getCampaign());
        }
        return new EditorialViewModel(list, data.getTitle(), data.getCaption(), data.getBackground(), list2, list3, false, str, str2, theme);
    }

    private List<EditorialMedia> buildMediaList(List<EditorialCard.Media> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EditorialCard.Media media : list) {
                arrayList.add(media.getUrl() != null ? new EditorialMedia(media.getType(), media.getDescription(), media.getThumbnail(), media.getUrl()) : new EditorialMedia(media.getType(), media.getDescription(), media.getThumbnail(), media.getImage()));
            }
        }
        return arrayList;
    }

    private List<EditorialContent> buildPlaceHolderContent(List<EditorialContent> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createErrorEditorialModel, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EditorialViewModel m7739j(Throwable th) {
        return th instanceof NoNetworkConnectionException ? new EditorialViewModel(EditorialViewModel.Error.NETWORK) : new EditorialViewModel(EditorialViewModel.Error.GENERIC);
    }

    private List<Integer> getPlaceHolderPositions(List<EditorialContent> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).isPlaceHolderType()) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7730a() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7731b() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7732c() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7735f() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7736g() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7737h() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModelWithSlug$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7738i(EditorialCard editorialCard) {
        return lambda$loadEditorialViewModel$3(editorialCard, editorialCard.getData().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapEditorial, reason: merged with bridge method [inline-methods] */
    public C11234e<EditorialViewModel> m7733d(EditorialCard editorialCard, String str) {
        if (!editorialCard.isOk()) {
            return C11234e.m40017C(new IllegalStateException("Could not obtain request from server."));
        }
        EditorialCard.Data data = editorialCard.getData();
        List<EditorialContent> listMapEditorialContent = mapEditorialContent(data.getContent());
        List<Integer> placeHolderPositions = getPlaceHolderPositions(listMapEditorialContent);
        List<EditorialContent> listBuildPlaceHolderContent = buildPlaceHolderContent(listMapEditorialContent, placeHolderPositions);
        EditorialContent editorialContent = null;
        if (!listBuildPlaceHolderContent.isEmpty() && listBuildPlaceHolderContent.size() == 1) {
            editorialContent = listBuildPlaceHolderContent.get(0);
        }
        return C11234e.m40025S(buildEditorialViewModel(listMapEditorialContent, data, placeHolderPositions, listBuildPlaceHolderContent, editorialContent, str, data.getType()));
    }

    private List<EditorialContent> mapEditorialContent(List<EditorialCard.Content> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                EditorialCard.Content content = list.get(i2);
                arrayList.add(buildEditorialContent(content, buildMediaList(content.getMedia()), content.getApp(), content.getAction(), i2));
            }
        }
        return arrayList;
    }

    public Single<EditorialViewModel> loadEditorialViewModel(final String str) {
        return this.loading ? Single.m39913m(new EditorialViewModel(true)) : EditorialRequest.ofWithCardId(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.e6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8959f.m7730a();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.k6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9024f.m7731b();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.f6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8968f.m7732c();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.m6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9042f.m7733d(str, (EditorialCard) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.l6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9033f.m7734e((Throwable) obj);
            }
        });
    }

    public Single<EditorialViewModel> loadEditorialViewModelWithSlug(String str) {
        return this.loading ? Single.m39913m(new EditorialViewModel(true)) : EditorialRequest.ofWithSlug(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.i6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9004f.m7735f();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.j6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9013f.m7736g();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.g6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8980f.m7737h();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9052f.m7738i((EditorialCard) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8988f.m7739j((Throwable) obj);
            }
        });
    }
}
