package com.google.gson.internal.sql;

import Q9.b;
import Q9.c;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    static final u f39105b = new u() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.u
        public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f39106a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(Q9.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.N() == b.NULL) {
            aVar.z();
            return null;
        }
        String strK = aVar.K();
        try {
            synchronized (this) {
                date = this.f39106a.parse(strK);
            }
            return new Date(date.getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException("Failed parsing '" + strK + "' as SQL Date; at path " + aVar.l(), e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.p();
            return;
        }
        synchronized (this) {
            str = this.f39106a.format((java.util.Date) date);
        }
        cVar.W(str);
    }

    private SqlDateTypeAdapter() {
        this.f39106a = new SimpleDateFormat("MMM d, yyyy");
    }
}
