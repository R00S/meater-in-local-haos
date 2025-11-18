package com.google.gson.internal.sql;

import Q9.b;
import Q9.c;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b, reason: collision with root package name */
    static final u f39107b = new u() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.u
        public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f39108a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(Q9.a aVar) throws IOException {
        Time time;
        if (aVar.N() == b.NULL) {
            aVar.z();
            return null;
        }
        String strK = aVar.K();
        try {
            synchronized (this) {
                time = new Time(this.f39108a.parse(strK).getTime());
            }
            return time;
        } catch (ParseException e10) {
            throw new JsonSyntaxException("Failed parsing '" + strK + "' as SQL Time; at path " + aVar.l(), e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.p();
            return;
        }
        synchronized (this) {
            str = this.f39108a.format((Date) time);
        }
        cVar.W(str);
    }

    private SqlTimeTypeAdapter() {
        this.f39108a = new SimpleDateFormat("hh:mm:ss a");
    }
}
