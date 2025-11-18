package cm.aptoide.p092pt.editorialList;

import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.reactions.ReactionsManager;
import cm.aptoide.p092pt.reactions.network.LoadReactionModel;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import java.util.Iterator;
import java.util.List;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class EditorialListManager {
    private final AppCoinsManager appCoinsManager;
    private final EditorialCardListRepository editorialCardListRepository;
    private final ReactionsManager reactionsManager;

    public EditorialListManager(EditorialCardListRepository editorialCardListRepository, ReactionsManager reactionsManager, AppCoinsManager appCoinsManager) {
        this.editorialCardListRepository = editorialCardListRepository;
        this.reactionsManager = reactionsManager;
        this.appCoinsManager = appCoinsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUpdatedCards, reason: merged with bridge method [inline-methods] */
    public Single<CurationCard> m7753b(EditorialCardListModel editorialCardListModel, LoadReactionModel loadReactionModel, String str) {
        CurationCard next;
        List<CurationCard> curationCards = editorialCardListModel.getCurationCards();
        Iterator<CurationCard> it = curationCards.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getId().equals(str)) {
                next.setReactions(loadReactionModel.getTopReactionList());
                next.setNumberOfReactions(loadReactionModel.getTotal());
                next.setUserReaction(loadReactionModel.getMyReaction());
                break;
            }
        }
        this.editorialCardListRepository.updateCache(editorialCardListModel, curationCards);
        return Single.m39913m(next);
    }

    static /* synthetic */ EditorialListModel lambda$loadEditorialListModel$0(EditorialCardListModel editorialCardListModel, BonusAppcModel bonusAppcModel) {
        return new EditorialListModel(editorialCardListModel, bonusAppcModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialListModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7752a(final EditorialCardListModel editorialCardListModel) {
        return C9059d.m29126d(this.appCoinsManager.getBonusAppc()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EditorialListManager.lambda$loadEditorialListModel$0(editorialCardListModel, (BonusAppcModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7754c(final String str, final LoadReactionModel loadReactionModel) {
        return this.editorialCardListRepository.loadEditorialCardListModel(false).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9285f.m7753b(loadReactionModel, str, (EditorialCardListModel) obj);
            }
        });
    }

    private Single<EditorialCardListModel> loadEditorialCardListModel(boolean z, boolean z2) {
        return z ? this.editorialCardListRepository.loadMoreCurationCards() : this.editorialCardListRepository.loadEditorialCardListModel(z2);
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        return this.reactionsManager.deleteReaction(str, str2);
    }

    public boolean hasMore() {
        return this.editorialCardListRepository.hasMore();
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return this.reactionsManager.isFirstReaction(str, str2);
    }

    Single<EditorialListModel> loadEditorialListModel(boolean z, boolean z2) {
        return loadEditorialCardListModel(z, z2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9282f.m7752a((EditorialCardListModel) obj);
            }
        });
    }

    public Single<CurationCard> loadReactionModel(final String str, String str2) {
        return this.reactionsManager.loadReactionModel(str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9290f.m7754c(str, (LoadReactionModel) obj);
            }
        });
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.reactionsManager.setReaction(str, str2, str3);
    }
}
