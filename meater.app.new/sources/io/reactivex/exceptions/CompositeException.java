package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: f */
    private final List<Throwable> f35729f;

    /* renamed from: g */
    private final String f35730g;

    /* renamed from: h */
    private Throwable f35731h;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    static final class C9236a extends RuntimeException {
        C9236a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    static abstract class AbstractC9237b {
        AbstractC9237b() {
        }

        /* renamed from: a */
        abstract void mo29999a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    static final class C9238c extends AbstractC9237b {

        /* renamed from: a */
        private final PrintStream f35732a;

        C9238c(PrintStream printStream) {
            this.f35732a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC9237b
        /* renamed from: a */
        void mo29999a(Object obj) {
            this.f35732a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    static final class C9239d extends AbstractC9237b {

        /* renamed from: a */
        private final PrintWriter f35733a;

        C9239d(PrintWriter printWriter) {
            this.f35733a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC9237b
        /* renamed from: a */
        void mo29999a(Object obj) {
            this.f35733a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    private void m29994a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m29994a(sb, th.getCause(), HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    /* renamed from: c */
    private List<Throwable> m29995c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m29996e(AbstractC9237b abstractC9237b) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.f35729f) {
            sb.append("  ComposedException ");
            sb.append(i2);
            sb.append(" :\n");
            m29994a(sb, th, "\t");
            i2++;
        }
        abstractC9237b.mo29999a(sb.toString());
    }

    /* renamed from: b */
    public List<Throwable> m29997b() {
        return this.f35729f;
    }

    /* renamed from: d */
    Throwable m29998d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f35731h == null) {
            C9236a c9236a = new C9236a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f35729f.iterator();
            Throwable thM29998d = c9236a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : m29995c(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        thM29998d.initCause(next);
                    } catch (Throwable unused) {
                    }
                    thM29998d = m29998d(thM29998d);
                }
            }
            this.f35731h = c9236a;
        }
        return this.f35731h;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f35730g;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m29996e(new C9238c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m29996e(new C9239d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m29997b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f35729f = listUnmodifiableList;
            this.f35730g = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
