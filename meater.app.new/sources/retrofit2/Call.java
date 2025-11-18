package retrofit2;

import java.io.IOException;
import okhttp3.Request;
import p353j.C9702e0;

/* loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C9702e0 timeout();
}
