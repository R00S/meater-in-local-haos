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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* renamed from: com.google.gson.t.n.k */
/* loaded from: classes2.dex */
public final class C8611k extends AbstractC8578q<Time> {

    /* renamed from: a */
    public static final InterfaceC8579r f32625a = new a();

    /* renamed from: b */
    private final DateFormat f32626b = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.k$a */
    static class a implements InterfaceC8579r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            if (c8619a.getRawType() == Time.class) {
                return new C8611k();
            }
            return null;
        }
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time mo26938b(C8585a c8585a) throws IOException {
        if (c8585a.mo27001Q() == EnumC8586b.NULL) {
            c8585a.mo26999I();
            return null;
        }
        try {
            return new Time(this.f32626b.parse(c8585a.mo27000K()).getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void mo26939d(C8587c c8587c, Time time) throws IOException {
        c8587c.mo27033Y(time == null ? null : this.f32626b.format((Date) time));
    }
}
