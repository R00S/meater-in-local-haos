package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m6.EnumC3966a;
import m6.InterfaceC3970e;

/* loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* renamed from: H, reason: collision with root package name */
    private static final StackTraceElement[] f33060H = new StackTraceElement[0];

    /* renamed from: B, reason: collision with root package name */
    private final List<Throwable> f33061B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC3970e f33062C;

    /* renamed from: D, reason: collision with root package name */
    private EnumC3966a f33063D;

    /* renamed from: E, reason: collision with root package name */
    private Class<?> f33064E;

    /* renamed from: F, reason: collision with root package name */
    private String f33065F;

    /* renamed from: G, reason: collision with root package name */
    private Exception f33066G;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) throws IOException {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f33061B;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void g(String str) {
        List<Throwable> listF = f();
        int size = listF.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), listF.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f33065F);
        sb2.append(this.f33064E != null ? ", " + this.f33064E : "");
        sb2.append(this.f33063D != null ? ", " + this.f33063D : "");
        sb2.append(this.f33062C != null ? ", " + this.f33062C : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb2.toString();
        }
        if (listF.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listF.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : listF) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void i(InterfaceC3970e interfaceC3970e, EnumC3966a enumC3966a) {
        j(interfaceC3970e, enumC3966a, null);
    }

    void j(InterfaceC3970e interfaceC3970e, EnumC3966a enumC3966a, Class<?> cls) {
        this.f33062C = interfaceC3970e;
        this.f33063D = enumC3966a;
        this.f33064E = cls;
    }

    public void k(Exception exc) {
        this.f33066G = exc;
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
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f33065F = str;
        setStackTrace(f33060H);
        this.f33061B = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: B, reason: collision with root package name */
        private final Appendable f33067B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f33068C = true;

        a(Appendable appendable) {
            this.f33067B = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f33068C) {
                this.f33068C = false;
                this.f33067B.append("  ");
            }
            this.f33068C = c10 == '\n';
            this.f33067B.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f33068C) {
                this.f33068C = false;
                this.f33067B.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f33068C = z10;
            this.f33067B.append(charSequenceA, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
