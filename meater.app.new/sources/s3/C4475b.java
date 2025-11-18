package s3;

import Ub.n;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import u3.InterfaceC4669g;
import u3.j;
import za.C5220a;

/* compiled from: DBUtil.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/room/w;", "db", "Lu3/j;", "sqLiteQuery", "", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "b", "(Landroidx/room/w;Lu3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Lu3/g;", "Loa/F;", "a", "(Lu3/g;)V", "Ljava/io/File;", "databaseFile", "", "c", "(Ljava/io/File;)I", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4475b {
    public static final void a(InterfaceC4669g db2) {
        C3862t.g(db2, "db");
        List listC = r.c();
        Cursor cursorD0 = db2.D0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorD0.moveToNext()) {
            try {
                listC.add(cursorD0.getString(0));
            } finally {
            }
        }
        C4153F c4153f = C4153F.f46609a;
        C5220a.a(cursorD0, null);
        for (String triggerName : r.a(listC)) {
            C3862t.f(triggerName, "triggerName");
            if (n.G(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db2.I("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(w db2, j sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        C3862t.g(db2, "db");
        C3862t.g(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? C4474a.a(cursorQuery) : cursorQuery;
    }

    public static final int c(File databaseFile) {
        C3862t.g(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            C5220a.a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5220a.a(channel, th);
                throw th2;
            }
        }
    }
}
