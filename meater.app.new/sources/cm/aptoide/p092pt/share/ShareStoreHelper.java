package cm.aptoide.p092pt.share;

import android.content.Context;
import android.content.Intent;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.util.MarketResourceFormatter;

/* loaded from: classes.dex */
public class ShareStoreHelper {
    private final Context context;
    private final MarketResourceFormatter marketResourceFormatter;

    public ShareStoreHelper(Context context, MarketResourceFormatter marketResourceFormatter) {
        this.context = context;
        this.marketResourceFormatter = marketResourceFormatter;
    }

    public void shareStore(String str) {
        String str2 = this.marketResourceFormatter.formatString(this.context, C1146R.string.hello_follow_me_on_aptoide, new String[0]) + " " + str;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str2);
        Context context = this.context;
        context.startActivity(Intent.createChooser(intent, context.getString(C1146R.string.share)));
    }
}
