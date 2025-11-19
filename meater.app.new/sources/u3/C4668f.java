package u3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu3/f;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "Loa/F;", "b", "(Landroid/database/Cursor;Landroid/content/ContentResolver;Ljava/util/List;)V", "a", "(Landroid/database/Cursor;)Ljava/util/List;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4668f {

    /* renamed from: a, reason: collision with root package name */
    public static final C4668f f50429a = new C4668f();

    private C4668f() {
    }

    public static final List<Uri> a(Cursor cursor) {
        C3862t.g(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        C3862t.d(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
        C3862t.g(cursor, "cursor");
        C3862t.g(cr, "cr");
        C3862t.g(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
