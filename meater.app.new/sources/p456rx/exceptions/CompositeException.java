package p456rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: f */
    private final List<Throwable> f42130f;

    /* renamed from: g */
    private final String f42131g;

    /* renamed from: h */
    private Throwable f42132h;

    /* renamed from: rx.exceptions.CompositeException$a */
    static final class C11235a extends RuntimeException {
        C11235a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: rx.exceptions.CompositeException$b */
    static abstract class AbstractC11236b {
        AbstractC11236b() {
        }

        /* renamed from: a */
        abstract Object mo40130a();

        /* renamed from: b */
        abstract void mo40131b(Object obj);
    }

    /* renamed from: rx.exceptions.CompositeException$c */
    static final class C11237c extends AbstractC11236b {

        /* renamed from: a */
        private final PrintStream f42133a;

        C11237c(PrintStream printStream) {
            this.f42133a = printStream;
        }

        @Override // p456rx.exceptions.CompositeException.AbstractC11236b
        /* renamed from: a */
        Object mo40130a() {
            return this.f42133a;
        }

        @Override // p456rx.exceptions.CompositeException.AbstractC11236b
        /* renamed from: b */
        void mo40131b(Object obj) {
            this.f42133a.println(obj);
        }
    }

    /* renamed from: rx.exceptions.CompositeException$d */
    static final class C11238d extends AbstractC11236b {

        /* renamed from: a */
        private final PrintWriter f42134a;

        C11238d(PrintWriter printWriter) {
            this.f42134a = printWriter;
        }

        @Override // p456rx.exceptions.CompositeException.AbstractC11236b
        /* renamed from: a */
        Object mo40130a() {
            return this.f42134a;
        }

        @Override // p456rx.exceptions.CompositeException.AbstractC11236b
        /* renamed from: b */
        void mo40131b(Object obj) {
            this.f42134a.println(obj);
        }
    }

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m40129b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f42130f = listUnmodifiableList;
        this.f42131g = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    /* renamed from: a */
    private void m40125a(StringBuilder sb, Throwable th, String str) {
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
            m40125a(sb, th.getCause(), HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    /* renamed from: c */
    private List<Throwable> m40126c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause.getCause();
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private Throwable m40127d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause.getCause();
        }
        return cause;
    }

    /* renamed from: e */
    private void m40128e(AbstractC11236b abstractC11236b) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.f42130f) {
            sb.append("  ComposedException ");
            sb.append(i2);
            sb.append(" :\n");
            m40125a(sb, th, "\t");
            i2++;
        }
        synchronized (abstractC11236b.mo40130a()) {
            abstractC11236b.mo40131b(sb.toString());
        }
    }

    /* renamed from: b */
    public List<Throwable> m40129b() {
        return this.f42130f;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f42132h == null) {
            C11235a c11235a = new C11235a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f42130f.iterator();
            Throwable thM40127d = c11235a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : m40126c(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        thM40127d.initCause(next);
                    } catch (Throwable unused) {
                    }
                    thM40127d = m40127d(thM40127d);
                }
            }
            this.f42132h = c11235a;
        }
        return this.f42132h;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f42131g;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m40128e(new C11237c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m40128e(new C11238d(printWriter));
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (thArr != null) {
            for (Throwable th : thArr) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m40129b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f42130f = listUnmodifiableList;
        this.f42131g = listUnmodifiableList.size() + " exceptions occurred. ";
    }
}
