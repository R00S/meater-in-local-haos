package cm.aptoide.p092pt.reviews;

import android.widget.Spinner;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.reviews.LanguageFilterHelper;
import cm.aptoide.p092pt.reviews.LanguageFilterSpinnerHelper;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class ReviewsLanguageFilterDisplayable extends Displayable {
    private LanguageFilterSpinnerHelper languageFilterSpinnerHelper;
    private LanguageFilterSpinnerHelper.OnItemSelected onItemSelected;

    public ReviewsLanguageFilterDisplayable() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setup$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8605a(LanguageFilterHelper.LanguageFilter languageFilter) {
        this.onItemSelected.onItemSelected(languageFilter);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public LanguageFilterSpinnerHelper.OnItemSelected getOnItemSelected() {
        return this.onItemSelected;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.reviews_language_filter;
    }

    public void setup(Spinner spinner) {
        if (this.languageFilterSpinnerHelper == null) {
            LanguageFilterSpinnerHelper languageFilterSpinnerHelper = new LanguageFilterSpinnerHelper(spinner);
            this.languageFilterSpinnerHelper = languageFilterSpinnerHelper;
            languageFilterSpinnerHelper.setup(new LanguageFilterSpinnerHelper.OnItemSelected() { // from class: cm.aptoide.pt.reviews.n
                @Override // cm.aptoide.pt.reviews.LanguageFilterSpinnerHelper.OnItemSelected
                public final void onItemSelected(LanguageFilterHelper.LanguageFilter languageFilter) {
                    this.f10974a.m8605a(languageFilter);
                }
            });
        }
    }

    public ReviewsLanguageFilterDisplayable(LanguageFilterSpinnerHelper.OnItemSelected onItemSelected) {
        this.onItemSelected = onItemSelected;
    }
}
