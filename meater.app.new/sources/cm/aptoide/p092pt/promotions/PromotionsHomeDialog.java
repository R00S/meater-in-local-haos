package cm.aptoide.p092pt.promotions;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.analytics.implementation.CrashLogger;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.HomePromotionsWrapper;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class PromotionsHomeDialog {
    private static final String HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL = "HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL";
    private Button cancel;
    private AlertDialog dialog;
    private View dialogView;
    private Button navigate;
    private final CrashLogger crashReport = CrashReport.getInstance();
    private C11418b<String> uiEvents = C11418b.m40637g1();

    public PromotionsHomeDialog(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.dialog = new AlertDialog.Builder(context).create();
        View viewInflate = layoutInflaterFrom.inflate(C1146R.layout.promotions_home_dialog, (ViewGroup) null);
        this.dialogView = viewInflate;
        this.dialog.setView(viewInflate);
        this.cancel = (Button) this.dialogView.findViewById(C1146R.id.cancel_button);
        this.navigate = (Button) this.dialogView.findViewById(C1146R.id.navigate_button);
        this.dialog.setCancelable(true);
        this.dialog.setCanceledOnTouchOutside(true);
        Window window = this.dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.navigate.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10762f.m8517a(view);
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10753f.m8518b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8517a(View view) {
        C11418b<String> c11418b = this.uiEvents;
        if (c11418b != null) {
            c11418b.onNext("navigate");
        } else {
            this.crashReport.log(HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8518b(View view) {
        C11418b<String> c11418b = this.uiEvents;
        if (c11418b != null) {
            c11418b.onNext("cancel");
        } else {
            this.crashReport.log(HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public void destroyDialog() {
        dismissDialog();
        this.dialog = null;
        this.navigate = null;
        this.cancel = null;
        this.uiEvents = null;
    }

    public C11234e<String> dialogClicked() {
        return this.uiEvents;
    }

    public void dismissDialog() {
        this.dialog.dismiss();
    }

    public void showDialog(HomePromotionsWrapper homePromotionsWrapper) {
        this.dialog.show();
        ((TextView) this.dialogView.findViewById(C1146R.id.description)).setText(homePromotionsWrapper.getDescription());
        TextView textView = (TextView) this.dialog.findViewById(C1146R.id.promotion_title);
        ImageView imageView = (ImageView) this.dialog.findViewById(C1146R.id.promotion_graphic);
        textView.setText(homePromotionsWrapper.getTitle());
        ImageLoader.with(this.dialog.getContext()).load(homePromotionsWrapper.getFeatureGraphic(), imageView);
    }
}
