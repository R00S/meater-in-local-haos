package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.editorial.EditorialRepository;
import cm.aptoide.p092pt.editorial.EditorialService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialRepositoryFactory implements Provider {
    private final Provider<EditorialService> editorialServiceProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesEditorialRepositoryFactory(FragmentModule fragmentModule, Provider<EditorialService> provider) {
        this.module = fragmentModule;
        this.editorialServiceProvider = provider;
    }

    public static FragmentModule_ProvidesEditorialRepositoryFactory create(FragmentModule fragmentModule, Provider<EditorialService> provider) {
        return new FragmentModule_ProvidesEditorialRepositoryFactory(fragmentModule, provider);
    }

    public static EditorialRepository providesEditorialRepository(FragmentModule fragmentModule, EditorialService editorialService) {
        return (EditorialRepository) C9055b.m29112c(fragmentModule.providesEditorialRepository(editorialService));
    }

    @Override // javax.inject.Provider
    public EditorialRepository get() {
        return providesEditorialRepository(this.module, this.editorialServiceProvider.get());
    }
}
