package cm.aptoide.p092pt.home.bundles.promotional;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.EditorialActionBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialViewHolder;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;
import p456rx.p473s.C11418b;

/* compiled from: NewsViewHolder.kt */
@Metadata(m32266d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/promotional/NewsViewHolder;", "Lcm/aptoide/pt/home/bundles/editorial/EditorialViewHolder;", "view", "Landroid/view/View;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Lrx/subjects/PublishSubject;)V", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", HttpUrl.FRAGMENT_ENCODE_SET, "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "setupCalendarDateString", "date", HttpUrl.FRAGMENT_ENCODE_SET, "toggleSkeleton", "showSkeleton", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class NewsViewHolder extends EditorialViewHolder {
    private Skeleton skeleton;
    private final C11418b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsViewHolder(View view, C11418b<HomeEvent> c11418b) {
        super(view);
        C9801m.m32346f(view, "view");
        C9801m.m32346f(c11418b, "uiEventsListener");
        this.view = view;
        this.uiEventsListener = c11418b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-1$lambda-0, reason: not valid java name */
    public static final void m40855setBundle$lambda1$lambda0(NewsViewHolder newsViewHolder, HomeBundle homeBundle, int i2, View view) {
        C9801m.m32346f(newsViewHolder, "this$0");
        EditorialActionBundle editorialActionBundle = (EditorialActionBundle) homeBundle;
        newsViewHolder.uiEventsListener.onNext(new EditorialHomeEvent(editorialActionBundle.getActionItem().getCardId(), editorialActionBundle.getActionItem().getType(), homeBundle, i2, HomeEvent.Type.EDITORIAL));
    }

    private final void setupCalendarDateString(String date) {
        Object[] array = C10547v.m37582v0(date, new String[]{" "}, false, 0, 6, null).toArray(new String[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(C10546u.m37507A(((String[]) array)[0], "-", "/", false, 4, null));
        if (date2 != null) {
            String str = DateFormat.getDateInstance(3).format(date2);
            C9801m.m32345e(str, "getDateInstance(DateForm…         .format(newDate)");
            ((TextView) this.itemView.findViewById(C1146R.id.news_date)).setText(str);
        }
    }

    private final void toggleSkeleton(boolean showSkeleton) {
        if (showSkeleton) {
            Skeleton skeleton = this.skeleton;
            if (skeleton != null) {
                skeleton.showSkeleton();
            }
            ((SkeletonView) this.itemView.findViewById(C1146R.id.card_title_label_skeletonview)).setVisibility(0);
            ((CardView) this.itemView.findViewById(C1146R.id.card_title_label)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(C1146R.id.news_title_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(C1146R.id.news_title)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(C1146R.id.news_date_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(C1146R.id.news_date)).setVisibility(4);
            ((TextView) this.itemView.findViewById(C1146R.id.news_summary)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(C1146R.id.news_summary_skeletonview_1)).setVisibility(0);
            ((SkeletonView) this.itemView.findViewById(C1146R.id.news_summary_skeletonview_2)).setVisibility(0);
            return;
        }
        Skeleton skeleton2 = this.skeleton;
        if (skeleton2 != null) {
            skeleton2.showOriginal();
        }
        ((SkeletonView) this.itemView.findViewById(C1146R.id.card_title_label_skeletonview)).setVisibility(4);
        ((CardView) this.itemView.findViewById(C1146R.id.card_title_label)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(C1146R.id.news_title_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(C1146R.id.news_title)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(C1146R.id.news_date_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(C1146R.id.news_date)).setVisibility(0);
        ((TextView) this.itemView.findViewById(C1146R.id.news_summary)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(C1146R.id.news_summary_skeletonview_1)).setVisibility(4);
        ((SkeletonView) this.itemView.findViewById(C1146R.id.news_summary_skeletonview_2)).setVisibility(4);
    }

    public final C11418b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.p092pt.home.bundles.editorial.EditorialViewHolder, cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, final int position) {
        if ((homeBundle instanceof EditorialActionBundle ? (EditorialActionBundle) homeBundle : null) != null) {
            EditorialActionBundle editorialActionBundle = (EditorialActionBundle) homeBundle;
            if (editorialActionBundle.getContent() == null) {
                toggleSkeleton(true);
                return;
            }
            toggleSkeleton(false);
            ((TextView) this.itemView.findViewById(C1146R.id.card_title_label_text)).setText(editorialActionBundle.getTitle());
            ImageLoader.with(this.itemView.getContext()).load(editorialActionBundle.getActionItem().getIcon(), (ImageView) this.itemView.findViewById(C1146R.id.app_background_image));
            ((TextView) this.itemView.findViewById(C1146R.id.news_title)).setText(editorialActionBundle.getActionItem().getTitle());
            ((TextView) this.itemView.findViewById(C1146R.id.news_date)).setText(editorialActionBundle.getActionItem().getDate());
            ((TextView) this.itemView.findViewById(C1146R.id.news_summary)).setText(editorialActionBundle.getActionItem().getSummary());
            String date = editorialActionBundle.getActionItem().getDate();
            C9801m.m32345e(date, "homeBundle.actionItem.date");
            setupCalendarDateString(date);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.promotional.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsViewHolder.m40855setBundle$lambda1$lambda0(this.f9642f, homeBundle, position, view);
                }
            });
        }
    }
}
