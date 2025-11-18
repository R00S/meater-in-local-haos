package cm.aptoide.p092pt.reviews;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class ReviewsRatingDisplayable extends Displayable {
    private GetAppMeta.App appMeta;

    public ReviewsRatingDisplayable() {
    }

    public GetAppMeta.App getAppMeta() {
        return this.appMeta;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.reviews_rating_displayable;
    }

    public ReviewsRatingDisplayable(GetAppMeta.App app) {
        this.appMeta = app;
    }
}
