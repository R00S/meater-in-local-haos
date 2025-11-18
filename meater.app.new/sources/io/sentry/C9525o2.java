package io.sentry;

import io.sentry.util.C9643n;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonObjectSerializer.java */
@ApiStatus.Internal
/* renamed from: io.sentry.o2 */
/* loaded from: classes2.dex */
public final class C9525o2 {

    /* renamed from: a */
    public final C9571q2 f36532a;

    public C9525o2(int i2) {
        this.f36532a = new C9571q2(i2);
    }

    /* renamed from: b */
    private void m31118b(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1, Collection<?> collection) throws IOException {
        interfaceC9448h3.mo30829l();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m31122a(interfaceC9448h3, interfaceC9670w1, it.next());
        }
        interfaceC9448h3.mo30827j();
    }

    /* renamed from: c */
    private void m31119c(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1, Date date) throws IOException {
        try {
            interfaceC9448h3.mo30819b(C9244a1.m30012g(date));
        } catch (Exception e2) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Error when serializing Date", e2);
            interfaceC9448h3.mo30826i();
        }
    }

    /* renamed from: d */
    private void m31120d(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1, Map<?, ?> map) throws IOException {
        interfaceC9448h3.mo30823f();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                interfaceC9448h3.mo30828k((String) obj);
                m31122a(interfaceC9448h3, interfaceC9670w1, map.get(obj));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    /* renamed from: e */
    private void m31121e(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1, TimeZone timeZone) throws IOException {
        try {
            interfaceC9448h3.mo30819b(timeZone.getID());
        } catch (Exception e2) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Error when serializing TimeZone", e2);
            interfaceC9448h3.mo30826i();
        }
    }

    /* renamed from: a */
    public void m31122a(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1, Object obj) throws IOException {
        if (obj == null) {
            interfaceC9448h3.mo30826i();
            return;
        }
        if (obj instanceof Character) {
            interfaceC9448h3.mo30819b(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            interfaceC9448h3.mo30819b((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC9448h3.mo30820c(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            interfaceC9448h3.mo30822e((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            m31119c(interfaceC9448h3, interfaceC9670w1, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            m31121e(interfaceC9448h3, interfaceC9670w1, (TimeZone) obj);
            return;
        }
        if (obj instanceof InterfaceC9578r2) {
            ((InterfaceC9578r2) obj).serialize(interfaceC9448h3, interfaceC9670w1);
            return;
        }
        if (obj instanceof Collection) {
            m31118b(interfaceC9448h3, interfaceC9670w1, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            m31118b(interfaceC9448h3, interfaceC9670w1, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            m31120d(interfaceC9448h3, interfaceC9670w1, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            interfaceC9448h3.mo30819b(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            m31118b(interfaceC9448h3, interfaceC9670w1, C9643n.m31795a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            interfaceC9448h3.mo30820c(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            interfaceC9448h3.mo30819b(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            interfaceC9448h3.mo30819b(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            interfaceC9448h3.mo30819b(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            interfaceC9448h3.mo30819b(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            m31120d(interfaceC9448h3, interfaceC9670w1, C9643n.m31797c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            interfaceC9448h3.mo30819b(obj.toString());
            return;
        }
        try {
            m31122a(interfaceC9448h3, interfaceC9670w1, this.f36532a.m31552d(obj, interfaceC9670w1));
        } catch (Exception e2) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Failed serializing unknown object.", e2);
            interfaceC9448h3.mo30819b("[OBJECT]");
        }
    }
}
