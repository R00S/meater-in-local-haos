package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.editorialList.EditorialCardListRepository;
import cm.aptoide.p092pt.editorialList.EditorialCardListService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialListRepositoryFactory implements Provider {
    private final Provider<EditorialCardListService> editorialCardListServiceProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesEditorialListRepositoryFactory(FragmentModule fragmentModule, Provider<EditorialCardListService> provider) {
        this.module = fragmentModule;
        this.editorialCardListServiceProvider = provider;
    }

    public static FragmentModule_ProvidesEditorialListRepositoryFactory create(FragmentModule fragmentModule, Provider<EditorialCardListService> provider) {
        return new FragmentModule_ProvidesEditorialListRepositoryFactory(fragmentModule, provider);
    }

    public static EditorialCardListRepository providesEditorialListRepository(FragmentModule fragmentModule, EditorialCardListService editorialCardListService) {
        return (EditorialCardListRepository) C9055b.m29112c(fragmentModule.providesEditorialListRepository(editorialCardListService));
    }

    @Override // javax.inject.Provider
    public EditorialCardListRepository get() {
        return providesEditorialListRepository(this.module, this.editorialCardListServiceProvider.get());
    }
}
