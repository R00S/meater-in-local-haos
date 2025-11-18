package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.InterfaceC5423f;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: f */
    private static final StackTraceElement[] f13231f = new StackTraceElement[0];

    /* renamed from: g */
    private final List<Throwable> f13232g;

    /* renamed from: h */
    private InterfaceC5423f f13233h;

    /* renamed from: i */
    private EnumC5365a f13234i;

    /* renamed from: j */
    private Class<?> f13235j;

    /* renamed from: k */
    private String f13236k;

    /* renamed from: l */
    private Exception f13237l;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    private void m10159a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).m10164e().iterator();
        while (it.hasNext()) {
            m10159a(it.next(), list);
        }
    }

    /* renamed from: b */
    private static void m10160b(List<Throwable> list, Appendable appendable) {
        try {
            m10161c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    private static void m10161c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).m10163h(appendable);
            } else {
                m10162d(th, appendable);
            }
            i2 = i3;
        }
    }

    /* renamed from: d */
    private static void m10162d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m10163h(Appendable appendable) throws IOException {
        m10162d(this, appendable);
        m10160b(m10164e(), new C5370a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> m10164e() {
        return this.f13232g;
    }

    /* renamed from: f */
    public List<Throwable> m10165f() {
        ArrayList arrayList = new ArrayList();
        m10159a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m10166g(String str) {
        List<Throwable> listM10165f = m10165f();
        int size = listM10165f.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), listM10165f.get(i2));
            i2 = i3;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f13236k);
        Class<?> cls = this.f13235j;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb.append(cls != null ? ", " + this.f13235j : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(this.f13234i != null ? ", " + this.f13234i : HttpUrl.FRAGMENT_ENCODE_SET);
        if (this.f13233h != null) {
            str = ", " + this.f13233h;
        }
        sb.append(str);
        List<Throwable> listM10165f = m10165f();
        if (listM10165f.isEmpty()) {
            return sb.toString();
        }
        if (listM10165f.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM10165f.size());
            sb.append(" causes:");
        }
        for (Throwable th : listM10165f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: i */
    void m10167i(InterfaceC5423f interfaceC5423f, EnumC5365a enumC5365a) {
        m10168j(interfaceC5423f, enumC5365a, null);
    }

    /* renamed from: j */
    void m10168j(InterfaceC5423f interfaceC5423f, EnumC5365a enumC5365a, Class<?> cls) {
        this.f13233h = interfaceC5423f;
        this.f13234i = enumC5365a;
        this.f13235j = cls;
    }

    /* renamed from: k */
    public void m10169k(Exception exc) {
        this.f13237l = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m10163h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f13236k = str;
        setStackTrace(f13231f);
        this.f13232g = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m10163h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C5370a implements Appendable {

        /* renamed from: f */
        private final Appendable f13238f;

        /* renamed from: g */
        private boolean f13239g = true;

        C5370a(Appendable appendable) {
            this.f13238f = appendable;
        }

        /* renamed from: a */
        private CharSequence m10170a(CharSequence charSequence) {
            return charSequence == null ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f13239g) {
                this.f13239g = false;
                this.f13238f.append("  ");
            }
            this.f13239g = c2 == '\n';
            this.f13238f.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence charSequenceM10170a = m10170a(charSequence);
            return append(charSequenceM10170a, 0, charSequenceM10170a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            CharSequence charSequenceM10170a = m10170a(charSequence);
            boolean z = false;
            if (this.f13239g) {
                this.f13239g = false;
                this.f13238f.append("  ");
            }
            if (charSequenceM10170a.length() > 0 && charSequenceM10170a.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f13239g = z;
            this.f13238f.append(charSequenceM10170a, i2, i3);
            return this;
        }
    }
}
