package io.sentry;

import io.sentry.hints.InterfaceC9456f;
import io.sentry.hints.InterfaceC9459i;
import io.sentry.hints.InterfaceC9461k;
import io.sentry.hints.InterfaceC9466p;
import io.sentry.util.C9642m;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: DirectoryProcessor.java */
/* renamed from: io.sentry.e1 */
/* loaded from: classes2.dex */
abstract class AbstractC9425e1 {

    /* renamed from: a */
    private final InterfaceC9670w1 f36289a;

    /* renamed from: b */
    private final long f36290b;

    /* compiled from: DirectoryProcessor.java */
    /* renamed from: io.sentry.e1$a */
    private static final class a implements InterfaceC9456f, InterfaceC9461k, InterfaceC9466p, InterfaceC9459i {

        /* renamed from: a */
        boolean f36291a = false;

        /* renamed from: b */
        boolean f36292b = false;

        /* renamed from: c */
        private final CountDownLatch f36293c = new CountDownLatch(1);

        /* renamed from: d */
        private final long f36294d;

        /* renamed from: e */
        private final InterfaceC9670w1 f36295e;

        public a(long j2, InterfaceC9670w1 interfaceC9670w1) {
            this.f36294d = j2;
            this.f36295e = interfaceC9670w1;
        }

        @Override // io.sentry.hints.InterfaceC9461k
        /* renamed from: b */
        public boolean mo30474b() {
            return this.f36291a;
        }

        @Override // io.sentry.hints.InterfaceC9466p
        /* renamed from: c */
        public void mo30475c(boolean z) {
            this.f36292b = z;
            this.f36293c.countDown();
        }

        @Override // io.sentry.hints.InterfaceC9461k
        /* renamed from: d */
        public void mo30476d(boolean z) {
            this.f36291a = z;
        }

        @Override // io.sentry.hints.InterfaceC9459i
        /* renamed from: e */
        public boolean mo30477e() {
            try {
                return this.f36293c.await(this.f36294d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                this.f36295e.mo30213b(EnumC9587s4.ERROR, "Exception while awaiting on lock.", e2);
                return false;
            }
        }

        @Override // io.sentry.hints.InterfaceC9466p
        /* renamed from: f */
        public boolean mo30478f() {
            return this.f36292b;
        }
    }

    AbstractC9425e1(InterfaceC9670w1 interfaceC9670w1, long j2) {
        this.f36289a = interfaceC9670w1;
        this.f36290b = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m30758d(File file, String str) {
        return mo30757b(str);
    }

    /* renamed from: b */
    protected abstract boolean mo30757b(String str);

    /* renamed from: e */
    public void mo30759e(File file) {
        try {
            InterfaceC9670w1 interfaceC9670w1 = this.f36289a;
            EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
            interfaceC9670w1.mo30214c(enumC9587s4, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f36289a.mo30214c(EnumC9587s4.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.f36289a.mo30214c(EnumC9587s4.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                this.f36289a.mo30214c(EnumC9587s4.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f36144a.m30758d(file2, str);
                }
            });
            InterfaceC9670w1 interfaceC9670w12 = this.f36289a;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0);
            objArr[1] = file.getAbsolutePath();
            interfaceC9670w12.mo30214c(enumC9587s4, "Processing %d items from cache dir %s", objArr);
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    this.f36289a.mo30214c(EnumC9587s4.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                    mo30760f(file2, C9642m.m31778a(new a(this.f36290b, this.f36289a)));
                } else {
                    this.f36289a.mo30214c(EnumC9587s4.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            this.f36289a.mo30212a(EnumC9587s4.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    /* renamed from: f */
    protected abstract void mo30760f(File file, C9517n1 c9517n1);
}
