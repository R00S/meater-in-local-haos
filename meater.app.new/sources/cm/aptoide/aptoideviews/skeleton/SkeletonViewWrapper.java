package cm.aptoide.aptoideviews.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SkeletonViewWrapper.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonViewWrapper;", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "view", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "skeletonLayoutResId", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/view/View;Landroid/view/ViewGroup;I)V", "skeletonView", "getView", "()Landroid/view/View;", "showOriginal", HttpUrl.FRAGMENT_ENCODE_SET, "showSkeleton", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SkeletonViewWrapper implements Skeleton {
    private final View skeletonView;
    private final View view;

    public SkeletonViewWrapper(View view, ViewGroup viewGroup, int i2) {
        C9801m.m32346f(view, "view");
        C9801m.m32346f(viewGroup, "parent");
        this.view = view;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        C9801m.m32345e(viewInflate, "from(parent.context).inf…youtResId, parent, false)");
        this.skeletonView = viewInflate;
        viewGroup.addView(viewInflate);
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.aptoideviews.skeleton.Skeleton
    public void showOriginal() {
        this.skeletonView.setVisibility(8);
        this.view.setVisibility(0);
    }

    @Override // cm.aptoide.aptoideviews.skeleton.Skeleton
    public void showSkeleton() {
        this.view.setVisibility(8);
        this.skeletonView.setVisibility(0);
    }
}
