package u3;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu3/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "(Landroid/content/Context;)Ljava/io/File;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4666d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4666d f50427a = new C4666d();

    private C4666d() {
    }

    public static final File a(Context context) {
        C3862t.g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C3862t.f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
