package rc;

import Ba.l;
import Cc.B;
import Cc.g;
import Cc.j;
import Cc.o;
import Cc.z;
import Ub.k;
import Ub.n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import sc.AbstractC4529a;
import xc.InterfaceC5088a;
import za.C5220a;

/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001n\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0004rstuB9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0019J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0010H\u0000¢\u0006\u0004\b#\u0010\u0012J\u001e\u0010%\u001a\b\u0018\u00010$R\u00020\u00002\u0006\u0010 \u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\b\u0018\u00010(R\u00020\u00002\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00102\n\u0010+\u001a\u00060(R\u00020\u00002\u0006\u0010,\u001a\u00020\u001bH\u0000¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u00020\u001b2\n\u00102\u001a\u000601R\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\u0012J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u0010\u0012J\r\u00108\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bC\u0010DR*\u0010\u000b\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010=R\u0014\u0010O\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010=R\u0014\u0010P\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010GR\u0018\u0010S\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010RR*\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u000601R\u00020\u00000T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010AR\u0016\u0010\\\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010[R\u0016\u0010^\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0016\u0010_\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010[R\"\u0010c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010[\u001a\u0004\b`\u0010\u001d\"\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010[R\u0016\u0010g\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010[R\u0016\u0010i\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010GR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006v"}, d2 = {"Lrc/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lxc/a;", "fileSystem", "Ljava/io/File;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lsc/e;", "taskRunner", "<init>", "(Lxc/a;Ljava/io/File;IIJLsc/e;)V", "Loa/F;", "K", "()V", "LCc/f;", "z", "()LCc/f;", "", "line", "L", "(Ljava/lang/String;)V", "C", "", "y", "()Z", "k", "W", "key", "a0", "x", "N", "Lrc/d$d;", "p", "(Ljava/lang/String;)Lrc/d$d;", "expectedSequenceNumber", "Lrc/d$b;", "n", "(Ljava/lang/String;J)Lrc/d$b;", "editor", "success", "l", "(Lrc/d$b;Z)V", "P", "(Ljava/lang/String;)Z", "Lrc/d$c;", "entry", "Q", "(Lrc/d$c;)Z", "flush", "close", "X", "m", "B", "Lxc/a;", "t", "()Lxc/a;", "Ljava/io/File;", "s", "()Ljava/io/File;", "D", "I", "E", "u", "()I", "value", "F", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "G", "journalFile", "H", "journalFileTmp", "journalFileBackup", "size", "LCc/f;", "journalWriter", "Ljava/util/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "M", "redundantOpCount", "Z", "hasJournalErrors", "O", "civilizedFileSystem", "initialized", "q", "setClosed$okhttp", "(Z)V", "closed", "R", "mostRecentTrimFailed", "S", "mostRecentRebuildFailed", "T", "nextSequenceNumber", "Lsc/d;", "U", "Lsc/d;", "cleanupQueue", "rc/d$e", "V", "Lrc/d$e;", "cleanupTask", "a", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: X, reason: collision with root package name */
    public static final String f48521X = "journal";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f48522Y = "journal.tmp";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f48523Z = "journal.bkp";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f48524a0 = "libcore.io.DiskLruCache";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f48525b0 = "1";

    /* renamed from: c0, reason: collision with root package name */
    public static final long f48526c0 = -1;

    /* renamed from: d0, reason: collision with root package name */
    public static final k f48527d0 = new k("[a-z0-9_-]{1,120}");

    /* renamed from: e0, reason: collision with root package name */
    public static final String f48528e0 = "CLEAN";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f48529f0 = "DIRTY";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f48530g0 = "REMOVE";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f48531h0 = "READ";

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5088a fileSystem;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final File directory;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final File journalFile;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final File journalFileTmp;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final File journalFileBackup;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Cc.f journalWriter;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<String, c> lruEntries;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private int redundantOpCount;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean civilizedFileSystem;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private long nextSequenceNumber;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final sc.d cleanupQueue;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final e cleanupTask;

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lrc/d$b;", "", "Lrc/d$c;", "Lrc/d;", "entry", "<init>", "(Lrc/d;Lrc/d$c;)V", "Loa/F;", "c", "()V", "", "index", "LCc/z;", "f", "(I)LCc/z;", "b", "a", "Lrc/d$c;", "d", "()Lrc/d$c;", "", "[Z", "e", "()[Z", "written", "", "Z", "done", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c entry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f48556d;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Loa/F;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements l<IOException, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ d f48557B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ b f48558C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b bVar) {
                super(1);
                this.f48557B = dVar;
                this.f48558C = bVar;
            }

            public final void a(IOException it) {
                C3862t.g(it, "it");
                d dVar = this.f48557B;
                b bVar = this.f48558C;
                synchronized (dVar) {
                    bVar.c();
                    C4153F c4153f = C4153F.f46609a;
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(IOException iOException) {
                a(iOException);
                return C4153F.f46609a;
            }
        }

        public b(d dVar, c entry) {
            C3862t.g(entry, "entry");
            this.f48556d = dVar;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[dVar.getValueCount()];
        }

        public final void a() {
            d dVar = this.f48556d;
            synchronized (dVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (C3862t.b(this.entry.getCurrentEditor(), this)) {
                        dVar.l(this, false);
                    }
                    this.done = true;
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            d dVar = this.f48556d;
            synchronized (dVar) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (C3862t.b(this.entry.getCurrentEditor(), this)) {
                        dVar.l(this, true);
                    }
                    this.done = true;
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (C3862t.b(this.entry.getCurrentEditor(), this)) {
                if (this.f48556d.civilizedFileSystem) {
                    this.f48556d.l(this, false);
                } else {
                    this.entry.q(true);
                }
            }
        }

        /* renamed from: d, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        /* renamed from: e, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final z f(int index) {
            d dVar = this.f48556d;
            synchronized (dVar) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!C3862t.b(this.entry.getCurrentEditor(), this)) {
                    return o.b();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    C3862t.d(zArr);
                    zArr[index] = true;
                }
                try {
                    return new rc.e(dVar.getFileSystem().b(this.entry.c().get(index)), new a(dVar, this));
                } catch (FileNotFoundException unused) {
                    return o.b();
                }
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0018\u00010\u0017R\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b'\u0010)R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R(\u0010<\u001a\b\u0018\u000107R\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b \u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lrc/d$c;", "", "", "key", "<init>", "(Lrc/d;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "LCc/B;", "k", "(I)LCc/B;", "Loa/F;", "m", "(Ljava/util/List;)V", "LCc/f;", "writer", "s", "(LCc/f;)V", "Lrc/d$d;", "Lrc/d;", "r", "()Lrc/d$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "", "Ljava/io/File;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "o", "(Z)V", "readable", "f", "i", "q", "zombie", "Lrc/d$b;", "Lrc/d$b;", "()Lrc/d$b;", "l", "(Lrc/d$b;)V", "currentEditor", "h", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "J", "()J", "p", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<File> cleanFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<File> dirtyFiles;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b currentEditor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int lockingSourceCount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sequenceNumber;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f48568j;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"rc/d$c$a", "LCc/j;", "Loa/F;", "close", "()V", "", "C", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends j {

            /* renamed from: C, reason: collision with root package name and from kotlin metadata */
            private boolean closed;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ d f48570D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ c f48571E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B b10, d dVar, c cVar) {
                super(b10);
                this.f48570D = dVar;
                this.f48571E = cVar;
            }

            @Override // Cc.j, Cc.B, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.closed) {
                    return;
                }
                this.closed = true;
                d dVar = this.f48570D;
                c cVar = this.f48571E;
                synchronized (dVar) {
                    try {
                        cVar.n(cVar.getLockingSourceCount() - 1);
                        if (cVar.getLockingSourceCount() == 0 && cVar.getZombie()) {
                            dVar.Q(cVar);
                        }
                        C4153F c4153f = C4153F.f46609a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(d dVar, String key) {
            C3862t.g(key, "key");
            this.f48568j = dVar;
            this.key = key;
            this.lengths = new long[dVar.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount = dVar.getValueCount();
            for (int i10 = 0; i10 < valueCount; i10++) {
                sb2.append(i10);
                this.cleanFiles.add(new File(this.f48568j.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(this.f48568j.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final B k(int index) {
            B bA = this.f48568j.getFileSystem().a(this.cleanFiles.get(index));
            if (this.f48568j.civilizedFileSystem) {
                return bA;
            }
            this.lockingSourceCount++;
            return new a(bA, this.f48568j, this);
        }

        public final List<File> a() {
            return this.cleanFiles;
        }

        /* renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        public final List<File> c() {
            return this.dirtyFiles;
        }

        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: f, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: h, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void l(b bVar) {
            this.currentEditor = bVar;
        }

        public final void m(List<String> strings) throws IOException {
            C3862t.g(strings, "strings");
            if (strings.size() != this.f48568j.getValueCount()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void o(boolean z10) {
            this.readable = z10;
        }

        public final void p(long j10) {
            this.sequenceNumber = j10;
        }

        public final void q(boolean z10) {
            this.zombie = z10;
        }

        public final C0682d r() throws IOException {
            d dVar = this.f48568j;
            if (pc.d.f47758h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f48568j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.f48568j.getValueCount();
                for (int i10 = 0; i10 < valueCount; i10++) {
                    arrayList.add(k(i10));
                }
                return new C0682d(this.f48568j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pc.d.m((B) it.next());
                }
                try {
                    this.f48568j.Q(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(Cc.f writer) {
            C3862t.g(writer, "writer");
            for (long j10 : this.lengths) {
                writer.d0(32).v1(j10);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0018\u00010\rR\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrc/d$d;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "LCc/B;", "sources", "", "lengths", "<init>", "(Lrc/d;Ljava/lang/String;JLjava/util/List;[J)V", "Lrc/d$b;", "Lrc/d;", "a", "()Lrc/d$b;", "", "index", "b", "(I)LCc/B;", "Loa/F;", "close", "()V", "B", "Ljava/lang/String;", "C", "J", "D", "Ljava/util/List;", "E", "[J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rc.d$d, reason: collision with other inner class name */
    public final class C0682d implements Closeable {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final long sequenceNumber;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final List<B> sources;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ d f48576F;

        /* JADX WARN: Multi-variable type inference failed */
        public C0682d(d dVar, String key, long j10, List<? extends B> sources, long[] lengths) {
            C3862t.g(key, "key");
            C3862t.g(sources, "sources");
            C3862t.g(lengths, "lengths");
            this.f48576F = dVar;
            this.key = key;
            this.sequenceNumber = j10;
            this.sources = sources;
            this.lengths = lengths;
        }

        public final b a() {
            return this.f48576F.n(this.key, this.sequenceNumber);
        }

        public final B b(int index) {
            return this.sources.get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<B> it = this.sources.iterator();
            while (it.hasNext()) {
                pc.d.m(it.next());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"rc/d$e", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends AbstractC4529a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // sc.AbstractC4529a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                if (!dVar.initialized || dVar.getClosed()) {
                    return -1L;
                }
                try {
                    dVar.X();
                } catch (IOException unused) {
                    dVar.mostRecentTrimFailed = true;
                }
                try {
                    if (dVar.y()) {
                        dVar.N();
                        dVar.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    dVar.mostRecentRebuildFailed = true;
                    dVar.journalWriter = o.c(o.b());
                }
                return -1L;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Loa/F;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements l<IOException, C4153F> {
        f() {
            super(1);
        }

        public final void a(IOException it) {
            C3862t.g(it, "it");
            d dVar = d.this;
            if (!pc.d.f47758h || Thread.holdsLock(dVar)) {
                d.this.hasJournalErrors = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(IOException iOException) {
            a(iOException);
            return C4153F.f46609a;
        }
    }

    public d(InterfaceC5088a fileSystem, File directory, int i10, int i11, long j10, sc.e taskRunner) {
        C3862t.g(fileSystem, "fileSystem");
        C3862t.g(directory, "directory");
        C3862t.g(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i10;
        this.valueCount = i11;
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.i();
        this.cleanupTask = new e(pc.d.f47759i + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = new File(directory, f48521X);
        this.journalFileTmp = new File(directory, f48522Y);
        this.journalFileBackup = new File(directory, f48523Z);
    }

    private final void C() {
        this.fileSystem.f(this.journalFileTmp);
        Iterator<c> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            C3862t.f(next, "i.next()");
            c cVar = next;
            int i10 = 0;
            if (cVar.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += cVar.getLengths()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.f(cVar.a().get(i10));
                    this.fileSystem.f(cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void K() {
        g gVarD = o.d(this.fileSystem.a(this.journalFile));
        try {
            String strY0 = gVarD.Y0();
            String strY02 = gVarD.Y0();
            String strY03 = gVarD.Y0();
            String strY04 = gVarD.Y0();
            String strY05 = gVarD.Y0();
            if (!C3862t.b(f48524a0, strY0) || !C3862t.b(f48525b0, strY02) || !C3862t.b(String.valueOf(this.appVersion), strY03) || !C3862t.b(String.valueOf(this.valueCount), strY04) || strY05.length() > 0) {
                throw new IOException("unexpected journal header: [" + strY0 + ", " + strY02 + ", " + strY04 + ", " + strY05 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    L(gVarD.Y0());
                    i10++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i10 - this.lruEntries.size();
                    if (gVarD.c0()) {
                        this.journalWriter = z();
                    } else {
                        N();
                    }
                    C4153F c4153f = C4153F.f46609a;
                    C5220a.a(gVarD, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void L(String line) throws IOException {
        String strSubstring;
        int iX = n.X(line, ' ', 0, false, 6, null);
        if (iX == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iX + 1;
        int iX2 = n.X(line, ' ', i10, false, 4, null);
        if (iX2 == -1) {
            strSubstring = line.substring(i10);
            C3862t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str = f48530g0;
            if (iX == str.length() && n.G(line, str, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iX2);
            C3862t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = this.lruEntries.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.lruEntries.put(strSubstring, cVar);
        }
        if (iX2 != -1) {
            String str2 = f48528e0;
            if (iX == str2.length() && n.G(line, str2, false, 2, null)) {
                String strSubstring2 = line.substring(iX2 + 1);
                C3862t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listW0 = n.w0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listW0);
                return;
            }
        }
        if (iX2 == -1) {
            String str3 = f48529f0;
            if (iX == str3.length() && n.G(line, str3, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iX2 == -1) {
            String str4 = f48531h0;
            if (iX == str4.length() && n.G(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final boolean W() {
        for (c toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie()) {
                C3862t.f(toEvict, "toEvict");
                Q(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void a0(String key) {
        if (f48527d0.b(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    private final synchronized void k() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ b o(d dVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f48526c0;
        }
        return dVar.n(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    private final Cc.f z() {
        return o.c(new rc.e(this.fileSystem.g(this.journalFile), new f()));
    }

    public final synchronized void N() {
        try {
            Cc.f fVar = this.journalWriter;
            if (fVar != null) {
                fVar.close();
            }
            Cc.f fVarC = o.c(this.fileSystem.b(this.journalFileTmp));
            try {
                fVarC.A0(f48524a0).d0(10);
                fVarC.A0(f48525b0).d0(10);
                fVarC.v1(this.appVersion).d0(10);
                fVarC.v1(this.valueCount).d0(10);
                fVarC.d0(10);
                for (c cVar : this.lruEntries.values()) {
                    if (cVar.getCurrentEditor() != null) {
                        fVarC.A0(f48529f0).d0(32);
                        fVarC.A0(cVar.getKey());
                        fVarC.d0(10);
                    } else {
                        fVarC.A0(f48528e0).d0(32);
                        fVarC.A0(cVar.getKey());
                        cVar.s(fVarC);
                        fVarC.d0(10);
                    }
                }
                C4153F c4153f = C4153F.f46609a;
                C5220a.a(fVarC, null);
                if (this.fileSystem.d(this.journalFile)) {
                    this.fileSystem.e(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.e(this.journalFileTmp, this.journalFile);
                this.fileSystem.f(this.journalFileBackup);
                this.journalWriter = z();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean P(String key) {
        C3862t.g(key, "key");
        x();
        k();
        a0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zQ = Q(cVar);
        if (zQ && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zQ;
    }

    public final boolean Q(c entry) {
        Cc.f fVar;
        C3862t.g(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (fVar = this.journalWriter) != null) {
                fVar.A0(f48529f0);
                fVar.d0(32);
                fVar.A0(entry.getKey());
                fVar.d0(10);
                fVar.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.q(true);
                return true;
            }
        }
        b currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.c();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.f(entry.a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.redundantOpCount++;
        Cc.f fVar2 = this.journalWriter;
        if (fVar2 != null) {
            fVar2.A0(f48530g0);
            fVar2.d0(32);
            fVar2.A0(entry.getKey());
            fVar2.d0(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (y()) {
            sc.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void X() {
        while (this.size > this.maxSize) {
            if (!W()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection<c> collectionValues = this.lruEntries.values();
                C3862t.f(collectionValues, "lruEntries.values");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.getCurrentEditor() != null && (currentEditor = cVar.getCurrentEditor()) != null) {
                        currentEditor.c();
                    }
                }
                X();
                Cc.f fVar = this.journalWriter;
                C3862t.d(fVar);
                fVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            k();
            X();
            Cc.f fVar = this.journalWriter;
            C3862t.d(fVar);
            fVar.flush();
        }
    }

    public final synchronized void l(b editor, boolean success) {
        C3862t.g(editor, "editor");
        c entry = editor.getEntry();
        if (!C3862t.b(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.getReadable()) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written = editor.getWritten();
                C3862t.d(written);
                if (!written[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.fileSystem.d(entry.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.valueCount;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = entry.c().get(i13);
            if (!success || entry.getZombie()) {
                this.fileSystem.f(file);
            } else if (this.fileSystem.d(file)) {
                File file2 = entry.a().get(i13);
                this.fileSystem.e(file, file2);
                long j10 = entry.getLengths()[i13];
                long jH = this.fileSystem.h(file2);
                entry.getLengths()[i13] = jH;
                this.size = (this.size - j10) + jH;
            }
        }
        entry.l(null);
        if (entry.getZombie()) {
            Q(entry);
            return;
        }
        this.redundantOpCount++;
        Cc.f fVar = this.journalWriter;
        C3862t.d(fVar);
        if (entry.getReadable() || success) {
            entry.o(true);
            fVar.A0(f48528e0).d0(32);
            fVar.A0(entry.getKey());
            entry.s(fVar);
            fVar.d0(10);
            if (success) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry.p(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            fVar.A0(f48530g0).d0(32);
            fVar.A0(entry.getKey());
            fVar.d0(10);
        }
        fVar.flush();
        if (this.size > this.maxSize || y()) {
            sc.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void m() {
        close();
        this.fileSystem.c(this.directory);
    }

    public final synchronized b n(String key, long expectedSequenceNumber) {
        C3862t.g(key, "key");
        x();
        k();
        a0(key);
        c cVar = this.lruEntries.get(key);
        if (expectedSequenceNumber != f48526c0 && (cVar == null || cVar.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            Cc.f fVar = this.journalWriter;
            C3862t.d(fVar);
            fVar.A0(f48529f0).d0(32).A0(key).d0(10);
            fVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.lruEntries.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        sc.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized C0682d p(String key) {
        C3862t.g(key, "key");
        x();
        k();
        a0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return null;
        }
        C0682d c0682dR = cVar.r();
        if (c0682dR == null) {
            return null;
        }
        this.redundantOpCount++;
        Cc.f fVar = this.journalWriter;
        C3862t.d(fVar);
        fVar.A0(f48531h0).d0(32).A0(key).d0(10);
        if (y()) {
            sc.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return c0682dR;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: s, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    /* renamed from: t, reason: from getter */
    public final InterfaceC5088a getFileSystem() {
        return this.fileSystem;
    }

    /* renamed from: u, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void x() {
        try {
            if (pc.d.f47758h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.d(this.journalFileBackup)) {
                if (this.fileSystem.d(this.journalFile)) {
                    this.fileSystem.f(this.journalFileBackup);
                } else {
                    this.fileSystem.e(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = pc.d.F(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.d(this.journalFile)) {
                try {
                    K();
                    C();
                    this.initialized = true;
                    return;
                } catch (IOException e10) {
                    yc.j.INSTANCE.g().k("DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        m();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            N();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
