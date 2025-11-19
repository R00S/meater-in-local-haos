package E3;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LE3/a;", "LE3/g;", "<init>", "()V", "", "tag", "message", "Loa/F;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3816a = new a();

    private a() {
    }

    @Override // E3.g
    public void a(String tag, String message) {
        C3862t.g(tag, "tag");
        C3862t.g(message, "message");
        Log.d(tag, message);
    }
}
