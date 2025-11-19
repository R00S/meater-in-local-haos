package d7;

import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d7.InterfaceC3051e;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3049c<R extends InterfaceC3051e> {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    /* renamed from: d7.c$a */
    public interface a {
        void a(Status status);
    }

    public abstract void b(a aVar);

    @ResultIgnorabilityUnspecified
    public abstract R c(long j10, TimeUnit timeUnit);
}
