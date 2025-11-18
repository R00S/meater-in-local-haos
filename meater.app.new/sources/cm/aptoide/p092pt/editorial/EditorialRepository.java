package cm.aptoide.p092pt.editorial;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: EditorialRepository.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/editorial/EditorialRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "editorialService", "Lcm/aptoide/pt/editorial/EditorialService;", "(Lcm/aptoide/pt/editorial/EditorialService;)V", "cachedEditorialViewModel", "Lcm/aptoide/pt/editorial/EditorialViewModel;", "loadEditorialViewModel", "Lrx/Single;", "editorialLoadSource", "Lcm/aptoide/pt/editorial/EditorialLoadSource;", "saveResponse", "editorialViewModel", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EditorialRepository {
    private EditorialViewModel cachedEditorialViewModel;
    private final EditorialService editorialService;

    public EditorialRepository(EditorialService editorialService) {
        C9801m.m32346f(editorialService, "editorialService");
        this.editorialService = editorialService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadEditorialViewModel$lambda-0, reason: not valid java name */
    public static final EditorialViewModel m40822loadEditorialViewModel$lambda0(EditorialRepository editorialRepository, EditorialViewModel editorialViewModel) {
        C9801m.m32346f(editorialRepository, "this$0");
        C9801m.m32345e(editorialViewModel, "editorialViewModel");
        return editorialRepository.saveResponse(editorialViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadEditorialViewModel$lambda-1, reason: not valid java name */
    public static final EditorialViewModel m40823loadEditorialViewModel$lambda1(EditorialRepository editorialRepository, EditorialViewModel editorialViewModel) {
        C9801m.m32346f(editorialRepository, "this$0");
        C9801m.m32345e(editorialViewModel, "editorialViewModel");
        return editorialRepository.saveResponse(editorialViewModel);
    }

    private final EditorialViewModel saveResponse(EditorialViewModel editorialViewModel) {
        if (!editorialViewModel.hasError() && !editorialViewModel.isLoading()) {
            this.cachedEditorialViewModel = editorialViewModel;
        }
        return editorialViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Single<EditorialViewModel> loadEditorialViewModel(EditorialLoadSource editorialLoadSource) {
        Single singleM39923n;
        C9801m.m32346f(editorialLoadSource, "editorialLoadSource");
        EditorialViewModel editorialViewModel = this.cachedEditorialViewModel;
        if (editorialViewModel != null) {
            Single<EditorialViewModel> singleM39913m = Single.m39913m(editorialViewModel);
            C9801m.m32345e(singleM39913m, "just(cachedEditorialViewModel)");
            return singleM39913m;
        }
        if (editorialLoadSource instanceof CardId) {
            singleM39923n = this.editorialService.loadEditorialViewModel(((CardId) editorialLoadSource).getCardId()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.d6
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return EditorialRepository.m40822loadEditorialViewModel$lambda0(this.f8949f, (EditorialViewModel) obj);
                }
            });
        } else {
            if (!(editorialLoadSource instanceof Slug)) {
                throw new NoWhenBranchMatchedException();
            }
            singleM39923n = this.editorialService.loadEditorialViewModelWithSlug(((Slug) editorialLoadSource).getSlug()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.c6
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return EditorialRepository.m40823loadEditorialViewModel$lambda1(this.f8937f, (EditorialViewModel) obj);
                }
            });
        }
        C9801m.m32345e(singleM39923n, "when (editorialLoadSourc…wModel)\n        }\n      }");
        return singleM39923n;
    }
}
