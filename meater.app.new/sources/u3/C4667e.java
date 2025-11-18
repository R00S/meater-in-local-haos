package u3;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu3/e;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "Loa/F;", "a", "(Landroid/database/Cursor;Landroid/os/Bundle;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4667e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4667e f50428a = new C4667e();

    private C4667e() {
    }

    public static final void a(Cursor cursor, Bundle extras) {
        C3862t.g(cursor, "cursor");
        C3862t.g(extras, "extras");
        cursor.setExtras(extras);
    }
}
