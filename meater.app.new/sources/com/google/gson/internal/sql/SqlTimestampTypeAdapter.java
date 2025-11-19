package com.google.gson.internal.sql;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.u;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    static final u f39109b = new u() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.u
        public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
            if (aVar.c() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.n(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter<Date> f39110a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(Q9.a aVar) {
        Date date = this.f39110a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Timestamp timestamp) {
        this.f39110a.write(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f39110a = typeAdapter;
    }
}
