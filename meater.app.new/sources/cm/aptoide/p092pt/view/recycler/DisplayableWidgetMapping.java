package cm.aptoide.p092pt.view.recycler;

import android.view.View;
import cm.aptoide.p092pt.account.view.LoginDisplayable;
import cm.aptoide.p092pt.account.view.user.CreateStoreDisplayable;
import cm.aptoide.p092pt.app.view.GridAppDisplayable;
import cm.aptoide.p092pt.app.view.GridAppListDisplayable;
import cm.aptoide.p092pt.app.view.GridAppListWidget;
import cm.aptoide.p092pt.app.view.GridAppWidget;
import cm.aptoide.p092pt.app.view.OfficialAppDisplayable;
import cm.aptoide.p092pt.app.view.OfficialAppWidget;
import cm.aptoide.p092pt.app.view.displayable.OtherVersionDisplayable;
import cm.aptoide.p092pt.app.view.widget.OtherVersionWidget;
import cm.aptoide.p092pt.comments.view.CommentDisplayable;
import cm.aptoide.p092pt.comments.view.CommentWidget;
import cm.aptoide.p092pt.comments.view.CommentsReadMoreDisplayable;
import cm.aptoide.p092pt.comments.view.CommentsReadMoreWidget;
import cm.aptoide.p092pt.comments.view.RateAndReviewCommentDisplayable;
import cm.aptoide.p092pt.comments.view.RateAndReviewCommentWidget;
import cm.aptoide.p092pt.comments.view.StoreAddCommentWidget;
import cm.aptoide.p092pt.comments.view.StoreLatestCommentsWidget;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.reviews.ReviewsLanguageFilterDisplayable;
import cm.aptoide.p092pt.reviews.ReviewsLanguageFilterWidget;
import cm.aptoide.p092pt.reviews.ReviewsRatingDisplayable;
import cm.aptoide.p092pt.reviews.ReviewsRatingWidget;
import cm.aptoide.p092pt.reviews.RowReviewDisplayable;
import cm.aptoide.p092pt.store.view.CreateStoreWidget;
import cm.aptoide.p092pt.store.view.GridDisplayDisplayable;
import cm.aptoide.p092pt.store.view.GridStoreDisplayable;
import cm.aptoide.p092pt.store.view.GridStoreMetaDisplayable;
import cm.aptoide.p092pt.store.view.GridStoreMetaWidget;
import cm.aptoide.p092pt.store.view.GridStoreWidget;
import cm.aptoide.p092pt.store.view.LoginWidget;
import cm.aptoide.p092pt.store.view.StoreAddCommentDisplayable;
import cm.aptoide.p092pt.store.view.StoreGridHeaderDisplayable;
import cm.aptoide.p092pt.store.view.StoreGridHeaderWidget;
import cm.aptoide.p092pt.store.view.StoreLatestCommentsDisplayable;
import cm.aptoide.p092pt.store.view.featured.AppBrickDisplayable;
import cm.aptoide.p092pt.store.view.featured.AppBrickListDisplayable;
import cm.aptoide.p092pt.store.view.featured.AppBrickListWidget;
import cm.aptoide.p092pt.store.view.featured.AppBrickWidget;
import cm.aptoide.p092pt.store.view.p104my.StoreDisplayable;
import cm.aptoide.p092pt.store.view.p104my.StoreWidget;
import cm.aptoide.p092pt.store.view.recommended.RecommendedStoreDisplayable;
import cm.aptoide.p092pt.store.view.recommended.RecommendedStoreWidget;
import cm.aptoide.p092pt.store.view.top.TopAppListDisplayable;
import cm.aptoide.p092pt.store.view.top.TopAppListWidget;
import cm.aptoide.p092pt.timeline.view.displayable.FollowStoreDisplayable;
import cm.aptoide.p092pt.timeline.view.displayable.FollowUserDisplayable;
import cm.aptoide.p092pt.timeline.view.follow.FollowStoreWidget;
import cm.aptoide.p092pt.timeline.view.follow.FollowUserWidget;
import cm.aptoide.p092pt.updates.view.excluded.ExcludedUpdateDisplayable;
import cm.aptoide.p092pt.updates.view.excluded.ExcludedUpdateWidget;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.EmptyDisplayable;
import cm.aptoide.p092pt.view.recycler.displayable.FooterRowDisplayable;
import cm.aptoide.p092pt.view.recycler.displayable.GridAdDisplayable;
import cm.aptoide.p092pt.view.recycler.displayable.MessageWhiteBgDisplayable;
import cm.aptoide.p092pt.view.recycler.displayable.ProgressBarDisplayable;
import cm.aptoide.p092pt.view.recycler.widget.EmptyWidget;
import cm.aptoide.p092pt.view.recycler.widget.FooterRowWidget;
import cm.aptoide.p092pt.view.recycler.widget.GridAdWidget;
import cm.aptoide.p092pt.view.recycler.widget.GridDisplayWidget;
import cm.aptoide.p092pt.view.recycler.widget.MessageWhiteBgWidget;
import cm.aptoide.p092pt.view.recycler.widget.ProgressBarWidget;
import cm.aptoide.p092pt.view.recycler.widget.RowReviewWidget;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DisplayableWidgetMapping {
    private static final String TAG = "cm.aptoide.pt.view.recycler.DisplayableWidgetMapping";
    private static final DisplayableWidgetMapping instance = new DisplayableWidgetMapping();
    private List<Displayable> cachedDisplayables;
    private Class<? extends Displayable> displayableClass;
    private Map<Integer, DisplayableWidgetMapping> viewTypeMapping = new HashMap();
    private Class<? extends Widget> widgetClass;

    protected DisplayableWidgetMapping() {
        parseMappings(createMapping());
    }

    public static DisplayableWidgetMapping getInstance() {
        return instance;
    }

    protected List<DisplayableWidgetMapping> createMapping() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new DisplayableWidgetMapping(EmptyWidget.class, EmptyDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(AppBrickWidget.class, AppBrickDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridAppWidget.class, GridAppDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridDisplayWidget.class, GridDisplayDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreGridHeaderWidget.class, StoreGridHeaderDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(FooterRowWidget.class, FooterRowDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridStoreWidget.class, GridStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridStoreMetaWidget.class, GridStoreMetaDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridAdWidget.class, GridAdDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridAppListWidget.class, GridAppListDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(AppBrickListWidget.class, AppBrickListDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(TopAppListWidget.class, TopAppListDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ExcludedUpdateWidget.class, ExcludedUpdateDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ProgressBarWidget.class, ProgressBarDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(OtherVersionWidget.class, OtherVersionDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(RowReviewWidget.class, RowReviewDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(RateAndReviewCommentWidget.class, RateAndReviewCommentDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(CommentWidget.class, CommentDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(CommentsReadMoreWidget.class, CommentsReadMoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreLatestCommentsWidget.class, StoreLatestCommentsDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreAddCommentWidget.class, StoreAddCommentDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(CreateStoreWidget.class, CreateStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreWidget.class, StoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(RecommendedStoreWidget.class, RecommendedStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(OfficialAppWidget.class, OfficialAppDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(FollowUserWidget.class, FollowUserDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(MessageWhiteBgWidget.class, MessageWhiteBgDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(FollowStoreWidget.class, FollowStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ReviewsLanguageFilterWidget.class, ReviewsLanguageFilterDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ReviewsRatingWidget.class, ReviewsRatingDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(LoginWidget.class, LoginDisplayable.class));
        return linkedList;
    }

    public List<Displayable> getCachedDisplayables() {
        if (this.cachedDisplayables == null) {
            LinkedList linkedList = new LinkedList();
            Iterator<DisplayableWidgetMapping> it = this.viewTypeMapping.values().iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().newDisplayable());
            }
            this.cachedDisplayables = Collections.unmodifiableList(linkedList);
        }
        return this.cachedDisplayables;
    }

    public Displayable newDisplayable() {
        try {
            return this.displayableClass.newInstance();
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
            String str = String.format("Error instantiating displayable '%s'", this.displayableClass.getName());
            Logger.getInstance().m8278e(TAG, str, e2);
            throw new RuntimeException(str);
        }
    }

    public Widget newWidget(View view, int i2) {
        DisplayableWidgetMapping displayableWidgetMapping = this.viewTypeMapping.get(Integer.valueOf(i2));
        if (displayableWidgetMapping != null) {
            return displayableWidgetMapping.newWidget(view);
        }
        throw new IllegalStateException(String.format("There's no widget for '%s' viewType", Integer.valueOf(i2)) + "\nDid you forget to add the mapping to DisplayableWidgetMapping enum??");
    }

    protected void parseMappings(List<DisplayableWidgetMapping> list) {
        for (DisplayableWidgetMapping displayableWidgetMapping : list) {
            this.viewTypeMapping.put(Integer.valueOf(displayableWidgetMapping.newDisplayable().getViewLayout()), displayableWidgetMapping);
        }
    }

    public DisplayableWidgetMapping(Class<? extends Widget> cls, Class<? extends Displayable> cls2) {
        this.displayableClass = cls2;
        this.widgetClass = cls;
    }

    private Widget newWidget(View view) {
        try {
            return this.widgetClass.getDeclaredConstructor(View.class).newInstance(view);
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
            String str = String.format("Error instantiating widget '%s'", this.widgetClass.getName());
            Logger.getInstance().m8278e(TAG, str, e2);
            throw new RuntimeException(str);
        }
    }
}
