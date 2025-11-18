package g9;

/* compiled from: Event.java */
/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3456a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f42121a;

    /* renamed from: b, reason: collision with root package name */
    private final T f42122b;

    public T a() {
        return this.f42122b;
    }

    public Class<T> b() {
        return this.f42121a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f42121a, this.f42122b);
    }
}
