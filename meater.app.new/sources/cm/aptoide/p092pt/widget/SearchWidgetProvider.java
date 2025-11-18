package cm.aptoide.p092pt.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;

/* loaded from: classes.dex */
public class SearchWidgetProvider extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i2 : iArr) {
            Intent intent = new Intent(context, (Class<?>) DeepLinkIntentReceiver.class);
            intent.setData(Uri.parse("aptoide://cm.aptoide.pt/deeplink?name=search"));
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C1146R.layout.widget_search_layout);
            remoteViews.setOnClickPendingIntent(C1146R.id.widget_search_bar, activity);
            appWidgetManager.updateAppWidget(i2, remoteViews);
        }
    }
}
