package cm.aptoide.p092pt.home.bundles.apps;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.AppSecondaryInfoViewHolder;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.app.AppViewHolder;
import cm.aptoide.p092pt.view.app.Application;
import java.text.DecimalFormat;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AppInBundleViewHolder extends AppViewHolder {
    private final C11418b<HomeEvent> appClicks;
    private AppSecondaryInfoViewHolder appInfoViewHolder;
    private final ImageView iconView;
    private final TextView nameTextView;

    public AppInBundleViewHolder(View view, C11418b<HomeEvent> c11418b, DecimalFormat decimalFormat) {
        super(view);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, decimalFormat);
        this.nameTextView = (TextView) view.findViewById(C1146R.id.name);
        this.iconView = (ImageView) view.findViewById(C1146R.id.icon);
        this.appClicks = c11418b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8076a(Application application, HomeBundle homeBundle, int i2, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i2, HomeEvent.Type.APP));
    }

    @Override // cm.aptoide.p092pt.view.app.AppViewHolder
    public void setApp(final Application application, final HomeBundle homeBundle, final int i2) {
        this.nameTextView.setText(application.getName());
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.iconView, C1146R.attr.placeholder_square);
        this.appInfoViewHolder.setInfo(application.hasAppcBilling(), application.getRating(), true, false);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.apps.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9536f.m8076a(application, homeBundle, i2, view);
            }
        });
    }
}
