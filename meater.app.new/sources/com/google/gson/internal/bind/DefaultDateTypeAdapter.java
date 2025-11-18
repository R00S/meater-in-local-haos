package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.u;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f38898a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f38899b;

    private Date a(Q9.a aVar) throws IOException {
        String strK = aVar.K();
        synchronized (this.f38899b) {
            try {
                Iterator<DateFormat> it = this.f38899b.iterator();
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
    public T read(Q9.a aVar) throws IOException {
        if (aVar.N() == Q9.b.NULL) {
            aVar.z();
            return null;
        }
        return (T) this.f38898a.d(a(aVar));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.p();
            return;
        }
        DateFormat dateFormat = this.f38899b.get(0);
        synchronized (this.f38899b) {
            str = dateFormat.format(date);
        }
        cVar.W(str);
    }

    public String toString() {
        DateFormat dateFormat = this.f38899b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f38899b = arrayList;
        Objects.requireNonNull(bVar);
        this.f38898a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f38899b = arrayList;
        Objects.requireNonNull(bVar);
        this.f38898a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (d.d()) {
            arrayList.add(i.c(i10, i11));
        }
    }

    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final b<Date> f38900b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f38901a;

        protected b(Class<T> cls) {
            this.f38901a = cls;
        }

        private u c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.f38901a, defaultDateTypeAdapter);
        }

        public final u a(int i10, int i11) {
            return c(new DefaultDateTypeAdapter<>(this, i10, i11));
        }

        public final u b(String str) {
            return c(new DefaultDateTypeAdapter<>(this, str));
        }

        protected abstract T d(Date date);

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            protected Date d(Date date) {
                return date;
            }
        }
    }
}
