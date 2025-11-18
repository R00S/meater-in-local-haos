package okhttp3.internal.cache;

import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
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
import java.util.NoSuchElementException;
import kotlin.C10775u;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.p429io.C10556a;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p453io.FileSystem;
import okhttp3.internal.platform.Platform;
import p353j.AbstractC9713l;
import p353j.C9718q;
import p353j.InterfaceC9696b0;
import p353j.InterfaceC9700d0;
import p353j.InterfaceC9705g;
import p353j.InterfaceC9709h;

/* compiled from: DiskLruCache.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b*\u0001L\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0004mnopB9\b\u0000\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010Y\u001a\u000207\u0012\u0006\u0010`\u001a\u00020\u001b\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0005J\u001e\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020\u00032\n\u0010\"\u001a\u00060\u001dR\u00020\u00002\u0006\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020\u000e2\n\u0010*\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010\u0005J\r\u0010/\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u0010J\u000f\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u0010\u0005J\r\u00101\u001a\u00020\u0003¢\u0006\u0004\b1\u0010\u0005J\r\u00102\u001a\u00020\u0003¢\u0006\u0004\b2\u0010\u0005J\r\u00103\u001a\u00020\u0003¢\u0006\u0004\b3\u0010\u0005J\u0017\u00105\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u000004¢\u0006\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R,\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060)R\u00020\u00000?8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010DR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0019\u0010H\u001a\u00020G8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010IR\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010FR\u0016\u0010Q\u001a\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010IR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010FR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010FR\"\u0010T\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010F\u001a\u0004\bU\u0010\u0010\"\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010DR\u001c\u0010Y\u001a\u0002078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R*\u0010`\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010D\u001a\u0004\ba\u0010!\"\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010FR\u0016\u0010e\u001a\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010IR\u0016\u0010f\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u00109R\u0018\u0010g\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006q"}, m32267d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkotlin/u;", "readJournal", "()V", "Lj/g;", "newJournalWriter", "()Lj/g;", HttpUrl.FRAGMENT_ENCODE_SET, "line", "readJournalLine", "(Ljava/lang/String;)V", "processJournal", HttpUrl.FRAGMENT_ENCODE_SET, "journalRebuildRequired", "()Z", "checkNotClosed", "removeOldestEntry", RoomNotification.KEY, "validateKey", "initialize", "rebuildJournal$okhttp", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", HttpUrl.FRAGMENT_ENCODE_SET, "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "size", "()J", "editor", RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", "delete", "evictAll", HttpUrl.FRAGMENT_ENCODE_SET, "snapshots", "()Ljava/util/Iterator;", HttpUrl.FRAGMENT_ENCODE_SET, "appVersion", "I", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "J", "initialized", "Z", "Ljava/io/File;", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "journalFile", "mostRecentRebuildFailed", "journalFileTmp", "hasJournalErrors", "mostRecentTrimFailed", "closed", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "nextSequenceNumber", "valueCount", "getValueCount$okhttp", "()I", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "value", "maxSize", "getMaxSize", "setMaxSize", "(J)V", "civilizedFileSystem", "journalFileBackup", "redundantOpCount", "journalWriter", "Lj/g;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private InterfaceC9705g journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: DiskLruCache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u001a\u001a\u00060\u0018R\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u00060\u0018R\u00020\u00198\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m32267d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/u;", "detach$okhttp", "()V", "detach", HttpUrl.FRAGMENT_ENCODE_SET, "index", "Lj/d0;", "newSource", "(I)Lj/d0;", "Lj/b0;", "newSink", "(I)Lj/b0;", "commit", "abort", HttpUrl.FRAGMENT_ENCODE_SET, "done", "Z", HttpUrl.FRAGMENT_ENCODE_SET, "written", "[Z", "getWritten$okhttp", "()[Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            C9801m.m32346f(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        public final void abort() throws IOException {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (C9801m.m32341a(this.entry.getCurrentEditor(), this)) {
                    this.this$0.completeEdit$okhttp(this, false);
                }
                this.done = true;
                C10775u c10775u = C10775u.f41439a;
            }
        }

        public final void commit() throws IOException {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (C9801m.m32341a(this.entry.getCurrentEditor(), this)) {
                    this.this$0.completeEdit$okhttp(this, true);
                }
                this.done = true;
                C10775u c10775u = C10775u.f41439a;
            }
        }

        public final void detach$okhttp() throws IOException {
            if (C9801m.m32341a(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        /* renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        /* renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final InterfaceC9696b0 newSink(int index) {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!C9801m.m32341a(this.entry.getCurrentEditor(), this)) {
                    return C9718q.m32118b();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    C9801m.m32343c(zArr);
                    zArr[index] = true;
                }
                try {
                    return new FaultHidingSink(this.this$0.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(this, index));
                } catch (FileNotFoundException unused) {
                    return C9718q.m32118b();
                }
            }
        }

        public final InterfaceC9700d0 newSource(int index) {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                InterfaceC9700d0 interfaceC9700d0Source = null;
                if (!this.entry.getReadable() || (!C9801m.m32341a(this.entry.getCurrentEditor(), this)) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    interfaceC9700d0Source = this.this$0.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                } catch (FileNotFoundException unused) {
                }
                return interfaceC9700d0Source;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0016\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u00109\u001a\u00020\u0003¢\u0006\u0004\bJ\u0010KJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u001a\u001a\b\u0018\u00010\u0016R\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\b\u0018\u00010(R\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001c\u00109\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010=\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010D\u001a\u00020C8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010H\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010%\u001a\u0004\bI\u0010'¨\u0006L"}, m32267d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "strings", HttpUrl.FRAGMENT_ENCODE_SET, "invalidLengths", "(Ljava/util/List;)Ljava/lang/Void;", HttpUrl.FRAGMENT_ENCODE_SET, "index", "Lj/d0;", "newSource", "(I)Lj/d0;", "Lkotlin/u;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lj/g;", "writer", "writeLengths$okhttp", "(Lj/g;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", HttpUrl.FRAGMENT_ENCODE_SET, "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/File;", "dirtyFiles", "Ljava/util/List;", "getDirtyFiles$okhttp", "()Ljava/util/List;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", HttpUrl.FRAGMENT_ENCODE_SET, "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", RoomNotification.KEY, "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", HttpUrl.FRAGMENT_ENCODE_SET, "lengths", "[J", "getLengths$okhttp", "()[J", "cleanFiles", "getCleanFiles$okhttp", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            C9801m.m32346f(str, RoomNotification.KEY);
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i2 = 0; i2 < valueCount; i2++) {
                sb.append(i2);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final InterfaceC9700d0 newSource(int index) throws FileNotFoundException {
            final InterfaceC9700d0 interfaceC9700d0Source = this.this$0.getFileSystem().source(this.cleanFiles.get(index));
            if (this.this$0.civilizedFileSystem) {
                return interfaceC9700d0Source;
            }
            this.lockingSourceCount++;
            return new AbstractC9713l(interfaceC9700d0Source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // p353j.AbstractC9713l, p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    synchronized (this.this$0.this$0) {
                        this.this$0.setLockingSourceCount$okhttp(r1.getLockingSourceCount() - 1);
                        if (this.this$0.getLockingSourceCount() == 0 && this.this$0.getZombie()) {
                            DiskLruCache.Entry entry = this.this$0;
                            entry.this$0.removeEntry$okhttp(entry);
                        }
                        C10775u c10775u = C10775u.f41439a;
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        /* renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        /* renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) throws IOException {
            C9801m.m32346f(strings, "strings");
            if (strings.size() != this.this$0.getValueCount()) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.lengths[i2] = Long.parseLong(strings.get(i2));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i2) {
            this.lockingSourceCount = i2;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j2) {
            this.sequenceNumber = j2;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                C9801m.m32345e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new AssertionError(sb.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.this$0.getValueCount();
                for (int i2 = 0; i2 < valueCount; i2++) {
                    arrayList.add(newSource(i2));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((InterfaceC9700d0) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(InterfaceC9705g writer) throws IOException {
            C9801m.m32346f(writer, "writer");
            for (long j2 : this.lengths) {
                writer.writeByte(32).mo32043i1(j2);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m32267d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", HttpUrl.FRAGMENT_ENCODE_SET, RoomNotification.KEY, "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", HttpUrl.FRAGMENT_ENCODE_SET, "index", "Lj/d0;", "getSource", "(I)Lj/d0;", HttpUrl.FRAGMENT_ENCODE_SET, "getLength", "(I)J", "Lkotlin/u;", "close", "()V", "sequenceNumber", "J", HttpUrl.FRAGMENT_ENCODE_SET, "lengths", "[J", "Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "sources", "Ljava/util/List;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<InterfaceC9700d0> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j2, List<? extends InterfaceC9700d0> list, long[] jArr) {
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(list, "sources");
            C9801m.m32346f(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j2;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<InterfaceC9700d0> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int index) {
            return this.lengths[index];
        }

        public final InterfaceC9700d0 getSource(int index) {
            return this.sources.get(index);
        }

        /* renamed from: key, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR,\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012 \u0010*\b\u0018\u00010\u000fR\u00020\u00030\u000fR\u00020\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m32267d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", "()Z", "next", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lkotlin/u;", "remove", "()V", "removeSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "nextSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "delegate", "Ljava/util/Iterator;", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1 */
    public static final class C111031 implements Iterator<Snapshot>, KMappedMarker {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        C111031() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            C9801m.m32345e(it, "ArrayList(lruEntries.values).iterator()");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            synchronized (DiskLruCache.this) {
                if (DiskLruCache.this.getClosed()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                C10775u c10775u = C10775u.f41439a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.getKey());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            C9801m.m32343c(snapshot);
            return snapshot;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i2, int i3, long j2, TaskRunner taskRunner) {
        C9801m.m32346f(fileSystem, "fileSystem");
        C9801m.m32346f(file, "directory");
        C9801m.m32346f(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i2;
        this.valueCount = i3;
        this.maxSize = j2;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                synchronized (this.this$0) {
                    if (!this.this$0.initialized || this.this$0.getClosed()) {
                        return -1L;
                    }
                    try {
                        this.this$0.trimToSize();
                    } catch (IOException unused) {
                        this.this$0.mostRecentTrimFailed = true;
                    }
                    try {
                        if (this.this$0.journalRebuildRequired()) {
                            this.this$0.rebuildJournal$okhttp();
                            this.this$0.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        this.this$0.mostRecentRebuildFailed = true;
                        this.this$0.journalWriter = C9718q.m32119c(C9718q.m32118b());
                    }
                    return -1L;
                }
            }
        };
        if (!(j2 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i3 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i2 = this.redundantOpCount;
        return i2 >= 2000 && i2 >= this.lruEntries.size();
    }

    private final InterfaceC9705g newJournalWriter() throws FileNotFoundException {
        return C9718q.m32119c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            C9801m.m32345e(next, "i.next()");
            Entry entry = next;
            int i2 = 0;
            if (entry.getCurrentEditor() == null) {
                int i3 = this.valueCount;
                while (i2 < i3) {
                    this.size += entry.getLengths()[i2];
                    i2++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i4 = this.valueCount;
                while (i2 < i4) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        InterfaceC9709h interfaceC9709hM32120d = C9718q.m32120d(this.fileSystem.source(this.journalFile));
        try {
            String strMo32011L0 = interfaceC9709hM32120d.mo32011L0();
            String strMo32011L02 = interfaceC9709hM32120d.mo32011L0();
            String strMo32011L03 = interfaceC9709hM32120d.mo32011L0();
            String strMo32011L04 = interfaceC9709hM32120d.mo32011L0();
            String strMo32011L05 = interfaceC9709hM32120d.mo32011L0();
            if (!(!C9801m.m32341a(MAGIC, strMo32011L0)) && !(!C9801m.m32341a(VERSION_1, strMo32011L02)) && !(!C9801m.m32341a(String.valueOf(this.appVersion), strMo32011L03)) && !(!C9801m.m32341a(String.valueOf(this.valueCount), strMo32011L04))) {
                int i2 = 0;
                if (!(strMo32011L05.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(interfaceC9709hM32120d.mo32011L0());
                            i2++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i2 - this.lruEntries.size();
                            if (interfaceC9709hM32120d.mo32019R()) {
                                this.journalWriter = newJournalWriter();
                            } else {
                                rebuildJournal$okhttp();
                            }
                            C10775u c10775u = C10775u.f41439a;
                            C10556a.m37638a(interfaceC9709hM32120d, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strMo32011L0 + ", " + strMo32011L02 + ", " + strMo32011L04 + ", " + strMo32011L05 + ']');
        } finally {
        }
    }

    private final void readJournalLine(String line) throws IOException {
        String strSubstring;
        int iM37556V = C10547v.m37556V(line, ' ', 0, false, 6, null);
        if (iM37556V == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i2 = iM37556V + 1;
        int iM37556V2 = C10547v.m37556V(line, ' ', i2, false, 4, null);
        if (iM37556V2 == -1) {
            if (line == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = line.substring(i2);
            C9801m.m32345e(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str = REMOVE;
            if (iM37556V == str.length() && C10546u.m37511E(line, str, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            if (line == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = line.substring(i2, iM37556V2);
            C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iM37556V2 != -1) {
            String str2 = CLEAN;
            if (iM37556V == str2.length() && C10546u.m37511E(line, str2, false, 2, null)) {
                int i3 = iM37556V2 + 1;
                if (line == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring2 = line.substring(i3);
                C9801m.m32345e(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List<String> listM37581u0 = C10547v.m37581u0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listM37581u0);
                return;
            }
        }
        if (iM37556V2 == -1) {
            String str3 = DIRTY;
            if (iM37556V == str3.length() && C10546u.m37511E(line, str3, false, 2, null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iM37556V2 == -1) {
            String str4 = READ;
            if (iM37556V == str4.length() && C10546u.m37511E(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final boolean removeOldestEntry() throws IOException {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie()) {
                C9801m.m32345e(entry, "toEvict");
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String key) {
        if (LEGAL_KEY_PATTERN.m37438b(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor;
        if (this.initialized && !this.closed) {
            Collection<Entry> collectionValues = this.lruEntries.values();
            C9801m.m32345e(collectionValues, "lruEntries.values");
            Object[] array = collectionValues.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (Entry entry : (Entry[]) array) {
                if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                    currentEditor.detach$okhttp();
                }
            }
            trimToSize();
            InterfaceC9705g interfaceC9705g = this.journalWriter;
            C9801m.m32343c(interfaceC9705g);
            interfaceC9705g.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean success) throws IOException {
        C9801m.m32346f(editor, "editor");
        Entry entry = editor.getEntry();
        if (!C9801m.m32341a(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (success && !entry.getReadable()) {
            int i2 = this.valueCount;
            for (int i3 = 0; i3 < i2; i3++) {
                boolean[] written = editor.getWritten();
                C9801m.m32343c(written);
                if (!written[i3]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                }
                if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i3))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i4 = this.valueCount;
        for (int i5 = 0; i5 < i4; i5++) {
            File file = entry.getDirtyFiles$okhttp().get(i5);
            if (!success || entry.getZombie()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry.getCleanFiles$okhttp().get(i5);
                this.fileSystem.rename(file, file2);
                long j2 = entry.getLengths()[i5];
                long size = this.fileSystem.size(file2);
                entry.getLengths()[i5] = size;
                this.size = (this.size - j2) + size;
            }
        }
        entry.setCurrentEditor$okhttp(null);
        if (entry.getZombie()) {
            removeEntry$okhttp(entry);
            return;
        }
        this.redundantOpCount++;
        InterfaceC9705g interfaceC9705g = this.journalWriter;
        C9801m.m32343c(interfaceC9705g);
        if (entry.getReadable() || success) {
            entry.setReadable$okhttp(true);
            interfaceC9705g.mo32055r0(CLEAN).writeByte(32);
            interfaceC9705g.mo32055r0(entry.getKey());
            entry.writeLengths$okhttp(interfaceC9705g);
            interfaceC9705g.writeByte(10);
            if (success) {
                long j3 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j3;
                entry.setSequenceNumber$okhttp(j3);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            interfaceC9705g.mo32055r0(REMOVE).writeByte(32);
            interfaceC9705g.mo32055r0(entry.getKey());
            interfaceC9705g.writeByte(10);
        }
        interfaceC9705g.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized Editor edit(String key, long expectedSequenceNumber) throws IOException {
        C9801m.m32346f(key, RoomNotification.KEY);
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC9705g interfaceC9705g = this.journalWriter;
            C9801m.m32343c(interfaceC9705g);
            interfaceC9705g.mo32055r0(DIRTY).writeByte(32).mo32055r0(key).writeByte(10);
            interfaceC9705g.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> collectionValues = this.lruEntries.values();
        C9801m.m32345e(collectionValues, "lruEntries.values");
        Object[] array = collectionValues.toArray(new Entry[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (Entry entry : (Entry[]) array) {
            C9801m.m32345e(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            InterfaceC9705g interfaceC9705g = this.journalWriter;
            C9801m.m32343c(interfaceC9705g);
            interfaceC9705g.flush();
        }
    }

    public final synchronized Snapshot get(String key) throws IOException {
        C9801m.m32346f(key, RoomNotification.KEY);
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        C9801m.m32345e(entry, "lruEntries[key] ?: return null");
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC9705g interfaceC9705g = this.journalWriter;
        C9801m.m32343c(interfaceC9705g);
        interfaceC9705g.mo32055r0(READ).writeByte(32).mo32055r0(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    /* renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    /* renamed from: getFileSystem$okhttp, reason: from getter */
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            C9801m.m32345e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e2) {
                Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                try {
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        InterfaceC9705g interfaceC9705g = this.journalWriter;
        if (interfaceC9705g != null) {
            interfaceC9705g.close();
        }
        InterfaceC9705g interfaceC9705gM32119c = C9718q.m32119c(this.fileSystem.sink(this.journalFileTmp));
        try {
            interfaceC9705gM32119c.mo32055r0(MAGIC).writeByte(10);
            interfaceC9705gM32119c.mo32055r0(VERSION_1).writeByte(10);
            interfaceC9705gM32119c.mo32043i1(this.appVersion).writeByte(10);
            interfaceC9705gM32119c.mo32043i1(this.valueCount).writeByte(10);
            interfaceC9705gM32119c.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor() != null) {
                    interfaceC9705gM32119c.mo32055r0(DIRTY).writeByte(32);
                    interfaceC9705gM32119c.mo32055r0(entry.getKey());
                    interfaceC9705gM32119c.writeByte(10);
                } else {
                    interfaceC9705gM32119c.mo32055r0(CLEAN).writeByte(32);
                    interfaceC9705gM32119c.mo32055r0(entry.getKey());
                    entry.writeLengths$okhttp(interfaceC9705gM32119c);
                    interfaceC9705gM32119c.writeByte(10);
                }
            }
            C10775u c10775u = C10775u.f41439a;
            C10556a.m37638a(interfaceC9705gM32119c, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean remove(String key) throws IOException {
        C9801m.m32346f(key, RoomNotification.KEY);
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        C9801m.m32345e(entry, "lruEntries[key] ?: return false");
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        InterfaceC9705g interfaceC9705g;
        C9801m.m32346f(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (interfaceC9705g = this.journalWriter) != null) {
                interfaceC9705g.mo32055r0(DIRTY);
                interfaceC9705g.writeByte(32);
                interfaceC9705g.mo32055r0(entry.getKey());
                interfaceC9705g.writeByte(10);
                interfaceC9705g.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        int i2 = this.valueCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i3));
            this.size -= entry.getLengths()[i3];
            entry.getLengths()[i3] = 0;
        }
        this.redundantOpCount++;
        InterfaceC9705g interfaceC9705g2 = this.journalWriter;
        if (interfaceC9705g2 != null) {
            interfaceC9705g2.mo32055r0(REMOVE);
            interfaceC9705g2.writeByte(32);
            interfaceC9705g2.mo32055r0(entry.getKey());
            interfaceC9705g2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j2) {
        this.maxSize = j2;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new C111031();
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
