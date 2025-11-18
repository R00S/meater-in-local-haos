package cm.aptoide.analytics.implementation.loggers;

import cm.aptoide.analytics.KnockEventLogger;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class HttpKnockEventLogger implements KnockEventLogger {
    private final OkHttpClient client;

    public HttpKnockEventLogger(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    @Override // cm.aptoide.analytics.KnockEventLogger
    public void log(String str) {
        this.client.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                response.body().close();
            }
        });
    }
}
