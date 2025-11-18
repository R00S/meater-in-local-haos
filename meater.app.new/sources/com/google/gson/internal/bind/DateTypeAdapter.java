package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.u;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final u f38896b = new u() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.u
        public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f38897a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f38897a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.d()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private Date a(Q9.a aVar) throws IOException {
        String strK = aVar.K();
        synchronized (this.f38897a) {
            try {
                Iterator<DateFormat> it = this.f38897a.iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().parse(strK);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return N9.a.c(strK, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strK + "' as Date; at path " + aVar.l(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date read(Q9.a aVar) throws IOException {
        if (aVar.N() != Q9.b.NULL) {
            return a(aVar);
        }
        aVar.z();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.p();
            return;
        }
        DateFormat dateFormat = this.f38897a.get(0);
        synchronized (this.f38897a) {
            str = dateFormat.format(date);
        }
        cVar.W(str);
    }
}
