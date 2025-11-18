package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8579r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: com.google.gson.t.n.j */
/* loaded from: classes2.dex */
public final class C8610j extends AbstractC8578q<Date> {

    /* renamed from: a */
    public static final InterfaceC8579r f32623a = new a();

    /* renamed from: b */
    private final DateFormat f32624b = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.j$a */
    static class a implements InterfaceC8579r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            if (c8619a.getRawType() == Date.class) {
                return new C8610j();
            }
            return null;
        }
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date mo26938b(C8585a c8585a) throws IOException {
        if (c8585a.mo27001Q() == EnumC8586b.NULL) {
            c8585a.mo26999I();
            return null;
        }
        try {
            return new Date(this.f32624b.parse(c8585a.mo27000K()).getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void mo26939d(C8587c c8587c, Date date) throws IOException {
        c8587c.mo27033Y(date == null ? null : this.f32624b.format((java.util.Date) date));
    }
}
