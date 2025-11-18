package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u3.InterfaceC4670h;

/* compiled from: SQLiteCopyOpenHelperFactory.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/room/E;", "Lu3/h$c;", "", "mCopyFromAssetPath", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lu3/h$c;)V", "Lu3/h$b;", "configuration", "Lu3/h;", "a", "(Lu3/h$b;)Lu3/h;", "Ljava/lang/String;", "b", "Ljava/io/File;", "c", "Ljava/util/concurrent/Callable;", "d", "Lu3/h$c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E implements InterfaceC4670h.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mCopyFromAssetPath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File mCopyFromFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Callable<InputStream> mCopyFromInputStream;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4670h.c mDelegate;

    public E(String str, File file, Callable<InputStream> callable, InterfaceC4670h.c mDelegate) {
        C3862t.g(mDelegate, "mDelegate");
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDelegate = mDelegate;
    }

    @Override // u3.InterfaceC4670h.c
    public InterfaceC4670h a(InterfaceC4670h.b configuration) {
        C3862t.g(configuration, "configuration");
        return new D(configuration.context, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, configuration.callback.version, this.mDelegate.a(configuration));
    }
}
