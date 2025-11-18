package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8579r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p215t.C8592e;
import com.google.gson.p215t.C8597j;
import com.google.gson.p215t.p216n.p217o.C8615a;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: DateTypeAdapter.java */
/* renamed from: com.google.gson.t.n.c */
/* loaded from: classes2.dex */
public final class C8603c extends AbstractC8578q<Date> {

    /* renamed from: a */
    public static final InterfaceC8579r f32583a = new a();

    /* renamed from: b */
    private final List<DateFormat> f32584b;

    /* compiled from: DateTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.c$a */
    static class a implements InterfaceC8579r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            if (c8619a.getRawType() == Date.class) {
                return new C8603c();
            }
            return null;
        }
    }

    public C8603c() {
        ArrayList arrayList = new ArrayList();
        this.f32584b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C8592e.m27088e()) {
            arrayList.add(C8597j.m27107c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m27118e(String str) {
        Iterator<DateFormat> it = this.f32584b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C8615a.m27215c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new JsonSyntaxException(str, e2);
        }
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date mo26938b(C8585a c8585a) throws IOException {
        if (c8585a.mo27001Q() != EnumC8586b.NULL) {
            return m27118e(c8585a.mo27000K());
        }
        c8585a.mo26999I();
        return null;
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void mo26939d(C8587c c8587c, Date date) throws IOException {
        if (date == null) {
            c8587c.mo27043y();
        } else {
            c8587c.mo27033Y(this.f32584b.get(0).format(date));
        }
    }
}
