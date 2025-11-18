package cm.aptoide.p092pt.view.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import java.text.DecimalFormat;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class ApplicationViewHolder extends ListStoreAppViewHolder {
    private final C11418b<Application> appClicks;
    private final ImageView iconView;
    private final TextView nameTextView;
    private final TextView rating;

    public ApplicationViewHolder(View view, C11418b<Application> c11418b) {
        super(view);
        this.nameTextView = (TextView) view.findViewById(C1146R.id.name);
        this.iconView = (ImageView) view.findViewById(C1146R.id.icon);
        this.rating = (TextView) view.findViewById(C1146R.id.rating_label);
        this.appClicks = c11418b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8953a(Application application, View view) {
        this.appClicks.onNext(application);
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppViewHolder
    public void setApp(final Application application) {
        this.nameTextView.setText(application.getName());
        ImageLoader.with(this.itemView.getContext()).load(application.getIcon(), this.iconView);
        float rating = application.getRating();
        if (rating == 0.0f) {
            this.rating.setText(C1146R.string.appcardview_title_no_stars);
        } else {
            this.rating.setText(new DecimalFormat("0.0").format(rating));
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.app.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11776f.m8953a(application, view);
            }
        });
    }
}
