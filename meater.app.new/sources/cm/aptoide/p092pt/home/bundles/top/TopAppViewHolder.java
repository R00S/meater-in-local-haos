package cm.aptoide.p092pt.home.bundles.top;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.AppSecondaryInfoViewHolder;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.app.AppViewHolder;
import cm.aptoide.p092pt.view.app.Application;
import java.text.DecimalFormat;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class TopAppViewHolder extends AppViewHolder {
    private final C11418b<HomeEvent> appClicks;
    private ImageView appIcon;
    private final AppSecondaryInfoViewHolder appInfoViewHolder;
    private TextView downloadNumber;
    private TextView name;
    private TextView topNumber;

    public TopAppViewHolder(View view, C11418b<HomeEvent> c11418b, DecimalFormat decimalFormat) {
        super(view);
        this.appClicks = c11418b;
        this.topNumber = (TextView) view.findViewById(C1146R.id.top_number);
        this.appIcon = (ImageView) view.findViewById(C1146R.id.icon);
        this.name = (TextView) view.findViewById(C1146R.id.name_label);
        this.downloadNumber = (TextView) view.findViewById(C1146R.id.download_number_label);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, decimalFormat);
        ((TextView) view.findViewById(C1146R.id.rating_label)).setTextAppearance(view.getContext(), C1146R.style.Aptoide_TextView_Medium_XXS_Black);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8097a(Application application, HomeBundle homeBundle, int i2, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i2, HomeEvent.Type.APP));
    }

    @Override // cm.aptoide.p092pt.view.app.AppViewHolder
    public void setApp(final Application application, final HomeBundle homeBundle, final int i2) {
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.appIcon, C1146R.attr.placeholder_square);
        this.name.setText(application.getName());
        this.topNumber.setText(String.valueOf(i2 + 1));
        this.appInfoViewHolder.setInfo(application.hasAppcBilling(), application.getRating(), true, true);
        this.downloadNumber.setText(String.format("%s %s", AptoideUtils.StringU.withSuffix(application.getDownloads()), this.itemView.getContext().getResources().getString(C1146R.string.downloads)));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.top.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9660f.m8097a(application, homeBundle, i2, view);
            }
        });
    }
}
