package cm.aptoide.p092pt.home.more.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.view.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ListAppsViewHolder.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m32267d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "T", "Lcm/aptoide/pt/view/app/Application;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "bindApp", HttpUrl.FRAGMENT_ENCODE_SET, "app", "(Lcm/aptoide/pt/view/app/Application;)V", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class ListAppsViewHolder<T extends Application> extends RecyclerView.AbstractC0590c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListAppsViewHolder(View view) {
        super(view);
        C9801m.m32346f(view, "v");
    }

    public abstract void bindApp(T app);
}
